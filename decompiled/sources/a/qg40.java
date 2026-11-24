package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qg40 {
    public static final qg40 c = new qg40(0, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28665a;
    public final int b;

    public qg40(int i, int i2) {
        this.f28665a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg40)) {
            return false;
        }
        qg40 qg40Var = (qg40) obj;
        return this.f28665a == qg40Var.f28665a && this.b == qg40Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f28665a) * 31);
    }

    public final String toString() {
        return ohs0.m("MinMaxCoeffModel(min=", this.f28665a, ", max=", Separators.RPAREN, this.b);
    }
}
