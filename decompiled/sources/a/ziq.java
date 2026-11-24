package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ziq extends orm0 {
    public ajq n;
    public dr8 o;

    @Override // a.orm0
    public final boolean c(fq80 fq80Var, long j, fck0 fck0Var) {
        byte[] bArr = fq80Var.f9961a;
        ajq ajqVar = this.n;
        if (ajqVar == null) {
            ajq ajqVar2 = new ajq(bArr, 17);
            this.n = ajqVar2;
            awq awqVarA = ajqVar2.c(Arrays.copyOfRange(bArr, 9, fq80Var.c), null).a();
            awqVarA.n = mg40.n("audio/ogg");
            fck0Var.b = new androidx.media3.common.b(awqVarA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            dr8 dr8Var = this.o;
            if (dr8Var != null) {
                dr8Var.f6545a = j;
                fck0Var.c = dr8Var;
            }
            ((androidx.media3.common.b) fck0Var.b).getClass();
            return false;
        }
        jtj jtjVarS = jeb.S(fq80Var);
        ajq ajqVar3 = new ajq(ajqVar.f989a, ajqVar.b, ajqVar.c, ajqVar.d, ajqVar.e, ajqVar.g, ajqVar.h, ajqVar.j, jtjVarS, ajqVar.l);
        this.n = ajqVar3;
        dr8 dr8Var2 = new dr8();
        dr8Var2.c = ajqVar3;
        dr8Var2.d = jtjVarS;
        dr8Var2.f6545a = -1L;
        dr8Var2.b = -1L;
        this.o = dr8Var2;
        return true;
    }

    @Override // a.orm0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
