package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p1z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26228a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ ctf0 c;
    public final /* synthetic */ ocl d;
    public final /* synthetic */ vjp e;
    public final /* synthetic */ r9u f;

    public /* synthetic */ p1z(long j, ctf0 ctf0Var, ocl oclVar, vjp vjpVar, r9u r9uVar) {
        this.b = j;
        this.c = ctf0Var;
        this.d = oclVar;
        this.e = vjpVar;
        this.f = r9uVar;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fc A[LOOP:2: B:108:0x02f6->B:110:0x02fc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0314  */
    /* JADX WARN: Code duplicated, block: B:121:0x0328  */
    /* JADX WARN: Code duplicated, block: B:126:0x0338  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:157:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x0247  */
    /* JADX WARN: Code duplicated, block: B:81:0x0261  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        znp0 znp0VarA;
        znp0 znp0VarB;
        int i2;
        long j;
        a4x a4xVarO0;
        a4x a4xVarO1;
        Integer numValueOf;
        Integer numValueOf2;
        t0z t0zVar;
        a4x a4xVarO2;
        boolean z;
        int i3;
        ldr0 ldr0Var;
        List<g8r0> list;
        String strA;
        ldr0 ldr0Var2;
        ldr0 ldr0Var3;
        ArrayList arrayList;
        Iterator it;
        mdm mdmVar;
        i4 i4VarR0;
        byte b = this.f26228a;
        r9u r9uVar = this.f;
        vjp vjpVar = this.e;
        switch (b) {
            case 0:
                d1z d1zVar = (d1z) obj;
                d1zVar.getClass();
                v5l0 v5l0VarE = vjpVar.e();
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                ctf0 ctf0Var = this.c;
                ctf0Var.getClass();
                nc5 nc5Var = d1zVar.e;
                hxs0 hxs0Var = d1zVar.h;
                j9m0 j9m0VarC0 = ydx.c0(nc5Var);
                zdm0 zdm0Var = d1zVar.d;
                t0z t0zVar2 = new t0z(j9m0VarC0, zdm0Var);
                n3q n3qVar = d1zVar.f;
                int iOrdinal = n3qVar.ordinal();
                if (iOrdinal == 0) {
                    i = R.string.last_games;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            i = R.string.head_2_head_meeting;
                        } else {
                            t9f.b();
                        }
                        return null;
                    }
                    i = R.string.statistic_last_game_pager_next_games;
                }
                int i4 = i;
                boolean z2 = hxs0Var == null || (hxs0Var.f13827a.f32862a.isEmpty() && hxs0Var.b.f32862a.isEmpty());
                if (d1zVar.f5333a) {
                    return new k1z(t0zVar2, new f9m0(i4, null, 0L, false, false, null, null, false, 126), zD);
                }
                boolean z3 = d1zVar.b;
                ocl oclVar = this.d;
                if (z3) {
                    return new j1z(t0zVar2, new f9m0(i4, null, 0L, false, false, null, null, false, 126), zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (z2) {
                    return new j1z(t0zVar2, new f9m0(i4, null, 0L, false, false, null, null, true, 126), zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                boolean z4 = zdm0Var instanceof ydm0;
                ydm0 ydm0Var = z4 ? (ydm0) zdm0Var : null;
                if (ydm0Var != null) {
                    vdm0 vdm0Var = ydm0Var.b;
                    rdm0 rdm0Var = vdm0Var instanceof rdm0 ? (rdm0) vdm0Var : null;
                    if (rdm0Var != null) {
                        znp0VarA = rdm0Var.a();
                    } else {
                        znp0VarA = null;
                    }
                } else {
                    znp0VarA = null;
                }
                ydm0 ydm0Var2 = z4 ? (ydm0) zdm0Var : null;
                if (ydm0Var2 != null) {
                    vdm0 vdm0Var2 = ydm0Var2.b;
                    rdm0 rdm0Var2 = vdm0Var2 instanceof rdm0 ? (rdm0) vdm0Var2 : null;
                    if (rdm0Var2 != null) {
                        znp0VarB = rdm0Var2.b();
                    } else {
                        znp0VarB = null;
                    }
                } else {
                    znp0VarB = null;
                }
                f9m0 f9m0Var = new f9m0(i4, null, 0L, false, false, null, null, true, 126);
                int i5 = d1zVar.c;
                String str = znp0VarA != null ? znp0VarA.b : null;
                if (str == null) {
                    str = "";
                }
                String str2 = znp0VarB != null ? znp0VarB.b : null;
                i4 i4VarG0 = dyb.g0(str, str2 != null ? str2 : "");
                t0z t0zVar3 = t0zVar2;
                long j2 = this.b;
                if (hxs0Var != null) {
                    ArrayList arrayList2 = hxs0Var.f13827a.f32862a;
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        long j3 = j2;
                        ArrayList arrayList4 = arrayList3;
                        arrayList4.add(fww.J((qk80) it2.next(), n3qVar, j3, ctf0Var, v5l0VarE));
                        arrayList3 = arrayList4;
                        i5 = i5;
                        j2 = j3;
                    }
                    long j4 = j2;
                    i2 = i5;
                    j = j4;
                    a4xVarO0 = dyb.o0(arrayList3);
                    if (a4xVarO0 == null) {
                    }
                    a4x a4xVar = a4xVarO0;
                    if (hxs0Var != null) {
                        ArrayList arrayList5 = hxs0Var.b.f32862a;
                        arrayList = new ArrayList(r3d.q(arrayList5, 10));
                        it = arrayList5.iterator();
                        while (it.hasNext()) {
                            arrayList.add(fww.J((qk80) it.next(), n3qVar, j, ctf0Var, v5l0VarE));
                        }
                        a4xVarO1 = dyb.o0(arrayList);
                        if (a4xVarO1 == null) {
                            a4xVarO1 = lak0.c;
                        }
                    } else {
                        a4xVarO1 = lak0.c;
                    }
                    a4x a4xVar2 = a4xVarO1;
                    if (hxs0Var != null || (ldr0Var3 = hxs0Var.f13827a.b) == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = Integer.valueOf(ldr0Var3.f19865a);
                    }
                    if (hxs0Var != null || (ldr0Var2 = hxs0Var.f13827a.b) == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = Integer.valueOf(ldr0Var2.b);
                    }
                    Object[] objArr = {numValueOf, numValueOf2};
                    lsm0 lsm0Var = ctf0Var.b;
                    String strA2 = lsm0Var.a(R.string.statistic_last_game_top_item, Arrays.copyOf(objArr, 2));
                    if (hxs0Var == null && (ldr0Var = hxs0Var.f13827a.b) != null && (list = ldr0Var.c) != null) {
                        ArrayList arrayList6 = new ArrayList(r3d.q(list, 10));
                        for (g8r0 g8r0Var : list) {
                            fck fckVar = g8r0Var.f10881a;
                            int i6 = g8r0Var.d;
                            int iOrdinal2 = fckVar.ordinal();
                            if (iOrdinal2 == 0) {
                                strA = lsm0Var.a(R.string.statistic_last_game_win, Arrays.copyOf(new Object[0], 0));
                            } else if (iOrdinal2 == 1) {
                                strA = lsm0Var.a(R.string.australiaGoals, Arrays.copyOf(new Object[0], 0));
                            } else if (iOrdinal2 == 2) {
                                strA = lsm0Var.a(R.string.red_cards, Arrays.copyOf(new Object[0], 0));
                            } else {
                                if (iOrdinal2 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                strA = lsm0Var.a(R.string.yellow_cards, Arrays.copyOf(new Object[0], 0));
                            }
                            arrayList6.add(new gin0(w6x.n(g8r0Var.b, i6, Separators.SLASH), w6x.n(g8r0Var.c, i6, Separators.SLASH), strA));
                            t0zVar3 = t0zVar3;
                        }
                        t0zVar = t0zVar3;
                        a4xVarO2 = dyb.o0(arrayList6);
                        if (a4xVarO2 == null) {
                        }
                        z = d1zVar.i;
                        if (z) {
                            i3 = R.drawable.ic_glyph_chevron_up_small;
                        } else {
                            i3 = R.drawable.ic_glyph_chevron_down_small;
                        }
                        return new l1z(t0zVar, f9m0Var, zD, n3qVar, i2, i4VarG0, a4xVar, a4xVar2, new csv(i3, a4xVarO2, strA2, z), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                    }
                    t0zVar = t0zVar3;
                    a4xVarO2 = lak0.c;
                    z = d1zVar.i;
                    if (z) {
                        i3 = R.drawable.ic_glyph_chevron_up_small;
                    } else {
                        i3 = R.drawable.ic_glyph_chevron_down_small;
                    }
                    return new l1z(t0zVar, f9m0Var, zD, n3qVar, i2, i4VarG0, a4xVar, a4xVar2, new csv(i3, a4xVarO2, strA2, z), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                }
                i2 = i5;
                j = j2;
                a4xVarO0 = lak0.c;
                a4x a4xVar3 = a4xVarO0;
                if (hxs0Var != null) {
                    ArrayList arrayList7 = hxs0Var.b.f32862a;
                    arrayList = new ArrayList(r3d.q(arrayList7, 10));
                    it = arrayList7.iterator();
                    while (it.hasNext()) {
                        arrayList.add(fww.J((qk80) it.next(), n3qVar, j, ctf0Var, v5l0VarE));
                    }
                    a4xVarO1 = dyb.o0(arrayList);
                    if (a4xVarO1 == null) {
                        a4xVarO1 = lak0.c;
                    }
                } else {
                    a4xVarO1 = lak0.c;
                }
                a4x a4xVar4 = a4xVarO1;
                if (hxs0Var != null) {
                    numValueOf = null;
                } else {
                    numValueOf = null;
                }
                if (hxs0Var != null) {
                    numValueOf2 = null;
                } else {
                    numValueOf2 = null;
                }
                Object[] objArr2 = {numValueOf, numValueOf2};
                lsm0 lsm0Var2 = ctf0Var.b;
                String strA3 = lsm0Var2.a(R.string.statistic_last_game_top_item, Arrays.copyOf(objArr2, 2));
                if (hxs0Var == null) {
                    t0zVar = t0zVar3;
                    a4xVarO2 = lak0.c;
                } else {
                    t0zVar = t0zVar3;
                    a4xVarO2 = lak0.c;
                }
                z = d1zVar.i;
                if (z) {
                    i3 = R.drawable.ic_glyph_chevron_up_small;
                } else {
                    i3 = R.drawable.ic_glyph_chevron_down_small;
                }
                return new l1z(t0zVar, f9m0Var, zD, n3qVar, i2, i4VarG0, a4xVar3, a4xVar4, new csv(i3, a4xVarO2, strA3, z), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
            default:
                sgt0 sgt0Var = (sgt0) obj;
                sgt0Var.getClass();
                boolean zH = this.c.h();
                v5l0 v5l0VarE2 = vjpVar.e();
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                boolean zD2 = j1q0Var2.f15748a.d(ygpVar2);
                boolean z5 = sgt0Var.b;
                boolean z6 = sgt0Var.f32179a;
                List list2 = sgt0Var.c;
                ocl oclVar2 = this.d;
                mdm mdmVarB = z5 ? ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE) : (!list2.isEmpty() || z6) ? null : ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990);
                if (z6) {
                    zft0 zft0Var = zft0.f44316a;
                    i4VarR0 = dyb.g0(zft0Var, zft0Var, zft0Var, zft0Var);
                    mdmVar = mdmVarB;
                } else {
                    ArrayList arrayList8 = new ArrayList(r3d.q(list2, 10));
                    for (Iterator it3 = list2.iterator(); it3.hasNext(); it3 = it3) {
                        uft0 uft0Var = (uft0) it3.next();
                        uft0Var.getClass();
                        ufp0 ufp0Var = uft0Var.d;
                        List list3 = ufp0Var.e;
                        ufp0 ufp0Var2 = uft0Var.e;
                        List list4 = ufp0Var2.e;
                        cys0 cys0VarV = wvb.V(this.b, q3d.j(ufp0Var, ufp0Var2));
                        y3n0 y3n0Var = (y3n0) CollectionsKt.f0(list3);
                        String str3 = y3n0Var != null ? y3n0Var.b : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                        String strT = vsm0.t(str3);
                        y3n0 y3n0Var2 = (y3n0) CollectionsKt.f0(list4);
                        String str4 = y3n0Var2 != null ? y3n0Var2.b : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        ArrayList arrayList9 = arrayList8;
                        kbo kboVar = new kbo(ufp0Var.b, a8k0.w(ufp0Var.d, list3, cys0VarV), ufp0Var2.b, a8k0.w(ufp0Var2.d, list4, cys0VarV), strT, vsm0.t(str4), "", "", true, "", "", uft0Var.f.b(), 0, zH, iun.f15405a);
                        v5l0 v5l0Var = v5l0VarE2;
                        arrayList9.add(new yft0(ntb.c0(uft0Var.b, cys0VarV, kboVar, v5l0Var, oim0.f25320a), uft0Var));
                        mdmVarB = mdmVarB;
                        arrayList8 = arrayList9;
                        v5l0VarE2 = v5l0Var;
                    }
                    mdmVar = mdmVarB;
                    i4VarR0 = dyb.r0(arrayList8);
                }
                return new ugt0(mdmVar, i4VarR0, zD2);
        }
    }

    public /* synthetic */ p1z(vjp vjpVar, r9u r9uVar, ctf0 ctf0Var, ocl oclVar, long j) {
        this.e = vjpVar;
        this.f = r9uVar;
        this.c = ctf0Var;
        this.d = oclVar;
        this.b = j;
    }
}
