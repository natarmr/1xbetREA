package a;

/* JADX INFO: loaded from: classes2.dex */
public final class imx extends p4 {
    public final /* synthetic */ byte c = 0;
    public final String d;
    public final kvq0 e;
    public final n0o0 f;
    public final p4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imx(vkr0 vkr0Var, String str, kvq0 kvq0Var, imx imxVar) {
        super((Object) vkr0Var, (byte) 3);
        str.getClass();
        kvq0Var.getClass();
        this.d = str;
        this.e = kvq0Var;
        this.g = imxVar;
        this.f = maz.b(new sz2(this, (byte) 13));
    }

    @Override // a.p4
    public final Object q0(td9 td9Var) throws Exception {
        byte b = this.c;
        p4 p4Var = this.g;
        kvq0 kvq0Var = this.e;
        n0o0 n0o0Var = this.f;
        switch (b) {
            case 0:
                String str = this.d;
                if (kvq0Var.c(str)) {
                    String str2 = (String) n0o0Var.getValue();
                    str2.getClass();
                    throw new pmx(str2, (byte) 15);
                }
                try {
                    Object objQ0 = ((imx) p4Var).q0(td9Var);
                    kvq0Var.b(str);
                    return objQ0;
                } catch (ovt0 e) {
                    kvq0Var.a(str);
                    E0((String) n0o0Var.getValue(), e);
                    throw e;
                }
            default:
                String str3 = this.d;
                if (kvq0Var.c(str3)) {
                    String str4 = (String) n0o0Var.getValue();
                    str4.getClass();
                    throw new w2e0(43, str3, str4, null, null, null, 1008);
                }
                try {
                    Object objQ1 = ((v2e0) p4Var).q0(td9Var);
                    kvq0Var.b(str3);
                    return objQ1;
                } catch (yut0 e2) {
                    if (e2.b != 43) {
                        throw e2;
                    }
                    kvq0Var.a(str3);
                    E0((String) n0o0Var.getValue(), e2);
                    throw e2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imx(vkr0 vkr0Var, String str, kvq0 kvq0Var, v2e0 v2e0Var) {
        super((Object) vkr0Var, (byte) 3);
        kvq0Var.getClass();
        this.d = str;
        this.e = kvq0Var;
        this.g = v2e0Var;
        this.f = maz.b(new sz2(this, (byte) 19));
    }
}
