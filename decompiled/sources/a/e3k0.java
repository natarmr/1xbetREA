package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class e3k0 implements g3k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7141a;
    public final z2k0 b;

    public e3k0(String str, z2k0 z2k0Var) {
        this.f7141a = str;
        this.b = z2k0Var;
    }

    @Override // a.g3k0
    public final String a() {
        return this.f7141a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3k0)) {
            return false;
        }
        e3k0 e3k0Var = (e3k0) obj;
        return this.f7141a.equals(e3k0Var.f7141a) && this.b.equals(e3k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7141a.hashCode() * 31);
    }

    public final String toString() {
        return "TransactionCell(itemKey=" + this.f7141a + ", transactionCellUiModel=" + this.b + Separators.RPAREN;
    }
}
