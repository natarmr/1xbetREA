package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class vib extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ajb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vib(ajb ajbVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ajbVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ajb ajbVar = this.k;
        switch (b) {
            case 0:
                vib vibVar = new vib(ajbVar, yjeVar, (byte) 0);
                vibVar.j = ((Boolean) obj).booleanValue();
                return vibVar;
            case 1:
                return new vib(ajbVar, yjeVar, (byte) 1);
            default:
                vib vibVar2 = new vib(ajbVar, yjeVar, (byte) 2);
                vibVar2.j = ((Boolean) obj).booleanValue();
                return vibVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((vib) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((vib) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((vib) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        ajb ajbVar = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z2 = ((kib) ajbVar.D()).e != z;
                p7m0 p7m0Var = ajbVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, kib.a((kib) value, false, false, null, z, 47)));
                if (z2) {
                    ajbVar.P();
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    int i = ajb.E;
                    obj = ajbVar.M(this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ajbVar.G(new hib(ohs0.n(ajbVar.s.a(), "/MicroFront/open-frame"), (Map) obj));
                return Unit.f46060a;
            default:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                oyg0 oyg0Var = ajbVar.f;
                ocj ocjVar = ajbVar.i;
                if (z4) {
                    int i2 = ajb.E;
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var2.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value3, kib.a((kib) value3, false, true, vhb.f37421a, false, 57)));
                    if (!((kib) ajbVar.D()).d) {
                        ajbVar.P();
                    }
                } else {
                    int i3 = ajb.E;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var3.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var3.m(value2, kib.a((kib) value2, false, false, vhb.d, false, 56)));
                }
                return Unit.f46060a;
        }
    }
}
