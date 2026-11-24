package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p4r0 implements s4r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4r0 f26369a;

    public p4r0(u4r0 u4r0Var) {
        this.f26369a = u4r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p4r0) && this.f26369a == ((p4r0) obj).f26369a;
    }

    public final int hashCode() {
        return this.f26369a.hashCode();
    }

    public final String toString() {
        return "OnBottomSheetClose(closeAction=" + this.f26369a + Separators.RPAREN;
    }
}
