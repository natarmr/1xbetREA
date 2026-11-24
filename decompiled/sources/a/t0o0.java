package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t0o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33128a;
    public final String b;
    public final String c;
    public final int d;
    public final ArrayList e;

    public t0o0(int i, String str, String str2, String str3, ArrayList arrayList) {
        str2.getClass();
        this.f33128a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0o0)) {
            return false;
        }
        t0o0 t0o0Var = (t0o0) obj;
        return this.f33128a.equals(t0o0Var.f33128a) && Intrinsics.d(this.b, t0o0Var.b) && this.c.equals(t0o0Var.c) && this.d == t0o0Var.d && this.e.equals(t0o0Var.e);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f33128a;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(this.f33128a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SyntheticAssaultSquadUiModel(key=", this.f33128a, ", teamName=", this.b, ", teamImage=");
        twn.w(this.d, this.c, ", background=", ", roundInfoList=", sbN);
        return rz4.n(sbN, this.e, Separators.RPAREN);
    }
}
