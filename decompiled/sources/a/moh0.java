package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class moh0 implements noh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ssh0 f22134a;
    public final boolean b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final String i;

    public moh0(ssh0 ssh0Var, boolean z, int i, long j, long j2, boolean z2, String str, boolean z3, String str2) {
        str.getClass();
        str2.getClass();
        this.f22134a = ssh0Var;
        this.b = z;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.f = z2;
        this.g = str;
        this.h = z3;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof moh0)) {
            return false;
        }
        moh0 moh0Var = (moh0) obj;
        if (this.f22134a != moh0Var.f22134a || this.b != moh0Var.b || this.c != moh0Var.c) {
            return false;
        }
        long j = moh0Var.d;
        int i = y3d.h;
        return h2t0.a(this.d, j) && h2t0.a(this.e, moh0Var.e) && this.f == moh0Var.f && Intrinsics.d(this.g, moh0Var.g) && this.h == moh0Var.h && Intrinsics.d(this.i, moh0Var.i);
    }

    public final int hashCode() {
        int iA = twn.a(this.c, brm0.e(this.f22134a.hashCode() * 31, 31, this.b), 31);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.i.hashCode() + brm0.e(ua80.b(brm0.e(rw2.b(rw2.b(iA, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // a.noh0
    public final boolean s() {
        return this.b;
    }

    @Override // a.noh0
    public final ssh0 t() {
        return this.f22134a;
    }

    public final String toString() {
        String strI = y3d.i(this.d);
        String strI2 = y3d.i(this.e);
        StringBuilder sb = new StringBuilder("SimpleSwitch(settingType=");
        sb.append(this.f22134a);
        sb.append(", settingAchieved=");
        sb.append(this.b);
        sb.append(", painterRes=");
        kng0.w(this.c, ", descriptionColor=", strI, ", iconTint=", sb);
        brm0.C(strI2, ", enabled=", ", title=", sb, this.f);
        brm0.C(this.g, ", checked=", ", description=", sb, this.h);
        return axq.n(sb, this.i, Separators.RPAREN);
    }
}
