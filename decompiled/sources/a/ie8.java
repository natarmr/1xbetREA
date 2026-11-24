package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ie8 implements z0f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14620a;
    public final String b;
    public final j83 c;
    public final String d;

    public ie8(ArrayList arrayList, String str, j83 j83Var, String str2) {
        u0f0 u0f0Var = u0f0.f34852a;
        str.getClass();
        this.f14620a = arrayList;
        this.b = str;
        this.c = j83Var;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ie8)) {
            return false;
        }
        ie8 ie8Var = (ie8) obj;
        u0f0 u0f0Var = u0f0.f34852a;
        return this.f14620a.equals(ie8Var.f14620a) && Intrinsics.d(this.b, ie8Var.b) && Intrinsics.d(this.c, ie8Var.c) && this.d.equals(ie8Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b(twn.g(this.f14620a, u0f0.v.hashCode() * 31, 31), 31, this.b);
        j83 j83Var = this.c;
        return this.d.hashCode() + ((iB + (j83Var == null ? 0 : j83Var.hashCode())) * 31);
    }

    @Override // a.z0f0
    public final u0f0 q() {
        return u0f0.v;
    }

    public final String toString() {
        u0f0 u0f0Var = u0f0.v;
        StringBuilder sb = new StringBuilder("BonusFieldUiModel(registrationFieldType=");
        sb.append(u0f0Var);
        sb.append(", bonusList=");
        sb.append(this.f14620a);
        sb.append(", hint=");
        sb.append(this.b);
        sb.append(", rules=");
        sb.append((Object) this.c);
        sb.append(", registrationTypeName=");
        return axq.n(sb, this.d, Separators.RPAREN);
    }
}
