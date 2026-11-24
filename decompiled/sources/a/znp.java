package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class znp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ eop k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ znp(eop eopVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = eopVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        eop eopVar = this.k;
        switch (b) {
            case 0:
                znp znpVar = new znp(eopVar, yjeVar, (byte) 0);
                znpVar.j = ((Boolean) obj).booleanValue();
                return znpVar;
            case 1:
                znp znpVar2 = new znp(eopVar, yjeVar, (byte) 1);
                znpVar2.j = ((Boolean) obj).booleanValue();
                return znpVar2;
            default:
                znp znpVar3 = new znp(eopVar, yjeVar, (byte) 2);
                znpVar3.j = ((Boolean) obj).booleanValue();
                return znpVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.i;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        yje yjeVar = (yje) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((znp) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        eop eopVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                eopVar.o.e("KEY_DISABLED_TOOLBAR_ENABLE_STATE", Boolean.valueOf(z));
                p7m0 p7m0Var = eopVar.i.f25029a;
                while (true) {
                    Object value2 = p7m0Var.getValue();
                    value2.getClass();
                    boolean z2 = z;
                    if (!p7m0Var.m(value2, pnp.a((pnp) value2, null, false, null, null, false, false, null, false, 0, null, z2, false, false, false, null, null, 2064383))) {
                        z = z2;
                    }
                    break;
                }
                break;
            case 1:
                boolean z3 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                eopVar.o.e("KEY_MULTISELECT_ACTIVE_STATE", Boolean.valueOf(z3));
                p7m0 p7m0Var2 = eopVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                } while (!p7m0Var2.m(value, pnp.a((pnp) value, null, false, null, null, false, false, null, false, 0, null, false, z3, false, false, null, null, 2031615)));
                break;
            default:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                eopVar.o.e("KEY_STREAM_ACTIVE_STATE", Boolean.valueOf(z4));
                p7m0 p7m0Var3 = eopVar.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var3.getValue();
                    value3.getClass();
                    boolean z5 = z4;
                    if (!p7m0Var3.m(value3, pnp.a((pnp) value3, null, false, null, null, false, false, null, false, 0, null, false, false, z5, false, null, null, 1966079))) {
                        z4 = z5;
                    }
                    break;
                }
                break;
        }
        return Unit.f46060a;
    }
}
