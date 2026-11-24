package a;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class qi80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28779a;
    public final m06 b;
    public final el80 c;
    public final h2c d;
    public final int e;
    public final Function0 f;
    public final jru g;
    public final AtomicBoolean h;
    public final q99 i;
    public final ri80 j;
    public final dby k;
    public final fnq l;

    public qi80(Object obj, m06 m06Var, el80 el80Var, h2c h2cVar, int i, om80 om80Var, Function0 function0) {
        m06Var.getClass();
        this.f28779a = obj;
        this.b = m06Var;
        this.c = el80Var;
        this.d = h2cVar;
        this.e = i;
        this.f = function0;
        this.g = new jru();
        this.h = new AtomicBoolean(false);
        yje yjeVar = null;
        this.i = vtb.d(-2, null, null, 6);
        this.j = new ri80(el80Var);
        dby dbyVarG = zvw.g();
        this.k = dbyVarG;
        this.l = new fnq(idx.S(new l19(dbyVarG, new o3s(this, yjeVar, (byte) 24), null)), new o3s(this, yjeVar, (byte) 25));
    }

    public static String h(gp00 gp00Var, Object obj, nm80 nm80Var) {
        if (nm80Var == null) {
            return "End " + gp00Var + " with loadkey " + obj + ". Load CANCELLED.";
        }
        return "End " + gp00Var + " with loadKey " + obj + ". Returned " + nm80Var;
    }

    public final Object a(fnq fnqVar, gp00 gp00Var, bnn0 bnn0Var) {
        yje yjeVar = null;
        byte b = 1;
        gmq gmqVarS = idx.S(new qmq(fnqVar, new a6v(null, this, gp00Var), yjeVar, b));
        wx4 wx4Var = new wx4((Object) gp00Var, yjeVar, (byte) 26);
        gmqVarS.getClass();
        Object objC = ulb.D(new vsg0(new qmq(gmqVarS, wx4Var, yjeVar, (byte) 0)), -1).c(new r980(this, gp00Var, b), bnn0Var);
        return objC == wne.f39444a ? objC : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        gi80 gi80Var;
        ri80 ri80Var;
        k050 k050Var;
        if (zjeVar instanceof gi80) {
            gi80Var = (gi80) zjeVar;
            int i = gi80Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                gi80Var.m = i - Integer.MIN_VALUE;
            } else {
                gi80Var = new gi80(this, zjeVar);
            }
        } else {
            gi80Var = new gi80(this, zjeVar);
        }
        Object obj = gi80Var.k;
        wne wneVar = wne.f39444a;
        int i2 = gi80Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            ri80 ri80Var2 = this.j;
            k050 k050Var2 = ri80Var2.f30529a;
            gi80Var.i = ri80Var2;
            gi80Var.j = k050Var2;
            gi80Var.m = 1;
            if (k050Var2.d(gi80Var) == wneVar) {
                return wneVar;
            }
            ri80Var = ri80Var2;
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = gi80Var.j;
            ri80Var = gi80Var.i;
            z1x.P(obj);
        }
        try {
            return ri80Var.b.a((tmu0) ((dgu) this.g.b).c);
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:115:0x020f  */
    /* JADX WARN: Code duplicated, block: B:119:0x022e  */
    /* JADX WARN: Code duplicated, block: B:126:0x023b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6 A[PHI: r2
  0x00f6: PHI (r2v8 a.i050) = (r2v5 a.i050), (r2v14 a.i050) binds: [B:51:0x00f2, B:41:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130 A[PHI: r15
  0x0130: PHI (r15v8 java.lang.Object) = (r15v7 java.lang.Object), (r15v1 java.lang.Object) binds: [B:59:0x012c, B:39:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x0136  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149  */
    /* JADX WARN: Code duplicated, block: B:70:0x0166 A[Catch: all -> 0x016c, TRY_ENTER, TryCatch #3 {all -> 0x016c, blocks: (B:67:0x014a, B:70:0x0166, B:73:0x016f, B:75:0x0176), top: B:136:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0176 A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #3 {all -> 0x016c, blocks: (B:67:0x014a, B:70:0x0166, B:73:0x016f, B:75:0x0176), top: B:136:0x014a }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0184  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [a.qi80] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    public final Object c(zje zjeVar) throws Throwable {
        hi80 hi80Var;
        i050 i050Var;
        ri80 ri80Var;
        ti80 ti80Var;
        gp00 gp00Var;
        m06 m06Var;
        nm80 nm80Var;
        k050 k050Var;
        nm80 nm80Var2;
        k050 k050Var2;
        ri80 ri80Var2;
        gp00 gp00Var2;
        boolean zC;
        cyu cyuVar;
        Object obj;
        bp00 bp00Var;
        k050 k050Var3;
        nm80 nm80Var3;
        i050 i050Var2;
        q99 q99Var;
        rh80 rh80VarD;
        i050 i050Var3;
        ti80 ti80Var2;
        zo00 zo00Var;
        gp00 gp00Var3;
        if (zjeVar instanceof hi80) {
            hi80Var = (hi80) zjeVar;
            int i = hi80Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                hi80Var.n = i - Integer.MIN_VALUE;
            } else {
                hi80Var = new hi80(this, zjeVar);
            }
        } else {
            hi80Var = new hi80(this, zjeVar);
        }
        Object objE = hi80Var.l;
        wne wneVar = wne.f39444a;
        ?? r2 = hi80Var.n;
        ri80 ri80Var3 = this.j;
        Object obj2 = this.f28779a;
        try {
            switch (r2) {
                case 0:
                    z1x.P(objE);
                    k050 k050Var4 = ri80Var3.f30529a;
                    hi80Var.i = ri80Var3;
                    hi80Var.j = k050Var4;
                    hi80Var.n = 1;
                    if (k050Var4.d(hi80Var) != wneVar) {
                        i050Var = k050Var4;
                        ri80Var = ri80Var3;
                        ti80Var = ri80Var.b;
                        gp00Var = gp00.f11660a;
                        hi80Var.i = i050Var;
                        hi80Var.j = null;
                        hi80Var.n = 2;
                        if (l(ti80Var, gp00Var, hi80Var) != wneVar) {
                            i050Var.c(null);
                            km80 km80VarG = g(gp00.f11660a, obj2);
                            r2 = Build.ID;
                            m06Var = this.b;
                            if (r2 != 0 && Log.isLoggable("Paging", 3)) {
                                Log.d("Paging", "Start REFRESH with loadKey " + obj2 + " on " + m06Var, null);
                            }
                            hi80Var.i = null;
                            hi80Var.n = 3;
                            objE = m06Var.e(km80VarG, hi80Var);
                            if (objE != wneVar) {
                                nm80Var = (nm80) objE;
                                if (nm80Var instanceof mm80) {
                                    k050Var2 = ri80Var3.f30529a;
                                    hi80Var.i = nm80Var;
                                    hi80Var.j = ri80Var3;
                                    hi80Var.k = k050Var2;
                                    hi80Var.n = 4;
                                    if (k050Var2.d(hi80Var) != wneVar) {
                                        ri80Var2 = ri80Var3;
                                        try {
                                            ti80 ti80Var3 = ri80Var2.b;
                                            gp00Var2 = gp00.f11660a;
                                            zC = ti80Var3.c(0, gp00Var2, (mm80) nm80Var, obj2);
                                            cyuVar = ti80Var3.i;
                                            cyuVar.N(gp00Var2, bp00.c);
                                            obj = ((mm80) nm80Var).b;
                                            bp00Var = bp00.b;
                                            if (obj == null) {
                                                cyuVar.N(gp00.b, bp00Var);
                                            }
                                            if (((mm80) nm80Var).c == null) {
                                                cyuVar.N(gp00.c, bp00Var);
                                                break;
                                            }
                                            k050Var2.c(null);
                                            if (zC) {
                                                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                                                    Log.d("Paging", h(gp00Var2, obj2, nm80Var), null);
                                                }
                                                k050Var3 = ri80Var3.f30529a;
                                                hi80Var.i = nm80Var;
                                                hi80Var.j = ri80Var3;
                                                hi80Var.k = k050Var3;
                                                hi80Var.n = 5;
                                                if (k050Var3.d(hi80Var) != wneVar) {
                                                    nm80Var3 = nm80Var;
                                                    try {
                                                        ti80 ti80Var4 = ri80Var3.b;
                                                        q99Var = this.i;
                                                        rh80VarD = ti80Var4.d((mm80) nm80Var3, gp00.f11660a);
                                                        hi80Var.i = nm80Var3;
                                                        hi80Var.j = k050Var3;
                                                        hi80Var.k = null;
                                                        hi80Var.n = 6;
                                                        if (q99Var.m(hi80Var, rh80VarD) != wneVar) {
                                                            i050Var2 = k050Var3;
                                                            i050Var2.c(null);
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        i050Var2 = k050Var3;
                                                        i050Var2.c(null);
                                                        throw th;
                                                    }
                                                }
                                            } else if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                                Log.v("Paging", h(gp00Var2, obj2, null), null);
                                            }
                                            return Unit.f46060a;
                                        } catch (Throwable th2) {
                                            k050Var2.c(null);
                                            throw th2;
                                        }
                                    }
                                } else {
                                    if (nm80Var instanceof lm80) {
                                        t9f.b();
                                        return null;
                                    }
                                    if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                                        Log.v("Paging", h(gp00.f11660a, obj2, nm80Var), null);
                                    }
                                    k050Var = ri80Var3.f30529a;
                                    hi80Var.i = nm80Var;
                                    hi80Var.j = ri80Var3;
                                    hi80Var.k = k050Var;
                                    hi80Var.n = 8;
                                    if (k050Var.d(hi80Var) != wneVar) {
                                        nm80Var2 = nm80Var;
                                        try {
                                            ti80Var2 = ri80Var3.b;
                                            zo00Var = new zo00(((lm80) nm80Var2).f20286a);
                                            gp00Var3 = gp00.f11660a;
                                            hi80Var.i = k050Var;
                                            hi80Var.j = null;
                                            hi80Var.k = null;
                                            hi80Var.n = 9;
                                            if (k(ti80Var2, gp00Var3, zo00Var, hi80Var) != wneVar) {
                                                i050Var3 = k050Var;
                                                i050Var3.c(null);
                                                return Unit.f46060a;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            i050Var3 = k050Var;
                                            i050Var3.c(null);
                                            throw th;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return wneVar;
                case 1:
                    i050Var = (i050) hi80Var.j;
                    ri80Var = (ri80) hi80Var.i;
                    z1x.P(objE);
                    ti80Var = ri80Var.b;
                    gp00Var = gp00.f11660a;
                    hi80Var.i = i050Var;
                    hi80Var.j = null;
                    hi80Var.n = 2;
                    if (l(ti80Var, gp00Var, hi80Var) != wneVar) {
                        i050Var.c(null);
                        km80 km80VarG2 = g(gp00.f11660a, obj2);
                        r2 = Build.ID;
                        m06Var = this.b;
                        if (r2 != 0) {
                            Log.d("Paging", "Start REFRESH with loadKey " + obj2 + " on " + m06Var, null);
                        }
                        hi80Var.i = null;
                        hi80Var.n = 3;
                        objE = m06Var.e(km80VarG2, hi80Var);
                        if (objE != wneVar) {
                            nm80Var = (nm80) objE;
                            if (nm80Var instanceof mm80) {
                                k050Var2 = ri80Var3.f30529a;
                                hi80Var.i = nm80Var;
                                hi80Var.j = ri80Var3;
                                hi80Var.k = k050Var2;
                                hi80Var.n = 4;
                                if (k050Var2.d(hi80Var) != wneVar) {
                                    ri80Var2 = ri80Var3;
                                    ti80 ti80Var5 = ri80Var2.b;
                                    gp00Var2 = gp00.f11660a;
                                    zC = ti80Var5.c(0, gp00Var2, (mm80) nm80Var, obj2);
                                    cyuVar = ti80Var5.i;
                                    cyuVar.N(gp00Var2, bp00.c);
                                    obj = ((mm80) nm80Var).b;
                                    bp00Var = bp00.b;
                                    if (obj == null) {
                                        cyuVar.N(gp00.b, bp00Var);
                                    }
                                    if (((mm80) nm80Var).c == null) {
                                        cyuVar.N(gp00.c, bp00Var);
                                        break;
                                    }
                                    k050Var2.c(null);
                                    if (zC) {
                                        if (Build.ID != null) {
                                            Log.d("Paging", h(gp00Var2, obj2, nm80Var), null);
                                        }
                                        k050Var3 = ri80Var3.f30529a;
                                        hi80Var.i = nm80Var;
                                        hi80Var.j = ri80Var3;
                                        hi80Var.k = k050Var3;
                                        hi80Var.n = 5;
                                        if (k050Var3.d(hi80Var) != wneVar) {
                                            nm80Var3 = nm80Var;
                                            ti80 ti80Var6 = ri80Var3.b;
                                            q99Var = this.i;
                                            rh80VarD = ti80Var6.d((mm80) nm80Var3, gp00.f11660a);
                                            hi80Var.i = nm80Var3;
                                            hi80Var.j = k050Var3;
                                            hi80Var.k = null;
                                            hi80Var.n = 6;
                                            if (q99Var.m(hi80Var, rh80VarD) != wneVar) {
                                                i050Var2 = k050Var3;
                                                i050Var2.c(null);
                                            }
                                        }
                                    } else if (Build.ID != null) {
                                        Log.v("Paging", h(gp00Var2, obj2, null), null);
                                    }
                                    return Unit.f46060a;
                                }
                            } else {
                                if (nm80Var instanceof lm80) {
                                    t9f.b();
                                    return null;
                                }
                                if (Build.ID != null) {
                                    Log.v("Paging", h(gp00.f11660a, obj2, nm80Var), null);
                                }
                                k050Var = ri80Var3.f30529a;
                                hi80Var.i = nm80Var;
                                hi80Var.j = ri80Var3;
                                hi80Var.k = k050Var;
                                hi80Var.n = 8;
                                if (k050Var.d(hi80Var) != wneVar) {
                                    nm80Var2 = nm80Var;
                                    ti80Var2 = ri80Var3.b;
                                    zo00Var = new zo00(((lm80) nm80Var2).f20286a);
                                    gp00Var3 = gp00.f11660a;
                                    hi80Var.i = k050Var;
                                    hi80Var.j = null;
                                    hi80Var.k = null;
                                    hi80Var.n = 9;
                                    if (k(ti80Var2, gp00Var3, zo00Var, hi80Var) != wneVar) {
                                        i050Var3 = k050Var;
                                        i050Var3.c(null);
                                        return Unit.f46060a;
                                    }
                                }
                            }
                        }
                    }
                    return wneVar;
                case 2:
                    i050Var = (i050) hi80Var.i;
                    z1x.P(objE);
                    i050Var.c(null);
                    km80 km80VarG3 = g(gp00.f11660a, obj2);
                    r2 = Build.ID;
                    m06Var = this.b;
                    if (r2 != 0) {
                        Log.d("Paging", "Start REFRESH with loadKey " + obj2 + " on " + m06Var, null);
                    }
                    hi80Var.i = null;
                    hi80Var.n = 3;
                    objE = m06Var.e(km80VarG3, hi80Var);
                    if (objE != wneVar) {
                        nm80Var = (nm80) objE;
                        if (nm80Var instanceof mm80) {
                            k050Var2 = ri80Var3.f30529a;
                            hi80Var.i = nm80Var;
                            hi80Var.j = ri80Var3;
                            hi80Var.k = k050Var2;
                            hi80Var.n = 4;
                            if (k050Var2.d(hi80Var) != wneVar) {
                                ri80Var2 = ri80Var3;
                                ti80 ti80Var7 = ri80Var2.b;
                                gp00Var2 = gp00.f11660a;
                                zC = ti80Var7.c(0, gp00Var2, (mm80) nm80Var, obj2);
                                cyuVar = ti80Var7.i;
                                cyuVar.N(gp00Var2, bp00.c);
                                obj = ((mm80) nm80Var).b;
                                bp00Var = bp00.b;
                                if (obj == null) {
                                    cyuVar.N(gp00.b, bp00Var);
                                }
                                if (((mm80) nm80Var).c == null) {
                                    cyuVar.N(gp00.c, bp00Var);
                                    break;
                                }
                                k050Var2.c(null);
                                if (zC) {
                                    if (Build.ID != null) {
                                        Log.d("Paging", h(gp00Var2, obj2, nm80Var), null);
                                    }
                                    k050Var3 = ri80Var3.f30529a;
                                    hi80Var.i = nm80Var;
                                    hi80Var.j = ri80Var3;
                                    hi80Var.k = k050Var3;
                                    hi80Var.n = 5;
                                    if (k050Var3.d(hi80Var) != wneVar) {
                                        nm80Var3 = nm80Var;
                                        ti80 ti80Var8 = ri80Var3.b;
                                        q99Var = this.i;
                                        rh80VarD = ti80Var8.d((mm80) nm80Var3, gp00.f11660a);
                                        hi80Var.i = nm80Var3;
                                        hi80Var.j = k050Var3;
                                        hi80Var.k = null;
                                        hi80Var.n = 6;
                                        if (q99Var.m(hi80Var, rh80VarD) != wneVar) {
                                            i050Var2 = k050Var3;
                                            i050Var2.c(null);
                                        }
                                    }
                                } else if (Build.ID != null) {
                                    Log.v("Paging", h(gp00Var2, obj2, null), null);
                                }
                                return Unit.f46060a;
                            }
                        } else {
                            if (nm80Var instanceof lm80) {
                                t9f.b();
                                return null;
                            }
                            if (Build.ID != null) {
                                Log.v("Paging", h(gp00.f11660a, obj2, nm80Var), null);
                            }
                            k050Var = ri80Var3.f30529a;
                            hi80Var.i = nm80Var;
                            hi80Var.j = ri80Var3;
                            hi80Var.k = k050Var;
                            hi80Var.n = 8;
                            if (k050Var.d(hi80Var) != wneVar) {
                                nm80Var2 = nm80Var;
                                ti80Var2 = ri80Var3.b;
                                zo00Var = new zo00(((lm80) nm80Var2).f20286a);
                                gp00Var3 = gp00.f11660a;
                                hi80Var.i = k050Var;
                                hi80Var.j = null;
                                hi80Var.k = null;
                                hi80Var.n = 9;
                                if (k(ti80Var2, gp00Var3, zo00Var, hi80Var) != wneVar) {
                                    i050Var3 = k050Var;
                                    i050Var3.c(null);
                                    return Unit.f46060a;
                                }
                            }
                        }
                    }
                    return wneVar;
                case 3:
                    z1x.P(objE);
                    nm80Var = (nm80) objE;
                    if (nm80Var instanceof mm80) {
                        k050Var2 = ri80Var3.f30529a;
                        hi80Var.i = nm80Var;
                        hi80Var.j = ri80Var3;
                        hi80Var.k = k050Var2;
                        hi80Var.n = 4;
                        if (k050Var2.d(hi80Var) != wneVar) {
                            ri80Var2 = ri80Var3;
                            ti80 ti80Var9 = ri80Var2.b;
                            gp00Var2 = gp00.f11660a;
                            zC = ti80Var9.c(0, gp00Var2, (mm80) nm80Var, obj2);
                            cyuVar = ti80Var9.i;
                            cyuVar.N(gp00Var2, bp00.c);
                            obj = ((mm80) nm80Var).b;
                            bp00Var = bp00.b;
                            if (obj == null) {
                                cyuVar.N(gp00.b, bp00Var);
                            }
                            if (((mm80) nm80Var).c == null) {
                                cyuVar.N(gp00.c, bp00Var);
                                break;
                            }
                            k050Var2.c(null);
                            if (zC) {
                                if (Build.ID != null) {
                                    Log.d("Paging", h(gp00Var2, obj2, nm80Var), null);
                                }
                                k050Var3 = ri80Var3.f30529a;
                                hi80Var.i = nm80Var;
                                hi80Var.j = ri80Var3;
                                hi80Var.k = k050Var3;
                                hi80Var.n = 5;
                                if (k050Var3.d(hi80Var) != wneVar) {
                                    nm80Var3 = nm80Var;
                                    ti80 ti80Var10 = ri80Var3.b;
                                    q99Var = this.i;
                                    rh80VarD = ti80Var10.d((mm80) nm80Var3, gp00.f11660a);
                                    hi80Var.i = nm80Var3;
                                    hi80Var.j = k050Var3;
                                    hi80Var.k = null;
                                    hi80Var.n = 6;
                                    if (q99Var.m(hi80Var, rh80VarD) != wneVar) {
                                        i050Var2 = k050Var3;
                                        i050Var2.c(null);
                                    }
                                }
                            } else if (Build.ID != null) {
                                Log.v("Paging", h(gp00Var2, obj2, null), null);
                            }
                            return Unit.f46060a;
                        }
                    } else {
                        if (nm80Var instanceof lm80) {
                            t9f.b();
                            return null;
                        }
                        if (Build.ID != null) {
                            Log.v("Paging", h(gp00.f11660a, obj2, nm80Var), null);
                        }
                        k050Var = ri80Var3.f30529a;
                        hi80Var.i = nm80Var;
                        hi80Var.j = ri80Var3;
                        hi80Var.k = k050Var;
                        hi80Var.n = 8;
                        if (k050Var.d(hi80Var) != wneVar) {
                            nm80Var2 = nm80Var;
                            ti80Var2 = ri80Var3.b;
                            zo00Var = new zo00(((lm80) nm80Var2).f20286a);
                            gp00Var3 = gp00.f11660a;
                            hi80Var.i = k050Var;
                            hi80Var.j = null;
                            hi80Var.k = null;
                            hi80Var.n = 9;
                            if (k(ti80Var2, gp00Var3, zo00Var, hi80Var) != wneVar) {
                                i050Var3 = k050Var;
                                i050Var3.c(null);
                                return Unit.f46060a;
                            }
                        }
                    }
                    return wneVar;
                case 4:
                    k050Var2 = hi80Var.k;
                    ri80Var2 = (ri80) hi80Var.j;
                    nm80 nm80Var4 = (nm80) hi80Var.i;
                    z1x.P(objE);
                    nm80Var = nm80Var4;
                    ti80 ti80Var11 = ri80Var2.b;
                    gp00Var2 = gp00.f11660a;
                    zC = ti80Var11.c(0, gp00Var2, (mm80) nm80Var, obj2);
                    cyuVar = ti80Var11.i;
                    cyuVar.N(gp00Var2, bp00.c);
                    obj = ((mm80) nm80Var).b;
                    bp00Var = bp00.b;
                    if (obj == null) {
                        cyuVar.N(gp00.b, bp00Var);
                    }
                    if (((mm80) nm80Var).c == null) {
                        cyuVar.N(gp00.c, bp00Var);
                        break;
                    }
                    k050Var2.c(null);
                    if (zC) {
                        if (Build.ID != null) {
                            Log.d("Paging", h(gp00Var2, obj2, nm80Var), null);
                        }
                        k050Var3 = ri80Var3.f30529a;
                        hi80Var.i = nm80Var;
                        hi80Var.j = ri80Var3;
                        hi80Var.k = k050Var3;
                        hi80Var.n = 5;
                        if (k050Var3.d(hi80Var) != wneVar) {
                            nm80Var3 = nm80Var;
                            ti80 ti80Var12 = ri80Var3.b;
                            q99Var = this.i;
                            rh80VarD = ti80Var12.d((mm80) nm80Var3, gp00.f11660a);
                            hi80Var.i = nm80Var3;
                            hi80Var.j = k050Var3;
                            hi80Var.k = null;
                            hi80Var.n = 6;
                            if (q99Var.m(hi80Var, rh80VarD) != wneVar) {
                                i050Var2 = k050Var3;
                                i050Var2.c(null);
                            }
                        }
                        return wneVar;
                    }
                    if (Build.ID != null) {
                        Log.v("Paging", h(gp00Var2, obj2, null), null);
                    }
                    return Unit.f46060a;
                case 5:
                    k050Var3 = hi80Var.k;
                    ri80Var3 = (ri80) hi80Var.j;
                    nm80Var3 = (nm80) hi80Var.i;
                    z1x.P(objE);
                    ti80 ti80Var13 = ri80Var3.b;
                    q99Var = this.i;
                    rh80VarD = ti80Var13.d((mm80) nm80Var3, gp00.f11660a);
                    hi80Var.i = nm80Var3;
                    hi80Var.j = k050Var3;
                    hi80Var.k = null;
                    hi80Var.n = 6;
                    if (q99Var.m(hi80Var, rh80VarD) != wneVar) {
                        i050Var2 = k050Var3;
                        i050Var2.c(null);
                        return Unit.f46060a;
                    }
                    return wneVar;
                case 6:
                    i050Var2 = (i050) hi80Var.j;
                    try {
                        z1x.P(objE);
                        i050Var2.c(null);
                        return Unit.f46060a;
                    } catch (Throwable th4) {
                        th = th4;
                        i050Var2.c(null);
                        throw th;
                    }
                case 7:
                    k050 k050Var5 = hi80Var.k;
                    ri80 ri80Var4 = (ri80) hi80Var.j;
                    nm80 nm80Var5 = (nm80) hi80Var.i;
                    z1x.P(objE);
                    try {
                        ri80Var4.b.a((tmu0) ((dgu) this.g.b).c);
                        k050Var5.c(null);
                        mm80 mm80Var = (mm80) nm80Var5;
                        if (mm80Var.b == null) {
                            gp00 gp00Var4 = gp00.f11660a;
                            throw null;
                        }
                        if (mm80Var.c == null) {
                            gp00 gp00Var5 = gp00.f11660a;
                            throw null;
                        }
                        return Unit.f46060a;
                    } catch (Throwable th5) {
                        k050Var5.c(null);
                        throw th5;
                    }
                case 8:
                    k050Var = hi80Var.k;
                    ri80Var3 = (ri80) hi80Var.j;
                    nm80Var2 = (nm80) hi80Var.i;
                    z1x.P(objE);
                    ti80Var2 = ri80Var3.b;
                    zo00Var = new zo00(((lm80) nm80Var2).f20286a);
                    gp00Var3 = gp00.f11660a;
                    hi80Var.i = k050Var;
                    hi80Var.j = null;
                    hi80Var.k = null;
                    hi80Var.n = 9;
                    if (k(ti80Var2, gp00Var3, zo00Var, hi80Var) != wneVar) {
                        i050Var3 = k050Var;
                        i050Var3.c(null);
                        return Unit.f46060a;
                    }
                    return wneVar;
                case 9:
                    i050Var3 = (i050) hi80Var.i;
                    try {
                        z1x.P(objE);
                        i050Var3.c(null);
                        return Unit.f46060a;
                    } catch (Throwable th6) {
                        th = th6;
                        i050Var3.c(null);
                        throw th;
                    }
                default:
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th7) {
            r2.c(null);
            throw th7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x036d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0389  */
    /* JADX WARN: Code duplicated, block: B:108:0x0395  */
    /* JADX WARN: Code duplicated, block: B:110:0x039c  */
    /* JADX WARN: Code duplicated, block: B:112:0x039f  */
    /* JADX WARN: Code duplicated, block: B:113:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:118:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:121:0x03da  */
    /* JADX WARN: Code duplicated, block: B:130:0x040d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0411  */
    /* JADX WARN: Code duplicated, block: B:135:0x0423 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x0436  */
    /* JADX WARN: Code duplicated, block: B:151:0x0455  */
    /* JADX WARN: Code duplicated, block: B:155:0x0479  */
    /* JADX WARN: Code duplicated, block: B:159:0x04a1 A[Catch: all -> 0x04b0, TryCatch #0 {all -> 0x04b0, blocks: (B:156:0x047c, B:157:0x048a, B:159:0x04a1, B:161:0x04a9, B:163:0x04ad, B:167:0x04b6, B:166:0x04b4, B:168:0x04b9), top: B:223:0x047c }] */
    /* JADX WARN: Code duplicated, block: B:163:0x04ad A[Catch: all -> 0x04b0, TryCatch #0 {all -> 0x04b0, blocks: (B:156:0x047c, B:157:0x048a, B:159:0x04a1, B:161:0x04a9, B:163:0x04ad, B:167:0x04b6, B:166:0x04b4, B:168:0x04b9), top: B:223:0x047c }] */
    /* JADX WARN: Code duplicated, block: B:166:0x04b4 A[Catch: all -> 0x04b0, TryCatch #0 {all -> 0x04b0, blocks: (B:156:0x047c, B:157:0x048a, B:159:0x04a1, B:161:0x04a9, B:163:0x04ad, B:167:0x04b6, B:166:0x04b4, B:168:0x04b9), top: B:223:0x047c }] */
    /* JADX WARN: Code duplicated, block: B:171:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:174:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:177:0x04f4  */
    /* JADX WARN: Code duplicated, block: B:178:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0339  */
    /* JADX WARN: Code duplicated, block: B:98:0x0341  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a.qi80] */
    /* JADX WARN: Type inference failed for: r0v19, types: [a.qi80] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v48, types: [a.qi80] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r10v1, types: [a.vmu0] */
    /* JADX WARN: Type inference failed for: r10v10, types: [a.vmu0] */
    /* JADX WARN: Type inference failed for: r10v13, types: [a.cyu] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [a.gp00, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r15v13, types: [a.gp00] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v36, types: [a.gp00, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v38, types: [a.gp00] */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.gp00] */
    /* JADX WARN: Type inference failed for: r1v1, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v43, types: [a.i050] */
    /* JADX WARN: Type inference failed for: r1v53, types: [a.ti80] */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v61, types: [a.gp00, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45, types: [a.gp00] */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [a.gp00, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v48, types: [a.gp00] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v51, types: [a.qi80] */
    /* JADX WARN: Type inference failed for: r4v53, types: [a.ti80] */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v80 */
    /* JADX WARN: Type inference failed for: r4v81 */
    /* JADX WARN: Type inference failed for: r4v82 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(a.gp00 r23, a.rjt r24, a.yje r25) {
        /*
            Method dump skipped, instruction units count: 1506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qi80.d(a.gp00, a.rjt, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(gp00 gp00Var, zje zjeVar) {
        ji80 ji80Var;
        k050 k050Var;
        ri80 ri80Var;
        if (zjeVar instanceof ji80) {
            ji80Var = (ji80) zjeVar;
            int i = ji80Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ji80Var.n = i - Integer.MIN_VALUE;
            } else {
                ji80Var = new ji80(this, zjeVar);
            }
        } else {
            ji80Var = new ji80(this, zjeVar);
        }
        Object obj = ji80Var.l;
        wne wneVar = wne.f39444a;
        int i2 = ji80Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            if (gp00Var == gp00.f11660a) {
                jf4.o("Called for REFRESH but this should only be called for either APPEND or PREPEND loads. This error indicates a bug in the Paging library. Please file a bug report in Buganizer.");
                return null;
            }
            ri80 ri80Var2 = this.j;
            k050Var = ri80Var2.f30529a;
            ji80Var.i = gp00Var;
            ji80Var.j = ri80Var2;
            ji80Var.k = k050Var;
            ji80Var.n = 1;
            if (k050Var.d(ji80Var) == wneVar) {
                return wneVar;
            }
            ri80Var = ri80Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050 k050Var2 = ji80Var.k;
            ri80Var = ji80Var.j;
            gp00 gp00Var2 = ji80Var.i;
            z1x.P(obj);
            k050Var = k050Var2;
            gp00Var = gp00Var2;
        }
        try {
            ti80 ti80Var = ri80Var.b;
            int i3 = ti80Var.e;
            ArrayList arrayList = ti80Var.c;
            int i4 = -i3;
            int size = (arrayList.size() - ti80Var.e) - 1;
            if (arrayList.isEmpty()) {
                return Unit.f46060a;
            }
            this.g.c(gp00Var, gp00Var == gp00.c ? new tmu0(size, q3d.i(((mm80) CollectionsKt.d0(arrayList)).f22025a), ti80Var.b() - 1, 0, i4, size) : new tmu0(i4, 0, 0, ti80Var.b() - 1, i4, size));
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(mm80 mm80Var, zje zjeVar) {
        ki80 ki80Var;
        mm80 mm80Var2;
        ri80 ri80Var;
        k050 k050Var;
        Object obj;
        if (zjeVar instanceof ki80) {
            ki80Var = (ki80) zjeVar;
            int i = ki80Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                ki80Var.n = i - Integer.MIN_VALUE;
            } else {
                ki80Var = new ki80(this, zjeVar);
            }
        } else {
            ki80Var = new ki80(this, zjeVar);
        }
        Object obj2 = ki80Var.l;
        wne wneVar = wne.f39444a;
        int i2 = ki80Var.n;
        if (i2 == 0) {
            z1x.P(obj2);
            ri80 ri80Var2 = this.j;
            k050 k050Var2 = ri80Var2.f30529a;
            ki80Var.i = mm80Var;
            ki80Var.j = ri80Var2;
            ki80Var.k = k050Var2;
            ki80Var.n = 1;
            if (k050Var2.d(ki80Var) == wneVar) {
                return wneVar;
            }
            mm80Var2 = mm80Var;
            ri80Var = ri80Var2;
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = ki80Var.k;
            ri80Var = ki80Var.j;
            mm80Var2 = ki80Var.i;
            z1x.P(obj2);
        }
        try {
            ti80 ti80Var = ri80Var.b;
            mm80Var2.getClass();
            int iHashCode = mm80Var2.hashCode();
            LinkedHashMap linkedHashMap = ti80Var.d;
            if (linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                obj = linkedHashMap.get(Integer.valueOf(iHashCode));
            } else {
                ohq.q(mm80Var2, ". This likely indicates an error in the library. Please file a bug in the Buganizer.", "Load key not found for Page ");
                obj = null;
            }
            return obj;
        } finally {
            k050Var.c(null);
        }
    }

    public final km80 g(gp00 gp00Var, Object obj) {
        int i = gp00Var == gp00.f11660a ? this.e : this.c.f7986a;
        gp00Var.getClass();
        int iOrdinal = gp00Var.ordinal();
        if (iOrdinal == 0) {
            return new jm80(obj, i);
        }
        if (iOrdinal == 1) {
            if (obj != null) {
                return new im80(obj, i);
            }
            jf4.o("key cannot be null for prepend");
            return null;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return null;
        }
        if (obj != null) {
            return new hm80(obj, i);
        }
        jf4.o("key cannot be null for append");
        return null;
    }

    public final Object i(ti80 ti80Var, gp00 gp00Var, int i, int i2) {
        ti80Var.getClass();
        int iOrdinal = gp00Var.ordinal();
        if (iOrdinal == 0) {
            jf4.o("Cannot get loadId for loadType: REFRESH");
            return null;
        }
        if (iOrdinal != 1 && iOrdinal != 2) {
            t9f.b();
            return null;
        }
        if (i != 0 || (ti80Var.i.h(gp00Var) instanceof zo00) || i2 >= this.c.b) {
            return null;
        }
        gp00 gp00Var2 = gp00.b;
        ArrayList arrayList = ti80Var.c;
        return gp00Var == gp00Var2 ? ((mm80) CollectionsKt.U(arrayList)).b : ((mm80) CollectionsKt.d0(arrayList)).c;
    }

    public final Object j(gp00 gp00Var, vmu0 vmu0Var, oi80 oi80Var) throws Throwable {
        if (ei80.f7846a[gp00Var.ordinal()] == 1) {
            Object objC = c(oi80Var);
            return objC == wne.f39444a ? objC : Unit.f46060a;
        }
        if (vmu0Var != null) {
            this.g.c(gp00Var, vmu0Var);
            return Unit.f46060a;
        }
        jf4.n("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        return null;
    }

    public final Object k(ti80 ti80Var, gp00 gp00Var, zo00 zo00Var, zje zjeVar) {
        cyu cyuVar = ti80Var.i;
        if (cyuVar.h(gp00Var).equals(zo00Var)) {
            return Unit.f46060a;
        }
        cyuVar.N(gp00Var, zo00Var);
        Object objM = this.i.m(zjeVar, new sh80(cyuVar.P(), null));
        return objM == wne.f39444a ? objM : Unit.f46060a;
    }

    public final Object l(ti80 ti80Var, gp00 gp00Var, zje zjeVar) {
        cyu cyuVar = ti80Var.i;
        mva mvaVarH = cyuVar.h(gp00Var);
        ap00 ap00Var = ap00.b;
        if (mvaVarH.equals(ap00Var)) {
            return Unit.f46060a;
        }
        cyuVar.N(gp00Var, ap00Var);
        Object objM = this.i.m(zjeVar, new sh80(cyuVar.P(), null));
        return objM == wne.f39444a ? objM : Unit.f46060a;
    }

    public final void m(vne vneVar) {
        yje yjeVar = null;
        qjj.W(vneVar, null, null, new pi80(this, yjeVar, (byte) 0), 3);
        qjj.W(vneVar, null, null, new pi80(this, yjeVar, (byte) 1), 3);
    }
}
