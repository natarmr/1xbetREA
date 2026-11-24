package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class olt0 implements plt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final il60 f25475a;

    public olt0(il60 il60Var) {
        this.f25475a = il60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olt0) && this.f25475a.equals(((olt0) obj).f25475a);
    }

    public final int hashCode() {
        return this.f25475a.hashCode();
    }

    public final String toString() {
        return "Update(config=" + this.f25475a + Separators.RPAREN;
    }
}
