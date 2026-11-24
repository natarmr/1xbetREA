package a;

import java.text.CharacterIterator;

/* JADX INFO: loaded from: classes.dex */
public final class gvb implements CharacterIterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f11967a;
    public final int b;
    public int c = 0;

    public gvb(int i, CharSequence charSequence) {
        this.f11967a = charSequence;
        this.b = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.c;
        if (i == this.b) {
            return (char) 65535;
        }
        return this.f11967a.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.c = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.b;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.c;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.b;
        if (i == 0) {
            this.c = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.c = i2;
        return this.f11967a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.c + 1;
        this.c = i;
        int i2 = this.b;
        if (i < i2) {
            return this.f11967a.charAt(i);
        }
        this.c = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.c;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.c = i2;
        return this.f11967a.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.b || i < 0) {
            jf4.o("invalid position");
            return (char) 0;
        }
        this.c = i;
        return current();
    }
}
