package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class syv implements uyv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f33041a;

    public syv(ArrayList arrayList) {
        this.f33041a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof syv) && this.f33041a.equals(((syv) obj).f33041a);
    }

    public final int hashCode() {
        return this.f33041a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(items=", Separators.RPAREN, this.f33041a);
    }
}
