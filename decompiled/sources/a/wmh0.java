package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class wmh0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f39407a;
    public final String b;
    public final String c;

    /* JADX WARN: Type inference failed for: r0v0, types: [byte, int] */
    public wmh0(long j, String str) {
        this.f39407a = (int) j;
        this.b = str;
        this.c = h97.h(j, "javaClass_");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wmh0)) {
            return false;
        }
        wmh0 wmh0Var = (wmh0) obj;
        return ((long) this.f39407a) == ((long) wmh0Var.f39407a) && this.b.equals(wmh0Var.b);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return Intrinsics.d(p6t0Var.getKey(), p6t0Var2.getKey());
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.c;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(R.dimen.space_8) + brm0.e(ua80.b(Long.hashCode(this.f39407a) * 31, 31, this.b), 961, false);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof wmh0) || !(p6t0Var2 instanceof wmh0)) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        k9x.G(arrayList, new tmh0(((wmh0) p6t0Var).b), new tmh0(((wmh0) p6t0Var2).b));
        k9x.G(arrayList, new smh0(), new smh0());
        k9x.G(arrayList, new rmh0(), new rmh0());
        k9x.G(arrayList, new umh0(), new umh0());
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final String toString() {
        return rw2.o(axq.o(this.f39407a, "SectionHeaderUiModel(id=", ", name=", kng0.l("Name(value=", this.b, Separators.RPAREN)), ", endIconVisible=EndIconVisible(value=false), btnMoreName=ButtonName(value=), paddingTop=", ua80.e(R.dimen.space_8, "PaddingTop(value=", Separators.RPAREN), Separators.RPAREN);
    }
}
