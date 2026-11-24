package a;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;
import org.xplatform.ui_core.game_broadcating.models.GameBroadcastType;

/* JADX INFO: loaded from: classes5.dex */
public final class za extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za(Object obj, Object obj2, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }

    private final Object l(Object obj) {
        ep7 ep7Var = (ep7) this.l;
        hq7 hq7Var = (hq7) this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            h3c h3cVar = hq7Var.u;
            long j = ep7Var.b;
            this.j = true;
            obj = h3cVar.b(j, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        final boolean zBooleanValue = ((Boolean) obj).booleanValue();
        final gr00 gr00Var = hq7Var.p;
        final long j2 = ep7Var.f8173a;
        final long j3 = ep7Var.b;
        final boolean z2 = ep7Var.c;
        final long j4 = ep7Var.e;
        gr00Var.getClass();
        ((oeg0) gr00Var.f11760a).c().d(new Function1() { // from class: a.pp7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                k0w0 k0w0Var = (k0w0) obj2;
                k0w0Var.getClass();
                qv2 qv2Var = (qv2) gr00Var.b;
                GameBroadcastType gameBroadcastType = GameBroadcastType.c;
                grs grsVar = grs.b;
                ors orsVar = ors.f25750a;
                k1g k1gVar = k1g.UNKNOWN;
                long j5 = j2;
                k0w0Var.h(qv2Var.h(new GameScreenGeneralParams(j5, j5, j3, j4, zBooleanValue, 0L, z2, gameBroadcastType, grsVar, "main_screen", "", orsVar, 0, false, k1gVar)));
                return Unit.f46060a;
            }
        });
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            nv20 nv20Var = ((fx7) this.k).b;
            jo20 jo20Var = (jo20) this.l;
            this.j = true;
            obj = nv20Var.b(jo20Var, this);
            if (obj == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        Iterable<f5h> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (f5h f5hVar : iterable) {
            sip sipVar = sip.c;
            f5hVar.getClass();
            arrayList.add(pzb.E(f5hVar, sipVar, 0L, 0L));
        }
        return arrayList;
    }

    private final Object o(Object obj) {
        Object value;
        List list = (List) this.l;
        nua nuaVar = (nua) this.k;
        Object obj2 = wne.f39444a;
        boolean z = this.j;
        if (!z) {
            z1x.P(obj);
            hwt hwtVar = nuaVar.r;
            udl0 udl0Var = ((lua) nuaVar.D()).f20664a;
            ArrayList arrayListQ0 = CollectionsKt.q0(((lua) nuaVar.D()).b, list);
            this.j = true;
            fua fuaVar = hwtVar.f13781a;
            Object objD0 = qjj.d0(fuaVar.d.b, new ee0(fuaVar, udl0Var, arrayListQ0, null, (byte) 23), this);
            if (objD0 != obj2) {
                objD0 = Unit.f46060a;
            }
            if (objD0 != obj2) {
                objD0 = Unit.f46060a;
            }
            if (objD0 == obj2) {
                return obj2;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        int i = nua.t;
        p7m0 p7m0Var = nuaVar.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, lua.a((lua) value, null, null, null, null, list, false, 31)));
        nuaVar.G(hua.f13670a);
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.l;
        switch (b) {
            case 0:
                return new za((ab) obj, yjeVar, (byte) 0);
            case 1:
                return new za((nr) this.k, (sgb) obj, yjeVar, (byte) 1);
            case 2:
                return new za((es) this.k, (tnp0) obj, yjeVar, (byte) 2);
            case 3:
                return new za((mt) this.k, (String) obj, yjeVar, (byte) 3);
            case 4:
                return new za((ww) this.k, (String) obj, yjeVar, (byte) 4);
            case 5:
                return new za((Function1) this.k, (ww) obj, yjeVar, (byte) 5);
            case 6:
                return new za((n91) obj, yjeVar, (byte) 6);
            case 7:
                return new za((n91) this.k, (String) obj, yjeVar, (byte) 7);
            case 8:
                return new za((le2) this.k, (ArrayList) obj, yjeVar, (byte) 8);
            case 9:
                return new za((hh2) obj, yjeVar, (byte) 9);
            case 10:
                return new za((ul2) obj, yjeVar, (byte) 10);
            case 11:
                return new za((ul2) this.k, (qbs0) obj, yjeVar, (byte) 11);
            case 12:
                return new za((qv2) this.k, (xdr) obj, yjeVar, (byte) 12);
            case 13:
                return new za((rv2) this.k, (xdr) obj, yjeVar, (byte) 13);
            case 14:
                return new za((h23) this.k, (v4q0) obj, yjeVar, (byte) 14);
            case 15:
                return new za((kc4) this.k, (tu4) obj, yjeVar, (byte) 15);
            case 16:
                return new za((kc4) this.k, (su4) obj, yjeVar, (byte) 16);
            case 17:
                return new za((fh4) this.k, (tu4) obj, yjeVar, (byte) 17);
            case 18:
                return new za((fh4) this.k, (su4) obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new za((fh4) this.k, (Function1) obj, yjeVar, (byte) 19);
            case 20:
                return new za((hk4) this.k, (tu4) obj, yjeVar, (byte) 20);
            case 21:
                return new za((hk4) this.k, (su4) obj, yjeVar, (byte) 21);
            case 22:
                return new za((g85) this.k, (mlr) obj, yjeVar, (byte) 22);
            case 23:
                return new za((v96) this.k, (u96) obj, yjeVar, (byte) 23);
            case 24:
                return new za((dt6) this.k, (ch20) obj, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new za((hq7) this.k, (ep7) obj, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new za((fx7) this.k, (TreeMap) obj, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new za((fx7) this.k, (jo20) obj, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new za((nua) this.k, (List) obj, yjeVar, (byte) 28);
            default:
                return new za((plb) this.k, (Long) obj, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case 24:
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                break;
        }
        return ((za) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:425:0x0ab3  */
    /* JADX WARN: Code duplicated, block: B:429:0x0af8  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws cii0 {
        Object objT;
        ab abVar;
        Object value;
        String str;
        Object value2;
        String strA;
        p7m0 p7m0Var;
        Object value3;
        Object value4;
        Object objW;
        Object value5;
        Object value6;
        Object value7;
        u81 u81Var;
        Object objC;
        sff0 sff0Var;
        Object value8;
        Object objC2;
        sff0 sff0Var2;
        Object value9;
        Object objB;
        f23 f23Var;
        Object value10;
        Object value11;
        Object value12;
        Object value13;
        Object value14;
        Object value15;
        Object value16;
        Object objA;
        Object obj2;
        Object value17;
        byte b = this.i;
        byte b2 = 5;
        byte b3 = 10;
        byte b4 = 2;
        byte b5 = 4;
        Object obj3 = this.l;
        byte b6 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    ab abVar2 = (ab) obj3;
                    cyu cyuVar = abVar2.s0;
                    this.k = abVar2;
                    this.j = true;
                    objT = cyuVar.t(this);
                    if (objT == wneVar) {
                        return wneVar;
                    }
                    abVar = abVar2;
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    abVar = (ab) this.k;
                    z1x.P(obj);
                    objT = obj;
                }
                i1w0 i1w0Var = abVar.y;
                int iOrdinal = ((a1p0) objT).ordinal();
                if (iOrdinal == 0) {
                    i1w0Var.d(new u9(abVar, (byte) 9));
                } else if (iOrdinal == 1) {
                    i1w0Var.d(new u9(abVar, b3));
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    ouu ouuVar = abVar.X;
                    tcp tcpVar = tcp.GAMES;
                    ouuVar.q(new ya50(5), true);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                m0o0 m0o0Var = (m0o0) ((nr) this.k).b;
                long jB = ((sgb) obj3).b();
                this.j = true;
                Object objA2 = m0o0Var.b.a(jB, this, true);
                return objA2 == wneVar2 ? wneVar2 : objA2;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                m0o0 m0o0Var2 = (m0o0) ((es) this.k).f8305a;
                tnp0 tnp0Var = (tnp0) obj3;
                this.j = true;
                Object objC3 = m0o0Var2.b.c(tnp0Var.a(), true, tnp0Var, this);
                return objC3 == wneVar3 ? wneVar3 : objC3;
            case 3:
                String str2 = (String) obj3;
                mt mtVar = (mt) this.k;
                oyg0 oyg0Var = mtVar.f;
                ocj ocjVar = mtVar.i;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    if (((kt) mtVar.D()).c) {
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value = p7m0Var2.getValue();
                            value.getClass();
                            str = str2;
                            str2 = str;
                        } while (!p7m0Var2.m(value, kt.a((kt) value, null, str, null, false, 61)));
                    } else {
                        p7m0 p7m0Var3 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var3.getValue();
                            value2.getClass();
                        } while (!p7m0Var3.m(value2, kt.a((kt) value2, str2, null, null, false, 62)));
                    }
                    if (((kt) mtVar.D()).f18838a.length() == 4 && !((kt) mtVar.D()).c) {
                        this.j = true;
                        if (qcc.O(200L, this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                    if (((kt) mtVar.D()).c && ((kt) mtVar.D()).b.length() == 4) {
                        if (((kt) mtVar.D()).f18838a.equals(((kt) mtVar.D()).b)) {
                            mtVar.G(gt.f11856a);
                        } else {
                            mtVar.t.f44322a.c("acc_settings_pin_set_error");
                            mtVar.x.f1455a.a(xun.f41520a, 3261L);
                            strA = mtVar.w.b.a(R.string.pin_codes_not_matches_error, Arrays.copyOf(new Object[0], 0));
                            p7m0Var = ocjVar.f25029a;
                            do {
                                value3 = p7m0Var.getValue();
                                value3.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var.m(value3, kt.a((kt) value3, null, "", strA, true, 37)));
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                int i = mt.D;
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                } while (!p7m0Var4.m(value4, kt.a((kt) value4, null, null, null, false, 59)));
                if (((kt) mtVar.D()).c) {
                    if (((kt) mtVar.D()).f18838a.equals(((kt) mtVar.D()).b)) {
                        mtVar.t.f44322a.c("acc_settings_pin_set_error");
                        mtVar.x.f1455a.a(xun.f41520a, 3261L);
                        strA = mtVar.w.b.a(R.string.pin_codes_not_matches_error, Arrays.copyOf(new Object[0], 0));
                        p7m0Var = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var.m(value3, kt.a((kt) value3, null, "", strA, true, 37)));
                    } else {
                        mtVar.G(gt.f11856a);
                    }
                }
                return Unit.f46060a;
            case 4:
                ww wwVar = (ww) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    xuf xufVar = ((lw) wwVar.D()).b;
                    this.j = true;
                    objW = wwVar.r.w((String) obj3, xufVar, this);
                    if (objW == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objW = obj;
                }
                iw iwVar = new iw((String) objW, false);
                int i2 = ww.B;
                wwVar.G(iwVar);
                i1w0 i1w0Var2 = wwVar.x;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var2);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var2, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar.next());
                }
                break;
            case 5:
                ocj ocjVar2 = ((ww) obj3).i;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                try {
                    if (!z6) {
                        z1x.P(obj);
                        Function1 function1 = (Function1) this.k;
                        this.j = true;
                        if (function1.invoke(this) == wneVar6) {
                            return wneVar6;
                        }
                    } else {
                        if (!z6) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    int i3 = ww.B;
                    p7m0 p7m0Var5 = ocjVar2.f25029a;
                    do {
                        value6 = p7m0Var5.getValue();
                        value6.getClass();
                    } while (!p7m0Var5.m(value6, lw.a((lw) value6, false, null, false, false, null, null, false, 126)));
                    return Unit.f46060a;
                } catch (Throwable th) {
                    int i4 = ww.B;
                    p7m0 p7m0Var6 = ocjVar2.f25029a;
                    do {
                        value5 = p7m0Var6.getValue();
                        value5.getClass();
                    } while (!p7m0Var6.m(value5, lw.a((lw) value5, false, null, false, false, null, null, false, 126)));
                    throw th;
                }
            case 6:
                n91 n91Var = (n91) obj3;
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    f02 f02Var = ((u81) n91Var.D()).b;
                    if (f02Var != null) {
                        p7m0 p7m0Var7 = n91Var.i.f25029a;
                        do {
                            value7 = p7m0Var7.getValue();
                            value7.getClass();
                            u81Var = (u81) value7;
                        } while (!p7m0Var7.m(value7, u81.a(u81Var, null, !u81Var.d, false, false, f02Var.b, f02Var.c, 0L, false, false, null, false, false, false, 0, null, 2096935)));
                        zw0 zw0Var = n91Var.e0;
                        String str3 = f02Var.b;
                        String str4 = f02Var.c;
                        this.k = n91Var;
                        this.j = true;
                        if (zw0Var.d(this, str3, str4, true) == wneVar7) {
                            return wneVar7;
                        }
                    } else {
                        n91Var.G(g81.f10842a);
                    }
                    return Unit.f46060a;
                }
                if (!z7) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n91Var = (n91) this.k;
                z1x.P(obj);
                int i5 = n91.f0;
                boolean z8 = ((u81) n91Var.D()).d;
                ctf0 ctf0Var = n91Var.o;
                ctf0Var.getClass();
                int i6 = z8 ? R.string.aggregator_demo_mode_notification_title : R.string.aggregator_main_mode_notification_title;
                int i7 = z8 ? R.string.aggregator_demo_mode_notification_description : R.string.aggregator_main_mode_notification_description;
                pek0 pek0Var = pek0.f26859a;
                lsm0 lsm0Var = ctf0Var.b;
                n91Var.G(new f81(new xdk0(pek0Var, lsm0Var.a(i6, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(i7, Arrays.copyOf(new Object[0], 0)), lwf.Y, jdk0.f16332a, null, 96)));
                n91Var.W();
                n91Var.T();
                return Unit.f46060a;
            case 7:
                n91 n91Var2 = (n91) this.k;
                wne wneVar8 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    lrc lrcVar = n91Var2.P;
                    this.j = true;
                    Object objC4 = ((yzn0) lrcVar.b).c(((u81) n91Var2.D()).f35213a.c, this, (String) obj3);
                    if (objC4 != wneVar8) {
                        objC4 = Unit.f46060a;
                    }
                    if (objC4 == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i8 = n91.f0;
                n91Var2.U();
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    hjd hjdVar = ((le2) this.k).x;
                    did didVar = new did((ArrayList) obj3);
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(didVar, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                hh2 hh2Var = (hh2) obj3;
                pru pruVar = hh2Var.p;
                wne wneVar10 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    sff0 sff0VarA = pruVar.a();
                    j3c j3cVar = hh2Var.r;
                    this.k = sff0VarA;
                    this.j = true;
                    objC = j3cVar.c(this);
                    if (objC == wneVar10) {
                        return wneVar10;
                    }
                    sff0Var = sff0VarA;
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sff0Var = (sff0) this.k;
                    z1x.P(obj);
                    objC = obj;
                }
                wcb wcbVar = (wcb) objC;
                boolean zJ = hh2Var.s.j();
                List listA = hh2Var.t.f20692a.a();
                boolean z12 = pruVar.a().g.B != vcp.NoTabsDashboard;
                r9u r9uVar = hh2Var.q;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                hg2 hg2Var = new hg2(sff0Var.g.y, sff0Var.J, sff0Var.J1, zJ, z12, hh2Var.u, wcbVar, listA, hh2Var.F.l(), hh2Var.v, j1q0Var.f15748a.d(ygpVar));
                p7m0 p7m0Var8 = hh2Var.i.f25029a;
                do {
                    value8 = p7m0Var8.getValue();
                    value8.getClass();
                } while (!p7m0Var8.m(value8, ug2.a((ug2) value8, hg2Var, false, null, false, false, false, false, null, null, null, false, 2046)));
                return Unit.f46060a;
            case 10:
                ul2 ul2Var = (ul2) obj3;
                r9u r9uVar2 = ul2Var.L;
                wne wneVar11 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    sff0 sff0VarA2 = ul2Var.q.a();
                    j3c j3cVar2 = ul2Var.s;
                    this.k = sff0VarA2;
                    this.j = true;
                    objC2 = j3cVar2.c(this);
                    if (objC2 == wneVar11) {
                        return wneVar11;
                    }
                    sff0Var2 = sff0VarA2;
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sff0Var2 = (sff0) this.k;
                    z1x.P(obj);
                    objC2 = obj;
                }
                wcb wcbVar2 = (wcb) objC2;
                boolean zJ2 = ul2Var.t.j();
                List listA2 = ul2Var.u.f20692a.a();
                ygp ygpVar2 = ygp.t;
                r9uVar2.getClass();
                j1q0 j1q0Var2 = r9uVar2.f30104a;
                j1q0Var2.getClass();
                boolean zD = j1q0Var2.f15748a.d(ygpVar2);
                ygp ygpVar3 = ygp.q1;
                r9uVar2.getClass();
                j1q0 j1q0Var3 = r9uVar2.f30104a;
                j1q0Var3.getClass();
                boolean zD2 = j1q0Var3.f15748a.d(ygpVar3);
                yk2 yk2Var = new yk2(sff0Var2.g.y, sff0Var2.J, sff0Var2.J1, zJ2, ul2Var.x, wcbVar2, listA2, ul2Var.G.l(), ul2Var.y, zD, zD2 ? sff0Var2.f32117a.c.i : xte.COEF_WITH_BIG_ACCENT_TEAM, zD2);
                p7m0 p7m0Var9 = ul2Var.i.f25029a;
                do {
                    value9 = p7m0Var9.getValue();
                    value9.getClass();
                } while (!p7m0Var9.m(value9, nl2.a((nl2) value9, yk2Var, false, false, null, false, false, false, null, null, 510)));
                return Unit.f46060a;
            case 11:
                qbs0 qbs0Var = (qbs0) obj3;
                ul2 ul2Var2 = (ul2) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    h3c h3cVar = ul2Var2.v;
                    long j = qbs0Var.f28453a.b;
                    this.j = true;
                    objB = h3cVar.b(j, this);
                    if (objB == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objB = obj;
                }
                boolean zBooleanValue = ((Boolean) objB).booleanValue();
                bcs0 bcs0Var = qbs0Var.f28453a;
                int i9 = ul2.S;
                ul2Var2.M.e(bcs0Var.b, bcs0Var.c, bcs0Var.e, bcs0Var.v, bcs0Var.d, "watched", null, null);
                boolean z15 = bcs0Var.v;
                je jeVar = ul2Var2.N;
                long j2 = bcs0Var.b;
                long j3 = bcs0Var.c;
                if (z15) {
                    jeVar.h(j2, j3, bcs0Var.e, "watched");
                } else {
                    jeVar.f(j2, j3, bcs0Var.e, "watched", bcs0Var.d);
                }
                ul2Var2.p.d(new r91(ul2Var2, qbs0Var, zBooleanValue, b4));
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    qv2 qv2Var = (qv2) this.k;
                    iv2 iv2Var = new iv2(qv2Var, (byte) 2);
                    y51 y51Var = new y51(obj3, (Object) qv2Var, yjeVar, (byte) 22);
                    this.j = true;
                    if (s5x0.P(iv2Var, y51Var, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                rv2 rv2Var = (rv2) this.k;
                wne wneVar14 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    st2 st2Var = new st2(rv2Var, b2);
                    y51 y51Var2 = new y51(obj3, (Object) rv2Var, yjeVar, (byte) 23);
                    this.j = true;
                    if (dv2.e(st2Var, y51Var2, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                vtj vtjVarD = rv2Var.d();
                agk0 agk0Var = rv2Var.f;
                Object objA3 = vtjVarD.a(agk0Var.l());
                if (objA3 != null) {
                    if (Math.abs(agk0Var.l() - rv2Var.d().d(objA3)) < 0.5f) {
                        ((hgk0) rv2Var.d).setValue(objA3);
                        ((hgk0) rv2Var.c).setValue(objA3);
                    }
                }
                return Unit.f46060a;
            case 14:
                h23 h23Var = (h23) this.k;
                pgk0 pgk0Var = h23Var.e;
                View view = h23Var.f12312a;
                wne wneVar15 = wne.f39444a;
                boolean z18 = this.j;
                try {
                    if (!z18) {
                        z1x.P(obj);
                        g23 g23Var = new g23();
                        v4q0 v4q0Var = (v4q0) obj3;
                        f23 f23Var2 = new f23(g23Var, new d23(h23Var, v4q0Var, (byte) 0), new d23(h23Var, v4q0Var, (byte) 1), view);
                        Function1 function2 = h23Var.b;
                        if (function2 != null && (f23Var = (f23) function2.invoke(f23Var2)) != null) {
                            f23Var2 = f23Var;
                        }
                        Looper looperMyLooper = Looper.myLooper();
                        Handler handler = view.getHandler();
                        if (looperMyLooper != (handler != null ? handler.getLooper() : null)) {
                            b1 b1Var = h23Var.i;
                            if (b1Var == null) {
                                b1Var = new b1(h23Var, f23Var2, g23Var, b6);
                                h23Var.i = b1Var;
                            }
                            view.post(b1Var);
                        } else {
                            ActionMode actionModeStartActionMode = view.startActionMode(new emq(f23Var2), 1);
                            if (actionModeStartActionMode == null) {
                                return Unit.f46060a;
                            }
                            h23Var.h = actionModeStartActionMode;
                        }
                        this.j = true;
                        Object objG = g23Var.f10542a.g(this);
                        if (objG != wneVar15) {
                            objG = Unit.f46060a;
                        }
                        if (objG == wneVar15) {
                            return wneVar15;
                        }
                    } else {
                        if (!z18) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    pgk0Var.a();
                    Looper looperMyLooper2 = Looper.myLooper();
                    Handler handler2 = view.getHandler();
                    if (looperMyLooper2 != (handler2 != null ? handler2.getLooper() : null)) {
                        Runnable w1Var = h23Var.j;
                        if (w1Var == null) {
                            w1Var = new w1(h23Var, b5);
                            h23Var.j = w1Var;
                        }
                        view.post(w1Var);
                    } else {
                        ActionMode actionMode = h23Var.h;
                        if (actionMode != null) {
                            actionMode.finish();
                        }
                    }
                    b1 b1Var2 = h23Var.i;
                    if (b1Var2 != null) {
                        view.removeCallbacks(b1Var2);
                    }
                    h23Var.h = null;
                    return Unit.f46060a;
                } catch (Throwable th2) {
                    pgk0Var.a();
                    Looper looperMyLooper3 = Looper.myLooper();
                    Handler handler3 = view.getHandler();
                    if (looperMyLooper3 != (handler3 != null ? handler3.getLooper() : null)) {
                        Runnable w1Var2 = h23Var.j;
                        if (w1Var2 == null) {
                            w1Var2 = new w1(h23Var, b5);
                            h23Var.j = w1Var2;
                        }
                        view.post(w1Var2);
                    } else {
                        ActionMode actionMode2 = h23Var.h;
                        if (actionMode2 != null) {
                            actionMode2.finish();
                        }
                    }
                    b1 b1Var3 = h23Var.i;
                    if (b1Var3 != null) {
                        view.removeCallbacks(b1Var3);
                    }
                    h23Var.h = null;
                    throw th2;
                }
            case 15:
                kc4 kc4Var = (kc4) this.k;
                wne wneVar16 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    kc4Var.R.a();
                    p7m0 p7m0Var10 = kc4Var.i.f25029a;
                    do {
                        value10 = p7m0Var10.getValue();
                        value10.getClass();
                    } while (!p7m0Var10.m(value10, mb4.a((mb4) value10, false, false, true, null, null, null, 0, false, null, null, false, 16375)));
                    im4 im4Var = kc4Var.p;
                    ml4 ml4Var = new ml4((tu4) obj3, kc4Var.I.g());
                    this.j = true;
                    im4Var.getClass();
                    if (im4Var.a(ml4Var, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                kc4 kc4Var2 = (kc4) this.k;
                wne wneVar17 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    int i10 = kc4.Y;
                    p7m0 p7m0Var11 = kc4Var2.i.f25029a;
                    do {
                        value11 = p7m0Var11.getValue();
                        value11.getClass();
                    } while (!p7m0Var11.m(value11, mb4.a((mb4) value11, false, false, true, null, null, null, 0, false, null, null, false, 16375)));
                    im4 im4Var2 = kc4Var2.p;
                    ml4 ml4Var2 = new ml4((su4) obj3, kc4Var2.I.g());
                    this.j = true;
                    im4Var2.getClass();
                    if (im4Var2.a(ml4Var2, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                fh4 fh4Var = (fh4) this.k;
                wne wneVar18 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    int i11 = fh4.c0;
                    p7m0 p7m0Var12 = fh4Var.i.f25029a;
                    do {
                        value12 = p7m0Var12.getValue();
                        value12.getClass();
                    } while (!p7m0Var12.m(value12, zf4.a((zf4) value12, false, false, true, null, null, null, 0, false, null, null, false, false, 32759)));
                    fh4Var.W.f40449a = 0;
                    im4 im4Var3 = fh4Var.p;
                    ml4 ml4Var3 = new ml4((tu4) obj3, fh4Var.J.g());
                    this.j = true;
                    im4Var3.getClass();
                    if (im4Var3.a(ml4Var3, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                fh4 fh4Var2 = (fh4) this.k;
                wne wneVar19 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    int i12 = fh4.c0;
                    p7m0 p7m0Var13 = fh4Var2.i.f25029a;
                    do {
                        value13 = p7m0Var13.getValue();
                        value13.getClass();
                    } while (!p7m0Var13.m(value13, zf4.a((zf4) value13, false, false, true, null, null, null, 0, false, null, null, false, false, 32759)));
                    fh4Var2.W.f40449a = 0;
                    im4 im4Var4 = fh4Var2.p;
                    ml4 ml4Var4 = new ml4((su4) obj3, fh4Var2.J.g());
                    this.j = true;
                    im4Var4.getClass();
                    if (im4Var4.a(ml4Var4, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                fh4 fh4Var3 = (fh4) this.k;
                wne wneVar20 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    int i13 = fh4.c0;
                    p7m0 p7m0Var14 = fh4Var3.i.f25029a;
                    do {
                        value14 = p7m0Var14.getValue();
                        value14.getClass();
                        oyg0 oyg0Var2 = fh4Var3.f;
                        oyg0Var2.getClass();
                        q7x.F(oyg0Var2, Boolean.FALSE, "KEY_CONTENT_VISIBILITY_STATUS");
                    } while (!p7m0Var14.m(value14, zf4.a((zf4) value14, false, false, false, null, null, null, 0, false, null, null, false, false, 16383)));
                    this.j = true;
                    if (qcc.O(200L, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                fh4Var3.x.d((Function1) obj3);
                return Unit.f46060a;
            case 20:
                hk4 hk4Var = (hk4) this.k;
                wne wneVar21 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    int i14 = hk4.b0;
                    p7m0 p7m0Var15 = hk4Var.i.f25029a;
                    do {
                        value15 = p7m0Var15.getValue();
                        value15.getClass();
                    } while (!p7m0Var15.m(value15, tj4.a((tj4) value15, false, false, true, null, null, null, 0, false, null, null, false, 65527)));
                    hk4Var.V.f40449a = 0;
                    im4 im4Var5 = hk4Var.p;
                    ml4 ml4Var5 = new ml4((tu4) obj3, hk4Var.H.g());
                    this.j = true;
                    im4Var5.getClass();
                    if (im4Var5.a(ml4Var5, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                hk4 hk4Var2 = (hk4) this.k;
                wne wneVar22 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    int i15 = hk4.b0;
                    p7m0 p7m0Var16 = hk4Var2.i.f25029a;
                    do {
                        value16 = p7m0Var16.getValue();
                        value16.getClass();
                    } while (!p7m0Var16.m(value16, tj4.a((tj4) value16, false, false, true, null, null, null, 0, false, null, null, false, 65527)));
                    hk4Var2.V.f40449a = 0;
                    im4 im4Var6 = hk4Var2.p;
                    ml4 ml4Var6 = new ml4((su4) obj3, hk4Var2.H.g());
                    this.j = true;
                    im4Var6.getClass();
                    if (im4Var6.a(ml4Var6, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    this.j = true;
                    if (pw70.b(((g85) this.k).r, (mlr) obj3, "", 0, true, false, this, 18) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                u96 u96Var = (u96) obj3;
                pz40 pz40Var = ((v96) this.k).c;
                wne wneVar24 = wne.f39444a;
                boolean z27 = this.j;
                try {
                    if (!z27) {
                        z1x.P(obj);
                        ((hgk0) pz40Var).setValue(u96Var);
                        this.j = true;
                        Object objG2 = u96Var.b.g(this);
                        if (objG2 != wneVar24) {
                            objG2 = Unit.f46060a;
                        }
                        if (objG2 == wneVar24) {
                            return wneVar24;
                        }
                    } else {
                        if (!z27) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                    }
                    ((hgk0) pz40Var).setValue(null);
                    return Unit.f46060a;
                } catch (Throwable th3) {
                    ((hgk0) pz40Var).setValue(null);
                    throw th3;
                }
            case 24:
                dt6 dt6Var = (dt6) this.k;
                wne wneVar25 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    if (((c820) dt6Var.D()).b instanceof do7) {
                        nvu nvuVar = dt6Var.C;
                        bm5 bm5Var = bm5.k;
                        double d = ((ch20) obj3).c;
                        this.j = true;
                        if (nvuVar.J(bm5Var, d, this) == wneVar25) {
                            return wneVar25;
                        }
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return l(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar26 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    this.j = true;
                    objA = ((fx7) this.k).b.a((TreeMap) obj3, this);
                    if (objA == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objA = obj;
                }
                Iterable<su10> iterable = (Iterable) objA;
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                for (su10 su10Var : iterable) {
                    bek bekVar = sip.f32274a;
                    arrayList.add(g7x.Z(su10Var));
                }
                return arrayList;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return m(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return o(obj);
            default:
                plb plbVar = (plb) this.k;
                wne wneVar27 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    this.j = true;
                    Object objJ = plbVar.r.j((Long) obj3, this);
                    if (objJ == wneVar27) {
                        return wneVar27;
                    }
                    obj2 = objJ;
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    obj2 = ((j0g0) obj).f15681a;
                }
                int i16 = plb.I;
                p7m0 p7m0Var17 = plbVar.i.f25029a;
                do {
                    value17 = p7m0Var17.getValue();
                    value17.getClass();
                } while (!p7m0Var17.m(value17, alb.a((alb) value17, false, null, null, new j0g0(obj2), null, 12287)));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ za(diu0 diu0Var, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }
}
