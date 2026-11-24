package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ztb0 extends w680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44950a;

    public ztb0(Object obj) {
        this.f44950a = obj;
    }

    @Override // a.w680
    public final Object a() {
        return this.f44950a;
    }

    @Override // a.w680
    public final boolean b() {
        return true;
    }

    @Override // a.w680
    public final Object d() {
        return this.f44950a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ztb0) {
            return this.f44950a.equals(((ztb0) obj).f44950a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44950a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f44950a + Separators.RPAREN;
    }
}
