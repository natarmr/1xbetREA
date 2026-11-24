package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class puf0 implements quf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f27615a;

    public puf0(ArrayList arrayList) {
        this.f27615a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof puf0) && this.f27615a.equals(((puf0) obj).f27615a);
    }

    public final int hashCode() {
        return this.f27615a.hashCode();
    }

    public final String toString() {
        return hne.o("Success(list=", Separators.RPAREN, this.f27615a);
    }
}
