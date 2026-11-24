package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class fk4 extends bnn0 implements Function2 {
    public final /* synthetic */ hk4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk4(hk4 hk4Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = hk4Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new fk4(this.i, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((fk4) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        int i = hk4.b0;
        final hk4 hk4Var = this.i;
        i1w0 i1w0Var = hk4Var.w;
        final byte b = 2;
        i1w0Var.f("PICKER_DIALOG_SHOWN_KEY", new t2g0() { // from class: a.xj4
            @Override // a.t2g0
            public final void onResult(Object obj2) {
                Object value;
                byte b2 = b;
                hk4 hk4Var2 = hk4Var;
                switch (b2) {
                    case 0:
                        obj2.getClass();
                        yje yjeVar = null;
                        if ((obj2 instanceof Integer ? (Integer) obj2 : null) != null) {
                            i3t0.K(hk4Var2, null, null, new gc4((i3t0) hk4Var2, ((Number) obj2).intValue(), yjeVar, (byte) 2), 3);
                        }
                        break;
                    case 1:
                        obj2.getClass();
                        if ((obj2 instanceof kl90 ? (kl90) obj2 : null) != null) {
                            kl90 kl90Var = (kl90) obj2;
                            int i2 = kl90Var.f18476a;
                            boolean z = kl90Var.b;
                            hk4 hk4Var3 = hk4Var;
                            i3t0.K(hk4Var3, null, null, new hc4(hk4Var3, i2, z, null, (byte) 2), 3);
                        }
                        break;
                    default:
                        obj2.getClass();
                        p7m0 p7m0Var = hk4Var2.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            hk4Var2.f.getClass();
                        } while (!p7m0Var.m(value, tj4.a((tj4) value, false, false, false, null, null, null, 0, false, null, null, false, 65527)));
                        break;
                }
            }
        });
        final byte b2 = 0;
        i1w0Var.f("PICKER_DIALOG_ITEM_SELECTED_KEY", new t2g0() { // from class: a.xj4
            @Override // a.t2g0
            public final void onResult(Object obj2) {
                Object value;
                byte b3 = b2;
                hk4 hk4Var2 = hk4Var;
                switch (b3) {
                    case 0:
                        obj2.getClass();
                        yje yjeVar = null;
                        if ((obj2 instanceof Integer ? (Integer) obj2 : null) != null) {
                            i3t0.K(hk4Var2, null, null, new gc4((i3t0) hk4Var2, ((Number) obj2).intValue(), yjeVar, (byte) 2), 3);
                        }
                        break;
                    case 1:
                        obj2.getClass();
                        if ((obj2 instanceof kl90 ? (kl90) obj2 : null) != null) {
                            kl90 kl90Var = (kl90) obj2;
                            int i2 = kl90Var.f18476a;
                            boolean z = kl90Var.b;
                            hk4 hk4Var3 = hk4Var;
                            i3t0.K(hk4Var3, null, null, new hc4(hk4Var3, i2, z, null, (byte) 2), 3);
                        }
                        break;
                    default:
                        obj2.getClass();
                        p7m0 p7m0Var = hk4Var2.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            hk4Var2.f.getClass();
                        } while (!p7m0Var.m(value, tj4.a((tj4) value, false, false, false, null, null, null, 0, false, null, null, false, 65527)));
                        break;
                }
            }
        });
        final byte b3 = 1;
        i1w0Var.f("PICKER_DIALOG_PHONE_CODE_BY_MANUALLY_KEY", new t2g0() { // from class: a.xj4
            @Override // a.t2g0
            public final void onResult(Object obj2) {
                Object value;
                byte b4 = b3;
                hk4 hk4Var2 = hk4Var;
                switch (b4) {
                    case 0:
                        obj2.getClass();
                        yje yjeVar = null;
                        if ((obj2 instanceof Integer ? (Integer) obj2 : null) != null) {
                            i3t0.K(hk4Var2, null, null, new gc4((i3t0) hk4Var2, ((Number) obj2).intValue(), yjeVar, (byte) 2), 3);
                        }
                        break;
                    case 1:
                        obj2.getClass();
                        if ((obj2 instanceof kl90 ? (kl90) obj2 : null) != null) {
                            kl90 kl90Var = (kl90) obj2;
                            int i2 = kl90Var.f18476a;
                            boolean z = kl90Var.b;
                            hk4 hk4Var3 = hk4Var;
                            i3t0.K(hk4Var3, null, null, new hc4(hk4Var3, i2, z, null, (byte) 2), 3);
                        }
                        break;
                    default:
                        obj2.getClass();
                        p7m0 p7m0Var = hk4Var2.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            hk4Var2.f.getClass();
                        } while (!p7m0Var.m(value, tj4.a((tj4) value, false, false, false, null, null, null, 0, false, null, null, false, 65527)));
                        break;
                }
            }
        });
        i1w0Var.d(new wj4(hk4Var, (byte) 4));
        return Unit.f46060a;
    }
}
