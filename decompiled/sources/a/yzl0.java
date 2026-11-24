package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yzl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dyl0 f43519a;

    public yzl0(dyl0 dyl0Var) {
        this.f43519a = dyl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yzl0) && this.f43519a.equals(((yzl0) obj).f43519a);
    }

    public final int hashCode() {
        return this.f43519a.hashCode();
    }

    public final String toString() {
        return "OnClickGameItem(gameModel=" + this.f43519a + Separators.RPAREN;
    }
}
