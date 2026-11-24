.class public abstract La/ga3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static B(Landroid/view/MenuItem;CI)V
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, Landroid/view/MenuItem;->setNumericShortcut(CI)Landroid/view/MenuItem;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static C(Landroid/app/Notification$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Notification$Builder;->setSettingsText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static D(Landroid/app/Notification$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Notification$Builder;->setShortcutId(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static E(Landroid/app/Notification$Builder;)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-virtual {p0, v0, v1}, Landroid/app/Notification$Builder;->setTimeoutAfter(J)Landroid/app/Notification$Builder;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static F(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setTooltipText(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static G(Landroid/view/View;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setTooltipText(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final H(Landroid/app/Notification$Builder;Landroid/content/Context;Landroid/app/NotificationManager;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const v1, 0x7f130112

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const v1, 0x7f131713

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0, p1}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    const v0, 0x7f080afa

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-string v0, "progress"

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/app/Notification$Builder;->setCategory(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/16 v0, 0x64

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-virtual {p1, v0, v1, v1}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    .line 60
    .line 61
    .line 62
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 63
    .line 64
    const/16 v0, 0x1a

    .line 65
    .line 66
    if-lt p1, v0, :cond_1

    .line 67
    .line 68
    invoke-virtual {p2, p3}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    if-nez p0, :cond_0

    .line 73
    .line 74
    invoke-static {}, La/i7w0;->b()V

    .line 75
    .line 76
    .line 77
    new-instance p0, Landroid/app/NotificationChannel;

    .line 78
    .line 79
    const-string p1, "UPDATE_CHANNEL_prod"

    .line 80
    .line 81
    const/4 v0, 0x2

    .line 82
    invoke-direct {p0, p3, p1, v0}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, p0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 86
    .line 87
    .line 88
    :cond_0
    return-void

    .line 89
    :cond_1
    const/4 p1, -0x1

    .line 90
    invoke-virtual {p0, p1}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public static I(La/cpv0;La/us00;)V
    .locals 13

    .line 1
    new-instance v0, La/hl50;

    .line 2
    .line 3
    sget-object v0, La/sl50;->a:La/sl50;

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v3, La/sl50;->a:La/sl50;

    .line 11
    .line 12
    new-instance v2, La/hl50;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v2, v1}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v12

    .line 22
    new-instance v1, La/o4e;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const-wide/16 v8, -0x1

    .line 29
    .line 30
    move-wide v10, v8

    .line 31
    invoke-direct/range {v1 .. v12}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, La/ag90;

    .line 35
    .line 36
    const-class v2, Lorg/xplatform/aggregator/daily_tasks/impl/workers/DailyTaskNotificationWorker;

    .line 37
    .line 38
    invoke-direct {v0, v2}, La/ag90;-><init>(Ljava/lang/Class;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, v0, La/v0;->c:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v2, La/ppv0;

    .line 44
    .line 45
    iput-object v1, v2, La/ppv0;->j:La/o4e;

    .line 46
    .line 47
    invoke-virtual {v0}, La/v0;->k()La/lpv0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/bg90;

    .line 52
    .line 53
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 54
    .line 55
    const/16 v2, 0x1a

    .line 56
    .line 57
    if-gt v2, v1, :cond_0

    .line 58
    .line 59
    const/16 v2, 0x20

    .line 60
    .line 61
    if-ge v1, v2, :cond_0

    .line 62
    .line 63
    invoke-static {}, La/i7w0;->b()V

    .line 64
    .line 65
    .line 66
    new-instance v1, Landroid/app/NotificationChannel;

    .line 67
    .line 68
    const-string v2, "daily_task"

    .line 69
    .line 70
    const/4 v3, 0x3

    .line 71
    invoke-direct {v1, v2, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 72
    .line 73
    .line 74
    const-class v2, Landroid/app/NotificationManager;

    .line 75
    .line 76
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Landroid/app/NotificationManager;

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    sget-object p1, La/yko;->a:[La/yko;

    .line 86
    .line 87
    const-string p1, "DailyTasksNotificationWorker"

    .line 88
    .line 89
    invoke-virtual {p0, p1, v0}, La/cpv0;->b(Ljava/lang/String;La/bg90;)La/gqw0;

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public static J(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/content/Context;->startForegroundService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static K(La/cpv0;Landroid/content/Context;I)V
    .locals 13

    .line 1
    new-instance v0, La/hl50;

    .line 2
    .line 3
    sget-object v0, La/sl50;->a:La/sl50;

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 8
    .line 9
    .line 10
    sget-object v3, La/sl50;->b:La/sl50;

    .line 11
    .line 12
    new-instance v2, La/hl50;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v2, v1}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v12

    .line 22
    new-instance v1, La/o4e;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    const-wide/16 v8, -0x1

    .line 29
    .line 30
    move-wide v10, v8

    .line 31
    invoke-direct/range {v1 .. v12}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string v2, "COUNTRY_ID_PARAM"

    .line 40
    .line 41
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    invoke-interface {v0, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    new-instance p2, La/maj;

    .line 49
    .line 50
    invoke-direct {p2, v0}, La/maj;-><init>(Ljava/util/LinkedHashMap;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p2}, La/nkb;->I(La/maj;)[B

    .line 54
    .line 55
    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 57
    .line 58
    const/16 v2, 0x1a

    .line 59
    .line 60
    if-gt v2, v0, :cond_0

    .line 61
    .line 62
    const/16 v2, 0x20

    .line 63
    .line 64
    if-ge v0, v2, :cond_0

    .line 65
    .line 66
    invoke-static {}, La/i7w0;->b()V

    .line 67
    .line 68
    .line 69
    new-instance v0, Landroid/app/NotificationChannel;

    .line 70
    .line 71
    const-string v2, "tax_status"

    .line 72
    .line 73
    const/4 v3, 0x3

    .line 74
    invoke-direct {v0, v2, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 75
    .line 76
    .line 77
    const-class v2, Landroid/app/NotificationManager;

    .line 78
    .line 79
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, Landroid/app/NotificationManager;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 86
    .line 87
    .line 88
    :cond_0
    sget-object p1, La/zko;->b:La/zko;

    .line 89
    .line 90
    new-instance v0, La/xl60;

    .line 91
    .line 92
    const-class v2, Lorg/xplatform/betting/core/tax/TaxStatusWorker;

    .line 93
    .line 94
    invoke-direct {v0, v2}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 95
    .line 96
    .line 97
    iget-object v2, v0, La/v0;->c:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v2, La/ppv0;

    .line 100
    .line 101
    iput-object p2, v2, La/ppv0;->e:La/maj;

    .line 102
    .line 103
    iget-object p2, v0, La/v0;->c:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast p2, La/ppv0;

    .line 106
    .line 107
    iput-object v1, p2, La/ppv0;->j:La/o4e;

    .line 108
    .line 109
    const-string p2, "TaxStatusWorker"

    .line 110
    .line 111
    invoke-virtual {v0, p2}, La/v0;->g(Ljava/lang/String;)La/v0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, La/xl60;

    .line 116
    .line 117
    invoke-virtual {v0}, La/v0;->k()La/lpv0;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, La/yl60;

    .line 122
    .line 123
    invoke-virtual {p0, p2, p1, v0}, La/cpv0;->c(Ljava/lang/String;La/zko;La/yl60;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public static final L(Ljava/time/Duration;)J
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/time/Duration;->toMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public static a(La/cpv0;Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v1, La/hl50;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {v1, v0}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 8
    .line 9
    .line 10
    sget-object v2, La/sl50;->a:La/sl50;

    .line 11
    .line 12
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v11

    .line 21
    new-instance v0, La/o4e;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const-wide/16 v7, -0x1

    .line 28
    .line 29
    move-wide v9, v7

    .line 30
    invoke-direct/range {v0 .. v11}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "BUNDLE_REQUEST_ID"

    .line 39
    .line 40
    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    const-string v2, "BUNDLE_LIVE_TYPE"

    .line 44
    .line 45
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    invoke-interface {v1, v2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    new-instance p3, La/maj;

    .line 53
    .line 54
    invoke-direct {p3, v1}, La/maj;-><init>(Ljava/util/LinkedHashMap;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p3}, La/nkb;->I(La/maj;)[B

    .line 58
    .line 59
    .line 60
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 61
    .line 62
    const/16 v2, 0x1a

    .line 63
    .line 64
    if-gt v2, v1, :cond_0

    .line 65
    .line 66
    const/16 v2, 0x20

    .line 67
    .line 68
    if-ge v1, v2, :cond_0

    .line 69
    .line 70
    invoke-static {}, La/i7w0;->b()V

    .line 71
    .line 72
    .line 73
    new-instance v1, Landroid/app/NotificationChannel;

    .line 74
    .line 75
    const-string v2, "widget_best_update"

    .line 76
    .line 77
    const-string v3, "widget_best_update_name"

    .line 78
    .line 79
    const/4 v4, 0x3

    .line 80
    invoke-direct {v1, v2, v3, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 81
    .line 82
    .line 83
    const-class v2, Landroid/app/NotificationManager;

    .line 84
    .line 85
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Landroid/app/NotificationManager;

    .line 90
    .line 91
    invoke-virtual {p1, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 92
    .line 93
    .line 94
    :cond_0
    sget-object p1, La/zko;->a:La/zko;

    .line 95
    .line 96
    new-instance v1, La/xl60;

    .line 97
    .line 98
    const-class v2, Lorg/xplatform/widget/impl/workers/BestGamesRequestWorker;

    .line 99
    .line 100
    invoke-direct {v1, v2}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 101
    .line 102
    .line 103
    sget-object v2, La/od80;->a:La/od80;

    .line 104
    .line 105
    invoke-virtual {v1}, La/v0;->w()La/v0;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    check-cast v1, La/xl60;

    .line 110
    .line 111
    invoke-virtual {v1, p2}, La/v0;->g(Ljava/lang/String;)La/v0;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, La/xl60;

    .line 116
    .line 117
    iget-object v2, v1, La/v0;->c:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v2, La/ppv0;

    .line 120
    .line 121
    iput-object v0, v2, La/ppv0;->j:La/o4e;

    .line 122
    .line 123
    iget-object v0, v1, La/v0;->c:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, La/ppv0;

    .line 126
    .line 127
    iput-object p3, v0, La/ppv0;->e:La/maj;

    .line 128
    .line 129
    invoke-virtual {v1}, La/v0;->k()La/lpv0;

    .line 130
    .line 131
    .line 132
    move-result-object p3

    .line 133
    check-cast p3, La/yl60;

    .line 134
    .line 135
    invoke-virtual {p0, p2, p1, p3}, La/cpv0;->c(Ljava/lang/String;La/zko;La/yl60;)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public static b(La/cpv0;Landroid/content/Context;Ljava/lang/String;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v1, La/hl50;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {v1, v0}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 8
    .line 9
    .line 10
    sget-object v2, La/sl50;->a:La/sl50;

    .line 11
    .line 12
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v11

    .line 21
    new-instance v0, La/o4e;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const-wide/16 v7, -0x1

    .line 28
    .line 29
    move-wide v9, v7

    .line 30
    invoke-direct/range {v0 .. v11}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "BUNDLE_REQUEST_ID"

    .line 39
    .line 40
    invoke-interface {v1, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    new-instance v2, La/maj;

    .line 44
    .line 45
    invoke-direct {v2, v1}, La/maj;-><init>(Ljava/util/LinkedHashMap;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v2}, La/nkb;->I(La/maj;)[B

    .line 49
    .line 50
    .line 51
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 52
    .line 53
    const/16 v3, 0x1a

    .line 54
    .line 55
    if-gt v3, v1, :cond_0

    .line 56
    .line 57
    const/16 v3, 0x20

    .line 58
    .line 59
    if-ge v1, v3, :cond_0

    .line 60
    .line 61
    invoke-static {}, La/i7w0;->b()V

    .line 62
    .line 63
    .line 64
    new-instance v1, Landroid/app/NotificationChannel;

    .line 65
    .line 66
    const-string v3, "widget_favorite_update"

    .line 67
    .line 68
    const-string v4, "widget_favorite_update_name"

    .line 69
    .line 70
    const/4 v5, 0x3

    .line 71
    invoke-direct {v1, v3, v4, v5}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 72
    .line 73
    .line 74
    const-class v3, Landroid/app/NotificationManager;

    .line 75
    .line 76
    invoke-virtual {p1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Landroid/app/NotificationManager;

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    sget-object p1, La/zko;->a:La/zko;

    .line 86
    .line 87
    new-instance v1, La/xl60;

    .line 88
    .line 89
    const-class v3, Lorg/xplatform/widget/impl/workers/FavoritesGamesRequestWorker;

    .line 90
    .line 91
    invoke-direct {v1, v3}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 92
    .line 93
    .line 94
    sget-object v3, La/od80;->a:La/od80;

    .line 95
    .line 96
    invoke-virtual {v1}, La/v0;->w()La/v0;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    check-cast v1, La/xl60;

    .line 101
    .line 102
    invoke-virtual {v1, p2}, La/v0;->g(Ljava/lang/String;)La/v0;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, La/xl60;

    .line 107
    .line 108
    iget-object v3, v1, La/v0;->c:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v3, La/ppv0;

    .line 111
    .line 112
    iput-object v0, v3, La/ppv0;->j:La/o4e;

    .line 113
    .line 114
    iget-object v0, v1, La/v0;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, La/ppv0;

    .line 117
    .line 118
    iput-object v2, v0, La/ppv0;->e:La/maj;

    .line 119
    .line 120
    invoke-virtual {v1}, La/v0;->k()La/lpv0;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    check-cast v0, La/yl60;

    .line 125
    .line 126
    invoke-virtual {p0, p2, p1, v0}, La/cpv0;->c(Ljava/lang/String;La/zko;La/yl60;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public static final c(La/y4d;)Landroid/graphics/ColorSpace;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/a5d;->e:La/ubg0;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 12
    .line 13
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    sget-object v1, La/a5d;->q:La/ubg0;

    .line 22
    .line 23
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    sget-object v0, Landroid/graphics/ColorSpace$Named;->ACES:Landroid/graphics/ColorSpace$Named;

    .line 30
    .line 31
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    move-object v1, v0

    .line 36
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_1
    sget-object v1, La/a5d;->r:La/ubg0;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    sget-object v0, Landroid/graphics/ColorSpace$Named;->ACESCG:Landroid/graphics/ColorSpace$Named;

    .line 48
    .line 49
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    move-object v1, v0

    .line 54
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    sget-object v1, La/a5d;->o:La/ubg0;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    sget-object v0, Landroid/graphics/ColorSpace$Named;->ADOBE_RGB:Landroid/graphics/ColorSpace$Named;

    .line 66
    .line 67
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    move-object v1, v0

    .line 72
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 73
    .line 74
    return-object v0

    .line 75
    :cond_3
    sget-object v1, La/a5d;->j:La/ubg0;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    sget-object v0, Landroid/graphics/ColorSpace$Named;->BT2020:Landroid/graphics/ColorSpace$Named;

    .line 84
    .line 85
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    move-object v1, v0

    .line 90
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_4
    sget-object v1, La/a5d;->i:La/ubg0;

    .line 94
    .line 95
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_5

    .line 100
    .line 101
    sget-object v0, Landroid/graphics/ColorSpace$Named;->BT709:Landroid/graphics/ColorSpace$Named;

    .line 102
    .line 103
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v1, v0

    .line 108
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 109
    .line 110
    return-object v0

    .line 111
    :cond_5
    sget-object v1, La/a5d;->t:La/tty;

    .line 112
    .line 113
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    if-eqz v1, :cond_6

    .line 118
    .line 119
    sget-object v0, Landroid/graphics/ColorSpace$Named;->CIE_LAB:Landroid/graphics/ColorSpace$Named;

    .line 120
    .line 121
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    move-object v1, v0

    .line 126
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 127
    .line 128
    return-object v0

    .line 129
    :cond_6
    sget-object v1, La/a5d;->s:La/tty;

    .line 130
    .line 131
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    if-eqz v1, :cond_7

    .line 136
    .line 137
    sget-object v0, Landroid/graphics/ColorSpace$Named;->CIE_XYZ:Landroid/graphics/ColorSpace$Named;

    .line 138
    .line 139
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    move-object v1, v0

    .line 144
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 145
    .line 146
    return-object v0

    .line 147
    :cond_7
    sget-object v1, La/a5d;->k:La/ubg0;

    .line 148
    .line 149
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_8

    .line 154
    .line 155
    sget-object v0, Landroid/graphics/ColorSpace$Named;->DCI_P3:Landroid/graphics/ColorSpace$Named;

    .line 156
    .line 157
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    move-object v1, v0

    .line 162
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 163
    .line 164
    return-object v0

    .line 165
    :cond_8
    sget-object v1, La/a5d;->l:La/ubg0;

    .line 166
    .line 167
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    if-eqz v1, :cond_9

    .line 172
    .line 173
    sget-object v0, Landroid/graphics/ColorSpace$Named;->DISPLAY_P3:Landroid/graphics/ColorSpace$Named;

    .line 174
    .line 175
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    move-object v1, v0

    .line 180
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 181
    .line 182
    return-object v0

    .line 183
    :cond_9
    sget-object v1, La/a5d;->g:La/ubg0;

    .line 184
    .line 185
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v1

    .line 189
    if-eqz v1, :cond_a

    .line 190
    .line 191
    sget-object v0, Landroid/graphics/ColorSpace$Named;->EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    .line 192
    .line 193
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    move-object v1, v0

    .line 198
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 199
    .line 200
    return-object v0

    .line 201
    :cond_a
    sget-object v1, La/a5d;->h:La/ubg0;

    .line 202
    .line 203
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_b

    .line 208
    .line 209
    sget-object v0, Landroid/graphics/ColorSpace$Named;->LINEAR_EXTENDED_SRGB:Landroid/graphics/ColorSpace$Named;

    .line 210
    .line 211
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    move-object v1, v0

    .line 216
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 217
    .line 218
    return-object v0

    .line 219
    :cond_b
    sget-object v1, La/a5d;->f:La/ubg0;

    .line 220
    .line 221
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-eqz v1, :cond_c

    .line 226
    .line 227
    sget-object v0, Landroid/graphics/ColorSpace$Named;->LINEAR_SRGB:Landroid/graphics/ColorSpace$Named;

    .line 228
    .line 229
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    move-object v1, v0

    .line 234
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 235
    .line 236
    return-object v0

    .line 237
    :cond_c
    sget-object v1, La/a5d;->m:La/ubg0;

    .line 238
    .line 239
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_d

    .line 244
    .line 245
    sget-object v0, Landroid/graphics/ColorSpace$Named;->NTSC_1953:Landroid/graphics/ColorSpace$Named;

    .line 246
    .line 247
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    move-object v1, v0

    .line 252
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 253
    .line 254
    return-object v0

    .line 255
    :cond_d
    sget-object v1, La/a5d;->p:La/ubg0;

    .line 256
    .line 257
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    if-eqz v1, :cond_e

    .line 262
    .line 263
    sget-object v0, Landroid/graphics/ColorSpace$Named;->PRO_PHOTO_RGB:Landroid/graphics/ColorSpace$Named;

    .line 264
    .line 265
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    move-object v1, v0

    .line 270
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 271
    .line 272
    return-object v0

    .line 273
    :cond_e
    sget-object v1, La/a5d;->n:La/ubg0;

    .line 274
    .line 275
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_f

    .line 280
    .line 281
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SMPTE_C:Landroid/graphics/ColorSpace$Named;

    .line 282
    .line 283
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    move-object v1, v0

    .line 288
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 289
    .line 290
    return-object v0

    .line 291
    :cond_f
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 292
    .line 293
    const/16 v2, 0x22

    .line 294
    .line 295
    const/4 v3, 0x0

    .line 296
    if-lt v1, v2, :cond_12

    .line 297
    .line 298
    sget-object v2, La/a5d;->v:La/ubg0;

    .line 299
    .line 300
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    if-eqz v2, :cond_10

    .line 305
    .line 306
    invoke-static {}, La/b03;->j()Landroid/graphics/ColorSpace$Named;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    invoke-static {v2}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    goto :goto_0

    .line 315
    :cond_10
    sget-object v2, La/a5d;->w:La/ubg0;

    .line 316
    .line 317
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    if-eqz v2, :cond_11

    .line 322
    .line 323
    invoke-static {}, La/b03;->w()Landroid/graphics/ColorSpace$Named;

    .line 324
    .line 325
    .line 326
    move-result-object v2

    .line 327
    invoke-static {v2}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    goto :goto_0

    .line 332
    :cond_11
    move-object v2, v3

    .line 333
    :goto_0
    if-eqz v2, :cond_12

    .line 334
    .line 335
    move-object v0, v2

    .line 336
    check-cast v0, Landroid/graphics/ColorSpace;

    .line 337
    .line 338
    return-object v2

    .line 339
    :cond_12
    const/16 v2, 0x24

    .line 340
    .line 341
    if-lt v1, v2, :cond_14

    .line 342
    .line 343
    sget-object v1, La/a5d;->x:La/rf60;

    .line 344
    .line 345
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    if-eqz v1, :cond_13

    .line 350
    .line 351
    invoke-static {}, La/ob5;->f()Landroid/graphics/ColorSpace$Named;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    invoke-static {v1}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    goto :goto_1

    .line 360
    :cond_13
    move-object v1, v3

    .line 361
    :goto_1
    if-eqz v1, :cond_14

    .line 362
    .line 363
    move-object v0, v1

    .line 364
    check-cast v0, Landroid/graphics/ColorSpace;

    .line 365
    .line 366
    return-object v1

    .line 367
    :cond_14
    instance-of v1, v0, La/ubg0;

    .line 368
    .line 369
    if-eqz v1, :cond_19

    .line 370
    .line 371
    iget-object v5, v0, La/y4d;->a:Ljava/lang/String;

    .line 372
    .line 373
    check-cast v0, La/ubg0;

    .line 374
    .line 375
    iget-object v1, v0, La/ubg0;->d:La/nav0;

    .line 376
    .line 377
    invoke-virtual {v1}, La/nav0;->a()[F

    .line 378
    .line 379
    .line 380
    move-result-object v7

    .line 381
    iget-object v1, v0, La/ubg0;->g:La/phs0;

    .line 382
    .line 383
    if-eqz v1, :cond_15

    .line 384
    .line 385
    new-instance v2, Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    .line 386
    .line 387
    iget-wide v9, v1, La/phs0;->b:D

    .line 388
    .line 389
    iget-wide v11, v1, La/phs0;->c:D

    .line 390
    .line 391
    iget-wide v13, v1, La/phs0;->d:D

    .line 392
    .line 393
    iget-wide v2, v1, La/phs0;->e:D

    .line 394
    .line 395
    move-wide v15, v2

    .line 396
    iget-wide v2, v1, La/phs0;->f:D

    .line 397
    .line 398
    move-wide/from16 v17, v2

    .line 399
    .line 400
    iget-wide v2, v1, La/phs0;->g:D

    .line 401
    .line 402
    move-wide/from16 v19, v2

    .line 403
    .line 404
    iget-wide v1, v1, La/phs0;->a:D

    .line 405
    .line 406
    new-instance v8, Landroid/graphics/ColorSpace$Rgb$TransferParameters;

    .line 407
    .line 408
    move-wide/from16 v21, v1

    .line 409
    .line 410
    invoke-direct/range {v8 .. v22}, Landroid/graphics/ColorSpace$Rgb$TransferParameters;-><init>(DDDDDDD)V

    .line 411
    .line 412
    .line 413
    move-object v3, v8

    .line 414
    :cond_15
    iget-object v1, v0, La/ubg0;->i:[F

    .line 415
    .line 416
    const/4 v2, 0x0

    .line 417
    if-eqz v3, :cond_18

    .line 418
    .line 419
    invoke-static {}, La/y24;->y()V

    .line 420
    .line 421
    .line 422
    iget-object v0, v0, La/ubg0;->h:[F

    .line 423
    .line 424
    new-instance v4, Landroid/graphics/ColorSpace$Rgb;

    .line 425
    .line 426
    invoke-direct {v4, v5, v0, v7, v3}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLandroid/graphics/ColorSpace$Rgb$TransferParameters;)V

    .line 427
    .line 428
    .line 429
    aget v0, v1, v2

    .line 430
    .line 431
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    if-eqz v0, :cond_16

    .line 436
    .line 437
    goto :goto_2

    .line 438
    :cond_16
    invoke-virtual {v4}, Landroid/graphics/ColorSpace$Rgb;->getTransform()[F

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([F[F)Z

    .line 443
    .line 444
    .line 445
    move-result v0

    .line 446
    if-eqz v0, :cond_17

    .line 447
    .line 448
    :goto_2
    check-cast v4, Landroid/graphics/ColorSpace;

    .line 449
    .line 450
    return-object v4

    .line 451
    :cond_17
    invoke-static {}, La/y24;->y()V

    .line 452
    .line 453
    .line 454
    new-instance v0, Landroid/graphics/ColorSpace$Rgb;

    .line 455
    .line 456
    invoke-direct {v0, v5, v1, v3}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[FLandroid/graphics/ColorSpace$Rgb$TransferParameters;)V

    .line 457
    .line 458
    .line 459
    check-cast v0, Landroid/graphics/ColorSpace;

    .line 460
    .line 461
    return-object v0

    .line 462
    :cond_18
    invoke-static {}, La/y24;->y()V

    .line 463
    .line 464
    .line 465
    iget-object v6, v0, La/ubg0;->h:[F

    .line 466
    .line 467
    iget-object v1, v0, La/ubg0;->l:La/tbg0;

    .line 468
    .line 469
    new-instance v8, La/z4d;

    .line 470
    .line 471
    invoke-direct {v8, v1, v2}, La/z4d;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 472
    .line 473
    .line 474
    iget-object v1, v0, La/ubg0;->o:La/tbg0;

    .line 475
    .line 476
    new-instance v9, La/z4d;

    .line 477
    .line 478
    const/4 v2, 0x1

    .line 479
    invoke-direct {v9, v1, v2}, La/z4d;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 480
    .line 481
    .line 482
    iget v10, v0, La/ubg0;->e:F

    .line 483
    .line 484
    iget v11, v0, La/ubg0;->f:F

    .line 485
    .line 486
    new-instance v4, Landroid/graphics/ColorSpace$Rgb;

    .line 487
    .line 488
    invoke-direct/range {v4 .. v11}, Landroid/graphics/ColorSpace$Rgb;-><init>(Ljava/lang/String;[F[FLjava/util/function/DoubleUnaryOperator;Ljava/util/function/DoubleUnaryOperator;FF)V

    .line 489
    .line 490
    .line 491
    check-cast v4, Landroid/graphics/ColorSpace;

    .line 492
    .line 493
    return-object v4

    .line 494
    :cond_19
    sget-object v0, Landroid/graphics/ColorSpace$Named;->SRGB:Landroid/graphics/ColorSpace$Named;

    .line 495
    .line 496
    invoke-static {v0}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    move-object v1, v0

    .line 501
    check-cast v1, Landroid/graphics/ColorSpace;

    .line 502
    .line 503
    return-object v0
.end method

.method public static d(La/cpv0;Landroid/content/Context;Ljava/util/LinkedHashMap;)V
    .locals 12

    .line 1
    new-instance v1, La/hl50;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {v1, v0}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 5
    .line 6
    .line 7
    sget-object v2, La/sl50;->a:La/sl50;

    .line 8
    .line 9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object v11

    .line 18
    new-instance v0, La/o4e;

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    const-wide/16 v7, -0x1

    .line 25
    .line 26
    move-wide v9, v7

    .line 27
    invoke-direct/range {v0 .. v11}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, La/laj;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, v2}, La/laj;-><init>(B)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p2}, La/laj;->c(Ljava/util/Map;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, La/laj;->a()La/maj;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 44
    .line 45
    const/16 v2, 0x1a

    .line 46
    .line 47
    if-gt v2, v1, :cond_0

    .line 48
    .line 49
    const/16 v2, 0x20

    .line 50
    .line 51
    if-ge v1, v2, :cond_0

    .line 52
    .line 53
    invoke-static {}, La/i7w0;->b()V

    .line 54
    .line 55
    .line 56
    new-instance v1, Landroid/app/NotificationChannel;

    .line 57
    .line 58
    const-string v2, "confirm_auth"

    .line 59
    .line 60
    const/4 v3, 0x3

    .line 61
    invoke-direct {v1, v2, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 62
    .line 63
    .line 64
    const-class v2, Landroid/app/NotificationManager;

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    check-cast p1, Landroid/app/NotificationManager;

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 73
    .line 74
    .line 75
    :cond_0
    new-instance p1, La/xl60;

    .line 76
    .line 77
    const-class v1, Lorg/xplatform/authenticator/impl/workers/ConfirmationAuthenticatorWorker;

    .line 78
    .line 79
    invoke-direct {p1, v1}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 80
    .line 81
    .line 82
    sget-object v1, La/od80;->a:La/od80;

    .line 83
    .line 84
    invoke-virtual {p1}, La/v0;->w()La/v0;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, La/xl60;

    .line 89
    .line 90
    iget-object v1, p1, La/v0;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, La/ppv0;

    .line 93
    .line 94
    iput-object v0, v1, La/ppv0;->j:La/o4e;

    .line 95
    .line 96
    iget-object v0, p1, La/v0;->c:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, La/ppv0;

    .line 99
    .line 100
    iput-object p2, v0, La/ppv0;->e:La/maj;

    .line 101
    .line 102
    invoke-virtual {p1}, La/v0;->k()La/lpv0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p0, p1}, La/cpv0;->a(La/lpv0;)V

    .line 107
    .line 108
    .line 109
    return-void
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)Landroid/app/Notification$Builder;
    .locals 1

    .line 1
    new-instance v0, Landroid/app/Notification$Builder;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static f(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;
    .locals 0

    .line 1
    invoke-static {p0}, Landroid/graphics/drawable/Icon;->createWithAdaptiveBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/drawable/Icon;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static g(Landroid/view/View;)Landroid/view/autofill/AutofillId;
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static h(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static i(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledHorizontalScrollFactor()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static j(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static k(Landroid/widget/TextView;)Landroid/view/textclassifier/TextClassifier;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-class v0, Landroid/view/textclassifier/TextClassificationManager;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Landroid/view/textclassifier/TextClassificationManager;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/textclassifier/TextClassificationManager;->getTextClassifier()Landroid/view/textclassifier/TextClassifier;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Landroid/view/textclassifier/TextClassifier;->NO_OP:Landroid/view/textclassifier/TextClassifier;

    .line 21
    .line 22
    return-object p0
.end method

.method public static l(Landroid/view/ViewConfiguration;)F
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewConfiguration;->getScaledVerticalScrollFactor()F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static m(La/cpv0;La/us00;Ljava/util/Map;)V
    .locals 12

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v1, La/hl50;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {v1, v0}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 8
    .line 9
    .line 10
    sget-object v2, La/sl50;->a:La/sl50;

    .line 11
    .line 12
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 18
    .line 19
    .line 20
    move-result-object v11

    .line 21
    new-instance v0, La/o4e;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/4 v4, 0x0

    .line 25
    const/4 v5, 0x0

    .line 26
    const/4 v6, 0x0

    .line 27
    const-wide/16 v7, -0x1

    .line 28
    .line 29
    move-wide v9, v7

    .line 30
    invoke-direct/range {v0 .. v11}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, La/laj;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, v2}, La/laj;-><init>(B)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, p2}, La/laj;->c(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, La/laj;->a()La/maj;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 47
    .line 48
    const/16 v2, 0x1a

    .line 49
    .line 50
    if-gt v2, v1, :cond_0

    .line 51
    .line 52
    const/16 v2, 0x20

    .line 53
    .line 54
    if-ge v1, v2, :cond_0

    .line 55
    .line 56
    invoke-static {}, La/i7w0;->b()V

    .line 57
    .line 58
    .line 59
    new-instance v1, Landroid/app/NotificationChannel;

    .line 60
    .line 61
    const-string v2, "auth_push"

    .line 62
    .line 63
    const/4 v3, 0x3

    .line 64
    invoke-direct {v1, v2, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 65
    .line 66
    .line 67
    const-class v2, Landroid/app/NotificationManager;

    .line 68
    .line 69
    invoke-virtual {p1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Landroid/app/NotificationManager;

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 76
    .line 77
    .line 78
    :cond_0
    new-instance p1, La/xl60;

    .line 79
    .line 80
    const-class v1, Lorg/xplatform/services/mobile_services/impl/workers/AuthenticatorPushWorker;

    .line 81
    .line 82
    invoke-direct {p1, v1}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 83
    .line 84
    .line 85
    sget-object v1, La/od80;->a:La/od80;

    .line 86
    .line 87
    invoke-virtual {p1}, La/v0;->w()La/v0;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, La/xl60;

    .line 92
    .line 93
    iget-object v1, p1, La/v0;->c:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, La/ppv0;

    .line 96
    .line 97
    iput-object v0, v1, La/ppv0;->j:La/o4e;

    .line 98
    .line 99
    iget-object v0, p1, La/v0;->c:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v0, La/ppv0;

    .line 102
    .line 103
    iput-object p2, v0, La/ppv0;->e:La/maj;

    .line 104
    .line 105
    invoke-virtual {p1}, La/v0;->k()La/lpv0;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p0, p1}, La/cpv0;->a(La/lpv0;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public static n(Ljava/io/File;Ljava/io/File;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v1, 0x1

    .line 11
    new-array v2, v1, [Ljava/nio/file/CopyOption;

    .line 12
    .line 13
    sget-object v3, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 14
    .line 15
    aput-object v3, v2, v0

    .line 16
    .line 17
    invoke-static {p0, p1, v2}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return v1

    .line 21
    :catch_0
    return v0
.end method

.method public static o(Landroid/view/Window$Callback;Z)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroid/view/Window$Callback;->onPointerCaptureChanged(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static p(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x0

    .line 3
    const/4 v3, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    invoke-virtual/range {v0 .. v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static q(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    .locals 6

    .line 1
    const/4 v4, 0x0

    .line 2
    const/4 v5, 0x2

    .line 3
    const/4 v3, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    invoke-virtual/range {v0 .. v5}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;I)Landroid/content/Intent;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static r(Landroid/animation/AnimatorSet;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->reverse()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static s(Landroid/view/MenuItem;CI)V
    .locals 0

    .line 1
    invoke-interface {p0, p1, p2}, Landroid/view/MenuItem;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static t(Landroid/widget/TextView;IIII)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static u(ILandroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static v(Landroid/app/Notification$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Notification$Builder;->setBadgeIconType(I)Landroid/app/Notification$Builder;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static w(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setContentDescription(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static x(Landroid/animation/AnimatorSet;J)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2}, Landroid/animation/AnimatorSet;->setCurrentPlayTime(J)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public static y(Landroid/app/Notification$Builder;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Notification$Builder;->setGroupAlertBehavior(I)Landroid/app/Notification$Builder;

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public static z(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Landroid/view/MenuItem;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    .line 2
    .line 3
    .line 4
    return-void
.end method
