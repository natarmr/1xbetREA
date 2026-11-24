package a;

/* JADX INFO: loaded from: classes2.dex */
public final class uw3 extends ud00 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw3(ugi0 ugi0Var, byte b) {
        super(ugi0Var);
        this.b = b;
    }

    @Override // a.ugi0
    public final String h() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
