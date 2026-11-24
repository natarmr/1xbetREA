package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class dsp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6623a;
    public final String b;

    public dsp0(int i, String str) {
        this.f6623a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsp0)) {
            return false;
        }
        dsp0 dsp0Var = (dsp0) obj;
        return this.f6623a == dsp0Var.f6623a && this.b.equals(dsp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f6623a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f6623a, "TeamsStatisticMenuItem(type=", ", name=", this.b, Separators.RPAREN);
    }
}
