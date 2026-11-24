package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w8g implements y8g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f38720a;
    public final int b;

    public w8g(int i, List list) {
        list.getClass();
        this.f38720a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8g)) {
            return false;
        }
        w8g w8gVar = (w8g) obj;
        return Intrinsics.d(this.f38720a, w8gVar.f38720a) && this.b == w8gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f38720a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentState(dates=" + this.f38720a + ", selectedPosition=" + this.b + Separators.RPAREN;
    }
}
