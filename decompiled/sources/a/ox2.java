package a;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class ox2 extends zje {
    public /* synthetic */ Object i;
    public final /* synthetic */ AndroidComposeView j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox2(AndroidComposeView androidComposeView, zje zjeVar) {
        super(zjeVar);
        this.j = androidComposeView;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        this.j.K(null, this);
        return wne.f39444a;
    }
}
