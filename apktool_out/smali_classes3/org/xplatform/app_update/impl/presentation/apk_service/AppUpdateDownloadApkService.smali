.class public final Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;
.super La/mlz;
.source "SourceFile"


# static fields
.field public static final synthetic g:I


# instance fields
.field public final b:La/n0o0;

.field public c:Landroid/app/Notification$Builder;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/mlz;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zk3;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/zk3;-><init>(Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->b:La/n0o0;

    .line 15
    .line 16
    new-instance v0, La/zk3;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, p0, v1}, La/zk3;-><init>(Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->d:La/n0o0;

    .line 27
    .line 28
    new-instance v0, La/zk3;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-direct {v0, p0, v1}, La/zk3;-><init>(Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->e:La/n0o0;

    .line 39
    .line 40
    new-instance v0, La/zk3;

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    invoke-direct {v0, p0, v1}, La/zk3;-><init>(Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->f:La/n0o0;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->c:Landroid/app/Notification$Builder;

    .line 3
    .line 4
    iget-object v1, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->e:La/n0o0;

    .line 5
    .line 6
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, La/gl3;

    .line 11
    .line 12
    iget-object v2, v1, La/gl3;->l:La/bby;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v2, v1, La/gl3;->h:La/cl3;

    .line 20
    .line 21
    iget-object v2, v2, La/cl3;->a:La/mii0;

    .line 22
    .line 23
    iget-object v2, v2, La/mii0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v2, La/krv0;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    iput-boolean v3, v2, La/krv0;->a:Z

    .line 29
    .line 30
    iget-object v1, v1, La/gl3;->i:La/wsf0;

    .line 31
    .line 32
    iget-object v1, v1, La/wsf0;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, La/prc;

    .line 35
    .line 36
    iget-object v1, v1, La/prc;->b:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, La/dcl;

    .line 39
    .line 40
    iget-object v1, v1, La/dcl;->a:La/p7m0;

    .line 41
    .line 42
    invoke-virtual {v1, v0}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v3}, Landroid/app/Service;->stopForeground(Z)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->b:La/n0o0;

    .line 52
    .line 53
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, Landroid/app/NotificationManager;

    .line 58
    .line 59
    const/16 v0, 0x400

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/app/NotificationManager;->cancel(I)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/mlz;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 5
    .line 6
    .line 7
    const-string v0, "KEY_APP_UPDATE_APK_VERSION"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "0.0.0"

    .line 16
    .line 17
    :cond_0
    const-string v1, "KEY_APP_UPDATE_APK_URL"

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->e:La/n0o0;

    .line 26
    .line 27
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, La/gl3;

    .line 32
    .line 33
    invoke-static {p0}, La/sj3;->Y(Landroid/content/Context;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    invoke-virtual {v1, v2, v3, v0, p1}, La/gl3;->w(JLjava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->f:La/n0o0;

    .line 41
    .line 42
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, La/al3;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_1
    invoke-static {}, La/e9d0;->o()V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    return-object p0
.end method

.method public final onCreate()V
    .locals 10

    .line 1
    invoke-super {p0}, La/mlz;->onCreate()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->e:La/n0o0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/gl3;

    .line 11
    .line 12
    iget-object v0, v0, La/gl3;->m:La/p7m0;

    .line 13
    .line 14
    new-instance v1, La/lr;

    .line 15
    .line 16
    const/16 v2, 0xf

    .line 17
    .line 18
    invoke-direct {v1, v0, v2}, La/lr;-><init>(La/gmq;B)V

    .line 19
    .line 20
    .line 21
    sget-object v0, La/lkz;->a:La/lkz;

    .line 22
    .line 23
    new-instance v2, La/i8;

    .line 24
    .line 25
    const/4 v8, 0x4

    .line 26
    const/16 v9, 0x19

    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    const-class v5, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;

    .line 30
    .line 31
    const-string v6, "handleEvent"

    .line 32
    .line 33
    const-string v7, "handleEvent(Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkEvent;)V"

    .line 34
    .line 35
    move-object v4, p0

    .line 36
    invoke-direct/range {v2 .. v9}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 37
    .line 38
    .line 39
    iget-object p0, v4, La/mlz;->a:La/cyu;

    .line 40
    .line 41
    iget-object p0, p0, La/cyu;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p0, La/glz;

    .line 44
    .line 45
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance v0, La/tg3;

    .line 50
    .line 51
    const/4 v3, 0x0

    .line 52
    invoke-direct {v0, v1, v4, v2, v3}, La/tg3;-><init>(La/lr;Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;La/i8;La/yje;)V

    .line 53
    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    invoke-static {p0, v3, v3, v0, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public final onDestroy()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lorg/xplatform/app_update/impl/presentation/apk_service/AppUpdateDownloadApkService;->a()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, La/mlz;->onDestroy()V

    .line 5
    .line 6
    .line 7
    return-void
.end method
