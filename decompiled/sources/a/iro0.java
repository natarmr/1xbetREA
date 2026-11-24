package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class iro0 implements mro0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f15269a;

    public iro0(d4d d4dVar) {
        this.f15269a = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iro0) && this.f15269a == ((iro0) obj).f15269a;
    }

    public final int hashCode() {
        return this.f15269a.hashCode();
    }

    public final String toString() {
        return "RectangularLFilledOutlined(borderColorKey=" + this.f15269a + Separators.RPAREN;
    }
}
