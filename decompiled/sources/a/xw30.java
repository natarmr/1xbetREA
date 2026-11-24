package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class xw30 extends x2t0 {
    public final q37 A;
    public final pru h;
    public final ctf0 i;
    public final npc j;
    public final jtj k;
    public final o470 l;
    public final khf0 m;
    public final ot n;
    public final chf0 o;
    public final znt p;
    public final gbi q;
    public final ouu r;
    public final o470 s;
    public final b8u t;
    public final iqi u;
    public final r9u v;
    public final nj7 w;
    public final ryu x;
    public final i1w0 y;
    public final z7u z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw30(pru pruVar, ctf0 ctf0Var, npc npcVar, jtj jtjVar, o470 o470Var, khf0 khf0Var, ot otVar, chf0 chf0Var, znt zntVar, gbi gbiVar, ouu ouuVar, o470 o470Var2, b8u b8uVar, iqi iqiVar, r9u r9uVar, nj7 nj7Var, ryu ryuVar, ntu ntuVar, i1w0 i1w0Var, z7u z7uVar, yiu yiuVar, q37 q37Var) {
        super(new mr0(pruVar, r9uVar, ntuVar, yiuVar, (byte) 20));
        ctf0Var.getClass();
        r9uVar.getClass();
        this.h = pruVar;
        this.i = ctf0Var;
        this.j = npcVar;
        this.k = jtjVar;
        this.l = o470Var;
        this.m = khf0Var;
        this.n = otVar;
        this.o = chf0Var;
        this.p = zntVar;
        this.q = gbiVar;
        this.r = ouuVar;
        this.s = o470Var2;
        this.t = b8uVar;
        this.u = iqiVar;
        this.v = r9uVar;
        this.w = nj7Var;
        this.x = ryuVar;
        this.y = i1w0Var;
        this.z = z7uVar;
        this.A = q37Var;
    }

    public final n3w i(String str) {
        String str2;
        a5w a5wVar = ((lx30) d()).c;
        if (a5wVar != null) {
            boolean z = a5wVar instanceof vw4;
            pru pruVar = this.h;
            if (z) {
                vw4 vw4Var = (vw4) a5wVar;
                HistoryTypeModel historyTypeModel = HistoryTypeModel.EVENTS;
                ql5 ql5Var = ((lx30) d()).b;
                str2 = ql5Var != null ? ql5Var.f : null;
                return ckb.e0(vw4Var, historyTypeModel, str2 == null ? "" : str2, false, pruVar.a().f32117a.b.h, ((lx30) d()).d, ((lx30) d()).e, ((lx30) d()).f, ((lx30) d()).h, ((lx30) d()).j, ((lx30) d()).k);
            }
            if (a5wVar instanceof kzv) {
                kzv kzvVar = (kzv) a5wVar;
                HistoryTypeModel historyTypeModel2 = HistoryTypeModel.AUTO;
                ql5 ql5Var2 = ((lx30) d()).b;
                str2 = ql5Var2 != null ? ql5Var2.f : null;
                return ckb.f0(kzvVar, historyTypeModel2, str2 == null ? "" : str2, false, pruVar.a().f32117a.b.h, ((lx30) d()).d, ((lx30) d()).e, ((lx30) d()).f, ((lx30) d()).h, ((lx30) d()).j, ((lx30) d()).k);
            }
            if (a5wVar instanceof z7y) {
                return ckb.g0((z7y) a5wVar);
            }
            if (a5wVar instanceof for0) {
                for0 for0Var = (for0) a5wVar;
                ql5 ql5Var3 = ((lx30) d()).b;
                str2 = ql5Var3 != null ? ql5Var3.f : null;
                return ckb.i0(for0Var, str2 != null ? str2 : "");
            }
            if (a5wVar instanceof nc10) {
                nc10 nc10Var = (nc10) a5wVar;
                ql5 ql5Var4 = ((lx30) d()).b;
                str2 = ql5Var4 != null ? ql5Var4.f : null;
                return ckb.h0(nc10Var, str2 != null ? str2 : "");
            }
        }
        return n3w.d(n3w.Q1, str, 0.0d, null, null, 0L, null, 0.0d, 0.0d, null, null, null, false, null, null, null, -2, -1);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x02de  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:112:0x0302  */
    /* JADX WARN: Code duplicated, block: B:113:0x0305  */
    /* JADX WARN: Code duplicated, block: B:115:0x0362  */
    /* JADX WARN: Code duplicated, block: B:117:0x037b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0389  */
    /* JADX WARN: Code duplicated, block: B:122:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:127:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:128:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:136:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:137:0x0403  */
    /* JADX WARN: Code duplicated, block: B:140:0x0421 A[LOOP:2: B:138:0x0418->B:140:0x0421, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x042b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0447  */
    /* JADX WARN: Code duplicated, block: B:146:0x0455  */
    /* JADX WARN: Code duplicated, block: B:148:0x045c  */
    /* JADX WARN: Code duplicated, block: B:149:0x046e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0478  */
    /* JADX WARN: Code duplicated, block: B:152:0x0483  */
    /* JADX WARN: Code duplicated, block: B:154:0x0492  */
    /* JADX WARN: Code duplicated, block: B:156:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:160:0x04c2 A[LOOP:3: B:158:0x04b9->B:160:0x04c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:161:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:164:0x04db  */
    /* JADX WARN: Code duplicated, block: B:166:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:167:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:170:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:172:0x0552  */
    /* JADX WARN: Code duplicated, block: B:174:0x0565  */
    /* JADX WARN: Code duplicated, block: B:178:0x0582 A[LOOP:4: B:176:0x0579->B:178:0x0582, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x058c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0594  */
    /* JADX WARN: Code duplicated, block: B:183:0x0598  */
    /* JADX WARN: Code duplicated, block: B:184:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:185:0x0612  */
    /* JADX WARN: Code duplicated, block: B:191:0x062b  */
    /* JADX WARN: Code duplicated, block: B:193:0x0635  */
    /* JADX WARN: Code duplicated, block: B:194:0x063a  */
    /* JADX WARN: Code duplicated, block: B:196:0x063e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0653  */
    /* JADX WARN: Code duplicated, block: B:203:0x065d  */
    /* JADX WARN: Code duplicated, block: B:208:0x066c  */
    /* JADX WARN: Code duplicated, block: B:210:0x0674  */
    /* JADX WARN: Code duplicated, block: B:215:0x0683  */
    /* JADX WARN: Code duplicated, block: B:217:0x068b  */
    /* JADX WARN: Code duplicated, block: B:222:0x069b  */
    /* JADX WARN: Code duplicated, block: B:224:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:233:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0622 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0622 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0622 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b A[PHI: r1 r2
  0x008b: PHI (r1v115 a.lv30) = (r1v1 a.lv30), (r1v116 a.lv30) binds: [B:27:0x0087, B:19:0x0059] A[DONT_GENERATE, DONT_INLINE]
  0x008b: PHI (r2v94 java.lang.Object) = (r2v93 java.lang.Object), (r2v1 java.lang.Object) binds: [B:27:0x0087, B:19:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:41:0x010e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112  */
    /* JADX WARN: Code duplicated, block: B:44:0x0124  */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x014e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0178  */
    /* JADX WARN: Code duplicated, block: B:60:0x0187  */
    /* JADX WARN: Code duplicated, block: B:61:0x0193  */
    /* JADX WARN: Code duplicated, block: B:62:0x019d  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x022c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0241 A[LOOP:1: B:80:0x0226->B:85:0x0241, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x027b  */
    /* JADX WARN: Code duplicated, block: B:91:0x027f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0288  */
    /* JADX WARN: Code duplicated, block: B:93:0x0291  */
    /* JADX WARN: Code duplicated, block: B:94:0x029a  */
    /* JADX WARN: Code duplicated, block: B:95:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02be  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c7  */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0624, code lost:
    
        if (r0 == r4) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x064d, code lost:
    
        if (n(r1, r3) == r4) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0666, code lost:
    
        if (l(r3) == r4) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x067d, code lost:
    
        if (q(r3) == r4) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0695, code lost:
    
        if (k(r3) == r4) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x06ad, code lost:
    
        if (m(r3) == r4) goto L226;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.j3t0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.lv30 r45, a.zje r46) {
        /*
            Method dump skipped, instruction units count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xw30.a(a.lv30, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        if (r1 == r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(a.zje r20) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xw30.k(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l(zje zjeVar) {
        sw30 sw30Var;
        n3w n3wVar;
        long j;
        if (zjeVar instanceof sw30) {
            sw30Var = (sw30) zjeVar;
            int i = sw30Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                sw30Var.m = i - Integer.MIN_VALUE;
            } else {
                sw30Var = new sw30(this, zjeVar);
            }
        } else {
            sw30Var = new sw30(this, zjeVar);
        }
        sw30 sw30Var2 = sw30Var;
        Object obj = sw30Var2.k;
        wne wneVar = wne.f39444a;
        int i2 = sw30Var2.m;
        if (i2 == 0) {
            z1x.P(obj);
            n3w n3wVarI = i(((lx30) d()).f20796a);
            ql5 ql5Var = ((lx30) d()).b;
            if (ql5Var == null) {
                return Unit.f46060a;
            }
            long j2 = ql5Var.f28916a;
            g(new hx30(((lx30) d()).f20796a));
            a5w a5wVar = ((lx30) d()).c;
            if (a5wVar == null) {
                return Unit.f46060a;
            }
            this.x.b(a5wVar);
            String str = ((lx30) d()).f20796a;
            sw30Var2.i = n3wVarI;
            sw30Var2.j = j2;
            sw30Var2.m = 1;
            iqi iqiVar = this.u;
            if (((nr) iqiVar.c).b(((gst0) iqiVar.b).f11847a.a().f18785a, j2, sw30Var2, str) == wneVar) {
                return wneVar;
            }
            n3wVar = n3wVarI;
            j = j2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = sw30Var2.j;
            n3w n3wVar2 = sw30Var2.i;
            z1x.P(obj);
            j = j3;
            n3wVar = n3wVar2;
        }
        this.y.d(new mz0((Object) this, j, (Object) n3wVar, (byte) 22));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (q(r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.tw30
            if (r0 == 0) goto L13
            r0 = r9
            a.tw30 r0 = (a.tw30) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.tw30 r0 = new a.tw30
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r9)
            goto L7c
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L31:
            a.z1x.P(r9)
            goto L67
        L35:
            a.z1x.P(r9)
            a.a1w r9 = a.a1w.j
            a.q37 r2 = r8.A
            r2.getClass()
            a.b4j r5 = r2.b
            a.kt2 r5 = r5.f1961a
            java.lang.String r9 = r9.a()
            r5.c(r9)
            a.au0 r9 = r2.c
            a.s1p r9 = r9.f1455a
            r5 = 3206(0xc86, double:1.584E-320)
            a.xun r2 = a.xun.f41520a
            r9.a(r2, r5)
            a.byv r9 = a.byv.m
            r8.p(r9)
            r0.k = r4
            a.znt r9 = r8.p
            a.chf0 r9 = r9.f44690a
            java.lang.Object r9 = r9.D(r0)
            if (r9 != r1) goto L67
            goto L7b
        L67:
            java.lang.Number r9 = (java.lang.Number) r9
            long r4 = r9.longValue()
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L7f
            r0.k = r3
            java.lang.Object r8 = r8.q(r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L7f:
            a.fx30 r9 = new a.fx30
            java.lang.Object r0 = r8.d()
            a.lx30 r0 = (a.lx30) r0
            java.lang.String r0 = r0.f20796a
            r9.<init>(r0)
            r8.g(r9)
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xw30.m(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(f8w f8wVar, zje zjeVar) {
        uw30 uw30Var;
        String strA;
        if (zjeVar instanceof uw30) {
            uw30Var = (uw30) zjeVar;
            int i = uw30Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                uw30Var.l = i - Integer.MIN_VALUE;
            } else {
                uw30Var = new uw30(this, zjeVar);
            }
        } else {
            uw30Var = new uw30(this, zjeVar);
        }
        Object obj = uw30Var.j;
        wne wneVar = wne.f39444a;
        int i2 = uw30Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            p(byv.j);
            g(new hx30(((lx30) d()).f20796a));
            String str = ((lx30) d()).f20796a;
            ql5 ql5Var = ((lx30) d()).b;
            if (ql5Var == null) {
                return Unit.f46060a;
            }
            long j = ql5Var.f28916a;
            uw30Var.i = f8wVar;
            uw30Var.l = 1;
            Object objA = this.j.f23905a.A(j, uw30Var, str);
            if (objA != wneVar) {
                objA = Unit.f46060a;
            }
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f8wVar = uw30Var.i;
            z1x.P(obj);
        }
        if (f8wVar == f8w.f9129a) {
            strA = this.i.b.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{((lx30) d()).f20796a}, 1));
        } else {
            strA = "";
        }
        g(new bx30(strA, ((lx30) d()).f20796a));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(zje zjeVar) {
        vw30 vw30Var;
        if (zjeVar instanceof vw30) {
            vw30Var = (vw30) zjeVar;
            int i = vw30Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vw30Var.k = i - Integer.MIN_VALUE;
            } else {
                vw30Var = new vw30(this, zjeVar);
            }
        } else {
            vw30Var = new vw30(this, zjeVar);
        }
        Object objV = vw30Var.i;
        Object obj = wne.f39444a;
        int i2 = vw30Var.k;
        if (i2 == 0) {
            z1x.P(objV);
            g(new hx30(((lx30) d()).f20796a));
            p(byv.d);
            String str = ((lx30) d()).f20796a;
            vw30Var.k = 1;
            jtj jtjVar = this.k;
            objV = ((nvu) jtjVar.b).v(((k7u) jtjVar.c).f17841a.b().getId(), vw30Var, str);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        g(new ex30(((lx30) d()).f20796a, (byte[]) objV));
        return Unit.f46060a;
    }

    public final void p(byv byvVar) {
        z5w z5wVar;
        jvw jvwVarB;
        a5w a5wVar = ((lx30) d()).c;
        if (a5wVar == null || (jvwVarB = a5wVar.b()) == null) {
            z5wVar = z5w.b;
        } else if (jvwVarB == zw4.f45089a) {
            z5wVar = z5w.k;
        } else if (jvwVarB == zw4.b) {
            z5wVar = z5w.v;
        } else if (jvwVarB == zw4.c) {
            z5wVar = z5w.l;
        } else if (jvwVarB == iy4.f15571a) {
            z5wVar = z5w.b;
        } else if (jvwVarB == iy4.b) {
            z5wVar = z5w.k;
        } else if (jvwVarB == iy4.c) {
            z5wVar = z5w.l;
        } else if (jvwVarB == iy4.d) {
            z5wVar = z5w.v;
        } else if (jvwVarB == i0w.f13966a) {
            z5wVar = z5w.b;
        } else if (jvwVarB == i0w.b) {
            z5wVar = z5w.c;
        } else if (jvwVarB == i0w.c) {
            z5wVar = z5w.d;
        } else if (jvwVarB == i0w.d) {
            z5wVar = z5w.e;
        } else if (jvwVarB == i0w.e) {
            z5wVar = z5w.f;
        } else if (jvwVarB == i0w.f) {
            z5wVar = z5w.g;
        } else if (jvwVarB == i0w.g) {
            z5wVar = z5w.h;
        } else if (jvwVarB == i0w.h) {
            z5wVar = z5w.i;
        } else if (jvwVarB == i0w.i) {
            z5wVar = z5w.j;
        } else if (jvwVarB == rc10.f30217a) {
            z5wVar = z5w.c;
        } else if (jvwVarB == rc10.b) {
            z5wVar = z5w.e;
        } else {
            z5wVar = jvwVarB == rc10.c ? z5w.h : z5w.f43836a;
        }
        this.A.a(byvVar, z5wVar, slb.d0(((lx30) d()).i));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object q(zje zjeVar) {
        ww30 ww30Var;
        if (zjeVar instanceof ww30) {
            ww30Var = (ww30) zjeVar;
            int i = ww30Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ww30Var.k = i - Integer.MIN_VALUE;
            } else {
                ww30Var = new ww30(this, zjeVar);
            }
        } else {
            ww30Var = new ww30(this, zjeVar);
        }
        ww30 ww30Var2 = ww30Var;
        Object obj = ww30Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = ww30Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            a5w a5wVar = ((lx30) d()).c;
            kzv kzvVar = a5wVar instanceof kzv ? (kzv) a5wVar : null;
            if (kzvVar == null) {
                return Unit.f46060a;
            }
            List list = kzvVar.Y;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((z0w) obj2).k == w0w.f38369a) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z0w z0wVar = (z0w) it.next();
                z0wVar.getClass();
                String str = z0wVar.m;
                String str2 = z0wVar.p;
                long j = z0wVar.i;
                List list2 = z0wVar.r;
                List list3 = z0wVar.o;
                long j2 = z0wVar.h;
                if (j2 == 0) {
                    j2 = j;
                }
                long j3 = z0wVar.G;
                Iterator it2 = it;
                long j4 = z0wVar.t;
                long j5 = z0wVar.v;
                String str3 = z0wVar.H;
                String strConcat = str.concat(str2.length() > 0 ? " - ".concat(str2) : "");
                int iMax = Math.max(list3.size(), list2.size());
                String str4 = (String) CollectionsKt.firstOrNull(list3);
                String str5 = str4 == null ? "" : str4;
                String str6 = (String) (1 < list3.size() ? list3.get(1) : "");
                String str7 = (String) CollectionsKt.firstOrNull(list2);
                String str8 = str7 == null ? "" : str7;
                String str9 = (String) (1 < list2.size() ? list2.get(1) : "");
                double d = z0wVar.d;
                double d2 = z0wVar.D;
                String str10 = z0wVar.C;
                String str11 = str10.length() > 0 ? ". " : null;
                if (str11 == null) {
                    str11 = "";
                }
                arrayList2.add(new jwe(j, j2, j5, j4, j3, str3, kng0.l(str10, str11, z0wVar.w), z0wVar.b, "", z0wVar.F, d2, strConcat, str, str2, iMax, str5, str6, str8, str9, z0wVar.f, d, z0wVar.l ? uoy.LIVE : uoy.LINE, yfa0.INSTANCE, "", z0wVar.B, new yeo(z0wVar.O, z0wVar.P)));
                it = it2;
            }
            gwe gweVar = gwe.HISTORY;
            ww30Var2.k = 1;
            if (this.q.B(arrayList2, gweVar, 0L, ww30Var2) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        ((qe50) this.r.b).a(new xa50(), false);
        return Unit.f46060a;
    }
}
