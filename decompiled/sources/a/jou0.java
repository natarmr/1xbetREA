package a;

import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/jou0;", "La/yx5;", "<init>", "()V", "a/sxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jou0 extends yx5 {
    public fiu0 K1;
    public final boolean L1;
    public final khf0 M1;
    public final a8z N1;
    public final a8z O1;
    public final s0r P1;
    public final qdz Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(jou0.class, "params", "getParams()Lorg/xplatform/cyber/section/api/virtualgamescategories/VirtualCategoryDisciplinesParams;", 0), new j0d0(jou0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final sxs0 R1 = new sxs0((byte) 9);

    public jou0() {
        super(R.layout.compose_fragment);
        this.L1 = true;
        this.M1 = new khf0("VIRTUAL_CATEGORY_DISCIPLINE_PARAMS");
        this.N1 = maz.a(wez.b, new hou0(this, (byte) 0));
        this.O1 = xbc.b0(this, sre0.f32672a.b(oou0.class), new hou0(this, (byte) 1));
        this.P1 = ltt0.o(this, iou0.f15132a);
        this.Q1 = new qdz();
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        qcc.X(this, new hou0(this, (byte) 2));
        Object objN = this.P1.n(S1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-1594133866, true, new ggt0(this, (byte) 8)));
    }

    @Override // a.yx5
    public final void C0() {
        this.K1 = new fiu0(Collections.singletonMap(oou0.class, ((czi) this.N1.getValue()).i));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.L1;
    }
}
