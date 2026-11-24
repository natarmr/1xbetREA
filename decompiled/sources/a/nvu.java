package a;

import android.content.ClipDescription;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.format.DateFormat;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes5.dex */
public final class nvu implements oex, tj9, ezg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24204a;
    public final Object b;
    public Object c;
    public Object d;

    public nvu(byte b) {
        this.f24204a = b;
        switch (b) {
            case 20:
                this.b = new AtomicReference(y9a.h);
                this.c = new Object();
                break;
            default:
                long[] jArr = u1h0.f34903a;
                this.b = new hz40();
                break;
        }
    }

    public pk80 A() {
        pk80 pk80Var = (pk80) this.c;
        if (pk80Var != null) {
            return pk80Var;
        }
        Intrinsics.h("layoutInfo");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable B(rl40 rl40Var, zje zjeVar) {
        ped0 ped0Var;
        Serializable g0g0Var;
        if (zjeVar instanceof ped0) {
            ped0Var = (ped0) zjeVar;
            int i = ped0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ped0Var.k = i - Integer.MIN_VALUE;
            } else {
                ped0Var = new ped0(this, zjeVar);
            }
        } else {
            ped0Var = new ped0(this, zjeVar);
        }
        Object objT = ped0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ped0Var.k;
        yje yjeVar = null;
        try {
            if (i2 == 0) {
                z1x.P(objT);
                e0g0 e0g0Var = j0g0.b;
                er60 er60Var = new er60(rl40Var, this, yjeVar, (byte) 24);
                ped0Var.k = 1;
                objT = msm0.t(10000L, er60Var, ped0Var);
                if (objT == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objT);
            }
            g0g0Var = (String) objT;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return g0g0Var;
        }
        thA.printStackTrace();
        return "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(1:(1:(4:13|70|71|(9:85|25|81|26|27|79|28|(1:31)|68)(2:74|(2:76|77)(1:78)))(2:14|15))(4:16|55|56|(9:85|25|81|26|27|79|28|(1:31)|68)(2:74|(2:76|77)(1:78))))(4:17|87|18|19))(2:23|(9:85|25|81|26|27|79|28|(1:31)|68)(2:74|(2:76|77)(1:78)))|83|32|33|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:85|25|81|26|27|79|28|(1:31)|68) */
    /* JADX WARN: Code duplicated, block: B:31:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0104  */
    /* JADX WARN: Code duplicated, block: B:46:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    /* JADX WARN: Code duplicated, block: B:52:0x011c  */
    /* JADX WARN: Code duplicated, block: B:57:0x013d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:60:0x014e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0154  */
    /* JADX WARN: Code duplicated, block: B:63:0x0156  */
    /* JADX WARN: Code duplicated, block: B:66:0x015b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0175  */
    /* JADX WARN: Code duplicated, block: B:72:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x0190  */
    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:76:0x019f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:85:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e8, code lost:
    
        r17 = r6;
        r6 = r2;
        r2 = r14;
        r13 = r12;
        r11 = r10;
        r10 = r8;
        r8 = r4;
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f6, code lost:
    
        r16 = r7;
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0133, code lost:
    
        if (a.qcc.P(r11, r6) == r3) goto L68;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0104 -> B:24:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0175 -> B:70:0x017b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0184 -> B:71:0x0180). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(org.xplatform.statistic.stage.api.domain.TypeStageId r20, boolean r21, a.zje r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nvu.C(org.xplatform.statistic.stage.api.domain.TypeStageId, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public Object D(zje zjeVar) {
        obn0 obn0Var;
        if (zjeVar instanceof obn0) {
            obn0Var = (obn0) zjeVar;
            int i = obn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                obn0Var.k = i - Integer.MIN_VALUE;
            } else {
                obn0Var = new obn0(this, zjeVar);
            }
        } else {
            obn0Var = new obn0(this, zjeVar);
        }
        Object objE = obn0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = obn0Var.k;
        ?? arrayList = 0;
        if (i2 == 0) {
            z1x.P(objE);
            y8n0 y8n0Var = (y8n0) ((enj0) this.d).invoke();
            String strA = ((btt0) this.c).a();
            obn0Var.k = 1;
            objE = y8n0Var.e(strA, obn0Var);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        ust0 ust0Var = (ust0) ((dx5) objE).a();
        List list = ust0Var.f36227a;
        if (list == null) {
            list = iun.f15405a;
        }
        List<tst0> list2 = ust0Var.b;
        if (list2 != null) {
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (tst0 tst0Var : list2) {
                tst0Var.getClass();
                Long l = tst0Var.f34478a;
                long jLongValue = l != null ? l.longValue() : 0L;
                Boolean bool = tst0Var.b;
                boolean z = false;
                if (bool != null && (!bool.booleanValue())) {
                    z = true;
                }
                arrayList.add(new ots(z, jLongValue));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new is7(list, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Serializable, java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public Serializable E(zje zjeVar) {
        pbn0 pbn0Var;
        if (zjeVar instanceof pbn0) {
            pbn0Var = (pbn0) zjeVar;
            int i = pbn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbn0Var.k = i - Integer.MIN_VALUE;
            } else {
                pbn0Var = new pbn0(this, zjeVar);
            }
        } else {
            pbn0Var = new pbn0(this, zjeVar);
        }
        Object objF = pbn0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = pbn0Var.k;
        ?? arrayList = 0;
        if (i2 == 0) {
            z1x.P(objF);
            y8n0 y8n0Var = (y8n0) ((enj0) this.d).invoke();
            String strA = ((btt0) this.c).a();
            pbn0Var.k = 1;
            objF = y8n0Var.f(strA, pbn0Var);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        List<frt0> list = ((grt0) ((dx5) objF).a()).f11798a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (frt0 frt0Var : list) {
                frt0Var.getClass();
                Long l = frt0Var.f10035a;
                long jLongValue = l != null ? l.longValue() : 0L;
                Boolean bool = frt0Var.b;
                boolean z = false;
                if (bool != null && (!bool.booleanValue())) {
                    z = true;
                }
                arrayList.add(new ots(z, jLongValue));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        g8n0 g8n0Var = (g8n0) this.b;
        g8n0Var.getClass();
        arrayList.getClass();
        g8n0Var.f10874a.n(CollectionsKt.P0(arrayList));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object F(zje zjeVar) throws c44 {
        qbn0 qbn0Var;
        if (zjeVar instanceof qbn0) {
            qbn0Var = (qbn0) zjeVar;
            int i = qbn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qbn0Var.k = i - Integer.MIN_VALUE;
            } else {
                qbn0Var = new qbn0(this, zjeVar);
            }
        } else {
            qbn0Var = new qbn0(this, zjeVar);
        }
        Object objF = qbn0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = qbn0Var.k;
        if (i2 == 0) {
            z1x.P(objF);
            String strA = ((btt0) this.c).a();
            y8n0 y8n0Var = (y8n0) ((enj0) this.d).invoke();
            qbn0Var.k = 1;
            objF = y8n0Var.f(strA, qbn0Var);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        String str = ((grt0) ((dx5) objF).a()).b;
        if (str != null) {
            return str;
        }
        throw new c44((byte) 3);
    }

    public utb G(boolean z, boolean z2) {
        yje yjeVar = null;
        Integer num = ((pru) this.c).a().g.o == j8l0.MEDIUM_ITEMS_LINE_SEPARATOR_WITH_EVENTS ? 2 : null;
        a6u a6uVar = (a6u) this.b;
        long j = z2 ? 8L : 30L;
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = z;
        byte b = 9;
        ewt ewtVar = new ewt(uvw.P(bkb.h0(j, TimeUnit.SECONDS, new fj3(z2, a6uVar, yjeVar, b)), new lqu(hie0Var, (byte) 8), j, new vnn((Object) a6uVar, z2, yjeVar, (byte) 3), null, null, 56), hie0Var, (byte) 15);
        byte b2 = 22;
        return aoq.c(new p6d(((m0o0) a6uVar.d).b(), aoq.b(new i89(ewtVar, b2), new i89(((w5z) a6uVar.b).t(z2), b2)), new wx4((Object) a6uVar, yjeVar, (byte) 17), (byte) 1), new fe0(yjeVar, num, this, b));
    }

    public s4v0 H(int i, int i2, String str, boolean z) {
        str.getClass();
        zpu zpuVar = (zpu) this.c;
        String strA = ((ntu) this.b).a();
        s9m0 s9m0Var = uaq0.f35345a;
        uaq0 uaq0VarA = ((wyu) this.d).a();
        s9m0Var.getClass();
        boolean zJ = s9m0.j(uaq0VarA);
        strA.getClass();
        zas0 zas0Var = (zas0) zpuVar.b;
        int i3 = ((fsd) zpuVar.c).a().f36976a;
        knf0 knf0Var = (knf0) zas0Var.b;
        knf0Var.getClass();
        String strC = knf0Var.c();
        int offset = TimeZone.getDefault().getOffset(new Date().getTime());
        long j = offset;
        double d = j / 3600000;
        double d2 = ((j / 60000) - (d * 60.0d)) / 60.0d;
        return new s4v0(zas0.a(zas0.a(zas0.a(zas0.a(zas0.a(zas0.a(zas0.a(zas0.a(strA + "/statistic-app/statisticpopup/game/" + i + Separators.SLASH + str + "/main?", "r", String.valueOf(1)), "g", String.valueOf(1357)), "geo", String.valueOf(knf0Var.b())), "lc", strC), "tz", String.valueOf(offset < 0 ? d - Math.abs(d2) : d + d2)), "w", String.valueOf(i2)), "rtl", z ? "1" : "0"), "d", zJ ? "0" : "1"), i3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object I(long j, zje zjeVar, boolean z) {
        czn0 czn0Var;
        Object value;
        if (zjeVar instanceof czn0) {
            czn0Var = (czn0) zjeVar;
            int i = czn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                czn0Var.l = i - Integer.MIN_VALUE;
            } else {
                czn0Var = new czn0(this, zjeVar);
            }
        } else {
            czn0Var = new czn0(this, zjeVar);
        }
        Object obj = czn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = czn0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            if (((Boolean) ((ik6) ((nmo) this.b).f23782a).f14910a.f13193a.getValue()).booleanValue() == z) {
                return Unit.f46060a;
            }
            esg0 esg0Var = (esg0) this.c;
            czn0Var.i = z;
            czn0Var.l = 1;
            if (esg0Var.X(j, czn0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = czn0Var.i;
            z1x.P(obj);
        }
        p7m0 p7m0Var = ((ik6) ((drm0) this.d).f6568a).f14910a.f13193a;
        do {
            value = p7m0Var.getValue();
            ((Boolean) value).getClass();
        } while (!p7m0Var.m(value, Boolean.valueOf(z)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object J(bm5 bm5Var, double d, zje zjeVar) throws Exception {
        hlt0 hlt0Var;
        if (zjeVar instanceof hlt0) {
            hlt0Var = (hlt0) zjeVar;
            int i = hlt0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                hlt0Var.m = i - Integer.MIN_VALUE;
            } else {
                hlt0Var = new hlt0(this, zjeVar);
            }
        } else {
            hlt0Var = new hlt0(this, zjeVar);
        }
        Object objA = hlt0Var.k;
        Object obj = wne.f39444a;
        int i2 = hlt0Var.m;
        if (i2 == 0) {
            z1x.P(objA);
            khf0 khf0Var = (khf0) this.d;
            hlt0Var.i = bm5Var;
            hlt0Var.j = d;
            hlt0Var.m = 1;
            objA = khf0Var.A(bm5Var, tl5.c, hlt0Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = hlt0Var.j;
            bm5Var = hlt0Var.i;
            z1x.P(objA);
        }
        double d2 = d;
        ql5 ql5Var = (ql5) objA;
        ((ilt0) this.b).a(d2, ql5Var.f28916a);
        ((trm0) this.c).l(bm5Var, ql5.a(ql5Var, d2, null, 0, 8189));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x009e  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:54:0x00c0, B:67:0x00f0, B:69:0x00fa, B:71:0x0100), top: B:83:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:78:0x011c  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public Object K(zje zjeVar) {
        mvu mvuVar;
        List list;
        Throwable th;
        List list2;
        Object g0g0Var;
        Object num;
        Serializable serializableP;
        Integer intOrNull;
        int iIntValue;
        lj50 lj50Var;
        int i;
        int i2;
        int i3;
        byte b = this.f24204a;
        Object obj = this.b;
        boolean z = true;
        switch (b) {
            case 0:
                if (zjeVar instanceof mvu) {
                    mvuVar = (mvu) zjeVar;
                    int i4 = mvuVar.l;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        mvuVar.l = i4 - Integer.MIN_VALUE;
                    } else {
                        mvuVar = new mvu(this, zjeVar);
                    }
                } else {
                    mvuVar = new mvu(this, zjeVar);
                }
                Object objD = mvuVar.j;
                wne wneVar = wne.f39444a;
                int i5 = mvuVar.l;
                try {
                    if (i5 == 0) {
                        z1x.P(objD);
                        sjl0 sjl0Var = (sjl0) this.c;
                        mvuVar.l = 1;
                        objD = sjl0Var.d(mvuVar);
                        if (objD != wneVar) {
                        }
                        return wneVar;
                    }
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                z1x.P(objD);
                                return objD;
                            }
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = mvuVar.i;
                        try {
                            z1x.P(objD);
                            intOrNull = StringsKt.toIntOrNull(((m2c0) objD).c);
                            if (intOrNull != null) {
                                iIntValue = intOrNull.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            g0g0Var = new Integer(iIntValue);
                            e0g0 e0g0Var = j0g0.b;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                        num = new Integer(0);
                        if (g0g0Var instanceof g0g0) {
                            g0g0Var = num;
                        }
                        int iIntValue2 = ((Number) g0g0Var).intValue();
                        mvuVar.i = null;
                        mvuVar.l = 3;
                        serializableP = ((j910) obj).p(iIntValue2, mvuVar, list2);
                        if (serializableP != wneVar) {
                            return serializableP;
                        }
                        return wneVar;
                    }
                    z1x.P(objD);
                    e0g0 e0g0Var3 = j0g0.b;
                    rou rouVar = (rou) this.d;
                    mvuVar.i = list;
                    mvuVar.l = 2;
                    Object objA = rouVar.a(false, mvuVar);
                    if (objA != wneVar) {
                        objD = objA;
                        list2 = list;
                        intOrNull = StringsKt.toIntOrNull(((m2c0) objD).c);
                        if (intOrNull != null) {
                            iIntValue = intOrNull.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        g0g0Var = new Integer(iIntValue);
                        e0g0 e0g0Var4 = j0g0.b;
                        num = new Integer(0);
                        if (g0g0Var instanceof g0g0) {
                            g0g0Var = num;
                        }
                        int iIntValue3 = ((Number) g0g0Var).intValue();
                        mvuVar.i = null;
                        mvuVar.l = 3;
                        serializableP = ((j910) obj).p(iIntValue3, mvuVar, list2);
                        if (serializableP != wneVar) {
                            return serializableP;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    list2 = list;
                    e0g0 e0g0Var5 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                list = (List) objD;
                return wneVar;
            default:
                if (zjeVar instanceof lj50) {
                    lj50Var = (lj50) zjeVar;
                    int i6 = lj50Var.n;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        lj50Var.n = i6 - Integer.MIN_VALUE;
                    } else {
                        lj50Var = new lj50(this, zjeVar);
                    }
                } else {
                    lj50Var = new lj50(this, zjeVar);
                }
                Object obj2 = lj50Var.l;
                wne wneVar2 = wne.f39444a;
                int i7 = lj50Var.n;
                if (i7 == 0) {
                    z1x.P(obj2);
                    sub0 sub0VarA = ((kqc) this.d).a();
                    sub0 sub0Var = sub0.SUCCESS;
                    int i8 = sub0VarA == sub0Var ? 1 : 0;
                    sub0 sub0VarA2 = ((kqc) obj).a();
                    int i9 = sub0VarA2 != sub0Var ? 1 : 0;
                    int i10 = sub0VarA2 == sub0.SERVER_ERROR ? 1 : 0;
                    jqc jqcVar = (jqc) this.c;
                    lj50Var.i = i8;
                    lj50Var.j = i9;
                    lj50Var.k = i10;
                    lj50Var.n = 1;
                    Serializable serializableA = jqcVar.a(lj50Var);
                    if (serializableA == wneVar2) {
                        return wneVar2;
                    }
                    i = i8;
                    obj2 = serializableA;
                    i2 = i10;
                    i3 = i9;
                } else {
                    if (i7 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = lj50Var.k;
                    i3 = lj50Var.j;
                    i = lj50Var.i;
                    z1x.P(obj2);
                }
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (i == 0 || i3 == 0 || (zBooleanValue && i2 == 0)) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r9 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object L(a.d270 r8, a.zje r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.bnv
            if (r0 == 0) goto L13
            r0 = r9
            a.bnv r0 = (a.bnv) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.bnv r0 = new a.bnv
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L30
            a.d270 r8 = r0.i
            a.z1x.P(r9)
            goto L60
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L36:
            a.z1x.P(r9)
            return r9
        L3a:
            a.z1x.P(r9)
            return r9
        L3e:
            a.z1x.P(r9)
            int r9 = r8.ordinal()
            if (r9 == 0) goto La4
            if (r9 == r5) goto L94
            java.lang.Object r7 = r7.b
            a.cdu r7 = (a.cdu) r7
            r0.i = r8
            r0.l = r4
            a.pbt r9 = r7.b
            a.gst0 r7 = r7.c
            boolean r7 = r7.a()
            java.lang.Object r9 = r9.k(r7, r0)
            if (r9 != r1) goto L60
            goto Lb2
        L60:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r7 = r9 instanceof java.util.Collection
            r0 = 0
            if (r7 == 0) goto L72
            r7 = r9
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L72
        L70:
            r6 = r0
            goto L8f
        L72:
            java.util.Iterator r7 = r9.iterator()
        L76:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L70
            java.lang.Object r9 = r7.next()
            a.rq60 r9 = (a.rq60) r9
            a.evz r1 = a.d270.b
            int r9 = r9.f30917a
            r1.getClass()
            a.d270 r9 = a.evz.c(r9)
            if (r9 != r8) goto L76
        L8f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            return r7
        L94:
            java.lang.Object r7 = r7.d
            a.cdu r7 = (a.cdu) r7
            r0.i = r3
            r0.l = r5
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto La3
            goto Lb2
        La3:
            return r7
        La4:
            java.lang.Object r7 = r7.c
            a.yuu r7 = (a.yuu) r7
            r0.i = r3
            r0.l = r6
            java.lang.Object r7 = r7.r(r0)
            if (r7 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nvu.L(a.d270, a.zje):java.lang.Object");
    }

    public void M(long j) {
        vwb0 vwb0Var = (vwb0) this.d;
        aoe0 aoe0VarA = ((ane0) this.c).a();
        ony onyVar = (ony) this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strC = aoe0VarA.f1197a;
        if (strC == null) {
            strC = "";
        }
        if (strC.length() == 0) {
            strC = vwb0Var.c("referral_dl", "");
        }
        linkedHashMap.put("tag", ncy.c(strC));
        String strC2 = aoe0VarA.c;
        if (strC2 == null) {
            strC2 = "";
        }
        if (strC2.length() == 0) {
            strC2 = vwb0Var.c("post_back", "");
        }
        linkedHashMap.put("pb", ncy.c(strC2));
        linkedHashMap.put("userId", ncy.b(Long.valueOf(j)));
        ((rny) onyVar).a("InstallFromLoader", new tny("event", xp20.n(linkedHashMap)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object N(int i, int i2, zje zjeVar) {
        at30 at30Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof at30) {
            at30Var = (at30) zjeVar;
            int i3 = at30Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                at30Var.k = i3 - Integer.MIN_VALUE;
            } else {
                at30Var = new at30(this, zjeVar);
            }
        } else {
            at30Var = new at30(this, zjeVar);
        }
        Object objC = at30Var.i;
        wne wneVar = wne.f39444a;
        int i4 = at30Var.k;
        if (i4 == 0) {
            z1x.P(objC);
            zn00 zn00Var = (zn00) this.b;
            String strA = ((btt0) this.c).a();
            xs30 xs30Var = new xs30(i, i2, knf0Var.c());
            at30Var.k = 1;
            objC = ((gr30) ((np30) zn00Var.b).invoke()).c(strA, xs30Var, at30Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return zdx.L((et30) ((u2t) objC).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object O(String str, zje zjeVar) {
        kvs0 kvs0Var;
        if (zjeVar instanceof kvs0) {
            kvs0Var = (kvs0) zjeVar;
            int i = kvs0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kvs0Var.k = i - Integer.MIN_VALUE;
            } else {
                kvs0Var = new kvs0(this, zjeVar);
            }
        } else {
            kvs0Var = new kvs0(this, zjeVar);
        }
        Object objB = kvs0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kvs0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            c4k c4kVar = new c4k(new b4k(str));
            drm0 drm0Var = (drm0) this.c;
            String strA = ((btt0) this.d).a();
            kvs0Var.k = 1;
            objB = ((sus0) ((lkr0) drm0Var.f6568a).invoke()).b(strA, c4kVar, kvs0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return new v340((t16) ((q16) objB).a());
    }

    public void P(Object obj) {
        long jV = hfm0.v();
        if (jV == ocq0.f25040a) {
            this.d = obj;
            return;
        }
        synchronized (this.c) {
            jcq0 jcq0Var = (jcq0) ((AtomicReference) this.b).get();
            int iA = jcq0Var.a(jV);
            if (iA < 0) {
                ((AtomicReference) this.b).set(jcq0Var.b(obj, jV));
            } else {
                jcq0Var.c[iA] = obj;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public Object Q(zts ztsVar, boolean z, zje zjeVar) {
        rbn0 rbn0Var;
        zts ztsVar2;
        boolean zA;
        g8n0 g8n0Var = (g8n0) this.b;
        if (zjeVar instanceof rbn0) {
            rbn0Var = (rbn0) zjeVar;
            int i = rbn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbn0Var.l = i - Integer.MIN_VALUE;
            } else {
                rbn0Var = new rbn0(this, zjeVar);
            }
        } else {
            rbn0Var = new rbn0(this, zjeVar);
        }
        Object obj = rbn0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = rbn0Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            long j = ztsVar.f44977a.f25844a;
            int i3 = z ? 4 : 3;
            List<xf90> list = ztsVar.b;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (xf90 xf90Var : list) {
                List list2 = xf90Var.c;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((sho) obj2).b) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    axq.t(((sho) it.next()).f32222a, arrayList3);
                }
                arrayList.add(new k6n0(new Long(xf90Var.f40781a), arrayList3));
            }
            l6n0 l6n0Var = new l6n0(i3, j, arrayList);
            y8n0 y8n0Var = (y8n0) ((enj0) this.d).invoke();
            String strA = ((btt0) this.c).a();
            rbn0Var.i = ztsVar;
            rbn0Var.l = 1;
            if (y8n0Var.b(strA, l6n0Var, rbn0Var) == wneVar) {
                return wneVar;
            }
            ztsVar2 = ztsVar;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ztsVar2 = rbn0Var.i;
            z1x.P(obj);
        }
        ztsVar2.getClass();
        ots otsVar = ztsVar2.f44977a;
        List list3 = ztsVar2.b;
        if (list3 == null || !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                List list4 = ((xf90) it2.next()).c;
                if (list4 == null || !list4.isEmpty()) {
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        if (((sho) it3.next()).b) {
                            zA = g8n0Var.a(otsVar);
                        }
                    }
                }
            }
            zA = g8n0Var.b(otsVar);
        } else {
            zA = g8n0Var.b(otsVar);
        }
        return Boolean.valueOf(zA);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object R(long j, ynb0 ynb0Var, zje zjeVar) {
        lvs0 lvs0Var;
        ani0 ani0Var = (ani0) this.b;
        if (zjeVar instanceof lvs0) {
            lvs0Var = (lvs0) zjeVar;
            int i = lvs0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lvs0Var.l = i - Integer.MIN_VALUE;
            } else {
                lvs0Var = new lvs0(this, zjeVar);
            }
        } else {
            lvs0Var = new lvs0(this, zjeVar);
        }
        Object objA = lvs0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = lvs0Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            hjj0 hjj0Var = (hjj0) ani0Var.f1155a;
            if (hjj0Var != null) {
                return hjj0Var;
            }
            drm0 drm0Var = (drm0) this.c;
            String strA = ((btt0) this.d).a();
            g6a g6aVar = new g6a(ynb0Var);
            lvs0Var.i = j;
            lvs0Var.l = 1;
            objA = ((sus0) ((lkr0) drm0Var.f6568a).invoke()).a(strA, g6aVar, lvs0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = lvs0Var.i;
            z1x.P(objA);
        }
        gjj0 gjj0Var = (gjj0) ((q16) objA).a();
        String str = gjj0Var.f11400a;
        Locale locale = Locale.ENGLISH;
        if (str == null) {
            jf4.k(null);
            return null;
        }
        Long lValueOf = Long.valueOf(j);
        String str2 = gjj0Var.b;
        if (str2 == null) {
            jf4.k(null);
            return null;
        }
        String str3 = String.format(locale, "otpauth://totp/%s:%s?secret=%s&issuer=%s", Arrays.copyOf(new Object[]{str, lValueOf, str2, str}, 4));
        String str4 = gjj0Var.c;
        if (str4 == null) {
            jf4.k(null);
            return null;
        }
        hjj0 hjj0Var2 = new hjj0(new swp0(gjj0Var.d, false), str3, str4);
        ani0Var.f1155a = hjj0Var2;
        return hjj0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object S(int i, zje zjeVar) {
        bt30 bt30Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof bt30) {
            bt30Var = (bt30) zjeVar;
            int i2 = bt30Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bt30Var.k = i2 - Integer.MIN_VALUE;
            } else {
                bt30Var = new bt30(this, zjeVar);
            }
        } else {
            bt30Var = new bt30(this, zjeVar);
        }
        Object objB = bt30Var.i;
        wne wneVar = wne.f39444a;
        int i3 = bt30Var.k;
        if (i3 == 0) {
            z1x.P(objB);
            zn00 zn00Var = (zn00) this.b;
            String strA = ((btt0) this.c).a();
            kt30 kt30Var = new kt30(i, knf0Var.c());
            bt30Var.k = 1;
            objB = ((gr30) ((np30) zn00Var.b).invoke()).b(strA, kt30Var, bt30Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return zdx.L((et30) ((u2t) objB).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object T(knb knbVar, zje zjeVar) {
        ml00 ml00Var;
        imb imbVar = (imb) ((pzu) this.c).c;
        if (zjeVar instanceof ml00) {
            ml00Var = (ml00) zjeVar;
            int i = ml00Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ml00Var.l = i - Integer.MIN_VALUE;
            } else {
                ml00Var = new ml00(this, zjeVar);
            }
        } else {
            ml00Var = new ml00(this, zjeVar);
        }
        Object objK = ml00Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ml00Var.l;
        if (i2 == 0) {
            z1x.P(objK);
            List list = knbVar.f18576a;
            list.getClass();
            imbVar.f15016a.o(null, list);
            p7m0 p7m0Var = imbVar.f15016a;
            ml00Var.i = knbVar;
            ml00Var.l = 1;
            objK = ntb.K(p7m0Var, ml00Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            knbVar = ml00Var.i;
            z1x.P(objK);
        }
        return knb.a(knbVar, (List) objK);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public tft0 U(gqe0 gqe0Var, fay fayVar, boolean z) throws Throwable {
        iwb0 iwb0VarD;
        boolean z2 = fayVar.d;
        f7u f7uVar = (f7u) this.b;
        v7i v7iVar = (v7i) f7uVar.b;
        zqe0 zqe0Var = gqe0Var.b;
        xqe0 xqe0Var = zqe0Var instanceof xqe0 ? (xqe0) zqe0Var : null;
        if (xqe0Var != null) {
            Class cls = xqe0Var.f41314a;
            if (cls.equals(Void.TYPE)) {
                iwb0VarD = null;
            } else {
                iwb0VarD = mfy.b(cls.getName()).d();
            }
        } else {
            iwb0VarD = null;
        }
        j9z j9zVar = new j9z(f7uVar, gqe0Var, true);
        if (iwb0VarD == null) {
            wsy wsyVarV = V(zqe0Var, xvw.Y(b0t0.b, z2, null, 6));
            if (z2) {
                return ((zm40) v7iVar.j).e.i(z ? t3u0.e : t3u0.c, wsyVarV, j9zVar);
            }
            return ucx.W(((zm40) v7iVar.j).e.i(t3u0.c, wsyVarV, j9zVar), ((zm40) v7iVar.j).e.i(t3u0.e, wsyVarV, j9zVar).k0(true));
        }
        kzj0 kzj0VarR = ((zm40) v7iVar.j).e.r(iwb0VarD);
        wsy wsyVarY = vsm0.y(kzj0VarR, new i93(tx3.g0(new g93[]{kzj0VarR.getAnnotations(), j9zVar}), (byte) 1));
        wsyVarY.getClass();
        kzj0 kzj0Var = (kzj0) wsyVarY;
        return z2 ? kzj0Var : ucx.W(kzj0Var, kzj0Var.k0(true));
    }

    public wsy V(zqe0 zqe0Var, fay fayVar) throws Throwable {
        wsy wsyVarV;
        v7i v7iVar = (v7i) ((f7u) this.b).b;
        if (zqe0Var instanceof xqe0) {
            Class cls = ((xqe0) zqe0Var).f41314a;
            iwb0 iwb0VarD = cls.equals(Void.TYPE) ? null : mfy.b(cls.getName()).d();
            return iwb0VarD != null ? ((zm40) v7iVar.j).e.t(iwb0VarD) : ((zm40) v7iVar.j).e.x();
        }
        boolean z = false;
        if (!(zqe0Var instanceof oqe0)) {
            if (zqe0Var instanceof gqe0) {
                return U((gqe0) zqe0Var, fayVar, false);
            }
            if (zqe0Var instanceof cre0) {
                zqe0 zqe0VarC = ((cre0) zqe0Var).c();
                return (zqe0VarC == null || (wsyVarV = V(zqe0VarC, fayVar)) == null) ? ((zm40) v7iVar.j).e.n() : wsyVarV;
            }
            if (zqe0Var == null) {
                return ((zm40) v7iVar.j).e.n();
            }
            v4i0.j(zqe0Var, "Unsupported type: ");
            return null;
        }
        oqe0 oqe0Var = (oqe0) zqe0Var;
        Type type = oqe0Var.f25684a;
        if (!fayVar.d && fayVar.f9231a != b0t0.f1776a) {
            z = true;
        }
        boolean zD = oqe0Var.d();
        if (!zD && !z) {
            kzj0 kzj0VarS = s(oqe0Var, fayVar, null);
            return kzj0VarS != null ? kzj0VarS : f2o.c(c2o.c, type.toString());
        }
        kzj0 kzj0VarS2 = s(oqe0Var, fay.a(fayVar, gay.c, false, null, null, 61), null);
        if (kzj0VarS2 == null) {
            return f2o.c(c2o.c, type.toString());
        }
        kzj0 kzj0VarS3 = s(oqe0Var, fay.a(fayVar, gay.b, false, null, null, 61), kzj0VarS2);
        if (kzj0VarS3 == null) {
            return f2o.c(c2o.c, type.toString());
        }
        if (!zD) {
            return ucx.W(kzj0VarS2, kzj0VarS3);
        }
        dae0 dae0Var = new dae0(kzj0VarS2, kzj0VarS3);
        ysy.f43192a.b(kzj0VarS2, kzj0VarS3);
        return dae0Var;
    }

    public void W() {
        hz40 hz40Var = (hz40) this.b;
        String str = (String) this.c;
        List list = (List) hz40Var.l(str);
        if (list != null) {
            list.remove((Function0) this.d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        hz40Var.n(str, list);
    }

    public void X() {
        md3 md3Var = (md3) this.d;
        if (md3Var != null) {
            try {
                ((us00) this.b).unregisterReceiver(md3Var);
                this.d = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object Y(List list, zje zjeVar) {
        sbn0 sbn0Var;
        g8n0 g8n0Var = (g8n0) this.b;
        if (zjeVar instanceof sbn0) {
            sbn0Var = (sbn0) zjeVar;
            int i = sbn0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbn0Var.l = i - Integer.MIN_VALUE;
            } else {
                sbn0Var = new sbn0(this, zjeVar);
            }
        } else {
            sbn0Var = new sbn0(this, zjeVar);
        }
        Object objU = sbn0Var.j;
        Object obj = wne.f39444a;
        int i2 = sbn0Var.l;
        if (i2 == 0) {
            z1x.P(objU);
            String strA = ((btt0) this.c).a();
            sbn0Var.i = list;
            sbn0Var.l = 1;
            objU = u(sbn0Var, strA, list);
            if (objU == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = sbn0Var.i;
            z1x.P(objU);
        }
        Boolean bool = (Boolean) objU;
        if (bool.booleanValue()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ots otsVarC = g8n0Var.c(((Number) it.next()).longValue());
                if (otsVarC != null) {
                    g8n0Var.b(otsVarC);
                }
            }
        }
        return bool;
    }

    public void Z() {
        AudioManager audioManager = (AudioManager) ((n0o0) this.d).getValue();
        Integer numValueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 1) || (numValueOf != null && numValueOf.intValue() == 2)) {
            int i = Build.VERSION.SDK_INT;
            n0o0 n0o0Var = (n0o0) this.c;
            if (i >= 26) {
                Vibrator vibrator = (Vibrator) n0o0Var.getValue();
                if (vibrator != null) {
                    vibrator.vibrate(VibrationEffect.createOneShot(100L, -1));
                    return;
                }
                return;
            }
            Vibrator vibrator2 = (Vibrator) n0o0Var.getValue();
            if (vibrator2 != null) {
                vibrator2.vibrate(100L);
            }
        }
    }

    @Override // a.tj9
    public boolean a() {
        return !A().f27124a.isEmpty();
    }

    @Override // a.tj9
    public List b(int i, Function2 function2) {
        long j = A().u;
        tbz tbzVar = (tbz) this.d;
        if (tbzVar != null) {
            return kotlin.collections.a.c(tbzVar.a(i, j, new ka70(function2, this, (byte) 4), true));
        }
        Intrinsics.h(CommonConstant.ReqAccessTokenParam.STATE_LABEL);
        throw null;
    }

    @Override // a.tj9
    public int c() {
        if (A().f27124a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((wj30) CollectionsKt.U(A().f27124a)).f39244a) - ((long) A().h);
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    @Override // a.tj9
    public int d(int i) {
        int size = A().q.size();
        int size2 = A().f27124a.size();
        if (i < size) {
            return ((wj30) A().q.get(i)).f39244a;
        }
        if (i >= size && i < size + size2) {
            return ((wj30) A().f27124a.get(i - size)).f39244a;
        }
        if (i >= size + size2) {
            return ((wj30) A().r.get((i - size) - size2)).f39244a;
        }
        return -1;
    }

    @Override // a.tj9
    public int e() {
        return A().r.size() + A().f27124a.size() + A().q.size();
    }

    @Override // a.tj9
    public int g() {
        if (A().f27124a.isEmpty()) {
            return -1;
        }
        long j = ((long) ((wj30) CollectionsKt.d0(A().f27124a)).f39244a) + ((long) A().h);
        long jP = ((long) p()) - 1;
        if (j > jP) {
            j = jP;
        }
        return (int) j;
    }

    @Override // a.tj9
    public w6k getDensity() {
        return A().t;
    }

    @Override // a.oex
    public ClipDescription getDescription() {
        return (ClipDescription) this.c;
    }

    @Override // a.oex
    public Object h() {
        return null;
    }

    @Override // a.tj9
    public int i() {
        if (A().f27124a.isEmpty()) {
            return 0;
        }
        int i = ((wj30) CollectionsKt.U(A().f27124a)).j + (-A().f);
        return Math.abs(i <= 0 ? i : 0);
    }

    @Override // a.tj9
    public int j(int i) {
        return A().b;
    }

    @Override // a.tj9
    public int k() {
        return n6x.C(A());
    }

    @Override // a.oex
    public Uri l() {
        return (Uri) this.b;
    }

    @Override // a.tj9
    public int n() {
        if (A().f27124a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((wj30) CollectionsKt.d0(A().f27124a)).j + A().b) + A().c) - A().g);
    }

    @Override // a.oex
    public Uri o() {
        return (Uri) this.d;
    }

    @Override // a.tj9
    public int p() {
        return ((Number) ((s39) this.b).invoke()).intValue();
    }

    @Override // a.tj9
    public int q() {
        if (A().f27124a.isEmpty()) {
            return -1;
        }
        return p() - 1;
    }

    @Override // a.tj9
    public Object r(int i) {
        int size = A().q.size();
        int size2 = A().f27124a.size();
        if (i < size) {
            return ((wj30) A().q.get(i)).d;
        }
        if (i < size || i >= size + size2) {
            return i >= size + size2 ? ((wj30) A().r.get((i - size) - size2)).d : uj9.c;
        }
        return ((wj30) A().f27124a.get(i - size)).d;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0139  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015a, code lost:
    
        if (r9 != null) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v2, types: [a.kzj0] */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r4v8, types: [a.iys0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a.kzj0 s(a.oqe0 r21, a.fay r22, a.kzj0 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nvu.s(a.oqe0, a.fay, a.kzj0):a.kzj0");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object t(zje zjeVar) {
        jbn0 jbn0Var;
        g8n0 g8n0Var = (g8n0) this.b;
        if (zjeVar instanceof jbn0) {
            jbn0Var = (jbn0) zjeVar;
            int i = jbn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbn0Var.k = i - Integer.MIN_VALUE;
            } else {
                jbn0Var = new jbn0(this, zjeVar);
            }
        } else {
            jbn0Var = new jbn0(this, zjeVar);
        }
        Object objU = jbn0Var.i;
        Object obj = wne.f39444a;
        int i2 = jbn0Var.k;
        if (i2 == 0) {
            z1x.P(objU);
            List listL0 = CollectionsKt.L0((Iterable) g8n0Var.f10874a.getValue());
            ArrayList arrayList = new ArrayList(r3d.q(listL0, 10));
            Iterator it = listL0.iterator();
            while (it.hasNext()) {
                axq.t(((ots) it.next()).f25844a, arrayList);
            }
            String strA = ((btt0) this.c).a();
            jbn0Var.k = 1;
            objU = u(jbn0Var, strA, arrayList);
            if (objU == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objU);
        }
        Boolean bool = (Boolean) objU;
        if (bool.booleanValue()) {
            g8n0Var.f10874a.n(xun.f41520a);
        }
        return bool;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable u(zje zjeVar, String str, List list) {
        kbn0 kbn0Var;
        Serializable g0g0Var;
        if (zjeVar instanceof kbn0) {
            kbn0Var = (kbn0) zjeVar;
            int i = kbn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kbn0Var.k = i - Integer.MIN_VALUE;
            } else {
                kbn0Var = new kbn0(this, zjeVar);
            }
        } else {
            kbn0Var = new kbn0(this, zjeVar);
        }
        Object obj = kbn0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kbn0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                y8n0 y8n0Var = (y8n0) ((enj0) this.d).invoke();
                f5k f5kVar = new f5k(list);
                kbn0Var.k = 1;
                if (y8n0Var.a(str, f5kVar, kbn0Var) == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Boolean.TRUE;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? Boolean.FALSE : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v6, types: [byte[], java.io.Serializable] */
    public Serializable v(int i, zje zjeVar, String str) {
        fnj0 fnj0Var;
        if (zjeVar instanceof fnj0) {
            fnj0Var = (fnj0) zjeVar;
            int i2 = fnj0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fnj0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                fnj0Var = new fnj0(this, zjeVar);
            }
        } else {
            fnj0Var = new fnj0(this, zjeVar);
        }
        Object objA = fnj0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = fnj0Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            int offset = TimeZone.getDefault().getOffset(new Date().getTime());
            long j = offset;
            double d = j / 3600000;
            double d2 = ((j / 60000) - (60.0d * d)) / 100.0d;
            lnj0 lnj0Var = new lnj0(i, str, offset < 0 ? d - Math.abs(d2) : d + d2, !DateFormat.is24HourFormat(((tgk) this.b).f33916a));
            ani0 ani0Var = (ani0) this.c;
            String strA = ((btt0) this.d).a();
            fnj0Var.k = 1;
            objA = ((omj0) ((enj0) ani0Var.f1155a).invoke()).a(strA, lnj0Var, fnj0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        ResponseBody responseBody = (ResponseBody) objA;
        if (responseBody.getC() != 0) {
            return responseBody.c();
        }
        jf4.k(null);
        return null;
    }

    public Object w() {
        long jV = hfm0.v();
        if (jV == ocq0.f25040a) {
            return this.d;
        }
        jcq0 jcq0Var = (jcq0) ((AtomicReference) this.b).get();
        int iA = jcq0Var.a(jV);
        if (iA >= 0) {
            return jcq0Var.c[iA];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object x(long j, zje zjeVar) {
        zs30 zs30Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof zs30) {
            zs30Var = (zs30) zjeVar;
            int i = zs30Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zs30Var.k = i - Integer.MIN_VALUE;
            } else {
                zs30Var = new zs30(this, zjeVar);
            }
        } else {
            zs30Var = new zs30(this, zjeVar);
        }
        Object objA = zs30Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zs30Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            zn00 zn00Var = (zn00) this.b;
            String strA = ((btt0) this.c).a();
            ss30 ss30Var = new ss30(j, knf0Var.c());
            zs30Var.k = 1;
            objA = ((gr30) ((np30) zn00Var.b).invoke()).a(strA, ss30Var, zs30Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return zdx.L((et30) ((u2t) objA).a());
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    public Object y(long j, zje zjeVar, boolean z) {
        nbn0 nbn0Var;
        ?? arrayList;
        xf90 xf90Var;
        sho shoVar;
        if (zjeVar instanceof nbn0) {
            nbn0Var = (nbn0) zjeVar;
            int i = nbn0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbn0Var.k = i - Integer.MIN_VALUE;
            } else {
                nbn0Var = new nbn0(this, zjeVar);
            }
        } else {
            nbn0Var = new nbn0(this, zjeVar);
        }
        nbn0 nbn0Var2 = nbn0Var;
        Object objC = nbn0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = nbn0Var2.k;
        List list = null;
        if (i2 == 0) {
            z1x.P(objC);
            y8n0 y8n0Var = (y8n0) ((enj0) this.d).invoke();
            String strA = ((btt0) this.c).a();
            int i3 = z ? 4 : 3;
            nbn0Var2.k = 1;
            objC = y8n0Var.c(strA, j, i3, nbn0Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        yts ytsVar = (yts) ((dx5) objC).a();
        Long l = ytsVar.f43234a;
        if (l == null) {
            throw new ef5();
        }
        long jLongValue = l.longValue();
        List<xts> list2 = ytsVar.b;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (xts xtsVar : list2) {
                xtsVar.getClass();
                List<uts> list3 = xtsVar.b;
                if (list3 != null) {
                    arrayList = new ArrayList();
                    for (uts utsVar : list3) {
                        utsVar.getClass();
                        Long l2 = utsVar.f36269a;
                        if (l2 != null) {
                            long jLongValue2 = l2.longValue();
                            boolean zD = Intrinsics.d(utsVar.b, Boolean.TRUE);
                            String str = utsVar.c;
                            if (str == null) {
                                shoVar = null;
                            } else {
                                shoVar = new sho(str, jLongValue2, zD);
                            }
                        } else {
                            shoVar = null;
                        }
                        if (shoVar != null) {
                            arrayList.add(shoVar);
                        }
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                Long l3 = xtsVar.f41478a;
                if (l3 != null) {
                    long jLongValue3 = l3.longValue();
                    String str2 = xtsVar.c;
                    if (str2 == null) {
                        xf90Var = null;
                    } else {
                        xf90Var = new xf90(jLongValue3, str2, arrayList);
                    }
                } else {
                    xf90Var = null;
                }
                if (xf90Var != null) {
                    arrayList2.add(xf90Var);
                }
            }
            list = arrayList2;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        return new pts(jLongValue, list);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:41|153|42|147|43|44|141|45|164|46|47|160|48|49|151|50|51|149|52|162|53|54|(1:57)|125) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:155|(1:(3:(1:(4:13|14|15|127)(2:18|19))(4:20|21|22|166)|111|(24:41|153|42|147|43|44|141|45|164|46|47|160|48|49|151|50|51|149|52|162|53|54|(1:57)|125)(3:131|159|(2:133|134)(1:137)))(4:23|143|24|25))(3:28|(1:33)|(2:35|36)(4:37|38|39|(24:41|153|42|147|43|44|141|45|164|46|47|160|48|49|151|50|51|149|52|162|53|54|(1:57)|125)(3:131|159|(2:133|134)(1:137))))|145|58|59|(3:61|(4:64|(3:168|66|172)(1:171)|170|62)|169)(1:67)|(1:69)|70) */
    /* JADX WARN: Code duplicated, block: B:100:0x0296 A[Catch: all -> 0x0293, TryCatch #8 {all -> 0x0293, blocks: (B:94:0x0276, B:97:0x027e, B:100:0x0296, B:104:0x02a2, B:106:0x02a6, B:112:0x02f3, B:115:0x0311, B:117:0x0322, B:121:0x032c, B:123:0x0330, B:128:0x0378, B:129:0x0390), top: B:157:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x029f  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:106:0x02a6 A[Catch: all -> 0x0293, TryCatch #8 {all -> 0x0293, blocks: (B:94:0x0276, B:97:0x027e, B:100:0x0296, B:104:0x02a2, B:106:0x02a6, B:112:0x02f3, B:115:0x0311, B:117:0x0322, B:121:0x032c, B:123:0x0330, B:128:0x0378, B:129:0x0390), top: B:157:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:109:0x02da  */
    /* JADX WARN: Code duplicated, block: B:112:0x02f3 A[Catch: all -> 0x0293, TryCatch #8 {all -> 0x0293, blocks: (B:94:0x0276, B:97:0x027e, B:100:0x0296, B:104:0x02a2, B:106:0x02a6, B:112:0x02f3, B:115:0x0311, B:117:0x0322, B:121:0x032c, B:123:0x0330, B:128:0x0378, B:129:0x0390), top: B:157:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0311 A[Catch: all -> 0x0293, TryCatch #8 {all -> 0x0293, blocks: (B:94:0x0276, B:97:0x027e, B:100:0x0296, B:104:0x02a2, B:106:0x02a6, B:112:0x02f3, B:115:0x0311, B:117:0x0322, B:121:0x032c, B:123:0x0330, B:128:0x0378, B:129:0x0390), top: B:157:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0322 A[Catch: all -> 0x0293, TryCatch #8 {all -> 0x0293, blocks: (B:94:0x0276, B:97:0x027e, B:100:0x0296, B:104:0x02a2, B:106:0x02a6, B:112:0x02f3, B:115:0x0311, B:117:0x0322, B:121:0x032c, B:123:0x0330, B:128:0x0378, B:129:0x0390), top: B:157:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0329  */
    /* JADX WARN: Code duplicated, block: B:120:0x032b  */
    /* JADX WARN: Code duplicated, block: B:123:0x0330 A[Catch: all -> 0x0293, TryCatch #8 {all -> 0x0293, blocks: (B:94:0x0276, B:97:0x027e, B:100:0x0296, B:104:0x02a2, B:106:0x02a6, B:112:0x02f3, B:115:0x0311, B:117:0x0322, B:121:0x032c, B:123:0x0330, B:128:0x0378, B:129:0x0390), top: B:157:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0362  */
    /* JADX WARN: Code duplicated, block: B:128:0x0378 A[Catch: all -> 0x0293, TryCatch #8 {all -> 0x0293, blocks: (B:94:0x0276, B:97:0x027e, B:100:0x0296, B:104:0x02a2, B:106:0x02a6, B:112:0x02f3, B:115:0x0311, B:117:0x0322, B:121:0x032c, B:123:0x0330, B:128:0x0378, B:129:0x0390), top: B:157:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0390 A[Catch: all -> 0x0293, TRY_LEAVE, TryCatch #8 {all -> 0x0293, blocks: (B:94:0x0276, B:97:0x027e, B:100:0x0296, B:104:0x02a2, B:106:0x02a6, B:112:0x02f3, B:115:0x0311, B:117:0x0322, B:121:0x032c, B:123:0x0330, B:128:0x0378, B:129:0x0390), top: B:157:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ac A[Catch: all -> 0x03b4, TRY_ENTER, TryCatch #9 {all -> 0x03b4, blocks: (B:133:0x03ac, B:134:0x03b3, B:137:0x03b8), top: B:159:0x03aa }] */
    /* JADX WARN: Code duplicated, block: B:137:0x03b8 A[Catch: all -> 0x03b4, TRY_LEAVE, TryCatch #9 {all -> 0x03b4, blocks: (B:133:0x03ac, B:134:0x03b3, B:137:0x03b8), top: B:159:0x03aa }] */
    /* JADX WARN: Code duplicated, block: B:168:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0199  */
    /* JADX WARN: Code duplicated, block: B:57:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0200 A[Catch: all -> 0x0071, TryCatch #7 {all -> 0x0071, blocks: (B:14:0x0055, B:59:0x01f6, B:61:0x0200, B:62:0x0209, B:64:0x020f, B:66:0x021b, B:69:0x0223, B:70:0x0225, B:21:0x00a5, B:38:0x0180), top: B:155:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x020f A[Catch: all -> 0x0071, TryCatch #7 {all -> 0x0071, blocks: (B:14:0x0055, B:59:0x01f6, B:61:0x0200, B:62:0x0209, B:64:0x020f, B:66:0x021b, B:69:0x0223, B:70:0x0225, B:21:0x00a5, B:38:0x0180), top: B:155:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x021f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0223 A[Catch: all -> 0x0071, TryCatch #7 {all -> 0x0071, blocks: (B:14:0x0055, B:59:0x01f6, B:61:0x0200, B:62:0x0209, B:64:0x020f, B:66:0x021b, B:69:0x0223, B:70:0x0225, B:21:0x00a5, B:38:0x0180), top: B:155:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:96:0x027c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x027e A[Catch: all -> 0x0293, TryCatch #8 {all -> 0x0293, blocks: (B:94:0x0276, B:97:0x027e, B:100:0x0296, B:104:0x02a2, B:106:0x02a6, B:112:0x02f3, B:115:0x0311, B:117:0x0322, B:121:0x032c, B:123:0x0330, B:128:0x0378, B:129:0x0390), top: B:157:0x0276 }] */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0229, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x022a, code lost:
    
        r2 = r5;
        r5 = r1;
        r1 = r2;
        r20 = r17;
        r22 = r19;
        r19 = r3;
        r2 = r7;
        r7 = r9;
        r8 = r11;
        r12 = r13;
        r14 = r15;
        r11 = r16;
        r15 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x023d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0240, code lost:
    
        r19 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0242, code lost:
    
        r2 = r12;
        r20 = r17;
        r12 = r4;
        r5 = r28;
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x024f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0254, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0255, code lost:
    
        r17 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0257, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x025d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x025e, code lost:
    
        r29 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0261, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0264, code lost:
    
        r1 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x026b, code lost:
    
        r29 = r1;
        r28 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0270, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0271, code lost:
    
        r28 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0362 -> B:127:0x0370). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x027e -> B:40:0x0197). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(int r28, long r29, long r31, a.zje r33) {
        /*
            Method dump skipped, instruction units count: 976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nvu.z(int, long, long, a.zje):java.lang.Object");
    }

    @Override // a.oex
    public void m() {
    }

    @Override // a.tj9
    public int f(int i) {
        return i;
    }

    public nvu(s1p s1pVar) {
        this.f24204a = (byte) 25;
        s1pVar.getClass();
        this.b = s1pVar;
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public nvu(ntu ntuVar, zpu zpuVar, wyu wyuVar) {
        this.f24204a = (byte) 2;
        wyuVar.getClass();
        this.b = ntuVar;
        this.c = zpuVar;
        this.d = wyuVar;
    }

    public nvu(j910 j910Var, sjl0 sjl0Var, rou rouVar) {
        this.f24204a = (byte) 0;
        sjl0Var.getClass();
        this.b = j910Var;
        this.c = sjl0Var;
        this.d = rouVar;
    }

    public nvu(Context context) {
        this.f24204a = (byte) 29;
        context.getClass();
        this.b = context;
        final byte b = 0;
        this.c = maz.b(new Function0(this) { // from class: a.fdu0
            public final /* synthetic */ nvu b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                nvu nvuVar = this.b;
                switch (b2) {
                    case 0:
                        Object systemService = ((Context) nvuVar.b).getSystemService("vibrator");
                        if (systemService instanceof Vibrator) {
                            return (Vibrator) systemService;
                        }
                        return null;
                    default:
                        Object systemService2 = ((Context) nvuVar.b).getSystemService("audio");
                        if (systemService2 instanceof AudioManager) {
                            return (AudioManager) systemService2;
                        }
                        return null;
                }
            }
        });
        final byte b2 = 1;
        this.d = maz.b(new Function0(this) { // from class: a.fdu0
            public final /* synthetic */ nvu b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                nvu nvuVar = this.b;
                switch (b3) {
                    case 0:
                        Object systemService = ((Context) nvuVar.b).getSystemService("vibrator");
                        if (systemService instanceof Vibrator) {
                            return (Vibrator) systemService;
                        }
                        return null;
                    default:
                        Object systemService2 = ((Context) nvuVar.b).getSystemService("audio");
                        if (systemService2 instanceof AudioManager) {
                            return (AudioManager) systemService2;
                        }
                        return null;
                }
            }
        });
    }

    public nvu(mne mneVar, nv20 nv20Var, knf0 knf0Var) {
        this.f24204a = (byte) 16;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = nv20Var;
        this.d = knf0Var;
    }

    public nvu(mne mneVar, afm0 afm0Var, knf0 knf0Var) {
        this.f24204a = (byte) 26;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = afm0Var;
        this.d = knf0Var;
    }

    public nvu(ony onyVar, ane0 ane0Var, vwb0 vwb0Var) {
        this.f24204a = (byte) 8;
        onyVar.getClass();
        ane0Var.getClass();
        vwb0Var.getClass();
        this.b = onyVar;
        this.c = ane0Var;
        this.d = vwb0Var;
    }

    public nvu(knf0 knf0Var, dq00 dq00Var, q8g0 q8g0Var) {
        this.f24204a = (byte) 17;
        knf0Var.getClass();
        q8g0Var.getClass();
        this.b = knf0Var;
        this.c = dq00Var;
        this.d = q8g0Var;
    }

    public nvu(mne mneVar, j910 j910Var, knf0 knf0Var) {
        this.f24204a = (byte) 13;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = j910Var;
        this.d = knf0Var;
    }

    public nvu(fuj0 fuj0Var, knf0 knf0Var, mne mneVar) {
        this.f24204a = (byte) 24;
        knf0Var.getClass();
        this.b = fuj0Var;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public nvu(ani0 ani0Var, drm0 drm0Var, btt0 btt0Var) {
        this.f24204a = (byte) 27;
        btt0Var.getClass();
        this.b = ani0Var;
        this.c = drm0Var;
        this.d = btt0Var;
    }

    public nvu(mne mneVar, nw20 nw20Var, knf0 knf0Var) {
        this.f24204a = (byte) 21;
        knf0Var.getClass();
        this.b = nw20Var;
        this.c = knf0Var;
        this.d = mneVar;
    }

    public nvu(tgk tgkVar, ani0 ani0Var, us3 us3Var, q7d0 q7d0Var, btt0 btt0Var) {
        this.f24204a = (byte) 19;
        tgkVar.getClass();
        us3Var.getClass();
        q7d0Var.getClass();
        btt0Var.getClass();
        this.b = tgkVar;
        this.c = ani0Var;
        this.d = btt0Var;
    }

    public nvu(us00 us00Var) {
        this.f24204a = (byte) 4;
        this.b = us00Var;
        this.c = roj0.b(1, 0, i99.b, 2);
    }

    public nvu(g8n0 g8n0Var, btt0 btt0Var, gii0 gii0Var) {
        this.f24204a = (byte) 22;
        g8n0Var.getClass();
        btt0Var.getClass();
        gii0Var.getClass();
        this.b = g8n0Var;
        this.c = btt0Var;
        this.d = new enj0(gii0Var, (byte) 12);
    }

    public nvu(f7u f7uVar, mzs0 mzs0Var) {
        this.f24204a = (byte) 6;
        mzs0Var.getClass();
        this.b = f7uVar;
        this.c = mzs0Var;
        this.d = new hcp0(new xi70());
    }

    public nvu(s39 s39Var) {
        this.f24204a = (byte) 12;
        this.b = s39Var;
    }

    public /* synthetic */ nvu(Object obj, Object obj2, Object obj3, byte b) {
        this.f24204a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
