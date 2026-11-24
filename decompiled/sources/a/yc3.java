package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class yc3 extends kxq implements bd3 {
    public pd3 A;

    public yc3() {
        ((kd30) this.d.b).S("androidx:appcompat", new wc3(this));
        m(new xc3(this));
    }

    @Override // a.agd, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        t().c(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(t().e(context));
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        t().l();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // a.zfd, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        t().l();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return t().h(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        return t().k();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        t().n();
    }

    @Override // a.agd, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t().p(configuration);
    }

    @Override // a.kxq, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        t().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // a.kxq, a.agd, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentB;
        if (!super.onMenuItemSelected(i, menuItem)) {
            qhv0 qhv0VarL = t().l();
            if (menuItem.getItemId() != 16908332 || qhv0VarL == null || (((rwq0) qhv0VarL.e).b & 4) == 0 || (intentB = uvw.B(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentB)) {
                navigateUpTo(intentB);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentB2 = uvw.B(this);
            if (intentB2 == null) {
                intentB2 = uvw.B(this);
            }
            if (intentB2 != null) {
                ComponentName component = intentB2.getComponent();
                if (component == null) {
                    component = intentB2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentC = uvw.C(this, component);
                    while (intentC != null) {
                        arrayList.add(size, intentC);
                        intentC = uvw.C(this, intentC.getComponent());
                    }
                    arrayList.add(intentB2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                jf4.n("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        t().s(bundle);
    }

    @Override // a.kxq, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        t().t();
    }

    @Override // a.kxq, android.app.Activity
    public void onStart() {
        super.onStart();
        t().v();
    }

    @Override // a.kxq, android.app.Activity
    public final void onStop() {
        super.onStop();
        t().w();
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        t().D(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        t().l();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // a.agd, android.app.Activity
    public final void setContentView(int i) {
        p();
        t().z(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        t().C(i);
    }

    public hd3 t() {
        pd3 pd3Var = this.A;
        if (pd3Var != null) {
            return pd3Var;
        }
        gd3 gd3Var = hd3.f12850a;
        pd3 pd3Var2 = new pd3(this, null, this, this);
        this.A = pd3Var2;
        return pd3Var2;
    }

    @Override // a.agd, android.app.Activity
    public void setContentView(View view) {
        p();
        t().A(view);
    }

    @Override // a.agd, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        t().B(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
