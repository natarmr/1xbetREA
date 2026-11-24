package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mhw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ekw f21817a;

    public mhw(ekw ekwVar) {
        this.f21817a = ekwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhw) && this.f21817a.equals(((mhw) obj).f21817a);
    }

    public final int hashCode() {
        return this.f21817a.hashCode();
    }

    public final String toString() {
        return "OnPageSelected(toolbarPage=" + this.f21817a + Separators.RPAREN;
    }
}
