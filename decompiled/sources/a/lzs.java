package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class lzs extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ wzs k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lzs(wzs wzsVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = wzsVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                lzs lzsVar = new lzs(this.k, yjeVar, (byte) 0);
                lzsVar.j = obj;
                return lzsVar;
            default:
                lzs lzsVar2 = new lzs(this.k, yjeVar, (byte) 1);
                lzsVar2.j = obj;
                return lzsVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((lzs) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((lzs) create((m2c0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        wzs wzsVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                sac.T(new fnq(new i89(wzsVar.f.f291a.c.f23554a, (byte) 22), new g6g((Object) wzsVar, obj2, (yje) null, (byte) 24), (byte) 4), jiu0.a(wzsVar), kzs.h);
                break;
            default:
                m2c0 m2c0Var = (m2c0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = wzsVar.u;
                p7m0 p7m0Var2 = wzsVar.u;
                if (((czs) p7m0Var.getValue()).l) {
                    if (wzsVar.k.f15225a.a()) {
                        int iOrdinal = m2c0Var.k.ordinal();
                        hl90 hl90Var = (iOrdinal == 0 || iOrdinal == 1) ? m2c0Var.Z.length() == 0 ? hl90.b : hl90.c : hl90.f13247a;
                        if (hl90Var == hl90.b || hl90Var == hl90.c) {
                            do {
                                value = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value, czs.a((czs) value, 0L, 0L, null, 0L, null, false, false, false, false, false, true, false, null, 63487)));
                            if (((czs) p7m0Var2.getValue()).g) {
                                ((neu0) wzsVar.i.f20148a).f23405a.a();
                            }
                        } else {
                            wzsVar.z();
                            wzsVar.p.n();
                            do {
                                value2 = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value2, czs.a((czs) value2, 0L, 0L, null, 0L, null, true, false, false, false, false, false, false, null, 62367)));
                        }
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
