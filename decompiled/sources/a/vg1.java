package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vg1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ mh1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vg1(mh1 mh1Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = mh1Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        mh1 mh1Var = this.k;
        switch (b) {
            case 0:
                vg1 vg1Var = new vg1(mh1Var, yjeVar, (byte) 0);
                vg1Var.j = obj;
                return vg1Var;
            case 1:
                vg1 vg1Var2 = new vg1(mh1Var, yjeVar, (byte) 1);
                vg1Var2.j = obj;
                return vg1Var2;
            case 2:
                vg1 vg1Var3 = new vg1(mh1Var, yjeVar, (byte) 2);
                vg1Var3.j = obj;
                return vg1Var3;
            case 3:
                vg1 vg1Var4 = new vg1(mh1Var, yjeVar, (byte) 3);
                vg1Var4.j = obj;
                return vg1Var4;
            default:
                vg1 vg1Var5 = new vg1(mh1Var, yjeVar, (byte) 4);
                vg1Var5.j = obj;
                return vg1Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vg1) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vg1) create((vmt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((vg1) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((vg1) create((w2j) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vg1) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        mh1 mh1Var = this.k;
        switch (b) {
            case 0:
                ocj ocjVar = mh1Var.i;
                sw00 sw00Var = (sw00) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z = sw00Var.b;
                boolean z2 = sw00Var.f32897a;
                if (!z && z2) {
                    String str = mh1.E0;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                    } while (!p7m0Var.m(value2, pf1.a((pf1) value2, null, 0, 0, false, 0L, null, false, null, null, null, null, null, null, true, null, false, Integer.MAX_VALUE, 15)));
                    mh1Var.S(10L);
                } else if (z && !z2) {
                    String str2 = mh1.E0;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                    } while (!p7m0Var2.m(value, pf1.a((pf1) value, null, 0, 0, false, 0L, null, false, null, null, null, null, null, null, false, null, false, Integer.MAX_VALUE, 15)));
                }
                break;
            case 1:
                vmt0 vmt0Var = (vmt0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (vmt0Var instanceof smt0) {
                    c4m0 c4m0Var = mh1Var.p0;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    mh1Var.G(new lf1(mh1Var.N.b.a(R.string.daily_task_update_error, Arrays.copyOf(new Object[0], 0))));
                }
                break;
            case 2:
                ql5 ql5Var = (ql5) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                String str3 = mh1.E0;
                mh1Var.N(ql5Var);
                break;
            case 3:
                w2j w2jVar = (w2j) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (w2jVar instanceof u2j) {
                    mh1Var.G(new lf1(mh1Var.N.b.a(0, Arrays.copyOf(new Object[0], 0))));
                }
                String str4 = mh1.E0;
                p7m0 p7m0Var3 = mh1Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    w2j w2jVar2 = w2jVar;
                    if (!p7m0Var3.m(value3, pf1.a((pf1) value3, null, 0, 0, false, 0L, null, false, null, null, null, null, w2jVar2, null, false, null, false, -536870913, 15))) {
                        w2jVar = w2jVar2;
                    }
                    break;
                }
                break;
            default:
                Throwable th = (Throwable) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                String str5 = mh1.E0;
                mh1Var.T(th);
                break;
        }
        return Unit.f46060a;
    }
}
