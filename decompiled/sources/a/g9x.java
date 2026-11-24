package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g9x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10937a;

    public g9x(String str) {
        str.getClass();
        this.f10937a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g9x) && Intrinsics.d(this.f10937a, ((g9x) obj).f10937a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f10937a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.l("InfoLineUiState(infoText=", this.f10937a, ", isVisible=true)");
    }
}
