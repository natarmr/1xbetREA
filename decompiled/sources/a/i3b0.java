package a;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class i3b0 extends bnn0 implements Function2 {
    public long i;
    public long j;
    public Object k;
    public byte l;
    public final /* synthetic */ v3b0 m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3b0(v3b0 v3b0Var, long j, yje yjeVar) {
        super(2, yjeVar);
        this.m = v3b0Var;
        this.n = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new i3b0(this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i3b0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:25:0x007d, B:27:0x0081, B:30:0x0086), top: B:54:0x007d }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:50:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        long j2;
        long j3;
        Object objM;
        long jCurrentTimeMillis;
        Iterable iterable;
        List listD0;
        long jCurrentTimeMillis2;
        List list;
        wne wneVar = wne.f39444a;
        byte b = this.l;
        long j4 = this.n;
        v3b0 v3b0Var = this.m;
        if (b == 0) {
            z1x.P(obj);
            e3b0 e3b0Var = new e3b0((byte) 1, j4);
            int i = v3b0.W;
            v3b0Var.H(e3b0Var);
            long j5 = this.n;
            long jCurrentTimeMillis3 = System.currentTimeMillis();
            try {
                cu cuVar = v3b0Var.N;
                try {
                    iun iunVar = iun.f15405a;
                    j = 1000;
                    j2 = jCurrentTimeMillis3;
                    try {
                        a1g a1gVarI = cuVar.i(j5, iunVar, iunVar, 8);
                        this.i = 1000L;
                        this.j = j2;
                        this.l = (byte) 1;
                        objM = ntb.M(a1gVarI, this);
                        if (objM != wneVar) {
                            j3 = 1000;
                            iterable = (List) objM;
                            if (iterable == null) {
                                iterable = iun.f15405a;
                            }
                            listD0 = CollectionsKt.D0(iterable, 8);
                            jCurrentTimeMillis2 = System.currentTimeMillis() - j2;
                            if (jCurrentTimeMillis2 < j3) {
                                this.k = listD0;
                                this.i = j3;
                                this.j = j2;
                                this.l = (byte) 2;
                                if (qcc.O(j3 - jCurrentTimeMillis2, this) != wneVar) {
                                    list = listD0;
                                    listD0 = list;
                                }
                            }
                            ub4 ub4Var = new ub4(j4, listD0, (byte) 6);
                            int i2 = v3b0.W;
                            v3b0Var.H(ub4Var);
                            return Unit.f46060a;
                        }
                    } catch (Throwable th) {
                        th = th;
                        j3 = j;
                        jCurrentTimeMillis = System.currentTimeMillis() - j2;
                        if (jCurrentTimeMillis >= j3) {
                            throw th;
                        }
                        this.k = th;
                        this.i = j3;
                        this.j = j2;
                        this.l = (byte) 3;
                        if (qcc.O(j3 - jCurrentTimeMillis, this) != wneVar) {
                            return wneVar;
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j2 = jCurrentTimeMillis3;
                    j = 1000;
                }
            } catch (Throwable th3) {
                th = th3;
                j = 1000;
                j2 = jCurrentTimeMillis3;
            }
            return wneVar;
        }
        if (b == 1) {
            long j6 = this.j;
            j3 = this.i;
            try {
                z1x.P(obj);
                j2 = j6;
                objM = obj;
                try {
                    iterable = (List) objM;
                    if (iterable == null) {
                        iterable = iun.f15405a;
                    }
                    listD0 = CollectionsKt.D0(iterable, 8);
                    jCurrentTimeMillis2 = System.currentTimeMillis() - j2;
                    if (jCurrentTimeMillis2 < j3) {
                        this.k = listD0;
                        this.i = j3;
                        this.j = j2;
                        this.l = (byte) 2;
                        if (qcc.O(j3 - jCurrentTimeMillis2, this) != wneVar) {
                            list = listD0;
                        }
                        return wneVar;
                    }
                    ub4 ub4Var2 = new ub4(j4, listD0, (byte) 6);
                    int i3 = v3b0.W;
                    v3b0Var.H(ub4Var2);
                    return Unit.f46060a;
                } catch (Throwable th4) {
                    th = th4;
                    jCurrentTimeMillis = System.currentTimeMillis() - j2;
                    if (jCurrentTimeMillis >= j3) {
                        throw th;
                    }
                    this.k = th;
                    this.i = j3;
                    this.j = j2;
                    this.l = (byte) 3;
                    if (qcc.O(j3 - jCurrentTimeMillis, this) != wneVar) {
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                j2 = j6;
                jCurrentTimeMillis = System.currentTimeMillis() - j2;
                if (jCurrentTimeMillis >= j3) {
                    throw th;
                }
                this.k = th;
                this.i = j3;
                this.j = j2;
                this.l = (byte) 3;
                if (qcc.O(j3 - jCurrentTimeMillis, this) != wneVar) {
                    return wneVar;
                }
                throw th;
            }
        } else {
            if (b != 2) {
                if (b != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th6 = (Throwable) this.k;
                z1x.P(obj);
                throw th6;
            }
            list = (List) this.k;
            z1x.P(obj);
            v3b0Var = v3b0Var;
        }
        listD0 = list;
        ub4 ub4Var3 = new ub4(j4, listD0, (byte) 6);
        int i4 = v3b0.W;
        v3b0Var.H(ub4Var3);
        return Unit.f46060a;
    }
}
