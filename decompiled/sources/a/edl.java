package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager2.widget.ViewPager2;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldCellGameView;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldGameView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsCellGameView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsGameView;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class edl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7623a;
    public final /* synthetic */ Object b;

    public /* synthetic */ edl(s6q0 s6q0Var, agk0 agk0Var, cgk0 cgk0Var) {
        this.f7623a = (byte) 25;
        this.b = s6q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [a.g2z] */
    /* JADX WARN: Type inference failed for: r11v9, types: [a.abi0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f7623a;
        byte b2 = 3;
        byte b3 = 6;
        ?? r7 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                a1d a1dVar = (a1d) obj2;
                gdl gdlVar = (gdl) obj;
                if (!gdlVar.f20279a.n) {
                    return gps0.b;
                }
                gdl gdlVar2 = gdlVar.p;
                if (gdlVar2 != null) {
                    edl edlVar = new edl(a1dVar, 0 == true ? 1 : 0);
                    if (edlVar.invoke(gdlVar2) == gps0.f11699a) {
                        etm0.w(gdlVar2, edlVar);
                    }
                }
                gdlVar.p = null;
                gdlVar.o = null;
                return gps0.f11699a;
            case 1:
                dpa0 dpa0Var = (dpa0) obj;
                ((g2z) obj2).invoke(dpa0Var, Float.valueOf(Float.intBitsToFloat((int) (x2x.j0(dpa0Var, false) & 4294967295L))));
                dpa0Var.a();
                return Unit.f46060a;
            case 2:
                zlt zltVar = (zlt) obj;
                return Boolean.valueOf(zltVar instanceof tel ? ((Boolean) ((cel) obj2).invoke(zltVar)).booleanValue() : true);
            case 3:
                int i = DragonsGoldCellGameView.u;
                ((View) obj).getClass();
                ((mfl) obj2).invoke();
                return Unit.f46060a;
            case 4:
                DragonsGoldGameView dragonsGoldGameView = (DragonsGoldGameView) obj2;
                View view = (View) obj;
                int i2 = DragonsGoldGameView.u;
                view.getClass();
                sab sabVar = (sab) view;
                if (dragonsGoldGameView.n == sabVar.getRow() && dragonsGoldGameView.h && ((Boolean) dragonsGoldGameView.f46628a.invoke(Integer.valueOf(sabVar.getColumn()))).booleanValue()) {
                    sab.u(R.drawable.dragons_gold_arrow_cell, (sab) ((List) dragonsGoldGameView.i.get(sabVar.getRow())).get(sabVar.getColumn() - 1));
                    dragonsGoldGameView.r = sabVar;
                }
                return Unit.f46060a;
            case 5:
                cgl cglVar = (cgl) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                sac.V(jiu0.a(cglVar), tfl.f33871a, null, cglVar.f.f22085a, new ufl(cglVar, r7, 0 == true ? 1 : 0), 10);
                cglVar.w(new xy5(false));
                cglVar.C(th);
                return Unit.f46060a;
            case 6:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.e(abi0Var, String.valueOf(((bkl) obj2).b.a()));
                return Unit.f46060a;
            case 7:
                ?? r11 = (abi0) obj;
                r11.getClass();
                o0x o0xVar = ((fkl) obj2).b;
                n0x n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                r7 = n0xVar != null ? n0xVar.f22722a : 0;
                if (r7 == 0) {
                    r7 = "";
                }
                zai0 zai0Var = cbi0.n;
                iiy iiyVar = cbi0.f4063a[11];
                zai0Var.getClass();
                r11.b(zai0Var, r7);
                return Unit.f46060a;
            case 8:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.e(abi0Var2, String.valueOf(((cll) obj2).b.a()));
                return Unit.f46060a;
            case 9:
                Integer num = (Integer) obj;
                hll hllVar = (hll) CollectionsKt.W(num.intValue(), ((rll) obj2).b);
                return new Pair(Long.valueOf(hllVar != null ? hllVar.f13267a : -1L), num);
            case 10:
                Context context = (Context) obj;
                context.getClass();
                DsChip dsChip = new DsChip(context, null);
                dsChip.setStyle((wxl) obj2);
                return dsChip;
            case 11:
                lyl lylVar = (lyl) obj2;
                lylVar.post(new n23(lylVar, ((Integer) obj).intValue(), b3));
                return Unit.f46060a;
            case 12:
                float fFloatValue = ((Float) obj).floatValue();
                oyq0 oyq0Var = ((bzl) obj2).f3474a;
                oyq0Var.c(oyq0Var.c.l() + fFloatValue);
                return Unit.f46060a;
            case 13:
                abi0 abi0Var3 = (abi0) obj;
                abi0Var3.getClass();
                abi0Var3.b(cbi0.b, Integer.valueOf(((j0m) obj2).e));
                return Unit.f46060a;
            case 14:
                abi0 abi0Var4 = (abi0) obj;
                abi0Var4.getClass();
                cbi0.e(abi0Var4, ((y2m) obj2).c.toString());
                return Unit.f46060a;
            case 15:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((g4m) obj2).f10673a;
                hczVar.f(a4xVar.size(), null, new v2m(a4xVar, 1 == true ? 1 : 0), new ugd(802480018, true, new xy1(a4xVar, (byte) 7)));
                return Unit.f46060a;
            case 16:
                l7m l7mVar = (l7m) obj2;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = l7mVar.d;
                hczVar2.f(a4xVar2.size(), null, new v2m(a4xVar2, b2), new ugd(2039820996, true, new xe4(a4xVar2, l7mVar, (byte) 4)));
                return Unit.f46060a;
            case 17:
                ((DsLottieEmpty) obj2).m = null;
                return Unit.f46060a;
            case 18:
                nz30 nz30Var = (nz30) obj2;
                Context context2 = (Context) obj;
                context2.getClass();
                DsMenuCompactCell dsMenuCompactCell = new DsMenuCompactCell(context2, null, 6);
                dsMenuCompactCell.setTitle(nz30Var.f24355a);
                dsMenuCompactCell.setIconResource(nz30Var.b.f5203a);
                dsMenuCompactCell.setEnabled(true);
                dsMenuCompactCell.setLayoutParams(new ViewGroup.LayoutParams(-2, context2.getResources().getDimensionPixelSize(R.dimen.size_56)));
                return dsMenuCompactCell;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                j240 j240Var = (j240) obj2;
                Context context3 = (Context) obj;
                context3.getClass();
                DsMenuCompactCell dsMenuCompactCell2 = new DsMenuCompactCell(context3, null, 6);
                dsMenuCompactCell2.setTitle(j240Var.b);
                dsMenuCompactCell2.setIconResource(j240Var.f15765a.getF47018a());
                dsMenuCompactCell2.setEnabled(true);
                dsMenuCompactCell2.setLayoutParams(new ViewGroup.LayoutParams(-2, context3.getResources().getDimensionPixelSize(R.dimen.size_56)));
                return dsMenuCompactCell2;
            case 20:
                wom womVar = (wom) obj2;
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b((womVar.c() > 0.0f || ((Boolean) ((hgk0) womVar.c).getValue()).booleanValue()) ? 1.0f : 0.0f);
                return Unit.f46060a;
            case 21:
                ((ViewPager2) ((uii) obj2).b).setCurrentItem(((Integer) obj).intValue());
                return Unit.f46060a;
            case 22:
                brm brmVar = (brm) obj2;
                bff0 bff0Var = (bff0) obj;
                bff0Var.getClass();
                boolean z = bff0Var.a() > 0.0f;
                if (z != brmVar.r) {
                    brmVar.r = z;
                    if (z) {
                        brmVar.s = System.currentTimeMillis();
                        brmVar.Z0();
                    } else {
                        c4m0 c4m0Var = brmVar.q;
                        if (c4m0Var != null) {
                            c4m0Var.cancel(null);
                        }
                        brmVar.q = null;
                    }
                }
                return Unit.f46060a;
            case 23:
                abi0 abi0Var5 = (abi0) obj;
                abi0Var5.getClass();
                cbi0.b(abi0Var5, new m0x(((b280) ((d280) obj2)).f1842a, null, 6));
                return Unit.f46060a;
            case 24:
                DsTag dsTag = (DsTag) obj2;
                TypedArray typedArray = (TypedArray) obj;
                int i3 = DsTag.l;
                typedArray.getClass();
                Drawable background = dsTag.getBackground();
                if (background == null) {
                    background = typedArray.getDrawable(0);
                }
                dsTag.setBackground(background);
                Integer numL = ktt0.l(typedArray, 5);
                if (numL != null) {
                    int iIntValue = numL.intValue();
                    Drawable background2 = dsTag.getBackground();
                    GradientDrawable gradientDrawable = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
                    if (gradientDrawable != null) {
                        gradientDrawable.mutate();
                        gradientDrawable.setStroke(typedArray.getResources().getDimensionPixelSize(R.dimen.size_1), iIntValue);
                    }
                }
                dsTag.setPaddingRelative(typedArray.getDimensionPixelOffset(2, 0), dsTag.getPaddingTop(), typedArray.getDimensionPixelOffset(3, 0), dsTag.getPaddingBottom());
                dsTag.setMinHeight(typedArray.getDimensionPixelSize(1, 0));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((a9q0) obj).getClass();
                ((s6q0) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                d9n d9nVar = (d9n) obj2;
                bff0 bff0Var2 = (bff0) obj;
                bff0Var2.getClass();
                if (bff0Var2.a() > 0.0f) {
                    d9nVar.s = true;
                    d9nVar.t = System.currentTimeMillis();
                    d9nVar.Z0();
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sdn sdnVar = (sdn) obj2;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if (agc.L(th2) || ((cdn) sdnVar.D()).b.isEmpty()) {
                    bby bbyVar = sdnVar.A;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    sdnVar.A = null;
                    sdnVar.w.g(idf0.f14583a);
                    p7m0 p7m0Var = sdnVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        sdnVar.f.getClass();
                    } while (!p7m0Var.m(value, cdn.a((cdn) value, null, iun.f15405a, null, false, null, null, 237)));
                } else {
                    bby bbyVar2 = sdnVar.A;
                    if (bbyVar2 == null || !bbyVar2.isActive()) {
                        sdnVar.A = sac.V(jiu0.a(sdnVar), null, null, sdnVar.p.f22085a, new ldn(sdnVar, r7, 1 == true ? 1 : 0), 11);
                    }
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                int i4 = EasternNightsCellGameView.u;
                ((View) obj).getClass();
                ((uhn) obj2).invoke();
                return Unit.f46060a;
            default:
                EasternNightsGameView easternNightsGameView = (EasternNightsGameView) obj2;
                View view2 = (View) obj;
                int i5 = EasternNightsGameView.u;
                view2.getClass();
                sab sabVar2 = (sab) view2;
                if (easternNightsGameView.n == sabVar2.getRow() && easternNightsGameView.h && ((Boolean) easternNightsGameView.f46629a.invoke(Integer.valueOf(sabVar2.getColumn()))).booleanValue()) {
                    sab.u(R.drawable.eastern_nights_arrow_active_cell, (sab) ((List) easternNightsGameView.i.get(sabVar2.getRow())).get(sabVar2.getColumn() - 1));
                    easternNightsGameView.r = sabVar2;
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ edl(Object obj, byte b) {
        this.f7623a = b;
        this.b = obj;
    }
}
