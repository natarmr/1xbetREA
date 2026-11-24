package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.section.api.discipline.presentation.model.DisciplineListParams;
import org.xplatform.onexdatabase.OnexDatabase;
import org.xplatform.personal.impl.navigation.PersonalScreen$PersonalDataScreen;
import org.xplatform.reward_system.impl.navigation.RewardSystemScreenFactoryImpl$getRewardSystemScreen$1;
import org.xplatform.search.api.models.GlobalSearchContainerSettings;
import org.xplatform.security.impl.navigation.SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;
import org.xplatform.settings.impl.navigation.SettingsScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class daf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5743a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;

    public daf(cad cadVar, gii0 gii0Var, iok0 iok0Var, fok0 fok0Var, j1q0 j1q0Var) {
        this.f5743a = (byte) 14;
        this.b = gii0Var;
        this.c = iok0Var;
        this.d = cadVar;
        this.e = j1q0Var;
        this.f = fok0Var;
        byte b = 10;
        this.g = n0k0.a(new psi(this, 1, b));
        this.h = n0k0.a(new psi(this, 0, b));
        this.i = n0k0.a(new psi(this, 2, b));
        this.j = n0k0.a(new psi(this, 4, b));
        this.k = n0k0.a(new psi(this, 3, b));
        this.l = n0k0.a(new psi(this, 5, b));
        this.m = n0k0.a(new psi(this, 6, b));
    }

    public static void L(daf dafVar, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = "";
        }
        str.getClass();
        kd30 kd30Var = (kd30) dafVar.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(1), new PersonalScreen$PersonalDataScreen(str), true, z2, 2);
    }

    public nfm0 A() {
        return (nfm0) ((n5d0) this.m).get();
    }

    public nvu B() {
        daf dafVar = (daf) ((pmi0) this.j).f27236a;
        return new nvu((ntu) dafVar.g, new zpu(new zas0((knf0) dafVar.f), (fsd) dafVar.h), (wyu) dafVar.i);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1 A[PHI: r11
  0x00b1: PHI (r11v5 a.x3z) = (r11v4 a.x3z), (r11v9 a.x3z) binds: [B:35:0x00ae, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r10.b(r11) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
    
        if (d0(r11, r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(a.x3z r11, a.zje r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof a.nlv
            if (r0 == 0) goto L13
            r0 = r12
            a.nlv r0 = (a.nlv) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.nlv r0 = new a.nlv
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L49
            if (r2 == r7) goto L45
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L38
            if (r2 != r4) goto L32
            a.z1x.P(r12)
            goto Lc0
        L32:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r3
        L38:
            a.x3z r11 = r0.i
            a.z1x.P(r12)
            goto Lb1
        L3f:
            a.x3z r11 = r0.i
            a.z1x.P(r12)
            goto La1
        L45:
            a.z1x.P(r12)
            goto L77
        L49:
            a.z1x.P(r12)
            if (r11 == 0) goto Lc3
            boolean r12 = r11 instanceof a.v3z
            if (r12 == 0) goto L7a
            java.lang.Object r12 = r10.b
            a.rbu r12 = (a.rbu) r12
            a.r5s r2 = new a.r5s
            a.v3z r11 = (a.v3z) r11
            long r4 = r11.f36754a
            r8 = 0
            r2.<init>(r4, r8)
            a.w5s r11 = r12.f30207a
            r11.a(r2)
            java.lang.Object r10 = r10.c
            a.fwt r10 = (a.fwt) r10
            a.m2a r11 = a.m2a.q
            r0.i = r3
            r0.l = r7
            kotlin.Unit r10 = r10.b(r11)
            if (r10 != r1) goto L77
            goto Lbf
        L77:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        L7a:
            boolean r12 = r11 instanceof a.w3z
            if (r12 == 0) goto Lc3
            java.lang.Object r12 = r10.d
            a.drm0 r12 = (a.drm0) r12
            r2 = r11
            a.w3z r2 = (a.w3z) r2
            a.k9s r2 = r2.f38520a
            java.lang.Object r7 = r10.e
            a.viu r7 = (a.viu) r7
            long r7 = r7.a()
            a.anq0 r7 = a.osm0.p(r2, r7)
            r12.j(r7)
            r0.i = r11
            r0.l = r6
            java.lang.Object r12 = r10.E(r2, r0)
            if (r12 != r1) goto La1
            goto Lbf
        La1:
            r12 = r11
            a.w3z r12 = (a.w3z) r12
            a.k9s r12 = r12.f38520a
            r0.i = r11
            r0.l = r5
            java.lang.Object r12 = r10.b0(r12, r0)
            if (r12 != r1) goto Lb1
            goto Lbf
        Lb1:
            a.w3z r11 = (a.w3z) r11
            a.k9s r11 = r11.f38520a
            r0.i = r3
            r0.l = r4
            java.lang.Object r10 = r10.d0(r11, r0)
            if (r10 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        Lc3:
            a.t9f.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a.daf.C(a.x3z, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c5 A[PHI: r12
  0x00c5: PHI (r12v4 a.b4z) = (r12v3 a.b4z), (r12v9 a.b4z) binds: [B:35:0x00c2, B:17:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        if (c0(r12, r1) == r2) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(a.b4z r12, a.o3w0 r13, a.zje r14) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.daf.D(a.b4z, a.o3w0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object E(k9s k9sVar, zje zjeVar) {
        plv plvVar;
        if (zjeVar instanceof plv) {
            plvVar = (plv) zjeVar;
            int i = plvVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                plvVar.l = i - Integer.MIN_VALUE;
            } else {
                plvVar = new plv(this, zjeVar);
            }
        } else {
            plvVar = new plv(this, zjeVar);
        }
        Object obj = plvVar.j;
        wne wneVar = wne.f39444a;
        int i2 = plvVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            rbu rbuVar = (rbu) this.b;
            rbuVar.f30207a.a(new s5s(k9sVar.f17929a, k9sVar.z, k9sVar.B));
            g090 g090Var = (g090) this.g;
            plvVar.i = k9sVar;
            plvVar.l = 1;
            if (g090Var.p(k9sVar, plvVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k9sVar = plvVar.i;
            z1x.P(obj);
        }
        ((pv00) this.f).n(xcm0.t(k9sVar));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:54:0x0214  */
    /* JADX WARN: Code duplicated, block: B:57:0x021e  */
    /* JADX WARN: Code duplicated, block: B:68:0x025c  */
    /* JADX WARN: Code duplicated, block: B:71:0x027c  */
    /* JADX WARN: Code duplicated, block: B:72:0x027f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[LOOP:1: B:55:0x0218->B:82:?, LOOP_END, SYNTHETIC] */
    public Object F(double d, long j, ex4 ex4Var, zje zjeVar, String str, String str2, boolean z, boolean z2) {
        caf cafVar;
        vb9 vb9Var;
        double d2;
        String str3;
        q4f q4fVar;
        boolean z3;
        Object obj;
        boolean z4;
        ex4 ex4Var2;
        double d3;
        g0f g0fVar;
        String str4;
        long j2;
        List list;
        Object objB;
        String str5;
        double d4;
        long j3;
        boolean z5;
        boolean z6;
        String str6;
        List list2;
        long j4;
        g0f g0fVar2;
        String str7;
        ex4 ex4Var3;
        vv6 vv6Var;
        List list3;
        ArrayList arrayList;
        Iterator it;
        boolean z7;
        boolean z8;
        vb9 vb9Var2;
        vb9 vb9Var3;
        if (zjeVar instanceof caf) {
            cafVar = (caf) zjeVar;
            int i = cafVar.y;
            if ((i & Integer.MIN_VALUE) != 0) {
                cafVar.y = i - Integer.MIN_VALUE;
            } else {
                cafVar = new caf(this, zjeVar);
            }
        } else {
            cafVar = new caf(this, zjeVar);
        }
        Object obj2 = cafVar.w;
        wne wneVar = wne.f39444a;
        int i2 = cafVar.y;
        if (i2 != 0) {
            if (i2 == 1) {
                obj = obj2;
                vb9Var = null;
                double d5 = cafVar.l;
                boolean z9 = cafVar.n;
                z4 = cafVar.m;
                d3 = cafVar.k;
                j2 = cafVar.i;
                q4f q4fVar2 = cafVar.s;
                g0fVar = cafVar.r;
                str4 = cafVar.q;
                ex4Var2 = cafVar.p;
                str3 = cafVar.o;
                z1x.P(obj);
                z3 = z9;
                d2 = d5;
                q4fVar = q4fVar2;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j5 = cafVar.j;
                d4 = cafVar.l;
                boolean z10 = cafVar.n;
                boolean z11 = cafVar.m;
                long j6 = cafVar.i;
                List list4 = (List) cafVar.v;
                String str8 = cafVar.u;
                vv6Var = cafVar.t;
                vb9Var = null;
                q4fVar = cafVar.s;
                g0fVar2 = cafVar.r;
                String str9 = cafVar.q;
                ex4 ex4Var4 = cafVar.p;
                String str10 = cafVar.o;
                z1x.P(obj2);
                str7 = str9;
                ex4Var3 = ex4Var4;
                str6 = str10;
                j3 = j5;
                z6 = z10;
                z5 = z11;
                j4 = j6;
                list2 = list4;
                str5 = str8;
                objB = obj2;
            }
            int iIntValue = ((Number) objB).intValue();
            byte b = ((vyt) this.g).a().f8665a;
            g0fVar2.getClass();
            list3 = g0fVar2.b;
            q4fVar.getClass();
            if (q4fVar != q4f.g) {
                z7 = false;
                break;
            }
            arrayList = new ArrayList();
            for (Object obj3 : list3) {
                if (!((hf6) obj3).c.isEmpty()) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList.isEmpty()) {
                z7 = false;
                break;
            }
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    z7 = false;
                    break;
                }
                if (((hf6) it.next()).e) {
                    z7 = true;
                    break;
                }
            }
            List list5 = vv6Var.b;
            List listE = ((x4u) this.i).e(list3, q4fVar, d4);
            long j7 = g0fVar2.f;
            byte b2 = ((ppt) this.j).f27385a.t().f38290a;
            double d6 = g0fVar2.e;
            if (((zlt0) this.l).k() || d4 <= d6 || d6 == 0.0d) {
                z8 = false;
            } else {
                z8 = true;
            }
            boolean z12 = g0fVar2.n;
            double d7 = ((lye) ((ppt) this.m).f27385a.b).f20858a.h;
            vb9Var2 = ((j9c) this.k).c().g0;
            if (q4fVar == q4f.l) {
                vb9Var3 = vb9Var2;
            } else {
                vb9Var3 = vb9Var;
            }
            return new ouj0(j3, j4, str5, z6, list2, iIntValue, b, z7, list5, listE, j7, b2, z8, z5, str6, null, ex4Var3, str7, q4fVar, z12, false, null, null, d7, vb9Var3);
        }
        vb9Var = null;
        z1x.P(obj2);
        g0f g0fVarA = ((ert) this.c).a();
        q4f q4fVarA = ((j9c) this.d).a();
        List list6 = g0fVarA.b;
        double d8 = (q4fVarA != q4f.h || list6.isEmpty()) ? d : ((hf6) CollectionsKt.U(list6)).d;
        znt zntVar = (znt) this.f;
        cafVar.o = str;
        cafVar.p = ex4Var;
        cafVar.q = str2;
        cafVar.r = g0fVarA;
        cafVar.s = q4fVarA;
        cafVar.i = j;
        cafVar.k = d;
        cafVar.m = z;
        cafVar.n = z2;
        cafVar.l = d8;
        cafVar.y = 1;
        Serializable serializableP = zntVar.f44690a.p(cafVar);
        if (serializableP == wneVar) {
            return wneVar;
        }
        d2 = d8;
        str3 = str;
        q4fVar = q4fVarA;
        z3 = z2;
        obj = serializableP;
        z4 = z;
        ex4Var2 = ex4Var;
        d3 = d;
        g0fVar = g0fVarA;
        str4 = str2;
        j2 = j;
        List list7 = (List) obj;
        boolean z13 = z3;
        vv6 vv6VarE = q3d.j(q4f.g, q4f.h).contains(q4fVar) ? ((nmo) this.h).e(list7) : new vv6(list7, iun.f15405a);
        double d9 = d3;
        boolean z14 = z4;
        long jB = ((ort) this.b).b();
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d2, p3u0.c);
        if (q4fVar != q4f.l) {
            List list8 = vv6VarE.f38084a;
            ArrayList arrayList2 = new ArrayList(r3d.q(list8, 10));
            Iterator it2 = list8.iterator();
            while (it2.hasNext()) {
                arrayList2.add(wha0.Y((qu6) it2.next()));
            }
            list = arrayList2;
        } else {
            list = iun.f15405a;
        }
        fqc fqcVar = (fqc) this.e;
        caf cafVar2 = cafVar;
        cafVar2.o = str3;
        cafVar2.p = ex4Var2;
        cafVar2.q = str4;
        cafVar2.r = g0fVar;
        cafVar2.s = q4fVar;
        cafVar2.t = vv6VarE;
        cafVar2.u = strC;
        cafVar2.v = list;
        cafVar2.i = j2;
        vv6 vv6Var2 = vv6VarE;
        cafVar2.k = d9;
        cafVar2.m = z14;
        cafVar2.n = z13;
        cafVar2.l = d2;
        double d10 = d2;
        cafVar2.j = jB;
        cafVar2.y = 2;
        objB = fqcVar.b(q4fVar, cafVar2);
        if (objB == wneVar) {
            return wneVar;
        }
        str5 = strC;
        d4 = d10;
        j3 = jB;
        z5 = z14;
        z6 = z13;
        str6 = str3;
        list2 = list;
        j4 = j2;
        g0fVar2 = g0fVar;
        str7 = str4;
        ex4Var3 = ex4Var2;
        vv6Var = vv6Var2;
        int iIntValue2 = ((Number) objB).intValue();
        byte b3 = ((vyt) this.g).a().f8665a;
        g0fVar2.getClass();
        list3 = g0fVar2.b;
        q4fVar.getClass();
        if (q4fVar != q4f.g) {
            z7 = false;
            break;
        }
        arrayList = new ArrayList();
        while (r6.hasNext()) {
            if (!((hf6) obj3).c.isEmpty()) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.isEmpty()) {
            z7 = false;
            break;
        }
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                z7 = false;
                break;
            }
            if (((hf6) it.next()).e) {
                z7 = true;
                break;
            }
        }
        List list9 = vv6Var.b;
        List listE2 = ((x4u) this.i).e(list3, q4fVar, d4);
        long j8 = g0fVar2.f;
        byte b4 = ((ppt) this.j).f27385a.t().f38290a;
        double d11 = g0fVar2.e;
        if (((zlt0) this.l).k()) {
            z8 = false;
        } else {
            z8 = false;
        }
        boolean z15 = g0fVar2.n;
        double d12 = ((lye) ((ppt) this.m).f27385a.b).f20858a.h;
        vb9Var2 = ((j9c) this.k).c().g0;
        if (q4fVar == q4f.l) {
            vb9Var3 = vb9Var2;
        } else {
            vb9Var3 = vb9Var;
        }
        return new ouj0(j3, j4, str5, z6, list2, iIntValue2, b3, z7, list9, listE2, j8, b4, z8, z5, str6, null, ex4Var3, str7, q4fVar, z15, false, null, null, d12, vb9Var3);
    }

    public Object G(g4z g4zVar, o3w0 o3w0Var, zje zjeVar) {
        if (g4zVar != null) {
            if (g4zVar instanceof x3z) {
                Object objC = C((x3z) g4zVar, zjeVar);
                return objC == wne.f39444a ? objC : Unit.f46060a;
            }
            if (g4zVar instanceof b4z) {
                Object objD = D((b4z) g4zVar, o3w0Var, zjeVar);
                return objD == wne.f39444a ? objD : Unit.f46060a;
            }
            if (g4zVar instanceof f4z) {
                f4z f4zVar = (f4z) g4zVar;
                w5s w5sVar = ((rbu) this.b).f30207a;
                if (f4zVar instanceof d4z) {
                    w5sVar.a(new q5s(((d4z) f4zVar).f5479a));
                } else if (f4zVar instanceof e4z) {
                    w5sVar.a(new n5s(((e4z) f4zVar).f7206a));
                } else {
                    if (!(f4zVar instanceof c4z)) {
                        t9f.b();
                        return null;
                    }
                    c4z c4zVar = (c4z) f4zVar;
                    w5sVar.a(new r5s(c4zVar.f3746a, c4zVar.b));
                }
                return Unit.f46060a;
            }
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:104:0x044d  */
    /* JADX WARN: Code duplicated, block: B:114:0x046a  */
    /* JADX WARN: Code duplicated, block: B:115:0x046d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0471  */
    /* JADX WARN: Code duplicated, block: B:118:0x0474  */
    /* JADX WARN: Code duplicated, block: B:120:0x0478  */
    /* JADX WARN: Code duplicated, block: B:122:0x0485  */
    /* JADX WARN: Code duplicated, block: B:128:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x02ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x02ef A[EDGE_INSN: B:138:0x02ef->B:73:0x02ef BREAK  A[LOOP:4: B:66:0x02d3->B:71:0x02e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x011d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0132  */
    /* JADX WARN: Code duplicated, block: B:24:0x014d  */
    /* JADX WARN: Code duplicated, block: B:28:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:29:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:36:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x020a A[LOOP:2: B:34:0x01eb->B:39:0x020a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x021a  */
    /* JADX WARN: Code duplicated, block: B:44:0x021d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0222  */
    /* JADX WARN: Code duplicated, block: B:50:0x022b  */
    /* JADX WARN: Code duplicated, block: B:52:0x023a  */
    /* JADX WARN: Code duplicated, block: B:53:0x023d  */
    /* JADX WARN: Code duplicated, block: B:57:0x024a  */
    /* JADX WARN: Code duplicated, block: B:63:0x025d  */
    /* JADX WARN: Code duplicated, block: B:64:0x029a  */
    /* JADX WARN: Code duplicated, block: B:68:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:71:0x02e9 A[LOOP:4: B:66:0x02d3->B:71:0x02e9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x0301  */
    /* JADX WARN: Code duplicated, block: B:76:0x0304  */
    /* JADX WARN: Code duplicated, block: B:78:0x0307  */
    /* JADX WARN: Code duplicated, block: B:79:0x030a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0324  */
    /* JADX WARN: Code duplicated, block: B:86:0x0379  */
    /* JADX WARN: Code duplicated, block: B:89:0x037f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0392 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0396  */
    /* JADX WARN: Code duplicated, block: B:96:0x0399  */
    /* JADX WARN: Code duplicated, block: B:97:0x039b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x03f8 -> B:102:0x0413). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object H(java.util.List r67, java.util.List r68, java.util.List r69, java.util.List r70, java.util.List r71, a.q4f r72, java.lang.String r73, boolean r74, java.util.List r75, java.util.LinkedHashMap r76, a.zje r77) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.daf.H(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, a.q4f, java.lang.String, boolean, java.util.List, java.util.LinkedHashMap, a.zje):java.lang.Object");
    }

    public pzu I() {
        h840 h840Var = (h840) this.h;
        gii0 gii0Var = (gii0) this.i;
        gsj gsjVar = new gsj(gii0Var);
        eio eioVar = new eio(gii0Var);
        knf0 knf0Var = (knf0) this.j;
        btt0 btt0Var = (btt0) this.k;
        mne mneVarH = ((psc) ((cad) this.f).b).h();
        x1x.x(mneVarH);
        return new pzu(h840Var, gsjVar, eioVar, knf0Var, btt0Var, mneVarH);
    }

    public void J() {
        kd30 kd30Var = (kd30) this.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(4), new SettingsScreenFactoryImpl$getScreen$1((pmi0) this.c, d6j0.b), false, false, 18);
    }

    public void K() {
        kd30.G((kd30) this.b, new ab50(0), pmi0.b((pmi0) this.c, false), true, false, 18);
    }

    public void M() {
        kd30.G((kd30) this.b, new bb50(false), new RewardSystemScreenFactoryImpl$getRewardSystemScreen$1(), false, false, 26);
    }

    public void N() {
        kd30 kd30Var = (kd30) this.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(4), new SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1((iw20) this.d, fsh0.f10063a, nqh0.f23960a), true, false, 18);
    }

    public void O() {
        kd30 kd30Var = (kd30) this.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(4), new SettingsScreenFactoryImpl$getScreen$1((pmi0) this.c, d6j0.e), true, false, 18);
    }

    public void P() {
        kd30 kd30Var = (kd30) this.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(4), new SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1((iw20) this.d, fsh0.b, nqh0.f23960a), true, false, 18);
    }

    public void Q() {
        kd30 kd30Var = (kd30) this.b;
        wv10 wv10Var = wv10.SPORT;
        kd30.G(kd30Var, new ab50(4), new SettingsScreenFactoryImpl$getScreen$1((pmi0) this.c, d6j0.d), true, false, 18);
    }

    public void R(float f) {
        this.f = new q0(f);
        this.g = new q0(f);
        U(f);
        T(f);
    }

    public void S(float f) {
        qzb qzbVarA = k7x.A(0);
        this.b = qzbVarA;
        this.c = qzbVarA;
        this.d = qzbVarA;
        this.e = qzbVarA;
        R(f);
    }

    public void T(float f) {
        this.i = new q0(f);
    }

    public void U(float f) {
        this.h = new q0(f);
    }

    public eyg0 V() {
        return new eyg0((Object) new rrc((xkn) this.h), (byte) 11);
    }

    public o470 W() {
        return new o470(new vqc((u0f) this.j));
    }

    public hpi0 X() {
        return new hpi0(b());
    }

    public lfu Y() {
        return new lfu(b());
    }

    public zfm0 Z() {
        return new zfm0(new bzs0((byte) 16), new nwd(), new y2m0((byte) 15), new bst(), (nai) this.b, (rl70) this.c, (qzt) this.d, (htz) this.e, (pru) this.f, (s2m0) this.g, (cge0) this.h, (g9m0) this.i);
    }

    public ywq0 a() {
        pq pqVar = new pq(i());
        u0f u0fVar = (u0f) this.j;
        a7q a7qVar = new a7q(new vqc(u0fVar));
        vqc vqcVar = new vqc(u0fVar);
        bwl bwlVar = new bwl((aln) this.k);
        jnn jnnVar = (jnn) this.l;
        return new ywq0(pqVar, a7qVar, new fht0(vqcVar, bwlVar, new dqc(new lrc(jnnVar)), new do20(new lrc(jnnVar))), new pq(i()), new lef0(i()), new pq(i()), new a8u(i()));
    }

    public z220 a0() {
        mne mneVarH = ((psc) ((cad) this.c).b).h();
        x1x.x(mneVarH);
        return new z220(mneVarH, new g090((gii0) this.d, (byte) 20), (ygm0) this.e, (knf0) this.f);
    }

    public mii0 b() {
        return new mii0(new yzn0((gii0) this.d, (byte) 12), (btt0) this.e, (knf0) this.f, (t47) this.g);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b0(k9s k9sVar, zje zjeVar) {
        qlv qlvVar;
        if (zjeVar instanceof qlv) {
            qlvVar = (qlv) zjeVar;
            int i = qlvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qlvVar.k = i - Integer.MIN_VALUE;
            } else {
                qlvVar = new qlv(this, zjeVar);
            }
        } else {
            qlvVar = new qlv(this, zjeVar);
        }
        Object obj = qlvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = qlvVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            if (!k9sVar.D) {
                return Unit.f46060a;
            }
            tlv tlvVar = new tlv(this, k9sVar, yjeVar, (byte) 0);
            qlvVar.k = 1;
            if (d5c.J(qlvVar, tlvVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public akj0 c() {
        akj0 akj0Var = new akj0();
        akj0Var.f1025a = (qzb) this.b;
        akj0Var.b = (qzb) this.c;
        akj0Var.c = (qzb) this.d;
        akj0Var.d = (qzb) this.e;
        akj0Var.e = (dne) this.f;
        akj0Var.f = (dne) this.g;
        akj0Var.g = (dne) this.h;
        akj0Var.h = (dne) this.i;
        akj0Var.i = (ujn) this.j;
        akj0Var.j = (ujn) this.k;
        akj0Var.k = (ujn) this.l;
        akj0Var.l = (ujn) this.m;
        return akj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c0(k9s k9sVar, zje zjeVar) {
        ulv ulvVar;
        if (zjeVar instanceof ulv) {
            ulvVar = (ulv) zjeVar;
            int i = ulvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ulvVar.k = i - Integer.MIN_VALUE;
            } else {
                ulvVar = new ulv(this, zjeVar);
            }
        } else {
            ulvVar = new ulv(this, zjeVar);
        }
        Object obj = ulvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ulvVar.k;
        yje yjeVar = null;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            if (!k9sVar.i) {
                return Unit.f46060a;
            }
            tlv tlvVar = new tlv(this, k9sVar, yjeVar, b);
            ulvVar.k = 1;
            if (d5c.J(ulvVar, tlvVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public boolean d(boolean z) {
        s5r0 s5r0Var = (s5r0) ((h0q0) ((ocl) this.j).f25032a).b;
        List list = (List) (z ? s5r0Var.f31667a : s5r0Var.b).b();
        return list == null || list.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d0(k9s k9sVar, zje zjeVar) {
        wlv wlvVar;
        if (zjeVar instanceof wlv) {
            wlvVar = (wlv) zjeVar;
            int i = wlvVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wlvVar.k = i - Integer.MIN_VALUE;
            } else {
                wlvVar = new wlv(this, zjeVar);
            }
        } else {
            wlvVar = new wlv(this, zjeVar);
        }
        Object obj = wlvVar.i;
        wne wneVar = wne.f39444a;
        int i2 = wlvVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            Long l = k9sVar.I;
            if (((sff0) this.m).m0 || l == null) {
                return Unit.f46060a;
            }
            ah0 ah0Var = new ah0(this, l, k9sVar, null, (byte) 9);
            wlvVar.k = 1;
            if (d5c.J(wlvVar, ah0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public clc e() {
        return new clc((Object) b(), (byte) 1);
    }

    public fiu0 e0() {
        iyk iykVar = new iyk(3);
        iykVar.b(gj8.class, (r5i) this.k);
        iykVar.b(tj8.class, (r5i) this.l);
        iykVar.b(yj8.class, (r5i) this.m);
        return new fiu0(iykVar.a());
    }

    public c5k f() {
        return new c5k(i(), new vqc((u0f) this.j));
    }

    public xex g() {
        return new xex(new r7v(new dpi0((j77) this.b)), new o470(new ok50((t37) this.c)));
    }

    public xte0 h() {
        return new xte0((je) this.b, (nr) this.c, (zg) this.d, (au0) this.e, (b4j) this.f, (s64) this.g, (nvu) this.h, (sv3) this.i, (xuz) this.j, (yuu) this.k, (pru) this.l, (yu00) this.m);
    }

    public es i() {
        return new es((sln) this.i, new ocl((gii0) this.d, (byte) 2), (btt0) this.e);
    }

    public yui j() {
        return (yui) ((n5d0) this.m).get();
    }

    public mpt k() {
        return new mpt(b());
    }

    public pq l() {
        return new pq(i());
    }

    public jtj m() {
        return new jtj((Object) new pq(i()), (Object) new a7q(new vqc((u0f) this.j)), (byte) 25);
    }

    public e1u n() {
        return new e1u(new rrc((xkn) this.h), (byte) 8);
    }

    public psc o() {
        switch (this.f5743a) {
            case 15:
                return new psc((Object) new nw20((ddm0) this.b, new he1(new rrc((OnexDatabase) this.j), (byte) 5)), (byte) 24);
            default:
                return ((daf) ((pmi0) this.j).f27236a).o();
        }
    }

    public npx p() {
        return new npx(i());
    }

    public cu q() {
        r2u r2uVarX = x();
        weu weuVar = new weu((nfm0) ((n5d0) this.m).get(), (byte) 0);
        luu luuVarW = ((daf) ((ugf0) this.l).f35622a).w();
        x1x.x(luuVarW);
        return new cu(r2uVarX, weuVar, luuVarW, (byte) 25);
    }

    public fhj r() {
        weu weuVar = new weu((nfm0) ((n5d0) this.m).get(), (byte) 0);
        luu luuVarW = ((daf) ((ugf0) this.l).f35622a).w();
        x1x.x(luuVarW);
        return new fhj(weuVar, luuVarW);
    }

    public f7u s() {
        return new f7u((Object) new zqu((nfm0) ((n5d0) this.m).get(), (byte) 1), (Object) new jwu((nfm0) ((n5d0) this.m).get(), (byte) 1), (Object) new jwu((nfm0) ((n5d0) this.m).get(), (byte) 0), (Object) x(), (byte) 4);
    }

    public pv00 t() {
        switch (this.f5743a) {
            case 15:
                return new pv00(new nw20((ddm0) this.b, new he1(new rrc((OnexDatabase) this.j), (byte) 5)));
            default:
                return ((daf) ((pmi0) this.j).f27236a).t();
        }
    }

    public juu u() {
        return (juu) ((n5d0) this.k).get();
    }

    public kuu v() {
        return (kuu) ((n5d0) this.l).get();
    }

    public luu w() {
        return (luu) ((n5d0) this.i).get();
    }

    public r2u x() {
        sjl0 sjl0Var = (sjl0) this.k;
        sjl0Var.getClass();
        return new r2u(sjl0Var, (byte) 1);
    }

    public ieu y() {
        mne mneVarH = ((psc) ((cad) this.c).b).h();
        x1x.x(mneVarH);
        sjl0 sjl0Var = (sjl0) this.k;
        sjl0Var.getClass();
        return new ieu(mneVarH, sjl0Var);
    }

    public weu z() {
        switch (this.f5743a) {
            case 15:
                return new weu((nfm0) ((n5d0) this.m).get(), (byte) 1);
            default:
                return ((daf) ((pmi0) this.j).f27236a).z();
        }
    }

    public daf(je jeVar, nr nrVar, zg zgVar, au0 au0Var, b4j b4jVar, s64 s64Var, nvu nvuVar, sv3 sv3Var, xuz xuzVar, yuu yuuVar, pru pruVar, yu00 yu00Var) {
        this.f5743a = (byte) 24;
        sv3Var.getClass();
        this.b = jeVar;
        this.c = nrVar;
        this.d = zgVar;
        this.e = au0Var;
        this.f = b4jVar;
        this.g = s64Var;
        this.h = nvuVar;
        this.i = sv3Var;
        this.j = xuzVar;
        this.k = yuuVar;
        this.l = pruVar;
        this.m = yu00Var;
    }

    public daf(hsj hsjVar, rq rqVar, tqc tqcVar, uyt uytVar, j9c j9cVar, j9c j9cVar2, gs gsVar, mpc mpcVar, mpc mpcVar2, b3u b3uVar, tqc tqcVar2, pru pruVar) {
        this.f5743a = (byte) 20;
        this.b = hsjVar;
        this.c = rqVar;
        this.d = tqcVar;
        this.e = uytVar;
        this.f = j9cVar;
        this.g = j9cVar2;
        this.h = gsVar;
        this.i = mpcVar;
        this.j = mpcVar2;
        this.k = b3uVar;
        this.l = tqcVar2;
        this.m = pruVar;
    }

    public daf(vyt vytVar, vpt vptVar, pyu pyuVar, dnv dnvVar, czu czuVar, env envVar, dzu dzuVar, czu czuVar2, g2v g2vVar, fnv fnvVar, pyu pyuVar2, pru pruVar) {
        this.f5743a = (byte) 21;
        this.g = vytVar;
        this.b = vptVar;
        this.c = pyuVar;
        this.d = dnvVar;
        this.e = czuVar;
        this.f = envVar;
        this.h = dzuVar;
        this.i = czuVar2;
        this.j = g2vVar;
        this.k = fnvVar;
        this.l = pyuVar2;
        this.m = pruVar;
    }

    public daf(ort ortVar, ert ertVar, j9c j9cVar, fqc fqcVar, znt zntVar, vyt vytVar, nmo nmoVar, qud qudVar, x4u x4uVar, ppt pptVar, j9c j9cVar2, zlt0 zlt0Var, ppt pptVar2) {
        this.f5743a = (byte) 0;
        this.b = ortVar;
        this.c = ertVar;
        this.d = j9cVar;
        this.e = fqcVar;
        this.f = zntVar;
        this.g = vytVar;
        this.h = nmoVar;
        this.i = x4uVar;
        this.j = pptVar;
        this.k = j9cVar2;
        this.l = zlt0Var;
        this.m = pptVar2;
    }

    public daf(rbu rbuVar, fwt fwtVar, drm0 drm0Var, viu viuVar, pv00 pv00Var, g090 g090Var, ntu ntuVar, fck0 fck0Var, afm0 afm0Var, glt0 glt0Var, qbu qbuVar, pru pruVar) {
        this.f5743a = (byte) 23;
        this.b = rbuVar;
        this.c = fwtVar;
        this.d = drm0Var;
        this.e = viuVar;
        this.f = pv00Var;
        this.g = g090Var;
        this.h = ntuVar;
        this.i = fck0Var;
        this.j = afm0Var;
        this.k = glt0Var;
        this.l = qbuVar;
        this.m = pruVar.a();
    }

    public daf(kd30 kd30Var, pmi0 pmi0Var, qgd qgdVar, iw20 iw20Var, zx10 zx10Var, q840 q840Var, usd usdVar, mi70 mi70Var, jh70 jh70Var, eke0 eke0Var, r990 r990Var, jh70 jh70Var2, eke0 eke0Var2, oeg0 oeg0Var, v88 v88Var, mne mneVar, ahu ahuVar, ouu ouuVar, lk5 lk5Var) {
        this.f5743a = (byte) 27;
        oeg0Var.getClass();
        this.b = kd30Var;
        this.c = pmi0Var;
        this.d = iw20Var;
        this.e = zx10Var;
        this.f = r990Var;
        this.g = jh70Var2;
        this.h = oeg0Var;
        this.i = v88Var;
        this.j = mneVar;
        this.k = ahuVar;
        this.l = ouuVar;
        this.m = lk5Var;
    }

    public daf(viu viuVar, azt aztVar, yfu yfuVar, n4u n4uVar, spc spcVar, h0q0 h0q0Var, v7i v7iVar, x4v x4vVar, ocl oclVar, t4v t4vVar, wsc wscVar, pru pruVar) {
        this.f5743a = (byte) 22;
        this.b = viuVar;
        this.c = aztVar;
        this.d = yfuVar;
        this.e = n4uVar;
        this.f = spcVar;
        this.g = h0q0Var;
        this.h = v7iVar;
        this.i = x4vVar;
        this.j = oclVar;
        this.k = t4vVar;
        this.l = wscVar;
        this.m = maz.b(new b6u(pruVar, (byte) 10));
    }

    public daf(ctf0 ctf0Var, mne mneVar, n4u n4uVar, eke0 eke0Var, ii iiVar, wdk0 wdk0Var, ivn ivnVar, m1e m1eVar, ifp ifpVar, g2v g2vVar, vqc vqcVar, rrc rrcVar) {
        this.f5743a = (byte) 26;
        ctf0Var.getClass();
        iiVar.getClass();
        wdk0Var.getClass();
        m1eVar.getClass();
        this.b = ctf0Var;
        this.c = mneVar;
        this.d = n4uVar;
        this.e = eke0Var;
        this.f = iiVar;
        this.g = wdk0Var;
        this.h = ivnVar;
        this.i = m1eVar;
        this.j = ifpVar;
        this.k = g2vVar;
        this.l = vqcVar;
        this.m = rrcVar;
    }

    public daf() {
        this.f5743a = (byte) 25;
        this.b = new wgg0();
        this.c = new wgg0();
        this.d = new wgg0();
        this.e = new wgg0();
        this.f = new q0(0.0f);
        this.g = new q0(0.0f);
        this.h = new q0(0.0f);
        this.i = new q0(0.0f);
        byte b = 0;
        this.j = new ujn(b);
        this.k = new ujn(b);
        this.l = new ujn(b);
        this.m = new ujn(b);
    }

    public daf(cad cadVar, i1w0 i1w0Var, duj dujVar, gii0 gii0Var, ocl oclVar, ctf0 ctf0Var, m1e m1eVar, knf0 knf0Var, kuy kuyVar, String str) {
        this.f5743a = (byte) 13;
        this.b = cadVar;
        this.c = gii0Var;
        this.d = knf0Var;
        this.e = kuyVar;
        this.f = oclVar;
        this.g = ctf0Var;
        this.h = m1eVar;
        this.i = str;
        this.j = dujVar;
        this.k = i1w0Var;
        byte b = 27;
        this.l = mbl.b(new gji(this, 1, b));
        this.m = new gji(this, 0, b);
    }

    public daf(cad cadVar, pru pruVar, duj dujVar, sa10 sa10Var, ocl oclVar, ctf0 ctf0Var, pbt pbtVar, gst0 gst0Var, i1w0 i1w0Var) {
        this.f5743a = (byte) 4;
        this.b = cadVar;
        this.c = pbtVar;
        this.d = gst0Var;
        this.e = pruVar;
        this.f = ctf0Var;
        this.g = dujVar;
        this.h = i1w0Var;
        this.i = oclVar;
        this.j = sa10Var;
        byte b = 17;
        this.k = new r5i(this, 0, b);
        this.l = new r5i(this, 1, b);
        this.m = new r5i(this, 2, b);
    }

    public daf(cad cadVar, wsf0 wsf0Var, duj dujVar, gii0 gii0Var, i1w0 i1w0Var, Long l, String str, Double d, btt0 btt0Var, ctf0 ctf0Var, sa10 sa10Var) {
        this.f5743a = (byte) 18;
        this.b = gii0Var;
        this.c = btt0Var;
        this.d = wsf0Var;
        this.e = dujVar;
        this.f = i1w0Var;
        this.g = sa10Var;
        this.h = cadVar;
        this.i = ctf0Var;
        this.j = l;
        this.k = str;
        this.l = d;
        this.m = new yxi(this, (byte) 5);
    }

    public daf(iw20 iw20Var, String str, GlobalSearchContainerSettings globalSearchContainerSettings, i1w0 i1w0Var, ctf0 ctf0Var, s31 s31Var, cyu cyuVar, mne mneVar, wdk0 wdk0Var, g2v g2vVar, ouu ouuVar) {
        this.f5743a = (byte) 6;
        this.b = str;
        this.c = iw20Var;
        this.d = ctf0Var;
        this.e = i1w0Var;
        this.f = ouuVar;
        this.g = s31Var;
        this.h = cyuVar;
        this.i = mneVar;
        this.j = globalSearchContainerSettings;
        this.k = g2vVar;
        this.l = wdk0Var;
        this.m = n0k0.a(new ugi(this, (byte) 21));
    }

    public daf(cad cadVar, i1w0 i1w0Var, btt0 btt0Var, knf0 knf0Var, ocl oclVar, ctf0 ctf0Var, gii0 gii0Var, duj dujVar, r9u r9uVar, m1e m1eVar, Long l) {
        this.f5743a = (byte) 1;
        this.b = l;
        this.c = gii0Var;
        this.d = cadVar;
        this.e = knf0Var;
        this.f = btt0Var;
        this.g = m1eVar;
        this.h = dujVar;
        this.i = ctf0Var;
        this.j = oclVar;
        this.k = i1w0Var;
        this.l = r9uVar;
        this.m = new t5i(this, (byte) 7);
    }

    public daf(cad cadVar, wsf0 wsf0Var, i1w0 i1w0Var, String str, String str2, gii0 gii0Var, g2v g2vVar, m1e m1eVar, ctf0 ctf0Var, duj dujVar, knf0 knf0Var) {
        this.f5743a = (byte) 17;
        this.b = str2;
        this.c = str;
        this.d = dujVar;
        this.e = cadVar;
        this.f = wsf0Var;
        this.g = gii0Var;
        this.h = knf0Var;
        this.i = m1eVar;
        this.j = g2vVar;
        this.k = i1w0Var;
        this.l = ctf0Var;
        this.m = new xvi(this, (byte) 22);
    }

    public daf(cad cadVar, kki kkiVar, duj dujVar, gii0 gii0Var, String str, m1e m1eVar, i1w0 i1w0Var, Long l, ocl oclVar, r9u r9uVar, knf0 knf0Var) {
        this.f5743a = (byte) 8;
        this.b = dujVar;
        this.c = gii0Var;
        this.d = knf0Var;
        this.e = cadVar;
        this.f = m1eVar;
        this.g = i1w0Var;
        this.h = kkiVar;
        this.i = oclVar;
        this.j = str;
        this.k = l;
        this.l = r9uVar;
        this.m = new tii(this, (byte) 19);
    }

    public daf(cad cadVar, nh70 nh70Var, String str, Long l, i1w0 i1w0Var, duj dujVar, gii0 gii0Var, m1e m1eVar, ocl oclVar, ctf0 ctf0Var, knf0 knf0Var) {
        byte b = 19;
        this.f5743a = (byte) 19;
        this.b = ctf0Var;
        this.c = gii0Var;
        this.d = knf0Var;
        this.e = cadVar;
        this.f = m1eVar;
        this.g = i1w0Var;
        this.h = dujVar;
        this.i = str;
        this.j = l;
        this.k = oclVar;
        this.l = mbl.b(new msi(this, 1, b));
        this.m = new msi(this, 0, b);
    }

    public daf(d1p d1pVar, poq0 poq0Var, epi0 epi0Var, zg zgVar, czt cztVar, lbu lbuVar, mne mneVar, ctf0 ctf0Var, pru pruVar, i1w0 i1w0Var, gst0 gst0Var) {
        this.f5743a = (byte) 10;
        this.b = d1pVar;
        this.c = zgVar;
        this.d = mneVar;
        this.e = ctf0Var;
        this.f = poq0Var;
        this.g = i1w0Var;
        this.h = cztVar;
        this.i = pruVar;
        this.j = gst0Var;
        this.k = epi0Var;
        this.l = lbuVar;
        this.m = new rki(this, (byte) 21);
    }

    public daf(cad cadVar, d1p d1pVar, String str, i1w0 i1w0Var, Integer num, knf0 knf0Var, gii0 gii0Var, g2v g2vVar, m1e m1eVar, ygm0 ygm0Var, yo4 yo4Var) {
        this.f5743a = (byte) 9;
        this.b = num;
        this.c = cadVar;
        this.d = gii0Var;
        this.e = ygm0Var;
        this.f = knf0Var;
        this.g = m1eVar;
        this.h = g2vVar;
        this.i = i1w0Var;
        this.j = yo4Var;
        this.k = d1pVar;
        this.l = str;
        this.m = n0k0.a(new rki(this, (byte) 11));
    }

    public daf(cad cadVar, wsf0 wsf0Var, Long l, String str, gst0 gst0Var, btt0 btt0Var, gii0 gii0Var, knf0 knf0Var, x0u x0uVar, r9s0 r9s0Var) {
        this.f5743a = (byte) 2;
        this.b = l;
        this.c = str;
        this.d = cadVar;
        this.e = btt0Var;
        this.f = gii0Var;
        this.g = r9s0Var;
        this.h = knf0Var;
        this.i = gst0Var;
        this.j = x0uVar;
        this.k = wsf0Var;
        byte b = 3;
        this.l = mbl.b(new f7i(this, 1, b));
        this.m = new f7i(this, 0, b);
    }

    public daf(cad cadVar, i1w0 i1w0Var, h840 h840Var, knf0 knf0Var, btt0 btt0Var, gii0 gii0Var, ctf0 ctf0Var, ntu ntuVar, peg0 peg0Var, oeg0 oeg0Var, duj dujVar) {
        this.f5743a = (byte) 12;
        this.b = i1w0Var;
        this.c = dujVar;
        this.d = ctf0Var;
        this.e = oeg0Var;
        this.f = cadVar;
        this.g = peg0Var;
        this.h = h840Var;
        this.i = gii0Var;
        this.j = knf0Var;
        this.k = btt0Var;
        this.l = ntuVar;
        this.m = new eni(this, (byte) 18);
    }

    public daf(mne mneVar, sp4 sp4Var, d1p d1pVar, mq4 mq4Var, kt2 kt2Var, wdk0 wdk0Var, ctf0 ctf0Var, i1w0 i1w0Var, duj dujVar, rou rouVar, pmi0 pmi0Var, g2v g2vVar) {
        this.f5743a = (byte) 3;
        this.b = mq4Var;
        this.c = sp4Var;
        this.d = rouVar;
        this.e = ctf0Var;
        this.f = pmi0Var;
        this.g = i1w0Var;
        this.h = kt2Var;
        this.i = d1pVar;
        this.j = dujVar;
        this.k = mneVar;
        this.l = g2vVar;
        this.m = new n8i(this, (byte) 2);
    }

    public daf(gr70 gr70Var, cad cadVar, String str, m1e m1eVar, uq70 uq70Var, ol olVar, js70 js70Var, gii0 gii0Var) {
        this.f5743a = (byte) 11;
        this.b = str;
        this.c = cadVar;
        this.d = gr70Var;
        this.e = uq70Var;
        this.f = m1eVar;
        this.g = gii0Var;
        this.h = olVar;
        this.i = js70Var;
        byte b = 5;
        this.j = n0k0.a(new omi(this, 1, b));
        this.k = n0k0.a(new omi(this, 2, b));
        this.l = n0k0.a(new omi(this, 3, b));
        this.m = new omi(this, 0, b);
    }

    public daf(cad cadVar, pyg pygVar, iip iipVar, duj dujVar, DisciplineListParams disciplineListParams, cyu cyuVar, zr1 zr1Var, kt2 kt2Var, pmi pmiVar, g2v g2vVar, m1e m1eVar) {
        this.f5743a = (byte) 5;
        this.b = disciplineListParams;
        this.c = pygVar;
        this.d = kt2Var;
        this.e = iipVar;
        this.f = pmiVar;
        this.g = cyuVar;
        this.h = zr1Var;
        this.i = dujVar;
        this.j = g2vVar;
        this.k = m1eVar;
        this.l = cadVar;
        this.m = new uci(this, (byte) 24);
    }

    public /* synthetic */ daf(boolean z) {
        this.f5743a = (byte) 25;
    }

    public daf(pmi0 pmi0Var, sxs0 sxs0Var, std stdVar, gst gstVar, ilp0 ilp0Var, rl70 rl70Var, pru pruVar, nai naiVar, qzt qztVar, htz htzVar, qv2 qv2Var, h3c h3cVar, s2m0 s2m0Var, cge0 cge0Var, g9m0 g9m0Var) {
        this.f5743a = (byte) 16;
        this.b = naiVar;
        this.c = rl70Var;
        this.d = qztVar;
        this.e = htzVar;
        this.f = pruVar;
        this.g = s2m0Var;
        this.h = cge0Var;
        this.i = g9m0Var;
        this.j = pmi0Var;
        this.k = qv2Var;
        this.l = h3cVar;
        this.m = n0k0.a(new rti(this, (byte) 16));
    }

    public daf(cad cadVar, ugf0 ugf0Var, ddm0 ddm0Var, tgk tgkVar, OnexDatabase onexDatabase, gii0 gii0Var, knf0 knf0Var, sjl0 sjl0Var, wyu wyuVar, ntu ntuVar, fsd fsdVar) {
        this.f5743a = (byte) 15;
        this.b = ddm0Var;
        this.c = cadVar;
        this.d = gii0Var;
        this.e = tgkVar;
        this.f = knf0Var;
        this.g = ntuVar;
        this.h = fsdVar;
        this.i = wyuVar;
        this.j = onexDatabase;
        this.k = sjl0Var;
        this.l = ugf0Var;
        this.m = mbl.b(new rti(this, (byte) 13));
    }

    public daf(j77 j77Var, btt0 btt0Var, knf0 knf0Var, t47 t47Var, gii0 gii0Var, t37 t37Var, sln slnVar, xkn xknVar, u0f u0fVar, aln alnVar, jnn jnnVar, qp qpVar) {
        this.f5743a = (byte) 7;
        this.b = j77Var;
        this.c = t37Var;
        this.d = gii0Var;
        this.e = btt0Var;
        this.f = knf0Var;
        this.g = t47Var;
        this.h = xknVar;
        this.i = slnVar;
        this.j = u0fVar;
        this.k = alnVar;
        this.l = jnnVar;
        this.m = qpVar;
    }
}
