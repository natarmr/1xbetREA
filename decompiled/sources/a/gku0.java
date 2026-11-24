package a;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes.dex */
public final class gku0 extends hd3 implements LayoutInflater.Factory2 {
    public final hd3 j;
    public final ApplicationActivity k;

    public gku0(hd3 hd3Var, ApplicationActivity applicationActivity, hny hnyVar) {
        this.j = hd3Var;
        this.k = applicationActivity;
    }

    public static View E(String str, Context context, AttributeSet attributeSet) throws IllegalAccessException {
        if (Build.VERSION.SDK_INT >= 29) {
            return LayoutInflater.from(context).createView(context, str, null, attributeSet);
        }
        if (Intrinsics.d(str, "ViewStub")) {
            return null;
        }
        wiz wizVar = new wiz(context);
        str.getClass();
        attributeSet.getClass();
        n0o0 n0o0Var = wiz.f39241a;
        Object obj = ((Field) n0o0Var.getValue()).get(wizVar);
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        objArr[0] = context;
        ((Field) n0o0Var.getValue()).set(wizVar, objArr);
        return wizVar.createView(str, null, attributeSet);
    }

    @Override // a.hd3
    public final void A(View view) {
        this.j.A(view);
    }

    @Override // a.hd3
    public final void B(View view, ViewGroup.LayoutParams layoutParams) {
        this.j.B(view, layoutParams);
    }

    @Override // a.hd3
    public final void C(int i) {
        this.j.C(i);
    }

    @Override // a.hd3
    public final void D(CharSequence charSequence) {
        this.j.D(charSequence);
    }

    @Override // a.hd3
    public final void c(View view, ViewGroup.LayoutParams layoutParams) {
        this.j.c(view, layoutParams);
    }

    @Override // a.hd3
    public final void d(Context context) {
        this.j.d(context);
    }

    @Override // a.hd3
    public final Context e(Context context) {
        context.getClass();
        d(context);
        Context contextE = this.j.e(context);
        contextE.getClass();
        return b8k0.H(contextE);
    }

    @Override // a.hd3
    public final View g(View view, String str, Context context, AttributeSet attributeSet) {
        str.getClass();
        context.getClass();
        attributeSet.getClass();
        c8x c8xVar = new c8x(str, context, attributeSet, view, new fku0(this, str, context, attributeSet, view));
        List list = k5n0.f17729a;
        if (list == null) {
            list = iun.f15405a;
        }
        return new tyj(list, 0, c8xVar).e(c8xVar).f5672a;
    }

    @Override // a.hd3
    public final View h(int i) {
        return this.j.h(i);
    }

    @Override // a.hd3
    public final Context i() {
        return this.j.i();
    }

    @Override // a.hd3
    public final int j() {
        return this.j.j();
    }

    @Override // a.hd3
    public final MenuInflater k() {
        MenuInflater menuInflaterK = this.j.k();
        menuInflaterK.getClass();
        return menuInflaterK;
    }

    @Override // a.hd3
    public final qhv0 l() {
        return this.j.l();
    }

    @Override // a.hd3
    public final void m() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof pd3) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install ViewPump's");
        }
    }

    @Override // a.hd3
    public final void n() {
        this.j.n();
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        str.getClass();
        context.getClass();
        attributeSet.getClass();
        return g(null, str, context, attributeSet);
    }

    @Override // a.hd3
    public final void p(Configuration configuration) {
        this.j.p(configuration);
    }

    @Override // a.hd3
    public final void q(Bundle bundle) {
        hd3 hd3Var = this.j;
        hd3Var.q(bundle);
        synchronized (hd3.h) {
            hd3.x(hd3Var);
        }
        hd3.b(this);
    }

    @Override // a.hd3
    public final void r() {
        this.j.r();
        synchronized (hd3.h) {
            hd3.x(this);
        }
    }

    @Override // a.hd3
    public final void s(Bundle bundle) {
        this.j.s(bundle);
    }

    @Override // a.hd3
    public final void t() {
        this.j.t();
    }

    @Override // a.hd3
    public final void u(Bundle bundle) {
        this.j.u(bundle);
    }

    @Override // a.hd3
    public final void v() {
        this.j.v();
    }

    @Override // a.hd3
    public final void w() {
        this.j.w();
    }

    @Override // a.hd3
    public final boolean y(int i) {
        return this.j.y(1);
    }

    @Override // a.hd3
    public final void z(int i) {
        this.j.z(i);
    }

    @Override // a.hd3, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        str.getClass();
        context.getClass();
        attributeSet.getClass();
        return g(view, str, context, attributeSet);
    }
}
