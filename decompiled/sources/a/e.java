package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends i {
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(p68 p68Var, byte b) {
        super(p68Var);
        this.c = b;
    }

    @Override // a.c2
    public final String C() throws o660 {
        if (((p68) this.f3600a).b != 60) {
            throw o660.a();
        }
        StringBuilder sb = new StringBuilder();
        Q(5, sb);
        U(sb, 45, 15);
        return sb.toString();
    }

    @Override // a.i
    public final void S(int i, StringBuilder sb) {
        switch (this.c) {
            case 0:
                sb.append("(3103)");
                break;
            default:
                if (i >= 10000) {
                    sb.append("(3203)");
                } else {
                    sb.append("(3202)");
                }
                break;
        }
    }

    @Override // a.i
    public final int T(int i) {
        switch (this.c) {
            case 0:
                return i;
            default:
                return i < 10000 ? i : i - 10000;
        }
    }
}
