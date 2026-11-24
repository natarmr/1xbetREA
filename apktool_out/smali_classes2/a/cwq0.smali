.class public final La/cwq0;
.super La/bag0;
.source "SourceFile"


# static fields
.field public static final e:La/xoo;


# instance fields
.field public final d:La/tnx;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/xoo;

    .line 2
    .line 3
    const-wide/16 v1, 0x1f40

    .line 4
    .line 5
    const v3, 0x3f99999a    # 1.2f

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/xoo;-><init>(FJ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/cwq0;->e:La/xoo;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/vkr0;ILa/tnx;)V
    .locals 1

    .line 1
    sget-object v0, La/bwq0;->a:La/bwq0;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, La/bag0;-><init>(La/vkr0;I)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, La/cwq0;->d:La/tnx;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final q0(La/td9;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/bag0;->c:B

    .line 2
    .line 3
    if-ltz v0, :cond_3

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    sget-object v3, La/cwq0;->e:La/xoo;

    .line 8
    .line 9
    iget v4, v3, La/xoo;->e:I

    .line 10
    .line 11
    if-lez v4, :cond_0

    .line 12
    .line 13
    iget-wide v4, v3, La/xoo;->d:J

    .line 14
    .line 15
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V

    .line 16
    .line 17
    .line 18
    :cond_0
    sget-object v4, La/bwq0;->a:La/bwq0;

    .line 19
    .line 20
    monitor-enter v4

    .line 21
    :try_start_0
    invoke-virtual {v4}, La/bwq0;->a()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    sget-object v7, La/bwq0;->b:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v7, v8}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v7}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    check-cast v7, Ljava/lang/Long;

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 47
    .line 48
    .line 49
    move-result-wide v7

    .line 50
    sub-long/2addr v5, v7

    .line 51
    const-wide/16 v7, 0x3e8

    .line 52
    .line 53
    sub-long v5, v7, v5

    .line 54
    .line 55
    const-wide/16 v9, 0x0

    .line 56
    .line 57
    cmp-long v9, v5, v9

    .line 58
    .line 59
    if-lez v9, :cond_1

    .line 60
    .line 61
    invoke-static {v5, v6}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    goto :goto_2

    .line 67
    :cond_1
    :goto_1
    monitor-exit v4

    .line 68
    :try_start_1
    iget-object v4, p0, La/cwq0;->d:La/tnx;

    .line 69
    .line 70
    invoke-virtual {v4, p1, v1}, La/tnx;->n1(La/td9;I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    iput-wide v7, v3, La/xoo;->d:J

    .line 75
    .line 76
    iput v1, v3, La/xoo;->e:I
    :try_end_1
    .catch La/yut0; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    .line 78
    return-object v4

    .line 79
    :catch_0
    move-exception v3

    .line 80
    iget v4, v3, La/yut0;->b:I

    .line 81
    .line 82
    const/4 v5, 0x6

    .line 83
    if-ne v4, v5, :cond_2

    .line 84
    .line 85
    const-string v4, "Too many requests"

    .line 86
    .line 87
    invoke-virtual {p0, v4, v3}, La/p4;->E0(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 88
    .line 89
    .line 90
    sget-object v3, La/cwq0;->e:La/xoo;

    .line 91
    .line 92
    invoke-virtual {v3}, La/xoo;->a()V

    .line 93
    .line 94
    .line 95
    if-eq v2, v0, :cond_3

    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    throw v3

    .line 101
    :goto_2
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    throw p0

    .line 103
    :cond_3
    new-instance p1, La/c44;

    .line 104
    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v1, "Can\'t handle too many requests due to retry limit! (retryLimit="

    .line 108
    .line 109
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-byte p0, p0, La/bag0;->c:B

    .line 113
    .line 114
    const/16 v1, 0x29

    .line 115
    .line 116
    invoke-static {v0, p0, v1}, La/brm0;->n(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const/16 v0, 0xf

    .line 121
    .line 122
    invoke-direct {p1, p0, v0}, La/c44;-><init>(Ljava/lang/String;B)V

    .line 123
    .line 124
    .line 125
    throw p1
.end method
