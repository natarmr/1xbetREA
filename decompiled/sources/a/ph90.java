package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ph90 extends d5 implements h4x {
    public final /* synthetic */ byte b;
    public final eh90 c;

    public /* synthetic */ ph90(eh90 eh90Var, byte b) {
        this.b = b;
        this.c = eh90Var;
    }

    @Override // a.u1
    public final int b() {
        byte b = this.b;
        eh90 eh90Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return eh90Var.e;
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        byte b = this.b;
        eh90 eh90Var = this.c;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object obj2 = eh90Var.get(entry.getKey());
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && eh90Var.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return eh90Var.containsKey(obj);
        }
    }

    @Override // a.d5, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.b;
        eh90 eh90Var = this.c;
        switch (b) {
            case 0:
                oqs0 oqs0Var = eh90Var.d;
                pqs0[] pqs0VarArr = new pqs0[8];
                for (int i = 0; i < 8; i++) {
                    pqs0VarArr[i] = new rqs0((byte) 0);
                }
                return new rh90(oqs0Var, pqs0VarArr);
            default:
                oqs0 oqs0Var2 = eh90Var.d;
                pqs0[] pqs0VarArr2 = new pqs0[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    pqs0VarArr2[i2] = new rqs0((byte) 1);
                }
                return new rh90(oqs0Var2, pqs0VarArr2);
        }
    }
}
