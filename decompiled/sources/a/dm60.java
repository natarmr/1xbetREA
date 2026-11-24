package a;

import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dm60;", "La/yx5;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dm60 extends yx5 {
    public final boolean K1;
    public final s0r L1;
    public final n0o0 M1;
    public fiu0 N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(dm60.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final wsz P1 = new wsz();

    public dm60() {
        super(R.layout.compose_fragment);
        this.K1 = true;
        this.L1 = ltt0.o(this, cm60.f4591a);
        this.M1 = maz.b(new bm60(this, (byte) 0));
        this.O1 = xbc.b0(this, sre0.f32672a.b(lf8.class), new bm60(this, (byte) 1));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        x1x.x(((mmi) this.M1.getValue()).h.b());
        afm0.s(this, new am60(this, (byte) 0));
        iiy[] iiyVarArr = Q1;
        iiy iiyVar = iiyVarArr[0];
        s0r s0rVar = this.L1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ((aid) objN).f919a.setFocusable(true);
        Object objN2 = s0rVar.n(iiyVarArr[0], this);
        objN2.getClass();
        pkd.h(((aid) objN2).f919a, qek0.h, new shd((byte) 14), new ugd(-1069820232, true, new pi40(this, (byte) 27)));
        Bundle bundle2 = this.g;
        if (bundle2 != null) {
            long j = bundle2.getLong("OPEN_GAME_ID_KEY", 0L);
            bundle2.putLong("OPEN_GAME_ID_KEY", 0L);
            if (j != 0) {
                String string = bundle2.getString("OPEN_GAME_NAME_KEY", "");
                bundle2.putString("OPEN_GAME_NAME_KEY", "");
                k3t0 k3t0VarG0 = G0();
                string.getClass();
                k3t0VarG0.x(new re8(j, string, dm60.class.getSimpleName()));
            }
        }
    }

    @Override // a.yx5
    public final void C0() {
        this.N1 = new fiu0(Collections.singletonMap(lf8.class, ((mmi) this.M1.getValue()).s));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(ye8.f42475a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().x(xe8.f40732a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.K1;
    }
}
