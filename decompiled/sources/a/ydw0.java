package a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ydw0 extends u5x0 {
    public String e;
    public HashSet f;
    public gx3 g;
    public Long h;
    public Long i;

    /* JADX WARN: Code duplicated, block: B:102:0x023a A[LOOP:20: B:85:0x01ec->B:102:0x023a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x026a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:123:0x027f  */
    /* JADX WARN: Code duplicated, block: B:125:0x028a  */
    /* JADX WARN: Code duplicated, block: B:131:0x02b8 A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, LOOP:11: B:131:0x02b8->B:568:?, LOOP_START, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02c9 A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ec A[Catch: all -> 0x02d3, SQLiteException -> 0x02d5, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02d5, blocks: (B:129:0x02b2, B:131:0x02b8, B:133:0x02c9, B:139:0x02d7, B:142:0x02ec), top: B:478:0x02b2 }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0329  */
    /* JADX WARN: Code duplicated, block: B:162:0x0337  */
    /* JADX WARN: Code duplicated, block: B:164:0x034e  */
    /* JADX WARN: Code duplicated, block: B:190:0x0449  */
    /* JADX WARN: Code duplicated, block: B:194:0x045a  */
    /* JADX WARN: Code duplicated, block: B:196:0x047a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0491  */
    /* JADX WARN: Code duplicated, block: B:206:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:207:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:211:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:217:0x04db  */
    /* JADX WARN: Code duplicated, block: B:223:0x0511  */
    /* JADX WARN: Code duplicated, block: B:226:0x051a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0526  */
    /* JADX WARN: Code duplicated, block: B:230:0x0546  */
    /* JADX WARN: Code duplicated, block: B:231:0x054a  */
    /* JADX WARN: Code duplicated, block: B:236:0x0563 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0582  */
    /* JADX WARN: Code duplicated, block: B:249:0x059e  */
    /* JADX WARN: Code duplicated, block: B:252:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:255:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:262:0x0605  */
    /* JADX WARN: Code duplicated, block: B:265:0x0619  */
    /* JADX WARN: Code duplicated, block: B:271:0x064c  */
    /* JADX WARN: Code duplicated, block: B:275:0x068d  */
    /* JADX WARN: Code duplicated, block: B:282:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:288:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:299:0x06ef A[LOOP:3: B:276:0x068f->B:299:0x06ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:315:0x0720  */
    /* JADX WARN: Code duplicated, block: B:320:0x072b  */
    /* JADX WARN: Code duplicated, block: B:322:0x072f  */
    /* JADX WARN: Code duplicated, block: B:326:0x0741  */
    /* JADX WARN: Code duplicated, block: B:332:0x076e  */
    /* JADX WARN: Code duplicated, block: B:334:0x0799  */
    /* JADX WARN: Code duplicated, block: B:336:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:339:0x07b1 A[LOOP:5: B:330:0x0768->B:339:0x07b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:346:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:349:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:352:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:354:0x0802  */
    /* JADX WARN: Code duplicated, block: B:358:0x083d  */
    /* JADX WARN: Code duplicated, block: B:365:0x0865  */
    /* JADX WARN: Code duplicated, block: B:371:0x0876  */
    /* JADX WARN: Code duplicated, block: B:382:0x08a3 A[LOOP:7: B:359:0x083f->B:382:0x08a3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:400:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:404:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:406:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:410:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:414:0x091d  */
    /* JADX WARN: Code duplicated, block: B:417:0x092e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0943  */
    /* JADX WARN: Code duplicated, block: B:421:0x094f  */
    /* JADX WARN: Code duplicated, block: B:423:0x095a  */
    /* JADX WARN: Code duplicated, block: B:425:0x0981  */
    /* JADX WARN: Code duplicated, block: B:428:0x098b  */
    /* JADX WARN: Code duplicated, block: B:441:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:442:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a0c A[PHI: r21 r22
  0x0a0c: PHI (r21v20 java.util.Map) = (r21v21 java.util.Map), (r0v78 java.util.Map) binds: [B:445:0x0a0a, B:443:0x09fc] A[DONT_GENERATE, DONT_INLINE]
  0x0a0c: PHI (r22v6 a.nuj0) = (r22v7 a.nuj0), (r2v41 a.nuj0) binds: [B:445:0x0a0a, B:443:0x09fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a33  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ab5  */
    /* JADX WARN: Code duplicated, block: B:467:0x0abd  */
    /* JADX WARN: Code duplicated, block: B:536:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06ea A[EDGE_INSN: B:542:0x06ea->B:298:0x06ea BREAK  A[LOOP:3: B:276:0x068f->B:299:0x06ef], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x075d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0753 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x089e A[EDGE_INSN: B:553:0x089e->B:381:0x089e BREAK  A[LOOP:7: B:359:0x083f->B:382:0x08a3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x090e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a11 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a06 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09e0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0a8f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a2d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x048b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0354 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x0236 A[EDGE_INSN: B:604:0x0236->B:101:0x0236 BREAK  A[LOOP:20: B:85:0x01ec->B:102:0x023a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0188  */
    /* JADX WARN: Code duplicated, block: B:67:0x018f  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb A[Catch: all -> 0x01d7, SQLiteException -> 0x01da, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x01da, blocks: (B:72:0x01c5, B:74:0x01cb, B:83:0x01e5), top: B:472:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01e5 A[Catch: all -> 0x01d7, SQLiteException -> 0x01da, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x01da, blocks: (B:72:0x01c5, B:74:0x01cb, B:83:0x01e5), top: B:472:0x01c5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v204 */
    /* JADX WARN: Type inference failed for: r0v205 */
    /* JADX WARN: Type inference failed for: r0v31, types: [a.nuj0] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v19, types: [a.nuj0] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [a.kxw0] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [a.kxw0] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /* JADX WARN: Type inference failed for: r38v13 */
    /* JADX WARN: Type inference failed for: r38v14 */
    /* JADX WARN: Type inference failed for: r38v15 */
    /* JADX WARN: Type inference failed for: r38v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r38v17 */
    /* JADX WARN: Type inference failed for: r38v18 */
    /* JADX WARN: Type inference failed for: r38v19 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v20 */
    /* JADX WARN: Type inference failed for: r38v21 */
    /* JADX WARN: Type inference failed for: r38v22 */
    /* JADX WARN: Type inference failed for: r38v23 */
    /* JADX WARN: Type inference failed for: r38v24 */
    /* JADX WARN: Type inference failed for: r38v25 */
    /* JADX WARN: Type inference failed for: r38v26 */
    /* JADX WARN: Type inference failed for: r38v27 */
    /* JADX WARN: Type inference failed for: r38v28 */
    /* JADX WARN: Type inference failed for: r38v29 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v30 */
    /* JADX WARN: Type inference failed for: r38v31 */
    /* JADX WARN: Type inference failed for: r38v32 */
    /* JADX WARN: Type inference failed for: r38v33 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v7 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r38v9 */
    /* JADX WARN: Type inference failed for: r3v56, types: [a.quw0] */
    /* JADX WARN: Type inference failed for: r3v70, types: [a.quw0] */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v68 */
    /* JADX WARN: Type inference failed for: r7v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v70, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v71, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73 */
    /* JADX WARN: Type inference failed for: r7v74 */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v76, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
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
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList q1(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        boolean z4;
        Map map3;
        Map map4;
        Map map5;
        ?? r10;
        m6x0 m6x0Var;
        String str5;
        txw0 txw0Var;
        BitSet bitSet;
        BitSet bitSet2;
        gx3 gx3Var;
        txw0 txw0Var2;
        gx3 gx3Var2;
        boolean z5;
        List<jsw0> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z6;
        Iterator it;
        wxw0 wxw0Var;
        Long lValueOf;
        zlw0 zlw0VarG0;
        String str6;
        ?? gx3Var3;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        gx3 gx3Var4;
        Iterator it2;
        Integer num;
        txw0 txw0Var3;
        List list4;
        ?? r18;
        Iterator it3;
        boolean z7;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        zlw0 zlw0VarG1;
        kxw0 kxw0Var;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        nuj0 nuj0Var;
        String strT;
        Map map6;
        Iterator it5;
        nuj0 nuj0Var2;
        int iIntValue;
        Iterator it6;
        boolean zB;
        nuj0 nuj0Var3;
        ssw0 ssw0Var;
        Integer numValueOf3;
        obw0 obw0Var;
        int i2;
        Integer numValueOf4;
        kxw0 kxw0Var2;
        String str9;
        gx3 gx3Var5;
        Cursor cursor;
        kxw0 kxw0Var3;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        srn srnVar;
        ?? gx3Var6;
        sww0 sww0VarA;
        mmw0 mmw0VarW1;
        long j;
        String strW;
        Map map7;
        int iIntValue2;
        Iterator it7;
        boolean zA;
        Map map8;
        srn srnVar2;
        Integer num2;
        obw0 obw0Var2;
        int iS;
        dgx0 dgx0Var;
        boolean z8;
        String str10;
        gx3 gx3Var7;
        ?? r8;
        String str11;
        ?? r2;
        ?? r38;
        ?? r39;
        ?? Query;
        ?? r310;
        ?? r311;
        ?? r312;
        ?? r313;
        Integer numValueOf6;
        List list6;
        ?? r314;
        List arrayList4;
        gx3 gx3Var8;
        int i3;
        ?? r6;
        Object obj3;
        ?? r9;
        ?? r19;
        ?? r110;
        List arrayList5;
        kxw0 kxw0Var4 = (kxw0) this.b;
        s0x.E(str);
        s0x.H(list);
        s0x.H(list2);
        this.e = str;
        this.f = new HashSet();
        this.g = new gx3();
        this.h = l;
        this.i = l2;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((sww0) it8.next()).w())) {
                z2 = true;
                break;
            }
        }
        vhw0.a();
        boolean zX1 = kxw0Var4.d.x1(this.e, btw0.F0);
        vhw0.a();
        boolean zX2 = kxw0Var4.d.x1(this.e, btw0.E0);
        m6x0 m6x0Var2 = this.c;
        if (z2) {
            zlw0 zlw0VarG2 = m6x0Var2.g0();
            String str12 = this.e;
            zlw0VarG2.n1();
            zlw0VarG2.m1();
            s0x.E(str12);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                zlw0VarG2.c2().update("events", contentValues2, "app_id = ?", new String[]{str12});
            } catch (SQLiteException e) {
                ((kxw0) zlw0VarG2.b).r().g.c(uuw0.q1(str12), e, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map9 = Collections.EMPTY_MAP;
        String str13 = "Failed to merge filter. appId";
        Object objQ1 = "Database error querying filters. appId";
        String str14 = "audience_id";
        try {
            try {
                try {
                    if (zX2 && zX1) {
                        zlw0 zlw0VarG3 = m6x0Var2.g0();
                        kxw0 kxw0Var5 = (kxw0) zlw0VarG3.b;
                        String str15 = this.e;
                        s0x.E(str15);
                        z3 = z2;
                        gx3 gx3Var9 = new gx3();
                        try {
                            ?? Query2 = zlw0VarG3.c2().query("event_filters", new String[]{"audience_id", RemoteMessageConst.DATA}, "app_id=?", new String[]{str15}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = RemoteMessageConst.DATA;
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    jsw0 jsw0Var = (jsw0) ((hsw0) r6x0.X1(jsw0.D(), Query2.getBlob(1))).e();
                                                    if (jsw0Var.x()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) gx3Var9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            gx3Var9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(jsw0Var);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query2;
                                                    kxw0Var5.r().g.c(uuw0.q1(str15), e2, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r9 = r110;
                                                    try {
                                                        kxw0Var5.r().g.c(uuw0.q1(str15), e, "Database error querying filters. appId");
                                                        map9 = Collections.EMPTY_MAP;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        map = map9;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r9 = r19;
                                                    if (r9 != 0) {
                                                        r9.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query2;
                                                r9 = r110;
                                                kxw0Var5.r().g.c(uuw0.q1(str15), e, "Database error querying filters. appId");
                                                map9 = Collections.EMPTY_MAP;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                map = map9;
                                                zlw0 zlw0VarG4 = m6x0Var2.g0();
                                                obj = (kxw0) zlw0VarG4.b;
                                                r5 = this.e;
                                                zlw0VarG4.n1();
                                                zlw0VarG4.m1();
                                                s0x.E(r5);
                                                cursorQuery = zlw0VarG4.c2().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    gx3Var8 = new gx3();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                txw0 txw0Var4 = (txw0) ((rxw0) r6x0.X1(txw0.z(), cursorQuery.getBlob(1))).e();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                gx3Var8.put(objValueOf, txw0Var4);
                                                                str3 = str13;
                                                                obj2 = objQ1;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                quw0 quw0Var = r17.r().g;
                                                                str3 = str13;
                                                                str13 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objQ1;
                                                                try {
                                                                    objQ1 = uuw0.q1(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    quw0Var.d("Failed to merge filter results. appId, audienceId, error", objQ1, numValueOf8, e5);
                                                                    obj3 = quw0Var;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.r().g.c(uuw0.q1(r21), e, "Database error querying filter results. appId");
                                                                    Map map10 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map10;
                                                                    if (map2.isEmpty()) {
                                                                        r10 = obj2;
                                                                        m6x0Var = m6x0Var2;
                                                                        str5 = "audience_id";
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str16 = this.e;
                                                                            zlw0VarG0 = m6x0Var2.g0();
                                                                            str6 = this.e;
                                                                            zlw0VarG0.n1();
                                                                            zlw0VarG0.m1();
                                                                            s0x.E(str6);
                                                                            gx3Var3 = new gx3();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = zlw0VarG0.c2().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) gx3Var3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    gx3Var3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            gx3Var3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((kxw0) zlw0VarG0.b).r().g.c(uuw0.q1(str6), e, "Database error querying scoped filters. appId");
                                                                                        gx3Var3 = Collections.EMPTY_MAP;
                                                                                        r0 = gx3Var3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        s0x.E(str16);
                                                                                        gx3Var4 = new gx3();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                txw0Var3 = (txw0) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                z7 = zX1;
                                                                                                gx3Var4.put(num, txw0Var3);
                                                                                                r0 = r18;
                                                                                                str14 = str14;
                                                                                                it2 = it3;
                                                                                                zX1 = z7;
                                                                                            }
                                                                                        }
                                                                                        str4 = str14;
                                                                                        z4 = zX1;
                                                                                        map3 = gx3Var4;
                                                                                        map5 = map2;
                                                                                        map4 = map3;
                                                                                        for (Integer num3 : hashSet) {
                                                                                            num3.getClass();
                                                                                            txw0Var = (txw0) map4.get(num3);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            gx3Var = new gx3();
                                                                                            if (txw0Var != null) {
                                                                                                for (pww0 pww0Var : txw0Var.v()) {
                                                                                                    if (pww0Var.r()) {
                                                                                                        txw0 txw0Var5 = txw0Var;
                                                                                                        Integer numValueOf9 = Integer.valueOf(pww0Var.s());
                                                                                                        if (pww0Var.t()) {
                                                                                                            lValueOf = Long.valueOf(pww0Var.u());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        gx3Var.put(numValueOf9, lValueOf);
                                                                                                        txw0Var = txw0Var5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            txw0Var2 = txw0Var;
                                                                                            gx3Var2 = new gx3();
                                                                                            if (txw0Var2 != null) {
                                                                                                it = txw0Var2.x().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    wxw0Var = (wxw0) it.next();
                                                                                                    if (!wxw0Var.r()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map11 = map4;
                                                                                            if (txw0Var2 != null) {
                                                                                                i = 0;
                                                                                                while (i < txw0Var2.s() * 64) {
                                                                                                    if (r6x0.R1((wew0) txw0Var2.r(), i)) {
                                                                                                        z6 = zX2;
                                                                                                        kxw0Var4.r().o.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i);
                                                                                                        if (r6x0.R1((wew0) txw0Var2.t(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zX2 = z6;
                                                                                                    } else {
                                                                                                        z6 = zX2;
                                                                                                    }
                                                                                                    gx3Var.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zX2 = z6;
                                                                                                }
                                                                                            }
                                                                                            z5 = zX2;
                                                                                            txw0 txw0Var6 = (txw0) map5.get(num3);
                                                                                            if (z5) {
                                                                                                for (jsw0 jsw0Var2 : list3) {
                                                                                                    int iS2 = jsw0Var2.s();
                                                                                                    Integer num4 = num3;
                                                                                                    jLongValue = this.i.longValue() / 1000;
                                                                                                    if (jsw0Var2.A()) {
                                                                                                        jLongValue = this.h.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iS2);
                                                                                                    if (gx3Var.containsKey(numValueOf)) {
                                                                                                        gx3Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (gx3Var2.containsKey(numValueOf)) {
                                                                                                        gx3Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num3 = num4;
                                                                                                }
                                                                                            }
                                                                                            this.g.put(num3, new dgx0(this, this.e, txw0Var6, bitSet, bitSet2, gx3Var, gx3Var2));
                                                                                            m6x0Var2 = m6x0Var2;
                                                                                            zX2 = z5;
                                                                                            map5 = map5;
                                                                                            obj2 = obj2;
                                                                                            map = map;
                                                                                            str3 = str3;
                                                                                            map4 = map11;
                                                                                        }
                                                                                        r10 = obj2;
                                                                                        m6x0Var = m6x0Var2;
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str17 = str3;
                                                                                        if (!list.isEmpty()) {
                                                                                            srnVar = new srn(this);
                                                                                            gx3Var6 = new gx3();
                                                                                            for (sww0 sww0Var : list) {
                                                                                                sww0VarA = srnVar.a(sww0Var, this.e);
                                                                                                if (sww0VarA != null) {
                                                                                                    mmw0VarW1 = m6x0Var.g0().W1(this.e, sww0Var, sww0VarA.w());
                                                                                                    m6x0Var.g0().N1("events", mmw0VarW1);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = mmw0VarW1.c;
                                                                                                        strW = sww0VarA.w();
                                                                                                        map7 = (Map) gx3Var6.get(strW);
                                                                                                        if (map7 == null) {
                                                                                                            zlw0 zlw0VarG5 = m6x0Var.g0();
                                                                                                            kxw0 kxw0Var6 = (kxw0) zlw0VarG5.b;
                                                                                                            str10 = this.e;
                                                                                                            zlw0VarG5.n1();
                                                                                                            zlw0VarG5.m1();
                                                                                                            s0x.E(str10);
                                                                                                            s0x.E(strW);
                                                                                                            gx3Var7 = new gx3();
                                                                                                            try {
                                                                                                                Query = zlw0VarG5.c2().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str11 = str10;
                                                                                                                            Query = Query;
                                                                                                                            r312 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        jsw0 jsw0Var3 = (jsw0) ((hsw0) r6x0.X1(jsw0.D(), Query.getBlob(1))).e();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) gx3Var7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r312 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                gx3Var7.put(numValueOf6, arrayList4);
                                                                                                                                                r314 = r312;
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                r311 = r312;
                                                                                                                                                r2 = r311;
                                                                                                                                                r38 = r311;
                                                                                                                                                try {
                                                                                                                                                    kxw0Var6.r().g.c(uuw0.q1(str11), e, r10);
                                                                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                                                                    r39 = r38;
                                                                                                                                                    if (r2 != 0) {
                                                                                                                                                        r2.close();
                                                                                                                                                        r39 = r38;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r8 = r2;
                                                                                                                                                    if (r8 != 0) {
                                                                                                                                                        r8.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r310 = r312;
                                                                                                                                                r8 = r310;
                                                                                                                                                if (r8 != 0) {
                                                                                                                                                    r8.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r314 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(jsw0Var3);
                                                                                                                                        r313 = r314;
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        r313 = Query;
                                                                                                                                        kxw0Var6.r().g.c(uuw0.q1(str11), e9, str17);
                                                                                                                                    }
                                                                                                                                    if (!r313.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r313;
                                                                                                                                    r312 = r313;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    r311 = Query;
                                                                                                                                    r2 = r311;
                                                                                                                                    r38 = r311;
                                                                                                                                    kxw0Var6.r().g.c(uuw0.q1(str11), e, r10);
                                                                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                                                                    r39 = r38;
                                                                                                                                    if (r2 != 0) {
                                                                                                                                        r2.close();
                                                                                                                                        r39 = r38;
                                                                                                                                    }
                                                                                                                                    gx3Var6.put(strW, map7);
                                                                                                                                    list = r39;
                                                                                                                                    for (Integer num5 : map7.keySet()) {
                                                                                                                                        iIntValue2 = num5.intValue();
                                                                                                                                        if (this.f.contains(num5)) {
                                                                                                                                            kxw0Var4.r().o.b(num5, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it7 = ((List) map7.get(num5)).iterator();
                                                                                                                                            zA = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it7.hasNext()) {
                                                                                                                                                    map8 = map7;
                                                                                                                                                    srnVar2 = srnVar;
                                                                                                                                                    num2 = num5;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                jsw0 jsw0Var4 = (jsw0) it7.next();
                                                                                                                                                map8 = map7;
                                                                                                                                                srnVar2 = srnVar;
                                                                                                                                                num2 = num5;
                                                                                                                                                obw0Var2 = new obw0(this, this.e, iIntValue2, jsw0Var4, (byte) 0);
                                                                                                                                                Long l3 = this.h;
                                                                                                                                                Long l4 = this.i;
                                                                                                                                                iS = jsw0Var4.s();
                                                                                                                                                dgx0Var = (dgx0) this.g.get(num2);
                                                                                                                                                if (dgx0Var == null) {
                                                                                                                                                    z8 = false;
                                                                                                                                                } else {
                                                                                                                                                    z8 = dgx0Var.d.get(iS);
                                                                                                                                                }
                                                                                                                                                zA = obw0Var2.a(l3, l4, sww0VarA, j, mmw0VarW1, z8);
                                                                                                                                                if (!zA) {
                                                                                                                                                    this.f.add(num2);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                r1(num2).a(obw0Var2);
                                                                                                                                                num5 = num2;
                                                                                                                                                map7 = map8;
                                                                                                                                                srnVar = srnVar2;
                                                                                                                                            }
                                                                                                                                            if (!zA) {
                                                                                                                                                this.f.add(num2);
                                                                                                                                            }
                                                                                                                                            srnVar = srnVar2;
                                                                                                                                            map7 = map8;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r313.close();
                                                                                                                            map7 = gx3Var7;
                                                                                                                            r39 = r313;
                                                                                                                        } else {
                                                                                                                            ?? r315 = Query;
                                                                                                                            map7 = Collections.EMPTY_MAP;
                                                                                                                            r315.close();
                                                                                                                            r39 = r315;
                                                                                                                        }
                                                                                                                    } catch (SQLiteException e11) {
                                                                                                                        e = e11;
                                                                                                                        str11 = str10;
                                                                                                                    }
                                                                                                                } catch (Throwable th5) {
                                                                                                                    th = th5;
                                                                                                                    r310 = Query;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str11 = str10;
                                                                                                                r2 = 0;
                                                                                                                r38 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r8 = 0;
                                                                                                            }
                                                                                                            gx3Var6.put(strW, map7);
                                                                                                            list = r39;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r19.hasNext()) {
                                                                                                            iIntValue2 = num5.intValue();
                                                                                                            if (this.f.contains(num5)) {
                                                                                                                kxw0Var4.r().o.b(num5, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it7 = ((List) map7.get(num5)).iterator();
                                                                                                                zA = true;
                                                                                                                while (true) {
                                                                                                                    if (!it7.hasNext()) {
                                                                                                                        map8 = map7;
                                                                                                                        srnVar2 = srnVar;
                                                                                                                        num2 = num5;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    jsw0 jsw0Var5 = (jsw0) it7.next();
                                                                                                                    map8 = map7;
                                                                                                                    srnVar2 = srnVar;
                                                                                                                    num2 = num5;
                                                                                                                    obw0Var2 = new obw0(this, this.e, iIntValue2, jsw0Var5, (byte) 0);
                                                                                                                    Long l5 = this.h;
                                                                                                                    Long l6 = this.i;
                                                                                                                    iS = jsw0Var5.s();
                                                                                                                    dgx0Var = (dgx0) this.g.get(num2);
                                                                                                                    if (dgx0Var == null) {
                                                                                                                        z8 = false;
                                                                                                                    } else {
                                                                                                                        z8 = dgx0Var.d.get(iS);
                                                                                                                    }
                                                                                                                    zA = obw0Var2.a(l5, l6, sww0VarA, j, mmw0VarW1, z8);
                                                                                                                    if (!zA) {
                                                                                                                        this.f.add(num2);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    r1(num2).a(obw0Var2);
                                                                                                                    num5 = num2;
                                                                                                                    map7 = map8;
                                                                                                                    srnVar = srnVar2;
                                                                                                                }
                                                                                                                if (!zA) {
                                                                                                                    this.f.add(num2);
                                                                                                                }
                                                                                                                srnVar = srnVar2;
                                                                                                                map7 = map8;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            gx3 gx3Var10 = new gx3();
                                                                                            it4 = list2.iterator();
                                                                                            nuj0Var = gx3Var10;
                                                                                            while (it4.hasNext()) {
                                                                                                eyw0 eyw0Var = (eyw0) it4.next();
                                                                                                strT = eyw0Var.t();
                                                                                                map6 = (Map) nuj0Var.get(strT);
                                                                                                if (map6 == null) {
                                                                                                    zlw0 zlw0VarG6 = m6x0Var.g0();
                                                                                                    kxw0Var2 = (kxw0) zlw0VarG6.b;
                                                                                                    str9 = this.e;
                                                                                                    zlw0VarG6.n1();
                                                                                                    zlw0VarG6.m1();
                                                                                                    s0x.E(str9);
                                                                                                    s0x.E(strT);
                                                                                                    gx3Var5 = new gx3();
                                                                                                    try {
                                                                                                        cursorQuery2 = zlw0VarG6.c2().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                ssw0 ssw0Var2 = (ssw0) ((rsw0) r6x0.X1(ssw0.z(), cursorQuery2.getBlob(1))).e();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) gx3Var5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    kxw0Var3 = kxw0Var2;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        gx3Var5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str7 = str7;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            kxw0Var3.r().g.c(uuw0.q1(str9), e, r10);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            nuj0Var.put(strT, map6);
                                                                                                                                            nuj0Var2 = nuj0Var;
                                                                                                                                            for (Integer num6 : map6.keySet()) {
                                                                                                                                                iIntValue = num6.intValue();
                                                                                                                                                if (this.f.contains(num6)) {
                                                                                                                                                    kxw0Var4.r().o.b(num6, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it6 = ((List) map6.get(num6)).iterator();
                                                                                                                                                zB = true;
                                                                                                                                                nuj0Var3 = nuj0Var2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it6.hasNext()) {
                                                                                                                                                        ssw0Var = (ssw0) it6.next();
                                                                                                                                                        if (Log.isLoggable(kxw0Var4.r().s1(), 2)) {
                                                                                                                                                            quw0 quw0Var2 = kxw0Var4.r().o;
                                                                                                                                                            if (ssw0Var.r()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(ssw0Var.s());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            quw0Var2.d("Evaluating filter. audience, filter, property", num6, numValueOf4, kxw0Var4.j.c(ssw0Var.t()));
                                                                                                                                                            kxw0Var4.r().o.b(m6x0Var.j0().O1(ssw0Var), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (ssw0Var.r()) {
                                                                                                                                                        }
                                                                                                                                                        quw0 quw0Var3 = kxw0Var4.r().j;
                                                                                                                                                        tuw0 tuw0VarQ1 = uuw0.q1(this.e);
                                                                                                                                                        if (ssw0Var.r()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(ssw0Var.s());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        quw0Var3.c(tuw0VarQ1, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                                        this.f.add(num6);
                                                                                                                                                        map6 = map6;
                                                                                                                                                        nuj0Var2 = nuj0Var3;
                                                                                                                                                    } else {
                                                                                                                                                        map6 = map6;
                                                                                                                                                        nuj0Var3 = nuj0Var3;
                                                                                                                                                    }
                                                                                                                                                    if (!zB) {
                                                                                                                                                        this.f.add(num6);
                                                                                                                                                    }
                                                                                                                                                    map6 = map6;
                                                                                                                                                    nuj0Var2 = nuj0Var3;
                                                                                                                                                    r1(num6).a(obw0Var);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map6;
                                                                                                                                                    nuj0Var3 = nuj0Var3;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            str7 = str7;
                                                                                                                                            it4 = it5;
                                                                                                                                            nuj0Var = nuj0Var2;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    kxw0Var3 = kxw0Var2;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(ssw0Var2);
                                                                                                                            } catch (IOException e14) {
                                                                                                                                kxw0Var3 = kxw0Var2;
                                                                                                                                kxw0Var3.r().g.c(uuw0.q1(str9), e14, "Failed to merge filter");
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                kxw0Var2 = kxw0Var3;
                                                                                                                                str7 = str7;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                kxw0Var3.r().g.c(uuw0.q1(str9), e, r10);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            kxw0Var3 = kxw0Var2;
                                                                                                                            str7 = str7;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            kxw0Var3.r().g.c(uuw0.q1(str9), e, r10);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            nuj0Var.put(strT, map6);
                                                                                                                            nuj0Var2 = nuj0Var;
                                                                                                                            while (r3.hasNext()) {
                                                                                                                                iIntValue = num6.intValue();
                                                                                                                                if (this.f.contains(num6)) {
                                                                                                                                    kxw0Var4.r().o.b(num6, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it6 = ((List) map6.get(num6)).iterator();
                                                                                                                                zB = true;
                                                                                                                                nuj0Var3 = nuj0Var2;
                                                                                                                                while (true) {
                                                                                                                                    if (it6.hasNext()) {
                                                                                                                                        ssw0Var = (ssw0) it6.next();
                                                                                                                                        if (Log.isLoggable(kxw0Var4.r().s1(), 2)) {
                                                                                                                                            quw0 quw0Var4 = kxw0Var4.r().o;
                                                                                                                                            if (ssw0Var.r()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(ssw0Var.s());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            quw0Var4.d("Evaluating filter. audience, filter, property", num6, numValueOf4, kxw0Var4.j.c(ssw0Var.t()));
                                                                                                                                            kxw0Var4.r().o.b(m6x0Var.j0().O1(ssw0Var), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (ssw0Var.r()) {
                                                                                                                                        }
                                                                                                                                        quw0 quw0Var5 = kxw0Var4.r().j;
                                                                                                                                        tuw0 tuw0VarQ2 = uuw0.q1(this.e);
                                                                                                                                        if (ssw0Var.r()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(ssw0Var.s());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        quw0Var5.c(tuw0VarQ2, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                        this.f.add(num6);
                                                                                                                                        map6 = map6;
                                                                                                                                        nuj0Var2 = nuj0Var3;
                                                                                                                                    } else {
                                                                                                                                        map6 = map6;
                                                                                                                                        nuj0Var3 = nuj0Var3;
                                                                                                                                    }
                                                                                                                                    if (!zB) {
                                                                                                                                        this.f.add(num6);
                                                                                                                                    }
                                                                                                                                    map6 = map6;
                                                                                                                                    nuj0Var2 = nuj0Var3;
                                                                                                                                    r1(num6).a(obw0Var);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map6;
                                                                                                                                    nuj0Var3 = nuj0Var3;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            str7 = str7;
                                                                                                                            it4 = it5;
                                                                                                                            nuj0Var = nuj0Var2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = gx3Var5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    str7 = str7;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (Throwable th8) {
                                                                                                                th = th8;
                                                                                                                cursor = cursorQuery2;
                                                                                                                if (cursor != null) {
                                                                                                                    cursor.close();
                                                                                                                }
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (SQLiteException e17) {
                                                                                                            e = e17;
                                                                                                            it5 = it4;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        kxw0Var3 = kxw0Var2;
                                                                                                        str7 = str7;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                    nuj0Var.put(strT, map6);
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                    str7 = str7;
                                                                                                }
                                                                                                nuj0Var2 = nuj0Var;
                                                                                                while (r3.hasNext()) {
                                                                                                    iIntValue = num6.intValue();
                                                                                                    if (this.f.contains(num6)) {
                                                                                                        kxw0Var4.r().o.b(num6, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it6 = ((List) map6.get(num6)).iterator();
                                                                                                    zB = true;
                                                                                                    nuj0Var3 = nuj0Var2;
                                                                                                    while (true) {
                                                                                                        if (it6.hasNext()) {
                                                                                                            ssw0Var = (ssw0) it6.next();
                                                                                                            if (Log.isLoggable(kxw0Var4.r().s1(), 2)) {
                                                                                                                quw0 quw0Var6 = kxw0Var4.r().o;
                                                                                                                if (ssw0Var.r()) {
                                                                                                                    numValueOf4 = Integer.valueOf(ssw0Var.s());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                quw0Var6.d("Evaluating filter. audience, filter, property", num6, numValueOf4, kxw0Var4.j.c(ssw0Var.t()));
                                                                                                                kxw0Var4.r().o.b(m6x0Var.j0().O1(ssw0Var), "Filter definition");
                                                                                                            }
                                                                                                            if (ssw0Var.r()) {
                                                                                                            }
                                                                                                            quw0 quw0Var7 = kxw0Var4.r().j;
                                                                                                            tuw0 tuw0VarQ3 = uuw0.q1(this.e);
                                                                                                            if (ssw0Var.r()) {
                                                                                                                numValueOf3 = Integer.valueOf(ssw0Var.s());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            quw0Var7.c(tuw0VarQ3, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                            this.f.add(num6);
                                                                                                            map6 = map6;
                                                                                                            nuj0Var2 = nuj0Var3;
                                                                                                        } else {
                                                                                                            map6 = map6;
                                                                                                            nuj0Var3 = nuj0Var3;
                                                                                                        }
                                                                                                        if (!zB) {
                                                                                                            this.f.add(num6);
                                                                                                        }
                                                                                                        map6 = map6;
                                                                                                        nuj0Var2 = nuj0Var3;
                                                                                                        r1(num6).a(obw0Var);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map6;
                                                                                                        nuj0Var3 = nuj0Var3;
                                                                                                    }
                                                                                                }
                                                                                                str7 = str7;
                                                                                                it4 = it5;
                                                                                                nuj0Var = nuj0Var2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        cx3<Integer> cx3Var = (cx3) this.g.keySet();
                                                                                        cx3Var.removeAll(this.f);
                                                                                        for (Integer num7 : cx3Var) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            dgx0 dgx0Var2 = (dgx0) this.g.get(num7);
                                                                                            s0x.H(dgx0Var2);
                                                                                            tvw0 tvw0VarB = dgx0Var2.b(iIntValue3);
                                                                                            arrayList2.add(tvw0VarB);
                                                                                            zlw0VarG1 = m6x0Var.g0();
                                                                                            kxw0Var = (kxw0) zlw0VarG1.b;
                                                                                            str8 = this.e;
                                                                                            txw0 txw0VarT = tvw0VarB.t();
                                                                                            zlw0VarG1.n1();
                                                                                            zlw0VarG1.m1();
                                                                                            s0x.E(str8);
                                                                                            s0x.H(txw0VarT);
                                                                                            byte[] bArrA = txw0VarT.a();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrA);
                                                                                            try {
                                                                                                try {
                                                                                                    if (zlw0VarG1.c2().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        kxw0Var.r().g.b(uuw0.q1(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    kxw0Var.r().g.c(uuw0.q1(str8), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = gx3Var3;
                                                                                s0x.E(str16);
                                                                                gx3Var4 = new gx3();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        txw0Var3 = (txw0) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        z7 = zX1;
                                                                                        gx3Var4.put(num, txw0Var3);
                                                                                        r0 = r18;
                                                                                        str14 = str14;
                                                                                        it2 = it3;
                                                                                        zX1 = z7;
                                                                                    }
                                                                                }
                                                                                str4 = str14;
                                                                                z4 = zX1;
                                                                                map3 = gx3Var4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            z4 = zX1;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map2;
                                                                        map4 = map3;
                                                                        while (r17.hasNext()) {
                                                                            num3.getClass();
                                                                            txw0Var = (txw0) map4.get(num3);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            gx3Var = new gx3();
                                                                            if (txw0Var != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (pww0Var.r()) {
                                                                                        txw0 txw0Var7 = txw0Var;
                                                                                        Integer numValueOf10 = Integer.valueOf(pww0Var.s());
                                                                                        if (pww0Var.t()) {
                                                                                            lValueOf = Long.valueOf(pww0Var.u());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        gx3Var.put(numValueOf10, lValueOf);
                                                                                        txw0Var = txw0Var7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            txw0Var2 = txw0Var;
                                                                            gx3Var2 = new gx3();
                                                                            if (txw0Var2 != null) {
                                                                                it = txw0Var2.x().iterator();
                                                                                while (it.hasNext()) {
                                                                                    wxw0Var = (wxw0) it.next();
                                                                                    if (!wxw0Var.r()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map12 = map4;
                                                                            if (txw0Var2 != null) {
                                                                                i = 0;
                                                                                while (i < txw0Var2.s() * 64) {
                                                                                    if (r6x0.R1((wew0) txw0Var2.r(), i)) {
                                                                                        z6 = zX2;
                                                                                        kxw0Var4.r().o.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i);
                                                                                        if (r6x0.R1((wew0) txw0Var2.t(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zX2 = z6;
                                                                                    } else {
                                                                                        z6 = zX2;
                                                                                    }
                                                                                    gx3Var.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zX2 = z6;
                                                                                }
                                                                            }
                                                                            z5 = zX2;
                                                                            txw0 txw0Var8 = (txw0) map5.get(num3);
                                                                            if (z5) {
                                                                                while (r2.hasNext()) {
                                                                                    int iS3 = jsw0Var2.s();
                                                                                    Integer num8 = num3;
                                                                                    jLongValue = this.i.longValue() / 1000;
                                                                                    if (jsw0Var2.A()) {
                                                                                        jLongValue = this.h.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iS3);
                                                                                    if (gx3Var.containsKey(numValueOf)) {
                                                                                        gx3Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (gx3Var2.containsKey(numValueOf)) {
                                                                                        gx3Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num3 = num8;
                                                                                }
                                                                            }
                                                                            this.g.put(num3, new dgx0(this, this.e, txw0Var8, bitSet, bitSet2, gx3Var, gx3Var2));
                                                                            m6x0Var2 = m6x0Var2;
                                                                            zX2 = z5;
                                                                            map5 = map5;
                                                                            obj2 = obj2;
                                                                            map = map;
                                                                            str3 = str3;
                                                                            map4 = map12;
                                                                        }
                                                                        r10 = obj2;
                                                                        m6x0Var = m6x0Var2;
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str18 = str3;
                                                                    if (!list.isEmpty()) {
                                                                        srnVar = new srn(this);
                                                                        gx3Var6 = new gx3();
                                                                        while (r17.hasNext()) {
                                                                            sww0VarA = srnVar.a(sww0Var, this.e);
                                                                            if (sww0VarA != null) {
                                                                                mmw0VarW1 = m6x0Var.g0().W1(this.e, sww0Var, sww0VarA.w());
                                                                                m6x0Var.g0().N1("events", mmw0VarW1);
                                                                                if (z) {
                                                                                    j = mmw0VarW1.c;
                                                                                    strW = sww0VarA.w();
                                                                                    map7 = (Map) gx3Var6.get(strW);
                                                                                    if (map7 == null) {
                                                                                        zlw0 zlw0VarG7 = m6x0Var.g0();
                                                                                        kxw0 kxw0Var7 = (kxw0) zlw0VarG7.b;
                                                                                        str10 = this.e;
                                                                                        zlw0VarG7.n1();
                                                                                        zlw0VarG7.m1();
                                                                                        s0x.E(str10);
                                                                                        s0x.E(strW);
                                                                                        gx3Var7 = new gx3();
                                                                                        Query = zlw0VarG7.c2().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str11 = str10;
                                                                                            Query = Query;
                                                                                            r312 = list;
                                                                                            while (true) {
                                                                                                jsw0 jsw0Var6 = (jsw0) ((hsw0) r6x0.X1(jsw0.D(), Query.getBlob(1))).e();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) gx3Var7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r312 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    gx3Var7.put(numValueOf6, arrayList4);
                                                                                                    r314 = r312;
                                                                                                } else {
                                                                                                    r314 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(jsw0Var6);
                                                                                                r313 = r314;
                                                                                                if (!r313.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r313;
                                                                                                r312 = r313;
                                                                                            }
                                                                                            r313.close();
                                                                                            map7 = gx3Var7;
                                                                                            r39 = r313;
                                                                                        } else {
                                                                                            ?? r316 = Query;
                                                                                            map7 = Collections.EMPTY_MAP;
                                                                                            r316.close();
                                                                                            r39 = r316;
                                                                                        }
                                                                                        gx3Var6.put(strW, map7);
                                                                                        list = r39;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r19.hasNext()) {
                                                                                        iIntValue2 = num5.intValue();
                                                                                        if (this.f.contains(num5)) {
                                                                                            kxw0Var4.r().o.b(num5, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it7 = ((List) map7.get(num5)).iterator();
                                                                                            zA = true;
                                                                                            while (true) {
                                                                                                if (!it7.hasNext()) {
                                                                                                    map8 = map7;
                                                                                                    srnVar2 = srnVar;
                                                                                                    num2 = num5;
                                                                                                    break;
                                                                                                }
                                                                                                jsw0 jsw0Var7 = (jsw0) it7.next();
                                                                                                map8 = map7;
                                                                                                srnVar2 = srnVar;
                                                                                                num2 = num5;
                                                                                                obw0Var2 = new obw0(this, this.e, iIntValue2, jsw0Var7, (byte) 0);
                                                                                                Long l7 = this.h;
                                                                                                Long l8 = this.i;
                                                                                                iS = jsw0Var7.s();
                                                                                                dgx0Var = (dgx0) this.g.get(num2);
                                                                                                if (dgx0Var == null) {
                                                                                                    z8 = false;
                                                                                                } else {
                                                                                                    z8 = dgx0Var.d.get(iS);
                                                                                                }
                                                                                                zA = obw0Var2.a(l7, l8, sww0VarA, j, mmw0VarW1, z8);
                                                                                                if (!zA) {
                                                                                                    this.f.add(num2);
                                                                                                    break;
                                                                                                }
                                                                                                r1(num2).a(obw0Var2);
                                                                                                num5 = num2;
                                                                                                map7 = map8;
                                                                                                srnVar = srnVar2;
                                                                                            }
                                                                                            if (!zA) {
                                                                                                this.f.add(num2);
                                                                                            }
                                                                                            srnVar = srnVar2;
                                                                                            map7 = map8;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        gx3 gx3Var11 = new gx3();
                                                                        it4 = list2.iterator();
                                                                        nuj0Var = gx3Var11;
                                                                        while (it4.hasNext()) {
                                                                            eyw0 eyw0Var2 = (eyw0) it4.next();
                                                                            strT = eyw0Var2.t();
                                                                            map6 = (Map) nuj0Var.get(strT);
                                                                            if (map6 == null) {
                                                                                zlw0 zlw0VarG8 = m6x0Var.g0();
                                                                                kxw0Var2 = (kxw0) zlw0VarG8.b;
                                                                                str9 = this.e;
                                                                                zlw0VarG8.n1();
                                                                                zlw0VarG8.m1();
                                                                                s0x.E(str9);
                                                                                s0x.E(strT);
                                                                                gx3Var5 = new gx3();
                                                                                cursorQuery2 = zlw0VarG8.c2().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        ssw0 ssw0Var3 = (ssw0) ((rsw0) r6x0.X1(ssw0.z(), cursorQuery2.getBlob(1))).e();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) gx3Var5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            kxw0Var3 = kxw0Var2;
                                                                                            arrayList3 = new ArrayList();
                                                                                            gx3Var5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            kxw0Var3 = kxw0Var2;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(ssw0Var3);
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        kxw0Var2 = kxw0Var3;
                                                                                        str7 = str7;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = gx3Var5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    str7 = str7;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                nuj0Var.put(strT, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                                str7 = str7;
                                                                            }
                                                                            nuj0Var2 = nuj0Var;
                                                                            while (r3.hasNext()) {
                                                                                iIntValue = num6.intValue();
                                                                                if (this.f.contains(num6)) {
                                                                                    kxw0Var4.r().o.b(num6, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it6 = ((List) map6.get(num6)).iterator();
                                                                                zB = true;
                                                                                nuj0Var3 = nuj0Var2;
                                                                                while (true) {
                                                                                    if (it6.hasNext()) {
                                                                                        ssw0Var = (ssw0) it6.next();
                                                                                        if (Log.isLoggable(kxw0Var4.r().s1(), 2)) {
                                                                                            quw0 quw0Var8 = kxw0Var4.r().o;
                                                                                            if (ssw0Var.r()) {
                                                                                                numValueOf4 = Integer.valueOf(ssw0Var.s());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            quw0Var8.d("Evaluating filter. audience, filter, property", num6, numValueOf4, kxw0Var4.j.c(ssw0Var.t()));
                                                                                            kxw0Var4.r().o.b(m6x0Var.j0().O1(ssw0Var), "Filter definition");
                                                                                        }
                                                                                        if (ssw0Var.r()) {
                                                                                        }
                                                                                        quw0 quw0Var9 = kxw0Var4.r().j;
                                                                                        tuw0 tuw0VarQ4 = uuw0.q1(this.e);
                                                                                        if (ssw0Var.r()) {
                                                                                            numValueOf3 = Integer.valueOf(ssw0Var.s());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        quw0Var9.c(tuw0VarQ4, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                        this.f.add(num6);
                                                                                        map6 = map6;
                                                                                        nuj0Var2 = nuj0Var3;
                                                                                    } else {
                                                                                        map6 = map6;
                                                                                        nuj0Var3 = nuj0Var3;
                                                                                    }
                                                                                    if (!zB) {
                                                                                        this.f.add(num6);
                                                                                    }
                                                                                    map6 = map6;
                                                                                    nuj0Var2 = nuj0Var3;
                                                                                    r1(num6).a(obw0Var);
                                                                                    iIntValue = i2;
                                                                                    map6 = map6;
                                                                                    nuj0Var3 = nuj0Var3;
                                                                                }
                                                                            }
                                                                            str7 = str7;
                                                                            it4 = it5;
                                                                            nuj0Var = nuj0Var2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    cx3<Integer> cx3Var2 = (cx3) this.g.keySet();
                                                                    cx3Var2.removeAll(this.f);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        dgx0 dgx0Var3 = (dgx0) this.g.get(num7);
                                                                        s0x.H(dgx0Var3);
                                                                        tvw0 tvw0VarB2 = dgx0Var3.b(iIntValue4);
                                                                        arrayList2.add(tvw0VarB2);
                                                                        zlw0VarG1 = m6x0Var.g0();
                                                                        kxw0Var = (kxw0) zlw0VarG1.b;
                                                                        str8 = this.e;
                                                                        txw0 txw0VarT2 = tvw0VarB2.t();
                                                                        zlw0VarG1.n1();
                                                                        zlw0VarG1.m1();
                                                                        s0x.E(str8);
                                                                        s0x.H(txw0VarT2);
                                                                        byte[] bArrA2 = txw0VarT2.a();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrA2);
                                                                        if (zlw0VarG1.c2().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            kxw0Var.r().g.b(uuw0.q1(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str13 = str3;
                                                                objQ1 = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.r().g.c(uuw0.q1(r21), e, "Database error querying filter results. appId");
                                                                Map map13 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map13;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str13;
                                                            obj2 = objQ1;
                                                            r21 = r21;
                                                            r17.r().g.c(uuw0.q1(r21), e, "Database error querying filter results. appId");
                                                            Map map14 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map14;
                                                            if (map2.isEmpty()) {
                                                                r10 = obj2;
                                                                m6x0Var = m6x0Var2;
                                                                str5 = "audience_id";
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str19 = this.e;
                                                                    zlw0VarG0 = m6x0Var2.g0();
                                                                    str6 = this.e;
                                                                    zlw0VarG0.n1();
                                                                    zlw0VarG0.m1();
                                                                    s0x.E(str6);
                                                                    gx3Var3 = new gx3();
                                                                    cursorRawQuery = zlw0VarG0.c2().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) gx3Var3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                gx3Var3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        gx3Var3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = gx3Var3;
                                                                    s0x.E(str19);
                                                                    gx3Var4 = new gx3();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            txw0Var3 = (txw0) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            z7 = zX1;
                                                                            gx3Var4.put(num, txw0Var3);
                                                                            r0 = r18;
                                                                            str14 = str14;
                                                                            it2 = it3;
                                                                            zX1 = z7;
                                                                        }
                                                                    }
                                                                    str4 = str14;
                                                                    z4 = zX1;
                                                                    map3 = gx3Var4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    z4 = zX1;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map2;
                                                                map4 = map3;
                                                                while (r17.hasNext()) {
                                                                    num3.getClass();
                                                                    txw0Var = (txw0) map4.get(num3);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    gx3Var = new gx3();
                                                                    if (txw0Var != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (pww0Var.r()) {
                                                                                txw0 txw0Var9 = txw0Var;
                                                                                Integer numValueOf11 = Integer.valueOf(pww0Var.s());
                                                                                if (pww0Var.t()) {
                                                                                    lValueOf = Long.valueOf(pww0Var.u());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                gx3Var.put(numValueOf11, lValueOf);
                                                                                txw0Var = txw0Var9;
                                                                            }
                                                                        }
                                                                    }
                                                                    txw0Var2 = txw0Var;
                                                                    gx3Var2 = new gx3();
                                                                    if (txw0Var2 != null) {
                                                                        it = txw0Var2.x().iterator();
                                                                        while (it.hasNext()) {
                                                                            wxw0Var = (wxw0) it.next();
                                                                            if (!wxw0Var.r()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map15 = map4;
                                                                    if (txw0Var2 != null) {
                                                                        i = 0;
                                                                        while (i < txw0Var2.s() * 64) {
                                                                            if (r6x0.R1((wew0) txw0Var2.r(), i)) {
                                                                                z6 = zX2;
                                                                                kxw0Var4.r().o.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i);
                                                                                if (r6x0.R1((wew0) txw0Var2.t(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zX2 = z6;
                                                                            } else {
                                                                                z6 = zX2;
                                                                            }
                                                                            gx3Var.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zX2 = z6;
                                                                        }
                                                                    }
                                                                    z5 = zX2;
                                                                    txw0 txw0Var10 = (txw0) map5.get(num3);
                                                                    if (z5) {
                                                                        while (r2.hasNext()) {
                                                                            int iS4 = jsw0Var2.s();
                                                                            Integer num9 = num3;
                                                                            jLongValue = this.i.longValue() / 1000;
                                                                            if (jsw0Var2.A()) {
                                                                                jLongValue = this.h.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iS4);
                                                                            if (gx3Var.containsKey(numValueOf)) {
                                                                                gx3Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (gx3Var2.containsKey(numValueOf)) {
                                                                                gx3Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num3 = num9;
                                                                        }
                                                                    }
                                                                    this.g.put(num3, new dgx0(this, this.e, txw0Var10, bitSet, bitSet2, gx3Var, gx3Var2));
                                                                    m6x0Var2 = m6x0Var2;
                                                                    zX2 = z5;
                                                                    map5 = map5;
                                                                    obj2 = obj2;
                                                                    map = map;
                                                                    str3 = str3;
                                                                    map4 = map15;
                                                                }
                                                                r10 = obj2;
                                                                m6x0Var = m6x0Var2;
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str110 = str3;
                                                            if (!list.isEmpty()) {
                                                                srnVar = new srn(this);
                                                                gx3Var6 = new gx3();
                                                                while (r17.hasNext()) {
                                                                    sww0VarA = srnVar.a(sww0Var, this.e);
                                                                    if (sww0VarA != null) {
                                                                        mmw0VarW1 = m6x0Var.g0().W1(this.e, sww0Var, sww0VarA.w());
                                                                        m6x0Var.g0().N1("events", mmw0VarW1);
                                                                        if (z) {
                                                                            j = mmw0VarW1.c;
                                                                            strW = sww0VarA.w();
                                                                            map7 = (Map) gx3Var6.get(strW);
                                                                            if (map7 == null) {
                                                                                zlw0 zlw0VarG9 = m6x0Var.g0();
                                                                                kxw0 kxw0Var8 = (kxw0) zlw0VarG9.b;
                                                                                str10 = this.e;
                                                                                zlw0VarG9.n1();
                                                                                zlw0VarG9.m1();
                                                                                s0x.E(str10);
                                                                                s0x.E(strW);
                                                                                gx3Var7 = new gx3();
                                                                                Query = zlw0VarG9.c2().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str11 = str10;
                                                                                    Query = Query;
                                                                                    r312 = list;
                                                                                    while (true) {
                                                                                        jsw0 jsw0Var8 = (jsw0) ((hsw0) r6x0.X1(jsw0.D(), Query.getBlob(1))).e();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) gx3Var7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r312 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            gx3Var7.put(numValueOf6, arrayList4);
                                                                                            r314 = r312;
                                                                                        } else {
                                                                                            r314 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(jsw0Var8);
                                                                                        r313 = r314;
                                                                                        if (!r313.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r313;
                                                                                        r312 = r313;
                                                                                    }
                                                                                    r313.close();
                                                                                    map7 = gx3Var7;
                                                                                    r39 = r313;
                                                                                } else {
                                                                                    ?? r317 = Query;
                                                                                    map7 = Collections.EMPTY_MAP;
                                                                                    r317.close();
                                                                                    r39 = r317;
                                                                                }
                                                                                gx3Var6.put(strW, map7);
                                                                                list = r39;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r19.hasNext()) {
                                                                                iIntValue2 = num5.intValue();
                                                                                if (this.f.contains(num5)) {
                                                                                    kxw0Var4.r().o.b(num5, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it7 = ((List) map7.get(num5)).iterator();
                                                                                    zA = true;
                                                                                    while (true) {
                                                                                        if (!it7.hasNext()) {
                                                                                            map8 = map7;
                                                                                            srnVar2 = srnVar;
                                                                                            num2 = num5;
                                                                                            break;
                                                                                        }
                                                                                        jsw0 jsw0Var9 = (jsw0) it7.next();
                                                                                        map8 = map7;
                                                                                        srnVar2 = srnVar;
                                                                                        num2 = num5;
                                                                                        obw0Var2 = new obw0(this, this.e, iIntValue2, jsw0Var9, (byte) 0);
                                                                                        Long l9 = this.h;
                                                                                        Long l10 = this.i;
                                                                                        iS = jsw0Var9.s();
                                                                                        dgx0Var = (dgx0) this.g.get(num2);
                                                                                        if (dgx0Var == null) {
                                                                                            z8 = false;
                                                                                        } else {
                                                                                            z8 = dgx0Var.d.get(iS);
                                                                                        }
                                                                                        zA = obw0Var2.a(l9, l10, sww0VarA, j, mmw0VarW1, z8);
                                                                                        if (!zA) {
                                                                                            this.f.add(num2);
                                                                                            break;
                                                                                        }
                                                                                        r1(num2).a(obw0Var2);
                                                                                        num5 = num2;
                                                                                        map7 = map8;
                                                                                        srnVar = srnVar2;
                                                                                    }
                                                                                    if (!zA) {
                                                                                        this.f.add(num2);
                                                                                    }
                                                                                    srnVar = srnVar2;
                                                                                    map7 = map8;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                gx3 gx3Var12 = new gx3();
                                                                it4 = list2.iterator();
                                                                nuj0Var = gx3Var12;
                                                                while (it4.hasNext()) {
                                                                    eyw0 eyw0Var3 = (eyw0) it4.next();
                                                                    strT = eyw0Var3.t();
                                                                    map6 = (Map) nuj0Var.get(strT);
                                                                    if (map6 == null) {
                                                                        zlw0 zlw0VarG10 = m6x0Var.g0();
                                                                        kxw0Var2 = (kxw0) zlw0VarG10.b;
                                                                        str9 = this.e;
                                                                        zlw0VarG10.n1();
                                                                        zlw0VarG10.m1();
                                                                        s0x.E(str9);
                                                                        s0x.E(strT);
                                                                        gx3Var5 = new gx3();
                                                                        cursorQuery2 = zlw0VarG10.c2().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                ssw0 ssw0Var4 = (ssw0) ((rsw0) r6x0.X1(ssw0.z(), cursorQuery2.getBlob(1))).e();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) gx3Var5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    kxw0Var3 = kxw0Var2;
                                                                                    arrayList3 = new ArrayList();
                                                                                    gx3Var5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    kxw0Var3 = kxw0Var2;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(ssw0Var4);
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                kxw0Var2 = kxw0Var3;
                                                                                str7 = str7;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = gx3Var5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            str7 = str7;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        nuj0Var.put(strT, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                        str7 = str7;
                                                                    }
                                                                    nuj0Var2 = nuj0Var;
                                                                    while (r3.hasNext()) {
                                                                        iIntValue = num6.intValue();
                                                                        if (this.f.contains(num6)) {
                                                                            kxw0Var4.r().o.b(num6, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it6 = ((List) map6.get(num6)).iterator();
                                                                        zB = true;
                                                                        nuj0Var3 = nuj0Var2;
                                                                        while (true) {
                                                                            if (it6.hasNext()) {
                                                                                ssw0Var = (ssw0) it6.next();
                                                                                if (Log.isLoggable(kxw0Var4.r().s1(), 2)) {
                                                                                    quw0 quw0Var10 = kxw0Var4.r().o;
                                                                                    if (ssw0Var.r()) {
                                                                                        numValueOf4 = Integer.valueOf(ssw0Var.s());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    quw0Var10.d("Evaluating filter. audience, filter, property", num6, numValueOf4, kxw0Var4.j.c(ssw0Var.t()));
                                                                                    kxw0Var4.r().o.b(m6x0Var.j0().O1(ssw0Var), "Filter definition");
                                                                                }
                                                                                if (ssw0Var.r()) {
                                                                                }
                                                                                quw0 quw0Var11 = kxw0Var4.r().j;
                                                                                tuw0 tuw0VarQ5 = uuw0.q1(this.e);
                                                                                if (ssw0Var.r()) {
                                                                                    numValueOf3 = Integer.valueOf(ssw0Var.s());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                quw0Var11.c(tuw0VarQ5, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                this.f.add(num6);
                                                                                map6 = map6;
                                                                                nuj0Var2 = nuj0Var3;
                                                                            } else {
                                                                                map6 = map6;
                                                                                nuj0Var3 = nuj0Var3;
                                                                            }
                                                                            if (!zB) {
                                                                                this.f.add(num6);
                                                                            }
                                                                            map6 = map6;
                                                                            nuj0Var2 = nuj0Var3;
                                                                            r1(num6).a(obw0Var);
                                                                            iIntValue = i2;
                                                                            map6 = map6;
                                                                            nuj0Var3 = nuj0Var3;
                                                                        }
                                                                    }
                                                                    str7 = str7;
                                                                    it4 = it5;
                                                                    nuj0Var = nuj0Var2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            cx3<Integer> cx3Var3 = (cx3) this.g.keySet();
                                                            cx3Var3.removeAll(this.f);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                dgx0 dgx0Var4 = (dgx0) this.g.get(num7);
                                                                s0x.H(dgx0Var4);
                                                                tvw0 tvw0VarB3 = dgx0Var4.b(iIntValue5);
                                                                arrayList2.add(tvw0VarB3);
                                                                zlw0VarG1 = m6x0Var.g0();
                                                                kxw0Var = (kxw0) zlw0VarG1.b;
                                                                str8 = this.e;
                                                                txw0 txw0VarT3 = tvw0VarB3.t();
                                                                zlw0VarG1.n1();
                                                                zlw0VarG1.m1();
                                                                s0x.E(str8);
                                                                s0x.H(txw0VarT3);
                                                                byte[] bArrA3 = txw0VarT3.a();
                                                                contentValues = new ContentValues();
                                                                contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrA3);
                                                                if (zlw0VarG1.c2().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    kxw0Var.r().g.b(uuw0.q1(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = gx3Var8;
                                                } else {
                                                    Map map16 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map16;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    r10 = obj2;
                                                    m6x0Var = m6x0Var2;
                                                    str5 = "audience_id";
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str111 = this.e;
                                                        zlw0VarG0 = m6x0Var2.g0();
                                                        str6 = this.e;
                                                        zlw0VarG0.n1();
                                                        zlw0VarG0.m1();
                                                        s0x.E(str6);
                                                        gx3Var3 = new gx3();
                                                        cursorRawQuery = zlw0VarG0.c2().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) gx3Var3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    gx3Var3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            gx3Var3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = gx3Var3;
                                                        s0x.E(str111);
                                                        gx3Var4 = new gx3();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                txw0Var3 = (txw0) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                z7 = zX1;
                                                                gx3Var4.put(num, txw0Var3);
                                                                r0 = r18;
                                                                str14 = str14;
                                                                it2 = it3;
                                                                zX1 = z7;
                                                            }
                                                        }
                                                        str4 = str14;
                                                        z4 = zX1;
                                                        map3 = gx3Var4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        z4 = zX1;
                                                        map3 = map2;
                                                    }
                                                    map5 = map2;
                                                    map4 = map3;
                                                    while (r17.hasNext()) {
                                                        num3.getClass();
                                                        txw0Var = (txw0) map4.get(num3);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        gx3Var = new gx3();
                                                        if (txw0Var != null) {
                                                            while (r3.hasNext()) {
                                                                if (pww0Var.r()) {
                                                                    txw0 txw0Var11 = txw0Var;
                                                                    Integer numValueOf12 = Integer.valueOf(pww0Var.s());
                                                                    if (pww0Var.t()) {
                                                                        lValueOf = Long.valueOf(pww0Var.u());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    gx3Var.put(numValueOf12, lValueOf);
                                                                    txw0Var = txw0Var11;
                                                                }
                                                            }
                                                        }
                                                        txw0Var2 = txw0Var;
                                                        gx3Var2 = new gx3();
                                                        if (txw0Var2 != null) {
                                                            it = txw0Var2.x().iterator();
                                                            while (it.hasNext()) {
                                                                wxw0Var = (wxw0) it.next();
                                                                if (!wxw0Var.r()) {
                                                                }
                                                            }
                                                        }
                                                        Map map17 = map4;
                                                        if (txw0Var2 != null) {
                                                            i = 0;
                                                            while (i < txw0Var2.s() * 64) {
                                                                if (r6x0.R1((wew0) txw0Var2.r(), i)) {
                                                                    z6 = zX2;
                                                                    kxw0Var4.r().o.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i);
                                                                    if (r6x0.R1((wew0) txw0Var2.t(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zX2 = z6;
                                                                } else {
                                                                    z6 = zX2;
                                                                }
                                                                gx3Var.remove(Integer.valueOf(i));
                                                                i++;
                                                                zX2 = z6;
                                                            }
                                                        }
                                                        z5 = zX2;
                                                        txw0 txw0Var12 = (txw0) map5.get(num3);
                                                        if (z5) {
                                                            while (r2.hasNext()) {
                                                                int iS5 = jsw0Var2.s();
                                                                Integer num10 = num3;
                                                                jLongValue = this.i.longValue() / 1000;
                                                                if (jsw0Var2.A()) {
                                                                    jLongValue = this.h.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iS5);
                                                                if (gx3Var.containsKey(numValueOf)) {
                                                                    gx3Var.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (gx3Var2.containsKey(numValueOf)) {
                                                                    gx3Var2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num3 = num10;
                                                            }
                                                        }
                                                        this.g.put(num3, new dgx0(this, this.e, txw0Var12, bitSet, bitSet2, gx3Var, gx3Var2));
                                                        m6x0Var2 = m6x0Var2;
                                                        zX2 = z5;
                                                        map5 = map5;
                                                        obj2 = obj2;
                                                        map = map;
                                                        str3 = str3;
                                                        map4 = map17;
                                                    }
                                                    r10 = obj2;
                                                    m6x0Var = m6x0Var2;
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str112 = str3;
                                                if (!list.isEmpty()) {
                                                    srnVar = new srn(this);
                                                    gx3Var6 = new gx3();
                                                    while (r17.hasNext()) {
                                                        sww0VarA = srnVar.a(sww0Var, this.e);
                                                        if (sww0VarA != null) {
                                                            mmw0VarW1 = m6x0Var.g0().W1(this.e, sww0Var, sww0VarA.w());
                                                            m6x0Var.g0().N1("events", mmw0VarW1);
                                                            if (z) {
                                                                j = mmw0VarW1.c;
                                                                strW = sww0VarA.w();
                                                                map7 = (Map) gx3Var6.get(strW);
                                                                if (map7 == null) {
                                                                    zlw0 zlw0VarG11 = m6x0Var.g0();
                                                                    kxw0 kxw0Var9 = (kxw0) zlw0VarG11.b;
                                                                    str10 = this.e;
                                                                    zlw0VarG11.n1();
                                                                    zlw0VarG11.m1();
                                                                    s0x.E(str10);
                                                                    s0x.E(strW);
                                                                    gx3Var7 = new gx3();
                                                                    Query = zlw0VarG11.c2().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str11 = str10;
                                                                        Query = Query;
                                                                        r312 = list;
                                                                        while (true) {
                                                                            jsw0 jsw0Var10 = (jsw0) ((hsw0) r6x0.X1(jsw0.D(), Query.getBlob(1))).e();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) gx3Var7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r312 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                gx3Var7.put(numValueOf6, arrayList4);
                                                                                r314 = r312;
                                                                            } else {
                                                                                r314 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(jsw0Var10);
                                                                            r313 = r314;
                                                                            if (!r313.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r313;
                                                                            r312 = r313;
                                                                        }
                                                                        r313.close();
                                                                        map7 = gx3Var7;
                                                                        r39 = r313;
                                                                    } else {
                                                                        ?? r318 = Query;
                                                                        map7 = Collections.EMPTY_MAP;
                                                                        r318.close();
                                                                        r39 = r318;
                                                                    }
                                                                    gx3Var6.put(strW, map7);
                                                                    list = r39;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r19.hasNext()) {
                                                                    iIntValue2 = num5.intValue();
                                                                    if (this.f.contains(num5)) {
                                                                        kxw0Var4.r().o.b(num5, "Skipping failed audience ID");
                                                                    } else {
                                                                        it7 = ((List) map7.get(num5)).iterator();
                                                                        zA = true;
                                                                        while (true) {
                                                                            if (!it7.hasNext()) {
                                                                                map8 = map7;
                                                                                srnVar2 = srnVar;
                                                                                num2 = num5;
                                                                                break;
                                                                            }
                                                                            jsw0 jsw0Var11 = (jsw0) it7.next();
                                                                            map8 = map7;
                                                                            srnVar2 = srnVar;
                                                                            num2 = num5;
                                                                            obw0Var2 = new obw0(this, this.e, iIntValue2, jsw0Var11, (byte) 0);
                                                                            Long l11 = this.h;
                                                                            Long l12 = this.i;
                                                                            iS = jsw0Var11.s();
                                                                            dgx0Var = (dgx0) this.g.get(num2);
                                                                            if (dgx0Var == null) {
                                                                                z8 = false;
                                                                            } else {
                                                                                z8 = dgx0Var.d.get(iS);
                                                                            }
                                                                            zA = obw0Var2.a(l11, l12, sww0VarA, j, mmw0VarW1, z8);
                                                                            if (!zA) {
                                                                                this.f.add(num2);
                                                                                break;
                                                                            }
                                                                            r1(num2).a(obw0Var2);
                                                                            num5 = num2;
                                                                            map7 = map8;
                                                                            srnVar = srnVar2;
                                                                        }
                                                                        if (!zA) {
                                                                            this.f.add(num2);
                                                                        }
                                                                        srnVar = srnVar2;
                                                                        map7 = map8;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    gx3 gx3Var13 = new gx3();
                                                    it4 = list2.iterator();
                                                    nuj0Var = gx3Var13;
                                                    while (it4.hasNext()) {
                                                        eyw0 eyw0Var4 = (eyw0) it4.next();
                                                        strT = eyw0Var4.t();
                                                        map6 = (Map) nuj0Var.get(strT);
                                                        if (map6 == null) {
                                                            zlw0 zlw0VarG12 = m6x0Var.g0();
                                                            kxw0Var2 = (kxw0) zlw0VarG12.b;
                                                            str9 = this.e;
                                                            zlw0VarG12.n1();
                                                            zlw0VarG12.m1();
                                                            s0x.E(str9);
                                                            s0x.E(strT);
                                                            gx3Var5 = new gx3();
                                                            cursorQuery2 = zlw0VarG12.c2().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    ssw0 ssw0Var5 = (ssw0) ((rsw0) r6x0.X1(ssw0.z(), cursorQuery2.getBlob(1))).e();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) gx3Var5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        kxw0Var3 = kxw0Var2;
                                                                        arrayList3 = new ArrayList();
                                                                        gx3Var5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        kxw0Var3 = kxw0Var2;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(ssw0Var5);
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    kxw0Var2 = kxw0Var3;
                                                                    str7 = str7;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = gx3Var5;
                                                            } else {
                                                                it5 = it4;
                                                                str7 = str7;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            nuj0Var.put(strT, map6);
                                                        } else {
                                                            it5 = it4;
                                                            str7 = str7;
                                                        }
                                                        nuj0Var2 = nuj0Var;
                                                        while (r3.hasNext()) {
                                                            iIntValue = num6.intValue();
                                                            if (this.f.contains(num6)) {
                                                                kxw0Var4.r().o.b(num6, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it6 = ((List) map6.get(num6)).iterator();
                                                            zB = true;
                                                            nuj0Var3 = nuj0Var2;
                                                            while (true) {
                                                                if (it6.hasNext()) {
                                                                    ssw0Var = (ssw0) it6.next();
                                                                    if (Log.isLoggable(kxw0Var4.r().s1(), 2)) {
                                                                        quw0 quw0Var12 = kxw0Var4.r().o;
                                                                        if (ssw0Var.r()) {
                                                                            numValueOf4 = Integer.valueOf(ssw0Var.s());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        quw0Var12.d("Evaluating filter. audience, filter, property", num6, numValueOf4, kxw0Var4.j.c(ssw0Var.t()));
                                                                        kxw0Var4.r().o.b(m6x0Var.j0().O1(ssw0Var), "Filter definition");
                                                                    }
                                                                    if (ssw0Var.r()) {
                                                                    }
                                                                    quw0 quw0Var13 = kxw0Var4.r().j;
                                                                    tuw0 tuw0VarQ6 = uuw0.q1(this.e);
                                                                    if (ssw0Var.r()) {
                                                                        numValueOf3 = Integer.valueOf(ssw0Var.s());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    quw0Var13.c(tuw0VarQ6, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                    this.f.add(num6);
                                                                    map6 = map6;
                                                                    nuj0Var2 = nuj0Var3;
                                                                } else {
                                                                    map6 = map6;
                                                                    nuj0Var3 = nuj0Var3;
                                                                }
                                                                if (!zB) {
                                                                    this.f.add(num6);
                                                                }
                                                                map6 = map6;
                                                                nuj0Var2 = nuj0Var3;
                                                                r1(num6).a(obw0Var);
                                                                iIntValue = i2;
                                                                map6 = map6;
                                                                nuj0Var3 = nuj0Var3;
                                                            }
                                                        }
                                                        str7 = str7;
                                                        it4 = it5;
                                                        nuj0Var = nuj0Var2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                cx3<Integer> cx3Var4 = (cx3) this.g.keySet();
                                                cx3Var4.removeAll(this.f);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    dgx0 dgx0Var5 = (dgx0) this.g.get(num7);
                                                    s0x.H(dgx0Var5);
                                                    tvw0 tvw0VarB4 = dgx0Var5.b(iIntValue6);
                                                    arrayList2.add(tvw0VarB4);
                                                    zlw0VarG1 = m6x0Var.g0();
                                                    kxw0Var = (kxw0) zlw0VarG1.b;
                                                    str8 = this.e;
                                                    txw0 txw0VarT4 = tvw0VarB4.t();
                                                    zlw0VarG1.n1();
                                                    zlw0VarG1.m1();
                                                    s0x.E(str8);
                                                    s0x.H(txw0VarT4);
                                                    byte[] bArrA4 = txw0VarT4.a();
                                                    contentValues = new ContentValues();
                                                    contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrA4);
                                                    if (zlw0VarG1.c2().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        kxw0Var.r().g.b(uuw0.q1(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = gx3Var9;
                                    } else {
                                        str2 = RemoteMessageConst.DATA;
                                        Query2.close();
                                    }
                                } catch (SQLiteException e24) {
                                    e = e24;
                                    str2 = RemoteMessageConst.DATA;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                r19 = Query2;
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = RemoteMessageConst.DATA;
                            r9 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r9 = 0;
                        }
                        zlw0 zlw0VarG13 = m6x0Var2.g0();
                        obj = (kxw0) zlw0VarG13.b;
                        r5 = this.e;
                        zlw0VarG13.n1();
                        zlw0VarG13.m1();
                        s0x.E(r5);
                        cursorQuery = zlw0VarG13.c2().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            Map map18 = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            map2 = map18;
                            str3 = "Failed to merge filter. appId";
                            obj2 = "Database error querying filters. appId";
                            obj = obj;
                            r5 = r5;
                        } else {
                            gx3Var8 = new gx3();
                            r17 = obj;
                            r21 = r5;
                            while (true) {
                                i3 = cursorQuery.getInt(0);
                                txw0 txw0Var13 = (txw0) ((rxw0) r6x0.X1(txw0.z(), cursorQuery.getBlob(1))).e();
                                Object objValueOf2 = Integer.valueOf(i3);
                                gx3Var8.put(objValueOf2, txw0Var13);
                                str3 = str13;
                                obj2 = objQ1;
                                obj3 = objValueOf2;
                                r6 = r21;
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                }
                                str13 = str3;
                                objQ1 = obj2;
                                r21 = r21;
                            }
                            cursorQuery.close();
                            obj = obj3;
                            r5 = r6;
                            map2 = gx3Var8;
                        }
                        if (map2.isEmpty()) {
                            r10 = obj2;
                            m6x0Var = m6x0Var2;
                            str5 = "audience_id";
                        } else {
                            HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                            if (z3) {
                                String str113 = this.e;
                                zlw0VarG0 = m6x0Var2.g0();
                                str6 = this.e;
                                zlw0VarG0.n1();
                                zlw0VarG0.m1();
                                s0x.E(str6);
                                gx3Var3 = new gx3();
                                cursorRawQuery = zlw0VarG0.c2().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                        arrayList = (List) gx3Var3.get(numValueOf2);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            gx3Var3.put(numValueOf2, arrayList);
                                        }
                                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    gx3Var3 = Collections.EMPTY_MAP;
                                }
                                cursorRawQuery.close();
                                r0 = gx3Var3;
                                s0x.E(str113);
                                gx3Var4 = new gx3();
                                if (!map2.isEmpty()) {
                                    it2 = map2.keySet().iterator();
                                    while (it2.hasNext()) {
                                        num = (Integer) it2.next();
                                        num.getClass();
                                        txw0Var3 = (txw0) map2.get(num);
                                        list4 = (List) r0.get(num);
                                        if (list4 != null || list4.isEmpty()) {
                                            r18 = r0;
                                            it3 = it2;
                                            z7 = zX1;
                                            gx3Var4.put(num, txw0Var3);
                                            r0 = r18;
                                            str14 = str14;
                                            it2 = it3;
                                            zX1 = z7;
                                        } else {
                                            ?? r112 = r0;
                                            it3 = it2;
                                            List listT1 = m6x0Var2.j0().T1((wew0) txw0Var3.t(), list4);
                                            if (listT1.isEmpty()) {
                                                r0 = r112;
                                                it2 = it3;
                                            } else {
                                                rxw0 rxw0Var = (rxw0) txw0Var3.i();
                                                rxw0Var.i();
                                                rxw0Var.c();
                                                ((txw0) rxw0Var.b).D(listT1);
                                                List listT2 = m6x0Var2.j0().T1((wew0) txw0Var3.r(), list4);
                                                rxw0Var.h();
                                                rxw0Var.c();
                                                ((txw0) rxw0Var.b).B(listT2);
                                                ArrayList arrayList6 = new ArrayList();
                                                Iterator it9 = txw0Var3.v().iterator();
                                                while (it9.hasNext()) {
                                                    Iterator it10 = it9;
                                                    pww0 pww0Var2 = (pww0) it9.next();
                                                    boolean z9 = zX1;
                                                    if (!list4.contains(Integer.valueOf(pww0Var2.s()))) {
                                                        arrayList6.add(pww0Var2);
                                                    }
                                                    it9 = it10;
                                                    zX1 = z9;
                                                }
                                                z7 = zX1;
                                                rxw0Var.j();
                                                rxw0Var.c();
                                                ((txw0) rxw0Var.b).F(arrayList6);
                                                ArrayList arrayList7 = new ArrayList();
                                                for (wxw0 wxw0Var2 : txw0Var3.x()) {
                                                    if (!list4.contains(Integer.valueOf(wxw0Var2.s()))) {
                                                        arrayList7.add(wxw0Var2);
                                                    }
                                                }
                                                rxw0Var.m();
                                                rxw0Var.c();
                                                ((txw0) rxw0Var.b).H(arrayList7);
                                                gx3Var4.put(num, (txw0) rxw0Var.e());
                                                r18 = r112;
                                                r0 = r18;
                                                str14 = str14;
                                                it2 = it3;
                                                zX1 = z7;
                                            }
                                        }
                                    }
                                }
                                str4 = str14;
                                z4 = zX1;
                                map3 = gx3Var4;
                            } else {
                                str4 = "audience_id";
                                z4 = zX1;
                                map3 = map2;
                            }
                            map5 = map2;
                            map4 = map3;
                            while (r17.hasNext()) {
                                num3.getClass();
                                txw0Var = (txw0) map4.get(num3);
                                bitSet = new BitSet();
                                bitSet2 = new BitSet();
                                gx3Var = new gx3();
                                if (txw0Var != null && txw0Var.w() != 0) {
                                    while (r3.hasNext()) {
                                        if (pww0Var.r()) {
                                            txw0 txw0Var14 = txw0Var;
                                            Integer numValueOf13 = Integer.valueOf(pww0Var.s());
                                            if (pww0Var.t()) {
                                                lValueOf = Long.valueOf(pww0Var.u());
                                            } else {
                                                lValueOf = null;
                                            }
                                            gx3Var.put(numValueOf13, lValueOf);
                                            txw0Var = txw0Var14;
                                        }
                                    }
                                }
                                txw0Var2 = txw0Var;
                                gx3Var2 = new gx3();
                                if (txw0Var2 != null && txw0Var2.y() != 0) {
                                    it = txw0Var2.x().iterator();
                                    while (it.hasNext()) {
                                        wxw0Var = (wxw0) it.next();
                                        if (!wxw0Var.r() && wxw0Var.u() > 0) {
                                            gx3Var2.put(Integer.valueOf(wxw0Var.s()), Long.valueOf(wxw0Var.v(wxw0Var.u() - 1)));
                                            it = it;
                                            map4 = map4;
                                        }
                                    }
                                }
                                Map map19 = map4;
                                if (txw0Var2 != null) {
                                    i = 0;
                                    while (i < txw0Var2.s() * 64) {
                                        if (r6x0.R1((wew0) txw0Var2.r(), i)) {
                                            z6 = zX2;
                                            kxw0Var4.r().o.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                            bitSet2.set(i);
                                            if (r6x0.R1((wew0) txw0Var2.t(), i)) {
                                                bitSet.set(i);
                                            }
                                            i++;
                                            zX2 = z6;
                                        } else {
                                            z6 = zX2;
                                        }
                                        gx3Var.remove(Integer.valueOf(i));
                                        i++;
                                        zX2 = z6;
                                    }
                                }
                                z5 = zX2;
                                txw0 txw0Var15 = (txw0) map5.get(num3);
                                if (z5 && z4 && (list3 = (List) map.get(num3)) != null && this.i != null && this.h != null) {
                                    while (r2.hasNext()) {
                                        int iS6 = jsw0Var2.s();
                                        Integer num11 = num3;
                                        jLongValue = this.i.longValue() / 1000;
                                        if (jsw0Var2.A()) {
                                            jLongValue = this.h.longValue() / 1000;
                                        }
                                        numValueOf = Integer.valueOf(iS6);
                                        if (gx3Var.containsKey(numValueOf)) {
                                            gx3Var.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        if (gx3Var2.containsKey(numValueOf)) {
                                            gx3Var2.put(numValueOf, Long.valueOf(jLongValue));
                                        }
                                        num3 = num11;
                                    }
                                }
                                this.g.put(num3, new dgx0(this, this.e, txw0Var15, bitSet, bitSet2, gx3Var, gx3Var2));
                                m6x0Var2 = m6x0Var2;
                                zX2 = z5;
                                map5 = map5;
                                obj2 = obj2;
                                map = map;
                                str3 = str3;
                                map4 = map19;
                            }
                            r10 = obj2;
                            m6x0Var = m6x0Var2;
                            str5 = str4;
                        }
                        str7 = str2;
                        String str114 = str3;
                        if (!list.isEmpty()) {
                            srnVar = new srn(this);
                            gx3Var6 = new gx3();
                            while (r17.hasNext()) {
                                sww0VarA = srnVar.a(sww0Var, this.e);
                                if (sww0VarA != null) {
                                    mmw0VarW1 = m6x0Var.g0().W1(this.e, sww0Var, sww0VarA.w());
                                    m6x0Var.g0().N1("events", mmw0VarW1);
                                    if (z) {
                                        j = mmw0VarW1.c;
                                        strW = sww0VarA.w();
                                        map7 = (Map) gx3Var6.get(strW);
                                        if (map7 == null) {
                                            zlw0 zlw0VarG14 = m6x0Var.g0();
                                            kxw0 kxw0Var10 = (kxw0) zlw0VarG14.b;
                                            str10 = this.e;
                                            zlw0VarG14.n1();
                                            zlw0VarG14.m1();
                                            s0x.E(str10);
                                            s0x.E(strW);
                                            gx3Var7 = new gx3();
                                            Query = zlw0VarG14.c2().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                                            if (Query.moveToFirst()) {
                                                str11 = str10;
                                                Query = Query;
                                                r312 = list;
                                                while (true) {
                                                    jsw0 jsw0Var12 = (jsw0) ((hsw0) r6x0.X1(jsw0.D(), Query.getBlob(1))).e();
                                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                    list6 = (List) gx3Var7.get(numValueOf6);
                                                    if (list6 == null) {
                                                        r312 = Query;
                                                        arrayList4 = new ArrayList();
                                                        gx3Var7.put(numValueOf6, arrayList4);
                                                        r314 = r312;
                                                    } else {
                                                        r314 = Query;
                                                        arrayList4 = list6;
                                                    }
                                                    arrayList4.add(jsw0Var12);
                                                    r313 = r314;
                                                    if (!r313.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    Query = r313;
                                                    r312 = r313;
                                                }
                                                r313.close();
                                                map7 = gx3Var7;
                                                r39 = r313;
                                            } else {
                                                ?? r319 = Query;
                                                map7 = Collections.EMPTY_MAP;
                                                r319.close();
                                                r39 = r319;
                                            }
                                            gx3Var6.put(strW, map7);
                                            list = r39;
                                        } else {
                                            list = list;
                                        }
                                        while (r19.hasNext()) {
                                            iIntValue2 = num5.intValue();
                                            if (this.f.contains(num5)) {
                                                kxw0Var4.r().o.b(num5, "Skipping failed audience ID");
                                            } else {
                                                it7 = ((List) map7.get(num5)).iterator();
                                                zA = true;
                                                while (true) {
                                                    if (!it7.hasNext()) {
                                                        map8 = map7;
                                                        srnVar2 = srnVar;
                                                        num2 = num5;
                                                        break;
                                                    }
                                                    jsw0 jsw0Var13 = (jsw0) it7.next();
                                                    map8 = map7;
                                                    srnVar2 = srnVar;
                                                    num2 = num5;
                                                    obw0Var2 = new obw0(this, this.e, iIntValue2, jsw0Var13, (byte) 0);
                                                    Long l13 = this.h;
                                                    Long l14 = this.i;
                                                    iS = jsw0Var13.s();
                                                    dgx0Var = (dgx0) this.g.get(num2);
                                                    if (dgx0Var == null) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = dgx0Var.d.get(iS);
                                                    }
                                                    zA = obw0Var2.a(l13, l14, sww0VarA, j, mmw0VarW1, z8);
                                                    if (!zA) {
                                                        this.f.add(num2);
                                                        break;
                                                    }
                                                    r1(num2).a(obw0Var2);
                                                    num5 = num2;
                                                    map7 = map8;
                                                    srnVar = srnVar2;
                                                }
                                                if (!zA) {
                                                    this.f.add(num2);
                                                }
                                                srnVar = srnVar2;
                                                map7 = map8;
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        if (!z) {
                            return new ArrayList();
                        }
                        if (!list2.isEmpty()) {
                            gx3 gx3Var14 = new gx3();
                            it4 = list2.iterator();
                            nuj0Var = gx3Var14;
                            while (it4.hasNext()) {
                                eyw0 eyw0Var5 = (eyw0) it4.next();
                                strT = eyw0Var5.t();
                                map6 = (Map) nuj0Var.get(strT);
                                if (map6 == null) {
                                    zlw0 zlw0VarG15 = m6x0Var.g0();
                                    kxw0Var2 = (kxw0) zlw0VarG15.b;
                                    str9 = this.e;
                                    zlw0VarG15.n1();
                                    zlw0VarG15.m1();
                                    s0x.E(str9);
                                    s0x.E(strT);
                                    gx3Var5 = new gx3();
                                    cursorQuery2 = zlw0VarG15.c2().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                                    if (cursorQuery2.moveToFirst()) {
                                        it5 = it4;
                                        while (true) {
                                            ssw0 ssw0Var6 = (ssw0) ((rsw0) r6x0.X1(ssw0.z(), cursorQuery2.getBlob(1))).e();
                                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                            list5 = (List) gx3Var5.get(numValueOf5);
                                            if (list5 == null) {
                                                kxw0Var3 = kxw0Var2;
                                                arrayList3 = new ArrayList();
                                                gx3Var5.put(numValueOf5, arrayList3);
                                            } else {
                                                kxw0Var3 = kxw0Var2;
                                                arrayList3 = list5;
                                            }
                                            arrayList3.add(ssw0Var6);
                                            if (!cursorQuery2.moveToNext()) {
                                                break;
                                                break;
                                            }
                                            kxw0Var2 = kxw0Var3;
                                            str7 = str7;
                                        }
                                        cursorQuery2.close();
                                        map6 = gx3Var5;
                                    } else {
                                        it5 = it4;
                                        str7 = str7;
                                        map6 = Collections.EMPTY_MAP;
                                        cursorQuery2.close();
                                    }
                                    nuj0Var.put(strT, map6);
                                } else {
                                    it5 = it4;
                                    str7 = str7;
                                }
                                nuj0Var2 = nuj0Var;
                                while (r3.hasNext()) {
                                    iIntValue = num6.intValue();
                                    if (this.f.contains(num6)) {
                                        kxw0Var4.r().o.b(num6, "Skipping failed audience ID");
                                        break;
                                        break;
                                    }
                                    it6 = ((List) map6.get(num6)).iterator();
                                    zB = true;
                                    nuj0Var3 = nuj0Var2;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            ssw0Var = (ssw0) it6.next();
                                            if (Log.isLoggable(kxw0Var4.r().s1(), 2)) {
                                                quw0 quw0Var14 = kxw0Var4.r().o;
                                                if (ssw0Var.r()) {
                                                    numValueOf4 = Integer.valueOf(ssw0Var.s());
                                                } else {
                                                    numValueOf4 = null;
                                                }
                                                quw0Var14.d("Evaluating filter. audience, filter, property", num6, numValueOf4, kxw0Var4.j.c(ssw0Var.t()));
                                                kxw0Var4.r().o.b(m6x0Var.j0().O1(ssw0Var), "Filter definition");
                                            }
                                            if (ssw0Var.r() || ssw0Var.s() > 256) {
                                                quw0 quw0Var15 = kxw0Var4.r().j;
                                                tuw0 tuw0VarQ7 = uuw0.q1(this.e);
                                                if (ssw0Var.r()) {
                                                    numValueOf3 = Integer.valueOf(ssw0Var.s());
                                                } else {
                                                    numValueOf3 = null;
                                                }
                                                quw0Var15.c(tuw0VarQ7, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                this.f.add(num6);
                                                map6 = map6;
                                                nuj0Var2 = nuj0Var3;
                                            } else {
                                                i2 = iIntValue;
                                                obw0Var = new obw0(this, this.e, i2, ssw0Var, (byte) 1);
                                                Long l15 = this.h;
                                                Long l16 = this.i;
                                                int iS7 = ssw0Var.s();
                                                dgx0 dgx0Var6 = (dgx0) this.g.get(num6);
                                                zB = obw0Var.b(l15, l16, eyw0Var5, dgx0Var6 == null ? false : dgx0Var6.d.get(iS7));
                                                if (zB) {
                                                    r1(num6).a(obw0Var);
                                                    iIntValue = i2;
                                                    map6 = map6;
                                                    nuj0Var3 = nuj0Var3;
                                                } else {
                                                    this.f.add(num6);
                                                    nuj0Var3 = nuj0Var3;
                                                }
                                            }
                                        } else {
                                            map6 = map6;
                                            nuj0Var3 = nuj0Var3;
                                        }
                                        if (!zB) {
                                            this.f.add(num6);
                                        }
                                        map6 = map6;
                                        nuj0Var2 = nuj0Var3;
                                    }
                                }
                                str7 = str7;
                                it4 = it5;
                                nuj0Var = nuj0Var2;
                            }
                        }
                        arrayList2 = new ArrayList();
                        cx3<Integer> cx3Var5 = (cx3) this.g.keySet();
                        cx3Var5.removeAll(this.f);
                        while (r3.hasNext()) {
                            int iIntValue7 = num7.intValue();
                            dgx0 dgx0Var7 = (dgx0) this.g.get(num7);
                            s0x.H(dgx0Var7);
                            tvw0 tvw0VarB5 = dgx0Var7.b(iIntValue7);
                            arrayList2.add(tvw0VarB5);
                            zlw0VarG1 = m6x0Var.g0();
                            kxw0Var = (kxw0) zlw0VarG1.b;
                            str8 = this.e;
                            txw0 txw0VarT5 = tvw0VarB5.t();
                            zlw0VarG1.n1();
                            zlw0VarG1.m1();
                            s0x.E(str8);
                            s0x.H(txw0VarT5);
                            byte[] bArrA5 = txw0VarT5.a();
                            contentValues = new ContentValues();
                            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str8);
                            contentValues.put(str5, num7);
                            contentValues.put("current_results", bArrA5);
                            if (zlw0VarG1.c2().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                kxw0Var.r().g.b(uuw0.q1(str8), "Failed to insert filter results (got -1). appId");
                            }
                        }
                        return arrayList2;
                    }
                    z3 = z2;
                    str2 = RemoteMessageConst.DATA;
                    if (cursorQuery.moveToFirst()) {
                        Map map110 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map110;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        gx3Var8 = new gx3();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            txw0 txw0Var16 = (txw0) ((rxw0) r6x0.X1(txw0.z(), cursorQuery.getBlob(1))).e();
                            Object objValueOf3 = Integer.valueOf(i3);
                            gx3Var8.put(objValueOf3, txw0Var16);
                            str3 = str13;
                            obj2 = objQ1;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str13 = str3;
                            objQ1 = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = gx3Var8;
                    }
                } catch (SQLiteException e26) {
                    e = e26;
                    r17 = obj;
                    r21 = r5;
                }
            } catch (Throwable th14) {
                th = th14;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
            cursorQuery = zlw0VarG13.c2().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map9;
        zlw0 zlw0VarG16 = m6x0Var2.g0();
        obj = (kxw0) zlw0VarG16.b;
        r5 = this.e;
        zlw0VarG16.n1();
        zlw0VarG16.m1();
        s0x.E(r5);
        if (map2.isEmpty()) {
            r10 = obj2;
            m6x0Var = m6x0Var2;
            str5 = "audience_id";
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str115 = this.e;
                zlw0VarG0 = m6x0Var2.g0();
                str6 = this.e;
                zlw0VarG0.n1();
                zlw0VarG0.m1();
                s0x.E(str6);
                gx3Var3 = new gx3();
                cursorRawQuery = zlw0VarG0.c2().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) gx3Var3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            gx3Var3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    gx3Var3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = gx3Var3;
                s0x.E(str115);
                gx3Var4 = new gx3();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        txw0Var3 = (txw0) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        z7 = zX1;
                        gx3Var4.put(num, txw0Var3);
                        r0 = r18;
                        str14 = str14;
                        it2 = it3;
                        zX1 = z7;
                    }
                }
                str4 = str14;
                z4 = zX1;
                map3 = gx3Var4;
            } else {
                str4 = "audience_id";
                z4 = zX1;
                map3 = map2;
            }
            map5 = map2;
            map4 = map3;
            while (r17.hasNext()) {
                num3.getClass();
                txw0Var = (txw0) map4.get(num3);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                gx3Var = new gx3();
                if (txw0Var != null) {
                    while (r3.hasNext()) {
                        if (pww0Var.r()) {
                            txw0 txw0Var17 = txw0Var;
                            Integer numValueOf14 = Integer.valueOf(pww0Var.s());
                            if (pww0Var.t()) {
                                lValueOf = Long.valueOf(pww0Var.u());
                            } else {
                                lValueOf = null;
                            }
                            gx3Var.put(numValueOf14, lValueOf);
                            txw0Var = txw0Var17;
                        }
                    }
                }
                txw0Var2 = txw0Var;
                gx3Var2 = new gx3();
                if (txw0Var2 != null) {
                    it = txw0Var2.x().iterator();
                    while (it.hasNext()) {
                        wxw0Var = (wxw0) it.next();
                        if (!wxw0Var.r()) {
                        }
                    }
                }
                Map map111 = map4;
                if (txw0Var2 != null) {
                    i = 0;
                    while (i < txw0Var2.s() * 64) {
                        if (r6x0.R1((wew0) txw0Var2.r(), i)) {
                            z6 = zX2;
                            kxw0Var4.r().o.c(num3, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i);
                            if (r6x0.R1((wew0) txw0Var2.t(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zX2 = z6;
                        } else {
                            z6 = zX2;
                        }
                        gx3Var.remove(Integer.valueOf(i));
                        i++;
                        zX2 = z6;
                    }
                }
                z5 = zX2;
                txw0 txw0Var18 = (txw0) map5.get(num3);
                if (z5) {
                    while (r2.hasNext()) {
                        int iS8 = jsw0Var2.s();
                        Integer num12 = num3;
                        jLongValue = this.i.longValue() / 1000;
                        if (jsw0Var2.A()) {
                            jLongValue = this.h.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iS8);
                        if (gx3Var.containsKey(numValueOf)) {
                            gx3Var.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (gx3Var2.containsKey(numValueOf)) {
                            gx3Var2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num3 = num12;
                    }
                }
                this.g.put(num3, new dgx0(this, this.e, txw0Var18, bitSet, bitSet2, gx3Var, gx3Var2));
                m6x0Var2 = m6x0Var2;
                zX2 = z5;
                map5 = map5;
                obj2 = obj2;
                map = map;
                str3 = str3;
                map4 = map111;
            }
            r10 = obj2;
            m6x0Var = m6x0Var2;
            str5 = str4;
        }
        str7 = str2;
        String str116 = str3;
        if (!list.isEmpty()) {
            srnVar = new srn(this);
            gx3Var6 = new gx3();
            while (r17.hasNext()) {
                sww0VarA = srnVar.a(sww0Var, this.e);
                if (sww0VarA != null) {
                    mmw0VarW1 = m6x0Var.g0().W1(this.e, sww0Var, sww0VarA.w());
                    m6x0Var.g0().N1("events", mmw0VarW1);
                    if (z) {
                        j = mmw0VarW1.c;
                        strW = sww0VarA.w();
                        map7 = (Map) gx3Var6.get(strW);
                        if (map7 == null) {
                            zlw0 zlw0VarG17 = m6x0Var.g0();
                            kxw0 kxw0Var11 = (kxw0) zlw0VarG17.b;
                            str10 = this.e;
                            zlw0VarG17.n1();
                            zlw0VarG17.m1();
                            s0x.E(str10);
                            s0x.E(strW);
                            gx3Var7 = new gx3();
                            Query = zlw0VarG17.c2().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str10, strW}, null, null, null);
                            if (Query.moveToFirst()) {
                                str11 = str10;
                                Query = Query;
                                r312 = list;
                                while (true) {
                                    jsw0 jsw0Var14 = (jsw0) ((hsw0) r6x0.X1(jsw0.D(), Query.getBlob(1))).e();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) gx3Var7.get(numValueOf6);
                                    if (list6 == null) {
                                        r312 = Query;
                                        arrayList4 = new ArrayList();
                                        gx3Var7.put(numValueOf6, arrayList4);
                                        r314 = r312;
                                    } else {
                                        r314 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(jsw0Var14);
                                    r313 = r314;
                                    if (!r313.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r313;
                                    r312 = r313;
                                }
                                r313.close();
                                map7 = gx3Var7;
                                r39 = r313;
                            } else {
                                ?? r3110 = Query;
                                map7 = Collections.EMPTY_MAP;
                                r3110.close();
                                r39 = r3110;
                            }
                            gx3Var6.put(strW, map7);
                            list = r39;
                        } else {
                            list = list;
                        }
                        while (r19.hasNext()) {
                            iIntValue2 = num5.intValue();
                            if (this.f.contains(num5)) {
                                kxw0Var4.r().o.b(num5, "Skipping failed audience ID");
                            } else {
                                it7 = ((List) map7.get(num5)).iterator();
                                zA = true;
                                while (true) {
                                    if (!it7.hasNext()) {
                                        map8 = map7;
                                        srnVar2 = srnVar;
                                        num2 = num5;
                                        break;
                                    }
                                    jsw0 jsw0Var15 = (jsw0) it7.next();
                                    map8 = map7;
                                    srnVar2 = srnVar;
                                    num2 = num5;
                                    obw0Var2 = new obw0(this, this.e, iIntValue2, jsw0Var15, (byte) 0);
                                    Long l17 = this.h;
                                    Long l18 = this.i;
                                    iS = jsw0Var15.s();
                                    dgx0Var = (dgx0) this.g.get(num2);
                                    if (dgx0Var == null) {
                                        z8 = false;
                                    } else {
                                        z8 = dgx0Var.d.get(iS);
                                    }
                                    zA = obw0Var2.a(l17, l18, sww0VarA, j, mmw0VarW1, z8);
                                    if (!zA) {
                                        this.f.add(num2);
                                        break;
                                    }
                                    r1(num2).a(obw0Var2);
                                    num5 = num2;
                                    map7 = map8;
                                    srnVar = srnVar2;
                                }
                                if (!zA) {
                                    this.f.add(num2);
                                }
                                srnVar = srnVar2;
                                map7 = map8;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            gx3 gx3Var15 = new gx3();
            it4 = list2.iterator();
            nuj0Var = gx3Var15;
            while (it4.hasNext()) {
                eyw0 eyw0Var6 = (eyw0) it4.next();
                strT = eyw0Var6.t();
                map6 = (Map) nuj0Var.get(strT);
                if (map6 == null) {
                    zlw0 zlw0VarG18 = m6x0Var.g0();
                    kxw0Var2 = (kxw0) zlw0VarG18.b;
                    str9 = this.e;
                    zlw0VarG18.n1();
                    zlw0VarG18.m1();
                    s0x.E(str9);
                    s0x.E(strT);
                    gx3Var5 = new gx3();
                    cursorQuery2 = zlw0VarG18.c2().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strT}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            ssw0 ssw0Var7 = (ssw0) ((rsw0) r6x0.X1(ssw0.z(), cursorQuery2.getBlob(1))).e();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) gx3Var5.get(numValueOf5);
                            if (list5 == null) {
                                kxw0Var3 = kxw0Var2;
                                arrayList3 = new ArrayList();
                                gx3Var5.put(numValueOf5, arrayList3);
                            } else {
                                kxw0Var3 = kxw0Var2;
                                arrayList3 = list5;
                            }
                            arrayList3.add(ssw0Var7);
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            kxw0Var2 = kxw0Var3;
                            str7 = str7;
                        }
                        cursorQuery2.close();
                        map6 = gx3Var5;
                    } else {
                        it5 = it4;
                        str7 = str7;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    nuj0Var.put(strT, map6);
                } else {
                    it5 = it4;
                    str7 = str7;
                }
                nuj0Var2 = nuj0Var;
                while (r3.hasNext()) {
                    iIntValue = num6.intValue();
                    if (this.f.contains(num6)) {
                        kxw0Var4.r().o.b(num6, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it6 = ((List) map6.get(num6)).iterator();
                    zB = true;
                    nuj0Var3 = nuj0Var2;
                    while (true) {
                        if (it6.hasNext()) {
                            ssw0Var = (ssw0) it6.next();
                            if (Log.isLoggable(kxw0Var4.r().s1(), 2)) {
                                quw0 quw0Var16 = kxw0Var4.r().o;
                                if (ssw0Var.r()) {
                                    numValueOf4 = Integer.valueOf(ssw0Var.s());
                                } else {
                                    numValueOf4 = null;
                                }
                                quw0Var16.d("Evaluating filter. audience, filter, property", num6, numValueOf4, kxw0Var4.j.c(ssw0Var.t()));
                                kxw0Var4.r().o.b(m6x0Var.j0().O1(ssw0Var), "Filter definition");
                            }
                            if (ssw0Var.r()) {
                            }
                            quw0 quw0Var17 = kxw0Var4.r().j;
                            tuw0 tuw0VarQ8 = uuw0.q1(this.e);
                            if (ssw0Var.r()) {
                                numValueOf3 = Integer.valueOf(ssw0Var.s());
                            } else {
                                numValueOf3 = null;
                            }
                            quw0Var17.c(tuw0VarQ8, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                            this.f.add(num6);
                            map6 = map6;
                            nuj0Var2 = nuj0Var3;
                        } else {
                            map6 = map6;
                            nuj0Var3 = nuj0Var3;
                        }
                        if (!zB) {
                            this.f.add(num6);
                        }
                        map6 = map6;
                        nuj0Var2 = nuj0Var3;
                        r1(num6).a(obw0Var);
                        iIntValue = i2;
                        map6 = map6;
                        nuj0Var3 = nuj0Var3;
                    }
                }
                str7 = str7;
                it4 = it5;
                nuj0Var = nuj0Var2;
            }
        }
        arrayList2 = new ArrayList();
        cx3<Integer> cx3Var6 = (cx3) this.g.keySet();
        cx3Var6.removeAll(this.f);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            dgx0 dgx0Var8 = (dgx0) this.g.get(num7);
            s0x.H(dgx0Var8);
            tvw0 tvw0VarB6 = dgx0Var8.b(iIntValue8);
            arrayList2.add(tvw0VarB6);
            zlw0VarG1 = m6x0Var.g0();
            kxw0Var = (kxw0) zlw0VarG1.b;
            str8 = this.e;
            txw0 txw0VarT6 = tvw0VarB6.t();
            zlw0VarG1.n1();
            zlw0VarG1.m1();
            s0x.E(str8);
            s0x.H(txw0VarT6);
            byte[] bArrA6 = txw0VarT6.a();
            contentValues = new ContentValues();
            contentValues.put(HiAnalyticsConstant.BI_KEY_APP_ID, str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrA6);
            if (zlw0VarG1.c2().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                kxw0Var.r().g.b(uuw0.q1(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    public final dgx0 r1(Integer num) {
        if (this.g.containsKey(num)) {
            return (dgx0) this.g.get(num);
        }
        dgx0 dgx0Var = new dgx0(this, this.e);
        this.g.put(num, dgx0Var);
        return dgx0Var;
    }
}
