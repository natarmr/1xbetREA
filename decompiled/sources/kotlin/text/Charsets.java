package kotlin.text;

import java.nio.charset.Charset;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/text/Charsets;", "", "Ljava/nio/charset/Charset;", "UTF_8", "Ljava/nio/charset/Charset;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class Charsets {
    public static final Charset UTF_8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charsets f46070a = new Charsets();
    public static final Charset b;
    public static final Charset c;
    public static final Charset d;
    public static volatile Charset e;
    public static volatile Charset f;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        charsetForName.getClass();
        UTF_8 = charsetForName;
        Charset.forName("UTF-16").getClass();
        Charset charsetForName2 = Charset.forName("UTF-16BE");
        charsetForName2.getClass();
        b = charsetForName2;
        Charset charsetForName3 = Charset.forName("UTF-16LE");
        charsetForName3.getClass();
        c = charsetForName3;
        Charset.forName("US-ASCII").getClass();
        Charset charsetForName4 = Charset.forName("ISO-8859-1");
        charsetForName4.getClass();
        d = charsetForName4;
    }
}
