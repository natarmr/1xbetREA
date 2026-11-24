package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bl f44504a;
    public final al b;

    public zk(bl blVar, al alVar) {
        this.f44504a = blVar;
        this.b = alVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk)) {
            return false;
        }
        zk zkVar = (zk) obj;
        return this.f44504a == zkVar.f44504a && this.b == zkVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44504a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivationModel(type=" + this.f44504a + ", status=" + this.b + Separators.RPAREN;
    }
}
