package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class geh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11156a;

    public final boolean equals(Object obj) {
        if (obj instanceof geh0) {
            return this.f11156a.equals(((geh0) obj).f11156a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11156a.hashCode();
    }

    public final String toString() {
        return hne.o("PlayerTwoShips(value=", Separators.RPAREN, this.f11156a);
    }
}
