package a;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class n160 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22734a;
    public boolean b;
    public final /* synthetic */ Object c;

    public n160(Function1 function1, boolean z) {
        this.f22734a = (byte) 0;
        this.b = z;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        byte b = this.f22734a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                if (!this.b) {
                    ((Function1) obj2).invoke(new yy50(bemVar));
                }
                break;
            default:
                h7d h7dVar = (h7d) obj;
                gl80 gl80Var = (gl80) obj2;
                h7dVar.getClass();
                if (this.b) {
                    this.b = false;
                } else if (h7dVar.d.f6438a instanceof bp00) {
                    if (gl80Var.c == 3 && !gl80Var.d) {
                        gl80Var.x(1);
                    }
                    f04 f04Var = gl80Var.e;
                    f04Var.getClass();
                    CopyOnWriteArrayList copyOnWriteArrayList = f04Var.m;
                    copyOnWriteArrayList.remove(this);
                    if (copyOnWriteArrayList.isEmpty() && (function1 = (Function1) f04Var.l.get()) != null) {
                        d04 d04Var = f04Var.h;
                        d04Var.getClass();
                        gxu gxuVar = d04Var.e;
                        gxuVar.getClass();
                        ((CopyOnWriteArrayList) ((rx3) gxuVar.f12096a).b).remove(function1);
                    }
                }
                break;
        }
        return Unit.f46060a;
    }

    public n160(gl80 gl80Var) {
        this.f22734a = (byte) 1;
        this.c = gl80Var;
        this.b = true;
    }
}
