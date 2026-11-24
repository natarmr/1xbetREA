package a;

/* JADX INFO: loaded from: classes2.dex */
public final class yxz extends i3t0 {
    public final vzg0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yxz(vzg0 vzg0Var, ctf0 ctf0Var, uxz uxzVar, mne mneVar) {
        super(null, new mbz(uxzVar, vzg0Var, (byte) 6), new bcn(ctf0Var, (byte) 27), cvm0.p(mneVar.c, mneVar.f22085a), null);
        ctf0Var.getClass();
        this.o = vzg0Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        vrz vrzVar;
        String str;
        String str2;
        String str3;
        boolean z;
        qxz qxzVar = (qxz) obj;
        qxzVar.getClass();
        if (!(qxzVar instanceof oxz)) {
            if (qxzVar instanceof pxz) {
                String str4 = ((wxz) D()).c;
                str4.getClass();
                G(new vxz(str4));
                return;
            } else if (qxzVar.equals(nxz.f24306a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        String str5 = ((oxz) qxzVar).f26035a;
        StringBuilder sb = new StringBuilder();
        int length = str5.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str5.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            wxz wxzVar = (wxz) value;
            this.f.getClass();
            vrzVar = wxzVar.f39952a;
            str = wxzVar.b;
            str2 = wxzVar.d;
            str3 = wxzVar.e;
            z = wxzVar.f;
            str3.getClass();
        } while (!p7m0Var.m(value, new wxz(vrzVar, str, string, str2, str3, z)));
        this.o.e("LIMIT_VALUE", str5);
    }
}
