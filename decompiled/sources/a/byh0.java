package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class byh0 implements hyh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3418a;

    public final boolean equals(Object obj) {
        if (obj instanceof byh0) {
            return this.f3418a.equals(((byh0) obj).f3418a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3418a.hashCode();
    }

    public final String toString() {
        return hne.o("FirstPlayerCards(value=", Separators.RPAREN, this.f3418a);
    }
}
