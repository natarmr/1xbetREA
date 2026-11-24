package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class k4c {
    public static final j4c Companion = new j4c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17661a;
    public final Long b;
    public final Long c;

    public /* synthetic */ k4c(int i, Long l, Long l2, String str) {
        if ((i & 1) == 0) {
            this.f17661a = null;
        } else {
            this.f17661a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4c)) {
            return false;
        }
        k4c k4cVar = (k4c) obj;
        return Intrinsics.d(this.f17661a, k4cVar.f17661a) && Intrinsics.d(this.b, k4cVar.b) && Intrinsics.d(this.c, k4cVar.c);
    }

    public final int hashCode() {
        String str = this.f17661a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.b;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.r(kng0.s(this.b, "Data(password=", this.f17661a, ", time=", ", userId="), this.c, Separators.RPAREN);
    }

    public k4c(Long l, Long l2, String str) {
        this.f17661a = str;
        this.b = l;
        this.c = l2;
    }
}
