package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class qa70 implements wb70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28382a;

    public qa70(boolean z) {
        this.f28382a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qa70) && this.f28382a == ((qa70) obj).f28382a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28382a);
    }

    public final String toString() {
        return defpackage.c.d("EnableDemoDialogExitButton(enable=", Separators.RPAREN, this.f28382a);
    }
}
