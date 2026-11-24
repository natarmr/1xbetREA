package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class g8o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10875a;

    public g8o0(ArrayList arrayList) {
        this.f10875a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8o0) && this.f10875a.equals(((g8o0) obj).f10875a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "TEKKEN_ROUND_HEADER_KEY";
    }

    public final int hashCode() {
        return this.f10875a.hashCode() - 322585155;
    }

    public final String toString() {
        return hne.o("SyntheticTekkenHeaderUiModel(key=TEKKEN_ROUND_HEADER_KEY, rounds=", Separators.RPAREN, this.f10875a);
    }
}
