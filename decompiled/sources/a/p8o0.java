package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p8o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26567a;
    public final String b;
    public final ArrayList c;
    public final int d;
    public final ArrayList e;
    public final boolean f;

    public p8o0(String str, String str2, ArrayList arrayList, int i, ArrayList arrayList2, boolean z) {
        str2.getClass();
        this.f26567a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = i;
        this.e = arrayList2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8o0)) {
            return false;
        }
        p8o0 p8o0Var = (p8o0) obj;
        return this.f26567a.equals(p8o0Var.f26567a) && Intrinsics.d(this.b, p8o0Var.b) && this.c.equals(p8o0Var.c) && this.d == p8o0Var.d && this.e.equals(p8o0Var.e) && this.f == p8o0Var.f;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f26567a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + twn.g(this.e, twn.a(this.d, twn.g(this.c, ua80.b(this.f26567a.hashCode() * 31, 31, this.b), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SyntheticTennisUiModel(key=", this.f26567a, ", teamName=", this.b, ", teamImages=");
        sbN.append(this.c);
        sbN.append(", background=");
        sbN.append(this.d);
        sbN.append(", scoreInfoList=");
        sbN.append(this.e);
        sbN.append(", serve=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
