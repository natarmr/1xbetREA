package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class z64 implements l74 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43846a;

    public z64(String str) {
        this.f43846a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z64) && this.f43846a.equals(((z64) obj).f43846a);
    }

    public final int hashCode() {
        return this.f43846a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnConfirmExitSessionDialogClick(id=", this.f43846a, Separators.RPAREN);
    }
}
