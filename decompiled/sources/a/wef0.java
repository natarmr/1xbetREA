package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wef0 implements xef0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39016a;
    public final String b;

    public wef0(String str, String str2) {
        str.getClass();
        this.f39016a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wef0)) {
            return false;
        }
        wef0 wef0Var = (wef0) obj;
        return Intrinsics.d(this.f39016a, wef0Var.f39016a) && this.b.equals(wef0Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ua80.b(this.f39016a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b1j.k("TimerMessage(message=", this.f39016a, ", timerText=", this.b, ", timerVisible=true)");
    }
}
