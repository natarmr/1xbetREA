package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q0h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27897a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ q0h(a4x a4xVar, Function1 function1) {
        this.f27897a = (byte) 1;
        this.b = a4xVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f27897a;
        Function1 function1 = this.c;
        a4x<s8p> a4xVar = this.b;
        final byte b2 = 1;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dtb.d(a4xVar, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                i8z i8zVar = (i8z) obj;
                int iIntValue = ((Integer) obj2).intValue();
                i8zVar.getClass();
                for (final s8p s8pVar : a4xVar) {
                    if (s8pVar != null) {
                        if (s8pVar instanceof gun) {
                            final byte b3 = 0;
                            i8z.d(i8zVar, new dx2(iIntValue, (byte) 12), new ugd(490901093, true, new xdr() { // from class: a.lfp
                                @Override // a.xdr
                                public final Object F(Object obj3, Object obj4, Object obj5) {
                                    byte b4 = b3;
                                    s8p s8pVar2 = s8pVar;
                                    switch (b4) {
                                        case 0:
                                            fet fetVar = (fet) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            ((k8z) obj3).getClass();
                                            if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                jcb.l(null, ((gun) s8pVar2).f11938a, true, null, fetVar, 384, 9);
                                            } else {
                                                fetVar.X();
                                            }
                                            break;
                                        default:
                                            fet fetVar2 = (fet) obj4;
                                            int iIntValue3 = ((Integer) obj5).intValue();
                                            ((k8z) obj3).getClass();
                                            if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                float f = xfn.a(fetVar2).e - xfn.a(fetVar2).d;
                                                zcl zclVar = qmk.f28987a;
                                                nkb.h(s5x0.N(jm40.b, f, 8.0f, f, 0.0f, 8), new hjm(((h4t) s8pVar2).f12449a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }));
                        } else if (s8pVar instanceof h4t) {
                            i8z.d(i8zVar, new dx2(iIntValue, (byte) 13), new ugd(104889038, true, new xdr() { // from class: a.lfp
                                @Override // a.xdr
                                public final Object F(Object obj3, Object obj4, Object obj5) {
                                    byte b4 = b2;
                                    s8p s8pVar2 = s8pVar;
                                    switch (b4) {
                                        case 0:
                                            fet fetVar = (fet) obj4;
                                            int iIntValue2 = ((Integer) obj5).intValue();
                                            ((k8z) obj3).getClass();
                                            if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                jcb.l(null, ((gun) s8pVar2).f11938a, true, null, fetVar, 384, 9);
                                            } else {
                                                fetVar.X();
                                            }
                                            break;
                                        default:
                                            fet fetVar2 = (fet) obj4;
                                            int iIntValue3 = ((Integer) obj5).intValue();
                                            ((k8z) obj3).getClass();
                                            if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                float f = xfn.a(fetVar2).e - xfn.a(fetVar2).d;
                                                zcl zclVar = qmk.f28987a;
                                                nkb.h(s5x0.N(jm40.b, f, 8.0f, f, 0.0f, 8), new hjm(((h4t) s8pVar2).f12449a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
                                            } else {
                                                fetVar2.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }));
                        } else if (s8pVar instanceof uee0) {
                            uzb.U(i8zVar, ((uee0) s8pVar).f35524a, new ag0(function1, (byte) 29), new qyo(function1, (byte) 10), null, 8);
                        }
                    }
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                yyw.a(a4xVar, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                yyw.c(a4xVar, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                yyw.x(a4xVar, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                l7x.t(a4xVar, function1, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ q0h(byte b, int i, a4x a4xVar, Function1 function1) {
        this.f27897a = b;
        this.b = a4xVar;
        this.c = function1;
    }
}
