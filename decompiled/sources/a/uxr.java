package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class uxr implements yxr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36455a;
    public final boolean b;

    public uxr(String str, boolean z) {
        this.f36455a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxr)) {
            return false;
        }
        uxr uxrVar = (uxr) obj;
        return this.f36455a.equals(uxrVar.f36455a) && this.b == uxrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f36455a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("GameStateInfo(text=", this.f36455a, ", shortenText=", this.b, Separators.RPAREN);
    }
}
