package a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class s0t0 extends atm0 {
    public static Font u(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : Response.BAD_REQUEST, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iX = x(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iX2 = x(fontStyle, font2.getStyle());
            if (iX2 < iX) {
                font = font2;
                iX = iX2;
            }
        }
        return font;
    }

    public static int x(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a.atm0
    public final Typeface g(Context context, esq esqVar, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (fsq fsqVar : esqVar.f8342a) {
                try {
                    Font fontBuild = new Font.Builder(resources, fsqVar.f).setWeight(fsqVar.b).setSlant(fsqVar.c ? 1 : 0).setTtcIndex(fsqVar.e).setFontVariationSettings(fsqVar.d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(u(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // a.atm0
    public final Typeface h(Context context, ssq[] ssqVarArr, int i) {
        try {
            FontFamily fontFamilyV = v(ssqVarArr, context.getContentResolver());
            if (fontFamilyV == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyV).setStyle(u(fontFamilyV, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // a.atm0
    public final Typeface i(int i, Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyV = v((ssq[]) list.get(0), contentResolver);
            if (fontFamilyV == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyV);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyV2 = v((ssq[]) list.get(i2), contentResolver);
                if (fontFamilyV2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyV2);
                }
            }
            return customFallbackBuilder.setStyle(u(fontFamilyV, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // a.atm0
    public final Typeface j(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    public final FontFamily v(ssq[] ssqVarArr, ContentResolver contentResolver) {
        Font fontBuild;
        FontFamily.Builder builder = null;
        for (ssq ssqVar : ssqVarArr) {
            if (Objects.equals(ssqVar.f32737a.getScheme(), "systemfont")) {
                fontBuild = w(ssqVar);
            } else {
                try {
                    Uri uri = ssqVar.f32737a;
                    String str = ssqVar.e;
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor == null) {
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        }
                        fontBuild = null;
                    } else {
                        try {
                            Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(ssqVar.c).setSlant(ssqVar.d ? 1 : 0).setTtcIndex(ssqVar.b);
                            if (!TextUtils.isEmpty(str)) {
                                ttcIndex.setFontVariationSettings(str);
                            }
                            fontBuild = ttcIndex.build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th) {
                            try {
                                parcelFileDescriptorOpenFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public Font w(ssq ssqVar) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }
}
