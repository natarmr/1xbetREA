package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ovk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pfw f25929a = new pfw("UNDEFINED", (byte) 6);
    public static final pfw b = new pfw("REUSABLE_CLAIMED", (byte) 6);

    public static final void a(yje yjeVar, Object obj) throws mvk {
        if (!(yjeVar instanceof nvk)) {
            yjeVar.resumeWith(obj);
            return;
        }
        nvk nvkVar = (nvk) yjeVar;
        lne lneVar = nvkVar.d;
        zje zjeVar = nvkVar.e;
        Throwable thA = j0g0.a(obj);
        Object uddVar = thA == null ? obj : new udd(thA, false);
        if (c(lneVar, zjeVar.getContext())) {
            nvkVar.f = uddVar;
            nvkVar.c = 1;
            b(lneVar, zjeVar.getContext(), nvkVar);
            return;
        }
        eeo eeoVarA = gcq0.a();
        if (eeoVarA.c >= 4294967296L) {
            nvkVar.f = uddVar;
            nvkVar.c = 1;
            eeoVarA.y(nvkVar);
            return;
        }
        eeoVarA.F(true);
        try {
            bby bbyVar = (bby) zjeVar.getContext().get(gqw0.o1);
            if (bbyVar == null || bbyVar.isActive()) {
                Object obj2 = nvkVar.g;
                CoroutineContext context = zjeVar.getContext();
                Object objC = ecq0.c(context, obj2);
                o7t0 o7t0VarC = objC != ecq0.f7579a ? jne.c(zjeVar, context, objC) : null;
                try {
                    zjeVar.resumeWith(obj);
                    if (o7t0VarC == null || o7t0VarC.f0()) {
                        ecq0.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (o7t0VarC == null || o7t0VarC.f0()) {
                        ecq0.a(context, objC);
                    }
                    throw th;
                }
            } else {
                nvkVar.resumeWith(z1x.C(bbyVar.getCancellationException()));
            }
            while (eeoVarA.I()) {
            }
        } catch (Throwable th2) {
            try {
                nvkVar.g(th2);
            } finally {
                eeoVarA.x(true);
            }
        }
    }

    public static final void b(lne lneVar, CoroutineContext coroutineContext, Runnable runnable) throws mvk {
        try {
            lneVar.q(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new mvk(th, lneVar, coroutineContext);
        }
    }

    public static final boolean c(lne lneVar, CoroutineContext coroutineContext) throws mvk {
        try {
            return lneVar.v(coroutineContext);
        } catch (Throwable th) {
            throw new mvk(th, lneVar, coroutineContext);
        }
    }
}
