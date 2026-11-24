package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.presentation.model.FinInstrumentUIModel;
import org.xplatform.ui_core.resources.UiText;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b1w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1827a;
    public final /* synthetic */ cp b;

    public /* synthetic */ b1w(cp cpVar, byte b) {
        this.f1827a = b;
        this.b = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1827a;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                yfu0 yfu0Var = cpVar.u;
                ((kvx) yfu0Var).c.setIconResource(((l8w) cpVar.u()).b);
                kvx kvxVar = (kvx) yfu0Var;
                DsCellLeftIcon dsCellLeftIcon = kvxVar.c;
                Context context = cpVar.w;
                dsCellLeftIcon.setIconTint(m5d.b(((l8w) cpVar.u()).c, context));
                jmu0.j(kvxVar.c, ColorStateList.valueOf(m5d.b(((l8w) cpVar.u()).d, context)));
                DsCellMiddleTitle dsCellMiddleTitle = kvxVar.d;
                dsCellMiddleTitle.setTitle(((l8w) cpVar.u()).e);
                dsCellMiddleTitle.setSubtitle(((l8w) cpVar.u()).f);
                dsCellMiddleTitle.setCaption(((l8w) cpVar.u()).g);
                kvxVar.b.setVisibility(((l8w) cpVar.u()).h ? 0 : 8);
                break;
            case 1:
                ((List) obj).getClass();
                yfu0 yfu0Var2 = cpVar.u;
                TextView textView = ((s2w) yfu0Var2).b;
                UiText.ByIntRes byIntRes = ((e2w) cpVar.u()).f7106a;
                View view = cpVar.f40887a;
                Context context2 = view.getContext();
                context2.getClass();
                textView.setText(byIntRes.a(context2));
                TextView textView2 = ((s2w) yfu0Var2).c;
                UiText.ByString byString = ((e2w) cpVar.u()).b;
                Context context3 = view.getContext();
                context3.getClass();
                textView2.setText(byString.a(context3));
                break;
            case 2:
                ((List) obj).getClass();
                f140.r("AdapterDelegate not found for ", sre0.f32672a.b(cpVar.u().getClass()).J(), "fallbackAdapterDelegate");
                break;
            case 3:
                ((List) obj).getClass();
                yfu0 yfu0Var3 = cpVar.u;
                ((mvx) yfu0Var3).b.setIconResource(((m8w) cpVar.u()).f21389a);
                mvx mvxVar = (mvx) yfu0Var3;
                DsCellLeftIcon dsCellLeftIcon2 = mvxVar.b;
                Context context4 = cpVar.w;
                dsCellLeftIcon2.setIconTint(m5d.b(((m8w) cpVar.u()).b, context4));
                jmu0.j(mvxVar.b, ColorStateList.valueOf(m5d.b(((m8w) cpVar.u()).c, context4)));
                DsCellMiddleTitle dsCellMiddleTitle2 = mvxVar.c;
                dsCellMiddleTitle2.setTitle(((m8w) cpVar.u()).d);
                dsCellMiddleTitle2.setTitle(((m8w) cpVar.u()).d);
                dsCellMiddleTitle2.setSubtitle(((m8w) cpVar.u()).e);
                break;
            case 4:
                ((List) obj).getClass();
                xrw xrwVar = (xrw) cpVar.u();
                List list = u0d.f34849a;
                nvx nvxVar = (nvx) cpVar.u;
                u0d.n(nvxVar.b, xrwVar.b, 0, 11);
                u0d.n(nvxVar.c, xrwVar.d, 0, 11);
                nvxVar.e.setText(xrwVar.f41390a);
                nvxVar.f.setText(xrwVar.c);
                String str = xrwVar.e;
                int length = str.length();
                TextView textView3 = nvxVar.d;
                if (length > 0) {
                    textView3.setText(str);
                } else {
                    rdj rdjVar = rdj.f30294a;
                    textView3.setText(rdj.g(new znq0(xrwVar.f), efj.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar.w)), false, 56));
                }
                break;
            case 5:
                ((List) obj).getClass();
                p140 p140Var = (p140) cpVar.u();
                wtx wtxVar = (wtx) cpVar.u;
                wtxVar.c.setIconResource(p140Var.f);
                DsCellLeftIcon dsCellLeftIcon3 = wtxVar.c;
                dsCellLeftIcon3.setIconTint(m5d.b(p140Var.g, cpVar.w));
                dsCellLeftIcon3.setBadgeVisible(p140Var.b);
                dsCellLeftIcon3.setBadgeBackgroundTint(p140Var.d);
                dsCellLeftIcon3.setIconBackgroundTint(p140Var.h);
                DsCellMiddleTitle dsCellMiddleTitle3 = wtxVar.d;
                dsCellMiddleTitle3.setTitle(p140Var.i);
                dsCellMiddleTitle3.setSubtitle(p140Var.j);
                DsCellRightBanner dsCellRightBanner = wtxVar.b;
                dsCellRightBanner.setImageResource(p140Var.k);
                dsCellRightBanner.setColorFilter(p140Var.m);
                wtxVar.f39765a.setBackgroundResource(p140Var.l);
                break;
            case 6:
                ((List) obj).getClass();
                r140 r140Var = (r140) cpVar.u();
                eux euxVar = (eux) cpVar.u;
                euxVar.c.setIconResource(r140Var.d);
                DsCellMiddleTitle dsCellMiddleTitle4 = euxVar.d;
                dsCellMiddleTitle4.setTitle(r140Var.e);
                dsCellMiddleTitle4.setSubtitle(r140Var.f);
                euxVar.b.setImageResource(r140Var.g);
                euxVar.c.setBadgeVisible(r140Var.b);
                break;
            case 7:
                ((List) obj).getClass();
                yfu0 yfu0Var4 = cpVar.u;
                ((bwx) yfu0Var4).b.setIconResource(((s140) cpVar.u()).d);
                bwx bwxVar = (bwx) yfu0Var4;
                bwxVar.c.setTitle(((s140) cpVar.u()).e);
                bwxVar.c.setSubtitle(((s140) cpVar.u()).f);
                bwxVar.b.setBadgeVisible(((s140) cpVar.u()).b);
                break;
            case 8:
                ((List) obj).getClass();
                y140 y140Var = (y140) cpVar.u();
                wxx wxxVar = (wxx) cpVar.u;
                DsCellLeftIcon dsCellLeftIcon4 = wxxVar.c;
                TypedValue typedValue = j5d.f15927a;
                Context context5 = cpVar.w;
                int i = y140Var.h;
                dsCellLeftIcon4.setIconTint(j5d.a(context5, i, false));
                DsCellLeftIcon dsCellLeftIcon5 = wxxVar.c;
                int i2 = y140Var.i;
                dsCellLeftIcon5.setIconResource(i2);
                dsCellLeftIcon5.m(y140Var.g, y140Var.f, Integer.valueOf(j5d.a(context5, y140Var.e, false)), Integer.valueOf(j5d.a(context5, R.attr.uikitBackground, false)), Integer.valueOf(i2), Integer.valueOf(j5d.a(context5, i, false)));
                dsCellLeftIcon5.setBadgeVisible(y140Var.f41837a);
                DsCellMiddleTitle dsCellMiddleTitle5 = wxxVar.d;
                dsCellMiddleTitle5.setTitle(y140Var.j);
                dsCellMiddleTitle5.setSubtitle(y140Var.k);
                DsCellRightBanner dsCellRightBanner2 = wxxVar.b;
                dsCellRightBanner2.setImageDrawable(null);
                List list2 = u0d.f34849a;
                Context context6 = dsCellRightBanner2.getContext();
                context6.getClass();
                u0d.s(context6, y140Var.l, null, null, null, new k9(dsCellRightBanner2, (byte) 10), new k9(dsCellRightBanner2, (byte) 11), 14);
                break;
            case 9:
                ((List) obj).getClass();
                u140 u140Var = (u140) cpVar.u();
                bzx bzxVar = (bzx) cpVar.u;
                bzxVar.d.setIconResource(u140Var.d);
                bzxVar.d.setBadgeVisible(u140Var.f34885a);
                DsCellMiddleTitle dsCellMiddleTitle6 = bzxVar.f;
                dsCellMiddleTitle6.setTitle(u140Var.e);
                dsCellMiddleTitle6.setSubtitle(u140Var.f);
                WebGamesGameCollection webGamesGameCollection = bzxVar.c;
                List list3 = u140Var.g;
                int i3 = WebGamesGameCollection.o2;
                yge0 adapter = webGamesGameCollection.getAdapter();
                adapter.getClass();
                ((o4s) adapter).H(list3, null);
                break;
            case 10:
                ((List) obj).getClass();
                Object objU = cpVar.u();
                yfu0 yfu0Var5 = cpVar.u;
                int i4 = ((FinInstrumentUIModel) objU).e ? R.attr.uikitPrimary : R.attr.uikitTextPrimary;
                uvx uvxVar = (uvx) yfu0Var5;
                TextView textView4 = uvxVar.b;
                TypedValue typedValue2 = j5d.f15927a;
                Context context7 = cpVar.f40887a.getContext();
                context7.getClass();
                textView4.setTextColor(j5d.a(context7, i4, false));
                uvxVar.b.setText(((FinInstrumentUIModel) cpVar.u()).b);
                break;
            case 11:
                ((List) obj).getClass();
                TextView textView5 = ((yxx) cpVar.u).b;
                ArrayList arrayList = new ArrayList();
                bnk0 bnk0Var = new bnk0();
                pzw.E(bnk0Var, cpVar.v(((pvx) cpVar.u()).f27683a), 0, 0, 1, 0, 46);
                pzw.E(bnk0Var, ": ", 0, 0, 1, 0, 46);
                pzw.E(bnk0Var, ((pvx) cpVar.u()).b, 0, R.color.static_white_60, 0, 0, 54);
                arrayList.addAll(bnk0Var.f2888a);
                Context context8 = cpVar.f40887a.getContext();
                context8.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(spannableStringBuilder.append((CharSequence) ((zmk0) it.next()).a(context8)));
                }
                SpannableString spannableStringValueOf = SpannableString.valueOf(spannableStringBuilder);
                spannableStringValueOf.getClass();
                textView5.setText(spannableStringValueOf);
                break;
            case 12:
                ((List) obj).getClass();
                yfu0 yfu0Var6 = cpVar.u;
                ((vvx) yfu0Var6).b.setTitle(((euy) cpVar.u()).c);
                vvx vvxVar = (vvx) yfu0Var6;
                DsCellRightLabel dsCellRightLabel = vvxVar.c;
                DsSettingsCell dsSettingsCell = vvxVar.f38123a;
                dsCellRightLabel.setText(((euy) cpVar.u()).f8444a);
                if (((euy) cpVar.u()).b != 0) {
                    DsCellRightLabel dsCellRightLabel2 = vvxVar.c;
                    TypedValue typedValue3 = j5d.f15927a;
                    dsCellRightLabel2.setTextColor(j5d.a(cpVar.w, ((euy) cpVar.u()).b, false));
                }
                dsSettingsCell.setFirst(((euy) cpVar.u()).d == uwx.f36413a || ((euy) cpVar.u()).d == uwx.d);
                dsSettingsCell.setLast(((euy) cpVar.u()).d == uwx.c || ((euy) cpVar.u()).d == uwx.d);
                break;
            case 13:
                ((List) obj).getClass();
                yfu0 yfu0Var7 = cpVar.u;
                ((s7b0) yfu0Var7).c.setModel(((tv60) cpVar.u()).f34585a);
                ((s7b0) yfu0Var7).b.setModel(((tv60) cpVar.u()).b.f31157a);
                break;
            case 14:
                ((List) obj).getClass();
                yfu0 yfu0Var8 = cpVar.u;
                ((r6z) yfu0Var8).b.setLevel(((fkz) cpVar.u()).f9716a);
                ((r6z) yfu0Var8).b.setProgress(((fkz) cpVar.u()).b);
                break;
            case 15:
                ((List) obj).getClass();
                yfu0 yfu0Var9 = cpVar.u;
                ((yvx) yfu0Var9).c.setText(cpVar.v(((rrz) cpVar.u()).f31008a));
                TextView textView6 = ((yvx) yfu0Var9).b;
                textView6.setText(cpVar.v(R.string.deposit_limits_requirements));
                break;
            case 16:
                ((List) obj).getClass();
                ((xvx) cpVar.u).f41583a.setText(cpVar.v(((srz) cpVar.u()).f32702a));
                break;
            case 17:
                ((List) obj).getClass();
                l140 l140Var = (l140) cpVar.u();
                zvx zvxVar = (zvx) cpVar.u;
                zvxVar.b.setIconResource(l140Var.d);
                zvxVar.b.setBadgeVisible(l140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle7 = zvxVar.c;
                dsCellMiddleTitle7.setTitle(l140Var.e);
                dsCellMiddleTitle7.setSubtitle(l140Var.f);
                break;
            case 18:
                ((List) obj).getClass();
                a240 a240Var = (a240) cpVar.u();
                awx awxVar = (awx) cpVar.u;
                awxVar.c.setIconResource(a240Var.d);
                awxVar.c.setBadgeVisible(a240Var.b);
                DsCellMiddleTitle dsCellMiddleTitle8 = awxVar.d;
                dsCellMiddleTitle8.setTitle(a240Var.e);
                dsCellMiddleTitle8.setSubtitle(a240Var.f);
                awxVar.b.setCount(Integer.valueOf(a240Var.g));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((List) obj).getClass();
                a240 a240Var2 = (a240) cpVar.u();
                zvx zvxVar2 = (zvx) cpVar.u;
                zvxVar2.b.setIconResource(a240Var2.d);
                zvxVar2.b.setBadgeVisible(a240Var2.b);
                DsCellMiddleTitle dsCellMiddleTitle9 = zvxVar2.c;
                dsCellMiddleTitle9.setTitle(a240Var2.e);
                dsCellMiddleTitle9.setSubtitle(a240Var2.f);
                break;
            case 20:
                ((List) obj).getClass();
                w140 w140Var = (w140) cpVar.u();
                zvx zvxVar3 = (zvx) cpVar.u;
                zvxVar3.b.setIconResource(w140Var.d);
                zvxVar3.b.setBadgeVisible(w140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle10 = zvxVar3.c;
                dsCellMiddleTitle10.setTitle(w140Var.e);
                dsCellMiddleTitle10.setSubtitle(w140Var.f);
                break;
            case 21:
                ((List) obj).getClass();
                w140 w140Var2 = (w140) cpVar.u();
                bwx bwxVar2 = (bwx) cpVar.u;
                bwxVar2.b.setIconResource(w140Var2.d);
                bwxVar2.b.setBadgeVisible(w140Var2.b);
                DsCellMiddleTitle dsCellMiddleTitle11 = bwxVar2.c;
                dsCellMiddleTitle11.setTitle(w140Var2.e);
                dsCellMiddleTitle11.setSubtitle(w140Var2.f);
                break;
            case 22:
                ((List) obj).getClass();
                ((cwx) cpVar.u).b.setText(((u700) cpVar.u()).h());
                break;
            case 23:
                ((List) obj).getClass();
                dwx dwxVar = (dwx) cpVar.u;
                List list4 = u0d.f34849a;
                u0d.n(dwxVar.b, ((y700) cpVar.u()).c(), 0, 11);
                u0d.n(dwxVar.c, ((y700) cpVar.u()).d(), 0, 11);
                dwxVar.e.setText(((y700) cpVar.u()).j());
                dwxVar.g.setText(((y700) cpVar.u()).g());
                dwxVar.f.setText(((y700) cpVar.u()).f());
                TextView textView7 = dwxVar.d;
                rdj rdjVar2 = rdj.f30294a;
                textView7.setText(rdj.f(new znq0(((y700) cpVar.u()).e()), sdj.UNIVERSAL, null, 60));
                dwxVar.h.setVisibility(((y700) cpVar.u()).a() ? 0 : 8);
                dwxVar.i.setVisibility(((y700) cpVar.u()).b() ? 0 : 8);
                break;
            case 24:
                ((List) obj).getClass();
                TextView textView8 = ((gwx) cpVar.u).f12049a;
                textView8.setText(cpVar.v(R.string.set_your_limits_description));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((List) obj).getClass();
                TextView textView9 = ((hwx) cpVar.u).f13786a;
                textView9.setText(cpVar.v(R.string.set_your_limits));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((List) obj).getClass();
                yfu0 yfu0Var10 = cpVar.u;
                ((lwx) yfu0Var10).c.setText(((xw40) cpVar.u()).f41592a);
                List list5 = u0d.f34849a;
                u0d.n(((lwx) yfu0Var10).b, ((xw40) cpVar.u()).b, 0, 11);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((List) obj).getClass();
                yfu0 yfu0Var11 = cpVar.u;
                ((mwx) yfu0Var11).c.setText(((yw40) cpVar.u()).f43353a);
                List list6 = u0d.f34849a;
                u0d.n(((mwx) yfu0Var11).b, ((yw40) cpVar.u()).b, 0, 11);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((List) obj).getClass();
                yfu0 yfu0Var12 = cpVar.u;
                ((t6t0) yfu0Var12).c.setTitle(((lk60) cpVar.u()).b);
                ((t6t0) yfu0Var12).b.setImageResource(((lk60) cpVar.u()).c);
                break;
            default:
                ((List) obj).getClass();
                List list7 = u0d.f34849a;
                yfu0 yfu0Var13 = cpVar.u;
                AppCompatImageView appCompatImageView = ((nwx) yfu0Var13).b;
                String str2 = ((uk60) cpVar.u()).f35812a;
                u0d.j(appCompatImageView, str2, R.drawable.onboarding_placeholder, 0, null, null, null, 508);
                nwx nwxVar = (nwx) yfu0Var13;
                nwxVar.b.setBackgroundColor(m5d.b(((uk60) cpVar.u()).b, cpVar.w));
                nwxVar.d.setText(cpVar.v(((uk60) cpVar.u()).c));
                nwxVar.c.setText(cpVar.v(((uk60) cpVar.u()).d));
                break;
        }
        return Unit.f46060a;
    }
}
