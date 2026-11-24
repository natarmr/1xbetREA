package a;

/* JADX INFO: loaded from: classes3.dex */
public final class hki implements giu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13210a;
    public final /* synthetic */ n5d0 b;

    public /* synthetic */ hki(n5d0 n5d0Var, byte b) {
        this.f13210a = b;
        this.b = n5d0Var;
    }

    @Override // a.giu0
    public final diu0 c(Object obj) {
        byte b = this.f13210a;
        n5d0 n5d0Var = this.b;
        switch (b) {
            case 0:
                c7i c7iVar = (c7i) n5d0Var;
                fki fkiVar = (fki) c7iVar.c;
                tpx tpxVar = new tpx(fkiVar.b, (byte) 1);
                s470 s470Var = s470.ONE_X_LOTTERY;
                g8i g8iVar = fkiVar.f9693a;
                uf3 uf3VarT = g8iVar.T();
                fki fkiVar2 = (fki) ((kki) c7iVar.d).e;
                fhj fhjVar = fkiVar2.e;
                g8i g8iVar2 = fkiVar2.f9693a;
                oif0 oif0Var = new oif0(fhjVar, g8iVar2.f5(), g8iVar2.g3(), (byte) 22);
                ieu ieuVar = new ieu(((g45) fkiVar2.c.b).E(), fkiVar2.d);
                pyu pyuVar = new pyu(fkiVar2.b);
                lef0 lef0Var = new lef0(fkiVar2.b);
                mne mneVarV1 = g8iVar.v1();
                wsf0 wsf0Var = new wsf0(fkiVar.b);
                tpx tpxVar2 = new tpx(fkiVar2.b, (byte) 0);
                m1e m1eVarQ1 = g8iVar.q1();
                x1x.x(m1eVarQ1);
                return new clc0((i1w0) obj, tpxVar, s470Var, uf3VarT, oif0Var, ieuVar, pyuVar, lef0Var, mneVarV1, wsf0Var, tpxVar2, false, m1eVarQ1);
            case 1:
                c7i c7iVar2 = (c7i) n5d0Var;
                nli nliVar = (nli) c7iVar2.c;
                tpx tpxVar3 = new tpx(nliVar.b, (byte) 1);
                s470 s470Var2 = s470.ONE_X_MEMORY;
                g8i g8iVar3 = nliVar.f23729a;
                uf3 uf3VarT2 = g8iVar3.T();
                nli nliVar2 = (nli) ((kki) c7iVar2.d).e;
                fhj fhjVar2 = nliVar2.e;
                g8i g8iVar4 = nliVar2.f23729a;
                oif0 oif0Var2 = new oif0(fhjVar2, g8iVar4.f5(), g8iVar4.g3(), (byte) 22);
                ieu ieuVar2 = new ieu(((g45) nliVar2.c.b).E(), nliVar2.d);
                pyu pyuVar2 = new pyu(nliVar2.b);
                lef0 lef0Var2 = new lef0(nliVar2.b);
                mne mneVarV2 = g8iVar3.v1();
                wsf0 wsf0Var2 = new wsf0(nliVar.b);
                tpx tpxVar4 = new tpx(nliVar2.b, (byte) 0);
                m1e m1eVarQ2 = g8iVar3.q1();
                x1x.x(m1eVarQ2);
                return new clc0((i1w0) obj, tpxVar3, s470Var2, uf3VarT2, oif0Var2, ieuVar2, pyuVar2, lef0Var2, mneVarV2, wsf0Var2, tpxVar4, true, m1eVarQ2);
            default:
                c7i c7iVar3 = (c7i) n5d0Var;
                iyi iyiVar = (iyi) c7iVar3.c;
                tpx tpxVar5 = new tpx(iyiVar.b, (byte) 1);
                s470 s470Var3 = iyiVar.d;
                g8i g8iVar5 = iyiVar.f15590a;
                uf3 uf3VarT3 = g8iVar5.T();
                iyi iyiVar2 = (iyi) ((kki) c7iVar3.d).e;
                fhj fhjVar3 = iyiVar2.f;
                g8i g8iVar6 = iyiVar2.f15590a;
                oif0 oif0Var3 = new oif0(fhjVar3, g8iVar6.f5(), g8iVar6.g3(), (byte) 22);
                ieu ieuVar3 = new ieu(((g45) iyiVar2.c.b).E(), iyiVar2.e);
                pyu pyuVar3 = new pyu(iyiVar2.b);
                lef0 lef0Var3 = new lef0(iyiVar2.b);
                mne mneVarV3 = g8iVar5.v1();
                wsf0 wsf0Var3 = new wsf0(iyiVar.b);
                tpx tpxVar6 = new tpx(iyiVar2.b, (byte) 0);
                m1e m1eVarQ3 = g8iVar5.q1();
                x1x.x(m1eVarQ3);
                return new clc0((i1w0) obj, tpxVar5, s470Var3, uf3VarT3, oif0Var3, ieuVar3, pyuVar3, lef0Var3, mneVarV3, wsf0Var3, tpxVar6, false, m1eVarQ3);
        }
    }
}
