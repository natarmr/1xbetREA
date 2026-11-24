package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y6p implements z6p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42109a;

    public y6p(ArrayList arrayList) {
        this.f42109a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y6p) && this.f42109a.equals(((y6p) obj).f42109a);
    }

    public final int hashCode() {
        return this.f42109a.hashCode();
    }

    public final String toString() {
        return hne.o("DismissSelected(selectedList=", Separators.RPAREN, this.f42109a);
    }
}
