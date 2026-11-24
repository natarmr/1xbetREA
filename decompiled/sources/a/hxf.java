package a;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class hxf extends c2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxf(Bundle bundle, String str) {
        super(bundle, str);
        str.getClass();
        bundle.getClass();
        if (str.length() > 0) {
            return;
        }
        jf4.o("type should not be empty");
        throw null;
    }
}
