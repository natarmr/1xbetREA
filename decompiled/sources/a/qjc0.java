package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class qjc0 implements ujc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f28831a;

    public qjc0(boolean z) {
        this.f28831a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qjc0) && this.f28831a == ((qjc0) obj).f28831a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28831a);
    }

    public final String toString() {
        return defpackage.c.d("RequestErrorDialog(closeGame=", Separators.RPAREN, this.f28831a);
    }
}
