package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ryq0 implements uyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f31326a;

    public ryq0(ArrayList arrayList) {
        this.f31326a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ryq0) && this.f31326a.equals(((ryq0) obj).f31326a);
    }

    public final int hashCode() {
        return this.f31326a.hashCode();
    }

    public final String toString() {
        return hne.o("UpdateBannerTapeList(list=", Separators.RPAREN, this.f31326a);
    }
}
