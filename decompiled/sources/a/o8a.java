package a;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class o8a extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public tu9 j;
    public byte k;
    public final /* synthetic */ tu9 l;
    public final /* synthetic */ g9a m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o8a(tu9 tu9Var, yje yjeVar, g9a g9aVar, int i, int i2, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = tu9Var;
        this.m = g9aVar;
        this.n = i;
        this.o = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new o8a(this.l, yjeVar, this.m, this.n, this.o, (byte) 0);
            default:
                return new o8a(this.l, yjeVar, this.m, this.n, this.o, (byte) 1);
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
        return ((o8a) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        tu9 tu9Var;
        o8a o8aVar;
        tu9 tu9Var2;
        byte b = this.i;
        tu9 tu9Var3 = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                byte b2 = this.k;
                if (b2 == 0) {
                    z1x.P(obj);
                    List listC = kotlin.collections.a.c(j8a.c);
                    this.j = tu9Var3;
                    this.k = (byte) 1;
                    obj = this.m.h(listC, this.n, this.o, 1, null, this);
                    if (obj != wneVar) {
                    }
                    return wneVar;
                }
                if (b2 == 1) {
                    tu9Var3 = this.j;
                    z1x.P(obj);
                } else {
                    if (b2 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tu9Var = this.j;
                    z1x.P(obj);
                }
                tu9Var.b(null);
                return Unit.f46060a;
                this.j = tu9Var3;
                this.k = (byte) 2;
                if (qjj.T((Collection) obj, this) != wneVar) {
                    tu9Var = tu9Var3;
                    tu9Var.b(null);
                    return Unit.f46060a;
                }
                return wneVar;
            default:
                wne wneVar2 = wne.f39444a;
                byte b3 = this.k;
                if (b3 == 0) {
                    z1x.P(obj);
                    List listC2 = kotlin.collections.a.c(j8a.f16073a);
                    this.j = tu9Var3;
                    this.k = (byte) 1;
                    o8aVar = this;
                    obj = this.m.h(listC2, this.n, this.o, 1, null, o8aVar);
                    if (obj != wneVar2) {
                    }
                    return wneVar2;
                }
                if (b3 == 1) {
                    tu9Var3 = this.j;
                    z1x.P(obj);
                    o8aVar = this;
                } else {
                    if (b3 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tu9Var2 = this.j;
                    z1x.P(obj);
                }
                tu9Var2.b(null);
                return Unit.f46060a;
                o8aVar.j = tu9Var3;
                o8aVar.k = (byte) 2;
                if (qjj.T((Collection) obj, o8aVar) != wneVar2) {
                    tu9Var2 = tu9Var3;
                    tu9Var2.b(null);
                    return Unit.f46060a;
                }
                return wneVar2;
        }
    }
}
