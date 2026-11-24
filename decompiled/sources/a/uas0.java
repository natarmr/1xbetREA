package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class uas0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 1;
    public /* synthetic */ boolean j;
    public final /* synthetic */ yas0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uas0(boolean z, yas0 yas0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = z;
        this.k = yas0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        yas0 yas0Var = this.k;
        switch (b) {
            case 0:
                return new uas0(this.j, yas0Var, yjeVar);
            default:
                uas0 uas0Var = new uas0(yas0Var, yjeVar);
                uas0Var.j = ((Boolean) obj).booleanValue();
                return uas0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((uas0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((uas0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        sas0 sas0VarA;
        byte b = this.i;
        yas0 yas0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (this.j) {
                    int i = yas0.z;
                    p7m0 p7m0Var = yas0Var.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, sas0.a((sas0) value, eas0.f7484a, false, 27)));
                }
                break;
            default:
                boolean z = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = yas0.z;
                p7m0 p7m0Var2 = yas0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    sas0VarA = (sas0) value2;
                    yas0Var.f.getClass();
                    fas0 fas0Var = sas0VarA.c;
                    if (fas0Var instanceof cas0) {
                        sas0VarA = sas0.a(sas0VarA, cas0.a((cas0) fas0Var, null, z, 1), false, 27);
                    }
                } while (!p7m0Var2.m(value2, sas0VarA));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uas0(yas0 yas0Var, yje yjeVar) {
        super(2, yjeVar);
        this.k = yas0Var;
    }
}
