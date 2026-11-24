package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class r87 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ f97 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r87(f97 f97Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f97Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f97 f97Var = this.k;
        switch (b) {
            case 0:
                r87 r87Var = new r87(f97Var, yjeVar, (byte) 0);
                r87Var.j = obj;
                return r87Var;
            case 1:
                r87 r87Var2 = new r87(f97Var, yjeVar, (byte) 1);
                r87Var2.j = obj;
                return r87Var2;
            default:
                r87 r87Var3 = new r87(f97Var, yjeVar, (byte) 2);
                r87Var3.j = obj;
                return r87Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((r87) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((r87) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((r87) create((qkt0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        ql5 ql5Var;
        Object value3;
        byte b = this.i;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        byte b2 = 1;
        f97 f97Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                sw00 sw00Var = (sw00) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = f97.R0;
                ocj ocjVar = f97Var.i;
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, i77.a((i77) value, false, false, false, null, null, null, null, sw00Var.f32897a, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -1025, 2047)));
                if (sw00Var.f32897a) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var2.getValue();
                        value2.getClass();
                    } while (!p7m0Var2.m(value2, i77.a((i77) value2, true, false, false, null, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, null, null, -2, 2047)));
                    f97Var.h0();
                    f97Var.M0 = sac.V(jiu0.a(f97Var), new c87(f97Var, (byte) 16), null, null, new ya(f97Var, objArr2 == true ? 1 : 0, (byte) 8), 14);
                    f97Var.U();
                    f97Var.P0 = sac.V(jiu0.a(f97Var), null, null, f97Var.q.b, new b04(2, objArr == true ? 1 : 0, b2), 11);
                } else {
                    e3c.n(f97Var.L0);
                }
                break;
            case 1:
                ql5 ql5Var2 = (ql5) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ocj ocjVar2 = f97Var.i;
                bst bstVar = f97Var.z0;
                sff0 sff0VarA = f97Var.u.a();
                bstVar.getClass();
                i4 i4VarD = bst.d(ql5Var2, sff0VarA);
                if (ql5Var2.i.a()) {
                    HistoryTypeModel historyTypeModel = HistoryTypeModel.EVENTS;
                    if (q3d.j(historyTypeModel, HistoryTypeModel.UNSETTLED).contains(((i77) f97Var.D()).i)) {
                        ql5Var = ((i77) f97Var.D()).e;
                        if (ql5Var == null && ql5Var2.f28916a == ql5Var.f28916a) {
                            double d = ql5Var2.b;
                            ql5 ql5Var3 = ((i77) f97Var.D()).e;
                            if (!Intrinsics.a(d, ql5Var3 != null ? new Double(ql5Var3.b) : null)) {
                                p7m0 p7m0Var3 = ocjVar2.f25029a;
                                while (true) {
                                    Object value4 = p7m0Var3.getValue();
                                    value4.getClass();
                                    i4 i4Var = i4VarD;
                                    if (!p7m0Var3.m(value4, i77.a((i77) value4, false, false, false, ql5Var2, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, i4VarD, null, -17, 2043))) {
                                        i4VarD = i4Var;
                                    }
                                }
                            }
                        } else {
                            f97Var.H(new t87(ql5Var2, i4VarD, (byte) 0));
                            f97Var.a0();
                        }
                    } else {
                        p7m0 p7m0Var4 = ocjVar2.f25029a;
                        do {
                            value3 = p7m0Var4.getValue();
                            value3.getClass();
                        } while (!p7m0Var4.m(value3, i77.a((i77) value3, false, false, false, ql5Var2, null, null, null, false, null, null, false, false, false, null, null, null, null, false, null, false, false, false, null, null, null, i4VarD, null, -17, 2043)));
                        f97Var.M(historyTypeModel);
                    }
                } else {
                    ql5Var = ((i77) f97Var.D()).e;
                    if (ql5Var == null) {
                        f97Var.H(new t87(ql5Var2, i4VarD, (byte) 0));
                        f97Var.a0();
                    } else {
                        f97Var.H(new t87(ql5Var2, i4VarD, (byte) 0));
                        f97Var.a0();
                    }
                }
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                int i2 = f97.R0;
                String str = ((qkt0) obj2).f28903a;
                if (str != null) {
                    f97Var.k0(str);
                } else {
                    e3c.n(f97Var.P0);
                    f97Var.b0(true);
                }
                break;
        }
        return Unit.f46060a;
    }
}
