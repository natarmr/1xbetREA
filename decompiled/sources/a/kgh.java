package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit_sport.sport_cell.left.SportCellLeftView;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kgh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18239a;
    public final /* synthetic */ cp b;

    public /* synthetic */ kgh(cp cpVar, byte b) {
        this.f18239a = b;
        this.b = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yrm yrmVar;
        byte b = this.f18239a;
        int i = R.string.no_hidden_markets_description;
        byte b2 = 5;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                pkd.h(((vjd) cpVar.u).b, pek0.g, null, new ugd(494458555, true, new kja(cpVar, b2)));
                return Unit.f46060a;
            case 1:
                ((List) obj).getClass();
                List list = u0d.f34849a;
                yfu0 yfu0Var = cpVar.u;
                u0d.i(((lgh) yfu0Var).b, ((mgh) cpVar.u()).b);
                lgh lghVar = (lgh) yfu0Var;
                lghVar.c.setText(((mgh) cpVar.u()).c);
                lghVar.c.setVisibility(((mgh) cpVar.u()).c.length() > 0 ? 0 : 8);
                return Unit.f46060a;
            case 2:
                ((List) obj).getClass();
                k140 k140Var = (k140) cpVar.u();
                zvx zvxVar = (zvx) cpVar.u;
                zvxVar.b.setIconResource(k140Var.f);
                zvxVar.b.setBadgeVisible(k140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle = zvxVar.c;
                dsCellMiddleTitle.setTitle(k140Var.i);
                dsCellMiddleTitle.setSubtitle(k140Var.j);
                return Unit.f46060a;
            case 3:
                ((List) obj).getClass();
                k140 k140Var2 = (k140) cpVar.u();
                wtx wtxVar = (wtx) cpVar.u;
                wtxVar.c.setIconResource(k140Var2.f);
                DsCellLeftIcon dsCellLeftIcon = wtxVar.c;
                dsCellLeftIcon.setIconTint(m5d.b(k140Var2.g, cpVar.w));
                dsCellLeftIcon.setBadgeVisible(k140Var2.b);
                dsCellLeftIcon.setBadgeBackgroundTint(k140Var2.d);
                dsCellLeftIcon.setIconBackgroundTint(k140Var2.h);
                DsCellMiddleTitle dsCellMiddleTitle2 = wtxVar.d;
                dsCellMiddleTitle2.setTitle(k140Var2.i);
                dsCellMiddleTitle2.setSubtitle(k140Var2.j);
                DsCellRightBanner dsCellRightBanner = wtxVar.b;
                dsCellRightBanner.setImageResource(k140Var2.k);
                dsCellRightBanner.setColorFilter(k140Var2.n);
                wtxVar.f39765a.setBackgroundResource(k140Var2.l);
                return Unit.f46060a;
            case 4:
                ((List) obj).getClass();
                yfu0 yfu0Var2 = cpVar.u;
                DsMenuCell dsMenuCell = ((ytx) yfu0Var2).b;
                dsMenuCell.getClass();
                Context context = cpVar.w;
                jmu0.j(dsMenuCell, ColorStateList.valueOf(m5d.b(R.attr.uikitPrimary, context)));
                ytx ytxVar = (ytx) yfu0Var2;
                ytxVar.d.setIconResource(((l140) cpVar.u()).d);
                DsCellLeftIcon dsCellLeftIcon2 = ytxVar.d;
                dsCellLeftIcon2.setIconBackgroundTint(R.attr.uikitStaticWhite);
                DsCellMiddleTitle dsCellMiddleTitle3 = ytxVar.e;
                dsCellMiddleTitle3.setTitle(((l140) cpVar.u()).e);
                dsCellMiddleTitle3.setSubtitle(((l140) cpVar.u()).f);
                ytxVar.c.setImageResource(((l140) cpVar.u()).g);
                dsCellLeftIcon2.setBadgeVisible(((l140) cpVar.u()).b);
                return Unit.f46060a;
            case 5:
                ((List) obj).getClass();
                yfu0 yfu0Var3 = cpVar.u;
                ((djj0) yfu0Var3).c.setText(((o8k) cpVar.u()).b);
                ((djj0) yfu0Var3).b.setChecked(((o8k) cpVar.u()).c);
                return Unit.f46060a;
            case 6:
                ((List) obj).getClass();
                yfu0 yfu0Var4 = cpVar.u;
                ((djj0) yfu0Var4).c.setText(((p8k) cpVar.u()).b);
                ((djj0) yfu0Var4).b.setChecked(((p8k) cpVar.u()).c);
                return Unit.f46060a;
            case 7:
                ((List) obj).getClass();
                TextView textView = ((jux) cpVar.u).b;
                Context context2 = cpVar.w;
                int iOrdinal = ((jck) cpVar.u()).f16281a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    i = R.string.no_pinned_markets_description;
                }
                textView.setText(context2.getText(i));
                return Unit.f46060a;
            case 8:
                ((List) obj).getClass();
                TextView textView2 = ((kux) cpVar.u).b;
                Context context3 = cpVar.w;
                int iOrdinal2 = ((kck) cpVar.u()).f18063a.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    i = R.string.no_pinned_markets_description;
                }
                textView2.setText(context3.getText(i));
                return Unit.f46060a;
            case 9:
                ((List) obj).getClass();
                List list2 = u0d.f34849a;
                yfu0 yfu0Var5 = cpVar.u;
                AppCompatImageView appCompatImageViewD = ((xth) yfu0Var5).b.d();
                String str = ((hok) cpVar.u()).c;
                u0d.j(appCompatImageViewD, str, R.drawable.ic_game_pad_placeholder, 0, null, null, null, 508);
                ((xth) yfu0Var5).c.setTitleText(((hok) cpVar.u()).d);
                return Unit.f46060a;
            case 10:
                ((List) obj).getClass();
                yfu0 yfu0Var6 = cpVar.u;
                ((ktk) yfu0Var6).d.setSelected(((muk) cpVar.u()).f22416a);
                ktk ktkVar = (ktk) yfu0Var6;
                ktkVar.b.setTitle(((muk) cpVar.u()).b);
                ktkVar.c.setVisibility(((muk) cpVar.u()).d ? 8 : 0);
                return Unit.f46060a;
            case 11:
                ((List) obj).getClass();
                d240 d240Var = (d240) cpVar.u();
                zvx zvxVar2 = (zvx) cpVar.u;
                hxm0.w(zvxVar2.b);
                DsCellLeftIcon dsCellLeftIcon3 = zvxVar2.b;
                dsCellLeftIcon3.o(R.drawable.ic_glyph_planet, null, null, d240Var.f);
                dsCellLeftIcon3.setBadgeVisible(d240Var.f5339a);
                zvxVar2.c.setTitle(d240Var.g);
                return Unit.f46060a;
            case 12:
                l7m0 l7m0Var = (l7m0) obj;
                l7m0Var.getClass();
                pkd.h(((vjd) cpVar.u).b, pek0.g, null, new ugd(-1685979087, true, new cw0(l7m0Var, (byte) 7)));
                return Unit.f46060a;
            case 13:
                ((List) obj).getClass();
                n140 n140Var = (n140) cpVar.u();
                zvx zvxVar3 = (zvx) cpVar.u;
                zvxVar3.b.setIconResource(n140Var.d);
                zvxVar3.b.setBadgeVisible(n140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle4 = zvxVar3.c;
                dsCellMiddleTitle4.setTitle(n140Var.e);
                dsCellMiddleTitle4.setSubtitle(n140Var.f);
                return Unit.f46060a;
            case 14:
                ((List) obj).getClass();
                n140 n140Var2 = (n140) cpVar.u();
                dux duxVar = (dux) cpVar.u;
                duxVar.c.setIconResource(n140Var2.d);
                duxVar.c.setBadgeVisible(n140Var2.b);
                DsCellMiddleTitle dsCellMiddleTitle5 = duxVar.d;
                dsCellMiddleTitle5.setTitle(n140Var2.e);
                dsCellMiddleTitle5.setSubtitle(n140Var2.f);
                duxVar.b.setImageResource(n140Var2.g);
                return Unit.f46060a;
            case 15:
                ((List) obj).getClass();
                f140.r("AdapterDelegate not found for ", sre0.f32672a.b(cpVar.u().getClass()).J(), "fallbackAdapterDelegate");
                return Unit.f46060a;
            case 16:
                ((List) obj).getClass();
                DsHeader dsHeader = ((x1k) cpVar.u).b;
                FavoriteGroupHeaderUiItem favoriteGroupHeaderUiItem = (FavoriteGroupHeaderUiItem) cpVar.u();
                dsHeader.setModel(new nrv(favoriteGroupHeaderUiItem.getD(), favoriteGroupHeaderUiItem.b, null, favoriteGroupHeaderUiItem.getF(), null, null, Integer.valueOf(favoriteGroupHeaderUiItem.f46634a ? favoriteGroupHeaderUiItem.getE() : 0), 116));
                return Unit.f46060a;
            case 17:
                ((List) obj).getClass();
                f2k f2kVar = (f2k) cpVar.u;
                String strD0 = rcb.d0(new ocb(""), new ncb(((z5p) cpVar.u()).f), ((z5p) cpVar.u()).g);
                List list3 = u0d.f34849a;
                SportCellLeftView sportCellLeftView = f2kVar.b;
                SportCellRightView sportCellRightView = f2kVar.d;
                AppCompatImageView appCompatImageViewD2 = sportCellLeftView.d();
                SportCellLeftView sportCellLeftView2 = f2kVar.b;
                u0d.j(appCompatImageViewD2, strD0, R.drawable.ic_glyph_language_seconary, 0, kotlin.collections.a.c(new j2x(sportCellLeftView2.d().getLayoutParams().height / 2)), null, null, 492);
                boolean z = ((z5p) cpVar.u()).i == h5p.b;
                if (((z5p) cpVar.u()).i == h5p.c) {
                    yrmVar = yrm.b;
                } else {
                    yrmVar = z ? yrm.f43128a : yrm.c;
                }
                sportCellLeftView2.setBadge(yrmVar);
                u0d.s(cpVar.w, ((z5p) cpVar.u()).l, Integer.valueOf(cpVar.w.getResources().getDimensionPixelOffset(R.dimen.size_18)), null, iun.f15405a, new a6p(sportCellLeftView2, (byte) 0), null, 36);
                f2kVar.c.setTitleText(((z5p) cpVar.u()).e);
                sportCellRightView.setCounterNumber(Integer.valueOf(((z5p) cpVar.u()).k));
                sportCellRightView.setTagVisible(((z5p) cpVar.u()).h);
                return Unit.f46060a;
            case 18:
                ((List) obj).getClass();
                yfu0 yfu0Var7 = cpVar.u;
                ((ucu0) yfu0Var7).c.setText(((utq) cpVar.u()).f36266a);
                ((ucu0) yfu0Var7).b.setBackgroundTintList(ColorStateList.valueOf(m5d.b(((utq) cpVar.u()).b, cpVar.w)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((List) obj).getClass();
                ((pux) cpVar.u).b.setText(cpVar.v(R.string.responsible_gaming_test_title));
                return Unit.f46060a;
            case 20:
                l7m0 l7m0Var2 = (l7m0) obj;
                l7m0Var2.getClass();
                pkd.h(((vjd) cpVar.u).b, pek0.g, new shd((byte) 14), new ugd(1866194504, true, new cw0(l7m0Var2, (byte) 10)));
                return Unit.f46060a;
            case 21:
                ((List) obj).getClass();
                yfu0 yfu0Var8 = cpVar.u;
                ((DsHeader) ((i8b0) yfu0Var8).j.d).b(true);
                i8b0 i8b0Var = (i8b0) yfu0Var8;
                ((DsHeader) i8b0Var.f.c).b(true);
                ((DsHeader) i8b0Var.i.c).b(true);
                ((DsHeader) i8b0Var.h.c).b(true);
                ((DsHeader) i8b0Var.e.c).b(true);
                ((DsHeader) i8b0Var.d.c).b(true);
                ((DsHeader) i8b0Var.g.c).b(true);
                return Unit.f46060a;
            case 22:
                ((List) obj).getClass();
                yfu0 yfu0Var9 = cpVar.u;
                ((v6b0) yfu0Var9).c.setModel(((pv60) cpVar.u()).f27649a);
                WebGamesGameCollection webGamesGameCollection = ((v6b0) yfu0Var9).b;
                ArrayList arrayList = ((pv60) cpVar.u()).d;
                int i2 = WebGamesGameCollection.o2;
                yge0 adapter = webGamesGameCollection.getAdapter();
                adapter.getClass();
                ((o4s) adapter).H(arrayList, null);
                return Unit.f46060a;
            case 23:
                ((List) obj).getClass();
                yfu0 yfu0Var10 = cpVar.u;
                ((ohv) yfu0Var10).c.setTitle(((phv) cpVar.u()).b);
                ((ohv) yfu0Var10).b.setSelected(((phv) cpVar.u()).c);
                return Unit.f46060a;
            case 24:
                ((List) obj).getClass();
                ((jvx) cpVar.u).b.setModel(new nrv(((qsv) cpVar.u()).f29271a, false, null, null, null, null, null, 254));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((List) obj).getClass();
                ((ivx) cpVar.u).b.setModel(new nrv(((ssv) cpVar.u()).f32745a, false, null, null, null, null, null, 254));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((List) obj).getClass();
                TextView textView3 = ((yxx) cpVar.u).b;
                sj3.M0(textView3, Float.valueOf(4.0f), Float.valueOf(8.0f), 5);
                textView3.setTypeface(Typeface.DEFAULT_BOLD);
                textView3.setText(((ypv) cpVar.u()).f43050a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((List) obj).getClass();
                ((lvx) cpVar.u).b.setModel(new nrv(((nsv) cpVar.u()).f24068a, false, null, null, null, null, null, 254));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((List) obj).getClass();
                kyv kyvVar = (kyv) cpVar.u;
                TextView textView4 = kyvVar.b;
                textView4.setText(kyvVar.f19124a.getContext().getString(((t21) cpVar.u()).b()));
                if (((t21) cpVar.u()).a()) {
                    textView4.setElevation(0.0f);
                    textView4.setBackgroundResource(R.drawable.bg_favorite_type_selected);
                    TypedValue typedValue = j5d.f15927a;
                    Context context4 = textView4.getContext();
                    context4.getClass();
                    textView4.setTextColor(context4.getColor(R.color.static_white));
                } else {
                    textView4.setElevation(textView4.getResources().getDimension(R.dimen.promo_selected_status_elevation));
                    textView4.setBackgroundResource(R.drawable.bg_favorite_type);
                    TypedValue typedValue2 = j5d.f15927a;
                    Context context5 = textView4.getContext();
                    context5.getClass();
                    textView4.setTextColor(j5d.a(context5, R.attr.uikitTextPrimary, false));
                }
                return Unit.f46060a;
            default:
                ((List) obj).getClass();
                yfu0 yfu0Var11 = cpVar.u;
                TextView textView5 = ((b47) yfu0Var11).b;
                View view = cpVar.f40887a;
                textView5.setText(view.getContext().getString(ulb.O(((u0w) cpVar.u()).f34874a)));
                TextView textView6 = ((b47) yfu0Var11).b;
                TypedValue typedValue3 = j5d.f15927a;
                Context context6 = view.getContext();
                context6.getClass();
                textView6.setTextColor(j5d.a(context6, ((u0w) cpVar.u()).b, false));
                return Unit.f46060a;
        }
    }
}
