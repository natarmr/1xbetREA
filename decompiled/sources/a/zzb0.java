package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xplatform.personal.impl.presentation.edit.ProfileEditViewModel$UiState;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zzb0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45245a;
    public final /* synthetic */ org.xplatform.personal.impl.presentation.edit.a b;

    public /* synthetic */ zzb0(org.xplatform.personal.impl.presentation.edit.a aVar, byte b) {
        this.f45245a = b;
        this.b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45245a;
        org.xplatform.personal.impl.presentation.edit.a aVar = this.b;
        switch (b) {
            case 0:
                fl70 fl70Var = org.xplatform.personal.impl.presentation.edit.a.X1;
                ComponentCallbacks2 application = aVar.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(yzb0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof yzb0)) {
                        ze3Var = null;
                    }
                    yzb0 yzb0Var = (yzb0) ze3Var;
                    if (yzb0Var != null) {
                        return yzb0Var.a(a4n0.f(aVar), org.xplatform.personal.impl.presentation.edit.a.class.getSimpleName());
                    }
                }
                jf4.n(b1j.i(yzb0.class, "Cannot create dependency "));
                return null;
            case 1:
                fl70 fl70Var2 = org.xplatform.personal.impl.presentation.edit.a.X1;
                return new q0h0((kpi) ((mpi) aVar.R1.getValue()).z.get());
            case 2:
                fl70 fl70Var3 = org.xplatform.personal.impl.presentation.edit.a.X1;
                e9b0 e9b0Var = new e9b0(1, aVar.H0(), org.xplatform.personal.impl.presentation.edit.n.class, "onItemClicked", "onItemClicked(Lorg/xplatform/personal/impl/domain/model/ProfileItemEnum;)V", 0, (byte) 16);
                yn90 yn90Var = new yn90(2, aVar.H0(), org.xplatform.personal.impl.presentation.edit.n.class, "onTextChanged", "onTextChanged(Lorg/xplatform/personal/impl/domain/model/ProfileItemEnum;Ljava/lang/String;)V", 0, (byte) 17);
                vzb0 vzb0Var = new vzb0();
                gbn gbnVar = new gbn(new j3b0((byte) 20), new iv60(3, (byte) 23), new wyb0((byte) 4), xk60.z);
                dp dpVar = vzb0Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new j3b0((byte) 19), new iv60(3, (byte) 22), new ppb0(yn90Var, (byte) 4), xk60.y));
                dpVar.b(new gbn(new j3b0((byte) 18), new iv60(3, (byte) 21), new ppb0(e9b0Var, (byte) 3), xk60.x));
                return vzb0Var;
            case 3:
                fl70 fl70Var4 = org.xplatform.personal.impl.presentation.edit.a.X1;
                j120.Y(aVar);
                org.xplatform.personal.impl.presentation.edit.n nVarH0 = aVar.H0();
                ProfileEditViewModel$UiState profileEditViewModel$UiStateB = nVarH0.B();
                if (profileEditViewModel$UiStateB instanceof ProfileEditViewModel$UiState.Loaded) {
                    sac.V(jiu0.a(nVarH0), new e9b0(1, nVarH0, org.xplatform.personal.impl.presentation.edit.n.class, "handleOnSaveClickedError", "handleOnSaveClickedError(Ljava/lang/Throwable;)V", 0, (byte) 25), new d2c0(nVarH0, (byte) 1), nVarH0.k.b, new org.xplatform.personal.impl.presentation.edit.l(nVarH0, (ProfileEditViewModel$UiState.Loaded) profileEditViewModel$UiStateB, null), 8);
                }
                return Unit.f46060a;
            default:
                fl70 fl70Var5 = org.xplatform.personal.impl.presentation.edit.a.X1;
                org.xplatform.personal.impl.presentation.edit.n nVarH1 = aVar.H0();
                if (nVarH1.t == 0 || nVarH1.B().hashCode() == nVarH1.t) {
                    nVarH1.C();
                } else {
                    nVarH1.D(h2c0.f12324a);
                }
                return Unit.f46060a;
        }
    }
}
