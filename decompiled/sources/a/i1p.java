package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class i1p extends k1p {
    public final /* synthetic */ byte b;
    public final Object c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1p(int i, byte b) {
        this(Integer.valueOf(i), (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this(Integer.valueOf(i), (byte) 1);
                break;
            case 2:
                this(Integer.valueOf(i));
                break;
            default:
                break;
        }
    }

    @Override // a.k1p
    public final Object a() {
        switch (this.b) {
            case 0:
                return (Serializable) this.c;
            case 1:
                return (Serializable) this.c;
            default:
                return this.c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1p(Serializable serializable, byte b) {
        super(m1p.e);
        this.b = b;
        switch (b) {
            case 1:
                super(m1p.f);
                this.c = serializable;
                break;
            default:
                this.c = serializable;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1p(Object obj) {
        super(m1p.d);
        this.b = (byte) 2;
        this.c = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1p(byte b, long j) {
        this(Long.valueOf(j), (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this(Long.valueOf(j), (byte) 1);
                break;
            case 2:
                this(Long.valueOf(j));
                break;
            default:
                break;
        }
    }
}
