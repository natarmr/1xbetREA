package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aow f29088a;
    public final a4x b;
    public final a4x c;
    public final a4x d;

    public qow(aow aowVar, a4x a4xVar, a4x a4xVar2, a4x a4xVar3) {
        a4xVar.getClass();
        a4xVar2.getClass();
        a4xVar3.getClass();
        this.f29088a = aowVar;
        this.b = a4xVar;
        this.c = a4xVar2;
        this.d = a4xVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qow)) {
            return false;
        }
        qow qowVar = (qow) obj;
        return this.f29088a.equals(qowVar.f29088a) && Intrinsics.d(this.b, qowVar.b) && Intrinsics.d(this.c, qowVar.c) && Intrinsics.d(this.d, qowVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cs0.b(this.c, cs0.b(this.b, this.f29088a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "HorseRacesStatisticTableUiModel(cornerCell=" + this.f29088a + ", columnTitleList=" + this.b + ", rowTitleList=" + this.c + ", cellList=" + this.d + Separators.RPAREN;
    }
}
