package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ctx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4964a;
    public final n3w b;
    public final long c;
    public final String d;

    public ctx(boolean z, n3w n3wVar, long j, String str) {
        n3wVar.getClass();
        str.getClass();
        this.f4964a = z;
        this.b = n3wVar;
        this.c = j;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctx)) {
            return false;
        }
        ctx ctxVar = (ctx) obj;
        return this.f4964a == ctxVar.f4964a && Intrinsics.d(this.b, ctxVar.b) && this.c == ctxVar.c && Intrinsics.d(this.d, ctxVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b((this.b.hashCode() + (Boolean.hashCode(this.f4964a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItemChangeModel(local=");
        sb.append(this.f4964a);
        sb.append(", historyItem=");
        sb.append(this.b);
        sb.append(", balanceId=");
        kng0.z(sb, this.c, ", currencySymbol=", this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
