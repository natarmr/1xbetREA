package a;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.net.Uri;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeVideoEvent;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeZoneEvent;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneWebView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class yp6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp6(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    private final Object G(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (((iwa) ((jwa) this.j)).f15479a.getTime() <= System.currentTimeMillis()) {
            ((Function0) this.k).invoke();
        }
        return Unit.f46060a;
    }

    private final Object H(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ((h2b) this.j).U.f((y1b) this.k);
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        ts8 ts8Var;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        es8 es8Var = (es8) this.j;
        a1m0 a1m0Var = (a1m0) this.k;
        zr8 zr8Var = es8Var.f8317a;
        List list = a1m0Var.f77a;
        IntRange intRangeH = q3d.h(list);
        ArrayList arrayList = new ArrayList(r3d.q(intRangeH, 10));
        Iterator it = intRangeH.iterator();
        while (true) {
            if (!((kkx) it).c) {
                break;
            }
            ((bkx) it).nextInt();
            arrayList.add(new rr8(false, new wr8(0.0f)));
        }
        zr8Var.D = arrayList;
        zr8Var.E = iun.f15405a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = zr8Var.D.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new sr8(y0x0.L(((rr8) it2.next()).b, zr8Var.c, zr8Var.e)));
        }
        zr8Var.E = arrayList2;
        vs8 vs8Var = zr8Var.i;
        if (vs8Var != null) {
            zr8Var.l(vs8Var.f37937a);
        }
        bs8 bs8Var = zr8Var.b;
        a1m0 a1m0Var2 = a1m0Var.d;
        int size = list.size();
        int i = size - 1;
        List list2 = (List) a1m0Var.c.get(list.get(i));
        pab pabVar = list2 != null ? (pab) CollectionsKt.firstOrNull(list2) : null;
        if (a1m0Var2 != null) {
            List list3 = a1m0Var2.f77a;
            int size2 = list3.size() - 1;
            List list4 = (List) a1m0Var2.c.get(list3.get(size2));
            pab pabVar2 = list4 != null ? (pab) CollectionsKt.firstOrNull(list4) : null;
            ts8Var = new ts8(iun.f15405a, pabVar2 != null ? bs8Var.a(pabVar2.f26648a, pabVar2.d) : 92, pabVar2, (String) list3.get(size2), null);
        } else {
            ts8Var = null;
        }
        zr8Var.l(new ts8(zr8Var.d(a1m0Var, size - 2, 0), pabVar != null ? bs8Var.a(pabVar.f26648a, pabVar.d) : 92, pabVar, (String) list.get(i), ts8Var));
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        y59 y59Var = (y59) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        r59 r59Var = (r59) this.k;
        cl5 cl5Var = r59.P1;
        if (Intrinsics.d(y59Var, w59.f38572a)) {
            ii iiVar = r59Var.L1;
            if (iiVar == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH = r59Var.H(R.string.broadcast_binding_phone_description);
            String strH2 = r59Var.H(R.string.bind);
            strH2.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) null, (CharSequence) strH, (CharSequence) strH2, r59Var.H(R.string.close), (String) null, "REQUEST_BIND_PHONE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1489);
            androidx.fragment.app.e eVarC = r59Var.C();
            eVarC.getClass();
            iiVar.d(dialogFields, eVarC);
        } else if (Intrinsics.d(y59Var, v59.f36817a)) {
            ii iiVar2 = r59Var.L1;
            if (iiVar2 == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH3 = r59Var.H(R.string.broadcast_activation_phone_number_description);
            String strH4 = r59Var.H(R.string.activate);
            strH4.getClass();
            DialogFields dialogFields2 = new DialogFields((CharSequence) null, (CharSequence) strH3, (CharSequence) strH4, r59Var.H(R.string.close), (String) null, "REQUEST_ACTIVATE_PHONE_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1489);
            androidx.fragment.app.e eVarC2 = r59Var.C();
            eVarC2.getClass();
            iiVar2.d(dialogFields2, eVarC2);
        } else if (Intrinsics.d(y59Var, x59.f40303a)) {
            r59Var.H0(BroadcastingLandscapeVideoEvent.Stop.f46694a);
        } else if (y59Var instanceof t59) {
            if (Settings.canDrawOverlays(r59Var.o0())) {
                r59Var.H0(BroadcastingLandscapeVideoEvent.Windowed.f46695a);
                ((t59) y59Var).f33356a.invoke();
            } else {
                Context contextO0 = r59Var.o0();
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + contextO0.getPackageName()));
                if (contextO0.getPackageManager().resolveActivity(intent, 0) != null) {
                    intent.setFlags(268435456);
                    contextO0.startActivity(intent);
                }
            }
        } else {
            if (!Intrinsics.d(y59Var, u59.f35084a)) {
                t9f.b();
                return null;
            }
            r59Var.H0(BroadcastingLandscapeVideoEvent.Fullscreen.f46693a);
        }
        r59Var.G0().x(w49.f38533a);
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        GameZoneWebView gameZoneWebView = (GameZoneWebView) this.j;
        if (gameZoneWebView != null) {
            y3w0 y3w0Var = (y3w0) this.k;
            if (y3w0Var.b) {
                if (y3w0Var.e == y3w0Var.f) {
                    return Unit.f46060a;
                }
                String str = y3w0Var.d;
                str.getClass();
                gameZoneWebView.c(str);
                return Unit.f46060a;
            }
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        hdj hdjVar = (hdj) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (!((Boolean) ((l7m0) this.k).getValue()).booleanValue() && hdjVar.a() != null) {
            hdjVar.d.setValue(null);
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        r9a r9aVar = (r9a) this.j;
        if (r9aVar != null) {
            r9aVar.n();
        }
        jnu0 jnu0Var = (jnu0) this.k;
        if (jnu0Var != null) {
            jnu0Var.a(null);
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return ((ix9) this.j).a((String) this.k);
    }

    private final Object x(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ((d4a) this.j).i.f((a1k0) this.k);
        return Unit.f46060a;
    }

    private final Object y(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        fua fuaVar = (fua) this.j;
        udl0 udl0Var = (udl0) this.k;
        List list = fua.e;
        return fuaVar.a(udl0Var);
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                yp6 yp6Var = new yp6((zp6) obj2, yjeVar, (byte) 0);
                yp6Var.j = obj;
                return yp6Var;
            case 1:
                return new yp6((as6) this.j, (d9a0) obj2, yjeVar, (byte) 1);
            case 2:
                return new yp6((as6) this.j, (ojp0) obj2, yjeVar, (byte) 2);
            case 3:
                yp6 yp6Var2 = new yp6((as6) obj2, yjeVar, (byte) 3);
                yp6Var2.j = obj;
                return yp6Var2;
            case 4:
                yp6 yp6Var3 = new yp6((ou6) obj2, yjeVar, (byte) 4);
                yp6Var3.j = obj;
                return yp6Var3;
            case 5:
                yp6 yp6Var4 = new yp6((hz6) obj2, yjeVar, (byte) 5);
                yp6Var4.j = obj;
                return yp6Var4;
            case 6:
                return new yp6((b07) this.j, (xz6) obj2, yjeVar, (byte) 6);
            case 7:
                yp6 yp6Var5 = new yp6((ke7) obj2, yjeVar, (byte) 7);
                yp6Var5.j = obj;
                return yp6Var5;
            case 8:
                yp6 yp6Var6 = new yp6((ze7) obj2, yjeVar, (byte) 8);
                yp6Var6.j = obj;
                return yp6Var6;
            case 9:
                return new yp6((uf7) this.j, (rf7) obj2, yjeVar, (byte) 9);
            case 10:
                return new yp6((mp7) this.j, (w2d) obj2, yjeVar, (byte) 10);
            case 11:
                return new yp6((yy7) this.j, (p18) obj2, yjeVar, (byte) 11);
            case 12:
                return new yp6((d48) this.j, (Throwable) obj2, yjeVar, (byte) 12);
            case 13:
                yp6 yp6Var7 = new yp6((ld8) obj2, yjeVar, (byte) 13);
                yp6Var7.j = obj;
                return yp6Var7;
            case 14:
                return new yp6((vl8) this.j, (ni8) obj2, yjeVar, (byte) 14);
            case 15:
                yp6 yp6Var8 = new yp6((jj8) obj2, yjeVar, (byte) 15);
                yp6Var8.j = obj;
                return yp6Var8;
            case 16:
                yp6 yp6Var9 = new yp6((km8) obj2, yjeVar, (byte) 16);
                yp6Var9.j = obj;
                return yp6Var9;
            case 17:
                return new yp6((es8) this.j, (a1m0) obj2, yjeVar, (byte) 17);
            case 18:
                return new yp6((s29) this.j, (String) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                yp6 yp6Var10 = new yp6((r59) obj2, yjeVar, (byte) 19);
                yp6Var10.j = obj;
                return yp6Var10;
            case 20:
                yp6 yp6Var11 = new yp6((j79) obj2, yjeVar, (byte) 20);
                yp6Var11.j = obj;
                return yp6Var11;
            case 21:
                return new yp6((GameZoneWebView) this.j, (y3w0) obj2, yjeVar, (byte) 21);
            case 22:
                return new yp6((hdj) this.j, (l7m0) obj2, yjeVar, (byte) 22);
            case 23:
                return new yp6((r9a) this.j, (jnu0) obj2, yjeVar, (byte) 23);
            case 24:
                return new yp6((ix9) this.j, (String) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new yp6((d4a) this.j, (a1k0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new yp6((fua) this.j, (udl0) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new yp6((jwa) this.j, (Function0) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new yp6((h2b) this.j, (y1b) obj2, yjeVar, (byte) 28);
            default:
                return new yp6((y7b) this.j, (xvm0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yp6) create((l720) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((yp6) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((yp6) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((yp6) create((xz6) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((yp6) create((rf7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((yp6) create((gf7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((yp6) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((yp6) create((xj8) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((yp6) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((yp6) create((y59) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((yp6) create((n79) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((yp6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yp6) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:304:0x0a8d  */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        vil0 vil0Var;
        int i;
        String strH;
        Object i08Var;
        int i2;
        Object next;
        Object value;
        s5d0 s5d0Var;
        byte b = this.i;
        int i3 = R.string.error;
        byte b2 = 3;
        final byte b3 = 1;
        final byte b4 = 0;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = this.k;
        switch (b) {
            case 0:
                zp6 zp6Var = (zp6) obj4;
                l720 l720Var = (l720) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (l720Var instanceof i720) {
                    jg7 jg7Var = ((i720) l720Var).f14270a;
                    yk5 yk5Var = zp6.m2;
                    zp6Var.V0().e.setText(jg7Var.g);
                    zp6Var.V0().c.i(jg7Var.f, "", l0d.f19195a);
                } else if (l720Var instanceof j720) {
                    wdk0 wdk0Var = zp6Var.h2;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((j720) l720Var).f16020a, null, null, null, null, 124), zp6Var, null, zp6Var.V0().f17747a, false, null, 1012);
                    zp6Var.x0();
                } else if (l720Var instanceof g720) {
                    g720 g720Var = (g720) l720Var;
                    zp6Var.V0().c.i(g720Var.b.f, g720Var.f10793a, l0d.c);
                } else if (l720Var instanceof h720) {
                    h720 h720Var = (h720) l720Var;
                    zp6Var.V0().c.i(h720Var.b.f, h720Var.f12556a, l0d.b);
                } else if (!Intrinsics.d(l720Var, k720.f17798a)) {
                    if (!(l720Var instanceof f720)) {
                        t9f.b();
                        return null;
                    }
                    zp6Var.V0().c.i(((f720) l720Var).f9039a.f, "", l0d.e);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                as6 as6Var = (as6) this.j;
                d9a0 d9a0Var = (d9a0) obj4;
                ArrayList arrayListB = as6Var.m.b(d9a0Var);
                as6Var.F.f(arrayListB.isEmpty() ? new wct(as6Var.u.f(R.string.error_wrong_team, new Object[0])) : new xct(d9a0Var, arrayListB));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                as6 as6Var2 = (as6) this.j;
                ctf0 ctf0Var = as6Var2.u;
                ol60 ol60Var = as6Var2.F;
                lhf0 lhf0Var = as6Var2.l;
                ojp0 ojp0Var = (ojp0) obj4;
                int i4 = ojp0Var.f25370a;
                int i5 = ojp0Var.b;
                m6m0 m6m0Var = bop0.b;
                int i6 = ojp0Var.c;
                m6m0Var.getClass();
                jyb jybVarT = lhf0Var.t(i4, i5, m6m0.j(i6), false);
                if (jybVarT.equals(ujn.f)) {
                    ArrayList arrayListY = as6Var2.y(as6Var2.A);
                    boolean zIsEmpty = arrayListY.isEmpty();
                    p7m0 p7m0Var = as6Var2.D;
                    if (zIsEmpty) {
                        beu beuVar = new beu(as6Var2.z());
                        p7m0Var.getClass();
                        p7m0Var.o(null, beuVar);
                    } else {
                        aeu aeuVar = new aeu(as6Var2.x(), arrayListY, ((Boolean) as6Var2.z.getValue()).booleanValue());
                        p7m0Var.getClass();
                        p7m0Var.o(null, aeuVar);
                        for (Object obj5 : ((gs6) ((mii0) as6Var2.d.f2175a).c).b) {
                            if (((vil0) obj5).f37485a == as6Var2.A) {
                                obj2 = obj5;
                                vil0Var = (vil0) obj2;
                                if (vil0Var != null) {
                                    long j = vil0Var.b;
                                    h97.x("sport_id", Long.valueOf(j), as6Var2.o.b, "betkit_add_to_team");
                                    h97.r(j, as6Var2.p.f1455a, 3356L);
                                }
                            }
                        }
                        vil0Var = (vil0) obj2;
                        if (vil0Var != null) {
                            long j2 = vil0Var.b;
                            h97.x("sport_id", Long.valueOf(j2), as6Var2.o.b, "betkit_add_to_team");
                            h97.r(j2, as6Var2.p.f1455a, 3356L);
                        }
                    }
                } else if (jybVarT instanceof gyb) {
                    ol60Var.f(new wct(ctf0Var.f(R.string.team_by_number_is_full_v2, new Integer(((gyb) jybVarT).f12120a))));
                } else if (jybVarT instanceof fyb) {
                    ol60Var.f(new wct(ctf0Var.f(R.string.team_by_number_is_full_v2, new Integer(((fyb) jybVarT).f10351a))));
                } else {
                    if (!jybVarT.equals(iyb.f15580a)) {
                        t9f.b();
                        return null;
                    }
                    ol60Var.f(new wct(ctf0Var.f(R.string.error_wrong_team, new Object[0])));
                }
                as6Var2.w();
                return Unit.f46060a;
            case 3:
                Throwable th = (Throwable) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                as6 as6Var3 = (as6) obj4;
                as6Var3.s.b(th, new xr6(as6Var3, (byte) 1));
                return Unit.f46060a;
            case 4:
                qpg0 qpg0Var = (qpg0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = qpg0Var.Z0("select * from bet_events");
                try {
                    int iP = x0x.P(xpg0VarZ0, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ0, "game_id");
                    int iP3 = x0x.P(xpg0VarZ0, "main_game_id");
                    int iP4 = x0x.P(xpg0VarZ0, "player_id");
                    int iP5 = x0x.P(xpg0VarZ0, "sport_id");
                    int iP6 = x0x.P(xpg0VarZ0, "player_name");
                    int iP7 = x0x.P(xpg0VarZ0, "game_match_name");
                    int iP8 = x0x.P(xpg0VarZ0, "first_opponent_first_img");
                    int iP9 = x0x.P(xpg0VarZ0, "first_opponent_second_img");
                    int iP10 = x0x.P(xpg0VarZ0, "second_opponent_first_img");
                    int iP11 = x0x.P(xpg0VarZ0, "second_opponent_second_img");
                    int iP12 = x0x.P(xpg0VarZ0, "group_name");
                    int iP13 = x0x.P(xpg0VarZ0, "champ_name");
                    int iP14 = x0x.P(xpg0VarZ0, "express_number");
                    int iP15 = x0x.P(xpg0VarZ0, "coefficient");
                    int iP16 = x0x.P(xpg0VarZ0, RemoteMessageConst.MessageBody.PARAM);
                    int iP17 = x0x.P(xpg0VarZ0, "time_start");
                    int iP18 = x0x.P(xpg0VarZ0, "vid");
                    int iP19 = x0x.P(xpg0VarZ0, "full_name");
                    int iP20 = x0x.P(xpg0VarZ0, "name");
                    int iP21 = x0x.P(xpg0VarZ0, "kind");
                    int iP22 = x0x.P(xpg0VarZ0, Payload.TYPE);
                    int iP23 = x0x.P(xpg0VarZ0, "players_duel_game");
                    int iP24 = x0x.P(xpg0VarZ0, "coupon_entry_feature_id");
                    int iP25 = x0x.P(xpg0VarZ0, "first_opponent_name");
                    int iP26 = x0x.P(xpg0VarZ0, "second_opponent_name");
                    int iP27 = x0x.P(xpg0VarZ0, "opponents_full_name");
                    int iP28 = x0x.P(xpg0VarZ0, "tournament_stage");
                    int iP29 = x0x.P(xpg0VarZ0, "teams_number");
                    int iP30 = x0x.P(xpg0VarZ0, "game_type");
                    int iP31 = x0x.P(xpg0VarZ0, "game_vid");
                    int iP32 = x0x.P(xpg0VarZ0, "group_id");
                    int iP33 = x0x.P(xpg0VarZ0, "option_lower_cf");
                    int iP34 = x0x.P(xpg0VarZ0, "option_lower_cf_view");
                    int iP35 = x0x.P(xpg0VarZ0, "coupon_type_vid");
                    int iP36 = x0x.P(xpg0VarZ0, "builder_game_type");
                    int iP37 = x0x.P(xpg0VarZ0, "builder_game_vid");
                    int iP38 = x0x.P(xpg0VarZ0, "builder_period");
                    int iP39 = x0x.P(xpg0VarZ0, "builder_coef_available");
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ0.W0()) {
                        long j3 = xpg0VarZ0.getLong(iP);
                        long j4 = xpg0VarZ0.getLong(iP2);
                        long j5 = xpg0VarZ0.getLong(iP3);
                        long j6 = xpg0VarZ0.getLong(iP4);
                        long j7 = xpg0VarZ0.getLong(iP5);
                        String strJ0 = xpg0VarZ0.J0(iP6);
                        String strJ1 = xpg0VarZ0.J0(iP7);
                        String strJ2 = xpg0VarZ0.J0(iP8);
                        String strJ3 = xpg0VarZ0.J0(iP9);
                        String strJ4 = xpg0VarZ0.J0(iP10);
                        String strJ5 = xpg0VarZ0.J0(iP11);
                        String strJ6 = xpg0VarZ0.J0(iP12);
                        String strJ7 = xpg0VarZ0.J0(iP13);
                        long j8 = xpg0VarZ0.getLong(iP14);
                        int i7 = iP;
                        int i8 = iP15;
                        String strJ8 = xpg0VarZ0.J0(i8);
                        iP15 = i8;
                        int i9 = iP16;
                        double d = xpg0VarZ0.getDouble(i9);
                        iP16 = i9;
                        int i10 = iP17;
                        long j9 = xpg0VarZ0.getLong(i10);
                        iP17 = i10;
                        int i11 = iP18;
                        String strJ9 = xpg0VarZ0.J0(i11);
                        iP18 = i11;
                        int i12 = iP19;
                        String strJ10 = xpg0VarZ0.J0(i12);
                        iP19 = i12;
                        int i13 = iP20;
                        String strJ11 = xpg0VarZ0.J0(i13);
                        iP20 = i13;
                        int i14 = iP5;
                        int i15 = iP21;
                        int i16 = iP2;
                        int i17 = (int) xpg0VarZ0.getLong(i15);
                        toy.b.getClass();
                        toy toyVarH = sqt.h(i17);
                        int i18 = iP22;
                        long j10 = xpg0VarZ0.getLong(i18);
                        int i19 = iP23;
                        String strJ12 = xpg0VarZ0.J0(i19);
                        int i20 = iP24;
                        int i21 = (int) xpg0VarZ0.getLong(i20);
                        int i22 = iP25;
                        String strJ13 = xpg0VarZ0.J0(i22);
                        int i23 = iP26;
                        String strJ14 = xpg0VarZ0.J0(i23);
                        iP26 = i23;
                        int i24 = iP27;
                        String strJ15 = xpg0VarZ0.J0(i24);
                        iP27 = i24;
                        int i25 = iP28;
                        String strJ16 = xpg0VarZ0.J0(i25);
                        iP28 = i25;
                        int i26 = iP29;
                        int i27 = (int) xpg0VarZ0.getLong(i26);
                        int i28 = iP30;
                        String strJ17 = xpg0VarZ0.J0(i28);
                        int i29 = iP31;
                        String strJ18 = xpg0VarZ0.J0(i29);
                        iP31 = i29;
                        int i30 = iP32;
                        long j11 = xpg0VarZ0.getLong(i30);
                        iP32 = i30;
                        int i31 = iP33;
                        double d2 = xpg0VarZ0.getDouble(i31);
                        iP33 = i31;
                        int i32 = iP34;
                        String strJ19 = xpg0VarZ0.J0(i32);
                        iP34 = i32;
                        int i33 = iP35;
                        int i34 = iP4;
                        int i35 = iP36;
                        int i36 = iP3;
                        int i37 = iP37;
                        int i38 = iP38;
                        int i39 = iP39;
                        arrayList.add(new pu6(j3, j4, j5, j6, j7, strJ0, strJ1, strJ2, strJ3, strJ4, strJ5, strJ6, strJ7, j8, strJ8, d, j9, strJ9, strJ10, strJ11, toyVarH, j10, strJ12, i21, strJ13, strJ14, strJ15, strJ16, i27, strJ17, strJ18, j11, d2, strJ19, (int) xpg0VarZ0.getLong(i33), (int) xpg0VarZ0.getLong(i35), (int) xpg0VarZ0.getLong(i37), (int) xpg0VarZ0.getLong(i38), (int) xpg0VarZ0.getLong(i39)));
                        iP2 = i16;
                        iP21 = i15;
                        iP22 = i18;
                        iP23 = i19;
                        iP24 = i20;
                        iP25 = i22;
                        iP29 = i26;
                        iP30 = i28;
                        iP3 = i36;
                        iP36 = i35;
                        iP37 = i37;
                        iP38 = i38;
                        iP5 = i14;
                        iP35 = i33;
                        iP39 = i39;
                        iP = i7;
                        iP4 = i34;
                    }
                    xpg0VarZ0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    xpg0VarZ0.close();
                    throw th2;
                }
            case 5:
                final hz6 hz6Var = (hz6) obj4;
                xz6 xz6Var = (xz6) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(xz6Var, oz6.b)) {
                    hz6Var.x0();
                } else if (Intrinsics.d(xz6Var, oz6.f26090a)) {
                    hz6Var.L0().c.setEnabled(true);
                } else if (xz6Var instanceof wz6) {
                    ArrayList arrayList2 = ((wz6) xz6Var).f40008a;
                    cl5 cl5Var = hz6.p2;
                    ((c6s) hz6Var.n2.getValue()).A(arrayList2);
                } else if (xz6Var instanceof tz6) {
                    hz6Var.L0().g.setVisibility(((tz6) xz6Var).f34790a ? 0 : 8);
                } else if (xz6Var instanceof nz6) {
                    String str = ((nz6) xz6Var).f24358a;
                    cl5 cl5Var2 = hz6.p2;
                    Button button = hz6Var.L0().c;
                    if (str.length() == 0) {
                        strH = hz6Var.H(R.string.buy);
                    } else {
                        String strH2 = hz6Var.H(R.string.buy_for_v2);
                        strH2.getClass();
                        strH = String.format(strH2, Arrays.copyOf(new Object[]{str}, 1));
                    }
                    button.setText(strH);
                } else if (xz6Var instanceof uz6) {
                    List list = ((uz6) xz6Var).f36522a;
                    cl5 cl5Var3 = hz6.p2;
                    RecyclerView recyclerView = hz6Var.L0().b;
                    bg5 bg5Var = new bg5(bg5.f);
                    bg5Var.d.b(new gbn(new gh5(b2), new lq4(b2, (byte) 4), new ij4((byte) 20), zx3.n));
                    bg5Var.A(list);
                    recyclerView.setAdapter(bg5Var);
                    hz6Var.L0().d.setCount(list.size());
                } else if (xz6Var instanceof pz6) {
                    pz6 pz6Var = (pz6) xz6Var;
                    final k390 k390Var = pz6Var.f27829a;
                    int i40 = pz6Var.c;
                    final int i41 = pz6Var.b;
                    cl5 cl5Var4 = hz6.p2;
                    RecyclerView recyclerView2 = hz6Var.L0().f;
                    View childAt = recyclerView2.getChildAt(i40);
                    if (childAt != null) {
                        hz6Var.W0(childAt, i41, new Function0() { // from class: a.ez6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b5 = b4;
                                int i42 = i41;
                                k390 k390Var2 = k390Var;
                                hz6 hz6Var2 = hz6Var;
                                switch (b5) {
                                    case 0:
                                        cl5 cl5Var5 = hz6.p2;
                                        hz6Var2.V0(k390Var2, i42);
                                        break;
                                    default:
                                        cl5 cl5Var6 = hz6.p2;
                                        hz6Var2.V0(k390Var2, i42);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else {
                        View childAt2 = recyclerView2.getChildAt(recyclerView2.getChildCount() - 1);
                        childAt2.getClass();
                        hz6Var.W0(childAt2, i41, new Function0() { // from class: a.ez6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b5 = b3;
                                int i42 = i41;
                                k390 k390Var2 = k390Var;
                                hz6 hz6Var2 = hz6Var;
                                switch (b5) {
                                    case 0:
                                        cl5 cl5Var5 = hz6.p2;
                                        hz6Var2.V0(k390Var2, i42);
                                        break;
                                    default:
                                        cl5 cl5Var6 = hz6.p2;
                                        hz6Var2.V0(k390Var2, i42);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    }
                } else if (xz6Var instanceof sz6) {
                    Throwable th3 = ((sz6) xz6Var).f33055a;
                    cl5 cl5Var5 = hz6.p2;
                    String strH3 = jwb.H(th3, new y1o(hz6Var.o0()));
                    ii iiVar = hz6Var.k2;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH4 = hz6Var.H(R.string.error);
                    String strH5 = hz6Var.H(R.string.replenish);
                    strH5.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH4, (CharSequence) strH3, (CharSequence) strH5, hz6Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_INSUFFICIENT_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    androidx.fragment.app.e eVarC = hz6Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (xz6Var instanceof qz6) {
                    Throwable th4 = ((qz6) xz6Var).f29566a;
                    cl5 cl5Var6 = hz6.p2;
                    ii iiVar2 = hz6Var.k2;
                    if (iiVar2 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH6 = hz6Var.H(R.string.error);
                    String strH7 = jwb.H(th4, new y1o(hz6Var.o0()));
                    String strH8 = hz6Var.H(R.string.ok_new);
                    strH8.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH6, (CharSequence) strH7, (CharSequence) strH8, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC2 = hz6Var.C();
                    eVarC2.getClass();
                    iiVar2.d(dialogFields2, eVarC2);
                } else if (xz6Var instanceof vz6) {
                    vz6 vz6Var = (vz6) xz6Var;
                    int i42 = vz6Var.f38285a;
                    int i43 = vz6Var.b;
                    cl5 cl5Var7 = hz6.p2;
                    hz6Var.L0().b.y0(i42);
                    hz6Var.L0().f.y0(i43);
                } else {
                    if (!(xz6Var instanceof rz6)) {
                        t9f.b();
                        return null;
                    }
                    boolean z = ((rz6) xz6Var).f31343a;
                    cl5 cl5Var8 = hz6.p2;
                    if (z) {
                        i = R.string.error_payment_bonus_balance_message_only_pts;
                    } else {
                        i3 = R.string.change_balance_account;
                        i = R.string.error_payment_bonus_balance_message;
                    }
                    ii iiVar3 = hz6Var.k2;
                    if (iiVar3 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH9 = hz6Var.H(i3);
                    String strH10 = hz6Var.H(i);
                    String strH11 = hz6Var.H(R.string.ok);
                    strH11.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) strH9, (CharSequence) strH10, (CharSequence) strH11, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC3 = hz6Var.C();
                    eVarC3.getClass();
                    iiVar3.d(dialogFields3, eVarC3);
                    hz6Var.L0().c.setEnabled(true);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                ((b07) this.j).p.f((xz6) obj4);
                return Unit.f46060a;
            case 7:
                rf7 rf7Var = (rf7) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                ke7 ke7Var = (ke7) obj4;
                if (rf7Var instanceof pf7) {
                    String str2 = ((pf7) rf7Var).f26888a;
                    yk5 yk5Var2 = ke7.R1;
                    ii iiVar4 = ke7Var.L1;
                    if (iiVar4 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH12 = ke7Var.H(R.string.error);
                    String strH13 = ke7Var.H(R.string.ok_new);
                    strH13.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH12, (CharSequence) str2, (CharSequence) strH13, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC4 = ke7Var.C();
                    eVarC4.getClass();
                    iiVar4.d(dialogFields4, eVarC4);
                } else {
                    yk5 yk5Var3 = ke7.R1;
                    wdk0 wdk0Var2 = ke7Var.M1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    rek0 rek0Var = rek0.b;
                    String strH14 = ke7Var.H(R.string.something_went_wrong);
                    strH14.getClass();
                    wdk0.k(wdk0Var2, new xdk0(rek0Var, strH14, null, null, null, null, 124), ke7Var, null, null, false, null, 1020);
                }
                return Unit.f46060a;
            case 8:
                ze7 ze7Var = (ze7) obj4;
                gf7 gf7Var = (gf7) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (Intrinsics.d(gf7Var, ef7.f7708a)) {
                    cl5 cl5Var9 = ze7.P1;
                    ii iiVar5 = ze7Var.M1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH15 = ze7Var.H(R.string.timeout_dialog_message);
                    String strH16 = ze7Var.H(R.string.confirm);
                    strH16.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) null, (CharSequence) strH15, (CharSequence) strH16, ze7Var.H(R.string.cancel), (String) null, "REQUEST_CONFIRMATION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1489);
                    androidx.fragment.app.e eVarC5 = ze7Var.C();
                    eVarC5.getClass();
                    iiVar5.d(dialogFields5, eVarC5);
                } else if (gf7Var instanceof ff7) {
                    String str3 = ((ff7) gf7Var).f9437a;
                    cl5 cl5Var10 = ze7.P1;
                    ii iiVar6 = ze7Var.M1;
                    if (iiVar6 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH17 = ze7Var.H(R.string.attention);
                    String strH18 = ze7Var.H(R.string.ok_upper);
                    strH18.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH17, (CharSequence) str3, (CharSequence) strH18, (String) null, (String) null, "REQUEST_RESPONSE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC6 = ze7Var.C();
                    eVarC6.getClass();
                    iiVar6.d(dialogFields6, eVarC6);
                } else {
                    if (!Intrinsics.d(gf7Var, df7.f5985a)) {
                        t9f.b();
                        return null;
                    }
                    j120.Y(ze7Var);
                    cl5 cl5Var11 = ze7.P1;
                    ze7Var.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                    ze7Var.G0().x(ue7.f35510a);
                }
                ze7Var.G0().x(ne7.f23371a);
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                ((uf7) this.j).m.f((rf7) obj4);
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                mp7 mp7Var = (mp7) this.j;
                bj5 bj5Var = mp7.S1;
                mp7Var.G0().x(((w2d) obj4).f38442a.a() == 1.0f ? bp7.f2968a : cp7.f4731a);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                yy7 yy7Var = (yy7) this.j;
                p18 p18Var = (p18) obj4;
                String str4 = p18Var.c;
                int i44 = p18Var.k;
                boolean z2 = p18Var.g;
                rz7 rz7Var = p18Var.f26187a;
                hz7 hz7Var = new hz7(str4, p18Var.d);
                if (p18Var.i) {
                    i08Var = new k08(rz7Var, hz7Var);
                } else if (p18Var.f) {
                    i08Var = new l08(rz7Var, hz7Var, z2, i44);
                } else {
                    i08Var = !p18Var.e ? new i08(rz7Var, hz7Var) : new j08(rz7Var, hz7Var, z2, i44);
                }
                xw3 xw3Var = yy7Var.g;
                if (i08Var instanceof j08) {
                    int i45 = yy7Var.i;
                    int i46 = ((j08) i08Var).d;
                    if (i46 != i45) {
                        yy7Var.i = i46;
                    }
                    return Unit.f46060a;
                }
                if (!(xw3Var.k() instanceof j08) && !xw3Var.isEmpty()) {
                    xw3Var.removeLast();
                }
                xw3Var.addLast(i08Var);
                while (true) {
                    if (xw3Var.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it = xw3Var.iterator();
                        i2 = 0;
                        while (it.hasNext()) {
                            if ((((m08) it.next()) instanceof j08) && (i2 = i2 + 1) < 0) {
                                q3d.o();
                                throw null;
                            }
                        }
                    }
                    if (i2 > 3) {
                        Iterator it2 = xw3Var.iterator();
                        do {
                            if (!it2.hasNext()) {
                                v4i0.o("Collection contains no element matching the predicate.");
                                return null;
                            }
                            next = it2.next();
                        } while (!(((m08) next) instanceof j08));
                        xw3Var.remove(next);
                    } else {
                        yy7Var.h.f(Unit.f46060a);
                    }
                }
                return Unit.f46060a;
            case 12:
                Throwable th5 = (Throwable) obj4;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                d48 d48Var = (d48) this.j;
                p7m0 p7m0Var2 = d48Var.B;
                duj dujVar = d48Var.s;
                ol60 ol60Var2 = d48Var.C;
                do {
                    value = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value, v38.a((v38) value, null, null, false, false, null, 251)));
                byte b5 = 11;
                if (th5 == null) {
                    dujVar.b(th5, new m87(d48Var, b5));
                } else if (th5 instanceof zhi0) {
                    zhi0 zhi0Var = (zhi0) th5;
                    int errorCode = zhi0Var.c.getErrorCode();
                    ym4 ym4Var = d48Var.u.p() == 12 ? ym4.LINK_PHONE_AUTHENTICATOR : ym4.LINK_PHONE;
                    d48Var.n.d(ym4Var, errorCode);
                    d48Var.o.c(errorCode, ym4Var.f42869a);
                    if (zhi0Var.c == i2o.LimitOfSms) {
                        String message = th5.getMessage();
                        ol60Var2.f(new q38(message != null ? message : ""));
                    } else {
                        dujVar.b(th5, new m87(d48Var, b5));
                    }
                } else if ((th5 instanceof SocketTimeoutException) || (th5 instanceof UnknownHostException)) {
                    ol60Var2.f(s38.f31543a);
                } else if (th5 instanceof p4c) {
                    ol60Var2.f(new q38(d48Var.x.b.a(R.string.error_phone, Arrays.copyOf(new Object[0], 0))));
                } else if (th5 instanceof orv0) {
                    ol60Var2.f(t38.f33253a);
                } else {
                    dujVar.b(th5, new m87(d48Var, b5));
                }
                return Unit.f46060a;
            case 13:
                Throwable th6 = (Throwable) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ((ld8) obj4).u.b(th6, new i87((byte) 24));
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                vl8 vl8Var = (vl8) this.j;
                c9o0 c9o0Var = new c9o0(fbc.U(vl8Var.h()), fbc.U(vl8Var.h()), new nk7((byte) 17));
                kxq kxqVarB = ((ni8) obj4).B();
                kxq kxqVar = kxqVarB != null ? kxqVarB : null;
                if (kxqVar != null) {
                    mjn.a(kxqVar, c9o0Var, c9o0Var);
                }
                return Unit.f46060a;
            case 15:
                jj8 jj8Var = (jj8) obj4;
                xj8 xj8Var = (xj8) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                if (xj8Var != null) {
                    boolean z3 = xj8Var instanceof vj8;
                    if (!z3) {
                        if (xj8Var instanceof wj8) {
                            iiy[] iiyVarArr = jj8.i2;
                            ((ls60) jj8Var.h2.getValue()).G(((wj8) xj8Var).b);
                        } else if (xj8Var instanceof uj8) {
                            jj8Var.T0().c.w(((uj8) xj8Var).f35765a);
                        }
                    }
                    jj8Var.T0().d.setVisibility(z3 ? 0 : 8);
                    jj8Var.T0().b.setVisibility(xj8Var instanceof wj8 ? 0 : 8);
                    jj8Var.T0().c.setVisibility(xj8Var instanceof uj8 ? 0 : 8);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 16:
                Throwable th7 = (Throwable) this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                ((km8) obj4).v.b(th7, new im8(b4));
                return Unit.f46060a;
            case 17:
                return l(obj);
            case 18:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                s29 s29Var = (s29) this.j;
                String str5 = (String) obj4;
                for (Object obj6 : ((x19) s29Var.D()).c.d) {
                    if (Intrinsics.d(((s5d0) obj6).f31650a, str5)) {
                        obj3 = obj6;
                        s5d0Var = (s5d0) obj3;
                        if (s5d0Var == null) {
                            return Unit.f46060a;
                        }
                        s29Var.x.b("providers_page", str5);
                        s29Var.B.a("providers_page", str5);
                        s29Var.Q(s5d0Var);
                        return Unit.f46060a;
                    }
                }
                s5d0Var = (s5d0) obj3;
                if (s5d0Var == null) {
                    return Unit.f46060a;
                }
                s29Var.x.b("providers_page", str5);
                s29Var.B.a("providers_page", str5);
                s29Var.Q(s5d0Var);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return m(obj);
            case 20:
                n79 n79Var = (n79) this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                j79 j79Var = (j79) obj4;
                kl5 kl5Var = j79.O1;
                if (Intrinsics.d(n79Var, m79.f21308a)) {
                    j79Var.H0(BroadcastingLandscapeZoneEvent.Stop.f46697a);
                } else if (!(n79Var instanceof k79)) {
                    if (!Intrinsics.d(n79Var, l79.f19547a)) {
                        t9f.b();
                        return null;
                    }
                    j79Var.H0(BroadcastingLandscapeZoneEvent.Fullscreen.f46696a);
                } else if (Settings.canDrawOverlays(j79Var.o0())) {
                    j79Var.H0(BroadcastingLandscapeZoneEvent.Windowed.f46698a);
                    ((k79) n79Var).f17809a.invoke();
                } else {
                    Context contextO0 = j79Var.o0();
                    Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + contextO0.getPackageName()));
                    if (contextO0.getPackageManager().resolveActivity(intent, 0) != null) {
                        intent.setFlags(268435456);
                        contextO0.startActivity(intent);
                    }
                }
                j79Var.G0().x(p69.f26444a);
                return Unit.f46060a;
            case 21:
                return o(obj);
            case 22:
                return r(obj);
            case 23:
                return s(obj);
            case 24:
                return t(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return x(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return y(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return G(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return H(obj);
            default:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                y7b y7bVar = (y7b) this.j;
                y7bVar.z.g(idf0.f14583a);
                y7bVar.x.b(lx7.f20801a);
                y7bVar.H(new s7b((xvm0) obj4, b4));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp6(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
