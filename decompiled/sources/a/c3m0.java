package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class c3m0 implements d3m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2m0 f3684a;
    public final String b;
    public final boolean c;
    public final fiv d;
    public final ArrayList e;

    public c3m0(k2m0 k2m0Var, String str, boolean z, fiv fivVar, ArrayList arrayList) {
        this.f3684a = k2m0Var;
        this.b = str;
        this.c = z;
        this.d = fivVar;
        this.e = arrayList;
    }

    @Override // a.d3m0
    public final boolean a() {
        return this.c;
    }

    @Override // a.d3m0
    public final k2m0 b() {
        return this.f3684a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3m0)) {
            return false;
        }
        c3m0 c3m0Var = (c3m0) obj;
        return this.f3684a.equals(c3m0Var.f3684a) && this.b.equals(c3m0Var.b) && this.c == c3m0Var.c && this.d.equals(c3m0Var.d) && this.e.equals(c3m0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e(ua80.b(this.f3684a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(headerUiState=");
        sb.append(this.f3684a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        sb.append(this.c);
        sb.append(", groupTableList=");
        sb.append(this.d);
        sb.append(", filters=");
        return rz4.n(sb, this.e, Separators.RPAREN);
    }
}
