.class public final Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
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
.field public final g:La/iqt;

.field public final h:La/x1u;

.field public final i:La/bzt;

.field public final j:La/roi0;

.field public final k:La/pru;

.field public final l:La/h760;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, La/og00;->a:Landroid/content/Context;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, Landroid/app/Application;

    .line 16
    .line 17
    instance-of p2, p1, La/af3;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p2, :cond_0

    .line 21
    .line 22
    check-cast p1, La/af3;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object p1, v0

    .line 26
    :goto_0
    const-class p2, La/vyf;

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, p2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, La/o5d0;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, La/ze3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    move-object p1, v0

    .line 50
    :goto_1
    instance-of v1, p1, La/vyf;

    .line 51
    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    move-object p1, v0

    .line 55
    :cond_2
    check-cast p1, La/vyf;

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    iget-object p2, p1, La/vyf;->a:La/clc;

    .line 60
    .line 61
    iget-object v0, p1, La/vyf;->b:La/iw20;

    .line 62
    .line 63
    iget-object v1, p1, La/vyf;->c:La/lp4;

    .line 64
    .line 65
    iget-object v2, p1, La/vyf;->d:La/h760;

    .line 66
    .line 67
    iget-object v3, p1, La/vyf;->g:La/fsd;

    .line 68
    .line 69
    iget-object v4, p1, La/vyf;->e:La/iqt;

    .line 70
    .line 71
    iget-object p1, p1, La/vyf;->f:La/x1u;

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iput-object v4, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->g:La/iqt;

    .line 83
    .line 84
    iput-object p1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->h:La/x1u;

    .line 85
    .line 86
    new-instance p1, La/bzt;

    .line 87
    .line 88
    invoke-direct {p1, v3}, La/bzt;-><init>(La/fsd;)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->i:La/bzt;

    .line 92
    .line 93
    iget-object p1, p2, La/clc;->b:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p1, La/jzf;

    .line 96
    .line 97
    new-instance p2, La/roi0;

    .line 98
    .line 99
    new-instance v1, La/jzf;

    .line 100
    .line 101
    iget-object v3, p1, La/jzf;->a:La/dzf;

    .line 102
    .line 103
    iget-object p1, p1, La/jzf;->b:La/ozf;

    .line 104
    .line 105
    const/4 v4, 0x0

    .line 106
    invoke-direct {v1, v3, p1, v4}, La/jzf;-><init>(La/dzf;La/ozf;B)V

    .line 107
    .line 108
    .line 109
    invoke-direct {p2, v1}, La/roi0;-><init>(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iput-object p2, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->j:La/roi0;

    .line 113
    .line 114
    iget-object p1, v0, La/iw20;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p1, La/uii;

    .line 117
    .line 118
    invoke-virtual {p1}, La/uii;->r()La/pru;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->k:La/pru;

    .line 123
    .line 124
    iput-object v2, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->l:La/h760;

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 128
    .line 129
    invoke-static {p2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, La/uyf;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/uyf;

    .line 7
    .line 8
    iget v1, v0, La/uyf;->n:I

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
    iput v1, v0, La/uyf;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/uyf;

    .line 21
    .line 22
    check-cast p1, La/zje;

    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, La/uyf;-><init>(Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p1, v0, La/uyf;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, v0, La/uyf;->n:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    if-eq v2, v6, :cond_2

    .line 40
    .line 41
    if-ne v2, v4, :cond_1

    .line 42
    .line 43
    iget v2, v0, La/uyf;->k:I

    .line 44
    .line 45
    iget v7, v0, La/uyf;->j:I

    .line 46
    .line 47
    iget-object v8, v0, La/uyf;->i:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    goto/16 :goto_5

    .line 53
    .line 54
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v3

    .line 60
    :cond_2
    iget v2, v0, La/uyf;->k:I

    .line 61
    .line 62
    iget v7, v0, La/uyf;->j:I

    .line 63
    .line 64
    iget-object v8, v0, La/uyf;->i:Ljava/lang/String;

    .line 65
    .line 66
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    goto/16 :goto_5

    .line 70
    .line 71
    :catch_0
    move-exception p1

    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, La/og00;->b:Landroidx/work/WorkerParameters;

    .line 77
    .line 78
    iget-object p1, p1, Landroidx/work/WorkerParameters;->b:La/maj;

    .line 79
    .line 80
    const-string v2, "KEY_TOKEN"

    .line 81
    .line 82
    invoke-virtual {p1, v2}, La/maj;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    if-nez p1, :cond_4

    .line 87
    .line 88
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    return-object p0

    .line 93
    :cond_4
    move-object v8, p1

    .line 94
    move v7, v5

    .line 95
    :cond_5
    :try_start_1
    invoke-virtual {p0}, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->e()Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_9

    .line 100
    .line 101
    iget-object p1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->h:La/x1u;

    .line 102
    .line 103
    if-eqz p1, :cond_8

    .line 104
    .line 105
    invoke-virtual {p1}, La/x1u;->a()J

    .line 106
    .line 107
    .line 108
    move-result-wide v9

    .line 109
    iget-object p1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->j:La/roi0;

    .line 110
    .line 111
    if-eqz p1, :cond_7

    .line 112
    .line 113
    iput-object v8, v0, La/uyf;->i:Ljava/lang/String;

    .line 114
    .line 115
    iput v7, v0, La/uyf;->j:I

    .line 116
    .line 117
    iput v5, v0, La/uyf;->k:I

    .line 118
    .line 119
    iput v6, v0, La/uyf;->n:I

    .line 120
    .line 121
    iget-object p1, p1, La/roi0;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p1, La/jzf;

    .line 124
    .line 125
    invoke-virtual {p1, v9, v10, v0, v8}, La/jzf;->e(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    sget-object v2, La/wne;->a:La/wne;

    .line 130
    .line 131
    if-ne p1, v2, :cond_6

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    :goto_1
    if-ne p1, v1, :cond_9

    .line 137
    .line 138
    goto :goto_4

    .line 139
    :cond_7
    const-string p1, "updateCustomerDeviceUseCase"

    .line 140
    .line 141
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw v3

    .line 145
    :cond_8
    const-string p1, "getUserIdUseCase"

    .line 146
    .line 147
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 151
    :cond_9
    move v2, v5

    .line 152
    goto :goto_5

    .line 153
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 154
    .line 155
    .line 156
    add-int/lit8 p1, v7, 0x1

    .line 157
    .line 158
    const/4 v2, 0x3

    .line 159
    if-ge v7, v2, :cond_a

    .line 160
    .line 161
    move v2, v6

    .line 162
    goto :goto_3

    .line 163
    :cond_a
    move v2, v5

    .line 164
    :goto_3
    iput-object v8, v0, La/uyf;->i:Ljava/lang/String;

    .line 165
    .line 166
    iput p1, v0, La/uyf;->j:I

    .line 167
    .line 168
    iput v2, v0, La/uyf;->k:I

    .line 169
    .line 170
    iput v4, v0, La/uyf;->n:I

    .line 171
    .line 172
    const-wide/16 v9, 0xbb8

    .line 173
    .line 174
    invoke-static {v9, v10, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    if-ne v7, v1, :cond_b

    .line 179
    .line 180
    :goto_4
    return-object v1

    .line 181
    :cond_b
    move v7, p1

    .line 182
    :goto_5
    if-nez v2, :cond_5

    .line 183
    .line 184
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    return-object p0
.end method

.method public final e()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->g:La/iqt;

    .line 3
    .line 4
    if-eqz v1, :cond_5

    .line 5
    .line 6
    iget-object v1, v1, La/iqt;->a:La/gst0;

    .line 7
    .line 8
    invoke-virtual {v1}, La/gst0;->a()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    iget-object v2, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->k:La/pru;

    .line 13
    .line 14
    if-eqz v2, :cond_4

    .line 15
    .line 16
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-boolean v2, v2, La/sff0;->W:Z

    .line 21
    .line 22
    const/4 v3, 0x1

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->l:La/h760;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v2}, La/h760;->a()La/t760;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, La/u760;

    .line 34
    .line 35
    invoke-virtual {v2}, La/u760;->f()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string p0, "notificationFeature"

    .line 41
    .line 42
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    move v2, v3

    .line 47
    :goto_0
    iget-object p0, p0, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIONewTokenWorker;->i:La/bzt;

    .line 48
    .line 49
    if-eqz p0, :cond_3

    .line 50
    .line 51
    iget-object p0, p0, La/bzt;->a:La/fsd;

    .line 52
    .line 53
    invoke-virtual {p0}, La/fsd;->a()La/v8d;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-boolean p0, p0, La/v8d;->j:Z

    .line 58
    .line 59
    if-nez p0, :cond_2

    .line 60
    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    if-nez v2, :cond_2

    .line 64
    .line 65
    return v3

    .line 66
    :cond_2
    const/4 p0, 0x0

    .line 67
    return p0

    .line 68
    :cond_3
    const-string p0, "getCommonConfigUseCase"

    .line 69
    .line 70
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_4
    const-string p0, "getRemoteConfigUseCase"

    .line 75
    .line 76
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_5
    const-string p0, "getAuthorizationStateUseCase"

    .line 81
    .line 82
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0
.end method
