package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bmr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2850a;
    public long b;
    public String c;
    public String d;
    public int e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmr)) {
            return false;
        }
        bmr bmrVar = (bmr) obj;
        return this.f2850a == bmrVar.f2850a && this.b == bmrVar.b && Intrinsics.d(this.c, bmrVar.c) && Intrinsics.d(this.d, bmrVar.d) && this.e == bmrVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ua80.b(ua80.b(rw2.b(Boolean.hashCode(this.f2850a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        boolean z = this.f2850a;
        long j = this.b;
        String str = this.c;
        String str2 = this.d;
        int i = this.e;
        StringBuilder sb = new StringBuilder("GameActionsParams(favorite=");
        sb.append(z);
        sb.append(", gameId=");
        sb.append(j);
        f140.v(sb, ", gameUrl=", str, ", gameName=", str2);
        return vqd.p(sb, ", categoryId=", i, Separators.RPAREN);
    }
}
