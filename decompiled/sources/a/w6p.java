package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class w6p {
    public static final v6p Companion = new v6p();
    public static final a8z[] c = {maz.a(wez.f39042a, new r4p(1)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c7p f38634a;
    public final Integer b;

    public /* synthetic */ w6p(int i, c7p c7pVar, Integer num) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, u6p.f35148a.getDescriptor());
            throw null;
        }
        this.f38634a = c7pVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6p)) {
            return false;
        }
        w6p w6pVar = (w6p) obj;
        return this.f38634a == w6pVar.f38634a && Intrinsics.d(this.b, w6pVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f38634a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "FavoriteClearRequest(gamesSource=" + this.f38634a + ", subcategoryId=" + this.b + Separators.RPAREN;
    }

    public w6p(c7p c7pVar, Integer num) {
        c7pVar.getClass();
        this.f38634a = c7pVar;
        this.b = num;
    }
}
