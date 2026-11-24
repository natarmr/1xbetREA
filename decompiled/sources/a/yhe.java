package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class yhe implements hie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f42634a;

    public yhe(ArrayList arrayList) {
        this.f42634a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yhe) && this.f42634a.equals(((yhe) obj).f42634a);
    }

    public final int hashCode() {
        return this.f42634a.hashCode();
    }

    public final String toString() {
        return hne.o("Success(liveGames=", Separators.RPAREN, this.f42634a);
    }
}
