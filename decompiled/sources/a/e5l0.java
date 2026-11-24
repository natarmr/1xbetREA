package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e5l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7239a;
    public final List b;
    public final List c;
    public final amb0 d;
    public final cmb0 e;
    public final y1p f;
    public final ms2 g;

    public e5l0(String str, List list, List list2, amb0 amb0Var, cmb0 cmb0Var, y1p y1pVar, ms2 ms2Var) {
        list.getClass();
        list2.getClass();
        this.f7239a = str;
        this.b = list;
        this.c = list2;
        this.d = amb0Var;
        this.e = cmb0Var;
        this.f = y1pVar;
        this.g = ms2Var;
    }

    public static e5l0 a(e5l0 e5l0Var, String str, List list, List list2, amb0 amb0Var, cmb0 cmb0Var, y1p y1pVar, ms2 ms2Var, int i) {
        if ((i & 1) != 0) {
            str = e5l0Var.f7239a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            list = e5l0Var.b;
        }
        List list3 = list;
        if ((i & 4) != 0) {
            list2 = e5l0Var.c;
        }
        List list4 = list2;
        if ((i & 8) != 0) {
            amb0Var = e5l0Var.d;
        }
        amb0 amb0Var2 = amb0Var;
        if ((i & 16) != 0) {
            cmb0Var = e5l0Var.e;
        }
        cmb0 cmb0Var2 = cmb0Var;
        if ((i & 32) != 0) {
            y1pVar = e5l0Var.f;
        }
        y1p y1pVar2 = y1pVar;
        if ((i & 64) != 0) {
            ms2Var = e5l0Var.g;
        }
        list3.getClass();
        list4.getClass();
        return new e5l0(str2, list3, list4, amb0Var2, cmb0Var2, y1pVar2, ms2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5l0)) {
            return false;
        }
        e5l0 e5l0Var = (e5l0) obj;
        return this.f7239a.equals(e5l0Var.f7239a) && Intrinsics.d(this.b, e5l0Var.b) && Intrinsics.d(this.c, e5l0Var.c) && this.d == e5l0Var.d && this.e == e5l0Var.e && this.f == e5l0Var.f && this.g.equals(e5l0Var.g);
    }

    public final int hashCode() {
        int iA = dw9.a(dw9.a(this.f7239a.hashCode() * 31, 31, this.b), 31, this.c);
        amb0 amb0Var = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iA + (amb0Var == null ? 0 : amb0Var.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("SportDelegateState(screen=", this.f7239a, ", topEventList=", this.b, ", champList=");
        sbF.append(this.c);
        sbF.append(", popularTabType=");
        sbF.append(this.d);
        sbF.append(", popularTopTabType=");
        sbF.append(this.e);
        sbF.append(", fatmanScreenType=");
        sbF.append(this.f);
        sbF.append(", entryPointType=");
        sbF.append(this.g);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
