package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class scr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32001a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final Map e;

    public scr(String str, Map map, boolean z, boolean z2, boolean z3) {
        this.f32001a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = map;
    }

    public static scr a(scr scrVar, boolean z, boolean z2, String str, Map map, int i) {
        if ((i & 1) != 0) {
            z = scrVar.f32001a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = scrVar.b;
        }
        boolean z4 = z2;
        boolean z5 = scrVar.c;
        if ((i & 16) != 0) {
            str = scrVar.d;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            map = scrVar.e;
        }
        Map map2 = map;
        map2.getClass();
        return new scr(str2, map2, z3, z4, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scr)) {
            return false;
        }
        scr scrVar = (scr) obj;
        return this.f32001a == scrVar.f32001a && this.b == scrVar.b && this.c == scrVar.c && this.d.equals(scrVar.d) && this.e.equals(scrVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(brm0.e(twn.a(0, brm0.e(Boolean.hashCode(this.f32001a) * 31, 31, this.b), 31), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FullStatisticState(isLoading=", ", isError=", ", projectId=0, debugAllowed=", this.f32001a, this.b);
        f140.s(", statisticUrl=", this.d, ", headers=", sbQ, this.c);
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
