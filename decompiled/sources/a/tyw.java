package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tyw implements uyw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34776a;
    public final int b;
    public final boolean c;

    public tyw(String str, int i, boolean z) {
        str.getClass();
        this.f34776a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tyw)) {
            return false;
        }
        tyw tywVar = (tyw) obj;
        return Intrinsics.d(this.f34776a, tywVar.f34776a) && this.b == tywVar.b && this.c == tywVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, this.f34776a.hashCode() * 31, 31);
    }

    public final String toString() {
        return rw2.p(kng0.p(this.b, "UrlImage(url=", this.f34776a, ", defaultImageRes=", ", cacheOnly="), this.c, Separators.RPAREN);
    }
}
