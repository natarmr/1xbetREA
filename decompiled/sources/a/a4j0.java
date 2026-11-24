package a;

import android.javax.sip.message.Response;
import android.os.SystemClock;
import android.widget.CompoundButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.cells.DsSettingsCell;
import org.xplatform.uikit.components.cells.right.DsCellRightLabel;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a4j0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f227a;
    public final /* synthetic */ d4j0 b;

    public /* synthetic */ a4j0(d4j0 d4j0Var, byte b) {
        this.f227a = b;
        this.b = d4j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f227a;
        final byte b2 = 0;
        d4j0 d4j0Var = this.b;
        switch (b) {
            case 0:
                eke0 eke0Var = d4j0.S1;
                d4j0Var.I0().z(t4j0.f33322a);
                j120.Y(d4j0Var);
                return Unit.f46060a;
            case 1:
                eke0 eke0Var2 = d4j0.S1;
                d4j0Var.I0().z(p4j0.f26357a);
                return Unit.f46060a;
            case 2:
                eke0 eke0Var3 = d4j0.S1;
                d4j0Var.I0().C(false);
                return Unit.f46060a;
            case 3:
                eke0 eke0Var4 = d4j0.S1;
                d4j0Var.I0().z(x4j0.f40267a);
                ywq ywqVar = d4j0Var.R1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 4:
                eke0 eke0Var5 = d4j0.S1;
                d4j0Var.I0().z(w4j0.f38544a);
                d4j0Var.I0().D(false);
                return Unit.f46060a;
            case 5:
                eke0 eke0Var6 = d4j0.S1;
                d4j0Var.I0().z(q4j0.f28099a);
                return Unit.f46060a;
            case 6:
                eke0 eke0Var7 = d4j0.S1;
                d4j0Var.I0().E(false);
                return Unit.f46060a;
            case 7:
                eke0 eke0Var8 = d4j0.S1;
                d4j0Var.I0().z(new z4j0(true));
                return Unit.f46060a;
            case 8:
                eke0 eke0Var9 = d4j0.S1;
                d4j0Var.I0().z(new z4j0(false));
                return Unit.f46060a;
            case 9:
                fiu0 fiu0Var = d4j0Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                eke0 eke0Var10 = d4j0.S1;
                w5j0 w5j0VarI0 = d4j0Var.I0();
                w5j0 w5j0VarI1 = d4j0Var.I0();
                w5j0 w5j0VarI2 = d4j0Var.I0();
                final w5j0 w5j0VarI3 = d4j0Var.I0();
                w5j0 w5j0VarI4 = d4j0Var.I0();
                w5j0 w5j0VarI5 = d4j0Var.I0();
                final w5j0 w5j0VarI6 = d4j0Var.I0();
                final w5j0 w5j0VarI7 = d4j0Var.I0();
                final w5j0 w5j0VarI8 = d4j0Var.I0();
                y1j0 y1j0Var = new y1j0();
                gbn gbnVar = new gbn(new kui0((byte) 28), new gsh0(3, (byte) 15), new e2j0(w5j0VarI0, (byte) 1), ynh0.v);
                dp dpVar = y1j0Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new r3j0((byte) 0), new gsh0(3, (byte) 17), new e2j0(w5j0VarI1, (byte) 3), ynh0.x));
                dpVar.b(new gbn(new r3j0((byte) 1), new gsh0(3, (byte) 18), new e2j0(w5j0VarI2, (byte) 4), ynh0.y));
                dpVar.b(new gbn(new kui0((byte) 29), new gsh0(3, (byte) 16), new Function1() { // from class: a.i3j0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        w5j0 w5j0Var = w5j0VarI7;
                        final w5j0 w5j0Var2 = w5j0VarI6;
                        final byte b4 = 0;
                        final cp cpVar = (cp) obj;
                        cpVar.getClass();
                        switch (b3) {
                            case 0:
                                cpVar.q(false);
                                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: a.j3j0
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                        boolean z2;
                                        byte b5 = b4;
                                        w5j0 w5j0Var3 = w5j0Var2;
                                        cp cpVar2 = cpVar;
                                        compoundButton.getClass();
                                        switch (b5) {
                                            case 0:
                                                ymx ymxVar = ymx.INTERVAL_100;
                                                if (SystemClock.uptimeMillis() - ivb0.c > Response.BAD_REQUEST) {
                                                    sac.V(jiu0.a(w5j0Var3), u5j0.f35098a, null, null, new a220((Object) w5j0Var3, z, (yje) null, (byte) 24), 14);
                                                    dyb.u0();
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (!z2) {
                                                    ((DsCellRightSwitch) ((b3j0) cpVar2.u).c.e).setChecked(!z);
                                                }
                                                break;
                                            default:
                                                if (!dyb.P(ymx.INTERVAL_400, new rd7((Object) w5j0Var3, z, (byte) 18))) {
                                                    ((DsCellRightSwitch) ((g4j0) cpVar2.u).f.e).setChecked(!z);
                                                }
                                                break;
                                        }
                                    }
                                };
                                cpVar.t(new if6(cpVar, onCheckedChangeListener, cpVar, onCheckedChangeListener, (byte) 10));
                                b3j0 b3j0Var = (b3j0) cpVar.u;
                                ((DsCellRightSwitch) b3j0Var.c.e).setOnCheckedChangeListener(onCheckedChangeListener);
                                dc3 dc3Var = b3j0Var.b;
                                ((DsCellRightLabel) dc3Var.d).setClickable(false);
                                dyb.b0((DsSettingsCell) dc3Var.e, ymx.INTERVAL_400, new e2j0(w5j0Var, (byte) 2));
                                break;
                            default:
                                cpVar.q(false);
                                final byte b5 = 1;
                                CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: a.j3j0
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                        boolean z2;
                                        byte b6 = b5;
                                        w5j0 w5j0Var3 = w5j0Var2;
                                        cp cpVar2 = cpVar;
                                        compoundButton.getClass();
                                        switch (b6) {
                                            case 0:
                                                ymx ymxVar = ymx.INTERVAL_100;
                                                if (SystemClock.uptimeMillis() - ivb0.c > Response.BAD_REQUEST) {
                                                    sac.V(jiu0.a(w5j0Var3), u5j0.f35098a, null, null, new a220((Object) w5j0Var3, z, (yje) null, (byte) 24), 14);
                                                    dyb.u0();
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (!z2) {
                                                    ((DsCellRightSwitch) ((b3j0) cpVar2.u).c.e).setChecked(!z);
                                                }
                                                break;
                                            default:
                                                if (!dyb.P(ymx.INTERVAL_400, new rd7((Object) w5j0Var3, z, (byte) 18))) {
                                                    ((DsCellRightSwitch) ((g4j0) cpVar2.u).f.e).setChecked(!z);
                                                }
                                                break;
                                        }
                                    }
                                };
                                g4j0 g4j0Var = (g4j0) cpVar.u;
                                ((DsCellRightLabel) g4j0Var.c.d).setClickable(false);
                                dc3 dc3Var2 = g4j0Var.d;
                                ((DsCellRightLabel) dc3Var2.d).setClickable(false);
                                dc3 dc3Var3 = g4j0Var.e;
                                ((DsCellRightLabel) dc3Var3.d).setClickable(false);
                                DsSettingsCell dsSettingsCell = (DsSettingsCell) g4j0Var.c.e;
                                ymx ymxVar = ymx.INTERVAL_400;
                                dyb.b0(dsSettingsCell, ymxVar, new e2j0(w5j0Var, (byte) 5));
                                dyb.b0((DsSettingsCell) dc3Var2.e, ymxVar, new e2j0(w5j0Var, (byte) 6));
                                dyb.b0((DsSettingsCell) dc3Var3.e, ymxVar, new e2j0(w5j0Var, (byte) 7));
                                cpVar.t(new if6(cpVar, onCheckedChangeListener2, cpVar, onCheckedChangeListener2, (byte) 11));
                                ((DsCellRightSwitch) g4j0Var.f.e).setOnCheckedChangeListener(onCheckedChangeListener2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.w));
                final byte b3 = 1;
                dpVar.b(new gbn(new r3j0((byte) 2), new gsh0(3, (byte) 19), new Function1() { // from class: a.i3j0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        w5j0 w5j0Var = w5j0VarI8;
                        final w5j0 w5j0Var2 = w5j0VarI3;
                        final byte b5 = 0;
                        final cp cpVar = (cp) obj;
                        cpVar.getClass();
                        switch (b4) {
                            case 0:
                                cpVar.q(false);
                                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = new CompoundButton.OnCheckedChangeListener() { // from class: a.j3j0
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                        boolean z2;
                                        byte b6 = b5;
                                        w5j0 w5j0Var3 = w5j0Var2;
                                        cp cpVar2 = cpVar;
                                        compoundButton.getClass();
                                        switch (b6) {
                                            case 0:
                                                ymx ymxVar = ymx.INTERVAL_100;
                                                if (SystemClock.uptimeMillis() - ivb0.c > Response.BAD_REQUEST) {
                                                    sac.V(jiu0.a(w5j0Var3), u5j0.f35098a, null, null, new a220((Object) w5j0Var3, z, (yje) null, (byte) 24), 14);
                                                    dyb.u0();
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (!z2) {
                                                    ((DsCellRightSwitch) ((b3j0) cpVar2.u).c.e).setChecked(!z);
                                                }
                                                break;
                                            default:
                                                if (!dyb.P(ymx.INTERVAL_400, new rd7((Object) w5j0Var3, z, (byte) 18))) {
                                                    ((DsCellRightSwitch) ((g4j0) cpVar2.u).f.e).setChecked(!z);
                                                }
                                                break;
                                        }
                                    }
                                };
                                cpVar.t(new if6(cpVar, onCheckedChangeListener, cpVar, onCheckedChangeListener, (byte) 10));
                                b3j0 b3j0Var = (b3j0) cpVar.u;
                                ((DsCellRightSwitch) b3j0Var.c.e).setOnCheckedChangeListener(onCheckedChangeListener);
                                dc3 dc3Var = b3j0Var.b;
                                ((DsCellRightLabel) dc3Var.d).setClickable(false);
                                dyb.b0((DsSettingsCell) dc3Var.e, ymx.INTERVAL_400, new e2j0(w5j0Var, (byte) 2));
                                break;
                            default:
                                cpVar.q(false);
                                final byte b6 = 1;
                                CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = new CompoundButton.OnCheckedChangeListener() { // from class: a.j3j0
                                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                        boolean z2;
                                        byte b7 = b6;
                                        w5j0 w5j0Var3 = w5j0Var2;
                                        cp cpVar2 = cpVar;
                                        compoundButton.getClass();
                                        switch (b7) {
                                            case 0:
                                                ymx ymxVar = ymx.INTERVAL_100;
                                                if (SystemClock.uptimeMillis() - ivb0.c > Response.BAD_REQUEST) {
                                                    sac.V(jiu0.a(w5j0Var3), u5j0.f35098a, null, null, new a220((Object) w5j0Var3, z, (yje) null, (byte) 24), 14);
                                                    dyb.u0();
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (!z2) {
                                                    ((DsCellRightSwitch) ((b3j0) cpVar2.u).c.e).setChecked(!z);
                                                }
                                                break;
                                            default:
                                                if (!dyb.P(ymx.INTERVAL_400, new rd7((Object) w5j0Var3, z, (byte) 18))) {
                                                    ((DsCellRightSwitch) ((g4j0) cpVar2.u).f.e).setChecked(!z);
                                                }
                                                break;
                                        }
                                    }
                                };
                                g4j0 g4j0Var = (g4j0) cpVar.u;
                                ((DsCellRightLabel) g4j0Var.c.d).setClickable(false);
                                dc3 dc3Var2 = g4j0Var.d;
                                ((DsCellRightLabel) dc3Var2.d).setClickable(false);
                                dc3 dc3Var3 = g4j0Var.e;
                                ((DsCellRightLabel) dc3Var3.d).setClickable(false);
                                DsSettingsCell dsSettingsCell = (DsSettingsCell) g4j0Var.c.e;
                                ymx ymxVar = ymx.INTERVAL_400;
                                dyb.b0(dsSettingsCell, ymxVar, new e2j0(w5j0Var, (byte) 5));
                                dyb.b0((DsSettingsCell) dc3Var2.e, ymxVar, new e2j0(w5j0Var, (byte) 6));
                                dyb.b0((DsSettingsCell) dc3Var3.e, ymxVar, new e2j0(w5j0Var, (byte) 7));
                                cpVar.t(new if6(cpVar, onCheckedChangeListener2, cpVar, onCheckedChangeListener2, (byte) 11));
                                ((DsCellRightSwitch) g4j0Var.f.e).setOnCheckedChangeListener(onCheckedChangeListener2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.z));
                dpVar.b(new gbn(new kui0((byte) 27), new gsh0(3, (byte) 14), new e2j0(w5j0VarI4, (byte) 0), ynh0.u));
                dpVar.b(new gbn(new r3j0((byte) 3), new gsh0(3, (byte) 20), new e2j0(w5j0VarI5, (byte) 8), ynh0.A));
                return y1j0Var;
        }
    }
}
