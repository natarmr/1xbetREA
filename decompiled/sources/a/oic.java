package a;

import android.javax.sip.message.Response;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.statistic.tennis.impl.summary.presentation.chose_filter.ChoseFilterScreenParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/oic;", "La/iw5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class oic extends iw5 {
    public final khf0 k2 = new khf0("EXTRA_SCREEN_PARAMS_KEY");
    public static final /* synthetic */ iiy[] m2 = {new ez40(oic.class, "screenParams", "getScreenParams()Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;", 0)};
    public static final yk5 l2 = new yk5();
    public static final String n2 = oic.class.getName();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(1731077713);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(168282818, new xdr(this) { // from class: a.nic
            public final /* synthetic */ oic b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b2;
                jm40 jm40Var = jm40.b;
                oic oicVar = this.b;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        yk5 yk5Var = oic.l2;
                        ((y5d) obj).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            v8q0.a(oicVar.P0().b, s5x0.N(mm40VarD, 16.0f, 28.0f, 16.0f, 0.0f, 8), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, 0, 384, 125948);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        yk5 yk5Var2 = oic.l2;
                        ((y5d) obj).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
                            boolean zI = fetVar3.i(oicVar);
                            Object objP = fetVar3.P();
                            if (zI || objP == ukd.f35823a) {
                                objP = new lya(oicVar, (byte) 18);
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
        }, fetVar), (ugd) null, u1c.M(1970418688, new xdr(this) { // from class: a.nic
            public final /* synthetic */ oic b;

            {
                this.b = this;
            }

            @Override // a.xdr
            public final Object F(Object obj, Object obj2, Object obj3) {
                byte b3 = b;
                jm40 jm40Var = jm40.b;
                oic oicVar = this.b;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        yk5 yk5Var = oic.l2;
                        ((y5d) obj).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            v8q0.a(oicVar.P0().b, s5x0.N(mm40VarD, 16.0f, 28.0f, 16.0f, 0.0f, 8), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, y9q0.a(new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar2, 0, 384, 125948);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        yk5 yk5Var2 = oic.l2;
                        ((y5d) obj).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            xcz xczVarA = ddz.a(0, 0, fetVar3, 0, 3);
                            mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVarA, fetVar3), null);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarT = s5x0.t(0.0f, 16.0f, 1);
                            boolean zI = fetVar3.i(oicVar);
                            Object objP = fetVar3.P();
                            if (zI || objP == ukd.f35823a) {
                                objP = new lya(oicVar, (byte) 18);
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

    public final ChoseFilterScreenParams P0() {
        return (ChoseFilterScreenParams) this.k2.n(this, m2[0]);
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        L0().K = true;
        L0().N(3);
    }
}
