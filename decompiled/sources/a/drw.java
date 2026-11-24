package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class drw implements hrw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dbd f6585a;
    public final a4x b;

    public drw(dbd dbdVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f6585a = dbdVar;
        this.b = a4xVar;
    }

    @Override // a.hrw
    public final dbd a() {
        return this.f6585a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drw)) {
            return false;
        }
        drw drwVar = (drw) obj;
        return this.f6585a == drwVar.f6585a && Intrinsics.d(this.b, drwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6585a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(compactIconState=" + this.f6585a + ", horseRunnersInfoUiModelList=" + this.b + Separators.RPAREN;
    }
}
