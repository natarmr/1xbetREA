package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class go extends bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11607a;
    public final /* synthetic */ yfd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ bsr0 d;

    public /* synthetic */ go(yfd yfdVar, String str, bsr0 bsr0Var, byte b) {
        this.f11607a = b;
        this.b = yfdVar;
        this.c = str;
        this.d = bsr0Var;
    }

    @Override // a.bo
    public final void a(Object obj) {
        byte b = this.f11607a;
        bsr0 bsr0Var = this.d;
        String str = this.c;
        yfd yfdVar = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = yfdVar.d;
                Object obj2 = yfdVar.b.get(str);
                if (obj2 == null) {
                    hny.p("Attempting to launch an unregistered ActivityResultLauncher with contract ", bsr0Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    yfdVar.b(iIntValue, bsr0Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = yfdVar.d;
                Object obj3 = yfdVar.b.get(str);
                if (obj3 == null) {
                    hny.p("Attempting to launch an unregistered ActivityResultLauncher with contract ", bsr0Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    yfdVar.b(iIntValue2, bsr0Var, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    @Override // a.bo
    public final void b() {
        byte b = this.f11607a;
        String str = this.c;
        yfd yfdVar = this.b;
        switch (b) {
            case 0:
                yfdVar.f(str);
                break;
            default:
                yfdVar.f(str);
                break;
        }
    }
}
