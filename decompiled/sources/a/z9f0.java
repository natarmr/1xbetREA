package a;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z9f0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44015a;
    public final /* synthetic */ j910 b;

    public /* synthetic */ z9f0(j910 j910Var, byte b) {
        this.f44015a = b;
        this.b = j910Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44015a;
        j910 j910Var = this.b;
        switch (b) {
            case 0:
                mbf0 mbf0Var = (mbf0) obj;
                mbf0Var.getClass();
                p1f0 p1f0VarA = p1f0.a(mbf0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -129, 127);
                Map mapE = j910.e(mbf0Var, kotlin.collections.a.c(u0f0.i));
                ((vzg0) j910Var.b).e("CURRENCY", p1f0VarA.h);
                return new Pair(p1f0VarA, mapE);
            case 1:
                mbf0 mbf0Var2 = (mbf0) obj;
                mbf0Var2.getClass();
                p1f0 p1f0VarA2 = p1f0.a(mbf0Var2.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -1, 119);
                Map mapE2 = j910.e(mbf0Var2, kotlin.collections.a.c(u0f0.l1));
                ((vzg0) j910Var.b).e("PASSPORT_DATE_ISSUE", p1f0VarA2.J);
                return new Pair(p1f0VarA2, mapE2);
            case 2:
                mbf0 mbf0Var3 = (mbf0) obj;
                mbf0Var3.getClass();
                p1f0 p1f0VarA3 = p1f0.a(mbf0Var3.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -1073741825, 127);
                Map mapE3 = j910.e(mbf0Var3, kotlin.collections.a.c(u0f0.j));
                ((vzg0) j910Var.b).e("SOCIAL", p1f0VarA3.E);
                return new Pair(p1f0VarA3, mapE3);
            case 3:
                mbf0 mbf0Var4 = (mbf0) obj;
                mbf0Var4.getClass();
                p1f0 p1f0Var = mbf0Var4.g;
                p1f0 p1f0VarA4 = p1f0.a(p1f0Var, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, !p1f0Var.K, false, null, -1, 111);
                ((vzg0) j910Var.b).e("SOCIAL_BLOCK_EXPAND", Boolean.valueOf(p1f0VarA4.K));
                return new Pair(p1f0VarA4, mbf0Var4.e);
            default:
                mbf0 mbf0Var5 = (mbf0) obj;
                mbf0Var5.getClass();
                p1f0 p1f0Var2 = mbf0Var5.g;
                p1f0 p1f0VarA5 = p1f0.a(p1f0Var2, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, !p1f0Var2.G, false, null, null, false, false, null, -1, 126);
                ((vzg0) j910Var.b).e("PASSWORD_REQUIREMENTS_EXPANDED", Boolean.valueOf(p1f0VarA5.G));
                return new Pair(p1f0VarA5, mbf0Var5.e);
        }
    }
}
