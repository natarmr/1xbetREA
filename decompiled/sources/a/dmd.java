package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class dmd extends ia80 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator[] f6317a;

    public dmd(sf9 sf9Var, sf9 sf9Var2) {
        this.f6317a = new Comparator[]{sf9Var, sf9Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.f6317a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dmd) {
            return Arrays.equals(this.f6317a, ((dmd) obj).f6317a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6317a);
    }

    public final String toString() {
        return axq.n(new StringBuilder("Ordering.compound("), Arrays.toString(this.f6317a), Separators.RPAREN);
    }
}
