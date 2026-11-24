package a;

import android.content.Context;
import android.content.ContextWrapper;
import android.gov.nist.core.Separators;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class xe3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f40724a;
    public final String b;
    public Method c;
    public Context d;

    public xe3(View view, String str) {
        this.f40724a = view;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        Method method2 = this.c;
        if (method2 == null) {
            View view2 = this.f40724a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + Separators.QUOTE;
                    }
                    StringBuilder sbT = kng0.t("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbT.append(view2.getClass());
                    sbT.append(str);
                    throw new IllegalStateException(sbT.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.c = method;
                        this.d = context;
                        method2 = method;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            method2.invoke(this.d, view);
        } catch (IllegalAccessException e) {
            hny.q("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            hny.q("Could not execute method for android:onClick", e2);
        }
    }
}
