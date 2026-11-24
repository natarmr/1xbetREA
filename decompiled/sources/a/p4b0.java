package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class p4b0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ diu0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p4b0(diu0 diu0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = diu0Var;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0370  */
    /* JADX WARN: Code duplicated, block: B:138:0x0374  */
    /* JADX WARN: Code duplicated, block: B:140:0x0378  */
    /* JADX WARN: Code duplicated, block: B:142:0x037f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0383  */
    /* JADX WARN: Code duplicated, block: B:145:0x0387  */
    /* JADX WARN: Code duplicated, block: B:147:0x038b  */
    /* JADX WARN: Code duplicated, block: B:148:0x0390  */
    /* JADX WARN: Code duplicated, block: B:151:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:153:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:198:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:200:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:202:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:203:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:206:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:208:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:212:0x050a  */
    /* JADX WARN: Code duplicated, block: B:213:0x050d  */
    /* JADX WARN: Code duplicated, block: B:216:0x0524  */
    /* JADX WARN: Code duplicated, block: B:218:0x0528  */
    /* JADX WARN: Code duplicated, block: B:220:0x0531  */
    /* JADX WARN: Code duplicated, block: B:221:0x0534  */
    /* JADX WARN: Code duplicated, block: B:224:0x054b  */
    /* JADX WARN: Code duplicated, block: B:225:0x054e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0560  */
    /* JADX WARN: Code duplicated, block: B:230:0x0590  */
    /* JADX WARN: Code duplicated, block: B:232:0x0596  */
    /* JADX WARN: Code duplicated, block: B:234:0x059e  */
    /* JADX WARN: Code duplicated, block: B:236:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:240:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:241:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:243:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:244:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:246:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:247:0x05c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:251:0x0615  */
    /* JADX WARN: Code duplicated, block: B:254:0x061f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0624  */
    /* JADX WARN: Code duplicated, block: B:258:0x0635  */
    /* JADX WARN: Code duplicated, block: B:261:0x0641  */
    /* JADX WARN: Code duplicated, block: B:262:0x0646  */
    /* JADX WARN: Code duplicated, block: B:265:0x0654  */
    /* JADX WARN: Code duplicated, block: B:268:0x065e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0663  */
    /* JADX WARN: Code duplicated, block: B:272:0x0674  */
    /* JADX WARN: Code duplicated, block: B:275:0x0680  */
    /* JADX WARN: Code duplicated, block: B:276:0x0685  */
    /* JADX WARN: Code duplicated, block: B:280:0x06c1 A[LOOP:0: B:278:0x06bb->B:280:0x06c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:284:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:286:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:287:0x0705  */
    /* JADX WARN: Code duplicated, block: B:290:0x072b  */
    /* JADX WARN: Code duplicated, block: B:293:0x073c  */
    /* JADX WARN: Code duplicated, block: B:296:0x0747  */
    /* JADX WARN: Code duplicated, block: B:298:0x074a  */
    /* JADX WARN: Code duplicated, block: B:300:0x074f  */
    /* JADX WARN: Code duplicated, block: B:301:0x0752  */
    /* JADX WARN: Code duplicated, block: B:303:0x076c  */
    /* JADX WARN: Code duplicated, block: B:305:0x0770  */
    /* JADX WARN: Code duplicated, block: B:308:0x0776  */
    /* JADX WARN: Code duplicated, block: B:311:0x084d A[LOOP:1: B:309:0x0847->B:311:0x084d, LOOP_END] */
    private final Object l(Object obj) {
        boolean z;
        bg30 bg30Var;
        ArrayList arrayList;
        knd mpdVar;
        d3h0 d3h0Var;
        d3h0 d3h0Var2;
        String str;
        knd apdVar;
        String strN;
        d3h0 d3h0Var3;
        ank0 ank0Var;
        ank0 ank0VarJ0;
        lz10 lz10Var;
        hzm0 hzm0Var;
        ank0 ank0Var2;
        ank0 ank0VarL0;
        String strN2;
        pz10 pz10Var;
        bpd bpdVar;
        pz10 pz10Var2;
        wnd wndVar;
        ArrayList arrayList2;
        String str2;
        boolean z2;
        oz10 oz10Var;
        zmk0 zmk0Var;
        zmk0 zmk0Var2;
        mz10 mz10Var;
        int i;
        zmk0 zmk0Var3;
        int i2;
        zmk0 zmk0Var4;
        String str3;
        String str4;
        boolean z3;
        int i3;
        zmk0 zmk0Var5;
        int i4;
        oz10 oz10Var2;
        String str5;
        Long l;
        long jLongValue;
        String str6;
        Long l2;
        long jLongValue2;
        String str7;
        Long l3;
        long jLongValue3;
        String str8;
        Long l4;
        long jLongValue4;
        ArrayList arrayList3;
        zmk0 zmk0Var6;
        zmk0 zmk0Var7;
        boolean z4;
        bex bexVar;
        oz10 oz10Var3;
        int i5;
        int i6;
        d3h0 d3h0Var4;
        d3h0 d3h0Var5;
        String str9;
        String strN3;
        bg30 bg30Var2;
        boolean z5;
        boolean z6;
        ank0 ank0Var3;
        ncl0 ncl0Var = (ncl0) this.l;
        ctf0 ctf0Var = ncl0Var.h;
        yqs yqsVar = (yqs) this.k;
        List list = (List) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        gna gnaVar = yqsVar.f43090a;
        anq0 anq0Var = yqsVar.b;
        if (gnaVar != null) {
            boolean z7 = false;
            if (((zqs) ((p7m0) ncl0Var.w()).getValue()).g || ((zqs) ((p7m0) ncl0Var.w()).getValue()).h) {
                z7 = true;
            }
            boolean zQ = bww.Q(yqsVar.e);
            boolean zBooleanValue = ((Boolean) ncl0Var.L.getValue()).booleanValue();
            dja djaVar = ((wqs) ncl0Var.N.getValue()).c.f46994a;
            List list2 = yqsVar.f;
            long j = ((zqs) ((p7m0) ncl0Var.w()).getValue()).c;
            bg30 bg30Var3 = yqsVar.c;
            ui9 ui9Var = yqsVar.d;
            vzj0 vzj0Var = ((zqs) ((p7m0) ncl0Var.w()).getValue()).j;
            d0k0 d0k0VarW = vzj0Var != null ? qxw.W(vzj0Var, anq0Var, ctf0Var) : null;
            boolean zBooleanValue2 = ((Boolean) ncl0Var.M.getValue()).booleanValue();
            ctf0Var.getClass();
            djaVar.getClass();
            list2.getClass();
            list.getClass();
            if (anq0Var == null) {
                anq0Var = new anq0(false, false, "", 0L, 0L, 0L, 0L, null, false, false);
            }
            ArrayList arrayList4 = new ArrayList();
            boolean z8 = gnaVar instanceof ena;
            if (z8) {
                ena enaVar = (ena) gnaVar;
                loa loaVar = enaVar.m;
                pz10 pz10Var3 = bg30Var3 != null ? bg30Var3.f2536a : null;
                String strK = loaVar.f20382a;
                String str10 = loaVar.b;
                if (strK.length() <= 0 || str10.length() <= 0) {
                    bg30Var2 = bg30Var3;
                    z5 = z7;
                    z6 = zQ;
                } else {
                    bg30Var2 = bg30Var3;
                    z5 = z7;
                    z6 = zQ;
                    strK = (cy7.c() && zBooleanValue2) ? b1j.k("\u2066", str10, "\u2069 - \u2066", strK, "\u2069") : b1j.k("\u2066", strK, "\u2069 - \u2066", str10, "\u2069");
                }
                if (pz10Var3 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    ij90 ij90Var = new ij90((Object) pz10Var3, zBooleanValue2, (byte) 14);
                    bnk0 bnk0Var = new bnk0();
                    ij90Var.invoke(bnk0Var);
                    ank0Var3 = w6x.l(arrayList5, bnk0Var.f2888a, arrayList5);
                } else {
                    ank0Var3 = new ank0(new ArrayList());
                }
                ArrayList arrayList6 = new ArrayList();
                b8q0 b8q0Var = new b8q0((Object) anq0Var, (Object) ctf0Var, (byte) 8);
                bnk0 bnk0Var2 = new bnk0();
                b8q0Var.invoke(bnk0Var2);
                ymq0 ymq0Var = new ymq0(ank0Var3, w6x.l(arrayList6, bnk0Var2.f2888a, arrayList6), strK);
                bg30 bg30Var4 = bg30Var2;
                anq0 anq0Var2 = anq0Var;
                b5x.s(enaVar, ctf0Var, arrayList4, ymq0Var, bg30Var4, z5, z6, djaVar, zBooleanValue, list2, j, ui9Var, anq0Var2, zBooleanValue2, list);
                ctf0Var = ctf0Var;
                arrayList = arrayList4;
                bg30Var = bg30Var4;
                anq0Var = anq0Var2;
                z = zBooleanValue2;
            } else {
                z = zBooleanValue2;
                bg30Var = bg30Var3;
                arrayList = arrayList4;
                if (gnaVar instanceof fna) {
                    arrayList.add(new kfa(d9x.L(((fna) gnaVar).f9825a, ctf0Var), new CardIdentity(dja.COMMON, 0)));
                } else {
                    t9f.b();
                }
            }
            ArrayList arrayList7 = new ArrayList();
            if (z8) {
                ena enaVar2 = (ena) gnaVar;
                mnd mndVar = enaVar2.b;
                if (mndVar instanceof nnd) {
                    nnd nndVar = (nnd) mndVar;
                    String str11 = nndVar.d;
                    String str12 = nndVar.c;
                    boolean z9 = enaVar2.p;
                    int size = arrayList7.size();
                    boolean z10 = nndVar.m;
                    if (bg30Var == null || (d3h0Var4 = bg30Var.b) == null) {
                        d3h0Var4 = bg30Var != null ? bg30Var.f2536a : null;
                    }
                    List list3 = nndVar.b;
                    List list4 = nndVar.f;
                    List list5 = nndVar.f23815a;
                    anq0 anq0Var3 = anq0Var;
                    List list6 = nndVar.e;
                    boolean z11 = nndVar.o;
                    ank0 ank0VarJ = pzb.J(ctf0Var, d3h0Var4, z10 && !z11);
                    String str13 = (String) CollectionsKt.firstOrNull(list6);
                    if (str13 == null) {
                        str13 = "";
                    }
                    Long l5 = (Long) CollectionsKt.firstOrNull(list5);
                    String strS = vsm0.s(l5 != null ? l5.longValue() : 0L, str13);
                    String str14 = (String) CollectionsKt.firstOrNull(list4);
                    if (str14 == null) {
                        str14 = "";
                    }
                    Long l6 = (Long) CollectionsKt.firstOrNull(list3);
                    String strS2 = vsm0.s(l6 != null ? l6.longValue() : 0L, str14);
                    String str15 = (String) CollectionsKt.W(1, list6);
                    if (str15 == null) {
                        str15 = "";
                    }
                    Long l7 = (Long) CollectionsKt.W(1, list5);
                    String strS3 = vsm0.s(l7 != null ? l7.longValue() : 0L, str15);
                    String str16 = (String) CollectionsKt.W(1, list4);
                    if (str16 == null) {
                        str16 = "";
                    }
                    Long l8 = (Long) CollectionsKt.W(1, list3);
                    String strS4 = vsm0.s(l8 != null ? l8.longValue() : 0L, str16);
                    str12.getClass();
                    zmk0 zmk0Var8 = new zmk0(str12, -1, -1.0f, R.color.static_white, -1, -1);
                    str11.getClass();
                    zmk0 zmk0Var9 = new zmk0(str11, -1, -1.0f, R.color.static_white, -1, -1);
                    boolean z12 = z10 && !z11;
                    boolean z13 = nndVar.g;
                    if (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) {
                        d3h0Var5 = d3h0Var4;
                        str9 = "";
                    } else {
                        d3h0Var5 = d3h0Var4;
                        str9 = strN3;
                    }
                    apdVar = new ond(ank0VarJ, strS, strS2, strS3, strS4, zmk0Var8, zmk0Var9, pzb.L(ctf0Var, d3h0Var5, anq0Var3, str9, z9, z12, z13, z), nndVar.m, nndVar.h == 66, StringsKt__StringsKt.split$default(str12, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1 && StringsKt__StringsKt.split$default(str11, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1, nndVar.l, new CardIdentity(dja.COMMON, size), z);
                } else if (mndVar instanceof rnd) {
                    rnd rndVar = (rnd) mndVar;
                    int size2 = arrayList7.size();
                    boolean z14 = enaVar2.p;
                    if (bg30Var == null || (d3h0Var3 = bg30Var.b) == null) {
                        d3h0Var3 = bg30Var != null ? bg30Var.f2536a : null;
                    }
                    boolean z15 = d3h0Var3 instanceof lz10;
                    lz10 lz10Var2 = z15 ? (lz10) d3h0Var3 : null;
                    if (lz10Var2 != null) {
                        ank0VarJ0 = pzb.i0(lz10Var2, z);
                    } else {
                        hzm0 hzm0Var2 = d3h0Var3 instanceof hzm0 ? (hzm0) d3h0Var3 : null;
                        if (hzm0Var2 != null) {
                            ank0VarJ0 = pzb.j0(hzm0Var2, z);
                        } else {
                            ank0Var = new ank0(new ArrayList());
                        }
                        if (z15) {
                            lz10Var = (lz10) d3h0Var3;
                        } else {
                            lz10Var = null;
                        }
                        if (lz10Var != null) {
                            ank0VarL0 = pzb.k0(lz10Var, z);
                        } else {
                            if (d3h0Var3 instanceof hzm0) {
                                hzm0Var = (hzm0) d3h0Var3;
                            } else {
                                hzm0Var = null;
                            }
                            if (hzm0Var != null) {
                                ank0VarL0 = pzb.l0(hzm0Var, z);
                            } else {
                                ank0Var2 = new ank0(new ArrayList());
                            }
                            boolean z16 = rndVar.f30784a;
                            rpp0 rpp0Var = rndVar.c;
                            if (bg30Var != null || (strN2 = bg30Var.f2536a.n()) == null) {
                                strN2 = "";
                            }
                            apdVar = new aqd(pzb.L(ctf0Var, d3h0Var3, anq0Var, strN2, z14, rndVar.b, z16, z), rpp0Var.b(), rpp0Var.d(), rndVar.d, rndVar.e, ank0Var, ank0Var2, new CardIdentity(dja.COMMON, size2));
                        }
                        ank0Var2 = ank0VarL0;
                        boolean z17 = rndVar.f30784a;
                        rpp0 rpp0Var2 = rndVar.c;
                        if (bg30Var != null) {
                            strN2 = "";
                        } else {
                            strN2 = "";
                        }
                        apdVar = new aqd(pzb.L(ctf0Var, d3h0Var3, anq0Var, strN2, z14, rndVar.b, z17, z), rpp0Var2.b(), rpp0Var2.d(), rndVar.d, rndVar.e, ank0Var, ank0Var2, new CardIdentity(dja.COMMON, size2));
                    }
                    ank0Var = ank0VarJ0;
                    if (z15) {
                        lz10Var = (lz10) d3h0Var3;
                    } else {
                        lz10Var = null;
                    }
                    if (lz10Var != null) {
                        ank0VarL0 = pzb.k0(lz10Var, z);
                    } else {
                        if (d3h0Var3 instanceof hzm0) {
                            hzm0Var = (hzm0) d3h0Var3;
                        } else {
                            hzm0Var = null;
                        }
                        if (hzm0Var != null) {
                            ank0VarL0 = pzb.l0(hzm0Var, z);
                        } else {
                            ank0Var2 = new ank0(new ArrayList());
                        }
                        boolean z18 = rndVar.f30784a;
                        rpp0 rpp0Var3 = rndVar.c;
                        if (bg30Var != null) {
                            strN2 = "";
                        } else {
                            strN2 = "";
                        }
                        apdVar = new aqd(pzb.L(ctf0Var, d3h0Var3, anq0Var, strN2, z14, rndVar.b, z18, z), rpp0Var3.b(), rpp0Var3.d(), rndVar.d, rndVar.e, ank0Var, ank0Var2, new CardIdentity(dja.COMMON, size2));
                    }
                    ank0Var2 = ank0VarL0;
                    boolean z19 = rndVar.f30784a;
                    rpp0 rpp0Var4 = rndVar.c;
                    if (bg30Var != null) {
                        strN2 = "";
                    } else {
                        strN2 = "";
                    }
                    apdVar = new aqd(pzb.L(ctf0Var, d3h0Var3, anq0Var, strN2, z14, rndVar.b, z19, z), rpp0Var4.b(), rpp0Var4.d(), rndVar.d, rndVar.e, ank0Var, ank0Var2, new CardIdentity(dja.COMMON, size2));
                } else {
                    if (mndVar instanceof zod) {
                        zod zodVar = (zod) mndVar;
                        boolean z20 = enaVar2.p;
                        int size3 = arrayList7.size();
                        boolean z21 = zodVar.e;
                        if (bg30Var == null || (d3h0Var = bg30Var.b) == null) {
                            d3h0Var = bg30Var != null ? bg30Var.f2536a : null;
                        }
                        boolean z22 = zodVar.f;
                        ank0 ank0VarJ2 = pzb.J(ctf0Var, d3h0Var, z21 && !z22);
                        String str17 = zodVar.f44714a;
                        str17.getClass();
                        zmk0 zmk0Var10 = new zmk0(str17, -1, -1.0f, R.color.static_white, -1, -1);
                        String str18 = zodVar.b;
                        str18.getClass();
                        zmk0 zmk0Var11 = new zmk0(str18, -1, -1.0f, R.color.static_white, -1, -1);
                        boolean z23 = z21 && !z22;
                        boolean z24 = zodVar.c;
                        if (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) {
                            d3h0Var2 = d3h0Var;
                            str = "";
                        } else {
                            d3h0 d3h0Var6 = d3h0Var;
                            str = strN;
                            d3h0Var2 = d3h0Var6;
                        }
                        apdVar = new apd(ank0VarJ2, zmk0Var10, zmk0Var11, pzb.L(ctf0Var, d3h0Var2, anq0Var, str, z20, z23, z24, z), zodVar.e, zodVar.d == 66, new CardIdentity(dja.COMMON, size3), z);
                    } else {
                        if (!(mndVar instanceof lpd)) {
                            t9f.b();
                            return null;
                        }
                        lpd lpdVar = (lpd) mndVar;
                        boolean z25 = enaVar2.p;
                        int size4 = arrayList7.size();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        String str19 = lpdVar.e;
                        str19.getClass();
                        mpdVar = new mpd(axq.d(arrayList9, new zmk0(str19, -1, -1.0f, R.color.static_white, -1, -1), arrayList8, arrayList9, arrayList8), pzb.L(ctf0Var, null, anq0Var, "", z25, lpdVar.g && !lpdVar.h, lpdVar.f, z), new CardIdentity(dja.COMMON, size4));
                    }
                    arrayList7.add(mpdVar);
                    if (bg30Var != null) {
                        pz10Var = bg30Var.f2536a;
                        bpdVar = enaVar2.g;
                        if (bpdVar != null) {
                            String str20 = bpdVar.g;
                            str2 = bpdVar.d;
                            int size5 = arrayList7.size();
                            z2 = pz10Var instanceof oz10;
                            if (z2) {
                                oz10Var = (oz10) pz10Var;
                            } else {
                                oz10Var = null;
                            }
                            if (z2) {
                                oz10Var3 = (oz10) pz10Var;
                                String str21 = oz10Var3.k;
                                if (oz10Var3.l) {
                                    i5 = R.color.static_green;
                                } else {
                                    i5 = R.color.static_white;
                                }
                                zmk0Var3 = new zmk0(str21, -1, -1.0f, i5, -1, -1);
                                String str22 = oz10Var3.m;
                                if (oz10Var3.n) {
                                    i6 = R.color.static_green;
                                } else {
                                    i6 = R.color.static_white;
                                }
                                zmk0Var4 = new zmk0(str22, -1, -1.0f, i6, -1, -1);
                            } else {
                                if (pz10Var instanceof mz10) {
                                    mz10Var = (mz10) pz10Var;
                                    String str23 = mz10Var.h;
                                    if (mz10Var.i) {
                                        i = R.color.static_green;
                                    } else {
                                        i = R.color.static_white;
                                    }
                                    zmk0Var3 = new zmk0(str23, -1, -1.0f, i, -1, -1);
                                    String str24 = mz10Var.j;
                                    if (mz10Var.k) {
                                        i2 = R.color.static_green;
                                    } else {
                                        i2 = R.color.static_white;
                                    }
                                    zmk0Var4 = new zmk0(str24, -1, -1.0f, i2, -1, -1);
                                } else {
                                    zmk0Var = new zmk0("", -1, -1.0f, -1, -1, -1);
                                    zmk0Var2 = new zmk0("", -1, -1.0f, -1, -1, -1);
                                }
                                str3 = zmk0Var.f44630a;
                                if (str3.length() > 0 || str3.equals("0")) {
                                    str4 = zmk0Var2.f44630a;
                                    if (str4.length() > 0 || str4.equals("0")) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                } else {
                                    z3 = true;
                                }
                                if (pz10Var instanceof kz10) {
                                    i3 = ((kz10) pz10Var).g;
                                } else if (pz10Var instanceof lz10) {
                                    i3 = ((lz10) pz10Var).i;
                                } else if (pz10Var instanceof mz10) {
                                    i3 = ((mz10) pz10Var).g;
                                } else {
                                    if (z2) {
                                        t9f.b();
                                        return null;
                                    }
                                    i3 = ((oz10) pz10Var).o;
                                }
                                List list7 = bpdVar.c;
                                List list8 = bpdVar.f;
                                List list9 = bpdVar.b;
                                List list10 = bpdVar.e;
                                str2.getClass();
                                zmk0 zmk0Var12 = new zmk0(str2, -1, -1.0f, R.color.static_white, -1, -1);
                                str20.getClass();
                                i4 = i3;
                                pz10Var2 = pz10Var;
                                oz10Var2 = oz10Var;
                                zmk0Var5 = new zmk0(str20, -1, -1.0f, R.color.static_white, -1, -1);
                                str5 = (String) CollectionsKt.firstOrNull(list10);
                                if (str5 == null) {
                                    str5 = "";
                                }
                                l = (Long) CollectionsKt.firstOrNull(list9);
                                if (l != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                String strS5 = vsm0.s(jLongValue, str5);
                                str6 = (String) CollectionsKt.W(1, list10);
                                if (str6 == null) {
                                    str6 = "";
                                }
                                l2 = (Long) CollectionsKt.W(1, list9);
                                if (l2 != null) {
                                    jLongValue2 = l2.longValue();
                                } else {
                                    jLongValue2 = 0;
                                }
                                String strS6 = vsm0.s(jLongValue2, str6);
                                str7 = (String) CollectionsKt.firstOrNull(list8);
                                if (str7 == null) {
                                    str7 = "";
                                }
                                l3 = (Long) CollectionsKt.firstOrNull(list7);
                                if (l3 != null) {
                                    jLongValue3 = l3.longValue();
                                } else {
                                    jLongValue3 = 0;
                                }
                                String strS7 = vsm0.s(jLongValue3, str7);
                                str8 = (String) CollectionsKt.W(1, list8);
                                if (str8 == null) {
                                    str8 = "";
                                }
                                l4 = (Long) CollectionsKt.W(1, list7);
                                if (l4 != null) {
                                    jLongValue4 = l4.longValue();
                                } else {
                                    jLongValue4 = 0;
                                }
                                String strS8 = vsm0.s(jLongValue4, str8);
                                zmk0 zmk0VarO = pzb.O(pz10Var2);
                                zmk0 zmk0VarR = pzb.R(pz10Var2);
                                String strN4 = sj3.N(bpdVar.f2976a);
                                strN4.getClass();
                                zmk0 zmk0Var13 = new zmk0(strN4, -1, -1.0f, R.color.static_white, -1, -1);
                                List<te90> listD = pz10Var2.d();
                                arrayList3 = new ArrayList();
                                for (te90 te90Var : listD) {
                                    arrayList3.add(new gqd(te90Var.f33809a, pzb.P(te90Var), pzb.S(te90Var)));
                                    zmk0Var5 = zmk0Var5;
                                }
                                zmk0 zmk0Var14 = zmk0Var5;
                                if (oz10Var2 != null) {
                                    zmk0Var6 = pzb.O(oz10Var2);
                                } else {
                                    zmk0Var6 = new zmk0("", -1, -1.0f, -1, -1, -1);
                                }
                                if (oz10Var2 != null) {
                                    zmk0Var7 = pzb.R(oz10Var2);
                                } else {
                                    zmk0Var7 = new zmk0("", -1, -1.0f, -1, -1, -1);
                                }
                                boolean z26 = bpdVar.h;
                                if (StringsKt__StringsKt.split$default(str2, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1 || StringsKt__StringsKt.split$default(str20, new String[]{Separators.SLASH}, false, 0, 6, null).size() <= 1) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                CardIdentity cardIdentity = new CardIdentity(dja.PERIODS, size5);
                                if (i4 != 1) {
                                    bexVar = bex.f2473a;
                                } else if (i4 != 2) {
                                    bexVar = bex.c;
                                } else {
                                    bexVar = bex.b;
                                }
                                arrayList7.add(new cpd(zmk0Var12, zmk0Var14, strS5, strS6, strS7, strS8, zmk0VarO, zmk0VarR, zmk0Var13, arrayList3, zmk0Var6, zmk0Var7, zmk0Var, zmk0Var2, z3, z26, z4, bexVar, cardIdentity));
                            }
                            zmk0Var = zmk0Var3;
                            zmk0Var2 = zmk0Var4;
                            str3 = zmk0Var.f44630a;
                            if (str3.length() > 0) {
                                str4 = zmk0Var2.f44630a;
                                if (str4.length() > 0) {
                                }
                                z3 = false;
                            } else {
                                str4 = zmk0Var2.f44630a;
                                if (str4.length() > 0) {
                                }
                                z3 = false;
                            }
                            if (pz10Var instanceof kz10) {
                                i3 = ((kz10) pz10Var).g;
                            } else if (pz10Var instanceof lz10) {
                                i3 = ((lz10) pz10Var).i;
                            } else if (pz10Var instanceof mz10) {
                                i3 = ((mz10) pz10Var).g;
                            } else {
                                if (z2) {
                                    t9f.b();
                                    return null;
                                }
                                i3 = ((oz10) pz10Var).o;
                            }
                            List list11 = bpdVar.c;
                            List list12 = bpdVar.f;
                            List list13 = bpdVar.b;
                            List list14 = bpdVar.e;
                            str2.getClass();
                            zmk0 zmk0Var15 = new zmk0(str2, -1, -1.0f, R.color.static_white, -1, -1);
                            str20.getClass();
                            i4 = i3;
                            pz10Var2 = pz10Var;
                            oz10Var2 = oz10Var;
                            zmk0Var5 = new zmk0(str20, -1, -1.0f, R.color.static_white, -1, -1);
                            str5 = (String) CollectionsKt.firstOrNull(list14);
                            if (str5 == null) {
                                str5 = "";
                            }
                            l = (Long) CollectionsKt.firstOrNull(list13);
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            String strS9 = vsm0.s(jLongValue, str5);
                            str6 = (String) CollectionsKt.W(1, list14);
                            if (str6 == null) {
                                str6 = "";
                            }
                            l2 = (Long) CollectionsKt.W(1, list13);
                            if (l2 != null) {
                                jLongValue2 = l2.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            String strS10 = vsm0.s(jLongValue2, str6);
                            str7 = (String) CollectionsKt.firstOrNull(list12);
                            if (str7 == null) {
                                str7 = "";
                            }
                            l3 = (Long) CollectionsKt.firstOrNull(list11);
                            if (l3 != null) {
                                jLongValue3 = l3.longValue();
                            } else {
                                jLongValue3 = 0;
                            }
                            String strS11 = vsm0.s(jLongValue3, str7);
                            str8 = (String) CollectionsKt.W(1, list12);
                            if (str8 == null) {
                                str8 = "";
                            }
                            l4 = (Long) CollectionsKt.W(1, list11);
                            if (l4 != null) {
                                jLongValue4 = l4.longValue();
                            } else {
                                jLongValue4 = 0;
                            }
                            String strS12 = vsm0.s(jLongValue4, str8);
                            zmk0 zmk0VarO2 = pzb.O(pz10Var2);
                            zmk0 zmk0VarR2 = pzb.R(pz10Var2);
                            String strN5 = sj3.N(bpdVar.f2976a);
                            strN5.getClass();
                            zmk0 zmk0Var16 = new zmk0(strN5, -1, -1.0f, R.color.static_white, -1, -1);
                            List<te90> listD2 = pz10Var2.d();
                            arrayList3 = new ArrayList();
                            while (r5.hasNext()) {
                                arrayList3.add(new gqd(te90Var.f33809a, pzb.P(te90Var), pzb.S(te90Var)));
                                zmk0Var5 = zmk0Var5;
                            }
                            zmk0 zmk0Var17 = zmk0Var5;
                            if (oz10Var2 != null) {
                                zmk0Var6 = pzb.O(oz10Var2);
                            } else {
                                zmk0Var6 = new zmk0("", -1, -1.0f, -1, -1, -1);
                            }
                            if (oz10Var2 != null) {
                                zmk0Var7 = pzb.R(oz10Var2);
                            } else {
                                zmk0Var7 = new zmk0("", -1, -1.0f, -1, -1, -1);
                            }
                            boolean z27 = bpdVar.h;
                            if (StringsKt__StringsKt.split$default(str2, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            CardIdentity cardIdentity2 = new CardIdentity(dja.PERIODS, size5);
                            if (i4 != 1) {
                                bexVar = bex.f2473a;
                            } else if (i4 != 2) {
                                bexVar = bex.c;
                            } else {
                                bexVar = bex.b;
                            }
                            arrayList7.add(new cpd(zmk0Var15, zmk0Var17, strS9, strS10, strS11, strS12, zmk0VarO2, zmk0VarR2, zmk0Var16, arrayList3, zmk0Var6, zmk0Var7, zmk0Var, zmk0Var2, z3, z27, z4, bexVar, cardIdentity2));
                        } else {
                            pz10Var2 = pz10Var;
                        }
                        wndVar = enaVar2.e;
                        if (wndVar != null) {
                            int size6 = arrayList7.size();
                            String str25 = wndVar.f39442a;
                            str25.getClass();
                            zmk0 zmk0Var18 = new zmk0(str25, -1, -1.0f, R.color.static_white, -1, -1);
                            String str26 = wndVar.f;
                            str26.getClass();
                            zmk0 zmk0Var19 = new zmk0(str26, -1, -1.0f, R.color.static_white, -1, -1);
                            String str27 = wndVar.b;
                            String str28 = wndVar.g;
                            zmk0 zmk0VarO3 = pzb.O(pz10Var2);
                            zmk0 zmk0VarR3 = pzb.R(pz10Var2);
                            lc00 lc00VarB = kotlin.collections.a.b();
                            String strValueOf = String.valueOf(wndVar.e);
                            strValueOf.getClass();
                            zmk0 zmk0Var20 = new zmk0(strValueOf, -1, -1.0f, R.color.static_white, -1, -1);
                            String strValueOf2 = String.valueOf(wndVar.j);
                            strValueOf2.getClass();
                            lc00VarB.add(new ee90(R.drawable.ic_red_card_new, zmk0Var20, new zmk0(strValueOf2, -1, -1.0f, R.color.static_white, -1, -1)));
                            String strValueOf3 = String.valueOf(wndVar.d);
                            strValueOf3.getClass();
                            zmk0 zmk0Var21 = new zmk0(strValueOf3, -1, -1.0f, R.color.static_white, -1, -1);
                            String strValueOf4 = String.valueOf(wndVar.i);
                            strValueOf4.getClass();
                            lc00VarB.add(new ee90(R.drawable.ic_yellow_card_new, zmk0Var21, new zmk0(strValueOf4, -1, -1.0f, R.color.static_white, -1, -1)));
                            String strValueOf5 = String.valueOf(wndVar.c);
                            strValueOf5.getClass();
                            zmk0 zmk0Var22 = new zmk0(strValueOf5, -1, -1.0f, R.color.static_white, -1, -1);
                            String strValueOf6 = String.valueOf(wndVar.h);
                            strValueOf6.getClass();
                            lc00VarB.add(new ee90(R.drawable.ic_corner, zmk0Var22, new zmk0(strValueOf6, -1, -1.0f, R.color.static_white, -1, -1)));
                            List<te90> listD3 = pz10Var2.d();
                            arrayList2 = new ArrayList(r3d.q(listD3, 10));
                            for (te90 te90Var2 : listD3) {
                                arrayList2.add(new cf90(te90Var2.f33809a, pzb.P(te90Var2), pzb.S(te90Var2)));
                            }
                            lc00VarB.addAll(arrayList2);
                            arrayList7.add(new xnd(zmk0Var18, zmk0Var19, str27, str28, zmk0VarO3, zmk0VarR3, wndVar.k, kotlin.collections.a.a(lc00VarB), new CardIdentity(dja.PERIODS, size6)));
                        }
                    }
                }
                mpdVar = apdVar;
                arrayList7.add(mpdVar);
                if (bg30Var != null) {
                    pz10Var = bg30Var.f2536a;
                    bpdVar = enaVar2.g;
                    if (bpdVar != null) {
                        String str29 = bpdVar.g;
                        str2 = bpdVar.d;
                        int size7 = arrayList7.size();
                        z2 = pz10Var instanceof oz10;
                        if (z2) {
                            oz10Var = (oz10) pz10Var;
                        } else {
                            oz10Var = null;
                        }
                        if (z2) {
                            oz10Var3 = (oz10) pz10Var;
                            String str210 = oz10Var3.k;
                            if (oz10Var3.l) {
                                i5 = R.color.static_green;
                            } else {
                                i5 = R.color.static_white;
                            }
                            zmk0Var3 = new zmk0(str210, -1, -1.0f, i5, -1, -1);
                            String str211 = oz10Var3.m;
                            if (oz10Var3.n) {
                                i6 = R.color.static_green;
                            } else {
                                i6 = R.color.static_white;
                            }
                            zmk0Var4 = new zmk0(str211, -1, -1.0f, i6, -1, -1);
                        } else {
                            if (pz10Var instanceof mz10) {
                                mz10Var = (mz10) pz10Var;
                                String str212 = mz10Var.h;
                                if (mz10Var.i) {
                                    i = R.color.static_green;
                                } else {
                                    i = R.color.static_white;
                                }
                                zmk0Var3 = new zmk0(str212, -1, -1.0f, i, -1, -1);
                                String str213 = mz10Var.j;
                                if (mz10Var.k) {
                                    i2 = R.color.static_green;
                                } else {
                                    i2 = R.color.static_white;
                                }
                                zmk0Var4 = new zmk0(str213, -1, -1.0f, i2, -1, -1);
                            } else {
                                zmk0Var = new zmk0("", -1, -1.0f, -1, -1, -1);
                                zmk0Var2 = new zmk0("", -1, -1.0f, -1, -1, -1);
                            }
                            str3 = zmk0Var.f44630a;
                            if (str3.length() > 0) {
                                str4 = zmk0Var2.f44630a;
                                if (str4.length() > 0) {
                                }
                                z3 = false;
                            } else {
                                str4 = zmk0Var2.f44630a;
                                if (str4.length() > 0) {
                                }
                                z3 = false;
                            }
                            if (pz10Var instanceof kz10) {
                                i3 = ((kz10) pz10Var).g;
                            } else if (pz10Var instanceof lz10) {
                                i3 = ((lz10) pz10Var).i;
                            } else if (pz10Var instanceof mz10) {
                                i3 = ((mz10) pz10Var).g;
                            } else {
                                if (z2) {
                                    t9f.b();
                                    return null;
                                }
                                i3 = ((oz10) pz10Var).o;
                            }
                            List list15 = bpdVar.c;
                            List list16 = bpdVar.f;
                            List list17 = bpdVar.b;
                            List list18 = bpdVar.e;
                            str2.getClass();
                            zmk0 zmk0Var110 = new zmk0(str2, -1, -1.0f, R.color.static_white, -1, -1);
                            str29.getClass();
                            i4 = i3;
                            pz10Var2 = pz10Var;
                            oz10Var2 = oz10Var;
                            zmk0Var5 = new zmk0(str29, -1, -1.0f, R.color.static_white, -1, -1);
                            str5 = (String) CollectionsKt.firstOrNull(list18);
                            if (str5 == null) {
                                str5 = "";
                            }
                            l = (Long) CollectionsKt.firstOrNull(list17);
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            String strS13 = vsm0.s(jLongValue, str5);
                            str6 = (String) CollectionsKt.W(1, list18);
                            if (str6 == null) {
                                str6 = "";
                            }
                            l2 = (Long) CollectionsKt.W(1, list17);
                            if (l2 != null) {
                                jLongValue2 = l2.longValue();
                            } else {
                                jLongValue2 = 0;
                            }
                            String strS14 = vsm0.s(jLongValue2, str6);
                            str7 = (String) CollectionsKt.firstOrNull(list16);
                            if (str7 == null) {
                                str7 = "";
                            }
                            l3 = (Long) CollectionsKt.firstOrNull(list15);
                            if (l3 != null) {
                                jLongValue3 = l3.longValue();
                            } else {
                                jLongValue3 = 0;
                            }
                            String strS15 = vsm0.s(jLongValue3, str7);
                            str8 = (String) CollectionsKt.W(1, list16);
                            if (str8 == null) {
                                str8 = "";
                            }
                            l4 = (Long) CollectionsKt.W(1, list15);
                            if (l4 != null) {
                                jLongValue4 = l4.longValue();
                            } else {
                                jLongValue4 = 0;
                            }
                            String strS16 = vsm0.s(jLongValue4, str8);
                            zmk0 zmk0VarO4 = pzb.O(pz10Var2);
                            zmk0 zmk0VarR4 = pzb.R(pz10Var2);
                            String strN6 = sj3.N(bpdVar.f2976a);
                            strN6.getClass();
                            zmk0 zmk0Var111 = new zmk0(strN6, -1, -1.0f, R.color.static_white, -1, -1);
                            List<te90> listD4 = pz10Var2.d();
                            arrayList3 = new ArrayList();
                            while (r5.hasNext()) {
                                arrayList3.add(new gqd(te90Var.f33809a, pzb.P(te90Var), pzb.S(te90Var)));
                                zmk0Var5 = zmk0Var5;
                            }
                            zmk0 zmk0Var112 = zmk0Var5;
                            if (oz10Var2 != null) {
                                zmk0Var6 = pzb.O(oz10Var2);
                            } else {
                                zmk0Var6 = new zmk0("", -1, -1.0f, -1, -1, -1);
                            }
                            if (oz10Var2 != null) {
                                zmk0Var7 = pzb.R(oz10Var2);
                            } else {
                                zmk0Var7 = new zmk0("", -1, -1.0f, -1, -1, -1);
                            }
                            boolean z28 = bpdVar.h;
                            if (StringsKt__StringsKt.split$default(str2, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            CardIdentity cardIdentity3 = new CardIdentity(dja.PERIODS, size7);
                            if (i4 != 1) {
                                bexVar = bex.f2473a;
                            } else if (i4 != 2) {
                                bexVar = bex.c;
                            } else {
                                bexVar = bex.b;
                            }
                            arrayList7.add(new cpd(zmk0Var110, zmk0Var112, strS13, strS14, strS15, strS16, zmk0VarO4, zmk0VarR4, zmk0Var111, arrayList3, zmk0Var6, zmk0Var7, zmk0Var, zmk0Var2, z3, z28, z4, bexVar, cardIdentity3));
                        }
                        zmk0Var = zmk0Var3;
                        zmk0Var2 = zmk0Var4;
                        str3 = zmk0Var.f44630a;
                        if (str3.length() > 0) {
                            str4 = zmk0Var2.f44630a;
                            if (str4.length() > 0) {
                            }
                            z3 = false;
                        } else {
                            str4 = zmk0Var2.f44630a;
                            if (str4.length() > 0) {
                            }
                            z3 = false;
                        }
                        if (pz10Var instanceof kz10) {
                            i3 = ((kz10) pz10Var).g;
                        } else if (pz10Var instanceof lz10) {
                            i3 = ((lz10) pz10Var).i;
                        } else if (pz10Var instanceof mz10) {
                            i3 = ((mz10) pz10Var).g;
                        } else {
                            if (z2) {
                                t9f.b();
                                return null;
                            }
                            i3 = ((oz10) pz10Var).o;
                        }
                        List list19 = bpdVar.c;
                        List list110 = bpdVar.f;
                        List list111 = bpdVar.b;
                        List list112 = bpdVar.e;
                        str2.getClass();
                        zmk0 zmk0Var113 = new zmk0(str2, -1, -1.0f, R.color.static_white, -1, -1);
                        str29.getClass();
                        i4 = i3;
                        pz10Var2 = pz10Var;
                        oz10Var2 = oz10Var;
                        zmk0Var5 = new zmk0(str29, -1, -1.0f, R.color.static_white, -1, -1);
                        str5 = (String) CollectionsKt.firstOrNull(list112);
                        if (str5 == null) {
                            str5 = "";
                        }
                        l = (Long) CollectionsKt.firstOrNull(list111);
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        String strS17 = vsm0.s(jLongValue, str5);
                        str6 = (String) CollectionsKt.W(1, list112);
                        if (str6 == null) {
                            str6 = "";
                        }
                        l2 = (Long) CollectionsKt.W(1, list111);
                        if (l2 != null) {
                            jLongValue2 = l2.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        String strS18 = vsm0.s(jLongValue2, str6);
                        str7 = (String) CollectionsKt.firstOrNull(list110);
                        if (str7 == null) {
                            str7 = "";
                        }
                        l3 = (Long) CollectionsKt.firstOrNull(list19);
                        if (l3 != null) {
                            jLongValue3 = l3.longValue();
                        } else {
                            jLongValue3 = 0;
                        }
                        String strS19 = vsm0.s(jLongValue3, str7);
                        str8 = (String) CollectionsKt.W(1, list110);
                        if (str8 == null) {
                            str8 = "";
                        }
                        l4 = (Long) CollectionsKt.W(1, list19);
                        if (l4 != null) {
                            jLongValue4 = l4.longValue();
                        } else {
                            jLongValue4 = 0;
                        }
                        String strS110 = vsm0.s(jLongValue4, str8);
                        zmk0 zmk0VarO5 = pzb.O(pz10Var2);
                        zmk0 zmk0VarR5 = pzb.R(pz10Var2);
                        String strN7 = sj3.N(bpdVar.f2976a);
                        strN7.getClass();
                        zmk0 zmk0Var114 = new zmk0(strN7, -1, -1.0f, R.color.static_white, -1, -1);
                        List<te90> listD5 = pz10Var2.d();
                        arrayList3 = new ArrayList();
                        while (r5.hasNext()) {
                            arrayList3.add(new gqd(te90Var.f33809a, pzb.P(te90Var), pzb.S(te90Var)));
                            zmk0Var5 = zmk0Var5;
                        }
                        zmk0 zmk0Var115 = zmk0Var5;
                        if (oz10Var2 != null) {
                            zmk0Var6 = pzb.O(oz10Var2);
                        } else {
                            zmk0Var6 = new zmk0("", -1, -1.0f, -1, -1, -1);
                        }
                        if (oz10Var2 != null) {
                            zmk0Var7 = pzb.R(oz10Var2);
                        } else {
                            zmk0Var7 = new zmk0("", -1, -1.0f, -1, -1, -1);
                        }
                        boolean z29 = bpdVar.h;
                        if (StringsKt__StringsKt.split$default(str2, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1) {
                            z4 = false;
                        } else {
                            z4 = false;
                        }
                        CardIdentity cardIdentity4 = new CardIdentity(dja.PERIODS, size7);
                        if (i4 != 1) {
                            bexVar = bex.f2473a;
                        } else if (i4 != 2) {
                            bexVar = bex.c;
                        } else {
                            bexVar = bex.b;
                        }
                        arrayList7.add(new cpd(zmk0Var113, zmk0Var115, strS17, strS18, strS19, strS110, zmk0VarO5, zmk0VarR5, zmk0Var114, arrayList3, zmk0Var6, zmk0Var7, zmk0Var, zmk0Var2, z3, z29, z4, bexVar, cardIdentity4));
                    } else {
                        pz10Var2 = pz10Var;
                    }
                    wndVar = enaVar2.e;
                    if (wndVar != null) {
                        int size8 = arrayList7.size();
                        String str214 = wndVar.f39442a;
                        str214.getClass();
                        zmk0 zmk0Var116 = new zmk0(str214, -1, -1.0f, R.color.static_white, -1, -1);
                        String str215 = wndVar.f;
                        str215.getClass();
                        zmk0 zmk0Var117 = new zmk0(str215, -1, -1.0f, R.color.static_white, -1, -1);
                        String str216 = wndVar.b;
                        String str217 = wndVar.g;
                        zmk0 zmk0VarO6 = pzb.O(pz10Var2);
                        zmk0 zmk0VarR6 = pzb.R(pz10Var2);
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        String strValueOf7 = String.valueOf(wndVar.e);
                        strValueOf7.getClass();
                        zmk0 zmk0Var23 = new zmk0(strValueOf7, -1, -1.0f, R.color.static_white, -1, -1);
                        String strValueOf8 = String.valueOf(wndVar.j);
                        strValueOf8.getClass();
                        lc00VarB2.add(new ee90(R.drawable.ic_red_card_new, zmk0Var23, new zmk0(strValueOf8, -1, -1.0f, R.color.static_white, -1, -1)));
                        String strValueOf9 = String.valueOf(wndVar.d);
                        strValueOf9.getClass();
                        zmk0 zmk0Var24 = new zmk0(strValueOf9, -1, -1.0f, R.color.static_white, -1, -1);
                        String strValueOf10 = String.valueOf(wndVar.i);
                        strValueOf10.getClass();
                        lc00VarB2.add(new ee90(R.drawable.ic_yellow_card_new, zmk0Var24, new zmk0(strValueOf10, -1, -1.0f, R.color.static_white, -1, -1)));
                        String strValueOf11 = String.valueOf(wndVar.c);
                        strValueOf11.getClass();
                        zmk0 zmk0Var25 = new zmk0(strValueOf11, -1, -1.0f, R.color.static_white, -1, -1);
                        String strValueOf12 = String.valueOf(wndVar.h);
                        strValueOf12.getClass();
                        lc00VarB2.add(new ee90(R.drawable.ic_corner, zmk0Var25, new zmk0(strValueOf12, -1, -1.0f, R.color.static_white, -1, -1)));
                        List<te90> listD6 = pz10Var2.d();
                        arrayList2 = new ArrayList(r3d.q(listD6, 10));
                        while (r5.hasNext()) {
                            arrayList2.add(new cf90(te90Var2.f33809a, pzb.P(te90Var2), pzb.S(te90Var2)));
                        }
                        lc00VarB2.addAll(arrayList2);
                        arrayList7.add(new xnd(zmk0Var116, zmk0Var117, str216, str217, zmk0VarO6, zmk0VarR6, wndVar.k, kotlin.collections.a.a(lc00VarB2), new CardIdentity(dja.PERIODS, size8)));
                    }
                }
            } else {
                if (!(gnaVar instanceof fna)) {
                    t9f.b();
                    return null;
                }
                arrayList7.add(new tnd(d9x.L(((fna) gnaVar).f9825a, ctf0Var), new CardIdentity(dja.COMMON, 0)));
            }
            return new prs(new r0s(arrayList, arrayList7), d0k0VarW);
        }
        return null;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        diu0 diu0Var = this.l;
        switch (b) {
            case 0:
                p4b0 p4b0Var = new p4b0((r4b0) diu0Var, (yje) obj3, (byte) 0);
                p4b0Var.j = (List) obj;
                p4b0Var.k = (Set) obj2;
                return p4b0Var.invokeSuspend(Unit.f46060a);
            case 1:
                p4b0 p4b0Var2 = new p4b0((o9g0) diu0Var, (yje) obj3, (byte) 1);
                p4b0Var2.j = (List) obj;
                p4b0Var2.k = (v5g0) obj2;
                return p4b0Var2.invokeSuspend(Unit.f46060a);
            case 2:
                p4b0 p4b0Var3 = new p4b0((p1i0) diu0Var, (yje) obj3, (byte) 2);
                p4b0Var3.j = (List) obj;
                p4b0Var3.k = (Set) obj2;
                return p4b0Var3.invokeSuspend(Unit.f46060a);
            case 3:
                p4b0 p4b0Var4 = new p4b0((xxj0) diu0Var, (yje) obj3, (byte) 3);
                p4b0Var4.j = (StepInputUiModel) obj;
                p4b0Var4.k = (ql5) obj2;
                return p4b0Var4.invokeSuspend(Unit.f46060a);
            case 4:
                p4b0 p4b0Var5 = new p4b0((yxj0) diu0Var, (yje) obj3, (byte) 4);
                p4b0Var5.j = (org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel) obj;
                p4b0Var5.k = (ql5) obj2;
                return p4b0Var5.invokeSuspend(Unit.f46060a);
            case 5:
                p4b0 p4b0Var6 = new p4b0((yxj0) diu0Var, (yje) obj3, (byte) 5);
                p4b0Var6.j = (org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel) obj;
                p4b0Var6.k = (n0d) obj2;
                return p4b0Var6.invokeSuspend(Unit.f46060a);
            case 6:
                p4b0 p4b0Var7 = new p4b0((wyj0) diu0Var, (yje) obj3, (byte) 6);
                p4b0Var7.j = (od7) obj;
                p4b0Var7.k = (ql5) obj2;
                return p4b0Var7.invokeSuspend(Unit.f46060a);
            case 7:
                p4b0 p4b0Var8 = new p4b0((iwk0) diu0Var, (yje) obj3, (byte) 7);
                p4b0Var8.j = (uwk0) obj;
                p4b0Var8.k = (ktk0) obj2;
                return p4b0Var8.invokeSuspend(Unit.f46060a);
            case 8:
                p4b0 p4b0Var9 = new p4b0((ncl0) diu0Var, (yje) obj3, (byte) 8);
                p4b0Var9.k = (yqs) obj;
                p4b0Var9.j = (List) obj2;
                return p4b0Var9.invokeSuspend(Unit.f46060a);
            case 9:
                p4b0 p4b0Var10 = new p4b0((vsl0) diu0Var, (yje) obj3, (byte) 9);
                p4b0Var10.j = (List) obj;
                p4b0Var10.k = (List) obj2;
                return p4b0Var10.invokeSuspend(Unit.f46060a);
            case 10:
                p4b0 p4b0Var11 = new p4b0((a3n0) diu0Var, (yje) obj3, (byte) 10);
                p4b0Var11.j = (l1q0) obj;
                p4b0Var11.k = (ljj) obj2;
                return p4b0Var11.invokeSuspend(Unit.f46060a);
            case 11:
                p4b0 p4b0Var12 = new p4b0((fho0) diu0Var, (yje) obj3, (byte) 11);
                p4b0Var12.j = (List) obj;
                p4b0Var12.k = (String) obj2;
                return p4b0Var12.invokeSuspend(Unit.f46060a);
            case 12:
                p4b0 p4b0Var13 = new p4b0((rio0) diu0Var, (yje) obj3, (byte) 12);
                p4b0Var13.j = (List) obj;
                p4b0Var13.k = (String) obj2;
                return p4b0Var13.invokeSuspend(Unit.f46060a);
            case 13:
                p4b0 p4b0Var14 = new p4b0((b0p0) diu0Var, (yje) obj3, (byte) 13);
                p4b0Var14.j = (List) obj;
                p4b0Var14.k = (List) obj2;
                return p4b0Var14.invokeSuspend(Unit.f46060a);
            default:
                p4b0 p4b0Var15 = new p4b0((urp0) diu0Var, (yje) obj3, (byte) 14);
                p4b0Var15.j = (List) obj;
                p4b0Var15.k = (crp0) obj2;
                return p4b0Var15.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:194:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:231:0x070e  */
    /* JADX WARN: Code duplicated, block: B:232:0x0711  */
    /* JADX WARN: Code duplicated, block: B:235:0x0726  */
    /* JADX WARN: Code duplicated, block: B:236:0x072b  */
    /* JADX WARN: Code duplicated, block: B:91:0x034b  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object m4b0Var;
        Set set;
        Iterator it;
        vf5 vf5Var;
        vf5 vf5Var2;
        ygs ygsVar;
        long j;
        ygs ygsVar2;
        long j2;
        boolean zEquals;
        Object value;
        String str;
        boolean zEquals2;
        Object value2;
        byte b = this.i;
        int i = 10;
        byte b2 = 6;
        boolean z = true;
        byte b3 = 0;
        diu0 diu0Var = this.l;
        switch (b) {
            case 0:
                List list = (List) this.j;
                Set set2 = (Set) this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                r4b0 r4b0Var = (r4b0) diu0Var;
                p7m0 p7m0Var = r4b0Var.u;
                if (list.isEmpty()) {
                    m4b0Var = new m4b0(g2v.d(r4b0Var.g, pb10.g, null, null, R.string.currently_no_events, R.string.refresh_data, new g4b0(r4b0Var, b3), 94));
                } else {
                    boolean zJ = r4b0Var.h.j();
                    set2.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        zlb zlbVar = (zlb) it2.next();
                        long j3 = zlbVar.f44571a;
                        String str2 = zlbVar.b;
                        str2.getClass();
                        arrayList.add(new fcb(str2, j3, set2.contains(Long.valueOf(j3)) ^ z));
                        if (set2.contains(Long.valueOf(j3))) {
                            set = set2;
                            it = it2;
                        } else {
                            List<rbb> list2 = zlbVar.c;
                            ArrayList arrayList2 = new ArrayList(r3d.q(list2, i));
                            for (rbb rbbVar : list2) {
                                long j4 = rbbVar.f30176a;
                                List list3 = rbbVar.p;
                                String str3 = rbbVar.c;
                                str3.getClass();
                                String str4 = rbbVar.g;
                                str4.getClass();
                                ncb ncbVar = new ncb(str4);
                                String str5 = rbbVar.h;
                                str5.getClass();
                                String strD0 = rcb.d0(ncbVar, new ocb(str5), rbbVar.k);
                                boolean z2 = rbbVar.l;
                                int iOrdinal = rbbVar.o.ordinal();
                                if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        vf5Var2 = null;
                                    } else {
                                        vf5Var = vf5.f;
                                    }
                                    long j5 = rbbVar.n;
                                    ygsVar = (ygs) CollectionsKt.firstOrNull(list3);
                                    if (ygsVar != null) {
                                        j = ygsVar.B;
                                    } else {
                                        j = 0;
                                    }
                                    boolean z3 = rbbVar.m;
                                    Set set3 = set2;
                                    Iterator it3 = it2;
                                    int i2 = (int) rbbVar.f;
                                    ygsVar2 = (ygs) CollectionsKt.firstOrNull(list3);
                                    if (ygsVar2 != null) {
                                        j2 = ygsVar2.f42600a;
                                    } else {
                                        j2 = 0;
                                    }
                                    arrayList2.add(new zgb(j4, j5, j, str3, strD0, z2, vf5Var2, z3, i2, j2, zJ, rbbVar.b));
                                    set2 = set3;
                                    it2 = it3;
                                } else {
                                    vf5Var = vf5.e;
                                }
                                vf5Var2 = vf5Var;
                                long j6 = rbbVar.n;
                                ygsVar = (ygs) CollectionsKt.firstOrNull(list3);
                                if (ygsVar != null) {
                                    j = ygsVar.B;
                                } else {
                                    j = 0;
                                }
                                boolean z4 = rbbVar.m;
                                Set set4 = set2;
                                Iterator it4 = it2;
                                int i3 = (int) rbbVar.f;
                                ygsVar2 = (ygs) CollectionsKt.firstOrNull(list3);
                                if (ygsVar2 != null) {
                                    j2 = ygsVar2.f42600a;
                                } else {
                                    j2 = 0;
                                }
                                arrayList2.add(new zgb(j4, j6, j, str3, strD0, z2, vf5Var2, z4, i3, j2, zJ, rbbVar.b));
                                set2 = set4;
                                it2 = it4;
                            }
                            set = set2;
                            it = it2;
                            arrayList.addAll(arrayList2);
                        }
                        set2 = set;
                        it2 = it;
                        i = 10;
                        z = true;
                    }
                    m4b0Var = new j4b0(arrayList);
                }
                p7m0Var.getClass();
                p7m0Var.o(null, m4b0Var);
                return Unit.f46060a;
            case 1:
                List list4 = (List) this.j;
                v5g0 v5g0Var = (v5g0) this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                o9g0 o9g0Var = (o9g0) diu0Var;
                art artVar = o9g0Var.F;
                Date date = v5g0Var.b;
                long j7 = v5g0Var.f36824a;
                artVar.getClass();
                list4.getClass();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list4) {
                    d2w d2wVar = (d2w) obj2;
                    if (j7 == -321 || d2wVar.d() == j7) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    d2w d2wVar2 = (d2w) obj3;
                    if (d2wVar2 == null) {
                        zEquals = false;
                    } else if (d2wVar2 instanceof u1w) {
                        zEquals = art.f(((u1w) d2wVar2).l).equals(date);
                    } else if (d2wVar2 instanceof x1w) {
                        zEquals = art.f(((x1w) d2wVar2).l).equals(date);
                    } else if (d2wVar2 instanceof y1w) {
                        zEquals = art.f(((y1w) d2wVar2).l).equals(date);
                    } else if (d2wVar2 instanceof c2w) {
                        zEquals = art.f(((c2w) d2wVar2).l).equals(date);
                    } else {
                        zEquals = false;
                    }
                    if (zEquals) {
                        arrayList4.add(obj3);
                    }
                }
                q5g0 q5g0Var = list4.isEmpty() ? q5g0.c : arrayList4.isEmpty() ? q5g0.d : q5g0.f28150a;
                p7m0 p7m0Var2 = o9g0Var.i.f25029a;
                while (true) {
                    Object value3 = p7m0Var2.getValue();
                    value3.getClass();
                    e9g0 e9g0Var = (e9g0) value3;
                    yl9 yl9Var = e9g0Var.m;
                    Date date2 = v5g0Var.b;
                    Set set5 = yl9Var.f42829a;
                    set5.getClass();
                    ArrayList arrayList5 = arrayList4;
                    if (p7m0Var2.m(value3, e9g0.a(e9g0Var, null, arrayList5, q5g0Var, v5g0Var.f36824a, null, null, new yl9(set5, date2), 11839))) {
                        return Unit.f46060a;
                    }
                    arrayList4 = arrayList5;
                }
                break;
            case 2:
                List list5 = (List) this.j;
                Set set6 = (Set) this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p1i0 p1i0Var = (p1i0) diu0Var;
                int i4 = p1i0.A;
                p7m0 p7m0Var3 = p1i0Var.i.f25029a;
                do {
                    value = p7m0Var3.getValue();
                    value.getClass();
                    q7x.F(p1i0Var.f, set6, "SELECTED_IDS_KEY");
                } while (!p7m0Var3.m(value, tec.a((tec) value, false, false, null, list5, set6, 78)));
                return Unit.f46060a;
            case 3:
                StepInputUiModel stepInputUiModel = (StepInputUiModel) this.j;
                ql5 ql5Var = (ql5) this.k;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var4 = ((xxj0) diu0Var).E0;
                double d = (stepInputUiModel.q ? 2.0d : 1.0d) * stepInputUiModel.f46773a;
                double d2 = ql5Var.b;
                Object obj4 = (d > d2 || d2 == 0.0d) ? vg5.f37365a : zg5.f44327a;
                p7m0Var4.getClass();
                p7m0Var4.o(null, obj4);
                return Unit.f46060a;
            case 4:
                org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel stepInputUiModel2 = (org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel) this.j;
                ql5 ql5Var2 = (ql5) this.k;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var5 = ((yxj0) diu0Var).c0;
                double d3 = stepInputUiModel2.f46647a;
                double d4 = ql5Var2.b;
                Object obj5 = (d3 > d4 || d4 == 0.0d) ? ug5.f35607a : yg5.f42570a;
                p7m0Var5.getClass();
                p7m0Var5.o(null, obj5);
                return Unit.f46060a;
            case 5:
                org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel stepInputUiModel3 = (org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel) this.j;
                n0d n0dVar = (n0d) this.k;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                yxj0 yxj0Var = (yxj0) diu0Var;
                p7m0 p7m0Var6 = yxj0Var.Z;
                yxj0Var.M.e("SAVED_STATE_STEP_INPUT_KEY", org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel.a(stepInputUiModel3, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, false, false, true, false, 6143));
                double d5 = stepInputUiModel3.d;
                double d6 = stepInputUiModel3.e;
                double d7 = stepInputUiModel3.f46647a;
                cnb0 cnb0Var = cnb0.f4645a;
                if ((d5 > d7 || d7 > d6) && (!stepInputUiModel3.g || d7 <= d6)) {
                    p7m0Var6.getClass();
                    p7m0Var6.o(null, cnb0Var);
                } else {
                    double d8 = d7 * n0dVar.f22694a;
                    ql5 ql5VarD = yxj0Var.D();
                    if (ql5VarD == null || (str = ql5VarD.f) == null) {
                        str = "";
                    }
                    if (d8 == 0.0d) {
                        p7m0Var6.getClass();
                        p7m0Var6.o(null, cnb0Var);
                    } else {
                        ctf0 ctf0Var = yxj0Var.D;
                        ctf0Var.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        bnk0 bnk0Var = new bnk0();
                        pzw.E(bnk0Var, w6x.r(new Object[0], 0, ctf0Var.b, R.string.history_possible_win, Separators.SP), 0, 0, 0, R.attr.uikitTextPrimary, 30);
                        int i5 = cy7.f5159a;
                        pn40 pn40Var = pn40.f27267a;
                        pzw.E(bnk0Var, cy7.e(pn40.p(str, d8)), 0, 0, 1, R.attr.uikitCommerce, 14);
                        dnb0 dnb0Var = new dnb0(w6x.l(arrayList6, bnk0Var.f2888a, arrayList6));
                        p7m0Var6.getClass();
                        p7m0Var6.o(null, dnb0Var);
                    }
                }
                return Unit.f46060a;
            case 6:
                od7 od7Var = (od7) this.j;
                ql5 ql5Var3 = (ql5) this.k;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var7 = ((wyj0) diu0Var).H;
                double dDoubleValue = od7Var.f25063a.doubleValue();
                double d9 = ql5Var3.b;
                Object obj6 = (dDoubleValue > d9 || d9 == 0.0d) ? wg5.f39096a : ah5.f856a;
                p7m0Var7.getClass();
                p7m0Var7.o(null, obj6);
                return Unit.f46060a;
            case 7:
                iwk0 iwk0Var = (iwk0) diu0Var;
                uwk0 uwk0Var = (uwk0) this.j;
                ktk0 ktk0Var = (ktk0) this.k;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (uwk0Var instanceof twk0) {
                    twk0 twk0Var = (twk0) uwk0Var;
                    iwk0Var.s0.getClass();
                    ktk0Var.getClass();
                    long j8 = ktk0Var.b;
                    Date date3 = ktk0Var.f18871a;
                    ArrayList arrayListE = gst.e(twk0Var.f34654a, ktk0Var);
                    ArrayList arrayListE2 = gst.e(twk0Var.b, ktk0Var);
                    List list6 = twk0Var.c;
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj7 : list6) {
                        if (!(((d2w) obj7) instanceof z1w)) {
                            arrayList7.add(obj7);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj8 : arrayList7) {
                        d2w d2wVar3 = (d2w) obj8;
                        if (j8 == -321 || d2wVar3.d() == j8) {
                            arrayList8.add(obj8);
                        }
                    }
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj9 : arrayList8) {
                        d2w d2wVar4 = (d2w) obj9;
                        if (d2wVar4 == null) {
                            zEquals2 = false;
                        } else if (d2wVar4 instanceof u1w) {
                            zEquals2 = gst.f(((u1w) d2wVar4).l).equals(date3);
                        } else if (d2wVar4 instanceof x1w) {
                            zEquals2 = gst.f(((x1w) d2wVar4).l).equals(date3);
                        } else if (d2wVar4 instanceof y1w) {
                            zEquals2 = gst.f(((y1w) d2wVar4).l).equals(date3);
                        } else if (d2wVar4 instanceof c2w) {
                            zEquals2 = gst.f(((c2w) d2wVar4).l).equals(date3);
                        } else {
                            zEquals2 = false;
                        }
                        if (zEquals2) {
                            arrayList9.add(obj9);
                        }
                    }
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj10 : arrayList9) {
                        if (!(((d2w) obj10) instanceof z1w)) {
                            arrayList10.add(obj10);
                        }
                    }
                    iwk0Var.W(new xrk0(ysk0.f43172a, arrayListE, arrayListE2, arrayList10, twk0Var.d));
                } else if (Intrinsics.d(uwk0Var, swk0.f32926a)) {
                    iun iunVar = iun.f15405a;
                    xrk0 xrk0Var = new xrk0(wsk0.f39697a, iunVar, iunVar, iunVar, false);
                    int i6 = iwk0.X0;
                    iwk0Var.W(xrk0Var);
                } else {
                    if (!Intrinsics.d(uwk0Var, swk0.b)) {
                        t9f.b();
                        return null;
                    }
                    iun iunVar2 = iun.f15405a;
                    xrk0 xrk0Var2 = new xrk0(vsk0.f37956a, iunVar2, iunVar2, iunVar2, false);
                    int i7 = iwk0.X0;
                    iwk0Var.W(xrk0Var2);
                }
                return Unit.f46060a;
            case 8:
                return l(obj);
            case 9:
                List list7 = (List) this.j;
                List list8 = (List) this.k;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                int i8 = vsl0.F;
                p7m0 p7m0Var8 = ((vsl0) diu0Var).i.f25029a;
                do {
                    value2 = p7m0Var8.getValue();
                    value2.getClass();
                } while (!p7m0Var8.m(value2, lsl0.a((lsl0) value2, list7, list8, false, false, false, false, false, null, null, 8188)));
                return Unit.f46060a;
            case 10:
                l1q0 l1q0Var = (l1q0) this.j;
                ljj ljjVar = (ljj) this.k;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                a3n0 a3n0Var = (a3n0) diu0Var;
                z0q0 z0q0VarN = a3n0Var.w.f6428a.f15748a.n();
                a3n0Var.L = l1q0Var.l;
                p7m0 p7m0Var9 = a3n0Var.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var9.getValue();
                    value4.getClass();
                    w0n0 w0n0Var = (w0n0) value4;
                    String str6 = l1q0Var.w;
                    String str7 = l1q0Var.i;
                    l1q0 l1q0Var2 = l1q0Var;
                    if (p7m0Var9.m(value4, w0n0.a(w0n0Var, l1q0Var2, z0q0VarN, str6, str7, str7.length() > 0, 0, ljjVar, 65))) {
                        return Unit.f46060a;
                    }
                    l1q0Var = l1q0Var2;
                }
                break;
            case 11:
                List list9 = (List) this.j;
                String str8 = (String) this.k;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                iz30 iz30Var = iz30.y;
                ux30 ux30Var = new ux30(10, 0L, ((fho0) diu0Var).w.b.a(R.string.online_call, Arrays.copyOf(new Object[0], 0)), str8);
                zcl zclVar = qmk.f28987a;
                return CollectionsKt.q0(kotlin.collections.a.c(new i140(false, iz30Var, r040.OTHER, new gy30(ux30Var, new qx30(new m0x(R.drawable.ic_glyph_call_circle, null, 6), 0L, liz.f20129a, R.drawable.ic_glyph_call_circle, 48.0f, 18), new ay30(new m0x(R.drawable.ic_glyph_call_end, null, 6)), 0L, null, null, 248))), list9);
            case 12:
                List list10 = (List) this.j;
                String str9 = (String) this.k;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                iz30 iz30Var2 = iz30.y;
                ux30 ux30Var2 = new ux30(10, 0L, ((rio0) diu0Var).x.b.a(R.string.online_call, Arrays.copyOf(new Object[0], 0)), str9);
                zcl zclVar2 = qmk.f28987a;
                return CollectionsKt.q0(kotlin.collections.a.c(new i140(false, iz30Var2, r040.OTHER, new gy30(ux30Var2, new qx30(new m0x(R.drawable.ic_glyph_call_circle, null, 6), 0L, liz.f20129a, R.drawable.ic_glyph_call_circle, 48.0f, 18), new ay30(new m0x(R.drawable.ic_glyph_call_end, null, 6)), 0L, null, null, 248))), list10);
            case 13:
                List list11 = (List) this.j;
                List list12 = (List) this.k;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                int i9 = b0p0.I;
                List listA0 = CollectionsKt.A0(list11, new tgo0(b2));
                List listA1 = CollectionsKt.A0(list12, new tgo0((byte) 7));
                d0t d0tVar = (d0t) CollectionsKt.firstOrNull(listA0);
                if (d0tVar == null) {
                    d0tVar = (d0t) CollectionsKt.firstOrNull(listA1);
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj11 : listA1) {
                    d0t d0tVar2 = (d0t) obj11;
                    if (d0tVar == null || d0tVar2.f5282a != d0tVar.f5282a) {
                        arrayList11.add(obj11);
                    }
                }
                return new jzo0(d0tVar, arrayList11);
            default:
                List<rfp0> list13 = (List) this.j;
                crp0 crp0Var = (crp0) this.k;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                urp0 urp0Var = (urp0) diu0Var;
                List listD0 = CollectionsKt.D0(list13, 10);
                ArrayList arrayList12 = new ArrayList(r3d.q(listD0, 10));
                Iterator it5 = listD0.iterator();
                while (it5.hasNext()) {
                    arrayList12.add(new Integer(((rfp0) it5.next()).b));
                }
                urp0Var.r = arrayList12;
                urp0Var.E(crp0Var);
                ArrayList arrayList13 = new ArrayList(r3d.q(list13, 10));
                for (rfp0 rfp0Var : list13) {
                    Set set7 = crp0Var.f4856a;
                    rfp0Var.getClass();
                    set7.getClass();
                    boolean zContains = set7.contains(Integer.valueOf(rfp0Var.b));
                    int i10 = rfp0Var.b;
                    arrayList13.add(new tjp0(i10, rfp0Var.c, vsm0.s(i10, rfp0Var.d), zContains, zContains || set7.size() < 10));
                }
                return arrayList13;
        }
    }
}
