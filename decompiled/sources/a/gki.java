package a;

/* JADX INFO: loaded from: classes3.dex */
public final class gki implements giu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11445a;
    public final /* synthetic */ n5d0 b;

    public /* synthetic */ gki(n5d0 n5d0Var, byte b) {
        this.f11445a = b;
        this.b = n5d0Var;
    }

    @Override // a.giu0
    public final diu0 c(Object obj) {
        byte b = this.f11445a;
        n5d0 n5d0Var = this.b;
        switch (b) {
            case 0:
                c7i c7iVar = (c7i) n5d0Var;
                fki fkiVar = (fki) c7iVar.c;
                tpx tpxVar = new tpx(fkiVar.b, (byte) 1);
                g8i g8iVar = fkiVar.f9693a;
                mne mneVarV1 = g8iVar.v1();
                wsf0 wsf0Var = new wsf0(fkiVar.b);
                fki fkiVar2 = (fki) ((kki) c7iVar.d).e;
                s470 s470Var = s470.ONE_X_LOTTERY;
                y3v y3vVar = new y3v(s470Var, fkiVar2.f9693a.Oa(), fkiVar2.d);
                m1e m1eVarQ1 = g8iVar.q1();
                x1x.x(m1eVarQ1);
                return new hjc0((i1w0) obj, tpxVar, mneVarV1, wsf0Var, y3vVar, s470Var, m1eVarQ1, new tpx(fkiVar2.b, (byte) 0), new b8u(fkiVar2.d), new xsu(fkiVar2.d));
            case 1:
                c7i c7iVar2 = (c7i) n5d0Var;
                nli nliVar = (nli) c7iVar2.c;
                tpx tpxVar2 = new tpx(nliVar.b, (byte) 1);
                g8i g8iVar2 = nliVar.f23729a;
                mne mneVarV2 = g8iVar2.v1();
                wsf0 wsf0Var2 = new wsf0(nliVar.b);
                nli nliVar2 = (nli) ((kki) c7iVar2.d).e;
                s470 s470Var2 = s470.ONE_X_MEMORY;
                y3v y3vVar2 = new y3v(s470Var2, nliVar2.f23729a.Oa(), nliVar2.d);
                m1e m1eVarQ2 = g8iVar2.q1();
                x1x.x(m1eVarQ2);
                return new hjc0((i1w0) obj, tpxVar2, mneVarV2, wsf0Var2, y3vVar2, s470Var2, m1eVarQ2, new tpx(nliVar2.b, (byte) 0), new b8u(nliVar2.d), new xsu(nliVar2.d));
            default:
                c7i c7iVar3 = (c7i) n5d0Var;
                iyi iyiVar = (iyi) c7iVar3.c;
                tpx tpxVar3 = new tpx(iyiVar.b, (byte) 1);
                g8i g8iVar3 = iyiVar.f15590a;
                mne mneVarV3 = g8iVar3.v1();
                wsf0 wsf0Var3 = new wsf0(iyiVar.b);
                iyi iyiVar2 = (iyi) ((kki) c7iVar3.d).e;
                y3v y3vVar3 = new y3v(iyiVar2.d, iyiVar2.f15590a.Oa(), iyiVar2.e);
                s470 s470Var3 = iyiVar.d;
                m1e m1eVarQ3 = g8iVar3.q1();
                x1x.x(m1eVarQ3);
                return new hjc0((i1w0) obj, tpxVar3, mneVarV3, wsf0Var3, y3vVar3, s470Var3, m1eVarQ3, new tpx(iyiVar2.b, (byte) 0), new b8u(iyiVar2.e), new xsu(iyiVar2.e));
        }
    }
}
