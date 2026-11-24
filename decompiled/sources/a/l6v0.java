package a;

import android.content.ComponentCallbacks2;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.games_section.api.models.GamesActionsFragmentResultModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/l6v0;", "La/yx5;", "<init>", "()V", "a/sxs0", "weekly_reward"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l6v0 extends yx5 {
    public final hnm0 K1;
    public final e9o0 L1;
    public mzi M1;
    public final kiu0 N1;
    public final s0r O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(l6v0.class, "binding", "getBinding()Lorg/xplatform/games_section/feature/weekly_reward/databinding/FragmentOnexgamesWeeklyRewardBinding;", 0)};
    public static final sxs0 P1 = new sxs0((byte) 13);

    public l6v0() {
        super(R.layout.fragment_onexgames_weekly_reward);
        this.K1 = hnm0.f13359a;
        bp3 bp3Var = bp3.b;
        this.L1 = new e9o0(R.attr.uikitStaticBlack, R.attr.uikitStaticBlack, bp3Var, bp3Var);
        g6v0 g6v0Var = new g6v0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new cvs0(new cvs0(this, (byte) 27), (byte) 28));
        this.N1 = agc.G(this, sre0.f32672a.b(d7v0.class), new w6u0(a8zVarA, (byte) 20), new w6u0(a8zVarA, (byte) 21), g6v0Var);
        this.O1 = ltt0.o(this, j6v0.f16009a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        qcc.X(this, new g6v0(this, (byte) 1));
        G0().g.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a.i6v0
            public final /* synthetic */ l6v0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                l6v0 l6v0Var = this.b;
                switch (b2) {
                    case 0:
                        sxs0 sxs0Var = l6v0.P1;
                        d7v0 d7v0VarH0 = l6v0Var.H0();
                        d7v0VarH0.b.d(new q6v0(d7v0VarH0, (byte) 0));
                        break;
                    default:
                        sxs0 sxs0Var2 = l6v0.P1;
                        l6v0Var.H0().x();
                        break;
                }
            }
        });
        List list = u0d.f34849a;
        u0d.j(G0().d, "/static/img/android/actions/everyweekTournament/background.webp", 0, 0, null, null, null, 510);
        ViewPager2 viewPager2 = G0().j;
        int iCeil = (int) Math.ceil(o0().getResources().getDisplayMetrics().density * 24.0f);
        x860 x860Var = new x860();
        yje yjeVar = null;
        if (iCeil < 0) {
            jf4.o("Margin must be non-negative");
            throw null;
        }
        x860Var.f40449a = iCeil;
        viewPager2.setPageTransformer(x860Var);
        G0().j.c(new xp6(this, (byte) 17));
        final byte b2 = 0;
        G0().b.setOnItemClickListener(new Function1(this) { // from class: a.h6v0
            public final /* synthetic */ l6v0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                l6v0 l6v0Var = this.b;
                switch (b3) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        sxs0 sxs0Var = l6v0.P1;
                        l6v0Var.G0().j.setCurrentItem(iIntValue);
                        break;
                    default:
                        sxs0 sxs0Var2 = l6v0.P1;
                        ((GamesActionsFragmentResultModel) obj).getClass();
                        i1w0 i1w0Var = l6v0Var.H0().b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        TextView textView = G0().i;
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder().append((CharSequence) H(R.string.promo_weekly_reward_heading_part1)).append((CharSequence) Separators.SP);
        spannableStringBuilderAppend.getClass();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilderAppend.length();
        spannableStringBuilderAppend.append((CharSequence) H(R.string.promo_weekly_reward_day_count));
        spannableStringBuilderAppend.setSpan(styleSpan, length, spannableStringBuilderAppend.length(), 17);
        textView.setText(spannableStringBuilderAppend.append((CharSequence) Separators.SP).append((CharSequence) H(R.string.promo_weekly_reward_heading_part2)));
        G0().c.setOnClickListener(new View.OnClickListener(this) { // from class: a.i6v0
            public final /* synthetic */ l6v0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                l6v0 l6v0Var = this.b;
                switch (b3) {
                    case 0:
                        sxs0 sxs0Var = l6v0.P1;
                        d7v0 d7v0VarH0 = l6v0Var.H0();
                        d7v0VarH0.b.d(new q6v0(d7v0VarH0, (byte) 0));
                        break;
                    default:
                        sxs0 sxs0Var2 = l6v0.P1;
                        l6v0Var.H0().x();
                        break;
                }
            }
        });
        d7v0 d7v0VarH0 = H0();
        d7v0VarH0.p = false;
        d7v0VarH0.m.cancel(null);
        d7v0VarH0.m = slb.U(new fnq(d7v0VarH0.i.b(), new k6s0(d7v0VarH0, yjeVar, (byte) 23), (byte) 4), jiu0.a(d7v0VarH0));
        o2t.d(F(), this, "", new Function1(this) { // from class: a.h6v0
            public final /* synthetic */ l6v0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                l6v0 l6v0Var = this.b;
                switch (b3) {
                    case 0:
                        int iIntValue = ((Integer) obj).intValue();
                        sxs0 sxs0Var = l6v0.P1;
                        l6v0Var.G0().j.setCurrentItem(iIntValue);
                        break;
                    default:
                        sxs0 sxs0Var2 = l6v0.P1;
                        ((GamesActionsFragmentResultModel) obj).getClass();
                        i1w0 i1w0Var = l6v0Var.H0().b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        if (!(application instanceof vmv)) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
        if (applicationLoader.c() == null) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        g8i g8iVarC = applicationLoader.c();
        if (g8iVarC != null) {
            this.M1 = (mzi) ((n5d0) new kki(new uxs0((byte) 13), g8iVarC).f).get();
        } else {
            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.WeeklyRewardDependencies");
        }
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().r;
        yje yjeVar = null;
        k6v0 k6v0Var = new k6v0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new npu0(p7m0Var, clzVarW, k6v0Var, (yje) null), 3);
        qoj0 qoj0Var = H0().q;
        k6v0 k6v0Var2 = new k6v0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new npu0((gmq) qoj0Var, clzVarW2, k6v0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var2 = H0().s;
        k6v0 k6v0Var3 = new k6v0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new npu0((gmq) p7m0Var2, clzVarW3, k6v0Var3, (yje) null, (char) 0), 3);
    }

    public final k2r G0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (k2r) objN;
    }

    public final d7v0 H0() {
        return (d7v0) this.N1.getValue();
    }

    public final void I0(int i) {
        TextView textView = G0().h;
        String strValueOf = String.valueOf(i);
        yge0 adapter = G0().j.getAdapter();
        textView.setText(I(R.string.promo_weekly_reward_amount, strValueOf, String.valueOf(adapter != null ? adapter.d() : 0)));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        o2t.a(F());
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.L1;
    }
}
