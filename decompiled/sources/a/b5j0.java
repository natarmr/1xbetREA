package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class b5j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2006a;
    public final i2j0 b;
    public final l3j0 c;
    public final t3j0 d;
    public final d3j0 e;
    public final f4j0 f;
    public final z1j0 g;
    public final x5j0 h;
    public final String i;

    public b5j0(boolean z, i2j0 i2j0Var, l3j0 l3j0Var, t3j0 t3j0Var, d3j0 d3j0Var, f4j0 f4j0Var, z1j0 z1j0Var, x5j0 x5j0Var, String str) {
        this.f2006a = z;
        this.b = i2j0Var;
        this.c = l3j0Var;
        this.d = t3j0Var;
        this.e = d3j0Var;
        this.f = f4j0Var;
        this.g = z1j0Var;
        this.h = x5j0Var;
        this.i = str;
    }

    public static b5j0 a(b5j0 b5j0Var, boolean z, i2j0 i2j0Var, l3j0 l3j0Var, t3j0 t3j0Var, d3j0 d3j0Var, f4j0 f4j0Var, z1j0 z1j0Var, x5j0 x5j0Var, String str, int i) {
        if ((i & 1) != 0) {
            z = b5j0Var.f2006a;
        }
        boolean z2 = z;
        b5j0Var.getClass();
        if ((i & 4) != 0) {
            i2j0Var = b5j0Var.b;
        }
        i2j0 i2j0Var2 = i2j0Var;
        if ((i & 8) != 0) {
            l3j0Var = b5j0Var.c;
        }
        l3j0 l3j0Var2 = l3j0Var;
        if ((i & 16) != 0) {
            t3j0Var = b5j0Var.d;
        }
        t3j0 t3j0Var2 = t3j0Var;
        if ((i & 32) != 0) {
            d3j0Var = b5j0Var.e;
        }
        d3j0 d3j0Var2 = d3j0Var;
        f4j0 f4j0Var2 = (i & 64) != 0 ? b5j0Var.f : f4j0Var;
        z1j0 z1j0Var2 = (i & 128) != 0 ? b5j0Var.g : z1j0Var;
        x5j0 x5j0Var2 = (i & 256) != 0 ? b5j0Var.h : x5j0Var;
        String str2 = (i & 512) != 0 ? b5j0Var.i : str;
        b5j0Var.getClass();
        str2.getClass();
        return new b5j0(z2, i2j0Var2, l3j0Var2, t3j0Var2, d3j0Var2, f4j0Var2, z1j0Var2, x5j0Var2, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5j0)) {
            return false;
        }
        b5j0 b5j0Var = (b5j0) obj;
        return this.f2006a == b5j0Var.f2006a && this.b.equals(b5j0Var.b) && this.c.equals(b5j0Var.c) && this.d.equals(b5j0Var.d) && this.e.equals(b5j0Var.e) && this.f.equals(b5j0Var.f) && this.g.equals(b5j0Var.g) && this.h.equals(b5j0Var.h) && this.i.equals(b5j0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.f14050a.hashCode() + rw2.b(Boolean.hashCode(this.f2006a) * 31, 31, 0L)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsMakeBetStateModel(hasLoading=");
        sb.append(this.f2006a);
        sb.append(", selectedBalanceId=0, coefChangeStateModel=");
        sb.append(this.b);
        sb.append(", eventsStateModel=");
        sb.append(this.c);
        sb.append(", exactCoefStateModel=");
        sb.append(this.d);
        sb.append(", defaultBetSumStateModel=");
        sb.append(this.e);
        sb.append(", quickBetStateModel=");
        sb.append(this.f);
        sb.append(", autoMaxStateModel=");
        sb.append(this.g);
        sb.append(", vipBetStateModel=");
        sb.append(this.h);
        sb.append(", currencySymbol=");
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
