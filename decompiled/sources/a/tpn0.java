package a;

import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class tpn0 extends w46 {
    public final ywu b;
    public final mne c;
    public final kvu d;
    public final i1w0 e;
    public final m6m0 f;
    public final s31 g;
    public final zx10 h;
    public final e41 i;
    public final ctf0 j;
    public final wyu k;
    public final List l;
    public final List m;
    public final p7m0 n;
    public final ol60 o;
    public List p;
    public bby q;

    public tpn0(vzg0 vzg0Var, ywu ywuVar, mne mneVar, kvu kvuVar, i1w0 i1w0Var, m6m0 m6m0Var, s31 s31Var, zx10 zx10Var, e41 e41Var, ctf0 ctf0Var, wyu wyuVar) {
        ctf0Var.getClass();
        wyuVar.getClass();
        this.b = ywuVar;
        this.c = mneVar;
        this.d = kvuVar;
        this.e = i1w0Var;
        this.f = m6m0Var;
        this.g = s31Var;
        this.h = zx10Var;
        this.i = e41Var;
        this.j = ctf0Var;
        this.k = wyuVar;
        this.l = q3d.j(Integer.valueOf(R.string.swipe_x_onboarding_title), Integer.valueOf(R.string.swipe_x_onboarding_title_second_page), Integer.valueOf(R.string.swipe_x_onboarding_title_third_page));
        this.m = q3d.j(Integer.valueOf(R.string.swipe_x_onboarding_description), Integer.valueOf(R.string.swipe_x_onboarding_description_second_page), Integer.valueOf(R.string.swipe_x_onboarding_description_final_page));
        iun iunVar = iun.f15405a;
        this.n = q7m0.a(new rpn0(R.string.start, iunVar, false, 0, R.string.swipe_x_onboarding_title, R.string.swipe_x_onboarding_description, 1.0f));
        this.o = new ol60(3);
        this.p = iunVar;
        sac.V(jiu0.a(this), new rgn0((byte) 7), null, mneVar.f22085a, new spn0(this, null, (byte) 0), 10);
    }

    public final void w(int i) {
        v3c.N(this.q);
        this.q = sac.V(jiu0.a(this), new rgn0((byte) 8), null, this.c.f22085a, new u52(i, this, (yje) null), 10);
    }
}
