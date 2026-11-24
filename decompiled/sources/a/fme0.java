package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class fme0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ gme0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fme0(gme0 gme0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = gme0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        gme0 gme0Var = this.k;
        switch (b) {
            case 0:
                fme0 fme0Var = new fme0(gme0Var, yjeVar, (byte) 0);
                fme0Var.j = ((Boolean) obj).booleanValue();
                return fme0Var;
            default:
                return new fme0(gme0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((fme0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fme0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        boolean z = false;
        gme0 gme0Var = this.k;
        switch (b) {
            case 0:
                boolean z2 = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z3 = !z2 && ((yle0) gme0Var.D()).f42836a;
                if (z2 && (((yle0) gme0Var.D()).b || ((yle0) gme0Var.D()).c)) {
                    z = true;
                }
                if (z3 || z) {
                    int i = gme0.u;
                    gme0Var.M();
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    f4u f4uVar = gme0Var.o;
                    String str = gme0Var.p;
                    this.j = true;
                    n660 n660Var = (n660) f4uVar.b;
                    obj = qjj.d0(((mne) n660Var.f22981a).b, new oed(n660Var, str, null, (byte) 19), this);
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
                rle0 rle0Var = (rle0) obj;
                int i2 = gme0.u;
                p7m0 p7m0Var = gme0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, new yle0(false, false, rle0Var.c.isEmpty(), rle0Var)));
                return Unit.f46060a;
        }
    }
}
