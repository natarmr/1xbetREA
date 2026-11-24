package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class tfp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33878a;
    public final String b;
    public final List c;
    public final String d;

    public tfp0(List list, String str, String str2, String str3) {
        str.getClass();
        list.getClass();
        this.f33878a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tfp0)) {
            return false;
        }
        tfp0 tfp0Var = (tfp0) obj;
        return Intrinsics.d(this.f33878a, tfp0Var.f33878a) && this.b.equals(tfp0Var.b) && Intrinsics.d(this.c, tfp0Var.c) && this.d.equals(tfp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(ua80.b(this.f33878a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamModel(id=", this.f33878a, ", image=", this.b, ", subTeams=");
        sbN.append(this.c);
        sbN.append(", title=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
