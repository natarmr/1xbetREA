package a;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xmk0 implements Appendable, CharSequence {
    public final ArrayDeque b = new ArrayDeque(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f41130a = new StringBuilder((CharSequence) "");

    public xmk0() {
        b(0, "");
    }

    public static void c(xmk0 xmk0Var, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                xmk0Var.b.push(new umk0(obj, i, i2, 33));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                c(xmk0Var, obj2, i, i2);
            }
        }
    }

    public final void a(char c) {
        this.f41130a.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.f41130a;
        b(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    public final void b(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof vmk0;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.b;
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        arrayDeque.push(new umk0(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj)));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) spanned;
                    arrayDeque.push(new umk0(obj2, spannableStringBuilder.getSpanStart(obj2) + i, spannableStringBuilder.getSpanEnd(obj2) + i, spannableStringBuilder.getSpanFlags(obj2)));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f41130a.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f41130a.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<umk0> listUnmodifiableList;
        int i3;
        StringBuilder sb = this.f41130a;
        int length = sb.length();
        if (i2 <= i || i < 0 || i2 > length) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.b;
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    umk0 umk0Var = (umk0) itDescendingIterator.next();
                    int i4 = umk0Var.b;
                    if ((i4 >= i && i4 < i2) || (((i3 = umk0Var.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(umk0Var);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (umk0 umk0Var2 : listUnmodifiableList) {
            int iMax = Math.max(0, umk0Var2.b - i);
            spannableStringBuilder.setSpan(umk0Var2.f35922a, iMax, Math.min(length2, (umk0Var2.c - umk0Var2.b) + iMax), umk0Var2.d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f41130a.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.f41130a.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.f41130a;
        b(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }
}
