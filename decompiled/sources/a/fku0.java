package a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.SearchView;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes.dex */
public final class fku0 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gku0 f9711a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ AttributeSet d;
    public final /* synthetic */ View e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fku0(gku0 gku0Var, String str, Context context, AttributeSet attributeSet, View view) {
        super(0);
        this.f9711a = gku0Var;
        this.b = str;
        this.c = context;
        this.d = attributeSet;
        this.e = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object g0g0Var;
        Object g0g0Var2;
        Constructor<?> constructor;
        gku0 gku0Var = this.f9711a;
        hd3 hd3Var = gku0Var.j;
        View view = this.e;
        String str = this.b;
        Context context = this.c;
        AttributeSet attributeSet = this.d;
        try {
            e0g0 e0g0Var = j0g0.b;
            str.getClass();
            context.getClass();
            attributeSet.getClass();
            g0g0Var = hd3Var.g(view, str, context, attributeSet);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            ApplicationActivity applicationActivity = gku0Var.k;
            str.getClass();
            attributeSet.getClass();
            g0g0Var = hd3Var.g(view, str, applicationActivity, attributeSet);
        }
        View webView = (View) g0g0Var;
        Object objNewInstance = null;
        if (webView == null) {
            try {
                g0g0Var2 = gku0.E(str, context, attributeSet);
            } catch (Throwable th2) {
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var2 = new g0g0(th2);
            }
            if (g0g0Var2 instanceof g0g0) {
                g0g0Var2 = null;
            }
            webView = (View) g0g0Var2;
        }
        if (Intrinsics.d(str, "WebView")) {
            context.getClass();
            w4v0 w4v0Var = new w4v0(context);
            gku0Var.d(w4v0Var);
            Context contextE = hd3Var.e(w4v0Var);
            contextE.getClass();
            webView = new WebView(b8k0.H(contextE), attributeSet);
        }
        if ((webView instanceof WebView) && !Intrinsics.d(str, "WebView")) {
            Constructor<?>[] constructors = ((WebView) webView).getClass().getConstructors();
            constructors.getClass();
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 2 && Intrinsics.d(constructor.getParameterTypes()[0], Context.class) && Intrinsics.d(constructor.getParameterTypes()[1], AttributeSet.class)) {
                    break;
                }
                i++;
            }
            if (constructor != null) {
                context.getClass();
                w4v0 w4v0Var2 = new w4v0(context);
                gku0Var.d(w4v0Var2);
                Context contextE2 = hd3Var.e(w4v0Var2);
                contextE2.getClass();
                objNewInstance = constructor.newInstance(b8k0.H(contextE2), attributeSet);
            }
            webView = (View) objNewInstance;
        }
        return Intrinsics.d(str, "SearchView") ? new SearchView(context, attributeSet) : webView;
    }
}
