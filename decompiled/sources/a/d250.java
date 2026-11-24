package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5341a;
    public final a0i b;
    public final a4x c;

    public d250(String str, a0i a0iVar, a4x a4xVar) {
        str.getClass();
        a4xVar.getClass();
        this.f5341a = str;
        this.b = a0iVar;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d250)) {
            return false;
        }
        d250 d250Var = (d250) obj;
        return Intrinsics.d(this.f5341a, d250Var.f5341a) && this.b.equals(d250Var.b) && Intrinsics.d(this.c, d250Var.c);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f5341a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5341a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoyaltyProgramBasicWidget(key=");
        sb.append(this.f5341a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", items=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
