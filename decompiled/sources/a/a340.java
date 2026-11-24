package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class a340 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ j340 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a340(j340 j340Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j340Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j340 j340Var = this.k;
        switch (b) {
            case 0:
                a340 a340Var = new a340(j340Var, yjeVar, (byte) 0);
                a340Var.j = obj;
                return a340Var;
            case 1:
                a340 a340Var2 = new a340(j340Var, yjeVar, (byte) 1);
                a340Var2.j = obj;
                return a340Var2;
            default:
                a340 a340Var3 = new a340(j340Var, yjeVar, (byte) 2);
                a340Var3.j = obj;
                return a340Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a340) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a340) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a340) create((i8m0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        j340 j340Var = this.k;
        switch (b) {
            case 0:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                j340 j340Var2 = this.k;
                mne mneVar = j340Var2.s;
                sff0 sff0Var = j340Var2.Z0;
                byte b2 = 1;
                boolean z = sff0Var.P0 && sw00Var.f32897a;
                boolean z2 = sw00Var.f32897a;
                boolean z3 = z2 && !j340Var2.A.j();
                boolean z4 = ((fsd) j340Var2.o.f6397a).b().f17470a.contains(ez30.MESSAGES) && sff0Var.t && z2;
                p7m0 p7m0Var = j340Var2.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, d140.a((d140) value, z, z3, z4, null, null, null, null, null, null, false, false, null, sw00Var.f32897a, null, null, null, null, null, null, 1073676272)));
                if (z2) {
                    v3c.N(j340Var2.b1);
                    yje yjeVar = null;
                    j340Var2.b1 = sac.T(new fnq(((h840) j340Var2.H.f10723a.f27863a).e, new bh0(j340Var2, yjeVar, (byte) 16), (byte) 4), d5c.S(jiu0.a(j340Var2), mneVar.f22085a), new vf20(2, j340Var2, j340.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 10));
                    c4m0 c4m0Var = j340Var2.c1;
                    if (z) {
                        v3c.N(c4m0Var);
                        j340Var2.c1 = sac.T(new fnq(j340Var2.z.e(), new a340(j340Var2, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(j340Var2), mneVar.f22085a), foe.h);
                    } else {
                        v3c.N(c4m0Var);
                    }
                } else {
                    v3c.N(j340Var2.c1);
                }
                break;
            case 1:
                String str = (String) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = j340.i1;
                p7m0 p7m0Var2 = j340Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, d140.a((d140) value2, false, false, false, null, null, null, null, null, null, false, false, str, false, null, null, null, null, null, null, 1073733631)));
                break;
            default:
                i8m0 i8m0Var = (i8m0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = j340.i1;
                p7m0 p7m0Var3 = j340Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, d140.a((d140) value3, false, false, false, null, i8m0Var, null, null, null, null, false, false, null, false, null, null, null, null, null, null, 1073741807)));
                break;
        }
        return Unit.f46060a;
    }
}
