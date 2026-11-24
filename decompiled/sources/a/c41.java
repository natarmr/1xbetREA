package a;

import org.xplatform.aggregator.impl.category.presentation.models.AggregatorJackpotBottomSheetParams;

/* JADX INFO: loaded from: classes3.dex */
public final class c41 extends i3t0 {
    public final AggregatorJackpotBottomSheetParams o;
    public final grj p;
    public final e41 q;
    public final s31 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(AggregatorJackpotBottomSheetParams aggregatorJackpotBottomSheetParams, grj grjVar, e41 e41Var, s31 s31Var, mne mneVar, ctf0 ctf0Var) {
        super(null, new mc((Object) ctf0Var, (Object) aggregatorJackpotBottomSheetParams, (byte) 11), new eo0((byte) 15), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = aggregatorJackpotBottomSheetParams;
        this.p = grjVar;
        this.q = e41Var;
        this.r = s31Var;
        i8i.D("jackpot_id", "530", s31Var.f31532a, "jackpot_popup_show");
        b1j.r(530, e41Var.f7161a, 11990L);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        x31 x31Var = (x31) obj;
        x31Var.getClass();
        super.x(x31Var);
        boolean z = x31Var instanceof w31;
        s31 s31Var = this.r;
        e41 e41Var = this.q;
        if (z) {
            e41Var.a(o31.f24558a);
            s31Var.e("take_part");
            this.p.a(this.o.b);
            return;
        }
        if (x31Var instanceof v31) {
            e41Var.a(o31.b);
            s31Var.e("later");
        } else if (!(x31Var instanceof u31)) {
            t9f.b();
        } else {
            e41Var.a(o31.c);
            s31Var.e("ignore");
        }
    }
}
