package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wkj0 implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39310a;
    public final v33 b;
    public final ArrayList c;
    public final u33 d;
    public final u33 e;
    public final v33 f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;

    public wkj0(String str, v33 v33Var, ArrayList arrayList, u33 u33Var, u33 u33Var2, v33 v33Var2, int i, int i2, float f, boolean z) {
        this.f39310a = str;
        this.b = v33Var;
        this.c = arrayList;
        this.d = u33Var;
        this.e = u33Var2;
        this.f = v33Var2;
        this.g = i;
        this.h = i2;
        this.i = f;
        this.j = z;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        return new xtm0(bb10Var, tz5Var, this);
    }
}
