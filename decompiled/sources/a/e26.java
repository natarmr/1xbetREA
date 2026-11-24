package a;

import java.nio.channels.FileChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class e26 extends bnn0 implements Function1 {
    public byte i;
    public final /* synthetic */ yjo j;
    public final /* synthetic */ hie0 k;
    public final /* synthetic */ tdg0 l;
    public final /* synthetic */ spg0 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public qpg0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e26(yjo yjoVar, hie0 hie0Var, yje yjeVar, tdg0 tdg0Var, spg0 spg0Var, String str, String str2) {
        super(1, yjeVar);
        this.j = yjoVar;
        this.k = hie0Var;
        this.l = tdg0Var;
        this.m = spg0Var;
        this.n = str;
        this.o = str2;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new e26(this.j, this.k, yjeVar, this.l, this.m, this.n, this.o);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((e26) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.wne, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        FileChannel fileChannel;
        Throwable th;
        qpg0 qpg0Var;
        FileChannel fileChannel2;
        fhj fhjVar = this.j.b;
        ?? r1 = wne.f39444a;
        byte b = this.i;
        hie0 hie0Var = this.k;
        tdg0 tdg0Var = this.l;
        try {
            if (b == 0) {
                z1x.P(obj);
                if (fhjVar != null) {
                    try {
                        fhjVar.z();
                    } catch (Throwable th2) {
                        if (hie0Var.f13108a) {
                            throw th2;
                        }
                        hny.q(kng0.l("Unable to open database '", this.o, "'. Was a proper path / name used in Room's database builder?"), th2);
                        return null;
                    }
                }
                try {
                    hie0Var.f13108a = true;
                    if (tdg0Var.b) {
                        throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                    }
                    qpg0 qpg0VarA = this.m.a(this.n);
                    try {
                        if (tdg0Var.f33768a) {
                            this.p = qpg0VarA;
                            this.i = (byte) 2;
                            if (tdg0Var.b(qpg0VarA, this) != r1) {
                                qpg0Var = qpg0VarA;
                            }
                        } else {
                            try {
                                tdg0Var.b = true;
                                this.p = qpg0VarA;
                                this.i = (byte) 1;
                                if (tdg0Var.d(qpg0VarA, this) != r1) {
                                    qpg0Var = qpg0VarA;
                                    tdg0Var.b = false;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                tdg0Var.b = false;
                                throw th;
                            }
                        }
                        return r1;
                    } catch (Throwable th4) {
                        r1 = qpg0VarA;
                        th = th4;
                        r1.close();
                        throw th;
                    }
                } catch (Throwable th5) {
                    if (fhjVar != null && (fileChannel = (FileChannel) fhjVar.b) != null) {
                        try {
                            fileChannel.close();
                        } finally {
                            fhjVar.b = null;
                        }
                    }
                    throw th5;
                }
            }
            if (b == 1) {
                qpg0Var = this.p;
                try {
                    z1x.P(obj);
                    tdg0Var.b = false;
                } catch (Throwable th6) {
                    th = th6;
                    tdg0Var.b = false;
                    throw th;
                }
            } else {
                if (b != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qpg0Var = this.p;
                z1x.P(obj);
            }
            if (fhjVar == null || (fileChannel2 = (FileChannel) fhjVar.b) == null) {
                return qpg0Var;
            }
            try {
                fileChannel2.close();
                return qpg0Var;
            } finally {
                fhjVar.b = null;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
