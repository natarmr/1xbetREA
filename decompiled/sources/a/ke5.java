package a;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ke5 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ xex j;
    public final /* synthetic */ String k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ke5(xex xexVar, String str, String str2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = xexVar;
        this.k = str;
        this.l = str2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ke5(this.j, this.k, this.l, yjeVar, (byte) 0);
            case 1:
                return new ke5(this.j, this.k, this.l, yjeVar, (byte) 1);
            case 2:
                return new ke5(this.j, this.k, this.l, yjeVar, (byte) 2);
            case 3:
                return new ke5(this.j, this.k, this.l, yjeVar, (byte) 3);
            case 4:
                return new ke5(this.j, this.k, this.l, yjeVar, (byte) 4);
            default:
                return new ke5(this.j, this.k, this.l, yjeVar, (byte) 5);
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
            case 3:
                break;
            case 4:
                break;
        }
        return ((ke5) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws IOException {
        byte b = this.i;
        File file = null;
        String str = this.l;
        String str2 = this.k;
        xex xexVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var = (ie5) xexVar.b;
                ie5Var.getClass();
                str2.getClass();
                str.getClass();
                File file2 = new File(ie5Var.f14616a.getFilesDir(), ie5Var.b);
                file2.mkdirs();
                File file3 = new File(file2, "temporary_image_".concat(str2.concat(str)));
                file3.createNewFile();
                return file3;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var2 = (ie5) xexVar.b;
                ie5Var2.getClass();
                str2.getClass();
                str.getClass();
                File file4 = new File(ie5Var2.f14616a.getFilesDir(), ie5Var2.b);
                file4.mkdirs();
                File file5 = new File(file4, "temporary_video_".concat(str2.concat(str)));
                file5.createNewFile();
                return file5;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var3 = (ie5) xexVar.b;
                ie5Var3.getClass();
                str2.getClass();
                str.getClass();
                File file6 = new File(ie5Var3.f14616a.getFilesDir(), ie5Var3.b);
                file6.mkdirs();
                File file7 = new File(file6, "temporary_image_".concat(str2.concat(str)));
                if (file7.exists()) {
                    file7.delete();
                }
                String[] list = file6.list();
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : list) {
                        str3.getClass();
                        if (StringsKt.O(str3, str2.concat("temporary_image"), false)) {
                            arrayList.add(str3);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        File file8 = new File(file6, (String) it.next());
                        if (file8.exists()) {
                            file8.delete();
                        }
                    }
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var4 = (ie5) xexVar.b;
                ie5Var4.getClass();
                str2.getClass();
                str.getClass();
                File file9 = new File(ie5Var4.f14616a.getFilesDir(), ie5Var4.b);
                file9.mkdirs();
                File file10 = new File(file9, "temporary_video_".concat(str2.concat(str)));
                if (file10.exists()) {
                    file10.delete();
                }
                String[] list2 = file9.list();
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str4 : list2) {
                        str4.getClass();
                        if (StringsKt.O(str4, str2.concat("temporary_video"), false)) {
                            arrayList2.add(str4);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        File file11 = new File(file9, (String) it2.next());
                        if (file11.exists()) {
                            file11.delete();
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var5 = (ie5) xexVar.b;
                ie5Var5.getClass();
                str2.getClass();
                str.getClass();
                File file12 = new File(ie5Var5.f14616a.getFilesDir(), ie5Var5.b);
                file12.mkdirs();
                File[] fileArrListFiles = file12.listFiles();
                if (fileArrListFiles != null) {
                    for (File file13 : fileArrListFiles) {
                        String name = file13.getName();
                        name.getClass();
                        if (StringsKt.O(name, "full_image_".concat(str2), false)) {
                            file = file13;
                        }
                    }
                }
                if (file != null) {
                    file.renameTo(new File(file12, str2.concat("previous_image")));
                }
                new File(file12, "temporary_image_".concat(str2.concat(str))).renameTo(new File(file12, "full_image_".concat(str2.concat(str))));
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                ie5 ie5Var6 = (ie5) xexVar.b;
                ie5Var6.getClass();
                str2.getClass();
                str.getClass();
                File file14 = new File(ie5Var6.f14616a.getFilesDir(), ie5Var6.b);
                file14.mkdirs();
                File[] fileArrListFiles2 = file14.listFiles();
                if (fileArrListFiles2 != null) {
                    for (File file15 : fileArrListFiles2) {
                        String name2 = file15.getName();
                        name2.getClass();
                        if (StringsKt.O(name2, "full_video_".concat(str2), false)) {
                            file = file15;
                        }
                    }
                }
                if (file != null) {
                    file.renameTo(new File(file14, str2.concat("previous_video")));
                }
                new File(file14, "temporary_video_".concat(str2.concat(str))).renameTo(new File(file14, "full_video_".concat(str2.concat(str))));
                return Unit.f46060a;
        }
    }
}
