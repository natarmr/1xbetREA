package a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sd9 implements tdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32022a;

    public /* synthetic */ sd9(byte b) {
        this.f32022a = b;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x034b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0352  */
    /* JADX WARN: Code duplicated, block: B:104:0x035c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0364  */
    /* JADX WARN: Code duplicated, block: B:107:0x0371  */
    /* JADX WARN: Code duplicated, block: B:110:0x037d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0384  */
    /* JADX WARN: Code duplicated, block: B:114:0x038e  */
    /* JADX WARN: Code duplicated, block: B:117:0x039c  */
    /* JADX WARN: Code duplicated, block: B:119:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:122:0x03af  */
    /* JADX WARN: Code duplicated, block: B:123:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:126:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:129:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:131:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:134:0x03db  */
    /* JADX WARN: Code duplicated, block: B:86:0x0308  */
    /* JADX WARN: Code duplicated, block: B:88:0x0310  */
    /* JADX WARN: Code duplicated, block: B:89:0x031d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0329  */
    /* JADX WARN: Code duplicated, block: B:93:0x0330  */
    /* JADX WARN: Code duplicated, block: B:96:0x033a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0341  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // a.tdr
    public final Object apply(Object obj) {
        ?? r13;
        Bitmap bitmapDecodeByteArray;
        String str;
        float f;
        int i;
        String str2;
        int i2;
        String str3;
        float f2;
        String str4;
        int i3;
        String str5;
        float f3;
        int i4;
        String str6;
        float f4;
        String str7;
        int i5;
        boolean z;
        String str8;
        float f5;
        String str9;
        String str10;
        int i6 = 3;
        boolean z2 = true;
        byte b = 11;
        switch (this.f32022a) {
            case 0:
                return ((fuo) obj).d().getClass().getSimpleName();
            case 1:
                Bundle bundle = (Bundle) obj;
                ?? charSequence = bundle.getCharSequence(ctf.s);
                if (charSequence != 0) {
                    ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(ctf.t);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        for (Bundle bundle2 : parcelableArrayList) {
                            int i7 = bundle2.getInt(cyf.f5170a);
                            int i8 = bundle2.getInt(cyf.b);
                            int i9 = bundle2.getInt(cyf.c);
                            int i10 = bundle2.getInt(cyf.d, -1);
                            Bundle bundle3 = bundle2.getBundle(cyf.e);
                            if (i10 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(wkg0.c);
                                string.getClass();
                                charSequence.setSpan(new wkg0(string, bundle3.getInt(wkg0.d)), i7, i8, i9);
                            } else if (i10 == 2) {
                                bundle3.getClass();
                                charSequence.setSpan(new t5q0(bundle3.getInt(t5q0.d), bundle3.getInt(t5q0.e), bundle3.getInt(t5q0.f)), i7, i8, i9);
                            } else if (i10 == i6) {
                                charSequence.setSpan(new bmw(), i7, i8, i9);
                            } else if (i10 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(dvu0.b);
                                string2.getClass();
                                charSequence.setSpan(new dvu0(string2), i7, i8, i9);
                            }
                            i6 = 3;
                        }
                    }
                } else {
                    charSequence = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(ctf.u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(ctf.v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(ctf.w);
                if (bitmap == null) {
                    byte[] byteArray = bundle.getByteArray(ctf.x);
                    if (byteArray != null) {
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    } else {
                        r13 = charSequence;
                        bitmapDecodeByteArray = null;
                    }
                    str = ctf.y;
                    if (bundle.containsKey(str)) {
                        str10 = ctf.z;
                        if (bundle.containsKey(str10)) {
                            f = bundle.getFloat(str);
                            i = bundle.getInt(str10);
                        } else {
                            f = -3.4028235E38f;
                            i = Integer.MIN_VALUE;
                        }
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                    str2 = ctf.A;
                    if (bundle.containsKey(str2)) {
                        i2 = bundle.getInt(str2);
                    } else {
                        i2 = Integer.MIN_VALUE;
                    }
                    str3 = ctf.B;
                    if (bundle.containsKey(str3)) {
                        f2 = bundle.getFloat(str3);
                    } else {
                        f2 = -3.4028235E38f;
                    }
                    str4 = ctf.C;
                    if (bundle.containsKey(str4)) {
                        i3 = bundle.getInt(str4);
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    str5 = ctf.E;
                    if (bundle.containsKey(str5)) {
                        str9 = ctf.D;
                        if (bundle.containsKey(str9)) {
                            f3 = bundle.getFloat(str5);
                            i4 = bundle.getInt(str9);
                        } else {
                            f3 = -3.4028235E38f;
                            i4 = Integer.MIN_VALUE;
                        }
                    } else {
                        f3 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                    }
                    str6 = ctf.F;
                    if (bundle.containsKey(str6)) {
                        f4 = bundle.getFloat(str6);
                    } else {
                        f4 = -3.4028235E38f;
                    }
                    String str11 = ctf.G;
                    float f6 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                    str7 = ctf.H;
                    if (bundle.containsKey(str7)) {
                        i5 = bundle.getInt(str7);
                    } else {
                        i5 = -16777216;
                        z2 = false;
                    }
                    int i11 = i5;
                    if (bundle.getBoolean(ctf.I, false)) {
                        z = z2;
                    } else {
                        z = false;
                    }
                    String str12 = ctf.J;
                    int i12 = bundle.containsKey(str12) ? bundle.getInt(str12) : Integer.MIN_VALUE;
                    str8 = ctf.K;
                    if (bundle.containsKey(str8)) {
                        f5 = bundle.getFloat(str8);
                    } else {
                        f5 = 0.0f;
                    }
                    float f7 = f5;
                    String str13 = ctf.L;
                    return new ctf(r13, alignment2, alignment4, bitmapDecodeByteArray, f, i, i2, f2, i3, i4, f3, f4, f6, z, i11, i12, f7, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                }
                bitmapDecodeByteArray = bitmap;
                r13 = 0;
                str = ctf.y;
                if (bundle.containsKey(str)) {
                    str10 = ctf.z;
                    if (bundle.containsKey(str10)) {
                        f = bundle.getFloat(str);
                        i = bundle.getInt(str10);
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                str2 = ctf.A;
                if (bundle.containsKey(str2)) {
                    i2 = bundle.getInt(str2);
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                str3 = ctf.B;
                if (bundle.containsKey(str3)) {
                    f2 = bundle.getFloat(str3);
                } else {
                    f2 = -3.4028235E38f;
                }
                str4 = ctf.C;
                if (bundle.containsKey(str4)) {
                    i3 = bundle.getInt(str4);
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                str5 = ctf.E;
                if (bundle.containsKey(str5)) {
                    str9 = ctf.D;
                    if (bundle.containsKey(str9)) {
                        f3 = bundle.getFloat(str5);
                        i4 = bundle.getInt(str9);
                    } else {
                        f3 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                    }
                } else {
                    f3 = -3.4028235E38f;
                    i4 = Integer.MIN_VALUE;
                }
                str6 = ctf.F;
                if (bundle.containsKey(str6)) {
                    f4 = bundle.getFloat(str6);
                } else {
                    f4 = -3.4028235E38f;
                }
                String str14 = ctf.G;
                float f8 = bundle.containsKey(str14) ? bundle.getFloat(str14) : -3.4028235E38f;
                str7 = ctf.H;
                if (bundle.containsKey(str7)) {
                    i5 = bundle.getInt(str7);
                } else {
                    i5 = -16777216;
                    z2 = false;
                }
                int i13 = i5;
                if (bundle.getBoolean(ctf.I, false)) {
                    z = false;
                } else {
                    z = z2;
                }
                String str15 = ctf.J;
                int i14 = bundle.containsKey(str15) ? bundle.getInt(str15) : Integer.MIN_VALUE;
                str8 = ctf.K;
                if (bundle.containsKey(str8)) {
                    f5 = bundle.getFloat(str8);
                } else {
                    f5 = 0.0f;
                }
                float f9 = f5;
                String str16 = ctf.L;
                return new ctf(r13, alignment2, alignment4, bitmapDecodeByteArray, f, i, i2, f2, i3, i4, f3, f4, f8, z, i13, i14, f9, bundle.containsKey(str16) ? bundle.getInt(str16) : 0);
            case 2:
                ctf ctfVar = (ctf) obj;
                Bitmap bitmap2 = ctfVar.d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = ctfVar.f4933a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(ctf.s, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str17 = cyf.f5170a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (wkg0 wkg0Var : (wkg0[]) spanned.getSpans(0, spanned.length(), wkg0.class)) {
                            wkg0Var.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(wkg0.c, wkg0Var.f39307a);
                            bundle5.putInt(wkg0.d, wkg0Var.b);
                            arrayList.add(cyf.a(spanned, wkg0Var, 1, bundle5));
                        }
                        for (t5q0 t5q0Var : (t5q0[]) spanned.getSpans(0, spanned.length(), t5q0.class)) {
                            t5q0Var.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(t5q0.d, t5q0Var.f33381a);
                            bundle6.putInt(t5q0.e, t5q0Var.b);
                            bundle6.putInt(t5q0.f, t5q0Var.c);
                            arrayList.add(cyf.a(spanned, t5q0Var, 2, bundle6));
                        }
                        for (bmw bmwVar : (bmw[]) spanned.getSpans(0, spanned.length(), bmw.class)) {
                            arrayList.add(cyf.a(spanned, bmwVar, 3, null));
                        }
                        for (dvu0 dvu0Var : (dvu0[]) spanned.getSpans(0, spanned.length(), dvu0.class)) {
                            dvu0Var.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(dvu0.b, dvu0Var.f6762a);
                            arrayList.add(cyf.a(spanned, dvu0Var, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(ctf.t, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(ctf.u, ctfVar.b);
                bundle4.putSerializable(ctf.v, ctfVar.c);
                bundle4.putFloat(ctf.y, ctfVar.e);
                bundle4.putInt(ctf.z, ctfVar.f);
                bundle4.putInt(ctf.A, ctfVar.g);
                bundle4.putFloat(ctf.B, ctfVar.h);
                bundle4.putInt(ctf.C, ctfVar.i);
                bundle4.putInt(ctf.D, ctfVar.n);
                bundle4.putFloat(ctf.E, ctfVar.o);
                bundle4.putFloat(ctf.F, ctfVar.j);
                bundle4.putFloat(ctf.G, ctfVar.k);
                bundle4.putBoolean(ctf.I, ctfVar.l);
                bundle4.putInt(ctf.H, ctfVar.m);
                bundle4.putInt(ctf.J, ctfVar.p);
                bundle4.putFloat(ctf.K, ctfVar.q);
                bundle4.putInt(ctf.L, ctfVar.r);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    x0x.K(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(ctf.x, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            case 3:
                return Integer.valueOf(((ctf) obj).r);
            case 4:
                long j = ((ftf) obj).b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 5:
                return new fsj((l9o0) obj);
            case 6:
                uty utyVar = (uty) obj;
                return utyVar.f36277a + ": " + utyVar.b;
            case 7:
                ybw ybwVar = (ybw) obj;
                ybwVar.x();
                return b4x.o(x0x.j0(ybwVar.j1.b, new sd9(b)));
            case 8:
                return Long.valueOf(((ftf) obj).b);
            case 9:
                return Long.valueOf(((ftf) obj).c);
            case 10:
                return b4x.o(x0x.j0(((mn30) obj).p().b, new sd9(b)));
            default:
                return Integer.valueOf(((ccs0) obj).c);
        }
    }
}
