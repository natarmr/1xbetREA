package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class zfn extends androidx.compose.runtime.d {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zfn(Function0 function0, byte b) {
        super(function0);
        this.b = b;
    }

    @Override // androidx.compose.runtime.d
    public final l5d0 a(Object obj) {
        switch (this.b) {
            case 0:
                return new l5d0(this, obj, obj == null, rek0.c, null, true);
            default:
                return new l5d0(this, obj, obj == null, null, null, false);
        }
    }
}
