package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class rzv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31380a;
    public final boolean b;

    public rzv(ArrayList arrayList, boolean z) {
        this.f31380a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rzv)) {
            return false;
        }
        rzv rzvVar = (rzv) obj;
        return this.f31380a.equals(rzvVar.f31380a) && this.b == rzvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f31380a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryContentModel(items=" + this.f31380a + ", isAll=" + this.b + Separators.RPAREN;
    }
}
