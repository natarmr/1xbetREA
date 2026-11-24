package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class aeh0 implements ieh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f729a;

    public final boolean equals(Object obj) {
        if (obj instanceof aeh0) {
            return this.f729a.equals(((aeh0) obj).f729a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f729a.hashCode();
    }

    public final String toString() {
        return hne.o("PlayerOneShots(value=", Separators.RPAREN, this.f729a);
    }
}
