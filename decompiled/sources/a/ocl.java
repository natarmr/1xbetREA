package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ocl implements kyn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25032a;

    public ocl(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 10:
                this.f25032a = new wgn(gii0Var, (byte) 15);
                break;
            case 11:
                this.f25032a = new wgn(gii0Var, (byte) 24);
                break;
            default:
                this.f25032a = new wgn(gii0Var, (byte) 1);
                break;
        }
    }

    public static mdm b(ocl oclVar, pb10 pb10Var, pdm pdmVar, int i, int i2, int i3, int i4, long j, long j2, int i5) {
        ldm ldmVar = ldm.b;
        pdm pdmVar2 = (i5 & 2) != 0 ? pdm.f26814a : pdmVar;
        if ((i5 & 4) != 0) {
            ldmVar = ldm.f19857a;
        }
        ldm ldmVar2 = ldmVar;
        int i6 = (i5 & 8) != 0 ? R.drawable.ic_glyph_circle_favourite : i;
        int i7 = (i5 & 16) != 0 ? R.string.empty_str : i2;
        int i8 = (i5 & 128) != 0 ? R.string.empty_str : i4;
        long j3 = (i5 & 256) != 0 ? 0L : j;
        long j4 = (i5 & 512) != 0 ? 0L : j2;
        oclVar.getClass();
        xuz xuzVar = pb10.c;
        int i9 = ((bzt) oclVar.f25032a).f3488a.a().r;
        xuzVar.getClass();
        return new mdm(xuz.a(pb10Var, i9), pdmVar2, ldmVar2, i6, i7, i3, R.string.empty_str, i8, j3, j4);
    }

    @Override // a.kyn
    public Object a(String str) {
        return ((tyn) this.f25032a).c(str, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r6 == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(a.sip r7, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage r8, a.jo20 r9, a.zje r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f25032a
            a.wgn r0 = (a.wgn) r0
            boolean r1 = r10 instanceof a.qat
            if (r1 == 0) goto L17
            r1 = r10
            a.qat r1 = (a.qat) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.qat r1 = new a.qat
            r1.<init>(r6, r10)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r10 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L57
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L71
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5e
            if (r6 != r5) goto L5a
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r4
            java.lang.Object r6 = r6.j(r7, r9, r1)
            if (r6 != r10) goto L57
            goto L70
        L57:
            a.dx5 r6 = (a.dx5) r6
            goto L73
        L5a:
            a.t9f.b()
            return r3
        L5e:
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r5
            java.lang.Object r6 = r6.i(r7, r9, r1)
            if (r6 != r10) goto L71
        L70:
            return r10
        L71:
            a.dx5 r6 = (a.dx5) r6
        L73:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ocl.c(a.sip, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage, a.jo20, a.zje):java.lang.Object");
    }

    public long d() {
        return ((m0w) ((rrd) this.f25032a).g).h;
    }

    public zj2 e(udl0 udl0Var) {
        fua fuaVar = (fua) this.f25032a;
        return new zj2(vtb.N(fuaVar.c.f18853a), fuaVar, udl0Var, (byte) 1);
    }

    public p6d f(boolean z) {
        v8v v8vVar = (v8v) ((gxu) this.f25032a).c;
        return z ? v8vVar.f37005a.c() : v8vVar.b.c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(long j, zje zjeVar) {
        n0u n0uVar;
        if (zjeVar instanceof n0u) {
            n0uVar = (n0u) zjeVar;
            int i = n0uVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                n0uVar.l = i - Integer.MIN_VALUE;
            } else {
                n0uVar = new n0u(this, zjeVar);
            }
        } else {
            n0uVar = new n0u(this, zjeVar);
        }
        Object objD = n0uVar.j;
        Object obj = wne.f39444a;
        int i2 = n0uVar.l;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objD);
            uqe uqeVar = (uqe) this.f25032a;
            n0uVar.i = j;
            n0uVar.l = 1;
            objD = uqeVar.d(n0uVar);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = n0uVar.i;
            z1x.P(objD);
        }
        for (Object obj3 : (Iterable) objD) {
            if (((qkt) obj3).f28902a == j) {
                obj2 = obj3;
                break;
            }
        }
        qkt qktVar = (qkt) obj2;
        return new Long(qktVar != null ? qktVar.e : 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, zje zjeVar) {
        ypt yptVar;
        if (zjeVar instanceof ypt) {
            yptVar = (ypt) zjeVar;
            int i = yptVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                yptVar.l = i - Integer.MIN_VALUE;
            } else {
                yptVar = new ypt(this, zjeVar);
            }
        } else {
            yptVar = new ypt(this, zjeVar);
        }
        Object objD = yptVar.j;
        wne wneVar = wne.f39444a;
        int i2 = yptVar.l;
        if (i2 == 0) {
            z1x.P(objD);
            if (kotlin.text.c.x(str, "http://", false) || kotlin.text.c.x(str, "https://", false)) {
                return str;
            }
            ot10 ot10Var = (ot10) this.f25032a;
            yptVar.i = str;
            yptVar.l = 1;
            yyk yykVar = ot10Var.g;
            String updateUrl = yykVar.getUpdateUrl();
            if (updateUrl.length() == 0) {
                updateUrl = yykVar.getApiEndpoint();
            }
            objD = Intrinsics.d(updateUrl, yykVar.getStandardUrl()) ? ot10Var.d(yptVar) : updateUrl;
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = yptVar.i;
            z1x.P(objD);
        }
        return objD + Separators.SLASH + str;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
    
        if (r0 == r11) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.String r18, java.io.File r19, long r20, a.zje r22) throws a.c44 {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ocl.i(java.lang.String, java.io.File, long, a.zje):java.lang.Object");
    }

    public List j() {
        return CollectionsKt.L0(((ev7) ((mii0) this.f25032a).d).f8454a);
    }

    public List k(sff0 sff0Var) {
        ArrayList arrayList = new ArrayList();
        if (!sff0Var.b.b) {
            arrayList.add(nev0.AGGREGATOR);
        }
        if (!sff0Var.d.b) {
            arrayList.add(nev0.XGAMES);
        }
        if (!sff0Var.c.b) {
            arrayList.add(nev0.CYBER);
        }
        if (!sff0Var.V) {
            arrayList.add(nev0.SEARCH);
        }
        if (!sff0Var.A) {
            arrayList.add(nev0.RESULTS);
        }
        return CollectionsKt.n0((List) ((y3v) ((iw20) this.f25032a).f15470a).d, CollectionsKt.P0(arrayList));
    }

    public void l(boolean z) {
        ((d190) ((g090) this.f25032a).f10448a).f.o(null, Boolean.valueOf(z));
    }

    public boolean m() {
        return ((zoq0) ((dpi0) this.f25032a).f6468a).f44728a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(long j, zje zjeVar) {
        mqp mqpVar;
        if (zjeVar instanceof mqp) {
            mqpVar = (mqp) zjeVar;
            int i = mqpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqpVar.k = i - Integer.MIN_VALUE;
            } else {
                mqpVar = new mqp(this, zjeVar);
            }
        } else {
            mqpVar = new mqp(this, zjeVar);
        }
        Object obj = mqpVar.i;
        wne wneVar = wne.f39444a;
        int i2 = mqpVar.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        udg udgVar = (udg) this.f25032a;
        mqpVar.k = 1;
        Object objA = udgVar.a(j, mqpVar);
        return objA == wneVar ? wneVar : objA;
    }

    public ocl(ik6 ik6Var) {
        ik6Var.getClass();
        this.f25032a = ik6Var;
    }

    public ocl(crq crqVar) {
        crqVar.getClass();
        this.f25032a = crqVar;
    }

    public ocl(rmu0 rmu0Var) {
        rmu0Var.getClass();
        this.f25032a = rmu0Var;
    }

    public /* synthetic */ ocl(Object obj) {
        this.f25032a = obj;
    }

    public ocl(cad cadVar, izo izoVar) {
        this.f25032a = izoVar;
    }
}
