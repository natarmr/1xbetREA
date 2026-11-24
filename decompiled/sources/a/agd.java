package a;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class agd extends zfd implements riu0, wmv, i0h0, kg60, ze50, zg60 {
    public final fbv b = new fbv();
    public final ywu c = new ywu(new qfd(this, (byte) 1));
    public final nw20 d;
    public piu0 e;
    public final xfd f;
    public final n0o0 g;
    public final AtomicInteger h;
    public final yfd i;
    public final CopyOnWriteArrayList j;
    public final CopyOnWriteArrayList k;
    public final CopyOnWriteArrayList l;
    public final CopyOnWriteArrayList m;
    public final CopyOnWriteArrayList n;
    public final CopyOnWriteArrayList o;
    public final CopyOnWriteArrayList p;
    public boolean q;
    public boolean r;
    public final n0o0 s;
    public final n0o0 t;
    public final n0o0 u;

    public agd() {
        final byte b = 1;
        h0h0 h0h0Var = new h0h0(this, new a7g0(this, (byte) 12));
        nw20 nw20Var = new nw20(h0h0Var);
        this.d = nw20Var;
        this.f = new xfd(this);
        this.g = maz.b(new rfd(this, (byte) 1));
        this.h = new AtomicInteger();
        this.i = new yfd(this);
        this.j = new CopyOnWriteArrayList();
        this.k = new CopyOnWriteArrayList();
        this.l = new CopyOnWriteArrayList();
        this.m = new CopyOnWriteArrayList();
        this.n = new CopyOnWriteArrayList();
        this.o = new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.s = maz.b(new rfd(this, (byte) 2));
        glz glzVar = this.f44297a;
        if (glzVar == null) {
            jf4.n("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final byte b2 = 0;
        glzVar.a(new zkz(this) { // from class: a.tfd
            public final /* synthetic */ agd b;

            {
                this.b = this;
            }

            @Override // a.zkz
            public final void l(clz clzVar, kkz kkzVar) {
                Window window;
                View viewPeekDecorView;
                byte b3 = b2;
                agd agdVar = this.b;
                switch (b3) {
                    case 0:
                        if (kkzVar == kkz.ON_STOP && (window = agdVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (kkzVar == kkz.ON_DESTROY) {
                            agdVar.b.b = null;
                            if (!agdVar.isChangingConfigurations()) {
                                agdVar.g().a();
                            }
                            xfd xfdVar = agdVar.f;
                            agd agdVar2 = xfdVar.d;
                            agdVar2.getWindow().getDecorView().removeCallbacks(xfdVar);
                            agdVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xfdVar);
                        }
                        break;
                }
            }
        });
        this.f44297a.a(new zkz(this) { // from class: a.tfd
            public final /* synthetic */ agd b;

            {
                this.b = this;
            }

            @Override // a.zkz
            public final void l(clz clzVar, kkz kkzVar) {
                Window window;
                View viewPeekDecorView;
                byte b3 = b;
                agd agdVar = this.b;
                switch (b3) {
                    case 0:
                        if (kkzVar == kkz.ON_STOP && (window = agdVar.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (kkzVar == kkz.ON_DESTROY) {
                            agdVar.b.b = null;
                            if (!agdVar.isChangingConfigurations()) {
                                agdVar.g().a();
                            }
                            xfd xfdVar = agdVar.f;
                            agd agdVar2 = xfdVar.d;
                            agdVar2.getWindow().getDecorView().removeCallbacks(xfdVar);
                            agdVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(xfdVar);
                        }
                        break;
                }
            }
        });
        this.f44297a.a(new ige0(this, b));
        h0h0Var.a();
        zzg0.b(this);
        ((kd30) nw20Var.b).S("android:support:activity-result", new ufd(this, b2));
        m(new vfd(this, b2));
        this.t = maz.b(new rfd(this, (byte) 3));
        this.u = maz.b(new rfd(this, (byte) 4));
    }

    public static final void q(agd agdVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!Intrinsics.d(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!Intrinsics.d(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // a.ze50
    public final ye50 b() {
        return k().c().c;
    }

    @Override // a.zg60
    public final void e(sbe sbeVar) {
        sbeVar.getClass();
        this.j.remove(sbeVar);
    }

    @Override // a.riu0
    public final piu0 g() {
        if (getApplication() == null) {
            jf4.n("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        piu0 piu0Var = this.e;
        if (piu0Var == null) {
            wfd wfdVar = (wfd) getLastNonConfigurationInstance();
            if (wfdVar != null) {
                this.e = wfdVar.f39066a;
            }
            piu0Var = this.e;
            if (piu0Var == null) {
                piu0Var = new piu0();
                this.e = piu0Var;
            }
        }
        piu0Var.getClass();
        return piu0Var;
    }

    @Override // a.i0h0
    public final kd30 h() {
        return (kd30) this.d.b;
    }

    @Override // a.zg60
    public final void i(sbe sbeVar) {
        sbeVar.getClass();
        this.j.add(sbeVar);
    }

    @Override // a.kg60
    public final jg60 k() {
        return (jg60) this.u.getValue();
    }

    public final void m(bh60 bh60Var) {
        fbv fbvVar = this.b;
        fbvVar.getClass();
        Context context = (Context) fbvVar.b;
        if (context != null) {
            bh60Var.a(context);
        }
        ((CopyOnWriteArraySet) fbvVar.f9280a).add(bh60Var);
    }

    @Override // a.wmv
    public final miu0 n() {
        return (miu0) this.t.getValue();
    }

    @Override // a.wmv
    public final by40 o() {
        by40 by40Var = new by40(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = by40Var.f38875a;
        if (application != null) {
            linkedHashMap.put(liu0.d, getApplication());
        }
        linkedHashMap.put(zzg0.f45252a, this);
        linkedHashMap.put(zzg0.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(zzg0.c, extras);
        }
        return by40Var;
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.i.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((cnk) this.s.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.j.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((sbe) it.next()).accept(configuration);
        }
    }

    @Override // a.zfd, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.d.p(bundle);
        fbv fbvVar = this.b;
        fbvVar.b = this;
        Iterator it = ((CopyOnWriteArraySet) fbvVar.f9280a).iterator();
        while (it.hasNext()) {
            ((bh60) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i = ylf0.b;
        wlf0.b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((l1r) it.next()).f19270a.n();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
            while (it.hasNext()) {
                if (((l1r) it.next()).f19270a.s()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.q = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.q = false;
            Iterator it = this.m.iterator();
            it.getClass();
            while (it.hasNext()) {
                sbe sbeVar = (sbe) it.next();
                configuration.getClass();
                sbeVar.accept(new gx40(z));
            }
        } catch (Throwable th) {
            this.q = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.l.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((sbe) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((l1r) it.next()).f19270a.t();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.r = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.r = false;
            Iterator it = this.n.iterator();
            it.getClass();
            while (it.hasNext()) {
                sbe sbeVar = (sbe) it.next();
                configuration.getClass();
                sbeVar.accept(new ot90(z));
            }
        } catch (Throwable th) {
            this.r = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        xi70 xi70Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            xi70Var = new xi70();
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            xi70Var = new xi70();
        } else {
            xi70Var = new xi70();
        }
        Iterator it = this.o.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((sbe) it.next()).accept(xi70Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.c.c).iterator();
        while (it.hasNext()) {
            ((l1r) it.next()).f19270a.w();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.i.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        wfd wfdVar;
        piu0 piu0Var = this.e;
        if (piu0Var == null && (wfdVar = (wfd) getLastNonConfigurationInstance()) != null) {
            piu0Var = wfdVar.f39066a;
        }
        if (piu0Var == null) {
            return null;
        }
        wfd wfdVar2 = new wfd();
        wfdVar2.f39066a = piu0Var;
        return wfdVar2;
    }

    @Override // a.zfd, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        glz glzVar = this.f44297a;
        if (glzVar != null) {
            glzVar.g(lkz.c);
        }
        super.onSaveInstanceState(bundle);
        this.d.q(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((sbe) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.p.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void p() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (afn0.w()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            zcr zcrVar = (zcr) this.g.getValue();
            synchronized (zcrVar.b) {
                try {
                    zcrVar.c = true;
                    Iterator it = zcrVar.d.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                    zcrVar.d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        p();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // a.clz
    public final glz x() {
        return this.f44297a;
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        p();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        p();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f.a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.q) {
            return;
        }
        Iterator it = this.m.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((sbe) it.next()).accept(new gx40(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.r) {
            return;
        }
        Iterator it = this.n.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((sbe) it.next()).accept(new ot90(z));
        }
    }
}
