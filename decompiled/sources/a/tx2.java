package a;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* JADX INFO: loaded from: classes.dex */
public final class tx2 extends zje {
    public fy40 i;
    public j99 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx2(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, zje zjeVar) {
        super(zjeVar);
        this.l = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(this);
    }
}
