package a;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class jw2 extends v55 implements upq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j910 f17231a;
    public final wai0 b;
    public final AndroidComposeView c;
    public final oge0 d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final fy40 h;
    public boolean i;

    public jw2(j910 j910Var, wai0 wai0Var, AndroidComposeView androidComposeView, oge0 oge0Var, String str) {
        this.f17231a = j910Var;
        this.b = wai0Var;
        this.c = androidComposeView;
        this.d = oge0Var;
        this.e = str;
        androidComposeView.setImportantForAutofill(1);
        i7 i7VarG = cvm0.g(androidComposeView);
        AutofillId autofillIdC = i7VarG != null ? y24.c(i7VarG.f14266a) : null;
        if (autofillIdC == null) {
            throw cs0.g("Required value was null.");
        }
        this.g = autofillIdC;
        this.h = new fy40();
    }

    @Override // a.upq
    public final void a(nqq nqqVar, nqq nqqVar2) {
        e7z e7zVarZ;
        nai0 nai0VarX;
        e7z e7zVarZ2;
        nai0 nai0VarX2;
        AndroidComposeView androidComposeView = this.c;
        j910 j910Var = this.f17231a;
        if (nqqVar != null && (e7zVarZ2 = vcc.Z(nqqVar)) != null && (nai0VarX2 = e7zVarZ2.x()) != null && jd8.f0(nai0VarX2)) {
            j910Var.m().notifyViewExited(androidComposeView, e7zVarZ2.b);
        }
        if (nqqVar2 == null || (e7zVarZ = vcc.Z(nqqVar2)) == null || (nai0VarX = e7zVarZ.x()) == null || !jd8.f0(nai0VarX)) {
            return;
        }
        int i = e7zVarZ.b;
        oge0 oge0Var = this.d;
        e7z e7zVar = (e7z) oge0Var.f25215a.b(i);
        if (e7zVar == null || e7zVar.g == -4) {
            return;
        }
        zz2 zz2Var = oge0Var.c;
        int iD = oge0Var.d(e7zVar);
        long[] jArr = (long[]) zz2Var.b;
        long j = jArr[iD];
        long j2 = jArr[iD + 1];
        j910Var.m().notifyViewEntered(androidComposeView, i, new Rect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2));
    }
}
