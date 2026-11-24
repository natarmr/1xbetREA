package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class jpg0 implements mpg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16899a;

    public final boolean equals(Object obj) {
        if (obj instanceof jpg0) {
            return this.f16899a.equals(((jpg0) obj).f16899a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16899a.hashCode();
    }

    public final String toString() {
        return hne.o("SecondPlayerNumberParams(value=", Separators.RPAREN, this.f16899a);
    }
}
