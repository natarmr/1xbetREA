package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b0c0 extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1761a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0c0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f1761a = b;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fb  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        zic0 zic0Var;
        int i;
        int i2;
        Type typeN;
        Object value2;
        byte b = this.f1761a;
        pjc0 pjc0Var = pjc0.f27083a;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                ((org.xplatform.personal.impl.presentation.edit.n) this.receiver).C();
                return Unit.f46060a;
            case 1:
                ((org.xplatform.personal.impl.presentation.edit.n) this.receiver).C();
                return Unit.f46060a;
            case 2:
                ((hyc0) this.receiver).B();
                return Unit.f46060a;
            case 3:
                ((hyc0) this.receiver).c.B();
                return Unit.f46060a;
            case 4:
                ((hyc0) this.receiver).c.y();
                return Unit.f46060a;
            case 5:
                ((qyc0) this.receiver).c.B();
                return Unit.f46060a;
            case 6:
                ((qyc0) this.receiver).c.y();
                return Unit.f46060a;
            case 7:
                p7m0 p7m0Var = ((hjc0) this.receiver).j;
                do {
                    value = p7m0Var.getValue();
                    zic0Var = (zic0) value;
                } while (!p7m0Var.m(value, zic0.a(zic0Var, zic0Var.b > 0 && !zic0Var.d, 0, false, false, 14)));
                return Unit.f46060a;
            case 8:
                ((gkc0) this.receiver).w();
                return Unit.f46060a;
            case 9:
                gkc0 gkc0Var = (gkc0) this.receiver;
                p7m0 p7m0Var2 = gkc0Var.p;
                p7m0Var2.getClass();
                p7m0Var2.o(null, pjc0Var);
                p7m0 p7m0Var3 = gkc0Var.n;
                p7m0Var3.getClass();
                p7m0Var3.o(null, xjc0.f40979a);
                return Unit.f46060a;
            case 10:
                gkc0 gkc0Var2 = (gkc0) this.receiver;
                p7m0 p7m0Var4 = gkc0Var2.p;
                p7m0Var4.getClass();
                p7m0Var4.o(null, pjc0Var);
                gkc0Var2.w();
                return Unit.f46060a;
            case 11:
                gkc0 gkc0Var3 = (gkc0) this.receiver;
                gkc0Var3.getClass();
                sac.h0(jiu0.a(gkc0Var3), "PromoGamesHolderViewModel.onTechnicalDialogGameClick", 1, new ekc0(gkc0Var3, yjeVar, (byte) 2), gkc0Var3.i.b, new ppb0(gkc0Var3, (byte) 17), new ssa0(gkc0Var3, (byte) 25), 20);
                return Unit.f46060a;
            case 12:
                ((hyc0) this.receiver).B();
                return Unit.f46060a;
            case 13:
                ((hyc0) this.receiver).c.B();
                return Unit.f46060a;
            case 14:
                ((hyc0) this.receiver).c.y();
                return Unit.f46060a;
            case 15:
                ((doc0) this.receiver).c.B();
                return Unit.f46060a;
            case 16:
                sld0 sld0Var = (sld0) this.receiver;
                sld0Var.getClass();
                sac.V(jiu0.a(sld0Var), new ljc0((byte) 28), null, sld0Var.h.f22085a, new rld0(sld0Var, yjeVar, b2), 10);
                return Unit.f46060a;
            case 17:
                ere0 ere0Var = (ere0) this.receiver;
                ere0Var.getClass();
                List<hre0> parameters = ere0Var.getParameters();
                if (fre0.X(ere0Var)) {
                    Member memberB = ere0Var.x().b();
                    Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
                    if (constructor == null || !acb.V(constructor)) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
                int size = (ere0Var.isSuspend() ? 1 : 0) + parameters.size() + i;
                if (parameters.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (hre0 hre0Var : parameters) {
                        if (hre0Var.n() == aiy.d || hre0Var.n() == aiy.b) {
                            i2++;
                            if (i2 < 0) {
                                q3d.o();
                                throw null;
                            }
                        }
                    }
                }
                int i3 = ((i2 + i) + 31) / 32;
                Object[] objArr = new Object[size + i3 + 1];
                for (hre0 hre0Var2 : parameters) {
                    if (hre0Var2.q() && !xtt0.i(hre0Var2.p())) {
                        int iJ = hre0Var2.j();
                        kiy kiyVarP = hre0Var2.p();
                        kiyVarP.getClass();
                        if (kiyVarP instanceof v2) {
                            mre0 mre0Var = ((v2) kiyVarP).f36658a;
                            typeN = mre0Var != null ? (Type) mre0Var.invoke() : null;
                            if (typeN == null) {
                                typeN = f1t0.N(kiyVarP, false);
                            }
                        } else {
                            typeN = f1t0.N(kiyVarP, false);
                        }
                        objArr[iJ] = xtt0.f(typeN);
                    } else if (hre0Var2.u()) {
                        objArr[hre0Var2.j()] = fre0.M(hre0Var2.p());
                    }
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    objArr[size + i4] = 0;
                }
                return objArr;
            case 18:
                ((aqf0) this.receiver).C();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                vof0 vof0Var = (vof0) this.receiver;
                iiy[] iiyVarArr = vof0.O1;
                vof0Var.G0();
                return Unit.f46060a;
            case 20:
                aqf0 aqf0Var = (aqf0) this.receiver;
                aqf0Var.A = true;
                p7m0 p7m0Var5 = aqf0Var.F;
                do {
                    value2 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value2, jpf0.a((jpf0) value2, false, 13)));
                return Unit.f46060a;
            case 21:
                zdg0 zdg0Var = (zdg0) this.receiver;
                sje sjeVar = zdg0Var.f44213a;
                if (sjeVar == null) {
                    Intrinsics.h("coroutineScope");
                    throw null;
                }
                d5c.G(sjeVar, null);
                zdg0Var.d();
                tdg0 tdg0Var = zdg0Var.c;
                if (tdg0Var != null) {
                    tdg0Var.f.close();
                    return Unit.f46060a;
                }
                Intrinsics.h("connectionManager");
                throw null;
            case 22:
                aeg0 aeg0Var = (aeg0) this.receiver;
                sje sjeVar2 = aeg0Var.f727a;
                if (sjeVar2 == null) {
                    Intrinsics.h("coroutineScope");
                    throw null;
                }
                d5c.G(sjeVar2, null);
                aeg0Var.g();
                udg0 udg0Var = aeg0Var.e;
                if (udg0Var != null) {
                    udg0Var.f.close();
                    return Unit.f46060a;
                }
                Intrinsics.h("connectionManager");
                throw null;
            case 23:
                mog0 mog0Var = (mog0) this.receiver;
                iog0 iog0Var = new iog0(mog0Var.w());
                p7m0 p7m0Var6 = mog0Var.s;
                p7m0Var6.getClass();
                p7m0Var6.o(null, iog0Var);
                mog0Var.x();
                return Unit.f46060a;
            case 24:
                return Boolean.valueOf(((on4) this.receiver).b());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Boolean.valueOf(((on4) this.receiver).b());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                iph0 iph0Var = (iph0) this.receiver;
                iph0Var.x();
                v3c.N(iph0Var.F);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i1w0 i1w0Var = ((iph0) this.receiver).A;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((iph0) this.receiver).x();
                return Unit.f46060a;
            default:
                iph0 iph0Var2 = (iph0) this.receiver;
                bby bbyVar = iph0Var2.G;
                if (bbyVar == null || !bbyVar.isActive()) {
                    p7m0 p7m0Var7 = iph0Var2.D;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var7.getClass();
                    p7m0Var7.o(null, bool);
                    iph0Var2.G = sac.V(jiu0.a(iph0Var2), new jjh0(1, iph0Var2, iph0.class, "onError", "onError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, iph0Var2.s.f22085a, new fph0(iph0Var2, yjeVar, (byte) 4), 10);
                }
                return Unit.f46060a;
        }
    }
}
