package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25871a;
    public final String b;
    public final String c;
    public final int d;
    public final we50 e;
    public final String f;
    public final List g;
    public final List h;

    public oud(int i, we50 we50Var, String str, String str2, String str3, String str4, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        list2.getClass();
        this.f25871a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = we50Var;
        this.f = str4;
        this.g = list;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oud)) {
            return false;
        }
        oud oudVar = (oud) obj;
        return Intrinsics.d(this.f25871a, oudVar.f25871a) && Intrinsics.d(this.b, oudVar.b) && Intrinsics.d(this.c, oudVar.c) && this.d == oudVar.d && this.e == oudVar.e && Intrinsics.d(this.f, oudVar.f) && Intrinsics.d(this.g, oudVar.g) && Intrinsics.d(this.h, oudVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.a(ua80.b((this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(this.f25871a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ConfirmByAuthenticatorParams(phoneNumber=", this.f25871a, ", token=", this.b, ", guid=");
        twn.w(this.d, this.c, ", confirmType=", ", navigation=", sbN);
        sbN.append(this.e);
        sbN.append(", newPass=");
        sbN.append(this.f);
        sbN.append(", availableActivationTypeList=");
        return kng0.n(", availableRepeatActivationTypeList=", Separators.RPAREN, sbN, this.g, this.h);
    }
}
