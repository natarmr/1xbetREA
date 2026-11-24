package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class koy implements ooy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18651a;
    public final boolean b;

    public koy(String str, boolean z) {
        str.getClass();
        this.f18651a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koy)) {
            return false;
        }
        koy koyVar = (koy) obj;
        return Intrinsics.d(this.f18651a, koyVar.f18651a) && this.b == koyVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f18651a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("Description(text=", this.f18651a, ", visibility=", this.b, Separators.RPAREN);
    }
}
