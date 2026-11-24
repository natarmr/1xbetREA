package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/t0w;", "La/nw5;", "La/a47;", "<init>", "()V", "a/art", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t0w extends nw5<a47> {
    public fiu0 e2;
    public final kiu0 f2;
    public final phf0 g2;
    public final cgx0 h2;
    public final cgx0 i2;
    public final nae0 j2;
    public final a8z k2;
    public static final /* synthetic */ iiy[] m2 = {new ez40(t0w.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0), new ez40(t0w.class, "customFilter", "getCustomFilter()Z", 0), new ez40(t0w.class, "sendMail", "getSendMail()Z", 0), new j0d0(t0w.class, "binding", "getBinding()Lorg/xplatform/bethistory/impl/databinding/BetHistoryDateFilterTypeDialogBinding;", 0)};
    public static final art l2 = new art();

    public t0w() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.r0w
            public final /* synthetic */ t0w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (b) {
                    case 0:
                        fiu0 fiu0Var = this.b.e2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        art artVar = t0w.l2;
                        vft vftVar = new vft(1, this.b, t0w.class, "onItemClick", "onItemClick(Lorg/xplatform/bethistory/core/domain/model/DateFilterTypeModel;)V", 0, (byte) 21);
                        o0w o0wVar = new o0w();
                        ((dp) o0wVar.e).b(new gbn(new s3t((byte) 28), new pkv(3, (byte) 11), new t3t(vftVar, (byte) 21), btv.g));
                        return o0wVar;
                }
            }
        };
        t7t t7tVar = new t7t(this, (byte) 22);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new t7t(t7tVar, (byte) 23));
        this.f2 = agc.G(this, sre0.f32672a.b(v0w.class), new qwv(a8zVarA, (byte) 6), new qwv(a8zVarA, (byte) 7), function0);
        this.g2 = new phf0("EXTRA_REQUEST_KEY");
        this.h2 = new cgx0("EXTRA_CUSTOM_FILTER");
        this.i2 = new cgx0("EXTRA_SEND_MAIL");
        this.j2 = ltt0.p(this, s0w.f31428a);
        final byte b2 = 1;
        this.k2 = maz.a(wezVar, new Function0(this) { // from class: a.r0w
            public final /* synthetic */ t0w b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (b2) {
                    case 0:
                        fiu0 fiu0Var = this.b.e2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        art artVar = t0w.l2;
                        vft vftVar = new vft(1, this.b, t0w.class, "onItemClick", "onItemClick(Lorg/xplatform/bethistory/core/domain/model/DateFilterTypeModel;)V", 0, (byte) 21);
                        o0w o0wVar = new o0w();
                        ((dp) o0wVar.e).b(new gbn(new s3t((byte) 28), new pkv(3, (byte) 11), new t3t(vftVar, (byte) 21), btv.g));
                        return o0wVar;
                }
            }
        });
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.j2.n(m2[3], this);
        objN.getClass();
        return (a47) objN;
    }

    @Override // a.nw5
    public final void O0() throws Exception {
        iiy[] iiyVarArr = m2;
        iiy iiyVar = iiyVarArr[3];
        nae0 nae0Var = this.j2;
        Object objN = nae0Var.n(iiyVar, this);
        objN.getClass();
        ((a47) objN).b.setAdapter((o0w) this.k2.getValue());
        wn8 wn8Var = new wn8(epv0.U(R.drawable.divider_drawable_opacity, o0()), (byte) 1);
        Object objN2 = nae0Var.n(iiyVarArr[3], this);
        objN2.getClass();
        ((a47) objN2).b.m(wn8Var);
        xae0 xae0VarN = vtb.N(((v0w) this.f2.getValue()).d);
        j0s j0sVar = new j0s(this, null, (byte) 25);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hgv(xae0VarN, clzVarW, j0sVar, (yje) null, (byte) 0), 3);
    }

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ndj.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ndj ndjVar = (ndj) (ze3Var instanceof ndj ? ze3Var : null);
            if (ndjVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = m2;
                Boolean boolN = this.h2.n(this, iiyVarArr[1]);
                Boolean boolN2 = this.i2.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                cad cadVar = ndjVar.b;
                duj dujVar = ndjVar.c;
                odj odjVar = ndjVar.f23339a;
                odjVar.getClass();
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = odjVar;
                esg0Var.b = cadVar;
                esg0Var.c = boolN;
                esg0Var.d = boolN2;
                esg0Var.e = dujVar;
                esg0Var.f = new yei(esg0Var, (byte) 5);
                this.e2 = new fiu0(Collections.singletonMap(v0w.class, (yei) esg0Var.f));
                return;
            }
        }
        jf4.n(b1j.i(ndj.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.parent;
    }

    @Override // a.nw5
    public final String S0() {
        String string = G().getString(R.string.choose_date_period_title);
        string.getClass();
        return string;
    }
}
