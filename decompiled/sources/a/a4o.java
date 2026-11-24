package a;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class a4o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b4o f233a;

    public a4o(b4o b4oVar) {
        this.f233a = b4oVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027e  */
    /* JADX WARN: Code duplicated, block: B:102:0x0286  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:79:0x01da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x020f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0221  */
    /* JADX WARN: Code duplicated, block: B:96:0x023d  */
    /* JADX WARN: Code duplicated, block: B:98:0x025b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zBooleanValue;
        wkm wkmVar;
        wkm wkmVar2;
        lc00 lc00VarB;
        lc00 lc00VarA;
        int iB;
        tlm plmVar;
        gmm dmmVar;
        m3o m3oVar;
        b4o b4oVar = this.f233a;
        n0o0 n0o0Var = b4oVar.f;
        fee feeVar = ((Number) b4oVar.a().c()).intValue() == 0 ? (fee) b4oVar.m.getValue() : (fee) b4oVar.n.getValue();
        Boolean bool = (Boolean) ((fee) n0o0Var.getValue()).c();
        boolean zBooleanValue2 = bool.booleanValue();
        ctf0 ctf0Var = b4oVar.c;
        boolean zBooleanValue3 = ((Boolean) ((fee) b4oVar.h.getValue()).c()).booleanValue();
        String str = (String) ((fee) b4oVar.l.getValue()).c();
        ygq0 ygq0Var = (ygq0) ((fee) b4oVar.j.getValue()).c();
        boolean z = ((Number) b4oVar.a().c()).intValue() == 0;
        boolean zBooleanValue4 = ((Boolean) ((fee) b4oVar.k.getValue()).c()).booleanValue();
        boolean z2 = b4oVar.f1968a.f41962a instanceof EsportsGamesScreenParams.BestGames;
        wa50 ta50Var = null;
        if (((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue()) {
            zBooleanValue = true;
        } else {
            j0g0 j0g0Var = (j0g0) feeVar.c();
            if (j0g0Var != null) {
                Object obj2 = j0g0Var.f15681a;
                if (obj2 instanceof g0g0) {
                    obj2 = null;
                }
                m3oVar = (m3o) obj2;
            } else {
                m3oVar = null;
            }
            if (m3oVar != null) {
                zBooleanValue = true;
            } else {
                zBooleanValue = false;
            }
        }
        boolean z3 = ((Number) ((fee) b4oVar.i.getValue()).c()).intValue() == CyberGamesPage.Virtual.INSTANCE.f46556a;
        boolean zBooleanValue5 = ((Boolean) ((fee) b4oVar.o.getValue()).c()).booleanValue();
        ctf0Var.getClass();
        str.getClass();
        ygq0Var.getClass();
        pz40 pz40Var = s6t0.f31722a;
        long secondary = s6t0.b().f33626a.getSecondary();
        ra50 ra50Var = ra50.f30118a;
        wkm wkmVar3 = new wkm(0, R.drawable.ic_search_new, zBooleanValue, ra50Var, secondary);
        wkm wkmVar4 = new wkm(3, zBooleanValue5 ? R.drawable.expand_group_off_ic : R.drawable.expand_group_on_ic, zBooleanValue, ra50Var, zBooleanValue5 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary());
        if (!z) {
            if (z2) {
                wkmVar = null;
            } else {
                ygq0 ygq0Var2 = ygq0.NOT;
                int i = ygq0Var != ygq0Var2 ? R.drawable.ic_filter_active : R.drawable.ic_filter_inactive;
                if (zBooleanValue2) {
                    bool = null;
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                wkmVar2 = new wkm(1, i, zBooleanValue, ra50Var, ygq0Var != ygq0Var2 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary());
            }
            lc00VarB = kotlin.collections.a.b();
            if (!z3 && !zBooleanValue3) {
                lc00VarB.add(wkmVar3);
                lc00VarB.add(wkmVar4);
            } else if (!z3 && zBooleanValue3) {
                lc00VarB.add(wkmVar4);
            } else if (!z3 && !zBooleanValue3) {
                lc00VarB.add(wkmVar3);
            }
            if (wkmVar != null) {
                lc00VarB.add(wkmVar);
            }
            lc00VarA = kotlin.collections.a.a(lc00VarB);
            iB = lc00VarA.b();
            if (iB != 1) {
                ta50Var = new ta50((wkm) lc00VarA.get(0));
            } else if (iB != 2) {
                ta50Var = new va50((wkm) lc00VarA.get(0), (wkm) lc00VarA.get(1));
            } else if (iB == 3) {
                ta50Var = new ua50((wkm) lc00VarA.get(0), (wkm) lc00VarA.get(1), (wkm) lc00VarA.get(2));
            }
            ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
            if (zBooleanValue3) {
                plmVar = new nlm(new hmm(10, str, ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false));
            } else {
                plmVar = new plm(ctf0Var.b.a(R.string.feed_title_game_list, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
            }
            tlm tlmVar = plmVar;
            if (ta50Var != null) {
                dmmVar = new dmm(ta50Var);
            } else {
                dmmVar = fmm.f9790a;
            }
            return new f4o(new imm(ilmVar, tlmVar, dmmVar, s6t0.b().f33626a.getBackgroundContent(), false, null));
        }
        int i2 = zBooleanValue4 ? R.drawable.ic_translation_live_enable : R.drawable.ic_translation_live_disable;
        if (zBooleanValue2) {
            bool = null;
        }
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        wkmVar2 = new wkm(2, i2, zBooleanValue, ra50Var, zBooleanValue4 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary());
        wkmVar = wkmVar2;
        lc00VarB = kotlin.collections.a.b();
        if (!z3) {
            if (!z3) {
                if (!z3) {
                    lc00VarB.add(wkmVar3);
                }
            } else if (!z3) {
                lc00VarB.add(wkmVar3);
            }
        } else if (!z3) {
            if (!z3) {
                lc00VarB.add(wkmVar3);
            }
        } else if (!z3) {
            lc00VarB.add(wkmVar3);
        }
        if (wkmVar != null) {
            lc00VarB.add(wkmVar);
        }
        lc00VarA = kotlin.collections.a.a(lc00VarB);
        iB = lc00VarA.b();
        if (iB != 1) {
            ta50Var = new ta50((wkm) lc00VarA.get(0));
        } else if (iB != 2) {
            ta50Var = new va50((wkm) lc00VarA.get(0), (wkm) lc00VarA.get(1));
        } else if (iB == 3) {
            ta50Var = new ua50((wkm) lc00VarA.get(0), (wkm) lc00VarA.get(1), (wkm) lc00VarA.get(2));
        }
        ilm ilmVar2 = new ilm(s6t0.b().f33626a.getSecondary());
        if (zBooleanValue3) {
            plmVar = new nlm(new hmm(10, str, ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0)), false));
        } else {
            plmVar = new plm(ctf0Var.b.a(R.string.feed_title_game_list, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a);
        }
        tlm tlmVar2 = plmVar;
        if (ta50Var != null) {
            dmmVar = new dmm(ta50Var);
        } else {
            dmmVar = fmm.f9790a;
        }
        return new f4o(new imm(ilmVar2, tlmVar2, dmmVar, s6t0.b().f33626a.getBackgroundContent(), false, null));
    }
}
