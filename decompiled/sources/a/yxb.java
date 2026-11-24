package a;

import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class yxb {
    public boolean A;
    public boolean B;
    public boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iu f43412a;
    public final frc b;
    public final vpc c;
    public final jcl d;
    public final qv e;
    public final vpc f;
    public final is g;
    public final jcl h;
    public final opt i;
    public final nhf0 j;
    public final frc k;
    public final ctf0 l;
    public final ywu m;
    public final sje n;
    public final p7m0 o;
    public pm50 p;
    public final HashMap q;
    public final jxb r;
    public Function0 s;
    public w8e t;
    public boolean u;
    public bby v;
    public bby w;
    public c4m0 x;
    public bby y;
    public bby z;

    public yxb(iu iuVar, frc frcVar, vpc vpcVar, jcl jclVar, qv qvVar, vpc vpcVar2, is isVar, qv qvVar2, jcl jclVar2, opt optVar, nhf0 nhf0Var, frc frcVar2, ctf0 ctf0Var, ywu ywuVar, sje sjeVar) {
        ctf0Var.getClass();
        this.f43412a = iuVar;
        this.b = frcVar;
        this.c = vpcVar;
        this.d = jclVar;
        this.e = qvVar;
        this.f = vpcVar2;
        this.g = isVar;
        this.h = jclVar2;
        this.i = optVar;
        this.j = nhf0Var;
        this.k = frcVar2;
        this.l = ctf0Var;
        this.m = ywuVar;
        this.n = sjeVar;
        this.o = q7m0.a(iun.f15405a);
        this.p = pm50.c;
        this.q = new HashMap();
        jxb jxbVar = new jxb();
        jxbVar.f17297a = 0;
        this.r = jxbVar;
        byte b = 3;
        this.s = new hxb(this, b);
        yje yjeVar = null;
        sac.V(sjeVar, lxb.f20806a, null, null, new mxb(this, yjeVar, (byte) 0), 14);
        slb.U(new dnq(new fnq(((vae) qvVar2.f29365a.b).r, new mxb(this, yjeVar, (byte) 2), (byte) 4), new lo3(b, yjeVar, (byte) 8), (byte) 1), sjeVar);
        sac.V(sjeVar, pxb.f27746a, null, null, new mxb(this, yjeVar, (byte) 1), 14);
    }

    public final void a() {
        p7m0 p7m0Var;
        Object value;
        if (this.A) {
            return;
        }
        bby bbyVar = this.w;
        if (bbyVar == null || !bbyVar.isActive()) {
            do {
                p7m0Var = this.o;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, CollectionsKt.q0((List) value, kotlin.collections.a.c(ixb.f15534a))));
            byte b = 0;
            this.w = sac.V(this.n, qxb.f29475a, new hxb(this, b), null, new rxb(this, null, b), 12);
        }
    }

    public final void b() {
        p7m0 p7m0Var;
        Object value;
        if (this.C) {
            return;
        }
        bby bbyVar = this.y;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            e3c.n(this.v);
            e3c.n(this.w);
            e3c.n(this.z);
            do {
                p7m0Var = this.o;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, CollectionsKt.q0((List) value, kotlin.collections.a.c(ixb.f15534a))));
            this.y = sac.V(this.n, txb.f34688a, null, null, new rxb(this, null, b), 14);
        }
    }
}
