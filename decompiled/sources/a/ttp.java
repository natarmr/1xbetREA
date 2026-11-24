package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ttp implements utp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f34519a;

    public ttp(a4x a4xVar) {
        a4xVar.getClass();
        this.f34519a = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ttp) && Intrinsics.d(this.f34519a, ((ttp) obj).f34519a);
    }

    public final int hashCode() {
        return this.f34519a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f34519a, "Success(fightStatisticItemUiModelsList=", Separators.RPAREN);
    }
}
