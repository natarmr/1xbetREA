package androidx.work.impl.workers;

import a.c43;
import a.cpv0;
import a.d4e;
import a.d5c;
import a.e4e;
import a.ejv0;
import a.f4e;
import a.i4e;
import a.ic1;
import a.igb;
import a.jf4;
import a.jtv;
import a.kg00;
import a.lds0;
import a.lg00;
import a.lne;
import a.ng00;
import a.obb;
import a.og00;
import a.pov0;
import a.ppv0;
import a.qjj;
import a.ua80;
import a.upv0;
import a.vox;
import a.wne;
import a.wv00;
import a.y2e;
import a.yje;
import a.z1x;
import a.zas0;
import a.zje;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a/d4e", "work-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConstraintTrackingWorker extends CoroutineWorker {
    public final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(yje yjeVar) {
        Executor executor = this.b.c;
        executor.getClass();
        return qjj.d0(obb.Y(executor), new igb((Object) this, (yje) null, (byte) 9), yjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(og00 og00Var, zas0 zas0Var, ppv0 ppv0Var, zje zjeVar) {
        e4e e4eVar;
        if (zjeVar instanceof e4e) {
            e4eVar = (e4e) zjeVar;
            int i = e4eVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4eVar.k = i - Integer.MIN_VALUE;
            } else {
                e4eVar = new e4e(this, zjeVar);
            }
        } else {
            e4eVar = new e4e(this, zjeVar);
        }
        Object objJ = e4eVar.i;
        wne wneVar = wne.f39444a;
        int i2 = e4eVar.k;
        if (i2 == 0) {
            z1x.P(objJ);
            c43 c43Var = new c43(og00Var, zas0Var, ppv0Var, null);
            e4eVar.k = 1;
            objJ = d5c.J(e4eVar, c43Var);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        objJ.getClass();
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x016f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x0178  */
    /* JADX WARN: Code duplicated, block: B:72:0x0183  */
    /* JADX WARN: Code duplicated, block: B:76:0x018d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0193  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object f(zje zjeVar) {
        f4e f4eVar;
        Object obj;
        og00 og00Var;
        AtomicInteger atomicInteger;
        int i;
        ConstraintTrackingWorker constraintTrackingWorker = this;
        WorkerParameters workerParameters = constraintTrackingWorker.g;
        if (zjeVar instanceof f4e) {
            f4eVar = (f4e) zjeVar;
            int i2 = f4eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f4eVar.l = i2 - Integer.MIN_VALUE;
            } else {
                f4eVar = new f4e(constraintTrackingWorker, zjeVar);
            }
        } else {
            f4eVar = new f4e(constraintTrackingWorker, zjeVar);
        }
        f4e f4eVar2 = f4eVar;
        Object objD0 = f4eVar2.j;
        wne wneVar = wne.f39444a;
        int i3 = f4eVar2.l;
        Object obj2 = null;
        if (i3 != 0) {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            og00Var = f4eVar2.i;
            try {
                z1x.P(objD0);
                obj = null;
                return (ng00) objD0;
            } catch (CancellationException e) {
                e = e;
                obj = null;
                atomicInteger = constraintTrackingWorker.c;
                if (atomicInteger.get() == -256) {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger.get() != -256) {
                        i = atomicInteger.get();
                    } else {
                        if (!(e instanceof d4e)) {
                            jf4.n("Unreachable");
                            return obj;
                        }
                        i = ((d4e) e).f5450a;
                    }
                    og00Var.c.compareAndSet(-256, i);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger.get() != -256) {
                        i = atomicInteger.get();
                    } else {
                        if (!(e instanceof d4e)) {
                            jf4.n("Unreachable");
                            return obj;
                        }
                        i = ((d4e) e).f5450a;
                    }
                    og00Var.c.compareAndSet(-256, i);
                }
                if (e instanceof d4e) {
                    return new lg00();
                }
                throw e;
            }
        }
        z1x.P(objD0);
        WorkerParameters workerParameters2 = constraintTrackingWorker.b;
        String strB = workerParameters2.b.b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (strB == null || strB.length() == 0) {
            wv00.f().d(i4e.f14142a, "No worker to delegate to.");
            return new kg00();
        }
        Context context = constraintTrackingWorker.f25193a;
        cpv0 cpv0VarD = cpv0.d(context);
        cpv0VarD.getClass();
        upv0 upv0VarY = cpv0VarD.c.y();
        String string = workerParameters2.f45416a.toString();
        string.getClass();
        ppv0 ppv0VarE = upv0VarY.e(string);
        if (ppv0VarE == null) {
            return new kg00();
        }
        lds0 lds0Var = cpv0VarD.j;
        lds0Var.getClass();
        zas0 zas0Var = new zas0(lds0Var);
        ArrayList arrayList = (ArrayList) zas0Var.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            Object obj4 = obj2;
            if (((y2e) obj3).a(ppv0VarE)) {
                arrayList2.add(obj3);
            }
            obj2 = obj4;
        }
        obj = obj2;
        if (!arrayList2.isEmpty()) {
            wv00.f().a(pov0.f27347a, ua80.i("Work ", ppv0VarE.f27390a, " constrained by ", CollectionsKt.b0(arrayList2, null, null, null, new ejv0((byte) 5), 31)));
        }
        if (!arrayList2.isEmpty()) {
            String str = i4e.f14142a;
            wv00.f().a(str, "Constraints not met for delegate " + strB + ". Requesting retry.");
            return new lg00();
        }
        wv00.f().a(i4e.f14142a, "Constraints met for delegate ".concat(strB));
        try {
            jtv jtvVar = workerParameters2.f;
            context.getClass();
            og00 og00VarH0 = jtvVar.H0(context, strB, workerParameters);
            vox voxVar = workerParameters.e.e;
            voxVar.getClass();
            try {
                lne lneVarY = obb.Y(voxVar);
                og00Var = og00VarH0;
                constraintTrackingWorker = this;
                try {
                    ic1 ic1Var = new ic1((Object) constraintTrackingWorker, (Object) og00Var, (Object) zas0Var, (Object) ppv0VarE, (yje) null, (byte) 17);
                    f4eVar2.i = og00Var;
                    f4eVar2.l = 1;
                    objD0 = qjj.d0(lneVarY, ic1Var, f4eVar2);
                    if (objD0 == wneVar) {
                        return wneVar;
                    }
                    return (ng00) objD0;
                } catch (CancellationException e2) {
                    e = e2;
                    atomicInteger = constraintTrackingWorker.c;
                    if (atomicInteger.get() == -256 || (e instanceof d4e)) {
                        if (Build.VERSION.SDK_INT < 31) {
                            i = -512;
                        } else if (atomicInteger.get() != -256) {
                            i = atomicInteger.get();
                        } else {
                            if (!(e instanceof d4e)) {
                                jf4.n("Unreachable");
                                return obj;
                            }
                            i = ((d4e) e).f5450a;
                        }
                        og00Var.c.compareAndSet(-256, i);
                    }
                    if (e instanceof d4e) {
                        return new lg00();
                    }
                    throw e;
                }
            } catch (CancellationException e3) {
                e = e3;
                og00Var = og00VarH0;
                constraintTrackingWorker = this;
                atomicInteger = constraintTrackingWorker.c;
                if (atomicInteger.get() == -256) {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger.get() != -256) {
                        i = atomicInteger.get();
                    } else {
                        if (!(e instanceof d4e)) {
                            jf4.n("Unreachable");
                            return obj;
                        }
                        i = ((d4e) e).f5450a;
                    }
                    og00Var.c.compareAndSet(-256, i);
                } else {
                    if (Build.VERSION.SDK_INT < 31) {
                        i = -512;
                    } else if (atomicInteger.get() != -256) {
                        i = atomicInteger.get();
                    } else {
                        if (!(e instanceof d4e)) {
                            jf4.n("Unreachable");
                            return obj;
                        }
                        i = ((d4e) e).f5450a;
                    }
                    og00Var.c.compareAndSet(-256, i);
                }
                if (e instanceof d4e) {
                    return new lg00();
                }
                throw e;
            }
        } catch (Throwable unused) {
            wv00.f().a(i4e.f14142a, "No worker to delegate to.");
            cpv0VarD.b.getClass();
            return new kg00();
        }
    }
}
