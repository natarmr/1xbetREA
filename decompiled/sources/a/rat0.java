package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rat0 implements sat0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f30152a;

    public rat0(mdm mdmVar) {
        this.f30152a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rat0) && this.f30152a.equals(((rat0) obj).f30152a);
    }

    public final int hashCode() {
        return this.f30152a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f30152a, Separators.RPAREN);
    }
}
