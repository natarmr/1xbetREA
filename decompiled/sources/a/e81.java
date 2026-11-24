package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class e81 implements t81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7352a;

    public e81(String str) {
        this.f7352a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e81) && this.f7352a.equals(((e81) obj).f7352a);
    }

    public final int hashCode() {
        return this.f7352a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowGameCurrencyDialogConversationDialog(description=", this.f7352a, Separators.RPAREN);
    }
}
