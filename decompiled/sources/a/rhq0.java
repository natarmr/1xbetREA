package a;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class rhq0 extends v46 {
    public final dc3 A;
    public final View u;
    public final ygq0 v;
    public final cym0 w;
    public final cym0 x;
    public final Pair y;
    public final cym0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhq0(View view, ygq0 ygq0Var, cym0 cym0Var, cym0 cym0Var2, Pair pair, cym0 cym0Var3) {
        super(view);
        ygq0Var.getClass();
        this.u = view;
        this.v = ygq0Var;
        this.w = cym0Var;
        this.x = cym0Var2;
        this.y = pair;
        this.z = cym0Var3;
        int i = R.id.custom_time_title;
        TextView textView = (TextView) yum0.f(view, R.id.custom_time_title);
        if (textView != null) {
            i = R.id.text;
            if (((TextView) yum0.f(view, R.id.text)) != null) {
                i = R.id.txt_end_period;
                TextView textView2 = (TextView) yum0.f(view, R.id.txt_end_period);
                if (textView2 != null) {
                    i = R.id.txt_start_period;
                    TextView textView3 = (TextView) yum0.f(view, R.id.txt_start_period);
                    if (textView3 != null) {
                        this.A = new dc3((ViewGroup) view, textView, (View) textView2, (View) textView3, (byte) 2);
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.v46
    public final void t(Object obj) {
        int iA;
        final rhq0 rhq0Var;
        ygq0 ygq0Var = (ygq0) obj;
        ygq0Var.getClass();
        dc3 dc3Var = this.A;
        TextView textView = (TextView) dc3Var.e;
        TextView textView2 = (TextView) dc3Var.d;
        TextView textView3 = (TextView) dc3Var.c;
        ygq0 ygq0Var2 = this.v;
        Object[] objArr = 0;
        View view = this.u;
        if (ygq0Var2 == ygq0Var) {
            TypedValue typedValue = j5d.f15927a;
            Context context = view.getContext();
            context.getClass();
            iA = j5d.a(context, R.attr.uikitPrimary, false);
        } else {
            TypedValue typedValue2 = j5d.f15927a;
            Context context2 = view.getContext();
            context2.getClass();
            iA = j5d.a(context2, R.attr.uikitTextPrimary, false);
        }
        textView.setTextColor(iA);
        Pair pair = this.y;
        Object obj2 = pair.f46059a;
        Object obj3 = pair.b;
        if (((ynq0) obj2).f42952a != -1) {
            rdj rdjVar = rdj.f30294a;
            boolean zIs24HourFormat = DateFormat.is24HourFormat(view.getContext());
            ynq0 ynq0Var = (ynq0) obj2;
            long j = ynq0Var.f42952a;
            textView2.setText(rdj.i(ynq0Var, Boolean.valueOf(zIs24HourFormat), new fup0(2, this, rhq0.class, "selectDatePattern", "selectDatePattern(Ljava/util/Calendar;Ljava/util/Calendar;)Lorg/xplatform/ui_core/format/DateTimePattern;", 0, (byte) 3)));
        }
        ynq0 ynq0Var2 = (ynq0) obj3;
        if (ynq0Var2.f42952a != r15) {
            rdj rdjVar2 = rdj.f30294a;
            boolean zIs24HourFormat2 = DateFormat.is24HourFormat(view.getContext());
            long j2 = ynq0Var2.f42952a;
            rhq0Var = this;
            textView3.setText(rdj.i(ynq0Var2, Boolean.valueOf(zIs24HourFormat2), new fup0(2, rhq0Var, rhq0.class, "selectDatePattern", "selectDatePattern(Ljava/util/Calendar;Ljava/util/Calendar;)Lorg/xplatform/ui_core/format/DateTimePattern;", 0, (byte) 4)));
        } else {
            rhq0Var = this;
        }
        final Object[] objArr2 = objArr == true ? 1 : 0;
        dyb.O(textView2, new Function1(rhq0Var) { // from class: a.qhq0
            public final /* synthetic */ rhq0 b;

            {
                this.b = rhq0Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                byte b = objArr2;
                rhq0 rhq0Var2 = this.b;
                View view2 = (View) obj4;
                switch (b) {
                    case 0:
                        view2.getClass();
                        rhq0Var2.w.invoke();
                        break;
                    case 1:
                        view2.getClass();
                        rhq0Var2.x.invoke();
                        break;
                    default:
                        view2.getClass();
                        rhq0Var2.z.invoke();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b = 1;
        textView3.setEnabled(((ynq0) obj2).f42952a != -1);
        dyb.O(textView3, new Function1(rhq0Var) { // from class: a.qhq0
            public final /* synthetic */ rhq0 b;

            {
                this.b = rhq0Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                byte b2 = b;
                rhq0 rhq0Var2 = this.b;
                View view2 = (View) obj4;
                switch (b2) {
                    case 0:
                        view2.getClass();
                        rhq0Var2.w.invoke();
                        break;
                    case 1:
                        view2.getClass();
                        rhq0Var2.x.invoke();
                        break;
                    default:
                        view2.getClass();
                        rhq0Var2.z.invoke();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 2;
        dyb.O((TextView) dc3Var.e, new Function1(rhq0Var) { // from class: a.qhq0
            public final /* synthetic */ rhq0 b;

            {
                this.b = rhq0Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj4) {
                byte b3 = b2;
                rhq0 rhq0Var2 = this.b;
                View view2 = (View) obj4;
                switch (b3) {
                    case 0:
                        view2.getClass();
                        rhq0Var2.w.invoke();
                        break;
                    case 1:
                        view2.getClass();
                        rhq0Var2.x.invoke();
                        break;
                    default:
                        view2.getClass();
                        rhq0Var2.z.invoke();
                        break;
                }
                return Unit.f46060a;
            }
        });
    }
}
