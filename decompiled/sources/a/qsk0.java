package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f29263a;
    public final List b;
    public final List c;
    public final List d;

    public qsk0(btk0 btk0Var, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f29263a = btk0Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsk0)) {
            return false;
        }
        qsk0 qsk0Var = (qsk0) obj;
        return this.f29263a.equals(qsk0Var.f29263a) && Intrinsics.d(this.b, qsk0Var.b) && Intrinsics.d(this.c, qsk0Var.c) && Intrinsics.d(this.d, qsk0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f29263a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopPlayers(status=");
        sb.append(this.f29263a);
        sb.append(", content=");
        sb.append(this.b);
        sb.append(", legends=");
        return kng0.n(", players=", Separators.RPAREN, sb, this.c, this.d);
    }
}
