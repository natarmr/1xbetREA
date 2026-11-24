package a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class qsn {
    public static final Object j = new Object();
    public static volatile qsn k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f29266a;
    public final lx3 b;
    public volatile byte c;
    public final Handler d;
    public final yp2 e;
    public final psn f;
    public final xak g;
    public final boolean h;
    public final muj i;

    public qsn(zrq zrqVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f29266a = reentrantReadWriteLock;
        this.c = (byte) 3;
        psn psnVar = zrqVar.f44869a;
        this.f = psnVar;
        boolean z = zrqVar.b;
        this.h = z;
        this.i = zrqVar.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new lx3(0);
        this.g = new xak((byte) 7);
        yp2 yp2Var = new yp2(this);
        this.e = yp2Var;
        reentrantReadWriteLock.writeLock().lock();
        if (!z) {
            try {
                this.c = (byte) 0;
            } catch (Throwable th) {
                this.f29266a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (c() == 0) {
            try {
                psnVar.a(new msn(yp2Var));
            } catch (Throwable th2) {
                f(th2);
            }
        }
    }

    public static qsn a() {
        qsn qsnVar;
        synchronized (j) {
            qsnVar = k;
            z1x.y("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", qsnVar != null);
        }
        return qsnVar;
    }

    public static boolean d() {
        return k != null;
    }

    public final int b(int i, CharSequence charSequence) {
        z1x.y("Not initialized yet", c() == 1);
        z1x.x(charSequence, "charSequence cannot be null");
        lhf0 lhf0Var = (lhf0) this.e.b;
        lhf0Var.getClass();
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            v0t0[] v0t0VarArr = (v0t0[]) spanned.getSpans(i, i + 1, v0t0.class);
            if (v0t0VarArr.length > 0) {
                return spanned.getSpanStart(v0t0VarArr[0]);
            }
        }
        return ((ctn) lhf0Var.E(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new ctn(i))).b;
    }

    public final int c() {
        this.f29266a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.f29266a.readLock().unlock();
        }
    }

    public final void e() {
        z1x.y("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h);
        if (c() == 1) {
            return;
        }
        this.f29266a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.f29266a.writeLock().unlock();
                return;
            }
            this.c = (byte) 0;
            this.f29266a.writeLock().unlock();
            yp2 yp2Var = this.e;
            qsn qsnVar = (qsn) yp2Var.f43010a;
            try {
                qsnVar.f.a(new msn(yp2Var));
            } catch (Throwable th) {
                qsnVar.f(th);
            }
        } catch (Throwable th2) {
            this.f29266a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f29266a.writeLock().lock();
        try {
            this.c = (byte) 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.f29266a.writeLock().unlock();
            this.d.post(new osn(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.f29266a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ab A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:35:0x0066, B:38:0x006b, B:40:0x006f, B:42:0x007c, B:49:0x009b, B:51:0x00a5, B:53:0x00a8, B:55:0x00ab, B:57:0x00bb, B:58:0x00be), top: B:94:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00bb A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:35:0x0066, B:38:0x006b, B:40:0x006f, B:42:0x007c, B:49:0x009b, B:51:0x00a5, B:53:0x00a8, B:55:0x00ab, B:57:0x00bb, B:58:0x00be), top: B:94:0x0066 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public final CharSequence g(int i, int i2, int i3, CharSequence charSequence) throws Throwable {
        CharSequence charSequence2;
        Throwable th;
        int i4;
        int i5;
        v0t0[] v0t0VarArr;
        int spanStart;
        z1x.y("Not initialized yet", c() == 1);
        let0 let0Var = null;
        if (i < 0) {
            jf4.o("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            jf4.o("end cannot be negative");
            return null;
        }
        z1x.t("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        z1x.t("start should be < than charSequence length", i <= charSequence.length());
        z1x.t("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        boolean z = i3 == 1;
        lhf0 lhf0Var = (lhf0) this.e.b;
        lhf0Var.getClass();
        boolean z2 = charSequence instanceof ymk0;
        if (z2) {
            ((ymk0) charSequence).a();
        }
        if (z2) {
            let0Var = new let0((Spannable) charSequence);
            if (let0Var != null) {
                for (v0t0 v0t0Var : v0t0VarArr) {
                    spanStart = let0Var.b.getSpanStart(v0t0Var);
                    int spanEnd = let0Var.b.getSpanEnd(v0t0Var);
                    if (spanStart != i2) {
                        let0Var.removeSpan(v0t0Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            }
            ((ymk0) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    let0Var = new let0((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((ymk0) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, v0t0.class) <= i2) {
                let0Var = new let0();
                let0Var.f19921a = false;
                let0Var.b = new SpannableString(charSequence);
            }
            if (let0Var != null && (v0t0VarArr = (v0t0[]) let0Var.b.getSpans(i, i2, v0t0.class)) != null && v0t0VarArr.length > 0) {
                while (i < r2) {
                    spanStart = let0Var.b.getSpanStart(v0t0Var);
                    int spanEnd2 = let0Var.b.getSpanEnd(v0t0Var);
                    if (spanStart != i2) {
                        let0Var.removeSpan(v0t0Var);
                    }
                    i = Math.min(spanStart, i);
                    i2 = Math.max(spanEnd2, i2);
                }
            }
            i4 = i;
            i5 = i2;
            if (i4 != i5 || i4 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z2) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                try {
                    let0 let0Var2 = (let0) lhf0Var.E(charSequence2, i4, i5, Integer.MAX_VALUE, z, new jtj((Object) let0Var, lhf0Var.b, (byte) 6));
                    if (let0Var2 != null) {
                        Spannable spannable = let0Var2.b;
                        if (z2) {
                            ((ymk0) charSequence2).b();
                        }
                        return spannable;
                    }
                    if (!z2) {
                        return charSequence2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z2) {
                        throw th;
                    }
                    ((ymk0) charSequence2).b();
                    throw th;
                }
            }
            ((ymk0) charSequence2).b();
            return charSequence2;
        } catch (Throwable th4) {
            th = th4;
            charSequence2 = charSequence;
        }
        if (!z2) {
            throw th;
        }
        ((ymk0) charSequence2).b();
        throw th;
    }

    public final void h(nsn nsnVar) {
        this.f29266a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new osn(Arrays.asList(nsnVar), this.c, null));
            } else {
                this.b.add(nsnVar);
            }
        } finally {
            this.f29266a.writeLock().unlock();
        }
    }

    public final void i(EditorInfo editorInfo) {
        if (c() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        yp2 yp2Var = this.e;
        yp2Var.getClass();
        Bundle bundle = editorInfo.extras;
        od40 od40Var = (od40) ((dgu) yp2Var.c).f6058a;
        int iA = od40Var.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) od40Var.d).getInt(iA + od40Var.f15098a) : 0);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
