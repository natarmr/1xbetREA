package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vbi0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37143a;
    public final swp0 b;
    public final int c;
    public final List d;
    public final List e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final we50 i;

    public vbi0(String str, swp0 swp0Var, int i, List list, List list2, boolean z, boolean z2, String str2, we50 we50Var) {
        str.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        we50Var.getClass();
        this.f37143a = str;
        this.b = swp0Var;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = z2;
        this.h = str2;
        this.i = we50Var;
    }

    @Override // a.dci0
    public final List D() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vbi0)) {
            return false;
        }
        vbi0 vbi0Var = (vbi0) obj;
        return Intrinsics.d(this.f37143a, vbi0Var.f37143a) && this.b.equals(vbi0Var.b) && this.c == vbi0Var.c && Intrinsics.d(this.d, vbi0Var.d) && Intrinsics.d(this.e, vbi0Var.e) && this.f == vbi0Var.f && this.g == vbi0Var.g && Intrinsics.d(this.h, vbi0Var.h) && this.i == vbi0Var.i;
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f37143a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(brm0.e(brm0.e(dw9.a(dw9.a(twn.a(this.c, (this.b.hashCode() + (this.f37143a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // a.dci0
    public final int p() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangePasswordConfirmation(phoneNumber=");
        sb.append(this.f37143a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=");
        ohs0.v(this.c, ", availableActivationTypeList=", ", availableRepeatActivationTypeList=", sb, this.d);
        rz4.z(sb, ", isRepeatFlow=", this.e, ", hasAuthenticator=", this.f);
        f140.s(", newPass=", this.h, ", navigation=", sb, this.g);
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    @Override // a.dci0
    public final boolean u() {
        return this.f;
    }

    @Override // a.dci0
    public final List z() {
        return this.d;
    }
}
