package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m6o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21282a;
    public final String b;
    public final String c;
    public final int d;
    public final ArrayList e;

    public m6o0(int i, String str, String str2, String str3, ArrayList arrayList) {
        str2.getClass();
        this.f21282a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6o0)) {
            return false;
        }
        m6o0 m6o0Var = (m6o0) obj;
        return this.f21282a.equals(m6o0Var.f21282a) && Intrinsics.d(this.b, m6o0Var.b) && this.c.equals(m6o0Var.c) && this.d == m6o0Var.d && this.e.equals(m6o0Var.e);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f21282a;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(this.f21282a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SyntheticMarbleMmaStatisticUiModel(key=", this.f21282a, ", teamName=", this.b, ", teamImage=");
        twn.w(this.d, this.c, ", background=", ", roundInfoList=", sbN);
        return rz4.n(sbN, this.e, Separators.RPAREN);
    }
}
