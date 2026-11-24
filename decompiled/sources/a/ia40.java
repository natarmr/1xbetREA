package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ia40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14419a;
    public final ba40 b;
    public final String c;

    public ia40(long j, ba40 ba40Var, String str) {
        str.getClass();
        this.f14419a = j;
        this.b = ba40Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ia40)) {
            return false;
        }
        ia40 ia40Var = (ia40) obj;
        return this.f14419a == ia40Var.f14419a && this.b.equals(ia40Var.b) && Intrinsics.d(this.c, ia40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f14419a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaCharacterCardItemUiModel(id=");
        sb.append(this.f14419a);
        sb.append(", character=");
        sb.append(this.b);
        return rw2.o(sb, ", liveLabel=", this.c, Separators.RPAREN);
    }
}
