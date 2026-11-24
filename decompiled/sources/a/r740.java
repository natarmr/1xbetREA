package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r740 implements v740 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29961a;

    public r740(String str) {
        this.f29961a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r740) && this.f29961a.equals(((r740) obj).f29961a);
    }

    public final int hashCode() {
        return this.f29961a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnDeleteMessageClick(messageId=", this.f29961a, Separators.RPAREN);
    }
}
