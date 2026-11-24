package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jxb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17297a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxb) && this.f17297a == ((jxb) obj).f17297a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17297a);
    }

    public final String toString() {
        return ua80.e(this.f17297a, "MessageListInfo(uiItemsCount=", Separators.RPAREN);
    }
}
