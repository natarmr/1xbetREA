package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o0a0 implements p0a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24413a;
    public final fyl b;
    public final iva c;

    public o0a0(String str, fyl fylVar, iva ivaVar) {
        str.getClass();
        this.f24413a = str;
        this.b = fylVar;
        this.c = ivaVar;
    }

    @Override // a.p0a0
    public final String a() {
        return this.f24413a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0a0)) {
            return false;
        }
        o0a0 o0a0Var = (o0a0) obj;
        return Intrinsics.d(this.f24413a, o0a0Var.f24413a) && this.b.equals(o0a0Var.b) && this.c.equals(o0a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f24413a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Success(screenTitle=" + this.f24413a + ", chips=" + this.b + ", data=" + this.c + Separators.RPAREN;
    }
}
