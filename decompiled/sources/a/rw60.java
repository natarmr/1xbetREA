package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rw60 implements bx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31204a;

    public rw60(String str) {
        this.f31204a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rw60) && this.f31204a.equals(((rw60) obj).f31204a);
    }

    public final int hashCode() {
        return this.f31204a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnPayButtonClicked(screenName=", this.f31204a, Separators.RPAREN);
    }
}
