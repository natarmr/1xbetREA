package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class sv60 extends uv60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nrv f32852a;
    public final ArrayList b;

    public sv60(nrv nrvVar, ArrayList arrayList) {
        this.f32852a = nrvVar;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv60)) {
            return false;
        }
        sv60 sv60Var = (sv60) obj;
        return this.f32852a.equals(sv60Var.f32852a) && this.b.equals(sv60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((this.f32852a.hashCode() * 31) + 1454178367) * 31);
    }

    public final String toString() {
        return "MultipleItem(headerModel=" + this.f32852a + ", categoryId=160291, uiModelWrapperList=" + this.b + Separators.RPAREN;
    }
}
