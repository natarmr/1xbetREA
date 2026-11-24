package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class omm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f25510a;
    public final wul b;
    public final wul c;

    public omm(a4x a4xVar, wul wulVar, wul wulVar2) {
        a4xVar.getClass();
        wulVar2.getClass();
        this.f25510a = a4xVar;
        this.b = wulVar;
        this.c = wulVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omm)) {
            return false;
        }
        omm ommVar = (omm) obj;
        return Intrinsics.d(this.f25510a, ommVar.f25510a) && Intrinsics.d(this.b, ommVar.b) && Intrinsics.d(this.c, ommVar.c);
    }

    public final int hashCode() {
        int iA = twn.a(0, this.f25510a.hashCode() * 31, 31);
        wul wulVar = this.b;
        return Boolean.hashCode(true) + i8i.a(this.c, (iA + (wulVar != null ? wulVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "DsOnboardingUiModel(pages=" + this.f25510a + ", initialPage=0, secondaryButton=" + this.b + ", primaryBottom=" + this.c + ", visibleMediator=true)";
    }
}
