package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fod implements znd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mcp0 f9876a;
    public final mcp0 b;
    public final j83 c;
    public final String d;

    public fod(mcp0 mcp0Var, mcp0 mcp0Var2, j83 j83Var, String str) {
        str.getClass();
        this.f9876a = mcp0Var;
        this.b = mcp0Var2;
        this.c = j83Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fod)) {
            return false;
        }
        fod fodVar = (fod) obj;
        return this.f9876a.equals(fodVar.f9876a) && this.b.equals(fodVar.b) && this.c.equals(fodVar.c) && Intrinsics.d(this.d, fodVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.f(this.c, ua80.b(this.f9876a.f21563a.hashCode() * 31, 31, this.b.f21563a), 31);
    }

    public final String toString() {
        return "MultiTeam(teamOne=" + this.f9876a + ", teamTwo=" + this.b + ", matchInfo=" + ((Object) this.c) + ", vs=" + this.d + Separators.RPAREN;
    }
}
