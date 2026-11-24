package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class oml0 implements rml0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hzm f25509a;

    public oml0(hzm hzmVar) {
        this.f25509a = hzmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oml0) && this.f25509a.equals(((oml0) obj).f25509a);
    }

    public final int hashCode() {
        return this.f25509a.hashCode();
    }

    public final String toString() {
        return "Tennis(model=" + this.f25509a + Separators.RPAREN;
    }
}
