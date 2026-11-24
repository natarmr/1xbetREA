package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class psf0 extends vw5 {
    public final o8f d;
    public final ot10 e;
    public final msh0 f;
    public final yu00 g;
    public final wgu h;
    public final pru i;
    public final sqx j;
    public final c1d0 k;
    public final mne l;
    public final wsf0 m;
    public final x20 n;
    public final iqt o;
    public final cmt p;
    public final kh3 q;
    public final qsf0 r;
    public Function2 s;
    public Function0 t;
    public final p7m0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public psf0(o8f o8fVar, ot10 ot10Var, msh0 msh0Var, yu00 yu00Var, wgu wguVar, pru pruVar, sqx sqxVar, c1d0 c1d0Var, mne mneVar, wsf0 wsf0Var, x20 x20Var, iqt iqtVar, cmt cmtVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        wguVar.getClass();
        c1d0Var.getClass();
        this.d = o8fVar;
        this.e = ot10Var;
        this.f = msh0Var;
        this.g = yu00Var;
        this.h = wguVar;
        this.i = pruVar;
        this.j = sqxVar;
        this.k = c1d0Var;
        this.l = mneVar;
        this.m = wsf0Var;
        this.n = x20Var;
        this.o = iqtVar;
        this.p = cmtVar;
        this.q = kh3.RESOLVE;
        this.r = qsf0.RESOLVE_DOMAIN;
        this.u = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.u.o(null, i8d.b);
        byte b = 9;
        sac.V(sjeVar, new dff0(this, sjeVar, b), null, this.l.b, new z8b0(this, null, b), 10);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.q;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.u;
    }

    @Override // a.vw5
    public final List d() {
        return null;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.r;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(zje zjeVar) {
        nsf0 nsf0Var;
        if (zjeVar instanceof nsf0) {
            nsf0Var = (nsf0) zjeVar;
            int i = nsf0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsf0Var.k = i - Integer.MIN_VALUE;
            } else {
                nsf0Var = new nsf0(this, zjeVar);
            }
        } else {
            nsf0Var = new nsf0(this, zjeVar);
        }
        Object objA = nsf0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nsf0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            ylt0 ylt0VarE = this.k.e();
            nsf0Var.k = 1;
            objA = ylt0VarE.a(true, nsf0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        ((o1d0) objA).getClass();
        return Unit.f46060a;
    }
}
