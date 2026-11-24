package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class zfl extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public p7m0 j;
    public boolean k;
    public final /* synthetic */ cgl l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zfl(cgl cglVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = cglVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cgl cglVar = this.l;
        switch (b) {
            case 0:
                return new zfl(cglVar, yjeVar, (byte) 0);
            default:
                return new zfl(cglVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((zfl) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        p7m0 p7m0Var;
        p7m0 p7m0Var2;
        byte b = this.i;
        cgl cglVar = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    p7m0 p7m0Var3 = cglVar.y;
                    t0u t0uVar = cglVar.q;
                    this.j = p7m0Var3;
                    this.k = true;
                    Object objA = t0uVar.a(this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                    obj = objA;
                    p7m0Var = p7m0Var3;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7m0Var = this.j;
                    z1x.P(obj);
                }
                mgl mglVar = new mgl(new ugl((String) obj, cglVar.r.i()));
                p7m0Var.getClass();
                p7m0Var.o(null, mglVar);
                p7m0 p7m0Var4 = cglVar.x;
                lfl lflVar = lfl.c;
                p7m0Var4.getClass();
                p7m0Var4.o(null, lflVar);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    p7m0 p7m0Var5 = cglVar.y;
                    t0u t0uVar2 = cglVar.q;
                    this.j = p7m0Var5;
                    this.k = true;
                    Object objA2 = t0uVar2.a(this);
                    if (objA2 == wneVar2) {
                        return wneVar2;
                    }
                    obj = objA2;
                    p7m0Var2 = p7m0Var5;
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p7m0Var2 = this.j;
                    z1x.P(obj);
                }
                ngl nglVar = new ngl(new ugl((String) obj, cglVar.r.i()));
                p7m0Var2.getClass();
                p7m0Var2.o(null, nglVar);
                p7m0 p7m0Var6 = cglVar.x;
                lfl lflVar2 = lfl.d;
                p7m0Var6.getClass();
                p7m0Var6.o(null, lflVar2);
                return Unit.f46060a;
        }
    }
}
