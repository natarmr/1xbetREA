package a;

import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class z2r0 implements s2r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v7i f43685a;
    public final j3c b;
    public final pru c;
    public final jtj d;
    public final uyn e;
    public final ocl f;
    public final reu g;
    public final jc60 h;
    public final iqt i;

    public z2r0(v7i v7iVar, j3c j3cVar, pru pruVar, jtj jtjVar, uyn uynVar, ocl oclVar, reu reuVar, jc60 jc60Var, iqt iqtVar) {
        this.f43685a = v7iVar;
        this.b = j3cVar;
        this.c = pruVar;
        this.d = jtjVar;
        this.e = uynVar;
        this.f = oclVar;
        this.g = reuVar;
        this.h = jc60Var;
        this.i = iqtVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zje zjeVar) {
        t2r0 t2r0Var;
        int iIntValue;
        if (zjeVar instanceof t2r0) {
            t2r0Var = (t2r0) zjeVar;
            int i = t2r0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t2r0Var.k = i - Integer.MIN_VALUE;
            } else {
                t2r0Var = new t2r0(this, zjeVar);
            }
        } else {
            t2r0Var = new t2r0(this, zjeVar);
        }
        Object objA = t2r0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = t2r0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            iIntValue = 0;
            if (this.i.f15225a.a()) {
                t2r0Var.k = 1;
                objA = ((b3c0) this.g.b).a(false, t2r0Var);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Integer(iIntValue);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
        iIntValue = intOrNull != null ? intOrNull.intValue() : 225;
        return new Integer(iIntValue);
    }

    public final a1g b(sip sipVar, boolean z, boolean z2) {
        lie0 lie0Var = new lie0();
        lie0Var.f20100a = System.currentTimeMillis();
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = z2;
        yje yjeVar = null;
        utb utbVarC = aoq.c(aoq.c(((uzc) this.f.f25032a).c(), new fe0(yjeVar, (Object) sipVar, (Object) this, (byte) 20)), new u2r0(null, this, sipVar, lie0Var, hie0Var, z));
        nop0 nop0Var = new nop0((Object) this, (byte) 24);
        return bkb.i0(new vsg0(new wmq((gmq) utbVarC, yjeVar, (Function1) nop0Var, new kie0(), (byte) 6)), "HandleCyberPopularFeedResult", 3, 3L, null, null, nop0Var, 24);
    }
}
