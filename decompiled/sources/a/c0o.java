package a;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class c0o extends b3 implements a0o, RandomAccess, Serializable {
    public final Enum[] b;

    public c0o(Enum[] enumArr) {
        enumArr.getClass();
        this.b = enumArr;
    }

    @Override // a.u1
    public final int b() {
        return this.b.length;
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) tx3.G(r3.ordinal(), this.b)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        x2 x2Var = b3.f1878a;
        Enum[] enumArr = this.b;
        int length = enumArr.length;
        x2Var.getClass();
        x2.b(i, length);
        return enumArr[i];
    }

    @Override // a.b3, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) tx3.G(iOrdinal, this.b)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // a.b3, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) tx3.G(iOrdinal, this.b)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
