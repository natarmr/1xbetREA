package a;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class kb0 extends x2t0 {
    public static final /* synthetic */ int y = 0;
    public final /* synthetic */ byte h = 0;
    public final Object i;
    public final Object j;
    public final duj k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(duj dujVar, oeg0 oeg0Var, ctf0 ctf0Var, ih5 ih5Var, l7k l7kVar, gg5 gg5Var, v88 v88Var, ih5 ih5Var2, ahu ahuVar, g2v g2vVar, b8u b8uVar, iqt iqtVar, khf0 khf0Var, trm0 trm0Var, tzi tziVar) {
        super(new q8((byte) 25));
        dujVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        l7kVar.getClass();
        gg5Var.getClass();
        v88Var.getClass();
        this.k = dujVar;
        this.i = oeg0Var;
        this.j = ctf0Var;
        this.m = ih5Var;
        this.n = l7kVar;
        this.o = gg5Var;
        this.p = v88Var;
        this.q = ih5Var2;
        this.r = ahuVar;
        this.s = g2vVar;
        this.t = b8uVar;
        this.l = iqtVar;
        this.u = khf0Var;
        this.v = trm0Var;
        this.w = tziVar;
        this.x = bm5.e;
    }

    @Override // a.j3t0
    public final /* bridge */ /* synthetic */ Object a(Object obj, bnn0 bnn0Var) {
        switch (this.h) {
            case 0:
                return o((fb0) obj, bnn0Var);
            case 1:
                return p((jk0) obj, bnn0Var);
            default:
                return q((vh5) obj, bnn0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(zje zjeVar) {
        gb0 gb0Var;
        if (zjeVar instanceof gb0) {
            gb0Var = (gb0) zjeVar;
            int i = gb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb0Var.k = i - Integer.MIN_VALUE;
            } else {
                gb0Var = new gb0(this, zjeVar);
            }
        } else {
            gb0Var = new gb0(this, zjeVar);
        }
        Object objN = gb0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gb0Var.k;
        byte b = 1;
        try {
            if (i2 == 0) {
                z1x.P(objN);
                tzi tziVar = (tzi) this.w;
                gb0Var.k = 1;
                objN = tziVar.n(gb0Var);
                if (objN == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objN);
            }
            qb0 qb0Var = (qb0) objN;
            ((trm0) this.v).l(bm5.e, qb0Var.f28422a);
            int iOrdinal = qb0Var.b.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    g(lb0.f19732a);
                } else {
                    if (iOrdinal != 2) {
                        throw new m460();
                    }
                    g(nb0.f23215a);
                }
            }
        } catch (Throwable th) {
            this.k.b(th, new g20(b));
        }
        return Unit.f46060a;
    }

    public String j(long j) {
        return ((eyg0) this.w).k(new lu0(0L, l(j), "popular_new_top", hne.r(824L, "category")));
    }

    public int k(long j) {
        uhc0 uhc0Var = ((uk0) d()).h;
        if (uhc0Var == null) {
            return 0;
        }
        if (j == uhc0Var.f35671a.d) {
            return 8191;
        }
        return j == uhc0Var.b.d ? 8190 : 0;
    }

    public Integer l(long j) {
        Iterator it = ((uk0) d()).g.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((mlr) it.next()).f22006a == j) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return kng0.e(1, numValueOf);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(zje zjeVar, String str, boolean z) {
        wh5 wh5Var;
        long jA;
        if (zjeVar instanceof wh5) {
            wh5Var = (wh5) zjeVar;
            int i = wh5Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                wh5Var.n = i - Integer.MIN_VALUE;
            } else {
                wh5Var = new wh5(this, zjeVar);
            }
        } else {
            wh5Var = new wh5(this, zjeVar);
        }
        Object objA = wh5Var.l;
        wne wneVar = wne.f39444a;
        int i2 = wh5Var.n;
        if (i2 == 0) {
            z1x.P(objA);
            jA = xru.a((xru) this.t);
            sp spVar = (sp) this.l;
            wh5Var.j = str;
            wh5Var.i = z;
            wh5Var.k = jA;
            wh5Var.n = 1;
            objA = spVar.a(jA, wh5Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j = wh5Var.k;
            boolean z2 = wh5Var.i;
            String str2 = wh5Var.j;
            z1x.P(objA);
            jA = j;
            str = str2;
            z = z2;
        }
        if (((Boolean) objA).booleanValue()) {
            l7k l7kVar = (l7k) this.n;
            if (z) {
                i8i.D("screen", "bill_management", ((ih5) this.m).f14765a, "deposit_call");
                y1p y1pVar = y1p.MAIN;
                l7kVar.b("bill_management", str);
            } else {
                i8i.D("screen", "bill_management", ((ih5) this.q).f14765a, "withdraw_call");
                y1p y1pVar2 = y1p.MAIN;
                l7kVar.c("bill_management");
            }
            ((v88) this.p).a((i1w0) this.i, z, jA);
        } else {
            g(ci5.f4395a);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r5.a((a.ql5) r6, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.xh5
            if (r0 == 0) goto L13
            r0 = r6
            a.xh5 r0 = (a.xh5) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.xh5 r0 = new a.xh5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L54
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L45
        L35:
            a.z1x.P(r6)
            java.lang.Object r6 = r5.u
            a.nou r6 = (a.nou) r6
            r0.k = r4
            java.io.Serializable r6 = a.nou.b(r6, r0)
            if (r6 != r1) goto L45
            goto L53
        L45:
            a.ql5 r6 = (a.ql5) r6
            java.lang.Object r5 = r5.v
            a.mnb r5 = (a.mnb) r5
            r0.k = r3
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L54
        L53:
            return r1
        L54:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kb0.n(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        if (w(r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (r(r11, r2, r10, r0) == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0106, code lost:
    
        if (r9 == r1) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011c, code lost:
    
        if (i(r0) == r1) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(a.fb0 r10, a.yje r11) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kb0.o(a.fb0, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:107:0x0337  */
    /* JADX WARN: Code duplicated, block: B:108:0x0342  */
    /* JADX WARN: Code duplicated, block: B:114:0x034d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0355  */
    /* JADX WARN: Code duplicated, block: B:117:0x0377  */
    /* JADX WARN: Code duplicated, block: B:119:0x0386  */
    /* JADX WARN: Code duplicated, block: B:122:0x039c  */
    /* JADX WARN: Code duplicated, block: B:129:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:131:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:132:0x0409  */
    /* JADX WARN: Code duplicated, block: B:133:0x0419  */
    /* JADX WARN: Code duplicated, block: B:135:0x041d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0433  */
    /* JADX WARN: Code duplicated, block: B:145:0x0448  */
    /* JADX WARN: Code duplicated, block: B:148:0x045b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0468 A[LOOP:10: B:146:0x0455->B:151:0x0468, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x0473  */
    /* JADX WARN: Code duplicated, block: B:158:0x0476  */
    /* JADX WARN: Code duplicated, block: B:159:0x047d  */
    /* JADX WARN: Code duplicated, block: B:161:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:163:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:164:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:166:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:167:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:169:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:170:0x051f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0523  */
    /* JADX WARN: Code duplicated, block: B:175:0x0541  */
    /* JADX WARN: Code duplicated, block: B:181:0x0559  */
    /* JADX WARN: Code duplicated, block: B:183:0x055f  */
    /* JADX WARN: Code duplicated, block: B:189:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:190:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:195:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:197:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:199:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:200:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:202:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:204:0x05df  */
    /* JADX WARN: Code duplicated, block: B:206:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:209:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:215:0x064b  */
    /* JADX WARN: Code duplicated, block: B:216:0x064e  */
    /* JADX WARN: Code duplicated, block: B:217:0x0659  */
    /* JADX WARN: Code duplicated, block: B:222:0x0662  */
    /* JADX WARN: Code duplicated, block: B:224:0x0666  */
    /* JADX WARN: Code duplicated, block: B:227:0x067c  */
    /* JADX WARN: Code duplicated, block: B:234:0x0691  */
    /* JADX WARN: Code duplicated, block: B:235:0x06be  */
    /* JADX WARN: Code duplicated, block: B:237:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:242:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:244:0x06dc  */
    /* JADX WARN: Code duplicated, block: B:249:0x0704  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    /* JADX WARN: Code duplicated, block: B:263:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:0x02e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:? A[LOOP:6: B:91:0x02d0->B:265:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x03a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:? A[LOOP:8: B:120:0x0396->B:270:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x0441 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x046b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x046c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x054e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0551 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:? A[LOOP:11: B:173:0x053b->B:278:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x068a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0122  */
    /* JADX WARN: Code duplicated, block: B:43:0x0126  */
    /* JADX WARN: Code duplicated, block: B:47:0x0152  */
    /* JADX WARN: Code duplicated, block: B:49:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x0182  */
    /* JADX WARN: Code duplicated, block: B:55:0x0186  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:71:0x01de  */
    /* JADX WARN: Code duplicated, block: B:72:0x0234  */
    /* JADX WARN: Code duplicated, block: B:74:0x023e  */
    /* JADX WARN: Code duplicated, block: B:77:0x024e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0256  */
    /* JADX WARN: Code duplicated, block: B:7:0x0041  */
    /* JADX WARN: Code duplicated, block: B:81:0x025c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0264  */
    /* JADX WARN: Code duplicated, block: B:85:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:90:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:93:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ee  */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01c7, code lost:
    
        if (r0 == r4) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(a.jk0 r48, a.yje r49) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kb0.p(a.jk0, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0297 A[LOOP:5: B:99:0x028e->B:101:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:102:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:105:0x02df A[LOOP:6: B:103:0x02d6->B:105:0x02df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:115:0x0314  */
    /* JADX WARN: Code duplicated, block: B:117:0x0319  */
    /* JADX WARN: Code duplicated, block: B:124:0x032b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0333  */
    /* JADX WARN: Code duplicated, block: B:127:0x0336  */
    /* JADX WARN: Code duplicated, block: B:129:0x033e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0341  */
    /* JADX WARN: Code duplicated, block: B:133:0x034d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0351  */
    /* JADX WARN: Code duplicated, block: B:139:0x0373 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x0375 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:141:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x0379  */
    /* JADX WARN: Code duplicated, block: B:143:0x0384  */
    /* JADX WARN: Code duplicated, block: B:146:0x0389  */
    /* JADX WARN: Code duplicated, block: B:148:0x039d  */
    /* JADX WARN: Code duplicated, block: B:149:0x03af  */
    /* JADX WARN: Code duplicated, block: B:153:0x03cb A[LOOP:8: B:151:0x03c2->B:153:0x03cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:157:0x03de  */
    /* JADX WARN: Code duplicated, block: B:158:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:163:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:164:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x02e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x03e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[LOOP:0: B:27:0x0090->B:29:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103 A[LOOP:1: B:37:0x00fa->B:39:0x0103, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x0110  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115  */
    /* JADX WARN: Code duplicated, block: B:49:0x0128  */
    /* JADX WARN: Code duplicated, block: B:51:0x012d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0140  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:63:0x0158  */
    /* JADX WARN: Code duplicated, block: B:65:0x015c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0179 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x017f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0181  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d9 A[LOOP:2: B:77:0x01d0->B:79:0x01d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0207  */
    /* JADX WARN: Code duplicated, block: B:89:0x0219  */
    /* JADX WARN: Code duplicated, block: B:93:0x0235 A[LOOP:3: B:91:0x022c->B:93:0x0235, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:94:0x023f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0273 A[LOOP:4: B:95:0x026a->B:97:0x0273, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:98:0x027d  */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02eb, code lost:
    
        if (r0 == r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03e3, code lost:
    
        if (r0 == r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
    
        if (m(r6, r1, true) == r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
    
        if (m(r6, r1, false) == r7) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0151, code lost:
    
        if (n(r6) == r7) goto L160;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(a.vh5 r17, a.zje r18) {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kb0.q(a.vh5, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object r(String str, k7k k7kVar, String str2, zje zjeVar) {
        ib0 ib0Var;
        Object value;
        Object value2;
        bm5 bm5Var = (bm5) this.x;
        if (zjeVar instanceof ib0) {
            ib0Var = (ib0) zjeVar;
            int i = ib0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ib0Var.m = i - Integer.MIN_VALUE;
            } else {
                ib0Var = new ib0(this, zjeVar);
            }
        } else {
            ib0Var = new ib0(this, zjeVar);
        }
        Object objB = ib0Var.k;
        Object obj = wne.f39444a;
        int i2 = ib0Var.m;
        ocj ocjVar = this.b;
        try {
            if (i2 == 0) {
                z1x.P(objB);
                ahu ahuVar = (ahu) this.r;
                ib0Var.i = k7kVar;
                ib0Var.j = str2;
                ib0Var.m = 1;
                objB = ahuVar.b(bm5Var, ib0Var);
                if (objB == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = ib0Var.j;
                k7kVar = ib0Var.i;
                z1x.P(objB);
            }
            ql5 ql5Var = (ql5) objB;
            ((trm0) this.v).l(bm5Var, ql5Var);
            ocjVar.getClass();
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                ((pb0) value2).getClass();
            } while (!p7m0Var.m(value2, new pb0(ql5Var)));
            u(k7kVar, str2);
        } catch (Throwable th) {
            ocjVar.getClass();
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                ((pb0) value).getClass();
            } while (!p7m0Var2.m(value, new pb0(null)));
            this.k.b(th, new g20((byte) 3));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object s(long j, zje zjeVar, String str) {
        ok0 ok0Var;
        myr0 myr0Var;
        z1s0 z1s0Var;
        if (zjeVar instanceof ok0) {
            ok0Var = (ok0) zjeVar;
            int i = ok0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ok0Var.m = i - Integer.MIN_VALUE;
            } else {
                ok0Var = new ok0(this, zjeVar);
            }
        } else {
            ok0Var = new ok0(this, zjeVar);
        }
        Object obj = ok0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = ok0Var.m;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            for (Object obj3 : ((uk0) d()).i) {
                if (((myr0) obj3).f22617a == j) {
                    obj2 = obj3;
                    break;
                }
            }
            myr0Var = (myr0) obj2;
            if (myr0Var != null) {
                long j2 = myr0Var.f22617a;
                ((qu) this.q).f29324a.a("tournament_call", xp20.f(new Pair("tournament_id", Long.valueOf(j2)), new Pair("screen", "popular_new_top")));
                ((zr1) this.r).f44833a.a(tx3.l0(new k1p[]{new i1p((byte) 2, j2), new j1p("popular_new_top", (byte) 0)}), 3095L);
                boolean z = myr0Var.d instanceof jyr0;
                if (((iqt) this.l).f15225a.a() || (z1s0Var = myr0Var.b) == z1s0.f43637a) {
                    v(j2, str);
                } else if (z1s0Var == z1s0.b && z) {
                    v(j2, str);
                } else {
                    ytt yttVar = (ytt) this.x;
                    aue0 aue0Var = aue0.d;
                    ok0Var.i = str;
                    ok0Var.j = myr0Var;
                    ok0Var.m = 1;
                    if (yttVar.a(aue0Var, ok0Var) == wneVar) {
                        return wneVar;
                    }
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        myr0Var = ok0Var.j;
        str = ok0Var.i;
        z1x.P(obj);
        ((oeg0) this.i).c().d(new on((Object) this, (Object) myr0Var, (Object) str, (byte) 3));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(zje zjeVar) {
        zh5 zh5Var;
        if (zjeVar instanceof zh5) {
            zh5Var = (zh5) zjeVar;
            int i = zh5Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zh5Var.k = i - Integer.MIN_VALUE;
            } else {
                zh5Var = new zh5(this, zjeVar);
            }
        } else {
            zh5Var = new zh5(this, zjeVar);
        }
        Object objA = zh5Var.i;
        wne wneVar = wne.f39444a;
        int i2 = zh5Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objA);
                i8i.D("point", "payment_appeal", ((ih5) this.q).f14765a, "bill_management_click");
                b1j.v("payment_appeal", ((l7k) this.n).f19563a, 12369L);
                hse0 hse0Var = (hse0) this.w;
                String strA = ((btt0) this.x).a();
                zh5Var.k = 1;
                objA = hse0.a(hse0Var, strA, false, zh5Var, 6);
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
            g(new ai5());
            return Unit.f46060a;
        } catch (Throwable th) {
            this.k.b(th, new fa2((Object) this, (byte) 17));
            return Unit.f46060a;
        }
    }

    public void u(k7k k7kVar, String str) {
        if (k7kVar != k7k.UNKNOWN) {
            ((ih5) this.m).f(k7kVar);
            ((l7k) this.n).b(k7kVar.f17825a, str);
        }
        i1w0 i1w0VarC = ((oeg0) this.i).c();
        v88 v88Var = (v88) this.p;
        ql5 ql5Var = ((pb0) d()).f26680a;
        v88Var.a(i1w0VarC, true, ql5Var != null ? ql5Var.f28916a : 0L);
    }

    public void v(long j, String str) {
        ((oeg0) this.i).c().d(new mk0(this, j, str));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object w(zje zjeVar) {
        jb0 jb0Var;
        Object value;
        Object value2;
        bm5 bm5Var = (bm5) this.x;
        if (zjeVar instanceof jb0) {
            jb0Var = (jb0) zjeVar;
            int i = jb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jb0Var.k = i - Integer.MIN_VALUE;
            } else {
                jb0Var = new jb0(this, zjeVar);
            }
        } else {
            jb0Var = new jb0(this, zjeVar);
        }
        Object objB = jb0Var.i;
        Object obj = wne.f39444a;
        int i2 = jb0Var.k;
        ocj ocjVar = this.b;
        try {
            if (i2 == 0) {
                z1x.P(objB);
                ahu ahuVar = (ahu) this.r;
                jb0Var.k = 1;
                objB = ahuVar.b(bm5Var, jb0Var);
                if (objB == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB);
            }
            ql5 ql5Var = (ql5) objB;
            ((trm0) this.v).l(bm5Var, ql5Var);
            ocjVar.getClass();
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                ((pb0) value2).getClass();
            } while (!p7m0Var.m(value2, new pb0(ql5Var)));
        } catch (Throwable th) {
            ocjVar.getClass();
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                ((pb0) value).getClass();
            } while (!p7m0Var2.m(value, new pb0(null)));
            this.k.b(th, new g20((byte) 2));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object x(mlr mlrVar, boolean z, int i, String str, boolean z2, String str2, zje zjeVar) {
        pk0 pk0Var;
        mlr mlrVar2;
        boolean z3;
        int i2;
        if (zjeVar instanceof pk0) {
            pk0Var = (pk0) zjeVar;
            int i3 = pk0Var.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pk0Var.p = i3 - Integer.MIN_VALUE;
            } else {
                pk0Var = new pk0(this, zjeVar);
            }
        } else {
            pk0Var = new pk0(this, zjeVar);
        }
        pk0 pk0Var2 = pk0Var;
        Object obj = pk0Var2.n;
        wne wneVar = wne.f39444a;
        int i4 = pk0Var2.p;
        try {
            if (i4 == 0) {
                z1x.P(obj);
                sd60 sd60Var = (sd60) this.n;
                pk0Var2.i = mlrVar;
                pk0Var2.j = str2;
                pk0Var2.k = z;
                pk0Var2.m = i;
                pk0Var2.l = z2;
                pk0Var2.p = 1;
                if (sd60Var.t(mlrVar, z, i, str, pk0Var2) == wneVar) {
                    return wneVar;
                }
                mlrVar2 = mlrVar;
                z3 = z;
                i2 = i;
            } else {
                if (i4 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = pk0Var2.l;
                i2 = pk0Var2.m;
                z3 = pk0Var2.k;
                str2 = pk0Var2.j;
                mlrVar2 = pk0Var2.i;
                z1x.P(obj);
            }
            String str3 = str2;
            if (z2) {
                long j = mlrVar2.f22006a;
                boolean z4 = !z3;
                ((u58) this.p).j(j, z4, Integer.valueOf(i2), "popular_new_top", str3);
                Integer numValueOf = Integer.valueOf(i2);
                y1p y1pVar = y1p.MAIN;
                ((ix0) this.s).h((int) j, numValueOf, "popular_new_top", str3, z4);
            }
        } catch (Throwable th) {
            if (th instanceof jfp) {
                g(sk0.f32324a);
            } else {
                this.k.b(th, new o00(this, (byte) 8));
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(i1w0 i1w0Var, zg zgVar, ih5 ih5Var, ih5 ih5Var2, l7k l7kVar, qgd qgdVar, v88 v88Var, db9 db9Var, lme0 lme0Var, xru xruVar, sp spVar, nou nouVar, mnb mnbVar, hse0 hse0Var, btt0 btt0Var, duj dujVar) {
        super(new o85((byte) 6));
        hse0Var.getClass();
        btt0Var.getClass();
        this.i = i1w0Var;
        this.j = zgVar;
        this.m = ih5Var;
        this.q = ih5Var2;
        this.n = l7kVar;
        this.o = qgdVar;
        this.p = v88Var;
        this.r = db9Var;
        this.s = lme0Var;
        this.t = xruVar;
        this.l = spVar;
        this.u = nouVar;
        this.v = mnbVar;
        this.w = hse0Var;
        this.x = btt0Var;
        this.k = dujVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(oeg0 oeg0Var, peg0 peg0Var, sd60 sd60Var, yo4 yo4Var, u58 u58Var, qu quVar, zr1 zr1Var, ix0 ix0Var, gg5 gg5Var, zg zgVar, m1e m1eVar, ctf0 ctf0Var, duj dujVar, iqt iqtVar, eyg0 eyg0Var, ytt yttVar) {
        super(new mg0((byte) 2));
        oeg0Var.getClass();
        m1eVar.getClass();
        ctf0Var.getClass();
        this.i = oeg0Var;
        this.m = peg0Var;
        this.n = sd60Var;
        this.o = yo4Var;
        this.p = u58Var;
        this.q = quVar;
        this.r = zr1Var;
        this.s = ix0Var;
        this.t = gg5Var;
        this.u = zgVar;
        this.v = m1eVar;
        this.j = ctf0Var;
        this.k = dujVar;
        this.l = iqtVar;
        this.w = eyg0Var;
        this.x = yttVar;
    }
}
