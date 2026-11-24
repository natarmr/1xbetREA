package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class sok0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32547a;
    public final int b;

    public sok0(ArrayList arrayList, int i) {
        this.f32547a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sok0)) {
            return false;
        }
        sok0 sok0Var = (sok0) obj;
        return this.f32547a.equals(sok0Var.f32547a) && this.b == sok0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f32547a.hashCode() * 31);
    }

    public final String toString() {
        return "SpecialEventItemsUiItem(items=" + this.f32547a + ", rowCount=" + this.b + Separators.RPAREN;
    }
}
