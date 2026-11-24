.class public final Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
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
.field public final g:Landroid/content/Context;

.field public final h:La/h760;

.field public final i:La/s64;

.field public final j:La/qu;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
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
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;->g:Landroid/content/Context;

    .line 11
    .line 12
    iget-object p1, p0, La/og00;->a:Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p1, Landroid/app/Application;

    .line 18
    .line 19
    instance-of p2, p1, La/af3;

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    check-cast p1, La/af3;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object p1, v0

    .line 28
    :goto_0
    const-class p2, La/bbp;

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, p2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, La/o5d0;

    .line 41
    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, La/ze3;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object p1, v0

    .line 52
    :goto_1
    instance-of v1, p1, La/bbp;

    .line 53
    .line 54
    if-nez v1, :cond_2

    .line 55
    .line 56
    move-object p1, v0

    .line 57
    :cond_2
    check-cast p1, La/bbp;

    .line 58
    .line 59
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p2, p1, La/bbp;->a:La/h760;

    .line 62
    .line 63
    iget-object v0, p1, La/bbp;->b:La/s64;

    .line 64
    .line 65
    iget-object p1, p1, La/bbp;->c:La/qu;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iput-object p2, p0, Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;->h:La/h760;

    .line 71
    .line 72
    iput-object v0, p0, Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;->i:La/s64;

    .line 73
    .line 74
    iput-object p1, p0, Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;->j:La/qu;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 78
    .line 79
    invoke-static {p2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0
.end method


# virtual methods
.method public final c(La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    instance-of v2, v1, La/cbp;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/cbp;

    .line 11
    .line 12
    iget v3, v2, La/cbp;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/cbp;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/cbp;

    .line 25
    .line 26
    check-cast v1, La/zje;

    .line 27
    .line 28
    invoke-direct {v2, v0, v1}, La/cbp;-><init>(Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v1, v2, La/cbp;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v2, La/cbp;->k:I

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v6, 0x1

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    if-ne v4, v6, :cond_1

    .line 42
    .line 43
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto/16 :goto_2

    .line 47
    .line 48
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v5

    .line 54
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;->g:Landroid/content/Context;

    .line 58
    .line 59
    invoke-static {v1}, La/b8k0;->H(Landroid/content/Context;)La/us00;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    new-instance v8, Landroid/content/Intent;

    .line 64
    .line 65
    const v7, 0x7f130690

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    new-instance v9, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v7, "://open/favorite"

    .line 81
    .line 82
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const-string v9, "android.intent.action.VIEW"

    .line 94
    .line 95
    invoke-direct {v8, v9, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v8, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 103
    .line 104
    .line 105
    const/high16 v1, 0x10000000

    .line 106
    .line 107
    invoke-virtual {v8, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 108
    .line 109
    .line 110
    sget-object v1, La/sr00;->b:La/sr00;

    .line 111
    .line 112
    const-string v7, "LOCAL_NOTIFICATION_TYPE"

    .line 113
    .line 114
    invoke-virtual {v8, v7, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 115
    .line 116
    .line 117
    iget-object v1, v0, Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;->h:La/h760;

    .line 118
    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    invoke-interface {v1}, La/h760;->a()La/t760;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    sget-object v1, La/k9h0;->a:La/gle0;

    .line 126
    .line 127
    const v1, 0x7f130113

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    const v1, 0x7f13086c

    .line 138
    .line 139
    .line 140
    invoke-virtual {v4, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    const/16 v17, 0x3b0

    .line 150
    .line 151
    const/high16 v11, 0x40000000    # 2.0f

    .line 152
    .line 153
    const/4 v12, 0x0

    .line 154
    const/4 v13, 0x0

    .line 155
    const-string v14, "FAVORITES"

    .line 156
    .line 157
    const/4 v15, 0x0

    .line 158
    invoke-static/range {v7 .. v17}, La/t760;->a(La/t760;Landroid/content/Intent;Ljava/lang/String;Ljava/lang/String;ILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;ILjava/util/List;I)V

    .line 159
    .line 160
    .line 161
    iput v6, v2, La/cbp;->k:I

    .line 162
    .line 163
    iget-object v1, v0, Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;->j:La/qu;

    .line 164
    .line 165
    if-eqz v1, :cond_6

    .line 166
    .line 167
    sget-object v4, La/z660;->g:La/z660;

    .line 168
    .line 169
    invoke-virtual {v1, v4}, La/qu;->d(La/z660;)V

    .line 170
    .line 171
    .line 172
    iget-object v0, v0, Lorg/xplatform/favorites/impl/data/workers/FavoriteLocalNotificationWorker;->i:La/s64;

    .line 173
    .line 174
    if-eqz v0, :cond_5

    .line 175
    .line 176
    const-string v1, "favorite_game_start"

    .line 177
    .line 178
    invoke-virtual {v0, v1, v2}, La/s64;->b(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-ne v0, v3, :cond_3

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    :goto_1
    if-ne v0, v3, :cond_4

    .line 188
    .line 189
    return-object v3

    .line 190
    :cond_4
    :goto_2
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :cond_5
    const-string v0, "notificationFatmanLogger"

    .line 196
    .line 197
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v5

    .line 201
    :cond_6
    const-string v0, "notificationAnalytics"

    .line 202
    .line 203
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    throw v5

    .line 207
    :cond_7
    const-string v0, "notificationFeature"

    .line 208
    .line 209
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v5
.end method
