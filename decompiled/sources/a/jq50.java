package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class jq50 implements mq50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16934a;

    public jq50(ArrayList arrayList) {
        this.f16934a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jq50) && this.f16934a.equals(((jq50) obj).f16934a);
    }

    public final int hashCode() {
        return this.f16934a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(data=", Separators.RPAREN, this.f16934a);
    }
}
