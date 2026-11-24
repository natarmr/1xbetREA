package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class pon implements uon {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vfs f27337a;
    public final a4x b;

    public pon(vfs vfsVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f27337a = vfsVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pon)) {
            return false;
        }
        pon ponVar = (pon) obj;
        return this.f27337a.equals(ponVar.f27337a) && Intrinsics.d(this.b, ponVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27337a.hashCode() * 31);
    }

    public final String toString() {
        return "Content(gameInfoHeaderUiModel=" + this.f27337a + ", marketsGroupCardUiModelsList=" + this.b + Separators.RPAREN;
    }
}
