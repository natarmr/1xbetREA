package a;

import android.gov.nist.javax.sdp.fields.SDPKeywords;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kqy f18740a;
    public static final kqy b;
    public static final kqy c;
    public static final /* synthetic */ kqy[] d;

    static {
        kqy kqyVar = new kqy("INVARIANT", 0);
        f18740a = kqyVar;
        kqy kqyVar2 = new kqy(SDPKeywords.IN, 1);
        b = kqyVar2;
        kqy kqyVar3 = new kqy("OUT", 2);
        c = kqyVar3;
        d = new kqy[]{kqyVar, kqyVar2, kqyVar3};
    }

    public static kqy valueOf(String str) {
        return (kqy) Enum.valueOf(kqy.class, str);
    }

    public static kqy[] values() {
        return (kqy[]) d.clone();
    }
}
