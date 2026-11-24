package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43852a;

    public z67(String str) {
        this.f43852a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z67) && this.f43852a.equals(((z67) obj).f43852a);
    }

    public final int hashCode() {
        return this.f43852a.hashCode();
    }

    public final String toString() {
        return kng0.l("AutoBetCanceled(requestId=", this.f43852a, Separators.RPAREN);
    }
}
