package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class heh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12924a;

    public final boolean equals(Object obj) {
        if (obj instanceof heh0) {
            return this.f12924a.equals(((heh0) obj).f12924a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12924a.hashCode();
    }

    public final String toString() {
        return hne.o("PlayerTwoShots(value=", Separators.RPAREN, this.f12924a);
    }
}
