package a;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class ajn0 extends sik {
    public Dialog Y1;
    public DialogInterface.OnCancelListener Z1;
    public AlertDialog a2;

    @Override // a.sik
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = this.Y1;
        if (dialog != null) {
            return dialog;
        }
        this.O1 = false;
        AlertDialog alertDialog = this.a2;
        if (alertDialog != null) {
            return alertDialog;
        }
        Context contextD = D();
        s0x.H(contextD);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(contextD).create();
        this.a2 = alertDialogCreate;
        return alertDialogCreate;
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.Z1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
