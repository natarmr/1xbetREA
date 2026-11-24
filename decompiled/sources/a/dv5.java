package a;

import kotlin.io.encoding.Base64$PaddingOption;

/* JADX INFO: loaded from: classes.dex */
public class dv5 {
    public static final cv5 c = new cv5(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6729a;
    public final boolean b;

    static {
        Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.f46067a;
        new dv5(-1, true, false);
        new dv5(76, false, true);
        new dv5(64, false, true);
    }

    public dv5(int i, boolean z, boolean z2) {
        Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.f46067a;
        this.f6729a = z;
        this.b = z2;
        if (z && z2) {
            jf4.o("Failed requirement.");
            throw null;
        }
    }
}
