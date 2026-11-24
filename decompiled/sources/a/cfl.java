package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class cfl {
    public static final bfl Companion = new bfl();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new xal(5))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4267a;
    public final List b;

    public /* synthetic */ cfl(String str, List list, int i) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, afl.f783a.getDescriptor());
            throw null;
        }
        this.f4267a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfl)) {
            return false;
        }
        cfl cflVar = (cfl) obj;
        return Intrinsics.d(this.f4267a, cflVar.f4267a) && Intrinsics.d(this.b, cflVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4267a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("DragonsGoldActiveGameRequest(lng=", this.f4267a, ", gameType=", this.b, Separators.RPAREN);
    }

    public cfl(String str, List list) {
        list.getClass();
        this.f4267a = str;
        this.b = list;
    }
}
