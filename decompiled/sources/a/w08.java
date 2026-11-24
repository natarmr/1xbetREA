package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class w08 {
    public static final uts0 e = ro4.m0(300, 0, jz7.f17396a, 2);
    public static final uts0 f = ro4.m0(300, 0, jz7.d, 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f38338a;
    public final t33 b;
    public final t33 c;
    public final t33 d;

    public w08(float f2) {
        this.f38338a = f2;
        this.b = xf0.c(f2);
        this.c = xf0.c(f2);
        this.d = xf0.c(f2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(zje zjeVar) {
        s08 s08Var;
        if (zjeVar instanceof s08) {
            s08Var = (s08) zjeVar;
            int i = s08Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                s08Var.k = i - Integer.MIN_VALUE;
            } else {
                s08Var = new s08(this, zjeVar);
            }
        } else {
            s08Var = new s08(this, zjeVar);
        }
        s08 s08Var2 = s08Var;
        Object obj = s08Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = s08Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            Float f2 = new Float(this.f38338a);
            s08Var2.k = 1;
            if (t33.a(this.b, f2, e, null, null, s08Var2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(zje zjeVar) {
        t08 t08Var;
        if (zjeVar instanceof t08) {
            t08Var = (t08) zjeVar;
            int i = t08Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t08Var.k = i - Integer.MIN_VALUE;
            } else {
                t08Var = new t08(this, zjeVar);
            }
        } else {
            t08Var = new t08(this, zjeVar);
        }
        t08 t08Var2 = t08Var;
        Object obj = t08Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = t08Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            Float f2 = new Float(0.0f);
            t08Var2.k = 1;
            if (t33.a(this.b, f2, e, null, null, t08Var2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object c(zje zjeVar) {
        u08 u08Var;
        if (zjeVar instanceof u08) {
            u08Var = (u08) zjeVar;
            int i = u08Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u08Var.k = i - Integer.MIN_VALUE;
            } else {
                u08Var = new u08(this, zjeVar);
            }
        } else {
            u08Var = new u08(this, zjeVar);
        }
        u08 u08Var2 = u08Var;
        Object obj = u08Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = u08Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            Float f2 = new Float(0.0f);
            u08Var2.k = 1;
            if (t33.a(this.d, f2, f, null, null, u08Var2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(zje zjeVar) {
        v08 v08Var;
        if (zjeVar instanceof v08) {
            v08Var = (v08) zjeVar;
            int i = v08Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                v08Var.k = i - Integer.MIN_VALUE;
            } else {
                v08Var = new v08(this, zjeVar);
            }
        } else {
            v08Var = new v08(this, zjeVar);
        }
        v08 v08Var2 = v08Var;
        Object obj = v08Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = v08Var2.k;
        if (i2 == 0) {
            z1x.P(obj);
            Float f2 = new Float(0.0f);
            v08Var2.k = 1;
            if (t33.a(this.c, f2, e, null, null, v08Var2, 12) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
