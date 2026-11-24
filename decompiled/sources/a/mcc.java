package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mcc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21544a;
    public final List b;
    public final je8 c;
    public final boolean d;

    public mcc(boolean z, List list, je8 je8Var, boolean z2) {
        list.getClass();
        this.f21544a = z;
        this.b = list;
        this.c = je8Var;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcc)) {
            return false;
        }
        mcc mccVar = (mcc) obj;
        return this.f21544a == mccVar.f21544a && Intrinsics.d(this.b, mccVar.b) && this.c == mccVar.c && this.d == mccVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + dw9.a(Boolean.hashCode(this.f21544a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "ChipsModelMapperState(loading=" + this.f21544a + ", filters=" + this.b + ", activeFilter=" + this.c + ", hasGamesWildFreeBet=" + this.d + Separators.RPAREN;
    }
}
