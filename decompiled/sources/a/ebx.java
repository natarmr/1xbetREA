package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ebx extends fbx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7540a;

    public ebx(boolean z) {
        this.f7540a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ebx) && this.f7540a == ((ebx) obj).f7540a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7540a);
    }

    public final String toString() {
        return defpackage.c.d("LoadedState(loaded=", Separators.RPAREN, this.f7540a);
    }
}
