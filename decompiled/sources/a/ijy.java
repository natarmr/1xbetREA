package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class ijy {
    public static final hjy Companion = new hjy();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new pcy(2))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14901a;
    public final List b;

    public /* synthetic */ ijy(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f14901a = null;
        } else {
            this.f14901a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijy)) {
            return false;
        }
        ijy ijyVar = (ijy) obj;
        return Intrinsics.d(this.f14901a, ijyVar.f14901a) && Intrinsics.d(this.b, ijyVar.b);
    }

    public final int hashCode() {
        String str = this.f14901a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("KabaddiTopPlayersInfoResponse(teamId=", this.f14901a, ", players=", this.b, Separators.RPAREN);
    }
}
