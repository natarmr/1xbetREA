package a;

import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s6 extends c2 {
    public static s6 e;
    public static s6 f;
    public final /* synthetic */ byte c;
    public BreakIterator d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(byte b) {
        super((byte) 1);
        this.c = b;
    }

    @Override // a.c2
    public final int[] D(int i) {
        switch (this.c) {
            case 0:
                int length = r().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.h("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return n(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            default:
                int length2 = r().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !S(i - 1) && !R(i)) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    Intrinsics.h("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !S(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !S(iPreceding2 - 1)) {
                    return n(iPreceding2, i);
                }
                return null;
        }
    }

    public final void Q(String str) {
        switch (this.c) {
            case 0:
                this.f3600a = str;
                BreakIterator breakIterator = this.d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    Intrinsics.h("impl");
                    throw null;
                }
            default:
                this.f3600a = str;
                BreakIterator breakIterator2 = this.d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    Intrinsics.h("impl");
                    throw null;
                }
        }
    }

    public boolean R(int i) {
        if (i <= 0 || !S(i - 1)) {
            return false;
        }
        return i == r().length() || !S(i);
    }

    public boolean S(int i) {
        if (i < 0 || i >= r().length()) {
            return false;
        }
        return Character.isLetterOrDigit(r().codePointAt(i));
    }

    @Override // a.c2
    public final int[] j(int i) {
        switch (this.c) {
            case 0:
                int length = r().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = this.d;
                    if (breakIterator == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = this.d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            Intrinsics.h("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return n(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            default:
                if (r().length() <= 0 || i >= r().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!S(i) && (!S(i) || (i != 0 && S(i - 1)))) {
                    BreakIterator breakIterator3 = this.d;
                    if (breakIterator3 == null) {
                        Intrinsics.h("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = this.d;
                if (breakIterator4 == null) {
                    Intrinsics.h("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !R(iFollowing2)) {
                    return null;
                }
                return n(i, iFollowing2);
        }
    }
}
