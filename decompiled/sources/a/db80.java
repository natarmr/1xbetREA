package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class db80 implements ac80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc80 f5791a;

    public db80(qc80 qc80Var) {
        this.f5791a = qc80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db80) && this.f5791a.equals(((db80) obj).f5791a);
    }

    public final int hashCode() {
        return this.f5791a.hashCode();
    }

    public final String toString() {
        return "OnAllButtonClick(headerType=" + this.f5791a + Separators.RPAREN;
    }
}
