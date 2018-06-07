import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LibraryCatalog extends JFrame
    {
        private ArrayList items;
        JPanel contentPane;
        BorderLayout borderLayout1 = new BorderLayout ();
        JPanel centrePanel = new JPanel ();
        JTextField titleTextField = new JTextField ();
        JTextField IDTextField = new JTextField ();
        JPanel southPanel = new JPanel ();
        JButton addButton = new JButton ();
        JPanel northPanel = new JPanel ();
        JLabel northLabel = new JLabel ();
        JButton searchButton = new JButton ();
        JButton borrowingButton = new JButton ();
        JButton returnButton = new JButton ();
        //Construct the frame
        public LibraryCatalog()
        {
            items = new ArrayList();
            makeFrame ();
            setVisible (true);
        }
        //Component initialization
        private void makeFrame ()
        {
            contentPane = (JPanel) this.getContentPane ();
            contentPane.setLayout (borderLayout1);
            this.setSize (new Dimension(420, 160));
            this.setTitle ("Library Catalog");
            titleTextField.setText ("");
            titleTextField.setColumns (20);
            IDTextField.setText ("");
            IDTextField.setColumns (16);
            addButton.setText ("Add a Book");
            addButton.addActionListener (new java.awt.event.ActionListener ()
            {
                public void actionPerformed (ActionEvent e)
                {
                    addButton_actionPerformed (e);
                }
            });
            northLabel.setText ("");
            searchButton.setText ("Search");
            searchButton.addActionListener (new java.awt.event.ActionListener ()
            {
                public void actionPerformed(ActionEvent e)
                {
                    searchButton_actionPerformed(e);
                }
            });
            borrowingButton.setText ("Borrowing");
            borrowingButton.addActionListener (new java.awt.event.ActionListener ()
            {
                public void actionPerformed(ActionEvent e)
                {
                    borrowingButton_actionPerformed(e);
                }
            });
            returnButton.setText ("Return a Book");
            returnButton.addActionListener (new java.awt.event.ActionListener ()
            {
                public void actionPerformed(ActionEvent e)
                {
                    returnButton_actionPerformed(e);
                }
            });
            contentPane.add(centrePanel, BorderLayout.CENTER);
            centrePanel.add(titleTextField, null);
            centrePanel.add(IDTextField, null);
            contentPane.add(southPanel, BorderLayout.SOUTH);
            southPanel.add(addButton, null);
            southPanel.add(searchButton, null);
            southPanel.add(borrowingButton, null);
            southPanel.add(returnButton, null);
            contentPane.add(northPanel, BorderLayout.NORTH);
            northPanel.add(northLabel, null);
        }
        //Overridden so we can exit when window is closed
        protected void processWindowEvent(WindowEvent e)
        {
            super.processWindowEvent(e);
            if (e.getID() == WindowEvent.WINDOW_CLOSING)
            {
                System.exit(0);
            }
        }
        void addButton_actionPerformed(ActionEvent e)
        {
            String theTitle= this.titleTextField.getText();
            int userID= Integer.parseInt(this.IDTextField.getText());
            this.addItem(new Item(theTitle,userID));//create a new object of the class Item
        }
        void searchButton_actionPerformed(ActionEvent e)
        {
        }
        void borrowingButton_actionPerformed(ActionEvent e)
        {
        }
        void returnButton_actionPerformed(ActionEvent e)
        {
        }
        public void addItems(items theitems)
        {
            items.add(theItem);
        }
        //Main method
        public static void main(String[] args)
        {
            new LibraryCatalog();
        }
    }