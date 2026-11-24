package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class lco0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ zco0 k;
    public final /* synthetic */ vne l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lco0(zco0 zco0Var, vne vneVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = zco0Var;
        this.l = vneVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vne vneVar = this.l;
        zco0 zco0Var = this.k;
        switch (b) {
            case 0:
                lco0 lco0Var = new lco0(zco0Var, vneVar, yjeVar, (byte) 0);
                lco0Var.j = obj;
                return lco0Var;
            case 1:
                lco0 lco0Var2 = new lco0(zco0Var, vneVar, yjeVar, (byte) 1);
                lco0Var2.j = obj;
                return lco0Var2;
            case 2:
                lco0 lco0Var3 = new lco0(zco0Var, vneVar, yjeVar, (byte) 2);
                lco0Var3.j = obj;
                return lco0Var3;
            case 3:
                lco0 lco0Var4 = new lco0(zco0Var, vneVar, yjeVar, (byte) 3);
                lco0Var4.j = obj;
                return lco0Var4;
            case 4:
                lco0 lco0Var5 = new lco0(zco0Var, vneVar, yjeVar, (byte) 4);
                lco0Var5.j = obj;
                return lco0Var5;
            case 5:
                lco0 lco0Var6 = new lco0(zco0Var, vneVar, yjeVar, (byte) 5);
                lco0Var6.j = obj;
                return lco0Var6;
            default:
                lco0 lco0Var7 = new lco0(zco0Var, vneVar, yjeVar, (byte) 6);
                lco0Var7.j = obj;
                return lco0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((lco0) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        byte b = this.i;
        vne vneVar = this.l;
        zco0 zco0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                int i = zco0.r0;
                p7m0 p7m0Var = zco0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, glb0.a((glb0) value, false, false, null, null, null, null, null, null, null, null, null, null, null, null, new gn00(th), null, null, null, false, 32505855)));
                if (th instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
            case 1:
                Throwable th2 = (Throwable) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                th2.printStackTrace();
                int i2 = zco0.r0;
                p7m0 p7m0Var2 = zco0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, glb0.a((glb0) value2, false, false, null, null, null, null, null, null, null, null, null, null, null, new gn00(th2), null, null, null, null, false, 33030143)));
                if (th2 instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
            case 2:
                Throwable th3 = (Throwable) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                th3.printStackTrace();
                int i3 = zco0.r0;
                p7m0 p7m0Var3 = zco0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, glb0.a((glb0) value3, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, new gn00(th3), null, null, false, 31457279)));
                if (th3 instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
            case 3:
                Throwable th4 = (Throwable) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                th4.printStackTrace();
                int i4 = zco0.r0;
                p7m0 p7m0Var4 = zco0Var.i.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, glb0.a((glb0) value4, false, false, null, null, null, null, null, null, null, null, new gn00(th4), null, null, null, null, null, null, null, false, 33488895)));
                if (th4 instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
            case 4:
                Throwable th5 = (Throwable) obj2;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                th5.printStackTrace();
                int i5 = zco0.r0;
                p7m0 p7m0Var5 = zco0Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, glb0.a((glb0) value5, false, false, null, null, null, null, null, null, null, new gn00(th5), null, null, null, null, null, null, null, null, false, 33521663)));
                if (th5 instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
            case 5:
                Throwable th6 = (Throwable) obj2;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                th6.printStackTrace();
                int i6 = zco0.r0;
                p7m0 p7m0Var6 = zco0Var.i.f25029a;
                do {
                    value6 = p7m0Var6.getValue();
                    value6.getClass();
                } while (!p7m0Var6.m(value6, glb0.a((glb0) value6, false, false, null, null, null, null, null, null, null, null, null, null, new gn00(th6), null, null, null, null, null, false, 33292287)));
                if (th6 instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
            default:
                Throwable th7 = (Throwable) obj2;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                th7.printStackTrace();
                int i7 = zco0.r0;
                p7m0 p7m0Var7 = zco0Var.i.f25029a;
                do {
                    value7 = p7m0Var7.getValue();
                    value7.getClass();
                } while (!p7m0Var7.m(value7, glb0.a((glb0) value7, false, false, null, null, null, null, null, null, null, null, null, new gn00(th7), null, null, null, null, null, null, false, 33423359)));
                if (th7 instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
        }
        return Unit.f46060a;
    }
}
