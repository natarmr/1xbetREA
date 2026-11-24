package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;

/* JADX INFO: loaded from: classes2.dex */
public final class tj4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34034a;
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
    public final jj4 m;
    public final String n;
    public final boolean o;

    public tj4(boolean z, boolean z2, List list, boolean z3, gd4 gd4Var, hd4 hd4Var, id4 id4Var, int i, boolean z4, List list2, boolean z5, AuthDataErrorModel authDataErrorModel, jj4 jj4Var, String str, boolean z6) {
        list2.getClass();
        this.f34034a = z;
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
        this.m = jj4Var;
        this.n = str;
        this.o = z6;
    }

    public static tj4 a(tj4 tj4Var, boolean z, boolean z2, boolean z3, gd4 gd4Var, hd4 hd4Var, id4 id4Var, int i, boolean z4, List list, AuthDataErrorModel authDataErrorModel, boolean z5, int i2) {
        boolean z6 = (i2 & 1) != 0 ? tj4Var.f34034a : z;
        boolean z7 = (i2 & 2) != 0 ? tj4Var.b : z2;
        List list2 = tj4Var.c;
        boolean z8 = (i2 & 8) != 0 ? tj4Var.d : z3;
        gd4 gd4Var2 = (i2 & 16) != 0 ? tj4Var.e : gd4Var;
        hd4 hd4Var2 = (i2 & 32) != 0 ? tj4Var.f : hd4Var;
        id4 id4Var2 = (i2 & 64) != 0 ? tj4Var.g : id4Var;
        int i3 = (i2 & 128) != 0 ? tj4Var.h : i;
        boolean z9 = (i2 & 256) != 0 ? tj4Var.i : z4;
        List list3 = (i2 & 512) != 0 ? tj4Var.j : list;
        boolean z10 = tj4Var.k;
        AuthDataErrorModel authDataErrorModel2 = (i2 & 2048) != 0 ? tj4Var.l : authDataErrorModel;
        jj4 jj4Var = tj4Var.m;
        String str = tj4Var.n;
        boolean z11 = (i2 & 16384) != 0 ? tj4Var.o : z5;
        tj4Var.getClass();
        tj4Var.getClass();
        list3.getClass();
        return new tj4(z6, z7, list2, z8, gd4Var2, hd4Var2, id4Var2, i3, z9, list3, z10, authDataErrorModel2, jj4Var, str, z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj4)) {
            return false;
        }
        tj4 tj4Var = (tj4) obj;
        return this.f34034a == tj4Var.f34034a && this.b == tj4Var.b && this.c.equals(tj4Var.c) && this.d == tj4Var.d && this.e.equals(tj4Var.e) && this.f.equals(tj4Var.f) && this.g.equals(tj4Var.g) && this.h == tj4Var.h && this.i == tj4Var.i && Intrinsics.d(this.j, tj4Var.j) && this.k == tj4Var.k && Intrinsics.d(this.l, tj4Var.l) && this.m.equals(tj4Var.m) && this.n.equals(tj4Var.n) && this.o == tj4Var.o;
    }

    public final int hashCode() {
        int iE = brm0.e(dw9.a(brm0.e(twn.a(this.h, (this.g.hashCode() + ua80.b(ua80.b(brm0.e(dw9.a(brm0.e(Boolean.hashCode(this.f34034a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e.f11089a), 31, this.f.f12852a)) * 31, 31), 31, this.i), 31, this.j), 31, this.k);
        AuthDataErrorModel authDataErrorModel = this.l;
        return Integer.hashCode(1357) + brm0.e(ua80.b((this.m.hashCode() + ((iE + (authDataErrorModel == null ? 0 : authDataErrorModel.hashCode())) * 31)) * 31, 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AuthLoginVisualState(isLoginByPhone=", ", isRestorePasswordDeny=", ", authEntryPointModelList=", this.f34034a, this.b);
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
        sbQ.append(", backgroundImage=");
        sbQ.append(this.n);
        sbQ.append(", isPasswordRecover=");
        return rw2.p(sbQ, this.o, ", groupId=1357)");
    }
}
