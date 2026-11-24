package a;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class i8b0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f14331a;
    public final auh b;
    public final auh c;
    public final nq8 d;
    public final nq8 e;
    public final nq8 f;
    public final nq8 g;
    public final nq8 h;
    public final nq8 i;
    public final vd7 j;

    public i8b0(LinearLayout linearLayout, auh auhVar, auh auhVar2, nq8 nq8Var, nq8 nq8Var2, nq8 nq8Var3, nq8 nq8Var4, nq8 nq8Var5, nq8 nq8Var6, vd7 vd7Var) {
        this.f14331a = linearLayout;
        this.b = auhVar;
        this.c = auhVar2;
        this.d = nq8Var;
        this.e = nq8Var2;
        this.f = nq8Var3;
        this.g = nq8Var4;
        this.h = nq8Var5;
        this.i = nq8Var6;
        this.j = vd7Var;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f14331a;
    }
}
