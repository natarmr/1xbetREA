package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class at3 implements vt3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1416a;

    public at3(String str) {
        this.f1416a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof at3) && this.f1416a.equals(((at3) obj).f1416a);
    }

    public final int hashCode() {
        return this.f1416a.hashCode();
    }

    public final String toString() {
        return kng0.l("CopyDebugConsoleViewLogsToClipboard(logs=", this.f1416a, Separators.RPAREN);
    }
}
