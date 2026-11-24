package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t8o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z7o f33520a;
    public final a4x b;

    public t8o(z7o z7oVar, a4x a4xVar) {
        a4xVar.getClass();
        this.f33520a = z7oVar;
        this.b = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8o)) {
            return false;
        }
        t8o t8oVar = (t8o) obj;
        return Intrinsics.d(this.f33520a, t8oVar.f33520a) && Intrinsics.d(this.b, t8oVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33520a.hashCode() * 31);
    }

    public final String toString() {
        return "EsportsWorldCupScreenStateUiModel(contentState=" + this.f33520a + ", itemList=" + this.b + Separators.RPAREN;
    }

    public t8o(y7o y7oVar) {
        this(y7oVar, lak0.c);
    }
}
