package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class anl0 implements hnl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dum f1161a;

    public anl0(dum dumVar) {
        this.f1161a = dumVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof anl0) && this.f1161a.equals(((anl0) obj).f1161a);
    }

    public final int hashCode() {
        return this.f1161a.hashCode();
    }

    public final String toString() {
        return "Cricket(model=" + this.f1161a + Separators.RPAREN;
    }
}
