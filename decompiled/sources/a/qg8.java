package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class qg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28669a;
    public final ArrayList b;

    public qg8(String str, ArrayList arrayList) {
        str.getClass();
        this.f28669a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qg8)) {
            return false;
        }
        qg8 qg8Var = (qg8) obj;
        return Intrinsics.d(this.f28669a, qg8Var.f28669a) && this.b.equals(qg8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28669a.hashCode() * 31);
    }

    public final String toString() {
        return "BonusSelectionDefaultUiState(title=" + this.f28669a + ", bonusSelectionUiModelList=" + this.b + Separators.RPAREN;
    }
}
