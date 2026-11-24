package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class na6 extends zzf0 implements Function2 {
    public qz40 j;
    public xoa0 k;
    public long l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ vne o;
    public final /* synthetic */ bxq0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na6(vne vneVar, bxq0 bxq0Var, yje yjeVar) {
        super(2, yjeVar);
        this.o = vneVar;
        this.p = bxq0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        na6 na6Var = new na6(this.o, this.p, yjeVar);
        na6Var.n = obj;
        return na6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((na6) create((inn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #2 {all -> 0x001a, blocks: (B:8:0x0015, B:41:0x00c1, B:43:0x00c5), top: B:51:0x0015 }] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        qz40 qz40VarA;
        long jC;
        xoa0 xoa0Var;
        inn0 inn0Var;
        inn0 inn0Var2;
        qz40 qz40Var;
        qz40 qz40Var2;
        dpa0 dpa0Var;
        wne wneVar = wne.f39444a;
        byte b = this.m;
        byte b2 = 0;
        yje yjeVar = null;
        if (b == 0) {
            z1x.P(obj);
            inn0 inn0Var3 = (inn0) this.n;
            qz40VarA = q7m0.a(Boolean.FALSE);
            jC = inn0Var3.e().c();
            xoa0Var = xoa0.f41207a;
            this.n = inn0Var3;
            this.j = qz40VarA;
            this.k = xoa0Var;
            this.l = jC;
            this.m = (byte) 1;
            Object objB = tto0.b(inn0Var3, false, this, 1);
            if (objB != wneVar) {
                inn0Var = inn0Var3;
                obj = objB;
            }
            return wneVar;
        }
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qz40Var2 = (qz40) this.n;
                try {
                    z1x.P(obj);
                    dpa0Var = (dpa0) obj;
                    if (dpa0Var != null) {
                        dpa0Var.a();
                    }
                    Boolean bool = Boolean.FALSE;
                    p7m0 p7m0Var = (p7m0) qz40Var2;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool);
                    return Unit.f46060a;
                } catch (Throwable th) {
                    th = th;
                    Boolean bool2 = Boolean.FALSE;
                    p7m0 p7m0Var2 = (p7m0) qz40Var2;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, bool2);
                    throw th;
                }
            }
            xoa0 xoa0Var2 = this.k;
            qz40Var = this.j;
            inn0Var2 = (inn0) this.n;
            try {
                z1x.P(obj);
                Boolean bool3 = Boolean.FALSE;
                p7m0 p7m0Var3 = (p7m0) qz40Var;
                p7m0Var3.getClass();
                p7m0Var3.o(null, bool3);
            } catch (yoa0 unused) {
                xoa0Var = xoa0Var2;
                qz40VarA = qz40Var;
                qjj.W(this.o, null, yne.d, new ex1((Object) qz40VarA, (Object) this.p, yjeVar, (byte) 8), 1);
                this.n = qz40VarA;
                this.j = null;
                this.k = null;
                this.m = (byte) 3;
                obj = tto0.i(inn0Var2, xoa0Var, this);
                if (obj != wneVar) {
                    qz40Var2 = qz40VarA;
                    dpa0Var = (dpa0) obj;
                    if (dpa0Var != null) {
                        dpa0Var.a();
                    }
                    Boolean bool4 = Boolean.FALSE;
                    p7m0 p7m0Var4 = (p7m0) qz40Var2;
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, bool4);
                }
                return wneVar;
            } catch (Throwable th2) {
                th = th2;
                qz40Var2 = qz40Var;
                Boolean bool5 = Boolean.FALSE;
                p7m0 p7m0Var5 = (p7m0) qz40Var2;
                p7m0Var5.getClass();
                p7m0Var5.o(null, bool5);
                throw th;
            }
            return Unit.f46060a;
        }
        jC = this.l;
        xoa0 xoa0Var3 = this.k;
        qz40 qz40Var3 = this.j;
        inn0Var = (inn0) this.n;
        z1x.P(obj);
        xoa0Var = xoa0Var3;
        qz40VarA = qz40Var3;
        int i = ((dpa0) obj).i;
        if (i == 1 || i == 3) {
            try {
                try {
                    ma6 ma6Var = new ma6(xoa0Var, yjeVar, b2);
                    this.n = inn0Var;
                    this.j = qz40VarA;
                    this.k = xoa0Var;
                    this.m = (byte) 2;
                    if (inn0Var.g(jC, ma6Var, this) != wneVar) {
                        qz40Var = qz40VarA;
                        Boolean bool6 = Boolean.FALSE;
                        p7m0 p7m0Var6 = (p7m0) qz40Var;
                        p7m0Var6.getClass();
                        p7m0Var6.o(null, bool6);
                    }
                } catch (yoa0 unused2) {
                    inn0Var2 = inn0Var;
                    qjj.W(this.o, null, yne.d, new ex1((Object) qz40VarA, (Object) this.p, yjeVar, (byte) 8), 1);
                    this.n = qz40VarA;
                    this.j = null;
                    this.k = null;
                    this.m = (byte) 3;
                    obj = tto0.i(inn0Var2, xoa0Var, this);
                    if (obj != wneVar) {
                        qz40Var2 = qz40VarA;
                        dpa0Var = (dpa0) obj;
                        if (dpa0Var != null) {
                            dpa0Var.a();
                        }
                        Boolean bool7 = Boolean.FALSE;
                        p7m0 p7m0Var7 = (p7m0) qz40Var2;
                        p7m0Var7.getClass();
                        p7m0Var7.o(null, bool7);
                        return Unit.f46060a;
                    }
                }
                return wneVar;
            } catch (Throwable th3) {
                th = th3;
                qz40Var2 = qz40VarA;
                Boolean bool8 = Boolean.FALSE;
                p7m0 p7m0Var8 = (p7m0) qz40Var2;
                p7m0Var8.getClass();
                p7m0Var8.o(null, bool8);
                throw th;
            }
        }
        return Unit.f46060a;
    }
}
