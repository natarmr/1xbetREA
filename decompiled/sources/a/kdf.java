package a;

import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kdf implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18104a;
    public final /* synthetic */ znp0 b;

    public /* synthetic */ kdf(znp0 znp0Var, byte b) {
        this.f18104a = b;
        this.b = znp0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18104a;
        znp0 znp0Var = this.b;
        switch (b) {
            case 0:
                return new u6n(d4d.STATIC_WHITE60, w6n.j, new c280(znp0Var.d, R.drawable.ic_glyph_placeholder_player));
            default:
                return new u6n(d4d.SECONDARY60, w6n.j, new c280(znp0Var.d, R.drawable.ic_glyph_placeholder_player));
        }
    }
}
