package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ssk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32730a;
    public final b8m b;
    public final a4x c;
    public final m3g d;

    public ssk(String str, b8m b8mVar, a4x a4xVar, m3g m3gVar) {
        a4xVar.getClass();
        this.f32730a = str;
        this.b = b8mVar;
        this.c = a4xVar;
        this.d = m3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssk)) {
            return false;
        }
        ssk sskVar = (ssk) obj;
        return this.f32730a.equals(sskVar.f32730a) && this.b.equals(sskVar.b) && Intrinsics.d(this.c, sskVar.c) && this.d.equals(sskVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f32730a;
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, (this.b.hashCode() + (this.f32730a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "DisciplineDetailsTransfersUiModel(key=" + this.f32730a + ", header=" + this.b + ", transfers=" + this.c + ", buttonBlockState=" + this.d + Separators.RPAREN;
    }
}
