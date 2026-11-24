package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class di1 implements gi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6118a;

    public di1(String str) {
        this.f6118a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof di1) && this.f6118a.equals(((di1) obj).f6118a);
    }

    public final int hashCode() {
        return this.f6118a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSearchQueryChanged(query=", this.f6118a, Separators.RPAREN);
    }
}
