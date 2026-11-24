package a;

import android.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes2.dex */
public final class obw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24999a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ ydw0 h;
    public final mew0 i;

    public obw0(ydw0 ydw0Var, String str, int i, mew0 mew0Var, byte b) {
        this.g = b;
        this.h = ydw0Var;
        this.f24999a = str;
        this.b = i;
        this.i = mew0Var;
    }

    public static Boolean c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, vsw0 vsw0Var, uuw0 uuw0Var) {
        List listW;
        s0x.H(vsw0Var);
        if (str != null && vsw0Var.r() && vsw0Var.z() != 1 && (vsw0Var.z() != 7 ? vsw0Var.s() : vsw0Var.x() != 0)) {
            int iZ = vsw0Var.z();
            boolean zV = vsw0Var.v();
            String strT = (zV || iZ == 2 || iZ == 7) ? vsw0Var.t() : vsw0Var.t().toUpperCase(Locale.ENGLISH);
            if (vsw0Var.x() == 0) {
                listW = null;
            } else {
                listW = vsw0Var.w();
                if (!zV) {
                    ArrayList arrayList = new ArrayList(listW.size());
                    Iterator it = listW.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    listW = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = iZ == 2 ? strT : null;
            if (iZ != 7 ? strT != null : listW != null && !listW.isEmpty()) {
                if (!zV && iZ != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (iZ - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != zV ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (uuw0Var != null) {
                                    uuw0Var.j.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(strT));
                    case 3:
                        return Boolean.valueOf(str.endsWith(strT));
                    case 4:
                        return Boolean.valueOf(str.contains(strT));
                    case 5:
                        return Boolean.valueOf(str.equals(strT));
                    case 6:
                        if (listW != null) {
                            return Boolean.valueOf(listW.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00f8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x010b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0112  */
    public static Boolean e(BigDecimal bigDecimal, qsw0 qsw0Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i;
        s0x.H(qsw0Var);
        if (qsw0Var.r()) {
            if (qsw0Var.B() != 1 && (qsw0Var.B() != 5 ? qsw0Var.u() : qsw0Var.w() && qsw0Var.y())) {
                int iB = qsw0Var.B();
                try {
                    if (qsw0Var.B() == 5) {
                        if (r6x0.Q1(qsw0Var.x()) && r6x0.Q1(qsw0Var.z())) {
                            BigDecimal bigDecimal5 = new BigDecimal(qsw0Var.x());
                            bigDecimal4 = new BigDecimal(qsw0Var.z());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (iB == 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                                i = iB - 1;
                                if (i != 1) {
                                    if (i != 2) {
                                        if (i != 3) {
                                            if (i == 4 && bigDecimal3 != null) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d != 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                            }
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (r6x0.Q1(qsw0Var.v())) {
                        bigDecimal2 = new BigDecimal(qsw0Var.v());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (iB == 5) {
                            i = iB - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i = iB - 1;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) < 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d != 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                        }
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0279  */
    /* JADX WARN: Code duplicated, block: B:105:0x0299  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:115:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02de  */
    /* JADX WARN: Code duplicated, block: B:126:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:131:0x030a  */
    /* JADX WARN: Code duplicated, block: B:133:0x0310  */
    /* JADX WARN: Code duplicated, block: B:135:0x0324  */
    /* JADX WARN: Code duplicated, block: B:137:0x032a  */
    /* JADX WARN: Code duplicated, block: B:139:0x0332  */
    /* JADX WARN: Code duplicated, block: B:141:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x035f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0368  */
    /* JADX WARN: Code duplicated, block: B:158:0x039f A[EDGE_INSN: B:158:0x039f->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2 A[EDGE_INSN: B:159:0x03b2->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac]] */
    /* JADX WARN: Code duplicated, block: B:199:0x0343 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x019f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x0287 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x016d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0399 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0384 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x036f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x03c9 A[EDGE_INSN: B:234:0x03c9->B:161:0x03c9 BREAK  A[LOOP:1: B:59:0x0189->B:64:0x01ac], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:61:0x018f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ac A[LOOP:1: B:59:0x0189->B:64:0x01ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0207  */
    /* JADX WARN: Code duplicated, block: B:82:0x0210  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:91:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0260  */
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
    public boolean a(Long l, Long l2, sww0 sww0Var, long j, mmw0 mmw0Var, boolean z) {
        HashSet hashSet;
        Iterator it;
        gx3 gx3Var;
        Iterator it2;
        Iterator it3;
        lsw0 lsw0Var;
        boolean z2;
        String strY;
        Object obj;
        Boolean boolE;
        Boolean boolE2;
        String str;
        qsw0 qsw0VarU;
        long j2;
        Boolean boolE3;
        yww0 yww0Var;
        Long lValueOf;
        Double dValueOf;
        lsw0 lsw0Var2;
        Boolean boolE4;
        int i;
        vhw0.a();
        ydw0 ydw0Var = this.h;
        kxw0 kxw0Var = (kxw0) ydw0Var.b;
        bkw0 bkw0Var = kxw0Var.d;
        uuw0 uuw0Var = kxw0Var.f;
        iuw0 iuw0Var = kxw0Var.j;
        atw0 atw0Var = btw0.F0;
        String str2 = this.f24999a;
        boolean zX1 = bkw0Var.x1(str2, atw0Var);
        jsw0 jsw0Var = (jsw0) this.i;
        long j3 = jsw0Var.C() ? mmw0Var.e : j;
        kxw0.g(uuw0Var);
        quw0 quw0Var = uuw0Var.o;
        quw0 quw0Var2 = uuw0Var.j;
        boolean zIsLoggable = Log.isLoggable(uuw0Var.s1(), 2);
        int i2 = this.b;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (zIsLoggable) {
            kxw0.g(uuw0Var);
            quw0Var.d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), jsw0Var.r() ? Integer.valueOf(jsw0Var.s()) : null, iuw0Var.a(jsw0Var.t()));
            kxw0.g(uuw0Var);
            r6x0 r6x0Var = ydw0Var.c.g;
            m6x0.T(r6x0Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (jsw0Var.r()) {
                i = 0;
                r6x0.H1(sb, 0, "filter_id", Integer.valueOf(jsw0Var.s()));
            } else {
                i = 0;
            }
            r6x0.H1(sb, i, "event_name", ((kxw0) r6x0Var.b).j.a(jsw0Var.t()));
            String strD1 = r6x0.D1(jsw0Var.z(), jsw0Var.A(), jsw0Var.C());
            if (!strD1.isEmpty()) {
                r6x0.H1(sb, 0, "filter_type", strD1);
            }
            if (jsw0Var.x()) {
                r6x0.I1(sb, 1, "event_count_filter", jsw0Var.y());
            }
            if (jsw0Var.v() > 0) {
                sb.append("  filters {\n");
                Iterator it4 = jsw0Var.u().iterator();
                while (it4.hasNext()) {
                    r6x0Var.A1(sb, 2, (lsw0) it4.next());
                }
            }
            r6x0.B1(1, sb);
            sb.append("}\n}\n");
            quw0Var.b(sb.toString(), "Filter definition");
        }
        if (!jsw0Var.r() || jsw0Var.s() > 256) {
            kxw0.g(uuw0Var);
            quw0Var2.c(uuw0.q1(str2), String.valueOf(jsw0Var.r() ? Integer.valueOf(jsw0Var.s()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z3 = jsw0Var.z() || jsw0Var.A() || jsw0Var.C();
        if (z && !z3) {
            kxw0.g(uuw0Var);
            quw0Var.c(Integer.valueOf(i2), jsw0Var.r() ? Integer.valueOf(jsw0Var.s()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strW = sww0Var.w();
        if (!jsw0Var.x()) {
            hashSet = new HashSet();
            it = jsw0Var.u().iterator();
            while (true) {
                if (it.hasNext()) {
                    gx3Var = new gx3(0);
                    it2 = sww0Var.t().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = jsw0Var.u().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    zX1 = zX1;
                                    uuw0Var = uuw0Var;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                lsw0Var = (lsw0) it3.next();
                                if (lsw0Var.v()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                strY = lsw0Var.y();
                                if (strY.isEmpty()) {
                                    obj = gx3Var.get(strY);
                                    if (obj instanceof Long) {
                                        if (obj instanceof Double) {
                                            if (obj instanceof String) {
                                                zX1 = zX1;
                                                uuw0Var = uuw0Var;
                                                if (obj == null) {
                                                    kxw0.g(uuw0Var);
                                                    quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "Unknown param type. event, param");
                                                    break;
                                                }
                                                kxw0.g(uuw0Var);
                                                quw0Var.c(iuw0Var.a(strW), iuw0Var.b(strY), "Missing param for filter. event, param");
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (lsw0Var.r()) {
                                                if (lsw0Var.t()) {
                                                    zX1 = zX1;
                                                    uuw0Var = uuw0Var;
                                                    kxw0.g(uuw0Var);
                                                    quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "No filter for String param. event, param");
                                                    break;
                                                }
                                                str = (String) obj;
                                                if (r6x0.Q1(str)) {
                                                    zX1 = zX1;
                                                    uuw0Var = uuw0Var;
                                                    kxw0.g(uuw0Var);
                                                    quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "Invalid param value for number filter. event, param");
                                                    break;
                                                }
                                                qsw0VarU = lsw0Var.u();
                                                if (r6x0.Q1(str)) {
                                                    zX1 = zX1;
                                                    uuw0Var = uuw0Var;
                                                    j2 = 0;
                                                    boolE3 = e(new BigDecimal(str), qsw0VarU, 0.0d);
                                                } else {
                                                    boolE3 = null;
                                                }
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                uuw0Var = uuw0Var;
                                                zX1 = zX1;
                                            } else {
                                                vsw0 vsw0VarS = lsw0Var.s();
                                                kxw0.g(uuw0Var);
                                                boolE3 = d((String) obj, vsw0VarS, uuw0Var);
                                            }
                                            j2 = 0;
                                            if (boolE3 != null) {
                                                break;
                                                break;
                                            }
                                            if (boolE3.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            uuw0Var = uuw0Var;
                                            zX1 = zX1;
                                        } else if (lsw0Var.t()) {
                                            double dDoubleValue = ((Double) obj).doubleValue();
                                            boolE2 = e(new BigDecimal(dDoubleValue), lsw0Var.u(), Math.ulp(dDoubleValue));
                                            if (boolE2 != null) {
                                                if (boolE2.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        } else {
                                            kxw0.g(uuw0Var);
                                            quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "No number filter for double param. event, param");
                                        }
                                    } else if (lsw0Var.t()) {
                                        boolE = e(new BigDecimal(((Long) obj).longValue()), lsw0Var.u(), 0.0d);
                                        if (boolE != null) {
                                            if (boolE.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                            }
                                        }
                                    } else {
                                        kxw0.g(uuw0Var);
                                        quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "No number filter for long param. event, param");
                                    }
                                } else {
                                    kxw0.g(uuw0Var);
                                    quw0Var2.b(iuw0Var.a(strW), "Event has empty param name. event");
                                }
                            }
                        } else {
                            yww0Var = (yww0) it2.next();
                            if (!hashSet.contains(yww0Var.s())) {
                                if (yww0Var.v()) {
                                    String strS = yww0Var.s();
                                    if (yww0Var.v()) {
                                        lValueOf = Long.valueOf(yww0Var.w());
                                    } else {
                                        lValueOf = null;
                                    }
                                    gx3Var.put(strS, lValueOf);
                                } else if (yww0Var.z()) {
                                    String strS2 = yww0Var.s();
                                    if (yww0Var.z()) {
                                        dValueOf = Double.valueOf(yww0Var.A());
                                    } else {
                                        dValueOf = null;
                                    }
                                    gx3Var.put(strS2, dValueOf);
                                } else if (yww0Var.t()) {
                                    gx3Var.put(yww0Var.s(), yww0Var.u());
                                } else {
                                    kxw0.g(uuw0Var);
                                    quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(yww0Var.s()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    lsw0Var2 = (lsw0) it.next();
                    if (lsw0Var2.y().isEmpty()) {
                        kxw0.g(uuw0Var);
                        quw0Var2.b(iuw0Var.a(strW), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(lsw0Var2.y());
                    }
                }
                zX1 = zX1;
                uuw0Var = uuw0Var;
                break;
            }
        }
        try {
            boolE4 = e(new BigDecimal(j3), jsw0Var.y(), 0.0d);
        } catch (NumberFormatException unused) {
            boolE4 = null;
        }
        if (boolE4 != null) {
            if (boolE4.booleanValue()) {
                hashSet = new HashSet();
                it = jsw0Var.u().iterator();
                while (true) {
                    if (it.hasNext()) {
                        gx3Var = new gx3(0);
                        it2 = sww0Var.t().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                it3 = jsw0Var.u().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        zX1 = zX1;
                                        uuw0Var = uuw0Var;
                                        bool = Boolean.TRUE;
                                        break;
                                    }
                                    lsw0Var = (lsw0) it3.next();
                                    if (lsw0Var.v() || !lsw0Var.w()) {
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    strY = lsw0Var.y();
                                    if (strY.isEmpty()) {
                                        obj = gx3Var.get(strY);
                                        if (obj instanceof Long) {
                                            if (obj instanceof Double) {
                                                if (obj instanceof String) {
                                                    zX1 = zX1;
                                                    uuw0Var = uuw0Var;
                                                    if (obj == null) {
                                                        kxw0.g(uuw0Var);
                                                        quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "Unknown param type. event, param");
                                                        break;
                                                    }
                                                    kxw0.g(uuw0Var);
                                                    quw0Var.c(iuw0Var.a(strW), iuw0Var.b(strY), "Missing param for filter. event, param");
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                if (lsw0Var.r()) {
                                                    if (lsw0Var.t()) {
                                                        zX1 = zX1;
                                                        uuw0Var = uuw0Var;
                                                        kxw0.g(uuw0Var);
                                                        quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "No filter for String param. event, param");
                                                        break;
                                                    }
                                                    str = (String) obj;
                                                    if (r6x0.Q1(str)) {
                                                        zX1 = zX1;
                                                        uuw0Var = uuw0Var;
                                                        kxw0.g(uuw0Var);
                                                        quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "Invalid param value for number filter. event, param");
                                                        break;
                                                    }
                                                    qsw0VarU = lsw0Var.u();
                                                    if (r6x0.Q1(str)) {
                                                        boolE3 = null;
                                                    } else {
                                                        try {
                                                            zX1 = zX1;
                                                            uuw0Var = uuw0Var;
                                                            j2 = 0;
                                                            try {
                                                                boolE3 = e(new BigDecimal(str), qsw0VarU, 0.0d);
                                                            } catch (NumberFormatException unused2) {
                                                                boolE3 = null;
                                                            }
                                                        } catch (NumberFormatException unused3) {
                                                            zX1 = zX1;
                                                            uuw0Var = uuw0Var;
                                                            j2 = 0;
                                                        }
                                                    }
                                                    if (boolE3 != null) {
                                                        break;
                                                    }
                                                    if (boolE3.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    uuw0Var = uuw0Var;
                                                    zX1 = zX1;
                                                } else {
                                                    vsw0 vsw0VarS2 = lsw0Var.s();
                                                    kxw0.g(uuw0Var);
                                                    boolE3 = d((String) obj, vsw0VarS2, uuw0Var);
                                                }
                                                j2 = 0;
                                                if (boolE3 != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolE3.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                uuw0Var = uuw0Var;
                                                zX1 = zX1;
                                            } else if (lsw0Var.t()) {
                                                kxw0.g(uuw0Var);
                                                quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "No number filter for double param. event, param");
                                            } else {
                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                try {
                                                    boolE2 = e(new BigDecimal(dDoubleValue2), lsw0Var.u(), Math.ulp(dDoubleValue2));
                                                } catch (NumberFormatException unused4) {
                                                    boolE2 = null;
                                                }
                                                if (boolE2 != null) {
                                                    if (boolE2.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                    }
                                                }
                                            }
                                        } else if (lsw0Var.t()) {
                                            kxw0.g(uuw0Var);
                                            quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(strY), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolE = e(new BigDecimal(((Long) obj).longValue()), lsw0Var.u(), 0.0d);
                                            } catch (NumberFormatException unused5) {
                                                boolE = null;
                                            }
                                            if (boolE != null) {
                                                if (boolE.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                }
                                            }
                                        }
                                    } else {
                                        kxw0.g(uuw0Var);
                                        quw0Var2.b(iuw0Var.a(strW), "Event has empty param name. event");
                                    }
                                }
                            } else {
                                yww0Var = (yww0) it2.next();
                                if (!hashSet.contains(yww0Var.s())) {
                                    if (yww0Var.v()) {
                                        String strS3 = yww0Var.s();
                                        if (yww0Var.v()) {
                                            lValueOf = Long.valueOf(yww0Var.w());
                                        } else {
                                            lValueOf = null;
                                        }
                                        gx3Var.put(strS3, lValueOf);
                                    } else if (yww0Var.z()) {
                                        String strS4 = yww0Var.s();
                                        if (yww0Var.z()) {
                                            dValueOf = Double.valueOf(yww0Var.A());
                                        } else {
                                            dValueOf = null;
                                        }
                                        gx3Var.put(strS4, dValueOf);
                                    } else if (yww0Var.t()) {
                                        gx3Var.put(yww0Var.s(), yww0Var.u());
                                    } else {
                                        kxw0.g(uuw0Var);
                                        quw0Var2.c(iuw0Var.a(strW), iuw0Var.b(yww0Var.s()), "Unknown value for param. event, param");
                                    }
                                }
                            }
                        }
                    } else {
                        lsw0Var2 = (lsw0) it.next();
                        if (lsw0Var2.y().isEmpty()) {
                            kxw0.g(uuw0Var);
                            quw0Var2.b(iuw0Var.a(strW), "null or empty param name in filter. event");
                        } else {
                            hashSet.add(lsw0Var2.y());
                        }
                    }
                }
            } else {
                bool = Boolean.FALSE;
            }
        }
        zX1 = zX1;
        uuw0Var = uuw0Var;
        break;
        kxw0.g(uuw0Var);
        quw0Var.b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.d = bool2;
        if (!z3 || !sww0Var.x()) {
            return true;
        }
        Long lValueOf2 = Long.valueOf(sww0Var.y());
        if (jsw0Var.A()) {
            if (zX1 && jsw0Var.x()) {
                lValueOf2 = l;
            }
            this.f = lValueOf2;
            return true;
        }
        if (zX1 && jsw0Var.x()) {
            lValueOf2 = l2;
        }
        this.e = lValueOf2;
        return true;
    }

    public boolean b(Long l, Long l2, eyw0 eyw0Var, boolean z) {
        boolean z2;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolE3;
        vhw0.a();
        kxw0 kxw0Var = (kxw0) this.h.b;
        bkw0 bkw0Var = kxw0Var.d;
        iuw0 iuw0Var = kxw0Var.j;
        uuw0 uuw0Var = kxw0Var.f;
        boolean zX1 = bkw0Var.x1(this.f24999a, btw0.D0);
        ssw0 ssw0Var = (ssw0) this.i;
        boolean zV = ssw0Var.v();
        boolean zW = ssw0Var.w();
        boolean zY = ssw0Var.y();
        boolean z3 = zV || zW || zY;
        if (z && !z3) {
            kxw0.g(uuw0Var);
            uuw0Var.o.c(Integer.valueOf(this.b), ssw0Var.r() ? Integer.valueOf(ssw0Var.s()) : null, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        lsw0 lsw0VarU = ssw0Var.u();
        boolean zW2 = lsw0VarU.w();
        if (!eyw0Var.w()) {
            z2 = zY;
            if (!eyw0Var.A()) {
                if (!eyw0Var.u()) {
                    kxw0.g(uuw0Var);
                    uuw0Var.j.b(iuw0Var.c(eyw0Var.t()), "User property has no value, property");
                } else if (lsw0VarU.r()) {
                    String strV = eyw0Var.v();
                    vsw0 vsw0VarS = lsw0VarU.s();
                    kxw0.g(uuw0Var);
                    boolC = c(d(strV, vsw0VarS, uuw0Var), zW2);
                } else if (!lsw0VarU.t()) {
                    kxw0.g(uuw0Var);
                    uuw0Var.j.b(iuw0Var.c(eyw0Var.t()), "No string or number filter defined. property");
                } else if (r6x0.Q1(eyw0Var.v())) {
                    String strV2 = eyw0Var.v();
                    qsw0 qsw0VarU = lsw0VarU.u();
                    if (r6x0.Q1(strV2)) {
                        try {
                            boolE = e(new BigDecimal(strV2), qsw0VarU, 0.0d);
                        } catch (NumberFormatException unused) {
                            boolE = null;
                        }
                    } else {
                        boolE = null;
                    }
                    boolC = c(boolE, zW2);
                } else {
                    kxw0.g(uuw0Var);
                    uuw0Var.j.c(iuw0Var.c(eyw0Var.t()), eyw0Var.v(), "Invalid user property value for Numeric number filter. property, value");
                }
                boolC = null;
            } else if (lsw0VarU.t()) {
                double dB = eyw0Var.B();
                try {
                    boolE2 = e(new BigDecimal(dB), lsw0VarU.u(), Math.ulp(dB));
                } catch (NumberFormatException unused2) {
                    boolE2 = null;
                }
                boolC = c(boolE2, zW2);
            } else {
                kxw0.g(uuw0Var);
                uuw0Var.j.b(iuw0Var.c(eyw0Var.t()), "No number filter for double property. property");
                boolC = null;
            }
        } else if (lsw0VarU.t()) {
            z2 = zY;
            try {
                boolE3 = e(new BigDecimal(eyw0Var.x()), lsw0VarU.u(), 0.0d);
            } catch (NumberFormatException unused3) {
                boolE3 = null;
            }
            boolC = c(boolE3, zW2);
        } else {
            kxw0.g(uuw0Var);
            uuw0Var.j.b(iuw0Var.c(eyw0Var.t()), "No number filter for long property. property");
            z2 = zY;
            boolC = null;
        }
        kxw0.g(uuw0Var);
        uuw0Var.o.b(boolC == null ? "null" : boolC, "Property filter result");
        if (boolC == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (!z2 || boolC.booleanValue()) {
            if (!z || ssw0Var.v()) {
                this.d = boolC;
            }
            if (boolC.booleanValue() && z3 && eyw0Var.r()) {
                long jS = eyw0Var.s();
                if (l != null) {
                    jS = l.longValue();
                }
                if (zX1 && ssw0Var.v() && !ssw0Var.w() && l2 != null) {
                    jS = l2.longValue();
                }
                if (ssw0Var.w()) {
                    this.f = Long.valueOf(jS);
                } else {
                    this.e = Long.valueOf(jS);
                }
            }
        }
        return true;
    }
}
