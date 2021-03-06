package org.protege.editor.owl.model.conf.valueset;

import javax.swing.*;
import java.awt.*;

/**
 * Matthew Horridge
 * Stanford Center for Biomedical Informatics Research
 * 30 Aug 2017
 */
public class LabelledValueRenderer implements ListCellRenderer<LabelledValue> {

    private final DefaultListCellRenderer delegate = new DefaultListCellRenderer();

    @Override
    public Component getListCellRendererComponent(JList<? extends LabelledValue> list,
                                                  LabelledValue value,
                                                  int index,
                                                  boolean isSelected,
                                                  boolean cellHasFocus) {
        return delegate.getListCellRendererComponent(list,
                                                     value != null ? value.getLabel() : "",
                                                     index,
                                                     isSelected,
                                                     cellHasFocus);
    }
}
