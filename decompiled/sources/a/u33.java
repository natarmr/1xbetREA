package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u33 extends p4 {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u33(List list, byte b) {
        super((Object) list, (byte) 2);
        this.c = b;
    }

    @Override // a.b43
    public final sz5 f0() {
        switch (this.c) {
            case 0:
                return new e4d((List) this.b, (byte) 0);
            case 1:
                return new ubv((List) this.b, (byte) 0);
            case 2:
                return new e4d((List) this.b, (byte) 1);
            case 3:
                return new ubv((List) this.b, (byte) 1);
            case 4:
                return new ubv((List) this.b, (byte) 2);
            case 5:
                return new lkj0((List) this.b);
            default:
                return new e4d((List) this.b, (byte) 2);
        }
    }
}
