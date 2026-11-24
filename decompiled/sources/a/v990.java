package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v990 implements ea90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37024a;

    public v990(String str) {
        this.f37024a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v990) && this.f37024a.equals(((v990) obj).f37024a);
    }

    public final int hashCode() {
        return this.f37024a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenInBrowser(url=", this.f37024a, Separators.RPAREN);
    }
}
