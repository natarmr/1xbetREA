package a;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ocj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f25029a;

    public ocj() {
        this.f25029a = q7m0.a(h7t0.b);
    }

    public g7m0 a() {
        return (g7m0) this.f25029a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    public void b(g7m0 g7m0Var) {
        p7m0 p7m0Var;
        Object value;
        g7m0 g7m0Var2;
        g7m0Var.getClass();
        do {
            p7m0Var = this.f25029a;
            value = p7m0Var.getValue();
            g7m0Var2 = (g7m0) value;
            if ((g7m0Var2 instanceof jae0) || Intrinsics.d(g7m0Var2, h7t0.b)) {
                g7m0Var2 = g7m0Var;
            } else if (g7m0Var2 instanceof naj) {
                if (g7m0Var.f10823a > ((naj) g7m0Var2).f10823a) {
                    g7m0Var2 = g7m0Var;
                }
            } else if (!(g7m0Var2 instanceof hbq)) {
                if (g7m0Var2 instanceof l460) {
                    jf4.n("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
        } while (!p7m0Var.m(value, g7m0Var2));
    }

    public void c(Function1 function1) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.f25029a;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, function1.invoke(value)));
    }

    public ocj(Object obj) {
        this.f25029a = q7m0.a(obj);
    }
}
