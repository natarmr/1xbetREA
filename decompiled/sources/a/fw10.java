package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class fw10 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ cx10 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fw10(cx10 cx10Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = cx10Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        cx10 cx10Var = this.k;
        switch (b) {
            case 0:
                fw10 fw10Var = new fw10(cx10Var, yjeVar, (byte) 0);
                fw10Var.j = obj;
                return fw10Var;
            case 1:
                fw10 fw10Var2 = new fw10(cx10Var, yjeVar, (byte) 1);
                fw10Var2.j = obj;
                return fw10Var2;
            case 2:
                fw10 fw10Var3 = new fw10(cx10Var, yjeVar, (byte) 2);
                fw10Var3.j = obj;
                return fw10Var3;
            case 3:
                fw10 fw10Var4 = new fw10(cx10Var, yjeVar, (byte) 3);
                fw10Var4.j = obj;
                return fw10Var4;
            default:
                fw10 fw10Var5 = new fw10(cx10Var, yjeVar, (byte) 4);
                fw10Var5.j = obj;
                return fw10Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fw10) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fw10) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fw10) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fw10) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fw10) create((i8m0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        rw10 rw10Var;
        boolean z;
        boolean z2;
        boolean z3;
        Object value2;
        Object value3;
        byte b = this.i;
        cx10 cx10Var = this.k;
        switch (b) {
            case 0:
                ql5 ql5Var = (ql5) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                pn40 pn40Var = pn40.f27267a;
                String strC = pn40.c(ql5Var.b, p3u0.c);
                String str = ql5Var.f;
                p7m0 p7m0Var = cx10Var.I;
                while (true) {
                    Object value4 = p7m0Var.getValue();
                    String str2 = str;
                    if (!p7m0Var.m(value4, rw10.a((rw10) value4, null, null, false, false, false, false, false, null, null, null, null, strC, str2, 26623))) {
                        str = str2;
                    }
                    break;
                }
                break;
            case 1:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                cx10 cx10Var2 = this.k;
                mne mneVar = cx10Var2.f;
                p7m0 p7m0Var2 = cx10Var2.I;
                boolean z4 = sw00Var.f32897a;
                cx10Var2.J = z4;
                sff0 sff0Var = cx10Var2.F;
                byte b2 = 0;
                boolean z5 = sff0Var.P0 && z4;
                do {
                    value = p7m0Var2.getValue();
                    rw10Var = (rw10) value;
                    z = ((fsd) cx10Var2.c.f6397a).b().f17470a.contains(ez30.MESSAGES) && sff0Var.t && z4;
                    z2 = z4 && !cx10Var2.n.j();
                    z3 = sw00Var.f32897a;
                } while (!p7m0Var2.m(value, rw10.a(rw10Var, null, null, !z3, z3, z5, z2, z, null, null, null, null, null, null, 32643)));
                if (z4) {
                    v3c.N(cx10Var2.M);
                    yje yjeVar = null;
                    int i = 4;
                    int i2 = 2;
                    Class<cx10> cls = cx10.class;
                    cx10Var2.M = sac.T(new fnq(cx10Var2.x.b(), new xw10(cx10Var2, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(cx10Var2), mneVar.f22085a), new dm10(i2, cx10Var2, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", i, (byte) 19));
                    v3c.N(cx10Var2.N);
                    cx10Var2.N = sac.T(new fnq(((h840) cx10Var2.u.f10723a.f27863a).e, new bh0(cx10Var2, yjeVar, (byte) 14), (byte) 4), d5c.S(jiu0.a(cx10Var2), mneVar.f22085a), new dm10(i2, cx10Var2, cls, "handleError", "handleError(Ljava/lang/Throwable;)V", i, (byte) 21));
                    if (z5) {
                        cx10Var2.A();
                    }
                } else {
                    do {
                        value2 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value2, rw10.a((rw10) value2, cx10Var2.w.f(R.string.menu_title, new Object[0]), "", false, false, false, false, false, null, null, null, null, null, null, 32636)));
                }
                break;
            case 2:
                String str3 = (String) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                cx10Var.H.n(str3);
                break;
            case 3:
                Throwable th = (Throwable) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                cx10Var.A();
                break;
            default:
                i8m0 i8m0Var = (i8m0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = cx10Var.I;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, rw10.a((rw10) value3, null, null, false, false, false, false, false, null, i8m0Var, null, null, null, null, 32511)));
                break;
        }
        return Unit.f46060a;
    }
}
