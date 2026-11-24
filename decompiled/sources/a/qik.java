package a;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class qik implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sik f28797a;

    public qik(sik sikVar) {
        this.f28797a = sikVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        sik sikVar = this.f28797a;
        Dialog dialog = sikVar.S1;
        if (dialog != null) {
            sikVar.onDismiss(dialog);
        }
    }
}
