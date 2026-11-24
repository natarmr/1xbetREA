package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.cache.DiskLruCache;
import org.xbet.client1.R;
import org.xplatform.domino.presentation.views.DominoHandView;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldCellGameView;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ngh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23486a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ngh(cp cpVar, qpg qpgVar) {
        this.f23486a = (byte) 2;
        this.c = cpVar;
        this.b = qpgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        bby bbyVar;
        byte b = 21;
        byte b2 = 24;
        byte b3 = 8;
        byte b4 = 27;
        byte b5 = 26;
        byte b6 = 12;
        Object[] objArr = 0;
        yje yjeVar = null;
        byte b7 = 1;
        switch (this.f23486a) {
            case 0:
                z9f z9fVar = (z9f) this.b;
                cp cpVar = (cp) this.c;
                ((View) obj).getClass();
                z9fVar.e((p6t0) cpVar.u());
                return Unit.f46060a;
            case 1:
                h7h h7hVar = (h7h) this.b;
                k7h k7hVar = (k7h) this.c;
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                yai0.f(abi0Var, h7hVar.f12573a == k7hVar.c);
                return Unit.f46060a;
            case 2:
                cp cpVar2 = (cp) this.c;
                qpg qpgVar = (qpg) this.b;
                ((List) obj).getClass();
                pkd.h(((vjd) cpVar2.u).b, pek0.g, null, new ugd(1483647016, true, new eod(cpVar2, qpgVar, (byte) 29)));
                return Unit.f46060a;
            case 3:
                thh thhVar = (thh) this.b;
                Function1 function1 = (Function1) this.c;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = thhVar.b;
                hczVar.f(a4xVar.size(), new dx8(xdx.E(a4xVar, new m7h(b6)), b5), new dx8(a4xVar, b4), new ugd(-1311333631, true, new c8((List) a4xVar, (Object) thhVar, function1, (byte) 15)));
                return Unit.f46060a;
            case 4:
                bnh bnhVar = (bnh) this.b;
                Function1 function2 = (Function1) this.c;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = ((zmh) bnhVar).f44626a;
                hczVar2.f(a4xVar2.size(), new vtf(new p1h((byte) 19), a4xVar2, b3), new wl0(a4xVar2, b), new ugd(2039820996, true, new ws1(a4xVar2, function2, (byte) 11)));
                return Unit.f46060a;
            case 5:
                enh enhVar = (enh) this.b;
                Function1 function3 = (Function1) this.c;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar3 = ((cnh) enhVar).f4655a;
                hczVar3.f(a4xVar3.size(), new vtf(new p1h(b), a4xVar3, (byte) 9), new wl0(a4xVar3, (byte) 22), new ugd(2039820996, true, new ws1(a4xVar3, function3, b6)));
                return Unit.f46060a;
            case 6:
                vuh vuhVar = (vuh) this.b;
                Function1 function4 = (Function1) this.c;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                a4x a4xVar4 = ((suh) vuhVar).e;
                hczVar4.f(a4xVar4.size(), null, new wl0(a4xVar4, b2), new ugd(2039820996, true, new c8((List) a4xVar4, (Object) vuhVar, function4, (byte) 16)));
                return Unit.f46060a;
            case 7:
                f3j f3jVar = (f3j) this.b;
                hm1 hm1Var = (hm1) this.c;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(peg0.n((peg0) f3jVar.k, ((ctf0) f3jVar.f).b.a(R.string.array_slots, Arrays.copyOf(new Object[0], 0)), nw80.b.getId(), hm1Var, 50));
                return Unit.f46060a;
            case 8:
                g3j g3jVar = (g3j) this.b;
                hm1 hm1Var2 = (hm1) this.c;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(peg0.n((peg0) g3jVar.o, ((ctf0) g3jVar.k).b.a(R.string.array_slots, Arrays.copyOf(new Object[0], 0)), nw80.b.getId(), hm1Var2, 50));
                return Unit.f46060a;
            case 9:
                e6j e6jVar = (e6j) this.b;
                hm1 hm1Var3 = (hm1) this.c;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.h(peg0.n(e6jVar.w, e6jVar.r.b.a(R.string.array_slots, Arrays.copyOf(new Object[0], 0)), nw80.b.getId(), hm1Var3, 50));
                return Unit.f46060a;
            case 10:
                zrj zrjVar = (zrj) this.b;
                tcp tcpVar = (tcp) this.c;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                c8d c8dVar = (c8d) k0w0Var4.b(new a1w0(new vef(zrjVar, tcpVar, b2))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(false, bjkVar, bjkVar);
                return Unit.f46060a;
            case 11:
                g7k g7kVar = (g7k) this.b;
                b7k b7kVar = (b7k) this.c;
                qpg0 qpg0Var = (qpg0) obj;
                qpg0Var.getClass();
                g7kVar.b.U(qpg0Var, b7kVar);
                return Unit.f46060a;
            case 12:
                y6h y6hVar = (y6h) this.b;
                cp cpVar3 = (cp) this.c;
                ((View) obj).getClass();
                y6hVar.invoke(((o8k) cpVar3.u()).f24833a);
                return Unit.f46060a;
            case 13:
                y6h y6hVar2 = (y6h) this.b;
                cp cpVar4 = (cp) this.c;
                ((View) obj).getClass();
                y6hVar2.invoke(((p8k) cpVar4.u()).f26558a);
                return Unit.f46060a;
            case 14:
                String str = (String) this.b;
                pz40 pz40Var = (pz40) this.c;
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.d(abi0Var2, ((Boolean) pz40Var.getValue()).booleanValue());
                cbi0.b(abi0Var2, ((Boolean) pz40Var.getValue()).booleanValue() ? new n0x(str) : new m0x(R.drawable.discipline_block_placeholder, null, 6));
                return Unit.f46060a;
            case 15:
                htk htkVar = (htk) this.b;
                Function2 function5 = (Function2) this.c;
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                a4x a4xVar5 = ((ftk) htkVar).b;
                hczVar5.f(a4xVar5.size(), null, new wl0(a4xVar5, b5), new ugd(802480018, true, new c8((List) a4xVar5, (Object) htkVar, (Object) function5, (byte) 17)));
                return Unit.f46060a;
            case 16:
                yfg yfgVar = (yfg) this.b;
                cp cpVar5 = (cp) this.c;
                ((View) obj).getClass();
                yfgVar.invoke(((muk) cpVar5.u()).c, ((muk) cpVar5.u()).b);
                return Unit.f46060a;
            case 17:
                DiskLruCache diskLruCache = (DiskLruCache) this.b;
                DiskLruCache.Editor editor = (DiskLruCache.Editor) this.c;
                ((IOException) obj).getClass();
                synchronized (diskLruCache) {
                    editor.c();
                }
                return Unit.f46060a;
            case 18:
                v8 v8Var = (v8) this.b;
                cp cpVar6 = (cp) this.c;
                ((View) obj).getClass();
                v8Var.invoke(cpVar6.u());
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                szq szqVar = (szq) this.b;
                szk szkVar = (szk) this.c;
                iiy[] iiyVarArr = szk.Q1;
                ((View) obj).getClass();
                e0f e0fVar = szqVar.b;
                int centerYFromBottom = ((DominoHandView) e0fVar.n).getCenterYFromBottom();
                ImageView imageView = (ImageView) e0fVar.g;
                int measuredHeight = centerYFromBottom - (imageView.getMeasuredHeight() >> 1);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = measuredHeight;
                ImageView imageView2 = (ImageView) e0fVar.i;
                ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
                layoutParams2.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = measuredHeight;
                int startYFromBottom = ((DominoHandView) e0fVar.n).getStartYFromBottom() + ((int) Math.ceil(szkVar.o0().getResources().getDisplayMetrics().density * 4.0f));
                LinearLayout linearLayout = e0fVar.d;
                ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                layoutParams3.getClass();
                ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = startYFromBottom;
                imageView.forceLayout();
                imageView2.forceLayout();
                linearLayout.forceLayout();
                return Unit.f46060a;
            case 20:
                b9l b9lVar = (b9l) this.b;
                vne vneVar = (vne) this.c;
                d9l d9lVar = (d9l) obj;
                d9lVar.getClass();
                d9lVar.setRadiantTeamIcon(b9lVar.f2216a);
                d9lVar.setDireTeamIcon(b9lVar.b);
                d9lVar.setRadiantSide(b9lVar.c);
                d9lVar.setDireSide(b9lVar.d);
                d9lVar.setNetWorth(b9lVar.e);
                d9lVar.d(b9lVar.f, vneVar);
                d9lVar.a(b9lVar.g, vneVar);
                d9lVar.c(b9lVar.h, vneVar);
                v8l v8lVar = b9lVar.i;
                List<? extends a3l> list = b9lVar.j;
                ArrayList arrayList = b9lVar.k;
                d9lVar.u.i(v8lVar.f36990a, v8lVar.b, new g8l(d9lVar, list, arrayList, b7));
                d9lVar.setMapBuildings(list);
                d9lVar.setMapHeroes(arrayList);
                return Unit.f46060a;
            case 21:
                e8l e8lVar = (e8l) this.b;
                vne vneVar2 = (vne) this.c;
                i8l i8lVar = (i8l) obj;
                i8lVar.getClass();
                b8l b8lVar = e8lVar.f7378a;
                i8lVar.setRadiantTeamIcon(b8lVar.b);
                String str2 = b8lVar.c;
                str2.getClass();
                p8l p8lVar = i8lVar.g;
                p8lVar.z(R.drawable.dota_radiant_dot, str2);
                i8lVar.setRadiantTeamName(b8lVar.f2163a);
                t7l t7lVar = e8lVar.b;
                i8lVar.setDireTeamIcon(t7lVar.b);
                String str3 = t7lVar.c;
                str3.getClass();
                p8l p8lVar2 = i8lVar.h;
                p8lVar2.z(R.drawable.dota_dire_dot, str3);
                i8lVar.setDireTeamName(t7lVar.f33473a);
                i8lVar.setRadiantSelectedHeroes(e8lVar.c);
                i8lVar.setDireSelectedHeroes(e8lVar.d);
                i8lVar.setNetWorthRadiant(e8lVar.e);
                i8lVar.setNetWorthDire(e8lVar.f);
                c8l c8lVar = e8lVar.g;
                vneVar2.getClass();
                p8lVar.A(c8lVar.f3918a, vneVar2);
                p8lVar2.A(e8lVar.h.f35189a, vneVar2);
                y7l y7lVar = e8lVar.i;
                p8lVar.w(y7lVar.f42157a, y7lVar.b, vneVar2);
                q7l q7lVar = e8lVar.j;
                p8lVar2.w(q7lVar.f28255a, q7lVar.b, vneVar2);
                i8lVar.b(e8lVar.k, vneVar2);
                x7l x7lVar = e8lVar.l;
                List<? extends a3l> list2 = e8lVar.m;
                ArrayList arrayList2 = e8lVar.n;
                i8lVar.f.i(x7lVar.f40418a, x7lVar.b, new g8l(i8lVar, list2, arrayList2, objArr == true ? 1 : 0));
                i8lVar.setMapBuildings(list2);
                i8lVar.setMapHeroes(arrayList2);
                return Unit.f46060a;
            case 22:
                tzq tzqVar = (tzq) this.b;
                qfl qflVar = (qfl) this.c;
                int iIntValue = ((Integer) obj).intValue();
                iiy[] iiyVarArr2 = qfl.O1;
                tzqVar.c.setVisibility(8);
                DragonsGoldCellGameView dragonsGoldCellGameView = tzqVar.b;
                dragonsGoldCellGameView.v(false);
                dragonsGoldCellGameView.s.setEnabled(false);
                cgl cglVarH0 = qflVar.H0();
                if (cglVarH0.d.a() && ((bbyVar = cglVarH0.v) == null || !bbyVar.isActive())) {
                    cglVarH0.v = sac.V(jiu0.a(cglVarH0), new k0l(1, cglVarH0, cgl.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, cglVarH0.f.b, new iq3(cglVarH0, iIntValue, yjeVar, b7), 10);
                }
                return Boolean.TRUE;
            case 23:
                return DsAccordion.a((DsAccordion) this.b, (Context) this.c, (TypedArray) obj);
            case 24:
                return DsAccountSelection.u((DsAccountSelection) this.b, (Context) this.c, (TypedArray) obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return DsAccountSelection.B((Function0) this.b, (DsAccountSelection) this.c, (View) obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Object obj2 = (gol) this.b;
                Function2 function6 = (Function2) this.c;
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                if ((obj2 instanceof eol) && function6 != null) {
                    function6.invoke(obj2, bool);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                hpl hplVar = (hpl) this.b;
                Function1 function7 = (Function1) this.c;
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                a4x a4xVar6 = hplVar.f13448a;
                hczVar6.f(a4xVar6.size(), null, new bzh(a4xVar6, b6), new ugd(802480018, true, new vb(a4xVar6, function7, b5)));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                kpl kplVar = (kpl) this.b;
                Function1 function8 = (Function1) this.c;
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                a4x a4xVar7 = kplVar.f18682a;
                i8zVar.e(a4xVar7.size(), null, null, new bzh(a4xVar7, (byte) 13), new ugd(-1117249557, true, new vb(a4xVar7, function8, b4)));
                return Unit.f46060a;
            default:
                npl nplVar = (npl) this.b;
                Function1 function9 = (Function1) this.c;
                hcz hczVar7 = (hcz) obj;
                hczVar7.getClass();
                a4x a4xVar8 = nplVar.f23919a;
                hczVar7.f(a4xVar8.size(), null, new bzh(a4xVar8, (byte) 14), new ugd(802480018, true, new vb(a4xVar8, function9, (byte) 28)));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ngh(Object obj, Object obj2, byte b) {
        this.f23486a = b;
        this.b = obj;
        this.c = obj2;
    }
}
