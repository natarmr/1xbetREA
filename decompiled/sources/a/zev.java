package a;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class zev extends vfc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BreakIterator f44271a;

    public zev(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f44271a = characterInstance;
    }

    @Override // a.vfc
    public final int K(int i) {
        return this.f44271a.following(i);
    }

    @Override // a.vfc
    public final int L(int i) {
        return this.f44271a.preceding(i);
    }
}
