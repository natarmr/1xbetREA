package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightAccordion;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16112a;
    public final /* synthetic */ cp b;

    public /* synthetic */ j9(cp cpVar, mo2 mo2Var) {
        this.f16112a = (byte) 16;
        this.b = cpVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        String string;
        int i5;
        byte b = this.f16112a;
        int i6 = R.string.reset_markets_settings;
        cp cpVar = this.b;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                j140 j140Var = (j140) cpVar.u();
                nrx nrxVar = (nrx) cpVar.u;
                nrxVar.c.setIconResource(j140Var.d);
                nrxVar.c.setBadgeVisible(j140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle = nrxVar.d;
                dsCellMiddleTitle.setTitle(j140Var.e);
                dsCellMiddleTitle.setSubtitle(j140Var.f);
                DsCellRightBanner dsCellRightBanner = nrxVar.b;
                List list = u0d.f34849a;
                Context context = dsCellRightBanner.getContext();
                context.getClass();
                u0d.s(context, j140Var.g, null, null, null, new k9(dsCellRightBanner, (byte) 0), new k9(dsCellRightBanner, (byte) 1), 14);
                return Unit.f46060a;
            case 1:
                ((List) obj).getClass();
                k140 k140Var = (k140) cpVar.u();
                mrx mrxVar = (mrx) cpVar.u;
                mrxVar.c.setIconResource(k140Var.f);
                DsCellLeftIcon dsCellLeftIcon = mrxVar.c;
                dsCellLeftIcon.setBadgeVisible(k140Var.b);
                dsCellLeftIcon.setBadgeBackgroundTint(k140Var.d);
                dsCellLeftIcon.setIconBackgroundTint(k140Var.h);
                DsCellMiddleTitle dsCellMiddleTitle2 = mrxVar.d;
                dsCellMiddleTitle2.setTitle(k140Var.i);
                dsCellMiddleTitle2.setSubtitle(k140Var.j);
                DsCellRightBanner dsCellRightBanner2 = mrxVar.b;
                dsCellRightBanner2.setImageResource(k140Var.k);
                dsCellRightBanner2.setColorFilter(k140Var.n);
                mrxVar.f22293a.setBackgroundResource(k140Var.l);
                return Unit.f46060a;
            case 2:
                ((List) obj).getClass();
                n140 n140Var = (n140) cpVar.u();
                nrx nrxVar2 = (nrx) cpVar.u;
                nrxVar2.c.setIconResource(n140Var.d);
                nrxVar2.c.setBadgeVisible(n140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle3 = nrxVar2.d;
                dsCellMiddleTitle3.setTitle(n140Var.e);
                dsCellMiddleTitle3.setSubtitle(n140Var.f);
                nrxVar2.b.setImageResource(n140Var.g);
                return Unit.f46060a;
            case 3:
                ((List) obj).getClass();
                w140 w140Var = (w140) cpVar.u();
                orx orxVar = (orx) cpVar.u;
                orxVar.b.setIconResource(w140Var.d);
                orxVar.b.setBadgeVisible(w140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle4 = orxVar.c;
                dsCellMiddleTitle4.setTitle(w140Var.e);
                dsCellMiddleTitle4.setSubtitle(w140Var.f);
                return Unit.f46060a;
            case 4:
                ((List) obj).getClass();
                v140 v140Var = (v140) cpVar.u();
                nrx nrxVar3 = (nrx) cpVar.u;
                nrxVar3.c.setIconResource(v140Var.d);
                nrxVar3.c.setBadgeVisible(v140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle5 = nrxVar3.d;
                dsCellMiddleTitle5.setTitle(v140Var.e);
                dsCellMiddleTitle5.setSubtitle(v140Var.f);
                DsCellRightBanner dsCellRightBanner3 = nrxVar3.b;
                List list2 = u0d.f34849a;
                Context context2 = dsCellRightBanner3.getContext();
                context2.getClass();
                u0d.s(context2, v140Var.g, null, null, null, new k9(dsCellRightBanner3, (byte) 2), new k9(dsCellRightBanner3, (byte) 3), 14);
                return Unit.f46060a;
            case 5:
                ((List) obj).getClass();
                x140 x140Var = (x140) cpVar.u();
                prx prxVar = (prx) cpVar.u;
                DsCellLeftIcon dsCellLeftIcon2 = prxVar.c;
                TypedValue typedValue = j5d.f15927a;
                Context context3 = cpVar.w;
                dsCellLeftIcon2.setIconTint(j5d.a(context3, R.attr.uikitSecondary, false));
                DsCellLeftIcon dsCellLeftIcon3 = prxVar.c;
                dsCellLeftIcon3.setIconResource(R.drawable.sport_new);
                dsCellLeftIcon3.m(x140Var.f, x140Var.e, Integer.valueOf(j5d.a(context3, R.attr.uikitStaticWhite, false)), Integer.valueOf(j5d.a(context3, R.attr.uikitBackground, false)), Integer.valueOf(R.drawable.sport_new), Integer.valueOf(j5d.a(context3, R.attr.uikitSecondary, false)));
                dsCellLeftIcon3.setBadgeVisible(x140Var.f40102a);
                DsCellMiddleTitle dsCellMiddleTitle6 = prxVar.d;
                dsCellMiddleTitle6.setTitle(x140Var.g);
                dsCellMiddleTitle6.setSubtitle(x140Var.h);
                DsCellRightBanner dsCellRightBanner4 = prxVar.b;
                dsCellRightBanner4.setImageDrawable(null);
                List list3 = u0d.f34849a;
                Context context4 = dsCellRightBanner4.getContext();
                context4.getClass();
                u0d.s(context4, x140Var.i, null, null, null, new k9(dsCellRightBanner4, (byte) 4), new k9(dsCellRightBanner4, (byte) 5), 14);
                return Unit.f46060a;
            case 6:
                ((List) obj).getClass();
                a240 a240Var = (a240) cpVar.u();
                qrx qrxVar = (qrx) cpVar.u;
                qrxVar.c.setIconResource(a240Var.d);
                qrxVar.c.setBadgeVisible(a240Var.b);
                DsCellMiddleTitle dsCellMiddleTitle7 = qrxVar.d;
                dsCellMiddleTitle7.setTitle(a240Var.e);
                dsCellMiddleTitle7.setSubtitle(a240Var.f);
                qrxVar.b.setCount(Integer.valueOf(a240Var.g));
                return Unit.f46060a;
            case 7:
                ((List) obj).getClass();
                b240 b240Var = (b240) cpVar.u();
                nrx nrxVar4 = (nrx) cpVar.u;
                nrxVar4.c.setIconResource(b240Var.d);
                nrxVar4.c.setBadgeVisible(b240Var.b);
                DsCellMiddleTitle dsCellMiddleTitle8 = nrxVar4.d;
                dsCellMiddleTitle8.setTitle(b240Var.e);
                dsCellMiddleTitle8.setSubtitle(b240Var.f);
                DsCellRightBanner dsCellRightBanner5 = nrxVar4.b;
                List list4 = u0d.f34849a;
                Context context5 = dsCellRightBanner5.getContext();
                context5.getClass();
                u0d.s(context5, b240Var.g, null, null, null, new k9(dsCellRightBanner5, (byte) 6), new k9(dsCellRightBanner5, (byte) 7), 14);
                return Unit.f46060a;
            case 8:
                ((List) obj).getClass();
                yfu0 yfu0Var = cpVar.u;
                hxm0.w(((rrx) yfu0Var).b);
                rrx rrxVar = (rrx) yfu0Var;
                rrxVar.b.o(R.drawable.ic_glyph_planet, null, null, ((d240) cpVar.u()).f);
                rrxVar.b.setBadgeVisible(((d240) cpVar.u()).f5339a);
                rrxVar.c.setTitle(((d240) cpVar.u()).g);
                return Unit.f46060a;
            case 9:
                ((List) obj).getClass();
                cc ccVar = (cc) cpVar.u();
                krx krxVar = (krx) cpVar.u;
                krxVar.c.setIconResource(ccVar.b);
                krxVar.d.setTitle(ccVar.c);
                DsCellRightAccordion dsCellRightAccordion = krxVar.b;
                boolean z = ccVar.d;
                int i7 = DsAccordion.c;
                dsCellRightAccordion.setExpanded(z);
                return Unit.f46060a;
            case 10:
                Float fValueOf = Float.valueOf(0.0f);
                Float fValueOf2 = Float.valueOf(8.0f);
                ((List) obj).getClass();
                fux fuxVar = (fux) cpVar.u;
                TextView textView = fuxVar.c;
                View view = fuxVar.d;
                ImageView imageView = fuxVar.b;
                Context context6 = cpVar.w;
                int iOrdinal = ((li) cpVar.u()).f20081a.ordinal();
                if (iOrdinal == 0) {
                    i6 = R.string.show_all_markets;
                } else if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                textView.setText(context6.getText(i6));
                int iOrdinal2 = ((li) cpVar.u()).f20081a.ordinal();
                if (iOrdinal2 != 0) {
                    i = 1;
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    i2 = R.drawable.ic_refresh_markets_settings;
                } else {
                    i = 1;
                    i2 = R.drawable.ic_password_visible;
                }
                imageView.setImageResource(i2);
                int iOrdinal3 = ((li) cpVar.u()).f20081a.ordinal();
                if (iOrdinal3 == 0) {
                    TypedValue typedValue2 = j5d.f15927a;
                    textView.setTextColor(j5d.a(context6, R.attr.uikitTextPrimary, false));
                    imageView.setColorFilter(j5d.a(context6, R.attr.uikitPrimary, false));
                    view.setVisibility(0);
                    LinearLayout linearLayout = fuxVar.f10187a;
                    linearLayout.getClass();
                    sj3.M0(linearLayout, fValueOf, fValueOf, 5);
                } else {
                    if (iOrdinal3 != i) {
                        t9f.b();
                        return null;
                    }
                    TypedValue typedValue3 = j5d.f15927a;
                    textView.setTextColor(context6.getColor(R.color.static_red));
                    imageView.setColorFilter(context6.getColor(R.color.static_red));
                    view.setVisibility(8);
                    LinearLayout linearLayout2 = fuxVar.f10187a;
                    linearLayout2.getClass();
                    sj3.M0(linearLayout2, fValueOf2, fValueOf2, 5);
                }
                return Unit.f46060a;
            case 11:
                Float fValueOf3 = Float.valueOf(0.0f);
                Float fValueOf4 = Float.valueOf(8.0f);
                ((List) obj).getClass();
                gux guxVar = (gux) cpVar.u;
                TextView textView2 = guxVar.c;
                View view2 = guxVar.d;
                ImageView imageView2 = guxVar.b;
                Context context7 = cpVar.w;
                int iOrdinal4 = ((mi) cpVar.u()).f21821a.ordinal();
                if (iOrdinal4 == 0) {
                    i6 = R.string.show_all_markets;
                } else if (iOrdinal4 != 1) {
                    t9f.b();
                    return null;
                }
                textView2.setText(context7.getText(i6));
                int iOrdinal5 = ((mi) cpVar.u()).f21821a.ordinal();
                if (iOrdinal5 != 0) {
                    i3 = 1;
                    if (iOrdinal5 != 1) {
                        t9f.b();
                        return null;
                    }
                    i4 = R.drawable.ic_refresh_markets_settings;
                } else {
                    i3 = 1;
                    i4 = R.drawable.ic_password_visible;
                }
                imageView2.setImageResource(i4);
                int iOrdinal6 = ((mi) cpVar.u()).f21821a.ordinal();
                if (iOrdinal6 == 0) {
                    TypedValue typedValue4 = j5d.f15927a;
                    textView2.setTextColor(j5d.a(context7, R.attr.uikitTextPrimary, false));
                    imageView2.setColorFilter(j5d.a(context7, R.attr.uikitPrimary, false));
                    view2.setVisibility(0);
                    LinearLayout linearLayout3 = guxVar.f11952a;
                    linearLayout3.getClass();
                    sj3.M0(linearLayout3, fValueOf3, fValueOf3, 5);
                } else {
                    if (iOrdinal6 != i3) {
                        t9f.b();
                        return null;
                    }
                    TypedValue typedValue5 = j5d.f15927a;
                    textView2.setTextColor(context7.getColor(R.color.static_red));
                    imageView2.setColorFilter(context7.getColor(R.color.static_red));
                    view2.setVisibility(8);
                    LinearLayout linearLayout4 = guxVar.f11952a;
                    linearLayout4.getClass();
                    sj3.M0(linearLayout4, fValueOf4, fValueOf4, 5);
                }
                return Unit.f46060a;
            case 12:
                ((List) obj).getClass();
                tp10 tp10Var = (tp10) cpVar.u;
                tp10Var.c.setImageResource(((fl) cpVar.u()).e);
                DsCellMiddleTitle dsCellMiddleTitle9 = tp10Var.b;
                dsCellMiddleTitle9.setTitle(((fl) cpVar.u()).c);
                dsCellMiddleTitle9.setSubtitle(((fl) cpVar.u()).d);
                DsSettingsCell dsSettingsCell = tp10Var.f34310a;
                dsSettingsCell.setFirst(true);
                dsSettingsCell.setLast(true);
                return Unit.f46060a;
            case 13:
                ((List) obj).getClass();
                yfu0 yfu0Var2 = cpVar.u;
                TextView textView3 = ((yt) yfu0Var2).c;
                Context context8 = cpVar.w;
                textView3.setText(context8.getText(((xt) cpVar.u()).b));
                ((yt) yfu0Var2).b.setImageDrawable(epv0.U(((xt) cpVar.u()).c, context8));
                return Unit.f46060a;
            case 14:
                ((List) obj).getClass();
                yfu0 yfu0Var3 = cpVar.u;
                ((vrx) yfu0Var3).f37923a.setTitle(((c240) cpVar.u()).g);
                ((vrx) yfu0Var3).f37923a.setImageUrl(((c240) cpVar.u()).f);
                return Unit.f46060a;
            case 15:
                ((List) obj).getClass();
                yfu0 yfu0Var4 = cpVar.u;
                ((wrx) yfu0Var4).f39668a.setTitle(((c240) cpVar.u()).g);
                wrx wrxVar = (wrx) yfu0Var4;
                wrxVar.f39668a.setSubtitle(((c240) cpVar.u()).h);
                wrxVar.f39668a.setImageUrl(((c240) cpVar.u()).f);
                return Unit.f46060a;
            case 16:
                ((List) obj).getClass();
                Object objU = cpVar.u();
                Context context9 = cpVar.w;
                ap2 ap2Var = (ap2) objU;
                List list5 = u0d.f34849a;
                xyv xyvVar = (xyv) cpVar.u;
                ImageView imageView3 = xyvVar.d;
                FrameLayout frameLayout = xyvVar.c;
                FrameLayout frameLayout2 = xyvVar.b;
                TextView textView4 = xyvVar.l;
                TextView textView5 = xyvVar.h;
                TextView textView6 = xyvVar.m;
                TextView textView7 = xyvVar.g;
                long j = ap2Var.f1229a;
                int i8 = ap2Var.r;
                String string2 = "";
                if (j != 0) {
                    bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                    rz4.s(j, ".svg", bzuVarD);
                    string = ((StringBuilder) bzuVarD.b).toString();
                } else {
                    string = "";
                }
                u0d.k(imageView3, string);
                textView7.setText(ap2Var.e);
                if (((ap2) cpVar.u()).n) {
                    xyvVar.k.setText(((ap2) cpVar.u()).o);
                    textView6.setText(((ap2) cpVar.u()).p);
                    textView6.setVisibility(((ap2) cpVar.u()).q ? 0 : 8);
                }
                textView5.setText(ap2Var.h);
                textView4.setText(ap2Var.k);
                u0d.n(xyvVar.e, ap2Var.i, 0, 11);
                u0d.n(xyvVar.f, ap2Var.l, 0, 11);
                int i9 = ap2Var.s;
                if (i9 != 1) {
                    i5 = 2;
                    if (i9 == 2) {
                        i9 = 2;
                    }
                } else {
                    i5 = 2;
                    i9 = 1;
                }
                if (i9 == 1) {
                    frameLayout2.setVisibility(0);
                    frameLayout.setVisibility(8);
                    TextView textView8 = xyvVar.i;
                    if (i8 == 1) {
                        string2 = context9.getString(R.string.team_first);
                        string2.getClass();
                    } else if (i8 == 2) {
                        string2 = context9.getString(R.string.team_sec);
                        string2.getClass();
                    }
                    textView8.setText(string2);
                } else if (i9 == i5) {
                    frameLayout2.setVisibility(8);
                    frameLayout.setVisibility(0);
                    TextView textView9 = xyvVar.j;
                    if (i8 == 1) {
                        string2 = context9.getString(R.string.team_first);
                        string2.getClass();
                    } else if (i8 == i5) {
                        string2 = context9.getString(R.string.team_sec);
                        string2.getClass();
                    }
                    textView9.setText(string2);
                }
                if (cy7.c()) {
                    cy7.b(textView7, 8388611, 8388613);
                    cy7.b(textView5, 8388611, 8388613);
                    cy7.b(textView4, 8388613, 8388611);
                }
                return Unit.f46060a;
            case 17:
                ((List) obj).getClass();
                TextView textView10 = ((myx) cpVar.u).b;
                cpVar.u();
                throw new ClassCastException();
            case 18:
                ((List) obj).getClass();
                ((asx) cpVar.u).b.setText(((ho3) cpVar.u()).f13374a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((List) obj).getClass();
                List list6 = u0d.f34849a;
                u0d.g(((zzj) cpVar.u).c, ((m14) cpVar.u()).f20986a, kotlin.collections.a.c(g2x.f10583a), null, 4);
                return Unit.f46060a;
            case 20:
                ((List) obj).getClass();
                yfu0 yfu0Var5 = cpVar.u;
                Context context10 = cpVar.w;
                ((bsx) yfu0Var5).b.setIconResource(((v54) cpVar.u()).c);
                bsx bsxVar = (bsx) yfu0Var5;
                DsCellMiddleTitle dsCellMiddleTitle10 = bsxVar.c;
                DsCellLeftIcon dsCellLeftIcon4 = bsxVar.b;
                dsCellMiddleTitle10.setTitle(((v54) cpVar.u()).f36811a);
                if (((v54) cpVar.u()).d == 48) {
                    int dimensionPixelSize = context10.getResources().getDimensionPixelSize(R.dimen.space_4);
                    dsCellLeftIcon4.setBackground(context10.getDrawable(R.drawable.circle_background));
                    jmu0.j(dsCellLeftIcon4, ColorStateList.valueOf(m5d.b(R.attr.uikitPrimary, context10)));
                    dsCellLeftIcon4.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                } else {
                    jmu0.j(dsCellLeftIcon4, ColorStateList.valueOf(m5d.b(R.attr.uikitStaticTransparent, context10)));
                    dsCellLeftIcon4.setPadding(0, 0, 0, 0);
                }
                bsxVar.e.setVisibility(!((v54) cpVar.u()).b ? 0 : 8);
                return Unit.f46060a;
            case 21:
                ((List) obj).getClass();
                g140 g140Var = (g140) cpVar.u();
                lrx lrxVar = (lrx) cpVar.u;
                lrxVar.b.setIconResource(g140Var.d);
                lrxVar.b.setBadgeVisible(g140Var.b);
                DsCellMiddleTitle dsCellMiddleTitle11 = lrxVar.c;
                dsCellMiddleTitle11.setTitle(g140Var.e);
                if (g140Var.h) {
                    idx.R(dsCellMiddleTitle11, cpVar.w, g140Var);
                } else {
                    dsCellMiddleTitle11.setSubtitle(g140Var.f);
                }
                return Unit.f46060a;
            case 22:
                ((List) obj).getClass();
                yfu0 yfu0Var6 = cpVar.u;
                ((gtx) yfu0Var6).b.setIconResource(((g140) cpVar.u()).d);
                gtx gtxVar = (gtx) yfu0Var6;
                gtxVar.b.setTitle(((g140) cpVar.u()).e);
                DsMenuCompactCell dsMenuCompactCell = gtxVar.b;
                dsMenuCompactCell.setBadgeVisible(((g140) cpVar.u()).b);
                if (((g140) cpVar.u()).h) {
                    Context context11 = cpVar.w;
                    g140 g140Var2 = (g140) cpVar.u();
                    Drawable drawable = context11.getDrawable(g140Var2.g);
                    int dimensionPixelOffset = context11.getResources().getDimensionPixelOffset(R.dimen.space_14);
                    if (drawable != null) {
                        drawable.setBounds(0, 0, dimensionPixelOffset, dimensionPixelOffset);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Separators.SP);
                    if (drawable != null) {
                        spannableStringBuilder.setSpan(new abb(drawable), 0, 1, 17);
                    }
                    spannableStringBuilder.append((CharSequence) Separators.SP);
                    spannableStringBuilder.append((CharSequence) g140Var2.f);
                    dsMenuCompactCell.setSubTitle(spannableStringBuilder);
                } else {
                    dsMenuCompactCell.setSubTitle(((g140) cpVar.u()).f);
                }
                return Unit.f46060a;
            case 23:
                ((List) obj).getClass();
                yfu0 yfu0Var7 = cpVar.u;
                ((itx) yfu0Var7).b.setIconResource(((g140) cpVar.u()).d);
                itx itxVar = (itx) yfu0Var7;
                itxVar.b.setTitle(((g140) cpVar.u()).e);
                itxVar.b.setBadgeVisible(((g140) cpVar.u()).b);
                return Unit.f46060a;
            case 24:
                ((List) obj).getClass();
                DsCellLeftIcon dsCellLeftIcon5 = ((bwx) cpVar.u).b;
                cpVar.u();
                throw new ClassCastException();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((List) obj).getClass();
                g140 g140Var3 = (g140) cpVar.u();
                zvx zvxVar = (zvx) cpVar.u;
                zvxVar.b.setIconResource(g140Var3.d);
                zvxVar.b.setBadgeVisible(g140Var3.b);
                DsCellMiddleTitle dsCellMiddleTitle12 = zvxVar.c;
                dsCellMiddleTitle12.setTitle(g140Var3.e);
                if (g140Var3.h) {
                    idx.R(dsCellMiddleTitle12, cpVar.w, g140Var3);
                } else {
                    dsCellMiddleTitle12.setSubtitle(g140Var3.f);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((List) obj).getClass();
                g140 g140Var4 = (g140) cpVar.u();
                bwx bwxVar = (bwx) cpVar.u;
                bwxVar.b.setIconResource(g140Var4.d);
                bwxVar.b.setBadgeVisible(g140Var4.b);
                DsCellMiddleTitle dsCellMiddleTitle13 = bwxVar.c;
                dsCellMiddleTitle13.setTitle(g140Var4.e);
                if (g140Var4.h) {
                    idx.R(dsCellMiddleTitle13, cpVar.w, g140Var4);
                } else {
                    dsCellMiddleTitle13.setSubtitle(g140Var4.f);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((List) obj).getClass();
                yfu0 yfu0Var8 = cpVar.u;
                ((csx) yfu0Var8).b.setBadgeVisible(((h140) cpVar.u()).f12264a);
                csx csxVar = (csx) yfu0Var8;
                csxVar.b.o(((h140) cpVar.u()).e, null, null, ((h140) cpVar.u()).d);
                DsCellMiddleTitle dsCellMiddleTitle14 = csxVar.c;
                dsCellMiddleTitle14.setTitle(((h140) cpVar.u()).f);
                dsCellMiddleTitle14.setSubtitle(((h140) cpVar.u()).g);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((List) obj).getClass();
                yfu0 yfu0Var9 = cpVar.u;
                ((fsx) yfu0Var9).b.setBadgeVisible(((h140) cpVar.u()).f12264a);
                fsx fsxVar = (fsx) yfu0Var9;
                fsxVar.b.o(((h140) cpVar.u()).e, null, null, ((h140) cpVar.u()).d);
                DsCellMiddleTitle dsCellMiddleTitle15 = fsxVar.c;
                dsCellMiddleTitle15.setTitle(((h140) cpVar.u()).f);
                dsCellMiddleTitle15.setSubtitle(((h140) cpVar.u()).g);
                return Unit.f46060a;
            default:
                ((List) obj).getClass();
                yfu0 yfu0Var10 = cpVar.u;
                ((esx) yfu0Var10).b.setBadgeVisible(((h140) cpVar.u()).f12264a);
                esx esxVar = (esx) yfu0Var10;
                DsCellLeftIcon dsCellLeftIcon6 = esxVar.b;
                String str = ((h140) cpVar.u()).d;
                int i10 = ((h140) cpVar.u()).e;
                TypedValue typedValue6 = j5d.f15927a;
                Context context12 = cpVar.w;
                Integer numValueOf = Integer.valueOf(j5d.a(context12, R.attr.uikitStaticWhite, false));
                dsCellLeftIcon6.o(i10, numValueOf, Integer.valueOf(j5d.a(context12, R.attr.uikitStaticWhite, false)), str);
                DsCellMiddleTitle dsCellMiddleTitle16 = esxVar.c;
                dsCellMiddleTitle16.setTitle(((h140) cpVar.u()).f);
                dsCellMiddleTitle16.setSubtitle(((h140) cpVar.u()).g);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ j9(cp cpVar, byte b) {
        this.f16112a = b;
        this.b = cpVar;
    }
}
