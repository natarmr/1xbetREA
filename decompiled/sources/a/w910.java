package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class w910 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f38754a;
    public final /* synthetic */ qge b;
    public final /* synthetic */ Matrix c;
    public final /* synthetic */ bb10 d;
    public final /* synthetic */ fa10 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ pz40 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w910(Rect rect, qge qgeVar, Matrix matrix, bb10 bb10Var, fa10 fa10Var, Context context, Function0 function0, pz40 pz40Var) {
        super(1);
        this.f38754a = rect;
        this.b = qgeVar;
        this.c = matrix;
        this.d = bb10Var;
        this.e = fa10Var;
        this.f = context;
        this.g = function0;
        this.h = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fhl fhlVar = (fhl) obj;
        fhlVar.getClass();
        x5a x5aVarI = fhlVar.A0().i();
        Rect rect = this.f38754a;
        long jN = p7x.n(rect.width(), rect.height());
        long jB = n2x.b(si30.b(h7k0.e(fhlVar.d())), si30.b(h7k0.c(fhlVar.d())));
        long jA = this.b.a(jN, fhlVar.d());
        float fE = h7k0.e(jN);
        int i = l1h0.f19253a;
        int i2 = (int) (jA >> 32);
        int i3 = (int) (jA & 4294967295L);
        long jB2 = n2x.b((int) (Float.intBitsToFloat(i2) * fE), (int) (Float.intBitsToFloat(i3) * h7k0.c(jN)));
        long jRound = (((long) Math.round(((fhlVar.getLayoutDirection() == k6z.f17794a ? 0.0f : (-1.0f) * 0.0f) + 1.0f) * ((((int) (jB >> 32)) - ((int) (jB2 >> 32))) / 2.0f))) << 32) | (((long) Math.round((1.0f + 0.0f) * ((((int) (jB & 4294967295L)) - ((int) (jB2 & 4294967295L))) / 2.0f))) & 4294967295L);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.preTranslate((int) (jRound >> 32), (int) (jRound & 4294967295L));
        matrix.preScale(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        bb10 bb10Var = this.d;
        boolean zRemove = ((HashSet) bb10Var.l.b).remove(fb10.f9235a);
        if (bb10Var.f2286a != null && zRemove) {
            bb10Var.c();
        }
        bb10Var.e = false;
        bb10Var.v = ijf0.f14871a;
        bb10Var.e();
        m04 m04Var = m04.f20935a;
        bb10Var.m1 = m04Var;
        bb10Var.o(this.e);
        if (bb10Var.j != null) {
            bb10Var.j = null;
            bb10Var.invalidateSelf();
        }
        if (this.h.getValue() != null) {
            hny.b();
            return null;
        }
        if (bb10Var.r) {
            bb10Var.r = false;
            uld uldVar = bb10Var.o;
            if (uldVar != null) {
                uldVar.q(false);
            }
        }
        bb10Var.s = false;
        bb10Var.t = true;
        bb10Var.m = false;
        if (true != bb10Var.n) {
            bb10Var.n = true;
            uld uldVar2 = bb10Var.o;
            if (uldVar2 != null) {
                uldVar2.L = true;
            }
            bb10Var.invalidateSelf();
        }
        if (bb10Var.u) {
            bb10Var.u = false;
            bb10Var.invalidateSelf();
        }
        Iterator it = bb10.u1.iterator();
        gr20 gr20VarD = null;
        while (it.hasNext()) {
            gr20VarD = bb10Var.f2286a.d((String) it.next());
            if (gr20VarD != null) {
                break;
            }
        }
        if (bb10Var.b(this.f) || gr20VarD == null) {
            bb10Var.v(((Number) this.g.invoke()).floatValue());
        } else {
            bb10Var.v(gr20VarD.b);
        }
        bb10Var.setBounds(0, 0, rect.width(), rect.height());
        Canvas canvasB = vw2.b(x5aVarI);
        ya10 ya10Var = bb10Var.q1;
        ThreadPoolExecutor threadPoolExecutor = bb10.v1;
        ub10 ub10Var = bb10Var.b;
        Semaphore semaphore = bb10Var.n1;
        uld uldVar3 = bb10Var.o;
        fa10 fa10Var = bb10Var.f2286a;
        if (uldVar3 != null && fa10Var != null) {
            m04 m04Var2 = bb10Var.m1;
            if (m04Var2 != null) {
                m04Var = m04Var2;
            }
            boolean z = m04Var == m04.b;
            if (z) {
                try {
                    semaphore.acquire();
                    if (bb10Var.w()) {
                        bb10Var.v(ub10Var.a());
                    }
                } catch (InterruptedException unused) {
                    if (z) {
                        semaphore.release();
                        if (uldVar3.K != ub10Var.a()) {
                        }
                    }
                    return Unit.f46060a;
                } catch (Throwable th) {
                    if (z) {
                        semaphore.release();
                        if (uldVar3.K != ub10Var.a()) {
                            threadPoolExecutor.execute(ya10Var);
                        }
                    }
                    throw th;
                }
            }
            boolean z2 = bb10Var.e;
            int i4 = bb10Var.p;
            boolean z3 = bb10Var.w;
            if (z2) {
                try {
                    if (z3) {
                        canvasB.save();
                        canvasB.concat(matrix);
                        bb10Var.m(canvasB, uldVar3);
                        canvasB.restore();
                    } else {
                        uldVar3.h(canvasB, matrix, i4, null);
                    }
                } catch (Throwable unused2) {
                    xv00.f41534a.getClass();
                }
            } else if (z3) {
                canvasB.save();
                canvasB.concat(matrix);
                bb10Var.m(canvasB, uldVar3);
                canvasB.restore();
            } else {
                uldVar3.h(canvasB, matrix, i4, null);
            }
            bb10Var.l1 = false;
            if (z) {
                semaphore.release();
                if (uldVar3.K != ub10Var.a()) {
                    threadPoolExecutor.execute(ya10Var);
                }
            }
        }
        return Unit.f46060a;
    }
}
