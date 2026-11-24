package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xzn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f41761a;
    public final Function1 b;
    public final Function1 c;
    public final ugd d;

    public xzn(sgy sgyVar, Function1 function1, Function1 function2, ugd ugdVar) {
        this.f41761a = sgyVar;
        this.b = function1;
        this.c = function2;
        this.d = ugdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xzn) {
            xzn xznVar = (xzn) obj;
            return Intrinsics.d(this.f41761a, xznVar.f41761a) && this.b.equals(xznVar.b) && this.c.equals(xznVar.c) && this.d == xznVar.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f41761a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.f41761a + ", clazzContentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + Separators.RPAREN;
    }
}
