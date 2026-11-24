package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class dab0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5739a;

    public dab0(ArrayList arrayList) {
        this.f5739a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dab0) && this.f5739a.equals(((dab0) obj).f5739a);
    }

    public final int hashCode() {
        return this.f5739a.hashCode();
    }

    public final String toString() {
        return hne.o("PopularClassicTapeUiModel(gameCollection=", Separators.RPAREN, this.f5739a);
    }
}
