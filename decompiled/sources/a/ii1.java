package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ii1 implements li1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mtl f14807a;
    public final mdm b;

    public ii1(mtl mtlVar, mdm mdmVar) {
        mtlVar.getClass();
        mdmVar.getClass();
        this.f14807a = mtlVar;
        this.b = mdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii1)) {
            return false;
        }
        ii1 ii1Var = (ii1) obj;
        return Intrinsics.d(this.f14807a, ii1Var.f14807a) && Intrinsics.d(this.b, ii1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14807a.f22376a.hashCode() * 31);
    }

    public final String toString() {
        return "EmptySearch(bottomBarUiModel=" + this.f14807a + ", emptyConfig=" + this.b + Separators.RPAREN;
    }
}
