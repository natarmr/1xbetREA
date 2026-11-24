package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s990 implements ea90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31843a;

    public s990(String str) {
        this.f31843a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s990) && this.f31843a.equals(((s990) obj).f31843a);
    }

    public final int hashCode() {
        return this.f31843a.hashCode();
    }

    public final String toString() {
        return kng0.l("EvaluateJavascript(script=", this.f31843a, Separators.RPAREN);
    }
}
