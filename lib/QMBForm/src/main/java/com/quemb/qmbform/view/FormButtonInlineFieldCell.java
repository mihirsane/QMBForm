package com.quemb.qmbform.view;


import com.quemb.qmbform.R;
import com.quemb.qmbform.descriptor.RowDescriptor;

import android.content.Context;

/**
 * Created by pmaccamp on 8/28/2015.
 */
public class FormButtonInlineFieldCell extends FormButtonFieldCell {


    public FormButtonInlineFieldCell(Context context,
                                     RowDescriptor rowDescriptor) {
        super(context, rowDescriptor);
    }

    @Override
    protected int getResource() {
        return R.layout.button_inline_field_cell;
    }
}
