package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class lkp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20211a;

    public lkp(ArrayList arrayList) {
        this.f20211a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lkp) && this.f20211a.equals(((lkp) obj).f20211a);
    }

    public final int hashCode() {
        return this.f20211a.hashCode();
    }

    public final String toString() {
        return hne.o("Loaded(items=", Separators.RPAREN, this.f20211a);
    }
}
