package a;

import android.content.Context;
import android.view.View;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class cp extends xhe0 {
    public Function0 A;
    public Function0 B;
    public final yfu0 u;
    public Object v;
    public final Context w;
    public Function1 x;
    public Function0 y;
    public Function0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public cp(yfu0 yfu0Var) {
        View root = yfu0Var.getRoot();
        root.getClass();
        yfu0Var.getClass();
        super(root);
        this.u = yfu0Var;
        this.v = ujn.b;
        Context context = root.getContext();
        context.getClass();
        this.w = context;
    }

    public final void t(Function1 function1) {
        if (this.x == null) {
            this.x = function1;
        } else {
            jf4.n("bind { ... } is already defined. Only one bind { ... } is allowed.");
        }
    }

    public final Object u() {
        Object obj = this.v;
        if (obj != ujn.b) {
            return obj;
        }
        jf4.o("Item has not been set yet. That is an internal issue. Please report at https://github.com/sockeqwe/AdapterDelegates");
        return null;
    }

    public final String v(int i) {
        String string = this.w.getString(i);
        string.getClass();
        return string;
    }

    public final String w(int i, Object... objArr) {
        String string = this.w.getString(i, Arrays.copyOf(objArr, objArr.length));
        string.getClass();
        return string;
    }

    public final void x(Function0 function0) {
        if (this.A == null) {
            this.A = function0;
        } else {
            jf4.n("onViewAttachedToWindow { ... } is already defined. Only one onViewAttachedToWindow { ... } is allowed.");
        }
    }

    public final void y(Function0 function0) {
        if (this.B == null) {
            this.B = function0;
        } else {
            jf4.n("onViewDetachedFromWindow { ... } is already defined. Only one onViewDetachedFromWindow { ... } is allowed.");
        }
    }

    public final void z(Function0 function0) {
        if (this.y == null) {
            this.y = function0;
        } else {
            jf4.n("onViewRecycled { ... } is already defined. Only one onViewRecycled { ... } is allowed.");
        }
    }
}
