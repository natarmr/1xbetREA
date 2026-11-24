package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fsk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10068a;
    public final b8m b;
    public final a4x c;
    public final m3g d;

    public fsk(String str, b8m b8mVar, a4x a4xVar, m3g m3gVar) {
        a4xVar.getClass();
        this.f10068a = str;
        this.b = b8mVar;
        this.c = a4xVar;
        this.d = m3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsk)) {
            return false;
        }
        fsk fskVar = (fsk) obj;
        return this.f10068a.equals(fskVar.f10068a) && this.b.equals(fskVar.b) && Intrinsics.d(this.c, fskVar.c) && this.d.equals(fskVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f10068a;
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, (this.b.hashCode() + (this.f10068a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "DisciplineDetailsLeaderBoardUiModel(key=" + this.f10068a + ", header=" + this.b + ", teams=" + this.c + ", buttonBlockState=" + this.d + Separators.RPAREN;
    }
}
