package com.google.firebase.messaging;

import a.cig0;
import a.mii0;
import a.pyu;
import a.vyn;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessagingService extends vyn {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_FCM_REGISTERED = "com.google.firebase.messaging.FCM_REGISTERED";
    static final String ACTION_FCM_UNREGISTERED = "com.google.firebase.messaging.FCM_UNREGISTERED";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private cig0 rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // a.vyn
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) mii0.u().e).poll();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00de  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:68:0x0124  */
    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    /* JADX WARN: Code duplicated, block: B:74:0x0156  */
    /* JADX WARN: Code duplicated, block: B:75:0x015a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0163  */
    /* JADX WARN: Code duplicated, block: B:81:0x0172  */
    /* JADX WARN: Code duplicated, block: B:82:0x017b  */
    @Override // a.vyn
    public void handleIntent(Intent intent) {
        String stringExtra;
        Bundle extras;
        pyu pyuVar;
        ExecutorService executorServiceNewSingleThreadExecutor;
        String stringExtra2;
        String stringExtra3;
        int i;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            if (ACTION_FCM_REGISTERED.equals(action)) {
                onRegistered(intent.getStringExtra(EXTRA_TOKEN));
                return;
            } else {
                if (ACTION_FCM_UNREGISTERED.equals(action)) {
                    onUnregistered(intent.getStringExtra(EXTRA_TOKEN));
                    return;
                }
                Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
                return;
            }
        }
        String stringExtra4 = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra4)) {
            stringExtra = intent.getStringExtra(RemoteMessageConst.MSGTYPE);
            if (stringExtra == null) {
                stringExtra = "gcm";
            }
            switch (stringExtra) {
                case -2062414158:
                    if (stringExtra.equals("deleted_messages")) {
                    }
                    break;
                case 102161:
                    if (stringExtra.equals("gcm")) {
                    }
                    break;
                case 814694033:
                    if (stringExtra.equals("send_error")) {
                    }
                    break;
                case 814800675:
                    if (stringExtra.equals("send_event")) {
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                */
            /*
                Method dump skipped, instruction units count: 526
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.handleIntent(android.content.Intent):void");
        }

        public void onDeletedMessages() {
        }

        public void onMessageReceived(RemoteMessage remoteMessage) {
        }

        @Deprecated
        public void onMessageSent(String str) {
        }

        public void onNewToken(String str) {
        }

        public void onRegistered(String str) {
        }

        @Deprecated
        public void onSendError(String str, Exception exc) {
        }

        public void onUnregistered(String str) {
        }

        public void setRpcForTesting(cig0 cig0Var) {
            this.rpc = cig0Var;
        }
    }
