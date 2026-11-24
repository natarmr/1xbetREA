package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class zs80 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ jt80 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs80(jt80 jt80Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = jt80Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        jt80 jt80Var = this.k;
        switch (b) {
            case 0:
                zs80 zs80Var = new zs80(jt80Var, yjeVar, (byte) 0);
                zs80Var.j = obj;
                return zs80Var;
            case 1:
                zs80 zs80Var2 = new zs80(jt80Var, yjeVar, (byte) 1);
                zs80Var2.j = obj;
                return zs80Var2;
            case 2:
                zs80 zs80Var3 = new zs80(jt80Var, yjeVar, (byte) 2);
                zs80Var3.j = obj;
                return zs80Var3;
            case 3:
                zs80 zs80Var4 = new zs80(jt80Var, yjeVar, (byte) 3);
                zs80Var4.j = obj;
                return zs80Var4;
            case 4:
                zs80 zs80Var5 = new zs80(jt80Var, yjeVar, (byte) 4);
                zs80Var5.j = obj;
                return zs80Var5;
            case 5:
                zs80 zs80Var6 = new zs80(jt80Var, yjeVar, (byte) 5);
                zs80Var6.j = obj;
                return zs80Var6;
            default:
                zs80 zs80Var7 = new zs80(jt80Var, yjeVar, (byte) 6);
                zs80Var7.j = obj;
                return zs80Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zs80) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((zs80) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((zs80) create((cm80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((zs80) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((zs80) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((zs80) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zs80) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        byte b2 = 29;
        byte b3 = 0;
        jt80 jt80Var = this.k;
        switch (b) {
            case 0:
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bo0 bo0Var = new bo0(list, b2);
                int i = jt80.s0;
                jt80Var.H(bo0Var);
                break;
            case 1:
                Throwable th = (Throwable) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                jt80Var.H.b(th, new zc70((byte) 28));
                break;
            case 2:
                cm80 cm80Var = (cm80) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                uj1 uj1Var = new uj1(cm80Var, (byte) 2);
                int i2 = jt80.s0;
                jt80Var.H(uj1Var);
                jt80Var.q0 = !(cm80Var instanceof tl80);
                break;
            case 3:
                Throwable th2 = (Throwable) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                th2.printStackTrace();
                int i3 = jt80.s0;
                p7m0 p7m0Var = jt80Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, rs80.a((rs80) value, false, true, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, 134217724)));
                jt80Var.q0 = false;
                break;
            case 4:
                Throwable th3 = (Throwable) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                jt80Var.H.b(th3, new zc70((byte) 29));
                break;
            case 5:
                Throwable th4 = (Throwable) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                jt80Var.H.b(th4, new ht80((byte) 0));
                break;
            default:
                mne mneVar = jt80Var.G;
                ocj ocjVar = jt80Var.i;
                sw00 sw00Var = (sw00) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                boolean z = sw00Var.b;
                boolean z2 = sw00Var.f32897a;
                yje yjeVar = null;
                if (!z && z2) {
                    int i4 = jt80.s0;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                    } while (!p7m0Var2.m(value3, rs80.a((rs80) value3, false, false, false, sw00Var.f32897a, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, 134217719)));
                    sac.V(jiu0.a(jt80Var), ct80.f4923a, null, mneVar.b, new ft80(jt80Var, yjeVar, b3), 10);
                    jt80Var.X();
                    jt80Var.r0 = true;
                    jt80Var.e0(10L);
                } else if (z && !z2) {
                    int i5 = jt80.s0;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                    } while (!p7m0Var3.m(value2, rs80.a((rs80) value2, false, false, false, sw00Var.f32897a, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, 134217719)));
                    sac.V(jiu0.a(jt80Var), ct80.f4923a, null, mneVar.b, new ft80(jt80Var, yjeVar, b3), 10);
                    jt80Var.X();
                    jt80Var.r0 = false;
                }
                break;
        }
        return Unit.f46060a;
    }
}
