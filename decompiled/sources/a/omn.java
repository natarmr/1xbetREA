package a;

import android.javax.sip.message.Response;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/omn;", "La/iw5;", "<init>", "()V", "a/ddk", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class omn extends iw5 {
    public final es k2 = new es("OPTION_ITEMS_LIST_KEY");
    public final phf0 l2 = new phf0("TITLE_KEY");
    public final phf0 m2 = new phf0("REQUEST_KEY");
    public final phf0 n2 = new phf0("SELECTED_POSITION_VALUE_KEY");
    public final zz2 o2 = new zz2("INITIAL_SELECTED_POSITION_VALUE_KEY");
    public static final /* synthetic */ iiy[] q2 = {new ez40(omn.class, "optionItemsList", "getOptionItemsList()Ljava/util/List;", 0), new ez40(omn.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(omn.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(omn.class, "selectedPositionResultKey", "getSelectedPositionResultKey()Ljava/lang/String;", 0), new ez40(omn.class, "initialSelectedPosition", "getInitialSelectedPosition()I", 0)};
    public static final ddk p2 = new ddk();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1622844282);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(610297141, new xdr(this) { // from class: a.nmn
            public final /* synthetic */ omn b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b2;
                jm40 jm40Var = jm40.b;
                omn omnVar = this.b;
                switch (b3) {
                    case 0:
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ddk ddkVar = omn.p2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                            zcl zclVar = qmk.f28987a;
                            wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), omnVar.l2.n(omnVar, omn.q2[1]), 0L, 0, 0L, fetVar2, 0, 28);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        ddk ddkVar2 = omn.p2;
                        ((y5d) obj).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(0.0f, 8.0f, 1);
                            boolean zI = fetVar3.i(omnVar);
                            Object objP = fetVar3.P();
                            if (zI || objP == ukd.f35823a) {
                                objP = new yhn(omnVar, (byte) 2);
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
        }, fetVar), (ugd) null, u1c.M(-740112969, new xdr(this) { // from class: a.nmn
            public final /* synthetic */ omn b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b;
                jm40 jm40Var = jm40.b;
                omn omnVar = this.b;
                switch (b3) {
                    case 0:
                        y5d y5dVar = (y5d) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ddk ddkVar = omn.p2;
                        y5dVar.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar2.g(y5dVar) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            mm40 mm40VarA = y5dVar.a(o7k0.d(jm40Var, 1.0f), gqw0.n);
                            zcl zclVar = qmk.f28987a;
                            wwb.i(s5x0.N(mm40VarA, 0.0f, 24.0f, 0.0f, 0.0f, 13), omnVar.l2.n(omnVar, omn.q2[1]), 0L, 0, 0L, fetVar2, 0, 28);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        ddk ddkVar2 = omn.p2;
                        ((y5d) obj).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(0.0f, 8.0f, 1);
                            boolean zI = fetVar3.i(omnVar);
                            Object objP = fetVar3.P();
                            if (zI || objP == ukd.f35823a) {
                                objP = new yhn(omnVar, (byte) 2);
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
}
