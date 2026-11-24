package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c110 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3552a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final float g;
    public final float h;
    public final float i;

    public c110(int i, int i2, float f, float f2, float f3, int i3, float f4, float f5, float f6) {
        this.f3552a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = i3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c110)) {
            return false;
        }
        c110 c110Var = (c110) obj;
        return this.f3552a == c110Var.f3552a && this.b == c110Var.b && Float.compare(this.c, c110Var.c) == 0 && Float.compare(this.d, c110Var.d) == 0 && Float.compare(this.e, c110Var.e) == 0 && this.f == c110Var.f && Float.compare(this.g, c110Var.g) == 0 && Float.compare(this.h, c110Var.h) == 0 && Float.compare(this.i, c110Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + defpackage.c.a(defpackage.c.a(twn.a(this.f, defpackage.c.a(defpackage.c.a(defpackage.c.a(twn.a(this.b, Integer.hashCode(this.f3552a) * 31, 31), this.c, 31), this.d, 31), this.e, 31), 31), this.g, 31), this.h, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("LolPlayerCompositionStatisticModel(wins=", this.f3552a, ", losses=", ", kills=", this.b);
        vqd.v(sbT, this.c, ", deaths=", this.d, ", assists=");
        sbT.append(this.e);
        sbT.append(", goldEarned=");
        sbT.append(this.f);
        sbT.append(", baronKills=");
        vqd.v(sbT, this.g, ", dragonKills=", this.h, ", towerKills=");
        return kng0.o(sbT, this.i, Separators.RPAREN);
    }
}
