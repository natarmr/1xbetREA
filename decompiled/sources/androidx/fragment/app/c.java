package androidx.fragment.app;

import a.wn;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c implements wn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45377a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, byte b) {
        this.f45377a = b;
        this.b = eVar;
    }

    @Override // a.wn
    public final void a(Object obj) {
        byte b = this.f45377a;
        e eVar = this.b;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = (FragmentManager$LaunchedFragmentInfo) eVar.G.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                } else {
                    String str = fragmentManager$LaunchedFragmentInfo.f45373a;
                    if (eVar.c.l(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    }
                }
                break;
            case 1:
                ActivityResult activityResult = (ActivityResult) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = (FragmentManager$LaunchedFragmentInfo) eVar.G.pollLast();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                } else {
                    String str2 = fragmentManager$LaunchedFragmentInfo2.f45373a;
                    int i2 = fragmentManager$LaunchedFragmentInfo2.b;
                    Fragment fragmentL = eVar.c.l(str2);
                    if (fragmentL == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                    } else {
                        fragmentL.U(i2, activityResult.f45280a, activityResult.b);
                    }
                }
                break;
            default:
                ActivityResult activityResult2 = (ActivityResult) obj;
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = (FragmentManager$LaunchedFragmentInfo) eVar.G.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                } else {
                    String str3 = fragmentManager$LaunchedFragmentInfo3.f45373a;
                    int i3 = fragmentManager$LaunchedFragmentInfo3.b;
                    Fragment fragmentL2 = eVar.c.l(str3);
                    if (fragmentL2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                    } else {
                        fragmentL2.U(i3, activityResult2.f45280a, activityResult2.b);
                    }
                }
                break;
        }
    }
}
