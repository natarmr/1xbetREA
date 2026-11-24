package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rn5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30771a;
    public final /* synthetic */ cp b;

    public /* synthetic */ rn5(cp cpVar, byte b) {
        this.f30771a = b;
        this.b = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30771a;
        cp cpVar = this.b;
        List list = (List) obj;
        switch (b) {
            case 0:
                list.getClass();
                yfu0 yfu0Var = cpVar.u;
                ((gsx) yfu0Var).b.setText(((rg5) cpVar.u()).c);
                TextView textView = ((gsx) yfu0Var).c;
                pn40 pn40Var = pn40.f27267a;
                textView.setText(pn40.d(((rg5) cpVar.u()).b, ((rg5) cpVar.u()).d, p3u0.c));
                break;
            case 1:
                list.getClass();
                ((isx) cpVar.u).b.l(((ff9) cpVar.u()).getTitle());
                break;
            case 2:
                list.getClass();
                ksx ksxVar = (ksx) cpVar.u;
                ksxVar.b.setTitle(((jp9) cpVar.u()).b);
                ksxVar.c.setLast(((jp9) cpVar.u()).c);
                break;
            case 3:
                list.getClass();
                yfu0 yfu0Var2 = cpVar.u;
                ((etc) yfu0Var2).c.setEnabled(((itc) cpVar.u()).b);
                etc etcVar = (etc) yfu0Var2;
                etcVar.b.setText(((itc) cpVar.u()).d);
                etcVar.b.setLabelText(((itc) cpVar.u()).e);
                break;
            case 4:
                list.getClass();
                yfu0 yfu0Var3 = cpVar.u;
                ((ftx) yfu0Var3).b.v(((h140) cpVar.u()).e, ((h140) cpVar.u()).d);
                ftx ftxVar = (ftx) yfu0Var3;
                ftxVar.b.setTitle(((h140) cpVar.u()).f);
                DsMenuCompactCell dsMenuCompactCell = ftxVar.b;
                dsMenuCompactCell.setSubTitle(((h140) cpVar.u()).g);
                dsMenuCompactCell.setBadgeVisible(((h140) cpVar.u()).f12264a);
                break;
            case 5:
                list.getClass();
                yfu0 yfu0Var4 = cpVar.u;
                ((ftx) yfu0Var4).b.setIconResource(((j140) cpVar.u()).d);
                ftx ftxVar2 = (ftx) yfu0Var4;
                ftxVar2.b.setTitle(((j140) cpVar.u()).e);
                DsMenuCompactCell dsMenuCompactCell2 = ftxVar2.b;
                dsMenuCompactCell2.setSubTitle(((j140) cpVar.u()).f);
                dsMenuCompactCell2.setBadgeVisible(((j140) cpVar.u()).b);
                break;
            case 6:
                list.getClass();
                yfu0 yfu0Var5 = cpVar.u;
                ((etx) yfu0Var5).b.setIconResource(((k140) cpVar.u()).f);
                etx etxVar = (etx) yfu0Var5;
                etxVar.b.setTitle(((k140) cpVar.u()).i);
                DsMenuCompactCell dsMenuCompactCell3 = etxVar.b;
                dsMenuCompactCell3.setSubTitle(((k140) cpVar.u()).j);
                dsMenuCompactCell3.setBadgeVisible(((k140) cpVar.u()).b);
                dsMenuCompactCell3.setBadgeBackgroundTint(((k140) cpVar.u()).d);
                etxVar.f8392a.setBackgroundResource(((k140) cpVar.u()).l);
                break;
            case 7:
                list.getClass();
                yfu0 yfu0Var6 = cpVar.u;
                ((etx) yfu0Var6).b.setIconResource(((l140) cpVar.u()).d);
                etx etxVar2 = (etx) yfu0Var6;
                DsMenuCompactCell dsMenuCompactCell4 = etxVar2.b;
                Context context = cpVar.w;
                dsMenuCompactCell4.setIconTint(ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite, context)));
                DsMenuCompactCell dsMenuCompactCell5 = etxVar2.b;
                jmu0.j(dsMenuCompactCell5, ColorStateList.valueOf(m5d.b(R.attr.uikitPrimary, context)));
                dsMenuCompactCell5.setTitle(((l140) cpVar.u()).e);
                dsMenuCompactCell5.setSubTitle(((l140) cpVar.u()).f);
                dsMenuCompactCell5.setBadgeVisible(((l140) cpVar.u()).b);
                break;
            case 8:
                list.getClass();
                yfu0 yfu0Var7 = cpVar.u;
                ((ftx) yfu0Var7).b.setIconResource(((n140) cpVar.u()).d);
                ftx ftxVar3 = (ftx) yfu0Var7;
                ftxVar3.b.setTitle(((n140) cpVar.u()).e);
                DsMenuCompactCell dsMenuCompactCell6 = ftxVar3.b;
                dsMenuCompactCell6.setSubTitle(((n140) cpVar.u()).f);
                dsMenuCompactCell6.setBadgeVisible(((n140) cpVar.u()).b);
                break;
            case 9:
                list.getClass();
                yfu0 yfu0Var8 = cpVar.u;
                ((itx) yfu0Var8).b.setIconResource(((w140) cpVar.u()).d);
                itx itxVar = (itx) yfu0Var8;
                itxVar.b.setTitle(((w140) cpVar.u()).e);
                itxVar.b.setBadgeVisible(((w140) cpVar.u()).b);
                break;
            case 10:
                list.getClass();
                yfu0 yfu0Var9 = cpVar.u;
                ((ftx) yfu0Var9).b.setIconResource(((v140) cpVar.u()).d);
                ftx ftxVar4 = (ftx) yfu0Var9;
                ftxVar4.b.setTitle(((v140) cpVar.u()).e);
                DsMenuCompactCell dsMenuCompactCell7 = ftxVar4.b;
                dsMenuCompactCell7.setSubTitle(((v140) cpVar.u()).f);
                dsMenuCompactCell7.setBadgeVisible(((v140) cpVar.u()).b);
                break;
            case 11:
                list.getClass();
                yfu0 yfu0Var10 = cpVar.u;
                ((itx) yfu0Var10).b.setIconResource(((a240) cpVar.u()).d);
                itx itxVar2 = (itx) yfu0Var10;
                itxVar2.b.setTitle(((a240) cpVar.u()).e);
                DsMenuCompactCell dsMenuCompactCell8 = itxVar2.b;
                dsMenuCompactCell8.setBadgeVisible(((a240) cpVar.u()).b);
                dsMenuCompactCell8.setCounter(((a240) cpVar.u()).g > 0 ? Integer.valueOf(((a240) cpVar.u()).g) : null);
                break;
            case 12:
                list.getClass();
                yfu0 yfu0Var11 = cpVar.u;
                ((ftx) yfu0Var11).b.setIconResource(((b240) cpVar.u()).d);
                ftx ftxVar5 = (ftx) yfu0Var11;
                ftxVar5.b.setTitle(((b240) cpVar.u()).e);
                DsMenuCompactCell dsMenuCompactCell9 = ftxVar5.b;
                dsMenuCompactCell9.setSubTitle(((b240) cpVar.u()).f);
                dsMenuCompactCell9.setBadgeVisible(((b240) cpVar.u()).b);
                break;
            case 13:
                list.getClass();
                yfu0 yfu0Var12 = cpVar.u;
                ((gtx) yfu0Var12).b.setIconResource(((w140) cpVar.u()).d);
                gtx gtxVar = (gtx) yfu0Var12;
                gtxVar.b.setTitle(((w140) cpVar.u()).e);
                DsMenuCompactCell dsMenuCompactCell10 = gtxVar.b;
                dsMenuCompactCell10.setSubTitle(((w140) cpVar.u()).f);
                dsMenuCompactCell10.setBadgeVisible(((w140) cpVar.u()).b);
                break;
            case 14:
                list.getClass();
                yfu0 yfu0Var13 = cpVar.u;
                ((itx) yfu0Var13).b.v(((h140) cpVar.u()).e, ((h140) cpVar.u()).d);
                itx itxVar3 = (itx) yfu0Var13;
                itxVar3.b.setTitle(((h140) cpVar.u()).f);
                itxVar3.b.setBadgeVisible(((h140) cpVar.u()).f12264a);
                break;
            case 15:
                list.getClass();
                yfu0 yfu0Var14 = cpVar.u;
                ((itx) yfu0Var14).b.setIconResource(((j140) cpVar.u()).d);
                itx itxVar4 = (itx) yfu0Var14;
                itxVar4.b.setTitle(((j140) cpVar.u()).e);
                itxVar4.b.setBadgeVisible(((j140) cpVar.u()).b);
                break;
            case 16:
                list.getClass();
                yfu0 yfu0Var15 = cpVar.u;
                ((htx) yfu0Var15).b.setIconResource(((k140) cpVar.u()).f);
                htx htxVar = (htx) yfu0Var15;
                htxVar.b.setTitle(((k140) cpVar.u()).i);
                DsMenuCompactCell dsMenuCompactCell11 = htxVar.b;
                dsMenuCompactCell11.setBadgeVisible(((k140) cpVar.u()).b);
                dsMenuCompactCell11.setBadgeBackgroundTint(((k140) cpVar.u()).d);
                dsMenuCompactCell11.setBackgroundResource(((k140) cpVar.u()).l);
                break;
            case 17:
                list.getClass();
                yfu0 yfu0Var16 = cpVar.u;
                DsMenuCompactCell dsMenuCompactCell12 = ((htx) yfu0Var16).b;
                Context context2 = cpVar.w;
                jmu0.j(dsMenuCompactCell12, ColorStateList.valueOf(m5d.b(R.attr.uikitPrimary, context2)));
                htx htxVar2 = (htx) yfu0Var16;
                htxVar2.b.setIconResource(((l140) cpVar.u()).d);
                DsMenuCompactCell dsMenuCompactCell13 = htxVar2.b;
                dsMenuCompactCell13.setIconTint(ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite, context2)));
                dsMenuCompactCell13.setTitle(((l140) cpVar.u()).e);
                dsMenuCompactCell13.setBadgeVisible(((l140) cpVar.u()).b);
                break;
            case 18:
                list.getClass();
                yfu0 yfu0Var17 = cpVar.u;
                ((itx) yfu0Var17).b.setIconResource(((n140) cpVar.u()).d);
                itx itxVar5 = (itx) yfu0Var17;
                itxVar5.b.setTitle(((n140) cpVar.u()).e);
                itxVar5.b.setBadgeVisible(((n140) cpVar.u()).b);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                list.getClass();
                yfu0 yfu0Var18 = cpVar.u;
                ((itx) yfu0Var18).b.setIconResource(((v140) cpVar.u()).d);
                itx itxVar6 = (itx) yfu0Var18;
                itxVar6.b.setTitle(((v140) cpVar.u()).e);
                itxVar6.b.setBadgeVisible(((v140) cpVar.u()).b);
                break;
            case 20:
                list.getClass();
                yfu0 yfu0Var19 = cpVar.u;
                ((itx) yfu0Var19).b.setIconResource(((b240) cpVar.u()).d);
                itx itxVar7 = (itx) yfu0Var19;
                itxVar7.b.setTitle(((b240) cpVar.u()).e);
                itxVar7.b.setBadgeVisible(((b240) cpVar.u()).b);
                break;
            case 21:
                list.getClass();
                yfu0 yfu0Var20 = cpVar.u;
                ((btx) yfu0Var20).d.setTitle(((lob) cpVar.u()).b);
                btx btxVar = (btx) yfu0Var20;
                btxVar.c.setVisibility(((lob) cpVar.u()).d ? 8 : 0);
                btxVar.b.setSelected(((lob) cpVar.u()).c);
                break;
            case 22:
                list.getClass();
                List list2 = u0d.f34849a;
                yfu0 yfu0Var21 = cpVar.u;
                u0d.j(((tsh) yfu0Var21).b, ((flf) cpVar.u()).b, 0, 0, null, null, null, 510);
                tsh tshVar = (tsh) yfu0Var21;
                TextView textView2 = tshVar.d;
                ank0 ank0Var = ((flf) cpVar.u()).f9734a;
                Context context3 = cpVar.w;
                textView2.setText(ank0Var.b(context3));
                tshVar.c.setText(((flf) cpVar.u()).c.b(context3));
                break;
            case 23:
                list.getClass();
                yfu0 yfu0Var22 = cpVar.u;
                TextView textView3 = ((vsh) yfu0Var22).e;
                ank0 ank0Var2 = ((glf) cpVar.u()).f11487a;
                Context context4 = cpVar.w;
                textView3.setText(ank0Var2.b(context4));
                vsh vshVar = (vsh) yfu0Var22;
                vshVar.j.setText(((glf) cpVar.u()).b.b(context4));
                d5c.T(vshVar.k, ((glf) cpVar.u()).c);
                String str = ((glf) cpVar.u()).h;
                ImageView imageView = vshVar.d;
                d5c.T(imageView, str);
                d5c.T(vshVar.b, ((glf) cpVar.u()).d);
                d5c.T(vshVar.g, ((glf) cpVar.u()).e);
                d5c.T(vshVar.h, ((glf) cpVar.u()).f);
                d5c.T(vshVar.f, ((glf) cpVar.u()).g);
                d5c.T(imageView, ((glf) cpVar.u()).h);
                vshVar.i.setText(((glf) cpVar.u()).i.b(context4));
                d5c.T(vshVar.c, ((glf) cpVar.u()).j);
                break;
            case 24:
                list.getClass();
                yfu0 yfu0Var23 = cpVar.u;
                ((ysh) yfu0Var23).b.setText(((tlf) cpVar.u()).f34141a);
                ysh yshVar = (ysh) yfu0Var23;
                yshVar.c.setText(((tlf) cpVar.u()).b);
                yshVar.c.setBackground(sj3.U(((tlf) cpVar.u()).c, cpVar.w));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                list.getClass();
                ((wsh) cpVar.u).b.setText(((ulf) cpVar.u()).f35869a.b(cpVar.w));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                list.getClass();
                j140 j140Var = (j140) cpVar.u();
                zvx zvxVar = (zvx) cpVar.u;
                zvxVar.b.setIconResource(j140Var.d);
                zvxVar.b.setBadgeVisible(j140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle = zvxVar.c;
                dsCellMiddleTitle.setTitle(j140Var.e);
                dsCellMiddleTitle.setSubtitle(j140Var.f);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                list.getClass();
                j140 j140Var2 = (j140) cpVar.u();
                dux duxVar = (dux) cpVar.u;
                duxVar.c.setIconResource(j140Var2.d);
                duxVar.c.setBadgeVisible(j140Var2.b);
                DsCellMiddleTitle dsCellMiddleTitle2 = duxVar.d;
                dsCellMiddleTitle2.setTitle(j140Var2.e);
                dsCellMiddleTitle2.setSubtitle(j140Var2.f);
                DsCellRightBanner dsCellRightBanner = duxVar.b;
                List list3 = u0d.f34849a;
                Context context5 = dsCellRightBanner.getContext();
                context5.getClass();
                u0d.s(context5, j140Var2.g, null, null, null, new k9(dsCellRightBanner, (byte) 8), new k9(dsCellRightBanner, (byte) 9), 14);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                list.getClass();
                yfu0 yfu0Var24 = cpVar.u;
                ImageView imageView2 = ((mth) yfu0Var24).b;
                Context context6 = cpVar.w;
                imageView2.setImageDrawable(sj3.U(((b2z) cpVar.u()).b, context6));
                ((mth) yfu0Var24).f22370a.setBackground(context6.getDrawable(((b2z) cpVar.u()).c));
                break;
            default:
                list.getClass();
                ((vjd) cpVar.u).b.setContent(new ugd(992988769, true, new kja(cpVar, (byte) 4)));
                break;
        }
        return Unit.f46060a;
    }
}
