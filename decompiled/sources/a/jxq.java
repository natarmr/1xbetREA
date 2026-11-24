package a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public final class jxq extends vbc implements zg60, riu0, kg60, i0h0, h2r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f17320a;
    public final Context b;
    public final Handler c;
    public final v1r d;
    public final /* synthetic */ kxq e;

    public jxq(kxq kxqVar) {
        this.e = kxqVar;
        Handler handler = new Handler();
        this.f17320a = kxqVar;
        this.b = kxqVar;
        this.c = handler;
        this.d = new v1r();
    }

    @Override // a.vbc
    public final View b0(int i) {
        return this.e.findViewById(i);
    }

    @Override // a.vbc
    public final boolean c0() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // a.zg60
    public final void e(sbe sbeVar) {
        this.e.e(sbeVar);
    }

    @Override // a.riu0
    public final piu0 g() {
        return this.e.g();
    }

    @Override // a.i0h0
    public final kd30 h() {
        return (kd30) this.e.d.b;
    }

    @Override // a.zg60
    public final void i(sbe sbeVar) {
        this.e.i(sbeVar);
    }

    @Override // a.kg60
    public final jg60 k() {
        return this.e.k();
    }

    @Override // a.clz
    public final glz x() {
        return this.e.w;
    }

    @Override // a.h2r
    public final void a(androidx.fragment.app.e eVar, Fragment fragment) {
    }
}
