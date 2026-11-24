package a;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t1f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33165a;
    public final /* synthetic */ g090 b;

    public /* synthetic */ t1f0(g090 g090Var, byte b) {
        this.f33165a = b;
        this.b = g090Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33165a;
        g090 g090Var = this.b;
        switch (b) {
            case 0:
                u4f0 u4f0Var = (u4f0) obj;
                u4f0Var.getClass();
                r1f0 r1f0VarA = r1f0.a(u4f0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -129, 127);
                Map mapF = g090.f(u4f0Var, kotlin.collections.a.c(u0f0.i));
                ((vzg0) g090Var.f10448a).e("CURRENCY", r1f0VarA.h);
                return new Pair(r1f0VarA, mapF);
            case 1:
                u4f0 u4f0Var2 = (u4f0) obj;
                u4f0Var2.getClass();
                r1f0 r1f0Var = u4f0Var2.g;
                r1f0 r1f0VarA2 = r1f0.a(r1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, !r1f0Var.G, null, null, null, false, false, null, -1, 126);
                ((vzg0) g090Var.f10448a).e("PASSWORD_REQUIREMENTS_EXPANDED", Boolean.valueOf(r1f0VarA2.G));
                return new Pair(r1f0VarA2, u4f0Var2.e);
            case 2:
                u4f0 u4f0Var3 = (u4f0) obj;
                u4f0Var3.getClass();
                r1f0 r1f0VarA3 = r1f0.a(u4f0Var3.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -1073741825, 127);
                Map mapF2 = g090.f(u4f0Var3, kotlin.collections.a.c(u0f0.j));
                ((vzg0) g090Var.f10448a).e("SOCIAL", r1f0VarA3.E);
                return new Pair(r1f0VarA3, mapF2);
            case 3:
                u4f0 u4f0Var4 = (u4f0) obj;
                u4f0Var4.getClass();
                r1f0 r1f0VarA4 = r1f0.a(u4f0Var4.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, false, false, null, -1, 119);
                Map mapF3 = g090.f(u4f0Var4, kotlin.collections.a.c(u0f0.l1));
                ((vzg0) g090Var.f10448a).e("PASSPORT_DATE_ISSUE", r1f0VarA4.J);
                return new Pair(r1f0VarA4, mapF3);
            default:
                u4f0 u4f0Var5 = (u4f0) obj;
                u4f0Var5.getClass();
                r1f0 r1f0Var2 = u4f0Var5.g;
                r1f0 r1f0VarA5 = r1f0.a(r1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, null, null, null, !r1f0Var2.K, false, null, -1, 111);
                ((vzg0) g090Var.f10448a).e("SOCIAL_BLOCK_EXPAND", Boolean.valueOf(r1f0VarA5.K));
                return new Pair(r1f0VarA5, u4f0Var5.e);
        }
    }
}
