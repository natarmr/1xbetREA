package a;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class wbv implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38898a;
    public final Path.FillType b;
    public final u33 c;
    public final u33 d;
    public final u33 e;
    public final u33 f;
    public final String g;
    public final boolean h;

    public wbv(String str, int i, Path.FillType fillType, u33 u33Var, u33 u33Var2, u33 u33Var3, u33 u33Var4, boolean z) {
        this.f38898a = i;
        this.b = fillType;
        this.c = u33Var;
        this.d = u33Var2;
        this.e = u33Var3;
        this.f = u33Var4;
        this.g = str;
        this.h = z;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        return new xbv(bb10Var, fa10Var, tz5Var, this);
    }
}
