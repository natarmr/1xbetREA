package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class e5c0 implements g5c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f7228a;

    public final boolean equals(Object obj) {
        if (obj instanceof e5c0) {
            return this.f7228a.equals(((e5c0) obj).f7228a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7228a.hashCode();
    }

    public final String toString() {
        return hne.o("PromotionsList(value=", Separators.RPAREN, this.f7228a);
    }
}
