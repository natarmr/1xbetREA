package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fz10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10387a;

    public fz10(String str) {
        this.f10387a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fz10) && this.f10387a.equals(((fz10) obj).f10387a);
    }

    public final int hashCode() {
        return this.f10387a.hashCode();
    }

    public final String toString() {
        return kng0.l("MainModel(addTime=", this.f10387a, Separators.RPAREN);
    }
}
