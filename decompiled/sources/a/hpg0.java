package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class hpg0 implements mpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13442a;

    public final boolean equals(Object obj) {
        if (obj instanceof hpg0) {
            return this.f13442a.equals(((hpg0) obj).f13442a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13442a.hashCode();
    }

    public final String toString() {
        return hne.o("FirstPlayerNumberParams(value=", Separators.RPAREN, this.f13442a);
    }
}
