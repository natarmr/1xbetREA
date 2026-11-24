package a;

import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cwi0 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cwi0 f5082a = new cwi0(2, dwi0.class, "compareKey", "compareKey(ILorg/xplatform/settings/impl/presentation/adapter/model/SettingsUiModel;)Ljava/lang/Object;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object title;
        int iIntValue = ((Number) obj).intValue();
        hej0 hej0Var = (hej0) obj2;
        hej0Var.getClass();
        if (hej0Var instanceof wev0) {
            title = hej0Var.getClass().getName();
        } else if (hej0Var instanceof aaj0) {
            title = Integer.valueOf(iIntValue);
        } else if (hej0Var instanceof nzi0) {
            title = ((nzi0) hej0Var).f24375a;
        } else if (hej0Var instanceof qfj0) {
            title = hej0Var.getClass().getName();
        } else if (hej0Var instanceof hzi0) {
            title = Integer.valueOf(R.drawable.banner_time);
        } else if ((hej0Var instanceof g4k) || (hej0Var instanceof mv00)) {
            title = hej0Var.getClass().getName();
        } else if (hej0Var instanceof b8j0) {
            title = ((b8j0) hej0Var).getTitle();
        } else if (hej0Var instanceof wgj0) {
            title = ((wgj0) hej0Var).getTitle();
        } else if (hej0Var instanceof vhj0) {
            title = ((vhj0) hej0Var).f37433a;
        } else {
            title = hej0Var instanceof vdj0 ? ((vdj0) hej0Var).getTitle() : Integer.valueOf(iIntValue);
        }
        title.getClass();
        return title;
    }
}
