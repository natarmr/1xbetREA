package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ros0 extends yos0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oos0 f30854a;

    public ros0(oos0 oos0Var) {
        this.f30854a = oos0Var;
    }

    @Override // a.yos0
    public final qos0 a() {
        return this.f30854a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ros0) && this.f30854a.equals(((ros0) obj).f30854a);
    }

    public final int hashCode() {
        return this.f30854a.f25608a.hashCode();
    }

    public final String toString() {
        return "Downloading(fileKey=" + this.f30854a + Separators.RPAREN;
    }
}
