package a;

import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class h23 implements d5q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f12312a;
    public final Function1 b;
    public final Function0 c;
    public final g050 d = new g050();
    public final pgk0 e = new pgk0(new c23(this, 0));
    public final c23 f = new c23(this, 1);
    public final c23 g = new c23(this, 2);
    public ActionMode h;
    public b1 i;
    public Runnable j;

    public h23(View view, Function1 function1, Function0 function0) {
        this.f12312a = view;
        this.b = function1;
        this.c = function0;
    }

    @Override // a.d5q0
    public final Object a(v4q0 v4q0Var, bnn0 bnn0Var) {
        Object objA = g050.a(this.d, new za(this, v4q0Var, null, (byte) 14), bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }
}
