package a;

import android.content.ComponentCallbacks2;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/job;", "La/stl;", "La/que;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class job extends stl<que> {
    public final phf0 g2 = new phf0("EXTRA_REQUEST_KEY");
    public final zz2 h2 = new zz2("EXTRA_TITLE");
    public final zz2 i2 = new zz2("EXTRA_CURRENT_BOCK_ID");
    public final r34 j2 = new r34("EXTRA_EVENT_ID");
    public final nae0 k2 = ltt0.p(this, iob.f15109a);
    public fiu0 l2;
    public final kiu0 m2;
    public final a8z n2;
    public static final /* synthetic */ iiy[] p2 = {new ez40(job.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(job.class, "title", "getTitle()I", 0), new ez40(job.class, "currentBlockId", "getCurrentBlockId()I", 0), new ez40(job.class, "eventId", "getEventId()J", 0), new j0d0(job.class, "binding", "getBinding()Lorg/xplatform/coupon/impl/databinding/CouponChangeBlockDialogBinding;", 0)};
    public static final yk5 o2 = new yk5();

    public job() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.hob
            public final /* synthetic */ job b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                job jobVar = this.b;
                switch (b2) {
                    case 0:
                        fiu0 fiu0Var = jobVar.l2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        yk5 yk5Var = job.o2;
                        lya lyaVar = new lya(jobVar, (byte) 10);
                        oue oueVar = new oue();
                        ((dp) oueVar.e).b(new gbn(new bqd((byte) 12), new pue(3, (byte) 0), new ejd(lyaVar, (byte) 15), fpd.k));
                        return oueVar;
                }
            }
        };
        h79 h79Var = new h79(this, (byte) 14);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new h79(h79Var, (byte) 15));
        this.m2 = agc.G(this, sre0.f32672a.b(nob.class), new rt6(a8zVarA, (byte) 28), new rt6(a8zVarA, (byte) 29), function0);
        final byte b2 = 1;
        this.n2 = maz.a(wezVar, new Function0(this) { // from class: a.hob
            public final /* synthetic */ job b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                job jobVar = this.b;
                switch (b3) {
                    case 0:
                        fiu0 fiu0Var = jobVar.l2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        yk5 yk5Var = job.o2;
                        lya lyaVar = new lya(jobVar, (byte) 10);
                        oue oueVar = new oue();
                        ((dp) oueVar.e).b(new gbn(new bqd((byte) 12), new pue(3, (byte) 0), new ejd(lyaVar, (byte) 15), fpd.k));
                        return oueVar;
                }
            }
        });
    }

    @Override // a.stl
    public final yfu0 Q0() {
        Object objN = this.k2.n(p2[4], this);
        objN.getClass();
        return (que) objN;
    }

    @Override // a.stl
    public final void S0() throws Exception {
        iiy[] iiyVarArr = p2;
        String strH = H(this.h2.n(this, iiyVarArr[1]).intValue());
        strH.getClass();
        I0(new kp8(strH, 0));
        Object objN = this.k2.n(iiyVarArr[4], this);
        objN.getClass();
        RecyclerView recyclerView = ((que) objN).b;
        recyclerView.setLayoutManager(new LinearLayoutManager(o0()));
        recyclerView.setAdapter((oue) this.n2.getValue());
        p7m0 p7m0Var = ((nob) this.m2.getValue()).e;
        fob fobVar = new fob(this, null, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new yxa(p7m0Var, clzVarW, fobVar, (yje) null), 3);
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kob.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kob kobVar = (kob) (ze3Var instanceof kob ? ze3Var : null);
            if (kobVar != null) {
                iiy[] iiyVarArr = p2;
                Integer numN = this.i2.n(this, iiyVarArr[2]);
                Long lN = this.j2.n(this, iiyVarArr[3]);
                mne mneVar = kobVar.f18624a;
                ctf0 ctf0Var = kobVar.b;
                lye lyeVar = kobVar.c;
                m0f m0fVar = kobVar.d;
                ave aveVar = kobVar.e;
                us3 us3Var = kobVar.f;
                knf0 knf0Var = kobVar.g;
                vwb0 vwb0Var = kobVar.h;
                q7d0 q7d0Var = kobVar.i;
                gii0 gii0Var = kobVar.j;
                vby vbyVar = kobVar.k;
                ctf0Var.getClass();
                lyeVar.getClass();
                m0fVar.getClass();
                aveVar.getClass();
                us3Var.getClass();
                knf0Var.getClass();
                vwb0Var.getClass();
                q7d0Var.getClass();
                gii0Var.getClass();
                vbyVar.getClass();
                this.l2 = new fiu0(Collections.singletonMap(nob.class, (pai) new qv2(numN, lN, mneVar, ctf0Var, lyeVar, m0fVar, aveVar, us3Var, knf0Var, vwb0Var, q7d0Var, gii0Var).n));
                return;
            }
        }
        jf4.n(b1j.i(kob.class, "Cannot create dependency "));
    }
}
