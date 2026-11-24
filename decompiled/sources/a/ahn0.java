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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetAlertModel;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetInfoItem;
import org.xplatform.uikit.components.successbetalert.model.SuccessBetStringModel;

/* JADX INFO: loaded from: classes6.dex */
public final class ahn0 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f882a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public SuccessBetAlertModel f;
    public FrameLayout g;
    public final ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahn0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f882a = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = getResources().getDimensionPixelSize(R.dimen.text_1);
        this.d = getResources().getDimensionPixelSize(R.dimen.text_12);
        this.e = getResources().getDimensionPixelSize(R.dimen.text_14);
        this.h = new ArrayList();
    }

    public static void c(TextView textView, int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
    }

    public final void a(SuccessBetAlertModel successBetAlertModel, SuccessBetStringModel successBetStringModel, Function0 function0) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        FrameLayout frameLayout;
        successBetAlertModel.getClass();
        String str = successBetAlertModel.f47264a;
        successBetStringModel.getClass();
        String str2 = successBetStringModel.e;
        this.f = successBetAlertModel;
        removeAllViews();
        ArrayList arrayList = this.h;
        arrayList.clear();
        this.g = null;
        SuccessBetAlertModel successBetAlertModel2 = this.f;
        String str3 = successBetAlertModel2 != null ? successBetAlertModel2.f47264a : null;
        if (str3 != null && str3.length() != 0) {
            SuccessBetAlertModel successBetAlertModel3 = this.f;
            String str4 = successBetAlertModel3 != null ? successBetAlertModel3.b : null;
            if (str4 != null && str4.length() != 0) {
                if (str2 != null) {
                    Context context = getContext();
                    context.getClass();
                    zgn0 zgn0Var = new zgn0(context);
                    if (str == null) {
                        str = "";
                    }
                    zgn0Var.a(str, successBetAlertModel.a(), str2, function0);
                    frameLayout = zgn0Var;
                } else {
                    Context context2 = getContext();
                    context2.getClass();
                    ygn0 ygn0Var = new ygn0(context2);
                    if (str == null) {
                        str = "";
                    }
                    ygn0Var.a(str, successBetAlertModel.a());
                    frameLayout = ygn0Var;
                }
                this.g = frameLayout;
                addView(frameLayout);
            }
        }
        List list = successBetAlertModel.f;
        ArrayList<SuccessBetInfoItem> arrayList2 = new ArrayList();
        for (Object obj : list) {
            SuccessBetInfoItem successBetInfoItem = (SuccessBetInfoItem) obj;
            if (successBetInfoItem != null) {
                if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                    if (((SuccessBetInfoItem.Simple) successBetInfoItem).b.length() > 0) {
                        arrayList2.add(obj);
                    }
                } else if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                    if (((SuccessBetInfoItem.WithCurrency) successBetInfoItem).b.length() > 0) {
                        arrayList2.add(obj);
                    }
                }
            }
            t9f.b();
            return;
        }
        for (SuccessBetInfoItem successBetInfoItem2 : arrayList2) {
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext());
            appCompatTextView3.setId(jmu0.d());
            appCompatTextView3.setTag("itemName_" + appCompatTextView3.hashCode());
            cem0.n(R.style.TextStyle_Text_Regular_Secondary, appCompatTextView3);
            appCompatTextView3.setMaxLines(2);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            appCompatTextView3.setEllipsize(truncateAt);
            int i = this.d;
            int i2 = this.e;
            int i3 = this.c;
            aem0.r(appCompatTextView3, i, i2, i3, 0);
            if (successBetInfoItem2 != null) {
                boolean z = successBetInfoItem2 instanceof SuccessBetInfoItem.WithCurrency;
                if (z) {
                    appCompatTextView = new AppCompatTextView(getContext());
                    appCompatTextView.setId(jmu0.d());
                    appCompatTextView.setTag("itemValue_" + appCompatTextView.hashCode());
                    cem0.n(R.style.TextStyle_Text_Bold_TextPrimary, appCompatTextView);
                    appCompatTextView.setMaxLines(2);
                    appCompatTextView.setEllipsize(truncateAt);
                    aem0.r(appCompatTextView, i, i2, i3, 0);
                    appCompatTextView.setGravity(8388613);
                } else if (successBetInfoItem2 instanceof SuccessBetInfoItem.Simple) {
                    appCompatTextView = new AppCompatTextView(getContext());
                    appCompatTextView.setId(jmu0.d());
                    appCompatTextView.setTag("itemValue_" + appCompatTextView.hashCode());
                    cem0.n(R.style.TextStyle_Text_Bold_TextPrimary, appCompatTextView);
                    appCompatTextView.setMaxLines(2);
                    appCompatTextView.setEllipsize(truncateAt);
                    aem0.r(appCompatTextView, i, i2, i3, 0);
                    appCompatTextView.setGravity(8388613);
                }
                if (!z || ((SuccessBetInfoItem.WithCurrency) successBetInfoItem2).d.length() <= 0) {
                    appCompatTextView2 = null;
                } else {
                    appCompatTextView2 = new AppCompatTextView(getContext());
                    appCompatTextView2.setId(jmu0.d());
                    appCompatTextView2.setTag("itemCurrency_" + appCompatTextView2.hashCode());
                    cem0.n(R.style.TextStyle_Text_Bold_TextPrimary, appCompatTextView2);
                    appCompatTextView2.setGravity(8388613);
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
                    if (!z) {
                        t9f.b();
                        return;
                    }
                    SuccessBetInfoItem.WithCurrency withCurrency = (SuccessBetInfoItem.WithCurrency) successBetInfoItem2;
                    appCompatTextView3.setText(withCurrency.f47266a);
                    appCompatTextView.setText(withCurrency.b);
                    if (appCompatTextView2 != null) {
                        appCompatTextView2.setText(withCurrency.d);
                    }
                }
                addView(appCompatTextView3);
                addView(appCompatTextView);
                if (appCompatTextView2 != null) {
                    addView(appCompatTextView2);
                }
                arrayList.add(new mb7(appCompatTextView3, appCompatTextView, appCompatTextView2, successBetInfoItem2));
            }
            t9f.b();
            return;
        }
    }

    public final boolean b() {
        return getLayoutDirection() == 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMax;
        ahn0 ahn0Var = this;
        FrameLayout frameLayout = ahn0Var.g;
        int i5 = ahn0Var.b;
        if (frameLayout != null) {
            frameLayout.layout(0, 0, ahn0Var.getWidth(), frameLayout.getMeasuredHeight());
            iMax = frameLayout.getMeasuredHeight() + i5;
        } else {
            iMax = 0;
        }
        while (true) {
            int i6 = iMax;
            for (mb7 mb7Var : ahn0Var.h) {
                SuccessBetInfoItem successBetInfoItem = mb7Var.d;
                AppCompatTextView appCompatTextView = mb7Var.c;
                AppCompatTextView appCompatTextView2 = mb7Var.f21493a;
                AppCompatTextView appCompatTextView3 = mb7Var.b;
                if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                    int iMax2 = Math.max(appCompatTextView2.getMeasuredHeight(), appCompatTextView3.getMeasuredHeight());
                    int measuredHeight = (iMax2 - appCompatTextView2.getMeasuredHeight()) / 2;
                    int measuredHeight2 = (iMax2 - appCompatTextView3.getMeasuredHeight()) / 2;
                    jmu0.f(0, i6 + measuredHeight, (ahn0Var.b() ? i5 : 0) + appCompatTextView2.getMeasuredWidth(), appCompatTextView2.getMeasuredHeight() + i6 + measuredHeight, appCompatTextView2, ahn0Var);
                    appCompatTextView3.layout(b() ? getWidth() - appCompatTextView3.getMeasuredWidth() : 0, i6 + measuredHeight2, b() ? getWidth() : appCompatTextView3.getMeasuredWidth(), appCompatTextView3.getMeasuredHeight() + i6 + measuredHeight2);
                    appCompatTextView3.setLayoutDirection(0);
                    iMax = Math.max(appCompatTextView2.getMeasuredHeight(), appCompatTextView3.getMeasuredHeight()) + i5 + i6;
                    ahn0Var = this;
                } else if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                    if (appCompatTextView == null) {
                        ahn0Var = this;
                    } else {
                        int measuredHeight3 = appCompatTextView2.getMeasuredHeight();
                        if (measuredHeight3 % 2 != 0) {
                            measuredHeight3++;
                        }
                        int measuredHeight4 = appCompatTextView3.getMeasuredHeight();
                        if (measuredHeight4 % 2 != 0) {
                            measuredHeight4++;
                        }
                        int i7 = measuredHeight4;
                        int measuredHeight5 = appCompatTextView.getMeasuredHeight();
                        if (measuredHeight5 % 2 != 0) {
                            measuredHeight5++;
                        }
                        int i8 = measuredHeight5;
                        int iMax3 = Math.max(measuredHeight3, Math.max(i7, i8));
                        int i9 = (iMax3 - measuredHeight3) / 2;
                        int i10 = (iMax3 - i7) / 2;
                        int i11 = (iMax3 - i8) / 2;
                        ahn0Var = this;
                        jmu0.f(0, i6 + i9, appCompatTextView2.getMeasuredWidth() + i5, measuredHeight3 + i6 + i9, appCompatTextView2, ahn0Var);
                        int i12 = i6 + i10;
                        int i13 = i7 + i6 + i10;
                        boolean zB = ahn0Var.b();
                        int i14 = ahn0Var.f882a;
                        appCompatTextView3.layout(zB ? ((ahn0Var.getWidth() - appCompatTextView3.getMeasuredWidth()) - appCompatTextView.getMeasuredWidth()) - i14 : 0, i12, ahn0Var.b() ? (ahn0Var.getWidth() - appCompatTextView.getMeasuredWidth()) - i14 : appCompatTextView3.getMeasuredWidth(), i13);
                        appCompatTextView3.setLayoutDirection(0);
                        int i15 = i6 + i11;
                        int i16 = i8 + i6 + i11;
                        appCompatTextView.layout(ahn0Var.b() ? ahn0Var.getWidth() - appCompatTextView.getMeasuredWidth() : appCompatTextView3.getMeasuredWidth() + i14, i15, ahn0Var.b() ? ahn0Var.getWidth() : i14 + appCompatTextView.getMeasuredWidth() + appCompatTextView3.getMeasuredWidth(), i16);
                        appCompatTextView.setLayoutDirection(0);
                    }
                    iMax = Math.max(appCompatTextView2.getMeasuredHeight(), Math.max(appCompatTextView3.getMeasuredHeight(), appCompatTextView != null ? appCompatTextView.getMeasuredHeight() : 0)) + i5 + i6;
                } else {
                    ahn0Var = this;
                }
            }
            return;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int iMax;
        int size = View.MeasureSpec.getSize(i);
        int i4 = (int) (((double) size) * 0.6d);
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size < 0 ? 0 : size, Integer.MIN_VALUE), i2);
        }
        ArrayList<mb7> arrayList = this.h;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            int i5 = this.b;
            if (!zHasNext) {
                FrameLayout frameLayout2 = this.g;
                int measuredHeight = frameLayout2 != null ? frameLayout2.getMeasuredHeight() + i5 : 0;
                int i6 = 0;
                for (mb7 mb7Var : arrayList) {
                    SuccessBetInfoItem successBetInfoItem = mb7Var.d;
                    AppCompatTextView appCompatTextView = mb7Var.f21493a;
                    AppCompatTextView appCompatTextView2 = mb7Var.b;
                    if (successBetInfoItem instanceof SuccessBetInfoItem.Simple) {
                        iMax = Math.max(appCompatTextView.getMeasuredHeight(), appCompatTextView2.getMeasuredHeight());
                    } else {
                        if (successBetInfoItem instanceof SuccessBetInfoItem.WithCurrency) {
                            AppCompatTextView appCompatTextView3 = mb7Var.c;
                            iMax = Math.max(appCompatTextView.getMeasuredHeight(), Math.max(appCompatTextView2.getMeasuredHeight(), appCompatTextView3 != null ? appCompatTextView3.getMeasuredHeight() : 0));
                        } else {
                            i3 = 0;
                        }
                        i6 += i3;
                    }
                    i3 = iMax + i5;
                    i6 += i3;
                }
                setMeasuredDimension(View.resolveSize(size, i), View.resolveSize(measuredHeight + i6, i2));
                setTag("SUCCESS_BET_INFO_SECONDARY_VIEW");
                return;
            }
            mb7 mb7Var2 = (mb7) it.next();
            SuccessBetInfoItem successBetInfoItem2 = mb7Var2.d;
            AppCompatTextView appCompatTextView4 = mb7Var2.f21493a;
            AppCompatTextView appCompatTextView5 = mb7Var2.b;
            if (successBetInfoItem2 != null) {
                if (successBetInfoItem2 instanceof SuccessBetInfoItem.Simple) {
                    c(appCompatTextView4, size, i2);
                    int measuredWidth = appCompatTextView4.getMeasuredWidth();
                    if (measuredWidth > i4) {
                        measuredWidth = i4;
                    }
                    c(appCompatTextView4, measuredWidth, i2);
                    c(appCompatTextView5, (size - measuredWidth) - i5, i2);
                } else if (successBetInfoItem2 instanceof SuccessBetInfoItem.WithCurrency) {
                    AppCompatTextView appCompatTextView6 = mb7Var2.c;
                    if (appCompatTextView6 != null) {
                        c(appCompatTextView4, size, i2);
                        c(appCompatTextView6, size, i2);
                        int measuredWidth2 = appCompatTextView4.getMeasuredWidth();
                        if (measuredWidth2 > i4) {
                            measuredWidth2 = i4;
                        }
                        c(appCompatTextView4, measuredWidth2, i2);
                        c(appCompatTextView5, (((size - measuredWidth2) - i5) - appCompatTextView6.getMeasuredWidth()) - this.f882a, i2);
                    }
                }
            }
            t9f.b();
            return;
        }
    }
}
