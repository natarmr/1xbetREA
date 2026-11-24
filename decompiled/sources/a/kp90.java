package a;

import kotlin.Unit;
import org.xplatform.picker.api.presentation.PickerDialogParams;

/* JADX INFO: loaded from: classes5.dex */
public final class kp90 extends i3t0 {
    public static final /* synthetic */ int z = 0;
    public final vzg0 o;
    public final mne p;
    public final duj q;
    public final PickerDialogParams r;
    public final fnu s;
    public final wti t;
    public final fnu u;
    public final i1w0 v;
    public final String w;
    public final cyu x;
    public final sff0 y;

    /* JADX WARN: Illegal instructions before constructor call */
    public kp90(vzg0 vzg0Var, pru pruVar, bzt bztVar, ctf0 ctf0Var, mne mneVar, gnu gnuVar, duj dujVar, PickerDialogParams pickerDialogParams, fnu fnuVar, wti wtiVar, fnu fnuVar2, i1w0 i1w0Var, String str, cyu cyuVar) {
        ctf0Var.getClass();
        vs10 vs10Var = mneVar.c;
        g090 g090VarP = cvm0.p(vs10Var, mneVar.f22085a);
        byte b = 1;
        yje yjeVar = null;
        super(new nf2(pruVar, vzg0Var, b), g090VarP, new jl40((Object) bztVar, (Object) pickerDialogParams, (Object) ctf0Var, (byte) 21), (yzn0) null);
        this.o = vzg0Var;
        this.p = mneVar;
        this.q = dujVar;
        this.r = pickerDialogParams;
        this.s = fnuVar;
        this.t = wtiVar;
        this.u = fnuVar2;
        this.v = i1w0Var;
        this.w = str;
        this.x = cyuVar;
        this.y = pruVar.a();
        fnuVar.b(((br90) D()).d);
        sac.T(new fnq(gnuVar.a(), new hp90(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), vs10Var), new hp90(this, yjeVar, b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        Object value3;
        un90 un90Var = (un90) obj;
        un90Var.getClass();
        boolean zEquals = un90Var.equals(on90.f25537a);
        byte b = 1;
        mne mneVar = this.p;
        Object obj2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (zEquals) {
            I(mneVar.c, new gp90(this, b), new jp90(this, null));
            return;
        }
        boolean zEquals2 = un90Var.equals(pn90.f27277a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        cyu cyuVar = this.x;
        vzg0 vzg0Var = this.o;
        if (zEquals2) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, br90.a((br90) value3, null, null, null, false, 59)));
            vzg0Var.e("KEY_ENTER_PHONE_CODE_BY_MANUALLY", Boolean.TRUE);
            cyuVar.A();
            return;
        }
        byte b2 = 0;
        if (un90Var instanceof qn90) {
            String str = ((qn90) un90Var).f29021a;
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value2, br90.a((br90) value2, new zqp(str, false), null, null, false, 61)));
            vzg0Var.e("KEY_PHONE_CODE_BY_MANUALLY", str);
            return;
        }
        boolean z2 = un90Var instanceof rn90;
        i1w0 i1w0Var = this.v;
        if (z2) {
            int i = ((rn90) un90Var).f30778a;
            for (Object obj3 : ((br90) D()).e) {
                if (((nq90) obj3).getId() == i) {
                    obj2 = obj3;
                    break;
                }
            }
            nq90 nq90Var = (nq90) obj2;
            if (nq90Var != null) {
                cyuVar.B(nq90Var);
            }
            i1w0Var.e(Integer.valueOf(i), "PICKER_DIALOG_ITEM_SELECTED_KEY");
            i1w0Var.d(new gp90(this, b2));
            return;
        }
        if (un90Var.equals(sn90.f32482a)) {
            if (this.r.f46801a instanceof PickerDialogParams.PickerType.Phone) {
                cyuVar.z();
                return;
            }
            return;
        }
        if (un90Var instanceof tn90) {
            String str2 = ((tn90) un90Var).f34223a;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, br90.a((br90) value, null, str2, null, false, 55)));
            vzg0Var.e("KEY_SEARCH_VALUE", str2);
            this.s.b(str2);
            return;
        }
        if (un90Var.equals(nn90.f23811a)) {
            i3t0.K(this, mneVar.c, null, new ip90(this, objArr2 == true ? 1 : 0, b), 2);
            return;
        }
        if (un90Var.equals(mn90.f22078a)) {
            i3t0.K(this, mneVar.c, null, new ip90(this, objArr == true ? 1 : 0, b2), 2);
        } else if (un90Var.equals(ln90.f20334a)) {
            i1w0Var.e(Unit.f46060a, "PICKER_DIALOG_SHOWN_KEY");
        } else {
            t9f.b();
        }
    }
}
