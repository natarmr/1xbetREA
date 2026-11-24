package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ek5 extends dtb {
    public static final ek5 b = new ek5(0);
    public static final ek5 c = new ek5(1);
    public static final ek5 d = new ek5(2);
    public static final ek5 e = new ek5(3);
    public static final ek5 f = new ek5(4);
    public static final ek5 g = new ek5(5);
    public static final ek5 h = new ek5(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7937a;

    public /* synthetic */ ek5(byte b2) {
        this.f7937a = b2;
    }

    private final Object W(Object obj, Object obj2) {
        ofs ofsVar = (ofs) obj;
        ofs ofsVar2 = (ofs) obj2;
        ofsVar.getClass();
        ofsVar2.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if ((ofsVar2 instanceof uca) && (ofsVar instanceof uca)) {
            uca ucaVar = (uca) ofsVar;
            uca ucaVar2 = (uca) ofsVar2;
            hg30 hg30Var = ucaVar2.g;
            ArrayList arrayList = new ArrayList();
            hg30 hg30Var2 = ucaVar.g;
            ohm0 ohm0Var = ucaVar2.c;
            String str = ucaVar2.e;
            if (!hg30Var2.equals(hg30Var)) {
                arrayList.add(new vds(hg30Var));
            }
            if (!Intrinsics.d(ucaVar.e, str)) {
                arrayList.add(new ids(str));
            }
            ohm0 ohm0Var2 = ucaVar.c;
            if ((ohm0Var2 instanceof tpp0) && (ohm0Var instanceof tpp0)) {
                tpp0 tpp0Var = (tpp0) ohm0Var2;
                tpp0 tpp0Var2 = (tpp0) ohm0Var;
                boolean z = tpp0Var.c;
                boolean z2 = tpp0Var2.c;
                String str2 = tpp0Var2.f;
                String str3 = tpp0Var2.e;
                if (z != z2) {
                    arrayList.add(new jds(tpp0Var2.g));
                }
                if (tpp0Var.d != tpp0Var2.d) {
                    arrayList.add(new rds(tpp0Var2.h));
                }
                if (!tpp0Var.e.equals(str3)) {
                    arrayList.add(new lds(str3));
                }
                if (!tpp0Var.f.equals(str2)) {
                    arrayList.add(new tds(str2));
                }
            } else if ((ohm0Var2 instanceof spp0) && (ohm0Var instanceof spp0)) {
                spp0 spp0Var = (spp0) ohm0Var2;
                spp0 spp0Var2 = (spp0) ohm0Var;
                boolean z3 = spp0Var.e;
                boolean z4 = spp0Var2.e;
                String str4 = spp0Var2.l;
                String str5 = spp0Var2.k;
                String str6 = spp0Var2.j;
                String str7 = spp0Var2.i;
                if (z3 != z4) {
                    arrayList.add(new nds(spp0Var2.m));
                }
                if (spp0Var.f != spp0Var2.f) {
                    arrayList.add(new ods(spp0Var2.n));
                }
                if (spp0Var.g != spp0Var2.g) {
                    arrayList.add(new pds(spp0Var2.o));
                }
                if (spp0Var.h != spp0Var2.h) {
                    arrayList.add(new qds(spp0Var2.p));
                }
                if (!spp0Var.i.equals(str7)) {
                    arrayList.add(new kds(str7));
                }
                if (!spp0Var.j.equals(str6)) {
                    arrayList.add(new mds(str6));
                }
                if (!spp0Var.k.equals(str5)) {
                    arrayList.add(new sds(str5));
                }
                if (!spp0Var.l.equals(str4)) {
                    arrayList.add(new uds(str4));
                }
            }
            linkedHashSet.add(arrayList);
        }
        if ((ofsVar2 instanceof yca) && (ofsVar instanceof yca)) {
            yca ycaVar = (yca) ofsVar;
            yca ycaVar2 = (yca) ofsVar2;
            ank0 ank0Var = ycaVar2.b;
            ArrayList arrayList2 = new ArrayList();
            ank0 ank0Var2 = ycaVar.b;
            ohm0 ohm0Var3 = ycaVar2.c;
            hg30 hg30Var3 = ycaVar2.i;
            ank0 ank0Var3 = ycaVar2.g;
            if (!ank0Var2.equals(ank0Var)) {
                arrayList2.add(new yds(ank0Var));
            }
            if (!ank0Var3.equals(ycaVar.g)) {
                arrayList2.add(new xds(ank0Var3));
            }
            if (!ycaVar.i.equals(hg30Var3)) {
                arrayList2.add(new nes(hg30Var3));
            }
            int i = ycaVar.d;
            int i2 = ycaVar2.d;
            if (i != i2) {
                arrayList2.add(new ces(i2));
            }
            int i3 = ycaVar.e;
            int i4 = ycaVar2.e;
            if (i3 != i4) {
                arrayList2.add(new les(i4));
            }
            ohm0 ohm0Var4 = ycaVar.c;
            if ((ohm0Var4 instanceof tpp0) && (ohm0Var3 instanceof tpp0)) {
                tpp0 tpp0Var3 = (tpp0) ohm0Var4;
                tpp0 tpp0Var4 = (tpp0) ohm0Var3;
                boolean z5 = tpp0Var3.c;
                boolean z6 = tpp0Var4.c;
                String str8 = tpp0Var4.f;
                String str9 = tpp0Var4.e;
                if (z5 != z6) {
                    arrayList2.add(new zds(tpp0Var4.g));
                }
                if (tpp0Var3.d != tpp0Var4.d) {
                    arrayList2.add(new ies(tpp0Var4.h));
                }
                if (!tpp0Var3.e.equals(str9)) {
                    arrayList2.add(new bes(str9));
                }
                if (!tpp0Var3.f.equals(str8)) {
                    arrayList2.add(new kes(str8));
                }
            } else if ((ohm0Var4 instanceof spp0) && (ohm0Var3 instanceof spp0)) {
                spp0 spp0Var3 = (spp0) ohm0Var4;
                spp0 spp0Var4 = (spp0) ohm0Var3;
                boolean z7 = spp0Var3.e;
                boolean z8 = spp0Var4.e;
                String str10 = spp0Var4.l;
                String str11 = spp0Var4.k;
                String str12 = spp0Var4.j;
                String str13 = spp0Var4.i;
                if (z7 != z8) {
                    arrayList2.add(new ees(spp0Var4.m));
                }
                if (spp0Var3.f != spp0Var4.f) {
                    arrayList2.add(new fes(spp0Var4.n));
                }
                if (spp0Var3.g != spp0Var4.g) {
                    arrayList2.add(new ges(spp0Var4.o));
                }
                if (spp0Var3.h != spp0Var4.h) {
                    arrayList2.add(new hes(spp0Var4.p));
                }
                if (!spp0Var3.i.equals(str13)) {
                    arrayList2.add(new aes(str13));
                }
                if (!spp0Var3.j.equals(str12)) {
                    arrayList2.add(new des(str12));
                }
                if (!spp0Var3.k.equals(str11)) {
                    arrayList2.add(new jes(str11));
                }
                if (!spp0Var3.l.equals(str10)) {
                    arrayList2.add(new mes(str10));
                }
            }
            linkedHashSet.add(arrayList2);
        }
        if ((ofsVar2 instanceof lka) && (ofsVar instanceof lka)) {
            hg30 hg30Var4 = ((lka) ofsVar2).g;
            ArrayList arrayList3 = new ArrayList();
            if (!((lka) ofsVar).g.equals(hg30Var4)) {
                arrayList3.add(new ifs(hg30Var4));
            }
            linkedHashSet.add(arrayList3);
        }
        if ((ofsVar2 instanceof mka) && (ofsVar instanceof mka)) {
            mka mkaVar = (mka) ofsVar;
            mka mkaVar2 = (mka) ofsVar2;
            ank0 ank0Var4 = mkaVar2.b;
            ArrayList arrayList4 = new ArrayList();
            ank0 ank0Var5 = mkaVar.b;
            hg30 hg30Var5 = mkaVar2.g;
            ank0 ank0Var6 = mkaVar2.f;
            if (!ank0Var5.equals(ank0Var4)) {
                arrayList4.add(new kfs(ank0Var4));
            }
            if (!ank0Var6.equals(mkaVar.f)) {
                arrayList4.add(new jfs(ank0Var6));
            }
            if (!mkaVar.g.equals(hg30Var5)) {
                arrayList4.add(new lfs(hg30Var5));
            }
            linkedHashSet.add(arrayList4);
        }
        if ((ofsVar2 instanceof jda) && (ofsVar instanceof jda)) {
            hg30 hg30Var6 = ((jda) ofsVar2).f;
            ArrayList arrayList5 = new ArrayList();
            if (!((jda) ofsVar).f.equals(hg30Var6)) {
                arrayList5.add(new nfs(hg30Var6));
            }
            linkedHashSet.add(arrayList5);
        }
        if ((ofsVar2 instanceof qca) && (ofsVar instanceof qca)) {
            qca qcaVar = (qca) ofsVar;
            qca qcaVar2 = (qca) ofsVar2;
            ank0 ank0Var7 = qcaVar2.e;
            ArrayList arrayList6 = new ArrayList();
            ohm0 ohm0Var5 = qcaVar.d;
            if (ohm0Var5 instanceof tpp0) {
                ohm0 ohm0Var6 = qcaVar2.d;
                if (ohm0Var6 instanceof tpp0) {
                    tpp0 tpp0Var5 = (tpp0) ohm0Var5;
                    tpp0 tpp0Var6 = (tpp0) ohm0Var6;
                    boolean z9 = tpp0Var5.c;
                    boolean z10 = tpp0Var6.c;
                    String str14 = tpp0Var6.f;
                    String str15 = tpp0Var6.e;
                    if (z9 != z10) {
                        arrayList6.add(new qes(tpp0Var6.g));
                    }
                    if (tpp0Var5.d != tpp0Var6.d) {
                        arrayList6.add(new tes(tpp0Var6.h));
                    }
                    if (!tpp0Var5.e.equals(str15)) {
                        arrayList6.add(new res(str15));
                    }
                    if (!tpp0Var5.f.equals(str14)) {
                        arrayList6.add(new ues(str14));
                    }
                }
            }
            ank0 ank0Var8 = qcaVar.e;
            ank0 ank0Var9 = qcaVar2.c;
            ank0 ank0Var10 = qcaVar2.f;
            if (!ank0Var8.equals(ank0Var7)) {
                arrayList6.add(new ses(ank0Var7));
            }
            if (!qcaVar.f.equals(ank0Var10)) {
                arrayList6.add(new ves(ank0Var10));
            }
            if (!qcaVar.c.equals(ank0Var9)) {
                arrayList6.add(new pes(ank0Var9));
            }
            linkedHashSet.add(arrayList6);
        }
        if ((ofsVar2 instanceof kfa) && (ofsVar instanceof kfa)) {
            String str16 = ((kfa) ofsVar2).b;
            ArrayList arrayList7 = new ArrayList();
            if (!Intrinsics.d(((kfa) ofsVar).b, str16)) {
                arrayList7.add(new xes(str16));
            }
            linkedHashSet.add(arrayList7);
        }
        if ((ofsVar2 instanceof htq) && (ofsVar instanceof htq)) {
            htq htqVar = (htq) ofsVar;
            htq htqVar2 = (htq) ofsVar2;
            ank0 ank0Var11 = htqVar2.c;
            ArrayList arrayList8 = new ArrayList();
            ank0 ank0Var12 = htqVar.c;
            ank0 ank0Var13 = htqVar2.g;
            ank0 ank0Var14 = htqVar2.f;
            ank0 ank0Var15 = htqVar2.e;
            ank0 ank0Var16 = htqVar2.d;
            if (!ank0Var12.equals(ank0Var11)) {
                arrayList8.add(new zes(ank0Var11));
            }
            if (!htqVar.d.equals(ank0Var16)) {
                arrayList8.add(new afs(ank0Var16));
            }
            if (!htqVar.e.equals(ank0Var15)) {
                arrayList8.add(new yes(ank0Var15));
            }
            if (!htqVar.f.equals(ank0Var14)) {
                arrayList8.add(new cfs(ank0Var14));
            }
            ohm0 ohm0Var7 = htqVar.b;
            if (ohm0Var7 instanceof tpp0) {
                ohm0 ohm0Var8 = htqVar2.b;
                if (ohm0Var8 instanceof tpp0) {
                    tpp0 tpp0Var7 = (tpp0) ohm0Var7;
                    tpp0 tpp0Var8 = (tpp0) ohm0Var8;
                    boolean z11 = tpp0Var7.c;
                    boolean z12 = tpp0Var8.c;
                    String str17 = tpp0Var8.f;
                    String str18 = tpp0Var8.e;
                    if (z11 != z12) {
                        arrayList8.add(new dfs(tpp0Var8.g));
                    }
                    if (tpp0Var7.d != tpp0Var8.d) {
                        arrayList8.add(new ffs(tpp0Var8.h));
                    }
                    if (!tpp0Var7.e.equals(str18)) {
                        arrayList8.add(new efs(str18));
                    }
                    if (!tpp0Var7.f.equals(str17)) {
                        arrayList8.add(new gfs(str17));
                    }
                }
            }
            if (!htqVar.g.equals(ank0Var13)) {
                arrayList8.add(new bfs(ank0Var13));
            }
            linkedHashSet.add(arrayList8);
        }
        return linkedHashSet;
    }

    @Override // a.dtb
    public Object E(Object obj, Object obj2) {
        LinkedHashSet linkedHashSet = null;
        LinkedHashSet linkedHashSet2 = null;
        linkedHashSet = null;
        linkedHashSet = null;
        LinkedHashSet linkedHashSet3 = null;
        linkedHashSet = null;
        linkedHashSet = null;
        LinkedHashSet linkedHashSet4 = null;
        switch (this.f7937a) {
            case 2:
                rvy rvyVar = (rvy) obj;
                rvy rvyVar2 = (rvy) obj2;
                rvyVar.getClass();
                rvyVar2.getClass();
                n0x n0xVar = rvyVar2.b;
                if (!rvyVar.equals(rvyVar2)) {
                    linkedHashSet = new LinkedHashSet();
                    n0x n0xVar2 = rvyVar.b;
                    String str = rvyVar2.d;
                    if (!n0xVar2.equals(n0xVar)) {
                        linkedHashSet.add(new ovy(n0xVar, rvyVar2.c));
                    }
                    if (!Intrinsics.d(rvyVar.d, str)) {
                        str.getClass();
                        linkedHashSet.add(new nvy(str));
                    }
                }
                return linkedHashSet;
            case 3:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var.getClass();
                p6t0Var2.getClass();
                if (!(p6t0Var instanceof cr10) || !(p6t0Var2 instanceof cr10)) {
                    return xun.f41520a;
                }
                cr10 cr10Var = (cr10) p6t0Var;
                cr10 cr10Var2 = (cr10) p6t0Var2;
                boolean z = cr10Var.d;
                boolean z2 = cr10Var2.d;
                ar10 ar10Var = z != z2 ? new ar10(z2) : null;
                boolean z3 = cr10Var.c;
                boolean z4 = cr10Var2.c;
                return dui0.d(ar10Var, z3 != z4 ? new zq10(z4) : null);
            case 4:
                hvw hvwVar = (hvw) obj;
                hvw hvwVar2 = (hvw) obj2;
                hvwVar.getClass();
                hvwVar2.getClass();
                if (!hvwVar.equals(hvwVar2) && (hvwVar instanceof o4c0) && (hvwVar2 instanceof o4c0)) {
                    o4c0 o4c0Var = (o4c0) hvwVar;
                    o4c0 o4c0Var2 = (o4c0) hvwVar2;
                    String str2 = o4c0Var2.b;
                    linkedHashSet4 = new LinkedHashSet();
                    String str3 = o4c0Var.b;
                    n0x n0xVar3 = o4c0Var2.c;
                    if (!Intrinsics.d(str3, str2)) {
                        str2.getClass();
                        linkedHashSet4.add(new q4c0(str2));
                    }
                    if (!o4c0Var.c.equals(n0xVar3)) {
                        linkedHashSet4.add(new r4c0(n0xVar3, o4c0Var2.d, o4c0Var2.e));
                    }
                }
                return linkedHashSet4;
            case 5:
                euc0 euc0Var = (euc0) obj;
                euc0 euc0Var2 = (euc0) obj2;
                euc0Var.getClass();
                euc0Var2.getClass();
                if (!euc0Var.equals(euc0Var2) && (euc0Var instanceof euc0) && (euc0Var2 instanceof euc0)) {
                    String str4 = euc0Var2.b;
                    linkedHashSet3 = new LinkedHashSet();
                    String str5 = euc0Var.b;
                    n0x n0xVar4 = euc0Var2.c;
                    if (!Intrinsics.d(str5, str4)) {
                        str4.getClass();
                        linkedHashSet3.add(new huc0(str4));
                    }
                    if (!euc0Var.c.equals(n0xVar4)) {
                        linkedHashSet3.add(new iuc0(n0xVar4, euc0Var2.d, euc0Var2.e, euc0Var2.f));
                    }
                }
                return linkedHashSet3;
            case 6:
                p6t0 p6t0Var3 = (p6t0) obj;
                p6t0 p6t0Var4 = (p6t0) obj2;
                p6t0Var3.getClass();
                p6t0Var4.getClass();
                return p6t0Var3.o(p6t0Var3, p6t0Var4);
            case 7:
                nk nkVar = (nk) obj;
                nk nkVar2 = (nk) obj2;
                nkVar.getClass();
                nkVar2.getClass();
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                if (nkVar.b() != nkVar2.b()) {
                    linkedHashSet5.add(new hk(nkVar2.b()));
                }
                if (!Intrinsics.d(nkVar.a(), nkVar2.a())) {
                    linkedHashSet5.add(new gk(nkVar2.a()));
                }
                return linkedHashSet5;
            case 8:
            case 10:
            case 12:
            case 23:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            default:
                return super.E(obj, obj2);
            case 9:
                fp5 fp5Var = (fp5) obj;
                fp5 fp5Var2 = (fp5) obj2;
                fp5Var.getClass();
                fp5Var2.getClass();
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                String str6 = fp5Var.d;
                gp5 gp5Var = fp5Var.h;
                String str7 = fp5Var2.d;
                n0x n0xVar5 = fp5Var2.b;
                m0x m0xVar = fp5Var2.g;
                String str8 = fp5Var2.f;
                String str9 = fp5Var2.e;
                if (!Intrinsics.d(str6, str7)) {
                    str7.getClass();
                    linkedHashSet6.add(new pp5(str7));
                }
                if (!Intrinsics.d(fp5Var.e, str9)) {
                    str9.getClass();
                    linkedHashSet6.add(new mp5(str9));
                }
                if (!Intrinsics.d(fp5Var.f, str8)) {
                    str8.getClass();
                    linkedHashSet6.add(new op5(str8));
                }
                if (!Intrinsics.d(fp5Var.g, m0xVar)) {
                    linkedHashSet6.add(new lp5(m0xVar));
                }
                if (!Intrinsics.d(fp5Var.b, n0xVar5) || !Intrinsics.d(gp5Var, fp5Var2.h)) {
                    linkedHashSet6.add(new kp5(n0xVar5, gp5Var));
                }
                return linkedHashSet6;
            case 11:
                p6t0 p6t0Var5 = (p6t0) obj;
                p6t0 p6t0Var6 = (p6t0) obj2;
                p6t0Var5.getClass();
                p6t0Var6.getClass();
                return p6t0Var5.o(p6t0Var5, p6t0Var6);
            case 13:
                uqa uqaVar = (uqa) obj;
                uqa uqaVar2 = (uqa) obj2;
                uqaVar.getClass();
                uqaVar2.getClass();
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                if ((uqaVar2 instanceof yf90) && (uqaVar instanceof yf90)) {
                    yf90 yf90Var = (yf90) uqaVar;
                    yf90 yf90Var2 = (yf90) uqaVar2;
                    zmk0 zmk0Var = yf90Var2.g;
                    ArrayList arrayList = new ArrayList();
                    zmk0 zmk0Var2 = yf90Var2.n;
                    zmk0 zmk0Var3 = yf90Var2.m;
                    zmk0 zmk0Var4 = yf90Var2.l;
                    zmk0 zmk0Var5 = yf90Var2.k;
                    zmk0 zmk0Var6 = yf90Var2.h;
                    ArrayList arrayList2 = yf90Var2.j;
                    zmk0 zmk0Var7 = yf90Var.g;
                    ArrayList arrayList3 = yf90Var.j;
                    if (!zmk0Var.equals(zmk0Var7)) {
                        arrayList.add(new ypa(zmk0Var));
                    }
                    if (!zmk0Var6.equals(yf90Var.h)) {
                        arrayList.add(new bqa(zmk0Var6));
                    }
                    if (!zmk0Var5.equals(yf90Var.k)) {
                        arrayList.add(new zpa(zmk0Var5));
                    }
                    if (!zmk0Var4.equals(yf90Var.l)) {
                        arrayList.add(new cqa(zmk0Var4));
                    }
                    if (!zmk0Var3.equals(yf90Var.m)) {
                        arrayList.add(new xpa(zmk0Var3));
                    }
                    if (!zmk0Var2.equals(yf90Var.n)) {
                        arrayList.add(new aqa(zmk0Var2));
                    }
                    if (!arrayList2.equals(arrayList3)) {
                        arrayList.add(new vpa(arrayList2));
                    }
                    boolean z5 = yf90Var2.o;
                    if (z5 != yf90Var.o) {
                        arrayList.add(new upa(z5));
                    }
                    bex bexVar = yf90Var2.r;
                    if (bexVar != yf90Var.r) {
                        arrayList.add(new tpa(bexVar));
                    }
                    if (arrayList2.size() != arrayList3.size()) {
                        arrayList.add(new wpa(arrayList2.size()));
                    }
                    linkedHashSet7.add(arrayList);
                }
                if ((uqaVar2 instanceof zsq) && (uqaVar instanceof zsq)) {
                    zsq zsqVar = (zsq) uqaVar;
                    zsq zsqVar2 = (zsq) uqaVar2;
                    zmk0 zmk0Var8 = zsqVar2.e;
                    ArrayList arrayList4 = new ArrayList();
                    usq usqVar = zsqVar2.h;
                    usq usqVar2 = zsqVar2.g;
                    zmk0 zmk0Var9 = zsqVar2.f;
                    ArrayList arrayList5 = zsqVar2.j;
                    zmk0 zmk0Var10 = zsqVar.e;
                    ArrayList arrayList6 = zsqVar.j;
                    if (!zmk0Var8.equals(zmk0Var10)) {
                        arrayList4.add(new cpa(zmk0Var8));
                    }
                    if (!zmk0Var9.equals(zsqVar.f)) {
                        arrayList4.add(new epa(zmk0Var9));
                    }
                    if (!usqVar2.equals(zsqVar.g)) {
                        arrayList4.add(new bpa(usqVar2));
                    }
                    if (!usqVar.equals(zsqVar.h)) {
                        arrayList4.add(new dpa(usqVar));
                    }
                    if (!arrayList5.equals(arrayList6)) {
                        arrayList4.add(new zoa(arrayList5));
                    }
                    if (arrayList5.size() != arrayList6.size()) {
                        arrayList4.add(new apa(arrayList5.size()));
                    }
                    linkedHashSet7.add(arrayList4);
                }
                if ((uqaVar2 instanceof ymq0) && (uqaVar instanceof ymq0)) {
                    ymq0 ymq0Var = (ymq0) uqaVar;
                    ymq0 ymq0Var2 = (ymq0) uqaVar2;
                    ank0 ank0Var = ymq0Var2.c;
                    ArrayList arrayList7 = new ArrayList();
                    ank0 ank0Var2 = ymq0Var2.b;
                    if (!ank0Var.equals(ymq0Var.c)) {
                        arrayList7.add(new iqa(ank0Var));
                    }
                    if (!ank0Var2.equals(ymq0Var.b)) {
                        arrayList7.add(new hqa(ank0Var2));
                    }
                    linkedHashSet7.add(arrayList7);
                }
                if ((uqaVar2 instanceof yrj0) && (uqaVar instanceof yrj0)) {
                    yrj0 yrj0Var = (yrj0) uqaVar;
                    yrj0 yrj0Var2 = (yrj0) uqaVar2;
                    ArrayList arrayList8 = yrj0Var2.e;
                    ArrayList arrayList9 = new ArrayList();
                    jmo jmoVar = yrj0Var2.g;
                    if (!arrayList8.equals(yrj0Var.e)) {
                        arrayList9.add(new fqa(arrayList8));
                    }
                    if (!jmoVar.equals(yrj0Var.g)) {
                        arrayList9.add(new eqa(jmoVar));
                    }
                    linkedHashSet7.add(arrayList9);
                }
                if ((uqaVar2 instanceof k1v0) && (uqaVar instanceof k1v0)) {
                    k1v0 k1v0Var = (k1v0) uqaVar;
                    k1v0 k1v0Var2 = (k1v0) uqaVar2;
                    String str10 = k1v0Var2.c;
                    ArrayList arrayList10 = new ArrayList();
                    String str11 = k1v0Var2.i;
                    String str12 = k1v0Var2.g;
                    String str13 = k1v0Var2.e;
                    if (!str10.equals(k1v0Var.c)) {
                        arrayList10.add(new oqa(str10));
                    }
                    if (!str13.equals(k1v0Var.e)) {
                        arrayList10.add(new rqa(str13));
                    }
                    if (!str12.equals(k1v0Var.g)) {
                        arrayList10.add(new mqa(str12));
                    }
                    if (!str11.equals(k1v0Var.i)) {
                        arrayList10.add(new kqa(str11));
                    }
                    boolean z6 = k1v0Var2.d;
                    if (z6 != k1v0Var.d) {
                        arrayList10.add(new pqa(z6));
                    }
                    boolean z7 = k1v0Var2.f;
                    if (z7 != k1v0Var.f) {
                        arrayList10.add(new sqa(z7));
                    }
                    boolean z8 = k1v0Var2.h;
                    if (z8 != k1v0Var.h) {
                        arrayList10.add(new nqa(z8));
                    }
                    boolean z9 = k1v0Var2.j;
                    if (z9 != k1v0Var.j) {
                        arrayList10.add(new lqa(z9));
                    }
                    int i = k1v0Var2.b;
                    if (i != k1v0Var.b) {
                        arrayList10.add(new qqa(i));
                    }
                    linkedHashSet7.add(arrayList10);
                }
                if ((uqaVar2 instanceof yrw) && (uqaVar instanceof yrw)) {
                    jmo jmoVar2 = ((yrw) uqaVar2).e;
                    ArrayList arrayList11 = new ArrayList();
                    if (!jmoVar2.equals(((yrw) uqaVar).e)) {
                        arrayList11.add(new gpa(jmoVar2));
                    }
                    linkedHashSet7.add(arrayList11);
                }
                if ((uqaVar2 instanceof a800) && (uqaVar instanceof a800)) {
                    jmo jmoVar3 = ((a800) uqaVar2).d;
                    ArrayList arrayList12 = new ArrayList();
                    if (!jmoVar3.equals(((a800) uqaVar).d)) {
                        arrayList12.add(new hpa(jmoVar3));
                    }
                    linkedHashSet7.add(arrayList12);
                }
                if ((uqaVar2 instanceof yf30) && (uqaVar instanceof yf30)) {
                    yf30 yf30Var = (yf30) uqaVar;
                    yf30 yf30Var2 = (yf30) uqaVar2;
                    jmo jmoVar4 = yf30Var2.c;
                    ArrayList arrayList13 = new ArrayList();
                    a4x a4xVar = yf30Var2.f42522a;
                    if (!jmoVar4.equals(yf30Var.c)) {
                        arrayList13.add(new ipa(jmoVar4));
                    }
                    if (!Intrinsics.d(a4xVar, yf30Var.f42522a)) {
                        arrayList13.add(new jpa(a4xVar));
                    }
                    linkedHashSet7.add(arrayList13);
                }
                if ((uqaVar2 instanceof aos) && (uqaVar instanceof aos)) {
                    aos aosVar = (aos) uqaVar;
                    aos aosVar2 = (aos) uqaVar2;
                    ank0 ank0Var3 = aosVar2.f1216a;
                    ArrayList arrayList14 = new ArrayList();
                    ArrayList arrayList15 = aosVar2.e;
                    ArrayList arrayList16 = aosVar2.d;
                    if (!ank0Var3.equals(aosVar.f1216a)) {
                        arrayList14.add(new lpa(ank0Var3));
                    }
                    if (!arrayList16.equals(aosVar.d)) {
                        arrayList14.add(new opa(arrayList16));
                    }
                    if (!arrayList15.equals(aosVar.e)) {
                        arrayList14.add(new rpa(arrayList15));
                    }
                    ohm0 ohm0Var = aosVar.f;
                    if (ohm0Var instanceof tpp0) {
                        ohm0 ohm0Var2 = aosVar2.f;
                        if (ohm0Var2 instanceof tpp0) {
                            tpp0 tpp0Var = (tpp0) ohm0Var;
                            tpp0 tpp0Var2 = (tpp0) ohm0Var2;
                            boolean z10 = tpp0Var.c;
                            boolean z11 = tpp0Var2.c;
                            String str14 = tpp0Var2.f;
                            String str15 = tpp0Var2.e;
                            if (z10 != z11) {
                                arrayList14.add(new mpa(tpp0Var2.g));
                            }
                            if (tpp0Var.d != tpp0Var2.d) {
                                arrayList14.add(new ppa(tpp0Var2.h));
                            }
                            if (!tpp0Var.e.equals(str15)) {
                                arrayList14.add(new npa(str15));
                            }
                            if (!tpp0Var.f.equals(str14)) {
                                arrayList14.add(new qpa(str14));
                            }
                        }
                    }
                    linkedHashSet7.add(arrayList14);
                }
                return linkedHashSet7;
            case 14:
                z3b z3bVar = (z3b) obj;
                z3b z3bVar2 = (z3b) obj2;
                z3bVar.getClass();
                z3bVar2.getClass();
                return z3bVar.c(z3bVar, z3bVar2);
            case 15:
                knd kndVar = (knd) obj;
                knd kndVar2 = (knd) obj2;
                kndVar.getClass();
                kndVar2.getClass();
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                if ((kndVar2 instanceof ond) && (kndVar instanceof ond)) {
                    ond ondVar = (ond) kndVar;
                    ond ondVar2 = (ond) kndVar2;
                    ank0 ank0Var4 = ondVar2.b;
                    ArrayList arrayList17 = new ArrayList();
                    ank0 ank0Var5 = ondVar.b;
                    ank0 ank0Var6 = ondVar2.i;
                    String str16 = ondVar2.f;
                    String str17 = ondVar2.e;
                    String str18 = ondVar2.d;
                    String str19 = ondVar2.c;
                    if (!ank0Var5.equals(ank0Var4)) {
                        arrayList17.add(new gmd(ank0Var4));
                    }
                    if (!ondVar.c.equals(str19)) {
                        arrayList17.add(new hmd(str19));
                    }
                    if (!ondVar.d.equals(str18)) {
                        arrayList17.add(new jmd(str18));
                    }
                    if (!ondVar.e.equals(str17)) {
                        arrayList17.add(new imd(str17));
                    }
                    if (!ondVar.f.equals(str16)) {
                        arrayList17.add(new kmd(str16));
                    }
                    if (!ondVar.i.equals(ank0Var6)) {
                        arrayList17.add(new fmd(ank0Var6));
                    }
                    linkedHashSet8.add(arrayList17);
                }
                if ((kndVar2 instanceof mpd) && (kndVar instanceof mpd)) {
                    ank0 ank0Var7 = ((mpd) kndVar2).c;
                    ArrayList arrayList18 = new ArrayList();
                    if (!((mpd) kndVar).c.equals(ank0Var7)) {
                        arrayList18.add(new jnd(ank0Var7));
                    }
                    linkedHashSet8.add(arrayList18);
                }
                if ((kndVar2 instanceof apd) && (kndVar instanceof apd)) {
                    apd apdVar = (apd) kndVar;
                    apd apdVar2 = (apd) kndVar2;
                    ank0 ank0Var8 = apdVar2.b;
                    ArrayList arrayList19 = new ArrayList();
                    ank0 ank0Var9 = apdVar.b;
                    ank0 ank0Var10 = apdVar2.e;
                    if (!ank0Var9.equals(ank0Var8)) {
                        arrayList19.add(new wmd(ank0Var8));
                    }
                    if (!apdVar.e.equals(ank0Var10)) {
                        arrayList19.add(new vmd(ank0Var10));
                    }
                    linkedHashSet8.add(arrayList19);
                }
                if ((kndVar2 instanceof cpd) && (kndVar instanceof cpd)) {
                    cpd cpdVar = (cpd) kndVar;
                    cpd cpdVar2 = (cpd) kndVar2;
                    zmk0 zmk0Var11 = cpdVar2.h;
                    ArrayList arrayList20 = new ArrayList();
                    zmk0 zmk0Var12 = cpdVar2.o;
                    zmk0 zmk0Var13 = cpdVar2.n;
                    zmk0 zmk0Var14 = cpdVar2.m;
                    zmk0 zmk0Var15 = cpdVar2.l;
                    zmk0 zmk0Var16 = cpdVar2.i;
                    ArrayList arrayList21 = cpdVar2.k;
                    zmk0 zmk0Var17 = cpdVar.h;
                    ArrayList arrayList22 = cpdVar.k;
                    if (!zmk0Var11.equals(zmk0Var17)) {
                        arrayList20.add(new dnd(zmk0Var11));
                    }
                    if (!zmk0Var16.equals(cpdVar.i)) {
                        arrayList20.add(new gnd(zmk0Var16));
                    }
                    if (!zmk0Var15.equals(cpdVar.l)) {
                        arrayList20.add(new end(zmk0Var15));
                    }
                    if (!zmk0Var14.equals(cpdVar.m)) {
                        arrayList20.add(new hnd(zmk0Var14));
                    }
                    if (!zmk0Var13.equals(cpdVar.n)) {
                        arrayList20.add(new cnd(zmk0Var13));
                    }
                    if (!zmk0Var12.equals(cpdVar.o)) {
                        arrayList20.add(new fnd(zmk0Var12));
                    }
                    if (!arrayList21.equals(arrayList22)) {
                        arrayList20.add(new and(arrayList21));
                    }
                    boolean z12 = cpdVar2.p;
                    if (z12 != cpdVar.p) {
                        arrayList20.add(new zmd(z12));
                    }
                    bex bexVar2 = cpdVar2.s;
                    if (bexVar2 != cpdVar.s) {
                        arrayList20.add(new ymd(bexVar2));
                    }
                    if (arrayList21.size() != arrayList22.size()) {
                        arrayList20.add(new bnd(arrayList21.size()));
                    }
                    linkedHashSet8.add(arrayList20);
                }
                if ((kndVar2 instanceof xnd) && (kndVar instanceof xnd)) {
                    xnd xndVar = (xnd) kndVar;
                    xnd xndVar2 = (xnd) kndVar2;
                    zmk0 zmk0Var18 = xndVar2.f;
                    ArrayList arrayList23 = new ArrayList();
                    zmk0 zmk0Var19 = xndVar2.g;
                    List list = xndVar2.i;
                    zmk0 zmk0Var20 = xndVar.f;
                    List list2 = xndVar.i;
                    if (!zmk0Var18.equals(zmk0Var20)) {
                        arrayList23.add(new omd(zmk0Var18));
                    }
                    if (!zmk0Var19.equals(xndVar.g)) {
                        arrayList23.add(new pmd(zmk0Var19));
                    }
                    if (!Intrinsics.d(list, list2)) {
                        arrayList23.add(new mmd(list));
                    }
                    if (list.size() != list2.size()) {
                        arrayList23.add(new nmd(list.size()));
                    }
                    linkedHashSet8.add(arrayList23);
                }
                if ((kndVar instanceof aqd) && (kndVar2 instanceof aqd)) {
                    aqd aqdVar = (aqd) kndVar;
                    aqd aqdVar2 = (aqd) kndVar2;
                    ank0 ank0Var11 = aqdVar2.g;
                    ArrayList arrayList24 = new ArrayList();
                    ank0 ank0Var12 = aqdVar.g;
                    ank0 ank0Var13 = aqdVar2.b;
                    ank0 ank0Var14 = aqdVar2.h;
                    if (!ank0Var12.equals(ank0Var11)) {
                        arrayList24.add(new rmd(ank0Var11));
                    }
                    if (!aqdVar.h.equals(ank0Var14)) {
                        arrayList24.add(new tmd(ank0Var14));
                    }
                    if (!aqdVar.b.equals(ank0Var13)) {
                        arrayList24.add(new smd(ank0Var13));
                    }
                    linkedHashSet8.add(arrayList24);
                }
                return linkedHashSet8;
            case 16:
                wpd wpdVar = (wpd) obj;
                wpd wpdVar2 = (wpd) obj2;
                wpdVar.getClass();
                wpdVar2.getClass();
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                if ((wpdVar instanceof ee90) && (wpdVar2 instanceof ee90)) {
                    ee90 ee90Var = (ee90) wpdVar;
                    ee90 ee90Var2 = (ee90) wpdVar2;
                    zmk0 zmk0Var21 = ee90Var2.b;
                    ArrayList arrayList25 = new ArrayList();
                    zmk0 zmk0Var22 = ee90Var2.c;
                    if (!zmk0Var21.equals(ee90Var.b)) {
                        arrayList25.add(new ppd(zmk0Var21));
                    }
                    if (!zmk0Var22.equals(ee90Var.c)) {
                        arrayList25.add(new qpd(zmk0Var22));
                    }
                    linkedHashSet9.add(arrayList25);
                }
                if ((wpdVar instanceof cf90) && (wpdVar2 instanceof cf90)) {
                    cf90 cf90Var = (cf90) wpdVar;
                    cf90 cf90Var2 = (cf90) wpdVar2;
                    zmk0 zmk0Var23 = cf90Var2.b;
                    ArrayList arrayList26 = new ArrayList();
                    String str20 = cf90Var2.f4250a;
                    zmk0 zmk0Var24 = cf90Var2.c;
                    if (!zmk0Var23.equals(cf90Var.b)) {
                        arrayList26.add(new tpd(zmk0Var23));
                    }
                    if (!zmk0Var24.equals(cf90Var.c)) {
                        arrayList26.add(new upd(zmk0Var24));
                    }
                    if (!str20.equals(cf90Var.f4250a)) {
                        arrayList26.add(new spd(str20));
                    }
                    linkedHashSet9.add(arrayList26);
                }
                return linkedHashSet9;
            case 17:
                gqd gqdVar = (gqd) obj;
                gqd gqdVar2 = (gqd) obj2;
                gqdVar.getClass();
                gqdVar2.getClass();
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                zmk0 zmk0Var25 = gqdVar2.b;
                String str21 = gqdVar2.f11727a;
                zmk0 zmk0Var26 = gqdVar2.c;
                if (!zmk0Var25.equals(gqdVar.b)) {
                    linkedHashSet10.add(new dqd(zmk0Var25));
                }
                if (!zmk0Var26.equals(gqdVar.c)) {
                    linkedHashSet10.add(new eqd(zmk0Var26));
                }
                if (!str21.equals(gqdVar.f11727a)) {
                    linkedHashSet10.add(new cqd(str21));
                }
                return linkedHashSet10;
            case 18:
                p6t0 p6t0Var7 = (p6t0) obj;
                p6t0 p6t0Var8 = (p6t0) obj2;
                p6t0Var7.getClass();
                p6t0Var8.getClass();
                if (!(p6t0Var7 instanceof a7g) || !(p6t0Var8 instanceof a7g)) {
                    return null;
                }
                z6g z6gVar = ((a7g) p6t0Var7).d != ((a7g) p6t0Var8).d ? z6g.f43864a : null;
                return z6gVar != null ? cui0.b(z6gVar) : xun.f41520a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                p6t0 p6t0Var9 = (p6t0) obj;
                p6t0 p6t0Var10 = (p6t0) obj2;
                p6t0Var9.getClass();
                p6t0Var10.getClass();
                return p6t0Var9.o(p6t0Var9, p6t0Var10);
            case 20:
                p6t0 p6t0Var11 = (p6t0) obj;
                p6t0 p6t0Var12 = (p6t0) obj2;
                p6t0Var11.getClass();
                p6t0Var12.getClass();
                return p6t0Var11.o(p6t0Var11, p6t0Var12);
            case 21:
                eyl eylVar = (eyl) obj;
                eyl eylVar2 = (eyl) obj2;
                eylVar.getClass();
                eylVar2.getClass();
                return eylVar.b(eylVar, eylVar2);
            case 22:
                ysq ysqVar = (ysq) obj;
                ysq ysqVar2 = (ysq) obj2;
                ysqVar.getClass();
                ysqVar2.getClass();
                LinkedHashSet linkedHashSet11 = new LinkedHashSet();
                zmk0 zmk0Var27 = ysqVar.b;
                zmk0 zmk0Var28 = ysqVar2.b;
                zmk0 zmk0Var29 = ysqVar2.c;
                if (!zmk0Var27.equals(zmk0Var28)) {
                    linkedHashSet11.add(new vsq(zmk0Var28));
                }
                if (!ysqVar.c.equals(zmk0Var29)) {
                    linkedHashSet11.add(new wsq(zmk0Var29));
                }
                return linkedHashSet11;
            case 24:
                u4s u4sVar = (u4s) obj;
                u4s u4sVar2 = (u4s) obj2;
                u4sVar.getClass();
                u4sVar2.getClass();
                o0x o0xVar = u4sVar2.e;
                o0x o0xVar2 = u4sVar2.c;
                if (!u4sVar.equals(u4sVar2)) {
                    String str22 = u4sVar2.g;
                    linkedHashSet2 = new LinkedHashSet();
                    if (!Intrinsics.d(u4sVar.g, str22)) {
                        str22.getClass();
                        linkedHashSet2.add(new y4s(str22));
                    }
                    if (!u4sVar.c.equals(o0xVar2) || !u4sVar.e.equals(o0xVar)) {
                        linkedHashSet2.add(new z4s(o0xVar2, o0xVar, u4sVar2.b, u4sVar2.h, u4sVar2.i));
                    }
                    v4s v4sVar = u4sVar.b;
                    v4s v4sVar2 = u4sVar2.b;
                    if (v4sVar != v4sVar2) {
                        v4sVar2.getClass();
                        linkedHashSet2.add(new x4s(v4sVar2));
                    }
                }
                return linkedHashSet2;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return W(obj, obj2);
        }
    }

    @Override // a.dtb
    public final boolean w(Object obj, Object obj2) {
        switch (this.f7937a) {
            case 0:
                vk5 vk5Var = (vk5) obj;
                vk5 vk5Var2 = (vk5) obj2;
                vk5Var.getClass();
                vk5Var2.getClass();
                if ((vk5Var instanceof tjz) && (vk5Var2 instanceof tjz)) {
                    return vk5Var.equals(vk5Var2);
                }
                if ((vk5Var instanceof lfs0) && (vk5Var2 instanceof lfs0)) {
                    return vk5Var.equals(vk5Var2);
                }
                if ((vk5Var instanceof aes0) && (vk5Var2 instanceof aes0)) {
                    return vk5Var.equals(vk5Var2);
                }
                if ((vk5Var instanceof ogs0) && (vk5Var2 instanceof ogs0)) {
                    return vk5Var.equals(vk5Var2);
                }
                if ((vk5Var instanceof ues0) && (vk5Var2 instanceof ues0)) {
                    return vk5Var == vk5Var2;
                }
                return Intrinsics.d(vk5Var, vk5Var2);
            case 1:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0 p6t0Var2 = (p6t0) obj2;
                return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
            case 2:
                rvy rvyVar = (rvy) obj;
                rvy rvyVar2 = (rvy) obj2;
                rvyVar.getClass();
                rvyVar2.getClass();
                return Intrinsics.d(rvyVar, rvyVar2);
            case 3:
                p6t0 p6t0Var3 = (p6t0) obj;
                p6t0 p6t0Var4 = (p6t0) obj2;
                p6t0Var3.getClass();
                p6t0Var4.getClass();
                if (!(p6t0Var3 instanceof cr10) || !(p6t0Var4 instanceof cr10)) {
                    return p6t0Var3.equals(p6t0Var4);
                }
                cr10 cr10Var = (cr10) p6t0Var3;
                cr10 cr10Var2 = (cr10) p6t0Var4;
                return cr10Var.f4821a == cr10Var2.f4821a && cr10Var.d == cr10Var2.d && cr10Var.c == cr10Var2.c;
            case 4:
                hvw hvwVar = (hvw) obj;
                hvw hvwVar2 = (hvw) obj2;
                hvwVar.getClass();
                hvwVar2.getClass();
                return Intrinsics.d(hvwVar, hvwVar2);
            case 5:
                euc0 euc0Var = (euc0) obj;
                euc0 euc0Var2 = (euc0) obj2;
                euc0Var.getClass();
                euc0Var2.getClass();
                return Intrinsics.d(euc0Var, euc0Var2);
            case 6:
                p6t0 p6t0Var5 = (p6t0) obj;
                p6t0 p6t0Var6 = (p6t0) obj2;
                p6t0Var5.getClass();
                p6t0Var6.getClass();
                return p6t0Var5.h(p6t0Var5, p6t0Var6);
            case 7:
                nk nkVar = (nk) obj;
                nk nkVar2 = (nk) obj2;
                nkVar.getClass();
                nkVar2.getClass();
                return Intrinsics.d(nkVar, nkVar2);
            case 8:
                p6t0 p6t0Var7 = (p6t0) obj;
                p6t0 p6t0Var8 = (p6t0) obj2;
                p6t0Var7.getClass();
                p6t0Var8.getClass();
                return p6t0Var7.h(p6t0Var7, p6t0Var8);
            case 9:
                fp5 fp5Var = (fp5) obj;
                fp5 fp5Var2 = (fp5) obj2;
                fp5Var.getClass();
                fp5Var2.getClass();
                return Intrinsics.d(fp5Var, fp5Var2);
            case 10:
                up5 up5Var = (up5) obj;
                up5 up5Var2 = (up5) obj2;
                up5Var.getClass();
                up5Var2.getClass();
                return Intrinsics.d(up5Var, up5Var2);
            case 11:
                p6t0 p6t0Var9 = (p6t0) obj;
                p6t0 p6t0Var10 = (p6t0) obj2;
                p6t0Var9.getClass();
                p6t0Var10.getClass();
                if ((p6t0Var9 instanceof npp0) && (p6t0Var10 instanceof npp0)) {
                    if (Float.compare(((npp0) p6t0Var9).f23925a, ((npp0) p6t0Var10).f23925a) != 0) {
                        return false;
                    }
                } else {
                    if (!(p6t0Var9 instanceof gpp0) || !(p6t0Var10 instanceof gpp0)) {
                        if ((p6t0Var9 instanceof r07) && (p6t0Var10 instanceof r07)) {
                            return p6t0Var9.equals(p6t0Var10);
                        }
                        if ((p6t0Var9 instanceof de7) && (p6t0Var10 instanceof de7)) {
                            return p6t0Var9.equals(p6t0Var10);
                        }
                        if ((p6t0Var9 instanceof ah) && (p6t0Var10 instanceof ah)) {
                            return ((ah) p6t0Var9).f850a.equals(((ah) p6t0Var10).f850a);
                        }
                        return false;
                    }
                    gpp0 gpp0Var = (gpp0) p6t0Var9;
                    gpp0 gpp0Var2 = (gpp0) p6t0Var10;
                    if (!gpp0Var.f11694a.equals(gpp0Var2.f11694a) || !gpp0Var.b.equals(gpp0Var2.b)) {
                        return false;
                    }
                }
                return true;
            case 12:
                swm0 swm0Var = (swm0) obj;
                swm0 swm0Var2 = (swm0) obj2;
                swm0Var.getClass();
                swm0Var2.getClass();
                return Intrinsics.d(swm0Var, swm0Var2);
            case 13:
                uqa uqaVar = (uqa) obj;
                uqa uqaVar2 = (uqa) obj2;
                uqaVar.getClass();
                uqaVar2.getClass();
                return Intrinsics.d(uqaVar2, uqaVar);
            case 14:
                z3b z3bVar = (z3b) obj;
                z3b z3bVar2 = (z3b) obj2;
                z3bVar.getClass();
                z3bVar2.getClass();
                return z3bVar.d(z3bVar, z3bVar2);
            case 15:
                knd kndVar = (knd) obj;
                knd kndVar2 = (knd) obj2;
                kndVar.getClass();
                kndVar2.getClass();
                return Intrinsics.d(kndVar, kndVar2);
            case 16:
                wpd wpdVar = (wpd) obj;
                wpd wpdVar2 = (wpd) obj2;
                wpdVar.getClass();
                wpdVar2.getClass();
                return Intrinsics.d(wpdVar2, wpdVar);
            case 17:
                gqd gqdVar = (gqd) obj;
                gqd gqdVar2 = (gqd) obj2;
                gqdVar.getClass();
                gqdVar2.getClass();
                return Intrinsics.d(gqdVar2, gqdVar);
            case 18:
                p6t0 p6t0Var11 = (p6t0) obj;
                p6t0 p6t0Var12 = (p6t0) obj2;
                return rw2.y(p6t0Var11, p6t0Var12, p6t0Var11, p6t0Var12);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                p6t0 p6t0Var13 = (p6t0) obj;
                p6t0 p6t0Var14 = (p6t0) obj2;
                p6t0Var13.getClass();
                p6t0Var14.getClass();
                return p6t0Var13.h(p6t0Var13, p6t0Var14);
            case 20:
                p6t0 p6t0Var15 = (p6t0) obj;
                p6t0 p6t0Var16 = (p6t0) obj2;
                p6t0Var15.getClass();
                p6t0Var16.getClass();
                return p6t0Var15.h(p6t0Var15, p6t0Var16);
            case 21:
                eyl eylVar = (eyl) obj;
                eyl eylVar2 = (eyl) obj2;
                eylVar.getClass();
                eylVar2.getClass();
                return eylVar.d(eylVar, eylVar2);
            case 22:
                ysq ysqVar = (ysq) obj;
                ysq ysqVar2 = (ysq) obj2;
                ysqVar.getClass();
                ysqVar2.getClass();
                return Intrinsics.d(ysqVar2, ysqVar);
            case 23:
                ((y39) obj).getClass();
                ((y39) obj2).getClass();
                return true;
            case 24:
                u4s u4sVar = (u4s) obj;
                u4s u4sVar2 = (u4s) obj2;
                u4sVar.getClass();
                u4sVar2.getClass();
                return Intrinsics.d(u4sVar, u4sVar2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                p6t0 p6t0Var17 = (p6t0) obj;
                p6t0 p6t0Var18 = (p6t0) obj2;
                p6t0Var17.getClass();
                p6t0Var18.getClass();
                return p6t0Var17.h(p6t0Var17, p6t0Var18);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ofs ofsVar = (ofs) obj;
                ofs ofsVar2 = (ofs) obj2;
                ofsVar.getClass();
                ofsVar2.getClass();
                return Intrinsics.d(ofsVar, ofsVar2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                xrw xrwVar = (xrw) obj;
                xrw xrwVar2 = (xrw) obj2;
                xrwVar.getClass();
                xrwVar2.getClass();
                return Intrinsics.d(xrwVar2, xrwVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                obj.getClass();
                obj2.getClass();
                return Intrinsics.d(obj, obj2);
            default:
                z700 z700Var = (z700) obj;
                z700 z700Var2 = (z700) obj2;
                z700Var.getClass();
                z700Var2.getClass();
                return Intrinsics.d(z700Var, z700Var2);
        }
    }

    @Override // a.dtb
    public final boolean x(Object obj, Object obj2) {
        switch (this.f7937a) {
            case 0:
                vk5 vk5Var = (vk5) obj;
                vk5 vk5Var2 = (vk5) obj2;
                vk5Var.getClass();
                vk5Var2.getClass();
                if ((!(vk5Var instanceof tjz) || !(vk5Var2 instanceof tjz)) && ((!(vk5Var instanceof lfs0) || !(vk5Var2 instanceof lfs0)) && (!(vk5Var instanceof aes0) || !(vk5Var2 instanceof aes0)))) {
                    if ((vk5Var instanceof ogs0) && (vk5Var2 instanceof ogs0)) {
                        if (((ogs0) vk5Var).f25234a != ((ogs0) vk5Var2).f25234a) {
                            return false;
                        }
                    } else if (!(vk5Var instanceof ues0) || !(vk5Var2 instanceof ues0)) {
                        return vk5Var.getClass().equals(vk5Var2.getClass());
                    }
                }
                return true;
            case 1:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0 p6t0Var2 = (p6t0) obj2;
                p6t0Var.getClass();
                p6t0Var2.getClass();
                if ((p6t0Var instanceof zad) && (p6t0Var2 instanceof zad)) {
                    return Intrinsics.d(((zad) p6t0Var).k, ((zad) p6t0Var2).k);
                }
                return ((p6t0Var instanceof fbr) && (p6t0Var2 instanceof fbr)) ? Intrinsics.d(((fbr) p6t0Var).f9275a, ((fbr) p6t0Var2).f9275a) : p6t0Var.getClass().equals(p6t0Var2.getClass());
            case 2:
                rvy rvyVar = (rvy) obj;
                rvy rvyVar2 = (rvy) obj2;
                rvyVar.getClass();
                rvyVar2.getClass();
                return rvyVar.f31193a == rvyVar2.f31193a;
            case 3:
                p6t0 p6t0Var3 = (p6t0) obj2;
                return axq.f((p6t0) obj, p6t0Var3).equals(p6t0Var3.getClass());
            case 4:
                hvw hvwVar = (hvw) obj;
                hvw hvwVar2 = (hvw) obj2;
                hvwVar.getClass();
                hvwVar2.getClass();
                return (hvwVar instanceof o4c0) && (hvwVar2 instanceof o4c0) && ((o4c0) hvwVar).f24627a == ((o4c0) hvwVar2).f24627a;
            case 5:
                euc0 euc0Var = (euc0) obj;
                euc0 euc0Var2 = (euc0) obj2;
                euc0Var.getClass();
                euc0Var2.getClass();
                return (euc0Var instanceof euc0) && (euc0Var2 instanceof euc0) && euc0Var.f8414a == euc0Var2.f8414a;
            case 6:
                p6t0 p6t0Var4 = (p6t0) obj;
                p6t0 p6t0Var5 = (p6t0) obj2;
                p6t0Var4.getClass();
                p6t0Var5.getClass();
                return p6t0Var4.g(p6t0Var4, p6t0Var5);
            case 7:
                nk nkVar = (nk) obj;
                nk nkVar2 = (nk) obj2;
                nkVar.getClass();
                nkVar2.getClass();
                return nkVar.getClass() == nkVar2.getClass();
            case 8:
                p6t0 p6t0Var6 = (p6t0) obj;
                p6t0 p6t0Var7 = (p6t0) obj2;
                p6t0Var6.getClass();
                p6t0Var7.getClass();
                return p6t0Var6.g(p6t0Var6, p6t0Var7);
            case 9:
                fp5 fp5Var = (fp5) obj;
                fp5 fp5Var2 = (fp5) obj2;
                fp5Var.getClass();
                fp5Var2.getClass();
                return fp5Var.f9912a == fp5Var2.f9912a;
            case 10:
                up5 up5Var = (up5) obj;
                up5 up5Var2 = (up5) obj2;
                up5Var.getClass();
                up5Var2.getClass();
                return up5Var.f36046a == up5Var2.f36046a;
            case 11:
                p6t0 p6t0Var8 = (p6t0) obj;
                p6t0 p6t0Var9 = (p6t0) obj2;
                p6t0Var8.getClass();
                p6t0Var9.getClass();
                if ((!(p6t0Var8 instanceof npp0) || !(p6t0Var9 instanceof npp0)) && (!(p6t0Var8 instanceof gpp0) || !(p6t0Var9 instanceof gpp0))) {
                    if ((p6t0Var8 instanceof r07) && (p6t0Var9 instanceof r07)) {
                        if (((r07) p6t0Var8).f29616a != ((r07) p6t0Var9).f29616a) {
                            return false;
                        }
                    } else if ((p6t0Var8 instanceof de7) && (p6t0Var9 instanceof de7)) {
                        if (((de7) p6t0Var8).f5934a != ((de7) p6t0Var9).f5934a) {
                            return false;
                        }
                    } else if (!(p6t0Var8 instanceof ah) || !(p6t0Var9 instanceof ah) || ((ah) p6t0Var8).b != ((ah) p6t0Var9).b) {
                        return false;
                    }
                }
                return true;
            case 12:
                swm0 swm0Var = (swm0) obj;
                swm0 swm0Var2 = (swm0) obj2;
                swm0Var.getClass();
                swm0Var2.getClass();
                if ((swm0Var instanceof pwm0) && (swm0Var2 instanceof pwm0)) {
                    if (((pwm0) swm0Var).c != ((pwm0) swm0Var2).c) {
                        return false;
                    }
                } else {
                    if (!(swm0Var instanceof qwm0) || !(swm0Var2 instanceof qwm0)) {
                        return swm0Var.getClass().equals(swm0Var2.getClass());
                    }
                    if (((qwm0) swm0Var).c != ((qwm0) swm0Var2).c) {
                        return false;
                    }
                }
                return true;
            case 13:
                uqa uqaVar = (uqa) obj;
                uqa uqaVar2 = (uqa) obj2;
                uqaVar.getClass();
                uqaVar2.getClass();
                return uqaVar2.getClass() == uqaVar.getClass();
            case 14:
                z3b z3bVar = (z3b) obj;
                z3b z3bVar2 = (z3b) obj2;
                z3bVar.getClass();
                z3bVar2.getClass();
                return z3bVar.b(z3bVar, z3bVar2);
            case 15:
                knd kndVar = (knd) obj;
                knd kndVar2 = (knd) obj2;
                kndVar.getClass();
                kndVar2.getClass();
                return kndVar2.getClass() == kndVar.getClass();
            case 16:
                wpd wpdVar = (wpd) obj;
                wpd wpdVar2 = (wpd) obj2;
                wpdVar.getClass();
                wpdVar2.getClass();
                return wpdVar.getClass().equals(wpdVar2.getClass());
            case 17:
                ((gqd) obj).getClass();
                ((gqd) obj2).getClass();
                return gqd.class.equals(gqd.class);
            case 18:
                p6t0 p6t0Var10 = (p6t0) obj;
                p6t0 p6t0Var11 = (p6t0) obj2;
                p6t0Var10.getClass();
                p6t0Var11.getClass();
                if ((p6t0Var10 instanceof a7g) && (p6t0Var11 instanceof a7g)) {
                    return ((a7g) p6t0Var10).f367a == ((a7g) p6t0Var11).f367a;
                }
                return p6t0Var10.getClass().equals(p6t0Var11.getClass());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                p6t0 p6t0Var12 = (p6t0) obj;
                p6t0 p6t0Var13 = (p6t0) obj2;
                p6t0Var12.getClass();
                p6t0Var13.getClass();
                return p6t0Var12.g(p6t0Var12, p6t0Var13);
            case 20:
                p6t0 p6t0Var14 = (p6t0) obj;
                p6t0 p6t0Var15 = (p6t0) obj2;
                p6t0Var14.getClass();
                p6t0Var15.getClass();
                return p6t0Var14.g(p6t0Var14, p6t0Var15);
            case 21:
                eyl eylVar = (eyl) obj;
                eyl eylVar2 = (eyl) obj2;
                eylVar.getClass();
                eylVar2.getClass();
                return eylVar.c(eylVar, eylVar2);
            case 22:
                ysq ysqVar = (ysq) obj;
                ysq ysqVar2 = (ysq) obj2;
                ysqVar.getClass();
                ysqVar2.getClass();
                return ysqVar.f43182a.equals(ysqVar2.f43182a);
            case 23:
                y39 y39Var = (y39) obj;
                y39 y39Var2 = (y39) obj2;
                y39Var.getClass();
                y39Var2.getClass();
                return y39Var.getClass().equals(y39Var2.getClass());
            case 24:
                u4s u4sVar = (u4s) obj;
                u4s u4sVar2 = (u4s) obj2;
                u4sVar.getClass();
                u4sVar2.getClass();
                return u4sVar.f35067a == u4sVar2.f35067a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                p6t0 p6t0Var16 = (p6t0) obj;
                p6t0 p6t0Var17 = (p6t0) obj2;
                p6t0Var16.getClass();
                p6t0Var17.getClass();
                return p6t0Var16.g(p6t0Var16, p6t0Var17);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ofs ofsVar = (ofs) obj;
                ofs ofsVar2 = (ofs) obj2;
                ofsVar.getClass();
                ofsVar2.getClass();
                return ofsVar2.a().f46994a == ofsVar.a().f46994a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((xrw) obj).getClass();
                ((xrw) obj2).getClass();
                return xrw.class.equals(xrw.class);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                obj.getClass();
                obj2.getClass();
                return true;
            default:
                z700 z700Var = (z700) obj;
                z700 z700Var2 = (z700) obj2;
                z700Var.getClass();
                z700Var2.getClass();
                return z700Var2.getClass() == z700Var.getClass();
        }
    }
}
