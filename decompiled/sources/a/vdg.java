package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class vdg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f37230a;
    public final ArrayList b;

    public vdg(ArrayList arrayList, ArrayList arrayList2) {
        this.f37230a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vdg)) {
            return false;
        }
        vdg vdgVar = (vdg) obj;
        return this.f37230a.equals(vdgVar.f37230a) && this.b.equals(vdgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f37230a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberChampResultsByDateModel(calendarDates=" + this.f37230a + ", champModels=" + this.b + Separators.RPAREN;
    }
}
