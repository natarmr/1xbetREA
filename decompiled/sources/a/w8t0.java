package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w8t0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f38741a;

    public w8t0(a4x a4xVar) {
        a4xVar.getClass();
        this.f38741a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8t0) && Intrinsics.d(this.f38741a, ((w8t0) obj).f38741a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "BANNERS";
    }

    public final int hashCode() {
        return this.f38741a.hashCode() - 1073192391;
    }

    public final String toString() {
        return h97.i(this.f38741a, "UniversalChampBannerUiModel(key=BANNERS, bannerList=", Separators.RPAREN);
    }
}
