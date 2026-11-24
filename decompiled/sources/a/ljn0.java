package a;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class ljn0 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] d = {MenuItem.class};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20160a = 0;
    public Object b;
    public Object c;

    public ljn0(sz30 sz30Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.c = sz30Var;
        this.b = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean zBooleanValue;
        switch (this.f20160a) {
            case 0:
                Object obj = this.b;
                Method method = (Method) this.c;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    ohq.p(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.b).onMenuItemClick(((sz30) this.c).m(menuItem));
        }
    }

    public /* synthetic */ ljn0() {
    }
}
