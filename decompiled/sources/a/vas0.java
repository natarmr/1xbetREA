package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class vas0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ yas0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vas0(yas0 yas0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = yas0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yas0 yas0Var = this.k;
        switch (b) {
            case 0:
                vas0 vas0Var = new vas0(yas0Var, yjeVar, (byte) 0);
                vas0Var.j = obj;
                return vas0Var;
            case 1:
                vas0 vas0Var2 = new vas0(yas0Var, yjeVar, (byte) 1);
                vas0Var2.j = obj;
                return vas0Var2;
            case 2:
                vas0 vas0Var3 = new vas0(yas0Var, yjeVar, (byte) 2);
                vas0Var3.j = obj;
                return vas0Var3;
            default:
                vas0 vas0Var4 = new vas0(yas0Var, yjeVar, (byte) 3);
                vas0Var4.j = obj;
                return vas0Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vas0) create((gu1) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vas0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((vas0) create((gqt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vas0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        sas0 sas0VarA;
        Object value4;
        byte b = this.i;
        yas0 yas0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                gu1 gu1Var = (gu1) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = yas0.z;
                p7m0 p7m0Var = yas0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, sas0.a((sas0) value, new cas0(gu1Var, false), false, 27)));
                break;
            case 1:
                Throwable th = (Throwable) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                yas0Var.o.b(th, new was0(th, (byte) 0));
                p7m0 p7m0Var2 = yas0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, sas0.a((sas0) value2, das0.f5767a, false, 27)));
                break;
            case 2:
                gqt0 gqt0Var = (gqt0) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = yas0.z;
                p7m0 p7m0Var3 = yas0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    sas0VarA = (sas0) value3;
                    fas0 fas0Var = sas0VarA.c;
                    if (fas0Var instanceof cas0) {
                        cas0 cas0Var = (cas0) fas0Var;
                        sas0VarA = sas0.a(sas0VarA, cas0.a(cas0Var, gu1.a(cas0Var.f4028a, false, null, gqt0Var, 0L, null, 253951), false, 2), false, 27);
                    }
                } while (!p7m0Var3.m(value3, sas0VarA));
                break;
            default:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var.f32897a && !sw00Var.b && ((sas0) yas0Var.D()).e) {
                    p7m0 p7m0Var4 = yas0Var.i.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                    } while (!p7m0Var4.m(value4, sas0.a((sas0) value4, null, false, 15)));
                    yas0Var.N();
                }
                break;
        }
        return Unit.f46060a;
    }
}
