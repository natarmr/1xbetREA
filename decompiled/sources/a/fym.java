package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fym implements hym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10364a;

    public fym(String str) {
        str.getClass();
        this.f10364a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fym) && Intrinsics.d(this.f10364a, ((fym) obj).f10364a);
    }

    public final int hashCode() {
        return this.f10364a.hashCode() * 31;
    }

    public final String toString() {
        return kng0.l("V3(opponentName=", this.f10364a, ", opponentIcon=null)");
    }
}
