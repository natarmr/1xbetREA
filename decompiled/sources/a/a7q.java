package a;

import android.system.Os;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class a7q implements cfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f384a;

    public a7q(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 4:
                this.f384a = new wgn(gii0Var, (byte) 22);
                break;
            default:
                this.f384a = new wgn(gii0Var, (byte) 12);
                break;
        }
    }

    public vsg0 a(long j, long j2) {
        return new vsg0(new wg0(this, j, j2, null, (byte) 5));
    }

    public p7m0 b(wep wepVar) {
        wepVar.getClass();
        t6p t6pVar = (t6p) ((rrc) this.f384a).b;
        int iOrdinal = wepVar.ordinal();
        if (iOrdinal == 0) {
            return t6pVar.f33429a;
        }
        if (iOrdinal == 1) {
            return t6pVar.b;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable c(zje zjeVar) {
        zvt zvtVar;
        if (zjeVar instanceof zvt) {
            zvtVar = (zvt) zjeVar;
            int i = zvtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zvtVar.k = i - Integer.MIN_VALUE;
            } else {
                zvtVar = new zvt(this, zjeVar);
            }
        } else {
            zvtVar = new zvt(this, zjeVar);
        }
        Object objA = zvtVar.i;
        wne wneVar = wne.f39444a;
        int i2 = zvtVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            or9 or9Var = (or9) this.f384a;
            zvtVar.k = 1;
            objA = or9Var.a(zvtVar);
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
        List listA0 = CollectionsKt.A0((Iterable) objA, new vvt((byte) 2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listA0) {
            long j = ((it9) obj).b;
            Calendar calendar = Calendar.getInstance();
            calendar.getClass();
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.clear();
            gregorianCalendar.setTimeInMillis(j * 1000);
            Date time = gregorianCalendar.getTime();
            time.getClass();
            calendar.setTime(time);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            Long l = new Long(calendar.getTimeInMillis());
            Object arrayList = linkedHashMap.get(l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(l, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new xq9(((Number) entry.getKey()).longValue(), (List) entry.getValue()));
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(int i, zje zjeVar, String str, boolean z) {
        d6u d6uVar;
        String strR;
        if (zjeVar instanceof d6u) {
            d6uVar = (d6u) zjeVar;
            int i2 = d6uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d6uVar.l = i2 - Integer.MIN_VALUE;
            } else {
                d6uVar = new d6u(this, zjeVar);
            }
        } else {
            d6uVar = new d6u(this, zjeVar);
        }
        Object objG = d6uVar.j;
        wne wneVar = wne.f39444a;
        int i3 = d6uVar.l;
        if (i3 == 0) {
            z1x.P(objG);
            if (StringsKt.W(str)) {
                ali aliVar = (ali) this.f384a;
                d6uVar.i = z;
                d6uVar.l = 1;
                objG = aliVar.g(i, d6uVar);
                if (objG == wneVar) {
                    return wneVar;
                }
            }
            strR = kotlin.text.c.r(str, "https://", "", false);
            if (z) {
                return "https://".concat(strR);
            }
            return strR;
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = d6uVar.i;
        z1x.P(objG);
        str = (String) objG;
        strR = kotlin.text.c.r(str, "https://", "", false);
        if (z) {
            return "https://".concat(strR);
        }
        return strR;
    }

    public Object e(zje zjeVar) {
        kkc kkcVar = (kkc) this.f384a;
        List list = kkcVar.b.f14919a;
        if (!list.isEmpty()) {
            return list;
        }
        Object objD0 = qjj.d0(kkcVar.d.b, new igb((Object) kkcVar, (yje) null, (byte) 7), zjeVar);
        return objD0 == wne.f39444a ? objD0 : (List) objD0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, nbq nbqVar, zje zjeVar) {
        z6q z6qVar;
        if (zjeVar instanceof z6q) {
            z6qVar = (z6q) zjeVar;
            int i = z6qVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z6qVar.k = i - Integer.MIN_VALUE;
            } else {
                z6qVar = new z6q(this, zjeVar);
            }
        } else {
            z6qVar = new z6q(this, zjeVar);
        }
        Object objA = z6qVar.i;
        wne wneVar = wne.f39444a;
        int i2 = z6qVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            y5q y5qVar = (y5q) ((wgn) this.f384a).invoke();
            z6qVar.k = 1;
            objA = y5qVar.a(str, nbqVar, z6qVar);
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
        return ((q16) objA).a();
    }

    public void g(Runnable runnable, String str) {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        Object obj = ytn.f43227a;
        TimeUnit timeUnit = TimeUnit.DAYS;
        sd90 sd90Var = jbs0.f16248a;
        mmn mmnVar = sd90Var.b;
        if (Boolean.FALSE.booleanValue()) {
            yyb0 yyb0Var = sd90Var.c;
            Thread threadCurrentThread = Thread.currentThread();
            long id = threadCurrentThread.getId();
            ncq0 ncq0VarC = yyb0Var.e;
            ncq0 ncq0Var = yyb0Var.f;
            if (ncq0VarC == null || ncq0VarC.d != id) {
                if (ncq0Var == null || ncq0Var.d != id) {
                    ncq0VarC = yyb0Var.c(id, Os.gettid(), threadCurrentThread.getName());
                    yyb0Var.f = yyb0Var.e;
                    yyb0Var.e = ncq0VarC;
                } else {
                    ncq0VarC = ncq0Var;
                }
            }
            ncq0VarC.c.getClass();
            ncq0VarC.c.getClass();
            Fragment fragment = (Fragment) this.f384a;
            fragment.f.getClass();
            fragment.B();
            int i = fragment.z;
            if (i != 0) {
                Integer.toHexString(i);
            }
        }
        boolean z = false;
        try {
            runnable.run();
            if (obj instanceof AutoCloseable) {
                return;
            }
            if (!(obj instanceof ExecutorService)) {
                e9d0.o();
                return;
            }
            ExecutorService executorService = (ExecutorService) obj;
            if (executorService == ForkJoinPool.commonPool() || (zIsTerminated2 = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            while (!zIsTerminated2) {
                try {
                    zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            try {
                ghm0.r(sd90Var, th);
                throw null;
            } catch (Throwable th2) {
                if (obj instanceof AutoCloseable) {
                    throw th2;
                }
                if (!(obj instanceof ExecutorService)) {
                    e9d0.o();
                    return;
                }
                ExecutorService executorService2 = (ExecutorService) obj;
                if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                    throw th2;
                }
                executorService2.shutdown();
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                    } catch (InterruptedException unused2) {
                        if (!z) {
                            executorService2.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (!z) {
                    throw th2;
                }
                Thread.currentThread().interrupt();
                throw th2;
            }
        }
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
        ((tu9) this.f384a).d(th);
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
        tu9 tu9Var = (tu9) this.f384a;
        try {
            tu9Var.b(obj);
        } catch (Throwable th) {
            tu9Var.d(th);
        }
    }

    public a7q(tv3 tv3Var) {
        tv3Var.getClass();
        this.f384a = tv3Var;
    }

    public a7q(nfm0 nfm0Var) {
        nfm0Var.getClass();
        this.f384a = nfm0Var;
    }

    public a7q(or9 or9Var) {
        or9Var.getClass();
        this.f384a = or9Var;
    }

    public a7q(kkc kkcVar) {
        kkcVar.getClass();
        this.f384a = kkcVar;
    }

    public a7q(oue0 oue0Var) {
        oue0Var.getClass();
        this.f384a = oue0Var;
    }

    public a7q(oh9 oh9Var) {
        oh9Var.getClass();
        this.f384a = oh9Var;
    }

    public /* synthetic */ a7q(Object obj) {
        this.f384a = obj;
    }

    public a7q(b6s b6sVar) {
        b6sVar.getClass();
        this.f384a = b6sVar;
    }
}
