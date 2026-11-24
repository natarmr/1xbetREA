package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mqh implements oqh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f22224a;
    public final a4x b;

    public mqh(a4x a4xVar, a4x a4xVar2) {
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f22224a = a4xVar;
        this.b = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqh)) {
            return false;
        }
        mqh mqhVar = (mqh) obj;
        return Intrinsics.d(this.f22224a, mqhVar.f22224a) && Intrinsics.d(this.b, mqhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22224a.hashCode() * 31);
    }

    public final String toString() {
        return "ComparativeBeatMap(firstOpponentCells=" + this.f22224a + ", secondOpponentCells=" + this.b + Separators.RPAREN;
    }
}
