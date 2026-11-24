package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class joy implements ooy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16873a;

    public final boolean equals(Object obj) {
        if (obj instanceof joy) {
            return this.f16873a.equals(((joy) obj).f16873a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16873a.hashCode();
    }

    public final String toString() {
        return hne.o("Cards(value=", Separators.RPAREN, this.f16873a);
    }
}
