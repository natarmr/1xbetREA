package a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.io.encoding.Base64$PaddingOption;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class qy3 implements oqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29515a;
    public final aot0 b;
    public final a780 c;

    public /* synthetic */ qy3(aot0 aot0Var, a780 a780Var, byte b) {
        this.f29515a = b;
        this.b = aot0Var;
        this.c = a780Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:229:0x051e  */
    /* JADX WARN: Code duplicated, block: B:241:0x059c  */
    @Override // a.oqp
    public final Object a(pyn pynVar) throws XmlPullParserException, IOException {
        String mimeTypeFromExtension;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        List listQ;
        int size;
        Bundle bundle;
        int i;
        byte[] bArr;
        boolean z;
        Object obj;
        char c;
        int i2;
        Integer intOrNull;
        String mimeTypeFromExtension2;
        Drawable drawable;
        byte b = this.f29515a;
        char c2 = 6;
        int i3 = 0;
        aot0 aot0Var = this.b;
        a780 a780Var = this.c;
        String mimeTypeFromExtension3 = null;
        switch (b) {
            case 0:
                String strB0 = CollectionsKt.b0(CollectionsKt.O(dqm0.q(aot0Var), 1), Separators.SLASH, null, null, null, 62);
                imk0 imk0Var = new imk0(new zae0(w9x.L(a780Var.f354a.getAssets().open(strB0))), a780Var.f, new oy3(strB0));
                if (StringsKt.W(strB0)) {
                    mimeTypeFromExtension = null;
                } else {
                    String strS0 = StringsKt.s0(StringsKt.s0(strB0, '#'), '?');
                    String strO0 = StringsKt.o0('.', StringsKt.o0('/', strS0, strS0), "");
                    if (StringsKt.W(strO0)) {
                        mimeTypeFromExtension = null;
                    } else {
                        String lowerCase = strO0.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        mimeTypeFromExtension = (String) ng40.f23468a.get(lowerCase);
                        if (mimeTypeFromExtension == null) {
                            mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase);
                        }
                    }
                }
                return new hmk0(imk0Var, mimeTypeFromExtension, ibj.c);
            case 1:
                Uri uri = Uri.parse(aot0Var.f1219a);
                ContentResolver contentResolver = a780Var.f354a.getContentResolver();
                String str = aot0Var.d;
                if (Intrinsics.d(str, "com.android.contacts") && Intrinsics.d(CollectionsKt.f0(dqm0.q(aot0Var)), "display_photo")) {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        c99.t(uri, "'.", "Unable to find a contact photo associated with '");
                        return null;
                    }
                    return new hmk0(new imk0(new zae0(w9x.L(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), a780Var.f, new xfe(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), ibj.c);
                }
                if (Build.VERSION.SDK_INT < 29 || !Intrinsics.d(str, "media") || (size = (listQ = dqm0.q(aot0Var)).size()) < 3 || !Intrinsics.d(listQ.get(size - 3), "audio") || !Intrinsics.d(listQ.get(size - 2), "albums")) {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                    if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                        c99.t(uri, "'.", "Unable to open '");
                        return null;
                    }
                    return new hmk0(new imk0(new zae0(w9x.L(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), a780Var.f, new xfe(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), ibj.c);
                }
                f7k0 f7k0Var = a780Var.b;
                umk umkVar = f7k0Var.f9062a;
                rmk rmkVar = umkVar instanceof rmk ? (rmk) umkVar : null;
                if (rmkVar != null) {
                    int i4 = rmkVar.f30747a;
                    umk umkVar2 = f7k0Var.b;
                    rmk rmkVar2 = umkVar2 instanceof rmk ? (rmk) umkVar2 : null;
                    if (rmkVar2 != null) {
                        int i5 = rmkVar2.f30747a;
                        bundle = new Bundle(1);
                        bundle.putParcelable("android.content.extra.SIZE", new Point(i4, i5));
                    } else {
                        bundle = null;
                    }
                } else {
                    bundle = null;
                }
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    c99.t(uri, "'.", "Unable to find a music thumbnail associated with '");
                    return null;
                }
                return new hmk0(new imk0(new zae0(w9x.L(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), a780Var.f, new xfe(assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uri), ibj.c);
            case 2:
                String str2 = aot0Var.f1219a;
                int iV = StringsKt.V(str2, ";base64,", 0, false, 6);
                if (iV == -1) {
                    hny.t(aot0Var, "invalid data uri: ");
                    return null;
                }
                int iU = StringsKt.U(':', 0, 6, str2);
                if (iU == -1) {
                    hny.t(aot0Var, "invalid data uri: ");
                    return null;
                }
                String strSubstring = str2.substring(iU + 1, iV);
                cv5 cv5Var = dv5.c;
                int i6 = iV + 8;
                int length = str2.length();
                cv5Var.getClass();
                boolean z2 = cv5Var.b;
                int length2 = str2.length();
                x2 x2Var = b3.f1878a;
                x2Var.getClass();
                x2.a(i6, length, length2);
                byte[] bytes = str2.substring(i6, length).getBytes(Charsets.d);
                bytes.getClass();
                int length3 = bytes.length;
                int length4 = bytes.length;
                x2Var.getClass();
                x2.a(0, length3, length4);
                int i7 = -2;
                if (length3 != 0) {
                    if (length3 == 1) {
                        jf4.o(twn.m(length3, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                        return null;
                    }
                    if (z2) {
                        i = length3;
                        int i8 = 0;
                        while (true) {
                            char c3 = c2;
                            if (i8 < length3) {
                                int i9 = fv5.f10198a[bytes[i8] & 255];
                                if (i9 < 0) {
                                    if (i9 == -2) {
                                        i -= length3 - i8;
                                    } else {
                                        i--;
                                    }
                                }
                                i8++;
                                c2 = c3;
                            }
                        }
                    } else if (bytes[length3 - 1] == 61) {
                        i = length3 - 1;
                        if (bytes[length3 - 2] == 61) {
                            i = length3 - 2;
                        }
                    } else {
                        i = length3;
                    }
                    i3 = (int) ((((long) i) * 6) / 8);
                }
                byte[] bArr2 = new byte[i3];
                int[] iArr = cv5Var.f6729a ? fv5.b : fv5.f10198a;
                int i10 = -8;
                int i11 = -8;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    if (i12 < length3) {
                        if (i11 != i10 || (i2 = i12 + 3) >= length3) {
                            bArr = bytes;
                        } else {
                            bArr = bytes;
                            int i15 = i12 + 4;
                            int i16 = (iArr[bArr[i12 + 2] & 255] << 6) | (iArr[bytes[i12 + 1] & 255] << 12) | (iArr[bytes[i12] & 255] << 18) | iArr[bArr[i2] & 255];
                            if (i16 >= 0) {
                                bArr2[i13] = (byte) (i16 >> 16);
                                int i17 = i13 + 2;
                                bArr2[i13 + 1] = (byte) (i16 >> 8);
                                i13 += 3;
                                bArr2[i17] = (byte) i16;
                                bytes = bArr;
                                i12 = i15;
                            }
                            i7 = -2;
                            i10 = -8;
                        }
                        int i18 = bArr[i12] & 255;
                        int i19 = iArr[i18];
                        if (i19 < 0) {
                            if (i19 != -2) {
                                c = '=';
                                if (z2) {
                                    i12++;
                                } else {
                                    StringBuilder sb = new StringBuilder("Invalid symbol '");
                                    sb.append((char) i18);
                                    sb.append("'(");
                                    String string = Integer.toString(i18, CharsKt.checkRadix(8));
                                    string.getClass();
                                    sb.append(string);
                                    jf4.o(b1j.h(i12, ") at index ", sb));
                                }
                            } else if (i11 != -8) {
                                if (i11 == -6) {
                                    Base64$PaddingOption[] base64$PaddingOptionArr = Base64$PaddingOption.f46067a;
                                } else if (i11 == -4) {
                                    Base64$PaddingOption[] base64$PaddingOptionArr2 = Base64$PaddingOption.f46067a;
                                    int i20 = i12 + 1;
                                    if (z2 != 0) {
                                        while (i20 < length3) {
                                            if (fv5.f10198a[bArr[i20] & 255] == -1) {
                                                i20++;
                                            }
                                        }
                                    }
                                    if (i20 == length3 || bArr[i20] != 61) {
                                        jf4.o(twn.m(i20, "Missing one pad character at index "));
                                    } else {
                                        i12 = i20 + 1;
                                        z = true;
                                        i7 = -2;
                                    }
                                } else if (i11 != -2) {
                                    jf4.n("Unreachable");
                                }
                                i12++;
                                z = true;
                                i7 = -2;
                            } else {
                                jf4.o(twn.m(i12, "Redundant pad character at index "));
                            }
                            return null;
                        }
                        c = '=';
                        i12++;
                        i14 = (i14 << 6) | i19;
                        int i21 = i11 + 6;
                        if (i21 >= 0) {
                            bArr2[i13] = (byte) (i14 >>> i21);
                            i14 &= (1 << i21) - 1;
                            i11 -= 2;
                            i13++;
                        } else {
                            i11 = i21;
                        }
                        bytes = bArr;
                        i7 = -2;
                        i10 = -8;
                    } else {
                        bArr = bytes;
                        z = false;
                    }
                }
                if (i11 == i7) {
                    obj = null;
                    jf4.o("The last unit of input does not have enough bits");
                } else {
                    if (i11 != -8 && !z) {
                        Base64$PaddingOption[] base64$PaddingOptionArr3 = Base64$PaddingOption.f46067a;
                        jf4.o("The padding option is set to PRESENT, but the input is not properly padded");
                        return null;
                    }
                    if (i14 == 0) {
                        if (z2 != 0) {
                            while (i12 < length3) {
                                if (fv5.f10198a[bArr[i12] & 255] == -1) {
                                    i12++;
                                }
                            }
                        }
                        if (i12 < length3) {
                            int i22 = bArr[i12] & 255;
                            char c4 = (char) i22;
                            String string2 = Integer.toString(i22, CharsKt.checkRadix(8));
                            string2.getClass();
                            StringBuilder sb2 = new StringBuilder("Symbol '");
                            sb2.append(c4);
                            sb2.append("'(");
                            sb2.append(string2);
                            sb2.append(") at index ");
                            sb2.append(i12 - 1);
                            sb2.append(" is prohibited after the pad character");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        if (i13 == i3) {
                            f99 f99Var = new f99();
                            f99Var.U(bArr2, i3);
                            return new hmk0(new imk0(f99Var, a780Var.f, null), strSubstring, ibj.b);
                        }
                        obj = null;
                        jf4.n("Check failed.");
                    } else {
                        obj = null;
                        jf4.o("The pad bits must be zeros");
                    }
                }
                return obj;
            case 3:
                String str3 = y190.b;
                String strP = dqm0.p(aot0Var);
                if (strP == null) {
                    jf4.n("filePath == null");
                    return null;
                }
                y190 y190VarB = rl70.b(strP);
                izp izpVarB = z1x.b(y190VarB, a780Var.f, null, null, 28);
                String strO1 = StringsKt.o0('.', y190VarB.b(), "");
                if (!StringsKt.W(strO1)) {
                    String lowerCase2 = strO1.toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    mimeTypeFromExtension3 = (String) ng40.f23468a.get(lowerCase2);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase2);
                    }
                }
                return new hmk0(izpVarB, mimeTypeFromExtension3, ibj.c);
            case 4:
                String str4 = aot0Var.e;
                if (str4 == null) {
                    str4 = "";
                }
                int iU2 = StringsKt.U('!', 0, 6, str4);
                if (iU2 == -1) {
                    hny.t(aot0Var, "Invalid jar:file URI: ");
                    return null;
                }
                String str5 = y190.b;
                y190 y190VarB2 = rl70.b(str4.substring(0, iU2));
                y190 y190VarB3 = rl70.b(str4.substring(iU2 + 1, str4.length()));
                yzp yzpVar = a780Var.f;
                yzpVar.getClass();
                izp izpVarB2 = z1x.b(y190VarB3, s7n0.t(y190VarB2, yzpVar, new ejv0((byte) 22)), null, null, 28);
                String strO2 = StringsKt.o0('.', y190VarB3.b(), "");
                if (!StringsKt.W(strO2)) {
                    String lowerCase3 = strO2.toLowerCase(Locale.ROOT);
                    lowerCase3.getClass();
                    mimeTypeFromExtension3 = (String) ng40.f23468a.get(lowerCase3);
                    if (mimeTypeFromExtension3 == null) {
                        mimeTypeFromExtension3 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase3);
                    }
                }
                return new hmk0(izpVarB2, mimeTypeFromExtension3, ibj.c);
            default:
                String str6 = aot0Var.d;
                if (str6 != null) {
                    if (StringsKt.W(str6)) {
                        str6 = null;
                    }
                    if (str6 != null) {
                        String str7 = (String) CollectionsKt.f0(dqm0.q(aot0Var));
                        if (str7 == null || (intOrNull = StringsKt.toIntOrNull(str7)) == null) {
                            e9d0.v(aot0Var, "Invalid android.resource URI: ");
                            return null;
                        }
                        int iIntValue = intOrNull.intValue();
                        Context context = a780Var.f354a;
                        Resources resources = str6.equals(context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(str6);
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(iIntValue, typedValue, true);
                        String string3 = typedValue.string.toString();
                        if (StringsKt.W(string3)) {
                            mimeTypeFromExtension2 = null;
                        } else {
                            String strS1 = StringsKt.s0(StringsKt.s0(string3, '#'), '?');
                            String strO3 = StringsKt.o0('.', StringsKt.o0('/', strS1, strS1), "");
                            if (StringsKt.W(strO3)) {
                                mimeTypeFromExtension2 = null;
                            } else {
                                String lowerCase4 = strO3.toLowerCase(Locale.ROOT);
                                lowerCase4.getClass();
                                mimeTypeFromExtension2 = (String) ng40.f23468a.get(lowerCase4);
                                if (mimeTypeFromExtension2 == null) {
                                    mimeTypeFromExtension2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase4);
                                }
                            }
                        }
                        if (!Intrinsics.d(mimeTypeFromExtension2, "text/xml")) {
                            return new hmk0(new imk0(new zae0(w9x.L(resources.openRawResource(iIntValue, new TypedValue()))), a780Var.f, new etf0(str6, iIntValue)), mimeTypeFromExtension2, ibj.c);
                        }
                        if (str6.equals(context.getPackageName())) {
                            drawable = vtb.V(iIntValue, context);
                        } else {
                            XmlResourceParser xml = resources.getXml(iIntValue);
                            int next = xml.next();
                            while (next != 2 && next != 1) {
                                next = xml.next();
                            }
                            if (next != 2) {
                                throw new XmlPullParserException("No start tag found.");
                            }
                            Resources.Theme theme = context.getTheme();
                            ThreadLocal threadLocal = itf0.f15351a;
                            drawable = resources.getDrawable(iIntValue, theme);
                            if (drawable == null) {
                                c99.v(twn.m(iIntValue, "Invalid resource ID: "));
                                return null;
                            }
                        }
                        Drawable bitmapDrawable = drawable;
                        Bitmap.Config[] configArr = lut0.f20691a;
                        boolean z3 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof n4u0);
                        if (z3) {
                            bitmapDrawable = new BitmapDrawable(context.getResources(), vic.u(bitmapDrawable, (Bitmap.Config) qbc.Q(a780Var, t1x.b), a780Var.b, a780Var.c, (f7k0) qbc.Q(a780Var, q1x.b), a780Var.d == asb0.b));
                        }
                        return new wzw(c3x.r(bitmapDrawable), z3, ibj.c);
                    }
                }
                e9d0.v(aot0Var, "Invalid android.resource URI: ");
                return null;
        }
    }
}
