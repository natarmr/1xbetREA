package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class a6u0 extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f334a;
    public final /* synthetic */ b6u0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a6u0(b6u0 b6u0Var, byte b) {
        super(1);
        this.f334a = b;
        this.b = b6u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        byte b = this.f334a;
        b6u0 b6u0Var = this.b;
        switch (b) {
            case 0:
                ams0 ams0Var = (ams0) obj;
                azn aznVar = azn.f1725a;
                azn aznVar2 = azn.b;
                if (ams0Var.e(aznVar, aznVar2)) {
                    jms0 jms0Var = b6u0Var.p.f27854a;
                    return kzn.c;
                }
                if (!ams0Var.e(aznVar2, azn.c)) {
                    return kzn.c;
                }
                jms0 jms0Var2 = b6u0Var.q.f1078a;
                return kzn.c;
            default:
                int iOrdinal = ((azn) obj).ordinal();
                if (iOrdinal == 0) {
                    jms0 jms0Var3 = b6u0Var.p.f27854a;
                    j = y3d.f;
                } else if (iOrdinal == 1) {
                    jms0 jms0Var4 = b6u0Var.p.f27854a;
                    jms0 jms0Var5 = b6u0Var.q.f1078a;
                    j = y3d.f;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    jms0 jms0Var6 = b6u0Var.q.f1078a;
                    j = b6u0Var.r.e;
                }
                return new y3d(j);
        }
    }
}
