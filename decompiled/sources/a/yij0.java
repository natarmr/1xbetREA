package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yij0 implements bjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42694a;

    public final boolean equals(Object obj) {
        if (obj instanceof yij0) {
            return this.f42694a.equals(((yij0) obj).f42694a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f42694a.hashCode();
    }

    public final String toString() {
        return hne.o("PlayerCardList(value=", Separators.RPAREN, this.f42694a);
    }
}
