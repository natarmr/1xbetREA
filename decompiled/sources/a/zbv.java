package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zbv implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44135a;
    public final int b;
    public final u33 c;
    public final u33 d;
    public final u33 e;
    public final u33 f;
    public final v33 g;
    public final int h;
    public final int i;
    public final float j;
    public final ArrayList k;
    public final v33 l;
    public final boolean m;

    public zbv(String str, int i, u33 u33Var, u33 u33Var2, u33 u33Var3, u33 u33Var4, v33 v33Var, int i2, int i3, float f, ArrayList arrayList, v33 v33Var2, boolean z) {
        this.f44135a = str;
        this.b = i;
        this.c = u33Var;
        this.d = u33Var2;
        this.e = u33Var3;
        this.f = u33Var4;
        this.g = v33Var;
        this.h = i2;
        this.i = i3;
        this.j = f;
        this.k = arrayList;
        this.l = v33Var2;
        this.m = z;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        return new acv(bb10Var, tz5Var, this);
    }
}
