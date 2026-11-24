package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class pnw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fht0 f27306a;
    public h0q0 b;
    public final mpt0 c;
    public final okt0 d;

    public pnw0() {
        fht0 fht0Var = new fht0();
        okt0 okt0Var = new okt0((byte) 10);
        fht0Var.f9559a = okt0Var;
        h0q0 h0q0Var = new h0q0(null, okt0Var);
        fht0Var.c = h0q0Var;
        fht0Var.b = h0q0Var.J();
        zas0 zas0Var = new zas0((byte) 18);
        fht0Var.d = zas0Var;
        h0q0Var.M("require", new adx0(zas0Var));
        ((HashMap) zas0Var.b).put("internal.platform", drw0.b);
        h0q0Var.M("runtime.counter", new ihw0(Double.valueOf(0.0d)));
        this.f27306a = fht0Var;
        this.b = ((h0q0) fht0Var.b).J();
        this.c = new mpt0((byte) 2);
        this.d = new okt0((byte) 16);
        final byte b = 1;
        Callable callable = new Callable(this) { // from class: a.lbw0
            public final /* synthetic */ pnw0 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                byte b2 = b;
                pnw0 pnw0Var = this.b;
                switch (b2) {
                    case 0:
                        return new lzw0(pnw0Var.c);
                    default:
                        return new lzw0(pnw0Var.d);
                }
            }
        };
        HashMap map = (HashMap) ((zas0) fht0Var.d).b;
        map.put("internal.registerCallback", callable);
        final byte b2 = 0;
        map.put("internal.eventLogger", new Callable(this) { // from class: a.lbw0
            public final /* synthetic */ pnw0 b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                byte b3 = b2;
                pnw0 pnw0Var = this.b;
                switch (b3) {
                    case 0:
                        return new lzw0(pnw0Var.c);
                    default:
                        return new lzw0(pnw0Var.d);
                }
            }
        });
    }

    public final boolean a(nbw0 nbw0Var) throws cqw0 {
        mpt0 mpt0Var = this.c;
        try {
            mpt0Var.b = nbw0Var;
            mpt0Var.d = nbw0Var.clone();
            ((ArrayList) mpt0Var.c).clear();
            ((h0q0) this.f27306a.c).M("runtime.counter", new ihw0(Double.valueOf(0.0d)));
            this.d.t(this.b.J(), mpt0Var);
            return (((nbw0) mpt0Var.d).equals((nbw0) mpt0Var.b) && ((ArrayList) mpt0Var.c).isEmpty()) ? false : true;
        } catch (Throwable th) {
            throw new cqw0(th);
        }
    }

    public final void b(nyw0 nyw0Var) {
        giw0 giw0Var;
        try {
            fht0 fht0Var = this.f27306a;
            this.b = ((h0q0) fht0Var.b).J();
            if (fht0Var.q(this.b, (qyw0[]) nyw0Var.r().toArray(new qyw0[0])) instanceof kgw0) {
                throw new IllegalStateException("Program loading failed");
            }
            for (hyw0 hyw0Var : nyw0Var.s().r()) {
                List listS = hyw0Var.s();
                String strR = hyw0Var.r();
                Iterator it = listS.iterator();
                while (it.hasNext()) {
                    jlw0 jlw0VarQ = fht0Var.q(this.b, (qyw0) it.next());
                    if (!(jlw0VarQ instanceof akw0)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    h0q0 h0q0Var = this.b;
                    if (h0q0Var.L(strR)) {
                        jlw0 jlw0VarO = h0q0Var.O(strR);
                        if (!(jlw0VarO instanceof giw0)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strR)));
                        }
                        giw0Var = (giw0) jlw0VarO;
                    } else {
                        giw0Var = null;
                    }
                    if (giw0Var == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strR)));
                    }
                    giw0Var.a(this.b, Collections.singletonList(jlw0VarQ));
                }
            }
        } catch (Throwable th) {
            throw new cqw0(th);
        }
    }
}
