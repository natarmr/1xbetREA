package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zw8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45094a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zw8(mm40 mm40Var, a4x a4xVar, ebo0 ebo0Var, l7m0 l7m0Var, Function1 function1, int i, int i2) {
        this.f45094a = (byte) 10;
        this.b = mm40Var;
        this.e = a4xVar;
        this.f = ebo0Var;
        this.d = l7m0Var;
        this.g = function1;
        this.c = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        lh80 lh80VarU;
        fet fetVar;
        byte b = this.f45094a;
        jm40 jm40Var = jm40.b;
        pcy pcyVar = e7z.u1;
        Object obj3 = this.b;
        Object obj4 = this.d;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                hmw0.K((mm40) obj3, (List) obj7, (d9z) obj6, this.c, (Function1) obj5, (Function0) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                jd8.n((mm40) obj3, this.c, (Function0) obj4, (Function0) obj7, (Function0) obj6, (Function0) obj5, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                e3c.f((mm40) obj3, (String) obj7, (y9q0) obj6, (String) obj5, this.c, (String) obj4, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 3:
                k6z k6zVar = (k6z) obj3;
                sfh0 sfh0Var = (sfh0) obj7;
                String str = (String) obj6;
                k6z k6zVar2 = (k6z) obj5;
                Function2 function2 = (Function2) obj4;
                fet fetVar2 = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z = this.c;
                    boolean zH = fetVar2.h(z) | fetVar2.e(k6zVar.ordinal());
                    Object objP = fetVar2.P();
                    if (zH || objP == ukd.f35823a) {
                        if (!z) {
                            lh80VarU = s5x0.t(0.0f, 0.0f, 3);
                        } else if (k6zVar == k6z.b) {
                            zcl zclVar = qmk.f28987a;
                            lh80VarU = s5x0.u(12.0f, 0.0f, 0.0f, 0.0f, 14);
                        } else {
                            zcl zclVar2 = qmk.f28987a;
                            lh80VarU = s5x0.u(0.0f, 0.0f, 12.0f, 0.0f, 11);
                        }
                        objP = lh80VarU;
                        fetVar2.o0(objP);
                    }
                    mm40 mm40VarI = s5x0.I(jm40Var, (hh80) objP);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    mm40 mm40VarE0 = o2e.e0(mm40VarI.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), "BOX_SEARCH_TEXT");
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    if (z) {
                        fetVar2.e0(1808274876);
                        v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, sfh0Var.c(fetVar2), fetVar2, 0, 24960, 110590);
                        fetVar = fetVar2;
                        fetVar.r(false);
                    } else {
                        fetVar = fetVar2;
                        fetVar.e0(1808493581);
                        fetVar.r(false);
                    }
                    obc.d(bmd.n.a(k6zVar2), u1c.M(-12500747, new d8m((Object) k6zVar2, (Object) k6zVar, (Object) function2, (byte) 13), fetVar), fetVar, 56);
                    fetVar.r(true);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                ohq0.L((mm40) obj3, (gvm) obj7, (gvm) obj6, (String) obj5, (mpm) obj4, this.c, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ivm ivmVar = (ivm) obj3;
                ivm ivmVar2 = (ivm) obj7;
                mpm mpmVar = (mpm) obj6;
                a4x a4xVar = (a4x) obj5;
                String str2 = (String) obj4;
                fet fetVar3 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dub.S(null, ivmVar, ivmVar2, mpmVar, this.c, fetVar3, 0);
                    if (!a4xVar.isEmpty() || str2.length() > 0) {
                        fetVar3.e0(1610620076);
                        dub.e(0, fetVar3, a4xVar, null, str2);
                        fetVar3.r(false);
                    } else {
                        fetVar3.e0(1610779602);
                        fetVar3.r(false);
                    }
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 6:
                kvm kvmVar = (kvm) obj3;
                kvm kvmVar2 = (kvm) obj7;
                a2m a2mVar = (a2m) obj6;
                a4x a4xVar2 = (a4x) obj5;
                String str3 = (String) obj4;
                fet fetVar4 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    jwb.w(null, kvmVar, kvmVar2, a2mVar, this.c, fetVar4, 0);
                    if (!a4xVar2.isEmpty() || str3.length() > 0) {
                        fetVar4.e0(-1335725631);
                        jwb.a(0, fetVar4, a4xVar2, null, str3);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-1335566105);
                        fetVar4.r(false);
                    }
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                qzb.G((mm40) obj3, (String) obj7, (a4x) obj6, (String) obj5, (String) obj4, this.c, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                mm40 mm40Var = (mm40) obj3;
                m2n m2nVar = (m2n) obj7;
                y1m y1mVar = (y1m) obj6;
                String str4 = (String) obj5;
                m2n m2nVar2 = (m2n) obj4;
                fet fetVar5 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar5, 0);
                    int iHashCode2 = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM2 = fetVar5.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarN);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        fetVar5.l(pcyVar);
                    } else {
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, thg0VarA, gqw0.x);
                    jpm0.o(fetVar5, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar5, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar5);
                    jpm0.o(fetVar5, mm40VarC1, gqw0.v);
                    zhg0 zhg0Var = zhg0.f44392a;
                    qbc.A(zhg0Var.a(1.0f, jm40Var, true), m2nVar, false, fetVar5, 384);
                    qbc.b(0, y1mVar, fetVar5, zhg0Var.a(1.0f, jm40Var, true), str4, this.c);
                    qbc.A(zhg0Var.a(1.0f, jm40Var, true), m2nVar2, true, fetVar5, 384);
                    fetVar5.r(true);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                vtb.B((mm40) obj3, (uqv) obj7, this.c, (cml) obj6, (Function1) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                q5x.h((mm40) obj3, (a4x) obj7, (ebo0) obj6, (l7m0) obj4, (Function1) obj5, (fet) obj, x8x.L(1), this.c ? 1 : 0);
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                piz.k((mm40) obj3, (c530) obj7, this.c, (Function0) obj4, (Function1) obj5, (Function0) obj6, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                ((Integer) obj2).getClass();
                o050.l((mm40) obj3, (w2d) obj7, this.c, (ArrayList) obj6, (xdr) obj4, (Function1) obj5, (fet) obj, x8x.L(65));
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                b34.F((mm40) obj3, (String) obj7, this.c, (g890) obj6, (Function1) obj5, (Function1) obj4, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                zgc.C((mm40) obj3, (y9f0) obj7, this.c, (rv2) obj6, (cqq) obj4, (Function1) obj5, (fet) obj, x8x.L(24577));
                return Unit.f46060a;
            case 15:
                ql5 ql5Var = (ql5) obj3;
                m2c0 m2c0Var = (m2c0) obj7;
                pfj0 pfj0Var = (pfj0) obj2;
                String str5 = ql5Var.m;
                pn40 pn40Var = pn40.f27267a;
                String strC = pn40.c(ql5Var.b, p3u0.c);
                String str6 = ql5Var.f;
                boolean z2 = m2c0Var.b0;
                return pfj0.a(pfj0Var, false, false, null, (String) obj6, (String) obj5, str5, strC, str6, null, false, this.c, (jph0) obj4, null, false, false, false, false, z2, false, z2, false, null, false, false, m2c0Var.s0, false, 0, false, false, 0, -69736945, 1015807);
            case 16:
                String str7 = (String) obj7;
                wdk0 wdk0Var = (wdk0) obj6;
                sek0 sek0Var = (sek0) obj5;
                Fragment fragment = (Fragment) obj4;
                Bundle bundle = (Bundle) obj2;
                if (!h97.B(bundle, (String) obj, (String) obj3)) {
                    return Unit.f46060a;
                }
                if (bundle.getBoolean(str7)) {
                    String strH = fragment.H(R.string.subscription_settings_updated);
                    strH.getClass();
                    wdk0.k(wdk0Var, new xdk0(sek0Var, strH, null, null, null, Integer.valueOf(R.drawable.ic_snack_push), 92), fragment, null, null, this.c, null, 1004);
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                k5n0.m((String) obj7, (String) obj6, (String) obj5, this.c, (String) obj4, (mm40) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ zw8(mm40 mm40Var, c530 c530Var, boolean z, Function0 function0, Function1 function1, Function0 function2, int i) {
        this.f45094a = (byte) 11;
        this.b = mm40Var;
        this.e = c530Var;
        this.c = z;
        this.d = function0;
        this.g = function1;
        this.f = function2;
    }

    public /* synthetic */ zw8(mm40 mm40Var, Object obj, Object obj2, String str, Object obj3, boolean z, int i, byte b) {
        this.f45094a = b;
        this.b = mm40Var;
        this.e = obj;
        this.f = obj2;
        this.g = str;
        this.d = obj3;
        this.c = z;
    }

    public /* synthetic */ zw8(mm40 mm40Var, Object obj, boolean z, Object obj2, Object obj3, Function1 function1, int i, byte b) {
        this.f45094a = b;
        this.b = mm40Var;
        this.e = obj;
        this.c = z;
        this.f = obj2;
        this.d = obj3;
        this.g = function1;
    }

    public /* synthetic */ zw8(mm40 mm40Var, Object obj, boolean z, Object obj2, Function1 function1, Function1 function2, int i, byte b) {
        this.f45094a = b;
        this.b = mm40Var;
        this.e = obj;
        this.c = z;
        this.f = obj2;
        this.g = function1;
        this.d = function2;
    }

    public /* synthetic */ zw8(mm40 mm40Var, String str, y9q0 y9q0Var, String str2, boolean z, String str3, int i) {
        this.f45094a = (byte) 2;
        this.b = mm40Var;
        this.e = str;
        this.f = y9q0Var;
        this.g = str2;
        this.c = z;
        this.d = str3;
    }

    public /* synthetic */ zw8(mm40 mm40Var, List list, d9z d9zVar, boolean z, Function1 function1, Function0 function0, int i) {
        this.f45094a = (byte) 0;
        this.b = mm40Var;
        this.e = list;
        this.f = d9zVar;
        this.c = z;
        this.g = function1;
        this.d = function0;
    }

    public /* synthetic */ zw8(mm40 mm40Var, boolean z, Function0 function0, Function0 function1, Function0 function2, Function0 function3, int i) {
        this.f45094a = (byte) 1;
        this.b = mm40Var;
        this.c = z;
        this.d = function0;
        this.e = function1;
        this.f = function2;
        this.g = function3;
    }

    public /* synthetic */ zw8(Object obj, Object obj2, Object obj3, String str, boolean z, Object obj4, byte b) {
        this.f45094a = b;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = str;
        this.c = z;
        this.d = obj4;
    }

    public /* synthetic */ zw8(Object obj, Object obj2, Object obj3, boolean z, a4x a4xVar, String str, byte b) {
        this.f45094a = b;
        this.b = obj;
        this.e = obj2;
        this.f = obj3;
        this.c = z;
        this.g = a4xVar;
        this.d = str;
    }

    public /* synthetic */ zw8(String str, String str2, wdk0 wdk0Var, sek0 sek0Var, Fragment fragment, boolean z) {
        this.f45094a = (byte) 16;
        this.b = str;
        this.e = str2;
        this.f = wdk0Var;
        this.g = sek0Var;
        this.d = fragment;
        this.c = z;
    }

    public /* synthetic */ zw8(String str, String str2, String str3, boolean z, String str4, mm40 mm40Var, int i) {
        this.f45094a = (byte) 17;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.c = z;
        this.d = str4;
        this.b = mm40Var;
    }

    public /* synthetic */ zw8(boolean z, k6z k6zVar, sfh0 sfh0Var, String str, k6z k6zVar2, Function2 function2) {
        this.f45094a = (byte) 3;
        this.c = z;
        this.b = k6zVar;
        this.e = sfh0Var;
        this.f = str;
        this.g = k6zVar2;
        this.d = function2;
    }
}
