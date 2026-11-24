package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class r4c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f29829a;
    public final Function2 b;
    public final Function1 c;

    public r4c0(n0x n0xVar, Function2 function2, Function1 function1) {
        this.f29829a = n0xVar;
        this.b = function2;
        this.c = function1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4c0)) {
            return false;
        }
        r4c0 r4c0Var = (r4c0) obj;
        return this.f29829a.equals(r4c0Var.f29829a) && this.b.equals(r4c0Var.b) && this.c.equals(r4c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f29829a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PictureChanged(picture=" + this.f29829a + ", onLoaded=" + this.b + ", onError=" + this.c + Separators.RPAREN;
    }
}
