package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7433a;
    public final Object b;
    public final List c;
    public final Object d;

    public e9p0(Object obj, Object obj2, Object obj3, List list) {
        list.getClass();
        this.f7433a = obj;
        this.b = obj2;
        this.c = list;
        this.d = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9p0)) {
            return false;
        }
        e9p0 e9p0Var = (e9p0) obj;
        Object obj2 = e9p0Var.f7433a;
        e0g0 e0g0Var = j0g0.b;
        return Intrinsics.d(this.f7433a, obj2) && Intrinsics.d(this.b, e9p0Var.b) && Intrinsics.d(this.c, e9p0Var.c) && Intrinsics.d(this.d, e9p0Var.d);
    }

    public final int hashCode() {
        return j0g0.b(this.d) + dw9.a(twn.c(j0g0.b(this.f7433a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strD = j0g0.d(this.f7433a);
        String strD2 = j0g0.d(this.b);
        String strD3 = j0g0.d(this.d);
        StringBuilder sbN = b1j.n("TeamDetailsEventsScenarioModel(liveGamesResult=", strD, ", lineGamesResult=", strD2, ", specialEventList=");
        sbN.append(this.c);
        sbN.append(", eventResults=");
        sbN.append(strD3);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
