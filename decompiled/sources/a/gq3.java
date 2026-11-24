package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gq3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public p7m0 j;
    public boolean k;
    public final /* synthetic */ kq3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq3(kq3 kq3Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = kq3Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kq3 kq3Var = this.l;
        switch (b) {
            case 0:
                return new gq3(kq3Var, yjeVar, (byte) 0);
            default:
                return new gq3(kq3Var, yjeVar, (byte) 1);
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
        return ((gq3) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        p7m0 p7m0Var;
        p7m0 p7m0Var2;
        byte b = this.i;
        kq3 kq3Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    p7m0 p7m0Var3 = kq3Var.x;
                    t0u t0uVar = kq3Var.s;
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
                uq3 uq3Var = new uq3(new cr3((String) obj, kq3Var.q.a()));
                p7m0Var.getClass();
                p7m0Var.o(null, uq3Var);
                p7m0 p7m0Var4 = kq3Var.w;
                sp3 sp3Var = sp3.c;
                p7m0Var4.getClass();
                p7m0Var4.o(null, sp3Var);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    p7m0 p7m0Var5 = kq3Var.x;
                    t0u t0uVar2 = kq3Var.s;
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
                vq3 vq3Var = new vq3(new cr3((String) obj, kq3Var.q.a()));
                p7m0Var2.getClass();
                p7m0Var2.o(null, vq3Var);
                p7m0 p7m0Var6 = kq3Var.w;
                sp3 sp3Var2 = sp3.d;
                p7m0Var6.getClass();
                p7m0Var6.o(null, sp3Var2);
                return Unit.f46060a;
        }
    }
}
