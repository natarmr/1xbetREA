package a;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vfd implements bh60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37324a;
    public final /* synthetic */ agd b;

    public /* synthetic */ vfd(agd agdVar, byte b) {
        this.f37324a = b;
        this.b = agdVar;
    }

    @Override // a.bh60
    public final void a(Context context) {
        byte b = this.f37324a;
        agd agdVar = this.b;
        switch (b) {
            case 0:
                context.getClass();
                Bundle bundleH = ((kd30) agdVar.d.b).H("android:support:activity-result");
                if (bundleH != null) {
                    yfd yfdVar = agdVar.i;
                    LinkedHashMap linkedHashMap = yfdVar.b;
                    LinkedHashMap linkedHashMap2 = yfdVar.f42535a;
                    Bundle bundle = yfdVar.g;
                    ArrayList<Integer> integerArrayList = bundleH.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleH.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleH.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            yfdVar.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleH.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i = 0; i < size; i++) {
                            String str = stringArrayList.get(i);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    zys0.c(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i);
                            num2.getClass();
                            int iIntValue = num2.intValue();
                            String str2 = stringArrayList.get(i);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                            yfdVar.b.put(str3, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                jxq jxqVar = (jxq) ((kxq) agdVar).v.b;
                jxqVar.d.b(jxqVar, jxqVar, null);
                break;
        }
    }
}
