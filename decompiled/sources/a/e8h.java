package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e8h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7371a;
    public final String b;
    public final String c;
    public final boolean d;
    public final List e;

    public e8h(int i, String str, String str2, List list, boolean z) {
        list.getClass();
        this.f7371a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8h)) {
            return false;
        }
        e8h e8hVar = (e8h) obj;
        return this.f7371a == e8hVar.f7371a && this.b.equals(e8hVar.b) && this.c.equals(e8hVar.c) && this.d == e8hVar.d && Intrinsics.d(this.e, e8hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(ua80.b(ua80.b(Integer.hashCode(this.f7371a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f7371a, "CyberMatchTeamModel(id=", ", name=", this.b, ", image=");
        brm0.C(this.c, ", isWinner=", ", players=", sbR, this.d);
        return dw9.r(sbR, this.e, Separators.RPAREN);
    }
}
