package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cjc0 implements ejc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s470 f4454a;

    public cjc0(s470 s470Var) {
        s470Var.getClass();
        this.f4454a = s470Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cjc0) && this.f4454a == ((cjc0) obj).f4454a;
    }

    public final int hashCode() {
        return this.f4454a.hashCode();
    }

    public final String toString() {
        return "ShowBetShopDialog(type=" + this.f4454a + Separators.RPAREN;
    }
}
