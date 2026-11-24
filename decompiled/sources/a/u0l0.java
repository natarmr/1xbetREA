package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class u0l0 implements v0l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5q0 f34859a;

    public final boolean equals(Object obj) {
        if (obj instanceof u0l0) {
            return this.f34859a.equals(((u0l0) obj).f34859a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34859a.hashCode();
    }

    public final String toString() {
        return "TextField(value=" + this.f34859a + Separators.RPAREN;
    }
}
