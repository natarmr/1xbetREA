package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sep0 implements vep0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32084a;

    public final boolean equals(Object obj) {
        if (obj instanceof sep0) {
            return this.f32084a.equals(((sep0) obj).f32084a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32084a.hashCode();
    }

    public final String toString() {
        return hne.o("KillsStatistics(value=", Separators.RPAREN, this.f32084a);
    }
}
