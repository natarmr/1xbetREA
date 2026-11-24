package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class lmi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vby f20297a;
    public final vwb0 b;
    public final a8z c;
    public long d;
    public final a8z e;
    public final sje f;
    public bby g;
    public c4m0 h;
    public volatile boolean i;

    public lmi0(mne mneVar, vby vbyVar, vwb0 vwb0Var) {
        vbyVar.getClass();
        vwb0Var.getClass();
        this.f20297a = vbyVar;
        this.b = vwb0Var;
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.jmi0
            public final /* synthetic */ lmi0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                smi0 smi0Var;
                byte b2 = b;
                lmi0 lmi0Var = this.b;
                switch (b2) {
                    case 0:
                        vwb0 vwb0Var2 = lmi0Var.b;
                        vwb0Var2.getClass();
                        return q7m0.a(Long.valueOf(vwb0Var2.b().getLong("SAVED_TIMER_VALUE_KEY", 0L)));
                    default:
                        vby vbyVar2 = lmi0Var.f20297a;
                        try {
                            String strC = lmi0Var.b.c("SAVED_TIMER_STATUS_KEY", "");
                            smi0 smi0Var2 = new smi0(umi0.b, false);
                            vbyVar2.getClass();
                            rmi0 rmi0Var = smi0.Companion;
                            smi0Var = (smi0) vbyVar2.b(rmi0Var.serializer(), sj3.j0(strC, vbyVar2.d(rmi0Var.serializer(), smi0Var2)));
                            break;
                        } catch (Exception unused) {
                            smi0Var = new smi0(umi0.b, false);
                        }
                        return q7m0.a(smi0Var);
                }
            }
        };
        wez wezVar = wez.b;
        this.c = maz.a(wezVar, function0);
        final byte b2 = 1;
        this.e = maz.a(wezVar, new Function0(this) { // from class: a.jmi0
            public final /* synthetic */ lmi0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                smi0 smi0Var;
                byte b3 = b2;
                lmi0 lmi0Var = this.b;
                switch (b3) {
                    case 0:
                        vwb0 vwb0Var2 = lmi0Var.b;
                        vwb0Var2.getClass();
                        return q7m0.a(Long.valueOf(vwb0Var2.b().getLong("SAVED_TIMER_VALUE_KEY", 0L)));
                    default:
                        vby vbyVar2 = lmi0Var.f20297a;
                        try {
                            String strC = lmi0Var.b.c("SAVED_TIMER_STATUS_KEY", "");
                            smi0 smi0Var2 = new smi0(umi0.b, false);
                            vbyVar2.getClass();
                            rmi0 rmi0Var = smi0.Companion;
                            smi0Var = (smi0) vbyVar2.b(rmi0Var.serializer(), sj3.j0(strC, vbyVar2.d(rmi0Var.serializer(), smi0Var2)));
                            break;
                        } catch (Exception unused) {
                            smi0Var = new smi0(umi0.b, false);
                        }
                        return q7m0.a(smi0Var);
                }
            }
        });
        this.f = d5c.a(kotlin.coroutines.e.c(qem0.e(), mneVar.b));
    }

    public final qz40 a() {
        return (qz40) this.e.getValue();
    }

    public final void b() {
        v3c.N(this.h);
        yje yjeVar = null;
        this.h = sac.T(new fnq(a(), new kmi0(this, yjeVar, (byte) 0), (byte) 4), this.f, new bai0(this, yjeVar, (byte) 7));
    }

    public final void c() {
        smi0 smi0Var = (smi0) ((p7m0) a()).getValue();
        if (smi0Var.f32448a != umi0.c || !smi0Var.b) {
            b();
            return;
        }
        this.i = true;
        v3c.N(this.g);
        this.g = sac.Y(this.f, 1L, null, new rai0(this, (byte) 6), new kmi0(this, null, (byte) 1), 4);
    }
}
