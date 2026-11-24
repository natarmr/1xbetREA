package a;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class je5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ xex j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ je5(xex xexVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = xexVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xex xexVar = this.j;
        switch (b) {
            case 0:
                return new je5(xexVar, yjeVar, (byte) 0);
            case 1:
                return new je5(xexVar, yjeVar, (byte) 1);
            case 2:
                return new je5(xexVar, yjeVar, (byte) 2);
            default:
                return new je5(xexVar, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((je5) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0210  */
    /* JADX WARN: Code duplicated, block: B:130:0x023a  */
    /* JADX WARN: Code duplicated, block: B:142:0x0264  */
    /* JADX WARN: Code duplicated, block: B:154:0x028e  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x011e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:81:0x0172  */
    /* JADX WARN: Code duplicated, block: B:93:0x019c  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        String path;
        String path2;
        String path3;
        String path4;
        String path5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String path6;
        String path7;
        String path8;
        String path9;
        String path10;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        byte b = this.i;
        String path11 = null;
        boolean z = false;
        xex xexVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var = (ie5) xexVar.b;
                ie5Var.getClass();
                File file = new File(ie5Var.f14616a.getFilesDir(), ie5Var.b);
                file.mkdirs();
                String[] list = file.list();
                if (list != null) {
                    int length = list.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            str6 = list[i];
                            str6.getClass();
                            if (!StringsKt.O(str6, "full_video_small", false)) {
                                i++;
                            }
                        } else {
                            str6 = null;
                        }
                    }
                    if (str6 != null) {
                        path = new File(file, str6).getPath();
                    } else {
                        path = null;
                    }
                } else {
                    path = null;
                }
                String[] list2 = file.list();
                if (list2 != null) {
                    int length2 = list2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            str5 = list2[i2];
                            str5.getClass();
                            if (!StringsKt.O(str5, "full_image_small", false)) {
                                i2++;
                            }
                        } else {
                            str5 = null;
                        }
                    }
                    if (str5 != null) {
                        path2 = new File(file, str5).getPath();
                    } else {
                        path2 = null;
                    }
                } else {
                    path2 = null;
                }
                String[] list3 = file.list();
                if (list3 != null) {
                    int length3 = list3.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length3) {
                            str4 = list3[i3];
                            str4.getClass();
                            if (!StringsKt.O(str4, "full_video_medium", false)) {
                                i3++;
                            }
                        } else {
                            str4 = null;
                        }
                    }
                    if (str4 != null) {
                        path3 = new File(file, str4).getPath();
                    } else {
                        path3 = null;
                    }
                } else {
                    path3 = null;
                }
                String[] list4 = file.list();
                if (list4 != null) {
                    int length4 = list4.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length4) {
                            str3 = list4[i4];
                            str3.getClass();
                            if (!StringsKt.O(str3, "full_image_medium", false)) {
                                i4++;
                            }
                        } else {
                            str3 = null;
                        }
                    }
                    if (str3 != null) {
                        path4 = new File(file, str3).getPath();
                    } else {
                        path4 = null;
                    }
                } else {
                    path4 = null;
                }
                String[] list5 = file.list();
                if (list5 != null) {
                    int length5 = list5.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length5) {
                            str2 = list5[i5];
                            str2.getClass();
                            if (!StringsKt.O(str2, "full_video_large", false)) {
                                i5++;
                            }
                        } else {
                            str2 = null;
                        }
                    }
                    if (str2 != null) {
                        path5 = new File(file, str2).getPath();
                    } else {
                        path5 = null;
                    }
                } else {
                    path5 = null;
                }
                String[] list6 = file.list();
                if (list6 != null) {
                    int length6 = list6.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length6) {
                            str = list6[i6];
                            str.getClass();
                            if (!StringsKt.O(str, "full_image_large", false)) {
                                i6++;
                            }
                        } else {
                            str = null;
                        }
                    }
                    if (str != null) {
                        path11 = new File(file, str).getPath();
                    }
                }
                return new ne5(path, path2, path3, path4, path5, path11);
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var2 = (ie5) xexVar.b;
                ie5Var2.getClass();
                File file2 = new File(ie5Var2.f14616a.getFilesDir(), ie5Var2.b);
                file2.mkdirs();
                String[] list7 = file2.list();
                if (list7 != null) {
                    int length7 = list7.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length7) {
                            str12 = list7[i7];
                            str12.getClass();
                            if (!StringsKt.O(str12, "small_previous_video", false)) {
                                i7++;
                            }
                        } else {
                            str12 = null;
                        }
                    }
                    if (str12 != null) {
                        path6 = new File(file2, str12).getPath();
                    } else {
                        path6 = null;
                    }
                } else {
                    path6 = null;
                }
                String[] list8 = file2.list();
                if (list8 != null) {
                    int length8 = list8.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length8) {
                            str11 = list8[i8];
                            str11.getClass();
                            if (!StringsKt.O(str11, "small_previous_image", false)) {
                                i8++;
                            }
                        } else {
                            str11 = null;
                        }
                    }
                    if (str11 != null) {
                        path7 = new File(file2, str11).getPath();
                    } else {
                        path7 = null;
                    }
                } else {
                    path7 = null;
                }
                String[] list9 = file2.list();
                if (list9 != null) {
                    int length9 = list9.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 < length9) {
                            str10 = list9[i9];
                            str10.getClass();
                            if (!StringsKt.O(str10, "medium_previous_video", false)) {
                                i9++;
                            }
                        } else {
                            str10 = null;
                        }
                    }
                    if (str10 != null) {
                        path8 = new File(file2, str10).getPath();
                    } else {
                        path8 = null;
                    }
                } else {
                    path8 = null;
                }
                String[] list10 = file2.list();
                if (list10 != null) {
                    int length10 = list10.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length10) {
                            str9 = list10[i10];
                            str9.getClass();
                            if (!StringsKt.O(str9, "medium_previous_image", false)) {
                                i10++;
                            }
                        } else {
                            str9 = null;
                        }
                    }
                    if (str9 != null) {
                        path9 = new File(file2, str9).getPath();
                    } else {
                        path9 = null;
                    }
                } else {
                    path9 = null;
                }
                String[] list11 = file2.list();
                if (list11 != null) {
                    int length11 = list11.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length11) {
                            str8 = list11[i11];
                            str8.getClass();
                            if (!StringsKt.O(str8, "large_previous_video", false)) {
                                i11++;
                            }
                        } else {
                            str8 = null;
                        }
                    }
                    if (str8 != null) {
                        path10 = new File(file2, str8).getPath();
                    } else {
                        path10 = null;
                    }
                } else {
                    path10 = null;
                }
                String[] list12 = file2.list();
                if (list12 != null) {
                    int length12 = list12.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length12) {
                            str7 = list12[i12];
                            str7.getClass();
                            if (!StringsKt.O(str7, "large_previous_image", false)) {
                                i12++;
                            }
                        } else {
                            str7 = null;
                        }
                    }
                    if (str7 != null) {
                        path11 = new File(file2, str7).getPath();
                    }
                }
                return new ne5(path6, path7, path8, path9, path10, path11);
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var3 = (ie5) xexVar.b;
                ie5Var3.getClass();
                File file3 = new File(ie5Var3.f14616a.getFilesDir(), ie5Var3.b);
                file3.mkdirs();
                String[] list13 = file3.list();
                if (list13 != null) {
                    for (String str13 : list13) {
                        str13.getClass();
                        if (StringsKt.O(str13, "temporary", false)) {
                            path11 = str13;
                            if (path11 != null && path11.length() > 0) {
                                z = true;
                            }
                        }
                    }
                    if (path11 != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var4 = (ie5) xexVar.b;
                ie5Var4.getClass();
                File file4 = new File(ie5Var4.f14616a.getFilesDir(), ie5Var4.b);
                file4.mkdirs();
                String[] list14 = file4.list();
                if (list14 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str14 : list14) {
                        str14.getClass();
                        if (StringsKt.O(str14, "previous", false)) {
                            arrayList.add(str14);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file5 = new File(file4, (String) it.next());
                        if (file5.exists()) {
                            file5.delete();
                        }
                    }
                }
                return Unit.f46060a;
        }
    }
}
