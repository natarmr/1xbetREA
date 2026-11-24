package a;

import android.javax.sip.message.Response;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/fcm0;", "La/iw5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class fcm0 extends iw5 {
    public final phf0 k2 = new phf0("TITLE");
    public final es l2 = new es("ITEMS");
    public final phf0 m2 = new phf0("REQUEST_KEY");
    public static final /* synthetic */ iiy[] o2 = {new ez40(fcm0.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(fcm0.class, "items", "getItems()Ljava/util/List;", 0), new ez40(fcm0.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final j6m0 n2 = new j6m0((byte) 1);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1502364980);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-448500829, new xdr(this) { // from class: a.ecm0
            public final /* synthetic */ fcm0 b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b2;
                jm40 jm40Var = jm40.b;
                fcm0 fcm0Var = this.b;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        j6m0 j6m0Var = fcm0.n2;
                        ((y5d) obj).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            v8q0.a(fcm0Var.k2.n(fcm0Var, fcm0.o2[0]), s5x0.N(mm40VarD, 16.0f, 28.0f, 16.0f, 0.0f, 8), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, 0, 384, 125948);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        j6m0 j6m0Var2 = fcm0.n2;
                        ((y5d) obj).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
                            boolean zI = fetVar3.i(fcm0Var);
                            Object objP = fetVar3.P();
                            if (zI || objP == ukd.f35823a) {
                                objP = new j1l0(fcm0Var, (byte) 13);
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
        }, fetVar), (ugd) null, u1c.M(-1584445275, new xdr(this) { // from class: a.ecm0
            public final /* synthetic */ fcm0 b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b;
                jm40 jm40Var = jm40.b;
                fcm0 fcm0Var = this.b;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        j6m0 j6m0Var = fcm0.n2;
                        ((y5d) obj).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            v8q0.a(fcm0Var.k2.n(fcm0Var, fcm0.o2[0]), s5x0.N(mm40VarD, 16.0f, 28.0f, 16.0f, 0.0f, 8), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, 0, 384, 125948);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        j6m0 j6m0Var2 = fcm0.n2;
                        ((y5d) obj).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
                            boolean zI = fetVar3.i(fcm0Var);
                            Object objP = fetVar3.P();
                            if (zI || objP == ukd.f35823a) {
                                objP = new j1l0(fcm0Var, (byte) 13);
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
