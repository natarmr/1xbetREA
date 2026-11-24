package a;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class goj0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hoj0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ goj0(hoj0 hoj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hoj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hoj0 hoj0Var = this.k;
        switch (b) {
            case 0:
                return new goj0(hoj0Var, yjeVar, (byte) 0);
            case 1:
                return new goj0(hoj0Var, yjeVar, (byte) 1);
            case 2:
                return new goj0(hoj0Var, yjeVar, (byte) 2);
            default:
                goj0 goj0Var = new goj0(hoj0Var, yjeVar, (byte) 3);
                goj0Var.j = ((Boolean) obj).booleanValue();
                return goj0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((goj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((goj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((goj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((goj0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hoj0 hoj0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ieu ieuVar = hoj0Var.b;
                    String str = hoj0Var.h;
                    File file = hoj0Var.i;
                    this.j = true;
                    obj = ieuVar.m(str, file, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                p7m0 p7m0Var = hoj0Var.n;
                gm00 gm00Var = new gm00((File) obj);
                p7m0Var.getClass();
                p7m0Var.o(null, gm00Var);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    e1u e1uVar = hoj0Var.c;
                    File file2 = hoj0Var.i;
                    String str2 = hoj0Var.h;
                    this.j = true;
                    obj = e1uVar.b(file2, str2, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                File file3 = (File) obj;
                if (!file3.exists()) {
                    return Unit.f46060a;
                }
                pzu pzuVar = (pzu) hoj0Var.d.f3330a;
                String strC = q7d0.c((q7d0) pzuVar.d, "BaseChannelId");
                ((us3) pzuVar.c).getClass();
                String strJ0 = sj3.j0(strC, "prod_id_channel_base");
                hoj0Var.e.getClass();
                String strG = nek.g(file3);
                p7m0 p7m0Var2 = hoj0Var.o;
                foj0 foj0Var = new foj0(file3, strG, strJ0);
                hoj0Var.l.a();
                sxg0 sxg0Var = new sxg0(foj0Var);
                p7m0Var2.getClass();
                p7m0Var2.o(null, sxg0Var);
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    e1u e1uVar2 = hoj0Var.c;
                    File file4 = hoj0Var.i;
                    String str3 = hoj0Var.h;
                    this.j = true;
                    obj = e1uVar2.b(file4, str3, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                File file5 = (File) obj;
                if (!file5.exists()) {
                    return Unit.f46060a;
                }
                p7m0 p7m0Var3 = hoj0Var.p;
                hoj0Var.l.a();
                wnj0 wnj0Var = new wnj0(file5);
                p7m0Var3.getClass();
                p7m0Var3.o(null, wnj0Var);
                return Unit.f46060a;
            default:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (!hoj0Var.m && z4) {
                    hoj0Var.w();
                }
                hoj0Var.m = z4;
                return Unit.f46060a;
        }
    }
}
