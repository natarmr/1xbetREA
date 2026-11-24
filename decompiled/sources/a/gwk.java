package a;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/gwk;", "La/um40;", "La/hwk;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class gwk extends um40 {
    public final dbz b;

    public gwk(dbz dbzVar) {
        this.b = dbzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwk) && Intrinsics.d(this.b, ((gwk) obj).b);
    }

    @Override // a.um40
    public final lm40 f() {
        hwk hwkVar = new hwk();
        hwkVar.o = this.b;
        return hwkVar;
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        hwk hwkVar = (hwk) lm40Var;
        dbz dbzVar = hwkVar.o;
        dbz dbzVar2 = this.b;
        if (Intrinsics.d(dbzVar, dbzVar2) || !hwkVar.f20279a.n) {
            return;
        }
        dbz dbzVar3 = hwkVar.o;
        dbzVar3.e();
        dbzVar3.b = null;
        dbzVar3.c = -1;
        dbzVar2.j = hwkVar;
        hwkVar.o = dbzVar2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.b + Separators.RPAREN;
    }
}
