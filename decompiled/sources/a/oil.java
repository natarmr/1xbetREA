package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class oil extends pm80 {
    public final /* synthetic */ byte f;
    public float g;
    public a4d h;
    public final Object i;
    public final Object j;
    public Object k;

    public oil(pm80 pm80Var, a4d a4dVar, Function2 function2) {
        this.f = (byte) 1;
        pm80Var.getClass();
        this.i = pm80Var;
        this.g = 1.0f;
        this.h = a4dVar;
        this.j = function2;
        this.k = new nu90(pm80Var, 1.0f, a4dVar);
    }

    @Override // a.pm80
    public final boolean a(float f) {
        switch (this.f) {
            case 0:
                this.g = f;
                break;
            default:
                if (f != 1.0f) {
                    this.g = f;
                    this.k = new nu90((pm80) this.i, f, this.h);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // a.pm80
    public final boolean b(a4d a4dVar) {
        switch (this.f) {
            case 0:
                this.h = a4dVar;
                break;
            default:
                if (a4dVar != null) {
                    this.h = a4dVar;
                    this.k = new nu90((pm80) this.i, this.g, a4dVar);
                }
                break;
        }
        return true;
    }

    @Override // a.pm80
    public final long i() {
        switch (this.f) {
            case 0:
                return 9205357640488583168L;
            default:
                return ((pm80) this.i).i();
        }
    }

    @Override // a.pm80
    public final void j(fhl fhlVar) {
        pil pilVar;
        switch (this.f) {
            case 0:
                ehf0 ehf0Var = (ehf0) this.k;
                yjj0 yjj0Var = (yjj0) this.i;
                long jD = fhlVar.d();
                k6z layoutDirection = fhlVar.getLayoutDirection();
                kjj0 kjj0Var = (kjj0) this.j;
                synchronized (ehf0Var) {
                    z13 z13Var = (z13) ehf0Var.c;
                    if (z13Var == null) {
                        z13 z13Var2 = new z13(jd8.n, 0L, k6z.f17794a, 1.0f, null);
                        ehf0Var.c = z13Var2;
                        z13Var = z13Var2;
                    }
                    z13Var.f43599a = yjj0Var;
                    z13Var.b = jD;
                    z13Var.c = layoutDirection;
                    z13Var.d = fhlVar.getDensity();
                    float f = kjj0Var.f18389a;
                    long j = kjj0Var.d;
                    z13Var.e = new kjj0(kjj0Var.c, 0L, f, kjj0Var.e, j);
                    hz40 hz40Var = (hz40) ehf0Var.b;
                    if (hz40Var == null) {
                        hz40Var = new hz40();
                        ehf0Var.b = hz40Var;
                    }
                    pilVar = (pil) hz40Var.g(z13Var);
                    if (pilVar == null) {
                        pilVar = new pil(kjj0Var, yjj0Var.a(jD, layoutDirection, fhlVar));
                        hz40 hz40Var2 = (hz40) ehf0Var.b;
                        if (hz40Var2 == null) {
                            hz40Var2 = new hz40();
                            ehf0Var.b = hz40Var2;
                        }
                        hz40Var2.n(new z13(z13Var.f43599a, z13Var.b, z13Var.c, z13Var.d, z13Var.e), pilVar);
                    }
                    break;
                }
                float fW0 = fhlVar.w0(adl.a(((kjj0) this.j).b));
                float fW1 = fhlVar.w0(adl.b(((kjj0) this.j).b));
                ((fvt0) fhlVar.A0().b).A(fW0, fW1);
                try {
                    a4d a4dVar = this.h;
                    long jD2 = fhlVar.d();
                    kjj0 kjj0Var2 = pilVar.i;
                    pilVar.a(fhlVar, a4dVar, jD2, kjj0Var2.d, l1e0.c(this.g * kjj0Var2.e, 0.0f, 1.0f), pilVar.i.c);
                    return;
                } finally {
                    ((fvt0) fhlVar.A0().b).A(-fW0, -fW1);
                }
            default:
                fhlVar.getClass();
                ((Function2) this.j).invoke(fhlVar, (nu90) this.k);
                return;
        }
    }

    public oil(ugg0 ugg0Var, kjj0 kjj0Var, ehf0 ehf0Var) {
        this.f = (byte) 0;
        this.i = ugg0Var;
        this.j = kjj0Var;
        this.k = ehf0Var;
        this.g = 1.0f;
        k6z k6zVar = k6z.f17794a;
    }
}
