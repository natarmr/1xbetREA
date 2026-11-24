package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/sqq0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sqq0 extends yx5 {
    public final hnm0 K1;
    public final f9o0 L1;
    public final s0r M1;
    public fiu0 N1;
    public final kiu0 O1;
    public final zz2 P1;
    public final zz2 Q1;
    public final n0o0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(sqq0.class, "binding", "getBinding()Lorg/xplatform/toto_bet/impl/databinding/TirageParametersTableFragmentBinding;", 0), new ez40(sqq0.class, "tirageNum", "getTirageNum()I", 0), new ez40(sqq0.class, "totoType", "getTotoType()I", 0)};
    public static final g9m0 S1 = new g9m0();

    public sqq0() {
        super(R.layout.tirage_parameters_table_fragment);
        this.K1 = hnm0.f13359a;
        this.L1 = new f9o0(R.attr.uikitBackgroundContent);
        this.M1 = ltt0.o(this, rqq0.f30944a);
        qqq0 qqq0Var = new qqq0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 3), (byte) 4));
        this.O1 = agc.G(this, sre0.f32672a.b(yqq0.class), new r5p0(a8zVarA, (byte) 26), new r5p0(a8zVarA, (byte) 27), qqq0Var);
        this.P1 = new zz2("tirage_num");
        this.Q1 = new zz2("toto_type");
        this.R1 = maz.b(new qqq0(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        mc50.a(G0().d, new qqq0(this, (byte) 2));
        G0().e.setAdapter((pqq0) this.R1.getValue());
        knm0.h(G0().e, false);
        knm0.h(G0().c, false);
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jqq0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jqq0 jqq0Var = (jqq0) (ze3Var instanceof jqq0 ? ze3Var : null);
            if (jqq0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = U1;
                Integer numN = this.P1.n(this, iiyVarArr[1]);
                g9m0 g9m0Var = ulr0.b;
                int iIntValue = this.Q1.n(this, iiyVarArr[2]).intValue();
                g9m0Var.getClass();
                ulr0 ulr0VarB = g9m0.b(iIntValue);
                i1w0VarF.getClass();
                cad cadVar = jqq0Var.f16967a;
                duj dujVar = jqq0Var.b;
                gii0 gii0Var = jqq0Var.c;
                m1e m1eVar = jqq0Var.d;
                wyu wyuVar = jqq0Var.e;
                knf0 knf0Var = jqq0Var.f;
                g2v g2vVar = jqq0Var.g;
                ctf0 ctf0Var = jqq0Var.h;
                gii0Var.getClass();
                m1eVar.getClass();
                wyuVar.getClass();
                knf0Var.getClass();
                ctf0Var.getClass();
                this.N1 = new fiu0(Collections.singletonMap(yqq0.class, (xvi) new pwi(cadVar, numN, ulr0VarB, i1w0VarF, dujVar, gii0Var, m1eVar, knf0Var, g2vVar, ctf0Var).k));
                return;
            }
        }
        jf4.n(b1j.i(jqq0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = ((yqq0) this.O1.getValue()).j;
        ssl0 ssl0Var = new ssl0(this, (yje) null, (byte) 29);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hlq0((gmq) p7m0Var, clzVarW, ssl0Var, (yje) null, (char) 0), 3);
    }

    public final tqq0 G0() {
        Object objN = this.M1.n(U1[0], this);
        objN.getClass();
        return (tqq0) objN;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.L1;
    }
}
