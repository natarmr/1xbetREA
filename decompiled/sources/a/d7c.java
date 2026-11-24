package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d7c implements h7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5588a;
    public final sek0 b;

    public d7c(sek0 sek0Var, String str) {
        str.getClass();
        this.f5588a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7c)) {
            return false;
        }
        d7c d7cVar = (d7c) obj;
        return Intrinsics.d(this.f5588a, d7cVar.f5588a) && this.b.equals(d7cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5588a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMessage(message=" + this.f5588a + ", snackbarType=" + this.b + Separators.RPAREN;
    }
}
