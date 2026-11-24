.class public final La/sbx0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ukj;
.implements La/n1x;


# static fields
.field public static f:La/sbx0;

.field public static g:La/sbx0;


# instance fields
.field public final synthetic a:B

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    .line 1
    iput-byte p1, p0, La/sbx0;->a:B

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput p1, p0, La/sbx0;->b:I

    .line 11
    .line 12
    new-instance p1, Ljava/lang/Object;

    .line 13
    .line 14
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p1, La/xp6;

    .line 24
    .line 25
    const/16 v0, 0x10

    .line 26
    .line 27
    invoke-direct {p1, p0, v0}, La/xp6;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 31
    .line 32
    new-instance p1, La/z0i;

    .line 33
    .line 34
    const/4 v0, 0x4

    .line 35
    invoke-direct {p1, p0, v0}, La/z0i;-><init>(Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 39
    .line 40
    return-void

    .line 41
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance p1, Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 50
    .line 51
    new-instance p1, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 57
    .line 58
    new-instance p1, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 64
    .line 65
    return-void

    .line 66
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    .line 68
    .line 69
    new-instance p1, Ljava/lang/Object;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    iput-object p1, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object p1, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 80
    .line 81
    const/4 p1, 0x0

    .line 82
    iput p1, p0, La/sbx0;->b:I

    .line 83
    .line 84
    return-void

    .line 85
    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_2
        0x9 -> :sswitch_1
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 104
    iput-byte p1, p0, La/sbx0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;ILjava/util/ArrayList;[B)V
    .locals 0

    const/16 p1, 0xc

    iput-byte p1, p0, La/sbx0;->a:B

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p2, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 113
    iput p3, p0, La/sbx0;->b:I

    if-nez p4, :cond_0

    .line 114
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 115
    :cond_0
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    :goto_0
    iput-object p1, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 116
    iput-object p5, p0, La/sbx0;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/dcy;)V
    .locals 3

    const/4 v0, 0x7

    iput-byte v0, p0, La/sbx0;->a:B

    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    iput-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    const/16 p1, 0x8

    .line 101
    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 102
    new-array v0, p1, [I

    const/4 v1, 0x0

    :goto_0
    const/4 v2, -0x1

    if-ge v1, p1, :cond_0

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput-object v0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 103
    iput v2, p0, La/sbx0;->b:I

    return-void
.end method

.method public constructor <init>(La/ku5;La/sq8;)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, La/sbx0;->a:B

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 107
    iget p1, p1, La/ku5;->b:I

    .line 108
    iput p1, p0, La/sbx0;->b:I

    .line 109
    iput-object p2, p0, La/sbx0;->e:Ljava/lang/Object;

    add-int/lit8 p1, p1, 0x2

    .line 110
    new-array p1, p1, [La/zri;

    iput-object p1, p0, La/sbx0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/u33;La/u33;La/u33;I)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/sbx0;->a:B

    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 95
    iput-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 96
    iput-object p2, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 97
    iput-object p3, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 98
    iput p4, p0, La/sbx0;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/sbx0;->a:B

    .line 92
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La/d6x0;

    invoke-direct {v0, p0}, La/d6x0;-><init>(La/sbx0;)V

    iput-object v0, p0, La/sbx0;->e:Ljava/lang/Object;

    const/4 v0, 0x1

    iput v0, p0, La/sbx0;->b:I

    iput-object p2, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 93
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 85
    iput-byte p5, p0, La/sbx0;->a:B

    iput-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    iput p2, p0, La/sbx0;->b:I

    iput-object p3, p0, La/sbx0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/sbx0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/sbx0;->a:B

    .line 86
    invoke-static {p1, p3, p4}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput p2, p0, La/sbx0;->b:I

    .line 89
    iput-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 90
    iput-object p3, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 91
    iput-object p4, p0, La/sbx0;->e:Ljava/lang/Object;

    return-void
.end method

.method public static declared-synchronized m(Landroid/content/Context;)La/sbx0;
    .locals 4

    .line 1
    const-class v0, La/sbx0;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, La/sbx0;->f:La/sbx0;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    new-instance v1, La/sbx0;

    .line 9
    .line 10
    new-instance v2, La/n950;

    .line 11
    .line 12
    const-string v3, "MessengerIpcClient"

    .line 13
    .line 14
    invoke-direct {v2, v3}, La/n950;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-static {v3, v2}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-static {v2}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-direct {v1, p0, v2}, La/sbx0;-><init>(Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, La/sbx0;->f:La/sbx0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    monitor-exit v0

    .line 35
    return-object v1

    .line 36
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    throw p0
.end method


# virtual methods
.method public a(La/zri;)V
    .locals 12

    .line 1
    if-eqz p1, :cond_e

    .line 2
    .line 3
    check-cast p1, La/egk;

    .line 4
    .line 5
    iget-object p0, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ku5;

    .line 8
    .line 9
    iget-object v0, p1, La/zri;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, [La/ku5;

    .line 12
    .line 13
    array-length v1, v0

    .line 14
    const/4 v2, 0x0

    .line 15
    move v3, v2

    .line 16
    :goto_0
    if-ge v3, v1, :cond_1

    .line 17
    .line 18
    aget-object v4, v0, v3

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    invoke-virtual {v4}, La/ku5;->c()V

    .line 23
    .line 24
    .line 25
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {p1, v0, p0}, La/egk;->r([La/ku5;La/ku5;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p1, La/zri;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, La/sq8;

    .line 34
    .line 35
    iget-boolean v3, p1, La/egk;->d:Z

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    iget-object v4, v1, La/sq8;->f:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, La/d3g0;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    iget-object v4, v1, La/sq8;->h:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, La/d3g0;

    .line 47
    .line 48
    :goto_1
    if-eqz v3, :cond_3

    .line 49
    .line 50
    iget-object v1, v1, La/sq8;->g:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, La/d3g0;

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    iget-object v1, v1, La/sq8;->i:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v1, La/d3g0;

    .line 58
    .line 59
    :goto_2
    iget v3, v4, La/d3g0;->b:F

    .line 60
    .line 61
    float-to-int v3, v3

    .line 62
    invoke-virtual {p1, v3}, La/zri;->d(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    iget v1, v1, La/d3g0;->b:F

    .line 67
    .line 68
    float-to-int v1, v1

    .line 69
    invoke-virtual {p1, v1}, La/zri;->d(I)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    const/4 v1, 0x1

    .line 74
    const/4 v4, -0x1

    .line 75
    move v6, v1

    .line 76
    move v5, v2

    .line 77
    :goto_3
    if-ge v3, p1, :cond_e

    .line 78
    .line 79
    aget-object v7, v0, v3

    .line 80
    .line 81
    if-nez v7, :cond_4

    .line 82
    .line 83
    goto :goto_9

    .line 84
    :cond_4
    iget v8, v7, La/ku5;->f:I

    .line 85
    .line 86
    sub-int v9, v8, v4

    .line 87
    .line 88
    if-nez v9, :cond_5

    .line 89
    .line 90
    add-int/lit8 v5, v5, 0x1

    .line 91
    .line 92
    goto :goto_9

    .line 93
    :cond_5
    if-ne v9, v1, :cond_6

    .line 94
    .line 95
    invoke-static {v6, v5}, Ljava/lang/Math;->max(II)I

    .line 96
    .line 97
    .line 98
    move-result v6

    .line 99
    iget v4, v7, La/ku5;->f:I

    .line 100
    .line 101
    :goto_4
    move v5, v1

    .line 102
    goto :goto_9

    .line 103
    :cond_6
    const/4 v10, 0x0

    .line 104
    if-ltz v9, :cond_d

    .line 105
    .line 106
    iget v11, p0, La/ku5;->f:I

    .line 107
    .line 108
    if-ge v8, v11, :cond_d

    .line 109
    .line 110
    if-le v9, v3, :cond_7

    .line 111
    .line 112
    goto :goto_8

    .line 113
    :cond_7
    const/4 v8, 0x2

    .line 114
    if-le v6, v8, :cond_8

    .line 115
    .line 116
    add-int/lit8 v8, v6, -0x2

    .line 117
    .line 118
    mul-int/2addr v9, v8

    .line 119
    :cond_8
    if-lt v9, v3, :cond_9

    .line 120
    .line 121
    move v8, v1

    .line 122
    goto :goto_5

    .line 123
    :cond_9
    move v8, v2

    .line 124
    :goto_5
    move v11, v1

    .line 125
    :goto_6
    if-gt v11, v9, :cond_b

    .line 126
    .line 127
    if-nez v8, :cond_b

    .line 128
    .line 129
    sub-int v8, v3, v11

    .line 130
    .line 131
    aget-object v8, v0, v8

    .line 132
    .line 133
    if-eqz v8, :cond_a

    .line 134
    .line 135
    move v8, v1

    .line 136
    goto :goto_7

    .line 137
    :cond_a
    move v8, v2

    .line 138
    :goto_7
    add-int/lit8 v11, v11, 0x1

    .line 139
    .line 140
    goto :goto_6

    .line 141
    :cond_b
    if-eqz v8, :cond_c

    .line 142
    .line 143
    aput-object v10, v0, v3

    .line 144
    .line 145
    goto :goto_9

    .line 146
    :cond_c
    iget v4, v7, La/ku5;->f:I

    .line 147
    .line 148
    goto :goto_4

    .line 149
    :cond_d
    :goto_8
    aput-object v10, v0, v3

    .line 150
    .line 151
    :goto_9
    add-int/lit8 v3, v3, 0x1

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_e
    return-void
.end method

.method public b(Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, La/xp6;

    .line 7
    .line 8
    iget-object v1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 11
    .line 12
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    iput-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->c(La/nju0;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object p0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p0, La/z0i;

    .line 39
    .line 40
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    iget-object v0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Landroid/os/Handler;

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget v1, p0, La/sbx0;->b:I

    .line 11
    .line 12
    if-lez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Landroid/os/HandlerThread;

    .line 15
    .line 16
    const-string v2, "CameraThread"

    .line 17
    .line 18
    invoke-direct {v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 24
    .line 25
    .line 26
    new-instance v1, Landroid/os/Handler;

    .line 27
    .line 28
    iget-object v2, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Landroid/os/HandlerThread;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 45
    .line 46
    const-string v1, "CameraThread is not open"

    .line 47
    .line 48
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_1
    :goto_0
    monitor-exit v0

    .line 53
    return-void

    .line 54
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    throw p0
.end method

.method public d()V
    .locals 3

    .line 1
    iget-object v0, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/xp6;

    .line 4
    .line 5
    iget-object v1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, La/z0i;

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    iput v1, p0, La/sbx0;->b:I

    .line 35
    .line 36
    iget-object v1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    iget-object v1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Landroidx/viewpager2/widget/ViewPager2;

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Landroidx/viewpager2/widget/ViewPager2;->g(La/nju0;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    iput-object v2, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 57
    .line 58
    :cond_3
    return-void
.end method

.method public e(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, La/sbx0;->c()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    monitor-exit v0

    .line 15
    return-void

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p0
.end method

.method public f()Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "$"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, La/sbx0;->b:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_4

    .line 14
    .line 15
    iget-object v3, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, [Ljava/lang/Object;

    .line 18
    .line 19
    aget-object v3, v3, v2

    .line 20
    .line 21
    instance-of v4, v3, La/ugi0;

    .line 22
    .line 23
    if-eqz v4, :cond_1

    .line 24
    .line 25
    check-cast v3, La/ugi0;

    .line 26
    .line 27
    invoke-interface {v3}, La/ugi0;->l()La/c3x;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    sget-object v5, La/aum0;->c:La/aum0;

    .line 32
    .line 33
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    iget-object v5, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, [I

    .line 40
    .line 41
    if-eqz v4, :cond_0

    .line 42
    .line 43
    aget v3, v5, v2

    .line 44
    .line 45
    const/4 v4, -0x1

    .line 46
    if-eq v3, v4, :cond_3

    .line 47
    .line 48
    const-string v3, "["

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v3, [I

    .line 56
    .line 57
    aget v3, v3, v2

    .line 58
    .line 59
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v3, "]"

    .line 63
    .line 64
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    aget v4, v5, v2

    .line 69
    .line 70
    if-ltz v4, :cond_3

    .line 71
    .line 72
    const-string v5, "."

    .line 73
    .line 74
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-interface {v3, v4}, La/ugi0;->e(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    sget-object v4, La/m2a;->p:La/m2a;

    .line 86
    .line 87
    if-ne v3, v4, :cond_2

    .line 88
    .line 89
    const-string v3, "[<debug info disabled>]"

    .line 90
    .line 91
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    sget-object v4, La/lwf;->p:La/lwf;

    .line 96
    .line 97
    if-eq v3, v4, :cond_3

    .line 98
    .line 99
    const-string v4, "[\'"

    .line 100
    .line 101
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string v3, "\']"

    .line 108
    .line 109
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    return-object p0
.end method

.method public g()I
    .locals 1

    .line 1
    iget p0, p0, La/sbx0;->b:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x3

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    const/16 p0, 0x200

    .line 12
    .line 13
    return p0

    .line 14
    :cond_1
    const/16 p0, 0x800

    .line 15
    .line 16
    return p0
.end method

.method public h(La/o1x;La/hhn0;)V
    .locals 1

    .line 1
    iget-object p1, p2, La/hhn0;->a:La/dyw;

    .line 2
    .line 3
    iget-object p2, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, La/c3x;->q(La/dyw;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ljava/lang/Integer;

    .line 28
    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-nez p0, :cond_1

    .line 40
    .line 41
    :cond_0
    iget-object p0, p2, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->q:Landroid/content/res/ColorStateList;

    .line 42
    .line 43
    :cond_1
    invoke-virtual {p2, p0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public i(FI)V
    .locals 7

    .line 1
    iget-object v0, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v2

    .line 15
    :goto_0
    instance-of v3, v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object v0, v2

    .line 23
    :goto_1
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_2

    .line 30
    :cond_2
    move-object v0, v2

    .line 31
    :goto_2
    instance-of v3, v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 32
    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_3
    move-object v0, v2

    .line 39
    :goto_3
    if-eqz v0, :cond_7

    .line 40
    .line 41
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->D(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-nez v3, :cond_4

    .line 46
    .line 47
    goto :goto_4

    .line 48
    :cond_4
    add-int/lit8 p2, p2, 0x1

    .line 49
    .line 50
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->D(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    iget-object v0, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    .line 57
    .line 58
    if-eqz v0, :cond_7

    .line 59
    .line 60
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    const/high16 v5, 0x40000000    # 2.0f

    .line 65
    .line 66
    invoke-static {v4, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {v3, v4, v6}, Landroid/view/View;->measure(II)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-eqz p2, :cond_5

    .line 82
    .line 83
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    invoke-static {v2, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    invoke-virtual {p2, v2, v1}, Landroid/view/View;->measure(II)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    :cond_5
    if-eqz v2, :cond_6

    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    sub-int/2addr p2, v3

    .line 113
    int-to-float p2, p2

    .line 114
    mul-float/2addr p2, p1

    .line 115
    float-to-int p1, p2

    .line 116
    add-int/2addr v3, p1

    .line 117
    :cond_6
    iget p1, p0, La/sbx0;->b:I

    .line 118
    .line 119
    if-eq p1, v3, :cond_7

    .line 120
    .line 121
    iput v3, p0, La/sbx0;->b:I

    .line 122
    .line 123
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    iput v3, p0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 128
    .line 129
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 133
    .line 134
    .line 135
    :cond_7
    :goto_4
    return-void
.end method

.method public j()V
    .locals 3

    .line 1
    iget-object v0, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, La/sbx0;->b:I

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-lez v1, :cond_0

    .line 8
    .line 9
    move v1, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    :goto_0
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 13
    .line 14
    .line 15
    iget v1, p0, La/sbx0;->b:I

    .line 16
    .line 17
    sub-int/2addr v1, v2

    .line 18
    iput v1, p0, La/sbx0;->b:I

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Landroid/os/HandlerThread;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-object v1, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 33
    .line 34
    iput-object v1, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    :goto_1
    monitor-exit v0

    .line 40
    return-void

    .line 41
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw p0
.end method

.method public k(La/o1x;La/r1o;)V
    .locals 0

    .line 1
    iget-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 4
    .line 5
    iget p2, p0, La/sbx0;->b:I

    .line 6
    .line 7
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    :cond_0
    iget-object p0, p1, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->q:Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    iput-object p0, p1, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->p:La/iwk;

    .line 33
    .line 34
    return-void
.end method

.method public l()V
    .locals 5

    .line 1
    iget v0, p0, La/sbx0;->b:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    iget-object v1, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, [Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 14
    .line 15
    new-array v1, v0, [I

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    move v3, v2

    .line 19
    :goto_0
    if-ge v3, v0, :cond_0

    .line 20
    .line 21
    const/4 v4, -0x1

    .line 22
    aput v4, v1, v3

    .line 23
    .line 24
    add-int/lit8 v3, v3, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, [I

    .line 30
    .line 31
    const/16 v3, 0xe

    .line 32
    .line 33
    invoke-static {v2, v2, v3, v0, v1}, La/qx3;->h(III[I[I)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 37
    .line 38
    return-void
.end method

.method public declared-synchronized n(La/f8x0;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "MessengerIpcClient"

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, La/f8x0;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "Queueing "

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "MessengerIpcClient"

    .line 22
    .line 23
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    iget-object v0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La/d6x0;

    .line 32
    .line 33
    invoke-virtual {v0, p1}, La/d6x0;->a(La/f8x0;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, La/d6x0;

    .line 40
    .line 41
    invoke-direct {v0, p0}, La/d6x0;-><init>(La/sbx0;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v0, p1}, La/d6x0;->a(La/f8x0;)Z

    .line 47
    .line 48
    .line 49
    :cond_1
    iget-object p1, p1, La/f8x0;->b:Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/google/android/gms/tasks/TaskCompletionSource;->getTask()Lcom/google/android/gms/tasks/Task;

    .line 52
    .line 53
    .line 54
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    monitor-exit p0

    .line 56
    return-object p1

    .line 57
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-byte v0, p0, La/sbx0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_1
    invoke-virtual {p0}, La/sbx0;->f()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :pswitch_2
    iget v0, p0, La/sbx0;->b:I

    .line 17
    .line 18
    iget-object p0, p0, La/sbx0;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, [La/zri;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    aget-object v2, p0, v1

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    add-int/lit8 v2, v0, 0x1

    .line 28
    .line 29
    aget-object v2, p0, v2

    .line 30
    .line 31
    :cond_0
    new-instance v3, Ljava/util/Formatter;

    .line 32
    .line 33
    invoke-direct {v3}, Ljava/util/Formatter;-><init>()V

    .line 34
    .line 35
    .line 36
    move v4, v1

    .line 37
    :goto_0
    :try_start_0
    iget-object v5, v2, La/zri;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v5, [La/ku5;

    .line 40
    .line 41
    array-length v5, v5

    .line 42
    if-ge v4, v5, :cond_4

    .line 43
    .line 44
    const-string v5, "CW %3d:"

    .line 45
    .line 46
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    invoke-virtual {v3, v5, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 55
    .line 56
    .line 57
    move v5, v1

    .line 58
    :goto_1
    add-int/lit8 v6, v0, 0x2

    .line 59
    .line 60
    if-ge v5, v6, :cond_3

    .line 61
    .line 62
    aget-object v6, p0, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    const-string v7, "    |   "

    .line 65
    .line 66
    if-nez v6, :cond_1

    .line 67
    .line 68
    :try_start_1
    new-array v6, v1, [Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v3, v7, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :catchall_0
    move-exception p0

    .line 75
    goto :goto_3

    .line 76
    :cond_1
    iget-object v6, v6, La/zri;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v6, [La/ku5;

    .line 79
    .line 80
    aget-object v6, v6, v4

    .line 81
    .line 82
    if-nez v6, :cond_2

    .line 83
    .line 84
    new-array v6, v1, [Ljava/lang/Object;

    .line 85
    .line 86
    invoke-virtual {v3, v7, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    const-string v7, " %3d|%3d"

    .line 91
    .line 92
    iget v8, v6, La/ku5;->f:I

    .line 93
    .line 94
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    iget v6, v6, La/ku5;->e:I

    .line 99
    .line 100
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    filled-new-array {v8, v6}, [Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v3, v7, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 109
    .line 110
    .line 111
    :goto_2
    add-int/lit8 v5, v5, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    const-string v5, "%n"

    .line 115
    .line 116
    new-array v6, v1, [Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v3, v5, v6}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 119
    .line 120
    .line 121
    add-int/lit8 v4, v4, 0x1

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_4
    invoke-virtual {v3}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 128
    invoke-virtual {v3}, Ljava/util/Formatter;->close()V

    .line 129
    .line 130
    .line 131
    return-object p0

    .line 132
    :goto_3
    :try_start_2
    invoke-virtual {v3}, Ljava/util/Formatter;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 133
    .line 134
    .line 135
    goto :goto_4

    .line 136
    :catchall_1
    move-exception v0

    .line 137
    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 138
    .line 139
    .line 140
    :goto_4
    throw p0

    .line 141
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
