package a;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class ryn implements tlx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gbe0 f31321a;
    public final td9 b;
    public final chf0 c;
    public final nr00 d;

    public ryn(gbe0 gbe0Var, td9 td9Var, chf0 chf0Var) {
        this.f31321a = gbe0Var;
        this.b = td9Var;
        this.c = chf0Var;
        this.d = new nr00(gbe0Var, chf0Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // a.tlx
    public final Object a(ibe0 ibe0Var, zje zjeVar) throws Throwable {
        qyn qynVar;
        ibe0 ibe0Var2 = ibe0Var;
        nr00 nr00Var = this.d;
        if (zjeVar instanceof qyn) {
            qynVar = (qyn) zjeVar;
            int i = qynVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qynVar.l = i - Integer.MIN_VALUE;
            } else {
                qynVar = new qyn(this, zjeVar);
            }
        } else {
            qynVar = new qyn(this, zjeVar);
        }
        qyn qynVar2 = qynVar;
        Object obj = qynVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = qynVar2.l;
        if (i2 == 0) {
            z1x.P(obj);
            try {
                o1x o1xVar = (o1x) ibe0Var2.d;
                Object obj2 = o1xVar.b;
                f7k0 f7k0Var = (f7k0) ibe0Var2.f;
                gqw0 gqw0Var = (gqw0) ibe0Var2.g;
                a780 a780VarC0 = this.c.c0(o1xVar, f7k0Var);
                j1h0 j1h0Var = a780VarC0.c;
                List list = this.f31321a.d.b;
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Pair pair = (Pair) list.get(i3);
                    v23 v23Var = (v23) pair.f46059a;
                    if (((sgy) pair.b).r(obj2)) {
                        v23Var.getClass();
                        aot0 aot0VarA = v23Var.a(obj2, a780VarC0);
                        if (aot0VarA != null) {
                            obj2 = aot0VarA;
                        }
                    }
                }
                jr30 jr30VarI = nr00Var.i(o1xVar, obj2, a780VarC0, gqw0Var);
                kr30 kr30VarE = jr30VarI != null ? nr00Var.e(o1xVar, jr30VarI, f7k0Var, j1h0Var) : null;
                if (kr30VarE == null) {
                    CoroutineContext coroutineContext = o1xVar.j;
                    s6d s6dVar = new s6d(this, o1xVar, obj2, a780VarC0, gqw0Var, jr30VarI, ibe0Var2, null, (byte) 4);
                    qynVar2.i = ibe0Var2;
                    qynVar2.l = 1;
                    Object objD0 = qjj.d0(coroutineContext, s6dVar, qynVar2);
                    return objD0 == wneVar ? wneVar : objD0;
                }
                Map map = kr30VarE.b;
                dyw dywVar = kr30VarE.f18747a;
                ibj ibjVar = ibj.f14489a;
                Object obj3 = map.get("coil#disk_cache_key");
                String str = obj3 instanceof String ? (String) obj3 : null;
                Object obj4 = map.get("coil#is_sampled");
                Boolean bool = obj4 instanceof Boolean ? (Boolean) obj4 : null;
                return new hhn0(dywVar, o1xVar, ibjVar, jr30VarI, str, bool != null ? bool.booleanValue() : false, ibe0Var2.b);
            } catch (Throwable th) {
                th = th;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ibe0 ibe0Var3 = qynVar2.i;
            try {
                z1x.P(obj);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                ibe0Var2 = ibe0Var3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        return v2n0.d((o1x) ibe0Var2.d, th);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Code duplicated, block: B:20:0x0072 A[LOOP:0: B:16:0x0052->B:20:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009f -> B:27:0x00a2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(a.hmk0 r7, a.ngd r8, a.o1x r9, java.lang.Object r10, a.a780 r11, a.gqw0 r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ryn.b(a.hmk0, a.ngd, a.o1x, java.lang.Object, a.a780, a.gqw0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x011b  */
    /* JADX WARN: Code duplicated, block: B:52:0x011e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
    
        if (r1 == r9) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.o1x r16, java.lang.Object r17, a.a780 r18, a.gqw0 r19, a.zje r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ryn.c(a.o1x, java.lang.Object, a.a780, a.gqw0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    /* JADX WARN: Code duplicated, block: B:25:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00af -> B:28:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(a.ngd r9, a.o1x r10, java.lang.Object r11, a.a780 r12, a.gqw0 r13, a.zje r14) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ryn.d(a.ngd, a.o1x, java.lang.Object, a.a780, a.gqw0, a.zje):java.lang.Object");
    }
}
