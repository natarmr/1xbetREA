package a;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class rik extends vbc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bxq f30546a;
    public final /* synthetic */ sik b;

    public rik(sik sikVar, bxq bxqVar) {
        this.b = sikVar;
        this.f30546a = bxqVar;
    }

    @Override // a.vbc
    public final View b0(int i) {
        bxq bxqVar = this.f30546a;
        if (bxqVar.c0()) {
            return bxqVar.b0(i);
        }
        Dialog dialog = this.b.S1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // a.vbc
    public final boolean c0() {
        return this.f30546a.c0() || this.b.X1;
    }
}
