package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e870 implements p870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vgr f7360a;

    static {
        ugr ugrVar = vgr.Companion;
    }

    public e870(vgr vgrVar) {
        vgrVar.getClass();
        this.f7360a = vgrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e870) && Intrinsics.d(this.f7360a, ((e870) obj).f7360a);
    }

    public final int hashCode() {
        return this.f7360a.hashCode();
    }

    public final String toString() {
        return "OnSetFreezeAccount(event=" + this.f7360a + Separators.RPAREN;
    }
}
