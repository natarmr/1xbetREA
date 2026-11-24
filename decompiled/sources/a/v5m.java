package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36832a;
    public final String b;
    public final o0x c;
    public final int d;
    public final Boolean e;
    public final boolean f;

    public v5m(long j, String str, o0x o0xVar, int i, Boolean bool, boolean z) {
        str.getClass();
        this.f36832a = j;
        this.b = str;
        this.c = o0xVar;
        this.d = i;
        this.e = bool;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v5m)) {
            return false;
        }
        v5m v5mVar = (v5m) obj;
        return this.f36832a == v5mVar.f36832a && Intrinsics.d(this.b, v5mVar.b) && Intrinsics.d(this.c, v5mVar.c) && this.d == v5mVar.d && Intrinsics.d(this.e, v5mVar.e) && this.f == v5mVar.f;
    }

    public final int hashCode() {
        int iA = twn.a(this.d, w6x.d(this.c, ua80.b(Long.hashCode(this.f36832a) * 31, 31, this.b), 31), 31);
        Boolean bool = this.e;
        return Boolean.hashCode(this.f) + ((iA + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f36832a, "DsCyberGameHeaderOpponentUiModel(id=", ", name=", this.b);
        sbO.append(", logo=");
        sbO.append(this.c);
        sbO.append(", logoPlaceholder=");
        sbO.append(this.d);
        sbO.append(", isFavorite=");
        sbO.append(this.e);
        sbO.append(", logoFacesOpponent=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
