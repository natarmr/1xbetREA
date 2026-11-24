package a;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class im30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15007a;
    public final ArrayList b;

    public im30(String str, ArrayList arrayList) {
        str.getClass();
        this.f15007a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im30)) {
            return false;
        }
        im30 im30Var = (im30) obj;
        return Intrinsics.d(this.f15007a, im30Var.f15007a) && this.b.equals(im30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15007a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaCodecInfo(name=" + this.f15007a + ", capabilities=" + this.b + ')';
    }
}
