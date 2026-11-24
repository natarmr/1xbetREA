package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rn70 extends io70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f30775a;

    public rn70(boolean z) {
        this.f30775a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rn70) && this.f30775a == ((rn70) obj).f30775a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f30775a);
    }

    public final String toString() {
        return defpackage.c.d("AddBetMenu(raiseGame=", Separators.RPAREN, this.f30775a);
    }
}
