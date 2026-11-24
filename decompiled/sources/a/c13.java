package a;

import android.view.View;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class c13 implements vne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3554a;
    public final o8q0 b;
    public final vne c;
    public final AtomicReference d = new AtomicReference(null);

    public c13(View view, o8q0 o8q0Var, vne vneVar) {
        this.f3554a = view;
        this.b = o8q0Var;
        this.c = vneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(ejz ejzVar, zje zjeVar) {
        b13 b13Var;
        if (zjeVar instanceof b13) {
            b13Var = (b13) zjeVar;
            int i = b13Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                b13Var.k = i - Integer.MIN_VALUE;
            } else {
                b13Var = new b13(this, zjeVar);
            }
        } else {
            b13Var = new b13(this, zjeVar);
        }
        Object obj = b13Var.i;
        wne wneVar = wne.f39444a;
        int i2 = b13Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            df1 df1Var = new df1(ejzVar, this, (byte) 23);
            yje yjeVar = null;
            y32 y32Var = new y32(this, yjeVar, (byte) 8);
            b13Var.k = 1;
            if (d5c.J(b13Var, new pnd0((byte) 11, yjeVar, this.d, df1Var, y32Var)) == wneVar) {
                return;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return;
            }
            z1x.P(obj);
        }
        csj.b();
    }

    @Override // a.vne
    public final CoroutineContext getCoroutineContext() {
        return this.c.getCoroutineContext();
    }
}
