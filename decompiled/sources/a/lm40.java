package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class lm40 implements yzj {
    public sje b;
    public int c;
    public lm40 e;
    public lm40 f;
    public ge60 g;
    public s460 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public wqv m;
    public boolean n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public lm40 f20279a = this;
    public int d = -1;

    public final vne N0() {
        sje sjeVar = this.b;
        if (sjeVar != null) {
            return sjeVar;
        }
        sje sjeVarA = d5c.a(vcc.a0(this).getCoroutineContext().plus(new dby((bby) vcc.a0(this).getCoroutineContext().get(gqw0.o1))));
        this.b = sjeVarA;
        return sjeVarA;
    }

    public boolean O0() {
        return !(this instanceof sc5);
    }

    public void P0() {
        if (this.n) {
            xcx.b("node attached multiple times");
        }
        if (this.h == null) {
            xcx.b("attach invoked on a node without a coordinator");
        }
        this.n = true;
        this.k = true;
    }

    public void Q0() {
        if (!this.n) {
            xcx.b("Cannot detach a node that is not attached");
        }
        if (this.k) {
            xcx.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.l) {
            xcx.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.n = false;
        sje sjeVar = this.b;
        if (sjeVar != null) {
            d5c.G(sjeVar, new tm40("The Modifier.Node was detached", (byte) 2));
            this.b = null;
        }
    }

    public void U0() {
        if (!this.n) {
            xcx.b("reset() called on an unattached node");
        }
        T0();
    }

    public void V0() {
        if (!this.n) {
            xcx.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.k) {
            xcx.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.k = false;
        R0();
        this.l = true;
    }

    public void W0() {
        if (!this.n) {
            xcx.b("node detached multiple times");
        }
        if (this.h == null) {
            xcx.b("detach invoked on a node without a coordinator");
        }
        if (!this.l) {
            xcx.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.l = false;
        wqv wqvVar = this.m;
        if (wqvVar != null) {
            wqvVar.invoke();
        }
        S0();
    }

    public void X0(lm40 lm40Var) {
        this.f20279a = lm40Var;
    }

    public void Y0(s460 s460Var) {
        this.h = s460Var;
    }

    public void R0() {
    }

    public void S0() {
    }

    public void T0() {
    }
}
