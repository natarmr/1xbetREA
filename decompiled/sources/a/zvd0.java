package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zvd0 implements owd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox f45050a;
    public final int b;

    public zvd0(ox oxVar, int i) {
        this.f45050a = oxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvd0)) {
            return false;
        }
        zvd0 zvd0Var = (zvd0) obj;
        return this.f45050a.equals(zvd0Var.f45050a) && this.b == zvd0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f45050a.hashCode() * 31);
    }

    public final String toString() {
        return "AdditionalInfo(action=" + this.f45050a + ", screenWidth=" + this.b + Separators.RPAREN;
    }
}
