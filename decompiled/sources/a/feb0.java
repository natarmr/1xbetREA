package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class feb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9398a;
    public final List b;

    public feb0(ArrayList arrayList, List list) {
        this.f9398a = arrayList;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof feb0)) {
            return false;
        }
        feb0 feb0Var = (feb0) obj;
        return this.f9398a.equals(feb0Var.f9398a) && this.b.equals(feb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9398a.hashCode() * 31);
    }

    public final String toString() {
        return "PopularOneXGamesCategoriesStateModel(categories=" + this.f9398a + ", spotlight=" + this.b + Separators.RPAREN;
    }
}
