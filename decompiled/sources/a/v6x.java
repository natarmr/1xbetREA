package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class v6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36896a;

    public final boolean equals(Object obj) {
        if (obj instanceof v6x) {
            return this.f36896a == ((v6x) obj).f36896a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36896a);
    }

    public final String toString() {
        return ua80.e(this.f36896a, "IndirectPointerEventPrimaryDirectionalMotionAxis(value=", Separators.RPAREN);
    }
}
