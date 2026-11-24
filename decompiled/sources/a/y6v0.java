package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class y6v0 implements a7v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42120a;

    public final boolean equals(Object obj) {
        if (obj instanceof y6v0) {
            return this.f42120a.equals(((y6v0) obj).f42120a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42120a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowDays(daysInfo=", Separators.RPAREN, this.f42120a);
    }
}
