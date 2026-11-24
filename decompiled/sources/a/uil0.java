package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uil0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35737a;
    public final String b;

    public uil0(int i, String str) {
        this.f35737a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uil0)) {
            return false;
        }
        uil0 uil0Var = (uil0) obj;
        return this.f35737a == uil0Var.f35737a && this.b.equals(uil0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f35737a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f35737a, "SportModel(id=", ", name=", this.b, Separators.RPAREN);
    }
}
