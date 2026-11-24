package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zoa extends fpa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44710a;

    public zoa(ArrayList arrayList) {
        this.f44710a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zoa) && this.f44710a.equals(((zoa) obj).f44710a);
    }

    public final int hashCode() {
        return this.f44710a.hashCode();
    }

    public final String toString() {
        return hne.o("PeriodScoreChange(periodScoreUiModelList=", Separators.RPAREN, this.f44710a);
    }
}
