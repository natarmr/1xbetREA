package a;

import android.gov.nist.core.Separators;
import android.hardware.Camera;
import android.media.MediaDrm;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class vut0 extends guy implements Function0 {
    public static final vut0 b;
    public static final vut0 c;
    public static final vut0 d;
    public static final vut0 e;
    public static final vut0 f;
    public static final vut0 g;
    public static final vut0 h;
    public static final vut0 i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38066a;

    static {
        int i2 = 0;
        b = new vut0(i2, (byte) 0);
        c = new vut0(i2, (byte) 1);
        d = new vut0(i2, (byte) 2);
        e = new vut0(i2, (byte) 3);
        f = new vut0(i2, (byte) 4);
        g = new vut0(i2, (byte) 5);
        h = new vut0(i2, (byte) 6);
        i = new vut0(i2, (byte) 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vut0(Object obj, byte b2) {
        super(0);
        this.f38066a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:223:0x0477 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:224:0x0479  */
    /* JADX WARN: Code duplicated, block: B:225:0x047b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0486  */
    /* JADX WARN: Code duplicated, block: B:229:0x0488  */
    /* JADX WARN: Code duplicated, block: B:236:0x0495 A[Catch: all -> 0x045c, TryCatch #1 {all -> 0x045c, blocks: (B:199:0x040e, B:201:0x0414, B:203:0x042c, B:208:0x0440, B:215:0x0453, B:218:0x0459, B:221:0x045e, B:226:0x047c, B:233:0x048f, B:236:0x0495, B:237:0x0498), top: B:270:0x040e }] */
    /* JADX WARN: Code duplicated, block: B:343:0x0492 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x048f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:346:0x048d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:347:0x048b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:0x0494 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchAlgorithmException {
        String str;
        int length;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        Pair pair;
        String strSubstring;
        String strSubstring2;
        byte b2 = 1;
        switch (this.f38066a) {
            case 0:
                return "api.vk.com";
            case 1:
                return "en";
            case 2:
                return "https://api.vk.com/method";
            case 3:
            case 4:
                return null;
            case 5:
                return new Handler(Looper.getMainLooper());
            case 6:
                return Executors.newFixedThreadPool(32, new stt0(b2));
            case 7:
                return new StringBuilder();
            case 8:
                int numberOfCameras = Camera.getNumberOfCameras();
                LinkedList linkedList = new LinkedList();
                for (int i4 = 0; i4 < numberOfCameras; i4++) {
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    Camera.getCameraInfo(i4, cameraInfo);
                    int i5 = cameraInfo.facing;
                    linkedList.add(new i0a(String.valueOf(i4), i5 != 0 ? i5 != 1 ? "" : "front" : "back", String.valueOf(cameraInfo.orientation)));
                }
                return linkedList;
            case 9:
                HashMap map = new HashMap();
                Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
                while (scanner.hasNextLine()) {
                    try {
                        String strNextLine = scanner.nextLine();
                        strNextLine.getClass();
                        List listSplit$default = StringsKt__StringsKt.split$default(strNextLine, new String[]{": "}, false, 0, 6, null);
                        if (listSplit$default.size() > 1) {
                            String str2 = (String) listSplit$default.get(0);
                            int length2 = str2.length() - 1;
                            int i6 = 0;
                            boolean z3 = false;
                            while (i6 <= length2) {
                                boolean z4 = Intrinsics.e(str2.charAt(!z3 ? i6 : length2), 32) <= 0;
                                if (z3) {
                                    if (z4) {
                                        length2--;
                                    } else {
                                        String string = str2.subSequence(i6, length2 + 1).toString();
                                        str = (String) listSplit$default.get(1);
                                        length = str.length() - 1;
                                        i2 = 0;
                                        z = false;
                                        while (i2 <= length) {
                                            if (z) {
                                                i3 = length;
                                            } else {
                                                i3 = i2;
                                            }
                                            if (Intrinsics.e(str.charAt(i3), 32) <= 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z) {
                                                if (z2) {
                                                    length--;
                                                } else {
                                                    map.put(string, str.subSequence(i2, length + 1).toString());
                                                }
                                            } else if (z2) {
                                                i2++;
                                            } else {
                                                z = true;
                                            }
                                        }
                                        map.put(string, str.subSequence(i2, length + 1).toString());
                                    }
                                } else if (z4) {
                                    i6++;
                                } else {
                                    z3 = true;
                                }
                            }
                            String string2 = str2.subSequence(i6, length2 + 1).toString();
                            str = (String) listSplit$default.get(1);
                            length = str.length() - 1;
                            i2 = 0;
                            z = false;
                            while (i2 <= length) {
                                if (z) {
                                    i3 = i2;
                                } else {
                                    i3 = length;
                                }
                                if (Intrinsics.e(str.charAt(i3), 32) <= 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z) {
                                    if (z2) {
                                        z = true;
                                    } else {
                                        i2++;
                                    }
                                } else if (z2) {
                                    map.put(string2, str.subSequence(i2, length + 1).toString());
                                } else {
                                    length--;
                                }
                            }
                            map.put(string2, str.subSequence(i2, length + 1).toString());
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            bkb.E(scanner, th);
                            throw th2;
                        }
                    }
                }
                scanner.close();
                return map;
            case 10:
                ArrayList arrayListQ0 = CollectionsKt.q0(CollectionsKt.q0(kotlin.collections.a.c(""), StringsKt.Z(i0q.b(new File("/proc/cpuinfo")))), kotlin.collections.a.c(""));
                ArrayList arrayList = new ArrayList(r3d.q(arrayListQ0, 10));
                int i7 = 0;
                for (Object obj : arrayListQ0) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        q3d.p();
                        throw null;
                    }
                    arrayList.add(new Pair((String) obj, Integer.valueOf(i7)));
                    i7 = i8;
                }
                ArrayList arrayListS = CollectionsKt.S(CollectionsKt.R0(arrayList, 2, 1, false, fpd.o));
                ArrayList arrayList2 = new ArrayList();
                int i9 = 0;
                for (Object obj2 : arrayListQ0) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        q3d.p();
                        throw null;
                    }
                    if (!arrayListS.contains(Integer.valueOf(i9))) {
                        arrayList2.add(obj2);
                    }
                    i9 = i10;
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                int i11 = 0;
                for (Object obj3 : arrayList2) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        q3d.p();
                        throw null;
                    }
                    Integer numValueOf = Integer.valueOf(i11);
                    if (!StringsKt.W((String) obj3)) {
                        numValueOf = null;
                    }
                    arrayList3.add(numValueOf);
                    i11 = i12;
                }
                ArrayList<List> arrayListR0 = CollectionsKt.R0(CollectionsKt.S(arrayList3), 2, 1, false, new r53(arrayList2, b2));
                ArrayList arrayList4 = new ArrayList(r3d.q(arrayListR0, 10));
                for (List list : arrayListR0) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        List<String> listSplit$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{Separators.COLON}, false, 2, 2, null);
                        if (listSplit$default2.size() != 2) {
                            listSplit$default2 = null;
                        }
                        if (listSplit$default2 != null) {
                            ArrayList arrayList6 = new ArrayList(r3d.q(listSplit$default2, 10));
                            for (String str3 : listSplit$default2) {
                                int length3 = str3.length();
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length3) {
                                        strSubstring = "";
                                    } else if (CharsKt.d(str3.charAt(i13))) {
                                        i13++;
                                    } else {
                                        strSubstring = str3.substring(i13);
                                    }
                                }
                                int length4 = strSubstring.length() - 1;
                                while (true) {
                                    if (-1 >= length4) {
                                        strSubstring2 = "";
                                    }
                                    if (!CharsKt.d(strSubstring.charAt(length4))) {
                                        strSubstring2 = strSubstring.substring(0, length4 + 1);
                                    }
                                    length4--;
                                    break;
                                    break;
                                }
                                arrayList6.add(strSubstring2);
                            }
                            pair = new Pair(arrayList6.get(0), arrayList6.get(1));
                        } else {
                            pair = null;
                        }
                        if (pair != null) {
                            arrayList5.add(pair);
                        }
                    }
                    arrayList4.add(arrayList5);
                }
                ArrayList<List> arrayList7 = new ArrayList();
                for (Object obj4 : arrayList4) {
                    if (!((List) obj4).isEmpty()) {
                        arrayList7.add(obj4);
                    }
                }
                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                for (List list2 : arrayList7) {
                    ArrayList arrayList9 = new ArrayList();
                    boolean z5 = false;
                    for (Object obj5 : list2) {
                        if (z5) {
                            arrayList9.add(obj5);
                        } else if (bkb.d0((Pair) obj5)) {
                            arrayList9.add(obj5);
                            z5 = true;
                        }
                    }
                    arrayList8.add(arrayList9);
                }
                ArrayList<List> arrayList10 = new ArrayList();
                for (Object obj6 : arrayList8) {
                    if (!((List) obj6).isEmpty()) {
                        arrayList10.add(obj6);
                    }
                }
                ArrayList arrayList11 = new ArrayList(r3d.q(arrayList10, 10));
                for (List list3 : arrayList10) {
                    ArrayList arrayList12 = new ArrayList();
                    for (Object obj7 : list3) {
                        if (!bkb.d0((Pair) obj7)) {
                            arrayList12.add(obj7);
                        }
                    }
                    arrayList11.add(arrayList12);
                }
                ArrayList arrayList13 = new ArrayList(r3d.q(arrayList7, 10));
                for (List list4 : arrayList7) {
                    ArrayList arrayList14 = new ArrayList();
                    for (Object obj8 : list4) {
                        if (bkb.d0((Pair) obj8)) {
                        }
                        arrayList14.add(obj8);
                        break;
                    }
                    arrayList13.add(arrayList14);
                }
                ArrayList arrayList15 = new ArrayList();
                for (Object obj9 : arrayList13) {
                    if (!((List) obj9).isEmpty()) {
                        arrayList15.add(obj9);
                    }
                }
                return new v7f(r3d.r(arrayList15), arrayList11);
            case 11:
                return new heq();
            case 12:
                Object objE = c3x.E(1000L, w7f.b);
                e0g0 e0g0Var = j0g0.b;
                return new q((String) (objE instanceof g0g0 ? "" : objE));
            case 13:
                Object objE2 = c3x.E(1000L, w7f.p);
                e0g0 e0g0Var2 = j0g0.b;
                return new y23((String) (objE2 instanceof g0g0 ? "" : objE2));
            case 14:
                Object objE3 = c3x.E(1000L, w7f.c);
                e0g0 e0g0Var3 = j0g0.b;
                if (objE3 instanceof g0g0) {
                    objE3 = 0;
                }
                return new bne(((Number) objE3).intValue());
            case 15:
                Object objE4 = c3x.E(1000L, w7f.e);
                e0g0 e0g0Var4 = j0g0.b;
                return new nvj((String) (objE4 instanceof g0g0 ? "" : objE4));
            case 16:
                Object objE5 = c3x.E(1000L, w7f.q);
                e0g0 e0g0Var5 = j0g0.b;
                return new leq((String) (objE5 instanceof g0g0 ? "" : objE5));
            case 17:
                Object objE6 = c3x.E(1000L, w7f.r);
                e0g0 e0g0Var6 = j0g0.b;
                return new pjy((String) (objE6 instanceof g0g0 ? "" : objE6));
            case 18:
                Object objE7 = c3x.E(1000L, w7f.s);
                e0g0 e0g0Var7 = j0g0.b;
                return new eo20((String) (objE7 instanceof g0g0 ? "" : objE7));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Object objE8 = c3x.E(1000L, w7f.t);
                e0g0 e0g0Var8 = j0g0.b;
                return new im40((String) (objE8 instanceof g0g0 ? "" : objE8));
            case 20:
                Object objE9 = c3x.E(1000L, w7f.u);
                e0g0 e0g0Var9 = j0g0.b;
                return new vch0((String) (objE9 instanceof g0g0 ? "" : objE9));
            case 21:
                Object objE10 = c3x.E(1000L, w7f.g);
                iun iunVar = iun.f15405a;
                e0g0 e0g0Var10 = j0g0.b;
                if (objE10 instanceof g0g0) {
                    objE10 = iunVar;
                }
                return new lsh0((List) objE10);
            case 22:
                Object objE11 = c3x.E(1000L, w7f.f);
                e0g0 e0g0Var11 = j0g0.b;
                return new eoq0((String) (objE11 instanceof g0g0 ? "" : objE11));
            case 23:
                MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
                byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
                propertyByteArray.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    mediaDrm.release();
                } else {
                    mediaDrm.release();
                }
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.getClass();
                messageDigest.update(propertyByteArray);
                byte[] bArrDigest = messageDigest.digest();
                bArrDigest.getClass();
                return tx3.L(bArrDigest, "", gvy.A, 30);
            default:
                return new jdk0();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vut0(int i2, byte b2) {
        super(i2);
        this.f38066a = b2;
    }
}
