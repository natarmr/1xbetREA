package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ckb0 implements pkb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yfj f4498a;

    public final boolean equals(Object obj) {
        if (obj instanceof ckb0) {
            return this.f4498a.equals(((ckb0) obj).f4498a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4498a.hashCode();
    }

    public final String toString() {
        return "OnDayExpressDelegateAction(value=" + this.f4498a + Separators.RPAREN;
    }
}
