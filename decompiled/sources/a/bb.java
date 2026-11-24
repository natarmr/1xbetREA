package a;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.large_banner_games_collection.LargeBannerGamesShimmerCollection;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bb implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2282a;
    public final /* synthetic */ cp b;

    public /* synthetic */ bb(cp cpVar, byte b) {
        this.f2282a = b;
        this.b = cpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2282a;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                yfu0 yfu0Var = cpVar.u;
                DsCellLeftIcon dsCellLeftIcon = ((prx) yfu0Var).c;
                iwk iwkVar = dsCellLeftIcon.p;
                if (iwkVar != null) {
                    iwkVar.a();
                }
                dsCellLeftIcon.p = null;
                DsCellLeftIcon dsCellLeftIcon2 = ((prx) yfu0Var).c;
                iwk iwkVar2 = dsCellLeftIcon2.o;
                if (iwkVar2 != null) {
                    iwkVar2.a();
                }
                dsCellLeftIcon2.o = null;
                break;
            case 1:
                yfu0 yfu0Var2 = cpVar.u;
                ((l2l) yfu0Var2).b.a();
                ((l2l) yfu0Var2).c.a();
                break;
            case 2:
                x0x.s(((y1k) cpVar.u).b);
                break;
            case 3:
                x0x.O(((y1k) cpVar.u).b);
                break;
            case 4:
                x0x.s(((g2k) cpVar.u).f10562a);
                break;
            case 5:
                x0x.O(((g2k) cpVar.u).f10562a);
                break;
            case 6:
                yfu0 yfu0Var3 = cpVar.u;
                LinearLayout linearLayout = ((i8b0) yfu0Var3).f14331a;
                linearLayout.getClass();
                x0x.s(linearLayout);
                i8b0 i8b0Var = (i8b0) yfu0Var3;
                x0x.s((LargeBannerGamesShimmerCollection) i8b0Var.j.c);
                x0x.s(i8b0Var.b.b);
                x0x.s(i8b0Var.c.b);
                x0x.s((ConstraintLayout) i8b0Var.f.b);
                x0x.s((ConstraintLayout) i8b0Var.i.b);
                x0x.s((ConstraintLayout) i8b0Var.h.b);
                x0x.s((ConstraintLayout) i8b0Var.e.b);
                x0x.s((ConstraintLayout) i8b0Var.d.b);
                x0x.s((ConstraintLayout) i8b0Var.g.b);
                break;
            case 7:
                yfu0 yfu0Var4 = cpVar.u;
                LinearLayout linearLayout2 = ((i8b0) yfu0Var4).f14331a;
                linearLayout2.getClass();
                x0x.O(linearLayout2);
                i8b0 i8b0Var2 = (i8b0) yfu0Var4;
                x0x.O((LargeBannerGamesShimmerCollection) i8b0Var2.j.c);
                x0x.O(i8b0Var2.b.b);
                x0x.O(i8b0Var2.c.b);
                x0x.O((ConstraintLayout) i8b0Var2.f.b);
                x0x.O((ConstraintLayout) i8b0Var2.i.b);
                x0x.O((ConstraintLayout) i8b0Var2.h.b);
                x0x.O((ConstraintLayout) i8b0Var2.e.b);
                x0x.O((ConstraintLayout) i8b0Var2.d.b);
                x0x.O((ConstraintLayout) i8b0Var2.g.b);
                break;
            case 8:
                if (((yrw) cpVar.u()).d) {
                    wvb.b0(cpVar.u, cpVar.w);
                }
                break;
            case 9:
                yfu0 yfu0Var5 = cpVar.u;
                DsCellLeftIcon dsCellLeftIcon3 = ((wxx) yfu0Var5).c;
                iwk iwkVar3 = dsCellLeftIcon3.p;
                if (iwkVar3 != null) {
                    iwkVar3.a();
                }
                dsCellLeftIcon3.p = null;
                DsCellLeftIcon dsCellLeftIcon4 = ((wxx) yfu0Var5).c;
                iwk iwkVar4 = dsCellLeftIcon4.o;
                if (iwkVar4 != null) {
                    iwkVar4.a();
                }
                dsCellLeftIcon4.o = null;
                break;
            case 10:
                if (((a800) cpVar.u()).c) {
                    wvb.b0(cpVar.u, cpVar.w);
                }
                break;
            case 11:
                if (((yf30) cpVar.u()).b) {
                    wvb.b0(cpVar.u, cpVar.w);
                }
                break;
            case 12:
                yfu0 yfu0Var6 = cpVar.u;
                ((cfx) yfu0Var6).b.d();
                ((cfx) yfu0Var6).b.c();
                break;
            case 13:
                TextView textView = ((vwx) cpVar.u).b.getTextView();
                if (textView != null) {
                    textView.setFocusable(false);
                    textView.setFocusableInTouchMode(false);
                }
                break;
            case 14:
                yfu0 yfu0Var7 = cpVar.u;
                ((ywx) yfu0Var7).b.setImageDrawable(sj3.U(R.drawable.ic_promocode, cpVar.w));
                ((ywx) yfu0Var7).b.setIconTint((ColorStateList) null);
                break;
            case 15:
                DsSettingsCell dsSettingsCell = ((vhu0) cpVar.u).f37448a;
                dsSettingsCell.getClass();
                x0x.s(dsSettingsCell);
                break;
            case 16:
                DsSettingsCell dsSettingsCell2 = ((vhu0) cpVar.u).f37448a;
                dsSettingsCell2.getClass();
                x0x.O(dsSettingsCell2);
                break;
            case 17:
                if (((yrj0) cpVar.u()).f) {
                    wvb.b0(cpVar.u, cpVar.w);
                }
                break;
            case 18:
                FrameLayout frameLayout = ((exk0) cpVar.u).b;
                frameLayout.getClass();
                x0x.s(frameLayout);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                FrameLayout frameLayout2 = ((exk0) cpVar.u).b;
                frameLayout2.getClass();
                x0x.O(frameLayout2);
                break;
            default:
                yfu0 yfu0Var8 = cpVar.u;
                DsCellLeftIcon dsCellLeftIcon5 = ((wxx) yfu0Var8).c;
                iwk iwkVar5 = dsCellLeftIcon5.p;
                if (iwkVar5 != null) {
                    iwkVar5.a();
                }
                dsCellLeftIcon5.p = null;
                DsCellLeftIcon dsCellLeftIcon6 = ((wxx) yfu0Var8).c;
                iwk iwkVar6 = dsCellLeftIcon6.o;
                if (iwkVar6 != null) {
                    iwkVar6.a();
                }
                dsCellLeftIcon6.o = null;
                break;
        }
        return Unit.f46060a;
    }
}
