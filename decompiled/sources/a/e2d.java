package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class e2d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oyq0 f7077a;
    public final sjj b;
    public final nul0 c;
    public final pz40 d;
    public final pz40 e;
    public final a8z f;
    public final a8z g;
    public final zbk h;

    public e2d(oyq0 oyq0Var, sjj sjjVar, nul0 nul0Var) {
        oyq0Var.getClass();
        this.f7077a = oyq0Var;
        this.b = sjjVar;
        this.c = nul0Var;
        this.d = androidx.compose.runtime.e.e(new j6g0((byte) 17));
        this.e = androidx.compose.runtime.e.e(new d2d("", false));
        c2d c2dVar = new c2d(this, (byte) 0);
        wez wezVar = wez.b;
        this.f = maz.a(wezVar, c2dVar);
        this.g = maz.a(wezVar, new c2d(this, (byte) 1));
        this.h = jgk0.b(new c2d(this, (byte) 2));
    }

    public static azl b(e2d e2dVar, Function0 function0) {
        e2dVar.getClass();
        return e2dVar.a(new d2d("", false), function0);
    }

    public final azl a(d2d d2dVar, Function0 function0) {
        d2dVar.getClass();
        function0.getClass();
        azl azlVar = new azl(this.b, this.c, this.f7077a, function0);
        ((hgk0) this.d).setValue(function0);
        ((hgk0) this.e).setValue(d2dVar);
        return azlVar;
    }
}
