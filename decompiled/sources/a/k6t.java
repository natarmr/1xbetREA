package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class k6t {
    public static final j6t Companion = new j6t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17787a;
    public final String b;

    public /* synthetic */ k6t(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f17787a = null;
        } else {
            this.f17787a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k6t)) {
            return false;
        }
        k6t k6tVar = (k6t) obj;
        return Intrinsics.d(this.f17787a, k6tVar.f17787a) && Intrinsics.d(this.b, k6tVar.b);
    }

    public final int hashCode() {
        String str = this.f17787a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("SubGame(title=", this.f17787a, ", score=", this.b, Separators.RPAREN);
    }
}
