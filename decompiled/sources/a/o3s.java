package a;

import android.view.textclassifier.TextClassifier;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xplatform.bet_constructor.impl.makebet.domain.model.StepInputConfigModel;

/* JADX INFO: loaded from: classes5.dex */
public final class o3s extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public Object j;
    public Object k;
    public byte l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3s(Object obj, Object obj2, Object obj3, Object obj4, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
        this.m = obj3;
        this.n = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r1.a(r3, r6) == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r7) {
        /*
            r6 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r6.l
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L27
            if (r1 == r3) goto L17
            if (r1 != r2) goto L11
            a.z1x.P(r7)
            goto L66
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r4
        L17:
            java.lang.Object r1 = r6.k
            a.kmq r1 = (a.kmq) r1
            java.lang.Object r3 = r6.j
            a.k050 r3 = (a.k050) r3
            java.lang.Object r5 = r6.m
            a.ri80 r5 = (a.ri80) r5
            a.z1x.P(r7)
            goto L47
        L27:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.m
            r1 = r7
            a.kmq r1 = (a.kmq) r1
            java.lang.Object r7 = r6.n
            a.qi80 r7 = (a.qi80) r7
            a.ri80 r5 = r7.j
            a.k050 r7 = r5.f30529a
            r6.m = r5
            r6.j = r7
            r6.k = r1
            r6.l = r3
            java.lang.Object r3 = r7.d(r6)
            if (r3 != r0) goto L46
            goto L65
        L46:
            r3 = r7
        L47:
            a.ti80 r7 = r5.b     // Catch: java.lang.Throwable -> L69
            a.cyu r7 = r7.i     // Catch: java.lang.Throwable -> L69
            a.dp00 r7 = r7.P()     // Catch: java.lang.Throwable -> L69
            r3.c(r4)
            a.sh80 r3 = new a.sh80
            r3.<init>(r7, r4)
            r6.m = r4
            r6.j = r4
            r6.k = r4
            r6.l = r2
            java.lang.Object r6 = r1.a(r3, r6)
            if (r6 != r0) goto L66
        L65:
            return r0
        L66:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L69:
            r6 = move-exception
            r3.c(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o3s.G(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.vpc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [a.bby] */
    /* JADX WARN: Type inference failed for: r1v5, types: [a.bby] */
    private final Object H(Object obj) {
        Object objR;
        ?? r1 = (vpc) this.n;
        g45 g45Var = r1.f37798a;
        vne vneVar = (vne) this.m;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        yje yjeVar = null;
        try {
            if (b == 0) {
                z1x.P(obj);
                c4m0 c4m0VarW = qjj.W(vneVar, null, null, new e3p(r1, yjeVar, (byte) 27), 3);
                this.m = null;
                this.j = c4m0VarW;
                this.l = (byte) 1;
                objR = g45Var.r(Integer.MAX_VALUE, -60, 60, this);
                r1 = c4m0VarW;
                if (objR == wneVar) {
                }
            }
            if (b != 1) {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list = (List) this.k;
                z1x.P(obj);
                return list;
            }
            c4m0 c4m0Var = (c4m0) this.j;
            z1x.P(obj);
            objR = obj;
            r1 = c4m0Var;
            List list2 = (List) objR;
            r1.cancel(null);
            gxb gxbVar = (gxb) ((i7e) g45Var.c).i.getValue();
            a640 a640Var = (a640) CollectionsKt.f0(list2);
            if (a640Var != null && a640Var.b() > gxbVar.j.f38222a) {
                g45Var.j0(gxb.a(gxbVar, false, 0, 0, null, false, null, new vxy(a640Var.b(), a640Var.e() instanceof srt0), 511));
            }
            this.m = null;
            this.j = null;
            this.k = list2;
            this.l = (byte) 2;
            return g45Var.l0(list2) == wneVar ? wneVar : list2;
        } catch (Throwable th) {
            r1.cancel(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0072, code lost:
    
        if (r0.f(r12, r14) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object I(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.k
            a.t33 r0 = (a.t33) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r14.l
            r3 = 0
            r4 = 3
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L29
            if (r2 == r5) goto L25
            if (r2 == r6) goto L20
            if (r2 != r4) goto L19
            a.z1x.P(r15)
            r12 = r14
            goto L75
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r14)
            r14 = 0
            return r14
        L20:
            a.z1x.P(r15)
            r12 = r14
            goto L67
        L25:
            a.z1x.P(r15)
            goto L42
        L29:
            a.z1x.P(r15)
            java.lang.Object r15 = r14.j
            a.du90 r15 = (a.du90) r15
            boolean r15 = r15.c
            if (r15 == 0) goto L7c
            java.lang.Float r15 = new java.lang.Float
            r15.<init>(r3)
            r14.l = r5
            java.lang.Object r15 = r0.f(r14, r15)
            if (r15 != r1) goto L42
            goto L74
        L42:
            java.lang.Object r15 = r14.k
            r7 = r15
            a.t33 r7 = (a.t33) r7
            java.lang.Float r8 = new java.lang.Float
            r15 = 1101004800(0x41a00000, float:20.0)
            r8.<init>(r15)
            java.lang.Object r15 = r14.m
            a.ghn r15 = (a.ghn) r15
            r2 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            a.uts0 r9 = a.ro4.m0(r2, r5, r15, r6)
            r14.l = r6
            r10 = 0
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r14 = a.t33.a(r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r1) goto L67
            goto L74
        L67:
            java.lang.Float r14 = new java.lang.Float
            r14.<init>(r3)
            r12.l = r4
            java.lang.Object r14 = r0.f(r12, r14)
            if (r14 != r1) goto L75
        L74:
            return r1
        L75:
            java.lang.Object r14 = r12.n
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            r14.invoke()
        L7c:
            kotlin.Unit r14 = kotlin.Unit.f46060a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o3s.I(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[RETURN] */
    private final Object J(Object obj) throws Throwable {
        lw90 lw90Var;
        i050 i050Var;
        i050 i050Var2;
        TextClassifier textClassifierG;
        Object objU;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        yje yjeVar = null;
        try {
            if (b == 0) {
                z1x.P(obj);
                lw90Var = (lw90) this.m;
                i050Var = lw90Var.e;
                this.j = i050Var;
                this.k = lw90Var;
                this.l = (byte) 1;
                if (i050Var.d(this) != wneVar) {
                }
                return wneVar;
            }
            if (b != 1) {
                if (b != 2) {
                    if (b == 3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i050Var2 = (i050) this.j;
                try {
                    z1x.P(obj);
                    textClassifierG = jw90.g(obj);
                    i050Var = i050Var2;
                    i050Var.c(null);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(200L, bfn.MILLISECONDS);
                    o690 o690Var = new o690((Object) textClassifierG, this.n, yjeVar, (byte) 6);
                    this.j = null;
                    this.k = null;
                    this.l = (byte) 3;
                    objU = msm0.u(qcc.g0(jW0), o690Var, this);
                    if (objU == wneVar) {
                        return wneVar;
                    }
                    return objU;
                } catch (Throwable th) {
                    th = th;
                    i050Var2.c(null);
                    throw th;
                }
            }
            lw90Var = (lw90) this.k;
            i050 i050Var3 = (i050) this.j;
            z1x.P(obj);
            i050Var = i050Var3;
            textClassifierG = lw90Var.f;
            if (textClassifierG == null || textClassifierG.isDestroyed()) {
                uen uenVar2 = wen.b;
                long jW1 = ibc.w0(300L, bfn.MILLISECONDS);
                z210 z210Var = new z210(lw90Var, yjeVar, (byte) 28);
                this.j = i050Var;
                this.k = null;
                this.l = (byte) 2;
                Object objU2 = msm0.u(qcc.g0(jW1), z210Var, this);
                if (objU2 != wneVar) {
                    i050Var2 = i050Var;
                    obj = objU2;
                    textClassifierG = jw90.g(obj);
                    i050Var = i050Var2;
                    i050Var.c(null);
                    uen uenVar3 = wen.b;
                    long jW2 = ibc.w0(200L, bfn.MILLISECONDS);
                    o690 o690Var2 = new o690((Object) textClassifierG, this.n, yjeVar, (byte) 6);
                    this.j = null;
                    this.k = null;
                    this.l = (byte) 3;
                    objU = msm0.u(qcc.g0(jW2), o690Var2, this);
                    if (objU == wneVar) {
                        return objU;
                    }
                }
            } else {
                i050Var.c(null);
                uen uenVar4 = wen.b;
                long jW3 = ibc.w0(200L, bfn.MILLISECONDS);
                o690 o690Var3 = new o690((Object) textClassifierG, this.n, yjeVar, (byte) 6);
                this.j = null;
                this.k = null;
                this.l = (byte) 3;
                objU = msm0.u(qcc.g0(jW3), o690Var3, this);
                if (objU == wneVar) {
                    return objU;
                }
            }
            return wneVar;
        } catch (Throwable th2) {
            th = th2;
            i050Var2 = i050Var;
            i050Var2.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0091, code lost:
    
        if (r1 == r10) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o3s.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r12 == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r0.R(r1, r11) == r2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.n
            a.qg20 r0 = (a.qg20) r0
            java.lang.Object r1 = r11.m
            a.ql5 r1 = (a.ql5) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r11.l
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r3 == 0) goto L33
            if (r3 == r6) goto L27
            if (r3 == r5) goto L23
            if (r3 != r4) goto L1d
            a.z1x.P(r12)
            goto La8
        L1d:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r7
        L23:
            a.z1x.P(r12)
            goto L69
        L27:
            java.lang.Object r3 = r11.k
            a.bm5 r3 = (a.bm5) r3
            java.lang.Object r6 = r11.j
            a.bsu r6 = (a.bsu) r6
            a.z1x.P(r12)
            goto L58
        L33:
            a.z1x.P(r12)
            boolean r12 = r1.l
            if (r12 != 0) goto L9d
            a.txs0 r12 = r1.i
            a.txs0 r3 = a.txs0.e
            if (r12 != r3) goto L9d
            a.bsu r12 = r0.o0
            a.bm5 r3 = a.bm5.i
            a.urt r8 = r0.p0
            r11.m = r1
            r11.j = r12
            r11.k = r3
            r11.l = r6
            java.lang.Object r6 = a.urt.a(r8, r11)
            if (r6 != r2) goto L55
            goto La7
        L55:
            r10 = r6
            r6 = r12
            r12 = r10
        L58:
            java.util.List r12 = (java.util.List) r12
            r11.m = r1
            r11.j = r7
            r11.k = r7
            r11.l = r5
            java.util.ArrayList r12 = a.bsu.b(r6, r3, r12, r11)
            if (r12 != r2) goto L69
            goto La7
        L69:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r12 = r12.iterator()
        L6f:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L97
            java.lang.Object r3 = r12.next()
            a.ql5 r3 = (a.ql5) r3
            a.txs0 r5 = r3.i
            boolean r5 = r5.e()
            if (r5 == 0) goto L6f
            a.ot r12 = r0.v0
            a.bm5 r5 = a.bm5.i
            r12.a(r5, r3)
            a.jyg0 r12 = r0.w0
            long r8 = r1.f28916a
            r12.getClass()
            a.rrd r12 = r12.f17359a
            r12.z(r5, r8)
            goto L9d
        L97:
            java.lang.String r11 = "Collection contains no element matching the predicate."
            a.v4i0.o(r11)
            return r7
        L9d:
            r11.m = r7
            r11.l = r4
            java.lang.Object r11 = r0.R(r1, r11)
            if (r11 != r2) goto La8
        La7:
            return r2
        La8:
            kotlin.Unit r11 = kotlin.Unit.f46060a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o3s.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0416  */
    /* JADX WARN: Code duplicated, block: B:123:0x0420  */
    /* JADX WARN: Code duplicated, block: B:125:0x0424  */
    /* JADX WARN: Code duplicated, block: B:127:0x0428  */
    /* JADX WARN: Code duplicated, block: B:128:0x042b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0436  */
    /* JADX WARN: Code duplicated, block: B:136:0x04c7 A[LOOP:12: B:134:0x04c3->B:136:0x04c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:143:0x0504  */
    /* JADX WARN: Code duplicated, block: B:145:0x050e  */
    /* JADX WARN: Code duplicated, block: B:148:0x0514  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d A[PHI: r1 r3 r4 r5 r6 r7
  0x004d: PHI (r1v2 a.tn30) = (r1v16 a.tn30), (r1v1 a.tn30) binds: [B:12:0x0049, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r3v3 java.lang.Object) = (r3v117 java.lang.Object), (r3v120 java.lang.Object) binds: [B:12:0x0049, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r4v1 java.lang.Object) = (r4v211 java.lang.Object), (r4v0 java.lang.Object) binds: [B:12:0x0049, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r5v1 char) = (r5v172 char), (r5v0 char) binds: [B:12:0x0049, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r6v1 byte) = (r6v108 byte), (r6v0 byte) binds: [B:12:0x0049, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r7v1 a.j99) = (r7v2 a.j99), (r7v4 a.j99) binds: [B:12:0x0049, B:9:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x0518  */
    /* JADX WARN: Code duplicated, block: B:152:0x0521  */
    /* JADX WARN: Code duplicated, block: B:153:0x0523  */
    /* JADX WARN: Code duplicated, block: B:157:0x052b A[LOOP:15: B:155:0x0527->B:157:0x052b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x0543  */
    /* JADX WARN: Code duplicated, block: B:164:0x054f A[LOOP:17: B:162:0x054b->B:164:0x054f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:166:0x0563  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055  */
    /* JADX WARN: Code duplicated, block: B:171:0x057b A[LOOP:18: B:169:0x0577->B:171:0x057b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x0590  */
    /* JADX WARN: Code duplicated, block: B:175:0x0595 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0597  */
    /* JADX WARN: Code duplicated, block: B:177:0x059b  */
    /* JADX WARN: Code duplicated, block: B:179:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:181:0x05b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:186:0x05c2 A[LOOP:35: B:178:0x05ab->B:186:0x05c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:191:0x05d7 A[LOOP:19: B:189:0x05d3->B:191:0x05d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x0607  */
    /* JADX WARN: Code duplicated, block: B:197:0x0659  */
    /* JADX WARN: Code duplicated, block: B:198:0x065c  */
    /* JADX WARN: Code duplicated, block: B:200:0x0660  */
    /* JADX WARN: Code duplicated, block: B:201:0x0663  */
    /* JADX WARN: Code duplicated, block: B:206:0x0679 A[LOOP:21: B:204:0x0675->B:206:0x0679, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x0692 A[LOOP:22: B:208:0x0690->B:209:0x0692, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:213:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:217:0x06ae A[LOOP:23: B:215:0x06aa->B:217:0x06ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    /* JADX WARN: Code duplicated, block: B:220:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:223:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:224:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:228:0x06d7 A[LOOP:24: B:226:0x06d3->B:228:0x06d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:232:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:234:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:236:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:237:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:239:0x06f9  */
    /* JADX WARN: Code duplicated, block: B:244:0x0708 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x070a  */
    /* JADX WARN: Code duplicated, block: B:248:0x0710  */
    /* JADX WARN: Code duplicated, block: B:24:0x008a  */
    /* JADX WARN: Code duplicated, block: B:252:0x0724  */
    /* JADX WARN: Code duplicated, block: B:253:0x0729  */
    /* JADX WARN: Code duplicated, block: B:255:0x072d  */
    /* JADX WARN: Code duplicated, block: B:256:0x0732  */
    /* JADX WARN: Code duplicated, block: B:258:0x0737  */
    /* JADX WARN: Code duplicated, block: B:259:0x073f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0747  */
    /* JADX WARN: Code duplicated, block: B:264:0x074c A[LOOP:34: B:264:0x074c->B:266:0x074f, LOOP_START, PHI: r4 r5
  0x074c: PHI (r4v94 short) = (r4v93 short), (r4v96 short) binds: [B:261:0x0745, B:266:0x074f] A[DONT_GENERATE, DONT_INLINE]
  0x074c: PHI (r5v86 short) = (r5v85 short), (r5v91 short) binds: [B:261:0x0745, B:266:0x074f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:266:0x074f A[LOOP:34: B:264:0x074c->B:266:0x074f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:271:0x076e  */
    /* JADX WARN: Code duplicated, block: B:273:0x0778 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x077f  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8 A[LOOP:0: B:25:0x00a4->B:27:0x00a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x079f  */
    /* JADX WARN: Code duplicated, block: B:281:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:283:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:286:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:287:0x07af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:288:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:289:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:292:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:293:0x07bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:296:0x07c4  */
    /* JADX WARN: Code duplicated, block: B:299:0x07c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:303:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:304:0x07d4 A[PHI: r4
  0x07d4: PHI (r4v103 int) = (r4v102 int), (r4v109 int) binds: [B:295:0x07c2, B:302:0x07cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:309:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:311:0x07f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:313:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:315:0x080b  */
    /* JADX WARN: Code duplicated, block: B:316:0x080f  */
    /* JADX WARN: Code duplicated, block: B:318:0x0813  */
    /* JADX WARN: Code duplicated, block: B:319:0x0815  */
    /* JADX WARN: Code duplicated, block: B:322:0x081c A[PHI: r4
  0x081c: PHI (r4v148 short) = (r4v135 short), (r4v136 short) binds: [B:321:0x081a, B:325:0x0822] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:324:0x0820  */
    /* JADX WARN: Code duplicated, block: B:327:0x0825  */
    /* JADX WARN: Code duplicated, block: B:329:0x0829 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0103  */
    /* JADX WARN: Code duplicated, block: B:330:0x082b  */
    /* JADX WARN: Code duplicated, block: B:331:0x082e  */
    /* JADX WARN: Code duplicated, block: B:332:0x0830  */
    /* JADX WARN: Code duplicated, block: B:335:0x0835 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:336:0x0837  */
    /* JADX WARN: Code duplicated, block: B:338:0x083c  */
    /* JADX WARN: Code duplicated, block: B:342:0x0850  */
    /* JADX WARN: Code duplicated, block: B:344:0x0853  */
    /* JADX WARN: Code duplicated, block: B:346:0x0856  */
    /* JADX WARN: Code duplicated, block: B:348:0x0859  */
    /* JADX WARN: Code duplicated, block: B:350:0x085f  */
    /* JADX WARN: Code duplicated, block: B:354:0x087c A[LOOP:30: B:351:0x0868->B:354:0x087c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:355:0x0881  */
    /* JADX WARN: Code duplicated, block: B:359:0x089f A[LOOP:31: B:356:0x0886->B:359:0x089f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0109  */
    /* JADX WARN: Code duplicated, block: B:360:0x08a1  */
    /* JADX WARN: Code duplicated, block: B:364:0x08bf A[LOOP:32: B:361:0x08a6->B:364:0x08bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:365:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x010c  */
    /* JADX WARN: Code duplicated, block: B:370:0x08e6 A[LOOP:29: B:369:0x08e4->B:370:0x08e6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:372:0x0912 A[LOOP:33: B:366:0x08c7->B:372:0x0912, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:375:0x091d A[LOOP:36: B:374:0x091b->B:375:0x091d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:378:0x0997 A[LOOP:37: B:377:0x0995->B:378:0x0997, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:379:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:383:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:385:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:387:0x0aa9  */
    /* JADX WARN: Code duplicated, block: B:390:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:395:0x0ad5  */
    /* JADX WARN: Code duplicated, block: B:397:0x0adc  */
    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0b7e  */
    /* JADX WARN: Code duplicated, block: B:403:0x0b89  */
    /* JADX WARN: Code duplicated, block: B:404:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:410:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:422:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x050f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0566 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:445:0x06fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0716 A[EDGE_INSN: B:446:0x0716->B:250:0x0716 BREAK  A[LOOP:26: B:242:0x0703->B:249:0x0713], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0713 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x085b A[EDGE_INSN: B:455:0x085b->B:349:0x085b BREAK  A[LOOP:30: B:351:0x0868->B:354:0x087c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x085b A[EDGE_INSN: B:456:0x085b->B:349:0x085b BREAK  A[LOOP:31: B:356:0x0886->B:359:0x089f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x085b A[EDGE_INSN: B:457:0x085b->B:349:0x085b BREAK  A[LOOP:32: B:361:0x08a6->B:364:0x08bf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:458:0x08df A[EDGE_INSN: B:458:0x08df->B:368:0x08df BREAK  A[LOOP:33: B:366:0x08c7->B:372:0x0912], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:460:0x05c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:0x05be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x040b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x0aaf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c A[LOOP:2: B:49:0x012a->B:50:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x013b  */
    /* JADX WARN: Code duplicated, block: B:53:0x013f A[LOOP:3: B:52:0x013d->B:53:0x013f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:56:0x014e A[LOOP:4: B:55:0x014c->B:56:0x014e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d A[LOOP:5: B:58:0x015b->B:59:0x015d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x0170 A[LOOP:6: B:61:0x016c->B:63:0x0170, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x029a A[LOOP:7: B:65:0x0298->B:66:0x029a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0314 A[LOOP:8: B:68:0x0310->B:70:0x0314, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:72:0x0321  */
    /* JADX WARN: Code duplicated, block: B:74:0x0325 A[LOOP:9: B:73:0x0323->B:74:0x0325, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0332  */
    /* JADX WARN: Code duplicated, block: B:79:0x0338 A[LOOP:10: B:78:0x0336->B:79:0x0338, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0345  */
    /* JADX WARN: Code duplicated, block: B:83:0x0357 A[LOOP:38: B:82:0x0355->B:83:0x0357, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:86:0x0374  */
    /* JADX WARN: Code duplicated, block: B:90:0x0382 A[LOOP:42: B:88:0x037e->B:90:0x0382, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:92:0x038c  */
    /* JADX WARN: Code duplicated, block: B:93:0x038e A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:398:0x0b72 -> B:400:0x0b75). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:140:0x04f2
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object o(java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 2963
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o3s.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[PHI: r5 r6
  0x0056: PHI (r5v1 java.lang.Object) = (r5v13 java.lang.Object), (r5v16 java.lang.Object) binds: [B:16:0x0052, B:11:0x002d] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r6v1 byte) = (r6v13 byte), (r6v0 byte) binds: [B:16:0x0052, B:11:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0058 -> B:56:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005d -> B:56:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00c5 -> B:56:0x00de). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00d0 -> B:55:0x00d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private final java.lang.Object r(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o3s.r(java.lang.Object):java.lang.Object");
    }

    private final Object s(Object obj) throws Throwable {
        i050 i050Var;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        if (b == 0) {
            z1x.P(obj);
            d5c.L((vne) this.k);
            k050 k050Var = (k050) ((vqc) this.m).b;
            wdr wdrVar = (Function2) this.n;
            this.k = k050Var;
            this.j = (bnn0) wdrVar;
            this.l = (byte) 1;
            o050.R(k050Var, this);
            return wneVar;
        }
        if (b != 1) {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i050Var = (i050) this.k;
            try {
                z1x.P(obj);
                i050Var.c(null);
                return Unit.f46060a;
            } catch (Throwable th) {
                th = th;
                i050Var.c(null);
                throw th;
            }
        }
        Function2 function2 = (Function2) ((bnn0) this.j);
        i050 i050Var2 = (i050) this.k;
        z1x.P(obj);
        try {
            this.k = i050Var2;
            this.j = null;
            this.l = (byte) 2;
            if (d5c.J(this, function2) == wneVar) {
                return wneVar;
            }
            i050Var = i050Var2;
            i050Var.c(null);
            return Unit.f46060a;
        } catch (Throwable th2) {
            th = th2;
            i050Var = i050Var2;
            i050Var.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    private final Object t(Object obj) {
        Object next;
        lr5 lr5Var;
        lr5 lr5Var2;
        Long l;
        ha8 ha8Var;
        p850 p850Var = (p850) this.m;
        vne vneVar = (vne) this.k;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        Long l2 = null;
        if (b == 0) {
            z1x.P(obj);
            gmq gmqVarA = p850Var.u.a(nw80.B.getId());
            this.k = vneVar;
            this.l = (byte) 1;
            obj = ntb.K(gmqVarA, this);
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lr5Var2 = (lr5) this.j;
            z1x.P(obj);
        }
        l2 = (Long) obj;
        lr5Var = lr5Var2;
        l = l2;
        ha8Var = (ha8) this.n;
        if (l != null) {
            sac.Y(vneVar, 15L, p850Var.p.b, null, new wmq((Object) p850Var, (Object) l, (Object) ha8Var, (Object) lr5Var, (yje) null, (byte) 10), 8);
        } else {
            l750 l750Var = new l750(ha8Var.getKey(), ha8Var, (byte) 4);
            int i = p850.p0;
            p850Var.H(l750Var);
        }
        return Unit.f46060a;
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(hew0.V((kr5) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (StringsKt.W(((lr5) next).h));
        lr5 lr5Var3 = (lr5) next;
        if (lr5Var3 != null) {
            bwl bwlVar = p850Var.H;
            this.k = vneVar;
            this.j = lr5Var3;
            this.l = (byte) 2;
            Serializable serializableF = bwlVar.f("EUR", this);
            if (serializableF != wneVar) {
                lr5Var2 = lr5Var3;
                obj = serializableF;
                l2 = (Long) obj;
                lr5Var = lr5Var2;
            }
            return wneVar;
        }
        lr5Var = lr5Var3;
        l = l2;
        ha8Var = (ha8) this.n;
        if (l != null) {
            sac.Y(vneVar, 15L, p850Var.p.b, null, new wmq((Object) p850Var, (Object) l, (Object) ha8Var, (Object) lr5Var, (yje) null, (byte) 10), 8);
        } else {
            l750 l750Var2 = new l750(ha8Var.getKey(), ha8Var, (byte) 4);
            int i2 = p850.p0;
            p850Var.H(l750Var2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
    
        if (r14 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d4, code lost:
    
        if (a.hhm0.n(r8, r9, r10, r11, r14, 4) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object x(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o3s.x(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ba  */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o3s.y(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new o3s((i3t0) obj2, (g4z) this.m, yjeVar, (byte) 0);
            case 1:
                return new o3s((i3t0) obj2, (g4z) this.m, yjeVar, (byte) 1);
            case 2:
                return new o3s((i3t0) obj2, (g4z) this.m, yjeVar, (byte) 2);
            case 3:
                o3s o3sVar = new o3s(this.m, obj2, yjeVar, (byte) 3);
                o3sVar.k = obj;
                return o3sVar;
            case 4:
                o3s o3sVar2 = new o3s(this.m, obj2, yjeVar, (byte) 4);
                o3sVar2.k = obj;
                return o3sVar2;
            case 5:
                o3s o3sVar3 = new o3s(this.m, obj2, yjeVar, (byte) 5);
                o3sVar3.k = obj;
                return o3sVar3;
            case 6:
                o3s o3sVar4 = new o3s((uii) obj2, yjeVar, (byte) 6);
                o3sVar4.m = obj;
                return o3sVar4;
            case 7:
                o3s o3sVar5 = new o3s(this.m, obj2, yjeVar, (byte) 7);
                o3sVar5.k = obj;
                return o3sVar5;
            case 8:
                o3s o3sVar6 = new o3s(this.m, obj2, yjeVar, (byte) 8);
                o3sVar6.k = obj;
                return o3sVar6;
            case 9:
                return new o3s(this.m, obj2, yjeVar, (byte) 9);
            case 10:
                o3s o3sVar7 = new o3s(this.m, obj2, yjeVar, (byte) 10);
                o3sVar7.k = obj;
                return o3sVar7;
            case 11:
                o3s o3sVar8 = new o3s((nc0) obj2, yjeVar, (byte) 11);
                o3sVar8.m = obj;
                return o3sVar8;
            case 12:
                return new o3s((naw) this.k, (n3w) this.m, (String) obj2, yjeVar, (byte) 12);
            case 13:
                o3s o3sVar9 = new o3s(this.m, obj2, yjeVar, (byte) 13);
                o3sVar9.k = obj;
                return o3sVar9;
            case 14:
                o3s o3sVar10 = new o3s(this.m, obj2, yjeVar, (byte) 14);
                o3sVar10.k = obj;
                return o3sVar10;
            case 15:
                return new o3s((x920) this.j, (oa20) this.k, (q4f) this.m, (kuw) obj2, yjeVar, (byte) 15);
            case 16:
                return new o3s((rg20) this.k, (StepInputConfigModel) this.m, (jg7) obj2, yjeVar, (byte) 16);
            case 17:
                o3s o3sVar11 = new o3s((qg20) obj2, yjeVar, (byte) 17);
                o3sVar11.m = obj;
                return o3sVar11;
            case 18:
                o3s o3sVar12 = new o3s((on20) obj2, yjeVar, (byte) 18);
                o3sVar12.m = obj;
                return o3sVar12;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new o3s((q99) this.k, (tn30) this.m, (q99) obj2, yjeVar, (byte) 19);
            case 20:
                o3s o3sVar13 = new o3s((tn30) this.k, (tyc) this.m, (lie0) obj2, yjeVar, (byte) 20);
                o3sVar13.j = obj;
                return o3sVar13;
            case 21:
                o3s o3sVar14 = new o3s(this.m, obj2, yjeVar, (byte) 21);
                o3sVar14.k = obj;
                return o3sVar14;
            case 22:
                o3s o3sVar15 = new o3s(this.m, obj2, yjeVar, (byte) 22);
                o3sVar15.k = obj;
                return o3sVar15;
            case 23:
                o3s o3sVar16 = new o3s((pvh0) this.k, (y1h0) this.m, (oms0) obj2, yjeVar, (byte) 23);
                o3sVar16.j = obj;
                return o3sVar16;
            case 24:
                o3s o3sVar17 = new o3s((qi80) obj2, yjeVar, (byte) 24);
                o3sVar17.m = obj;
                return o3sVar17;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                o3s o3sVar18 = new o3s((qi80) obj2, yjeVar, (byte) 25);
                o3sVar18.m = obj;
                return o3sVar18;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                o3s o3sVar19 = new o3s((vpc) obj2, yjeVar, (byte) 26);
                o3sVar19.m = obj;
                return o3sVar19;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new o3s((du90) this.j, (t33) this.k, (ghn) this.m, (Function0) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new o3s(this.m, obj2, yjeVar, (byte) 28);
            default:
                return new o3s((kgb0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((o3s) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 14:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((o3s) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((o3s) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((o3s) create((yyj0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((o3s) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((o3s) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0412 A[PHI: r14 r15
  0x0412: PHI (r14v3 a.jie0) = (r14v1 a.jie0), (r14v2 a.jie0), (r14v2 a.jie0), (r14v5 a.jie0) binds: [B:176:0x0400, B:181:0x0433, B:183:0x044d, B:173:0x03e0] A[DONT_GENERATE, DONT_INLINE]
  0x0412: PHI (r15v6 a.vne) = (r15v4 a.vne), (r15v5 a.vne), (r15v5 a.vne), (r15v8 a.vne) binds: [B:176:0x0400, B:181:0x0433, B:183:0x044d, B:173:0x03e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:180:0x042e A[PHI: r14 r15
  0x042e: PHI (r14v2 a.jie0) = (r14v3 a.jie0), (r14v4 a.jie0) binds: [B:178:0x042b, B:175:0x03f2] A[DONT_GENERATE, DONT_INLINE]
  0x042e: PHI (r15v5 a.vne) = (r15v6 a.vne), (r15v7 a.vne) binds: [B:178:0x042b, B:175:0x03f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:182:0x0435  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:181:0x0433 -> B:177:0x0412). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x044d -> B:177:0x0412). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r40) {
        /*
            Method dump skipped, instruction units count: 3116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o3s.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3s(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3s(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3s(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3s(i3t0 i3t0Var, g4z g4zVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.n = i3t0Var;
        this.m = g4zVar;
    }
}
