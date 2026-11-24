package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class d4w0 implements jot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4w0 f5477a;
    public final float b;
    public final float c;
    public final n0o0 d;
    public final n0o0 e;
    public boolean f;
    public pot0 g;
    public odd h;

    public d4w0(b4w0 b4w0Var) {
        this.f5477a = b4w0Var;
        this.b = b4w0Var.k();
        this.c = b4w0Var.c();
        final byte b = 0;
        this.d = maz.b(new Function0(this) { // from class: a.c4w0
            public final /* synthetic */ d4w0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                d4w0 d4w0Var = this.b;
                switch (b2) {
                    case 0:
                        return new e4w0(1.0f, d4w0Var.b, d4w0Var.c);
                    default:
                        return new hy40((e4w0) d4w0Var.d.getValue());
                }
            }
        });
        final byte b2 = 1;
        this.e = maz.b(new Function0(this) { // from class: a.c4w0
            public final /* synthetic */ d4w0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                d4w0 d4w0Var = this.b;
                switch (b3) {
                    case 0:
                        return new e4w0(1.0f, d4w0Var.b, d4w0Var.c);
                    default:
                        return new hy40((e4w0) d4w0Var.d.getValue());
                }
            }
        });
    }

    public final ig00 a(e4w0 e4w0Var, boolean z, boolean z2) {
        e4w0Var.getClass();
        odd oddVar = new odd();
        odd oddVar2 = this.h;
        if (oddVar2 != null) {
            if (z) {
                dw9.z("Cancelled due to another zoom value being set.", oddVar2);
            } else {
                vzb.g0(oddVar, oddVar2);
            }
        }
        this.h = oddVar;
        boolean zV = ofm0.v();
        n0o0 n0o0Var = this.e;
        if (zV) {
            ((hy40) n0o0Var.getValue()).l(e4w0Var);
        } else {
            ((hy40) n0o0Var.getValue()).i(e4w0Var);
        }
        pot0 pot0Var = this.g;
        if (pot0Var != null) {
            float f = e4w0Var.f7204a;
            b4w0 b4w0Var = this.f5477a;
            vzb.g0(z2 ? b4w0Var.b(f, pot0Var) : b4w0Var.i(pot0Var), oddVar);
        } else {
            dw9.z("Camera is not active.", oddVar);
        }
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = gne.class;
        try {
            oddVar.invokeOnCompletion(new ejd(tu9Var, (byte) 14));
            tu9Var.f34540a = "Job.asListenableFuture";
        } catch (Exception e) {
            wu9Var.b(e);
        }
        return ro4.c0(wu9Var);
    }

    @Override // a.jot0
    public final void b(pot0 pot0Var) {
        this.g = pot0Var;
        e4w0 e4w0Var = (e4w0) ((hy40) this.e.getValue()).d();
        if (e4w0Var == null) {
            e4w0Var = (e4w0) this.d.getValue();
        }
        a(e4w0Var, false, this.f || e4w0Var.f7204a != 1.0f);
        this.f = true;
    }

    @Override // a.jot0
    public final void reset() {
        a((e4w0) this.d.getValue(), true, true);
    }
}
