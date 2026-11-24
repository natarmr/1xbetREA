package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4239a;
    public final String b;

    public cf3(int i, String str) {
        this.f4239a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cf3)) {
            return false;
        }
        cf3 cf3Var = (cf3) obj;
        return this.f4239a == cf3Var.f4239a && this.b.equals(cf3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f4239a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f4239a, "AppForCheck(id=", ", bundle=", this.b, Separators.RPAREN);
    }
}
