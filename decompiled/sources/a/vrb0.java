package a;

import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class vrb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final svu f37893a;
    public final Regex b = new Regex("^[A-Za-z\\d_]+$");

    public vrb0(svu svuVar) {
        this.f37893a = svuVar;
    }

    public static urp b(int i, boolean z) {
        return (z && i <= 0) ? krp.f18777a : jrp.f17014a;
    }

    public static urp c(boolean z, boolean z2) {
        return (z && !z2) ? lrp.f20544a : jrp.f17014a;
    }

    public static urp e(String str, boolean z) {
        return (z && str.length() <= 0) ? krp.f18777a : jrp.f17014a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r2.equals(android.gov.nist.core.Separators.SP) == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static a.urp f(java.lang.String r2, boolean r3) {
        /*
            if (r3 != 0) goto L3
            goto L4c
        L3:
            int r3 = r2.length()
            if (r3 != 0) goto Lc
            a.krp r2 = a.krp.f18777a
            return r2
        Lc:
            r3 = 32
            boolean r0 = kotlin.text.StringsKt.k0(r2, r3)
            if (r0 != 0) goto L1a
            boolean r3 = kotlin.text.StringsKt.R(r2, r3)
            if (r3 == 0) goto L21
        L1a:
            java.lang.CharSequence r3 = kotlin.text.StringsKt.u0(r2)
            r3.toString()
        L21:
            int r3 = r2.length()
            int r3 = r3 + (-1)
            r0 = 0
        L28:
            if (r0 >= r3) goto L44
            char r1 = r2.charAt(r0)
            boolean r1 = kotlin.text.CharsKt.d(r1)
            if (r1 == 0) goto L41
            int r1 = r0 + 1
            char r1 = r2.charAt(r1)
            boolean r1 = kotlin.text.CharsKt.d(r1)
            if (r1 == 0) goto L41
            goto L4f
        L41:
            int r0 = r0 + 1
            goto L28
        L44:
            java.lang.String r3 = " "
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4f
        L4c:
            a.jrp r2 = a.jrp.f17014a
            return r2
        L4f:
            a.qrp r2 = new a.qrp
            java.lang.String r3 = ""
            r2.<init>(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vrb0.f(java.lang.String, boolean):a.urp");
    }

    /* JADX WARN: Code duplicated, block: B:145:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:150:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:153:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:154:0x0205  */
    /* JADX WARN: Code duplicated, block: B:156:0x0209  */
    /* JADX WARN: Code duplicated, block: B:157:0x0215  */
    /* JADX WARN: Code duplicated, block: B:159:0x0219  */
    /* JADX WARN: Code duplicated, block: B:160:0x0225  */
    /* JADX WARN: Code duplicated, block: B:162:0x0229  */
    /* JADX WARN: Code duplicated, block: B:163:0x0235  */
    /* JADX WARN: Code duplicated, block: B:165:0x0239  */
    /* JADX WARN: Code duplicated, block: B:166:0x0245  */
    /* JADX WARN: Code duplicated, block: B:168:0x0249  */
    /* JADX WARN: Code duplicated, block: B:169:0x0255  */
    /* JADX WARN: Code duplicated, block: B:171:0x0259  */
    /* JADX WARN: Code duplicated, block: B:173:0x0261  */
    /* JADX WARN: Code duplicated, block: B:175:0x0267  */
    /* JADX WARN: Code duplicated, block: B:176:0x026a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:177:0x026c  */
    /* JADX WARN: Code duplicated, block: B:179:0x027c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0283  */
    /* JADX WARN: Code duplicated, block: B:182:0x0287  */
    /* JADX WARN: Code duplicated, block: B:183:0x0293  */
    /* JADX WARN: Code duplicated, block: B:185:0x0297  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:188:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:189:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:191:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:192:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:197:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:203:0x0303  */
    /* JADX WARN: Code duplicated, block: B:206:0x030b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:207:0x030d  */
    /* JADX WARN: Code duplicated, block: B:210:0x0315  */
    /* JADX WARN: Code duplicated, block: B:212:0x031b  */
    /* JADX WARN: Code duplicated, block: B:213:0x031e  */
    /* JADX WARN: Code duplicated, block: B:214:0x0320  */
    /* JADX WARN: Code duplicated, block: B:217:0x032a  */
    /* JADX WARN: Code duplicated, block: B:219:0x0330 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:220:0x0331  */
    /* JADX WARN: Code duplicated, block: B:222:0x0342  */
    /* JADX WARN: Code duplicated, block: B:224:0x0346  */
    /* JADX WARN: Code duplicated, block: B:227:0x035b  */
    /* JADX WARN: Code duplicated, block: B:229:0x0365  */
    /* JADX WARN: Code duplicated, block: B:233:0x0375  */
    /* JADX WARN: Code duplicated, block: B:234:0x0378  */
    /* JADX WARN: Code duplicated, block: B:236:0x037b  */
    /* JADX WARN: Code duplicated, block: B:238:0x037f  */
    /* JADX WARN: Code duplicated, block: B:241:0x0386 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:242:0x0388  */
    /* JADX WARN: Code duplicated, block: B:244:0x038e A[PHI: r16
  0x038e: PHI (r16v1 a.trb0) = (r16v0 a.trb0), (r16v0 a.trb0), (r16v2 a.trb0) binds: [B:278:0x03f2, B:254:0x03ad, B:243:0x038c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:247:0x0396  */
    /* JADX WARN: Code duplicated, block: B:249:0x039b  */
    /* JADX WARN: Code duplicated, block: B:251:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:253:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:263:0x03c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:272:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:273:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:275:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:277:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:282:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:285:0x0406  */
    /* JADX WARN: Code duplicated, block: B:287:0x040a  */
    /* JADX WARN: Code duplicated, block: B:288:0x0415  */
    /* JADX WARN: Code duplicated, block: B:290:0x0419  */
    /* JADX WARN: Code duplicated, block: B:291:0x0425  */
    /* JADX WARN: Code duplicated, block: B:293:0x0429  */
    /* JADX WARN: Code duplicated, block: B:294:0x0435  */
    /* JADX WARN: Code duplicated, block: B:296:0x0439  */
    /* JADX WARN: Code duplicated, block: B:297:0x0445  */
    /* JADX WARN: Code duplicated, block: B:299:0x0449  */
    /* JADX WARN: Code duplicated, block: B:300:0x0455  */
    /* JADX WARN: Code duplicated, block: B:302:0x0459  */
    /* JADX WARN: Code duplicated, block: B:303:0x0465  */
    /* JADX WARN: Code duplicated, block: B:305:0x0469  */
    /* JADX WARN: Code duplicated, block: B:306:0x0475  */
    /* JADX WARN: Code duplicated, block: B:308:0x0479  */
    /* JADX WARN: Code duplicated, block: B:309:0x0485  */
    /* JADX WARN: Code duplicated, block: B:311:0x0489  */
    /* JADX WARN: Code duplicated, block: B:312:0x0495  */
    /* JADX WARN: Code duplicated, block: B:314:0x0499  */
    /* JADX WARN: Code duplicated, block: B:316:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:319:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:320:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:322:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:323:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:325:0x04be  */
    /* JADX WARN: Code duplicated, block: B:326:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:328:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:331:0x04d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:368:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:150:0x01eb -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:153:0x01fb -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x0209 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x0219 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x0229 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:165:0x0239 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x0249 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x0267 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x027a -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:179:0x027c -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:182:0x0287 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:185:0x0297 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x02a7 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:191:0x02b7 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:220:0x0331 -> B:221:0x0337). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:248:0x0397 -> B:334:0x04e0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r20, java.util.List r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 1335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vrb0.a(java.util.List, java.util.List, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(s1q s1qVar, zje zjeVar) throws Throwable {
        urb0 urb0Var;
        Object g0g0Var;
        if (zjeVar instanceof urb0) {
            urb0Var = (urb0) zjeVar;
            int i = urb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                urb0Var.k = i - Integer.MIN_VALUE;
            } else {
                urb0Var = new urb0(this, zjeVar);
            }
        } else {
            urb0Var = new urb0(this, zjeVar);
        }
        Object objA = urb0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = urb0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                e0g0 e0g0Var = j0g0.b;
                svu svuVar = this.f37893a;
                String str = s1qVar.b;
                urb0Var.k = 1;
                objA = ((d4c) svuVar.f32888a).a(jCurrentTimeMillis, urb0Var, wxs0.g(jCurrentTimeMillis, str));
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
            g0g0Var = (Boolean) objA;
            g0g0Var.getClass();
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return ((Boolean) g0g0Var).booleanValue() ? jrp.f17014a : new mrp("");
        }
        if (!(thA instanceof t3c)) {
            throw thA;
        }
        String str2 = ((t3c) thA).f33259a;
        return new mrp(str2 != null ? str2 : "");
    }
}
