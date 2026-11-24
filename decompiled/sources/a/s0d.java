package a;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s0d implements tlx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f31406a;
    public final Function1 b;
    public final ConcurrentHashMap c;

    public s0d() {
        e6c e6cVar = new e6c((byte) 14);
        e6c e6cVar2 = new e6c((byte) 15);
        this.f31406a = e6cVar;
        this.b = e6cVar2;
        this.c = new ConcurrentHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.tlx
    public final Object a(ibe0 ibe0Var, zje zjeVar) throws Throwable {
        r0d r0dVar;
        odd oddVar;
        Object obj;
        o1x o1xVar;
        u1x u1xVar;
        hhn0 hhn0Var;
        Object objD;
        ibe0 ibe0Var2 = ibe0Var;
        if (zjeVar instanceof r0d) {
            r0d r0dVar2 = (r0d) zjeVar;
            int i = r0dVar2.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                r0dVar2.o = i - Integer.MIN_VALUE;
                r0dVar = r0dVar2;
            } else {
                r0dVar = new r0d(this, zjeVar);
            }
        } else {
            r0dVar = new r0d(this, zjeVar);
        }
        Object objD2 = r0dVar.m;
        Object obj2 = wne.f39444a;
        int i2 = r0dVar.o;
        ConcurrentHashMap concurrentHashMap = this.c;
        try {
            if (i2 == 0) {
                z1x.P(objD2);
                o1x o1xVar2 = (o1x) ibe0Var2.d;
                if (((Boolean) this.f31406a.invoke(o1xVar2)).booleanValue()) {
                    String str = (String) this.b.invoke(o1xVar2);
                    odd oddVar2 = new odd();
                    ndd nddVar = (ndd) concurrentHashMap.putIfAbsent(str, oddVar2);
                    if (nddVar != null) {
                        r0dVar.i = ibe0Var2;
                        r0dVar.j = o1xVar2;
                        r0dVar.k = null;
                        r0dVar.l = null;
                        r0dVar.o = 2;
                        Object objQ = ((odd) nddVar).q(r0dVar);
                        if (objQ != obj2) {
                            o1xVar = o1xVar2;
                            objD2 = objQ;
                            u1xVar = (u1x) objD2;
                            if (u1xVar instanceof hhn0) {
                                hhn0Var = (hhn0) u1xVar;
                            } else {
                                hhn0Var = null;
                            }
                            if (hhn0Var != null) {
                                return new hhn0(hhn0Var.f13073a, o1xVar, hhn0Var.c, hhn0Var.d, hhn0Var.e, hhn0Var.f, hhn0Var.g);
                            }
                            ibe0 ibe0VarG = ibe0Var2.g(o1xVar);
                            r0dVar.i = null;
                            r0dVar.j = null;
                            r0dVar.k = null;
                            r0dVar.l = null;
                            r0dVar.o = 3;
                            objD = ibe0VarG.d(r0dVar);
                            if (objD == obj2) {
                                return objD;
                            }
                        }
                    } else {
                        try {
                            ibe0 ibe0VarG2 = ibe0Var2.g(o1xVar2);
                            r0dVar.i = null;
                            r0dVar.j = null;
                            r0dVar.k = str;
                            r0dVar.l = oddVar2;
                            r0dVar.o = 4;
                            objD2 = ibe0VarG2.d(r0dVar);
                            if (objD2 != obj2) {
                                obj = str;
                                oddVar = oddVar2;
                                u1x u1xVar2 = (u1x) objD2;
                                oddVar.N(u1xVar2);
                                concurrentHashMap.remove(obj);
                                return u1xVar2;
                            }
                        } catch (Exception e) {
                            e = e;
                            oddVar = oddVar2;
                            oddVar.b0(e);
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r0dVar = str;
                            concurrentHashMap.remove(r0dVar);
                            throw th;
                        }
                    }
                } else {
                    ibe0 ibe0VarG3 = ibe0Var2.g(o1xVar2);
                    r0dVar.i = null;
                    r0dVar.j = null;
                    r0dVar.o = 1;
                    Object objD3 = ibe0VarG3.d(r0dVar);
                    if (objD3 != obj2) {
                        return objD3;
                    }
                }
            } else {
                if (i2 == 1) {
                    z1x.P(objD2);
                    return objD2;
                }
                if (i2 != 2) {
                    if (i2 == 3) {
                        z1x.P(objD2);
                        return objD2;
                    }
                    if (i2 != 4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oddVar = r0dVar.l;
                    obj = r0dVar.k;
                    try {
                        z1x.P(objD2);
                        u1x u1xVar3 = (u1x) objD2;
                        oddVar.N(u1xVar3);
                        concurrentHashMap.remove(obj);
                        return u1xVar3;
                    } catch (Exception e2) {
                        e = e2;
                        oddVar.b0(e);
                        throw e;
                    }
                }
                o1x o1xVar3 = r0dVar.j;
                ibe0Var2 = r0dVar.i;
                z1x.P(objD2);
                o1xVar = o1xVar3;
                u1xVar = (u1x) objD2;
                if (u1xVar instanceof hhn0) {
                    hhn0Var = (hhn0) u1xVar;
                } else {
                    hhn0Var = null;
                }
                if (hhn0Var != null) {
                    return new hhn0(hhn0Var.f13073a, o1xVar, hhn0Var.c, hhn0Var.d, hhn0Var.e, hhn0Var.f, hhn0Var.g);
                }
                ibe0 ibe0VarG4 = ibe0Var2.g(o1xVar);
                r0dVar.i = null;
                r0dVar.j = null;
                r0dVar.k = null;
                r0dVar.l = null;
                r0dVar.o = 3;
                objD = ibe0VarG4.d(r0dVar);
                if (objD == obj2) {
                    return objD;
                }
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
