package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fo8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9869a;
    public final String b;
    public final String c;

    public fo8(String str, String str2, String str3) {
        str3.getClass();
        this.f9869a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo8)) {
            return false;
        }
        fo8 fo8Var = (fo8) obj;
        return this.f9869a.equals(fo8Var.f9869a) && this.b.equals(fo8Var.b) && Intrinsics.d(this.c, fo8Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ua80.b(ua80.b(this.f9869a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return axq.n(b1j.n("BottomLaneUiModel(helperTopLabel=", this.f9869a, ", helperBottomLabel=", this.b, ", settingsButtonText="), this.c, ", settingsButtonVisible=true)");
    }
}
