package a;

import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class knn0 implements fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final knn0 f18595a = new knn0();

    public final yzn0 a(u99 u99Var) {
        InputStream inputStreamA1 = u99Var.a1();
        osg0 osg0Var = new osg0();
        osg0Var.f25781a = null;
        osg0Var.b = null;
        osg0Var.c = false;
        osg0Var.e = false;
        osg0Var.f = null;
        osg0Var.g = null;
        osg0Var.h = false;
        osg0Var.i = null;
        if (!inputStreamA1.markSupported()) {
            inputStreamA1 = new BufferedInputStream(inputStreamA1);
        }
        try {
            inputStreamA1.mark(3);
            int i = inputStreamA1.read() + (inputStreamA1.read() << 8);
            inputStreamA1.reset();
            if (i == 35615) {
                inputStreamA1 = new BufferedInputStream(new GZIPInputStream(inputStreamA1));
            }
        } catch (IOException unused) {
        }
        try {
            inputStreamA1.mark(4096);
            osg0Var.B(inputStreamA1);
            try {
                inputStreamA1.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
            cyu cyuVar = osg0Var.f25781a;
            yzn0 yzn0Var = new yzn0();
            yzn0Var.f43523a = cyuVar;
            return yzn0Var;
        } catch (Throwable th) {
            try {
                inputStreamA1.close();
            } catch (IOException unused3) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
            throw th;
        }
    }

    @Override // a.fer
    public final wdr b() {
        return new rer(1, gq80.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof knn0) && (obj instanceof fer)) {
            return b().equals(((fer) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
