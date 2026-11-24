package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class i3g extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ boolean j;
    public final /* synthetic */ j3g k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3g(j3g j3gVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j3gVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j3g j3gVar = this.k;
        switch (b) {
            case 0:
                i3g i3gVar = new i3g(j3gVar, yjeVar, (byte) 0);
                i3gVar.j = ((Boolean) obj).booleanValue();
                return i3gVar;
            default:
                i3g i3gVar2 = new i3g(j3gVar, yjeVar, (byte) 1);
                i3gVar2.j = ((Boolean) obj).booleanValue();
                return i3gVar2;
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
        }
        return ((i3g) create(bool, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        j3g j3gVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = j3g.r;
                p7m0 p7m0Var = j3gVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, g3g.a((g3g) value, null, z, false, 13)));
                break;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = j3g.r;
                p7m0 p7m0Var2 = j3gVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, g3g.a((g3g) value2, null, false, z2, 11)));
                break;
        }
        return Unit.f46060a;
    }
}
