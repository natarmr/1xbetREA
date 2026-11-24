package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;

/* JADX INFO: loaded from: classes2.dex */
public final class zf4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44285a;
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
    public final pf4 m;
    public final boolean n;
    public final boolean o;

    public zf4(boolean z, boolean z2, List list, boolean z3, gd4 gd4Var, hd4 hd4Var, id4 id4Var, int i, boolean z4, List list2, boolean z5, AuthDataErrorModel authDataErrorModel, pf4 pf4Var, boolean z6, boolean z7) {
        list2.getClass();
        this.f44285a = z;
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
        this.m = pf4Var;
        this.n = z6;
        this.o = z7;
    }

    public static zf4 a(zf4 zf4Var, boolean z, boolean z2, boolean z3, gd4 gd4Var, hd4 hd4Var, id4 id4Var, int i, boolean z4, List list, AuthDataErrorModel authDataErrorModel, boolean z5, boolean z6, int i2) {
        boolean z7 = (i2 & 1) != 0 ? zf4Var.f44285a : z;
        boolean z8 = (i2 & 2) != 0 ? zf4Var.b : z2;
        List list2 = zf4Var.c;
        boolean z9 = (i2 & 8) != 0 ? zf4Var.d : z3;
        gd4 gd4Var2 = (i2 & 16) != 0 ? zf4Var.e : gd4Var;
        hd4 hd4Var2 = (i2 & 32) != 0 ? zf4Var.f : hd4Var;
        id4 id4Var2 = (i2 & 64) != 0 ? zf4Var.g : id4Var;
        int i3 = (i2 & 128) != 0 ? zf4Var.h : i;
        boolean z10 = (i2 & 256) != 0 ? zf4Var.i : z4;
        List list3 = (i2 & 512) != 0 ? zf4Var.j : list;
        boolean z11 = zf4Var.k;
        AuthDataErrorModel authDataErrorModel2 = (i2 & 2048) != 0 ? zf4Var.l : authDataErrorModel;
        pf4 pf4Var = zf4Var.m;
        boolean z12 = (i2 & 8192) != 0 ? zf4Var.n : z5;
        boolean z13 = (i2 & 16384) != 0 ? zf4Var.o : z6;
        zf4Var.getClass();
        list3.getClass();
        return new zf4(z7, z8, list2, z9, gd4Var2, hd4Var2, id4Var2, i3, z10, list3, z11, authDataErrorModel2, pf4Var, z12, z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf4)) {
            return false;
        }
        zf4 zf4Var = (zf4) obj;
        return this.f44285a == zf4Var.f44285a && this.b == zf4Var.b && this.c.equals(zf4Var.c) && this.d == zf4Var.d && this.e.equals(zf4Var.e) && this.f.equals(zf4Var.f) && this.g.equals(zf4Var.g) && this.h == zf4Var.h && this.i == zf4Var.i && Intrinsics.d(this.j, zf4Var.j) && this.k == zf4Var.k && Intrinsics.d(this.l, zf4Var.l) && this.m.equals(zf4Var.m) && this.n == zf4Var.n && this.o == zf4Var.o;
    }

    public final int hashCode() {
        int iE = brm0.e(dw9.a(brm0.e(twn.a(this.h, (this.g.hashCode() + ua80.b(ua80.b(brm0.e(dw9.a(brm0.e(Boolean.hashCode(this.f44285a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e.f11089a), 31, this.f.f12852a)) * 31, 31), 31, this.i), 31, this.j), 31, this.k);
        AuthDataErrorModel authDataErrorModel = this.l;
        return Boolean.hashCode(this.o) + brm0.e((this.m.hashCode() + ((iE + (authDataErrorModel == null ? 0 : authDataErrorModel.hashCode())) * 31)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("AuthLoginSimpleState(isLoginByPhone=", ", isRestorePasswordDeny=", ", authEntryPointModelList=", this.f44285a, this.b);
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
        sbQ.append(", isContentDialogVisible=");
        return rw2.p(sbQ, this.o, Separators.RPAREN);
    }
}
