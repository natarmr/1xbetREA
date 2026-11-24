package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tgf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gii0 f33908a;
    public final jwd b = new jwd(this, 18);

    public tgf(gii0 gii0Var) {
        this.f33908a = gii0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(double d, long j, zje zjeVar, csr csrVar, String str) {
        sgf sgfVar;
        if (zjeVar instanceof sgf) {
            sgfVar = (sgf) zjeVar;
            int i = sgfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sgfVar.k = i - Integer.MIN_VALUE;
            } else {
                sgfVar = new sgf(this, zjeVar);
            }
        } else {
            sgfVar = new sgf(this, zjeVar);
        }
        Object objA = sgfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = sgfVar.k;
        bg8 bg8VarA = null;
        if (i2 == 0) {
            z1x.P(objA);
            tef tefVar = (tef) this.b.invoke();
            Double d2 = new Double(d);
            if (csrVar == null || csrVar.f4905a.f3145a.a()) {
                d2 = null;
            }
            if (csrVar != null) {
                bg8.Companion.getClass();
                bg8VarA = ag8.a(csrVar);
            }
            fff fffVar = new fff(j, bg8VarA, d2);
            sgfVar.k = 1;
            objA = tefVar.a(str, fffVar, sgfVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((nz5) objA).a();
    }
}
