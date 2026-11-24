package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class c8y implements e8y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f3937a;

    public c8y(mdm mdmVar) {
        this.f3937a = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8y) && this.f3937a.equals(((c8y) obj).f3937a);
    }

    public final int hashCode() {
        return this.f3937a.hashCode();
    }

    public final String toString() {
        return b1j.j("Error(emptyConfig=", this.f3937a, Separators.RPAREN);
    }
}
