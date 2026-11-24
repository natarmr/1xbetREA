package a;

import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class etb extends i3t0 {
    public final vgu o;
    public final String p;
    public final vby q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etb(mne mneVar, ctf0 ctf0Var, vgu vguVar, pyu pyuVar, String str, vby vbyVar) {
        super(null, new l00(str, (byte) 2), new ep4(ctf0Var, (byte) 17), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        vbyVar.getClass();
        this.o = vguVar;
        this.p = str;
        this.q = vbyVar;
        ssd ssdVar = (ssd) ((vff0) pyuVar.f27815a).e().get(str);
        cl5 cl5Var = ipb.f15154a;
        mcy mcyVar = ssdVar != null ? ssdVar.f32720a : null;
        cl5Var.getClass();
        H(new kea(ssdVar, cl5.s(mcyVar), (byte) 17));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        btb btbVar;
        mcy mcyVarA;
        Object value2;
        Object value3;
        Object value4;
        vsb vsbVar = (vsb) obj;
        vsbVar.getClass();
        boolean z = vsbVar instanceof qsb;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value4 = p7m0Var.getValue();
                value4.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value4, btb.a((btb) value4, null, ncy.a(Boolean.valueOf(((qsb) vsbVar).f29250a)), 95)));
            return;
        }
        if (vsbVar instanceof ssb) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, btb.a((btb) value3, null, ((ssb) vsbVar).f32717a, 95)));
            return;
        }
        if (vsbVar instanceof rsb) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, btb.a((btb) value2, ((rsb) vsbVar).f31023a, null, 79)));
            return;
        }
        boolean zEquals = vsbVar.equals(psb.f27508a);
        atb atbVar = atb.f1425a;
        String str = this.p;
        vgu vguVar = this.o;
        if (!zEquals) {
            if (vsbVar.equals(usb.f36202a)) {
                vguVar.a(null, str);
                G(atbVar);
                return;
            } else {
                if (!vsbVar.equals(tsb.f34453a)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value = p7m0Var4.getValue();
                    value.getClass();
                    btbVar = (btb) value;
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value, btb.a(btbVar, "", btbVar.b, 79)));
                return;
            }
        }
        if (((btb) D()).e.length() == 0) {
            mcyVarA = ((btb) D()).f;
        } else {
            String str2 = ((btb) D()).e;
            ipb ipbVar = ((btb) D()).d;
            vby vbyVar = this.q;
            vbyVar.getClass();
            try {
                int iOrdinal = ipbVar.ordinal();
                if (iOrdinal == 0) {
                    mcyVarA = ncy.a(Boolean.valueOf(Boolean.parseBoolean(str2)));
                } else if (iOrdinal == 1) {
                    if (!StringsKt.k0(str2, '[')) {
                        str2 = "[" + str2 + "]";
                    }
                    mcyVarA = ncy.h(vbyVar.e(str2));
                } else if (iOrdinal == 2) {
                    mcyVarA = ncy.b(Integer.valueOf(Integer.parseInt(str2)));
                } else {
                    if (iOrdinal != 3) {
                        throw new m460();
                    }
                    try {
                        mcyVarA = vbyVar.e(str2);
                    } catch (Exception unused) {
                        mcyVarA = bdy.INSTANCE;
                    }
                }
            } catch (Exception unused2) {
                mcyVarA = bdy.INSTANCE;
            }
        }
        vguVar.a(mcyVarA, str);
        G(atbVar);
    }
}
