package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r7y implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29999a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r7y(Object obj, Object obj2, byte b) {
        this.f29999a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f29999a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 0;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                y9a.y((b8y) obj4, (Function1) obj3, (fet) obj, x8x.L(9));
                return Unit.f46060a;
            case 1:
                ((Integer) obj2).getClass();
                y9a.z((c8y) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                y9a.D((String) obj4, (ArrayList) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                f6y f6yVar = (f6y) obj4;
                String str = ((xuf) obj3).f;
                f6yVar.getClass();
                str.getClass();
                return u7y.a((u7y) obj2, l7y.f19582a, q3d.j(new u6y(R.string.jackpot_hour, xdx.J(f6yVar.f9035a), str), new u6y(R.string.jackpot_day, xdx.J(f6yVar.b), str), new u6y(R.string.jackpot_week, xdx.J(f6yVar.c), str), new u6y(R.string.jackpot_month, xdx.J(f6yVar.d), str)), 0L, false, 2);
            case 4:
                yty ytyVar = (yty) obj4;
                mm40 mm40Var = (mm40) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else if (ytyVar instanceof wty) {
                    fetVar.e0(-309760890);
                    wty wtyVar = (wty) ytyVar;
                    wdx.a(mm40Var, wtyVar.f39766a, wtyVar.b, wtyVar.c, fetVar, 0);
                    fetVar.r(false);
                } else {
                    if (!(ytyVar instanceof xty)) {
                        throw b1j.f(-1256918666, fetVar, false);
                    }
                    fetVar.e0(-309386441);
                    yx7 yx7Var = gqw0.k;
                    xx7 xx7Var = gqw0.o;
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new gne(xx7Var, (byte) 12)), yx7Var, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    xty xtyVar = (xty) ytyVar;
                    String str2 = xtyVar.b;
                    String str3 = xtyVar.c;
                    zfn zfnVar = zaq0.b;
                    long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
                    long j = qmk.q;
                    y9a.h(x7zVar, str2, str3, textPrimary, j, j, g1t0.d(), fetVar, 3072, 0);
                    dww.c(a8k0.F(R.drawable.ic_glyph_arrow_right_mirrored, 0, fetVar), null, o7k0.n(s5x0.L(jm40.b, 2.0f, 0.0f, 2), 12.0f), ((ThemeColors) fetVar.k(zfnVar)).getSecondary60(), fetVar, 56, 0);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    y9a.h(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false), xtyVar.f41486a, xtyVar.c, xtyVar.d, j, j, g1t0.d(), fetVar, 3072, 0);
                    fetVar.r(true);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                ydx.d((mm40) obj4, (duy) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                y1z y1zVar = (y1z) obj4;
                Function1 function1 = (Function1) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    w1z w1zVar = (w1z) y1zVar;
                    boolean zG = fetVar2.g(function1) | fetVar2.g(y1zVar);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new h2z(function1, y1zVar, (byte) 1);
                        fetVar2.o0(objP);
                    }
                    hkb.s(w1zVar, (Function1) objP, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 7:
                k7z k7zVar = (k7z) obj4;
                Function2 function2 = (Function2) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    Boolean bool = (Boolean) ((hgk0) k7zVar.g).getValue();
                    boolean zBooleanValue = bool.booleanValue();
                    fetVar3.h0(bool);
                    boolean zH = fetVar3.h(zBooleanValue);
                    if (zBooleanValue) {
                        function2.invoke(fetVar3, 0);
                    } else {
                        if (fetVar3.l != 0) {
                            ykd.a("No nodes can be emitted before calling deactivateToEndGroup");
                        }
                        if (!fetVar3.S) {
                            if (zH) {
                                p9k0 p9k0Var = fetVar3.G;
                                int i = p9k0Var.g;
                                int i2 = p9k0Var.h;
                                vkd vkdVar = fetVar3.M;
                                vkdVar.getClass();
                                vkdVar.d(false);
                                vkdVar.b.f29108a.c0(mz70.d);
                                cwr0.R(i, i2, fetVar3.s);
                                fetVar3.G.t();
                            } else {
                                fetVar3.W();
                            }
                        }
                    }
                    if (fetVar3.y && fetVar3.G.i == fetVar3.z) {
                        fetVar3.z = -1;
                        fetVar3.y = false;
                    }
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 8:
                ngv ngvVar = (ngv) obj4;
                sw3 sw3Var = (sw3) obj3;
                w6k w6kVar = (w6k) obj;
                p4e p4eVar = (p4e) obj2;
                if (p4e.h(p4eVar.f26347a) == Integer.MAX_VALUE) {
                    adx.a("LazyHorizontalGrid's height should be bound by parent.");
                }
                int iH = p4e.h(p4eVar.f26347a);
                int[] iArrK0 = CollectionsKt.K0(ngvVar.a(iH, w6kVar.T(sw3Var.a())));
                int[] iArr = new int[iArrK0.length];
                sw3Var.c(w6kVar, iH, iArrK0, iArr);
                return new v8z(iArrK0, iArr);
            case 9:
                ngv ngvVar2 = (ngv) obj4;
                ow3 ow3Var = (ow3) obj3;
                w6k w6kVar2 = (w6k) obj;
                p4e p4eVar2 = (p4e) obj2;
                if (p4e.i(p4eVar2.f26347a) == Integer.MAX_VALUE) {
                    adx.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int i3 = p4e.i(p4eVar2.f26347a);
                int[] iArrK1 = CollectionsKt.K0(ngvVar2.a(i3, w6kVar2.T(ow3Var.a())));
                int[] iArr2 = new int[iArrK1.length];
                ow3Var.b(w6kVar2, i3, iArrK1, k6z.f17794a, iArr2);
                return new v8z(iArrK1, iArr2);
            case 10:
                gbz gbzVar = (gbz) obj4;
                fbz fbzVar = (fbz) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    hbz hbzVar = (hbz) gbzVar.b.invoke();
                    int iC = fbzVar.c;
                    Object obj5 = fbzVar.f9284a;
                    if ((iC >= hbzVar.b() || !hbzVar.d(iC).equals(obj5)) && (iC = hbzVar.c(obj5)) != -1) {
                        fbzVar.c = iC;
                    }
                    int i4 = iC;
                    if (i4 != -1) {
                        fetVar4.e0(-1664741271);
                        e9x.C(hbzVar, gbzVar.f11034a, i4, fbzVar.f9284a, fetVar4, 0);
                        fetVar4.r(false);
                    } else {
                        fetVar4.e0(-1664505826);
                        fetVar4.r(false);
                    }
                    boolean zI = fetVar4.i(fbzVar);
                    Object objP2 = fetVar4.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new ebz(fbzVar, b2);
                        fetVar4.o0(objP2);
                    }
                    m0x0.o(obj5, (Function1) objP2, fetVar4);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 11:
                return ((ibz) obj3).a(new jbz((gbz) obj4, (c5n0) obj), ((p4e) obj2).f26347a);
            case 12:
                ugd ugdVar = (ugd) obj4;
                ldz ldzVar = (ldz) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ugdVar.F(ldzVar, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 13:
                ((Integer) obj2).getClass();
                tfx.b((g2h) obj4, (l2h) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 14:
                ((Integer) obj2).getClass();
                oja0.G((ftz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                ffb0.y((cvz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                ro4.L((dwz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                ((Integer) obj2).getClass();
                x4d0.O((iyz) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 18:
                ((Integer) obj2).getClass();
                unh0.D((h000) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                ccq0.E((m400) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 20:
                ((Integer) obj2).getClass();
                x1x.d((mm40) obj4, (cye) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Integer) obj2).getClass();
                x1x.f((yw00) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 22:
                ((Integer) obj2).getClass();
                x1x.c((mm40) obj4, (m820) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 23:
                ((Integer) obj2).getClass();
                n6x.a((mm40) obj4, (hp00) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 24:
                Throwable th = (Throwable) obj4;
                xm00 xm00Var = (xm00) obj3;
                String strA = (String) obj2;
                if ((th instanceof SocketTimeoutException) || (th instanceof SocketException) || (th instanceof UnknownHostException)) {
                    strA = xm00Var.c.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0));
                }
                p7m0 p7m0Var = xm00Var.g;
                qm00 qm00Var = new qm00(strA);
                p7m0Var.getClass();
                p7m0Var.o(null, qm00Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                kh3 kh3Var = (kh3) obj4;
                fnf0 fnf0Var = (fnf0) obj3;
                cp00 cp00Var = (cp00) obj2;
                ((oyg0) obj).getClass();
                cp00Var.getClass();
                List<npm0> list = cp00Var.d;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (npm0 npm0Var : list) {
                    if (npm0Var.f23921a == kh3Var) {
                        List<mpm0> list2 = npm0Var.b;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (mpm0 mpm0VarA : list2) {
                            if (Intrinsics.d(mpm0VarA.f22186a, fnf0Var)) {
                                mpm0VarA = mpm0.a(mpm0VarA);
                            }
                            arrayList2.add(mpm0VarA);
                        }
                        npm0Var = new npm0(npm0Var.f23921a, arrayList2);
                    }
                    arrayList.add(npm0Var);
                }
                return cp00.a(cp00Var, null, arrayList, null, null, null, null, false, false, 131063);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                p7x.a((mm40) obj4, (lp00) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                h8x.i((dy00) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj2).getClass();
                e9x.i((n010) obj4, (mm40) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                k9x.d((m010) obj4, (mm40) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ r7y(Object obj, Object obj2, int i, byte b) {
        this.f29999a = b;
        this.c = obj;
        this.b = obj2;
    }
}
