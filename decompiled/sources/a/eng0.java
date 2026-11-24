package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eng0 implements ing0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8093a;

    public eng0(String str) {
        this.f8093a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eng0) && this.f8093a.equals(((eng0) obj).f8093a);
    }

    public final int hashCode() {
        return this.f8093a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenDeeplink(link=", this.f8093a, Separators.RPAREN);
    }
}
