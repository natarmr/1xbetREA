package a;

import android.widget.ProgressBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jjc0 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jjc0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    private final Object a(Object obj, Object obj2) {
        omg0 omg0Var = (omg0) obj;
        lmg0 lmg0Var = (lmg0) this.f41192a;
        eke0 eke0Var = lmg0.Y1;
        p6r p6rVarG0 = lmg0Var.G0();
        phf0 phf0Var = lmg0Var.R1;
        ((ProgressBar) p6rVarG0.f.b).setVisibility(0);
        lmg0Var.G0().c.setVisibility(8);
        lmg0Var.W1 = false;
        siq fixedWebView = lmg0Var.G0().g.getFixedWebView();
        if (fixedWebView != null) {
            fixedWebView.setVisibility(0);
        }
        if (omg0Var != null) {
            if (omg0Var instanceof nmg0) {
                String strN = phf0Var.n(lmg0Var, lmg0.Z1[2]);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                lmg0Var.G0().g.d(lmg0.H0(strN), lunVar);
            } else if (omg0Var instanceof mmg0) {
                lmg0Var.G0().g.d(lmg0.H0(phf0Var.n(lmg0Var, lmg0.Z1[2])), ((mmg0) omg0Var).f22036a);
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:416:0x0be8, code lost:
    
        if ((r0 instanceof a.njc0) != false) goto L417;
     */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r29, java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 3212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jjc0.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
