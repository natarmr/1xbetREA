package a;

import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class caw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ naw k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ caw(naw nawVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = nawVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        naw nawVar = this.k;
        switch (b) {
            case 0:
                caw cawVar = new caw(nawVar, yjeVar, (byte) 0);
                cawVar.j = obj;
                return cawVar;
            case 1:
                caw cawVar2 = new caw(nawVar, yjeVar, (byte) 1);
                cawVar2.j = obj;
                return cawVar2;
            case 2:
                caw cawVar3 = new caw(nawVar, yjeVar, (byte) 2);
                cawVar3.j = obj;
                return cawVar3;
            case 3:
                caw cawVar4 = new caw(nawVar, yjeVar, (byte) 3);
                cawVar4.j = obj;
                return cawVar4;
            case 4:
                caw cawVar5 = new caw(nawVar, yjeVar, (byte) 4);
                cawVar5.j = obj;
                return cawVar5;
            default:
                caw cawVar6 = new caw(nawVar, yjeVar, (byte) 5);
                cawVar6.j = obj;
                return cawVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((caw) create((s4w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((caw) create((dc60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((caw) create((n3w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((caw) create((n3w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((caw) create((n3w) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((caw) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0235  */
    /* JADX WARN: Code duplicated, block: B:106:0x0249  */
    /* JADX WARN: Code duplicated, block: B:117:0x028a  */
    /* JADX WARN: Code duplicated, block: B:120:0x0291  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:141:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:146:0x0302  */
    /* JADX WARN: Code duplicated, block: B:148:0x0311  */
    /* JADX WARN: Code duplicated, block: B:150:0x0319  */
    /* JADX WARN: Code duplicated, block: B:151:0x0320  */
    /* JADX WARN: Code duplicated, block: B:155:0x0331  */
    /* JADX WARN: Code duplicated, block: B:158:0x033d  */
    /* JADX WARN: Code duplicated, block: B:160:0x034c  */
    /* JADX WARN: Code duplicated, block: B:162:0x034f  */
    /* JADX WARN: Code duplicated, block: B:163:0x0359 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:164:0x035b  */
    /* JADX WARN: Code duplicated, block: B:165:0x0365  */
    /* JADX WARN: Code duplicated, block: B:168:0x0379  */
    /* JADX WARN: Code duplicated, block: B:169:0x0381 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0383  */
    /* JADX WARN: Code duplicated, block: B:171:0x038b  */
    /* JADX WARN: Code duplicated, block: B:173:0x0395  */
    /* JADX WARN: Code duplicated, block: B:174:0x039d  */
    /* JADX WARN: Code duplicated, block: B:177:0x03b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:182:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:185:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:186:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:189:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:192:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:195:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:196:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:212:0x0520  */
    /* JADX WARN: Code duplicated, block: B:226:0x055a  */
    /* JADX WARN: Code duplicated, block: B:311:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:313:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:316:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:317:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:320:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:322:0x0705  */
    /* JADX WARN: Code duplicated, block: B:324:0x070b  */
    /* JADX WARN: Code duplicated, block: B:325:0x071b  */
    /* JADX WARN: Code duplicated, block: B:327:0x0725  */
    /* JADX WARN: Code duplicated, block: B:329:0x0731  */
    /* JADX WARN: Code duplicated, block: B:333:0x0743  */
    /* JADX WARN: Code duplicated, block: B:336:0x074e  */
    /* JADX WARN: Code duplicated, block: B:338:0x0752  */
    /* JADX WARN: Code duplicated, block: B:341:0x075b A[PHI: r5
  0x075b: PHI (r5v27 a.q4f) = (r5v15 a.q4f), (r5v28 a.q4f), (r5v28 a.q4f) binds: [B:347:0x0772, B:340:0x0759, B:343:0x0765] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:345:0x0768 A[PHI: r5
  0x0768: PHI (r5v16 a.q4f) = (r5v15 a.q4f), (r5v28 a.q4f) binds: [B:347:0x0772, B:343:0x0765] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:351:0x077b  */
    /* JADX WARN: Code duplicated, block: B:352:0x077e  */
    /* JADX WARN: Code duplicated, block: B:355:0x0789  */
    /* JADX WARN: Code duplicated, block: B:356:0x0792  */
    /* JADX WARN: Code duplicated, block: B:359:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:360:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:363:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:365:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:366:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:369:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:371:0x0806  */
    /* JADX WARN: Code duplicated, block: B:374:0x081d  */
    /* JADX WARN: Code duplicated, block: B:376:0x083c  */
    /* JADX WARN: Code duplicated, block: B:378:0x0842  */
    /* JADX WARN: Code duplicated, block: B:379:0x084b  */
    /* JADX WARN: Code duplicated, block: B:382:0x0854  */
    /* JADX WARN: Code duplicated, block: B:383:0x0857  */
    /* JADX WARN: Code duplicated, block: B:385:0x085a  */
    /* JADX WARN: Code duplicated, block: B:388:0x0860  */
    /* JADX WARN: Code duplicated, block: B:389:0x0863  */
    /* JADX WARN: Code duplicated, block: B:391:0x0866  */
    /* JADX WARN: Code duplicated, block: B:393:0x086a  */
    /* JADX WARN: Code duplicated, block: B:394:0x086d  */
    /* JADX WARN: Code duplicated, block: B:396:0x0870  */
    /* JADX WARN: Code duplicated, block: B:399:0x0878  */
    /* JADX WARN: Code duplicated, block: B:401:0x087d  */
    /* JADX WARN: Code duplicated, block: B:403:0x088b  */
    /* JADX WARN: Code duplicated, block: B:407:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:410:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:413:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:415:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:416:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:420:0x08df  */
    /* JADX WARN: Code duplicated, block: B:421:0x08f3  */
    /* JADX WARN: Code duplicated, block: B:423:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:425:0x0911  */
    /* JADX WARN: Code duplicated, block: B:427:0x0917 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:429:0x0922  */
    /* JADX WARN: Code duplicated, block: B:434:0x0951 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:435:0x0953  */
    /* JADX WARN: Code duplicated, block: B:436:0x0957 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:437:0x0959 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:438:0x095b  */
    /* JADX WARN: Code duplicated, block: B:439:0x095e  */
    /* JADX WARN: Code duplicated, block: B:442:0x0963  */
    /* JADX WARN: Code duplicated, block: B:445:0x0968  */
    /* JADX WARN: Code duplicated, block: B:448:0x096d  */
    /* JADX WARN: Code duplicated, block: B:450:0x0971 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:452:0x0976  */
    /* JADX WARN: Code duplicated, block: B:454:0x097a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:456:0x097f  */
    /* JADX WARN: Code duplicated, block: B:51:0x013a  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:86:0x01dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01de  */
    /* JADX WARN: Code duplicated, block: B:88:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0202  */
    /* JADX WARN: Code duplicated, block: B:93:0x0208  */
    /* JADX WARN: Code duplicated, block: B:95:0x0218  */
    /* JADX WARN: Code duplicated, block: B:97:0x0220  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String strF;
        String str;
        String str2;
        int iA;
        String str3;
        long j;
        hfl0 gfl0Var;
        String strA;
        boolean z;
        hfl0 hfl0Var;
        int i;
        String strF2;
        String str4;
        ctf0 ctf0Var;
        String strF3;
        double d;
        q4f q4fVar;
        boolean z2;
        boolean z3;
        int iK;
        String strF4;
        s77 s77Var;
        boolean z4;
        List list;
        q4f q4fVar2;
        String str5;
        sys0 sys0Var;
        e4f e4fVar;
        ctf0 ctf0Var2;
        String strF5;
        lzc jzcVar;
        ozc ozcVar;
        sys0 sys0Var2;
        boolean z5;
        boolean z6;
        Object fbrVar;
        String strL;
        int i2;
        String strL2;
        int i3;
        su6 su6Var;
        String str6;
        String str7;
        String str8;
        StringBuilder sb;
        ctf0 ctf0Var3;
        String string;
        String string2;
        String string3;
        String str9;
        q4f q4fVar3;
        q4f q4fVar4;
        Pair pair;
        boolean z7;
        int iA2;
        int iB;
        exo0 exo0Var;
        String strF6;
        int iIntValue;
        String str10;
        double d2;
        String str11;
        String str12;
        so7 so7Var;
        int i4;
        so7 so7Var2;
        String strF7;
        String str13;
        double d3;
        String str14;
        String strF8;
        String strC;
        int iA3;
        boolean z8;
        int i5;
        boolean z9;
        boolean z10;
        String strD;
        byte b = this.i;
        naw nawVar = this.k;
        switch (b) {
            case 0:
                s4w s4wVar = (s4w) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (s4wVar instanceof i4w) {
                    nawVar.J.g(((i4w) s4wVar).f14163a);
                }
                return Unit.f46060a;
            case 1:
                td9 td9Var = nawVar.J;
                dc60 dc60Var = (dc60) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (dc60Var != null) {
                    if (dc60Var instanceof cc60) {
                        n3w n3wVar = ((cc60) dc60Var).f4094a;
                        td9Var.getClass();
                        n3wVar.getClass();
                        td9Var.h(new y5w(n3wVar, (byte) 1));
                        td9Var.f33756a = false;
                        td9Var.e = new bp00(false);
                        td9Var.h(new umu((byte) 27));
                    } else if (dc60Var instanceof bc60) {
                        td9Var.g(((bc60) dc60Var).f2339a);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                n3w n3wVar2 = (n3w) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                nawVar.J.g(n3wVar2);
                return Unit.f46060a;
            case 3:
                n3w n3wVar3 = (n3w) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(nawVar.z0 != s77.SALE || (n3wVar3.G1 <= 0.0d && nawVar.Q0.f32117a.f12063a.m));
            case 4:
                n3w n3wVar4 = (n3w) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                sff0 sff0Var = nawVar.Q0;
                sys0 sys0Var3 = nawVar.d;
                ctf0 ctf0Var4 = nawVar.W;
                s77 s77Var2 = nawVar.D0;
                boolean z11 = s77Var2 == s77.EVENTS || s77Var2 == s77.AUTO || s77Var2 == s77.UNSETTLED;
                boolean z12 = nawVar.R0.y && n3wVar4.K1 == an6.e && n3wVar4.g1 == q4f.c;
                List listA = nawVar.e0.f20692a.a();
                boolean z13 = nawVar.T0;
                int i6 = R.string.max_payout;
                if (z13 && z11) {
                    n3wVar4.getClass();
                    double d4 = n3wVar4.p;
                    double d5 = n3wVar4.o;
                    e4f e4fVar2 = n3wVar4.l;
                    ctf0Var4.getClass();
                    listA.getClass();
                    sys0Var3.getClass();
                    sff0Var.getClass();
                    q4f q4fVar5 = n3wVar4.g1;
                    boolean z14 = n3wVar4.x1;
                    boolean z15 = n3wVar4.s1;
                    double d6 = n3wVar4.n;
                    s77 s77Var3 = n3wVar4.c;
                    double d7 = n3wVar4.Z;
                    String str15 = n3wVar4.g;
                    double d8 = n3wVar4.B;
                    q4f q4fVar6 = q4f.u;
                    if (q4fVar5 == q4fVar6 && n3wVar4.f1) {
                        str9 = "";
                        pair = new Pair(0, ctf0Var4.f(R.string.not_confirmed, new Object[0]));
                        q4fVar4 = q4fVar6;
                    } else {
                        str9 = "";
                        if (e4fVar2 == e4f.e) {
                            q4fVar3 = q4fVar6;
                            if (d8 == n3wVar4.G1 && d8 > 0.0d) {
                                pn40 pn40Var = pn40.f27267a;
                                p3u0 p3u0Var = p3u0.c;
                                q4fVar4 = q4fVar3;
                                pair = new Pair(Integer.valueOf(feb.V(e4fVar2)), ctf0Var4.f(R.string.history_paid_and_prepaid, pn40.d(d4, str15, p3u0Var), pn40.d(d8, str15, p3u0Var)));
                            }
                        } else {
                            q4fVar3 = q4fVar6;
                        }
                        q4fVar4 = q4fVar3;
                        pair = new Pair(Integer.valueOf(feb.V(e4fVar2)), ctf0Var4.f(feb.X(e4fVar2), new Object[0]));
                    }
                    int iOrdinal = sys0Var3.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        z7 = true;
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        if (n3wVar4.f.length() > 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    }
                    String str16 = n3wVar4.f22868a;
                    String str17 = str16.length() > 0 ? str16 : null;
                    if (str17 == null) {
                        str17 = n3wVar4.b;
                    }
                    s77 s77Var4 = s77.JACKPOT;
                    boolean z16 = s77Var3 != s77Var4;
                    exo0 exo0VarN = atm0.n(n3wVar4.z1, str15, e4fVar2, ctf0Var4);
                    e4f e4fVar3 = e4f.j;
                    boolean z17 = e4fVar2 == e4fVar3 && d6 > 0.0d;
                    pn40 pn40Var2 = pn40.f27267a;
                    p3u0 p3u0Var2 = p3u0.c;
                    String strD2 = pn40.d(d6, str15, p3u0Var2);
                    if (d7 > r17) {
                        iB = ctf0Var4.a(R.color.static_teal);
                    } else {
                        if (z15) {
                            iB = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                        } else {
                            iA2 = zjb.G(n3wVar4, ctf0Var4).length() > 0 ? ctf0Var4.a(R.color.static_violet) : ctf0Var4.a(R.color.static_transparent);
                        }
                        if (d7 > r17) {
                            exo0Var = exo0VarN;
                            strF6 = ctf0Var4.f(R.string.history_auto_sale, new Object[0]);
                        } else {
                            exo0Var = exo0VarN;
                            if (z15) {
                                strF6 = ctf0Var4.f(R.string.promo, new Object[0]);
                            } else if (z14) {
                                strF6 = ctf0Var4.f(R.string.advance, new Object[0]);
                            } else {
                                strF6 = str9;
                            }
                        }
                        iIntValue = ((Number) pair.f46059a).intValue();
                        str10 = (String) pair.b;
                        String str18 = n3wVar4.u;
                        d2 = n3wVar4.v;
                        if (d4 > r17) {
                            str11 = str10;
                            if (e4fVar2 != e4f.g) {
                                String strF9 = ctf0Var4.f(R.string.history_your_win_new, new Object[0]);
                                if (q4fVar5 == q4fVar4) {
                                    strD = pn40.c(d4, p3u0Var2);
                                } else if (q4fVar5 == q4f.y || str18.length() <= 0) {
                                    strD = pn40.d(d4, str15, p3u0Var2);
                                } else {
                                    strD = kng0.l(str18, Separators.SP, pn40.d(d4, str15, p3u0Var2));
                                }
                                so7Var2 = new so7(ctf0Var4.a(R.color.static_green), strF9, strD);
                            }
                            so7Var = so7Var2;
                            str12 = str9;
                            mb90 mb90VarG = vvw.G(n3wVar4, ctf0Var4, sff0Var.f32117a.h);
                            s77 s77Var5 = s77.TOTO;
                            boolean z18 = s77Var3 != s77Var5 || s77Var3 == s77Var4 ? d5 > r17 : !(q4fVar5 == q4f.h || e4fVar2 == e4fVar3);
                            if (n3wVar4.a()) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else if (d6 > r17) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate, new Object[0]);
                            }
                            boolean z19 = z18;
                            str13 = str12;
                            d3 = n3wVar4.n1;
                            if (d3 <= 0) {
                                d3 = d5;
                            }
                            String strD3 = pn40.d(d3, str15, p3u0Var2);
                            String str19 = n3wVar4.m1;
                            String str20 = n3wVar4.f;
                            if (d7 > r17) {
                                strF8 = ctf0Var4.f(R.string.history_auto_sale, new Object[0]);
                            } else if (z15) {
                                strF8 = ctf0Var4.f(R.string.promo, new Object[0]);
                            } else {
                                if (z14) {
                                    strF8 = ctf0Var4.f(R.string.advance, new Object[0]);
                                } else {
                                    str14 = str13;
                                }
                                strC = e3c.C(n3wVar4, ctf0Var4, listA);
                                boolean z20 = n3wVar4.t;
                                boolean z21 = !StringsKt.W(str14);
                                if (d7 > r17) {
                                    iA3 = ctf0Var4.a(R.color.static_teal);
                                } else if (z15) {
                                    iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                                } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                    iA3 = ctf0Var4.a(R.color.static_violet);
                                } else {
                                    iA3 = ctf0Var4.a(R.color.static_transparent);
                                }
                                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iA3);
                                colorStateListValueOf.getClass();
                                long j2 = n3wVar4.j;
                                if (e4fVar2 == e4f.c || s77Var3 == s77Var5 || s77Var3 == s77Var4 || s77Var3 == s77.AUTO) {
                                    z8 = false;
                                } else {
                                    z8 = true;
                                }
                                if (n3wVar4.j1) {
                                    i5 = R.drawable.ic_bell_on_new;
                                } else {
                                    i5 = R.drawable.ic_bell_off_new;
                                }
                                if (s77Var3 != s77.AGGREGATOR || q3d.j(e4f.l, e4f.m).contains(e4fVar2)) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                if (strC.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG, z19, strF7, strD3, str19, z7, str20, new yad(str14, z21, colorStateListValueOf, z20, j2, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                            }
                            str14 = strF8;
                            strC = e3c.C(n3wVar4, ctf0Var4, listA);
                            boolean z22 = n3wVar4.t;
                            boolean z23 = !StringsKt.W(str14);
                            if (d7 > r17) {
                                iA3 = ctf0Var4.a(R.color.static_teal);
                            } else if (z15) {
                                iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                            } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                iA3 = ctf0Var4.a(R.color.static_violet);
                            } else {
                                iA3 = ctf0Var4.a(R.color.static_transparent);
                            }
                            ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(iA3);
                            colorStateListValueOf2.getClass();
                            long j3 = n3wVar4.j;
                            if (e4fVar2 == e4f.c) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (n3wVar4.j1) {
                                i5 = R.drawable.ic_bell_on_new;
                            } else {
                                i5 = R.drawable.ic_bell_off_new;
                            }
                            if (s77Var3 != s77.AGGREGATOR) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (strC.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG, z19, strF7, strD3, str19, z7, str20, new yad(str14, z23, colorStateListValueOf2, z22, j3, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                        } else {
                            str11 = str10;
                        }
                        if (d2 <= r17 && e4fVar2 == e4fVar3) {
                            so7Var2 = new so7(ctf0.b(R.attr.uikitTextPrimary, ctf0Var4), ctf0Var4.f(R.string.history_bill_received, new Object[0]), pn40.d(d2, str15, p3u0Var2));
                            so7Var = so7Var2;
                            str12 = str9;
                        } else if (n3wVar4.r1 || d2 <= r17) {
                            str12 = str9;
                            so7Var = new so7(ctf0.b(R.attr.uikitTextPrimary, ctf0Var4), ctf0Var4.f(R.string.status_with_colon, new Object[0]), str12);
                        } else {
                            ozc ozcVar2 = n3wVar4.L1;
                            boolean zContains = q3d.j(q4f.e, q4f.g).contains(q4fVar5);
                            sys0 sys0Var4 = sys0.c;
                            if (sys0Var3 == sys0Var4 && zContains) {
                                i4 = R.string.history_min_payout;
                            } else if (sys0Var3 == sys0Var4 && !zContains) {
                                i4 = R.string.history_possible_win;
                            } else if (ozcVar2 == ozc.MAX_PAYOUT) {
                                i4 = R.string.max_payout;
                            } else if (ozcVar2 != ozc.MIN_PAYOUT && ozcVar2 == ozc.POSSIBLE_PAYOUT) {
                                i4 = R.string.history_possible_win;
                            } else {
                                i4 = R.string.history_min_payout;
                            }
                            so7Var = new so7(ctf0.b(R.attr.uikitTextPrimary, ctf0Var4), ctf0Var4.f(i4, new Object[0]), pn40.d(d2, str15, p3u0Var2));
                            str12 = str9;
                        }
                        mb90 mb90VarG2 = vvw.G(n3wVar4, ctf0Var4, sff0Var.f32117a.h);
                        s77 s77Var6 = s77.TOTO;
                        if (s77Var3 != s77Var6) {
                            if (n3wVar4.a()) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else if (d6 > r17) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate, new Object[0]);
                            }
                            boolean z110 = z18;
                            str13 = str12;
                            d3 = n3wVar4.n1;
                            if (d3 <= 0) {
                                d3 = d5;
                            }
                            String strD4 = pn40.d(d3, str15, p3u0Var2);
                            String str110 = n3wVar4.m1;
                            String str21 = n3wVar4.f;
                            if (d7 > r17) {
                                strF8 = ctf0Var4.f(R.string.history_auto_sale, new Object[0]);
                            } else if (z15) {
                                strF8 = ctf0Var4.f(R.string.promo, new Object[0]);
                            } else {
                                if (z14) {
                                    strF8 = ctf0Var4.f(R.string.advance, new Object[0]);
                                } else {
                                    str14 = str13;
                                }
                                strC = e3c.C(n3wVar4, ctf0Var4, listA);
                                boolean z24 = n3wVar4.t;
                                boolean z25 = !StringsKt.W(str14);
                                if (d7 > r17) {
                                    iA3 = ctf0Var4.a(R.color.static_teal);
                                } else if (z15) {
                                    iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                                } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                    iA3 = ctf0Var4.a(R.color.static_violet);
                                } else {
                                    iA3 = ctf0Var4.a(R.color.static_transparent);
                                }
                                ColorStateList colorStateListValueOf3 = ColorStateList.valueOf(iA3);
                                colorStateListValueOf3.getClass();
                                long j4 = n3wVar4.j;
                                if (e4fVar2 == e4f.c) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (n3wVar4.j1) {
                                    i5 = R.drawable.ic_bell_on_new;
                                } else {
                                    i5 = R.drawable.ic_bell_off_new;
                                }
                                if (s77Var3 != s77.AGGREGATOR) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (strC.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG2, z110, strF7, strD4, str110, z7, str21, new yad(str14, z25, colorStateListValueOf3, z24, j4, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                            }
                            str14 = strF8;
                            strC = e3c.C(n3wVar4, ctf0Var4, listA);
                            boolean z26 = n3wVar4.t;
                            boolean z27 = !StringsKt.W(str14);
                            if (d7 > r17) {
                                iA3 = ctf0Var4.a(R.color.static_teal);
                            } else if (z15) {
                                iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                            } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                iA3 = ctf0Var4.a(R.color.static_violet);
                            } else {
                                iA3 = ctf0Var4.a(R.color.static_transparent);
                            }
                            ColorStateList colorStateListValueOf4 = ColorStateList.valueOf(iA3);
                            colorStateListValueOf4.getClass();
                            long j5 = n3wVar4.j;
                            if (e4fVar2 == e4f.c) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (n3wVar4.j1) {
                                i5 = R.drawable.ic_bell_on_new;
                            } else {
                                i5 = R.drawable.ic_bell_off_new;
                            }
                            if (s77Var3 != s77.AGGREGATOR) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (strC.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG2, z110, strF7, strD4, str110, z7, str21, new yad(str14, z27, colorStateListValueOf4, z26, j5, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                        } else {
                            if (n3wVar4.a()) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else if (d6 > r17) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate, new Object[0]);
                            }
                            boolean z111 = z18;
                            str13 = str12;
                            d3 = n3wVar4.n1;
                            if (d3 <= 0) {
                                d3 = d5;
                            }
                            String strD5 = pn40.d(d3, str15, p3u0Var2);
                            String str111 = n3wVar4.m1;
                            String str22 = n3wVar4.f;
                            if (d7 > r17) {
                                strF8 = ctf0Var4.f(R.string.history_auto_sale, new Object[0]);
                            } else if (z15) {
                                strF8 = ctf0Var4.f(R.string.promo, new Object[0]);
                            } else {
                                if (z14) {
                                    strF8 = ctf0Var4.f(R.string.advance, new Object[0]);
                                } else {
                                    str14 = str13;
                                }
                                strC = e3c.C(n3wVar4, ctf0Var4, listA);
                                boolean z28 = n3wVar4.t;
                                boolean z29 = !StringsKt.W(str14);
                                if (d7 > r17) {
                                    iA3 = ctf0Var4.a(R.color.static_teal);
                                } else if (z15) {
                                    iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                                } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                    iA3 = ctf0Var4.a(R.color.static_violet);
                                } else {
                                    iA3 = ctf0Var4.a(R.color.static_transparent);
                                }
                                ColorStateList colorStateListValueOf5 = ColorStateList.valueOf(iA3);
                                colorStateListValueOf5.getClass();
                                long j6 = n3wVar4.j;
                                if (e4fVar2 == e4f.c) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (n3wVar4.j1) {
                                    i5 = R.drawable.ic_bell_on_new;
                                } else {
                                    i5 = R.drawable.ic_bell_off_new;
                                }
                                if (s77Var3 != s77.AGGREGATOR) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (strC.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG2, z111, strF7, strD5, str111, z7, str22, new yad(str14, z29, colorStateListValueOf5, z28, j6, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                            }
                            str14 = strF8;
                            strC = e3c.C(n3wVar4, ctf0Var4, listA);
                            boolean z210 = n3wVar4.t;
                            boolean z211 = !StringsKt.W(str14);
                            if (d7 > r17) {
                                iA3 = ctf0Var4.a(R.color.static_teal);
                            } else if (z15) {
                                iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                            } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                iA3 = ctf0Var4.a(R.color.static_violet);
                            } else {
                                iA3 = ctf0Var4.a(R.color.static_transparent);
                            }
                            ColorStateList colorStateListValueOf6 = ColorStateList.valueOf(iA3);
                            colorStateListValueOf6.getClass();
                            long j7 = n3wVar4.j;
                            if (e4fVar2 == e4f.c) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (n3wVar4.j1) {
                                i5 = R.drawable.ic_bell_on_new;
                            } else {
                                i5 = R.drawable.ic_bell_off_new;
                            }
                            if (s77Var3 != s77.AGGREGATOR) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (strC.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG2, z111, strF7, strD5, str111, z7, str22, new yad(str14, z211, colorStateListValueOf6, z210, j7, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                        }
                    }
                    iA2 = iB;
                    if (d7 > r17) {
                        exo0Var = exo0VarN;
                        strF6 = ctf0Var4.f(R.string.history_auto_sale, new Object[0]);
                    } else {
                        exo0Var = exo0VarN;
                        if (z15) {
                            strF6 = ctf0Var4.f(R.string.promo, new Object[0]);
                        } else if (z14) {
                            strF6 = ctf0Var4.f(R.string.advance, new Object[0]);
                        } else {
                            strF6 = str9;
                        }
                    }
                    iIntValue = ((Number) pair.f46059a).intValue();
                    str10 = (String) pair.b;
                    String str112 = n3wVar4.u;
                    d2 = n3wVar4.v;
                    if (d4 > r17) {
                        str11 = str10;
                        if (e4fVar2 != e4f.g) {
                            String strF10 = ctf0Var4.f(R.string.history_your_win_new, new Object[0]);
                            if (q4fVar5 == q4fVar4) {
                                strD = pn40.c(d4, p3u0Var2);
                            } else if (q4fVar5 == q4f.y) {
                                strD = pn40.d(d4, str15, p3u0Var2);
                            } else {
                                strD = pn40.d(d4, str15, p3u0Var2);
                            }
                            so7Var2 = new so7(ctf0Var4.a(R.color.static_green), strF10, strD);
                        }
                        so7Var = so7Var2;
                        str12 = str9;
                        mb90 mb90VarG3 = vvw.G(n3wVar4, ctf0Var4, sff0Var.f32117a.h);
                        s77 s77Var7 = s77.TOTO;
                        if (s77Var3 != s77Var7) {
                            if (n3wVar4.a()) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else if (d6 > r17) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate, new Object[0]);
                            }
                            boolean z112 = z18;
                            str13 = str12;
                            d3 = n3wVar4.n1;
                            if (d3 <= 0) {
                                d3 = d5;
                            }
                            String strD6 = pn40.d(d3, str15, p3u0Var2);
                            String str113 = n3wVar4.m1;
                            String str23 = n3wVar4.f;
                            if (d7 > r17) {
                                strF8 = ctf0Var4.f(R.string.history_auto_sale, new Object[0]);
                            } else if (z15) {
                                strF8 = ctf0Var4.f(R.string.promo, new Object[0]);
                            } else {
                                if (z14) {
                                    strF8 = ctf0Var4.f(R.string.advance, new Object[0]);
                                } else {
                                    str14 = str13;
                                }
                                strC = e3c.C(n3wVar4, ctf0Var4, listA);
                                boolean z212 = n3wVar4.t;
                                boolean z213 = !StringsKt.W(str14);
                                if (d7 > r17) {
                                    iA3 = ctf0Var4.a(R.color.static_teal);
                                } else if (z15) {
                                    iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                                } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                    iA3 = ctf0Var4.a(R.color.static_violet);
                                } else {
                                    iA3 = ctf0Var4.a(R.color.static_transparent);
                                }
                                ColorStateList colorStateListValueOf7 = ColorStateList.valueOf(iA3);
                                colorStateListValueOf7.getClass();
                                long j8 = n3wVar4.j;
                                if (e4fVar2 == e4f.c) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (n3wVar4.j1) {
                                    i5 = R.drawable.ic_bell_on_new;
                                } else {
                                    i5 = R.drawable.ic_bell_off_new;
                                }
                                if (s77Var3 != s77.AGGREGATOR) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (strC.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG3, z112, strF7, strD6, str113, z7, str23, new yad(str14, z213, colorStateListValueOf7, z212, j8, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                            }
                            str14 = strF8;
                            strC = e3c.C(n3wVar4, ctf0Var4, listA);
                            boolean z214 = n3wVar4.t;
                            boolean z215 = !StringsKt.W(str14);
                            if (d7 > r17) {
                                iA3 = ctf0Var4.a(R.color.static_teal);
                            } else if (z15) {
                                iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                            } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                iA3 = ctf0Var4.a(R.color.static_violet);
                            } else {
                                iA3 = ctf0Var4.a(R.color.static_transparent);
                            }
                            ColorStateList colorStateListValueOf8 = ColorStateList.valueOf(iA3);
                            colorStateListValueOf8.getClass();
                            long j9 = n3wVar4.j;
                            if (e4fVar2 == e4f.c) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (n3wVar4.j1) {
                                i5 = R.drawable.ic_bell_on_new;
                            } else {
                                i5 = R.drawable.ic_bell_off_new;
                            }
                            if (s77Var3 != s77.AGGREGATOR) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (strC.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG3, z112, strF7, strD6, str113, z7, str23, new yad(str14, z215, colorStateListValueOf8, z214, j9, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                        } else {
                            if (n3wVar4.a()) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else if (d6 > r17) {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else {
                                strF7 = ctf0Var4.f(R.string.history_bet_rate, new Object[0]);
                            }
                            boolean z113 = z18;
                            str13 = str12;
                            d3 = n3wVar4.n1;
                            if (d3 <= 0) {
                                d3 = d5;
                            }
                            String strD7 = pn40.d(d3, str15, p3u0Var2);
                            String str114 = n3wVar4.m1;
                            String str24 = n3wVar4.f;
                            if (d7 > r17) {
                                strF8 = ctf0Var4.f(R.string.history_auto_sale, new Object[0]);
                            } else if (z15) {
                                strF8 = ctf0Var4.f(R.string.promo, new Object[0]);
                            } else {
                                if (z14) {
                                    strF8 = ctf0Var4.f(R.string.advance, new Object[0]);
                                } else {
                                    str14 = str13;
                                }
                                strC = e3c.C(n3wVar4, ctf0Var4, listA);
                                boolean z216 = n3wVar4.t;
                                boolean z217 = !StringsKt.W(str14);
                                if (d7 > r17) {
                                    iA3 = ctf0Var4.a(R.color.static_teal);
                                } else if (z15) {
                                    iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                                } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                    iA3 = ctf0Var4.a(R.color.static_violet);
                                } else {
                                    iA3 = ctf0Var4.a(R.color.static_transparent);
                                }
                                ColorStateList colorStateListValueOf9 = ColorStateList.valueOf(iA3);
                                colorStateListValueOf9.getClass();
                                long j10 = n3wVar4.j;
                                if (e4fVar2 == e4f.c) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (n3wVar4.j1) {
                                    i5 = R.drawable.ic_bell_on_new;
                                } else {
                                    i5 = R.drawable.ic_bell_off_new;
                                }
                                if (s77Var3 != s77.AGGREGATOR) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (strC.length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG3, z113, strF7, strD7, str114, z7, str24, new yad(str14, z217, colorStateListValueOf9, z216, j10, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                            }
                            str14 = strF8;
                            strC = e3c.C(n3wVar4, ctf0Var4, listA);
                            boolean z218 = n3wVar4.t;
                            boolean z219 = !StringsKt.W(str14);
                            if (d7 > r17) {
                                iA3 = ctf0Var4.a(R.color.static_teal);
                            } else if (z15) {
                                iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                            } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                iA3 = ctf0Var4.a(R.color.static_violet);
                            } else {
                                iA3 = ctf0Var4.a(R.color.static_transparent);
                            }
                            ColorStateList colorStateListValueOf10 = ColorStateList.valueOf(iA3);
                            colorStateListValueOf10.getClass();
                            long j11 = n3wVar4.j;
                            if (e4fVar2 == e4f.c) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (n3wVar4.j1) {
                                i5 = R.drawable.ic_bell_on_new;
                            } else {
                                i5 = R.drawable.ic_bell_off_new;
                            }
                            if (s77Var3 != s77.AGGREGATOR) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (strC.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG3, z113, strF7, strD7, str114, z7, str24, new yad(str14, z219, colorStateListValueOf10, z218, j11, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                        }
                    } else {
                        str11 = str10;
                    }
                    if (d2 <= r17) {
                    }
                    if (n3wVar4.r1) {
                    }
                    str12 = str9;
                    so7Var = new so7(ctf0.b(R.attr.uikitTextPrimary, ctf0Var4), ctf0Var4.f(R.string.status_with_colon, new Object[0]), str12);
                    mb90 mb90VarG4 = vvw.G(n3wVar4, ctf0Var4, sff0Var.f32117a.h);
                    s77 s77Var8 = s77.TOTO;
                    if (s77Var3 != s77Var8) {
                        if (n3wVar4.a()) {
                            strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                        } else if (d6 > r17) {
                            strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                        } else {
                            strF7 = ctf0Var4.f(R.string.history_bet_rate, new Object[0]);
                        }
                        boolean z114 = z18;
                        str13 = str12;
                        d3 = n3wVar4.n1;
                        if (d3 <= 0) {
                            d3 = d5;
                        }
                        String strD8 = pn40.d(d3, str15, p3u0Var2);
                        String str115 = n3wVar4.m1;
                        String str25 = n3wVar4.f;
                        if (d7 > r17) {
                            strF8 = ctf0Var4.f(R.string.history_auto_sale, new Object[0]);
                        } else if (z15) {
                            strF8 = ctf0Var4.f(R.string.promo, new Object[0]);
                        } else {
                            if (z14) {
                                strF8 = ctf0Var4.f(R.string.advance, new Object[0]);
                            } else {
                                str14 = str13;
                            }
                            strC = e3c.C(n3wVar4, ctf0Var4, listA);
                            boolean z2110 = n3wVar4.t;
                            boolean z2111 = !StringsKt.W(str14);
                            if (d7 > r17) {
                                iA3 = ctf0Var4.a(R.color.static_teal);
                            } else if (z15) {
                                iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                            } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                iA3 = ctf0Var4.a(R.color.static_violet);
                            } else {
                                iA3 = ctf0Var4.a(R.color.static_transparent);
                            }
                            ColorStateList colorStateListValueOf11 = ColorStateList.valueOf(iA3);
                            colorStateListValueOf11.getClass();
                            long j12 = n3wVar4.j;
                            if (e4fVar2 == e4f.c) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (n3wVar4.j1) {
                                i5 = R.drawable.ic_bell_on_new;
                            } else {
                                i5 = R.drawable.ic_bell_off_new;
                            }
                            if (s77Var3 != s77.AGGREGATOR) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (strC.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG4, z114, strF7, strD8, str115, z7, str25, new yad(str14, z2111, colorStateListValueOf11, z2110, j12, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                        }
                        str14 = strF8;
                        strC = e3c.C(n3wVar4, ctf0Var4, listA);
                        boolean z2112 = n3wVar4.t;
                        boolean z2113 = !StringsKt.W(str14);
                        if (d7 > r17) {
                            iA3 = ctf0Var4.a(R.color.static_teal);
                        } else if (z15) {
                            iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                        } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                            iA3 = ctf0Var4.a(R.color.static_violet);
                        } else {
                            iA3 = ctf0Var4.a(R.color.static_transparent);
                        }
                        ColorStateList colorStateListValueOf12 = ColorStateList.valueOf(iA3);
                        colorStateListValueOf12.getClass();
                        long j13 = n3wVar4.j;
                        if (e4fVar2 == e4f.c) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (n3wVar4.j1) {
                            i5 = R.drawable.ic_bell_on_new;
                        } else {
                            i5 = R.drawable.ic_bell_off_new;
                        }
                        if (s77Var3 != s77.AGGREGATOR) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (strC.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG4, z114, strF7, strD8, str115, z7, str25, new yad(str14, z2113, colorStateListValueOf12, z2112, j13, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                    } else {
                        if (n3wVar4.a()) {
                            strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                        } else if (d6 > r17) {
                            strF7 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                        } else {
                            strF7 = ctf0Var4.f(R.string.history_bet_rate, new Object[0]);
                        }
                        boolean z115 = z18;
                        str13 = str12;
                        d3 = n3wVar4.n1;
                        if (d3 <= 0) {
                            d3 = d5;
                        }
                        String strD9 = pn40.d(d3, str15, p3u0Var2);
                        String str116 = n3wVar4.m1;
                        String str26 = n3wVar4.f;
                        if (d7 > r17) {
                            strF8 = ctf0Var4.f(R.string.history_auto_sale, new Object[0]);
                        } else if (z15) {
                            strF8 = ctf0Var4.f(R.string.promo, new Object[0]);
                        } else {
                            if (z14) {
                                strF8 = ctf0Var4.f(R.string.advance, new Object[0]);
                            } else {
                                str14 = str13;
                            }
                            strC = e3c.C(n3wVar4, ctf0Var4, listA);
                            boolean z2114 = n3wVar4.t;
                            boolean z2115 = !StringsKt.W(str14);
                            if (d7 > r17) {
                                iA3 = ctf0Var4.a(R.color.static_teal);
                            } else if (z15) {
                                iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                            } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                                iA3 = ctf0Var4.a(R.color.static_violet);
                            } else {
                                iA3 = ctf0Var4.a(R.color.static_transparent);
                            }
                            ColorStateList colorStateListValueOf13 = ColorStateList.valueOf(iA3);
                            colorStateListValueOf13.getClass();
                            long j14 = n3wVar4.j;
                            if (e4fVar2 == e4f.c) {
                                z8 = false;
                            } else {
                                z8 = false;
                            }
                            if (n3wVar4.j1) {
                                i5 = R.drawable.ic_bell_on_new;
                            } else {
                                i5 = R.drawable.ic_bell_off_new;
                            }
                            if (s77Var3 != s77.AGGREGATOR) {
                                z9 = false;
                            } else {
                                z9 = false;
                            }
                            if (strC.length() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG4, z115, strF7, strD9, str116, z7, str26, new yad(str14, z2115, colorStateListValueOf13, z2114, j14, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                        }
                        str14 = strF8;
                        strC = e3c.C(n3wVar4, ctf0Var4, listA);
                        boolean z2116 = n3wVar4.t;
                        boolean z2117 = !StringsKt.W(str14);
                        if (d7 > r17) {
                            iA3 = ctf0Var4.a(R.color.static_teal);
                        } else if (z15) {
                            iA3 = ctf0.b(R.attr.uikitPrimary, ctf0Var4);
                        } else if (zjb.G(n3wVar4, ctf0Var4).length() > 0) {
                            iA3 = ctf0Var4.a(R.color.static_violet);
                        } else {
                            iA3 = ctf0Var4.a(R.color.static_transparent);
                        }
                        ColorStateList colorStateListValueOf14 = ColorStateList.valueOf(iA3);
                        colorStateListValueOf14.getClass();
                        long j15 = n3wVar4.j;
                        if (e4fVar2 == e4f.c) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (n3wVar4.j1) {
                            i5 = R.drawable.ic_bell_on_new;
                        } else {
                            i5 = R.drawable.ic_bell_off_new;
                        }
                        if (s77Var3 != s77.AGGREGATOR) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (strC.length() > 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        fbrVar = new zad(exo0Var, z17, strD2, iA2, strF6, z16, z12, e4fVar2, str11, iIntValue, str17, so7Var, mb90VarG4, z115, strF7, strD9, str116, z7, str26, new yad(str14, z2117, colorStateListValueOf14, z2116, j15, z8, i5, z9, z10, strC, n3wVar4.P1, ctf0Var4.h()));
                    }
                } else {
                    s77 s77Var9 = nawVar.D0;
                    r9u r9uVar = nawVar.Z;
                    ygp ygpVar = ygp.c;
                    r9uVar.getClass();
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    boolean zD = j1q0Var.f15748a.d(ygpVar);
                    n3wVar4.getClass();
                    String str27 = n3wVar4.u;
                    long j16 = n3wVar4.N1;
                    double d9 = n3wVar4.Z;
                    e4f e4fVar4 = n3wVar4.l;
                    q4f q4fVar7 = n3wVar4.g1;
                    String str28 = n3wVar4.g;
                    String str29 = n3wVar4.l1;
                    ctf0Var4.getClass();
                    sff0Var.getClass();
                    s77Var9.getClass();
                    listA.getClass();
                    sys0Var3.getClass();
                    double d10 = n3wVar4.o;
                    long j17 = n3wVar4.d;
                    int i7 = n3wVar4.y;
                    s77 s77Var10 = n3wVar4.c;
                    String str30 = str29;
                    String str31 = n3wVar4.b;
                    BigDecimal bigDecimal = new BigDecimal(String.valueOf(d10));
                    double d11 = n3wVar4.p1;
                    BigDecimal bigDecimalSubtract = bigDecimal.subtract(new BigDecimal(String.valueOf(d11)));
                    bigDecimalSubtract.getClass();
                    double d12 = n3wVar4.m;
                    BigDecimal bigDecimalSubtract2 = new BigDecimal(String.valueOf(d12)).subtract(bigDecimalSubtract);
                    bigDecimalSubtract2.getClass();
                    double dDoubleValue = bigDecimalSubtract2.doubleValue();
                    boolean zB = n3wVar4.b();
                    boolean zE = n3wVar4.e();
                    String str32 = "";
                    String str33 = n3wVar4.f22868a;
                    String str34 = str33.length() > 0 ? str33 : null;
                    if (str34 == null) {
                        str34 = str31;
                    }
                    double d13 = n3wVar4.p;
                    mb90 mb90VarG5 = vvw.G(n3wVar4, ctf0Var4, sff0Var.f32117a.h);
                    String str35 = n3wVar4.u;
                    String str36 = n3wVar4.g;
                    boolean z30 = n3wVar4.r1;
                    double d14 = n3wVar4.n;
                    boolean z31 = n3wVar4.f1;
                    double d15 = n3wVar4.B;
                    double d16 = n3wVar4.G1;
                    double d17 = n3wVar4.v;
                    String strG = zjb.G(n3wVar4, ctf0Var4);
                    String strC2 = e3c.C(n3wVar4, ctf0Var4, listA);
                    long j18 = n3wVar4.j;
                    boolean z32 = n3wVar4.s1;
                    boolean z33 = n3wVar4.t;
                    int iOrdinal2 = s77Var10.ordinal();
                    if (iOrdinal2 == 1) {
                        strF = ctf0Var4.f(R.string.history_coupon_number, str33);
                        str = strF;
                    } else if (iOrdinal2 == 5) {
                        strF = ctf0Var4.f(hew0.L(n3wVar4.h1), new Object[0]);
                        str = strF;
                    } else if (iOrdinal2 != 6) {
                        str = n3wVar4.m1;
                        j18 = j18;
                    } else {
                        strF = ctf0Var4.f(R.string.history_coupon_number, str33);
                        str = strF;
                    }
                    int iOrdinal3 = s77Var10.ordinal();
                    if (iOrdinal3 == 1) {
                        str2 = str32;
                    } else {
                        if (iOrdinal3 != 2) {
                            if (iOrdinal3 == 6) {
                                str2 = str32;
                            }
                        } else if (str33.length() == 0) {
                            str2 = str31;
                        }
                        str2 = str33;
                    }
                    boolean z34 = (e4fVar4 != e4f.c || s77Var10 == s77.TOTO || s77Var10 == s77.JACKPOT || s77Var10 == s77.AUTO) ? false : true;
                    int i8 = n3wVar4.j1 ? R.drawable.ic_bell_on_new : R.drawable.ic_bell_off_new;
                    s77 s77Var11 = s77.AGGREGATOR;
                    lsv lsvVar = new lsv(j18, z32, str, str2, z34, i8, (s77Var10 == s77Var11 || q3d.j(e4f.l, e4f.m).contains(e4fVar4)) ? false : true, z33, d9 > 0.0d, strG.length() > 0, jtv.I0(d9, str28, false), strG, zjb.H(n3wVar4, ctf0Var4, str28), strC2.length() > 0, strC2, n3wVar4.f1 && j16 != 0, ctf0Var4.f(R.string.bet_info_approved_by_bet_v2, String.valueOf(j16)), n3wVar4.P1);
                    exo0 exo0VarN2 = atm0.n(n3wVar4.z1, str28, e4fVar4, ctf0Var4);
                    s77 s77Var12 = s77.JACKPOT;
                    boolean z35 = (s77Var9 == s77Var12 || s77Var9 == s77.SALE) ? false : true;
                    s77 s77Var13 = s77.SALE;
                    boolean z36 = s77Var9 == s77Var13;
                    pn40 pn40Var3 = pn40.f27267a;
                    String strD10 = pn40.d(d12, str28, p3u0.c);
                    boolean z37 = s77Var9 == s77Var13;
                    s77 s77Var14 = s77Var13;
                    String strI0 = jtv.I0(dDoubleValue, str28, true);
                    if (dDoubleValue > 0.0d) {
                        iA = ctf0Var4.a(R.color.static_green);
                    } else {
                        iA = dDoubleValue < 0.0d ? ctf0Var4.a(R.color.static_red) : ctf0.b(R.attr.uikitTextPrimary, ctf0Var4);
                    }
                    int i9 = iA;
                    if (s77Var10 == s77Var11 || s77Var10 == s77Var12) {
                        str3 = strD10;
                        z37 = z37;
                        s77Var14 = s77Var14;
                        j = j17;
                        gfl0Var = new gfl0(R.drawable.ic_cards_aggregator);
                    } else {
                        str3 = strD10;
                        if (s77Var10 == s77.TOTO) {
                            gfl0Var = new gfl0(lgb.Y(q4fVar7));
                        } else if (i7 > 1) {
                            gfl0Var = new gfl0(lgb.S(q4fVar7));
                        } else if (i7 == 1) {
                            if (j17 != 0) {
                                bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                j = j17;
                                rz4.s(j, ".svg", bzuVarD);
                                string3 = ((StringBuilder) bzuVarD.b).toString();
                            } else {
                                j = j17;
                                string3 = str32;
                            }
                            gfl0Var = new ffl0(string3);
                        } else {
                            z37 = z37;
                            s77Var14 = s77Var14;
                            j = j17;
                            gfl0Var = efl0.f7724a;
                        }
                        z37 = z37;
                        s77Var14 = s77Var14;
                        j = j17;
                        strA = zjb.A(n3wVar4, ctf0Var4);
                        if (str30.length() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        hfl0Var = gfl0Var;
                        i = n3wVar4.A;
                        if (i7 != 1) {
                            strF2 = ctf0Var4.f(R.string.finished_bets, Integer.valueOf(i), Integer.valueOf(i7));
                        } else {
                            strF2 = str32;
                        }
                        if (n3wVar4.a()) {
                            str4 = strF2;
                            strF3 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                        } else {
                            str4 = strF2;
                            if (e4fVar4 == e4f.j) {
                                strF3 = ctf0Var4.f(R.string.starting_bet, new Object[0]);
                            } else {
                                str32 = str32;
                                ctf0Var = ctf0Var4;
                                if (n3wVar4.n > 0.0d) {
                                    strF3 = ctf0Var.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                                } else {
                                    strF3 = ctf0Var.f(R.string.history_bet_rate, new Object[0]);
                                }
                                s77Var12 = s77Var12;
                            }
                            d = n3wVar4.n1;
                            if (d <= 0.0d) {
                                d = d10 - d11;
                            }
                            String strI1 = jtv.I0(d, str28, false);
                            if (s77Var9 != s77.TOTO || s77Var9 == s77Var12) {
                                q4fVar = q4fVar7;
                                if (d10 > 0.0d) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                q4fVar = q4fVar7;
                                if (q4fVar == q4f.h || e4fVar4 == e4f.j) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                            }
                            String str37 = str4;
                            if (s77Var9 == s77Var11) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            iK = hew0.K(n3wVar4.i1);
                            if (iK != 0) {
                                strF4 = ctf0Var.f(iK, new Object[0]);
                            } else {
                                strF4 = str32;
                            }
                            String strF11 = ctf0Var.f(R.string.casino_history_bet_type, new Object[0]);
                            s77Var = s77Var14;
                            if (s77Var9 != s77Var) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            list = n3wVar4.J1;
                            q4fVar2 = q4f.c;
                            str5 = n3wVar4.f;
                            if (q4fVar == q4fVar2) {
                                if (((su6) CollectionsKt.U(list)).p.length() > 0) {
                                    strL = kng0.l(((su6) CollectionsKt.U(list)).m, " - ", ((su6) CollectionsKt.U(list)).p);
                                } else {
                                    strL = ((su6) CollectionsKt.U(list)).m;
                                }
                                if (j == 95) {
                                    i2 = 0;
                                    strL2 = kng0.l(ctf0Var.f(R.string.betconstructor, new Object[0]), ". ", strL);
                                    str30 = str30;
                                } else {
                                    str30 = str30;
                                    i2 = 0;
                                    strL2 = kng0.l(str30, ". ", strL);
                                }
                                String str38 = strL2;
                                if (nzc.f24366a[e4fVar4.ordinal()] == 1) {
                                    string = ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[i2], i2));
                                    e4fVar4 = e4fVar4;
                                    ctf0Var3 = ctf0Var;
                                    sys0Var = sys0Var3;
                                } else {
                                    if (list.size() == 1) {
                                        i3 = ((su6) CollectionsKt.U(list)).w;
                                    } else {
                                        i3 = -1;
                                    }
                                    su6Var = (su6) CollectionsKt.firstOrNull(list);
                                    if (su6Var != null) {
                                        str6 = su6Var.Y;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str6 == null) {
                                        str6 = str32;
                                    }
                                    if (su6Var != null) {
                                        str7 = su6Var.x;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 == null) {
                                        str7 = str32;
                                    }
                                    if (su6Var != null) {
                                        str8 = su6Var.B;
                                    } else {
                                        str8 = null;
                                    }
                                    if (str8 == null) {
                                        str8 = str32;
                                    }
                                    if (zD) {
                                        ctf0Var3 = ctf0Var;
                                        String strE = i3 != -1 ? ua80.e(i3, ". [Р :", "]: ") : ". ";
                                        sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                        if (str6.length() > 0) {
                                            sb.append(". ".concat(str6));
                                        }
                                        if (str7.length() > 0) {
                                            sb.append(". ".concat(str7));
                                        }
                                        if (str8.length() > 0) {
                                            sys0Var = sys0Var3;
                                            if (sys0Var != sys0.c) {
                                                sb.append(". ".concat(str8));
                                            }
                                        } else {
                                            sys0Var = sys0Var3;
                                        }
                                        string = sb.toString();
                                    } else {
                                        ctf0Var3 = ctf0Var;
                                    }
                                    sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                    if (str6.length() > 0) {
                                        sb.append(". ".concat(str6));
                                    }
                                    if (str7.length() > 0) {
                                        sb.append(". ".concat(str7));
                                    }
                                    if (str8.length() > 0) {
                                        sys0Var = sys0Var3;
                                        if (sys0Var != sys0.c) {
                                            sb.append(". ".concat(str8));
                                        }
                                    } else {
                                        sys0Var = sys0Var3;
                                    }
                                    string = sb.toString();
                                }
                                String str39 = string;
                                boolean z38 = !nkb.E(n3wVar4, s77Var9);
                                if (j != 0) {
                                    bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD2);
                                    string2 = ((StringBuilder) bzuVarD2.b).toString();
                                } else {
                                    string2 = str32;
                                }
                                jzcVar = new kzc(str5, str38, str39, z38, string2);
                                ctf0Var2 = ctf0Var3;
                                e4fVar = e4fVar4;
                            } else {
                                q4fVar = q4fVar;
                                strF3 = strF3;
                                ctf0 ctf0Var5 = ctf0Var;
                                sys0Var = sys0Var3;
                                if (str27.length() > 0) {
                                    e4fVar = e4fVar4;
                                    if (e4fVar == e4f.j && s77Var9 != s77Var) {
                                        strF5 = str27.concat(Separators.COLON);
                                        ctf0Var2 = ctf0Var5;
                                    }
                                    jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                                } else {
                                    e4fVar = e4fVar4;
                                }
                                ctf0Var2 = ctf0Var5;
                                strF5 = ctf0Var2.f(R.string.coefficient_with_colon, new Object[0]);
                                jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                            }
                            ozcVar = n3wVar4.L1;
                            q4f q4fVar8 = q4fVar;
                            boolean zContains2 = q3d.j(q4f.e, q4f.g).contains(q4fVar8);
                            sys0Var2 = sys0.c;
                            if (sys0Var != sys0Var2 && zContains2) {
                                i6 = R.string.history_min_payout;
                            } else if (sys0Var != sys0Var2 && !zContains2) {
                                i6 = R.string.history_possible_win;
                            } else if (ozcVar != ozc.MAX_PAYOUT) {
                                if (ozcVar == ozc.MIN_PAYOUT) {
                                    i6 = R.string.history_min_payout;
                                } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                    i6 = R.string.history_possible_win;
                                } else {
                                    i6 = 0;
                                }
                            }
                            if (zB || sys0Var != sys0Var2) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if (zE || sys0Var != sys0Var2) {
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            fbrVar = new fbr(str34, z35, exo0VarN2, lsvVar, z36, str3, z37, s77Var9, strI0, i9, d17, e4fVar, d13, mb90VarG5, q4fVar8, str35, str36, z30, d14, zB, z5, zE, z6, hfl0Var, strA, str30, z, str37, strF3, strI1, z2, z3, strF4, z4, strF11, z12, z31, d15, d16, jzcVar, i6, ctf0Var2.h());
                        }
                        ctf0Var = ctf0Var4;
                        d = n3wVar4.n1;
                        if (d <= 0.0d) {
                            d = d10 - d11;
                        }
                        String strI2 = jtv.I0(d, str28, false);
                        if (s77Var9 != s77.TOTO) {
                            q4fVar = q4fVar7;
                            if (d10 > 0.0d) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String str310 = str4;
                            if (s77Var9 == s77Var11) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            iK = hew0.K(n3wVar4.i1);
                            if (iK != 0) {
                                strF4 = ctf0Var.f(iK, new Object[0]);
                            } else {
                                strF4 = str32;
                            }
                            String strF12 = ctf0Var.f(R.string.casino_history_bet_type, new Object[0]);
                            s77Var = s77Var14;
                            if (s77Var9 != s77Var) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            list = n3wVar4.J1;
                            q4fVar2 = q4f.c;
                            str5 = n3wVar4.f;
                            if (q4fVar == q4fVar2) {
                                if (((su6) CollectionsKt.U(list)).p.length() > 0) {
                                    strL = kng0.l(((su6) CollectionsKt.U(list)).m, " - ", ((su6) CollectionsKt.U(list)).p);
                                } else {
                                    strL = ((su6) CollectionsKt.U(list)).m;
                                }
                                if (j == 95) {
                                    i2 = 0;
                                    strL2 = kng0.l(ctf0Var.f(R.string.betconstructor, new Object[0]), ". ", strL);
                                    str30 = str30;
                                } else {
                                    str30 = str30;
                                    i2 = 0;
                                    strL2 = kng0.l(str30, ". ", strL);
                                }
                                String str311 = strL2;
                                if (nzc.f24366a[e4fVar4.ordinal()] == 1) {
                                    string = ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[i2], i2));
                                    e4fVar4 = e4fVar4;
                                    ctf0Var3 = ctf0Var;
                                    sys0Var = sys0Var3;
                                } else {
                                    if (list.size() == 1) {
                                        i3 = ((su6) CollectionsKt.U(list)).w;
                                    } else {
                                        i3 = -1;
                                    }
                                    su6Var = (su6) CollectionsKt.firstOrNull(list);
                                    if (su6Var != null) {
                                        str6 = su6Var.Y;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str6 == null) {
                                        str6 = str32;
                                    }
                                    if (su6Var != null) {
                                        str7 = su6Var.x;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 == null) {
                                        str7 = str32;
                                    }
                                    if (su6Var != null) {
                                        str8 = su6Var.B;
                                    } else {
                                        str8 = null;
                                    }
                                    if (str8 == null) {
                                        str8 = str32;
                                    }
                                    if (zD) {
                                        ctf0Var3 = ctf0Var;
                                        if (i3 != -1) {
                                        }
                                        sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                        if (str6.length() > 0) {
                                            sb.append(". ".concat(str6));
                                        }
                                        if (str7.length() > 0) {
                                            sb.append(". ".concat(str7));
                                        }
                                        if (str8.length() > 0) {
                                            sys0Var = sys0Var3;
                                            if (sys0Var != sys0.c) {
                                                sb.append(". ".concat(str8));
                                            }
                                        } else {
                                            sys0Var = sys0Var3;
                                        }
                                        string = sb.toString();
                                    } else {
                                        ctf0Var3 = ctf0Var;
                                    }
                                    sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                    if (str6.length() > 0) {
                                        sb.append(". ".concat(str6));
                                    }
                                    if (str7.length() > 0) {
                                        sb.append(". ".concat(str7));
                                    }
                                    if (str8.length() > 0) {
                                        sys0Var = sys0Var3;
                                        if (sys0Var != sys0.c) {
                                            sb.append(". ".concat(str8));
                                        }
                                    } else {
                                        sys0Var = sys0Var3;
                                    }
                                    string = sb.toString();
                                }
                                String str312 = string;
                                boolean z39 = !nkb.E(n3wVar4, s77Var9);
                                if (j != 0) {
                                    bzu bzuVarD3 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD3);
                                    string2 = ((StringBuilder) bzuVarD3.b).toString();
                                } else {
                                    string2 = str32;
                                }
                                jzcVar = new kzc(str5, str311, str312, z39, string2);
                                ctf0Var2 = ctf0Var3;
                                e4fVar = e4fVar4;
                            } else {
                                q4fVar = q4fVar;
                                strF3 = strF3;
                                ctf0 ctf0Var6 = ctf0Var;
                                sys0Var = sys0Var3;
                                if (str27.length() > 0) {
                                    e4fVar = e4fVar4;
                                    if (e4fVar == e4f.j) {
                                    }
                                    jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                                } else {
                                    e4fVar = e4fVar4;
                                }
                                ctf0Var2 = ctf0Var6;
                                strF5 = ctf0Var2.f(R.string.coefficient_with_colon, new Object[0]);
                                jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                            }
                            ozcVar = n3wVar4.L1;
                            q4f q4fVar9 = q4fVar;
                            boolean zContains3 = q3d.j(q4f.e, q4f.g).contains(q4fVar9);
                            sys0Var2 = sys0.c;
                            if (sys0Var != sys0Var2) {
                                if (sys0Var != sys0Var2) {
                                    if (ozcVar != ozc.MAX_PAYOUT) {
                                        if (ozcVar == ozc.MIN_PAYOUT) {
                                            i6 = R.string.history_min_payout;
                                        } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                            i6 = R.string.history_possible_win;
                                        } else {
                                            i6 = 0;
                                        }
                                    }
                                } else if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (sys0Var != sys0Var2) {
                                if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (ozcVar != ozc.MAX_PAYOUT) {
                                if (ozcVar == ozc.MIN_PAYOUT) {
                                    i6 = R.string.history_min_payout;
                                } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                    i6 = R.string.history_possible_win;
                                } else {
                                    i6 = 0;
                                }
                            }
                            if (zB) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (zE) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            fbrVar = new fbr(str34, z35, exo0VarN2, lsvVar, z36, str3, z37, s77Var9, strI0, i9, d17, e4fVar, d13, mb90VarG5, q4fVar9, str35, str36, z30, d14, zB, z5, zE, z6, hfl0Var, strA, str30, z, str310, strF3, strI2, z2, z3, strF4, z4, strF12, z12, z31, d15, d16, jzcVar, i6, ctf0Var2.h());
                        } else {
                            q4fVar = q4fVar7;
                            if (d10 > 0.0d) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String str313 = str4;
                            if (s77Var9 == s77Var11) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            iK = hew0.K(n3wVar4.i1);
                            if (iK != 0) {
                                strF4 = ctf0Var.f(iK, new Object[0]);
                            } else {
                                strF4 = str32;
                            }
                            String strF13 = ctf0Var.f(R.string.casino_history_bet_type, new Object[0]);
                            s77Var = s77Var14;
                            if (s77Var9 != s77Var) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            list = n3wVar4.J1;
                            q4fVar2 = q4f.c;
                            str5 = n3wVar4.f;
                            if (q4fVar == q4fVar2) {
                                if (((su6) CollectionsKt.U(list)).p.length() > 0) {
                                    strL = kng0.l(((su6) CollectionsKt.U(list)).m, " - ", ((su6) CollectionsKt.U(list)).p);
                                } else {
                                    strL = ((su6) CollectionsKt.U(list)).m;
                                }
                                if (j == 95) {
                                    i2 = 0;
                                    strL2 = kng0.l(ctf0Var.f(R.string.betconstructor, new Object[0]), ". ", strL);
                                    str30 = str30;
                                } else {
                                    str30 = str30;
                                    i2 = 0;
                                    strL2 = kng0.l(str30, ". ", strL);
                                }
                                String str314 = strL2;
                                if (nzc.f24366a[e4fVar4.ordinal()] == 1) {
                                    string = ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[i2], i2));
                                    e4fVar4 = e4fVar4;
                                    ctf0Var3 = ctf0Var;
                                    sys0Var = sys0Var3;
                                } else {
                                    if (list.size() == 1) {
                                        i3 = ((su6) CollectionsKt.U(list)).w;
                                    } else {
                                        i3 = -1;
                                    }
                                    su6Var = (su6) CollectionsKt.firstOrNull(list);
                                    if (su6Var != null) {
                                        str6 = su6Var.Y;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str6 == null) {
                                        str6 = str32;
                                    }
                                    if (su6Var != null) {
                                        str7 = su6Var.x;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 == null) {
                                        str7 = str32;
                                    }
                                    if (su6Var != null) {
                                        str8 = su6Var.B;
                                    } else {
                                        str8 = null;
                                    }
                                    if (str8 == null) {
                                        str8 = str32;
                                    }
                                    if (zD) {
                                        ctf0Var3 = ctf0Var;
                                        if (i3 != -1) {
                                        }
                                        sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                        if (str6.length() > 0) {
                                            sb.append(". ".concat(str6));
                                        }
                                        if (str7.length() > 0) {
                                            sb.append(". ".concat(str7));
                                        }
                                        if (str8.length() > 0) {
                                            sys0Var = sys0Var3;
                                            if (sys0Var != sys0.c) {
                                                sb.append(". ".concat(str8));
                                            }
                                        } else {
                                            sys0Var = sys0Var3;
                                        }
                                        string = sb.toString();
                                    } else {
                                        ctf0Var3 = ctf0Var;
                                    }
                                    sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                    if (str6.length() > 0) {
                                        sb.append(". ".concat(str6));
                                    }
                                    if (str7.length() > 0) {
                                        sb.append(". ".concat(str7));
                                    }
                                    if (str8.length() > 0) {
                                        sys0Var = sys0Var3;
                                        if (sys0Var != sys0.c) {
                                            sb.append(". ".concat(str8));
                                        }
                                    } else {
                                        sys0Var = sys0Var3;
                                    }
                                    string = sb.toString();
                                }
                                String str315 = string;
                                boolean z310 = !nkb.E(n3wVar4, s77Var9);
                                if (j != 0) {
                                    bzu bzuVarD4 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD4);
                                    string2 = ((StringBuilder) bzuVarD4.b).toString();
                                } else {
                                    string2 = str32;
                                }
                                jzcVar = new kzc(str5, str314, str315, z310, string2);
                                ctf0Var2 = ctf0Var3;
                                e4fVar = e4fVar4;
                            } else {
                                q4fVar = q4fVar;
                                strF3 = strF3;
                                ctf0 ctf0Var7 = ctf0Var;
                                sys0Var = sys0Var3;
                                if (str27.length() > 0) {
                                    e4fVar = e4fVar4;
                                    if (e4fVar == e4f.j) {
                                    }
                                    jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                                } else {
                                    e4fVar = e4fVar4;
                                }
                                ctf0Var2 = ctf0Var7;
                                strF5 = ctf0Var2.f(R.string.coefficient_with_colon, new Object[0]);
                                jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                            }
                            ozcVar = n3wVar4.L1;
                            q4f q4fVar10 = q4fVar;
                            boolean zContains4 = q3d.j(q4f.e, q4f.g).contains(q4fVar10);
                            sys0Var2 = sys0.c;
                            if (sys0Var != sys0Var2) {
                                if (sys0Var != sys0Var2) {
                                    if (ozcVar != ozc.MAX_PAYOUT) {
                                        if (ozcVar == ozc.MIN_PAYOUT) {
                                            i6 = R.string.history_min_payout;
                                        } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                            i6 = R.string.history_possible_win;
                                        } else {
                                            i6 = 0;
                                        }
                                    }
                                } else if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (sys0Var != sys0Var2) {
                                if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (ozcVar != ozc.MAX_PAYOUT) {
                                if (ozcVar == ozc.MIN_PAYOUT) {
                                    i6 = R.string.history_min_payout;
                                } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                    i6 = R.string.history_possible_win;
                                } else {
                                    i6 = 0;
                                }
                            }
                            if (zB) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (zE) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            fbrVar = new fbr(str34, z35, exo0VarN2, lsvVar, z36, str3, z37, s77Var9, strI0, i9, d17, e4fVar, d13, mb90VarG5, q4fVar10, str35, str36, z30, d14, zB, z5, zE, z6, hfl0Var, strA, str30, z, str313, strF3, strI2, z2, z3, strF4, z4, strF13, z12, z31, d15, d16, jzcVar, i6, ctf0Var2.h());
                        }
                    }
                    strA = zjb.A(n3wVar4, ctf0Var4);
                    if (str30.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hfl0Var = gfl0Var;
                    i = n3wVar4.A;
                    if (i7 != 1) {
                        strF2 = ctf0Var4.f(R.string.finished_bets, Integer.valueOf(i), Integer.valueOf(i7));
                    } else {
                        strF2 = str32;
                    }
                    if (n3wVar4.a()) {
                        str4 = strF2;
                        strF3 = ctf0Var4.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                    } else {
                        str4 = strF2;
                        if (e4fVar4 == e4f.j) {
                            strF3 = ctf0Var4.f(R.string.starting_bet, new Object[0]);
                        } else {
                            str32 = str32;
                            ctf0Var = ctf0Var4;
                            if (n3wVar4.n > 0.0d) {
                                strF3 = ctf0Var.f(R.string.history_bet_rate_partially_sold, new Object[0]);
                            } else {
                                strF3 = ctf0Var.f(R.string.history_bet_rate, new Object[0]);
                            }
                            s77Var12 = s77Var12;
                        }
                        d = n3wVar4.n1;
                        if (d <= 0.0d) {
                            d = d10 - d11;
                        }
                        String strI3 = jtv.I0(d, str28, false);
                        if (s77Var9 != s77.TOTO) {
                            q4fVar = q4fVar7;
                            if (d10 > 0.0d) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String str316 = str4;
                            if (s77Var9 == s77Var11) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            iK = hew0.K(n3wVar4.i1);
                            if (iK != 0) {
                                strF4 = ctf0Var.f(iK, new Object[0]);
                            } else {
                                strF4 = str32;
                            }
                            String strF14 = ctf0Var.f(R.string.casino_history_bet_type, new Object[0]);
                            s77Var = s77Var14;
                            if (s77Var9 != s77Var) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            list = n3wVar4.J1;
                            q4fVar2 = q4f.c;
                            str5 = n3wVar4.f;
                            if (q4fVar == q4fVar2) {
                                if (((su6) CollectionsKt.U(list)).p.length() > 0) {
                                    strL = kng0.l(((su6) CollectionsKt.U(list)).m, " - ", ((su6) CollectionsKt.U(list)).p);
                                } else {
                                    strL = ((su6) CollectionsKt.U(list)).m;
                                }
                                if (j == 95) {
                                    i2 = 0;
                                    strL2 = kng0.l(ctf0Var.f(R.string.betconstructor, new Object[0]), ". ", strL);
                                    str30 = str30;
                                } else {
                                    str30 = str30;
                                    i2 = 0;
                                    strL2 = kng0.l(str30, ". ", strL);
                                }
                                String str317 = strL2;
                                if (nzc.f24366a[e4fVar4.ordinal()] == 1) {
                                    string = ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[i2], i2));
                                    e4fVar4 = e4fVar4;
                                    ctf0Var3 = ctf0Var;
                                    sys0Var = sys0Var3;
                                } else {
                                    if (list.size() == 1) {
                                        i3 = ((su6) CollectionsKt.U(list)).w;
                                    } else {
                                        i3 = -1;
                                    }
                                    su6Var = (su6) CollectionsKt.firstOrNull(list);
                                    if (su6Var != null) {
                                        str6 = su6Var.Y;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str6 == null) {
                                        str6 = str32;
                                    }
                                    if (su6Var != null) {
                                        str7 = su6Var.x;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 == null) {
                                        str7 = str32;
                                    }
                                    if (su6Var != null) {
                                        str8 = su6Var.B;
                                    } else {
                                        str8 = null;
                                    }
                                    if (str8 == null) {
                                        str8 = str32;
                                    }
                                    if (zD) {
                                        ctf0Var3 = ctf0Var;
                                        if (i3 != -1) {
                                        }
                                        sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                        if (str6.length() > 0) {
                                            sb.append(". ".concat(str6));
                                        }
                                        if (str7.length() > 0) {
                                            sb.append(". ".concat(str7));
                                        }
                                        if (str8.length() > 0) {
                                            sys0Var = sys0Var3;
                                            if (sys0Var != sys0.c) {
                                                sb.append(". ".concat(str8));
                                            }
                                        } else {
                                            sys0Var = sys0Var3;
                                        }
                                        string = sb.toString();
                                    } else {
                                        ctf0Var3 = ctf0Var;
                                    }
                                    sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                    if (str6.length() > 0) {
                                        sb.append(". ".concat(str6));
                                    }
                                    if (str7.length() > 0) {
                                        sb.append(". ".concat(str7));
                                    }
                                    if (str8.length() > 0) {
                                        sys0Var = sys0Var3;
                                        if (sys0Var != sys0.c) {
                                            sb.append(". ".concat(str8));
                                        }
                                    } else {
                                        sys0Var = sys0Var3;
                                    }
                                    string = sb.toString();
                                }
                                String str318 = string;
                                boolean z311 = !nkb.E(n3wVar4, s77Var9);
                                if (j != 0) {
                                    bzu bzuVarD5 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD5);
                                    string2 = ((StringBuilder) bzuVarD5.b).toString();
                                } else {
                                    string2 = str32;
                                }
                                jzcVar = new kzc(str5, str317, str318, z311, string2);
                                ctf0Var2 = ctf0Var3;
                                e4fVar = e4fVar4;
                            } else {
                                q4fVar = q4fVar;
                                strF3 = strF3;
                                ctf0 ctf0Var8 = ctf0Var;
                                sys0Var = sys0Var3;
                                if (str27.length() > 0) {
                                    e4fVar = e4fVar4;
                                    if (e4fVar == e4f.j) {
                                    }
                                    jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                                } else {
                                    e4fVar = e4fVar4;
                                }
                                ctf0Var2 = ctf0Var8;
                                strF5 = ctf0Var2.f(R.string.coefficient_with_colon, new Object[0]);
                                jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                            }
                            ozcVar = n3wVar4.L1;
                            q4f q4fVar11 = q4fVar;
                            boolean zContains5 = q3d.j(q4f.e, q4f.g).contains(q4fVar11);
                            sys0Var2 = sys0.c;
                            if (sys0Var != sys0Var2) {
                                if (sys0Var != sys0Var2) {
                                    if (ozcVar != ozc.MAX_PAYOUT) {
                                        if (ozcVar == ozc.MIN_PAYOUT) {
                                            i6 = R.string.history_min_payout;
                                        } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                            i6 = R.string.history_possible_win;
                                        } else {
                                            i6 = 0;
                                        }
                                    }
                                } else if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (sys0Var != sys0Var2) {
                                if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (ozcVar != ozc.MAX_PAYOUT) {
                                if (ozcVar == ozc.MIN_PAYOUT) {
                                    i6 = R.string.history_min_payout;
                                } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                    i6 = R.string.history_possible_win;
                                } else {
                                    i6 = 0;
                                }
                            }
                            if (zB) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (zE) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            fbrVar = new fbr(str34, z35, exo0VarN2, lsvVar, z36, str3, z37, s77Var9, strI0, i9, d17, e4fVar, d13, mb90VarG5, q4fVar11, str35, str36, z30, d14, zB, z5, zE, z6, hfl0Var, strA, str30, z, str316, strF3, strI3, z2, z3, strF4, z4, strF14, z12, z31, d15, d16, jzcVar, i6, ctf0Var2.h());
                        } else {
                            q4fVar = q4fVar7;
                            if (d10 > 0.0d) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String str319 = str4;
                            if (s77Var9 == s77Var11) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            iK = hew0.K(n3wVar4.i1);
                            if (iK != 0) {
                                strF4 = ctf0Var.f(iK, new Object[0]);
                            } else {
                                strF4 = str32;
                            }
                            String strF15 = ctf0Var.f(R.string.casino_history_bet_type, new Object[0]);
                            s77Var = s77Var14;
                            if (s77Var9 != s77Var) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            list = n3wVar4.J1;
                            q4fVar2 = q4f.c;
                            str5 = n3wVar4.f;
                            if (q4fVar == q4fVar2) {
                                if (((su6) CollectionsKt.U(list)).p.length() > 0) {
                                    strL = kng0.l(((su6) CollectionsKt.U(list)).m, " - ", ((su6) CollectionsKt.U(list)).p);
                                } else {
                                    strL = ((su6) CollectionsKt.U(list)).m;
                                }
                                if (j == 95) {
                                    i2 = 0;
                                    strL2 = kng0.l(ctf0Var.f(R.string.betconstructor, new Object[0]), ". ", strL);
                                    str30 = str30;
                                } else {
                                    str30 = str30;
                                    i2 = 0;
                                    strL2 = kng0.l(str30, ". ", strL);
                                }
                                String str3110 = strL2;
                                if (nzc.f24366a[e4fVar4.ordinal()] == 1) {
                                    string = ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[i2], i2));
                                    e4fVar4 = e4fVar4;
                                    ctf0Var3 = ctf0Var;
                                    sys0Var = sys0Var3;
                                } else {
                                    if (list.size() == 1) {
                                        i3 = ((su6) CollectionsKt.U(list)).w;
                                    } else {
                                        i3 = -1;
                                    }
                                    su6Var = (su6) CollectionsKt.firstOrNull(list);
                                    if (su6Var != null) {
                                        str6 = su6Var.Y;
                                    } else {
                                        str6 = null;
                                    }
                                    if (str6 == null) {
                                        str6 = str32;
                                    }
                                    if (su6Var != null) {
                                        str7 = su6Var.x;
                                    } else {
                                        str7 = null;
                                    }
                                    if (str7 == null) {
                                        str7 = str32;
                                    }
                                    if (su6Var != null) {
                                        str8 = su6Var.B;
                                    } else {
                                        str8 = null;
                                    }
                                    if (str8 == null) {
                                        str8 = str32;
                                    }
                                    if (zD) {
                                        ctf0Var3 = ctf0Var;
                                        if (i3 != -1) {
                                        }
                                        sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                        if (str6.length() > 0) {
                                            sb.append(". ".concat(str6));
                                        }
                                        if (str7.length() > 0) {
                                            sb.append(". ".concat(str7));
                                        }
                                        if (str8.length() > 0) {
                                            sys0Var = sys0Var3;
                                            if (sys0Var != sys0.c) {
                                                sb.append(". ".concat(str8));
                                            }
                                        } else {
                                            sys0Var = sys0Var3;
                                        }
                                        string = sb.toString();
                                    } else {
                                        ctf0Var3 = ctf0Var;
                                    }
                                    sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                    if (str6.length() > 0) {
                                        sb.append(". ".concat(str6));
                                    }
                                    if (str7.length() > 0) {
                                        sb.append(". ".concat(str7));
                                    }
                                    if (str8.length() > 0) {
                                        sys0Var = sys0Var3;
                                        if (sys0Var != sys0.c) {
                                            sb.append(". ".concat(str8));
                                        }
                                    } else {
                                        sys0Var = sys0Var3;
                                    }
                                    string = sb.toString();
                                }
                                String str3111 = string;
                                boolean z312 = !nkb.E(n3wVar4, s77Var9);
                                if (j != 0) {
                                    bzu bzuVarD6 = rz4.d("static", "svg", "sports_v2");
                                    rz4.s(j, ".svg", bzuVarD6);
                                    string2 = ((StringBuilder) bzuVarD6.b).toString();
                                } else {
                                    string2 = str32;
                                }
                                jzcVar = new kzc(str5, str3110, str3111, z312, string2);
                                ctf0Var2 = ctf0Var3;
                                e4fVar = e4fVar4;
                            } else {
                                q4fVar = q4fVar;
                                strF3 = strF3;
                                ctf0 ctf0Var9 = ctf0Var;
                                sys0Var = sys0Var3;
                                if (str27.length() > 0) {
                                    e4fVar = e4fVar4;
                                    if (e4fVar == e4f.j) {
                                    }
                                    jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                                } else {
                                    e4fVar = e4fVar4;
                                }
                                ctf0Var2 = ctf0Var9;
                                strF5 = ctf0Var2.f(R.string.coefficient_with_colon, new Object[0]);
                                jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                            }
                            ozcVar = n3wVar4.L1;
                            q4f q4fVar12 = q4fVar;
                            boolean zContains6 = q3d.j(q4f.e, q4f.g).contains(q4fVar12);
                            sys0Var2 = sys0.c;
                            if (sys0Var != sys0Var2) {
                                if (sys0Var != sys0Var2) {
                                    if (ozcVar != ozc.MAX_PAYOUT) {
                                        if (ozcVar == ozc.MIN_PAYOUT) {
                                            i6 = R.string.history_min_payout;
                                        } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                            i6 = R.string.history_possible_win;
                                        } else {
                                            i6 = 0;
                                        }
                                    }
                                } else if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (sys0Var != sys0Var2) {
                                if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (ozcVar != ozc.MAX_PAYOUT) {
                                if (ozcVar == ozc.MIN_PAYOUT) {
                                    i6 = R.string.history_min_payout;
                                } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                    i6 = R.string.history_possible_win;
                                } else {
                                    i6 = 0;
                                }
                            }
                            if (zB) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (zE) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            fbrVar = new fbr(str34, z35, exo0VarN2, lsvVar, z36, str3, z37, s77Var9, strI0, i9, d17, e4fVar, d13, mb90VarG5, q4fVar12, str35, str36, z30, d14, zB, z5, zE, z6, hfl0Var, strA, str30, z, str319, strF3, strI3, z2, z3, strF4, z4, strF15, z12, z31, d15, d16, jzcVar, i6, ctf0Var2.h());
                        }
                    }
                    ctf0Var = ctf0Var4;
                    d = n3wVar4.n1;
                    if (d <= 0.0d) {
                        d = d10 - d11;
                    }
                    String strI4 = jtv.I0(d, str28, false);
                    if (s77Var9 != s77.TOTO) {
                        q4fVar = q4fVar7;
                        if (d10 > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String str3112 = str4;
                        if (s77Var9 == s77Var11) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iK = hew0.K(n3wVar4.i1);
                        if (iK != 0) {
                            strF4 = ctf0Var.f(iK, new Object[0]);
                        } else {
                            strF4 = str32;
                        }
                        String strF16 = ctf0Var.f(R.string.casino_history_bet_type, new Object[0]);
                        s77Var = s77Var14;
                        if (s77Var9 != s77Var) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        list = n3wVar4.J1;
                        q4fVar2 = q4f.c;
                        str5 = n3wVar4.f;
                        if (q4fVar == q4fVar2) {
                            if (((su6) CollectionsKt.U(list)).p.length() > 0) {
                                strL = kng0.l(((su6) CollectionsKt.U(list)).m, " - ", ((su6) CollectionsKt.U(list)).p);
                            } else {
                                strL = ((su6) CollectionsKt.U(list)).m;
                            }
                            if (j == 95) {
                                i2 = 0;
                                strL2 = kng0.l(ctf0Var.f(R.string.betconstructor, new Object[0]), ". ", strL);
                                str30 = str30;
                            } else {
                                str30 = str30;
                                i2 = 0;
                                strL2 = kng0.l(str30, ". ", strL);
                            }
                            String str3113 = strL2;
                            if (nzc.f24366a[e4fVar4.ordinal()] == 1) {
                                string = ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[i2], i2));
                                e4fVar4 = e4fVar4;
                                ctf0Var3 = ctf0Var;
                                sys0Var = sys0Var3;
                            } else {
                                if (list.size() == 1) {
                                    i3 = ((su6) CollectionsKt.U(list)).w;
                                } else {
                                    i3 = -1;
                                }
                                su6Var = (su6) CollectionsKt.firstOrNull(list);
                                if (su6Var != null) {
                                    str6 = su6Var.Y;
                                } else {
                                    str6 = null;
                                }
                                if (str6 == null) {
                                    str6 = str32;
                                }
                                if (su6Var != null) {
                                    str7 = su6Var.x;
                                } else {
                                    str7 = null;
                                }
                                if (str7 == null) {
                                    str7 = str32;
                                }
                                if (su6Var != null) {
                                    str8 = su6Var.B;
                                } else {
                                    str8 = null;
                                }
                                if (str8 == null) {
                                    str8 = str32;
                                }
                                if (zD) {
                                    ctf0Var3 = ctf0Var;
                                    if (i3 != -1) {
                                    }
                                    sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                    if (str6.length() > 0) {
                                        sb.append(". ".concat(str6));
                                    }
                                    if (str7.length() > 0) {
                                        sb.append(". ".concat(str7));
                                    }
                                    if (str8.length() > 0) {
                                        sys0Var = sys0Var3;
                                        if (sys0Var != sys0.c) {
                                            sb.append(". ".concat(str8));
                                        }
                                    } else {
                                        sys0Var = sys0Var3;
                                    }
                                    string = sb.toString();
                                } else {
                                    ctf0Var3 = ctf0Var;
                                }
                                sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                if (str6.length() > 0) {
                                    sb.append(". ".concat(str6));
                                }
                                if (str7.length() > 0) {
                                    sb.append(". ".concat(str7));
                                }
                                if (str8.length() > 0) {
                                    sys0Var = sys0Var3;
                                    if (sys0Var != sys0.c) {
                                        sb.append(". ".concat(str8));
                                    }
                                } else {
                                    sys0Var = sys0Var3;
                                }
                                string = sb.toString();
                            }
                            String str3114 = string;
                            boolean z313 = !nkb.E(n3wVar4, s77Var9);
                            if (j != 0) {
                                bzu bzuVarD7 = rz4.d("static", "svg", "sports_v2");
                                rz4.s(j, ".svg", bzuVarD7);
                                string2 = ((StringBuilder) bzuVarD7.b).toString();
                            } else {
                                string2 = str32;
                            }
                            jzcVar = new kzc(str5, str3113, str3114, z313, string2);
                            ctf0Var2 = ctf0Var3;
                            e4fVar = e4fVar4;
                        } else {
                            q4fVar = q4fVar;
                            strF3 = strF3;
                            ctf0 ctf0Var10 = ctf0Var;
                            sys0Var = sys0Var3;
                            if (str27.length() > 0) {
                                e4fVar = e4fVar4;
                                if (e4fVar == e4f.j) {
                                }
                                jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                            } else {
                                e4fVar = e4fVar4;
                            }
                            ctf0Var2 = ctf0Var10;
                            strF5 = ctf0Var2.f(R.string.coefficient_with_colon, new Object[0]);
                            jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                        }
                        ozcVar = n3wVar4.L1;
                        q4f q4fVar13 = q4fVar;
                        boolean zContains7 = q3d.j(q4f.e, q4f.g).contains(q4fVar13);
                        sys0Var2 = sys0.c;
                        if (sys0Var != sys0Var2) {
                            if (sys0Var != sys0Var2) {
                                if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (ozcVar != ozc.MAX_PAYOUT) {
                                if (ozcVar == ozc.MIN_PAYOUT) {
                                    i6 = R.string.history_min_payout;
                                } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                    i6 = R.string.history_possible_win;
                                } else {
                                    i6 = 0;
                                }
                            }
                        } else if (sys0Var != sys0Var2) {
                            if (ozcVar != ozc.MAX_PAYOUT) {
                                if (ozcVar == ozc.MIN_PAYOUT) {
                                    i6 = R.string.history_min_payout;
                                } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                    i6 = R.string.history_possible_win;
                                } else {
                                    i6 = 0;
                                }
                            }
                        } else if (ozcVar != ozc.MAX_PAYOUT) {
                            if (ozcVar == ozc.MIN_PAYOUT) {
                                i6 = R.string.history_min_payout;
                            } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                i6 = R.string.history_possible_win;
                            } else {
                                i6 = 0;
                            }
                        }
                        if (zB) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (zE) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        fbrVar = new fbr(str34, z35, exo0VarN2, lsvVar, z36, str3, z37, s77Var9, strI0, i9, d17, e4fVar, d13, mb90VarG5, q4fVar13, str35, str36, z30, d14, zB, z5, zE, z6, hfl0Var, strA, str30, z, str3112, strF3, strI4, z2, z3, strF4, z4, strF16, z12, z31, d15, d16, jzcVar, i6, ctf0Var2.h());
                    } else {
                        q4fVar = q4fVar7;
                        if (d10 > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String str3115 = str4;
                        if (s77Var9 == s77Var11) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iK = hew0.K(n3wVar4.i1);
                        if (iK != 0) {
                            strF4 = ctf0Var.f(iK, new Object[0]);
                        } else {
                            strF4 = str32;
                        }
                        String strF17 = ctf0Var.f(R.string.casino_history_bet_type, new Object[0]);
                        s77Var = s77Var14;
                        if (s77Var9 != s77Var) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        list = n3wVar4.J1;
                        q4fVar2 = q4f.c;
                        str5 = n3wVar4.f;
                        if (q4fVar == q4fVar2) {
                            if (((su6) CollectionsKt.U(list)).p.length() > 0) {
                                strL = kng0.l(((su6) CollectionsKt.U(list)).m, " - ", ((su6) CollectionsKt.U(list)).p);
                            } else {
                                strL = ((su6) CollectionsKt.U(list)).m;
                            }
                            if (j == 95) {
                                i2 = 0;
                                strL2 = kng0.l(ctf0Var.f(R.string.betconstructor, new Object[0]), ". ", strL);
                                str30 = str30;
                            } else {
                                str30 = str30;
                                i2 = 0;
                                strL2 = kng0.l(str30, ". ", strL);
                            }
                            String str3116 = strL2;
                            if (nzc.f24366a[e4fVar4.ordinal()] == 1) {
                                string = ctf0Var.b.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[i2], i2));
                                e4fVar4 = e4fVar4;
                                ctf0Var3 = ctf0Var;
                                sys0Var = sys0Var3;
                            } else {
                                if (list.size() == 1) {
                                    i3 = ((su6) CollectionsKt.U(list)).w;
                                } else {
                                    i3 = -1;
                                }
                                su6Var = (su6) CollectionsKt.firstOrNull(list);
                                if (su6Var != null) {
                                    str6 = su6Var.Y;
                                } else {
                                    str6 = null;
                                }
                                if (str6 == null) {
                                    str6 = str32;
                                }
                                if (su6Var != null) {
                                    str7 = su6Var.x;
                                } else {
                                    str7 = null;
                                }
                                if (str7 == null) {
                                    str7 = str32;
                                }
                                if (su6Var != null) {
                                    str8 = su6Var.B;
                                } else {
                                    str8 = null;
                                }
                                if (str8 == null) {
                                    str8 = str32;
                                }
                                if (zD) {
                                    ctf0Var3 = ctf0Var;
                                    if (i3 != -1) {
                                    }
                                    sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                    if (str6.length() > 0) {
                                        sb.append(". ".concat(str6));
                                    }
                                    if (str7.length() > 0) {
                                        sb.append(". ".concat(str7));
                                    }
                                    if (str8.length() > 0) {
                                        sys0Var = sys0Var3;
                                        if (sys0Var != sys0.c) {
                                            sb.append(". ".concat(str8));
                                        }
                                    } else {
                                        sys0Var = sys0Var3;
                                    }
                                    string = sb.toString();
                                } else {
                                    ctf0Var3 = ctf0Var;
                                }
                                sb = new StringBuilder(kotlin.text.c.r(str27, " \n", strE, false));
                                if (str6.length() > 0) {
                                    sb.append(". ".concat(str6));
                                }
                                if (str7.length() > 0) {
                                    sb.append(". ".concat(str7));
                                }
                                if (str8.length() > 0) {
                                    sys0Var = sys0Var3;
                                    if (sys0Var != sys0.c) {
                                        sb.append(". ".concat(str8));
                                    }
                                } else {
                                    sys0Var = sys0Var3;
                                }
                                string = sb.toString();
                            }
                            String str3117 = string;
                            boolean z314 = !nkb.E(n3wVar4, s77Var9);
                            if (j != 0) {
                                bzu bzuVarD8 = rz4.d("static", "svg", "sports_v2");
                                rz4.s(j, ".svg", bzuVarD8);
                                string2 = ((StringBuilder) bzuVarD8.b).toString();
                            } else {
                                string2 = str32;
                            }
                            jzcVar = new kzc(str5, str3116, str3117, z314, string2);
                            ctf0Var2 = ctf0Var3;
                            e4fVar = e4fVar4;
                        } else {
                            q4fVar = q4fVar;
                            strF3 = strF3;
                            ctf0 ctf0Var11 = ctf0Var;
                            sys0Var = sys0Var3;
                            if (str27.length() > 0) {
                                e4fVar = e4fVar4;
                                if (e4fVar == e4f.j) {
                                }
                                jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                            } else {
                                e4fVar = e4fVar4;
                            }
                            ctf0Var2 = ctf0Var11;
                            strF5 = ctf0Var2.f(R.string.coefficient_with_colon, new Object[0]);
                            jzcVar = new jzc(str5, strF5, nkb.E(n3wVar4, s77Var9));
                        }
                        ozcVar = n3wVar4.L1;
                        q4f q4fVar14 = q4fVar;
                        boolean zContains8 = q3d.j(q4f.e, q4f.g).contains(q4fVar14);
                        sys0Var2 = sys0.c;
                        if (sys0Var != sys0Var2) {
                            if (sys0Var != sys0Var2) {
                                if (ozcVar != ozc.MAX_PAYOUT) {
                                    if (ozcVar == ozc.MIN_PAYOUT) {
                                        i6 = R.string.history_min_payout;
                                    } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                        i6 = R.string.history_possible_win;
                                    } else {
                                        i6 = 0;
                                    }
                                }
                            } else if (ozcVar != ozc.MAX_PAYOUT) {
                                if (ozcVar == ozc.MIN_PAYOUT) {
                                    i6 = R.string.history_min_payout;
                                } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                    i6 = R.string.history_possible_win;
                                } else {
                                    i6 = 0;
                                }
                            }
                        } else if (sys0Var != sys0Var2) {
                            if (ozcVar != ozc.MAX_PAYOUT) {
                                if (ozcVar == ozc.MIN_PAYOUT) {
                                    i6 = R.string.history_min_payout;
                                } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                    i6 = R.string.history_possible_win;
                                } else {
                                    i6 = 0;
                                }
                            }
                        } else if (ozcVar != ozc.MAX_PAYOUT) {
                            if (ozcVar == ozc.MIN_PAYOUT) {
                                i6 = R.string.history_min_payout;
                            } else if (ozcVar == ozc.POSSIBLE_PAYOUT) {
                                i6 = R.string.history_possible_win;
                            } else {
                                i6 = 0;
                            }
                        }
                        if (zB) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                        if (zE) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        fbrVar = new fbr(str34, z35, exo0VarN2, lsvVar, z36, str3, z37, s77Var9, strI0, i9, d17, e4fVar, d13, mb90VarG5, q4fVar14, str35, str36, z30, d14, zB, z5, zE, z6, hfl0Var, strA, str30, z, str3115, strF3, strI4, z2, z3, strF4, z4, strF17, z12, z31, d15, d16, jzcVar, i6, ctf0Var2.h());
                    }
                }
                return fbrVar;
            default:
                ql5 ql5Var = (ql5) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                if (nawVar.i0.d() == 0) {
                    nawVar.x(ql5Var);
                }
                return Unit.f46060a;
        }
    }
}
