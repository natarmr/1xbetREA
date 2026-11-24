package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bxs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4i f3390a;
    public final o4i b;
    public final String c;
    public final y1n d;

    public bxs0(o4i o4iVar, o4i o4iVar2, String str, y1n y1nVar) {
        str.getClass();
        this.f3390a = o4iVar;
        this.b = o4iVar2;
        this.c = str;
        this.d = y1nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxs0)) {
            return false;
        }
        bxs0 bxs0Var = (bxs0) obj;
        return this.f3390a.equals(bxs0Var.f3390a) && this.b.equals(bxs0Var.b) && Intrinsics.d(this.c, bxs0Var.c) && Intrinsics.d(this.d, bxs0Var.d);
    }

    public final int hashCode() {
        int iB = ua80.b((this.b.hashCode() + (this.f3390a.hashCode() * 31)) * 31, 31, this.c);
        y1n y1nVar = this.d;
        return iB + (y1nVar == null ? 0 : y1nVar.hashCode());
    }

    public final String toString() {
        return "TwoPairsBasicLineMiddleModel(teamOne=" + this.f3390a + ", teamTwo=" + this.b + ", info=" + this.c + ", timer=" + this.d + Separators.RPAREN;
    }
}
