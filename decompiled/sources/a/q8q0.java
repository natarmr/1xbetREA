package a;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class q8q0 implements qw90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f28312a;
    public final y3v b;
    public final ex2 c;
    public boolean d;
    public Function1 e;
    public Function1 f;
    public a8q0 g;
    public k3x h;
    public final ArrayList i;
    public final a8z j;
    public Rect k;
    public final ewf l;
    public final xz40 m;
    public apj0 n;

    public q8q0(View view, AndroidComposeView androidComposeView, ex2 ex2Var) {
        y3v y3vVar = new y3v(view);
        this.f28312a = view;
        this.b = y3vVar;
        this.c = ex2Var;
        this.e = new t6q0((byte) 11);
        this.f = new t6q0((byte) 12);
        this.g = new a8q0("", o9q0.b, 4);
        this.h = k3x.g;
        this.i = new ArrayList();
        this.j = maz.a(wez.b, new h3q0(this, (byte) 4));
        this.l = new ewf(androidComposeView, y3vVar);
        this.m = new xz40(new p8q0[16]);
    }

    @Override // a.qw90
    public final void a() {
        i(p8q0.f26571a);
    }

    @Override // a.qw90
    public final void b() {
        this.d = false;
        this.e = new t6q0((byte) 9);
        this.f = new t6q0((byte) 10);
        this.k = null;
        i(p8q0.b);
    }

    @Override // a.qw90
    public final void c(a8q0 a8q0Var, qe60 qe60Var, a9q0 a9q0Var, caz cazVar, jge0 jge0Var, jge0 jge0Var2) {
        ewf ewfVar = this.l;
        synchronized (ewfVar.c) {
            try {
                ewfVar.j = a8q0Var;
                ewfVar.l = qe60Var;
                ewfVar.k = a9q0Var;
                ewfVar.m = cazVar;
                ewfVar.n = jge0Var;
                ewfVar.o = jge0Var2;
                if (ewfVar.e || ewfVar.d) {
                    ewfVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.qw90
    public final void d() {
        i(p8q0.d);
    }

    @Override // a.qw90
    public final void e(jge0 jge0Var) {
        Rect rect;
        this.k = new Rect(si30.b(jge0Var.f16474a), si30.b(jge0Var.b), si30.b(jge0Var.c), si30.b(jge0Var.d));
        if (!this.i.isEmpty() || (rect = this.k) == null) {
            return;
        }
        this.f28312a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // a.qw90
    public final void f() {
        i(p8q0.c);
    }

    @Override // a.qw90
    public final void g(a8q0 a8q0Var, k3x k3xVar, nej0 nej0Var, ome omeVar) {
        this.d = true;
        this.g = a8q0Var;
        this.h = k3xVar;
        this.e = nej0Var;
        this.f = omeVar;
        i(p8q0.f26571a);
    }

    @Override // a.qw90
    public final void h(a8q0 a8q0Var, a8q0 a8q0Var2) {
        boolean z = (o9q0.b(this.g.b, a8q0Var2.b) && Intrinsics.d(this.g.c, a8q0Var2.c)) ? false : true;
        this.g = a8q0Var2;
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            gge0 gge0Var = (gge0) ((WeakReference) this.i.get(i)).get();
            if (gge0Var != null) {
                gge0Var.d = a8q0Var2;
            }
        }
        ewf ewfVar = this.l;
        synchronized (ewfVar.c) {
            ewfVar.j = null;
            ewfVar.l = null;
            ewfVar.k = null;
            ewfVar.m = ske.g;
            ewfVar.n = null;
            ewfVar.o = null;
        }
        if (Intrinsics.d(a8q0Var, a8q0Var2)) {
            if (z) {
                y3v y3vVar = this.b;
                int iF = o9q0.f(a8q0Var2.b);
                int iE = o9q0.e(a8q0Var2.b);
                o9q0 o9q0Var = this.g.c;
                int iF2 = o9q0Var != null ? o9q0.f(o9q0Var.f24893a) : -1;
                o9q0 o9q0Var2 = this.g.c;
                ((InputMethodManager) ((a8z) y3vVar.c).getValue()).updateSelection((View) y3vVar.b, iF, iE, iF2, o9q0Var2 != null ? o9q0.e(o9q0Var2.f24893a) : -1);
                return;
            }
            return;
        }
        if (a8q0Var != null && (!Intrinsics.d(a8q0Var.f440a.b, a8q0Var2.f440a.b) || (o9q0.b(a8q0Var.b, a8q0Var2.b) && !Intrinsics.d(a8q0Var.c, a8q0Var2.c)))) {
            y3v y3vVar2 = this.b;
            ((InputMethodManager) ((a8z) y3vVar2.c).getValue()).restartInput((View) y3vVar2.b);
            return;
        }
        int size2 = this.i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            gge0 gge0Var2 = (gge0) ((WeakReference) this.i.get(i2)).get();
            if (gge0Var2 != null) {
                a8q0 a8q0Var3 = this.g;
                y3v y3vVar3 = this.b;
                if (gge0Var2.h) {
                    gge0Var2.d = a8q0Var3;
                    if (gge0Var2.f) {
                        ((InputMethodManager) ((a8z) y3vVar3.c).getValue()).updateExtractedText((View) y3vVar3.b, gge0Var2.e, efx.I(a8q0Var3));
                    }
                    o9q0 o9q0Var3 = a8q0Var3.c;
                    long j = a8q0Var3.b;
                    int iF3 = o9q0Var3 != null ? o9q0.f(o9q0Var3.f24893a) : -1;
                    o9q0 o9q0Var4 = a8q0Var3.c;
                    ((InputMethodManager) ((a8z) y3vVar3.c).getValue()).updateSelection((View) y3vVar3.b, o9q0.f(j), o9q0.e(j), iF3, o9q0Var4 != null ? o9q0.e(o9q0Var4.f24893a) : -1);
                }
            }
        }
    }

    public final void i(p8q0 p8q0Var) {
        this.m.b(p8q0Var);
        if (this.n == null) {
            apj0 apj0Var = new apj0(this, (byte) 14);
            this.c.execute(apj0Var);
            this.n = apj0Var;
        }
    }
}
