package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class yoe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f42981a;
    public final Function0 b;
    public DsCounter c;
    public r0m d;
    public int e;
    public int f;
    public int g;
    public Integer h;
    public String i;
    public Integer j;

    public yoe(View view, Function0 function0) {
        view.getClass();
        this.f42981a = view;
        this.b = function0;
        this.d = r0m.l;
        this.e = 8388693;
    }

    public final void a(int i) {
        Context context = this.f42981a.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, bqd0.y);
        this.e = typedArrayObtainStyledAttributes.getInt(2, this.e);
        this.f = ktt0.q(typedArrayObtainStyledAttributes, 4, 7);
        this.g = ktt0.q(typedArrayObtainStyledAttributes, 6, 8);
        this.d = (r0m) r0m.t.get(typedArrayObtainStyledAttributes.getInt(3, 0));
        Integer num = this.h;
        Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(0, num != null ? num.intValue() : 0));
        String string = typedArrayObtainStyledAttributes.getString(9);
        if (string == null) {
            string = this.i;
        }
        d(numValueOf, string);
        DsCounter dsCounter = this.c;
        if (dsCounter != null) {
            dsCounter.g(this.e, this.f, this.g);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(AttributeSet attributeSet, int i) {
        Object g0g0Var;
        Object g0g0Var2;
        Context context = this.f42981a.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.y, i, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(2, this.e);
        this.f = ktt0.q(typedArrayObtainStyledAttributes, 4, 7);
        this.g = ktt0.q(typedArrayObtainStyledAttributes, 6, 8);
        this.d = (r0m) r0m.t.get(typedArrayObtainStyledAttributes.getInt(3, 0));
        try {
            e0g0 e0g0Var = j0g0.b;
            tnq0.i(typedArrayObtainStyledAttributes, 0);
            g0g0Var = Integer.valueOf(typedArrayObtainStyledAttributes.getInt(0, 0));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        Integer num = (Integer) g0g0Var;
        try {
            tnq0.i(typedArrayObtainStyledAttributes, 9);
            g0g0Var2 = typedArrayObtainStyledAttributes.getString(9);
            if (g0g0Var2 == null) {
                throw new IllegalStateException("Attribute value could not be coerced to String.");
            }
        } catch (Throwable th2) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        d(num, (String) (g0g0Var2 instanceof g0g0 ? null : g0g0Var2));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void c(Integer num) {
        this.h = num;
        if (num != null && this.c == null) {
            View view = this.f42981a;
            Context context = view.getContext();
            context.getClass();
            DsCounter dsCounter = new DsCounter(context, null, 6);
            dsCounter.setComponentStyle(this.d);
            dsCounter.g(this.e, this.f, this.g);
            dsCounter.b(view, this.b);
            Integer num2 = this.j;
            if (num2 != null) {
                dsCounter.i(num2.intValue());
            }
            this.c = dsCounter;
        }
        DsCounter dsCounter2 = this.c;
        if (dsCounter2 != null) {
            dsCounter2.setCount(num);
        }
    }

    public final void d(Integer num, String str) {
        if (str == null) {
            c(num);
            return;
        }
        this.h = num;
        this.i = str;
        if (num != null && this.c == null) {
            View view = this.f42981a;
            Context context = view.getContext();
            context.getClass();
            DsCounter dsCounter = new DsCounter(context, null, 6);
            dsCounter.setComponentStyle(this.d);
            dsCounter.g(this.e, this.f, this.g);
            dsCounter.b(view, this.b);
            Integer num2 = this.j;
            if (num2 != null) {
                dsCounter.i(num2.intValue());
            }
            this.c = dsCounter;
        }
        DsCounter dsCounter2 = this.c;
        if (dsCounter2 != null) {
            dsCounter2.d(num, str);
        }
    }

    public final void e(Integer num, int i, int i2) {
        this.h = num;
        if (num != null && this.c == null) {
            View view = this.f42981a;
            Context context = view.getContext();
            context.getClass();
            DsCounter dsCounter = new DsCounter(context, null, 6);
            dsCounter.setComponentStyle(this.d);
            dsCounter.g(this.e, i, i2);
            dsCounter.b(view, this.b);
            Integer num2 = this.j;
            if (num2 != null) {
                dsCounter.i(num2.intValue());
            }
            this.c = dsCounter;
        }
        DsCounter dsCounter2 = this.c;
        if (dsCounter2 != null) {
            dsCounter2.setCount(num);
        }
    }

    public final void f(int i) {
        DsCounter dsCounter = this.c;
        if (dsCounter == null) {
            this.j = Integer.valueOf(i);
        } else if (dsCounter != null) {
            dsCounter.i(i);
        }
    }
}
