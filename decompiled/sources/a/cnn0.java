package a;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La/cnn0;", "La/um40;", "La/jnn0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class cnn0 extends um40 {
    public final Object b;
    public final Object c;
    public final PointerInputEventHandler d;

    public cnn0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.b = obj;
        this.c = obj2;
        this.d = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnn0)) {
            return false;
        }
        cnn0 cnn0Var = (cnn0) obj;
        return Intrinsics.d(this.b, cnn0Var.b) && Intrinsics.d(this.c, cnn0Var.c) && this.d == cnn0Var.d;
    }

    @Override // a.um40
    public final lm40 f() {
        return new jnn0(this.b, this.c, this.d);
    }

    @Override // a.um40
    public final void h(lm40 lm40Var) {
        jnn0 jnn0Var = (jnn0) lm40Var;
        Object obj = jnn0Var.o;
        Object obj2 = this.b;
        boolean z = !Intrinsics.d(obj, obj2);
        jnn0Var.o = obj2;
        Object obj3 = jnn0Var.p;
        Object obj4 = this.c;
        if (!Intrinsics.d(obj3, obj4)) {
            z = true;
        }
        jnn0Var.p = obj4;
        Class<?> cls = jnn0Var.q.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.d;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            jnn0Var.b1();
        }
        jnn0Var.q = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.c;
        return this.d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
