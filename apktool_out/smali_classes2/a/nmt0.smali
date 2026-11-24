.class public final La/nmt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jix0;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/fmg0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, La/nmt0;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/lkr0;

    .line 8
    .line 9
    const/16 v1, 0x13

    .line 10
    .line 11
    invoke-direct {v0, p1, v1}, La/lkr0;-><init>(La/gii0;B)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/jau0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, La/nmt0;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 23
    iput-object p1, p0, La/nmt0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, La/nmt0;->a:Ljava/lang/Object;

    return-void
.end method

.method public static e(La/nmt0;La/ljw0;La/hcp0;La/ngw0;)V
    .locals 9

    .line 1
    iget-boolean v0, p1, La/ljw0;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, La/ljw0;->l:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :cond_0
    move-object v7, p2

    .line 14
    goto :goto_0

    .line 15
    :cond_1
    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 16
    .line 17
    iget-object v0, p1, La/ljw0;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p1, La/ljw0;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v3, p1, La/ljw0;->d:J

    .line 22
    .line 23
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-direct {v2, v3, v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;-><init>(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v3, p1, La/ljw0;->g:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p1, La/ljw0;->f:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v0, p1, La/ljw0;->h:Z

    .line 35
    .line 36
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {p1}, La/ljw0;->a()Lcom/google/firebase/auth/zzc;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    move-object v1, p0

    .line 45
    move-object v7, p2

    .line 46
    move-object v8, p3

    .line 47
    invoke-virtual/range {v1 .. v8}, La/nmt0;->g(Lcom/google/android/gms/internal/firebase-auth-api/zzaia;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/auth/zzc;La/hcp0;La/ngw0;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_0
    invoke-virtual {p1}, La/ljw0;->a()Lcom/google/firebase/auth/zzc;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iget-object p2, p1, La/ljw0;->e:Ljava/lang/String;

    .line 56
    .line 57
    iget-object p3, p1, La/ljw0;->n:Ljava/lang/String;

    .line 58
    .line 59
    iget-boolean v0, p1, La/ljw0;->a:Z

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 64
    .line 65
    const/16 v0, 0x4274

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-direct {p1, v0, v1, v1, v1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lcom/google/android/gms/common/ConnectionResult;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget-object p1, p1, La/ljw0;->l:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p1}, La/msm0;->v(Ljava/lang/String;)Lcom/google/android/gms/common/api/Status;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    :goto_1
    new-instance v0, La/fht0;

    .line 79
    .line 80
    invoke-direct {v0, p1, p0, p2, p3}, La/fht0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v0}, La/hcp0;->h(La/fht0;)V

    .line 84
    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public a(La/sip;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;La/jo20;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/lkr0;

    .line 4
    .line 5
    instance-of v1, p4, La/kru0;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p4

    .line 10
    check-cast v1, La/kru0;

    .line 11
    .line 12
    iget v2, v1, La/kru0;->k:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, La/kru0;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/kru0;

    .line 25
    .line 26
    invoke-direct {v1, p0, p4}, La/kru0;-><init>(La/nmt0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p0, v1, La/kru0;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object p4, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v1, La/kru0;->k:I

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x2

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v3

    .line 54
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    if-eqz p0, :cond_6

    .line 66
    .line 67
    if-ne p0, v5, :cond_5

    .line 68
    .line 69
    invoke-virtual {v0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    check-cast p0, La/nqu0;

    .line 74
    .line 75
    invoke-static {p2}, Lorg/xplatform/cyber/section/api/domain/entity/d;->b(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    iput v4, v1, La/kru0;->k:I

    .line 80
    .line 81
    invoke-interface {p0, p1, p3, v1}, La/nqu0;->a(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, p4, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    check-cast p0, La/dx5;

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 92
    .line 93
    .line 94
    return-object v3

    .line 95
    :cond_6
    invoke-virtual {v0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/nqu0;

    .line 100
    .line 101
    invoke-static {p2}, Lorg/xplatform/cyber/section/api/domain/entity/d;->b(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    iput v5, v1, La/kru0;->k:I

    .line 106
    .line 107
    invoke-interface {p0, p1, p3, v1}, La/nqu0;->b(Ljava/lang/String;Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-ne p0, p4, :cond_7

    .line 112
    .line 113
    :goto_2
    return-object p4

    .line 114
    :cond_7
    :goto_3
    check-cast p0, La/dx5;

    .line 115
    .line 116
    :goto_4
    invoke-virtual {p0}, La/dx5;->a()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0
.end method

.method public b(La/jo20;La/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/lru0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/lru0;

    .line 7
    .line 8
    iget v1, v0, La/lru0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/lru0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/lru0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/lru0;-><init>(La/nmt0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/lru0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/lru0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/lkr0;

    .line 53
    .line 54
    invoke-virtual {p0}, La/lkr0;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/nqu0;

    .line 59
    .line 60
    iput v3, v0, La/lru0;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, v0}, La/nqu0;->c(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-ne p2, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p2, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public c(La/uaq0;)V
    .locals 7

    .line 1
    iget-object p0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/roi0;

    .line 4
    .line 5
    iget-object p0, p0, La/roi0;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/rbq0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, La/rbq0;->c:La/n0o0;

    .line 13
    .line 14
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    move-object v1, v0

    .line 19
    check-cast v1, La/vne;

    .line 20
    .line 21
    sget-object v2, La/qbq0;->a:La/qbq0;

    .line 22
    .line 23
    new-instance v5, La/ssl0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    const/16 v3, 0x16

    .line 27
    .line 28
    invoke-direct {v5, p0, p1, v0, v3}, La/ssl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    const/16 v6, 0xe

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public d(Landroid/content/Context;La/b9v;)I
    .locals 4

    .line 1
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, La/s0x;->H(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, La/hz5;->i()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iget-object v0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/util/SparseIntArray;

    .line 14
    .line 15
    monitor-enter v0

    .line 16
    const/4 v1, -0x1

    .line 17
    :try_start_0
    invoke-virtual {v0, p2, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 22
    if-eq v2, v1, :cond_0

    .line 23
    .line 24
    return v2

    .line 25
    :cond_0
    iget-object p0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Landroid/util/SparseIntArray;

    .line 28
    .line 29
    monitor-enter p0

    .line 30
    const/4 v0, 0x0

    .line 31
    move v2, v0

    .line 32
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-ge v2, v3, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v2}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-le v3, p2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p0, v3}, Landroid/util/SparseIntArray;->get(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    move v0, v1

    .line 57
    :goto_1
    if-ne v0, v1, :cond_3

    .line 58
    .line 59
    sget-object v0, La/oav;->e:La/oav;

    .line 60
    .line 61
    invoke-virtual {v0, p1, p2}, La/pav;->c(Landroid/content/Context;I)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    :cond_3
    invoke-virtual {p0, p2, v0}, Landroid/util/SparseIntArray;->put(II)V

    .line 66
    .line 67
    .line 68
    monitor-exit p0

    .line 69
    return v0

    .line 70
    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw p1

    .line 72
    :catchall_1
    move-exception p0

    .line 73
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    throw p0
.end method

.method public f(La/mhw0;La/hcp0;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ywq0;

    .line 4
    .line 5
    new-instance v1, La/fuj0;

    .line 6
    .line 7
    invoke-direct {v1, p0, p2}, La/fuj0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, v0, La/ywq0;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/rfw0;

    .line 13
    .line 14
    iget-object p2, v0, La/ywq0;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/String;

    .line 17
    .line 18
    const-string v0, "/emailLinkSignin"

    .line 19
    .line 20
    invoke-virtual {p0, v0, p2}, La/c2;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    new-instance v0, La/phw0;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, La/fht0;

    .line 32
    .line 33
    invoke-static {p2, p1, v1, v0, p0}, La/hhm0;->G(Ljava/lang/String;La/ufw0;La/ngw0;La/xfw0;La/fht0;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public g(Lcom/google/android/gms/internal/firebase-auth-api/zzaia;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/auth/zzc;La/hcp0;La/ngw0;)V
    .locals 11

    .line 1
    iget-object v0, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->b:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v1, La/h70;

    .line 4
    .line 5
    invoke-direct {v1}, La/h70;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, La/s0x;->E(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, v1, La/h70;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/ywq0;

    .line 16
    .line 17
    new-instance v2, La/xzp;

    .line 18
    .line 19
    move-object v3, p0

    .line 20
    move-object v10, p1

    .line 21
    move-object v6, p2

    .line 22
    move-object v5, p3

    .line 23
    move-object v7, p4

    .line 24
    move-object/from16 v8, p5

    .line 25
    .line 26
    move-object/from16 v9, p6

    .line 27
    .line 28
    move-object/from16 v4, p7

    .line 29
    .line 30
    invoke-direct/range {v2 .. v10}, La/xzp;-><init>(La/nmt0;La/ngw0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/google/firebase/auth/zzc;La/hcp0;Lcom/google/android/gms/internal/firebase-auth-api/zzaia;)V

    .line 31
    .line 32
    .line 33
    iget-object p0, v0, La/ywq0;->a:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, La/rfw0;

    .line 36
    .line 37
    iget-object p1, v0, La/ywq0;->f:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, Ljava/lang/String;

    .line 40
    .line 41
    const-string p2, "/getAccountInfo"

    .line 42
    .line 43
    invoke-virtual {p0, p2, p1}, La/c2;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance p2, La/yhw0;

    .line 48
    .line 49
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, La/c2;->b:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p0, La/fht0;

    .line 55
    .line 56
    invoke-static {p1, v1, v2, p2, p0}, La/hhm0;->G(Ljava/lang/String;La/ufw0;La/ngw0;La/xfw0;La/fht0;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public h(Ljava/lang/String;La/ngw0;)V
    .locals 2

    .line 1
    invoke-static {p1}, La/s0x;->E(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->m(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->zzg()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p2, p1}, La/ngw0;->h(La/xfw0;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    iget-object p1, p1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;->a:Ljava/lang/String;

    .line 19
    .line 20
    new-instance v0, La/y60;

    .line 21
    .line 22
    invoke-direct {v0, p1}, La/y60;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, La/ywq0;

    .line 28
    .line 29
    new-instance p1, La/ikt0;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p2, p1, La/ikt0;->a:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object p2, p0, La/ywq0;->c:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, La/rfw0;

    .line 39
    .line 40
    iget-object p0, p0, La/ywq0;->f:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Ljava/lang/String;

    .line 43
    .line 44
    const-string v1, "/token"

    .line 45
    .line 46
    invoke-virtual {p2, v1, p0}, La/c2;->M(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;

    .line 51
    .line 52
    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/zzaia;-><init>()V

    .line 53
    .line 54
    .line 55
    iget-object p2, p2, La/c2;->b:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p2, La/fht0;

    .line 58
    .line 59
    invoke-static {p0, v0, p1, v1, p2}, La/hhm0;->G(Ljava/lang/String;La/ufw0;La/ngw0;La/xfw0;La/fht0;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public zza(Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-string v0, "AndroidOpenSSL"

    .line 2
    .line 3
    const-string v1, "Conscrypt"

    .line 4
    .line 5
    const-string v2, "GmsCore_OpenSSL"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :goto_0
    const/4 v3, 0x3

    .line 18
    if-ge v2, v3, :cond_1

    .line 19
    .line 20
    aget-object v3, v0, v2

    .line 21
    .line 22
    invoke-static {v3}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x0

    .line 39
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    check-cast v2, Ljava/security/Provider;

    .line 50
    .line 51
    :try_start_0
    iget-object v3, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v3, La/lix0;

    .line 54
    .line 55
    invoke-interface {v3, p1, v2}, La/lix0;->b(Ljava/lang/String;Ljava/security/Provider;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    return-object p0

    .line 60
    :catch_0
    move-exception v2

    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    move-object v1, v2

    .line 64
    goto :goto_1

    .line 65
    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 66
    .line 67
    const-string p1, "No good Provider found."

    .line 68
    .line 69
    invoke-direct {p0, p1, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw p0
.end method
