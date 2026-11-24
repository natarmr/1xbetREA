package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class bi0 implements di0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f2634a;

    public bi0(ArrayList arrayList) {
        this.f2634a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bi0) && this.f2634a.equals(((bi0) obj).f2634a);
    }

    public final int hashCode() {
        return this.f2634a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(items=", Separators.RPAREN, this.f2634a);
    }
}
