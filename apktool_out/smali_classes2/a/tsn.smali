.class public final La/tsn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final synthetic b:La/tsn;

.field public static final synthetic c:La/tsn;


# instance fields
.field public final synthetic a:B


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/tsn;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, La/tsn;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/tsn;->b:La/tsn;

    .line 8
    .line 9
    new-instance v0, La/tsn;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, v1}, La/tsn;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/tsn;->c:La/tsn;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(B)V
    .locals 0

    .line 8
    iput-byte p1, p0, La/tsn;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/o7x0;)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    iput-byte p1, p0, La/tsn;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final a()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic b()V
    .locals 0

    .line 1
    return-void
.end method

.method private final synthetic c()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-byte p0, p0, La/tsn;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "PhenotypeProcessReaper"

    .line 7
    .line 8
    new-instance v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :try_start_0
    invoke-static {v0}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    iget v2, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x11

    .line 30
    .line 31
    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 32
    .line 33
    .line 34
    const-string v3, "Memory state is: "

    .line 35
    .line 36
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-static {p0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 50
    .line 51
    const/16 v2, 0x190

    .line 52
    .line 53
    if-lt v0, v2, :cond_0

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    :goto_0
    move v0, v1

    .line 58
    goto :goto_1

    .line 59
    :catch_0
    move-exception v0

    .line 60
    const-string v2, "Failed to retrieve memory state, not killing process."

    .line 61
    .line 62
    invoke-static {p0, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :goto_1
    new-instance v2, Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-direct {v2, v0}, Ljava/lang/Boolean;-><init>(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    const-string v0, "Killing process to refresh experiment configuration"

    .line 78
    .line 79
    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 87
    .line 88
    .line 89
    invoke-static {v1}, Ljava/lang/System;->exit(I)V

    .line 90
    .line 91
    .line 92
    :cond_1
    :pswitch_0
    return-void

    .line 93
    :pswitch_1
    :try_start_1
    const-string p0, "EmojiCompat.EmojiCompatInitializer.run"

    .line 94
    .line 95
    sget-object v0, La/ebs0;->b:Ljava/lang/reflect/Method;

    .line 96
    .line 97
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {}, La/qsn;->d()Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_2

    .line 105
    .line 106
    invoke-static {}, La/qsn;->a()La/qsn;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0}, La/qsn;->e()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 111
    .line 112
    .line 113
    :cond_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    sget-object v0, La/ebs0;->b:Ljava/lang/reflect/Method;

    .line 119
    .line 120
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    nop

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
