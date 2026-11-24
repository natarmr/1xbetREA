package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.chip.Chip;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.championships.regular.presentation.world_cup.tournament_info.ExpandableTextView;
import org.xplatform.ui_core.GradientTextView;
import org.xplatform.ui_core.resources.UiText;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;
import org.xplatform.uikit.components.accordion.DsAccordion;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.cells.right.DsCellRightBanner;
import org.xplatform.uikit.components.cells.right.DsCellRightRadioButton;
import org.xplatform.uikit.components.password_requirement.DsBulletList;
import org.xplatform.uikit.components.views.LoadableImageView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kzi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19156a;
    public final /* synthetic */ cp b;

    public /* synthetic */ kzi0(t9f t9fVar, cp cpVar) {
        this.f19156a = (byte) 25;
        this.b = cpVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        byte b = this.f19156a;
        boolean z = true;
        z = true;
        final byte b2 = 0;
        final cp cpVar = this.b;
        switch (b) {
            case 0:
                ((List) obj).getClass();
                hxx hxxVar = (hxx) cpVar.u;
                hxxVar.e.setTitle(((hzi0) cpVar.u()).b);
                hxxVar.e.setSubtitle(((hzi0) cpVar.u()).f13908a);
                DsCellLeftIcon dsCellLeftIcon = hxxVar.d;
                dsCellLeftIcon.setIconResource(R.drawable.glyph_exclamation);
                DsCellRightBanner dsCellRightBanner = hxxVar.c;
                dsCellRightBanner.setImageResource(R.drawable.banner_time);
                return Unit.f46060a;
            case 1:
                ((List) obj).getClass();
                ((cux) cpVar.u).f5007a.setLast(true);
                return Unit.f46060a;
            case 2:
                ((List) obj).getClass();
                if (((mv00) cpVar.u()).f22436a) {
                    ((fwx) cpVar.u).f10282a.setLast(true);
                }
                return Unit.f46060a;
            case 3:
                ((List) obj).getClass();
                boolean z2 = ((m2j0) cpVar.u()).f21063a;
                h2j0 h2j0Var = (h2j0) cpVar.u;
                ((DsCellRightRadioButton) h2j0Var.d.d).setSelected(z2);
                dc3 dc3Var = h2j0Var.d;
                DsSettingsCell dsSettingsCell = (DsSettingsCell) dc3Var.e;
                dsSettingsCell.setSelected(z2);
                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) dc3Var.c;
                dsCellMiddleTitle.setTitle(R.string.coef_change_confirm_request);
                dsSettingsCell.setFirst(true);
                dsSettingsCell.setLast(false);
                dsCellMiddleTitle.setTitleTextColor(x8x.n(cpVar, z2));
                boolean z3 = ((m2j0) cpVar.u()).b;
                dc3 dc3Var2 = h2j0Var.b;
                ((DsCellRightRadioButton) dc3Var2.d).setSelected(z3);
                ((DsSettingsCell) dc3Var2.e).setSelected(z3);
                DsCellMiddleTitle dsCellMiddleTitle2 = (DsCellMiddleTitle) dc3Var2.c;
                dsCellMiddleTitle2.setTitle(R.string.coef_change_confirm_any);
                dsCellMiddleTitle2.setTitleTextColor(x8x.n(cpVar, z3));
                boolean z4 = ((m2j0) cpVar.u()).c;
                dc3 dc3Var3 = h2j0Var.c;
                ((DsCellRightRadioButton) dc3Var3.d).setSelected(z4);
                DsSettingsCell dsSettingsCell2 = (DsSettingsCell) dc3Var3.e;
                dsSettingsCell2.setSelected(z4);
                DsCellMiddleTitle dsCellMiddleTitle3 = (DsCellMiddleTitle) dc3Var3.c;
                dsCellMiddleTitle3.setTitle(R.string.coef_change_confirm_raise);
                dsSettingsCell2.setFirst(false);
                dsSettingsCell2.setLast(true);
                dsCellMiddleTitle3.setTitleTextColor(x8x.n(cpVar, z4));
                return Unit.f46060a;
            case 4:
                ((List) obj).getClass();
                yfu0 yfu0Var = cpVar.u;
                ((cdu0) yfu0Var).b.setModel(new nrv(((qjj0) cpVar.u()).f28843a, false, null, null, null, null, null, 254));
                cdu0 cdu0Var = (cdu0) yfu0Var;
                FrameLayout frameLayout = cdu0Var.f4181a;
                frameLayout.getClass();
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if (layoutParams == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                Resources resources = cdu0Var.f4181a.getContext().getResources();
                layoutParams.height = resources.getDimensionPixelSize(R.dimen.size_42);
                frameLayout.setLayoutParams(layoutParams);
                return Unit.f46060a;
            case 5:
                ((List) obj).getClass();
                yfu0 yfu0Var2 = cpVar.u;
                View view = ((edu0) yfu0Var2).f7637a;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    hny.u("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return null;
                }
                Resources resources2 = ((edu0) yfu0Var2).f7637a.getContext().getResources();
                layoutParams2.height = resources2.getDimensionPixelSize(R.dimen.size_50);
                view.setLayoutParams(layoutParams2);
                return Unit.f46060a;
            case 6:
                ((List) obj).getClass();
                yfu0 yfu0Var3 = cpVar.u;
                TextView textView = ((v7z) yfu0Var3).d;
                UiText.ByRes byRes = new UiText.ByRes(R.string.referral_user_id, ((dpe0) cpVar.u()).b);
                v7z v7zVar = (v7z) yfu0Var3;
                Context context = v7zVar.f36954a.getContext();
                context.getClass();
                textView.setText(byRes.a(context));
                TextView textView2 = v7zVar.b;
                UiText.ByRes byRes2 = new UiText.ByRes(R.string.network_count_v2, ((dpe0) cpVar.u()).f);
                ConstraintLayout constraintLayout = v7zVar.f36954a;
                Context context2 = constraintLayout.getContext();
                context2.getClass();
                textView2.setText(byRes2.a(context2));
                TextView textView3 = v7zVar.c;
                textView3.setText(((dpe0) cpVar.u()).d);
                TypedValue typedValue = j5d.f15927a;
                Context context3 = constraintLayout.getContext();
                context3.getClass();
                textView3.setTextColor(context3.getColor(((dpe0) cpVar.u()).e));
                return Unit.f46060a;
            case 7:
                ((List) obj).getClass();
                yfu0 yfu0Var4 = cpVar.u;
                ((sxx) yfu0Var4).f33000a.setLongTitleVisible(((aaj0) cpVar.u()).c);
                ((sxx) yfu0Var4).f33000a.setTitleVisible(!((aaj0) cpVar.u()).c);
                return Unit.f46060a;
            case 8:
                ((List) obj).getClass();
                yfu0 yfu0Var5 = cpVar.u;
                ((rok0) yfu0Var5).d.setTitle(((pwk0) cpVar.u()).b);
                final rok0 rok0Var = (rok0) yfu0Var5;
                rok0Var.b.setImageDrawable(null);
                hxm0.w(rok0Var.b);
                DsCellLeftIcon dsCellLeftIcon2 = rok0Var.c;
                dsCellLeftIcon2.setBackgroundDrawableRes(R.drawable.circle_background);
                View view2 = cpVar.f40887a;
                Context context4 = view2.getContext();
                context4.getClass();
                jmu0.j(dsCellLeftIcon2, ColorStateList.valueOf(m5d.b(R.attr.uikitBackground, context4)));
                dsCellLeftIcon2.setImageResource(R.drawable.sport_new);
                TypedValue typedValue2 = j5d.f15927a;
                Context context5 = view2.getContext();
                context5.getClass();
                dsCellLeftIcon2.setIconTint(j5d.a(context5, R.attr.uikitSecondary, false));
                Context context6 = view2.getContext();
                List list = u0d.f34849a;
                context6.getClass();
                String str = ((pwk0) cpVar.u()).d;
                Function1 function1 = new Function1() { // from class: a.qwk0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b3 = b2;
                        cp cpVar2 = cpVar;
                        rok0 rok0Var2 = rok0Var;
                        switch (b3) {
                            case 0:
                                Drawable drawable = (Drawable) obj2;
                                if (drawable != null) {
                                    rok0Var2.c.setBackgroundWithDrawable(drawable);
                                    rok0Var2.c.setIconTint(((pwk0) cpVar2.u()).f);
                                }
                                break;
                            case 1:
                                LoadableImageView.h(rok0Var2.c, ((pwk0) cpVar2.u()).c, null, 14);
                                break;
                            default:
                                Drawable drawable2 = (Drawable) obj2;
                                if (drawable2 != null) {
                                    rok0Var2.c.setImageDrawable(drawable2);
                                    rok0Var2.c.setIconTint(((pwk0) cpVar2.u()).f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                final byte b3 = z ? (byte) 1 : (byte) 0;
                u0d.s(context6, str, null, null, null, function1, new Function1() { // from class: a.qwk0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b4 = b3;
                        cp cpVar2 = cpVar;
                        rok0 rok0Var2 = rok0Var;
                        switch (b4) {
                            case 0:
                                Drawable drawable = (Drawable) obj2;
                                if (drawable != null) {
                                    rok0Var2.c.setBackgroundWithDrawable(drawable);
                                    rok0Var2.c.setIconTint(((pwk0) cpVar2.u()).f);
                                }
                                break;
                            case 1:
                                LoadableImageView.h(rok0Var2.c, ((pwk0) cpVar2.u()).c, null, 14);
                                break;
                            default:
                                Drawable drawable2 = (Drawable) obj2;
                                if (drawable2 != null) {
                                    rok0Var2.c.setImageDrawable(drawable2);
                                    rok0Var2.c.setIconTint(((pwk0) cpVar2.u()).f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, 14);
                final byte b4 = 2;
                u0d.s(context6, ((pwk0) cpVar.u()).c, Integer.valueOf(context6.getResources().getDimensionPixelSize(R.dimen.size_24)), null, null, new Function1() { // from class: a.qwk0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b5 = b4;
                        cp cpVar2 = cpVar;
                        rok0 rok0Var2 = rok0Var;
                        switch (b5) {
                            case 0:
                                Drawable drawable = (Drawable) obj2;
                                if (drawable != null) {
                                    rok0Var2.c.setBackgroundWithDrawable(drawable);
                                    rok0Var2.c.setIconTint(((pwk0) cpVar2.u()).f);
                                }
                                break;
                            case 1:
                                LoadableImageView.h(rok0Var2.c, ((pwk0) cpVar2.u()).c, null, 14);
                                break;
                            default:
                                Drawable drawable2 = (Drawable) obj2;
                                if (drawable2 != null) {
                                    rok0Var2.c.setImageDrawable(drawable2);
                                    rok0Var2.c.setIconTint(((pwk0) cpVar2.u()).f);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, null, 44);
                u0d.s(context6, ((pwk0) cpVar.u()).e, null, null, null, new rai0(rok0Var, (byte) 29), null, 46);
                return Unit.f46060a;
            case 9:
                ((List) obj).getClass();
                x140 x140Var = (x140) cpVar.u();
                wxx wxxVar = (wxx) cpVar.u;
                DsCellLeftIcon dsCellLeftIcon3 = wxxVar.c;
                TypedValue typedValue3 = j5d.f15927a;
                Context context7 = cpVar.w;
                dsCellLeftIcon3.setIconTint(j5d.a(context7, R.attr.uikitSecondary, false));
                DsCellLeftIcon dsCellLeftIcon4 = wxxVar.c;
                dsCellLeftIcon4.setIconResource(R.drawable.sport_new);
                dsCellLeftIcon4.m(x140Var.f, x140Var.e, Integer.valueOf(j5d.a(context7, R.attr.uikitStaticWhite, false)), Integer.valueOf(j5d.a(context7, R.attr.uikitBackground, false)), Integer.valueOf(R.drawable.sport_new), Integer.valueOf(j5d.a(context7, R.attr.uikitSecondary, false)));
                dsCellLeftIcon4.setBadgeVisible(x140Var.f40102a);
                DsCellMiddleTitle dsCellMiddleTitle4 = wxxVar.d;
                dsCellMiddleTitle4.setTitle(x140Var.g);
                dsCellMiddleTitle4.setSubtitle(x140Var.h);
                DsCellRightBanner dsCellRightBanner2 = wxxVar.b;
                dsCellRightBanner2.setImageDrawable(null);
                List list2 = u0d.f34849a;
                Context context8 = dsCellRightBanner2.getContext();
                context8.getClass();
                u0d.s(context8, x140Var.i, null, null, null, new k9(dsCellRightBanner2, (byte) 14), new k9(dsCellRightBanner2, (byte) 15), 14);
                return Unit.f46060a;
            case 10:
                ((List) obj).getClass();
                cpVar.f40887a.setClickable(!((p3l0) cpVar.u()).c);
                Chip chip = ((ds6) cpVar.u).b;
                chip.setText(((p3l0) cpVar.u()).b);
                chip.setChecked(((p3l0) cpVar.u()).c);
                return Unit.f46060a;
            case 11:
                ((List) obj).getClass();
                List list3 = u0d.f34849a;
                yfu0 yfu0Var6 = cpVar.u;
                u0d.j(((zth) yfu0Var6).c, ((cqm0) cpVar.u()).b, R.drawable.plug_news, 0, null, null, null, 508);
                zth zthVar = (zth) yfu0Var6;
                auh auhVar = zthVar.b;
                TextView textView4 = zthVar.d;
                auhVar.b.setVisibility(((cqm0) cpVar.u()).k ? 0 : 8);
                zthVar.e.setText(((cqm0) cpVar.u()).c);
                textView4.setText(((cqm0) cpVar.u()).d);
                textView4.setVisibility(((cqm0) cpVar.u()).d.length() > 0 ? 0 : 8);
                return Unit.f46060a;
            case 12:
                ((List) obj).getClass();
                ((iyx) cpVar.u).b.setText(((uxm0) cpVar.u()).b);
                return Unit.f46060a;
            case 13:
                ((List) obj).getClass();
                yfu0 yfu0Var7 = cpVar.u;
                ((itx) yfu0Var7).b.setIconResource(((a240) cpVar.u()).d);
                itx itxVar = (itx) yfu0Var7;
                itxVar.b.setTitle(((a240) cpVar.u()).e);
                DsMenuCompactCell dsMenuCompactCell = itxVar.b;
                dsMenuCompactCell.setSubTitle(((a240) cpVar.u()).f);
                dsMenuCompactCell.setBadgeVisible(((a240) cpVar.u()).b);
                dsMenuCompactCell.setCounter(((a240) cpVar.u()).g > 0 ? Integer.valueOf(((a240) cpVar.u()).g) : null);
                return Unit.f46060a;
            case 14:
                ((List) obj).getClass();
                yfu0 yfu0Var8 = cpVar.u;
                ((kwx) yfu0Var8).c.setIconResource(((a240) cpVar.u()).d);
                kwx kwxVar = (kwx) yfu0Var8;
                kwxVar.c.setBadgeVisible(((a240) cpVar.u()).b);
                DsCellMiddleTitle dsCellMiddleTitle5 = kwxVar.d;
                dsCellMiddleTitle5.setTitle(((a240) cpVar.u()).e);
                dsCellMiddleTitle5.setSubtitle(((a240) cpVar.u()).f);
                kwxVar.b.setCount(Integer.valueOf(((a240) cpVar.u()).g));
                return Unit.f46060a;
            case 15:
                ((List) obj).getClass();
                ((b3k) cpVar.u).b.setText(((z9o0) cpVar.u()).b);
                return Unit.f46060a;
            case 16:
                ((List) obj).getClass();
                yfu0 yfu0Var9 = cpVar.u;
                ((xrx) yfu0Var9).b.setBadgeVisible(((w140) cpVar.u()).b);
                xrx xrxVar = (xrx) yfu0Var9;
                xrxVar.b.setIconResource(((w140) cpVar.u()).d);
                DsCellMiddleTitle dsCellMiddleTitle6 = xrxVar.c;
                dsCellMiddleTitle6.setTitle(((w140) cpVar.u()).e);
                dsCellMiddleTitle6.setSubtitle(((w140) cpVar.u()).f);
                return Unit.f46060a;
            case 17:
                ((List) obj).getClass();
                yfu0 yfu0Var10 = cpVar.u;
                ((mgp0) yfu0Var10).d.setText(((d9a0) cpVar.u()).c);
                List list4 = u0d.f34849a;
                u0d.n(((mgp0) yfu0Var10).b, ((d9a0) cpVar.u()).e, 0, 11);
                return Unit.f46060a;
            case 18:
                ((List) obj).getClass();
                yfu0 yfu0Var11 = cpVar.u;
                FixedSelectionTextView fixedSelectionTextView = ((d3k) yfu0Var11).e;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((lfi0) cpVar.u()).c);
                spannableStringBuilder.append((CharSequence) Separators.SP);
                fixedSelectionTextView.setText(spannableStringBuilder);
                d3k d3kVar = (d3k) yfu0Var11;
                FixedSelectionTextView fixedSelectionTextView2 = d3kVar.e;
                piq piqVar = piq.f27055a;
                if (piqVar == null) {
                    piqVar = new piq();
                    piq.f27055a = piqVar;
                }
                fixedSelectionTextView2.setMovementMethod(piqVar);
                d3kVar.c.setImageResource(((lfi0) cpVar.u()).f);
                d3kVar.b.setVisibility(((lfi0) cpVar.u()).g ? (byte) 0 : (byte) 4);
                TextView textView5 = d3kVar.f;
                rdj rdjVar = rdj.f30294a;
                textView5.setText(rdj.h(new ynq0(((lfi0) cpVar.u()).e.getTime()), ykq0.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(cpVar.f40887a.getContext())), null, 248));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((List) obj).getClass();
                yfu0 yfu0Var12 = cpVar.u;
                ((oyx) yfu0Var12).b.setTitle(((psq0) cpVar.u()).getTitle());
                oyx oyxVar = (oyx) yfu0Var12;
                oyxVar.f26079a.setFirst(((psq0) cpVar.u()).c() == uwx.f36413a || ((psq0) cpVar.u()).c() == uwx.d);
                DsSettingsCell dsSettingsCell3 = oyxVar.f26079a;
                if (((psq0) cpVar.u()).c() != uwx.c && ((psq0) cpVar.u()).c() != uwx.d) {
                    z = false;
                }
                dsSettingsCell3.setLast(z);
                return Unit.f46060a;
            case 20:
                ((List) obj).getClass();
                ((nyx) cpVar.u).b.setLabel(((cc) cpVar.u()).c);
                return Unit.f46060a;
            case 21:
                ((List) obj).getClass();
                List list5 = u0d.f34849a;
                yfu0 yfu0Var13 = cpVar.u;
                u0d.j(((es10) yfu0Var13).b, ((owr0) cpVar.u()).d, 0, 0, null, null, null, 510);
                es10 es10Var = (es10) yfu0Var13;
                es10Var.d.setText(((owr0) cpVar.u()).b);
                es10Var.c.setText(((owr0) cpVar.u()).c);
                return Unit.f46060a;
            case 22:
                ((List) obj).getClass();
                gs10 gs10Var = (gs10) cpVar.u;
                gs10Var.c.setVisibility(((v1s0) cpVar.u()).b.length() > 0 ? 0 : 8);
                TextView textView6 = gs10Var.f;
                TextView textView7 = gs10Var.j;
                ExpandableTextView expandableTextView = gs10Var.i;
                DsAccordion dsAccordion = gs10Var.d;
                GradientTextView gradientTextView = gs10Var.k;
                textView6.setText(((v1s0) cpVar.u()).b);
                ConstraintLayout constraintLayout2 = gs10Var.m;
                constraintLayout2.setVisibility(8);
                TextView textView8 = gs10Var.h;
                textView8.setText("");
                ConstraintLayout constraintLayout3 = gs10Var.e;
                constraintLayout3.setVisibility(8);
                TextView textView9 = gs10Var.g;
                textView9.setText("");
                gs10Var.l.setVisibility(((v1s0) cpVar.u()).e.length() > 0 ? 0 : 8);
                gradientTextView.setVisibility(((v1s0) cpVar.u()).e.length() > 0 ? 0 : 8);
                gradientTextView.setStartColor(((v1s0) cpVar.u()).g);
                gradientTextView.setEndColor(((v1s0) cpVar.u()).h);
                gradientTextView.setText(((v1s0) cpVar.u()).e);
                dsAccordion.setExpanded(!((v1s0) cpVar.u()).f);
                expandableTextView.setVisibility(((v1s0) cpVar.u()).c.length() > 0 ? 0 : 8);
                textView7.setVisibility(((v1s0) cpVar.u()).d.length() > 0 ? 0 : 8);
                dsAccordion.setVisibility(((v1s0) cpVar.u()).d.length() > 0 ? 0 : 8);
                expandableTextView.setTextWithoutAnimation(((v1s0) cpVar.u()).f ? ((v1s0) cpVar.u()).c : ((v1s0) cpVar.u()).d);
                textView7.setTextColor(((v1s0) cpVar.u()).i);
                return Unit.f46060a;
            case 23:
                ((List) obj).getClass();
                Object objU = cpVar.u();
                yfu0 yfu0Var14 = cpVar.u;
                if (((o5s0) objU).b.length() == 0) {
                    ImageView imageView = ((hs10) yfu0Var14).b;
                    imageView.setImageResource(R.drawable.ic_globe_gray);
                } else {
                    List list6 = u0d.f34849a;
                    u0d.p(((hs10) yfu0Var14).b, ((o5s0) cpVar.u()).b, epv0.U(R.drawable.ic_globe_gray, cpVar.w));
                }
                ((hs10) yfu0Var14).c.setText(((o5s0) cpVar.u()).f24704a);
                return Unit.f46060a;
            case 24:
                ((List) obj).getClass();
                Object objU2 = cpVar.u();
                yfu0 yfu0Var15 = cpVar.u;
                if (((c8s0) objU2).f) {
                    ConstraintLayout constraintLayout4 = ((lnh) yfu0Var15).f20345a;
                    constraintLayout4.getClass();
                    ViewGroup.LayoutParams layoutParams3 = constraintLayout4.getLayoutParams();
                    if (layoutParams3 == null) {
                        hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return null;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams.topMargin = cpVar.w.getResources().getDimensionPixelSize(R.dimen.space_8);
                    constraintLayout4.setLayoutParams(marginLayoutParams);
                }
                lnh lnhVar = (lnh) yfu0Var15;
                TextView textView10 = lnhVar.e;
                TextView textView11 = lnhVar.c;
                textView10.setText(((c8s0) cpVar.u()).c);
                List list7 = u0d.f34849a;
                u0d.j(lnhVar.b, ((c8s0) cpVar.u()).d, R.drawable.empty_team_ic, 0, null, null, null, 508);
                textView11.setTextSize(0, ((c8s0) cpVar.u()).b);
                textView11.setText(((c8s0) cpVar.u()).f3930a);
                lnhVar.d.setText(((c8s0) cpVar.u()).e);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((View) obj).getClass();
                usd usdVar = dsh.V1;
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((List) obj).getClass();
                b240 b240Var = (b240) cpVar.u();
                zvx zvxVar = (zvx) cpVar.u;
                zvxVar.b.setIconResource(b240Var.d);
                zvxVar.b.setBadgeVisible(b240Var.b);
                DsCellMiddleTitle dsCellMiddleTitle7 = zvxVar.c;
                dsCellMiddleTitle7.setTitle(b240Var.e);
                dsCellMiddleTitle7.setSubtitle(b240Var.f);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((List) obj).getClass();
                b240 b240Var2 = (b240) cpVar.u();
                dux duxVar = (dux) cpVar.u;
                duxVar.c.setIconResource(b240Var2.d);
                duxVar.c.setBadgeVisible(b240Var2.b);
                DsCellMiddleTitle dsCellMiddleTitle8 = duxVar.d;
                dsCellMiddleTitle8.setTitle(b240Var2.e);
                dsCellMiddleTitle8.setSubtitle(b240Var2.f);
                DsCellRightBanner dsCellRightBanner3 = duxVar.b;
                List list8 = u0d.f34849a;
                Context context9 = dsCellRightBanner3.getContext();
                context9.getClass();
                u0d.s(context9, b240Var2.g, null, null, null, new k9(dsCellRightBanner3, (byte) 16), new k9(dsCellRightBanner3, (byte) 17), 14);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((List) obj).getClass();
                ((e3k) cpVar.u).b.setText("-------------");
                return Unit.f46060a;
            default:
                ((List) obj).getClass();
                yfu0 yfu0Var16 = cpVar.u;
                ((m6u0) yfu0Var16).c.setTitleText(((r6u0) cpVar.u()).b);
                m6u0 m6u0Var = (m6u0) yfu0Var16;
                m6u0Var.b.setText("");
                DsBulletList dsBulletList = m6u0Var.b;
                dsBulletList.setVisibility(8);
                if (((r6u0) cpVar.u()).c.isEmpty()) {
                    dsBulletList.setVisibility(8);
                } else {
                    dsBulletList.setVisibility(0);
                    dsBulletList.setLabels(((r6u0) cpVar.u()).c);
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kzi0(cp cpVar, byte b) {
        this.f19156a = b;
        this.b = cpVar;
    }
}
