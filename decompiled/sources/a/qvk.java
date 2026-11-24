package a;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qvk extends cuo0 {
    public int c;

    public qvk(int i) {
        super(false, 0L);
        this.c = i;
    }

    public abstract yje d();

    public Throwable e(Object obj) {
        udd uddVar = obj instanceof udd ? (udd) obj : null;
        if (uddVar != null) {
            return uddVar.f35472a;
        }
        return null;
    }

    public final void g(Throwable th) {
        u1c.H(new poe("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), d().getContext());
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            yje yjeVarD = d();
            yjeVarD.getClass();
            nvk nvkVar = (nvk) yjeVarD;
            zje zjeVar = nvkVar.e;
            Object obj = nvkVar.g;
            CoroutineContext context = zjeVar.getContext();
            Object objC = ecq0.c(context, obj);
            bby bbyVar = null;
            o7t0 o7t0VarC = objC != ecq0.f7579a ? jne.c(zjeVar, context, objC) : null;
            try {
                CoroutineContext context2 = zjeVar.getContext();
                Object objI = i();
                Throwable thE = e(objI);
                if (thE == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        bbyVar = (bby) context2.get(gqw0.o1);
                    }
                }
                if (bbyVar != null && !bbyVar.isActive()) {
                    CancellationException cancellationException = bbyVar.getCancellationException();
                    c(cancellationException);
                    e0g0 e0g0Var = j0g0.b;
                    zjeVar.resumeWith(z1x.C(cancellationException));
                } else if (thE != null) {
                    e0g0 e0g0Var2 = j0g0.b;
                    zjeVar.resumeWith(new g0g0(thE));
                } else {
                    e0g0 e0g0Var3 = j0g0.b;
                    zjeVar.resumeWith(f(objI));
                }
            } finally {
                if (o7t0VarC == null || o7t0VarC.f0()) {
                    ecq0.a(context, objC);
                }
            }
        } catch (mvk e) {
            u1c.H(e.f22460a, d().getContext());
        } catch (Throwable th) {
            g(th);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
