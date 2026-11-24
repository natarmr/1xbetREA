package a;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class rz2 implements afv {
    public static boolean g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f31338a;
    public final Object b = new Object();
    public shu0 c;
    public boolean d;
    public ehf0 e;
    public final qz2 f;

    public rz2(AndroidComposeView androidComposeView) {
        this.f31338a = androidComposeView;
        qz2 qz2Var = new qz2(this, (byte) 0);
        this.f = qz2Var;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(qz2Var);
                this.d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new bc0(this, (byte) 1));
    }

    @Override // a.afv
    public final ehf0 a() {
        ehf0 ehf0Var = this.e;
        if (ehf0Var != null) {
            return ehf0Var;
        }
        ehf0 ehf0Var2 = new ehf0((byte) 5, false);
        this.e = ehf0Var2;
        return ehf0Var2;
    }

    @Override // a.afv
    public final dfv b() {
        ffv mfvVar;
        ffv kfvVar;
        dfv dfvVar;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.f31338a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    androidComposeView.getUniqueDrawingId();
                }
                if (i >= 29) {
                    kfvVar = new kfv();
                } else {
                    if (g) {
                        try {
                            mfvVar = new ifv(this.f31338a, new b6a(), new a6a());
                        } catch (Throwable unused) {
                            g = false;
                            mfvVar = new mfv(d(this.f31338a));
                        }
                    } else {
                        mfvVar = new mfv(d(this.f31338a));
                    }
                    kfvVar = mfvVar;
                }
                dfvVar = new dfv(kfvVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dfvVar;
    }

    @Override // a.afv
    public final void c(dfv dfvVar) {
        synchronized (this.b) {
            if (!dfvVar.s) {
                dfvVar.s = true;
                dfvVar.b();
            }
        }
    }

    public final chl d(AndroidComposeView androidComposeView) {
        shu0 shu0Var = this.c;
        if (shu0Var != null) {
            return shu0Var;
        }
        shu0 shu0Var2 = new shu0(androidComposeView.getContext());
        shu0Var2.setClipChildren(false);
        shu0Var2.setClipToPadding(false);
        shu0Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        androidComposeView.addView(shu0Var2, -1);
        this.c = shu0Var2;
        return shu0Var2;
    }
}
