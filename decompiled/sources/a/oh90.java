package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class oh90 extends d5 implements g4x {
    public final /* synthetic */ byte b;
    public final dh90 c;

    public /* synthetic */ oh90(dh90 dh90Var, byte b) {
        this.b = b;
        this.c = dh90Var;
    }

    @Override // a.u1
    public final int b() {
        byte b = this.b;
        dh90 dh90Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return dh90Var.e;
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        byte b = this.b;
        dh90 dh90Var = this.c;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return r8x.F(dh90Var, (Map.Entry) obj);
                }
                return false;
            default:
                return dh90Var.containsKey(obj);
        }
    }

    @Override // a.d5, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.b;
        dh90 dh90Var = this.c;
        switch (b) {
            case 0:
                nqs0 nqs0Var = dh90Var.d;
                nqs0Var.getClass();
                pqs0[] pqs0VarArr = new pqs0[8];
                for (int i = 0; i < 8; i++) {
                    pqs0VarArr[i] = new qqs0((byte) 0);
                }
                return new qh90(nqs0Var, pqs0VarArr);
            default:
                nqs0 nqs0Var2 = dh90Var.d;
                nqs0Var2.getClass();
                pqs0[] pqs0VarArr2 = new pqs0[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    pqs0VarArr2[i2] = new qqs0((byte) 1);
                }
                return new qh90(nqs0Var2, pqs0VarArr2);
        }
    }
}
