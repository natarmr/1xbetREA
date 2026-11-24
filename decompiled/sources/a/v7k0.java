package a;

import android.javax.sip.message.Response;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public abstract class v7k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Size f36930a = new Size(0, 0);
    public static final Size b;
    public static final Size c;
    public static final Size d;
    public static final Size e;
    public static final Size f;

    static {
        new Size(320, 240);
        b = new Size(640, Response.TEMPORARILY_UNAVAILABLE);
        c = new Size(720, Response.TEMPORARILY_UNAVAILABLE);
        d = new Size(1280, 720);
        e = new Size(1920, 1080);
        f = new Size(1920, 1440);
        new Size(2560, 1440);
        new Size(3840, 2160);
    }

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
