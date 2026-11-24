package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class syo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33030a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final dyo i;
    public final dyo j;
    public final yxo k;

    public syo(boolean z, boolean z2, boolean z3, String str, String str2, String str3, List list, String str4, dyo dyoVar, dyo dyoVar2, yxo yxoVar) {
        list.getClass();
        this.f33030a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = list;
        this.h = str4;
        this.i = dyoVar;
        this.j = dyoVar2;
        this.k = yxoVar;
    }

    public static syo a(syo syoVar, boolean z, boolean z2, String str, String str2, String str3, List list, String str4, dyo dyoVar, dyo dyoVar2, yxo yxoVar, int i) {
        boolean z3 = (i & 1) != 0 ? syoVar.f33030a : false;
        if ((i & 2) != 0) {
            z = syoVar.b;
        }
        if ((i & 4) != 0) {
            z2 = syoVar.c;
        }
        if ((i & 8) != 0) {
            str = syoVar.d;
        }
        if ((i & 16) != 0) {
            str2 = syoVar.e;
        }
        if ((i & 32) != 0) {
            str3 = syoVar.f;
        }
        if ((i & 64) != 0) {
            list = syoVar.g;
        }
        if ((i & 128) != 0) {
            str4 = syoVar.h;
        }
        if ((i & 256) != 0) {
            dyoVar = syoVar.i;
        }
        if ((i & 512) != 0) {
            dyoVar2 = syoVar.j;
        }
        if ((i & 1024) != 0) {
            yxoVar = syoVar.k;
        }
        yxo yxoVar2 = yxoVar;
        syoVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        dyoVar.getClass();
        dyoVar2.getClass();
        dyo dyoVar3 = dyoVar2;
        dyo dyoVar4 = dyoVar;
        String str5 = str4;
        List list2 = list;
        String str6 = str3;
        String str7 = str2;
        String str8 = str;
        return new syo(z3, z, z2, str8, str7, str6, list2, str5, dyoVar4, dyoVar3, yxoVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syo)) {
            return false;
        }
        syo syoVar = (syo) obj;
        return this.f33030a == syoVar.f33030a && this.b == syoVar.b && this.c == syoVar.c && this.d.equals(syoVar.d) && this.e.equals(syoVar.e) && this.f.equals(syoVar.f) && Intrinsics.d(this.g, syoVar.g) && this.h.equals(syoVar.h) && this.i == syoVar.i && this.j == syoVar.j && this.k == syoVar.k;
    }

    public final int hashCode() {
        int iHashCode = (this.j.hashCode() + ((this.i.hashCode() + ua80.b(dw9.a(ua80.b(ua80.b(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f33030a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31;
        yxo yxoVar = this.k;
        return iHashCode + (yxoVar == null ? 0 : yxoVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("FastChangePasswordScreenState(isInitialLoading=", ", isRequestInProgress=", ", hasConnection=", this.f33030a, this.b);
        f140.s(", oldPassword=", this.d, ", password=", sbQ, this.c);
        f140.v(sbQ, this.e, ", confirmPassword=", this.f, ", passwordRequirements=");
        h97.y(", oldPasswordErrorMessage=", this.h, ", newPasswordError=", sbQ, this.g);
        sbQ.append(this.i);
        sbQ.append(", repeatPasswordError=");
        sbQ.append(this.j);
        sbQ.append(", focusField=");
        sbQ.append(this.k);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
