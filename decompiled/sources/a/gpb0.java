package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gpb0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11674a;
    public final /* synthetic */ ctf0 b;
    public final /* synthetic */ ocl c;

    public /* synthetic */ gpb0(ctf0 ctf0Var, ocl oclVar, kl5 kl5Var) {
        this.f11674a = (byte) 10;
        this.b = ctf0Var;
        this.c = oclVar;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    private final java.lang.Object a(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gpb0.a(java.lang.Object):java.lang.Object");
    }

    private final Object b(Object obj) {
        mtl mtlVar;
        Collection collection;
        List list;
        wui0 wui0Var;
        z8i0 z8i0Var = (z8i0) obj;
        z8i0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        niq0 niq0Var = z8i0Var.b;
        int i = z8i0Var.c;
        if (niq0Var == null || (list = niq0Var.i) == null) {
            mtlVar = null;
            collection = iun.f15405a;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            int i2 = 0;
            for (Object obj2 : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                int size = list.size();
                String str = ((v85) obj2).c;
                boolean z = i >= 0 && i2 == i;
                if (size == 1) {
                    wui0Var = wui0.f39793a;
                } else if (i2 == 0) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = i2 == size + (-1) ? wui0.d : wui0.c;
                }
                arrayList.add(new e9i0(str, z, wui0Var));
                i2 = i3;
            }
            mtlVar = null;
            collection = arrayList;
        }
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        lsm0 lsm0Var = ctf0Var.b;
        return new a9i0(z8i0Var.f43968a, dyb.r0(collection), z8i0Var.f, new imm(ilmVar, new plm(lsm0Var.a(R.string.select_period, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null), ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, 0, 0L, 0L, 990), (niq0Var == null || collection.isEmpty()) ? mtlVar : new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))), i >= 0, false, true), q8i0.f28302a))));
    }

    private final Object c(Object obj) {
        mtl mtlVar;
        Collection collection;
        List list;
        wui0 wui0Var;
        sli0 sli0Var = (sli0) obj;
        sli0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        niq0 niq0Var = sli0Var.e;
        if (niq0Var == null || (list = niq0Var.i) == null) {
            mtlVar = null;
            collection = iun.f15405a;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                v85 v85Var = (v85) obj2;
                int size = list.size();
                String str = v85Var.c;
                String str2 = v85Var.b;
                int i3 = sli0Var.g;
                boolean z = i3 >= 0 && i == i3;
                if (size == 1) {
                    wui0Var = wui0.f39793a;
                } else if (i == 0) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = i == size + (-1) ? wui0.d : wui0.c;
                }
                arrayList.add(new ljq0(wui0Var, str, str2, z));
                i = i2;
            }
            mtlVar = null;
            collection = arrayList;
        }
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        lsm0 lsm0Var = ctf0Var.b;
        imm immVar = new imm(ilmVar, new plm(lsm0Var.a(R.string.select_period, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
        String strA = lsm0Var.a(R.string.limit_not_saved_error, Arrays.copyOf(new Object[0], 0));
        i4 i4VarR0 = dyb.r0(collection);
        int i4 = sli0Var.g;
        mtl mtlVar2 = (niq0Var == null || collection.isEmpty()) ? mtlVar : new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))), i4 >= 0 && i4 != sli0Var.f, false, true), ili0.f14981a)));
        boolean z2 = sli0Var.f32400a;
        boolean z3 = sli0Var.b;
        boolean z4 = sli0Var.c;
        boolean z5 = sli0Var.d;
        ocl oclVar = this.c;
        return new tli0(z2, z3, z4, z5, strA, i4VarR0, i4, immVar, z5 ? ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, 0, 0L, 0L, 990) : ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), mtlVar2);
    }

    private final Object g(Object obj) {
        Iterable iterableJ;
        dxh0 dxh0Var;
        vlj0 vlj0Var = (vlj0) obj;
        vlj0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = vlj0Var.e;
        List list = vlj0Var.c;
        boolean z2 = !z && list.size() > 1;
        if (z2) {
            lsm0 lsm0Var = ctf0Var.b;
            String strA = lsm0Var.a(R.string.share_app_android_tab_title, Arrays.copyOf(new Object[0], 0));
            bwh0 bwh0Var = bwh0.f3325a;
            iterableJ = q3d.j(new yvh0(strA, bwh0Var), new yvh0(lsm0Var.a(R.string.share_app_ios_tab_title, Arrays.copyOf(new Object[0], 0)), bwh0Var));
        } else {
            iterableJ = iun.f15405a;
        }
        int i = vlj0Var.f ? R.drawable.ic_xbet_dark : R.drawable.ic_xbet_light;
        mdm mdmVarB = ocl.b(this.c, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        int iOrdinal = vlj0Var.b.ordinal();
        if (iOrdinal == 0) {
            dxh0Var = axh0.f1625a;
        } else if (iOrdinal == 1) {
            dxh0Var = zwh0.f45106a;
        } else if (iOrdinal == 2) {
            dxh0Var = cxh0.f5122a;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
            dxh0Var = bxh0.f3376a;
        }
        return new wlj0(vlj0Var.f37627a, z2, dxh0Var, dyb.o0(iterableJ), dyb.o0(list), new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(ctf0Var.b.a(R.string.share, Arrays.copyOf(new Object[0], 0))), vlj0Var.d && !z, false, false), sh00.y))), vlj0Var.e, mdmVarB, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [a.iun] */
    private final Object h(Object obj) {
        ?? arrayList;
        long backgroundGroup;
        qkp0 qkp0Var = (qkp0) obj;
        qkp0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.team_squad, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
        boolean z = qkp0Var.b;
        long j = qkp0Var.f28897a;
        long j2 = qkp0Var.e;
        kkp0 kkp0Var = qkp0Var.d;
        if (z) {
            return new vkp0(immVar, lak0.c);
        }
        boolean z2 = qkp0Var.c;
        ocl oclVar = this.c;
        if (z2) {
            return new ukp0(immVar, lak0.c, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (kkp0Var != null) {
            LinkedHashMap linkedHashMap = kkp0Var.b;
            if (!linkedHashMap.isEmpty()) {
                Set setKeySet = linkedHashMap.keySet();
                ArrayList arrayList2 = new ArrayList(r3d.q(setKeySet, 10));
                int i = 0;
                String str = null;
                for (Object obj2 : setKeySet) {
                    int i2 = i + 1;
                    if (i < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str2 = (String) obj2;
                    ocl oclVar2 = oclVar;
                    long j3 = i;
                    if (j2 == j3) {
                        str = str2;
                    }
                    arrayList2.add(new lxl(j3, (dyl) new xxl(str2), (Integer) 1, false, j2 == j3 ? uxl.b : uxl.f36445a, (cwl) null));
                    oclVar = oclVar2;
                    i = i2;
                }
                ocl oclVar3 = oclVar;
                a4x a4xVarO0 = dyb.o0(arrayList2);
                if (str == null) {
                    return new ukp0(immVar, lak0.c, ocl.b(oclVar3, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                }
                List list = (List) linkedHashMap.get(str);
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    int i3 = 0;
                    for (Object obj3 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            q3d.p();
                            throw null;
                        }
                        ekb ekbVar = (ekb) obj3;
                        String str3 = ekbVar.f7944a;
                        String strValueOf = String.valueOf(ekbVar.c);
                        String str4 = ekbVar.b;
                        String strValueOf2 = String.valueOf(ekbVar.d);
                        String strValueOf3 = String.valueOf(ekbVar.e);
                        String strValueOf4 = String.valueOf(ekbVar.f);
                        if (i3 % 2 == 0) {
                            pz40 pz40Var2 = s6t0.f31722a;
                            backgroundGroup = s6t0.b().f33626a.getBackgroundContent();
                        } else {
                            pz40 pz40Var3 = s6t0.f31722a;
                            backgroundGroup = s6t0.b().f33626a.getBackgroundGroup();
                        }
                        long j4 = backgroundGroup;
                        arrayList.add(j == 1 ? new rkp0(str3, strValueOf, str4, strValueOf2, strValueOf3, strValueOf4, String.valueOf(ekbVar.h), String.valueOf(ekbVar.g), j4) : new skp0(str3, strValueOf, str4, strValueOf2, strValueOf3, strValueOf4, j4));
                        i3 = i4;
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                a4x a4xVarO1 = dyb.o0(arrayList);
                if (a4xVarO1.isEmpty()) {
                    return new ukp0(immVar, a4xVarO0, ocl.b(oclVar3, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                }
                return new tkp0(immVar, a4xVarO0, j == 1 ? zkp0.f44544a : j == 2 ? zkp0.b : zkp0.c, a4xVarO1);
            }
        }
        return new ukp0(immVar, lak0.c, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
    }

    private final Object i(Object obj) {
        zhs0 zhs0Var;
        knp0 knp0Var = (knp0) obj;
        knp0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        lsm0 lsm0Var = ctf0Var.b;
        imm immVar = new imm(ilmVar, new plm(lsm0Var.a(R.string.players_transfer, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
        boolean z = knp0Var.c;
        List list = knp0Var.d;
        ocl oclVar = this.c;
        if (z) {
            return new mnp0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), immVar);
        }
        if (knp0Var.b) {
            return new nnp0(immVar);
        }
        if (list.isEmpty()) {
            return new mnp0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), immVar);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            smp0 smp0Var = (smp0) it.next();
            smp0Var.getClass();
            znq0 znq0Var = smp0Var.b;
            ymp0 ymp0Var = smp0Var.f32458a;
            String strA = smp0Var.f;
            ufp0 ufp0Var = smp0Var.c;
            String str = ufp0Var.d;
            String str2 = ufp0Var.b;
            ufp0 ufp0Var2 = smp0Var.d;
            String str3 = ufp0Var2.d;
            String str4 = ufp0Var2.b;
            b9a0 b9a0Var = smp0Var.e;
            String str5 = b9a0Var.b;
            imm immVar2 = immVar;
            bre breVar = b9a0Var.e;
            String str6 = b9a0Var.f;
            Iterator it2 = it;
            int iOrdinal = ymp0Var.ordinal();
            if (iOrdinal == 0) {
                String strJ = g7x.J(str6);
                String string = ((StringBuilder) rz4.d("sfiles", "logo_teams", breVar.b).b).toString();
                rdj rdjVar = rdj.f30294a;
                String strF = rdj.f(znq0Var, sdj.UNIVERSAL, null, 60);
                if (strA.length() == 0) {
                    strA = lsm0Var.a(R.string.player_info_transfer_unknown, Arrays.copyOf(new Object[0], 0));
                }
                zhs0Var = new zhs0(strJ, string, str5, strF, strA, str2.length() == 0 ? "—" : str2, g7x.J(str), str4.length() == 0 ? "—" : str4, g7x.J(str3));
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                String strJ2 = g7x.J(str6);
                String string2 = ((StringBuilder) rz4.d("sfiles", "logo_teams", breVar.b).b).toString();
                rdj rdjVar2 = rdj.f30294a;
                String strF2 = rdj.f(znq0Var, sdj.UNIVERSAL, null, 60);
                if (strA.length() == 0) {
                    strA = lsm0Var.a(R.string.player_info_transfer_unknown, Arrays.copyOf(new Object[0], 0));
                }
                zhs0Var = new zhs0(strJ2, string2, str5, strF2, strA, str4.length() == 0 ? "—" : str4, g7x.J(str3), str2.length() == 0 ? "—" : str2, g7x.J(str));
            }
            zhs0 zhs0Var2 = zhs0Var;
            arrayList.add(zhs0Var2);
            int iOrdinal2 = ymp0Var.ordinal();
            if (iOrdinal2 == 0) {
                arrayList2.add(zhs0Var2);
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return null;
                }
                arrayList3.add(zhs0Var2);
            }
            immVar = immVar2;
            it = it2;
        }
        imm immVar3 = immVar;
        ArrayList arrayListL = q3d.l(dyb.o0(arrayList));
        String strA2 = lsm0Var.a(R.string.all, Arrays.copyOf(new Object[0], 0));
        bwh0 bwh0Var = bwh0.f3325a;
        ArrayList arrayListL2 = q3d.l(new yvh0(strA2, bwh0Var));
        if (!arrayList2.isEmpty()) {
            arrayListL.add(dyb.o0(arrayList2));
            arrayListL2.add(new yvh0(lsm0Var.a(R.string.players_transfer_from, Arrays.copyOf(new Object[0], 0)), bwh0Var));
        }
        if (!arrayList3.isEmpty()) {
            arrayListL.add(dyb.o0(arrayList3));
            arrayListL2.add(new yvh0(lsm0Var.a(R.string.players_transfer_to, Arrays.copyOf(new Object[0], 0)), bwh0Var));
        }
        return new lnp0(immVar3, dyb.o0(arrayListL2), knp0Var.f, knp0Var.e, dyb.o0(arrayListL));
    }

    private final Object l(Object obj) {
        fzp0 fzp0Var = (fzp0) obj;
        fzp0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        boolean z = fzp0Var.f10419a;
        uyp0 uyp0Var = fzp0Var.d;
        if (z) {
            return kzp0.f19162a;
        }
        boolean z2 = fzp0Var.b;
        ocl oclVar = this.c;
        if (z2) {
            return new jzp0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (fzp0Var.c || uyp0Var == null) {
            return new izp0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.statistic_empty_data, 0, 0L, 0L, 990));
        }
        nii0 nii0Var = uyp0Var.c;
        lc00 lc00VarB = kotlin.collections.a.b();
        lsm0 lsm0Var = ctf0Var.b;
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_aces, Arrays.copyOf(new Object[0], 0)), nii0Var.f23589a));
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_double_faults, Arrays.copyOf(new Object[0], 0)), nii0Var.b));
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_first_serve_persent, Arrays.copyOf(new Object[0], 0)), nii0Var.c));
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_first_serve_points_won_persent, Arrays.copyOf(new Object[0], 0)), nii0Var.d));
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_second_serve_points_won_persent, Arrays.copyOf(new Object[0], 0)), nii0Var.e));
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_break_points_faced_persent, Arrays.copyOf(new Object[0], 0)), nii0Var.f));
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_break_points_saved_persent, Arrays.copyOf(new Object[0], 0)), nii0Var.g));
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_service_games_played, Arrays.copyOf(new Object[0], 0)), nii0Var.h));
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_service_game_won_persent, Arrays.copyOf(new Object[0], 0)), nii0Var.i));
        lc00VarB.add(new gzp0(lsm0Var.a(R.string.tennis_summary_total_service_point_won_persent, Arrays.copyOf(new Object[0], 0)), nii0Var.j));
        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
        jag0 jag0Var = uyp0Var.d;
        lc00 lc00VarB2 = kotlin.collections.a.b();
        lc00VarB2.add(new gzp0(lsm0Var.a(R.string.tennis_summary_first_serve_return_points_won_persent, Arrays.copyOf(new Object[0], 0)), jag0Var.f16188a));
        lc00VarB2.add(new gzp0(lsm0Var.a(R.string.tennis_summary_second_serve_return_points_won_persent, Arrays.copyOf(new Object[0], 0)), jag0Var.b));
        lc00VarB2.add(new gzp0(lsm0Var.a(R.string.tennis_summary_break_points_opportunities, Arrays.copyOf(new Object[0], 0)), jag0Var.c));
        lc00VarB2.add(new gzp0(lsm0Var.a(R.string.tennis_summary_break_points_converted_persent, Arrays.copyOf(new Object[0], 0)), jag0Var.d));
        lc00VarB2.add(new gzp0(lsm0Var.a(R.string.tennis_summary_return_games_played, Arrays.copyOf(new Object[0], 0)), jag0Var.e));
        lc00VarB2.add(new gzp0(lsm0Var.a(R.string.tennis_summary_return_games_won_played, Arrays.copyOf(new Object[0], 0)), jag0Var.f));
        lc00VarB2.add(new gzp0(lsm0Var.a(R.string.tennis_summary_return_points_won_played, Arrays.copyOf(new Object[0], 0)), jag0Var.g));
        lc00VarB2.add(new gzp0(lsm0Var.a(R.string.tennis_summary_total_points_won_played, Arrays.copyOf(new Object[0], 0)), jag0Var.h));
        return new hzp0(lc00VarA, kotlin.collections.a.a(lc00VarB2), fzp0Var.e);
    }

    private final Object m(Object obj) {
        Object next;
        Pair pair;
        String str;
        long background;
        p0q0 p0q0Var = (p0q0) obj;
        p0q0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        if (p0q0Var.f26166a) {
            return u0q0.f34867a;
        }
        boolean z = p0q0Var.c;
        ocl oclVar = this.c;
        if (z) {
            return new s0q0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        if (p0q0Var.b) {
            return new t0q0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        List list = p0q0Var.e.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hmn0) next).d.length() <= 0);
        boolean z2 = ((hmn0) next) != null;
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            hmn0 hmn0Var = (hmn0) obj2;
            String str2 = hmn0Var.f13318a;
            String strValueOf = String.valueOf(hmn0Var.b);
            String strValueOf2 = String.valueOf(hmn0Var.c);
            if (z2) {
                str = hmn0Var.d;
                if (str.length() == 0) {
                    str = "-";
                }
            } else {
                str = null;
            }
            ixp0 ixp0Var = new ixp0(str2, strValueOf, strValueOf2, str);
            if (i % 2 == 0) {
                pz40 pz40Var = s6t0.f31722a;
                background = s6t0.b().f33626a.getBackgroundContent();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                background = s6t0.b().f33626a.getBackground();
            }
            arrayList.add(new cxp0(ixp0Var, background));
            i = i2;
        }
        if (p0q0Var.d) {
            Integer numValueOf = Integer.valueOf(R.drawable.ic_filter_active_new);
            pz40 pz40Var3 = s6t0.f31722a;
            pair = new Pair(numValueOf, new y3d(s6t0.b().f33626a.getPrimary()));
        } else {
            Integer numValueOf2 = Integer.valueOf(R.drawable.ic_filter_inactive_new);
            pz40 pz40Var4 = s6t0.f31722a;
            pair = new Pair(numValueOf2, new y3d(s6t0.b().f33626a.getSecondary()));
        }
        int iIntValue = ((Number) pair.f46059a).intValue();
        long j = ((y3d) pair.b).f41946a;
        lsm0 lsm0Var = ctf0Var.b;
        return new r0q0(new q0q0(new bxp0(new ixp0("", lsm0Var.a(R.string.referee_team_title_2, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.tennis_losses, Arrays.copyOf(new Object[0], 0)), z2 ? lsm0Var.a(R.string.tennis_win_rate, Arrays.copyOf(new Object[0], 0)) : null)), dyb.r0(arrayList)), iIntValue, j);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    private final Object o(Object obj) {
        itl itlVar;
        List list;
        String strA;
        List list2;
        wui0 wui0Var;
        ikq0 ikq0Var = (ikq0) obj;
        ikq0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        siq0 siq0Var = ikq0Var.e;
        if (siq0Var == null || (list2 = siq0Var.k) == null) {
            itlVar = null;
            list = iun.f15405a;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
            int i = 0;
            for (Object obj2 : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                a95 a95Var = (a95) obj2;
                int size = list2.size();
                if (size == 1) {
                    wui0Var = wui0.f39793a;
                } else if (i == 0) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = i == size + (-1) ? wui0.d : wui0.c;
                }
                String str = a95Var.c;
                String str2 = a95Var.b;
                int i3 = ikq0Var.g;
                arrayList.add(new mjq0(wui0Var, str, str2, i3 >= 0 && i == i3));
                i = i2;
            }
            itlVar = null;
            list = arrayList;
        }
        List list3 = list;
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        lsm0 lsm0Var = ctf0Var.b;
        imm immVar = new imm(ilmVar, new plm(lsm0Var.a(R.string.select_period, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
        xrz xrzVar = ikq0Var.h;
        if (xrzVar == null) {
            strA = lsm0Var.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        } else if (xrzVar instanceof qmq0) {
            strA = lsm0Var.a(R.string.timeout_setup_description, Arrays.copyOf(new Object[0], 0));
        } else if (xrzVar instanceof h8i0) {
            strA = lsm0Var.a(R.string.self_exclusion_summary, Arrays.copyOf(new Object[0], 0));
        } else {
            strA = lsm0Var.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
        }
        String str3 = strA;
        int i4 = ikq0Var.g;
        itl itlVar2 = (siq0Var == null || list3.isEmpty()) ? itlVar : new itl(new wul(lul.e, oe9.f25112a, new ue9(lsm0Var.a(R.string.confirm, Arrays.copyOf(new Object[0], 0))), i4 >= 0 && i4 != ikq0Var.f, false, true), xjq0.f41000a);
        boolean z = ikq0Var.f14941a;
        boolean z2 = ikq0Var.b;
        boolean z3 = ikq0Var.c;
        boolean z4 = ikq0Var.d;
        ocl oclVar = this.c;
        return new jkq0(z, z2, z3, z4, list3, i4, str3, immVar, z4 ? ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, 0, 0L, 0L, 990) : ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), itlVar2);
    }

    private final Object p(Object obj) {
        char c;
        char c2;
        tjs0 tjs0Var = (tjs0) obj;
        tjs0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        if (tjs0Var.f34065a) {
            return wjs0.f39279a;
        }
        boolean z = tjs0Var.c;
        ocl oclVar = this.c;
        if (z) {
            return new vjs0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        if (tjs0Var.b) {
            return new vjs0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        List<jca0> list = tjs0Var.d;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (jca0 jca0Var : list) {
            jca0Var.getClass();
            String str = jca0Var.f16267a;
            String strA = jca0Var.d;
            ufp0 ufp0Var = jca0Var.b;
            String str2 = ufp0Var.b;
            ufp0 ufp0Var2 = jca0Var.c;
            String str3 = ufp0Var2.b;
            StringBuilder sb = new StringBuilder(ujn.h);
            String str4 = ufp0Var.d;
            str4.getClass();
            if (str4.length() == 0) {
                sb.setLength(0);
                c = '/';
            } else if (StringsKt.O(str4, ujn.h, false) || kotlin.text.c.x(str4, "https://", false)) {
                c = '/';
                sb.setLength(0);
                sb.append(str4);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                c = '/';
                sb.append(StringsKt.y0(str4, '/'));
            }
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder(ujn.h);
            String str5 = ufp0Var2.d;
            str5.getClass();
            if (str5.length() == 0) {
                sb2.setLength(0);
            } else if (StringsKt.O(str5, ujn.h, false) || kotlin.text.c.x(str5, "https://", false)) {
                sb2.setLength(0);
                sb2.append(str5);
            } else {
                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                    c2 = c;
                } else {
                    c2 = c;
                    sb2.append(c2);
                }
                sb2.append(StringsKt.y0(str5, c2));
            }
            String string2 = sb2.toString();
            if (strA.equals(Separators.QUESTION)) {
                strA = ctf0Var.b.a(R.string.player_info_transfer_unknown, Arrays.copyOf(new Object[0], 0));
            }
            arrayList.add(new qhs0(str, str2, str3, string, string2, strA));
        }
        return new ujs0(dyb.o0(arrayList));
    }

    private final Object r(Object obj) {
        htr ftrVar;
        y9n y9nVar;
        dgv0 dgv0Var = (dgv0) obj;
        dgv0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
        boolean z = dgv0Var.c;
        List<pbv> list = dgv0Var.d;
        int i = 0;
        imm immVar = new imm(ilmVar, z ? new nlm(new hmm(10, dgv0Var.b, ctf0Var.b.a(R.string.search_by_games, Arrays.copyOf(new Object[0], 0)), false)) : new plm(ctf0Var.b.a(R.string.game_choice, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, new y3d(s6t0.b().f33626a.getSeparator60()));
        if (list.isEmpty()) {
            return new fgv0(s6t0.b().f33626a.getBackground(), immVar, ocl.b(this.c, pb10.e, null, 0, 0, R.string.nothing_found, 0, 0L, 0L, 734));
        }
        long background = s6t0.b().f33626a.getBackground();
        if (dgv0Var.f6061a) {
            ftrVar = new gtr(true);
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (pbv pbvVar : list) {
                Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
                String str = pbvVar.f;
                hcs hcsVar = pbvVar.d;
                boolean z2 = pbvVar.o;
                hds hdsVar = pbvVar.n;
                if (wvb.O(str) > 1.0d) {
                    String strA = ctf0Var.b.a(R.string.win_to_xgame_card_title, Arrays.copyOf(new Object[i], i));
                    pn40 pn40Var = pn40.f27267a;
                    y9nVar = new y9n(strA, "x".concat(pn40.c(wvb.O(pbvVar.f), p3u0.c)));
                } else {
                    y9nVar = null;
                }
                arrayList.add(new l9n(pbvVar.f26728a, pbvVar.p ? new t9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z2 ? p9n.DEMO : null, w7n0.B(hcsVar)) : new u9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z2 ? p9n.DEMO : null, w7n0.B(hcsVar), y9nVar), new h9n(pbvVar.c)));
                i = 0;
            }
            ftrVar = new ftr(dyb.o0(arrayList));
        }
        return new egv0(background, immVar, ftrVar);
    }

    private final Object s(Object obj) {
        vk90 vk90Var;
        mmv0 mmv0Var = (mmv0) obj;
        mmv0Var.getClass();
        ctf0 ctf0Var = this.b;
        ctf0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        int i = 0;
        imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.personal_statistic, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
        if (mmv0Var.f22062a) {
            return new qmv0(immVar);
        }
        boolean z = mmv0Var.b;
        ocl oclVar = this.c;
        if (z) {
            return new pmv0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), immVar);
        }
        if (mmv0Var.c || (vk90Var = mmv0Var.d) == null || (vk90Var instanceof uk90)) {
            return new pmv0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), immVar);
        }
        ArrayList arrayList = ((tk90) vk90Var).b;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            yam0 yam0Var = (yam0) obj2;
            yam0Var.getClass();
            int i3 = i % 2;
            pz40 pz40Var2 = s6t0.f31722a;
            arrayList2.add(new nmv0(yam0Var.f42307a, qim0.v(yam0Var.b), qim0.v(yam0Var.c), qim0.v(yam0Var.d), qim0.v(yam0Var.e), i3 == 0 ? s6t0.b().f33626a.getBackgroundContent() : s6t0.b().f33626a.getBackground()));
            i = i2;
        }
        return new omv0(immVar, dyb.o0(arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:269:0x09ea  */
    /* JADX WARN: Code duplicated, block: B:276:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:36:0x011c  */
    /* JADX WARN: Code duplicated, block: B:39:0x012d  */
    /* JADX WARN: Code duplicated, block: B:42:0x013c  */
    /* JADX WARN: Code duplicated, block: B:43:0x013e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0141  */
    /* JADX WARN: Code duplicated, block: B:48:0x0150  */
    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x0155  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:60:0x0179  */
    /* JADX WARN: Code duplicated, block: B:66:0x0192  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v43 java.lang.Object, still in use, count: 2, list:
          (r10v43 java.lang.Object) from 0x09dc: PHI (r10 I:??) = (r10v40 java.lang.Object), (r10v43 java.lang.Object) binds: [B:262:0x09da, B:380:0x09dc] A[DONT_GENERATE, DONT_INLINE]
          (r10v43 java.lang.Object) from 0x09cd: CHECK_CAST (a.ufp0) (r10v43 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 4130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gpb0.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ gpb0(ctf0 ctf0Var, ocl oclVar, byte b) {
        this.f11674a = b;
        this.b = ctf0Var;
        this.c = oclVar;
    }

    public /* synthetic */ gpb0(ocl oclVar, ctf0 ctf0Var, byte b) {
        this.f11674a = b;
        this.c = oclVar;
        this.b = ctf0Var;
    }
}
