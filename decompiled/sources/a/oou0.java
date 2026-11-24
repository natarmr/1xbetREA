package a;

import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualCategoryDisciplinesParams;

/* JADX INFO: loaded from: classes4.dex */
public final class oou0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final hzg o;
    public final mne p;
    public final r2u q;
    public final m1e r;
    public final duj s;
    public final VirtualCategoryDisciplinesParams t;
    public c4m0 u;
    public bby v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oou0(hzg hzgVar, g2v g2vVar, ctf0 ctf0Var, mne mneVar, r2u r2uVar, m1e m1eVar, duj dujVar, VirtualCategoryDisciplinesParams virtualCategoryDisciplinesParams) {
        super(new o1u0((byte) 16), cvm0.p(mneVar.c, mneVar.f22085a), new cls0(ctf0Var, g2vVar, (byte) 8), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = hzgVar;
        this.p = mneVar;
        this.q = r2uVar;
        this.r = m1eVar;
        this.s = dujVar;
        this.t = virtualCategoryDisciplinesParams;
    }

    public final void M() {
        e3c.n(this.u);
        this.u = sac.T(new fnq(i120.W(this.r.b()), new nou0(this, null, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), this.p.f22085a), foe.h);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        kou0 kou0Var;
        dou0 dou0Var = (dou0) obj;
        dou0Var.getClass();
        super.x(dou0Var);
        if (!(dou0Var instanceof cou0)) {
            if (!(dou0Var instanceof vnu0)) {
                t9f.b();
                return;
            }
            vnu0 vnu0Var = (vnu0) dou0Var;
            if (vnu0Var instanceof unu0) {
                if (((kou0) D()).b == null) {
                    M();
                    return;
                }
                return;
            } else {
                if (!(vnu0Var instanceof tnu0)) {
                    t9f.b();
                    return;
                }
                c4m0 c4m0Var = this.u;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                    return;
                }
                return;
            }
        }
        cou0 cou0Var = (cou0) dou0Var;
        boolean z = cou0Var instanceof aou0;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            boolean z2 = ((aou0) cou0Var).f1220a;
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value5 = p7m0Var.getValue();
                value5.getClass();
                kou0Var = (kou0) value5;
                oyg0Var.getClass();
            } while (!p7m0Var.m(value5, !z2 ? kou0.a(kou0Var, "", null, z2, false, 10) : kou0.a(kou0Var, null, null, z2, false, 11)));
            return;
        }
        boolean z3 = cou0Var instanceof xnu0;
        hzg hzgVar = this.o;
        if (z3) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, kou0.a((kou0) value3, "", null, false, false, 14)));
            if (!((kou0) D()).c) {
                ((uzg) hzgVar).a();
                return;
            }
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value4 = p7m0Var3.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value4, kou0.a((kou0) value4, "", null, false, false, 10)));
            return;
        }
        if (cou0Var instanceof bou0) {
            String str = ((bou0) cou0Var).f2952a;
            p7m0 p7m0Var4 = ocjVar.f25029a;
            do {
                value2 = p7m0Var4.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var4.m(value2, kou0.a((kou0) value2, str, null, false, false, 14)));
            return;
        }
        if (cou0Var instanceof ynu0) {
            ((uzg) hzgVar).c(((ynu0) cou0Var).f42958a, CyberGamesPage.Virtual.INSTANCE, k1g.OPEN_REGULAR);
            return;
        }
        if (!(cou0Var instanceof wnu0)) {
            if (cou0Var instanceof znu0) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        if (!((kou0) D()).c) {
            ((uzg) hzgVar).a();
            return;
        }
        p7m0 p7m0Var5 = ocjVar.f25029a;
        do {
            value = p7m0Var5.getValue();
            value.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var5.m(value, kou0.a((kou0) value, "", null, false, false, 10)));
    }
}
