package a;

import android.text.TextWatcher;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vpm extends rer implements ydr {
    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        int iIntValue3 = ((Number) obj4).intValue();
        ((TextWatcher) this.receiver).beforeTextChanged((CharSequence) obj, iIntValue, iIntValue2, iIntValue3);
        return Unit.f46060a;
    }
}
