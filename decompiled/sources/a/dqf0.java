package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class dqf0 {
    public static final cqf0 Companion = new cqf0();
    public static final a8z[] d = {maz.a(wez.f39042a, new b4f0((byte) 18)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6513a;
    public final String b;
    public final int c;

    public /* synthetic */ dqf0(int i, int i2, String str, List list) {
        if (6 != (i & 6)) {
            m2x.I(i, 6, bqf0.f3027a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f6513a = kotlin.collections.a.c(0L);
        } else {
            this.f6513a = list;
        }
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqf0)) {
            return false;
        }
        dqf0 dqf0Var = (dqf0) obj;
        return Intrinsics.d(this.f6513a, dqf0Var.f6513a) && Intrinsics.d(this.b, dqf0Var.b) && this.c == dqf0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f6513a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, ua80.o("ResidentGetActiveGameRequest(userChoice=", ", lng=", this.b, this.f6513a, ", whence="));
    }

    public dqf0(List list, String str) {
        list.getClass();
        this.f6513a = list;
        this.b = str;
        this.c = 22;
    }
}
