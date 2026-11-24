package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eog0 implements fog0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8138a;

    public eog0(String str) {
        this.f8138a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eog0) && this.f8138a.equals(((eog0) obj).f8138a);
    }

    public final int hashCode() {
        return this.f8138a.hashCode();
    }

    public final String toString() {
        return kng0.l("SendMailAction(uri=", this.f8138a, Separators.RPAREN);
    }
}
