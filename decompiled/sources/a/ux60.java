package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ux60 implements vx60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cd50 f36427a;
    public final in5 b;
    public final ijl c;

    public ux60(cd50 cd50Var, in5 in5Var, ijl ijlVar) {
        cd50Var.getClass();
        in5Var.getClass();
        ijlVar.getClass();
        this.f36427a = cd50Var;
        this.b = in5Var;
        this.c = ijlVar;
    }

    @Override // a.vx60
    public final cd50 a() {
        return this.f36427a;
    }

    @Override // a.vx60
    public final in5 b() {
        return this.b;
    }

    @Override // a.vx60
    public final ijl c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ux60)) {
            return false;
        }
        ux60 ux60Var = (ux60) obj;
        return Intrinsics.d(this.f36427a, ux60Var.f36427a) && Intrinsics.d(this.b, ux60Var.b) && this.c == ux60Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f36427a.f4145a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Loading(navigationBarUiState=" + this.f36427a + ", balanceUiState=" + this.b + ", accountSelectionStyle=" + this.c + Separators.RPAREN;
    }
}
