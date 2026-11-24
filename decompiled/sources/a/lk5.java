package a;

import org.xplatform.feature.balance_management.impl.balance_management.BalanceManagementScreenFactoryImpl$getScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class lk5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f20182a;
    public final r9u b;

    public lk5(pru pruVar, r9u r9uVar, byte b) {
        switch (b) {
            case 1:
                this.f20182a = pruVar;
                this.b = r9uVar;
                break;
            case 2:
            default:
                r9uVar.getClass();
                this.f20182a = pruVar;
                this.b = r9uVar;
                break;
            case 3:
                pruVar.getClass();
                r9uVar.getClass();
                this.f20182a = pruVar;
                this.b = r9uVar;
                break;
        }
    }

    public static BalanceManagementScreenFactoryImpl$getScreen$1 b(lk5 lk5Var) {
        lk5Var.getClass();
        return new BalanceManagementScreenFactoryImpl$getScreen$1(lk5Var, "");
    }

    public lk5 a() {
        return new lk5(this.f20182a, this.b, (byte) 0);
    }

    public ua20 c(j820 j820Var) {
        int iOrdinal = this.f20182a.a().f32117a.o.ordinal();
        if (iOrdinal == 1) {
            return ua20.MEDIUM_CUSTOM_BACKGROUND;
        }
        if (iOrdinal == 2) {
            return ua20.LITE_NO_TABS;
        }
        if (iOrdinal != 3) {
            return ua20.MEDIUM_NO_GAME_INFO;
        }
        int i = xju.f41004a[j820Var.ordinal()];
        r9u r9uVar = this.b;
        if (i == 1) {
            ygp ygpVar = ygp.w;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            if (j1q0Var.f15748a.d(ygpVar)) {
                return ua20.FULLSCREEN_SLIDER;
            }
        }
        if (i == 2) {
            ygp ygpVar2 = ygp.y;
            r9uVar.getClass();
            j1q0 j1q0Var2 = r9uVar.f30104a;
            j1q0Var2.getClass();
            if (j1q0Var2.f15748a.d(ygpVar2)) {
                return ua20.FULLSCREEN_SLIDER;
            }
        }
        if (i == 3) {
            ygp ygpVar3 = ygp.z;
            r9uVar.getClass();
            j1q0 j1q0Var3 = r9uVar.f30104a;
            j1q0Var3.getClass();
            if (j1q0Var3.f15748a.d(ygpVar3)) {
                return ua20.FULLSCREEN_SLIDER;
            }
        }
        if (i == 4) {
            ygp ygpVar4 = ygp.m;
            r9uVar.getClass();
            j1q0 j1q0Var4 = r9uVar.f30104a;
            j1q0Var4.getClass();
            if (j1q0Var4.f15748a.d(ygpVar4)) {
                return ua20.FULLSCREEN_SLIDER;
            }
        }
        if (i == 5) {
            ygp ygpVar5 = ygp.h1;
            r9uVar.getClass();
            j1q0 j1q0Var5 = r9uVar.f30104a;
            j1q0Var5.getClass();
            if (j1q0Var5.f15748a.d(ygpVar5)) {
                return ua20.FULLSCREEN_SLIDER;
            }
        }
        if (i == 6) {
            ygp ygpVar6 = ygp.g1;
            r9uVar.getClass();
            j1q0 j1q0Var6 = r9uVar.f30104a;
            j1q0Var6.getClass();
            if (j1q0Var6.f15748a.d(ygpVar6)) {
                return ua20.FULLSCREEN_SLIDER;
            }
        }
        return ua20.MEDIUM_NO_GAME_INFO;
    }

    public lk5(r9u r9uVar, pru pruVar) {
        this.b = r9uVar;
        this.f20182a = pruVar;
    }
}
