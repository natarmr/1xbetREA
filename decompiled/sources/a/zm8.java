package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zm8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44612a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zm8(i3t0 i3t0Var, Object obj, long j, long j2, byte b) {
        this.f44612a = b;
        this.d = i3t0Var;
        this.e = obj;
        this.b = j;
        this.c = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44612a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                g7z g7zVar = (g7z) obj;
                g7zVar.a();
                fhl.r(g7zVar, (t89) obj3, this.b, this.c, 0.0f, (agc) obj2, null, 0, 104);
                break;
            case 1:
                a4x a4xVar = (a4x) obj3;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hczVar.f(a4xVar.size(), new m160(new wk60((byte) 29), a4xVar, (byte) 12), new a580(a4xVar, (byte) 0), new ugd(802480018, true, new b580(a4xVar, this.b, this.c, (Function1) obj2)));
                break;
            case 2:
                String str = (String) obj2;
                ((k0w0) obj).h(((rua0) obj3).s.b(rua0.H, new m8h0(str), cui0.b(Long.valueOf(this.b)), this.c, str));
                break;
            default:
                f1b0 f1b0Var = (f1b0) obj3;
                vh0 vh0Var = (vh0) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                peg0 peg0Var = f1b0Var.z;
                String str2 = vh0Var != null ? vh0Var.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                k0w0Var.h(peg0Var.q(new fr1(new fs80(str2, this.b, ((d0b0) f1b0Var.D()).f.f3516a ? iun.f15405a : kotlin.collections.a.c(Long.valueOf(this.c)), null, 0L, false, 120), null, 2)));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ zm8(Object obj, long j, long j2, Object obj2, byte b) {
        this.f44612a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
        this.e = obj2;
    }
}
