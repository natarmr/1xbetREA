package a;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class pw90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f27701a = new zfn(new wm90((byte) 6), (byte) 1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(uiz uizVar, ic1 ic1Var, zje zjeVar) {
        nw90 nw90Var;
        if (zjeVar instanceof nw90) {
            nw90Var = (nw90) zjeVar;
            int i = nw90Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                nw90Var.j = i - Integer.MIN_VALUE;
            } else {
                nw90Var = new nw90(zjeVar);
            }
        } else {
            nw90Var = new nw90(zjeVar);
        }
        Object obj = nw90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nw90Var.j;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return;
            } else {
                z1x.P(obj);
                csj.b();
                return;
            }
        }
        z1x.P(obj);
        if (!uizVar.f20279a.n) {
            jf4.o("establishTextInputSession called from an unattached node");
            return;
        }
        cg80 cg80VarA0 = vcc.a0(uizVar);
        bh90 bh90Var = (bh90) vcc.Z(uizVar).Y;
        bh90Var.getClass();
        if (qbc.V(bh90Var, f27701a) != null) {
            hny.b();
        } else {
            nw90Var.j = 1;
            b(cg80VarA0, ic1Var, nw90Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(cg80 cg80Var, Function2 function2, zje zjeVar) {
        ow90 ow90Var;
        if (zjeVar instanceof ow90) {
            ow90Var = (ow90) zjeVar;
            int i = ow90Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ow90Var.j = i - Integer.MIN_VALUE;
            } else {
                ow90Var = new ow90(zjeVar);
            }
        } else {
            ow90Var = new ow90(zjeVar);
        }
        Object obj = ow90Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ow90Var.j;
        if (i2 == 0) {
            z1x.P(obj);
            ow90Var.j = 1;
            ((AndroidComposeView) cg80Var).K(function2, ow90Var);
        } else if (i2 == 1) {
            z1x.P(obj);
            csj.b();
        } else if (i2 != 2) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
        } else {
            z1x.P(obj);
            csj.b();
        }
    }
}
