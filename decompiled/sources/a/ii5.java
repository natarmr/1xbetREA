package a;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ii5;", "La/yx5;", "<init>", "()V", "a/gfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ii5 extends yx5 {
    public final a8z K1;
    public final s0r L1;
    public final n0o0 M1;
    public final n0o0 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(ii5.class, "binding", "getBinding()Lorg/xplatform/feature/balancemanagement/impl/databinding/FragmentBalanceManagementContentBinding;", 0)};
    public static final gfk0 O1 = new gfk0((byte) 29);

    public ii5() {
        super(R.layout.fragment_balance_management_content);
        this.K1 = maz.a(wez.b, new gi5(this, (byte) 0));
        this.L1 = ltt0.o(this, hi5.f13097a);
        this.M1 = maz.b(new gi5(this, (byte) 1));
        this.N1 = maz.b(new o85((byte) 7));
    }

    public static dk5 G0(Fragment fragment) {
        Fragment fragment2 = fragment.y;
        if (fragment2 != null) {
            return fragment2 instanceof ej5 ? ((ej5) fragment2).H0() : G0(fragment2);
        }
        jf4.o("BalanceManagementViewModel isn't found");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.yx5
    public final void B0(Bundle bundle) {
        SwipeRefreshLayout swipeRefreshLayout = H0().e;
        TypedValue typedValue = j5d.f15927a;
        swipeRefreshLayout.setColorSchemeColors(j5d.a(o0(), R.attr.uikitSecondary, false));
        swipeRefreshLayout.setOnRefreshListener(new gne(this, (byte) 15));
        RecyclerView recyclerView = H0().d;
        fk5 fk5VarI0 = I0();
        dm80 dm80Var = (dm80) this.N1.getValue();
        fk5VarI0.getClass();
        dm80Var.getClass();
        recyclerView.setAdapter(new oqd(new nqd((byte) 0, (boolean) (0 == true ? 1 : 0)), q3d.j(fk5VarI0, dm80Var)));
        H0().d.setLayoutManager(new LinearLayoutManager(D()));
        RecyclerView recyclerView2 = H0().d;
        Context context = recyclerView2.getContext();
        context.getClass();
        recyclerView2.m(new ji5(context));
        knm0.i(H0().d, false);
        H0().d.setItemAnimator(null);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        vae0 vae0VarM = vtb.M(J0().g0);
        Class<ii5> cls = ii5.class;
        vp3 vp3Var = new vp3(2, this, cls, "applyRefreshState", "applyRefreshState(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementRefreshState;)V", 4, (byte) 12);
        lkz lkzVar = lkz.f20223a;
        glz glzVarX = aac.W(this).x();
        qjj.W(x0x.Q(glzVarX), null, null, new ic1(vae0VarM, glzVarX, vp3Var, (yje) null), 3);
        xae0 xae0VarN = vtb.N(J0().h0);
        int i = 2;
        df2 df2Var = new df2(i, this, cls, "applyScrollContentState", "applyScrollContentState(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementScrollContentState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 24);
        glz glzVarX2 = aac.W(this).x();
        qjj.W(x0x.Q(glzVarX2), null, null, new ic1(xae0VarN, glzVarX2, df2Var, (yje) null), 3);
        p7m0 p7m0Var = J0().j0;
        int i2 = 4;
        vp3 vp3Var2 = new vp3(i, this, cls, "applyArchiveContent", "applyArchiveContent(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementArchiveUiState;)V", i2, (byte) 13);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new me5(p7m0Var, clzVarW, vp3Var2, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(J0().f0);
        vp3 vp3Var3 = new vp3(i, this, cls, "applyShimmersState", "applyShimmersState(Lorg/xplatform/feature/balance_management_old/impl/presentation/states/BalanceManagementShimmersState;)V", i2, (byte) 14);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new me5(xae0VarN2, clzVarW2, vp3Var3, (yje) null), 3);
        p7m0 p7m0Var2 = J0().Y;
        vp3 vp3Var4 = new vp3(i, this, cls, "applyBackground", "applyBackground(Z)V", i2, (byte) 15);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new me5(p7m0Var2, clzVarW3, vp3Var4, (yje) null, (byte) 0), 3);
        gmq gmqVar = I0().f;
        df2 df2Var2 = new df2(2, this, cls, "processPagingLoadState", "processPagingLoadState(Landroidx/paging/CombinedLoadStates;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 25);
        glz glzVarX3 = aac.W(this).x();
        qjj.W(x0x.Q(glzVarX3), null, null, new ic1(gmqVar, glzVarX3, df2Var2, (yje) null), 3);
    }

    public final hyq H0() {
        Object objN = this.L1.n(P1[0], this);
        objN.getClass();
        return (hyq) objN;
    }

    public final fk5 I0() {
        return (fk5) this.M1.getValue();
    }

    public final dk5 J0() {
        return (dk5) this.K1.getValue();
    }
}
