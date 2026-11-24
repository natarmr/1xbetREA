package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class k2p0 implements n2p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dtp0 f17585a;

    public k2p0(dtp0 dtp0Var) {
        this.f17585a = dtp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2p0) && this.f17585a.equals(((k2p0) obj).f17585a);
    }

    public final int hashCode() {
        return this.f17585a.hashCode();
    }

    public final String toString() {
        return "OnMenuItemClick(type=" + this.f17585a + Separators.RPAREN;
    }
}
