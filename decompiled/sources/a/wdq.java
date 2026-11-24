package a;

import android.os.Build;
import androidx.biometric.internal.ui.FingerprintDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class wdq extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ FingerprintDialogActivity k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wdq(FingerprintDialogActivity fingerprintDialogActivity, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fingerprintDialogActivity;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        FingerprintDialogActivity fingerprintDialogActivity = this.k;
        switch (b) {
            case 0:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 0);
            case 1:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 1);
            case 2:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 2);
            case 3:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 3);
            case 4:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 4);
            case 5:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 5);
            case 6:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 6);
            case 7:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 7);
            case 8:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 8);
            case 9:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 9);
            case 10:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 10);
            default:
                return new wdq(fingerprintDialogActivity, yjeVar, (byte) 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                return ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
            case 2:
                ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 3:
                ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 4:
                ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 5:
                return ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
            default:
                return ((wdq) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 0;
        FingerprintDialogActivity fingerprintDialogActivity = this.k;
        byte b3 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                int i = FingerprintDialogActivity.Z;
                h2c h2cVar = fingerprintDialogActivity.t().e;
                vdq vdqVar = new vdq(fingerprintDialogActivity, b2);
                this.j = true;
                h2cVar.c(vdqVar, this);
                return wneVar;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(2000L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = FingerprintDialogActivity.Z;
                deq deqVarT = fingerprintDialogActivity.t();
                String string = fingerprintDialogActivity.getString(R.string.fingerprint_dialog_touch_sensor);
                string.getClass();
                deqVarT.f = aeq.f741a;
                deqVarT.w(aeq.b, string);
                fingerprintDialogActivity.w = null;
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    csj.b();
                    return null;
                }
                z1x.P(obj);
                int i3 = FingerprintDialogActivity.Z;
                p7m0 p7m0Var = fingerprintDialogActivity.t().h;
                vdq vdqVar2 = new vdq(fingerprintDialogActivity, b3);
                this.j = true;
                p7m0Var.c(vdqVar2, this);
                return wneVar3;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (z4) {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    csj.b();
                    return null;
                }
                z1x.P(obj);
                int i4 = FingerprintDialogActivity.Z;
                p7m0 p7m0Var2 = fingerprintDialogActivity.t().l;
                vdq vdqVar3 = new vdq(fingerprintDialogActivity, (byte) 2);
                this.j = true;
                p7m0Var2.c(vdqVar3, this);
                return wneVar4;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (z5) {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    csj.b();
                    return null;
                }
                z1x.P(obj);
                int i5 = FingerprintDialogActivity.Z;
                p7m0 p7m0Var3 = fingerprintDialogActivity.t().j;
                vdq vdqVar4 = new vdq(fingerprintDialogActivity, (byte) 3);
                this.j = true;
                p7m0Var3.c(vdqVar4, this);
                return wneVar5;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    int i6 = FingerprintDialogActivity.Z;
                    vae0 vae0Var = ((po4) fingerprintDialogActivity.s().c).f;
                    vdq vdqVar5 = new vdq(fingerprintDialogActivity, (byte) 4);
                    this.j = true;
                    if (vae0Var.f37082a.c(vdqVar5, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    int i7 = FingerprintDialogActivity.Z;
                    vae0 vae0Var2 = ((po4) fingerprintDialogActivity.s().c).i;
                    vdq vdqVar6 = new vdq(fingerprintDialogActivity, (byte) 5);
                    this.j = true;
                    if (vae0Var2.f37082a.c(vdqVar6, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    int i8 = FingerprintDialogActivity.Z;
                    i89 i89Var = ((po4) fingerprintDialogActivity.s().c).c;
                    vdq vdqVar7 = new vdq(fingerprintDialogActivity, (byte) 6);
                    this.j = true;
                    if (i89Var.c(vdqVar7, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    String str = Build.MODEL;
                    b2 = gkb.X(fingerprintDialogActivity) ? (byte) 0 : (byte) 2000;
                    this.j = true;
                    if (qcc.O(b2, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                fingerprintDialogActivity.finish();
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    int i9 = FingerprintDialogActivity.Z;
                    i89 i89Var2 = ((po4) fingerprintDialogActivity.s().c).e;
                    vdq vdqVar8 = new vdq(fingerprintDialogActivity, (byte) 7);
                    this.j = true;
                    if (i89Var2.c(vdqVar8, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    int i10 = FingerprintDialogActivity.Z;
                    vae0 vae0Var3 = ((po4) fingerprintDialogActivity.s().c).g;
                    vdq vdqVar9 = new vdq(fingerprintDialogActivity, (byte) 8);
                    this.j = true;
                    if (vae0Var3.f37082a.c(vdqVar9, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar12 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(500L, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i11 = FingerprintDialogActivity.Z;
                fingerprintDialogActivity.t().c = false;
                return Unit.f46060a;
        }
    }
}
