package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class pxu0 implements sxu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27773a;

    public pxu0(String str) {
        this.f27773a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxu0) && this.f27773a.equals(((pxu0) obj).f27773a);
    }

    public final int hashCode() {
        return this.f27773a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f27773a, Separators.RPAREN);
    }
}
