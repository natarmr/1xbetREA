package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class itf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f15351a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(int i, Context context) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, xvw xvwVar, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            dj10 dj10Var = m0t0.b;
            Typeface typeface = (Typeface) dj10Var.c(m0t0.b(resources, i, string, i3, i2));
            byte b2 = 15;
            if (typeface != null) {
                if (xvwVar != null) {
                    new Handler(Looper.getMainLooper()).post(new oh60(xvwVar, typeface, b2));
                }
                typefaceA = typeface;
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        dsq dsqVarK = u1c.K(resources.getXml(i), resources);
                        if (dsqVarK == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (xvwVar != null) {
                                xvwVar.A(-3);
                            }
                        } else {
                            typefaceA = m0t0.a(context, dsqVarK, resources, i, string, typedValue.assetCookie, i2, xvwVar, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        Typeface typefaceJ = m0t0.f20972a.j(context, resources, i, string, i2);
                        if (typefaceJ != null) {
                            dj10Var.d(m0t0.b(resources, i, string, i4, i2), typefaceJ);
                        }
                        if (xvwVar != null) {
                            if (typefaceJ != null) {
                                new Handler(Looper.getMainLooper()).post(new oh60(xvwVar, typefaceJ, b2));
                            } else {
                                xvwVar.A(-3);
                            }
                        }
                        typefaceA = typefaceJ;
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (xvwVar != null) {
                        xvwVar.A(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (xvwVar != null) {
                        xvwVar.A(-3);
                    }
                }
            }
        } else if (xvwVar != null) {
            xvwVar.A(-3);
        }
        if (typefaceA != null || xvwVar != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
