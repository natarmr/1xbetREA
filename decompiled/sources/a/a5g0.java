package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class a5g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f270a;

    public a5g0(ArrayList arrayList) {
        this.f270a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a5g0) && this.f270a.equals(((a5g0) obj).f270a);
    }

    public final int hashCode() {
        return this.f270a.hashCode();
    }

    public final String toString() {
        return hne.o("ResultStateModel(items=", Separators.RPAREN, this.f270a);
    }
}
