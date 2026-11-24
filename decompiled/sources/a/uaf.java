package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uaf implements bbf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35324a;
    public final sek0 b;

    public uaf(sek0 sek0Var, String str) {
        str.getClass();
        this.f35324a = str;
        this.b = sek0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uafVar = (uaf) obj;
        return Intrinsics.d(this.f35324a, uafVar.f35324a) && this.b.equals(uafVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35324a.hashCode() * 31);
    }

    public final String toString() {
        return "InfoMessage(message=" + this.f35324a + ", snackbarType=" + this.b + Separators.RPAREN;
    }
}
