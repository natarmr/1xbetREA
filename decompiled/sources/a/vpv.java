package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vpv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37826a;
    public final hjm b;
    public final fyl c;
    public final a4x d;

    public vpv(boolean z, hjm hjmVar, fyl fylVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f37826a = z;
        this.b = hjmVar;
        this.c = fylVar;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpv)) {
            return false;
        }
        vpv vpvVar = (vpv) obj;
        return this.f37826a == vpvVar.f37826a && this.b.equals(vpvVar.b) && this.c.equals(vpvVar.c) && Intrinsics.d(this.d, vpvVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "HEAD_TO_HEAD_STATISTIC";
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + hne.e(this.b, brm0.e(1586347914, 31, this.f37826a), 31)) * 31);
    }

    public final String toString() {
        return "HeadToHeadStatisticUiModel(key=HEAD_TO_HEAD_STATISTIC, supportRtl=" + this.f37826a + ", headerModel=" + this.b + ", chipsUiModel=" + this.c + ", eventCards=" + this.d + Separators.RPAREN;
    }
}
