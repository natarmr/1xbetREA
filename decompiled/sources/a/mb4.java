package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;

/* JADX INFO: loaded from: classes2.dex */
public final class mb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21489a;
    public final boolean b;
    public final List c;
    public final boolean d;
    public final gd4 e;
    public final hd4 f;
    public final id4 g;
    public final int h;
    public final boolean i;
    public final List j;
    public final boolean k;
    public final AuthDataErrorModel l;
    public final cb4 m;
    public final boolean n;

    public mb4(boolean z, boolean z2, List list, boolean z3, gd4 gd4Var, hd4 hd4Var, id4 id4Var, int i, boolean z4, List list2, boolean z5, AuthDataErrorModel authDataErrorModel, cb4 cb4Var, boolean z6) {
        list2.getClass();
        this.f21489a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
        this.e = gd4Var;
        this.f = hd4Var;
        this.g = id4Var;
        this.h = i;
        this.i = z4;
        this.j = list2;
        this.k = z5;
        this.l = authDataErrorModel;
        this.m = cb4Var;
        this.n = z6;
    }

    public static mb4 a(mb4 mb4Var, boolean z, boolean z2, boolean z3, gd4 gd4Var, hd4 hd4Var, id4 id4Var, int i, boolean z4, List list, AuthDataErrorModel authDataErrorModel, boolean z5, int i2) {
        boolean z6 = (i2 & 1) != 0 ? mb4Var.f21489a : z;
        boolean z7 = (i2 & 2) != 0 ? mb4Var.b : z2;
        List list2 = mb4Var.c;
        boolean z8 = (i2 & 8) != 0 ? mb4Var.d : z3;
        gd4 gd4Var2 = (i2 & 16) != 0 ? mb4Var.e : gd4Var;
        hd4 hd4Var2 = (i2 & 32) != 0 ? mb4Var.f : hd4Var;
        id4 id4Var2 = (i2 & 64) != 0 ? mb4Var.g : id4Var;
        int i3 = (i2 & 128) != 0 ? mb4Var.h : i;
        boolean z9 = (i2 & 256) != 0 ? mb4Var.i : z4;
        List list3 = (i2 & 512) != 0 ? mb4Var.j : list;
        boolean z10 = mb4Var.k;
        AuthDataErrorModel authDataErrorModel2 = (i2 & 2048) != 0 ? mb4Var.l : authDataErrorModel;
        cb4 cb4Var = mb4Var.m;
        boolean z11 = (i2 & 8192) != 0 ? mb4Var.n : z5;
        mb4Var.getClass();
        list3.getClass();
        return new mb4(z6, z7, list2, z8, gd4Var2, hd4Var2, id4Var2, i3, z9, list3, z10, authDataErrorModel2, cb4Var, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb4)) {
            return false;
        }
        mb4 mb4Var = (mb4) obj;
        return this.f21489a == mb4Var.f21489a && this.b == mb4Var.b && this.c.equals(mb4Var.c) && this.d == mb4Var.d && this.e.equals(mb4Var.e) && this.f.equals(mb4Var.f) && this.g.equals(mb4Var.g) && this.h == mb4Var.h && this.i == mb4Var.i && Intrinsics.d(this.j, mb4Var.j) && this.k == mb4Var.k && Intrinsics.d(this.l, mb4Var.l) && this.m.equals(mb4Var.m) && this.n == mb4Var.n;
    }

    public final int hashCode() {
        int iE = brm0.e(dw9.a(brm0.e(twn.a(this.h, (this.g.hashCode() + ua80.b(ua80.b(brm0.e(dw9.a(brm0.e(Boolean.hashCode(this.f21489a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e.f11089a), 31, this.f.f12852a)) * 31, 31), 31, this.i), 31, this.j), 31, this.k);
        AuthDataErrorModel authDataErrorModel = this.l;
        return Boolean.hashCode(this.n) + ((this.m.hashCode() + ((iE + (authDataErrorModel == null ? 0 : authDataErrorModel.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AuthLoginDefaultState(isLoginByPhone=", ", isRestorePasswordDeny=", ", authEntryPointModelList=", this.f21489a, this.b);
        rz4.z(sbQ, ", loading=", this.c, ", fieldLogin=", this.d);
        sbQ.append(this.e);
        sbQ.append(", fieldPassword=");
        sbQ.append(this.f);
        sbQ.append(", fieldPhone=");
        sbQ.append(this.g);
        sbQ.append(", selectedCountryId=");
        sbQ.append(this.h);
        sbQ.append(", isCountryAllow=");
        vqd.y(sbQ, ", validationMistakeList=", this.j, ", isRegistrationDeny=", this.i);
        sbQ.append(this.k);
        sbQ.append(", authDataErrorModel=");
        sbQ.append(this.l);
        sbQ.append(", settings=");
        sbQ.append(this.m);
        sbQ.append(", isPasswordRecover=");
        sbQ.append(this.n);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
