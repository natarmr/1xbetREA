package a;

import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p4s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26370a;
    public final /* synthetic */ s4s b;
    public final /* synthetic */ o0x c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ p4s(s4s s4sVar, o0x o0xVar, Function2 function2, byte b) {
        this.f26370a = b;
        this.b = s4sVar;
        this.c = o0xVar;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26370a;
        Function2 function2 = this.d;
        o0x o0xVar = this.c;
        s4s s4sVar = this.b;
        Drawable drawable = (Drawable) obj;
        switch (b) {
            case 0:
                drawable.getClass();
                n0x n0xVar = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                s4sVar.g = n0xVar != null ? n0xVar.f22722a : null;
                Boolean bool = (Boolean) function2.invoke(drawable, s4sVar);
                bool.getClass();
                return bool;
            default:
                drawable.getClass();
                n0x n0xVar2 = o0xVar instanceof n0x ? (n0x) o0xVar : null;
                s4sVar.g = n0xVar2 != null ? n0xVar2.f22722a : null;
                Boolean bool2 = (Boolean) function2.invoke(drawable, s4sVar);
                bool2.getClass();
                return bool2;
        }
    }
}
