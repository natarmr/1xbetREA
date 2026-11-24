package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class wet {
    public static final vet Companion = new vet();
    public static final a8z[] f = {null, maz.a(wez.f39042a, new tet(0)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39034a;
    public final List b;
    public final int c;
    public final int d;
    public final String e;

    public /* synthetic */ wet(int i, int i2, int i3, long j, String str, List list) {
        if (29 != (i & 29)) {
            m2x.I(i, 29, uet.f35546a.getDescriptor());
            throw null;
        }
        this.f39034a = j;
        if ((i & 2) == 0) {
            this.b = kotlin.collections.a.c(0);
        } else {
            this.b = list;
        }
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wet)) {
            return false;
        }
        wet wetVar = (wet) obj;
        return this.f39034a == wetVar.f39034a && Intrinsics.d(this.b, wetVar.b) && this.c == wetVar.c && this.d == wetVar.d && Intrinsics.d(this.e, wetVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, dw9.a(Long.hashCode(this.f39034a) * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = cs0.p(this.f39034a, "GemsOdysseyActionRequest(userId=", ", userChoice=", this.b);
        rw2.s(this.c, this.d, ", actionStep=", ", whence=", sbP);
        return rw2.o(sbP, ", lng=", this.e, Separators.RPAREN);
    }

    public wet(int i, long j, String str, List list) {
        list.getClass();
        this.f39034a = j;
        this.b = list;
        this.c = i;
        this.d = 22;
        this.e = str;
    }
}
