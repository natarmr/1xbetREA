package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f9363a;
    public final String b;
    public final n0x c;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public fdm(long j, String str, n0x n0xVar) {
        str.getClass();
        this.f9363a = (int) j;
        this.b = str;
        this.c = n0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdm)) {
            return false;
        }
        fdm fdmVar = (fdm) obj;
        return ((long) this.f9363a) == ((long) fdmVar.f9363a) && Intrinsics.d(this.b, fdmVar.b) && this.c.equals(fdmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Long.hashCode(this.f9363a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f9363a, "DsCyberUFCBannerCollectionItemUiModel(id=", ", label=", this.b);
        sbO.append(", picture=");
        sbO.append(this.c);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
