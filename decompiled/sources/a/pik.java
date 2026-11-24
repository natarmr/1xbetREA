package a;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class pik implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sik f27047a;

    public pik(sik sikVar) {
        this.f27047a = sikVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        sik sikVar = this.f27047a;
        Dialog dialog = sikVar.S1;
        if (dialog != null) {
            sikVar.onCancel(dialog);
        }
    }
}
