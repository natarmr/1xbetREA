package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class z9h {
    public static final y9h Companion = new y9h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f44018a;
    public final String b;
    public final String c;

    public /* synthetic */ z9h(int i, Long l, String str, String str2) {
        if ((i & 1) == 0) {
            this.f44018a = null;
        } else {
            this.f44018a = l;
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
        if (!(obj instanceof z9h)) {
            return false;
        }
        z9h z9hVar = (z9h) obj;
        return Intrinsics.d(this.f44018a, z9hVar.f44018a) && Intrinsics.d(this.b, z9hVar.b) && Intrinsics.d(this.c, z9hVar.c);
    }

    public final int hashCode() {
        Long l = this.f44018a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(cs0.s(this.f44018a, "CyberOpponentElementResponse(id=", ", name=", this.b, ", image="), this.c, Separators.RPAREN);
    }
}
