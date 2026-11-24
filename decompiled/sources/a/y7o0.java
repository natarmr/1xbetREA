package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y7o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42163a;

    public y7o0(ArrayList arrayList) {
        this.f42163a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7o0) && this.f42163a.equals(((y7o0) obj).f42163a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "SEKIRO_TITLE_KEY";
    }

    public final int hashCode() {
        return this.f42163a.hashCode() + 1787310426;
    }

    public final String toString() {
        return hne.o("SyntheticSekiroHeaderUiModel(key=SEKIRO_TITLE_KEY, rounds=", Separators.RPAREN, this.f42163a);
    }
}
