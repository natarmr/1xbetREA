package a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class hgd extends Dialog implements clz, kg60, ze50, i0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public glz f13012a;
    public final nw20 b;
    public final n0o0 c;
    public final n0o0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgd(Context context, int i) {
        super(context, i);
        context.getClass();
        this.b = new nw20(new h0h0(this, new a7g0(this, (byte) 12)));
        final byte b = 0;
        this.c = maz.b(new Function0(this) { // from class: a.ggd
            public final /* synthetic */ hgd b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                hgd hgdVar = this.b;
                switch (b2) {
                    case 0:
                        cnk cnkVar = new cnk();
                        hgdVar.b().b(cnkVar);
                        return cnkVar;
                    default:
                        return new jg60(new w1(hgdVar, (byte) 28));
                }
            }
        });
        final byte b2 = 1;
        this.d = maz.b(new Function0(this) { // from class: a.ggd
            public final /* synthetic */ hgd b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                hgd hgdVar = this.b;
                switch (b3) {
                    case 0:
                        cnk cnkVar = new cnk();
                        hgdVar.b().b(cnkVar);
                        return cnkVar;
                    default:
                        return new jg60(new w1(hgdVar, (byte) 28));
                }
            }
        });
    }

    public static final void d(hgd hgdVar) {
        super.onBackPressed();
    }

    public final glz a() {
        glz glzVar = this.f13012a;
        if (glzVar != null) {
            return glzVar;
        }
        glz glzVar2 = new glz(this, true);
        this.f13012a = glzVar2;
        return glzVar2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    @Override // a.ze50
    public final ye50 b() {
        return k().c().c;
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // a.i0h0
    public final kd30 h() {
        return (kd30) this.b.b;
    }

    @Override // a.kg60
    public final jg60 k() {
        return (jg60) this.d.getValue();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        ((cnk) this.c.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            jg60 jg60VarK = k();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            jg60VarK.d(onBackInvokedDispatcher);
        }
        this.b.p(bundle);
        a().d(kkz.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.b.q(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a().d(kkz.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        a().d(kkz.ON_DESTROY);
        this.f13012a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // a.clz
    public final glz x() {
        return a();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
