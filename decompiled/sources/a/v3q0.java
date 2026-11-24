package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v3q0 implements w3q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3q0 f36743a;
    public final boolean b;
    public final int c;
    public final a4x d;
    public final List e;
    public final ArrayList f;

    public v3q0(k3q0 k3q0Var, boolean z, int i, a4x a4xVar, List list, ArrayList arrayList) {
        a4xVar.getClass();
        list.getClass();
        this.f36743a = k3q0Var;
        this.b = z;
        this.c = i;
        this.d = a4xVar;
        this.e = list;
        this.f = arrayList;
    }

    @Override // a.w3q0
    public final boolean a() {
        return this.b;
    }

    @Override // a.w3q0
    public final k3q0 b() {
        return this.f36743a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v3q0)) {
            return false;
        }
        v3q0 v3q0Var = (v3q0) obj;
        return this.f36743a.equals(v3q0Var.f36743a) && this.b == v3q0Var.b && this.c == v3q0Var.c && Intrinsics.d(this.d, v3q0Var.d) && Intrinsics.d(this.e, v3q0Var.e) && this.f.equals(v3q0Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(cs0.b(this.d, twn.a(this.c, brm0.e(this.f36743a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        return "Success(headerUiState=" + this.f36743a + ", rtlSupport=" + this.b + ", selectedTab=" + this.c + ", tabs=" + this.d + ", allEventsList=" + this.e + ", importantList=" + this.f + Separators.RPAREN;
    }
}
