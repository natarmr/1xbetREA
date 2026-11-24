package a;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r1j0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29683a;
    public final /* synthetic */ t1j0 b;

    public /* synthetic */ r1j0(t1j0 t1j0Var, byte b) {
        this.f29683a = b;
        this.b = t1j0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29683a;
        final byte b2 = 2;
        final byte b3 = 4;
        final byte b4 = 3;
        t1j0 t1j0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = t1j0.Y1;
                org.xplatform.settings.impl.presentation.a aVarI0 = t1j0Var.I0();
                aVarI0.H(aVarI0.b0.a());
                bby bbyVar = aVarI0.S0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            case 1:
                zie0 zie0Var2 = t1j0.Y1;
                org.xplatform.settings.impl.presentation.a aVarI1 = t1j0Var.I0();
                sac.V(jiu0.a(aVarI1), new kej0(aVarI1, (byte) 19), null, aVarI1.s.b, new oej0(aVarI1, null, (byte) 10), 10);
                return Unit.f46060a;
            case 2:
                zie0 zie0Var3 = t1j0.Y1;
                org.xplatform.settings.impl.presentation.a aVarI2 = t1j0Var.I0();
                aVarI2.k.d(new kej0(aVarI2, (byte) 2));
                return Unit.f46060a;
            case 3:
                zie0 zie0Var4 = t1j0.Y1;
                t1j0Var.I0().K();
                return Unit.f46060a;
            case 4:
                zie0 zie0Var5 = t1j0.Y1;
                org.xplatform.settings.impl.presentation.a aVarI3 = t1j0Var.I0();
                sac.V(jiu0.a(aVarI3), cfj0.f4266a, null, aVarI3.s.b, new oej0(aVarI3, null, (byte) 7), 10);
                return Unit.f46060a;
            case 5:
                zie0 zie0Var6 = t1j0.Y1;
                org.xplatform.settings.impl.presentation.a aVarI4 = t1j0Var.I0();
                sac.V(jiu0.a(aVarI4), new kej0(aVarI4, (byte) 15), null, aVarI4.s.b, new oej0(aVarI4, null, (byte) 8), 10);
                return Unit.f46060a;
            case 6:
                zie0 zie0Var7 = t1j0.Y1;
                org.xplatform.settings.impl.presentation.a aVarI5 = t1j0Var.I0();
                sac.V(jiu0.a(aVarI5), new kej0(aVarI5, (byte) 18), null, aVarI5.s.b, new oej0(aVarI5, null, (byte) 9), 10);
                return Unit.f46060a;
            case 7:
                fiu0 fiu0Var = t1j0Var.Q1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 8:
                zie0 zie0Var8 = t1j0.Y1;
                final q1j0 q1j0Var = new q1j0(t1j0Var, (byte) 3);
                q1j0 q1j0Var2 = new q1j0(t1j0Var, (byte) 4);
                dzi0 dzi0Var = new dzi0();
                final byte b5 = 0;
                gbn gbnVar = new gbn(new kui0((byte) 23), new gsh0(3, (byte) 10), new Function1() { // from class: a.izi0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b6 = b5;
                        final byte b7 = 2;
                        final byte b8 = 0;
                        final byte b9 = 1;
                        final q1j0 q1j0Var3 = q1j0Var;
                        final cp cpVar = (cp) obj;
                        switch (b6) {
                            case 0:
                                cpVar.getClass();
                                DsMenuCell dsMenuCell = ((hxx) cpVar.u).b;
                                dsMenuCell.getClass();
                                dyb.c0(dsMenuCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b10 = b8;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b10) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 0));
                                break;
                            case 1:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell = ((kxx) cpVar.u).e;
                                dsSettingsCell.getClass();
                                dyb.O(dsSettingsCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b10 = b9;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b10) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 23));
                                break;
                            case 2:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell2 = ((cux) cpVar.u).f5007a;
                                dsSettingsCell2.getClass();
                                dyb.O(dsSettingsCell2, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b10 = b7;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b10) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 1));
                                break;
                            case 3:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell3 = ((fwx) cpVar.u).f10282a;
                                dsSettingsCell3.getClass();
                                final byte b10 = 3;
                                dyb.O(dsSettingsCell3, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b11 = b10;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b11) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 2));
                                break;
                            case 4:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell4 = ((kxx) cpVar.u).e;
                                dsSettingsCell4.getClass();
                                final byte b11 = 4;
                                dyb.N(dsSettingsCell4, ymx.INTERVAL_750, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b12 = b11;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b12) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 28));
                                break;
                            case 5:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell5 = ((kxx) cpVar.u).e;
                                dsSettingsCell5.getClass();
                                final byte b12 = 5;
                                dyb.O(dsSettingsCell5, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b13 = b12;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b13) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 0));
                                break;
                            default:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell6 = ((kxx) cpVar.u).e;
                                dsSettingsCell6.getClass();
                                final byte b13 = 6;
                                dyb.O(dsSettingsCell6, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b14 = b13;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b14) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.q);
                dp dpVar = dzi0Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new s3t((byte) 21), new pkv(3, (byte) 7), new umu((byte) 19), btv.c));
                dpVar.b(new gbn(new s3t((byte) 17), new pkv(3, (byte) 3), new umu((byte) 15), fvr.Y));
                final byte b6 = 1;
                dpVar.b(new gbn(new ogj0((byte) 22), new asj0(3, (byte) 1), new thj0((byte) 14), wjj0.h));
                dpVar.b(new gbn(new r3j0((byte) 4), new gsh0(3, (byte) 21), new Function1() { // from class: a.izi0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b7 = b3;
                        final byte b8 = 2;
                        final byte b9 = 0;
                        final byte b10 = 1;
                        final q1j0 q1j0Var3 = q1j0Var;
                        final cp cpVar = (cp) obj;
                        switch (b7) {
                            case 0:
                                cpVar.getClass();
                                DsMenuCell dsMenuCell = ((hxx) cpVar.u).b;
                                dsMenuCell.getClass();
                                dyb.c0(dsMenuCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b14 = b9;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b14) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 0));
                                break;
                            case 1:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell = ((kxx) cpVar.u).e;
                                dsSettingsCell.getClass();
                                dyb.O(dsSettingsCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b14 = b10;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b14) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 23));
                                break;
                            case 2:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell2 = ((cux) cpVar.u).f5007a;
                                dsSettingsCell2.getClass();
                                dyb.O(dsSettingsCell2, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b14 = b8;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b14) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 1));
                                break;
                            case 3:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell3 = ((fwx) cpVar.u).f10282a;
                                dsSettingsCell3.getClass();
                                final byte b11 = 3;
                                dyb.O(dsSettingsCell3, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b14 = b11;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b14) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 2));
                                break;
                            case 4:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell4 = ((kxx) cpVar.u).e;
                                dsSettingsCell4.getClass();
                                final byte b12 = 4;
                                dyb.N(dsSettingsCell4, ymx.INTERVAL_750, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b14 = b12;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b14) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 28));
                                break;
                            case 5:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell5 = ((kxx) cpVar.u).e;
                                dsSettingsCell5.getClass();
                                final byte b13 = 5;
                                dyb.O(dsSettingsCell5, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b14 = b13;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b14) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 0));
                                break;
                            default:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell6 = ((kxx) cpVar.u).e;
                                dsSettingsCell6.getClass();
                                final byte b14 = 6;
                                dyb.O(dsSettingsCell6, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b14;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.B));
                dpVar.b(new gbn(new kui0((byte) 24), new gsh0(3, (byte) 11), new Function1() { // from class: a.izi0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b7 = b6;
                        final byte b8 = 2;
                        final byte b9 = 0;
                        final byte b10 = 1;
                        final q1j0 q1j0Var3 = q1j0Var;
                        final cp cpVar = (cp) obj;
                        switch (b7) {
                            case 0:
                                cpVar.getClass();
                                DsMenuCell dsMenuCell = ((hxx) cpVar.u).b;
                                dsMenuCell.getClass();
                                dyb.c0(dsMenuCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b9;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 0));
                                break;
                            case 1:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell = ((kxx) cpVar.u).e;
                                dsSettingsCell.getClass();
                                dyb.O(dsSettingsCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b10;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 23));
                                break;
                            case 2:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell2 = ((cux) cpVar.u).f5007a;
                                dsSettingsCell2.getClass();
                                dyb.O(dsSettingsCell2, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b8;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 1));
                                break;
                            case 3:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell3 = ((fwx) cpVar.u).f10282a;
                                dsSettingsCell3.getClass();
                                final byte b11 = 3;
                                dyb.O(dsSettingsCell3, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b11;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 2));
                                break;
                            case 4:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell4 = ((kxx) cpVar.u).e;
                                dsSettingsCell4.getClass();
                                final byte b12 = 4;
                                dyb.N(dsSettingsCell4, ymx.INTERVAL_750, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b12;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 28));
                                break;
                            case 5:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell5 = ((kxx) cpVar.u).e;
                                dsSettingsCell5.getClass();
                                final byte b13 = 5;
                                dyb.O(dsSettingsCell5, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b13;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 0));
                                break;
                            default:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell6 = ((kxx) cpVar.u).e;
                                dsSettingsCell6.getClass();
                                final byte b14 = 6;
                                dyb.O(dsSettingsCell6, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b14;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.r));
                dpVar.b(new gbn(new kui0((byte) 26), new gsh0(3, (byte) 13), new Function1() { // from class: a.izi0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b7 = b4;
                        final byte b8 = 2;
                        final byte b9 = 0;
                        final byte b10 = 1;
                        final q1j0 q1j0Var3 = q1j0Var;
                        final cp cpVar = (cp) obj;
                        switch (b7) {
                            case 0:
                                cpVar.getClass();
                                DsMenuCell dsMenuCell = ((hxx) cpVar.u).b;
                                dsMenuCell.getClass();
                                dyb.c0(dsMenuCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b9;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 0));
                                break;
                            case 1:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell = ((kxx) cpVar.u).e;
                                dsSettingsCell.getClass();
                                dyb.O(dsSettingsCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b10;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 23));
                                break;
                            case 2:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell2 = ((cux) cpVar.u).f5007a;
                                dsSettingsCell2.getClass();
                                dyb.O(dsSettingsCell2, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b8;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 1));
                                break;
                            case 3:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell3 = ((fwx) cpVar.u).f10282a;
                                dsSettingsCell3.getClass();
                                final byte b11 = 3;
                                dyb.O(dsSettingsCell3, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b11;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 2));
                                break;
                            case 4:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell4 = ((kxx) cpVar.u).e;
                                dsSettingsCell4.getClass();
                                final byte b12 = 4;
                                dyb.N(dsSettingsCell4, ymx.INTERVAL_750, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b12;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 28));
                                break;
                            case 5:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell5 = ((kxx) cpVar.u).e;
                                dsSettingsCell5.getClass();
                                final byte b13 = 5;
                                dyb.O(dsSettingsCell5, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b13;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 0));
                                break;
                            default:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell6 = ((kxx) cpVar.u).e;
                                dsSettingsCell6.getClass();
                                final byte b14 = 6;
                                dyb.O(dsSettingsCell6, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b14;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.t));
                dpVar.b(new gbn(new kui0((byte) 25), new gsh0(3, (byte) 12), new Function1() { // from class: a.izi0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b7 = b2;
                        final byte b8 = 2;
                        final byte b9 = 0;
                        final byte b10 = 1;
                        final q1j0 q1j0Var3 = q1j0Var;
                        final cp cpVar = (cp) obj;
                        switch (b7) {
                            case 0:
                                cpVar.getClass();
                                DsMenuCell dsMenuCell = ((hxx) cpVar.u).b;
                                dsMenuCell.getClass();
                                dyb.c0(dsMenuCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b9;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 0));
                                break;
                            case 1:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell = ((kxx) cpVar.u).e;
                                dsSettingsCell.getClass();
                                dyb.O(dsSettingsCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b10;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 23));
                                break;
                            case 2:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell2 = ((cux) cpVar.u).f5007a;
                                dsSettingsCell2.getClass();
                                dyb.O(dsSettingsCell2, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b8;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 1));
                                break;
                            case 3:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell3 = ((fwx) cpVar.u).f10282a;
                                dsSettingsCell3.getClass();
                                final byte b11 = 3;
                                dyb.O(dsSettingsCell3, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b11;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 2));
                                break;
                            case 4:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell4 = ((kxx) cpVar.u).e;
                                dsSettingsCell4.getClass();
                                final byte b12 = 4;
                                dyb.N(dsSettingsCell4, ymx.INTERVAL_750, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b12;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 28));
                                break;
                            case 5:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell5 = ((kxx) cpVar.u).e;
                                dsSettingsCell5.getClass();
                                final byte b13 = 5;
                                dyb.O(dsSettingsCell5, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b13;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 0));
                                break;
                            default:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell6 = ((kxx) cpVar.u).e;
                                dsSettingsCell6.getClass();
                                final byte b14 = 6;
                                dyb.O(dsSettingsCell6, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b14;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.s));
                final byte b7 = 6;
                dpVar.b(new gbn(new ogj0((byte) 1), new gsh0(3, (byte) 24), new Function1() { // from class: a.izi0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b8 = b7;
                        final byte b9 = 2;
                        final byte b10 = 0;
                        final byte b11 = 1;
                        final q1j0 q1j0Var3 = q1j0Var;
                        final cp cpVar = (cp) obj;
                        switch (b8) {
                            case 0:
                                cpVar.getClass();
                                DsMenuCell dsMenuCell = ((hxx) cpVar.u).b;
                                dsMenuCell.getClass();
                                dyb.c0(dsMenuCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b10;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 0));
                                break;
                            case 1:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell = ((kxx) cpVar.u).e;
                                dsSettingsCell.getClass();
                                dyb.O(dsSettingsCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b11;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 23));
                                break;
                            case 2:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell2 = ((cux) cpVar.u).f5007a;
                                dsSettingsCell2.getClass();
                                dyb.O(dsSettingsCell2, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b9;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 1));
                                break;
                            case 3:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell3 = ((fwx) cpVar.u).f10282a;
                                dsSettingsCell3.getClass();
                                final byte b12 = 3;
                                dyb.O(dsSettingsCell3, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b12;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 2));
                                break;
                            case 4:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell4 = ((kxx) cpVar.u).e;
                                dsSettingsCell4.getClass();
                                final byte b13 = 4;
                                dyb.N(dsSettingsCell4, ymx.INTERVAL_750, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b13;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 28));
                                break;
                            case 5:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell5 = ((kxx) cpVar.u).e;
                                dsSettingsCell5.getClass();
                                final byte b14 = 5;
                                dyb.O(dsSettingsCell5, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b15 = b14;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b15) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 0));
                                break;
                            default:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell6 = ((kxx) cpVar.u).e;
                                dsSettingsCell6.getClass();
                                final byte b15 = 6;
                                dyb.O(dsSettingsCell6, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b16 = b15;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b16) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.f1));
                final byte b8 = 5;
                dpVar.b(new gbn(new ogj0((byte) 0), new gsh0(3, (byte) 23), new Function1() { // from class: a.izi0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b9 = b8;
                        final byte b10 = 2;
                        final byte b11 = 0;
                        final byte b12 = 1;
                        final q1j0 q1j0Var3 = q1j0Var;
                        final cp cpVar = (cp) obj;
                        switch (b9) {
                            case 0:
                                cpVar.getClass();
                                DsMenuCell dsMenuCell = ((hxx) cpVar.u).b;
                                dsMenuCell.getClass();
                                dyb.c0(dsMenuCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b16 = b11;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b16) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 0));
                                break;
                            case 1:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell = ((kxx) cpVar.u).e;
                                dsSettingsCell.getClass();
                                dyb.O(dsSettingsCell, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b16 = b12;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b16) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 23));
                                break;
                            case 2:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell2 = ((cux) cpVar.u).f5007a;
                                dsSettingsCell2.getClass();
                                dyb.O(dsSettingsCell2, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b16 = b10;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b16) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 1));
                                break;
                            case 3:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell3 = ((fwx) cpVar.u).f10282a;
                                dsSettingsCell3.getClass();
                                final byte b13 = 3;
                                dyb.O(dsSettingsCell3, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b16 = b13;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b16) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new kzi0(cpVar, (byte) 2));
                                break;
                            case 4:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell4 = ((kxx) cpVar.u).e;
                                dsSettingsCell4.getClass();
                                final byte b14 = 4;
                                dyb.N(dsSettingsCell4, ymx.INTERVAL_750, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b16 = b14;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b16) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ctv(cpVar, cpVar, (byte) 28));
                                break;
                            case 5:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell5 = ((kxx) cpVar.u).e;
                                dsSettingsCell5.getClass();
                                final byte b15 = 5;
                                dyb.O(dsSettingsCell5, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b16 = b15;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b16) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 0));
                                break;
                            default:
                                cpVar.getClass();
                                DsSettingsCell dsSettingsCell6 = ((kxx) cpVar.u).e;
                                dsSettingsCell6.getClass();
                                final byte b16 = 6;
                                dyb.O(dsSettingsCell6, new Function1() { // from class: a.jzi0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b17 = b16;
                                        cp cpVar2 = cpVar;
                                        q1j0 q1j0Var4 = q1j0Var3;
                                        View view = (View) obj2;
                                        switch (b17) {
                                            case 0:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 1:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 2:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 3:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 4:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            case 5:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                            default:
                                                view.getClass();
                                                q1j0Var4.invoke(cpVar2.u());
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new pgj0(cpVar, cpVar, (byte) 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, ynh0.Z));
                dpVar.b(new gbn(new r3j0((byte) 28), new gsh0(3, (byte) 22), new rai0(q1j0Var2, (byte) 11), ynh0.Y));
                return dzi0Var;
            default:
                zie0 zie0Var9 = t1j0.Y1;
                org.xplatform.settings.impl.presentation.a aVarI6 = t1j0Var.I0();
                aVarI6.d.f31532a.c("acc_settings_mirror_go");
                aVarI6.A.f31684a.a(xun.f41520a, 3284L);
                String str = aVarI6.J0.O;
                if (str.length() == 0) {
                    sac.V(jiu0.a(aVarI6), new kej0(aVarI6, (byte) 3), null, aVarI6.s.c, new oej0(aVarI6, null, (byte) 4), 10);
                } else {
                    aVarI6.G(new u0j0(nsm0.l(str, aVarI6.F.a())), null);
                }
                return Unit.f46060a;
        }
    }
}
