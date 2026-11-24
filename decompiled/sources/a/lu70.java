package a;

import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lu70 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lu70 f20660a = new lu70(1, ju70.class, "toOnlineCallUiState", "toOnlineCallUiState(Lorg/xplatform/feature/online_call/impl/presentation/model/OnlineCallState;)Lorg/xplatform/feature/online_call/impl/presentation/model/OnlineCallUiState;", 1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hu70 hu70Var = (hu70) obj;
        hu70Var.getClass();
        boolean z = hu70Var.c;
        boolean z2 = hu70Var.d;
        boolean z3 = hu70Var.f;
        boolean z4 = hu70Var.g;
        boolean z5 = hu70Var.h;
        boolean z6 = hu70Var.j;
        boolean z7 = hu70Var.k;
        String str = hu70Var.l;
        boolean z8 = hu70Var.n;
        boolean z9 = hu70Var.o;
        boolean z10 = hu70Var.t.f32841a == wuy.d || !z8;
        boolean z11 = hu70Var.q;
        String str2 = hu70Var.p;
        boolean z12 = hu70Var.s;
        boolean z13 = hu70Var.i;
        boolean z14 = hu70Var.e;
        boolean z15 = hu70Var.u;
        return new iu70(z, z2, z14, z3, z4, z5, z13, z6, z7, str, z8, z9, z10, z11, str2, z12, z15, z15 ? R.string.operator_call_preparing : R.string.operator_hint, z3 ? R.drawable.ic_glyph_mic_on : R.drawable.ic_glyph_mic_off, z4 ? R.drawable.ic_volume : R.drawable.ic_volume_off, z5 ? R.drawable.ic_call_end : R.drawable.ic_call);
    }
}
