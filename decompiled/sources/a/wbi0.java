package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.security.impl.navigation.ChangePhoneNumberScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class wbi0 implements dci0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38881a;
    public final swp0 b;
    public final int c;
    public final List d;
    public final List e;
    public final boolean f;
    public final String g;
    public final ChangePhoneNumberScreen h;

    public wbi0(String str, swp0 swp0Var, int i, List list, List list2, boolean z, String str2, ChangePhoneNumberScreen changePhoneNumberScreen) {
        str.getClass();
        list.getClass();
        list2.getClass();
        str2.getClass();
        this.f38881a = str;
        this.b = swp0Var;
        this.c = i;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.g = str2;
        this.h = changePhoneNumberScreen;
    }

    @Override // a.dci0
    public final List D() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wbi0) {
            wbi0 wbi0Var = (wbi0) obj;
            return Intrinsics.d(this.f38881a, wbi0Var.f38881a) && this.b.equals(wbi0Var.b) && this.c == wbi0Var.c && Intrinsics.d(this.d, wbi0Var.d) && Intrinsics.d(this.e, wbi0Var.e) && this.f == wbi0Var.f && Intrinsics.d(this.g, wbi0Var.g) && this.h == wbi0Var.h;
        }
        return false;
    }

    @Override // a.dci0
    public final String getPhoneNumber() {
        return this.f38881a;
    }

    @Override // a.dci0
    public final swp0 getToken() {
        return this.b;
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(brm0.e(dw9.a(dw9.a(twn.a(this.c, (this.b.hashCode() + (this.f38881a.hashCode() * 31)) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    @Override // a.dci0
    public final int p() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangePhoneConfirmation(phoneNumber=");
        sb.append(this.f38881a);
        sb.append(", token=");
        sb.append(this.b);
        sb.append(", confirmTypeAlias=");
        ohs0.v(this.c, ", availableActivationTypeList=", ", availableRepeatActivationTypeList=", sb, this.d);
        rz4.z(sb, ", isRepeatFlow=", this.e, ", newPhone=", this.f);
        sb.append(this.g);
        sb.append(", onTokenExpiredNavigationScreen=");
        sb.append(this.h);
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
