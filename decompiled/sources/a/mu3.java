package a;

import android.content.res.Configuration;
import android.hardware.SensorManager;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class mu3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public boolean k;
    public final /* synthetic */ boolean l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu3(boolean z, cb8 cb8Var, boolean z2, boolean z3, Map map, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.j = z;
        this.m = cb8Var;
        this.k = z2;
        this.l = z3;
        this.n = map;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                return new mu3((zu3) obj2, this.l, yjeVar);
            case 1:
                return new mu3(yjeVar, (zdg0) this.m, (Function2) obj2, this.k, this.l);
            case 2:
                return new mu3(this.j, (cb8) this.m, this.k, this.l, (Map) obj2, yjeVar);
            case 3:
                return new mu3(yjeVar, (nnp) this.m, (List) obj2, this.k, this.l);
            case 4:
                byte b2 = 4;
                mu3 mu3Var = new mu3(b2, yjeVar, (rrd) obj2, this.k, this.l);
                mu3Var.m = obj;
                return mu3Var;
            case 5:
                byte b3 = 5;
                mu3 mu3Var2 = new mu3(b3, yjeVar, (xzp) obj2, this.k, this.l);
                mu3Var2.m = obj;
                return mu3Var2;
            default:
                return new mu3(yjeVar, (ge10) this.m, (odd) obj2, this.k, this.l);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((mu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((mu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((mu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((mu3) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((mu3) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0428  */
    /* JADX WARN: Code duplicated, block: B:159:0x0444  */
    /* JADX WARN: Code duplicated, block: B:162:0x044e  */
    /* JADX WARN: Code duplicated, block: B:168:0x046c  */
    /* JADX WARN: Code duplicated, block: B:169:0x046e A[Catch: Exception -> 0x04a9, TryCatch #0 {Exception -> 0x04a9, blocks: (B:166:0x0460, B:171:0x047f, B:174:0x048c, B:176:0x049a, B:169:0x046e), top: B:210:0x0460 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x047f A[Catch: Exception -> 0x04a9, TryCatch #0 {Exception -> 0x04a9, blocks: (B:166:0x0460, B:171:0x047f, B:174:0x048c, B:176:0x049a, B:169:0x046e), top: B:210:0x0460 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x048b  */
    /* JADX WARN: Code duplicated, block: B:174:0x048c A[Catch: Exception -> 0x04a9, TryCatch #0 {Exception -> 0x04a9, blocks: (B:166:0x0460, B:171:0x047f, B:174:0x048c, B:176:0x049a, B:169:0x046e), top: B:210:0x0460 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x049a A[Catch: Exception -> 0x04a9, TRY_LEAVE, TryCatch #0 {Exception -> 0x04a9, blocks: (B:166:0x0460, B:171:0x047f, B:174:0x048c, B:176:0x049a, B:169:0x046e), top: B:210:0x0460 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x04a6 A[LOOP:0: B:175:0x0498->B:179:0x04a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x04c1 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:183:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:188:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:189:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:190:0x04df  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:212:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x045c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x04df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:? A[LOOP:1: B:160:0x0448->B:218:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0060  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0078  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        cgk cgkVar;
        Object objA;
        boolean z;
        ugk ugkVar;
        ugk ugkVar2;
        String lowerCase;
        List list;
        Iterator it;
        Configuration configuration;
        int identifier;
        boolean zA;
        int identifier2;
        String[] stringArray;
        int length;
        String str;
        boolean zBooleanValue;
        Object objAwait;
        boolean z2;
        odd oddVar;
        i7m0 i7m0Var;
        Integer num;
        int i = 3;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        String str2 = 0;
        byte b = 1;
        switch (this.i) {
            case 0:
                zu3 zu3Var = (zu3) this.n;
                wne wneVar = wne.f39444a;
                boolean z3 = this.k;
                if (!z3) {
                    z1x.P(obj);
                    cgkVar = (cgk) zu3Var.d0.get();
                    boolean z4 = this.l;
                    dgk dgkVar = (dgk) zu3Var.f0.get();
                    this.m = cgkVar;
                    this.j = z4;
                    this.k = true;
                    objA = dgkVar.a(false, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                    z = z4;
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.j;
                    cgk cgkVar2 = (cgk) this.m;
                    z1x.P(obj);
                    cgkVar = cgkVar2;
                    objA = obj;
                }
                boolean zBooleanValue2 = ((Boolean) objA).booleanValue();
                String str3 = "tablet";
                tgk tgkVar = (tgk) cgkVar.b.b;
                switch (tgkVar.d()) {
                    case "tablet":
                        ugkVar = ugk.b;
                        break;
                    case "other":
                        ugkVar = ugk.d;
                        break;
                    case "phone":
                        ugkVar = ugk.f35628a;
                        break;
                    case "foldable":
                        ugkVar = ugk.c;
                        break;
                    default:
                        ugkVar = null;
                        break;
                }
                if (ugkVar == null) {
                    us00 us00Var = cgkVar.f4317a.f37384a;
                    if (z) {
                        ugkVar2 = ugk.c;
                    } else if (zBooleanValue2 || Build.VERSION.SDK_INT < 30) {
                        String str4 = Build.MODEL;
                        str4.getClass();
                        Locale locale = Locale.ENGLISH;
                        locale.getClass();
                        lowerCase = str4.toLowerCase(locale);
                        lowerCase.getClass();
                        list = vgk.d;
                        if (list == null && list.isEmpty()) {
                            identifier = us00Var.getResources().getIdentifier("config_displayFeatures", "string", "android");
                            if (identifier == 0) {
                                zA = false;
                            } else {
                                String string = us00Var.getResources().getString(identifier);
                                string.getClass();
                                zA = vgk.a(string);
                            }
                            if (!zA) {
                                identifier2 = us00Var.getResources().getIdentifier("config_displayFeatures", "array", "android");
                                if (identifier2 == 0) {
                                    stringArray = us00Var.getResources().getStringArray(identifier2);
                                    stringArray.getClass();
                                    length = stringArray.length;
                                    while (true) {
                                        if (i2 < length) {
                                            str = stringArray[i2];
                                            str.getClass();
                                            if (vgk.a(str)) {
                                                i2++;
                                            }
                                        }
                                    }
                                }
                                configuration = us00Var.getResources().getConfiguration();
                                int i3 = configuration.uiMode & 15;
                                if (!us00Var.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
                                    ugkVar2 = ugk.d;
                                } else if (configuration.smallestScreenWidthDp >= 600) {
                                    ugkVar2 = ugk.b;
                                } else {
                                    ugkVar2 = ugk.f35628a;
                                }
                            }
                            ugkVar2 = ugk.c;
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    try {
                                        identifier = us00Var.getResources().getIdentifier("config_displayFeatures", "string", "android");
                                        if (identifier == 0) {
                                            zA = false;
                                        } else {
                                            String string2 = us00Var.getResources().getString(identifier);
                                            string2.getClass();
                                            zA = vgk.a(string2);
                                        }
                                        if (!zA) {
                                            identifier2 = us00Var.getResources().getIdentifier("config_displayFeatures", "array", "android");
                                            if (identifier2 == 0) {
                                                stringArray = us00Var.getResources().getStringArray(identifier2);
                                                stringArray.getClass();
                                                length = stringArray.length;
                                                while (true) {
                                                    if (i2 < length) {
                                                        str = stringArray[i2];
                                                        str.getClass();
                                                        if (vgk.a(str)) {
                                                            i2++;
                                                        }
                                                    }
                                                }
                                            }
                                            configuration = us00Var.getResources().getConfiguration();
                                            int i4 = configuration.uiMode & 15;
                                            if (!us00Var.getPackageManager().hasSystemFeature("android.hardware.type.pc") || vgk.b.contains(Integer.valueOf(i4))) {
                                                ugkVar2 = ugk.d;
                                            } else if (configuration.smallestScreenWidthDp >= 600) {
                                                ugkVar2 = ugk.b;
                                            } else {
                                                ugkVar2 = ugk.f35628a;
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                } else if (StringsKt.O(lowerCase, (String) it.next(), false)) {
                                }
                                ugkVar2 = ugk.c;
                            }
                        }
                    } else {
                        Object systemService = us00Var.getSystemService("sensor");
                        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                        if (((sensorManager != null ? sensorManager.getDefaultSensor(36) : null) == null && !us00Var.getPackageManager().hasSystemFeature("android.hardware.sensor.hinge_angle")) || sto.a() < 1) {
                            String str5 = Build.MODEL;
                            str5.getClass();
                            Locale locale2 = Locale.ENGLISH;
                            locale2.getClass();
                            lowerCase = str5.toLowerCase(locale2);
                            lowerCase.getClass();
                            list = vgk.d;
                            if (list == null) {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        identifier = us00Var.getResources().getIdentifier("config_displayFeatures", "string", "android");
                                        if (identifier == 0) {
                                            zA = false;
                                        } else {
                                            String string3 = us00Var.getResources().getString(identifier);
                                            string3.getClass();
                                            zA = vgk.a(string3);
                                        }
                                        if (!zA) {
                                            identifier2 = us00Var.getResources().getIdentifier("config_displayFeatures", "array", "android");
                                            if (identifier2 == 0) {
                                                stringArray = us00Var.getResources().getStringArray(identifier2);
                                                stringArray.getClass();
                                                length = stringArray.length;
                                                while (true) {
                                                    if (i2 < length) {
                                                        str = stringArray[i2];
                                                        str.getClass();
                                                        if (vgk.a(str)) {
                                                            i2++;
                                                        }
                                                    }
                                                }
                                            }
                                            configuration = us00Var.getResources().getConfiguration();
                                            int i5 = configuration.uiMode & 15;
                                            if (!us00Var.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
                                                ugkVar2 = ugk.d;
                                            } else if (configuration.smallestScreenWidthDp >= 600) {
                                                ugkVar2 = ugk.b;
                                            } else {
                                                ugkVar2 = ugk.f35628a;
                                            }
                                        }
                                    } else if (StringsKt.O(lowerCase, (String) it.next(), false)) {
                                    }
                                }
                            } else {
                                it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        identifier = us00Var.getResources().getIdentifier("config_displayFeatures", "string", "android");
                                        if (identifier == 0) {
                                            zA = false;
                                        } else {
                                            String string4 = us00Var.getResources().getString(identifier);
                                            string4.getClass();
                                            zA = vgk.a(string4);
                                        }
                                        if (!zA) {
                                            identifier2 = us00Var.getResources().getIdentifier("config_displayFeatures", "array", "android");
                                            if (identifier2 == 0) {
                                                stringArray = us00Var.getResources().getStringArray(identifier2);
                                                stringArray.getClass();
                                                length = stringArray.length;
                                                while (true) {
                                                    if (i2 < length) {
                                                        str = stringArray[i2];
                                                        str.getClass();
                                                        if (vgk.a(str)) {
                                                            i2++;
                                                        }
                                                    }
                                                }
                                            }
                                            configuration = us00Var.getResources().getConfiguration();
                                            int i6 = configuration.uiMode & 15;
                                            if (!us00Var.getPackageManager().hasSystemFeature("android.hardware.type.pc")) {
                                                ugkVar2 = ugk.d;
                                            } else if (configuration.smallestScreenWidthDp >= 600) {
                                                ugkVar2 = ugk.b;
                                            } else {
                                                ugkVar2 = ugk.f35628a;
                                            }
                                        }
                                    } else if (StringsKt.O(lowerCase, (String) it.next(), false)) {
                                    }
                                }
                            }
                            ugkVar2 = ugk.c;
                        } else {
                            ugkVar2 = ugk.c;
                        }
                    }
                    int iOrdinal = ugkVar2.ordinal();
                    if (iOrdinal == 0) {
                        str3 = "phone";
                    } else if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            str3 = "foldable";
                        } else {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            str3 = "other";
                        }
                    }
                    tgkVar.getClass();
                    tgkVar.l = str3;
                    tgkVar.b.g("DEVICE_FORM_FACTOR", str3);
                }
                String strD = ((tgk) ((b5u) zu3Var.e0.get()).f2022a.b).d();
                str2 = StringsKt.W(strD) ? 0 : strD;
                if (str2 != 0) {
                    zgk zgkVar = (zgk) zu3Var.i.get();
                    zgkVar.getClass();
                    zgkVar.f44348a.b("device_form_factor", str2);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z5 = this.j;
                if (z5) {
                    if (z5) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                zdg0 zdg0Var = (zdg0) this.m;
                boolean z6 = this.k;
                lyh lyhVar = new lyh((yje) null, zdg0Var, (Function2) this.n, this.l, z6);
                this.j = true;
                Object objH = zdg0Var.h(z6, lyhVar, this);
                return objH == wneVar2 ? wneVar2 : objH;
            case 2:
                Map map = (Map) this.n;
                cb8 cb8Var = (cb8) this.m;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (this.j) {
                    boolean zA2 = cb8Var.a();
                    pz40 pz40Var = cb8Var.d;
                    pz40 pz40Var2 = cb8Var.e;
                    if (!zA2) {
                        if (this.k) {
                            ((hgk0) cb8Var.g).setValue(Boolean.TRUE);
                        }
                        if (this.l) {
                            map.getClass();
                            ((hgk0) pz40Var2).setValue(map);
                            Boolean bool = Boolean.TRUE;
                            ((hgk0) pz40Var).setValue(bool);
                            ((hgk0) cb8Var.f4049a).setValue(k73.f17799a);
                            cb8Var.b.m(0);
                            ((hgk0) cb8Var.c).setValue(bool);
                            ((hgk0) cb8Var.f).setValue(Boolean.FALSE);
                            cb8Var.h.m(0);
                        } else {
                            map.getClass();
                            ((hgk0) pz40Var2).setValue(map);
                            ((hgk0) pz40Var).setValue(Boolean.FALSE);
                        }
                    }
                }
                return Unit.f46060a;
            case 3:
                nnp nnpVar = (nnp) this.m;
                wne wneVar4 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    dnq dnqVar = new dnq(aoq.c(vtb.N(((m8l0) nnpVar.z.f6863a.f19899a).f), new dnp(null, nnpVar, (List) this.n, this.k, this.l)), new rj((Object) nnpVar, (yje) str2, (byte) 26), (byte) 1);
                    this.j = true;
                    if (slb.N(dnqVar, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                boolean z8 = this.l;
                boolean z9 = this.k;
                rrd rrdVar = (rrd) this.n;
                kmq kmqVar = (kmq) this.m;
                wne wneVar5 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    if (z9) {
                        ((yqc) rrdVar.f).w(y9s.c);
                    }
                    yje yjeVar = null;
                    utb utbVarC = aoq.c(new i89(new i89(uvw.O(((w5z) ((cmt) rrdVar.g).b).r(y9s.c), new mqu(rrdVar, yjeVar, objArr2 == true ? 1 : 0), new oz0(i, yjeVar, (byte) 13)), (byte) 22), (byte) 23), new rqu(yjeVar, rrdVar, z8, objArr == true ? 1 : 0));
                    hie0 hie0Var = new hie0();
                    hie0Var.f13108a = z9;
                    ltb ltbVarB = aoq.b(aoq.c(new i89(uvw.P(new qqu(new vsg0(new ir(rrdVar.b, ynq0.f(((viu) rrdVar.i).a()), yjeVar, (byte) 15)), hie0Var, (byte) 0), new lqu(hie0Var, (byte) 0), 30L, new mqu(rrdVar, yjeVar, b), new ko0((Object) rrdVar, yjeVar, (byte) 19), new t3t(rrdVar, (byte) 6), 8), (byte) 22), new rqu(yjeVar, rrdVar, z8, b)), utbVarC);
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar, ltbVarB, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                boolean z11 = this.l;
                boolean z12 = this.k;
                xzp xzpVar = (xzp) this.n;
                kmq kmqVar2 = (kmq) this.m;
                wne wneVar6 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    if (z12) {
                        ((yqc) xzpVar.f).w(y9s.d);
                    }
                    utb utbVarC2 = aoq.c(new i89(new i89(uvw.O(((w5z) ((cmt) xzpVar.e).b).r(y9s.d), new tqu(xzpVar, str2, objArr4 == true ? 1 : 0), new oz0(i, str2, (byte) 14)), (byte) 22), (byte) 23), new wqu(str2, xzpVar, z11, objArr3 == true ? 1 : 0));
                    hie0 hie0Var2 = new hie0();
                    hie0Var2.f13108a = z12;
                    ltb ltbVarB2 = aoq.b(aoq.c(new i89(uvw.P(new qqu(new vsg0(new u5u(xzpVar.f41764a, (yje) str2, (byte) 4)), hie0Var2, (byte) 1), new lqu(hie0Var2, (byte) 1), 8L, new tqu(xzpVar, str2, b), new ko0((Object) xzpVar, (yje) str2, (byte) 20), new t3t(xzpVar, (byte) 7), 8), (byte) 22), new wqu(str2, xzpVar, z11, b)), utbVarC2);
                    this.m = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, ltbVarB2, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                boolean z14 = this.k;
                odd oddVar2 = (odd) this.n;
                ge10 ge10Var = (ge10) this.m;
                wne wneVar7 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    jzj jzjVar = ge10Var.i;
                    if (jzjVar != null) {
                        this.j = true;
                        objAwait = jzjVar.await(this);
                        if (objAwait == wneVar7) {
                            return wneVar7;
                        }
                    } else {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        ge10Var.c(ge10Var.f, -1);
                        oddVar2.b0(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                    } else {
                        ge10Var.e = z14;
                        if (!z14) {
                            ge10Var.c(ge10Var.f, -1);
                        }
                        if (ge10Var.c != null) {
                            if (z14) {
                                ge10Var.c(ge10Var.f, 0);
                            }
                            z2 = this.l;
                            oddVar = ge10Var.h;
                            if (z2) {
                                if (oddVar != null) {
                                    dw9.z("There is a new enableLowLightBoost being set", oddVar);
                                }
                                ge10Var.h = null;
                            } else if (oddVar != null) {
                                vzb.g0(oddVar2, oddVar);
                            }
                            ge10Var.h = oddVar2;
                            i7m0Var = ge10Var.f11128a;
                            num = z14 ? new Integer(6) : null;
                            synchronized (i7m0Var.d) {
                                i7m0Var.k = num;
                            }
                            vzb.g0(i7m0Var.f(), oddVar2);
                            oddVar2.invokeOnCompletion(new ygy(oddVar2, ge10Var, (byte) 12));
                        } else {
                            dw9.z("Camera is not active.", oddVar2);
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z15) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objAwait = obj;
                zBooleanValue = ((Boolean) objAwait).booleanValue();
                if (zBooleanValue) {
                    ge10Var.c(ge10Var.f, -1);
                    oddVar2.b0(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                } else {
                    ge10Var.e = z14;
                    if (!z14) {
                        ge10Var.c(ge10Var.f, -1);
                    }
                    if (ge10Var.c != null) {
                        if (z14) {
                            ge10Var.c(ge10Var.f, 0);
                        }
                        z2 = this.l;
                        oddVar = ge10Var.h;
                        if (z2) {
                            if (oddVar != null) {
                                dw9.z("There is a new enableLowLightBoost being set", oddVar);
                            }
                            ge10Var.h = null;
                        } else if (oddVar != null) {
                            vzb.g0(oddVar2, oddVar);
                        }
                        ge10Var.h = oddVar2;
                        i7m0Var = ge10Var.f11128a;
                        if (z14) {
                        }
                        synchronized (i7m0Var.d) {
                            i7m0Var.k = num;
                            vzb.g0(i7m0Var.f(), oddVar2);
                            oddVar2.invokeOnCompletion(new ygy(oddVar2, ge10Var, (byte) 12));
                        }
                    } else {
                        dw9.z("Camera is not active.", oddVar2);
                    }
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu3(zu3 zu3Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.n = zu3Var;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu3(yje yjeVar, nnp nnpVar, List list, boolean z, boolean z2) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.m = nnpVar;
        this.n = list;
        this.k = z;
        this.l = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu3(yje yjeVar, ge10 ge10Var, odd oddVar, boolean z, boolean z2) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.m = ge10Var;
        this.n = oddVar;
        this.k = z;
        this.l = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu3(yje yjeVar, zdg0 zdg0Var, Function2 function2, boolean z, boolean z2) {
        super(2, yjeVar);
        this.i = (byte) 1;
        this.m = zdg0Var;
        this.k = z;
        this.l = z2;
        this.n = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mu3(byte b, yje yjeVar, Object obj, boolean z, boolean z2) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.n = obj;
        this.l = z2;
    }
}
