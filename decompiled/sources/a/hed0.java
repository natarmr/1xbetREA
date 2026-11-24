package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hed0 implements ked0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eed0 f12918a;

    public hed0(eed0 eed0Var) {
        this.f12918a = eed0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hed0) && this.f12918a == ((hed0) obj).f12918a;
    }

    public final int hashCode() {
        return this.f12918a.hashCode();
    }

    public final String toString() {
        return "OpenSystemNotificationSettings(type=" + this.f12918a + Separators.RPAREN;
    }
}
