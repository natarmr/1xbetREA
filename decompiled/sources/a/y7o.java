package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class y7o extends z7o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f42162a;

    public y7o(mdm mdmVar) {
        this.f42162a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7o) && this.f42162a.equals(((y7o) obj).f42162a);
    }

    public final int hashCode() {
        return this.f42162a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(errorConfig=", this.f42162a, Separators.RPAREN);
    }
}
