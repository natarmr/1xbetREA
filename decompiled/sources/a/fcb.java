package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fcb implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9303a;
    public final String b;
    public final boolean c;

    public fcb(String str, long j, boolean z) {
        str.getClass();
        this.f9303a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fcb)) {
            return false;
        }
        fcb fcbVar = (fcb) obj;
        return this.f9303a == fcbVar.f9303a && Intrinsics.d(this.b, fcbVar.b) && this.c == fcbVar.c;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof fcb) && (p6t0Var2 instanceof fcb) && ((fcb) p6t0Var).f9303a == ((fcb) p6t0Var2).f9303a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f9303a) * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof fcb) && (p6t0Var2 instanceof fcb)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            fcb fcbVar = (fcb) p6t0Var;
            fcb fcbVar2 = (fcb) p6t0Var2;
            k9x.G(linkedHashSet, new ccb(fcbVar.b), new ccb(fcbVar2.b));
            k9x.G(linkedHashSet, new bcb(fcbVar.c), new bcb(fcbVar2.c));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strL = kng0.l("Name(value=", this.b, Separators.RPAREN);
        return rw2.o(axq.o(this.f9303a, "ChampHeaderUiModel(id=", ", name=", strL), ", expanded=", defpackage.c.d("Expanded(value=", Separators.RPAREN, this.c), Separators.RPAREN);
    }
}
