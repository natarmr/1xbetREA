package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class yjs0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ zjs0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yjs0(zjs0 zjs0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zjs0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        zjs0 zjs0Var = this.k;
        switch (b) {
            case 0:
                yjs0 yjs0Var = new yjs0(zjs0Var, yjeVar, (byte) 0);
                yjs0Var.j = ((Boolean) obj).booleanValue();
                return yjs0Var;
            default:
                return new yjs0(zjs0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((yjs0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yjs0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        boolean z = false;
        zjs0 zjs0Var = this.k;
        switch (b) {
            case 0:
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((tjs0) zjs0Var.D()).f34065a;
                if (z2 && (((tjs0) zjs0Var.D()).b || ((tjs0) zjs0Var.D()).c)) {
                    z = true;
                }
                if (z3 || z) {
                    int i = zjs0.t;
                    zjs0Var.M();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    x4u x4uVar = zjs0Var.p;
                    String str = zjs0Var.r;
                    this.j = true;
                    obj = x4uVar.b(str, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                List list = (List) obj;
                int i2 = zjs0.t;
                p7m0 p7m0Var = zjs0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, new tjs0(list, false, false, list.isEmpty())));
                return Unit.f46060a;
        }
    }
}
