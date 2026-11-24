package a;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class o7z extends b7z {
    public final /* synthetic */ r7z b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7z(r7z r7zVar, Function2 function2, String str) {
        super(str);
        this.b = r7zVar;
        this.c = function2;
    }

    @Override // a.tj30
    public final uj30 b(vj30 vj30Var, List list, long j) {
        r7z r7zVar = this.b;
        m7z m7zVar = r7zVar.h;
        m7zVar.f21343a = vj30Var.getLayoutDirection();
        m7zVar.b = vj30Var.getDensity();
        m7zVar.c = vj30Var.v0();
        boolean zM = vj30Var.M();
        Function2 function2 = this.c;
        if (zM || r7zVar.f30000a.i == null) {
            r7zVar.d = 0;
            uj30 uj30Var = (uj30) function2.invoke(m7zVar, new p4e(j));
            return new n7z(uj30Var, r7zVar, r7zVar.d, uj30Var, (byte) 1);
        }
        r7zVar.e = 0;
        uj30 uj30Var2 = (uj30) function2.invoke(r7zVar.i, new p4e(j));
        return new n7z(uj30Var2, r7zVar, r7zVar.e, uj30Var2, (byte) 0);
    }
}
