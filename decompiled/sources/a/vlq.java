package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class vlq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f37639a;
    public float b;
    public float c;
    public float d;
    public final t33 e;
    public nlx f;
    public nlx g;

    public vlq(float f, float f2, float f3, float f4) {
        this.f37639a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = new t33(new ycl(f), hp4.l, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Unit] */
    public final Object a(nlx nlxVar, zje zjeVar) {
        tlq tlqVar;
        float f;
        t33 t33Var = this.e;
        if (zjeVar instanceof tlq) {
            tlqVar = (tlq) zjeVar;
            int i = tlqVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                tlqVar.l = i - Integer.MIN_VALUE;
            } else {
                tlqVar = new tlq(this, zjeVar);
            }
        } else {
            tlqVar = new tlq(this, zjeVar);
        }
        Object obj = tlqVar.j;
        wne wneVar = wne.f39444a;
        int i2 = tlqVar.l;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                if (nlxVar instanceof jub0) {
                    f = this.b;
                } else if (nlxVar instanceof rsw) {
                    f = this.c;
                } else {
                    f = nlxVar instanceof qpq ? this.d : this.f37639a;
                }
                this.g = nlxVar;
                if (!ycl.b(((ycl) ((hgk0) t33Var.e).getValue()).f42389a, f)) {
                    nlx nlxVar2 = this.f;
                    tlqVar.i = nlxVar;
                    tlqVar.l = 1;
                    if (bsn.a(t33Var, f, nlxVar2, nlxVar, tlqVar) == wneVar) {
                        return wneVar;
                    }
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nlxVar = tlqVar.i;
                z1x.P(obj);
            }
            this.f = nlxVar;
            this = Unit.f46060a;
            return this;
        } catch (Throwable th) {
            this.f = nlxVar;
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        ulq ulqVar;
        float f;
        if (zjeVar instanceof ulq) {
            ulqVar = (ulq) zjeVar;
            int i = ulqVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ulqVar.k = i - Integer.MIN_VALUE;
            } else {
                ulqVar = new ulq(this, zjeVar);
            }
        } else {
            ulqVar = new ulq(this, zjeVar);
        }
        Object obj = ulqVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ulqVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                nlx nlxVar = this.g;
                if (nlxVar instanceof jub0) {
                    f = this.b;
                } else if (nlxVar instanceof rsw) {
                    f = this.c;
                } else {
                    f = nlxVar instanceof qpq ? this.d : this.f37639a;
                }
                t33 t33Var = this.e;
                if (!ycl.b(((ycl) ((hgk0) t33Var.e).getValue()).f42389a, f)) {
                    ycl yclVar = new ycl(f);
                    ulqVar.k = 1;
                    if (t33Var.f(ulqVar, yclVar) == wneVar) {
                        return wneVar;
                    }
                }
                return Unit.f46060a;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            this.f = this.g;
            return Unit.f46060a;
        } catch (Throwable th) {
            this.f = this.g;
            throw th;
        }
    }
}
