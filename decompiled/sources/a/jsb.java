package a;

import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class jsb extends rms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17043a = 0;
    public Object b;
    public Object c;

    public jsb(sms0 sms0Var, gx3 gx3Var) {
        this.c = sms0Var;
        this.b = gx3Var;
    }

    @Override // a.rms0, a.dms0
    public void a() {
        switch (this.f17043a) {
            case 0:
                ((u6v) this.c).setVisibility(4);
                break;
        }
    }

    @Override // a.rms0, a.dms0
    public final void b(gms0 gms0Var) {
        switch (this.f17043a) {
            case 0:
                gms0Var.I(this);
                View view = (View) this.b;
                if (Build.VERSION.SDK_INT == 28) {
                    if (!ro.g) {
                        try {
                            ro.b();
                            Method declaredMethod = ro.b.getDeclaredMethod("removeGhost", View.class);
                            ro.f = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
                        }
                        ro.g = true;
                    }
                    Method method = ro.f;
                    if (method != null) {
                        try {
                            method.invoke(null, view);
                            break;
                        } catch (IllegalAccessException unused) {
                        } catch (InvocationTargetException e2) {
                            ohq.p(e2.getCause());
                            return;
                        }
                    }
                } else {
                    int i = x6v.g;
                    x6v x6vVar = (x6v) view.getTag(R.id.ghost_view);
                    if (x6vVar != null) {
                        int i2 = x6vVar.d - 1;
                        x6vVar.d = i2;
                        if (i2 <= 0) {
                            ((w6v) x6vVar.getParent()).removeView(x6vVar);
                        }
                    }
                }
                view.setTag(R.id.transition_transform, null);
                view.setTag(R.id.parent_matrix, null);
                break;
            default:
                ((ArrayList) ((gx3) this.b).get(((sms0) this.c).b)).remove(gms0Var);
                gms0Var.I(this);
                break;
        }
    }

    @Override // a.rms0, a.dms0
    public void d() {
        switch (this.f17043a) {
            case 0:
                ((u6v) this.c).setVisibility(0);
                break;
        }
    }

    public /* synthetic */ jsb() {
    }
}
