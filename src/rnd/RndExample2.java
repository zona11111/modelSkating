package rnd;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import widgets.ChooseRandom;

/**
 * This type was generated by a SmartGuide.
 */
public class RndExample2 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel ivjJFrameContentPane = null;

	private JPanel ivjStatusBarPane = null;

	private ChooseRandom ivjChooseRandom1 = null;

	private widgets.Diagram ivjDiagram1 = null;

	private JButton ivjJButton1 = null;

	private JButton ivjJButton2 = null;

	IvjEventHandler ivjEventHandler = new IvjEventHandler();

	private JLabel ivjJLabel1 = null;

	private JLabel ivjJLabel2 = null;

	private JTextField ivjJTextField1 = null;

	private JPanel ivjWWPane = null;

	class IvjEventHandler implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent e) {
			if (e.getSource() == RndExample2.this.getJButton2())
				connEtoC1(e);
			if (e.getSource() == RndExample2.this.getJButton1())
				connEtoC2(e);
		};
	};

	/**
	 * WW constructor comment.
	 */
	public RndExample2() {
		super();
		initialize();
	}

	/**
	 * WW constructor comment.
	 * 
	 * @param title
	 *            java.lang.String
	 */
	public RndExample2(String title) {
		super(title);
	}

	/**
	 * connEtoC1: (JButton2.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> WW.jButton2_ActionPerformed(ID)V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC1(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.jButton2_ActionPerformed(Integer.parseInt(getJTextField1()
					.getText()), new Double(getDiagram1()
					.getHorizontalMaxText()).doubleValue());
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * connEtoC2: (JButton1.action.actionPerformed(java.awt.event.ActionEvent)
	 * --> WW.jButton1_ActionPerformed(ID)V)
	 * 
	 * @param arg1
	 *            java.awt.event.ActionEvent
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void connEtoC2(java.awt.event.ActionEvent arg1) {
		try {
			// user code begin {1}
			// user code end
			this.jButton1_ActionPerformed(Integer.parseInt(getJTextField1()
					.getText()), new Double(getDiagram1()
					.getHorizontalMaxText()).doubleValue());
			// user code begin {2}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {3}
			// user code end
			handleException(ivjExc);
		}
	}

	/**
	 * Return the ChooseRandom1 property value.
	 * 
	 * @return rnd.ChooseRandom
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private ChooseRandom getChooseRandom1() {
		if (ivjChooseRandom1 == null) {
			try {
				ivjChooseRandom1 = new widgets.ChooseRandom();
				ivjChooseRandom1.setName("ChooseRandom1");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjChooseRandom1;
	}

	/**
	 * Return the Diagram1 property value.
	 * 
	 * @return paint.Diagram
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private widgets.Diagram getDiagram1() {
		if (ivjDiagram1 == null) {
			try {
				ivjDiagram1 = new widgets.Diagram();
				ivjDiagram1.setName("Diagram1");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjDiagram1;
	}

	/**
	 * Return the JButton1 property value.
	 * 
	 * @return javax.swing.JButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JButton getJButton1() {
		if (ivjJButton1 == null) {
			try {
				ivjJButton1 = new javax.swing.JButton();
				ivjJButton1.setName("JButton1");
				ivjJButton1.setText("Интегральная функция");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjJButton1;
	}

	/**
	 * Return the JButton2 property value.
	 * 
	 * @return javax.swing.JButton
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JButton getJButton2() {
		if (ivjJButton2 == null) {
			try {
				ivjJButton2 = new javax.swing.JButton();
				ivjJButton2.setName("JButton2");
				ivjJButton2.setText("Плотность вероятности");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjJButton2;
	}

	/**
	 * Return the JFrameContentPane property value.
	 * 
	 * @return javax.swing.JPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPanel getJFrameContentPane() {
		if (ivjJFrameContentPane == null) {
			try {
				ivjJFrameContentPane = new javax.swing.JPanel();
				ivjJFrameContentPane.setName("JFrameContentPane");
				ivjJFrameContentPane.setLayout(new java.awt.BorderLayout());
				getJFrameContentPane().add(getStatusBarPane(), "South");
				getJFrameContentPane().add(getWWPane(), "Center");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjJFrameContentPane;
	}

	/**
	 * Return the JLabel1 property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getJLabel1() {
		if (ivjJLabel1 == null) {
			try {
				ivjJLabel1 = new javax.swing.JLabel();
				ivjJLabel1.setName("JLabel1");
				ivjJLabel1.setText("Выбранное распределение");
				ivjJLabel1
						.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjJLabel1;
	}

	/**
	 * Return the JLabel2 property value.
	 * 
	 * @return javax.swing.JLabel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JLabel getJLabel2() {
		if (ivjJLabel2 == null) {
			try {
				ivjJLabel2 = new javax.swing.JLabel();
				ivjJLabel2.setName("JLabel2");
				ivjJLabel2.setText("Число интервалов");
				ivjJLabel2
						.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjJLabel2;
	}

	/**
	 * Return the JTextField1 property value.
	 * 
	 * @return javax.swing.JTextField
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JTextField getJTextField1() {
		if (ivjJTextField1 == null) {
			try {
				ivjJTextField1 = new javax.swing.JTextField();
				ivjJTextField1.setName("JTextField1");
				ivjJTextField1.setText("10");
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjJTextField1;
	}

	/**
	 * Return the StatusBarPane property value.
	 * 
	 * @return javax.swing.JPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPanel getStatusBarPane() {
		if (ivjStatusBarPane == null) {
			try {
				ivjStatusBarPane = new javax.swing.JPanel();
				ivjStatusBarPane.setName("StatusBarPane");
				ivjStatusBarPane.setLayout(new java.awt.BorderLayout());
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjStatusBarPane;
	}

	/**
	 * Return the WWPane property value.
	 * 
	 * @return javax.swing.JPanel
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private javax.swing.JPanel getWWPane() {
		if (ivjWWPane == null) {
			try {
				ivjWWPane = new javax.swing.JPanel();
				ivjWWPane.setName("WWPane");
				ivjWWPane.setLayout(new java.awt.GridBagLayout());

				java.awt.GridBagConstraints constraintsDiagram1 = new java.awt.GridBagConstraints();
				constraintsDiagram1.gridx = 1;
				constraintsDiagram1.gridy = 3;
				constraintsDiagram1.gridwidth = 3;
				constraintsDiagram1.fill = java.awt.GridBagConstraints.BOTH;
				constraintsDiagram1.weightx = 1.0;
				constraintsDiagram1.weighty = 1.0;
				constraintsDiagram1.ipadx = 132;
				constraintsDiagram1.ipady = -21;
				constraintsDiagram1.insets = new java.awt.Insets(4, 40, 8, 41);
				getWWPane().add(getDiagram1(), constraintsDiagram1);

				java.awt.GridBagConstraints constraintsJButton1 = new java.awt.GridBagConstraints();
				constraintsJButton1.gridx = 1;
				constraintsJButton1.gridy = 4;
				constraintsJButton1.ipadx = 20;
				constraintsJButton1.insets = new java.awt.Insets(8, 26, 21, 13);
				getWWPane().add(getJButton1(), constraintsJButton1);

				java.awt.GridBagConstraints constraintsJButton2 = new java.awt.GridBagConstraints();
				constraintsJButton2.gridx = 2;
				constraintsJButton2.gridy = 4;
				constraintsJButton2.gridwidth = 2;
				constraintsJButton2.ipadx = 18;
				constraintsJButton2.insets = new java.awt.Insets(8, 13, 21, 26);
				getWWPane().add(getJButton2(), constraintsJButton2);

				java.awt.GridBagConstraints constraintsChooseRandom1 = new java.awt.GridBagConstraints();
				constraintsChooseRandom1.gridx = 1;
				constraintsChooseRandom1.gridy = 2;
				constraintsChooseRandom1.gridwidth = 2;
				constraintsChooseRandom1.fill = java.awt.GridBagConstraints.BOTH;
				constraintsChooseRandom1.weightx = 1.0;
				constraintsChooseRandom1.weighty = 1.0;
				constraintsChooseRandom1.ipadx = 38;
				constraintsChooseRandom1.insets = new java.awt.Insets(4, 42, 3,
						9);
				getWWPane().add(getChooseRandom1(), constraintsChooseRandom1);

				java.awt.GridBagConstraints constraintsJLabel1 = new java.awt.GridBagConstraints();
				constraintsJLabel1.gridx = 1;
				constraintsJLabel1.gridy = 1;
				constraintsJLabel1.gridwidth = 2;
				constraintsJLabel1.ipadx = 65;
				constraintsJLabel1.insets = new java.awt.Insets(16, 28, 3, 30);
				getWWPane().add(getJLabel1(), constraintsJLabel1);

				java.awt.GridBagConstraints constraintsJLabel2 = new java.awt.GridBagConstraints();
				constraintsJLabel2.gridx = 3;
				constraintsJLabel2.gridy = 1;
				constraintsJLabel2.ipadx = 13;
				constraintsJLabel2.insets = new java.awt.Insets(16, 9, 3, 43);
				getWWPane().add(getJLabel2(), constraintsJLabel2);

				java.awt.GridBagConstraints constraintsJTextField1 = new java.awt.GridBagConstraints();
				constraintsJTextField1.gridx = 3;
				constraintsJTextField1.gridy = 2;
				constraintsJTextField1.fill = java.awt.GridBagConstraints.HORIZONTAL;
				constraintsJTextField1.weightx = 1.0;
				constraintsJTextField1.ipadx = 104;
				constraintsJTextField1.insets = new java.awt.Insets(11, 18, 11,
						48);
				getWWPane().add(getJTextField1(), constraintsJTextField1);
				// user code begin {1}
				// user code end
			} catch (java.lang.Throwable ivjExc) {
				// user code begin {2}
				// user code end
				handleException(ivjExc);
			}
		}
		return ivjWWPane;
	}

	/**
	 * Called whenever the part throws an exception.
	 * 
	 * @param exception
	 *            java.lang.Throwable
	 */
	private void handleException(java.lang.Throwable exception) {

		/* Uncomment the following lines to print uncaught exceptions to stdout */
		// System.out.println("--------- UNCAUGHT EXCEPTION ---------");
		// exception.printStackTrace(System.out);
	}

	/**
	 * Initializes connections
	 * 
	 * @exception java.lang.Exception
	 *                The exception description.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initConnections() throws java.lang.Exception {
		// user code begin {1}
		// user code end
		getJButton2().addActionListener(ivjEventHandler);
		getJButton1().addActionListener(ivjEventHandler);
	}

	/**
	 * Initialize the class.
	 */
	/* WARNING: THIS METHOD WILL BE REGENERATED. */
	private void initialize() {
		try {
			// user code begin {1}
			// user code end
			setName("WW");
			setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
			setJMenuBar(new javax.swing.JMenuBar());
			setSize(460, 300);
			setTitle("WW");
			setContentPane(getJFrameContentPane());
			initConnections();
		} catch (java.lang.Throwable ivjExc) {
			handleException(ivjExc);
		}
		// user code begin {2}
		// user code end
	}

	public void jButton1_ActionPerformed(int n, double max) {
		double[] b = new double[n + 1];
		double[] f = new double[n + 1];
		double dx = max / n;
		b[0] = 0;
		f[0] = 0;
		for (int i = 1; i < n + 1; i++) {
			b[i] = dx * i;
			f[i] = getChooseRandom1().probability(b[i]);
		}
		getDiagram1().setGridByX(n);
		getDiagram1().clear();
		getDiagram1().drawDependency(b, f, java.awt.Color.magenta, true);
	}

	public void jButton2_ActionPerformed(int n, double max) {
		double[] b = new double[n + 1];
		double[] f = new double[n];
		double dx = max / n;
		b[0] = 0;
		for (int i = 1; i < n + 1; i++) {
			b[i] = dx * i;
			f[i - 1] = getChooseRandom1().probability(b[i - 1], b[i]);
		}
		getDiagram1().setGridByX(n);
		getDiagram1().clear();
		getDiagram1().drawBarsDiagram(b, f, 0.8, 0.1, true);
	}

	/**
	 * Starts the application.
	 * 
	 * @param args
	 *            an array of command-line arguments
	 */
	public static void main(java.lang.String[] args) {
		try {
			/* Set native look and feel */
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			/* Create the frame */
			RndExample2 aRndExample2 = new RndExample2();

			/* Add a windowListener for the windowClosedEvent */
			aRndExample2.addWindowListener(new java.awt.event.WindowAdapter() {
				public void windowClosed(java.awt.event.WindowEvent e) {
					System.exit(0);
				};
			});
			aRndExample2.setVisible(true);
		} catch (Throwable exception) {
			System.err.println("Exception occurred in main() of RndExample2");
			exception.printStackTrace(System.out);
		}
	}

	public void viewStatusBar() {
		/* Hide or show the statusbar */
		getStatusBarPane().setVisible(!(getStatusBarPane().isVisible()));
	}
}