package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetAlertModel;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetInfoItem;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetStringModel;

/* JADX INFO: loaded from: classes6.dex */
public final class wgn0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39125a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public SuccessBetAlertModel i;
    public FrameLayout j;
    public final ArrayList k;
    public final ArrayList l;
    public final n0o0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgn0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f39125a = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_12);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_1);
        this.e = getResources().getDimensionPixelSize(R.dimen.text_1);
        this.f = getResources().getDimensionPixelSize(R.dimen.text_12);
        this.g = getResources().getDimensionPixelSize(R.dimen.text_14);
        this.h = getResources().getDimension(R.dimen.radius_10);
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = maz.b(new o0k0((Object) context, (Object) this, (byte) 18));
    }

    public static void d(TextView textView, int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
    }

    private final View getContentBackground() {
        return (View) this.m.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:69:0x01f6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final void a(SuccessBetAlertModel successBetAlertModel, SuccessBetStringModel successBetStringModel, Function0 function0) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        boolean z;
        FrameLayout frameLayout;
        successBetAlertModel.getClass();
        String str = successBetAlertModel.f47264a;
        successBetStringModel.getClass();
        String str2 = successBetStringModel.e;
        this.i = successBetAlertModel;
        removeAllViews();
        ArrayList arrayList = this.k;
        arrayList.clear();
        ArrayList arrayList2 = this.l;
        arrayList2.clear();
        this.j = null;
        if (b()) {
            addView(getContentBackground());
        }
        SuccessBetAlertModel successBetAlertModel2 = this.i;
        String str3 = successBetAlertModel2 != null ? successBetAlertModel2.f47264a : null;
        if (str3 != null && str3.length() != 0) {
            SuccessBetAlertModel successBetAlertModel3 = this.i;
            String str4 = successBetAlertModel3 != null ? successBetAlertModel3.b : null;
            if (str4 != null && str4.length() != 0) {
                if (str2 == null || str2.length() == 0) {
                    Context context = getContext();
                    context.getClass();
                    vgn0 vgn0Var = new vgn0(context);
                    if (str == null) {
                        str = "";
                    }
                    vgn0Var.a(str, successBetAlertModel.a());
                    frameLayout = vgn0Var;
                } else {
                    Context context2 = getContext();
                    context2.getClass();
                    bhn0 bhn0Var = new bhn0(context2);
                    if (str == null) {
                        str = "";
                    }
                    bhn0Var.a(str, successBetAlertModel.a(), str2, function0);
                    frameLayout = bhn0Var;
                }
                this.j = frameLayout;
                addView(frameLayout);
            }
        }
        List list = successBetAlertModel.f;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            SuccessBetInfoItem successBetInfoItem = (SuccessBetInfoItem) obj;
            if (successBetInfoItem != null) {
                if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                    if (((SuccessBetInfoItem.Simple) successBetInfoItem).b.length() > 0) {
                        arrayList3.add(obj);
                    }
                } else if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                    if (((SuccessBetInfoItem.WithCurrency) successBetInfoItem).b.length() > 0) {
                        arrayList3.add(obj);
                    }
                }
            }
            t9f.b();
            return;
        }
        Iterator it = arrayList3.iterator();
        ?? r3 = 0;
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            SuccessBetInfoItem successBetInfoItem2 = (SuccessBetInfoItem) next;
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext());
            appCompatTextView3.setId(jmu0.d());
            appCompatTextView3.setTag("itemName_" + appCompatTextView3.hashCode());
            cem0.n(R.style.TextStyle_Text_Regular_Secondary, appCompatTextView3);
            appCompatTextView3.setMaxLines(2);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            appCompatTextView3.setEllipsize(truncateAt);
            int i3 = this.f;
            int i4 = this.g;
            int i5 = this.e;
            aem0.r(appCompatTextView3, i3, i4, i5, r3);
            appCompatTextView3.setIncludeFontPadding(r3);
            if (successBetInfoItem2 != null) {
                boolean z2 = successBetInfoItem2 instanceof SuccessBetInfoItem.WithCurrency;
                if (z2) {
                    int i6 = ((SuccessBetInfoItem.WithCurrency) successBetInfoItem2).c;
                    appCompatTextView = new AppCompatTextView(getContext());
                    appCompatTextView.setId(jmu0.d());
                    appCompatTextView.setTag("itemValue_" + appCompatTextView.hashCode());
                    cem0.n(R.style.TextStyle_Text_Bold, appCompatTextView);
                    appCompatTextView.setTextColor(i6);
                    appCompatTextView.setMaxLines(2);
                    appCompatTextView.setEllipsize(truncateAt);
                    aem0.r(appCompatTextView, i3, i4, i5, 0);
                    appCompatTextView.setIncludeFontPadding(false);
                } else if (successBetInfoItem2 instanceof SuccessBetInfoItem.Simple) {
                    appCompatTextView = new AppCompatTextView(getContext());
                    appCompatTextView.setId(jmu0.d());
                    appCompatTextView.setTag("itemValue_" + appCompatTextView.hashCode());
                    cem0.n(R.style.TextStyle_Text_Bold_TextPrimary, appCompatTextView);
                    appCompatTextView.setMaxLines(2);
                    appCompatTextView.setEllipsize(truncateAt);
                    aem0.r(appCompatTextView, i3, i4, i5, 0);
                    appCompatTextView.setIncludeFontPadding(false);
                }
                if (z2 != 0) {
                    SuccessBetInfoItem.WithCurrency withCurrency = (SuccessBetInfoItem.WithCurrency) successBetInfoItem2;
                    if (withCurrency.d.length() > 0) {
                        int i7 = withCurrency.c;
                        appCompatTextView2 = new AppCompatTextView(getContext());
                        appCompatTextView2.setId(jmu0.d());
                        appCompatTextView2.setTag("itemCurrency_" + appCompatTextView2.hashCode());
                        cem0.n(R.style.TextStyle_Text_Bold, appCompatTextView2);
                        appCompatTextView2.setTextColor(i7);
                        appCompatTextView2.setIncludeFontPadding(false);
                    } else {
                        appCompatTextView2 = null;
                    }
                } else {
                    appCompatTextView2 = null;
                }
                if (successBetInfoItem2 instanceof SuccessBetInfoItem.Simple) {
                    SuccessBetInfoItem.Simple simple = (SuccessBetInfoItem.Simple) successBetInfoItem2;
                    String str5 = simple.b;
                    appCompatTextView3.setText(simple.f47265a);
                    if (Intrinsics.d(str5, "0")) {
                        str5 = "SP";
                    }
                    appCompatTextView.setText(str5);
                    appCompatTextView.setTextDirection(3);
                } else {
                    if (!z2) {
                        t9f.b();
                        return;
                    }
                    SuccessBetInfoItem.WithCurrency withCurrency2 = (SuccessBetInfoItem.WithCurrency) successBetInfoItem2;
                    appCompatTextView3.setText(withCurrency2.f47266a);
                    appCompatTextView.setText(withCurrency2.b);
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setText(withCurrency2.d);
                    }
                }
                addView(appCompatTextView3);
                addView(appCompatTextView);
                if (appCompatTextView2 != null) {
                    addView(appCompatTextView2);
                }
                if (i < arrayList3.size() - 1) {
                    Context context3 = getContext();
                    context3.getClass();
                    z = false;
                    DsSeparator dsSeparator = new DsSeparator(context3, null, 6, 0);
                    dsSeparator.setId(jmu0.d());
                    dsSeparator.setTag("separator_" + dsSeparator.hashCode());
                    Context context4 = dsSeparator.getContext();
                    context4.getClass();
                    dsSeparator.setBackgroundColor(m5d.b(R.attr.uikitSeparator60, context4));
                    addView(dsSeparator);
                    arrayList2.add(dsSeparator);
                } else {
                    z = false;
                }
                arrayList.add(new mb7(appCompatTextView3, appCompatTextView, appCompatTextView2, successBetInfoItem2));
                i = i2;
                r3 = z;
                it = it;
                arrayList3 = arrayList3;
            }
            t9f.b();
            return;
        }
    }

    public final boolean b() {
        List list;
        SuccessBetAlertModel successBetAlertModel = this.i;
        return (successBetAlertModel == null || (list = successBetAlertModel.f) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    public final boolean c() {
        return getLayoutDirection() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d2 A[SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        int iMax;
        int i5;
        DsSeparator dsSeparator;
        wgn0 wgn0Var = this;
        FrameLayout frameLayout = wgn0Var.j;
        int i6 = wgn0Var.b;
        if (frameLayout != null) {
            frameLayout.layout(0, 0, wgn0Var.getWidth(), frameLayout.getMeasuredHeight());
            measuredHeight = frameLayout.getMeasuredHeight() + i6;
        } else {
            measuredHeight = 0;
        }
        if (wgn0Var.b()) {
            int i7 = wgn0Var.c;
            ArrayList arrayList = wgn0Var.k;
            int i8 = measuredHeight + i7;
            int i9 = 0;
            for (Object obj : arrayList) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    q3d.p();
                    throw null;
                }
                mb7 mb7Var = (mb7) obj;
                SuccessBetInfoItem successBetInfoItem = mb7Var.d;
                AppCompatTextView appCompatTextView3 = mb7Var.c;
                AppCompatTextView appCompatTextView4 = mb7Var.f21493a;
                AppCompatTextView appCompatTextView5 = mb7Var.b;
                if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                    int iMax2 = Math.max(appCompatTextView4.getMeasuredHeight(), appCompatTextView5.getMeasuredHeight());
                    int measuredHeight2 = (iMax2 - appCompatTextView4.getMeasuredHeight()) / 2;
                    int measuredHeight3 = (iMax2 - appCompatTextView5.getMeasuredHeight()) / 2;
                    jmu0.f(wgn0Var.c, i8 + measuredHeight2, appCompatTextView4.getMeasuredWidth() + i7, appCompatTextView4.getMeasuredHeight() + i8 + measuredHeight2, appCompatTextView4, wgn0Var);
                    appCompatTextView5.layout(wgn0Var.c() ? (wgn0Var.getWidth() - appCompatTextView5.getMeasuredWidth()) - i7 : i7, i8 + measuredHeight3, wgn0Var.c() ? wgn0Var.getWidth() - i7 : appCompatTextView5.getMeasuredWidth() + i7, appCompatTextView5.getMeasuredHeight() + i8 + measuredHeight3);
                    appCompatTextView5.setLayoutDirection(0);
                    iMax = Math.max(appCompatTextView4.getMeasuredHeight(), appCompatTextView5.getMeasuredHeight());
                } else {
                    if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                        if (appCompatTextView3 == null) {
                            appCompatTextView2 = appCompatTextView4;
                            appCompatTextView = appCompatTextView5;
                        } else {
                            int measuredHeight4 = appCompatTextView4.getMeasuredHeight();
                            int measuredHeight5 = appCompatTextView5.getMeasuredHeight();
                            int measuredHeight6 = appCompatTextView3.getMeasuredHeight();
                            int iMax3 = Math.max(measuredHeight4, Math.max(measuredHeight5, measuredHeight6));
                            int i11 = (iMax3 - measuredHeight4) / 2;
                            int i12 = (iMax3 - measuredHeight5) / 2;
                            int i13 = (iMax3 - measuredHeight6) / 2;
                            jmu0.f(wgn0Var.c, i8 + i11, appCompatTextView4.getMeasuredWidth() + i7, measuredHeight4 + i8 + i11, appCompatTextView4, wgn0Var);
                            int i14 = i8 + i12;
                            int i15 = i8 + measuredHeight5 + i12;
                            boolean zC = wgn0Var.c();
                            int i16 = wgn0Var.f39125a;
                            appCompatTextView = appCompatTextView5;
                            appCompatTextView2 = appCompatTextView4;
                            appCompatTextView.layout(zC ? (((wgn0Var.getWidth() - appCompatTextView5.getMeasuredWidth()) - i16) - appCompatTextView3.getMeasuredWidth()) - i7 : i7, i14, wgn0Var.c() ? ((wgn0Var.getWidth() - appCompatTextView3.getMeasuredWidth()) - i7) - i16 : appCompatTextView5.getMeasuredWidth() + i7, i15);
                            appCompatTextView.setLayoutDirection(0);
                            int i17 = i8 + i13;
                            int i18 = i8 + measuredHeight6 + i13;
                            appCompatTextView3.layout(wgn0Var.c() ? (wgn0Var.getWidth() - appCompatTextView3.getMeasuredWidth()) - i7 : appCompatTextView.getMeasuredWidth() + i7 + i16, i17, wgn0Var.c() ? wgn0Var.getWidth() - i7 : appCompatTextView3.getMeasuredWidth() + appCompatTextView.getMeasuredWidth() + i7 + i16, i18);
                            appCompatTextView3.setLayoutDirection(0);
                        }
                        iMax = Math.max(appCompatTextView2.getMeasuredHeight(), Math.max(appCompatTextView.getMeasuredHeight(), appCompatTextView3 != null ? appCompatTextView3.getMeasuredHeight() : 0));
                    }
                    if (i9 < arrayList.size() - 1) {
                        i5 = i8 + i6;
                        dsSeparator = (DsSeparator) CollectionsKt.W(i9, wgn0Var.l);
                        if (dsSeparator != null) {
                            int width = wgn0Var.getWidth() - i7;
                            int i19 = i5 + wgn0Var.d;
                            jmu0.f(wgn0Var.c, i5, width, i19, dsSeparator, wgn0Var);
                            i5 = i19;
                        }
                        i8 = i5 + i6;
                    }
                    wgn0Var = this;
                    i9 = i10;
                }
                i8 += iMax;
                if (i9 < arrayList.size() - 1) {
                    i5 = i8 + i6;
                    dsSeparator = (DsSeparator) CollectionsKt.W(i9, wgn0Var.l);
                    if (dsSeparator != null) {
                        int width2 = wgn0Var.getWidth() - i7;
                        int i110 = i5 + wgn0Var.d;
                        jmu0.f(wgn0Var.c, i5, width2, i110, dsSeparator, wgn0Var);
                        i5 = i110;
                    }
                    i8 = i5 + i6;
                }
                wgn0Var = this;
                i9 = i10;
            }
            jmu0.f(0, measuredHeight, getWidth(), i8 + i7, getContentBackground(), this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int iMax;
        int size2 = View.MeasureSpec.getSize(i);
        int i3 = this.c;
        int i4 = size2 - (i3 * 2);
        int i5 = (int) (((double) i4) * 0.6d);
        FrameLayout frameLayout = this.j;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size2 < 0 ? 0 : size2, Integer.MIN_VALUE), i2);
        }
        ArrayList<mb7> arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i6 = this.b;
            if (zHasNext) {
                mb7 mb7Var = (mb7) it.next();
                SuccessBetInfoItem successBetInfoItem = mb7Var.d;
                AppCompatTextView appCompatTextView = mb7Var.f21493a;
                AppCompatTextView appCompatTextView2 = mb7Var.b;
                if (successBetInfoItem != null) {
                    if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                        d(appCompatTextView, i4, i2);
                        int measuredWidth = appCompatTextView.getMeasuredWidth();
                        if (measuredWidth > i5) {
                            measuredWidth = i5;
                        }
                        d(appCompatTextView, measuredWidth, i2);
                        d(appCompatTextView2, (i4 - measuredWidth) - i6, i2);
                    } else if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                        AppCompatTextView appCompatTextView3 = mb7Var.c;
                        if (appCompatTextView3 != null) {
                            d(appCompatTextView, i4, i2);
                            d(appCompatTextView3, i4, i2);
                            int measuredWidth2 = appCompatTextView.getMeasuredWidth();
                            if (measuredWidth2 > i5) {
                                measuredWidth2 = i5;
                            }
                            d(appCompatTextView, measuredWidth2, i2);
                            d(appCompatTextView2, (((i4 - measuredWidth2) - i6) - appCompatTextView3.getMeasuredWidth()) - this.f39125a, i2);
                        }
                    }
                }
                t9f.b();
                return;
            }
            Iterator it2 = this.l.iterator();
            while (it2.hasNext()) {
                ((DsSeparator) it2.next()).measure(View.MeasureSpec.makeMeasureSpec(i4 < 0 ? 0 : i4, Integer.MIN_VALUE), i2);
            }
            FrameLayout frameLayout2 = this.j;
            int measuredHeight = frameLayout2 != null ? frameLayout2.getMeasuredHeight() + i6 : 0;
            if (b()) {
                int i7 = 0;
                for (mb7 mb7Var2 : arrayList) {
                    SuccessBetInfoItem successBetInfoItem2 = mb7Var2.d;
                    AppCompatTextView appCompatTextView4 = mb7Var2.f21493a;
                    AppCompatTextView appCompatTextView5 = mb7Var2.b;
                    if (successBetInfoItem2 instanceof SuccessBetInfoItem.Simple) {
                        iMax = Math.max(appCompatTextView4.getMeasuredHeight(), appCompatTextView5.getMeasuredHeight());
                    } else if (successBetInfoItem2 instanceof SuccessBetInfoItem.WithCurrency) {
                        AppCompatTextView appCompatTextView6 = mb7Var2.c;
                        iMax = Math.max(appCompatTextView4.getMeasuredHeight(), Math.max(appCompatTextView5.getMeasuredHeight(), appCompatTextView6 != null ? appCompatTextView6.getMeasuredHeight() : 0));
                    } else {
                        iMax = 0;
                    }
                    i7 += iMax;
                }
                int size3 = arrayList.size() > 1 ? (arrayList.size() - 1) * this.d : 0;
                size = i7 + i3 + size3 + (arrayList.size() > 1 ? (arrayList.size() - 1) * i6 * 2 : 0) + i3;
            } else {
                size = 0;
            }
            int i8 = measuredHeight + size;
            if (b()) {
                getContentBackground().measure(View.MeasureSpec.makeMeasureSpec(size2 >= 0 ? size2 : 0, Integer.MIN_VALUE), size);
            }
            setMeasuredDimension(View.resolveSize(size2, i), View.resolveSize(i8, i2));
            setTag("SUCCESS_BET_INFO_PRIMARY_VIEW");
            return;
        }
    }
}
