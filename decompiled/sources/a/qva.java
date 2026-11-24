package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.presentation.view.CarriageContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class qva extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2 f29377a;
    public final TextView b;
    public final TextView c;
    public int d;
    public double e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qva(Context context, Function2 function2) {
        super(context);
        context.getClass();
        function2.getClass();
        this.f29377a = function2;
        float dimension = getResources().getDimension(R.dimen.text_12);
        final byte b = 0;
        setWillNotDraw(false);
        setPadding(0, 0, 0, 0);
        TextView textView = new TextView(getContext());
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        this.c = textView2;
        textView.setTextSize(0, dimension);
        textView2.setTextSize(0, dimension);
        textView.setGravity(17);
        textView2.setGravity(17);
        textView2.setTextColor(-1);
        textView.setTextColor(-1);
        addView(textView);
        addView(textView2);
        ymx ymxVar = ymx.INTERVAL_500;
        dyb.N(textView, ymxVar, new Function1(this) { // from class: a.ova
            public final /* synthetic */ qva b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                qva qvaVar = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        view.getClass();
                        if (!Intrinsics.d(qvaVar.b.getText(), "-")) {
                            Function2 function3 = qvaVar.f29377a;
                            Object tag = qvaVar.getTag();
                            tag.getClass();
                            qic qicVar = qic.f28784a;
                            function3.invoke((Integer) tag, qicVar);
                            qvaVar.a(qicVar);
                        }
                        break;
                    default:
                        view.getClass();
                        if (!Intrinsics.d(qvaVar.c.getText(), "-")) {
                            Function2 function4 = qvaVar.f29377a;
                            Object tag2 = qvaVar.getTag();
                            tag2.getClass();
                            qic qicVar2 = qic.b;
                            function4.invoke((Integer) tag2, qicVar2);
                            qvaVar.a(qicVar2);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.N(textView2, ymxVar, new Function1(this) { // from class: a.ova
            public final /* synthetic */ qva b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                qva qvaVar = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        view.getClass();
                        if (!Intrinsics.d(qvaVar.b.getText(), "-")) {
                            Function2 function3 = qvaVar.f29377a;
                            Object tag = qvaVar.getTag();
                            tag.getClass();
                            qic qicVar = qic.f28784a;
                            function3.invoke((Integer) tag, qicVar);
                            qvaVar.a(qicVar);
                        }
                        break;
                    default:
                        view.getClass();
                        if (!Intrinsics.d(qvaVar.c.getText(), "-")) {
                            Function2 function4 = qvaVar.f29377a;
                            Object tag2 = qvaVar.getTag();
                            tag2.getClass();
                            qic qicVar2 = qic.b;
                            function4.invoke((Integer) tag2, qicVar2);
                            qvaVar.a(qicVar2);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        e();
        textView2.setIncludeFontPadding(false);
        textView2.setPadding(0, 0, 0, 0);
        textView.setIncludeFontPadding(false);
        textView.setPadding(0, 0, 0, 0);
    }

    public final void a(qic qicVar) {
        qicVar.getClass();
        qic qicVar2 = qic.b;
        TextView textView = this.c;
        TextView textView2 = this.b;
        if (qicVar == qicVar2) {
            textView2.setBackgroundResource(R.drawable.carriage_back);
            textView.setBackgroundResource(R.drawable.carriage_back_fill);
            TypedValue typedValue = j5d.f15927a;
            Context context = getContext();
            context.getClass();
            textView2.setTextColor(j5d.a(context, R.attr.uikitTextPrimary, false));
            Context context2 = getContext();
            context2.getClass();
            textView.setTextColor(j5d.a(context2, R.attr.uikitBackgroundContent, false));
            return;
        }
        if (qicVar == qic.f28784a) {
            textView2.setBackgroundResource(R.drawable.carriage_back_fill);
            textView.setBackgroundResource(R.drawable.carriage_back);
            TypedValue typedValue2 = j5d.f15927a;
            Context context3 = getContext();
            context3.getClass();
            textView2.setTextColor(j5d.a(context3, R.attr.uikitBackgroundContent, false));
            Context context4 = getContext();
            context4.getClass();
            textView.setTextColor(j5d.a(context4, R.attr.uikitTextPrimary, false));
        }
    }

    public final void b() {
        TextView textView = this.c;
        textView.setBackgroundResource(R.drawable.carriage_back);
        TextView textView2 = this.b;
        textView2.setBackgroundResource(R.drawable.carriage_back);
        textView.setClickable(true);
        textView2.setClickable(true);
        TypedValue typedValue = j5d.f15927a;
        Context context = getContext();
        context.getClass();
        textView.setTextColor(j5d.a(context, R.attr.uikitTextPrimary, false));
        Context context2 = getContext();
        context2.getClass();
        textView2.setTextColor(j5d.a(context2, R.attr.uikitTextPrimary, false));
        invalidate();
    }

    public final void c(sbq sbqVar, sbq sbqVar2) {
        sbqVar.getClass();
        sbqVar2.getClass();
        String str = sbqVar.b == 0.0d ? "-" : sbqVar.f31947a;
        String str2 = sbqVar2.b != 0.0d ? sbqVar2.f31947a : "-";
        wbq wbqVar = sbqVar.e;
        wbq wbqVar2 = wbq.b;
        TextView textView = this.b;
        TextView textView2 = this.c;
        if (wbqVar == wbqVar2) {
            d(textView2, str);
            d(textView, str2);
        } else {
            d(textView, str);
            d(textView2, str2);
        }
        this.e = sbqVar.c;
    }

    public final void d(TextView textView, String str) {
        float fMeasureText = textView.getPaint().measureText(str);
        int measuredWidth = textView.getMeasuredWidth();
        byte b = 0;
        if (measuredWidth > 0) {
            if (fMeasureText > measuredWidth) {
                str = kotlin.text.c.r(str, Separators.SLASH, "/\n", false);
            }
            textView.setText(str);
        } else if (!textView.isLaidOut() || textView.isLayoutRequested()) {
            textView.addOnLayoutChangeListener(new pva(this, textView, str, b));
        } else {
            d(textView, str);
        }
    }

    public final void e() {
        TextView textView = this.c;
        textView.setBackgroundResource(R.color.static_transparent);
        TextView textView2 = this.b;
        textView2.setBackgroundResource(R.color.static_transparent);
        textView.setClickable(false);
        textView2.setClickable(false);
        TypedValue typedValue = j5d.f15927a;
        Context context = getContext();
        context.getClass();
        textView.setTextColor(j5d.a(context, R.attr.uikitSecondary, false));
        Context context2 = getContext();
        context2.getClass();
        textView2.setTextColor(j5d.a(context2, R.attr.uikitSecondary, false));
        invalidate();
    }

    public final double getPrice() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = (int) (getMeasuredWidth() * 0.03f);
        getChildAt(0).layout(measuredWidth, 0, getChildAt(0).getMeasuredWidth() + measuredWidth, this.d);
        int i5 = measuredWidth * 2;
        getChildAt(1).layout(getChildAt(0).getWidth() + i5, 0, (getChildAt(1).getMeasuredWidth() * 2) + i5, this.d);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() != 0 && getMeasuredWidth() / getMeasuredHeight() < 5) {
            setMeasuredDimension(getMeasuredWidth(), View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() / 5, 1073741824));
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (getMeasuredWidth() * 0.455f), 1073741824);
        ViewParent parent = getParent();
        parent.getClass();
        int height = (int) (((CarriageContainer) parent).getHeight() * 0.05f);
        this.d = height;
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(height, 1073741824);
        this.c.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.b.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
    }
}
