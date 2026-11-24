package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class ayc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1665a;
    public final String b;

    public ayc(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f1665a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayc)) {
            return false;
        }
        ayc aycVar = (ayc) obj;
        return Intrinsics.d(this.f1665a, aycVar.f1665a) && Intrinsics.d(this.b, aycVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1665a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpeningInfo(delimiter=");
        sb.append(this.f1665a);
        sb.append(", info=");
        return axq.m(sb, this.b, ')');
    }
}
