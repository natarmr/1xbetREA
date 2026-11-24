package a;

import androidx.media3.common.Timeline$Window;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g930 extends pwq {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public g930(bmq0 bmq0Var, Object obj, Object obj2) {
        super(bmq0Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // a.pwq, a.bmq0
    public final int b(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // a.pwq, a.bmq0
    public final amq0 f(int i, amq0 amq0Var, boolean z) {
        this.b.f(i, amq0Var, z);
        if (Objects.equals(amq0Var.b, this.d) && z) {
            amq0Var.b = e;
        }
        return amq0Var;
    }

    @Override // a.pwq, a.bmq0
    public final Object l(int i) {
        Object objL = this.b.l(i);
        return Objects.equals(objL, this.d) ? e : objL;
    }

    @Override // a.pwq, a.bmq0
    public final Timeline$Window m(int i, Timeline$Window timeline$Window, long j) {
        this.b.m(i, timeline$Window, j);
        if (Objects.equals(timeline$Window.f45385a, this.c)) {
            timeline$Window.f45385a = Timeline$Window.p;
        }
        return timeline$Window;
    }
}
