package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class a3q {
    public static final z2q Companion = new z2q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f184a;
    public final String b;
    public final String c;

    public /* synthetic */ a3q(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f184a = null;
        } else {
            this.f184a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3q)) {
            return false;
        }
        a3q a3qVar = (a3q) obj;
        return Intrinsics.d(this.f184a, a3qVar.f184a) && Intrinsics.d(this.b, a3qVar.b) && Intrinsics.d(this.c, a3qVar.c);
    }

    public final int hashCode() {
        Integer num = this.f184a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(h97.n(this.f184a, "FilterChampResponse(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
