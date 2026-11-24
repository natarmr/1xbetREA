package a;

/* JADX INFO: loaded from: classes5.dex */
public final class alv extends eiu0 {
    public final oeu c;
    public final xfu d;
    public final ouu e;
    public final v88 f;
    public final i1w0 g;
    public final oct h;
    public final peg0 i;
    public final vqc j;
    public final xex k;
    public final duj l;
    public final s31 m;
    public final mne n;
    public final vqc o;
    public final p7m0 p = q7m0.a(null);
    public final p7m0 q = q7m0.a(ekv.f7970a);

    public alv(oeu oeuVar, xfu xfuVar, ouu ouuVar, v88 v88Var, std stdVar, i1w0 i1w0Var, oct octVar, peg0 peg0Var, vqc vqcVar, xex xexVar, duj dujVar, s31 s31Var, mne mneVar, vqc vqcVar2) {
        this.c = oeuVar;
        this.d = xfuVar;
        this.e = ouuVar;
        this.f = v88Var;
        this.g = i1w0Var;
        this.h = octVar;
        this.i = peg0Var;
        this.j = vqcVar;
        this.k = xexVar;
        this.l = dujVar;
        this.m = s31Var;
        this.n = mneVar;
        this.o = vqcVar2;
    }

    public final void v(rkv rkvVar) {
        kt2 kt2Var = this.m.f31532a;
        switch (rkvVar.ordinal()) {
            case 0:
                i8i.D("point", "Deposit", kt2Var, "gesture_call");
                break;
            case 1:
                i8i.D("point", "BetHistory", kt2Var, "gesture_call");
                break;
            case 2:
                i8i.D("point", "Favor", kt2Var, "gesture_call");
                break;
            case 3:
                i8i.D("point", "Express", kt2Var, "gesture_call");
                break;
            case 4:
                i8i.D("point", "Cyber", kt2Var, "gesture_call");
                break;
            case 5:
                i8i.D("point", "games", kt2Var, "gesture_call");
                break;
            case 6:
                i8i.D("point", "Slots", kt2Var, "gesture_call");
                break;
            default:
                t9f.b();
                break;
        }
    }
}
