package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ugl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35630a;
    public final vgl b;

    public ugl(String str, vgl vglVar) {
        str.getClass();
        vglVar.getClass();
        this.f35630a = str;
        this.b = vglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugl)) {
            return false;
        }
        ugl uglVar = (ugl) obj;
        return Intrinsics.d(this.f35630a, uglVar.f35630a) && Intrinsics.d(this.b, uglVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35630a.hashCode() * 31);
    }

    public final String toString() {
        return "DragonsGoldScreenUiModel(currentCurrency=" + this.f35630a + ", gameStateModel=" + this.b + Separators.RPAREN;
    }
}
