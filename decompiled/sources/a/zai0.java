package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class zai0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44070a;
    public final Function2 b;
    public final boolean c;

    public /* synthetic */ zai0(String str) {
        this(str, new d1i0((byte) 22));
    }

    public final String toString() {
        return kng0.k("AccessibilityKey: ", this.f44070a);
    }

    public zai0(String str, Function2 function2) {
        this.f44070a = str;
        this.b = function2;
    }

    public zai0(String str, int i) {
        this(str);
        this.c = true;
    }

    public zai0(String str, boolean z, Function2 function2) {
        this(str, function2);
        this.c = z;
    }
}
