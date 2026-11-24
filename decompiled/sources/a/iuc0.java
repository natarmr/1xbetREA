package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class iuc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f15390a;
    public final o0x b;
    public final Function2 c;
    public final Function1 d;

    public iuc0(n0x n0xVar, o0x o0xVar, Function2 function2, Function1 function1) {
        this.f15390a = n0xVar;
        this.b = o0xVar;
        this.c = function2;
        this.d = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuc0)) {
            return false;
        }
        iuc0 iuc0Var = (iuc0) obj;
        return this.f15390a.equals(iuc0Var.f15390a) && Intrinsics.d(this.b, iuc0Var.b) && this.c.equals(iuc0Var.c) && this.d.equals(iuc0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f15390a.hashCode() * 31;
        o0x o0xVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "PictureChanged(picture=" + this.f15390a + ", fallbackPicture=" + this.b + ", onLoaded=" + this.c + ", onError=" + this.d + Separators.RPAREN;
    }
}
