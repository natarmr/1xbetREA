.class public final Lcom/appsflyer/internal/AFj1sSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final AFKeystoreWrapper:Landroid/content/Intent;


# direct methods
.method public constructor <init>(Landroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1sSDK;->AFKeystoreWrapper:Landroid/content/Intent;

    .line 8
    .line 9
    return-void
.end method

.method private static final AFKeystoreWrapper(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1sSDK;->AFKeystoreWrapper:Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private final AFLogger(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;",
            "Ljava/lang/String;",
            "TT;Z)TT;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lcom/appsflyer/internal/AFj1sSDK;->AFKeystoreWrapper:Landroid/content/Intent;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 7
    .line 8
    invoke-interface/range {p1 .. p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 15
    .line 16
    new-instance v3, La/g0g0;

    .line 17
    .line 18
    invoke-direct {v3, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    move-object v0, v3

    .line 22
    :goto_0
    const-class v3, Ljava/util/ConcurrentModificationException;

    .line 23
    .line 24
    sget-object v4, La/sre0;->a:La/tre0;

    .line 25
    .line 26
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-class v5, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 31
    .line 32
    invoke-virtual {v4, v5}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    const/4 v6, 0x2

    .line 37
    new-array v6, v6, [La/sgy;

    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    aput-object v3, v6, v7

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    aput-object v5, v6, v3

    .line 44
    .line 45
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 46
    .line 47
    .line 48
    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 49
    if-nez v11, :cond_0

    .line 50
    .line 51
    move-object/from16 v4, p3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_0
    :try_start_2
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v4, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-static {v0, v6}, La/tx3;->u(Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    if-eqz p4, :cond_1

    .line 69
    .line 70
    move-object/from16 v3, p1

    .line 71
    .line 72
    move-object/from16 v14, p2

    .line 73
    .line 74
    move-object/from16 v4, p3

    .line 75
    .line 76
    :try_start_3
    invoke-direct {v1, v3, v14, v4, v7}, Lcom/appsflyer/internal/AFj1sSDK;->AFLogger(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    goto :goto_2

    .line 81
    :catchall_1
    move-exception v0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move-object/from16 v14, p2

    .line 84
    .line 85
    move-object/from16 v4, p3

    .line 86
    .line 87
    sget-object v8, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 88
    .line 89
    sget-object v9, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 90
    .line 91
    const/16 v16, 0x48

    .line 92
    .line 93
    const/16 v17, 0x0

    .line 94
    .line 95
    const/4 v12, 0x0

    .line 96
    const/4 v13, 0x0

    .line 97
    const/4 v14, 0x0

    .line 98
    const/4 v15, 0x0

    .line 99
    move-object/from16 v10, p2

    .line 100
    .line 101
    invoke-static/range {v8 .. v17}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    move-object v0, v4

    .line 105
    goto :goto_2

    .line 106
    :cond_2
    move-object/from16 v4, p3

    .line 107
    .line 108
    throw v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 109
    :catchall_2
    move-exception v0

    .line 110
    move-object/from16 v4, p3

    .line 111
    .line 112
    :goto_1
    :try_start_4
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 113
    .line 114
    new-instance v1, La/g0g0;

    .line 115
    .line 116
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    move-object v0, v1

    .line 120
    :goto_2
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object v15

    .line 124
    if-nez v15, :cond_3

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_3
    sget-object v12, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 128
    .line 129
    sget-object v13, Lcom/appsflyer/sdk_base/logger/LogTag;->GENERAL:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 130
    .line 131
    const/16 v20, 0x48

    .line 132
    .line 133
    const/16 v21, 0x0

    .line 134
    .line 135
    const/16 v16, 0x0

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const/16 v18, 0x0

    .line 140
    .line 141
    const/16 v19, 0x0

    .line 142
    .line 143
    move-object/from16 v14, p2

    .line 144
    .line 145
    invoke-static/range {v12 .. v21}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 146
    .line 147
    .line 148
    move-object v0, v4

    .line 149
    :goto_3
    monitor-exit v2

    .line 150
    return-object v0

    .line 151
    :catchall_3
    move-exception v0

    .line 152
    monitor-exit v2

    .line 153
    throw v0
.end method

.method private static final U_(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Landroid/os/Parcelable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1sSDK;->AFKeystoreWrapper:Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static final V_(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;J)Landroid/content/Intent;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1sSDK;->AFKeystoreWrapper:Landroid/content/Intent;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static synthetic a(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFj1sSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Landroid/os/Parcelable;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFj1sSDK;->U_(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;J)Landroid/content/Intent;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lcom/appsflyer/internal/AFj1sSDK;->V_(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/appsflyer/internal/AFj1sSDK;->registerClient(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method private static final registerClient(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;)Z
    .locals 0

    .line 26
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1sSDK;->AFKeystoreWrapper:Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final AFLogger(Ljava/lang/String;)Z
    .locals 3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    new-instance v0, Lcom/appsflyer/internal/c0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Lcom/appsflyer/internal/c0;-><init>(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;B)V

    .line 155
    const-string v1, "Error while trying to check presence of "

    const-string v2, " extra from intent"

    .line 156
    invoke-static {v1, p1, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 157
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x1

    .line 158
    invoke-direct {p0, v0, p1, v1, v2}, Lcom/appsflyer/internal/AFj1sSDK;->AFLogger(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;

    move-result-object p0

    .line 159
    check-cast p0, Ljava/lang/Boolean;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_0
    return v2
.end method

.method public final S_(Ljava/lang/String;)Landroid/os/Parcelable;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroid/os/Parcelable;",
            ">(",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/appsflyer/internal/c0;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, p1, v1}, Lcom/appsflyer/internal/c0;-><init>(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;B)V

    .line 8
    .line 9
    .line 10
    const-string v1, "Error while trying to read "

    .line 11
    .line 12
    const-string v2, " extra from intent"

    .line 13
    .line 14
    invoke-static {v1, p1, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {p0, v0, p1, v1, v2}, Lcom/appsflyer/internal/AFj1sSDK;->AFLogger(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Landroid/os/Parcelable;

    .line 25
    .line 26
    return-object p0
.end method

.method public final T_(Ljava/lang/String;J)Landroid/content/Intent;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/appsflyer/internal/d0;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1, p2, p3}, Lcom/appsflyer/internal/d0;-><init>(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;J)V

    .line 7
    .line 8
    .line 9
    const-string p2, "Error while trying to write "

    .line 10
    .line 11
    const-string p3, " extra to intent"

    .line 12
    .line 13
    invoke-static {p2, p1, p3}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 p2, 0x0

    .line 18
    const/4 p3, 0x1

    .line 19
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/appsflyer/internal/AFj1sSDK;->AFLogger(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Landroid/content/Intent;

    .line 24
    .line 25
    return-object p0
.end method

.method public final registerClient(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/appsflyer/internal/c0;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, p0, p1, v1}, Lcom/appsflyer/internal/c0;-><init>(Lcom/appsflyer/internal/AFj1sSDK;Ljava/lang/String;B)V

    .line 8
    .line 9
    .line 10
    const-string v2, "Error while trying to read "

    .line 11
    .line 12
    const-string v3, " extra from intent"

    .line 13
    .line 14
    invoke-static {v2, p1, v3}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {p0, v0, p1, v2, v1}, Lcom/appsflyer/internal/AFj1sSDK;->AFLogger(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/Object;Z)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Ljava/lang/String;

    .line 24
    .line 25
    return-object p0
.end method
