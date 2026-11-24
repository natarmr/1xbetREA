package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ucb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35420a;
    public final boolean b;

    public ucb(String str, boolean z) {
        str.getClass();
        this.f35420a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ucb)) {
            return false;
        }
        ucb ucbVar = (ucb) obj;
        return Intrinsics.d(this.f35420a, ucbVar.f35420a) && this.b == ucbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f35420a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("SportImage(image=", this.f35420a, ", cyber=", this.b, Separators.RPAREN);
    }
}
