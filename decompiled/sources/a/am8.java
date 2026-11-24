package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class am8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ km8 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am8(km8 km8Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = km8Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        km8 km8Var = this.k;
        switch (b) {
            case 0:
                return new am8(km8Var, yjeVar, (byte) 0);
            case 1:
                return new am8(km8Var, yjeVar, (byte) 1);
            default:
                am8 am8Var = new am8(km8Var, yjeVar, (byte) 2);
                am8Var.j = ((Boolean) obj).booleanValue();
                return am8Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((am8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((am8) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((am8) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objG;
        Object value2;
        Object value3;
        Object objG2;
        Object value4;
        Object value5;
        byte b = this.i;
        km8 km8Var = this.k;
        switch (b) {
            case 0:
                ocj ocjVar = km8Var.i;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    int i = km8.F;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                    } while (!p7m0Var.m(value, nl8.a((nl8) value, null, 0, true, false, null, 35)));
                    bwl bwlVar = km8Var.q;
                    this.j = true;
                    objG = bwlVar.g(this);
                    if (objG == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG = obj;
                }
                List list = (List) objG;
                if (list.isEmpty()) {
                    int i2 = km8.F;
                    mdm mdmVarB = g2v.b(km8Var.w, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_gift, 0, R.string.no_bonuses_info, 0, 0, 0L, 0L, 980);
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, nl8.a((nl8) value2, null, 0, false, true, mdmVarB, 33)));
                } else {
                    int i3 = km8.F;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, nl8.a((nl8) value3, list, 0, false, false, null, 32)));
                }
                return Unit.f46060a;
            case 1:
                ocj ocjVar2 = km8Var.i;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bwl bwlVar2 = km8Var.q;
                    this.j = true;
                    objG2 = bwlVar2.g(this);
                    if (objG2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG2 = obj;
                }
                List list2 = (List) objG2;
                if (list2.isEmpty()) {
                    int i4 = km8.F;
                    mdm mdmVarB2 = g2v.b(km8Var.w, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_gift, 0, R.string.no_bonuses_info, 0, 0, 0L, 0L, 980);
                    p7m0 p7m0Var4 = ocjVar2.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                    } while (!p7m0Var4.m(value4, nl8.a((nl8) value4, list2, 0, false, true, mdmVarB2, 34)));
                } else {
                    int i5 = km8.F;
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var5.getValue();
                        value5.getClass();
                    } while (!p7m0Var5.m(value5, nl8.a((nl8) value5, list2, 0, false, false, null, 62)));
                }
                return Unit.f46060a;
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!km8Var.E && z3) {
                    km8Var.M();
                }
                km8Var.E = z3;
                return Unit.f46060a;
        }
    }
}
