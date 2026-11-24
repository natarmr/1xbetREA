package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tk7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34080a;
    public final String b;

    public tk7(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f34080a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk7)) {
            return false;
        }
        tk7 tk7Var = (tk7) obj;
        return Intrinsics.d(this.f34080a, tk7Var.f34080a) && Intrinsics.d(this.b, tk7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34080a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Copy(betIdNumber=", this.f34080a, ", copy=", this.b, Separators.RPAREN);
    }
}
