package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jfh implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16425a;

    public /* synthetic */ jfh(ArrayList arrayList) {
        this.f16425a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jfh) {
            return this.f16425a.equals(((jfh) obj).f16425a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16425a.hashCode();
    }

    public final String toString() {
        return hne.o("Statistics(value=", Separators.RPAREN, this.f16425a);
    }
}
