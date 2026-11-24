package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ca implements ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3984a;
    public final sek0 b;

    public ca(sek0 sek0Var, String str) {
        str.getClass();
        this.f3984a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        return Intrinsics.d(this.f3984a, caVar.f3984a) && this.b.equals(caVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3984a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMessage(message=" + this.f3984a + ", type=" + this.b + Separators.RPAREN;
    }
}
