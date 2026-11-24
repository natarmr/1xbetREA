package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jkc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16661a;
    public final String b;

    public jkc(int i, String str) {
        this.f16661a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkc)) {
            return false;
        }
        jkc jkcVar = (jkc) obj;
        return this.f16661a == jkcVar.f16661a && this.b.equals(jkcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f16661a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f16661a, "CitizenshipModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
