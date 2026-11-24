package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a8u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f445a;
    public final /* synthetic */ cp b;

    public /* synthetic */ a8u0(cp cpVar, byte b) {
        this.f445a = b;
        this.b = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f445a;
        cp cpVar = this.b;
        List list = (List) obj;
        switch (b) {
            case 0:
                list.getClass();
                yfu0 yfu0Var = cpVar.u;
                ((b8u0) yfu0Var).e.setText(((g8u0) cpVar.u()).b);
                b8u0 b8u0Var = (b8u0) yfu0Var;
                TextView textView = b8u0Var.f;
                ImageView imageView = b8u0Var.d;
                textView.setText(((g8u0) cpVar.u()).c);
                b8u0Var.b.setText(((g8u0) cpVar.u()).f);
                if (((g8u0) cpVar.u()).d.length() > 0) {
                    List list2 = u0d.f34849a;
                    u0d.j(imageView, ((g8u0) cpVar.u()).d, R.drawable.verification_option_default_logo, 0, null, null, null, 508);
                }
                if (((g8u0) cpVar.u()).e) {
                    TypedValue typedValue = j5d.f15927a;
                    Context context = imageView.getContext();
                    context.getClass();
                    imageView.setImageTintList(ColorStateList.valueOf(j5d.a(context, R.attr.uikitSecondary, false)));
                } else {
                    imageView.setImageTintList(null);
                }
                break;
            case 1:
                list.getClass();
                m140 m140Var = (m140) cpVar.u();
                zvx zvxVar = (zvx) cpVar.u;
                zvxVar.b.setIconResource(m140Var.d);
                zvxVar.b.setBadgeVisible(m140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle = zvxVar.c;
                dsCellMiddleTitle.setTitle(m140Var.g);
                dsCellMiddleTitle.setSubtitle(m140Var.h);
                break;
            case 2:
                list.getClass();
                yfu0 yfu0Var2 = cpVar.u;
                DsMenuCell dsMenuCell = ((aux) yfu0Var2).b;
                dsMenuCell.getClass();
                Context context2 = cpVar.w;
                jmu0.j(dsMenuCell, ColorStateList.valueOf(m5d.b(((m140) cpVar.u()).j, context2)));
                aux auxVar = (aux) yfu0Var2;
                auxVar.d.setIconResource(((m140) cpVar.u()).d);
                DsCellLeftIcon dsCellLeftIcon = auxVar.d;
                dsCellLeftIcon.setIconTint(ColorStateList.valueOf(m5d.b(((m140) cpVar.u()).e, context2)));
                dsCellLeftIcon.setIconBackgroundTint(((m140) cpVar.u()).f);
                DsCellMiddleTitle dsCellMiddleTitle2 = auxVar.e;
                dsCellMiddleTitle2.setTitle(((m140) cpVar.u()).g);
                dsCellMiddleTitle2.setSubtitle(((m140) cpVar.u()).h);
                auxVar.c.setImageResource(((m140) cpVar.u()).i);
                dsCellLeftIcon.setBadgeVisible(((m140) cpVar.u()).b);
                break;
            case 3:
                list.getClass();
                yfu0 yfu0Var3 = cpVar.u;
                ((ztx) yfu0Var3).b.setIconResource(((m140) cpVar.u()).d);
                ztx ztxVar = (ztx) yfu0Var3;
                DsMenuCompactCell dsMenuCompactCell = ztxVar.b;
                Context context3 = cpVar.w;
                dsMenuCompactCell.setIconTint(ColorStateList.valueOf(m5d.b(((m140) cpVar.u()).f, context3)));
                DsMenuCompactCell dsMenuCompactCell2 = ztxVar.b;
                jmu0.j(dsMenuCompactCell2, ColorStateList.valueOf(m5d.b(((m140) cpVar.u()).j, context3)));
                dsMenuCompactCell2.setTitle(((m140) cpVar.u()).g);
                dsMenuCompactCell2.setSubTitle(((m140) cpVar.u()).h);
                dsMenuCompactCell2.setBadgeVisible(((m140) cpVar.u()).b);
                break;
            case 4:
                list.getClass();
                yfu0 yfu0Var4 = cpVar.u;
                ((yyx) yfu0Var4).b.o(R.drawable.ic_glyph_planet, null, null, ((d240) cpVar.u()).f);
                yyx yyxVar = (yyx) yfu0Var4;
                yyxVar.b.setBadgeVisible(((d240) cpVar.u()).f5339a);
                yyxVar.c.setTitle(((d240) cpVar.u()).g);
                break;
            case 5:
                list.getClass();
                yfu0 yfu0Var5 = cpVar.u;
                ((jtx) yfu0Var5).b.setTitle(((d240) cpVar.u()).g);
                jtx jtxVar = (jtx) yfu0Var5;
                jtxVar.b.v(R.drawable.ic_category_placeholder, ((d240) cpVar.u()).f);
                jtxVar.b.setBadgeVisible(((d240) cpVar.u()).f5339a);
                break;
            case 6:
                list.getClass();
                ((cqv) cpVar.u).b.setModel(new nrv(((dev0) cpVar.u()).f5970a, false, null, null, null, null, null, 254));
                break;
            case 7:
                list.getClass();
                yfu0 yfu0Var6 = cpVar.u;
                ((mev0) yfu0Var6).d.setTitle(((lev0) cpVar.u()).b);
                mev0 mev0Var = (mev0) yfu0Var6;
                mev0Var.c.setFirst(((lev0) cpVar.u()).d);
                mev0Var.c.setLast(((lev0) cpVar.u()).e);
                mev0Var.b.setIconResource(((lev0) cpVar.u()).c);
                break;
            case 8:
                list.getClass();
                yfu0 yfu0Var7 = cpVar.u;
                DsCellMiddleTitle dsCellMiddleTitle3 = ((q3w) yfu0Var7).b;
                dsCellMiddleTitle3.setTitle(((pgv0) cpVar.u()).f26969a);
                dsCellMiddleTitle3.setSubtitle(((pgv0) cpVar.u()).b);
                q3w q3wVar = (q3w) yfu0Var7;
                dsCellMiddleTitle3.setTitleTextColor(q3wVar.f28071a.getContext().getColor(R.color.static_white));
                DsMenuCell dsMenuCell2 = q3wVar.f28071a;
                dsCellMiddleTitle3.setSubtitleTextColor(dsMenuCell2.getContext().getColor(R.color.static_white_80));
                dsMenuCell2.getClass();
                jmu0.j(dsMenuCell2, ((pgv0) cpVar.u()).d);
                List list3 = u0d.f34849a;
                u0d.j(q3wVar.c, ((pgv0) cpVar.u()).c, 0, 0, null, null, null, 510);
                break;
            case 9:
                list.getClass();
                yfu0 yfu0Var8 = cpVar.u;
                ((azx) yfu0Var8).d.setIconResource(((e240) cpVar.u()).d);
                azx azxVar = (azx) yfu0Var8;
                azxVar.d.setBadgeVisible(((e240) cpVar.u()).f7067a);
                DsCellMiddleTitle dsCellMiddleTitle4 = azxVar.f;
                dsCellMiddleTitle4.setTitle(((e240) cpVar.u()).e);
                dsCellMiddleTitle4.setSubtitle(((e240) cpVar.u()).f);
                WebGamesGameCollection webGamesGameCollection = azxVar.c;
                List list4 = ((e240) cpVar.u()).g;
                int i = WebGamesGameCollection.o2;
                yge0 adapter = webGamesGameCollection.getAdapter();
                adapter.getClass();
                ((o4s) adapter).H(list4, null);
                break;
            default:
                list.getClass();
                e240 e240Var = (e240) cpVar.u();
                bzx bzxVar = (bzx) cpVar.u;
                bzxVar.d.setIconResource(e240Var.d);
                bzxVar.d.setBadgeVisible(e240Var.f7067a);
                DsCellMiddleTitle dsCellMiddleTitle5 = bzxVar.f;
                dsCellMiddleTitle5.setTitle(e240Var.e);
                dsCellMiddleTitle5.setSubtitle(e240Var.f);
                WebGamesGameCollection webGamesGameCollection2 = bzxVar.c;
                List list5 = e240Var.g;
                int i2 = WebGamesGameCollection.o2;
                yge0 adapter2 = webGamesGameCollection2.getAdapter();
                adapter2.getClass();
                ((o4s) adapter2).H(list5, null);
                break;
        }
        return Unit.f46060a;
    }
}
