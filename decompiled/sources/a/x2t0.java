package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x2t0 implements j3t0 {
    public static final /* synthetic */ iiy[] g = {new j0d0(x2t0.class, "delegateState", "getDelegateState()Ljava/lang/Object;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40187a = getClass().getSimpleName();
    public final ocj b;
    public final p7m0 c;
    public final n0o0 d;
    public final k050 e;
    public Object f;

    public x2t0(Function0 function0) {
        ocj ocjVar = new ocj(function0.invoke());
        this.b = ocjVar;
        this.c = ocjVar.f25029a;
        this.d = maz.b(new qir0(this, (byte) 26));
        maz.b(new xns0((byte) 11));
        this.e = new k050();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static Object f(x2t0 x2t0Var, Object obj, zje zjeVar) {
        w2t0 w2t0Var;
        k050 k050Var;
        if (zjeVar instanceof w2t0) {
            w2t0Var = (w2t0) zjeVar;
            int i = w2t0Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                w2t0Var.n = i - Integer.MIN_VALUE;
            } else {
                w2t0Var = new w2t0(x2t0Var, zjeVar);
            }
        } else {
            w2t0Var = new w2t0(x2t0Var, zjeVar);
        }
        Object obj2 = w2t0Var.l;
        wne wneVar = wne.f39444a;
        int i2 = w2t0Var.n;
        if (i2 == 0) {
            z1x.P(obj2);
            k050Var = x2t0Var.e;
            w2t0Var.i = x2t0Var;
            w2t0Var.j = obj;
            w2t0Var.k = k050Var;
            w2t0Var.n = 1;
            if (k050Var.d(w2t0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = w2t0Var.k;
            obj = w2t0Var.j;
            x2t0 x2t0Var2 = w2t0Var.i;
            z1x.P(obj2);
            k050Var = k050Var2;
            x2t0Var = x2t0Var2;
        }
        try {
            x2t0Var.f = obj;
            yum0.j(x2t0Var.f40187a, "onAction", "🚀 Выполнение Action ".concat(obj.getClass().getSimpleName()));
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public final i89 b() {
        ntj0 ntj0Var = (ntj0) this.d.getValue();
        return new i89(new fnq(new xp90(new i89(ntj0Var.c, (byte) 22), (byte) 8), new tmg0(ntj0Var, null, (byte) 13)), (byte) 22);
    }

    public final i89 c() {
        return new i89(this.b.f25029a, (byte) 22);
    }

    public final Object d() {
        iiy iiyVar = g[0];
        p7m0 p7m0Var = this.c;
        p7m0Var.getClass();
        return p7m0Var.getValue();
    }

    public final void e() {
        ((ntj0) this.d.getValue()).d();
    }

    public final void g(Object obj) {
        ((ntj0) this.d.getValue()).e(obj);
    }

    public final void h(Object obj, Function0 function0) {
        ntj0 ntj0Var = (ntj0) this.d.getValue();
        ntj0Var.getClass();
        ktj0 ktj0Var = new ktj0(obj);
        if (ntj0Var.c().contains(ktj0Var)) {
            return;
        }
        yum0.j(ntj0Var.f24103a, "postOnReturnSideEffect", "✅ Эффект " + ntj0.a(obj) + " добавлен, в очередь, отложенных эффектов " + ntj0Var.b() + " и попробует выполниться, при возврате на экран!");
        if (!Intrinsics.d(ntj0Var.d, function0)) {
            ntj0Var.d = function0;
        }
        ntj0Var.c().offerLast(ktj0Var);
    }
}
