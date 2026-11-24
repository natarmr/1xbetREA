package a;

import java.util.Arrays;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes5.dex */
public final class no90 extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final gnu o;
    public final mne p;
    public final duj q;
    public final PickerParams r;
    public final fnu s;
    public final vzg0 t;
    public final cyu u;
    public final ctf0 v;
    public final sff0 w;
    public c4m0 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no90(gnu gnuVar, mne mneVar, duj dujVar, PickerParams pickerParams, fnu fnuVar, vzg0 vzg0Var, cyu cyuVar, ctf0 ctf0Var, pru pruVar) {
        super(null, new pl70(pickerParams, (byte) 20), new ev80((byte) 28), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = gnuVar;
        this.p = mneVar;
        this.q = dujVar;
        this.r = pickerParams;
        this.s = fnuVar;
        this.t = vzg0Var;
        this.u = cyuVar;
        this.v = ctf0Var;
        this.w = pruVar.a();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        io90 io90Var = (io90) obj;
        io90Var.getClass();
        boolean z = io90Var instanceof ho90;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        vzg0 vzg0Var = this.t;
        fnu fnuVar = this.s;
        if (!z) {
            if (io90Var instanceof do90) {
                do90 do90Var = (do90) io90Var;
                if (!do90Var.equals(bo90.f2923a)) {
                    if (do90Var.equals(co90.f4689a)) {
                        e3c.n(this.x);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                ctf0 ctf0Var = this.v;
                String strA = ctf0Var.b.a(R.string.language_selection_new, Arrays.copyOf(new Object[0], 0));
                String strA2 = ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value, ko90.a((ko90) value, 0, strA, strA2, null, 25)));
                String str = (String) vzg0Var.a("KEY_SEARCH_VALUE");
                if (str == null) {
                    str = "";
                }
                fnuVar.b(str);
                this.x = sac.T(new fnq(this.o.a(), new mo90(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.p.c), new mo90(this, null, (byte) 1));
                return;
            }
            return;
        }
        ho90 ho90Var = (ho90) io90Var;
        if (ho90Var instanceof eo90) {
            String str2 = ((eo90) ho90Var).f8129a;
            vzg0Var.e("KEY_SEARCH_VALUE", str2);
            fnuVar.b(str2);
            return;
        }
        boolean z2 = ho90Var instanceof go90;
        cyu cyuVar = this.u;
        if (!z2) {
            if (!(ho90Var instanceof fo90)) {
                t9f.b();
                return;
            } else {
                if (this.r instanceof PickerParams.Phone) {
                    cyuVar.z();
                    return;
                }
                return;
            }
        }
        jq90 jq90Var = ((go90) ho90Var).f11620a;
        cyuVar.B(jq90Var);
        p7m0 p7m0Var2 = ocjVar.f25029a;
        do {
            value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var2.m(value2, ko90.a((ko90) value2, jq90Var.f16940a, null, null, null, 30)));
        G(new jo90(jq90Var));
    }
}
