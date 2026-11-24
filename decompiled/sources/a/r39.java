package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r39 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29775a;
    public final /* synthetic */ pbz b;

    public /* synthetic */ r39(pbz pbzVar, byte b) {
        this.f29775a = b;
        this.b = pbzVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29775a;
        pbz pbzVar = null;
        pbz pbzVar2 = this.b;
        lwk lwkVar = (lwk) obj;
        switch (b) {
            case 0:
                lwkVar.getClass();
                if (pbzVar2 != null) {
                    pbzVar2.a();
                    pbzVar = pbzVar2;
                }
                return new u39(pbzVar, (byte) 0);
            case 1:
                lwkVar.getClass();
                if (pbzVar2 != null) {
                    pbzVar2.a();
                    pbzVar = pbzVar2;
                }
                return new u39(pbzVar, (byte) 1);
            default:
                return new u39(pbzVar2, (byte) 2);
        }
    }
}
