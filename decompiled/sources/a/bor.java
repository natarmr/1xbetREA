package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bor implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2949a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ i3t0 f;

    public /* synthetic */ bor(long j, boolean z, boolean z2, boolean z3, i3t0 i3t0Var, byte b) {
        this.f2949a = b;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i3t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2949a;
        i3t0 i3t0Var = this.f;
        boolean z = this.e;
        boolean z2 = this.d;
        switch (b) {
            case 0:
                spr sprVar = (spr) i3t0Var;
                qnr qnrVar = (qnr) obj2;
                ((oyg0) obj).getClass();
                qnrVar.getClass();
                t3z.f33292a.getClass();
                boolean z3 = this.c;
                qnr qnrVarA = qnr.a(qnrVar, this.b, null, null, z3, 0L, 0L, null, rqt.h(z3, z2, z), null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -266, 524287);
                sprVar.o.e(sprVar.a0, Long.valueOf(qnrVarA.f29044a));
                vzg0 vzg0Var = sprVar.o;
                vzg0Var.e("KEY_LIVE", Boolean.valueOf(qnrVarA.d));
                vzg0Var.e(sprVar.b0, qnrVarA.i);
                return qnrVarA;
            case 1:
                g9s g9sVar = (g9s) i3t0Var;
                r7s r7sVar = (r7s) obj2;
                ((oyg0) obj).getClass();
                r7sVar.getClass();
                t3z.f33292a.getClass();
                boolean z4 = this.c;
                r7s r7sVarA = r7s.a(r7sVar, this.b, null, null, z4, 0L, 0L, rqt.h(z4, z2, z), null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -138, 1048575);
                g9sVar.o.e(g9sVar.e0, Long.valueOf(r7sVarA.f29992a));
                vzg0 vzg0Var2 = g9sVar.o;
                vzg0Var2.e("KEY_LIVE", Boolean.valueOf(r7sVarA.d));
                vzg0Var2.e(g9sVar.f0, r7sVarA.h);
                return r7sVarA;
            default:
                yks yksVar = (yks) i3t0Var;
                njs njsVar = (njs) obj2;
                ((oyg0) obj).getClass();
                njsVar.getClass();
                t3z.f33292a.getClass();
                boolean z5 = this.c;
                njs njsVarA = njs.a(njsVar, this.b, null, null, z5, 0L, 0L, rqt.h(z5, z2, z), null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, -138, 65535);
                yksVar.o.e(yksVar.d0, Long.valueOf(njsVarA.f23650a));
                vzg0 vzg0Var3 = yksVar.o;
                vzg0Var3.e("KEY_LIVE", Boolean.valueOf(njsVarA.d));
                vzg0Var3.e(yksVar.e0, njsVarA.h);
                return njsVarA;
        }
    }
}
