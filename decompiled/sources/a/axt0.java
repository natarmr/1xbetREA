package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class axt0 implements lxt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ims f1638a;

    public final boolean equals(Object obj) {
        if (obj instanceof axt0) {
            return this.f1638a.equals(((axt0) obj).f1638a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1638a.hashCode();
    }

    public final String toString() {
        return "OnMatchInfoAction(value=" + this.f1638a + Separators.RPAREN;
    }
}
