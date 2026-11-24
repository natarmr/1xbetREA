package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class zpy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f44783a;

    public zpy(sgy sgyVar) {
        sgyVar.getClass();
        this.f44783a = sgyVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zpy) {
            return Intrinsics.d(this.f44783a, ((zpy) obj).f44783a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44783a.hashCode();
    }

    public final String toString() {
        return azw.G(this.f44783a).getName();
    }
}
