package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final class fr90 implements hr90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDate f10008a;
    public final Function1 b;
    public final Function2 c;
    public final xdr d;

    public fr90(SimpleDate simpleDate) {
        nfj nfjVar = nfj.f23439a;
        er90 er90Var = new er90((byte) 0);
        so90 so90Var = new so90((byte) 4);
        t330 t330Var = new t330((byte) 5);
        this.f10008a = simpleDate;
        this.b = er90Var;
        this.c = so90Var;
        this.d = t330Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fr90)) {
            return false;
        }
        fr90 fr90Var = (fr90) obj;
        nfj nfjVar = nfj.f23439a;
        return Intrinsics.d(this.f10008a, fr90Var.f10008a) && this.b.equals(fr90Var.b) && this.c.equals(fr90Var.c) && this.d.equals(fr90Var.d);
    }

    public final int hashCode() {
        int iHashCode = nfj.f23439a.hashCode() * 31;
        SimpleDate simpleDate = this.f10008a;
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((iHashCode + (simpleDate == null ? 0 : simpleDate.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Date(pattern=" + nfj.f23439a + ", initialDate=" + this.f10008a + ", yearEnabled=" + this.b + ", monthEnabled=" + this.c + ", dayEnabled=" + this.d + Separators.RPAREN;
    }
}
