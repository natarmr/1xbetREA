package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class k5e implements s5e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17716a;

    public k5e(String str) {
        this.f17716a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k5e) && this.f17716a.equals(((k5e) obj).f17716a);
    }

    public final int hashCode() {
        return this.f17716a.hashCode() + 857559717;
    }

    public final String toString() {
        return kng0.l("OpenCamera(appId=org.xbet.client1, filePath=", this.f17716a, Separators.RPAREN);
    }
}
