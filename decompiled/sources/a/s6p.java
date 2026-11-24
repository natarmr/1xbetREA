package a;

import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/s6p;", "La/iw5;", "<init>", "()V", "a/pek", "La/f7p;", CommonConstant.ReqAccessTokenParam.STATE_LABEL, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class s6p extends iw5 {
    public final phf0 k2 = new phf0("BUNDLE_REQUEST_KEY");
    public final yzn0 l2 = new yzn0("BUNDLE_LIST_KEY");
    public final a8z m2;
    public final kiu0 n2;
    public static final /* synthetic */ iiy[] p2 = {new ez40(s6p.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(s6p.class, Payload.TYPE, "getType()Lorg/xplatform/favorites/impl/presentation/clear/presentation/models/FavoritesClearType;", 0)};
    public static final pek o2 = new pek();
    public static final String q2 = sre0.f32672a.b(s6p.class).J();

    public s6p() {
        q6p q6pVar = new q6p(this, (byte) 0);
        wez wezVar = wez.b;
        this.m2 = maz.a(wezVar, q6pVar);
        q6p q6pVar2 = new q6p(this, (byte) 1);
        a8z a8zVarA = maz.a(wezVar, new jfl(new jfl(this, (byte) 13), (byte) 14));
        this.n2 = agc.G(this, sre0.f32672a.b(h7p.class), new r6p(a8zVarA, (byte) 0), new r6p(a8zVarA, (byte) 1), q6pVar2);
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        final s6p s6pVar;
        fetVar.e0(-949853053);
        kiu0 kiu0Var = this.n2;
        h7p h7pVar = (h7p) kiu0Var.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            s6pVar = this;
            Object k4pVar = new k4p(1, s6pVar, s6p.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/favorites/impl/presentation/clear/presentation/models/FavoriteClearSideEffect;)V", 0, (byte) 6);
            fetVar.o0(k4pVar);
            objP = k4pVar;
        } else {
            s6pVar = this;
        }
        int i = h7p.r;
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(h7pVar) | fetVar.i(s6pVar) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new g6g(h7pVar, s6pVar, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, s6pVar, (Function2) objP2);
        final pz40 pz40VarY = ((h7p) kiu0Var.getValue()).y(fetVar);
        final byte b = 1;
        final byte b2 = 0;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), x8f.b, u1c.M(570750266, new xdr(s6pVar) { // from class: a.p6p
            public final /* synthetic */ s6p b;

            {
                this.b = s6pVar;
            }

            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b2;
                cl5 cl5Var = ukd.f35823a;
                l7m0 l7m0Var = pz40VarY;
                s6p s6pVar2 = this.b;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        pek pekVar = s6p.o2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            String strW = rsm0.w(R.string.clear, 0, fetVar2);
                            boolean zH = fetVar2.h(((f7p) l7m0Var.getValue()).b);
                            Object objP3 = fetVar2.P();
                            if (zH || objP3 == cl5Var) {
                                wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(strW), ((f7p) l7m0Var.getValue()).b, false, false);
                                fetVar2.o0(wulVar);
                                objP3 = wulVar;
                            }
                            wul wulVar2 = (wul) objP3;
                            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                            boolean zI3 = fetVar2.i(s6pVar2);
                            Object objP4 = fetVar2.P();
                            if (zI3 || objP4 == cl5Var) {
                                objP4 = new q6p(s6pVar2, (byte) 2);
                                fetVar2.o0(objP4);
                            }
                            qzb.n(mm40VarK, wulVar2, (Function0) objP4, fetVar2, 0, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        pek pekVar2 = s6p.o2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            f7p f7pVar = (f7p) l7m0Var.getValue();
                            h7p h7pVar2 = (h7p) s6pVar2.n2.getValue();
                            boolean zI4 = fetVar3.i(h7pVar2);
                            Object objP5 = fetVar3.P();
                            if (zI4 || objP5 == cl5Var) {
                                k4p k4pVar2 = new k4p(1, h7pVar2, h7p.class, "onAction", "onAction(Lorg/xplatform/favorites/impl/presentation/clear/presentation/models/FavoriteClearAction;)V", 0, (byte) 7);
                                fetVar3.o0(k4pVar2);
                                objP5 = k4pVar2;
                            }
                            rcb.G(null, f7pVar, (Function1) ((jhy) objP5), fetVar3, 0);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), u1c.M(-2040248460, new xdr(s6pVar) { // from class: a.p6p
            public final /* synthetic */ s6p b;

            {
                this.b = s6pVar;
            }

            @Override // a.xdr
            public final Object F(Object obj2, Object obj3, Object obj4) {
                byte b3 = b;
                cl5 cl5Var = ukd.f35823a;
                l7m0 l7m0Var = pz40VarY;
                s6p s6pVar2 = this.b;
                switch (b3) {
                    case 0:
                        fet fetVar2 = (fet) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        pek pekVar = s6p.o2;
                        ((ir8) obj2).getClass();
                        if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                            String strW = rsm0.w(R.string.clear, 0, fetVar2);
                            boolean zH = fetVar2.h(((f7p) l7m0Var.getValue()).b);
                            Object objP3 = fetVar2.P();
                            if (zH || objP3 == cl5Var) {
                                wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(strW), ((f7p) l7m0Var.getValue()).b, false, false);
                                fetVar2.o0(wulVar);
                                objP3 = wulVar;
                            }
                            wul wulVar2 = (wul) objP3;
                            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                            zcl zclVar = qmk.f28987a;
                            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                            boolean zI3 = fetVar2.i(s6pVar2);
                            Object objP4 = fetVar2.P();
                            if (zI3 || objP4 == cl5Var) {
                                objP4 = new q6p(s6pVar2, (byte) 2);
                                fetVar2.o0(objP4);
                            }
                            qzb.n(mm40VarK, wulVar2, (Function0) objP4, fetVar2, 0, 0);
                        } else {
                            fetVar2.X();
                        }
                        break;
                    default:
                        fet fetVar3 = (fet) obj3;
                        int iIntValue2 = ((Integer) obj4).intValue();
                        pek pekVar2 = s6p.o2;
                        ((y5d) obj2).getClass();
                        if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                            f7p f7pVar = (f7p) l7m0Var.getValue();
                            h7p h7pVar2 = (h7p) s6pVar2.n2.getValue();
                            boolean zI4 = fetVar3.i(h7pVar2);
                            Object objP5 = fetVar3.P();
                            if (zI4 || objP5 == cl5Var) {
                                k4p k4pVar2 = new k4p(1, h7pVar2, h7p.class, "onAction", "onAction(Lorg/xplatform/favorites/impl/presentation/clear/presentation/models/FavoriteClearAction;)V", 0, (byte) 7);
                                fetVar3.o0(k4pVar2);
                                objP5 = k4pVar2;
                            }
                            rcb.G(null, f7pVar, (Function1) ((jhy) objP5), fetVar3, 0);
                        } else {
                            fetVar3.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }, fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }
}
