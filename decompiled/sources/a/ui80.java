package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelTitle;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.DsShimmerCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ui80 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35719a;
    public final /* synthetic */ cp b;

    public /* synthetic */ ui80(cp cpVar, byte b) {
        this.f35719a = b;
        this.b = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35719a;
        int i = R.string.pinned_markets;
        cp cpVar = this.b;
        List list = (List) obj;
        switch (b) {
            case 0:
                list.getClass();
                Drawable background = ((vi80) cpVar.u).f37466a.getBackground();
                if (background != null) {
                    background.setTintList(ColorStateList.valueOf(((wi80) cpVar.u()).c));
                }
                return Unit.f46060a;
            case 1:
                list.getClass();
                ((cj90) cpVar.u).b.setModel(new nrv(((kie) cpVar.u()).f18332a, false, null, null, null, null, null, 254));
                return Unit.f46060a;
            case 2:
                list.getClass();
                yfu0 yfu0Var = cpVar.u;
                ((gj90) yfu0Var).b.setTitle(((lje) cpVar.u()).f20146a);
                gj90 gj90Var = (gj90) yfu0Var;
                DsCellRightLabel dsCellRightLabel = gj90Var.c;
                DsSettingsCell dsSettingsCell = gj90Var.d;
                dsCellRightLabel.setVisibility(((lje) cpVar.u()).c ? 0 : 8);
                gj90Var.c.setText(((lje) cpVar.u()).b);
                dsSettingsCell.setFirst(((lje) cpVar.u()).d == dj90.f6173a);
                dsSettingsCell.setLast(((lje) cpVar.u()).d == dj90.b);
                return Unit.f46060a;
            case 3:
                list.getClass();
                yfu0 yfu0Var2 = cpVar.u;
                ((pwx) yfu0Var2).d.setSelected(((oq90) cpVar.u()).c);
                pwx pwxVar = (pwx) yfu0Var2;
                DsCellMiddleTitle dsCellMiddleTitle = pwxVar.c;
                DsCellLeftIcon dsCellLeftIcon = pwxVar.b;
                dsCellMiddleTitle.setTitle(((oq90) cpVar.u()).f25677a);
                pwxVar.e.setVisibility(((oq90) cpVar.u()).b ? 8 : 0);
                TypedValue typedValue = j5d.f15927a;
                Context context = dsCellLeftIcon.getContext();
                context.getClass();
                int iA = j5d.a(context, ((oq90) cpVar.u()).e, false);
                long j = ((oq90) cpVar.u()).d;
                bzu bzuVarE = rz4.e("static", "img", "android", "icons_currency");
                rz4.s(j, ".svg", bzuVarE);
                dsCellLeftIcon.o(R.drawable.ic_glyph_currency_placeholder, Integer.valueOf(iA), Integer.valueOf(iA), ((StringBuilder) bzuVarE.b).toString());
                return Unit.f46060a;
            case 4:
                list.getClass();
                yfu0 yfu0Var3 = cpVar.u;
                ((rwx) yfu0Var3).c.setText(((pq90) cpVar.u()).f27405a);
                rwx rwxVar = (rwx) yfu0Var3;
                TextView textView = rwxVar.c;
                TypedValue typedValue2 = j5d.f15927a;
                Context context2 = cpVar.f40887a.getContext();
                context2.getClass();
                textView.setTextColor(j5d.a(context2, ((pq90) cpVar.u()).e, false));
                rwxVar.b.setVisibility(((pq90) cpVar.u()).b ? 8 : 0);
                return Unit.f46060a;
            case 5:
                list.getClass();
                ((swx) cpVar.u).b.setTitle(((dr90) cpVar.u()).f6548a);
                return Unit.f46060a;
            case 6:
                list.getClass();
                yfu0 yfu0Var4 = cpVar.u;
                Context context3 = cpVar.w;
                ((qwx) yfu0Var4).d.setSelected(((qq90) cpVar.u()).d);
                qwx qwxVar = (qwx) yfu0Var4;
                DsCellMiddleTitle dsCellMiddleTitle2 = qwxVar.c;
                DsCellLeftIcon dsCellLeftIcon2 = qwxVar.b;
                dsCellMiddleTitle2.setTitle(((qq90) cpVar.u()).f29155a);
                qwxVar.e.setVisibility(((qq90) cpVar.u()).b ? 8 : 0);
                Drawable drawable = context3.getDrawable(R.drawable.ic_glyph_language);
                sj3.B0(drawable, context3, R.attr.uikitSecondary60);
                dsCellLeftIcon2.setPlaceholder(drawable);
                StringBuilder sb = new StringBuilder(ujn.h);
                String str = ((qq90) cpVar.u()).c;
                if (str.length() == 0) {
                    sb.setLength(0);
                } else if (StringsKt.O(str, ujn.h, false) || kotlin.text.c.x(str, "https://", false)) {
                    sb.setLength(0);
                    sb.append(str);
                } else {
                    if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                        sb.append('/');
                    }
                    sb.append(StringsKt.y0(str, '/'));
                }
                LoadableImageView.h(dsCellLeftIcon2, sb.toString(), drawable, 12);
                return Unit.f46060a;
            case 7:
                list.getClass();
                yfu0 yfu0Var5 = cpVar.u;
                ((twx) yfu0Var5).c.setSelected(((rq90) cpVar.u()).c);
                twx twxVar = (twx) yfu0Var5;
                twxVar.b.setTitle(((rq90) cpVar.u()).f30921a);
                twxVar.d.setVisibility(((rq90) cpVar.u()).b ? 8 : 0);
                return Unit.f46060a;
            case 8:
                list.getClass();
                v140 v140Var = (v140) cpVar.u();
                zvx zvxVar = (zvx) cpVar.u;
                zvxVar.b.setIconResource(v140Var.d);
                zvxVar.b.setBadgeVisible(v140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle3 = zvxVar.c;
                dsCellMiddleTitle3.setTitle(v140Var.e);
                dsCellMiddleTitle3.setSubtitle(v140Var.f);
                return Unit.f46060a;
            case 9:
                list.getClass();
                v140 v140Var2 = (v140) cpVar.u();
                dux duxVar = (dux) cpVar.u;
                duxVar.c.setIconResource(v140Var2.d);
                duxVar.c.setBadgeVisible(v140Var2.b);
                DsCellMiddleTitle dsCellMiddleTitle4 = duxVar.d;
                dsCellMiddleTitle4.setTitle(v140Var2.e);
                dsCellMiddleTitle4.setSubtitle(v140Var2.f);
                DsCellRightBanner dsCellRightBanner = duxVar.b;
                List list2 = u0d.f34849a;
                Context context4 = dsCellRightBanner.getContext();
                context4.getClass();
                u0d.s(context4, v140Var2.g, null, null, null, new k9(dsCellRightBanner, (byte) 12), new k9(dsCellRightBanner, (byte) 13), 14);
                return Unit.f46060a;
            case 10:
                list.getClass();
                ((i2k) cpVar.u).b.setModel(new nrv(((ghj) cpVar.u()).f11302a, ((ghj) cpVar.u()).b, null, cpVar.v(R.string.filter_all), null, null, null, 244));
                return Unit.f46060a;
            case 11:
                list.getClass();
                p7b0 p7b0Var = (p7b0) cpVar.u;
                p7b0Var.c.setVisibility(((jm60) cpVar.u()).e ? 0 : 8);
                p7b0Var.f26498a.setEnabled(!((jm60) cpVar.u()).e);
                p7b0Var.b.setImageResource(((jm60) cpVar.u()).d);
                p7b0Var.e.setText(((jm60) cpVar.u()).b);
                p7b0Var.d.setText(((jm60) cpVar.u()).c);
                return Unit.f46060a;
            case 12:
                list.getClass();
                ((xwx) cpVar.u).b.setText(((ProfileEditUiModelTitle) cpVar.u()).f46793a);
                return Unit.f46060a;
            case 13:
                list.getClass();
                yfu0 yfu0Var6 = cpVar.u;
                ((ywx) yfu0Var6).c.setTitle(((sfc0) cpVar.u()).f32113a);
                ywx ywxVar = (ywx) yfu0Var6;
                ywxVar.c.setSubtitleMaxLines(5);
                ywxVar.c.setSubtitle(((sfc0) cpVar.u()).b);
                return Unit.f46060a;
            case 14:
                list.getClass();
                yfu0 yfu0Var7 = cpVar.u;
                DsMenuCell dsMenuCell = ((xtx) yfu0Var7).b;
                dsMenuCell.getClass();
                Context context5 = cpVar.w;
                jmu0.j(dsMenuCell, ColorStateList.valueOf(m5d.b(R.attr.uikitPrimary, context5)));
                xtx xtxVar = (xtx) yfu0Var7;
                xtxVar.d.setIconResource(((l140) cpVar.u()).d);
                DsCellLeftIcon dsCellLeftIcon3 = xtxVar.d;
                dsCellLeftIcon3.setIconTint(m5d.b(R.attr.uikitPrimary, context5));
                dsCellLeftIcon3.setIconBackgroundTint(R.attr.uikitStaticWhite);
                DsCellMiddleTitle dsCellMiddleTitle5 = xtxVar.e;
                dsCellMiddleTitle5.setTitle(((l140) cpVar.u()).e);
                dsCellMiddleTitle5.setSubtitle(((l140) cpVar.u()).f);
                xtxVar.c.setImageResource(((l140) cpVar.u()).g);
                dsCellLeftIcon3.setBadgeVisible(((l140) cpVar.u()).b);
                return Unit.f46060a;
            case 15:
                list.getClass();
                ViewGroup.LayoutParams layoutParams = ((z2k) cpVar.u).f43673a.getLayoutParams();
                Resources resources = cpVar.w.getResources();
                nmk0 nmk0Var = nmk0.SPACE_8;
                layoutParams.height = resources.getDimensionPixelSize(R.dimen.space_8);
                return Unit.f46060a;
            case 16:
                list.getClass();
                dxx dxxVar = (dxx) cpVar.u;
                dxxVar.c.setVisibility(((yvf0) cpVar.u()).f43317a.length() > 0 ? 0 : 8);
                TextView textView2 = dxxVar.c;
                TextView textView3 = dxxVar.b;
                textView2.setText(((yvf0) cpVar.u()).f43317a);
                textView3.setVisibility(((yvf0) cpVar.u()).b.length() > 0 ? 0 : 8);
                textView3.setText(((yvf0) cpVar.u()).b);
                return Unit.f46060a;
            case 17:
                list.getClass();
                ((u7z) cpVar.u).b.setChecked(((rlg0) cpVar.u()).f30696a);
                return Unit.f46060a;
            case 18:
                list.getClass();
                yfu0 yfu0Var8 = cpVar.u;
                DsSettingsCell dsSettingsCell2 = ((cgu0) yfu0Var8).f4331a;
                dsSettingsCell2.setFirst(false);
                cgu0 cgu0Var = (cgu0) yfu0Var8;
                cgu0Var.f4331a.setLast(((gth0) cpVar.u()).f11881a);
                DsShimmerCell dsShimmerCell = cgu0Var.b;
                dsShimmerCell.setFirst(false);
                dsShimmerCell.setLast(((gth0) cpVar.u()).f11881a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                list.getClass();
                DsHeader dsHeader = ((uku0) cpVar.u).b;
                dsHeader.setModel(new nrv(cpVar.v(R.string.settings_items), false, null, null, null, null, null, 254));
                return Unit.f46060a;
            case 20:
                list.getClass();
                yfu0 yfu0Var9 = cpVar.u;
                ((wku0) yfu0Var9).c.setTitle(((ush0) cpVar.u()).f36211a);
                wku0 wku0Var = (wku0) yfu0Var9;
                DsCellMiddleTitle dsCellMiddleTitle6 = wku0Var.c;
                dsCellMiddleTitle6.setSubtitle(R.string.security_level_description);
                vcc.e0(wku0Var.b, ((ush0) cpVar.u()).b);
                wku0Var.c.setSubtitleVisible(((ush0) cpVar.u()).c);
                DsSettingsCell dsSettingsCell3 = wku0Var.f39325a;
                dsSettingsCell3.setFirst(true);
                dsSettingsCell3.setLast(true);
                return Unit.f46060a;
            case 21:
                list.getClass();
                yfu0 yfu0Var10 = cpVar.u;
                DsSettingsCell dsSettingsCell4 = ((vhu0) yfu0Var10).f37448a;
                dsSettingsCell4.setLast(false);
                DsSettingsCell dsSettingsCell5 = ((vhu0) yfu0Var10).f37448a;
                dsSettingsCell5.setFirst(true);
                return Unit.f46060a;
            case 22:
                list.getClass();
                yfu0 yfu0Var11 = cpVar.u;
                DsSettingsCell dsSettingsCell6 = ((yju0) yfu0Var11).f42757a;
                dsSettingsCell6.setLast(true);
                DsSettingsCell dsSettingsCell7 = ((yju0) yfu0Var11).f42757a;
                dsSettingsCell7.setFirst(true);
                return Unit.f46060a;
            case 23:
                list.getClass();
                tku0 tku0Var = (tku0) cpVar.u;
                TextView textView4 = tku0Var.c;
                textView4.setVisibility(0);
                TextView textView5 = tku0Var.c;
                DsSettingsCell dsSettingsCell8 = tku0Var.f34115a;
                textView5.setText(((vsh0) cpVar.u()).b);
                tku0Var.f.setText(((vsh0) cpVar.u()).f37951a);
                tku0Var.e.setProgress(((vsh0) cpVar.u()).c);
                tku0Var.d.setVisibility(((vsh0) cpVar.u()).f ? 0 : 8);
                dsSettingsCell8.setFirst(true);
                dsSettingsCell8.setLast(false);
                return Unit.f46060a;
            case 24:
                list.getClass();
                yfu0 yfu0Var12 = cpVar.u;
                ((vku0) yfu0Var12).b.setIconDrawable(epv0.U(((wsh0) cpVar.u()).c, cpVar.f40887a.getContext()));
                vku0 vku0Var = (vku0) yfu0Var12;
                DsCellMiddleTitle dsCellMiddleTitle7 = vku0Var.c;
                DsSettingsCell dsSettingsCell9 = vku0Var.f37594a;
                dsCellMiddleTitle7.setTitle(((wsh0) cpVar.u()).d);
                DsCellMiddleTitle dsCellMiddleTitle8 = vku0Var.c;
                dsCellMiddleTitle8.setSubtitle(((wsh0) cpVar.u()).e);
                dsCellMiddleTitle8.setStatus(((wsh0) cpVar.u()).f);
                dsCellMiddleTitle8.setTitleMaxLinesForce(2);
                vku0Var.d.setVisibility(((wsh0) cpVar.u()).g ? 0 : 8);
                dsSettingsCell9.setFirst(false);
                dsSettingsCell9.setLast(false);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                list.getClass();
                yfu0 yfu0Var13 = cpVar.u;
                ((djj0) yfu0Var13).c.setText(((qki0) cpVar.u()).b);
                ((djj0) yfu0Var13).b.setChecked(((qki0) cpVar.u()).c);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                list.getClass();
                TextView textView6 = ((lux) cpVar.u).b;
                Context context6 = cpVar.w;
                int iOrdinal = ((xvi0) cpVar.u()).f41561a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        i = R.string.hidden_markets;
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        i = R.string.markets;
                    }
                }
                textView6.setText(context6.getText(i));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                list.getClass();
                TextView textView7 = ((mux) cpVar.u).b;
                Context context7 = cpVar.w;
                int iOrdinal2 = ((yvi0) cpVar.u()).f43321a.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        i = R.string.hidden_markets;
                    } else {
                        if (iOrdinal2 != 2) {
                            t9f.b();
                            return null;
                        }
                        i = R.string.markets;
                    }
                }
                textView7.setText(context7.getText(i));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                list.getClass();
                ((gxx) cpVar.u).f12099a.setModel(new nrv(((zvi0) cpVar.u()).f45059a, false, null, null, null, null, null, 254));
                return Unit.f46060a;
            default:
                list.getClass();
                DsHeader dsHeader2 = ((fxx) cpVar.u).b;
                cpVar.u();
                throw new ClassCastException();
        }
    }
}
