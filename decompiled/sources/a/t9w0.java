package a;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class t9w0 extends BasePendingResult {
    public final Status k;

    public t9w0(Status status) {
        super(null);
        this.k = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final m0g0 b(Status status) {
        return this.k;
    }
}
