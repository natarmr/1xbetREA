package a;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class gkj0 implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11448a;
    public final Path.FillType b;
    public final String c;
    public final u33 d;
    public final u33 e;
    public final boolean f;

    public gkj0(String str, boolean z, Path.FillType fillType, u33 u33Var, u33 u33Var2, boolean z2) {
        this.c = str;
        this.f11448a = z;
        this.b = fillType;
        this.d = u33Var;
        this.e = u33Var2;
        this.f = z2;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        return new m0q(bb10Var, tz5Var, this);
    }

    public final String toString() {
        return brm0.o(new StringBuilder("ShapeFill{color=, fillEnabled="), this.f11448a, '}');
    }
}
