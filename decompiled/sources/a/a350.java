package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class a350 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e350 f157a;
    public final String b;

    public a350(e350 e350Var, String str) {
        this.f157a = e350Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a350)) {
            return false;
        }
        a350 a350Var = (a350) obj;
        return this.f157a.equals(a350Var.f157a) && this.b.equals(a350Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f157a.hashCode() * 31);
    }

    public final String toString() {
        return "MyAggregatorInternalTipModel(screen=" + this.f157a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
