package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class idw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14605a;
    public final long b;
    public final hjm c;
    public final List d;

    public idw(String str, long j, hjm hjmVar, List list) {
        str.getClass();
        list.getClass();
        this.f14605a = str;
        this.b = j;
        this.c = hjmVar;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idw)) {
            return false;
        }
        idw idwVar = (idw) obj;
        return Intrinsics.d(this.f14605a, idwVar.f14605a) && this.b == idwVar.b && this.c.equals(idwVar.c) && Intrinsics.d(this.d, idwVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f14605a;
    }

    public final int hashCode() {
        return this.d.hashCode() + hne.e(this.c, rw2.b(this.f14605a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "HltvAwardsMainNominationUiModel(key=", this.f14605a, ", nominationId=");
        sbO.append(", header=");
        sbO.append(this.c);
        sbO.append(", nominees=");
        sbO.append(this.d);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
