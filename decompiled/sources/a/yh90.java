package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class yh90 extends d5 implements g4x {
    public final /* synthetic */ byte b;
    public final uh90 c;

    public /* synthetic */ yh90(uh90 uh90Var, byte b) {
        this.b = b;
        this.c = uh90Var;
    }

    @Override // a.u1
    public final int b() {
        byte b = this.b;
        uh90 uh90Var = this.c;
        switch (b) {
            case 0:
                break;
        }
        return uh90Var.f.c();
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        byte b = this.b;
        uh90 uh90Var = this.c;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return r8x.F(uh90Var, (Map.Entry) obj);
                }
                return false;
            default:
                return uh90Var.f.containsKey(obj);
        }
    }

    @Override // a.d5, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.b;
        uh90 uh90Var = this.c;
        switch (b) {
            case 0:
                return new zh90(uh90Var, (byte) 0);
            default:
                return new zh90(uh90Var, (byte) 1);
        }
    }
}
