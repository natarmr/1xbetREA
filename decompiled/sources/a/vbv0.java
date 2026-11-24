package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vbv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37158a;
    public final ms2 b;
    public final List c;
    public final List d;
    public final m0k0 e;
    public final m97 f;

    static {
        k97 k97Var = m97.Companion;
    }

    public vbv0(String str, ms2 ms2Var, List list, List list2, m0k0 m0k0Var, m97 m97Var) {
        list.getClass();
        list2.getClass();
        this.f37158a = str;
        this.b = ms2Var;
        this.c = list;
        this.d = list2;
        this.e = m0k0Var;
        this.f = m97Var;
    }

    public static vbv0 a(vbv0 vbv0Var, String str, ms2 ms2Var, ArrayList arrayList, ArrayList arrayList2, m0k0 m0k0Var, m97 m97Var, int i) {
        if ((i & 1) != 0) {
            str = vbv0Var.f37158a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            ms2Var = vbv0Var.b;
        }
        ms2 ms2Var2 = ms2Var;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = vbv0Var.c;
        }
        List list2 = list;
        List list3 = arrayList2;
        if ((i & 8) != 0) {
            list3 = vbv0Var.d;
        }
        List list4 = list3;
        if ((i & 16) != 0) {
            m0k0Var = vbv0Var.e;
        }
        m0k0 m0k0Var2 = m0k0Var;
        if ((i & 32) != 0) {
            m97Var = vbv0Var.f;
        }
        ms2Var2.getClass();
        list2.getClass();
        list4.getClass();
        return new vbv0(str2, ms2Var2, list2, list4, m0k0Var2, m97Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbv0)) {
            return false;
        }
        vbv0 vbv0Var = (vbv0) obj;
        return this.f37158a.equals(vbv0Var.f37158a) && this.b.equals(vbv0Var.b) && Intrinsics.d(this.c, vbv0Var.c) && Intrinsics.d(this.d, vbv0Var.d) && this.e.equals(vbv0Var.e) && this.f.equals(vbv0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + dw9.a(dw9.a((this.b.hashCode() + (this.f37158a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WhoWinCardDelegateState(screen=");
        sb.append(this.f37158a);
        sb.append(", entryPoint=");
        sb.append(this.b);
        sb.append(", games=");
        b1j.y(", opponents=", ", singleBetGame=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", betInfo=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
