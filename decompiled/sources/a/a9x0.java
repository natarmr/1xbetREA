package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a9x0 extends giw0 {
    public final boolean c;
    public final boolean d;
    public final /* synthetic */ lzw0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9x0(lzw0 lzw0Var, boolean z, boolean z2) {
        super("log");
        this.e = lzw0Var;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // a.giw0
    public final jlw0 a(h0q0 h0q0Var, List list) {
        int i;
        int i2;
        String strZzc;
        ArrayList arrayList;
        pvm0.E("log", list, 1);
        int size = list.size();
        wlw0 wlw0Var = jlw0.V0;
        lzw0 lzw0Var = this.e;
        if (size == 1) {
            ((ikt0) lzw0Var.d).f(3, ((okt0) h0q0Var.b).s(h0q0Var, (jlw0) list.get(0)).zzc(), Collections.EMPTY_LIST, this.c, this.d);
            return wlw0Var;
        }
        jlw0 jlw0Var = (jlw0) list.get(0);
        okt0 okt0Var = (okt0) h0q0Var.b;
        okt0 okt0Var2 = (okt0) h0q0Var.b;
        int iJ = pvm0.J(okt0Var.s(h0q0Var, jlw0Var).zzd().doubleValue());
        if (iJ != 2) {
            i = 3;
            if (iJ == 3) {
                i2 = 1;
            } else if (iJ == 5) {
                i2 = 5;
            } else if (iJ == 6) {
                i2 = 2;
            }
            strZzc = okt0Var2.s(h0q0Var, (jlw0) list.get(1)).zzc();
            if (list.size() == 2) {
                ((ikt0) lzw0Var.d).f(i2, strZzc, Collections.EMPTY_LIST, this.c, this.d);
                return wlw0Var;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(okt0Var2.s(h0q0Var, (jlw0) list.get(i3)).zzc());
            }
            ((ikt0) lzw0Var.d).f(i2, strZzc, arrayList, this.c, this.d);
            return wlw0Var;
        }
        i = 4;
        i2 = i;
        strZzc = okt0Var2.s(h0q0Var, (jlw0) list.get(1)).zzc();
        if (list.size() == 2) {
            ((ikt0) lzw0Var.d).f(i2, strZzc, Collections.EMPTY_LIST, this.c, this.d);
            return wlw0Var;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(okt0Var2.s(h0q0Var, (jlw0) list.get(i3)).zzc());
        }
        ((ikt0) lzw0Var.d).f(i2, strZzc, arrayList, this.c, this.d);
        return wlw0Var;
    }
}
