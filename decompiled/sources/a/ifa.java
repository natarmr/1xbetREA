package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ifa implements p6t0, s0h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boo0 f14676a;
    public final hfa b;
    public final uh90 c;
    public final a4x d;
    public final lea e;

    public ifa(boo0 boo0Var, hfa hfaVar, uh90 uh90Var, i4 i4Var, lea leaVar) {
        i4Var.getClass();
        this.f14676a = boo0Var;
        this.b = hfaVar;
        this.c = uh90Var;
        this.d = i4Var;
        this.e = leaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifa)) {
            return false;
        }
        ifa ifaVar = (ifa) obj;
        return this.f14676a.equals(ifaVar.f14676a) && this.b.equals(ifaVar.b) && this.c.equals(ifaVar.c) && Intrinsics.d(this.d, ifaVar.d) && this.e.equals(ifaVar.e);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "CARD_CRICKET_KEY";
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + ((this.f14676a.hashCode() + 497310238) * 31)) * 31)) * 31, 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return iun.f15405a;
    }

    public final String toString() {
        return "CardCricketUiModel(key=CARD_CRICKET_KEY, tabs=" + this.f14676a + ", currentTabs=" + this.b + ", cardsCost=" + this.c + ", gameProgress=" + this.d + ", gameField=" + this.e + Separators.RPAREN;
    }
}
