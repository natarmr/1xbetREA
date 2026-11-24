package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class sj0 implements jk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32285a;

    public sj0(ArrayList arrayList) {
        this.f32285a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj0) && this.f32285a.equals(((sj0) obj).f32285a);
    }

    public final int hashCode() {
        return this.f32285a.hashCode();
    }

    public final String toString() {
        return hne.o("UpdateVirtualGameList(list=", Separators.RPAREN, this.f32285a);
    }
}
