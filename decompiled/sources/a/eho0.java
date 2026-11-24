package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class eho0 extends bnn0 implements Function2 {
    public w46 A;
    public final /* synthetic */ w46 B;
    public final /* synthetic */ byte i;
    public List j;
    public qz40 k;
    public Object l;
    public Map m;
    public r040 n;
    public Map o;
    public Collection p;
    public Iterator q;
    public Collection r;
    public r040 s;
    public List t;
    public qho u;
    public ctf0 v;
    public yx10 w;
    public boolean x;
    public byte y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eho0(w46 w46Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.B = w46Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        w46 w46Var = this.B;
        switch (b) {
            case 0:
                eho0 eho0Var = new eho0((fho0) w46Var, yjeVar, (byte) 0);
                eho0Var.z = obj;
                return eho0Var;
            case 1:
                eho0 eho0Var2 = new eho0((rio0) w46Var, yjeVar, (byte) 1);
                eho0Var2.z = obj;
                return eho0Var2;
            default:
                eho0 eho0Var3 = new eho0((xtq0) w46Var, yjeVar, (byte) 2);
                eho0Var3.z = obj;
                return eho0Var3;
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
        }
        return ((eho0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:124:0x056e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0591  */
    /* JADX WARN: Code duplicated, block: B:136:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:140:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:143:0x0641  */
    /* JADX WARN: Code duplicated, block: B:149:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:151:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:153:0x06cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:143:0x0641 -> B:144:0x0657). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01c5 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x03fa -> B:92:0x040f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.eho0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
