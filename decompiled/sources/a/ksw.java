package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ksw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lcp0 f18835a;
    public final lcp0 b;
    public final String c;
    public final String d;

    public ksw(lcp0 lcp0Var, lcp0 lcp0Var2, String str, String str2) {
        str2.getClass();
        this.f18835a = lcp0Var;
        this.b = lcp0Var2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksw)) {
            return false;
        }
        ksw kswVar = (ksw) obj;
        return this.f18835a.equals(kswVar.f18835a) && this.b.equals(kswVar.b) && Intrinsics.d(this.c, kswVar.c) && Intrinsics.d(this.d, kswVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f18835a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HostsVsGuestsInfoUiModel(teamOne=");
        sb.append(this.f18835a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", score=");
        return ua80.m(sb, this.c, ", startMatchDate=", this.d, Separators.RPAREN);
    }
}
