package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class qd0 implements ud0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f28509a;

    public qd0(ArrayList arrayList) {
        this.f28509a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd0) && this.f28509a.equals(((qd0) obj).f28509a);
    }

    public final int hashCode() {
        return this.f28509a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(brands=", Separators.RPAREN, this.f28509a);
    }
}
