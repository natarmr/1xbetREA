package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class bh4 extends bnn0 implements Function2 {
    public final /* synthetic */ fh4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh4(fh4 fh4Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = fh4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new bh4(this.i, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bh4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        int i = fh4.c0;
        final fh4 fh4Var = this.i;
        i1w0 i1w0Var = fh4Var.x;
        final byte b = 0;
        i1w0Var.f("PICKER_DIALOG_SHOWN_KEY", new t2g0() { // from class: a.qg4
            @Override // a.t2g0
            public final void onResult(Object obj2) {
                Object value;
                byte b2 = b;
                fh4 fh4Var2 = fh4Var;
                switch (b2) {
                    case 0:
                        obj2.getClass();
                        p7m0 p7m0Var = fh4Var2.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            fh4Var2.f.getClass();
                        } while (!p7m0Var.m(value, zf4.a((zf4) value, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
                        break;
                    case 1:
                        obj2.getClass();
                        yje yjeVar = null;
                        if ((obj2 instanceof Integer ? (Integer) obj2 : null) != null) {
                            i3t0.K(fh4Var2, null, null, new gc4((i3t0) fh4Var2, ((Number) obj2).intValue(), yjeVar, (byte) 1), 3);
                        }
                        break;
                    default:
                        obj2.getClass();
                        if ((obj2 instanceof kl90 ? (kl90) obj2 : null) != null) {
                            kl90 kl90Var = (kl90) obj2;
                            int i2 = kl90Var.f18476a;
                            boolean z = kl90Var.b;
                            fh4 fh4Var3 = fh4Var;
                            i3t0.K(fh4Var3, null, null, new hc4(fh4Var3, i2, z, null, (byte) 1), 3);
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        i1w0Var.f("PICKER_DIALOG_ITEM_SELECTED_KEY", new t2g0() { // from class: a.qg4
            @Override // a.t2g0
            public final void onResult(Object obj2) {
                Object value;
                byte b3 = b2;
                fh4 fh4Var2 = fh4Var;
                switch (b3) {
                    case 0:
                        obj2.getClass();
                        p7m0 p7m0Var = fh4Var2.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            fh4Var2.f.getClass();
                        } while (!p7m0Var.m(value, zf4.a((zf4) value, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
                        break;
                    case 1:
                        obj2.getClass();
                        yje yjeVar = null;
                        if ((obj2 instanceof Integer ? (Integer) obj2 : null) != null) {
                            i3t0.K(fh4Var2, null, null, new gc4((i3t0) fh4Var2, ((Number) obj2).intValue(), yjeVar, (byte) 1), 3);
                        }
                        break;
                    default:
                        obj2.getClass();
                        if ((obj2 instanceof kl90 ? (kl90) obj2 : null) != null) {
                            kl90 kl90Var = (kl90) obj2;
                            int i2 = kl90Var.f18476a;
                            boolean z = kl90Var.b;
                            fh4 fh4Var3 = fh4Var;
                            i3t0.K(fh4Var3, null, null, new hc4(fh4Var3, i2, z, null, (byte) 1), 3);
                        }
                        break;
                }
            }
        });
        final byte b3 = 2;
        i1w0Var.f("PICKER_DIALOG_PHONE_CODE_BY_MANUALLY_KEY", new t2g0() { // from class: a.qg4
            @Override // a.t2g0
            public final void onResult(Object obj2) {
                Object value;
                byte b4 = b3;
                fh4 fh4Var2 = fh4Var;
                switch (b4) {
                    case 0:
                        obj2.getClass();
                        p7m0 p7m0Var = fh4Var2.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            fh4Var2.f.getClass();
                        } while (!p7m0Var.m(value, zf4.a((zf4) value, false, false, false, null, null, null, 0, false, null, null, false, false, 32759)));
                        break;
                    case 1:
                        obj2.getClass();
                        yje yjeVar = null;
                        if ((obj2 instanceof Integer ? (Integer) obj2 : null) != null) {
                            i3t0.K(fh4Var2, null, null, new gc4((i3t0) fh4Var2, ((Number) obj2).intValue(), yjeVar, (byte) 1), 3);
                        }
                        break;
                    default:
                        obj2.getClass();
                        if ((obj2 instanceof kl90 ? (kl90) obj2 : null) != null) {
                            kl90 kl90Var = (kl90) obj2;
                            int i2 = kl90Var.f18476a;
                            boolean z = kl90Var.b;
                            fh4 fh4Var3 = fh4Var;
                            i3t0.K(fh4Var3, null, null, new hc4(fh4Var3, i2, z, null, (byte) 1), 3);
                        }
                        break;
                }
            }
        });
        i1w0Var.d(new rg4(fh4Var, (byte) 6));
        return Unit.f46060a;
    }
}
