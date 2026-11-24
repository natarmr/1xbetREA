package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b3m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1914a;
    public final String b;

    public b3m(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f1914a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3m)) {
            return false;
        }
        b3m b3mVar = (b3m) obj;
        return Intrinsics.d(this.f1914a, b3mVar.f1914a) && Intrinsics.d(this.b, b3mVar.b);
    }

    public final int hashCode() {
        return ua80.b(this.f1914a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b1j.k("DsCyberBiographyCellUiModel(subtitle=", this.f1914a, ", title=", this.b, ", picture=null)");
    }
}
