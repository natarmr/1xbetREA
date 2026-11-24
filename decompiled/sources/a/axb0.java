package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class axb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1617a;
    public final String b;

    public axb0(String str, String str2) {
        this.f1617a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axb0)) {
            return false;
        }
        axb0 axb0Var = (axb0) obj;
        return this.f1617a.equals(axb0Var.f1617a) && this.b.equals(axb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1617a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Team(logo=", this.f1617a, ", teamName=", this.b, Separators.RPAREN);
    }
}
