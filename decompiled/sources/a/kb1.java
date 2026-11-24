package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class kb1 implements wb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17990a;

    public kb1(String str) {
        this.f17990a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kb1) && this.f17990a.equals(((kb1) obj).f17990a);
    }

    public final int hashCode() {
        return this.f17990a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowGameCurrencyDialogConversationDialog(description=", this.f17990a, Separators.RPAREN);
    }
}
