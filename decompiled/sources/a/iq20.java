package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class iq20 implements jq20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f15188a;

    public final boolean equals(Object obj) {
        if (obj instanceof iq20) {
            return this.f15188a.equals(((iq20) obj).f15188a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15188a.hashCode();
    }

    public final String toString() {
        return hne.o("RoundList(value=", Separators.RPAREN, this.f15188a);
    }
}
