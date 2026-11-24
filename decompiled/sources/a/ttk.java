package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ttk implements vtk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f34512a;

    public ttk(ArrayList arrayList) {
        this.f34512a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ttk) && this.f34512a.equals(((ttk) obj).f34512a);
    }

    public final int hashCode() {
        return this.f34512a.hashCode();
    }

    public final String toString() {
        return hne.o("ItemList(itemList=", Separators.RPAREN, this.f34512a);
    }
}
