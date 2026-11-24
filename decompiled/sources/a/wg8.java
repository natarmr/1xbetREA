package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39101a;
    public final String b;
    public final ArrayList c;

    public wg8(String str, String str2, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.f39101a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg8)) {
            return false;
        }
        wg8 wg8Var = (wg8) obj;
        return Intrinsics.d(this.f39101a, wg8Var.f39101a) && Intrinsics.d(this.b, wg8Var.b) && this.c.equals(wg8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f39101a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.n(b1j.n("BonusSelectionVisualUiState(title=", this.f39101a, ", description=", this.b, ", bonusSelectionUiModelList="), this.c, Separators.RPAREN);
    }
}
