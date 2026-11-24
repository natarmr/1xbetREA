package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class jvv extends k4e {
    public k4e[] u0 = new k4e[4];
    public int v0 = 0;

    public final void W(k4e k4eVar) {
        if (k4eVar == this || k4eVar == null) {
            return;
        }
        int i = this.v0 + 1;
        k4e[] k4eVarArr = this.u0;
        if (i > k4eVarArr.length) {
            k4eVarArr = (k4e[]) Arrays.copyOf(k4eVarArr, k4eVarArr.length * 2);
            this.u0 = k4eVarArr;
        }
        int i2 = this.v0;
        k4eVarArr[i2] = k4eVar;
        this.v0 = i2 + 1;
    }

    public final void X(int i, ydv0 ydv0Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.v0; i2++) {
            k4e k4eVar = this.u0[i2];
            ArrayList arrayList2 = ydv0Var.f42459a;
            if (!arrayList2.contains(k4eVar)) {
                arrayList2.add(k4eVar);
            }
        }
        for (int i3 = 0; i3 < this.v0; i3++) {
            lmc.H(this.u0[i3], i, arrayList, ydv0Var);
        }
    }

    @Override // a.k4e
    public void h(k4e k4eVar, HashMap map) {
        super.h(k4eVar, map);
        jvv jvvVar = (jvv) k4eVar;
        this.v0 = 0;
        int i = jvvVar.v0;
        for (int i2 = 0; i2 < i; i2++) {
            W((k4e) map.get(jvvVar.u0[i2]));
        }
    }

    public void Y() {
    }
}
