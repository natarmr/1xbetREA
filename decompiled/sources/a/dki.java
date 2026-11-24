package a;

/* JADX INFO: loaded from: classes3.dex */
public final class dki implements giu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6231a;
    public final /* synthetic */ n5d0 b;

    public /* synthetic */ dki(n5d0 n5d0Var, byte b) {
        this.f6231a = b;
        this.b = n5d0Var;
    }

    @Override // a.giu0
    public final diu0 c(Object obj) {
        byte b = this.f6231a;
        n5d0 n5d0Var = this.b;
        switch (b) {
            case 0:
                fki fkiVar = (fki) ((rii) n5d0Var).c;
                tpx tpxVar = new tpx(fkiVar.b, (byte) 1);
                tnc0 tnc0Var = fkiVar.b;
                ikt0 ikt0Var = new ikt0(tnc0Var);
                g8i g8iVar = fkiVar.f9693a;
                m1e m1eVarQ1 = g8iVar.q1();
                x1x.x(m1eVarQ1);
                wsf0 wsf0Var = new wsf0(tnc0Var);
                wsf0 wsf0Var2 = fkiVar.c;
                return new gkc0((i1w0) obj, tpxVar, ikt0Var, m1eVarQ1, wsf0Var, ((g45) wsf0Var2.b).n0(), wsf0Var2.a(), g8iVar.v1(), new ljf0(tnc0Var), s470.ONE_X_LOTTERY, g8iVar.q4(), g8iVar.d2());
            case 1:
                nli nliVar = (nli) ((gji) n5d0Var).c;
                tpx tpxVar2 = new tpx(nliVar.b, (byte) 1);
                tnc0 tnc0Var2 = nliVar.b;
                ikt0 ikt0Var2 = new ikt0(tnc0Var2);
                g8i g8iVar2 = nliVar.f23729a;
                m1e m1eVarQ2 = g8iVar2.q1();
                x1x.x(m1eVarQ2);
                wsf0 wsf0Var3 = new wsf0(tnc0Var2);
                wsf0 wsf0Var4 = nliVar.c;
                return new gkc0((i1w0) obj, tpxVar2, ikt0Var2, m1eVarQ2, wsf0Var3, ((g45) wsf0Var4.b).n0(), wsf0Var4.a(), g8iVar2.v1(), new ljf0(tnc0Var2), s470.ONE_X_MEMORY, g8iVar2.q4(), g8iVar2.d2());
            default:
                iyi iyiVar = (iyi) ((psi) n5d0Var).c;
                tpx tpxVar3 = new tpx(iyiVar.b, (byte) 1);
                tnc0 tnc0Var3 = iyiVar.b;
                ikt0 ikt0Var3 = new ikt0(tnc0Var3);
                g8i g8iVar3 = iyiVar.f15590a;
                m1e m1eVarQ3 = g8iVar3.q1();
                x1x.x(m1eVarQ3);
                wsf0 wsf0Var5 = new wsf0(tnc0Var3);
                wsf0 wsf0Var6 = iyiVar.c;
                return new gkc0((i1w0) obj, tpxVar3, ikt0Var3, m1eVarQ3, wsf0Var5, ((g45) wsf0Var6.b).n0(), wsf0Var6.a(), g8iVar3.v1(), new ljf0(tnc0Var3), iyiVar.d, g8iVar3.q4(), g8iVar3.d2());
        }
    }
}
