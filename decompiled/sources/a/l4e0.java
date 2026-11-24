package a;

import android.javax.sip.message.Response;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.statistic.rating.impl.rating_statistic.domain.model.SelectorOptionModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/l4e0;", "La/iw5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l4e0 extends iw5 {
    public final phf0 k2 = new phf0("EXTRA_REQUEST_KEY");
    public final lhf0 l2 = new lhf0("SELECTORS_MODEL_KEY", (byte) 7);
    public final yzn0 m2 = new yzn0("TITLE_ITEM");
    public static final /* synthetic */ iiy[] o2 = {new ez40(l4e0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(l4e0.class, "selectors", "getSelectors()Ljava/util/List;", 0), new ez40(l4e0.class, "selectorUiType", "getSelectorUiType()Lorg/xplatform/statistic/rating/impl/rating_statistic/presentation/model/SelectorUiType;", 0)};
    public static final fl70 n2 = new fl70();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1561642800);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(671498623, new xdr(this) { // from class: a.j4e0
            public final /* synthetic */ l4e0 b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b2;
                jm40 jm40Var = jm40.b;
                l4e0 l4e0Var = this.b;
                switch (b3) {
                    case 0:
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        fl70 fl70Var = l4e0.n2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(1 & iIntValue, (iIntValue & 19) != 18)) {
                            mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                            zcl zclVar = qmk.f28987a;
                            wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(((i6i0) l4e0Var.m2.n(l4e0Var, l4e0.o2[2])).f14241a, 0, fetVar2), 0L, 0, 0L, fetVar2, 0, 28);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        fl70 fl70Var2 = l4e0.n2;
                        ((y5d) obj).getClass();
                        byte b4 = 16;
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(0.0f, 20.0f, 1);
                            boolean zI = fetVar3.i(l4e0Var);
                            Object objP = fetVar3.P();
                            if (zI || objP == ukd.f35823a) {
                                objP = new v6d0(l4e0Var, b4);
                                fetVar3.o0(objP);
                            }
                            b8k0.e(mm40VarV, xczVarA, lh80VarT, null, null, null, false, null, (Function1) objP, fetVar3, 0, Response.SERVER_TIMEOUT);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), (ugd) null, u1c.M(-678911487, new xdr(this) { // from class: a.j4e0
            public final /* synthetic */ l4e0 b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b;
                jm40 jm40Var = jm40.b;
                l4e0 l4e0Var = this.b;
                switch (b3) {
                    case 0:
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        fl70 fl70Var = l4e0.n2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(1 & iIntValue, (iIntValue & 19) != 18)) {
                            mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                            zcl zclVar = qmk.f28987a;
                            wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), rsm0.w(((i6i0) l4e0Var.m2.n(l4e0Var, l4e0.o2[2])).f14241a, 0, fetVar2), 0L, 0, 0L, fetVar2, 0, 28);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        fl70 fl70Var2 = l4e0.n2;
                        ((y5d) obj).getClass();
                        byte b4 = 16;
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(0.0f, 20.0f, 1);
                            boolean zI = fetVar3.i(l4e0Var);
                            Object objP = fetVar3.P();
                            if (zI || objP == ukd.f35823a) {
                                objP = new v6d0(l4e0Var, b4);
                                fetVar3.o0(objP);
                            }
                            b8k0.e(mm40VarV, xczVarA, lh80VarT, null, null, null, false, null, (Function1) objP, fetVar3, 0, Response.SERVER_TIMEOUT);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final void P0(SelectorOptionModel selectorOptionModel) {
        if (R()) {
            return;
        }
        iiy[] iiyVarArr = o2;
        vcc.f0(i120.V(new Pair("SELECTOR_RESULT", selectorOptionModel), new Pair("SELECTOR_RESULT_SELECTOR_TYPE", (i6i0) this.m2.n(this, iiyVarArr[2]))), this, this.k2.n(this, iiyVarArr[0]));
        y0();
    }
}
