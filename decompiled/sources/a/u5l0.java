package a;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.DsHeader;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u5l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35101a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u5l0(byte b, Object obj, Function1 function1) {
        this.f35101a = b;
        this.c = obj;
        this.b = function1;
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
        byte b = 13;
        byte b2 = 27;
        byte b3 = 18;
        byte b4 = 4;
        byte b5 = 14;
        byte b6 = 2;
        byte b7 = 3;
        byte b8 = 11;
        boolean z = false;
        z = false;
        final byte b9 = 1;
        switch (this.f35101a) {
            case 0:
                Function1 function1 = (Function1) this.b;
                y5l0 y5l0Var = (y5l0) this.c;
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new mqk0(bemVar, y5l0Var.b));
                return Unit.f46060a;
            case 1:
                w2n w2nVar = (w2n) this.c;
                Function1 function2 = (Function1) this.b;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = w2nVar.f38457a;
                hczVar.f(a4xVar.size(), new o3l0(new jak0((byte) 23), a4xVar, (byte) 6), new y9k0(a4xVar, (byte) 9), new ugd(2039820996, true, new njh0(a4xVar, function2, (byte) 10)));
                return Unit.f46060a;
            case 2:
                z2n z2nVar = (z2n) this.c;
                Function1 function3 = (Function1) this.b;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = z2nVar.f43678a;
                hczVar2.f(a4xVar2.size(), new o3l0(new jak0((byte) 24), a4xVar2, (byte) 7), new y9k0(a4xVar2, (byte) 10), new ugd(2039820996, true, new h8w((List) a4xVar2, (Object) z2nVar, function3, (byte) 23)));
                return Unit.f46060a;
            case 3:
                c3n c3nVar = (c3n) this.c;
                Function1 function4 = (Function1) this.b;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar3 = c3nVar.f3685a;
                hczVar3.f(a4xVar3.size(), new o3l0(new jak0((byte) 25), a4xVar3, (byte) 8), new y9k0(a4xVar3, b8), new ugd(2039820996, true, new njh0(a4xVar3, function4, b8)));
                return Unit.f46060a;
            case 4:
                ncl0 ncl0Var = (ncl0) this.b;
                String str = (String) this.c;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                yfm0 yfm0Var = ncl0Var.k;
                String strValueOf = String.valueOf(((zqs) ((p7m0) ncl0Var.w()).getValue()).b);
                long j = ((zqs) ((p7m0) ncl0Var.w()).getValue()).c;
                ((zfm0) yfm0Var).getClass();
                strValueOf.getClass();
                k0w0Var.h(rl70.d(j, str, strValueOf));
                return Unit.f46060a;
            case 5:
                List list = (List) this.b;
                j8l0 j8l0Var = (j8l0) this.c;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                byte b10 = 17;
                hczVar4.f(list.size(), new o3l0(new gcl0((byte) 6), list, (byte) 14), new y9k0(list, b10), new ugd(2039820996, true, new xe4(list, j8l0Var, b10)));
                return Unit.f46060a;
            case 6:
                kfl0 kfl0Var = (kfl0) this.c;
                Function1 function5 = (Function1) this.b;
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                a4x a4xVar4 = kfl0Var.b;
                hczVar5.f(a4xVar4.size(), new o3l0(new gcl0((byte) 9), a4xVar4, (byte) 12), new y9k0(a4xVar4, (byte) 15), new ugd(2039820996, true, new h8w((List) a4xVar4, (Object) function5, (Object) kfl0Var, (byte) 24)));
                return Unit.f46060a;
            case 7:
                wll0 wll0Var = (wll0) this.c;
                Function1 function6 = (Function1) this.b;
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                lla llaVar = wll0Var.f39360a;
                vvs vvsVar = wll0Var.b;
                if (bemVar2 instanceof wdm) {
                    function6.invoke(new lrk0(new hll0(llaVar.a()), vvsVar));
                } else if ((bemVar2 instanceof rdm) || (bemVar2 instanceof xdm)) {
                    function6.invoke(new lrk0(new gll0(llaVar.a()), vvsVar));
                }
                return Unit.f46060a;
            case 8:
                sql0 sql0Var = (sql0) this.b;
                lql0 lql0Var = (lql0) this.c;
                ((View) obj).getClass();
                xdr xdrVar = sql0Var.f;
                if (xdrVar != null) {
                    kql0 kql0Var = (kql0) lql0Var;
                    xdrVar.F(ae9.c, Long.valueOf(kql0Var.b.f37861a), kql0Var.b.b);
                }
                return Unit.f46060a;
            case 9:
                tql0 tql0Var = (tql0) this.b;
                ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) this.c;
                TypedArray typedArray = (TypedArray) obj;
                typedArray.getClass();
                int dimensionPixelSize = typedArray.getDimensionPixelSize(13, 0);
                int dimensionPixelSize2 = typedArray.getDimensionPixelSize(12, 0);
                tql0Var.g = typedArray.getColor(3, 0);
                TextView textView = tql0Var.e;
                int color = typedArray.getColor(18, 0);
                int resourceId = typedArray.getResourceId(0, 0);
                tql0Var.f34387a = typedArray.getResourceId(11, 0);
                int dimensionPixelSize3 = typedArray.getDimensionPixelSize(17, 0);
                int dimensionPixelSize4 = typedArray.getDimensionPixelSize(19, 0);
                int dimensionPixelSize5 = typedArray.getDimensionPixelSize(9, 0);
                int dimensionPixelSize6 = typedArray.getDimensionPixelSize(2, 0);
                int dimensionPixelSize7 = typedArray.getDimensionPixelSize(1, 0);
                int dimensionPixelSize8 = typedArray.getDimensionPixelSize(4, 0);
                int dimensionPixelSize9 = typedArray.getDimensionPixelSize(10, 0);
                int dimensionPixelSize10 = typedArray.getDimensionPixelSize(15, 0);
                float dimension = typedArray.getDimension(5, 0.0f);
                int dimensionPixelSize11 = typedArray.getDimensionPixelSize(7, 0);
                int dimensionPixelSize12 = typedArray.getDimensionPixelSize(6, 0);
                float dimension2 = typedArray.getDimension(20, 0.0f);
                int dimensionPixelSize13 = typedArray.getDimensionPixelSize(22, 0);
                int dimensionPixelSize14 = typedArray.getDimensionPixelSize(21, 0);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize6, dimensionPixelSize7);
                layoutParams.gravity = 49;
                layoutParams.topMargin = dimensionPixelSize5;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams2.gravity = 80;
                layoutParams2.setMargins(dimensionPixelSize4, 0, dimensionPixelSize4, dimensionPixelSize3);
                tql0Var.f = typedArray.getDimensionPixelSize(16, tql0Var.h);
                tql0Var.h = typedArray.getDimensionPixelSize(14, tql0Var.h);
                tql0Var.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize2));
                ImageView imageView = tql0Var.b;
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setLayoutParams(layoutParams);
                imageView.setColorFilter(tql0Var.g);
                imageView.setPadding(dimensionPixelSize8, dimensionPixelSize9, dimensionPixelSize8, dimensionPixelSize9);
                if (resourceId != 0) {
                    imageView.setBackground(contextThemeWrapper.getDrawable(resourceId));
                }
                cem0.m(R.style.TextStyle_Caption_Medium_M_TextPrimary, textView);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                textView.setLayoutDirection(3);
                textView.setTextDirection(3);
                textView.setLayoutParams(layoutParams2);
                textView.setTextColor(color);
                textView.setMinimumHeight(dimensionPixelSize10);
                int i = tql0Var.h;
                int i2 = tql0Var.f;
                if (i == i2) {
                    textView.setTextSize(0, i);
                } else {
                    aem0.r(textView, i2, i, 1, 0);
                }
                DsShimmerView dsShimmerView = tql0Var.c;
                dsShimmerView.setVisibility(8);
                dsShimmerView.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize11, dimensionPixelSize12));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, contextThemeWrapper)));
                dsShimmerView.setBackground(gradientDrawable);
                DsShimmerView dsShimmerView2 = tql0Var.d;
                dsShimmerView2.setVisibility(8);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(dimensionPixelSize13, dimensionPixelSize14);
                layoutParams3.gravity = 81;
                layoutParams3.setMargins(0, 0, 0, dimensionPixelSize3);
                dsShimmerView2.setLayoutParams(layoutParams3);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(dimension2);
                gradientDrawable2.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, contextThemeWrapper)));
                dsShimmerView2.setBackground(gradientDrawable2);
                int i3 = tql0Var.f34387a;
                if (i3 != 0) {
                    tql0Var.setBackgroundResource(i3);
                }
                return Unit.f46060a;
            case 10:
                final yql0 yql0Var = (yql0) this.b;
                ContextThemeWrapper contextThemeWrapper2 = (ContextThemeWrapper) this.c;
                TypedArray typedArray2 = (TypedArray) obj;
                typedArray2.getClass();
                int color2 = typedArray2.getColor(8, 0);
                int resourceId2 = typedArray2.getResourceId(1, 0);
                int dimensionPixelSize15 = typedArray2.getDimensionPixelSize(4, 0);
                int dimensionPixelSize16 = typedArray2.getDimensionPixelSize(5, 0);
                float dimension3 = typedArray2.getDimension(3, 0.0f);
                ImageView imageView2 = yql0Var.m;
                int i4 = yql0Var.b;
                imageView2.setColorFilter(color2);
                int i5 = yql0Var.i;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i5, i5);
                layoutParams4.gravity = 8388661;
                int i6 = yql0Var.g;
                layoutParams4.setMarginStart(i6);
                layoutParams4.setMarginEnd(i6);
                layoutParams4.topMargin = yql0Var.e;
                imageView2.setLayoutParams(layoutParams4);
                int i7 = yql0Var.f;
                imageView2.setPadding(i7, i7, i7, i7);
                final byte b11 = z ? (byte) 1 : (byte) 0;
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: a.xql0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b12 = b11;
                        yql0 yql0Var2 = yql0Var;
                        switch (b12) {
                            case 0:
                                xdr xdrVar2 = yql0Var2.f43082a;
                                if (xdrVar2 != null) {
                                    xdrVar2.F(ae9.b, null, null);
                                }
                                break;
                            default:
                                xdr xdrVar3 = yql0Var2.f43082a;
                                if (xdrVar3 != null) {
                                    xdrVar3.F(ae9.f717a, null, null);
                                }
                                break;
                        }
                    }
                });
                if (resourceId2 != 0) {
                    imageView2.setBackgroundResource(resourceId2);
                }
                DsHeader dsHeader = yql0Var.k;
                dsHeader.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                dsHeader.c(0, 0);
                int i8 = imageView2.getLayoutParams().width;
                ViewGroup.LayoutParams layoutParams5 = imageView2.getLayoutParams();
                jmu0.k(dsHeader, i4, 0, i8 + (layoutParams5 instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginEnd() : 0) + yql0Var.h, 0);
                dsHeader.setButtonClickListener(new View.OnClickListener() { // from class: a.xql0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b12 = b9;
                        yql0 yql0Var2 = yql0Var;
                        switch (b12) {
                            case 0:
                                xdr xdrVar2 = yql0Var2.f43082a;
                                if (xdrVar2 != null) {
                                    xdrVar2.F(ae9.b, null, null);
                                }
                                break;
                            default:
                                xdr xdrVar3 = yql0Var2.f43082a;
                                if (xdrVar3 != null) {
                                    xdrVar3.F(ae9.f717a, null, null);
                                }
                                break;
                        }
                    }
                });
                yql0Var.l.setLayoutParams(yql0Var.j);
                DsShimmerView dsShimmerView3 = yql0Var.n;
                dsShimmerView3.setVisibility(8);
                dsShimmerView3.setPaddingRelative(i4, dsShimmerView3.getTop(), dsShimmerView3.getRight(), yql0Var.d);
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(dimensionPixelSize16, dimensionPixelSize15);
                layoutParams6.gravity = 8388659;
                layoutParams6.setMarginStart(i4);
                layoutParams6.setMarginEnd(i4);
                layoutParams6.topMargin = yql0Var.c;
                dsShimmerView3.setLayoutParams(layoutParams6);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(dimension3);
                gradientDrawable3.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, contextThemeWrapper2)));
                dsShimmerView3.setBackground(gradientDrawable3);
                return Unit.f46060a;
            case 11:
                zql0 zql0Var = (zql0) this.b;
                vne vneVar = (vne) this.c;
                Throwable th = (Throwable) obj;
                th.getClass();
                th.getLocalizedMessage();
                zql0Var.h.o(null, i8d.e);
                zql0Var.f(th, vneVar);
                return Unit.f46060a;
            case 12:
                rwl0 rwl0Var = (rwl0) this.c;
                Function1 function7 = (Function1) this.b;
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                a4x a4xVar5 = rwl0Var.f31222a;
                a4x a4xVar6 = rwl0Var.c;
                if (!a4xVar5.isEmpty() && !rwl0Var.f) {
                    z = true;
                }
                if (z) {
                    hcz.e(hczVar6, null, null, new ugd(1012015703, true, new nhl0(rwl0Var, function7, (byte) 6)), 3);
                }
                a4x a4xVar7 = rwl0Var.b;
                hczVar6.f(a4xVar7.size(), new o3l0(new gcl0(b3), a4xVar7, (byte) 19), new y9k0(a4xVar7, (byte) 21), new ugd(2039820996, true, new gx(a4xVar7, rwl0Var, z)));
                if (!a4xVar6.isEmpty()) {
                    hcz.e(hczVar6, null, null, new ugd(-859557248, true, new rqc0(rwl0Var, b2)), 3);
                    hczVar6.f(a4xVar6.size(), new o3l0(new gcl0((byte) 19), a4xVar6, (byte) 20), new y9k0(a4xVar6, (byte) 22), new ugd(2039820996, true, new njh0(a4xVar6, function7, (byte) 12)));
                }
                return Unit.f46060a;
            case 13:
                l7m0 l7m0Var = (l7m0) this.b;
                i3t0 i3t0Var = (i3t0) this.c;
                hcz hczVar7 = (hcz) obj;
                hczVar7.getClass();
                a4x a4xVar8 = ((h0m0) l7m0Var.getValue()).f12243a;
                hczVar7.f(a4xVar8.size(), null, new e0m0(a4xVar8, (byte) 0), new ugd(2039820996, true, new h8w((List) a4xVar8, (Object) l7m0Var, (Object) i3t0Var, (byte) 25)));
                return Unit.f46060a;
            case 14:
                ArrayList arrayList = (ArrayList) this.b;
                xcz xczVar = (xcz) this.c;
                hcz hczVar8 = (hcz) obj;
                hczVar8.getClass();
                hczVar8.f(arrayList.size(), null, new t9l0(arrayList, b4), new ugd(802480018, true, new xe4(arrayList, xczVar, b3)));
                return Unit.f46060a;
            case 15:
                dp20 dp20Var = (dp20) this.b;
                p010 p010Var = (p010) this.c;
                ((w6k) obj).getClass();
                dp20Var.getClass();
                long jA = dp20Var.a(p010Var.d, p010Var.e);
                return new adl((((long) Float.floatToRawIntBits(adl.a(jA))) << 32) | (((long) Float.floatToRawIntBits(adl.b(jA) - dp20Var.e)) & 4294967295L));
            case 16:
                dp20 dp20Var2 = (dp20) this.b;
                az00 az00Var = (az00) this.c;
                ((w6k) obj).getClass();
                return new adl(dp20Var2.a(((Number) az00Var.a().f46059a).floatValue(), ((Number) az00Var.a().b).floatValue()));
            case 17:
                wzl0 wzl0Var = (wzl0) this.b;
                w3m0 w3m0Var = (w3m0) this.c;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.b(new c1w0(new d0m0(((szl0) wzl0Var).b, w3m0Var.p), null));
                return Unit.f46060a;
            case 18:
                List list2 = (List) this.b;
                i7m0 i7m0Var = (i7m0) this.c;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ((odd) ((ndd) it.next())).b0(th2);
                    }
                } else {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        ((odd) ((ndd) it2.next())).N(Unit.f46060a);
                    }
                }
                synchronized (i7m0Var.d) {
                    i7m0Var.f.removeAll(list2);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                nfj0 nfj0Var = (nfj0) this.b;
                kcl0 kcl0Var = (kcl0) this.c;
                cp cpVar = (cp) obj;
                cpVar.getClass();
                hie0 hie0Var = new hie0();
                v9m0 v9m0Var = (v9m0) cpVar.u;
                v9m0Var.b.setIconTint(m5d.b(R.attr.uikitSecondary, cpVar.w));
                dyb.O(v9m0Var.b.getButton(), new nej0(hie0Var, nfj0Var, cpVar, b8));
                v9m0Var.b.getDragAndDropView().setOnTouchListener(new yv5(kcl0Var, cpVar, b7));
                cpVar.t(new xg(hie0Var, cpVar, cpVar));
                return Unit.f46060a;
            case 20:
                Function1 function8 = (Function1) this.b;
                a0z a0zVar = (a0z) this.c;
                bem bemVar3 = (bem) obj;
                bemVar3.getClass();
                if (bemVar3 instanceof wdm) {
                    o0k0 o0k0Var = new o0k0(function8, a0zVar, b5);
                    ymx ymxVar = ivb0.b;
                    ymxVar.getClass();
                    new bjj(ymxVar, false, o0k0Var).a();
                }
                return Unit.f46060a;
            case 21:
                HashMap map = (HashMap) this.b;
                n0a n0aVar = (n0a) this.c;
                fot0 fot0Var = (fot0) obj;
                fot0Var.getClass();
                Object obj2 = map.get(fot0Var);
                if (obj2 == null) {
                    jf4.o("Required value was null.");
                    return null;
                }
                p3a p3aVar = (p3a) obj2;
                fpt0 fpt0VarQ = fot0Var.q(n0aVar, p3aVar.f26290a, p3aVar.b);
                fpt0VarQ.getClass();
                return fpt0VarQ;
            case 22:
                ltm0 ltm0Var = (ltm0) this.b;
                vne vneVar2 = (vne) this.c;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.getLocalizedMessage();
                ltm0Var.h.o(null, i8d.e);
                ltm0Var.f(th3, vneVar2);
                return Unit.f46060a;
            case 23:
                u2n0 u2n0Var = (u2n0) this.c;
                Function1 function9 = (Function1) this.b;
                hcz hczVar9 = (hcz) obj;
                hczVar9.getClass();
                a4x a4xVar9 = u2n0Var.c;
                hczVar9.f(a4xVar9.size(), null, new y9k0(a4xVar9, (byte) 28), new ugd(802480018, true, new njh0(a4xVar9, function9, b)));
                return Unit.f46060a;
            case 24:
                Function1 function10 = (Function1) this.b;
                e1n0 e1n0Var = (e1n0) this.c;
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    function10.invoke(new c0n0(e1n0Var, ((w5q0) x5q0Var).f38596a));
                } else if (x5q0Var instanceof u5q0) {
                    function10.invoke(new zzm0(e1n0Var));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                r4n0 r4n0Var = (r4n0) this.b;
                Function0 function0 = (Function0) this.c;
                ((View) obj).getClass();
                DsSearchField dsSearchField = r4n0Var.k;
                if (dsSearchField.getVisibility() == 0) {
                    dsSearchField.getEditText().clearFocus();
                    TextInputEditText editText = dsSearchField.getEditText();
                    editText.getClass();
                    editText.setText("");
                    dsSearchField.setVisibility(8);
                    dsSearchField.c();
                    r4n0Var.l.setVisibility(0);
                    r4n0Var.n.a();
                    r4n0Var.i.invoke();
                    Function1 function11 = r4n0Var.j;
                    if (function11 != null) {
                        function11.invoke(Boolean.FALSE);
                    }
                } else {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                oen0 oen0Var = (oen0) this.c;
                Function1 function12 = (Function1) this.b;
                hcz hczVar10 = (hcz) obj;
                hczVar10.getClass();
                i4 i4Var = oen0Var.f25132a;
                hczVar10.f(i4Var.size(), null, new adn0(i4Var, b9), new ugd(2039820996, true, new njh0(i4Var, function12, b5)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bzt bztVar = (bzt) this.b;
                g2v g2vVar = (g2v) this.c;
                jen0 jen0Var = (jen0) obj;
                jen0Var.getClass();
                return new ken0(jen0Var, g2vVar, bztVar.f3488a.a().r);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                l7m0 l7m0Var2 = (l7m0) this.b;
                snn0 snn0Var = (snn0) this.c;
                hcz hczVar11 = (hcz) obj;
                j6m0 j6m0Var = snn0.n2;
                hczVar11.getClass();
                a4x a4xVar10 = ((xnn0) l7m0Var2.getValue()).f41178a;
                hczVar11.f(a4xVar10.size(), new zcn0(new acm0(b8), a4xVar10, b6), new e0m0(a4xVar10, (byte) 2), new ugd(2039820996, true, new h8w(a4xVar10, snn0Var, l7m0Var2, b2)));
                return Unit.f46060a;
            default:
                tsn0 tsn0Var = (tsn0) this.b;
                cp cpVar2 = (cp) this.c;
                List list3 = u0d.f34849a;
                u0d.l(tsn0Var.r, ((btn0) cpVar2.u()).e);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ u5l0(Object obj, Object obj2, byte b) {
        this.f35101a = b;
        this.b = obj;
        this.c = obj2;
    }
}
