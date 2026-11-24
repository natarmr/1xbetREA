package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eya0 implements iya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ylb0 f8620a;

    public eya0(ylb0 ylb0Var) {
        this.f8620a = ylb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eya0) && this.f8620a.equals(((eya0) obj).f8620a);
    }

    public final int hashCode() {
        return this.f8620a.hashCode();
    }

    public final String toString() {
        return "RequestTab(key=" + this.f8620a + Separators.RPAREN;
    }
}
