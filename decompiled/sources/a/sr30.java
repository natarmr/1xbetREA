package a;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/sr30;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class sr30 extends yx5 {
    public static final /* synthetic */ iiy[] P1 = {new j0d0(sr30.class, "binding", "getBinding()Lorg/xplatform/bonus_games/impl/databinding/FragmentMemoryBinding;", 0)};
    public final i9o0 K1;
    public fiu0 L1;
    public ii M1;
    public final kiu0 N1;
    public final s0r O1;

    public sr30() {
        super(R.layout.fragment_memory);
        this.K1 = i9o0.f14396a;
        np30 np30Var = new np30(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new pv10(new pv10(this, (byte) 21), (byte) 22));
        this.N1 = agc.G(this, sre0.f32672a.b(ns30.class), new y620(a8zVarA, (byte) 12), new y620(a8zVarA, (byte) 13), np30Var);
        this.O1 = ltt0.o(this, rr30.f30961a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        G0().e.setListener(new Function1(this) { // from class: a.qr30
            public final /* synthetic */ sr30 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bby bbyVar;
                byte b2 = b;
                d16 d16Var = d16.f5295a;
                sr30 sr30Var = this.b;
                switch (b2) {
                    case 0:
                        ht30 ht30Var = (ht30) obj;
                        iiy[] iiyVarArr = sr30.P1;
                        ht30Var.getClass();
                        ns30 ns30VarH0 = sr30Var.H0();
                        if (ns30VarH0.m && ((bbyVar = ns30VarH0.r) == null || !bbyVar.isActive())) {
                            if (ns30VarH0.i.c()) {
                                ns30VarH0.r = sac.V(jiu0.a(ns30VarH0), new as30(ns30VarH0, (byte) 2), new bs30(ns30VarH0, (byte) 0), ns30VarH0.f.b, new mw20(ns30VarH0, ht30Var, (yje) null, (byte) 20), 8);
                            } else {
                                ns30VarH0.w(d16Var);
                            }
                        }
                        break;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        iiy[] iiyVarArr2 = sr30.P1;
                        ns30 ns30VarH1 = sr30Var.H0();
                        if (ns30VarH1.m) {
                            if (ns30VarH1.i.c()) {
                                sac.V(jiu0.a(ns30VarH1), new as30(ns30VarH1, (byte) 0), null, ns30VarH1.f.b, new gc1(ns30VarH1, iIntValue, (yje) null, (byte) 11), 10);
                            } else {
                                ns30VarH1.w(d16Var);
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        G0().d.setListener(new Function1(this) { // from class: a.qr30
            public final /* synthetic */ sr30 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bby bbyVar;
                byte b3 = b2;
                d16 d16Var = d16.f5295a;
                sr30 sr30Var = this.b;
                switch (b3) {
                    case 0:
                        ht30 ht30Var = (ht30) obj;
                        iiy[] iiyVarArr = sr30.P1;
                        ht30Var.getClass();
                        ns30 ns30VarH0 = sr30Var.H0();
                        if (ns30VarH0.m && ((bbyVar = ns30VarH0.r) == null || !bbyVar.isActive())) {
                            if (ns30VarH0.i.c()) {
                                ns30VarH0.r = sac.V(jiu0.a(ns30VarH0), new as30(ns30VarH0, (byte) 2), new bs30(ns30VarH0, (byte) 0), ns30VarH0.f.b, new mw20(ns30VarH0, ht30Var, (yje) null, (byte) 20), 8);
                            } else {
                                ns30VarH0.w(d16Var);
                            }
                        }
                        break;
                    default:
                        int iIntValue = ((Integer) obj).intValue();
                        iiy[] iiyVarArr2 = sr30.P1;
                        ns30 ns30VarH1 = sr30Var.H0();
                        if (ns30VarH1.m) {
                            if (ns30VarH1.i.c()) {
                                sac.V(jiu0.a(ns30VarH1), new as30(ns30VarH1, (byte) 0), null, ns30VarH1.f.b, new gc1(ns30VarH1, iIntValue, (yje) null, (byte) 11), 10);
                            } else {
                                ns30VarH1.w(d16Var);
                            }
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "MEMORY_UNFINISHED_GAME_DIALOG", new o0t(0, H0(), ns30.class, "onUnfinishedGameDialogDismissed", "onUnfinishedGameDialogDismissed()V", 0, (byte) 28));
    }

    @Override // a.yx5
    public final void C0() {
        nli nliVar;
        Fragment fragment = this.y;
        us30 us30Var = fragment instanceof us30 ? (us30) fragment : null;
        if (us30Var == null || (nliVar = (nli) us30Var.S1.getValue()) == null) {
            return;
        }
        this.L1 = new fiu0(Collections.singletonMap(ns30.class, nliVar.h));
        this.M1 = nliVar.f23729a.j();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = H0().n;
        Class<sr30> cls = sr30.class;
        vf20 vf20Var = new vf20(2, this, cls, "handleChannelState", "handleChannelState(Lorg/xplatform/bonus_games/impl/memories/presentation/game/MemoryGameViewModel$ChannelViewState;)V", 4, (byte) 4);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new mw20((gmq) ol60Var, clzVarW, vf20Var, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var = H0().o;
        int i = 4;
        vf20 vf20Var2 = new vf20(2, this, cls, "handleCellsState", "handleCellsState(Lorg/xplatform/bonus_games/impl/memories/presentation/game/MemoryGameViewModel$CellsState;)V", i, (byte) 5);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new mw20((gmq) p7m0Var, clzVarW2, vf20Var2, (yje) null, (char) 0), 3);
        p7m0 p7m0Var2 = H0().p;
        vf20 vf20Var3 = new vf20(2, this, cls, "handleSportCellsState", "handleSportCellsState(Lorg/xplatform/bonus_games/impl/memories/presentation/game/MemoryGameViewModel$SportCellState;)V", i, (byte) 6);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new mw20(p7m0Var2, clzVarW3, vf20Var3, (yje) null, 0), 3);
        p7m0 p7m0Var3 = H0().q;
        vf20 vf20Var4 = new vf20(2, this, cls, "handleViewSate", "handleViewSate(Lorg/xplatform/bonus_games/impl/memories/presentation/game/MemoryGameViewModel$ViewState;)V", i, (byte) 7);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new mw20((gmq) p7m0Var3, clzVarW4, vf20Var4, (yje) null, (short) 0), 3);
    }

    public final b2r G0() {
        Object objN = this.O1.n(P1[0], this);
        objN.getClass();
        return (b2r) objN;
    }

    public final ns30 H0() {
        return (ns30) this.N1.getValue();
    }

    public final void I0(boolean z) {
        G0().e.setVisibility(z ? 4 : 0);
        G0().d.setVisibility(z ? 0 : 4);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
