package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class qwl0 implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29440a;
    public final ArrayList b;

    public qwl0(ArrayList arrayList, ArrayList arrayList2) {
        this.f29440a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwl0)) {
            return false;
        }
        qwl0 qwl0Var = (qwl0) obj;
        return this.f29440a.equals(qwl0Var.f29440a) && this.b.equals(qwl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29440a.hashCode() * 31);
    }

    public final String toString() {
        return "StadiumInfoUiModel(stadiumImageList=" + this.f29440a + ", stadiumInfoList=" + this.b + Separators.RPAREN;
    }
}
