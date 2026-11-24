package a;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class caf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4007a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j910 c;

    public /* synthetic */ caf0(boolean z, j910 j910Var, byte b) {
        this.f4007a = b;
        this.b = z;
        this.c = j910Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4007a;
        j910 j910Var = this.c;
        switch (b) {
            case 0:
                mbf0 mbf0Var = (mbf0) obj;
                mbf0Var.getClass();
                p1f0 p1f0VarA = p1f0.a(mbf0Var.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, false, false, null, null, null, false, this.b, null, null, false, false, null, -1, 125);
                ((vzg0) j910Var.b).e("HAS_BONUSES", Boolean.valueOf(p1f0VarA.c != null));
                return new Pair(p1f0VarA, mbf0Var.e);
            default:
                mbf0 mbf0Var2 = (mbf0) obj;
                mbf0Var2.getClass();
                p1f0 p1f0VarA2 = p1f0.a(mbf0Var2.g, null, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.b), null, null, null, null, false, false, null, false, false, false, null, null, null, false, false, null, null, false, false, null, -262145, 127);
                List listC = kotlin.collections.a.c(u0f0.Z);
                j910Var.getClass();
                Map mapE = j910.e(mbf0Var2, listC);
                ((vzg0) j910Var.b).e("POLITICALLY_EXPOSED_PERSON", p1f0VarA2.s);
                return new Pair(p1f0VarA2, mapE);
        }
    }
}
