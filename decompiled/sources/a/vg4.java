package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class vg4 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ fh4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg4(fh4 fh4Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fh4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        fh4 fh4Var = this.k;
        switch (b) {
            case 0:
                vg4 vg4Var = new vg4(fh4Var, yjeVar, (byte) 0);
                vg4Var.j = ((Boolean) obj).booleanValue();
                return vg4Var;
            default:
                return new vg4(fh4Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((vg4) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vg4) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        fh4 fh4Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (((zf4) fh4Var.D()).g.c.length() == 0 && z) {
                    fh4Var.R();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    int i = fh4.c0;
                    p7m0 p7m0Var = fh4Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, zf4.a((zf4) value, false, false, true, null, null, null, 0, false, null, null, false, false, 32759)));
                    x860 x860Var = fh4Var.W;
                    this.j = true;
                    if (x860Var.b(this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
