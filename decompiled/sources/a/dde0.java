package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class dde0 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final jfi0 o;
    public final e5a p;
    public final fqu q;
    public final woc r;
    public final i1w0 s;
    public final mne t;
    public final duj u;

    /* JADX WARN: Illegal instructions before constructor call */
    public dde0(jfi0 jfi0Var, e5a e5aVar, wqc wqcVar, fqu fquVar, woc wocVar, i1w0 i1w0Var, ctf0 ctf0Var, mne mneVar, duj dujVar) {
        jfi0Var.getClass();
        ctf0Var.getClass();
        byte b = 15;
        super(null, new gvb0(ctf0Var, wqcVar, b), new iv80(ctf0Var, b), cvm0.p(mneVar.c, mneVar.f22085a), null);
        this.o = jfi0Var;
        this.p = e5aVar;
        this.q = fquVar;
        this.r = wocVar;
        this.s = i1w0Var;
        this.t = mneVar;
        this.u = dujVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        boolean z;
        String str;
        String str2;
        uce0 uce0Var = (uce0) obj;
        uce0Var.getClass();
        boolean zEquals = uce0Var.equals(pce0.f26756a);
        final byte b = 0;
        mne mneVar = this.t;
        yje yjeVar = null;
        if (zEquals) {
            boolean z2 = ((zce0) D()).c;
            ace0 ace0Var = z2 ? ace0.d : ace0.f624a;
            sac.V(jiu0.a(this), new Function1(this) { // from class: a.bde0
                public final /* synthetic */ dde0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b2 = b;
                    dde0 dde0Var = this.b;
                    Throwable th = (Throwable) obj2;
                    switch (b2) {
                        case 0:
                            th.getClass();
                            dde0Var.u.b(th, new k8e0((byte) 1));
                            break;
                        default:
                            th.getClass();
                            dde0Var.u.b(th, new k8e0((byte) 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            }, null, mneVar.b, new pnd0((byte) 2, yjeVar, ace0Var, this, new vnn((byte) 5, yjeVar, (i3t0) this, z2)), 10);
            return;
        }
        final byte b2 = 1;
        if (uce0Var.equals(tce0.f33717a)) {
            sac.V(jiu0.a(this), new Function1(this) { // from class: a.bde0
                public final /* synthetic */ dde0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b3 = b2;
                    dde0 dde0Var = this.b;
                    Throwable th = (Throwable) obj2;
                    switch (b3) {
                        case 0:
                            th.getClass();
                            dde0Var.u.b(th, new k8e0((byte) 1));
                            break;
                        default:
                            th.getClass();
                            dde0Var.u.b(th, new k8e0((byte) 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            }, null, mneVar.b, new fj3((diu0) this, ((zce0) D()).c, yjeVar, (byte) 18), 10);
            return;
        }
        if (uce0Var.equals(rce0.f30236a)) {
            sac.V(jiu0.a(this), new Function1(this) { // from class: a.bde0
                public final /* synthetic */ dde0 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b3 = b;
                    dde0 dde0Var = this.b;
                    Throwable th = (Throwable) obj2;
                    switch (b3) {
                        case 0:
                            th.getClass();
                            dde0Var.u.b(th, new k8e0((byte) 1));
                            break;
                        default:
                            th.getClass();
                            dde0Var.u.b(th, new k8e0((byte) 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            }, null, mneVar.b, new pnd0((byte) 2, yjeVar, ace0.c, this, new cde0(this, yjeVar, b2)), 10);
            return;
        }
        if (uce0Var.equals(oce0.f25024a)) {
            I(mneVar.b, new d8e0(1, this, dde0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 5), new cde0(this, yjeVar, b));
            return;
        }
        if (uce0Var.equals(sce0.f31983a)) {
            E();
            return;
        }
        if (!(uce0Var instanceof qce0)) {
            t9f.b();
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            zce0 zce0Var = (zce0) value;
            this.f.getClass();
            z = ((qce0) uce0Var).f28481a;
            str = zce0Var.f44163a;
            str2 = zce0Var.b;
            str.getClass();
            str2.getClass();
        } while (!p7m0Var.m(value, new zce0(str, str2, z)));
    }
}
