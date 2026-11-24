package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class xm60 implements en60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41108a;

    public xm60(ArrayList arrayList) {
        this.f41108a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xm60) && this.f41108a.equals(((xm60) obj).f41108a);
    }

    public final int hashCode() {
        return this.f41108a.hashCode();
    }

    public final String toString() {
        return hne.o("UpdateFavoriteList(ids=", Separators.RPAREN, this.f41108a);
    }
}
