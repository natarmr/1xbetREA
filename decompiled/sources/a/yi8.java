package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yi8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42675a;
    public final nan b;

    public yi8(String str, nan nanVar) {
        str.getClass();
        this.f42675a = str;
        this.b = nanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi8)) {
            return false;
        }
        yi8 yi8Var = (yi8) obj;
        return Intrinsics.d(this.f42675a, yi8Var.f42675a) && this.b.equals(yi8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42675a.hashCode() * 31);
    }

    public final String toString() {
        return "BonusesInfoBottomSheetItemUiModel(id=" + this.f42675a + ", cellUiModel=" + this.b + Separators.RPAREN;
    }
}
