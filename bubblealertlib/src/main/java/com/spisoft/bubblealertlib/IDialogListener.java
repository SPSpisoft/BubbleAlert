package com.spisoft.bubblealertlib;

/**
 * @author DKV.
 */
public interface IDialogListener {

    void onOkClicked(String tag, String text);

    void onCancelClicked(String tag);
}
