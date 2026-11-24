package a;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class xo implements ger, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41192a;
    public final Class b;
    public final String c;
    public final String d;
    public final boolean e;
    public final byte f;
    public final int g;

    /* JADX WARN: Multi-variable type inference failed */
    public xo(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.f41192a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.e = (i2 & 1) == 1;
        this.f = i;
        this.g = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo)) {
            return false;
        }
        xo xoVar = (xo) obj;
        return this.e == xoVar.e && this.f == xoVar.f && this.g == xoVar.g && Intrinsics.d(this.f41192a, xoVar.f41192a) && Intrinsics.d(this.b, xoVar.b) && this.c.equals(xoVar.c) && this.d.equals(xoVar.d);
    }

    @Override // a.ger
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        Object obj = this.f41192a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((ua80.b(ua80.b((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.g;
    }

    public final String toString() {
        return sre0.f32672a.i(this);
    }

    public xo(int i, Class cls, String str, String str2, int i2) {
        this(i, op9.NO_RECEIVER, cls, str, str2, i2);
    }
}
