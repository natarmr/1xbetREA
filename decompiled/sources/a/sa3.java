package a;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class sa3 extends ta3 {
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa3(String str) {
        super("IMPLEMENTATION_ONLY_FEATURE", str);
        this.d = (byte) 3;
    }

    @Override // a.ta3
    public final boolean a() {
        switch (this.d) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return false;
            case 4:
                return Build.VERSION.SDK_INT >= 26;
            case 5:
                return Build.VERSION.SDK_INT >= 27;
            case 6:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sa3(String str, String str2, byte b) {
        super(str, str2);
        this.d = b;
    }
}
