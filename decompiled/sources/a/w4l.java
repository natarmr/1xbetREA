package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class w4l implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38545a;

    public /* synthetic */ w4l(ArrayList arrayList) {
        this.f38545a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w4l) {
            return this.f38545a.equals(((w4l) obj).f38545a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f38545a.hashCode();
    }

    public final String toString() {
        return hne.o("SelectedHeroes(value=", Separators.RPAREN, this.f38545a);
    }
}
