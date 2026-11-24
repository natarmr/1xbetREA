package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class zel {
    public static final yel Companion = new yel();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new xal(4))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44257a;
    public final int b;
    public final int c;
    public final String d;
    public final List e;

    public /* synthetic */ zel(int i, int i2, int i3, long j, String str, List list) {
        if (31 != (i & 31)) {
            m2x.I(i, 31, xel.f40748a.getDescriptor());
            throw null;
        }
        this.f44257a = j;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zel)) {
            return false;
        }
        zel zelVar = (zel) obj;
        return this.f44257a == zelVar.f44257a && this.b == zelVar.b && this.c == zelVar.c && Intrinsics.d(this.d, zelVar.d) && Intrinsics.d(this.e, zelVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(twn.a(this.c, twn.a(this.b, Long.hashCode(this.f44257a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f44257a, "DragonsGoldActionRequest(userId=", ", actionStep=");
        w6x.w(this.c, ", choiceColumnPosition=", ", lng=", this.d, sbQ);
        return ohs0.s(sbQ, ", gameType=", this.e, Separators.RPAREN);
    }

    public zel(int i, int i2, long j, String str, List list) {
        list.getClass();
        this.f44257a = j;
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = list;
    }
}
