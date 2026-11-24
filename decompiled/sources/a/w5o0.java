package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w5o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38594a;
    public final String b;
    public final String c;
    public final int d;
    public final ArrayList e;

    public w5o0(int i, String str, String str2, String str3, ArrayList arrayList) {
        str2.getClass();
        this.f38594a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w5o0)) {
            return false;
        }
        w5o0 w5o0Var = (w5o0) obj;
        return this.f38594a.equals(w5o0Var.f38594a) && Intrinsics.d(this.b, w5o0Var.b) && this.c.equals(w5o0Var.c) && this.d == w5o0Var.d && this.e.equals(w5o0Var.e);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f38594a;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(this.f38594a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SyntheticFootballStatisticUiModel(key=", this.f38594a, ", teamName=", this.b, ", teamImage=");
        twn.w(this.d, this.c, ", background=", ", timeInfoList=", sbN);
        return rz4.n(sbN, this.e, Separators.RPAREN);
    }
}
