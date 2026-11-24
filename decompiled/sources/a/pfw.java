package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class pfw {
    public static final pfw c;
    public static final pfw d;
    public static final pfw e;
    public static final pfw f;
    public static final pfw g;
    public static final pfw h;
    public static final pfw i;
    public static final pfw j;
    public static final pfw k;
    public static final pfw l;
    public static final pfw m;
    public static final pfw n;
    public static final pfw o;
    public static final Object p = new Object();
    public static volatile wcf0 q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26924a;
    public final String b;

    static {
        byte b = 0;
        c = new pfw("TINK", b);
        d = new pfw("CRUNCHY", b);
        e = new pfw("LEGACY", b);
        f = new pfw("NO_PREFIX", b);
        byte b2 = 1;
        g = new pfw("ENABLED", b2);
        h = new pfw("DISABLED", b2);
        i = new pfw("DESTROYED", b2);
        byte b3 = 2;
        j = new pfw("ASSUME_AES_GCM", b3);
        k = new pfw("ASSUME_XCHACHA20POLY1305", b3);
        l = new pfw("ASSUME_CHACHA20POLY1305", b3);
        m = new pfw("ASSUME_AES_CTR_HMAC", b3);
        n = new pfw("ASSUME_AES_EAX", b3);
        o = new pfw("ASSUME_AES_GCM_SIV", b3);
    }

    public pfw(Context context, z6x0 z6x0Var) {
        this.f26924a = (byte) 3;
        this.b = z6x0Var.s() ? z0x0.b(context, z6x0Var.r()) : z6x0Var.r();
    }

    public static CharSequence c(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(c(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    sb.append(c(it.next()));
                }
            }
        } catch (IOException e2) {
            c99.l(e2);
        }
    }

    public String b(List list) {
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        a(sb, it);
        return sb.toString();
    }

    public String toString() {
        byte b = this.f26924a;
        String str = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 5:
                return str;
            case 3:
            case 4:
            default:
                return super.toString();
            case 6:
                return axq.m(new StringBuilder(Separators.LESS_THAN), str, '>');
        }
    }

    public /* synthetic */ pfw(String str, byte b) {
        this.f26924a = b;
        this.b = str;
    }

    public pfw(String str) {
        this.f26924a = (byte) 4;
        str.getClass();
        this.b = str;
    }
}
