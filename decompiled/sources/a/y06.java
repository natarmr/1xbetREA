package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class y06 extends i16 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41791a;

    public y06(String str) {
        this.f41791a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y06) && this.f41791a.equals(((y06) obj).f41791a);
    }

    public final int hashCode() {
        return this.f41791a.hashCode();
    }

    public final String toString() {
        return kng0.l("ErrorDialogCommand(message=", this.f41791a, Separators.RPAREN);
    }
}
