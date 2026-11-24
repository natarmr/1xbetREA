package a;

import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/py60;", "La/yx5;", "<init>", "()V", "games_list"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class py60 extends yx5 {
    public static final /* synthetic */ iiy[] P1 = {new j0d0(py60.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public final f9o0 K1;
    public final s0r L1;
    public final a8z M1;
    public fiu0 N1;
    public final a8z O1;

    public py60() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = ltt0.o(this, oy60.f26048a);
        this.M1 = maz.a(wez.b, new ny60(this, (byte) 1));
        this.O1 = xbc.b0(this, sre0.f32672a.b(vy60.class), new ny60(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new ny60(this, (byte) 0));
        iiy[] iiyVarArr = P1;
        iiy iiyVar = iiyVarArr[0];
        s0r s0rVar = this.L1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ((aid) objN).f919a.setFocusable(true);
        Object objN2 = s0rVar.n(iiyVarArr[0], this);
        objN2.getClass();
        pkd.h(((aid) objN2).f919a, qek0.h, new shd((byte) 14), new ugd(351626699, true, new ds60(this, (byte) 4)));
    }

    @Override // a.yx5
    public final void C0() {
        this.N1 = new fiu0(Collections.singletonMap(vy60.class, ((ehi) this.M1.getValue()).l));
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
