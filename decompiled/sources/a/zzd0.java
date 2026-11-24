package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class zzd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45249a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final float g;
    public final float h;

    public zzd0(int i, String str, int i2, int i3, float f, int i4, float f2, float f3) {
        this.f45249a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = i4;
        this.g = f2;
        this.h = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd0)) {
            return false;
        }
        zzd0 zzd0Var = (zzd0) obj;
        return this.f45249a == zzd0Var.f45249a && this.b.equals(zzd0Var.b) && this.c == zzd0Var.c && this.d == zzd0Var.d && Float.compare(this.e, zzd0Var.e) == 0 && this.f == zzd0Var.f && Float.compare(this.g, zzd0Var.g) == 0 && Float.compare(this.h, zzd0Var.h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.h) + defpackage.c.a(twn.a(this.f, defpackage.c.a(twn.a(this.d, twn.a(this.c, ua80.b(Integer.hashCode(this.f45249a) * 31, 31, this.b), 31), 31), this.e, 31), 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f45249a, "RainbowStatisticMatchesMatchTeamPlayerModel(id=", ", name=", this.b, ", kills=");
        axq.r(this.c, this.d, ", deaths=", ", kost=", sbR);
        sbR.append(this.e);
        sbR.append(", eps=");
        sbR.append(this.f);
        sbR.append(", kpr=");
        sbR.append(this.g);
        sbR.append(", hs=");
        sbR.append(this.h);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
