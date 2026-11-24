package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class l0l extends w46 {
    public final xcc b;
    public final mne c;
    public final i5m0 d;
    public final fq e;
    public final s7t0 f;
    public final chu g;
    public final y7k0 h;
    public final haf i;
    public final xuc j;
    public final ztt k;
    public final e320 l;
    public final bto0 m;
    public final g1u n;
    public final ooi0 o;
    public final qni0 p;
    public final y5s q;
    public bby r;
    public final p7m0 s;
    public final p7m0 t;

    public l0l(qa60 qa60Var, xcc xccVar, mne mneVar, i5m0 i5m0Var, fq fqVar, s7t0 s7t0Var, chu chuVar, y7k0 y7k0Var, haf hafVar, xuc xucVar, ztt zttVar, e320 e320Var, bto0 bto0Var, g1u g1uVar, ooi0 ooi0Var, qni0 qni0Var, y5s y5sVar) {
        qa60Var.getClass();
        xccVar.getClass();
        i5m0Var.getClass();
        fqVar.getClass();
        s7t0Var.getClass();
        chuVar.getClass();
        y7k0Var.getClass();
        hafVar.getClass();
        xucVar.getClass();
        zttVar.getClass();
        e320Var.getClass();
        bto0Var.getClass();
        g1uVar.getClass();
        ooi0Var.getClass();
        qni0Var.getClass();
        y5sVar.getClass();
        this.b = xccVar;
        this.c = mneVar;
        this.d = i5m0Var;
        this.e = fqVar;
        this.f = s7t0Var;
        this.g = chuVar;
        this.h = y7k0Var;
        this.i = hafVar;
        this.j = xucVar;
        this.k = zttVar;
        this.l = e320Var;
        this.m = bto0Var;
        this.n = g1uVar;
        this.o = ooi0Var;
        this.p = qni0Var;
        this.q = y5sVar;
        this.s = q7m0.a(tzk.f34808a);
        this.t = q7m0.a(uzk.f36539a);
        slb.U(new dnq(new fnq(qa60Var.a(), new brk(2, this, l0l.class, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 1), (byte) 4), new ko0((Object) this, (yje) null, (byte) 12), (byte) 1), d5c.S(jiu0.a(this), mneVar.f22085a));
    }

    public final void A(tzk tzkVar) {
        sac.V(jiu0.a(this), new vbk((byte) 22), null, null, new j0l((Object) this, (Object) tzkVar, (yje) null, (byte) 1), 14);
    }

    public final void B(b0l b0lVar) {
        sac.V(jiu0.a(this), new vbk((byte) 24), null, null, new j0l((Object) this, (Object) b0lVar, (yje) null, (byte) 2), 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object w(zy5 zy5Var, yje yjeVar) {
        h0l h0lVar;
        if (yjeVar instanceof h0l) {
            h0lVar = (h0l) yjeVar;
            int i = h0lVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0lVar.k = i - Integer.MIN_VALUE;
            } else {
                h0lVar = new h0l(this, yjeVar);
            }
        } else {
            h0lVar = new h0l(this, yjeVar);
        }
        Object obj = h0lVar.i;
        wne wneVar = wne.f39444a;
        int i2 = h0lVar.k;
        byte b = 1;
        yje yjeVar2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            if (zy5Var != null) {
                if (zy5Var instanceof fy5) {
                    A(tzk.b);
                    h0lVar.k = 1;
                    if (this.d.b(h0lVar) == wneVar) {
                        return wneVar;
                    }
                } else {
                    boolean z = zy5Var instanceof uy5;
                    mne mneVar = this.c;
                    if (z) {
                        sac.V(jiu0.a(this), new k0l(1, this, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, mneVar.b, new e0l(this, yjeVar2, b), 10);
                    } else if (zy5Var instanceof yy5) {
                        bby bbyVar = this.r;
                        if (bbyVar == null || !bbyVar.isActive()) {
                            this.r = sac.V(jiu0.a(this), new k0l(1, this, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, mneVar.b, new f0l(this, yjeVar2, b), 10);
                        }
                    } else if (zy5Var instanceof ny5) {
                        sac.V(jiu0.a(this), new e3j(this, (byte) 24), null, mneVar.f22085a, new f0l(this, yjeVar2, (byte) 0), 10);
                    } else if ((zy5Var instanceof ty5) || (zy5Var instanceof ry5)) {
                        A(tzk.c);
                    }
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        B(vzk.f38302a);
        return Unit.f46060a;
    }

    public final void x(Throwable th) {
        sac.V(jiu0.a(this), i0l.f13952a, null, this.c.f22085a, new j0l((Object) this, (Object) th, (yje) null, (byte) 0), 10);
    }

    public final void y(n0l n0lVar) {
        if (n0lVar.e != lnm0.b || n0lVar.t) {
            A(tzk.f34808a);
            if (n0lVar.f == 1) {
                B(new a0l(n0lVar.n));
            }
        }
        B(new xzk(n0lVar));
    }

    public final void z(Function0 function0) {
        sac.V(jiu0.a(this), new vbk((byte) 23), new lrk(function0, this, (byte) 5), this.c.c, new e0l(this, null, (byte) 2), 8);
    }
}
