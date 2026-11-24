package a;

import android.javax.sip.message.Response;
import android.view.Window;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xh20 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40869a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xh20(Object obj, boolean z, byte b) {
        this.f40869a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        float f;
        byte b = this.f40869a;
        boolean z = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                BigDecimal bigDecimal = (BigDecimal) obj3;
                a820 a820Var = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var.getClass();
                hx4 hx4Var = a820Var.g;
                yyc yycVarA = hx4Var.b;
                if (z) {
                    bigDecimal.getClass();
                    yycVarA = yyc.a(yycVarA, bigDecimal, bigDecimal, false, false, 124);
                }
                return a820.a(a820Var, null, null, null, null, null, hx4.a(hx4Var, null, yycVarA, null, null, null, false, 61), null, false, null, 0.0f, false, null, 0, false, false, false, 262079);
            case 1:
                a820 a820Var2 = (a820) obj2;
                ((oyg0) obj).getClass();
                a820Var2.getClass();
                pvj0 pvj0Var = a820Var2.e;
                return a820.a(a820Var2, null, null, null, pvj0.a(pvj0Var, bx6.a(pvj0Var.f27665a, (a8q0) obj3, null, z, 2), null, null, null, null, false, 62), null, null, null, false, null, 0.0f, false, null, 0, false, false, false, 262127);
            case 2:
                dz20 dz20Var = (dz20) obj2;
                return dz20.a(dz20Var, null, null, null, z ? null : dz20Var.d, null, null, false, null, null, sf6.a(dz20Var.k, (ol6) obj3, 2), dz20Var.l || z, 1015);
            case 3:
                ((Integer) obj2).getClass();
                piz.l((wn5) obj3, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                x9x.y(z, (ci40) obj3, (fet) obj, x8x.L(7));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                e9x.k((d280) obj3, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                xb70 xb70Var = (xb70) obj2;
                fa70 fa70Var = xb70Var.n;
                boolean z2 = this.b;
                return xb70.a(xb70Var, null, null, null, false, false, false, false, false, null, false, false, 0, false, fa70.a(fa70Var, false, false, false, z2, 0L, false, false, false, Response.SESSION_PROGRESS), f970.a(xb70Var.o, false, false, !z2, 0.0d, false, false, false, 123), c970.a(xb70Var.p, false, (csr) obj3, null, 13), null, 73727);
            case 7:
                ((Integer) obj2).getClass();
                ucx.w((qdm0) obj3, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                ucx.P((udm0) obj3, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                ucx.A((vdm0) obj3, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ((Integer) obj2).getClass();
                ucx.u((sdm0) obj3, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                FeedsChampsItemsSelectionState feedsChampsItemsSelectionState = (FeedsChampsItemsSelectionState) obj3;
                oyg0 oyg0Var = (oyg0) obj;
                gua0 gua0Var = (gua0) obj2;
                oyg0Var.getClass();
                gua0Var.getClass();
                q7x.F(oyg0Var, feedsChampsItemsSelectionState, "SELECTION_STATE_KEY");
                boolean z3 = this.b;
                q7x.F(oyg0Var, Boolean.valueOf(z3), "KEY_MULTISELECT_ACTIVE_STATE");
                return gua0.a(gua0Var, null, null, null, null, null, false, false, null, false, feedsChampsItemsSelectionState, z3, 32767);
            case 12:
                vhc0 vhc0Var = (vhc0) obj3;
                u2b0 u2b0Var = (u2b0) obj2;
                List<Object> list = u2b0Var.l;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (Object ve40Var : list) {
                    if (ve40Var instanceof ve40) {
                        ve40Var = z ? new ve40(zxx.f45180a) : new ve40(new cyx(vhc0Var));
                    }
                    arrayList.add(ve40Var);
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList, 2047);
            case 13:
                ((Integer) obj2).getClass();
                m2x.e(x8x.L(1), (fet) obj, (Function2) obj3, z);
                return Unit.f46060a;
            case 14:
                sec0 sec0Var = (sec0) obj3;
                Throwable th = (Throwable) obj;
                String str = (String) obj2;
                th.getClass();
                str.getClass();
                if (hic.C(th)) {
                    sec0Var.G(hec0.f12917a);
                } else if (z) {
                    sec0Var.G(new gec0(sec0Var.v.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), str));
                }
                return Unit.f46060a;
            case 15:
                aqc0 aqc0Var = (aqc0) obj3;
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                if (z) {
                    aqc0Var.x.f(str2);
                }
                return Unit.f46060a;
            case 16:
                shc0 shc0Var = (shc0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    fetVar.X();
                } else {
                    if (z) {
                        fetVar.e0(-1569862387);
                        if (shc0Var != null) {
                            if (shc0Var instanceof qhc0) {
                                fetVar.e0(-881922616);
                                qhc0 qhc0Var = (qhc0) shc0Var;
                                q0x.G(0, fetVar, null, qhc0Var.b, qhc0Var.f28731a);
                                fetVar.r(false);
                            } else if (shc0Var instanceof rhc0) {
                                fetVar.e0(-881916239);
                                rhc0 rhc0Var = (rhc0) shc0Var;
                                q0x.o(null, rhc0Var.b, rhc0Var.f30484a, fetVar, 0);
                                fetVar.r(false);
                            }
                            fetVar.r(false);
                        }
                        throw b1j.f(-881924715, fetVar, false);
                    }
                    fetVar.e0(-1569427581);
                    fetVar.r(false);
                }
                return Unit.f46060a;
            case 17:
                dtc0 dtc0Var = (dtc0) obj3;
                Throwable th2 = (Throwable) obj;
                String str3 = (String) obj2;
                th2.getClass();
                str3.getClass();
                if (hic.C(th2)) {
                    dtc0Var.G(nsc0.f24045a);
                } else if (z) {
                    dtc0Var.G(new msc0(dtc0Var.p.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), str3));
                }
                return Unit.f46060a;
            case 18:
                m2c0 m2c0Var = (m2c0) obj3;
                tcj0 tcj0Var = (tcj0) obj2;
                ((oyg0) obj).getClass();
                tcj0Var.getClass();
                boolean z4 = m2c0Var.b0;
                return tcj0.a(tcj0Var, false, false, null, null, null, null, false, null, false, this.b, null, null, false, false, false, false, z4, false, z4, false, null, false, false, m2c0Var.s0, false, 0, false, null, false, false, 0, -139464705, 2097151);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                hpn0 hpn0Var = (hpn0) obj3;
                gvn0 gvn0Var = (gvn0) obj2;
                ((oyg0) obj).getClass();
                gvn0Var.getClass();
                List<hpn0> list2 = gvn0Var.f;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (hpn0 hpn0VarA : list2) {
                    if (Intrinsics.d(hpn0VarA, hpn0Var)) {
                        hpn0VarA = hpn0.a(hpn0Var, z);
                    }
                    arrayList2.add(hpn0VarA);
                }
                return gvn0.a(gvn0Var, false, false, false, false, null, arrayList2, null, 223);
            case 20:
                ((Integer) obj2).getClass();
                ofm0.d((pop0) obj3, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 21:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((tpq0) obj3).x(z);
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ((yqq0) obj3).x(z);
                return Unit.f46060a;
            case 23:
                ugd ugdVar = (ugd) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (z) {
                        zcl zclVar = qmk.f28987a;
                        f = 0.0f;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        f = 8.0f;
                    }
                    ugdVar.F(o7k0.w(o7k0.d(s5x0.M(jm40.b, xfn.a(fetVar2).d, f, xfn.a(fetVar2).d, z ? 0.0f : 16.0f), 1.0f), null, false, 3), fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 24:
                vgs0 vgs0Var = (vgs0) obj3;
                lk80 lk80Var = (lk80) obj;
                List list3 = (List) obj2;
                lk80Var.getClass();
                list3.getClass();
                boolean z5 = lk80Var != lk80.b;
                vgs0Var.getClass();
                ags0 ags0Var = z5 ? null : (ags0) CollectionsKt.f0(list3);
                int i = z ? 150 : 30;
                if (z5) {
                    i *= 2;
                }
                return new wgs0(i, ags0Var != null ? Long.valueOf(ags0Var.f841a) : null, ags0Var != null ? Long.valueOf(ags0Var.b) : null, z);
            default:
                ((Integer) obj2).getClass();
                lvm0.a((Window) obj3, z, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ xh20(Object obj, boolean z, int i, byte b) {
        this.f40869a = b;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ xh20(boolean z, Object obj, byte b) {
        this.f40869a = b;
        this.b = z;
        this.c = obj;
    }

    public /* synthetic */ xh20(boolean z, Object obj, int i, byte b) {
        this.f40869a = b;
        this.b = z;
        this.c = obj;
    }
}
