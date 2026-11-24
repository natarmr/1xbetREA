package a;

import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.os.CancellationSignal;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.fragment.app.Fragment;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.material.button.MaterialButton;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.sale.presentation.model.SaleScreenModel;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.home.CyberHomeParams;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class enm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8101a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ enm(pru pruVar, sqt sqtVar, lbu lbuVar, r9u r9uVar, ctf0 ctf0Var) {
        this.f8101a = (byte) 25;
        this.e = pruVar;
        this.b = lbuVar;
        this.c = r9uVar;
        this.d = ctf0Var;
    }

    private final Object a(Object obj) {
        f6x f6xVar = (f6x) this.e;
        l7m0 l7m0Var = (l7m0) this.b;
        l7m0 l7m0Var2 = (l7m0) this.c;
        l7m0 l7m0Var3 = (l7m0) this.d;
        pi9 pi9Var = (pi9) obj;
        pi9Var.getClass();
        float density = pi9Var.getDensity() * 14.0f;
        return pi9Var.a(new fj1((Object) f6xVar, l7m0Var, (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L), l7m0Var2, l7m0Var3, (byte) 3));
    }

    private final Object b(Object obj) {
        e6x e6xVar = (e6x) this.e;
        l7m0 l7m0Var = (l7m0) this.b;
        l7m0 l7m0Var2 = (l7m0) this.c;
        l7m0 l7m0Var3 = (l7m0) this.d;
        pi9 pi9Var = (pi9) obj;
        pi9Var.getClass();
        float density = pi9Var.getDensity() * 14.0f;
        return pi9Var.a(new fj1((Object) e6xVar, l7m0Var, (((long) Float.floatToRawIntBits(density)) << 32) | (((long) Float.floatToRawIntBits(density)) & 4294967295L), l7m0Var2, l7m0Var3, (byte) 2));
    }

    private final Object c(Object obj) {
        pz40 pz40Var = (pz40) this.e;
        z7x z7xVar = (z7x) this.b;
        jie0 jie0Var = (jie0) this.c;
        vne vneVar = (vne) this.d;
        long jLongValue = ((Long) obj).longValue();
        l7m0 l7m0Var = (l7m0) pz40Var.getValue();
        long jLongValue2 = l7m0Var != null ? ((Number) l7m0Var.getValue()).longValue() : jLongValue;
        long j = z7xVar.c;
        xz40 xz40Var = z7xVar.f43942a;
        if (j == Long.MIN_VALUE || jie0Var.f16571a != hhm0.v(vneVar.getCoroutineContext())) {
            z7xVar.c = jLongValue;
            Object[] objArr = xz40Var.f41739a;
            int i = xz40Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                ((x7x) objArr[i2]).f = true;
            }
            jie0Var.f16571a = hhm0.v(vneVar.getCoroutineContext());
        }
        float f = jie0Var.f16571a;
        if (f == 0.0f) {
            Object[] objArr2 = xz40Var.f41739a;
            int i3 = xz40Var.c;
            for (int i4 = 0; i4 < i3; i4++) {
                x7x x7xVar = (x7x) objArr2[i4];
                ((hgk0) x7xVar.c).setValue(x7xVar.d.c);
                x7xVar.f = true;
            }
        } else {
            long j2 = (long) ((jLongValue2 - z7xVar.c) / f);
            Object[] objArr3 = xz40Var.f41739a;
            int i5 = xz40Var.c;
            boolean z = true;
            for (int i6 = 0; i6 < i5; i6++) {
                x7x x7xVar2 = (x7x) objArr3[i6];
                boolean zC = x7xVar2.e;
                if (!zC) {
                    ((hgk0) x7xVar2.h.b).setValue(Boolean.FALSE);
                    if (x7xVar2.f) {
                        x7xVar2.f = false;
                        x7xVar2.g = j2;
                    }
                    long j3 = j2 - x7xVar2.g;
                    ((hgk0) x7xVar2.c).setValue(x7xVar2.d.f(j3));
                    zC = x7xVar2.d.c(j3);
                    x7xVar2.e = zC;
                }
                if (!zC) {
                    z = false;
                }
            }
            ((hgk0) z7xVar.d).setValue(Boolean.valueOf(!z));
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj) {
        List list = (List) this.e;
        kie0 kie0Var = (kie0) this.b;
        List list2 = (List) this.c;
        q8z q8zVar = (q8z) this.d;
        ktb0 ktb0Var = (ktb0) obj;
        a5n0 a5n0Var = ktb0Var.e;
        int iC = a5n0Var != null ? a5n0Var.c() : 0;
        int iB = 0;
        for (int i = 0; i < iC; i++) {
            ma80 ma80Var = q8zVar.r;
            ma80 ma80Var2 = ma80.f21447a;
            a5n0 a5n0Var2 = ktb0Var.e;
            iB += (int) (ma80Var == ma80Var2 ? 4294967295L & (a5n0Var2 != null ? a5n0Var2.b(i) : 0L) : (a5n0Var2 != null ? a5n0Var2.b(i) : 0L) >> 32);
        }
        if (list != null) {
            list.add(Integer.valueOf(iB));
        }
        if (kie0Var.f18333a != list2.size()) {
            kie0Var.f18333a++;
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj) {
        tbz tbzVar = (tbz) this.e;
        gbz gbzVar = (gbz) this.b;
        b5n0 b5n0Var = (b5n0) this.c;
        ltb0 ltb0Var = (ltb0) this.d;
        o24 o24Var = new o24();
        o24Var.b = gbzVar;
        o24Var.c = b5n0Var;
        o24Var.d = ltb0Var;
        o24Var.f24513a = true;
        tbzVar.c = o24Var;
        return new ty2(tbzVar, (byte) 12);
    }

    private final Object i(Object obj) {
        vne vneVar = (vne) this.e;
        Function1 function1 = (Function1) this.b;
        uwh0 uwh0Var = (uwh0) this.c;
        xk80 xk80Var = (xk80) this.d;
        int iIntValue = ((Integer) obj).intValue();
        rwj rwjVar = tvk.f34603a;
        sac.V(vneVar, null, null, ys10.f43147a, new u48(xk80Var, iIntValue, null, (byte) 5), 11);
        function1.invoke(new g520(((mj80) uwh0Var.f36392a.get(iIntValue)).f21884a.getId()));
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        LoadableImageView loadableImageView = (LoadableImageView) this.e;
        Drawable drawable = (Drawable) this.d;
        Function1 function1 = (Function1) this.b;
        Function1 function2 = (Function1) this.c;
        int i = LoadableImageView.i;
        loadableImageView.post(new qx9((Object) loadableImageView, (Object) drawable, (Object) function1, (Object) function2, (byte) 6));
        return Boolean.FALSE;
    }

    private final Object m(Object obj) {
        vne vneVar = (vne) this.e;
        Function1 function1 = (Function1) this.b;
        vwh0 vwh0Var = (vwh0) this.c;
        xk80 xk80Var = (xk80) this.d;
        int iIntValue = ((Integer) obj).intValue();
        rwj rwjVar = tvk.f34603a;
        sac.V(vneVar, null, null, ys10.f43147a, new u48(xk80Var, iIntValue, null, (byte) 7), 11);
        function1.invoke(new g520(((nj80) vwh0Var.f38150a.get(iIntValue)).f23623a.getId()));
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        jie0 jie0Var = (jie0) this.e;
        iu40 iu40Var = (iu40) this.b;
        rch0 rch0Var = (rch0) this.c;
        dg dgVar = (dg) this.d;
        i73 i73Var = (i73) obj;
        float fFloatValue = ((Number) ((hgk0) i73Var.e).getValue()).floatValue() - jie0Var.f16571a;
        if (!k7x.Q(fFloatValue)) {
            if (!k7x.Q(fFloatValue - iu40Var.c(rch0Var, fFloatValue))) {
                i73Var.a();
                return Unit.f46060a;
            }
            jie0Var.f16571a += fFloatValue;
        }
        if (((Boolean) dgVar.invoke(Float.valueOf(jie0Var.f16571a))).booleanValue()) {
            i73Var.a();
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj) {
        ArrayList arrayList = (ArrayList) this.e;
        Function1 function1 = (Function1) this.b;
        kwj kwjVar = (kwj) this.c;
        cgk0 cgk0Var = (cgk0) this.d;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wo5) it.next()).b);
        }
        hczVar.f(arrayList2.size(), null, new j13(arrayList2, (byte) 18, false), new ugd(2039820996, true, new gq4((List) arrayList2, function1, (Object) kwjVar, (Object) cgk0Var, (byte) 7)));
        return Unit.f46060a;
    }

    private final Object r(Object obj) {
        w5z w5zVar = (w5z) this.e;
        rb60 rb60Var = (rb60) this.b;
        rb60 rb60Var2 = (rb60) this.c;
        rb60 rb60Var3 = (rb60) this.d;
        rb60 rb60Var4 = (rb60) obj;
        List listL = ((rpt) w5zVar.d).l(true);
        boolean z = false;
        boolean z2 = !(listL == null || listL.isEmpty());
        List listL2 = ((rpt) w5zVar.d).l(false);
        boolean z3 = !(listL2 == null || listL2.isEmpty());
        List listA = ((i9u) w5zVar.e).a();
        boolean z4 = !(listA == null || listA.isEmpty());
        if (Intrinsics.d(rb60Var4, rb60Var)) {
            z = z2;
        } else if (Intrinsics.d(rb60Var4, rb60Var2)) {
            z = z3;
        } else if (Intrinsics.d(rb60Var4, rb60Var3)) {
            z = z4;
        }
        return Boolean.valueOf(z);
    }

    private final Object s(Object obj) {
        w03 w03Var = (w03) this.e;
        q2a0 q2a0Var = (q2a0) this.b;
        w03 w03Var2 = (w03) this.c;
        vtm0 vtm0Var = (vtm0) this.d;
        fhl fhlVar = (fhl) obj;
        fhlVar.getClass();
        fhl.C0(fhlVar, w03Var, q2a0Var.d, 0.0f, null, 60);
        fhl.C0(fhlVar, w03Var2, q2a0Var.e, 0.0f, null, 60);
        fhl.C0(fhlVar, w03Var, q2a0Var.b, 0.0f, vtm0Var, 52);
        fhl.C0(fhlVar, w03Var2, q2a0Var.c, 0.0f, vtm0Var, 52);
        return Unit.f46060a;
    }

    private final Object t(Object obj) {
        pru pruVar = (pru) this.e;
        lbu lbuVar = (lbu) this.b;
        r9u r9uVar = (r9u) this.c;
        ctf0 ctf0Var = (ctf0) this.d;
        vzg0 vzg0Var = (vzg0) obj;
        vzg0Var.getClass();
        sff0 sff0VarA = pruVar.a();
        mum0 mum0Var = sff0VarA.g;
        g8l0 g8l0Var = mum0Var.z;
        boolean z = g8l0Var == g8l0.CHIPS;
        a4x a4xVarO0 = z ? dyb.o0(sqt.f(jhq0.f16541a)) : lak0.c;
        i8l0 i8l0Var = mum0Var.p;
        j8l0 j8l0Var = j8l0.MEDIUM_ITEMS_LINE_SEPARATOR;
        boolean zJ = lbuVar.j();
        boolean z2 = sff0VarA.J1;
        ygp ygpVar = ygp.t;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        rlp rlpVar = new rlp(zJ, z2, i8l0Var, j8l0Var, g8l0Var, j1q0Var.f15748a.d(ygpVar));
        String str = (String) a8k0.H(vzg0Var, "KEY_SEARCH_QUERY", "");
        xun xunVar = xun.f41520a;
        Set set = (Set) a8k0.H(vzg0Var, "EXPANDED_STATE_KEY", xunVar);
        List list = (List) a8k0.H(vzg0Var, "EXPANDED_GAMES_STATE_KEY", iun.f15405a);
        zmb zmbVar = (zmb) a8k0.H(vzg0Var, "KEY_CHAMP_SORT_TYPE", zmb.f44617a);
        String strA = ctf0Var.b.a(R.string.feeds_sport_events_count_new, Arrays.copyOf(new Object[0], 0));
        h8l0 h8l0Var = mum0Var.v;
        j6m0 j6m0Var = ygq0.b;
        int iIntValue = ((Number) a8k0.H(vzg0Var, "KEY_TIME_FILTER_ID", 0)).intValue();
        j6m0Var.getClass();
        ghq0 ghq0Var = new ghq0(j6m0.a(iIntValue), new wgq0(((Number) a8k0.H(vzg0Var, "KEY_TIME_FILTER_START", -1L)).longValue(), ((Number) a8k0.H(vzg0Var, "KEY_TIME_FILTER_END", -1L)).longValue()));
        Boolean bool = Boolean.FALSE;
        return new gua0(eua0.f8411a, rlpVar, str, set, list, zmbVar, false, strA, false, h8l0Var, false, z, a4xVarO0, ghq0Var, ((Boolean) a8k0.H(vzg0Var, "KEY_TIME_ACTIVE_STATE", bool)).booleanValue(), (FeedsChampsItemsSelectionState) a8k0.H(vzg0Var, "SELECTION_STATE_KEY", new FeedsChampsItemsSelectionState(xunVar, false)), ((Boolean) a8k0.H(vzg0Var, "KEY_MULTISELECT_ACTIVE_STATE", bool)).booleanValue());
    }

    private final Object u(Object obj) {
        a4x a4xVar = (a4x) this.e;
        xcz xczVar = (xcz) this.c;
        vne vneVar = (vne) this.d;
        Function1 function1 = (Function1) this.b;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        hczVar.f(a4xVar.size(), null, new a580(a4xVar, (byte) 29), new ugd(2039820996, true, new gq4((List) a4xVar, (Object) xczVar, (Object) vneVar, function1, (byte) 8)));
        return Unit.f46060a;
    }

    private final Object v(Object obj) {
        ujd ujdVar = (ujd) this.e;
        Fragment fragment = (Fragment) this.b;
        RelatedParams relatedParams = (RelatedParams) this.c;
        k3t0 k3t0Var = (k3t0) this.d;
        ((lwk) obj).getClass();
        ujdVar.c(fragment, relatedParams.h, new ebh(k3t0Var, (byte) 6));
        return new fbh(ujdVar, fragment, (byte) 1);
    }

    private final Object w(Object obj) {
        pz40 pz40Var = (pz40) this.e;
        edg0 edg0Var = (edg0) this.c;
        Function1 function1 = (Function1) this.b;
        k6z k6zVar = (k6z) this.d;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        ((apm) pz40Var.getValue()).getClass();
        a4x a4xVar = ((apm) pz40Var.getValue()).f1259a;
        hczVar.f(a4xVar.size(), null, new ubn(a4xVar, (byte) 27), new ugd(2039820996, true, new vll(a4xVar, pz40Var, edg0Var, k6zVar, function1)));
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EsportsGamesScreenParams bestGames;
        TextView textView;
        Group group;
        TextView textView2;
        String strI0;
        TextView textView3;
        String str;
        Object wyjVar;
        byte b = this.f8101a;
        byte b2 = 3;
        Object[] objArr = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.e;
        switch (b) {
            case 0:
                hnm hnmVar = (hnm) obj5;
                Function1 function1 = (Function1) obj4;
                Function1 function2 = (Function1) obj3;
                lm90 lm90Var = (lm90) obj2;
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    String strL = wwb.L(hnmVar.b, hnmVar.f13358a, ((w5q0) x5q0Var).f38596a);
                    function1.invoke(strL);
                    function2.invoke(lm90Var.b(strL));
                }
                return Unit.f46060a;
            case 1:
                inm inmVar = (inm) obj5;
                Function1 function3 = (Function1) obj4;
                Function1 function4 = (Function1) obj3;
                lm90 lm90Var2 = (lm90) obj2;
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    String strL2 = wwb.L(inmVar.b, inmVar.f15080a, ((w5q0) x5q0Var2).f38596a);
                    function3.invoke(strL2);
                    function4.invoke(lm90Var2.b(strL2));
                }
                return Unit.f46060a;
            case 2:
                EsportsGamesScreenParams esportsGamesScreenParams = (EsportsGamesScreenParams) obj5;
                lbu lbuVar = (lbu) obj4;
                pru pruVar = (pru) obj3;
                r9u r9uVar = (r9u) obj2;
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                int iIntValue = ((Number) a8k0.H(vzg0Var, "KEY_CURRENT_TAB", Integer.valueOf(!esportsGamesScreenParams.getC() ? 1 : 0))).intValue();
                EsportsGamesScreenParams.BestGames bestGames2 = esportsGamesScreenParams instanceof EsportsGamesScreenParams.BestGames ? (EsportsGamesScreenParams.BestGames) esportsGamesScreenParams : null;
                if (bestGames2 != null) {
                    bestGames = new EsportsGamesScreenParams.BestGames(bestGames2.f46561a, iIntValue == 0);
                } else {
                    bestGames = esportsGamesScreenParams;
                }
                boolean zJ = lbuVar.j();
                sff0 sff0VarA = pruVar.a();
                ygq0 ygq0Var = ygq0.NOT;
                boolean z = esportsGamesScreenParams.getD() == CyberGamesPage.Virtual.INSTANCE.f46556a;
                ygp ygpVar = ygp.t;
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new y3o(bestGames, null, null, zJ, iIntValue, sff0VarA, false, false, ygq0Var, "", -1L, -1L, false, z, false, j1q0Var.f15748a.d(ygpVar));
            case 3:
                amg amgVar = (amg) obj5;
                Context context = (Context) obj2;
                d1o0 d1o0Var = (d1o0) obj;
                d1o0Var.getClass();
                TextView textView4 = d1o0Var.f;
                ConstraintLayout constraintLayout = d1o0Var.f5319a;
                textView4.setText(amgVar.b);
                TextView textView5 = d1o0Var.l;
                textView5.setText(amgVar.c);
                d1o0Var.g.setText(amgVar.f1106a);
                String str2 = amgVar.f;
                TextView textView6 = d1o0Var.i;
                textView6.setText(str2);
                String str3 = amgVar.g;
                TextView textView7 = d1o0Var.k;
                textView7.setText(str3);
                int i = amgVar.h;
                ImageView imageView = d1o0Var.d;
                imageView.setBackgroundResource(i);
                int i2 = amgVar.i;
                ImageView imageView2 = d1o0Var.e;
                imageView2.setBackgroundResource(i2);
                float f = amgVar.j;
                textView4.setAlpha(f);
                LinearLayout linearLayout = d1o0Var.b;
                linearLayout.setAlpha(f);
                textView6.setAlpha(f);
                d1o0Var.h.setAlpha(f);
                d1o0Var.m.setAlpha(f);
                float f2 = amgVar.k;
                textView5.setAlpha(f2);
                LinearLayout linearLayout2 = d1o0Var.c;
                linearLayout2.setAlpha(f2);
                textView7.setAlpha(f2);
                d1o0Var.j.setAlpha(f2);
                d1o0Var.n.setAlpha(f2);
                u1c.t(linearLayout, amgVar.d, (List) obj4, false);
                u1c.t(linearLayout2, amgVar.e, (List) obj3, true);
                context.getClass();
                if (Math.sqrt(Math.pow(((double) context.getResources().getDisplayMetrics().heightPixels) / ((double) context.getResources().getDisplayMetrics().ydpi), 2.0d) + Math.pow(((double) context.getResources().getDisplayMetrics().widthPixels) / ((double) context.getResources().getDisplayMetrics().xdpi), 2.0d)) < 5.3d) {
                    imageView.setVisibility(8);
                    imageView2.setVisibility(8);
                }
                if (amgVar.l) {
                    constraintLayout.setLayoutDirection(3);
                    int i3 = (constraintLayout.getResources().getConfiguration().getLayoutDirection() == 1 ? 1 : 0) ^ 1;
                    Iterator it = new ihu0(linearLayout2).iterator();
                    while (true) {
                        jhu0 jhu0Var = (jhu0) it;
                        if (jhu0Var.hasNext()) {
                            ((View) jhu0Var.next()).setLayoutDirection(i3);
                        }
                    }
                } else {
                    constraintLayout.setLayoutDirection(0);
                    textView4.setGravity(3);
                    textView5.setGravity(5);
                }
                return Unit.f46060a;
            case 4:
                sah sahVar = (sah) obj5;
                List list = (List) obj4;
                List list2 = (List) obj3;
                List list3 = (List) obj2;
                g1o0 g1o0Var = (g1o0) obj;
                g1o0Var.getClass();
                TextView textView8 = g1o0Var.m;
                TextView textView9 = g1o0Var.j;
                TextView textView10 = g1o0Var.k;
                TextView textView11 = g1o0Var.l;
                boolean z2 = sahVar.o;
                if (z2) {
                    cy7.a(textView11);
                    cy7.a(textView10);
                    textView9.setGravity(8388613);
                    textView8.setGravity(8388613);
                }
                TextView textView12 = g1o0Var.h;
                LinearLayout linearLayout3 = g1o0Var.i;
                LinearLayout linearLayout4 = g1o0Var.c;
                ImageView imageView3 = g1o0Var.g;
                ImageView imageView4 = g1o0Var.f;
                ImageView imageView5 = g1o0Var.e;
                ImageView imageView6 = g1o0Var.d;
                textView12.setText(sahVar.f31887a);
                textView9.setText(sahVar.b);
                textView11.setText(sahVar.c);
                imageView6.setImageResource(sahVar.h);
                imageView5.setImageResource(sahVar.i);
                imageView4.setImageResource(sahVar.j);
                imageView3.setImageResource(sahVar.k);
                textView10.setText(sahVar.f);
                textView8.setText(sahVar.g);
                ViewGroup viewGroup = g1o0Var.b;
                ArrayList arrayList = sahVar.n;
                Iterator it2 = new ihu0(viewGroup).iterator();
                int i4 = 0;
                while (true) {
                    jhu0 jhu0Var2 = (jhu0) it2;
                    if (!jhu0Var2.hasNext()) {
                        g1o0 g1o0Var2 = g1o0Var;
                        TextView textView13 = textView8;
                        Iterator it3 = arrayList.iterator();
                        int i5 = 0;
                        while (it3.hasNext()) {
                            Object next = it3.next();
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                q3d.p();
                                throw null;
                            }
                            int i7 = ((una0) next).f35951a;
                            n6o0 n6o0Var = (n6o0) CollectionsKt.W(i5, list);
                            if (n6o0Var == null) {
                                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.synthetic_poker_card_item, viewGroup, false);
                                if (viewInflate == null) {
                                    hny.u("rootView");
                                    return null;
                                }
                                ImageView imageView7 = (ImageView) viewInflate;
                                n6o0Var = new n6o0(imageView7);
                                viewGroup.addView(imageView7);
                                list.add(n6o0Var);
                            }
                            n6o0Var.f23005a.setImageResource(i7);
                            it3 = it3;
                            i5 = i6;
                            imageView3 = imageView3;
                        }
                        vbc.T(linearLayout4, sahVar.l, list2);
                        vbc.T(linearLayout3, sahVar.m, list3);
                        float f3 = sahVar.d;
                        textView9.setAlpha(f3);
                        linearLayout4.setAlpha(f3);
                        imageView6.setAlpha(f3);
                        imageView5.setAlpha(f3);
                        textView10.setAlpha(f3);
                        float f4 = sahVar.e;
                        textView11.setAlpha(f4);
                        linearLayout3.setAlpha(f4);
                        imageView4.setAlpha(f4);
                        imageView3.setAlpha(f4);
                        textView13.setAlpha(f4);
                        ConstraintLayout constraintLayout2 = g1o0Var2.f10524a;
                        if (z2) {
                            constraintLayout2.setLayoutDirection(3);
                        } else {
                            constraintLayout2.setLayoutDirection(0);
                        }
                        return Unit.f46060a;
                    }
                    Object next2 = jhu0Var2.next();
                    int i8 = i4 + 1;
                    if (i4 < 0) {
                        q3d.p();
                        throw null;
                    }
                    g1o0 g1o0Var3 = g1o0Var;
                    View view = (View) next2;
                    TextView textView14 = textView8;
                    view.setVisibility(i4 < arrayList.size() ? 0 : 8);
                    g1o0Var = g1o0Var3;
                    textView8 = textView14;
                    i4 = i8;
                }
                break;
            case 5:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                View view2 = cpVar.f40887a;
                view2.getClass();
                dyb.c0(view2, new abd((m1w) obj5, cpVar, (byte) 1));
                cpVar.t(new enm((Object) cpVar, obj4, obj3, obj2, (byte) 6));
                return Unit.f46060a;
            case 6:
                cp cpVar2 = (cp) obj5;
                m1w m1wVar = (m1w) obj4;
                vft vftVar = (vft) obj3;
                vft vftVar2 = (vft) obj2;
                ((List) obj).getClass();
                yfu0 yfu0Var = cpVar2.u;
                View view3 = cpVar2.f40887a;
                y0w y0wVar = (y0w) yfu0Var;
                TextView textView15 = y0wVar.S;
                ViewGroup.LayoutParams layoutParams = textView15.getLayoutParams();
                layoutParams.getClass();
                a3e a3eVar = (a3e) layoutParams;
                TextView textView16 = y0wVar.E;
                ViewGroup.LayoutParams layoutParams2 = textView16.getLayoutParams();
                layoutParams2.getClass();
                a3e a3eVar2 = (a3e) layoutParams2;
                TextView textView17 = y0wVar.M;
                ViewGroup.LayoutParams layoutParams3 = textView17.getLayoutParams();
                layoutParams3.getClass();
                a3e a3eVar3 = (a3e) layoutParams3;
                if (((fbr) cpVar2.u()).t) {
                    a3eVar2.j = y0wVar.h0.getId();
                    a3eVar.j = textView16.getId();
                    a3eVar3.j = textView15.getId();
                    textView15.setLayoutParams(a3eVar);
                    textView16.setLayoutParams(a3eVar2);
                    textView17.setLayoutParams(a3eVar3);
                }
                TextView textView18 = y0wVar.E;
                Group group2 = y0wVar.z;
                Group group3 = y0wVar.A;
                Group group4 = y0wVar.w;
                Group group5 = y0wVar.o0;
                Group group6 = y0wVar.y;
                TextView textView19 = y0wVar.L;
                ImageView imageView8 = y0wVar.s;
                TextView textView20 = y0wVar.J;
                TextView textView21 = y0wVar.I;
                TextView textView22 = y0wVar.h0;
                TextView textView23 = y0wVar.c;
                ImageView imageView9 = y0wVar.h;
                TextView textView24 = y0wVar.R;
                Group group7 = y0wVar.j;
                TextView textView25 = y0wVar.S;
                ViewGroup.LayoutParams layoutParams4 = textView18.getLayoutParams();
                layoutParams4.getClass();
                a3e a3eVar4 = (a3e) layoutParams4;
                ViewGroup.LayoutParams layoutParams5 = textView25.getLayoutParams();
                layoutParams5.getClass();
                a3e a3eVar5 = (a3e) layoutParams5;
                ViewGroup.LayoutParams layoutParams6 = textView23.getLayoutParams();
                layoutParams6.getClass();
                a3e a3eVar6 = (a3e) layoutParams6;
                TextView textView26 = y0wVar.M;
                ViewGroup.LayoutParams layoutParams7 = textView26.getLayoutParams();
                layoutParams7.getClass();
                a3e a3eVar7 = (a3e) layoutParams7;
                if (((fbr) cpVar2.u()).v) {
                    a3eVar4.j = textView22.getId();
                    a3eVar6.j = y0wVar.E.getId();
                    a3eVar5.j = textView23.getId();
                    a3eVar7.j = textView25.getId();
                    textView25.setLayoutParams(a3eVar5);
                    textView23.setLayoutParams(a3eVar6);
                    textView26.setLayoutParams(a3eVar7);
                }
                lsv lsvVar = ((fbr) cpVar2.u()).d;
                TextView textView27 = y0wVar.U;
                TextView textView28 = y0wVar.D;
                FrameLayout frameLayout = y0wVar.r;
                FrameLayout frameLayout2 = y0wVar.p;
                TextView textView29 = y0wVar.V;
                rdj rdjVar = rdj.f30294a;
                boolean z3 = ((fbr) cpVar2.u()).q1;
                long j = lsvVar.f20600a;
                String str4 = lsvVar.d;
                textView27.setText(rdj.g(new znq0(j), efj.UNIVERSAL, Boolean.valueOf(z3), false, 56));
                TextView textView30 = y0wVar.W;
                q4f q4fVar = ((fbr) cpVar2.u()).o;
                q4f q4fVar2 = q4f.u;
                textView30.setVisibility(q4fVar == q4fVar2 ? 0 : 8);
                y0wVar.a0.setVisibility(lsvVar.b ? 0 : 8);
                y0wVar.l0.setText(lsvVar.c);
                textView29.setVisibility(lsvVar.n ? 0 : 8);
                textView29.setText(lsvVar.o);
                y0wVar.Y.setText(str4);
                y0wVar.Z.setVisibility(!StringsKt.W(str4) ? 0 : 8);
                frameLayout2.setVisibility(lsvVar.e ? 0 : 8);
                y0wVar.o.setImageResource(lsvVar.f);
                byte b3 = 1;
                dyb.c0(frameLayout2, new bbd(m1wVar, cpVar2, b3));
                frameLayout.setVisibility(lsvVar.g ? 0 : 8);
                dyb.b0(frameLayout, ymx.INTERVAL_500, new cbd(b3, cpVar2, vftVar));
                y0wVar.X.setVisibility(lsvVar.h ? 0 : 8);
                y0wVar.f.setVisibility(lsvVar.i ? 0 : 8);
                y0wVar.F.setText(lsvVar.k);
                y0wVar.b.setVisibility(lsvVar.j ? 0 : 8);
                textView23.setText(lsvVar.l);
                y0wVar.d.setText(lsvVar.m);
                textView28.setVisibility(lsvVar.p ? 0 : 8);
                textView28.setText(lsvVar.q);
                y0wVar.g.setVisibility(lsvVar.r ? 0 : 8);
                hfl0 hfl0Var = ((fbr) cpVar2.u()).x;
                if (hfl0Var instanceof gfl0) {
                    imageView9.setImageResource(((gfl0) hfl0Var).f11212a);
                    TypedValue typedValue = j5d.f15927a;
                    Context context2 = imageView9.getContext();
                    context2.getClass();
                    imageView9.setColorFilter(j5d.a(context2, R.attr.uikitSecondary, false));
                } else if (hfl0Var instanceof ffl0) {
                    List list4 = u0d.f34849a;
                    u0d.k(imageView9, ((ffl0) hfl0Var).f9451a);
                } else if (!hfl0Var.equals(efl0.f7724a)) {
                    t9f.b();
                    return null;
                }
                TextView textView31 = y0wVar.N;
                TextView textView32 = y0wVar.T;
                textView31.setText(((fbr) cpVar2.u()).y);
                textView32.setVisibility(((fbr) cpVar2.u()).A ? 0 : 8);
                textView32.setText(((fbr) cpVar2.u()).z);
                y0wVar.K.setText(((fbr) cpVar2.u()).B);
                if (((fbr) cpVar2.u()).k1) {
                    textView21.setVisibility(0);
                    textView20.setVisibility(0);
                    textView21.setText(view3.getContext().getResources().getString(R.string.coef_view_ind));
                    textView20.setText(view3.getContext().getResources().getString(R.string.coefficient_type_title));
                } else {
                    textView21.setVisibility(8);
                    textView20.setVisibility(8);
                }
                y0wVar.e.setVisibility(((fbr) cpVar2.u()).g1 ? 0 : 8);
                y0wVar.C.setText(y0wVar.f41826a.getContext().getString(R.string.casino_history_bet_type));
                y0wVar.B.setText(((fbr) cpVar2.u()).h1);
                lzc lzcVar = ((fbr) cpVar2.u()).o1;
                Group group8 = y0wVar.n;
                Group group9 = y0wVar.l;
                boolean z4 = lzcVar instanceof kzc;
                imageView8.setVisibility(z4 ? 0 : 8);
                if (lzcVar instanceof jzc) {
                    jzc jzcVar = (jzc) lzcVar;
                    group9.setVisibility(!jzcVar.c ? 0 : 8);
                    y0wVar.G.setText(jzcVar.f17405a);
                    y0wVar.H.setText(jzcVar.b);
                    group8.setVisibility(8);
                    lmc.W(cpVar2, true);
                } else if (z4) {
                    group9.setVisibility(8);
                    lmc.W(cpVar2, false);
                    kzc kzcVar = (kzc) lzcVar;
                    group8.setVisibility(kzcVar.d ? 0 : 8);
                    y0wVar.O.setText(kzcVar.b);
                    y0wVar.d0.setText(kzcVar.c);
                    y0wVar.e0.setText(kzcVar.f19147a);
                    List list5 = u0d.f34849a;
                    u0d.k(imageView8, kzcVar.e);
                }
                y0wVar.i.setVisibility(((fbr) cpVar2.u()).f1 ? 0 : 8);
                y0wVar.Q.setText(((fbr) cpVar2.u()).Y);
                y0wVar.P.setText(((fbr) cpVar2.u()).Z);
                if (((fbr) cpVar2.u()).h == s77.SALE) {
                    group = group7;
                    group.setVisibility(0);
                    textView = textView24;
                    textView.setTextColor(((fbr) cpVar2.u()).j);
                    textView.setText(((fbr) cpVar2.u()).i);
                    textView2 = textView25;
                    textView2.setText(view3.getContext().getString(R.string.history_your_profit_new));
                } else {
                    textView = textView24;
                    group = group7;
                    textView2 = textView25;
                    if (((fbr) cpVar2.u()).m > 0.0d && ((fbr) cpVar2.u()).l != e4f.g) {
                        group.setVisibility(0);
                        textView2.setText(view3.getContext().getString(R.string.history_your_win_new));
                        if (((fbr) cpVar2.u()).o == q4fVar2) {
                            pn40 pn40Var = pn40.f27267a;
                            strI0 = kng0.l(pn40.c(((fbr) cpVar2.u()).m, p3u0.c), Separators.SP, view3.getResources().getString(R.string.pts));
                        } else if (((fbr) cpVar2.u()).o != q4f.y || ((fbr) cpVar2.u()).p.length() <= 0) {
                            strI0 = jtv.I0(((fbr) cpVar2.u()).m, ((fbr) cpVar2.u()).q, false);
                        } else {
                            String str5 = ((fbr) cpVar2.u()).p;
                            pn40 pn40Var2 = pn40.f27267a;
                            strI0 = w6x.q(str5, Separators.SP, pn40.d(((fbr) cpVar2.u()).m, ((fbr) cpVar2.u()).q, p3u0.c));
                        }
                        textView.setText(strI0);
                        textView.setTextColor(cpVar2.w.getColor(R.color.static_green));
                    } else if (((fbr) cpVar2.u()).k > 0.0d && ((fbr) cpVar2.u()).l == e4f.j) {
                        group.setVisibility(0);
                        textView2.setText(view3.getContext().getString(R.string.history_bill_received));
                        textView.setText(jtv.I0(((fbr) cpVar2.u()).k, ((fbr) cpVar2.u()).q, false));
                        TypedValue typedValue2 = j5d.f15927a;
                        Context context3 = view3.getContext();
                        context3.getClass();
                        textView.setTextColor(j5d.a(context3, R.attr.uikitTextPrimary, false));
                    } else if (((fbr) cpVar2.u()).r && ((fbr) cpVar2.u()).k > 0.0d) {
                        group.setVisibility(0);
                        textView2.setText(view3.getContext().getString(((fbr) cpVar2.u()).p1));
                        textView.setText(jtv.I0(((fbr) cpVar2.u()).k, ((fbr) cpVar2.u()).q, false));
                        TypedValue typedValue3 = j5d.f15927a;
                        Context context4 = view3.getContext();
                        context4.getClass();
                        textView.setTextColor(j5d.a(context4, R.attr.uikitTextPrimary, false));
                    } else if (((fbr) cpVar2.u()).l != e4f.j || ((fbr) cpVar2.u()).s <= 0.0d) {
                        group.setVisibility(8);
                    } else {
                        group.setVisibility(0);
                        textView2.setText(view3.getContext().getString(R.string.credited_to_account_with_colon));
                        textView.setText(jtv.I0(((fbr) cpVar2.u()).s, ((fbr) cpVar2.u()).q, false));
                        TypedValue typedValue4 = j5d.f15927a;
                        Context context5 = view3.getContext();
                        context5.getClass();
                        textView.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                    }
                }
                Group group10 = y0wVar.t;
                TextView textView33 = y0wVar.u;
                group10.setVisibility(((fbr) cpVar2.u()).n.d ? 0 : 8);
                y0wVar.v.setText(((fbr) cpVar2.u()).n.f21497a);
                textView33.setText(((fbr) cpVar2.u()).n.b);
                textView33.setTextColor(((fbr) cpVar2.u()).n.c);
                e4f e4fVar = ((fbr) cpVar2.u()).l;
                Context context6 = view3.getContext();
                context6.getClass();
                if (feb.a0(e4fVar, context6) != 0) {
                    e4f e4fVar2 = ((fbr) cpVar2.u()).l;
                    Context context7 = view3.getContext();
                    context7.getClass();
                    int iA0 = feb.a0(e4fVar2, context7);
                    textView3 = textView19;
                    textView3.setTextColor(iA0);
                } else {
                    textView3 = textView19;
                }
                Group group11 = y0wVar.x;
                ImageView imageView10 = y0wVar.q;
                group11.setVisibility(((fbr) cpVar2.u()).i1 ? 0 : 8);
                if (((fbr) cpVar2.u()).o == q4fVar2) {
                    imageView10.setImageResource(0);
                    String string = view3.getContext().getResources().getString(feb.X(((fbr) cpVar2.u()).l));
                    string.getClass();
                    CharSequence text = view3.getContext().getText(((fbr) cpVar2.u()).l1 ? R.string.confirmed : R.string.not_confirmed);
                    text.getClass();
                    textView3.setText(string + " (" + ((Object) text) + Separators.RPAREN);
                } else if (((fbr) cpVar2.u()).l == e4f.e && ((fbr) cpVar2.u()).m1 == ((fbr) cpVar2.u()).n1 && ((fbr) cpVar2.u()).m1 > 0.0d) {
                    imageView10.setImageResource(feb.V(((fbr) cpVar2.u()).l));
                    textView3.setText(view3.getResources().getString(R.string.history_paid_and_prepaid, jtv.I0(((fbr) cpVar2.u()).m, ((fbr) cpVar2.u()).q, false), jtv.I0(((fbr) cpVar2.u()).m1, ((fbr) cpVar2.u()).q, false)));
                } else {
                    imageView10.setImageResource(feb.V(((fbr) cpVar2.u()).l));
                    textView3.setText(view3.getContext().getResources().getString(feb.X(((fbr) cpVar2.u()).l)));
                }
                MaterialButton materialButton = y0wVar.k;
                materialButton.setVisibility(((fbr) cpVar2.u()).e ? 0 : 8);
                materialButton.setText(view3.getResources().getString(R.string.history_sale_for_v2, ((fbr) cpVar2.u()).f));
                dyb.c0(materialButton, new f5p(vftVar2, cpVar2, (byte) 16));
                y0wVar.m.setVisibility(((fbr) cpVar2.u()).g ? 0 : 8);
                if (((fbr) cpVar2.u()).b) {
                    exo0 exo0Var = ((fbr) cpVar2.u()).c;
                    group6.setVisibility(exo0Var.f8589a ? 0 : 8);
                    y0wVar.f0.setText(exo0Var.b);
                    y0wVar.g0.setText(exo0Var.c);
                    group5.setVisibility(exo0Var.f ? 0 : 8);
                    y0wVar.m0.setText(exo0Var.d);
                    y0wVar.n0.setText(exo0Var.e);
                    group4.setVisibility(exo0Var.g ? 0 : 8);
                    y0wVar.b0.setText(exo0Var.h);
                    y0wVar.c0.setText(exo0Var.i);
                    group3.setVisibility(exo0Var.j ? 0 : 8);
                    y0wVar.j0.setText(exo0Var.k);
                    y0wVar.k0.setText(exo0Var.l);
                    group2.setVisibility(exo0Var.n ? 0 : 8);
                    textView22.setText(exo0Var.m);
                    y0wVar.i0.setText(exo0Var.o);
                    if (exo0Var.p) {
                        textView2.setText(exo0Var.q);
                        textView.setText(exo0Var.r);
                        textView.setTextColor(exo0Var.s);
                        group.setVisibility(0);
                    }
                } else {
                    group6.setVisibility(8);
                    group5.setVisibility(8);
                    group4.setVisibility(8);
                    group3.setVisibility(8);
                    group2.setVisibility(8);
                }
                return Unit.f46060a;
            case 7:
                int iIntValue2 = ((Integer) obj).intValue();
                rwj rwjVar = tvk.f34603a;
                qjj.W((vne) obj5, ys10.f43147a, null, new u48((xk80) obj2, iIntValue2, objArr == true ? 1 : 0, b2), 2);
                ((Function1) obj4).invoke(new g520(((oj80) ((wwh0) obj3).f39885a.get(iIntValue2)).f25348a.getId()));
                return Unit.f46060a;
            case 8:
                CancellationSignal cancellationSignal = (CancellationSignal) obj5;
                c0u c0uVar = (c0u) obj4;
                Context context8 = c0uVar.d;
                Executor executor = (Executor) obj3;
                ybf ybfVar = (ybf) obj2;
                PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (ocf.a(cancellationSignal)) {
                    return Unit.f46060a;
                }
                Intent intent = new Intent(context8, (Class<?>) HiddenActivity.class);
                ecf.a(c0uVar.h, intent, "BEGIN_SIGN_IN");
                intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingGetCredentialHandle.f45521a);
                try {
                    context8.startActivity(intent);
                    break;
                } catch (Exception unused) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!ocf.a(cancellationSignal)) {
                        executor.execute(new kcf(ybfVar, (byte) 7));
                    }
                }
                return Unit.f46060a;
            case 9:
                pz40 pz40Var = (pz40) obj3;
                eav eavVar = (eav) obj2;
                Pair pair = (Pair) obj;
                ((Function1) ((pz40) obj5).getValue()).invoke(pair.b);
                ((pz40) obj4).setValue(CollectionsKt.f0((List) pair.b));
                ou40 ou40Var = (ou40) pair.f46059a;
                boolean z5 = ou40Var.b;
                boolean z6 = ou40Var.f25859a;
                if (z5 && z6) {
                    str = eavVar.c;
                } else {
                    str = z6 ? eavVar.b : eavVar.f7488a;
                }
                pz40Var.setValue(str);
                return Unit.f46060a;
            case 10:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                List list6 = (List) ((pz40) obj5).getValue();
                hczVar.f(list6.size(), new d2p(new umu((byte) 13), list6, (byte) 18), new d2p(new umu((byte) 14), list6, (byte) 19), new ugd(802480018, true, new frk(list6, (qdz) obj2, (Function1) obj4, (Function1) obj3, (byte) 2)));
                return Unit.f46060a;
            case 11:
                CyberHomeParams cyberHomeParams = (CyberHomeParams) obj5;
                ctf0 ctf0Var = (ctf0) obj4;
                y78 y78Var = (y78) obj3;
                g2v g2vVar = (g2v) obj2;
                zjw zjwVar = (zjw) obj;
                zjwVar.getClass();
                int iOrdinal = zjwVar.b.c.o.ordinal();
                if (iOrdinal == 0) {
                    wyjVar = new wyj(cyberHomeParams, ctf0Var, y78Var, g2vVar, zjwVar);
                } else if (iOrdinal == 1) {
                    wyjVar = new mco(cyberHomeParams, ctf0Var, y78Var, g2vVar, zjwVar, (byte) 0);
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    wyjVar = new mco(cyberHomeParams, ctf0Var, y78Var, g2vVar, zjwVar, (byte) 1);
                }
                return wyjVar;
            case 12:
                r0x r0xVar = (r0x) obj5;
                n0x n0xVar = (n0x) obj4;
                ((Context) obj).getClass();
                r0xVar.a(n0xVar);
                Object objX = s0x.X(n0xVar);
                ImageView imageView11 = r0xVar.f29650a;
                gbe0 gbe0VarA = o5k0.a(imageView11.getContext());
                k1x k1xVar = new k1x(imageView11.getContext());
                k1xVar.c = objX;
                t1x.h(k1xVar, imageView11);
                vi9 vi9Var = vi9.c;
                k1xVar.n = vi9Var;
                k1xVar.m = vi9Var;
                k1xVar.o = vi9Var;
                t1x.g(k1xVar, null);
                t1x.d(k1xVar, null);
                t1x.a(k1xVar, false);
                k1xVar.e = new u8u(obj3, obj2, (byte) 22);
                t1x.b(k1xVar, true);
                return gbe0VarA.a(k1xVar.a());
            case 13:
                return a(obj);
            case 14:
                return b(obj);
            case 15:
                return c(obj);
            case 16:
                return g(obj);
            case 17:
                return h(obj);
            case 18:
                return i(obj);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return l(obj);
            case 20:
                return m(obj);
            case 21:
                return o(obj);
            case 22:
                return p(obj);
            case 23:
                return r(obj);
            case 24:
                return s(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return t(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return u(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return v(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return w(obj);
            default:
                SaleScreenModel saleScreenModel = (SaleScreenModel) obj3;
                luu luuVar = (luu) obj2;
                vzg0 vzg0Var2 = (vzg0) obj;
                Float fValueOf = Float.valueOf(0.0f);
                Double dValueOf = Double.valueOf(0.0d);
                vzg0Var2.getClass();
                gx7 gx7Var = ((pru) obj5).a().f32117a;
                a5w a5wVarA = ((ryu) obj4).a(saleScreenModel.f46405a);
                kzv kzvVar = a5wVarA instanceof kzv ? (kzv) a5wVarA : null;
                double d = kzvVar != null ? kzvVar.M : 0.0d;
                float fFloatValue = ((Number) a8k0.H(vzg0Var2, "KEY_NEW_STAKE_PROGRESS", fValueOf)).floatValue();
                float fFloatValue2 = ((Number) a8k0.H(vzg0Var2, "KEY_PAYMENT_PROGRESS", Float.valueOf(100.0f))).floatValue();
                float fFloatValue3 = ((Number) a8k0.H(vzg0Var2, "KEY_AUTO_SALE_PROGRESS", fValueOf)).floatValue();
                double dDoubleValue = ((Number) a8k0.H(vzg0Var2, "KEY_MAX_BET_VALUE", dValueOf)).doubleValue();
                double dDoubleValue2 = ((Number) a8k0.H(vzg0Var2, "KEY_MIN_BET_VALUE", dValueOf)).doubleValue();
                double dDoubleValue3 = ((Number) a8k0.H(vzg0Var2, "KEY_STAKE_VALUE", dValueOf)).doubleValue();
                double dDoubleValue4 = ((Number) a8k0.H(vzg0Var2, "KEY_PAYMENT_VALUE", dValueOf)).doubleValue();
                double dDoubleValue5 = ((Number) a8k0.H(vzg0Var2, "KEY_AUTO_SALE_VALUE", dValueOf)).doubleValue();
                double dDoubleValue6 = ((Number) a8k0.H(vzg0Var2, "KEY_AUTO_SALE_MIN_VALUE", dValueOf)).doubleValue();
                double dDoubleValue7 = ((Number) a8k0.H(vzg0Var2, "KEY_AUTO_SALE_MAX_VALUE", dValueOf)).doubleValue();
                boolean z7 = d > 0.0d;
                List listA = luuVar.f20692a.a();
                iun iunVar = iun.f15405a;
                return new svg0(fFloatValue, fFloatValue2, fFloatValue3, dDoubleValue, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, dDoubleValue7, z7, false, gx7Var.f12063a.o, false, vtg0.f38006a, wvg0.b, null, a5wVarA, null, listA, iunVar, iunVar, saleScreenModel);
        }
    }

    public /* synthetic */ enm(a4x a4xVar, xcz xczVar, vne vneVar, Function1 function1) {
        this.f8101a = (byte) 26;
        this.e = a4xVar;
        this.c = xczVar;
        this.d = vneVar;
        this.b = function1;
    }

    public /* synthetic */ enm(pz40 pz40Var, edg0 edg0Var, Function1 function1, k6z k6zVar) {
        this.f8101a = (byte) 28;
        this.e = pz40Var;
        this.c = edg0Var;
        this.b = function1;
        this.d = k6zVar;
    }

    public /* synthetic */ enm(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f8101a = b;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ enm(Object obj, Object obj2, Function1 function1, Function1 function2, byte b) {
        this.f8101a = b;
        this.e = obj;
        this.d = obj2;
        this.b = function1;
        this.c = function2;
    }

    public /* synthetic */ enm(ArrayList arrayList, kie0 kie0Var, List list, int i, q8z q8zVar) {
        this.f8101a = (byte) 16;
        this.e = arrayList;
        this.b = kie0Var;
        this.c = list;
        this.d = q8zVar;
    }
}
