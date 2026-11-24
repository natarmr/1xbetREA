.class public final Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;
.super Lcom/google/firebase/messaging/FirebaseMessagingService;
.source "SourceFile"

# interfaces
.implements Lorg/xplatform/services/mobile_services/impl/presentation/services/BaseMessagingService;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u001b\u0010\'\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;",
        "Lcom/google/firebase/messaging/FirebaseMessagingService;",
        "Lorg/xplatform/services/mobile_services/impl/presentation/services/BaseMessagingService;",
        "<init>",
        "()V",
        "",
        "onCreate",
        "onDestroy",
        "Lcom/google/firebase/messaging/RemoteMessage;",
        "remoteMessage",
        "onMessageReceived",
        "(Lcom/google/firebase/messaging/RemoteMessage;)V",
        "",
        "token",
        "onNewToken",
        "(Ljava/lang/String;)V",
        "",
        "availableToCreate",
        "createService",
        "(Z)V",
        "La/w940;",
        "messagingServiceHandler",
        "La/w940;",
        "getMessagingServiceHandler",
        "()La/w940;",
        "setMessagingServiceHandler",
        "(La/w940;)V",
        "La/u940;",
        "messagingServiceCustomerIOHandler",
        "La/u940;",
        "getMessagingServiceCustomerIOHandler",
        "()La/u940;",
        "setMessagingServiceCustomerIOHandler",
        "(La/u940;)V",
        "La/xav;",
        "googleMessagingServiceComponent$delegate",
        "La/a8z;",
        "getGoogleMessagingServiceComponent",
        "()La/xav;",
        "googleMessagingServiceComponent",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final googleMessagingServiceComponent$delegate:La/a8z;

.field public messagingServiceCustomerIOHandler:La/u940;

.field public messagingServiceHandler:La/w940;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/firebase/messaging/FirebaseMessagingService;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/jcs;

    .line 5
    .line 6
    const/16 v1, 0x1c

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->googleMessagingServiceComponent$delegate:La/a8z;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic c(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;)La/xav;
    .locals 0

    .line 1
    invoke-static {p0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->googleMessagingServiceComponent_delegate$lambda$0(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;)La/xav;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;Ljava/util/HashMap;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->onMessageReceived$lambda$0(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;Ljava/util/Map;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final getGoogleMessagingServiceComponent()La/xav;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->googleMessagingServiceComponent$delegate:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/xav;

    .line 8
    .line 9
    return-object p0
.end method

.method private static final googleMessagingServiceComponent_delegate$lambda$0(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;)La/xav;
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    instance-of v1, v0, La/af3;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, La/af3;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v0, v2

    .line 17
    :goto_0
    const-class v1, La/yav;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/o5d0;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, La/ze3;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v0, v2

    .line 41
    :goto_1
    instance-of v3, v0, La/yav;

    .line 42
    .line 43
    if-nez v3, :cond_2

    .line 44
    .line 45
    move-object v0, v2

    .line 46
    :cond_2
    check-cast v0, La/yav;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iget-object v7, v0, La/yav;->a:La/us00;

    .line 51
    .line 52
    iget-object v8, v0, La/yav;->b:La/nv20;

    .line 53
    .line 54
    iget-object v4, v0, La/yav;->c:La/lp4;

    .line 55
    .line 56
    iget-object v1, v0, La/yav;->d:La/v6j0;

    .line 57
    .line 58
    iget-object v12, v0, La/yav;->e:La/c1d0;

    .line 59
    .line 60
    iget-object v2, v0, La/yav;->f:La/vby;

    .line 61
    .line 62
    iget-object v3, v0, La/yav;->g:La/vwb0;

    .line 63
    .line 64
    iget-object v5, v0, La/yav;->h:La/q7d0;

    .line 65
    .line 66
    iget-object v6, v0, La/yav;->l:La/gst0;

    .line 67
    .line 68
    move-object v9, v5

    .line 69
    iget-object v5, v0, La/yav;->k:La/mne;

    .line 70
    .line 71
    iget-object v10, v0, La/yav;->i:La/h760;

    .line 72
    .line 73
    move-object v11, v9

    .line 74
    iget-object v9, v0, La/yav;->j:La/kd30;

    .line 75
    .line 76
    move-object v13, v11

    .line 77
    iget-object v11, v0, La/yav;->m:La/sd60;

    .line 78
    .line 79
    move-object v14, v6

    .line 80
    iget-object v6, v0, La/yav;->n:La/rpt;

    .line 81
    .line 82
    move-object v15, v14

    .line 83
    iget-object v14, v0, La/yav;->o:La/zlt0;

    .line 84
    .line 85
    move-object/from16 p0, v1

    .line 86
    .line 87
    iget-object v1, v0, La/yav;->p:La/l6a;

    .line 88
    .line 89
    iget-object v0, v0, La/yav;->q:La/j1q0;

    .line 90
    .line 91
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v3, La/jii;

    .line 122
    .line 123
    move-object v13, v0

    .line 124
    invoke-direct/range {v3 .. v14}, La/jii;-><init>(La/lp4;La/mne;La/rpt;La/us00;La/nv20;La/kd30;La/h760;La/sd60;La/c1d0;La/j1q0;La/zlt0;)V

    .line 125
    .line 126
    .line 127
    return-object v3

    .line 128
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 129
    .line 130
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-object v2
.end method

.method private static final onMessageReceived$lambda$0(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;Ljava/util/Map;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->getMessagingServiceHandler()La/w940;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La/w940;->d(Ljava/util/Map;)V

    .line 6
    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 9
    .line 10
    return-object p0
.end method


# virtual methods
.method public createService(Z)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Landroid/content/ComponentName;

    .line 8
    .line 9
    const-class v1, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-virtual {p1, v0, v1, v2}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->getMessagingServiceHandler()La/w940;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, La/w940;->b()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final getMessagingServiceCustomerIOHandler()La/u940;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->messagingServiceCustomerIOHandler:La/u940;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "messagingServiceCustomerIOHandler"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final getMessagingServiceHandler()La/w940;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->messagingServiceHandler:La/w940;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "messagingServiceHandler"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public onCreate()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->getGoogleMessagingServiceComponent()La/xav;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/jii;

    .line 8
    .line 9
    new-instance v2, La/w940;

    .line 10
    .line 11
    iget-object v3, v1, La/jii;->a:La/us00;

    .line 12
    .line 13
    iget-object v4, v1, La/jii;->b:La/lp4;

    .line 14
    .line 15
    invoke-interface {v4}, La/lp4;->i()La/myb;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance v5, La/kj5;

    .line 23
    .line 24
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    new-instance v6, La/qde0;

    .line 28
    .line 29
    iget-object v7, v1, La/jii;->c:La/kd30;

    .line 30
    .line 31
    invoke-direct {v6, v7}, La/qde0;-><init>(La/kd30;)V

    .line 32
    .line 33
    .line 34
    new-instance v8, La/nv20;

    .line 35
    .line 36
    invoke-direct {v8, v7}, La/nv20;-><init>(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object v9, v8

    .line 40
    new-instance v8, La/qde0;

    .line 41
    .line 42
    invoke-direct {v8, v7}, La/qde0;-><init>(La/kd30;)V

    .line 43
    .line 44
    .line 45
    move-object v7, v9

    .line 46
    new-instance v9, La/zx10;

    .line 47
    .line 48
    iget-object v10, v1, La/jii;->a:La/us00;

    .line 49
    .line 50
    invoke-direct {v9, v10}, La/zx10;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    move-object v11, v10

    .line 54
    iget-object v10, v1, La/jii;->d:La/sd60;

    .line 55
    .line 56
    move-object v12, v11

    .line 57
    iget-object v11, v1, La/jii;->e:La/h760;

    .line 58
    .line 59
    move-object v13, v12

    .line 60
    iget-object v12, v1, La/jii;->f:La/c1d0;

    .line 61
    .line 62
    move-object v14, v13

    .line 63
    iget-object v13, v1, La/jii;->g:La/rpt;

    .line 64
    .line 65
    move-object v15, v14

    .line 66
    iget-object v14, v1, La/jii;->h:La/zlt0;

    .line 67
    .line 68
    move-object/from16 v16, v2

    .line 69
    .line 70
    iget-object v2, v1, La/jii;->i:La/nv20;

    .line 71
    .line 72
    iget-object v2, v2, La/nv20;->a:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, La/lrc;

    .line 75
    .line 76
    move-object/from16 v17, v15

    .line 77
    .line 78
    new-instance v15, La/ugf0;

    .line 79
    .line 80
    move-object/from16 v18, v3

    .line 81
    .line 82
    new-instance v3, La/nr00;

    .line 83
    .line 84
    iget-object v2, v2, La/lrc;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v2, La/vdd0;

    .line 87
    .line 88
    invoke-direct {v3, v2}, La/nr00;-><init>(La/vdd0;)V

    .line 89
    .line 90
    .line 91
    invoke-direct {v15, v3}, La/ugf0;-><init>(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iget-object v2, v1, La/jii;->j:La/j1q0;

    .line 95
    .line 96
    iget-object v1, v1, La/jii;->k:La/mne;

    .line 97
    .line 98
    move-object/from16 v3, v17

    .line 99
    .line 100
    move-object/from16 v17, v1

    .line 101
    .line 102
    move-object v1, v3

    .line 103
    move-object/from16 v3, v16

    .line 104
    .line 105
    move-object/from16 v16, v2

    .line 106
    .line 107
    move-object v2, v3

    .line 108
    move-object/from16 v3, v18

    .line 109
    .line 110
    invoke-direct/range {v2 .. v17}, La/w940;-><init>(La/us00;La/myb;La/kj5;La/qde0;La/nv20;La/qde0;La/zx10;La/sd60;La/h760;La/c1d0;La/rpt;La/zlt0;La/ugf0;La/j1q0;La/mne;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v2}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService_MembersInjector;->injectMessagingServiceHandler(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;La/w940;)V

    .line 114
    .line 115
    .line 116
    new-instance v2, La/u940;

    .line 117
    .line 118
    invoke-direct {v2, v1}, La/u940;-><init>(La/us00;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v0, v2}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService_MembersInjector;->injectMessagingServiceCustomerIOHandler(Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;La/u940;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->getMessagingServiceHandler()La/w940;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    sget-object v2, La/rl40;->b:La/rl40;

    .line 129
    .line 130
    new-instance v3, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService$onCreate$1;

    .line 131
    .line 132
    invoke-direct {v3, v0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService$onCreate$1;-><init>(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-object v0, v1, La/w940;->i:La/rpt;

    .line 136
    .line 137
    iget-object v0, v0, La/rpt;->a:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v0, La/xr;

    .line 140
    .line 141
    invoke-virtual {v0}, La/xr;->i()La/rl40;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    if-ne v0, v2, :cond_0

    .line 146
    .line 147
    const/4 v0, 0x1

    .line 148
    goto :goto_0

    .line 149
    :cond_0
    const/4 v0, 0x0

    .line 150
    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->getMessagingServiceHandler()La/w940;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/w940;->c()V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, La/vyn;->onDestroy()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onMessageReceived(Lcom/google/firebase/messaging/RemoteMessage;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->m()Ljava/util/HashMap;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->getMessagingServiceHandler()La/w940;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1, v0}, La/w940;->f(Ljava/util/Map;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    new-instance v1, La/gmo;

    .line 22
    .line 23
    const/16 v2, 0x1c

    .line 24
    .line 25
    invoke-direct {v1, p0, v0, v2}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->getMessagingServiceCustomerIOHandler()La/u940;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0, p1, v1}, La/u940;->a(Lcom/google/firebase/messaging/RemoteMessage;La/gmo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :catch_0
    move-exception p0

    .line 37
    invoke-static {}, La/tfq;->a()La/tfq;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1, p0}, La/tfq;->c(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public onNewToken(Ljava/lang/String;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->getMessagingServiceCustomerIOHandler()La/u940;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, La/u940;->a:La/us00;

    .line 14
    .line 15
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v3, "KEY_TOKEN"

    .line 21
    .line 22
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    new-instance v3, La/maj;

    .line 26
    .line 27
    invoke-direct {v3, v2}, La/maj;-><init>(Ljava/util/LinkedHashMap;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v3}, La/nkb;->I(La/maj;)[B

    .line 31
    .line 32
    .line 33
    new-instance v2, La/hl50;

    .line 34
    .line 35
    sget-object v2, La/sl50;->a:La/sl50;

    .line 36
    .line 37
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 40
    .line 41
    .line 42
    sget-object v6, La/sl50;->b:La/sl50;

    .line 43
    .line 44
    new-instance v5, La/hl50;

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    invoke-direct {v5, v4}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v15

    .line 54
    new-instance v4, La/o4e;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    const/4 v10, 0x0

    .line 60
    const-wide/16 v11, -0x1

    .line 61
    .line 62
    move-wide v13, v11

    .line 63
    invoke-direct/range {v4 .. v15}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 64
    .line 65
    .line 66
    new-instance v2, La/xl60;

    .line 67
    .line 68
    const-class v5, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;

    .line 69
    .line 70
    invoke-direct {v2, v5}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 71
    .line 72
    .line 73
    iget-object v5, v2, La/v0;->c:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, La/ppv0;

    .line 76
    .line 77
    iput-object v4, v5, La/ppv0;->j:La/o4e;

    .line 78
    .line 79
    iget-object v4, v2, La/v0;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v4, La/ppv0;

    .line 82
    .line 83
    iput-object v3, v4, La/ppv0;->e:La/maj;

    .line 84
    .line 85
    invoke-virtual {v2}, La/v0;->k()La/lpv0;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    check-cast v2, La/yl60;

    .line 90
    .line 91
    invoke-static {v1}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const-string v3, "CustomerIONewTokenWorker"

    .line 99
    .line 100
    sget-object v4, La/zko;->a:La/zko;

    .line 101
    .line 102
    invoke-virtual {v1, v3, v4, v2}, La/cpv0;->c(Ljava/lang/String;La/zko;La/yl60;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual/range {p0 .. p0}, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->getMessagingServiceHandler()La/w940;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1, v0}, La/w940;->e(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final setMessagingServiceCustomerIOHandler(La/u940;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->messagingServiceCustomerIOHandler:La/u940;

    .line 5
    .line 6
    return-void
.end method

.method public final setMessagingServiceHandler(La/w940;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/services/mobile_services/impl/presentation/services/GoogleMessagingService;->messagingServiceHandler:La/w940;

    .line 5
    .line 6
    return-void
.end method
