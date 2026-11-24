package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/yy8;", "La/yx5;", "<init>", "()V", "a/gl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yy8 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final a8z M1;
    public final phf0 N1;
    public final phf0 O1;
    public final cgx0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(yy8.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentBrandInfoBinding;", 0), new ez40(yy8.class, "title", "getTitle()Ljava/lang/String;", 0), new ez40(yy8.class, "description", "getDescription()Ljava/lang/String;", 0), new ez40(yy8.class, "shouldShowNavBar", "getShouldShowNavBar()Z", 0)};
    public static final gl5 Q1 = new gl5((byte) 11);

    public yy8() {
        super(R.layout.fragment_brand_info);
        this.K1 = ltt0.o(this, xy8.f41694a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(fz8.class), new vb8(this, (byte) 11));
        this.N1 = new phf0("BUNDLE_TITLE_KEY");
        this.O1 = new phf0("BUNDLE_DESCRIPTION_KEY");
        this.P1 = new cgx0("BUNDLE_SHOULD_SHOW_NAV_BAR_KEY");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(R1[0], this);
        objN.getClass();
        pkd.h(((syq) objN).b, new owp0(K()), null, new ugd(1528563856, true, new m87(this, (byte) 21)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(zy8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            zy8 zy8Var = (zy8) (ze3Var instanceof zy8 ? ze3Var : null);
            if (zy8Var != null) {
                iiy[] iiyVarArr = R1;
                String strN = this.N1.n(this, iiyVarArr[1]);
                String strN2 = this.O1.n(this, iiyVarArr[2]);
                strN.getClass();
                strN2.getClass();
                cad cadVar = zy8Var.f45193a;
                ctf0 ctf0Var = zy8Var.b;
                ctf0Var.getClass();
                gr00 gr00Var = new gr00();
                gr00Var.f11760a = strN;
                gr00Var.b = strN2;
                gr00Var.c = ctf0Var;
                gr00Var.d = cadVar;
                gr00Var.e = new pai(gr00Var, (byte) 0);
                this.L1 = new fiu0(Collections.singletonMap(fz8.class, (pai) gr00Var.e));
                return;
            }
        }
        jf4.n(b1j.i(zy8.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getQ1() {
        return this.P1.n(this, R1[3]).booleanValue();
    }
}
