package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class rw50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31202a;

    public rw50(ArrayList arrayList) {
        this.f31202a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rw50) && this.f31202a.equals(((rw50) obj).f31202a);
    }

    public final int hashCode() {
        return this.f31202a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(list=", Separators.RPAREN, this.f31202a);
    }
}
