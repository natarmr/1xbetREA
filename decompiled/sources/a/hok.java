package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class hok implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13397a;
    public final int b;
    public final String c;
    public final String d;

    public hok(int i, long j, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f13397a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hok)) {
            return false;
        }
        hok hokVar = (hok) obj;
        return this.f13397a == hokVar.f13397a && this.b == hokVar.b && Intrinsics.d(this.c, hokVar.c) && Intrinsics.d(this.d, hokVar.d);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof hok) && (p6t0Var2 instanceof hok) && ((hok) p6t0Var).b == ((hok) p6t0Var2).b;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(R.drawable.ic_game_pad_placeholder, ua80.b(twn.a(this.b, Long.hashCode(this.f13397a) * 31, 31), 31, this.c), 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        StringBuilder sbQ = brm0.q(this.b, this.f13397a, "DisciplineButtonUiModel(id=", ", position=");
        axq.s(R.drawable.ic_game_pad_placeholder, ", imageUrl=", this.c, ", placeholder=", sbQ);
        return rw2.o(sbQ, ", name=", this.d, Separators.RPAREN);
    }
}
