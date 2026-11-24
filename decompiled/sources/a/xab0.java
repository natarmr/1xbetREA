package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xab0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ sbb0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xab0(sbb0 sbb0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = sbb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sbb0 sbb0Var = this.j;
        switch (b) {
            case 0:
                return new xab0(sbb0Var, yjeVar, (byte) 0);
            case 1:
                return new xab0(sbb0Var, yjeVar, (byte) 1);
            case 2:
                return new xab0(sbb0Var, yjeVar, (byte) 2);
            case 3:
                return new xab0(sbb0Var, yjeVar, (byte) 3);
            default:
                return new xab0(sbb0Var, yjeVar, (byte) 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xab0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xab0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((xab0) create((bb50) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((xab0) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xab0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        n7b0 n7b0VarA;
        Object value2;
        Object value3;
        n7b0 n7b0VarA2;
        Object value4;
        n7b0 n7b0VarA3;
        Object value5;
        n7b0 n7b0Var;
        bby bbyVar;
        Object value6;
        Object value7;
        long j;
        Object value8;
        n7b0 n7b0Var2;
        ArrayList arrayList;
        String string;
        byte b = this.i;
        yje yjeVar = null;
        sbb0 sbb0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                mne mneVar = sbb0Var.q;
                n9b0 n9b0Var = sbb0Var.A0;
                p7m0 p7m0Var = sbb0Var.D0;
                c4m0 c4m0Var = sbb0Var.r0;
                byte b2 = 8;
                byte b3 = 1;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    if (sbb0Var.X.a()) {
                        do {
                            value = p7m0Var.getValue();
                            n7b0VarA = (n7b0) value;
                            if (!(n7b0VarA.f23033a instanceof z8l0)) {
                                n7b0VarA = n7b0.a(n7b0VarA, y8l0.f42202a, null, null, null, 14);
                            }
                        } while (!p7m0Var.m(value, n7b0VarA));
                        sbb0Var.r0 = sac.T(new fnq(bkb.i0(sbb0Var.M.m(n9b0Var.f23132a), "PopularClassicViewModel.tryLoadFilters", 3, 3L, null, null, null, 56), new ebb0(sbb0Var, yjeVar, (byte) 7), (byte) 4), d5c.S(jiu0.a(sbb0Var), mneVar.b), new ebb0(sbb0Var, yjeVar, b2));
                    } else {
                        do {
                            value2 = p7m0Var.getValue();
                        } while (!p7m0Var.m(value2, n7b0.a((n7b0) value2, w8l0.f38728a, null, null, null, 14)));
                    }
                }
                boolean zA = n9b0Var.a();
                bby bbyVar2 = sbb0Var.s0;
                if (!zA) {
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    do {
                        value6 = p7m0Var.getValue();
                    } while (!p7m0Var.m(value6, n7b0.a((n7b0) value6, null, zq5.f44791a, null, null, 13)));
                } else if (bbyVar2 == null || !bbyVar2.isActive()) {
                    do {
                        value3 = p7m0Var.getValue();
                        n7b0VarA2 = (n7b0) value3;
                        if (!(n7b0VarA2.b instanceof cr5)) {
                            mq5 mq5VarX = sbb0Var.x();
                            int i = 6;
                            switch (sbb0Var.x()) {
                                case RectangleHorizontal:
                                case CardHorizontal:
                                case RectangleHorizontalNoTitle:
                                    i = 3;
                                    n7b0VarA2 = n7b0.a(n7b0VarA2, null, new br5(new aq5(new up5(mq5VarX, i))), null, null, 13);
                                    break;
                                case RectangleVertical:
                                case SquareS:
                                case RectangleVerticalNoTitle:
                                case SquareSNoTitle:
                                    i = 8;
                                    n7b0VarA2 = n7b0.a(n7b0VarA2, null, new br5(new aq5(new up5(mq5VarX, i))), null, null, 13);
                                    break;
                                case SquareL:
                                case SquareLNoTitle:
                                    n7b0VarA2 = n7b0.a(n7b0VarA2, null, new br5(new aq5(new up5(mq5VarX, i))), null, null, 13);
                                    break;
                                default:
                                    t9f.b();
                                    return null;
                            }
                        }
                    } while (!p7m0Var.m(value3, n7b0VarA2));
                    sbb0Var.s0 = sac.i0(jiu0.a(sbb0Var), "PopularClassicViewModel.tryLoadBanners", 3, 3L, null, null, new lbb0(sbb0Var, yjeVar, b3), null, mneVar.b, new gab0(sbb0Var, (byte) 0), null, Response.BUSY_EVERYWHERE);
                }
                sff0 sff0Var = sbb0Var.m0;
                if (!n9b0Var.b() && (bbyVar = sbb0Var.u0) != null) {
                    bbyVar.cancel(null);
                }
                bby bbyVar3 = sbb0Var.u0;
                if (bbyVar3 == null || !bbyVar3.isActive()) {
                    boolean zB = n9b0Var.b();
                    pd00 pd00Var = pd00.f26783a;
                    if (zB) {
                        do {
                            value4 = p7m0Var.getValue();
                            n7b0VarA3 = (n7b0) value4;
                            oz60 oz60Var = n7b0VarA3.c;
                            if (!(oz60Var.f26091a instanceof sd00)) {
                                n7b0VarA3 = n7b0.a(n7b0VarA3, null, null, oz60.a(oz60Var, sbb0Var.k0.f() ? pd00Var : new rd00(kotlin.collections.a.c(q470.f28084a)), sff0Var.g.m.f25258a, sff0Var.d.f27973a.b, 24), null, 11);
                            }
                        } while (!p7m0Var.m(value4, n7b0VarA3));
                        sbb0Var.C();
                    } else {
                        do {
                            value5 = p7m0Var.getValue();
                            n7b0Var = (n7b0) value5;
                        } while (!p7m0Var.m(value5, n7b0.a(n7b0Var, null, null, oz60.a(n7b0Var.c, pd00Var, sff0Var.g.m.f25258a, sff0Var.d.f27973a.b, 24), null, 11)));
                    }
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                sje sjeVar = sbb0Var.o0;
                long j2 = sbb0Var.F0 + 1;
                sbb0Var.c.e("KEY_AUTH_OFFER_TIMER", new Long(j2));
                sbb0Var.F0 = j2;
                sff0 sff0Var2 = sbb0Var.m0;
                if (j2 == sff0Var2.a1) {
                    p7m0 p7m0Var2 = sbb0Var.C0;
                    do {
                        value7 = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value7, jdb0.a((jdb0) value7, false, false, false, true, false, 23)));
                    d5c.G(sjeVar, null);
                }
                if (sbb0Var.F0 > sff0Var2.a1) {
                    d5c.G(sjeVar, null);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var3 = sbb0Var.I0;
                p7m0Var3.getClass();
                p7m0Var3.o(null, o9b0.f24872a);
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                long j3 = sbb0Var.w0 + 1;
                vzg0 vzg0Var = sbb0Var.c;
                vzg0Var.e("KEY_2FA_ALERT_TIMER", new Long(j3));
                sbb0Var.w0 = j3;
                if (j3 == 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    vwb0 vwb0Var = ((k9b0) sbb0Var.e0.f23782a).f17908a;
                    vwb0Var.getClass();
                    j = 0;
                    if (jCurrentTimeMillis - vwb0Var.b().getLong("ALERT_2FA_TIME_SHOWED_KEY", 0L) > 86400000) {
                        p7m0 p7m0Var4 = sbb0Var.z0;
                        Boolean bool = Boolean.TRUE;
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, bool);
                        vzg0Var.e("KEY_2FA_ALERT_TIMER", new Long(0L));
                        sbb0Var.w0 = 0L;
                        e3c.n(sbb0Var.x0);
                    }
                } else {
                    j = 0;
                }
                if (sbb0Var.w0 > 2) {
                    vzg0Var.e("KEY_2FA_ALERT_TIMER", new Long(j));
                    sbb0Var.w0 = j;
                    e3c.n(sbb0Var.x0);
                }
                return Unit.f46060a;
            default:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                List listA = sbb0Var.I.f20692a.a();
                p7m0 p7m0Var5 = sbb0Var.D0;
                do {
                    value8 = p7m0Var5.getValue();
                    n7b0Var2 = (n7b0) value8;
                    arrayList = new ArrayList(r3d.q(listA, 10));
                    for (Iterator it = listA.iterator(); it.hasNext(); it = it) {
                        lok0 lok0Var = (lok0) it.next();
                        ctf0 ctf0Var = sbb0Var.d;
                        lok0Var.getClass();
                        ctf0Var.getClass();
                        int i2 = lok0Var.f20396a;
                        String str = lok0Var.u;
                        String str2 = lok0Var.b;
                        long j4 = lok0Var.f;
                        if (j4 != 0) {
                            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                            rz4.s(j4, ".svg", bzuVarD);
                            string = ((StringBuilder) bzuVarD.b).toString();
                        } else {
                            string = "";
                        }
                        arrayList.add(new pwk0(i2, ctf0Var.a(R.color.static_white), str2, string, q5x.D(i2, str), q5x.E(i2, str)));
                    }
                } while (!p7m0Var5.m(value8, n7b0.a(n7b0Var2, null, null, null, new sd00(listA, arrayList), 7)));
                return Unit.f46060a;
        }
    }
}
