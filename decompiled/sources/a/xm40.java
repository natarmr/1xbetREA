package a;

import android.gov.nist.core.Separators;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xm40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f41104a = new ConcurrentHashMap();

    /* JADX WARN: Code duplicated, block: B:21:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:22:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:25:0x016d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0180  */
    /* JADX WARN: Code duplicated, block: B:36:0x018b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0262  */
    /* JADX WARN: Code duplicated, block: B:44:0x026b A[LOOP:0: B:38:0x0250->B:44:0x026b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x026a A[SYNTHETIC] */
    public static final pog0 a(Class cls) {
        jey jeyVar;
        zlf0 zlf0Var;
        zlf0 zlf0Var2;
        e1v0 e1v0Var;
        ConcurrentHashMap concurrentHashMap;
        jey jeyVar2;
        fx fxVarL;
        qv90 qv90VarL;
        pog0 pog0Var;
        e1v0 e1v0Var2;
        ConcurrentHashMap concurrentHashMap2;
        WeakReference weakReference;
        pog0 pog0Var2;
        cls.getClass();
        ClassLoader classLoaderD = bqe0.d(cls);
        e1v0 e1v0Var3 = new e1v0(classLoaderD);
        ConcurrentHashMap concurrentHashMap3 = f41104a;
        WeakReference weakReference2 = (WeakReference) concurrentHashMap3.get(e1v0Var3);
        if (weakReference2 != null) {
            pog0 pog0Var3 = (pog0) weakReference2.get();
            if (pog0Var3 != null) {
                return pog0Var3;
            }
            concurrentHashMap3.remove(e1v0Var3, weakReference2);
        }
        jtv jtvVar = jtv.m;
        yox yoxVar = new yox(classLoaderD);
        ClassLoader classLoader = Unit.class.getClassLoader();
        classLoader.getClass();
        yox yoxVar2 = new yox(classLoader);
        zx10 zx10Var = new zx10(classLoaderD);
        gqw0 gqw0Var = gqw0.A1;
        eu00 eu00Var = new eu00("DeserializationComponentsForJava.ModuleData");
        hey[] heyVarArr = hey.f12948a;
        jey jeyVar3 = new jey(eu00Var);
        zm40 zm40Var = new zm40(g950.i(Separators.LESS_THAN + ("runtime module for " + classLoaderD) + '>'), eu00Var, jeyVar3, 56);
        jyj0 jyj0Var = eu00Var.f8395a;
        jyj0Var.lock();
        try {
            if (jeyVar3.f1366a != null) {
                throw new AssertionError("Built-ins module is already set: " + jeyVar3.f1366a + " (attempting to reset to " + zm40Var + Separators.RPAREN);
            }
            jeyVar3.f1366a = zm40Var;
            jyj0Var.unlock();
            jeyVar3.f = new gey(zm40Var, (byte) 0);
            jfk jfkVar = new jfk();
            epi0 epi0Var = new epi0((byte) 7);
            n660 n660Var = new n660(eu00Var, zm40Var);
            lwf lwfVar = lwf.x;
            fty ftyVar = new fty(1, 9, 0);
            w9y w9yVar = v9y.d;
            fty ftyVar2 = w9yVar.b;
            if (ftyVar2 != null) {
                jeyVar = jeyVar3;
                if (ftyVar2.d - ftyVar.d <= 0) {
                    zlf0Var = w9yVar.c;
                }
                zlf0Var.getClass();
                if (zlf0Var == zlf0.WARN) {
                    zlf0Var2 = null;
                } else {
                    zlf0Var2 = zlf0Var;
                }
                cgx0 cgx0Var = new cgx0(new ydy(zlf0Var, zlf0Var2), new w0((Object) ftyVar, (byte) 26));
                iun iunVar = iun.f15405a;
                zie0 zie0Var = new zie0(eu00Var, iunVar);
                xre0 xre0Var = new xre0(zm40Var, n660Var);
                a93 a93Var = new a93(cgx0Var);
                cge0 cge0Var = new cge0(new tqt());
                km50.b.getClass();
                lm50 lm50Var = jm50.b;
                jey jeyVar4 = jeyVar;
                e1v0Var = e1v0Var3;
                concurrentHashMap = concurrentHashMap3;
                s9z s9zVar = new s9z(new v7i(eu00Var, zx10Var, yoxVar, jfkVar, zie0Var, epi0Var, lwfVar, zm40Var, xre0Var, a93Var, cge0Var, lm50Var, cgx0Var, new bek()));
                vd40 vd40Var = vd40.g;
                vd40Var.getClass();
                zpu zpuVar = new zpu(yoxVar, jfkVar, (byte) 14);
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = yoxVar;
                esg0Var.b = eu00Var.c(new w0((Object) esg0Var, (byte) 0));
                esg0Var.c = zm40Var;
                esg0Var.d = n660Var;
                esg0Var.e = new ehf0(zm40Var, n660Var);
                esg0Var.f = vd40.g;
                esg0Var.f = vd40Var;
                List listC = kotlin.collections.a.c(uyj.f36492a);
                listC.getClass();
                ary aryVar = zm40Var.e;
                jeyVar2 = aryVar instanceof jey ? (jey) aryVar : null;
                jtv jtvVar2 = jtv.l;
                if (jeyVar2 != null || (fxVarL = jeyVar2.L()) == null) {
                    fxVarL = rv00.b;
                }
                if (jeyVar2 != null || (qv90VarL = jeyVar2.L()) == null) {
                    qv90VarL = lwf.y;
                }
                f6i f6iVar = new f6i(eu00Var, zm40Var, zpuVar, esg0Var, s9zVar, gqw0Var, jtvVar2, iunVar, n660Var, fxVarL, qv90VarL, egy.f7784a, lm50Var, new zie0(eu00Var, iunVar), listC, jtvVar);
                jfkVar.f16431a = f6iVar;
                epi0Var.b = new yox(s9zVar);
                mey meyVarL = jeyVar4.L();
                mey meyVarL2 = jeyVar4.L();
                zie0 zie0Var2 = new zie0(eu00Var, iunVar);
                meyVarL.getClass();
                meyVarL2.getClass();
                oey oeyVar = new oey(eu00Var, yoxVar2, zm40Var);
                cad cadVar = new cad(oeyVar, (byte) 14);
                zc9 zc9Var = zc9.m;
                oeyVar.c = new f6i(eu00Var, zm40Var, cadVar, new chf0(zm40Var, n660Var, zc9Var), oeyVar, q3d.j(new xc9(eu00Var, zm40Var), new fey(eu00Var, zm40Var)), n660Var, meyVarL, meyVarL2, zc9Var.f44156a, lm50Var, zie0Var2, 262144);
                List listG0 = tx3.g0(new zm40[]{zm40Var});
                listG0.getClass();
                xun xunVar = xun.f41520a;
                xunVar.getClass();
                zm40Var.h = new yuu(listG0, xunVar, iunVar, xunVar);
                zm40Var.i = new hld(q3d.j(s9zVar, oeyVar), "CompositeProvider@RuntimeModuleData for " + zm40Var);
                pog0Var = new pog0(f6iVar, new yuu(jfkVar, yoxVar));
                while (true) {
                    e1v0Var2 = e1v0Var;
                    concurrentHashMap2 = concurrentHashMap;
                    weakReference = (WeakReference) concurrentHashMap2.putIfAbsent(e1v0Var2, new WeakReference(pog0Var));
                    if (weakReference == null) {
                        return pog0Var;
                    }
                    pog0Var2 = (pog0) weakReference.get();
                    if (pog0Var2 != null) {
                        return pog0Var2;
                    }
                    concurrentHashMap2.remove(e1v0Var2, weakReference);
                    e1v0Var = e1v0Var2;
                    concurrentHashMap = concurrentHashMap2;
                }
            } else {
                jeyVar = jeyVar3;
            }
            zlf0Var = w9yVar.f38802a;
            zlf0Var.getClass();
            if (zlf0Var == zlf0.WARN) {
                zlf0Var2 = null;
            } else {
                zlf0Var2 = zlf0Var;
            }
            cgx0 cgx0Var2 = new cgx0(new ydy(zlf0Var, zlf0Var2), new w0((Object) ftyVar, (byte) 26));
            iun iunVar2 = iun.f15405a;
            zie0 zie0Var3 = new zie0(eu00Var, iunVar2);
            xre0 xre0Var2 = new xre0(zm40Var, n660Var);
            a93 a93Var2 = new a93(cgx0Var2);
            cge0 cge0Var2 = new cge0(new tqt());
            km50.b.getClass();
            lm50 lm50Var2 = jm50.b;
            jey jeyVar5 = jeyVar;
            e1v0Var = e1v0Var3;
            concurrentHashMap = concurrentHashMap3;
            s9z s9zVar2 = new s9z(new v7i(eu00Var, zx10Var, yoxVar, jfkVar, zie0Var3, epi0Var, lwfVar, zm40Var, xre0Var2, a93Var2, cge0Var2, lm50Var2, cgx0Var2, new bek()));
            vd40 vd40Var2 = vd40.g;
            vd40Var2.getClass();
            zpu zpuVar2 = new zpu(yoxVar, jfkVar, (byte) 14);
            esg0 esg0Var2 = new esg0();
            esg0Var2.f8326a = yoxVar;
            esg0Var2.b = eu00Var.c(new w0((Object) esg0Var2, (byte) 0));
            esg0Var2.c = zm40Var;
            esg0Var2.d = n660Var;
            esg0Var2.e = new ehf0(zm40Var, n660Var);
            esg0Var2.f = vd40.g;
            esg0Var2.f = vd40Var2;
            List listC2 = kotlin.collections.a.c(uyj.f36492a);
            listC2.getClass();
            ary aryVar2 = zm40Var.e;
            if (aryVar2 instanceof jey) {
            }
            jtv jtvVar3 = jtv.l;
            if (jeyVar2 != null) {
                fxVarL = rv00.b;
            } else {
                fxVarL = rv00.b;
            }
            if (jeyVar2 != null) {
                qv90VarL = lwf.y;
            } else {
                qv90VarL = lwf.y;
            }
            f6i f6iVar2 = new f6i(eu00Var, zm40Var, zpuVar2, esg0Var2, s9zVar2, gqw0Var, jtvVar3, iunVar2, n660Var, fxVarL, qv90VarL, egy.f7784a, lm50Var2, new zie0(eu00Var, iunVar2), listC2, jtvVar);
            jfkVar.f16431a = f6iVar2;
            epi0Var.b = new yox(s9zVar2);
            mey meyVarL3 = jeyVar5.L();
            mey meyVarL4 = jeyVar5.L();
            zie0 zie0Var4 = new zie0(eu00Var, iunVar2);
            meyVarL3.getClass();
            meyVarL4.getClass();
            oey oeyVar2 = new oey(eu00Var, yoxVar2, zm40Var);
            cad cadVar2 = new cad(oeyVar2, (byte) 14);
            zc9 zc9Var2 = zc9.m;
            oeyVar2.c = new f6i(eu00Var, zm40Var, cadVar2, new chf0(zm40Var, n660Var, zc9Var2), oeyVar2, q3d.j(new xc9(eu00Var, zm40Var), new fey(eu00Var, zm40Var)), n660Var, meyVarL3, meyVarL4, zc9Var2.f44156a, lm50Var2, zie0Var4, 262144);
            List listG1 = tx3.g0(new zm40[]{zm40Var});
            listG1.getClass();
            xun xunVar2 = xun.f41520a;
            xunVar2.getClass();
            zm40Var.h = new yuu(listG1, xunVar2, iunVar2, xunVar2);
            zm40Var.i = new hld(q3d.j(s9zVar2, oeyVar2), "CompositeProvider@RuntimeModuleData for " + zm40Var);
            pog0Var = new pog0(f6iVar2, new yuu(jfkVar, yoxVar));
            while (true) {
                e1v0Var2 = e1v0Var;
                concurrentHashMap2 = concurrentHashMap;
                weakReference = (WeakReference) concurrentHashMap2.putIfAbsent(e1v0Var2, new WeakReference(pog0Var));
                if (weakReference == null) {
                    return pog0Var;
                }
                pog0Var2 = (pog0) weakReference.get();
                if (pog0Var2 != null) {
                    return pog0Var2;
                }
                concurrentHashMap2.remove(e1v0Var2, weakReference);
                e1v0Var = e1v0Var2;
                concurrentHashMap = concurrentHashMap2;
            }
        } catch (Throwable th) {
            try {
                eu00Var.b.getClass();
                throw th;
            } catch (Throwable th2) {
                jyj0Var.unlock();
                throw th2;
            }
        }
    }
}
