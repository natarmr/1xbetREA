package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wy5 extends zy5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39960a;

    public wy5(String str) {
        this.f39960a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wy5) && this.f39960a.equals(((wy5) obj).f39960a);
    }

    public final int hashCode() {
        return this.f39960a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialogCommand(message=", this.f39960a, Separators.RPAREN);
    }
}
