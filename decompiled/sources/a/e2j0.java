package a;

import android.view.View;
import android.widget.CompoundButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e2j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7090a;
    public final /* synthetic */ w5j0 b;

    public /* synthetic */ e2j0(w5j0 w5j0Var, byte b) {
        this.f7090a = b;
        this.b = w5j0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7090a;
        final byte b2 = 3;
        final byte b3 = 2;
        final byte b4 = 1;
        final byte b5 = 0;
        final w5j0 w5j0Var = this.b;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.q(false);
                ((DsCellRightSwitch) ((g2j0) cpVar.u).c.e).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a.f2j0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        byte b6 = b5;
                        w5j0 w5j0Var2 = w5j0Var;
                        compoundButton.getClass();
                        switch (b6) {
                            case 0:
                                w5j0Var2.C(z);
                                break;
                            case 1:
                                w5j0Var2.D(z);
                                break;
                            case 2:
                                w5j0Var2.J(new s2j0(z));
                                ((vwb0) w5j0Var2.m.f20433a.f13293a.b).e("CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 3:
                                w5j0Var2.J(new q2j0(z));
                                ((ost0) w5j0Var2.q.f1155a).f25798a.f35876a.e("AUTO_CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 4:
                                w5j0Var2.J(new v2j0(z));
                                w5j0Var2.s.f8113a.f25798a.f35876a.e("dropOnScoreChange", z);
                                break;
                            case 5:
                                w5j0Var2.J(new u2j0(z));
                                ((ost0) w5j0Var2.r.b).f25798a.f35876a.e("fromLineToLive", z);
                                break;
                            default:
                                w5j0Var2.E(z);
                                break;
                        }
                    }
                });
                cpVar.t(new ctv(cpVar, cpVar, (byte) 24));
                break;
            case 1:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                h2j0 h2j0Var = (h2j0) cpVar2.u;
                ((DsSettingsCell) h2j0Var.d.e).setOnClickListener(new n2j0(h2j0Var, cpVar2, w5j0Var, (byte) 0));
                ((DsSettingsCell) h2j0Var.b.e).setOnClickListener(new n2j0(h2j0Var, cpVar2, w5j0Var, (byte) 1));
                ((DsSettingsCell) h2j0Var.c.e).setOnClickListener(new n2j0(h2j0Var, cpVar2, w5j0Var, (byte) 2));
                cpVar2.t(new kzi0(cpVar2, (byte) 3));
                break;
            case 2:
                ((View) obj).getClass();
                w5j0Var.F(d5j0.f5508a);
                break;
            case 3:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                cpVar3.q(false);
                k3j0 k3j0Var = (k3j0) cpVar3.u;
                ((DsCellRightSwitch) k3j0Var.d.e).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a.f2j0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        byte b6 = b4;
                        w5j0 w5j0Var2 = w5j0Var;
                        compoundButton.getClass();
                        switch (b6) {
                            case 0:
                                w5j0Var2.C(z);
                                break;
                            case 1:
                                w5j0Var2.D(z);
                                break;
                            case 2:
                                w5j0Var2.J(new s2j0(z));
                                ((vwb0) w5j0Var2.m.f20433a.f13293a.b).e("CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 3:
                                w5j0Var2.J(new q2j0(z));
                                ((ost0) w5j0Var2.q.f1155a).f25798a.f35876a.e("AUTO_CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 4:
                                w5j0Var2.J(new v2j0(z));
                                w5j0Var2.s.f8113a.f25798a.f35876a.e("dropOnScoreChange", z);
                                break;
                            case 5:
                                w5j0Var2.J(new u2j0(z));
                                ((ost0) w5j0Var2.r.b).f25798a.f35876a.e("fromLineToLive", z);
                                break;
                            default:
                                w5j0Var2.E(z);
                                break;
                        }
                    }
                });
                ((DsCellRightSwitch) k3j0Var.c.e).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a.f2j0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        byte b6 = b3;
                        w5j0 w5j0Var2 = w5j0Var;
                        compoundButton.getClass();
                        switch (b6) {
                            case 0:
                                w5j0Var2.C(z);
                                break;
                            case 1:
                                w5j0Var2.D(z);
                                break;
                            case 2:
                                w5j0Var2.J(new s2j0(z));
                                ((vwb0) w5j0Var2.m.f20433a.f13293a.b).e("CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 3:
                                w5j0Var2.J(new q2j0(z));
                                ((ost0) w5j0Var2.q.f1155a).f25798a.f35876a.e("AUTO_CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 4:
                                w5j0Var2.J(new v2j0(z));
                                w5j0Var2.s.f8113a.f25798a.f35876a.e("dropOnScoreChange", z);
                                break;
                            case 5:
                                w5j0Var2.J(new u2j0(z));
                                ((ost0) w5j0Var2.r.b).f25798a.f35876a.e("fromLineToLive", z);
                                break;
                            default:
                                w5j0Var2.E(z);
                                break;
                        }
                    }
                });
                ((DsCellRightSwitch) k3j0Var.b.e).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a.f2j0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        byte b6 = b2;
                        w5j0 w5j0Var2 = w5j0Var;
                        compoundButton.getClass();
                        switch (b6) {
                            case 0:
                                w5j0Var2.C(z);
                                break;
                            case 1:
                                w5j0Var2.D(z);
                                break;
                            case 2:
                                w5j0Var2.J(new s2j0(z));
                                ((vwb0) w5j0Var2.m.f20433a.f13293a.b).e("CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 3:
                                w5j0Var2.J(new q2j0(z));
                                ((ost0) w5j0Var2.q.f1155a).f25798a.f35876a.e("AUTO_CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 4:
                                w5j0Var2.J(new v2j0(z));
                                w5j0Var2.s.f8113a.f25798a.f35876a.e("dropOnScoreChange", z);
                                break;
                            case 5:
                                w5j0Var2.J(new u2j0(z));
                                ((ost0) w5j0Var2.r.b).f25798a.f35876a.e("fromLineToLive", z);
                                break;
                            default:
                                w5j0Var2.E(z);
                                break;
                        }
                    }
                });
                cpVar3.t(new ctv(cpVar3, cpVar3, (byte) 25));
                break;
            case 4:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                cpVar4.q(false);
                s3j0 s3j0Var = (s3j0) cpVar4.u;
                final byte b6 = 4;
                ((DsCellRightSwitch) s3j0Var.c.e).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a.f2j0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        byte b7 = b6;
                        w5j0 w5j0Var2 = w5j0Var;
                        compoundButton.getClass();
                        switch (b7) {
                            case 0:
                                w5j0Var2.C(z);
                                break;
                            case 1:
                                w5j0Var2.D(z);
                                break;
                            case 2:
                                w5j0Var2.J(new s2j0(z));
                                ((vwb0) w5j0Var2.m.f20433a.f13293a.b).e("CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 3:
                                w5j0Var2.J(new q2j0(z));
                                ((ost0) w5j0Var2.q.f1155a).f25798a.f35876a.e("AUTO_CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 4:
                                w5j0Var2.J(new v2j0(z));
                                w5j0Var2.s.f8113a.f25798a.f35876a.e("dropOnScoreChange", z);
                                break;
                            case 5:
                                w5j0Var2.J(new u2j0(z));
                                ((ost0) w5j0Var2.r.b).f25798a.f35876a.e("fromLineToLive", z);
                                break;
                            default:
                                w5j0Var2.E(z);
                                break;
                        }
                    }
                });
                final byte b7 = 5;
                ((DsCellRightSwitch) s3j0Var.b.e).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a.f2j0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        byte b8 = b7;
                        w5j0 w5j0Var2 = w5j0Var;
                        compoundButton.getClass();
                        switch (b8) {
                            case 0:
                                w5j0Var2.C(z);
                                break;
                            case 1:
                                w5j0Var2.D(z);
                                break;
                            case 2:
                                w5j0Var2.J(new s2j0(z));
                                ((vwb0) w5j0Var2.m.f20433a.f13293a.b).e("CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 3:
                                w5j0Var2.J(new q2j0(z));
                                ((ost0) w5j0Var2.q.f1155a).f25798a.f35876a.e("AUTO_CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 4:
                                w5j0Var2.J(new v2j0(z));
                                w5j0Var2.s.f8113a.f25798a.f35876a.e("dropOnScoreChange", z);
                                break;
                            case 5:
                                w5j0Var2.J(new u2j0(z));
                                ((ost0) w5j0Var2.r.b).f25798a.f35876a.e("fromLineToLive", z);
                                break;
                            default:
                                w5j0Var2.E(z);
                                break;
                        }
                    }
                });
                cpVar4.t(new ctv(cpVar4, cpVar4, (byte) 26));
                break;
            case 5:
                ((View) obj).getClass();
                w5j0Var.B(h4j0.f12435a);
                break;
            case 6:
                ((View) obj).getClass();
                w5j0Var.B(h4j0.b);
                break;
            case 7:
                ((View) obj).getClass();
                w5j0Var.B(h4j0.c);
                break;
            default:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                cpVar5.q(false);
                final byte b8 = 6;
                ((DsCellRightSwitch) ((c6j0) cpVar5.u).c.e).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a.f2j0
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        byte b9 = b8;
                        w5j0 w5j0Var2 = w5j0Var;
                        compoundButton.getClass();
                        switch (b9) {
                            case 0:
                                w5j0Var2.C(z);
                                break;
                            case 1:
                                w5j0Var2.D(z);
                                break;
                            case 2:
                                w5j0Var2.J(new s2j0(z));
                                ((vwb0) w5j0Var2.m.f20433a.f13293a.b).e("CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 3:
                                w5j0Var2.J(new q2j0(z));
                                ((ost0) w5j0Var2.q.f1155a).f25798a.f35876a.e("AUTO_CLEAR_COUPON_AFTER_BET", z);
                                break;
                            case 4:
                                w5j0Var2.J(new v2j0(z));
                                w5j0Var2.s.f8113a.f25798a.f35876a.e("dropOnScoreChange", z);
                                break;
                            case 5:
                                w5j0Var2.J(new u2j0(z));
                                ((ost0) w5j0Var2.r.b).f25798a.f35876a.e("fromLineToLive", z);
                                break;
                            default:
                                w5j0Var2.E(z);
                                break;
                        }
                    }
                });
                cpVar5.t(new ctv(cpVar5, cpVar5, (byte) 27));
                break;
        }
        return Unit.f46060a;
    }
}
