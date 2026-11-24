package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class cud0 implements mud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ims f4982a;

    public final boolean equals(Object obj) {
        if (obj instanceof cud0) {
            return this.f4982a.equals(((cud0) obj).f4982a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4982a.hashCode();
    }

    public final String toString() {
        return "OnMatchInfoAction(value=" + this.f4982a + Separators.RPAREN;
    }
}
