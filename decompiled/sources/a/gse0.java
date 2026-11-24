package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gse0 extends bnn0 implements Function2 {
    public i050 i;
    public hse0 j;
    public String k;
    public boolean l;
    public long m;
    public byte n;
    public /* synthetic */ Object o;
    public final /* synthetic */ hse0 p;
    public final /* synthetic */ String q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gse0(hse0 hse0Var, String str, boolean z, long j, yje yjeVar) {
        super(2, yjeVar);
        this.p = hse0Var;
        this.q = str;
        this.r = z;
        this.s = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        gse0 gse0Var = new gse0(this.p, this.q, this.r, this.s, yjeVar);
        gse0Var.o = obj;
        return gse0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((gse0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ca A[Catch: all -> 0x00d0, TRY_LEAVE, TryCatch #0 {all -> 0x00d0, blocks: (B:38:0x00c4, B:40:0x00ca, B:45:0x00d2, B:60:0x00f7, B:62:0x00fb, B:63:0x0105, B:55:0x00e4, B:58:0x00ee, B:59:0x00f2, B:48:0x00d8, B:37:0x00bd), top: B:66:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d2 A[Catch: all -> 0x00d0, TRY_ENTER, TryCatch #0 {all -> 0x00d0, blocks: (B:38:0x00c4, B:40:0x00ca, B:45:0x00d2, B:60:0x00f7, B:62:0x00fb, B:63:0x0105, B:55:0x00e4, B:58:0x00ee, B:59:0x00f2, B:48:0x00d8, B:37:0x00bd), top: B:66:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:38:0x00c4, B:40:0x00ca, B:45:0x00d2, B:60:0x00f7, B:62:0x00fb, B:63:0x0105, B:55:0x00e4, B:58:0x00ee, B:59:0x00f2, B:48:0x00d8, B:37:0x00bd), top: B:66:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e4 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:38:0x00c4, B:40:0x00ca, B:45:0x00d2, B:60:0x00f7, B:62:0x00fb, B:63:0x0105, B:55:0x00e4, B:58:0x00ee, B:59:0x00f2, B:48:0x00d8, B:37:0x00bd), top: B:66:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f2 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:38:0x00c4, B:40:0x00ca, B:45:0x00d2, B:60:0x00f7, B:62:0x00fb, B:63:0x0105, B:55:0x00e4, B:58:0x00ee, B:59:0x00f2, B:48:0x00d8, B:37:0x00bd), top: B:66:0x00bd }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00fb A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:38:0x00c4, B:40:0x00ca, B:45:0x00d2, B:60:0x00f7, B:62:0x00fb, B:63:0x0105, B:55:0x00e4, B:58:0x00ee, B:59:0x00f2, B:48:0x00d8, B:37:0x00bd), top: B:66:0x00bd }] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        i050 i050Var;
        boolean z;
        long j;
        String str;
        hse0 hse0Var;
        i050 i050Var2;
        Object objA;
        Object objD0;
        Throwable thA;
        byte b;
        String message;
        vne vneVar = (vne) this.o;
        wne wneVar = wne.f39444a;
        byte b2 = this.n;
        yje yjeVar = null;
        try {
            if (b2 == 0) {
                z1x.P(obj);
                hse0 hse0Var2 = this.p;
                i050Var = hse0Var2.e;
                this.o = vneVar;
                this.i = i050Var;
                this.j = hse0Var2;
                String str2 = this.q;
                this.k = str2;
                z = this.r;
                this.l = z;
                j = this.s;
                this.m = j;
                this.n = (byte) 1;
                if (i050Var.d(this) != wneVar) {
                    str = str2;
                    hse0Var = hse0Var2;
                }
                return wneVar;
            }
            if (b2 != 1) {
                if (b2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hse0Var = this.j;
                i050Var2 = this.i;
                try {
                    z1x.P(obj);
                    objD0 = obj;
                    objA = (String) objD0;
                    e0g0 e0g0Var = j0g0.b;
                } catch (Throwable th) {
                    th = th;
                    try {
                        e0g0 e0g0Var2 = j0g0.b;
                        objA = new g0g0(th);
                    } catch (Throwable th2) {
                        i050Var2.c(null);
                        throw th2;
                    }
                }
                thA = j0g0.a(objA);
                if (thA == null) {
                    String str3 = (String) objA;
                    i050Var2.c(null);
                    return str3;
                }
                if (thA instanceof dag0) {
                    b = 0;
                } else if (thA instanceof fpd0) {
                    b = 1;
                } else {
                    b = -2;
                }
                if (b != 0) {
                    thA = new o14();
                } else if (b != 1) {
                    y9o0 y9o0Var = hse0Var.d;
                    message = thA.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    y9o0Var.a(message);
                }
                if (thA instanceof u660) {
                    hse0Var.f13578a.b();
                    hse0Var.b.g();
                }
                throw thA;
            }
            long j2 = this.m;
            boolean z2 = this.l;
            str = this.k;
            hse0 hse0Var3 = this.j;
            i050 i050Var3 = this.i;
            z1x.P(obj);
            z = z2;
            hse0Var = hse0Var3;
            i050Var = i050Var3;
            j = j2;
            e0g0 e0g0Var3 = j0g0.b;
            objA = ((btt0) hse0Var.b.b).a();
            if ((objA.equals(str) || z) && (System.currentTimeMillis() - hse0Var.b.e() >= j || j == -1 || !z)) {
                jvq0 jvq0Var = hse0Var.c;
                this.o = null;
                this.i = i050Var;
                this.j = hse0Var;
                this.k = null;
                this.n = (byte) 2;
                objD0 = qjj.d0(jvq0Var.c.b, new kpb0(jvq0Var, yjeVar, (byte) 22), this);
                if (objD0 != wneVar) {
                    i050Var2 = i050Var;
                    objA = (String) objD0;
                }
                return wneVar;
            }
            i050Var2 = i050Var;
            e0g0 e0g0Var4 = j0g0.b;
        } catch (Throwable th3) {
            th = th3;
            i050Var2 = i050Var;
            e0g0 e0g0Var5 = j0g0.b;
            objA = new g0g0(th);
        }
        thA = j0g0.a(objA);
        if (thA == null) {
            String str4 = (String) objA;
            i050Var2.c(null);
            return str4;
        }
        if (thA instanceof dag0) {
            b = 0;
        } else if (thA instanceof fpd0) {
            b = 1;
        } else {
            b = -2;
        }
        if (b != 0) {
            thA = new o14();
        } else if (b != 1) {
            y9o0 y9o0Var2 = hse0Var.d;
            message = thA.getMessage();
            if (message == null) {
                message = "";
            }
            y9o0Var2.a(message);
        }
        if (thA instanceof u660) {
            hse0Var.f13578a.b();
            hse0Var.b.g();
        }
        throw thA;
    }
}
