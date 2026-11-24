.class public final La/y1d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:J

.field public static final g:J


# instance fields
.field public final a:La/j1d0;

.field public final b:La/jw20;

.field public final c:La/a1d0;

.field public final d:La/knf0;

.field public final e:La/tgk;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    sget-object v1, La/bfn;->f:La/bfn;

    .line 5
    .line 6
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    invoke-static {v0, v1}, La/wen;->e(J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    sput-wide v0, La/y1d0;->f:J

    .line 15
    .line 16
    const/16 v0, 0x8

    .line 17
    .line 18
    sget-object v1, La/bfn;->e:La/bfn;

    .line 19
    .line 20
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    invoke-static {v0, v1}, La/wen;->e(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    sput-wide v0, La/y1d0;->g:J

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(La/j1d0;La/jw20;La/a1d0;La/knf0;La/tgk;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/y1d0;->a:La/j1d0;

    .line 17
    .line 18
    iput-object p2, p0, La/y1d0;->b:La/jw20;

    .line 19
    .line 20
    iput-object p3, p0, La/y1d0;->c:La/a1d0;

    .line 21
    .line 22
    iput-object p4, p0, La/y1d0;->d:La/knf0;

    .line 23
    .line 24
    iput-object p5, p0, La/y1d0;->e:La/tgk;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/w1d0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/w1d0;

    .line 11
    .line 12
    iget v3, v2, La/w1d0;->m:I

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
    iput v3, v2, La/w1d0;->m:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/w1d0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/w1d0;-><init>(La/y1d0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/w1d0;->k:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/w1d0;->m:I

    .line 34
    .line 35
    iget-object v5, v0, La/y1d0;->a:La/j1d0;

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v7, 0x1

    .line 39
    const/4 v8, 0x0

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v7, :cond_2

    .line 43
    .line 44
    if-ne v4, v6, :cond_1

    .line 45
    .line 46
    iget-object v2, v2, La/w1d0;->j:La/i050;

    .line 47
    .line 48
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_4

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v8

    .line 61
    :cond_2
    iget-wide v9, v2, La/w1d0;->i:J

    .line 62
    .line 63
    iget-object v4, v2, La/w1d0;->j:La/i050;

    .line 64
    .line 65
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v1, v4

    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v5, La/j1d0;->b:La/k050;

    .line 74
    .line 75
    iput-object v1, v2, La/w1d0;->j:La/i050;

    .line 76
    .line 77
    move-wide/from16 v9, p1

    .line 78
    .line 79
    iput-wide v9, v2, La/w1d0;->i:J

    .line 80
    .line 81
    iput v7, v2, La/w1d0;->m:I

    .line 82
    .line 83
    invoke-virtual {v1, v2}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    if-ne v4, v3, :cond_4

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_4
    :goto_1
    :try_start_1
    iget-object v4, v5, La/j1d0;->a:La/p7m0;

    .line 91
    .line 92
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    check-cast v4, La/o1d0;

    .line 97
    .line 98
    instance-of v5, v4, La/k1d0;

    .line 99
    .line 100
    if-eqz v5, :cond_5

    .line 101
    .line 102
    sget-wide v11, La/y1d0;->g:J

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :catchall_1
    move-exception v0

    .line 106
    move-object v2, v1

    .line 107
    goto :goto_6

    .line 108
    :cond_5
    sget-wide v11, La/y1d0;->f:J

    .line 109
    .line 110
    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 111
    .line 112
    .line 113
    move-result-wide v13

    .line 114
    invoke-virtual {v4}, La/o1d0;->a()J

    .line 115
    .line 116
    .line 117
    move-result-wide v15

    .line 118
    add-long/2addr v15, v11

    .line 119
    cmp-long v5, v13, v15

    .line 120
    .line 121
    if-gez v5, :cond_6

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_6
    iget-object v4, v0, La/y1d0;->b:La/jw20;

    .line 125
    .line 126
    iget-object v0, v0, La/y1d0;->d:La/knf0;

    .line 127
    .line 128
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iput-object v1, v2, La/w1d0;->j:La/i050;

    .line 132
    .line 133
    iput-wide v9, v2, La/w1d0;->i:J

    .line 134
    .line 135
    iput v6, v2, La/w1d0;->m:I

    .line 136
    .line 137
    const/16 v0, 0x54d

    .line 138
    .line 139
    invoke-virtual {v4, v0, v9, v10, v2}, La/jw20;->q(IJLa/zje;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 143
    if-ne v0, v3, :cond_7

    .line 144
    .line 145
    :goto_3
    return-object v3

    .line 146
    :cond_7
    move-object v2, v1

    .line 147
    move-object v1, v0

    .line 148
    :goto_4
    :try_start_2
    move-object v4, v1

    .line 149
    check-cast v4, La/o1d0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    .line 151
    move-object v1, v2

    .line 152
    :goto_5
    invoke-interface {v1, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    return-object v4

    .line 156
    :goto_6
    invoke-interface {v2, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    throw v0
.end method

.method public final b(JLa/zje;Z)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, La/x1d0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/x1d0;

    .line 11
    .line 12
    iget v3, v2, La/x1d0;->l:I

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
    iput v3, v2, La/x1d0;->l:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/x1d0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/x1d0;-><init>(La/y1d0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/x1d0;->j:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/x1d0;->l:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v6, :cond_1

    .line 40
    .line 41
    iget-boolean v2, v2, La/x1d0;->i:Z

    .line 42
    .line 43
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    move v4, v2

    .line 49
    goto :goto_2

    .line 50
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v5

    .line 56
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 60
    .line 61
    move/from16 v4, p4

    .line 62
    .line 63
    :try_start_2
    iput-boolean v4, v2, La/x1d0;->i:Z

    .line 64
    .line 65
    iput v6, v2, La/x1d0;->l:I

    .line 66
    .line 67
    move-wide/from16 v7, p1

    .line 68
    .line 69
    invoke-virtual {v1, v7, v8, v2}, La/y1d0;->a(JLa/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 73
    if-ne v0, v3, :cond_3

    .line 74
    .line 75
    return-object v3

    .line 76
    :cond_3
    move v2, v4

    .line 77
    :goto_1
    :try_start_3
    check-cast v0, La/o1d0;

    .line 78
    .line 79
    sget-object v3, La/j0g0;->b:La/e0g0;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 80
    .line 81
    goto :goto_3

    .line 82
    :catchall_1
    move-exception v0

    .line 83
    goto :goto_2

    .line 84
    :catchall_2
    move-exception v0

    .line 85
    move/from16 v4, p4

    .line 86
    .line 87
    :goto_2
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 88
    .line 89
    new-instance v2, La/g0g0;

    .line 90
    .line 91
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    move-object v0, v2

    .line 95
    move v2, v4

    .line 96
    :goto_3
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    if-nez v3, :cond_4

    .line 101
    .line 102
    :goto_4
    move-object v3, v0

    .line 103
    goto :goto_5

    .line 104
    :cond_4
    new-instance v0, La/k1d0;

    .line 105
    .line 106
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 107
    .line 108
    .line 109
    move-result-wide v7

    .line 110
    invoke-direct {v0, v3, v7, v8}, La/k1d0;-><init>(Ljava/lang/Throwable;J)V

    .line 111
    .line 112
    .line 113
    goto :goto_4

    .line 114
    :goto_5
    move-object v4, v3

    .line 115
    check-cast v4, La/o1d0;

    .line 116
    .line 117
    iget-object v0, v1, La/y1d0;->a:La/j1d0;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v0, v0, La/j1d0;->a:La/p7m0;

    .line 126
    .line 127
    invoke-virtual {v0, v5, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    iget-object v0, v1, La/y1d0;->c:La/a1d0;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    if-eqz v2, :cond_6

    .line 136
    .line 137
    :try_start_4
    instance-of v2, v4, La/k1d0;

    .line 138
    .line 139
    if-eqz v2, :cond_5

    .line 140
    .line 141
    sget-wide v7, La/b1d0;->b:J

    .line 142
    .line 143
    :goto_6
    move-wide v10, v7

    .line 144
    goto :goto_7

    .line 145
    :cond_5
    invoke-virtual {v4}, La/o1d0;->a()J

    .line 146
    .line 147
    .line 148
    move-result-wide v7

    .line 149
    sget-wide v9, La/b1d0;->a:J

    .line 150
    .line 151
    add-long/2addr v7, v9

    .line 152
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 153
    .line 154
    .line 155
    move-result-wide v9

    .line 156
    sub-long/2addr v7, v9

    .line 157
    const-wide/16 v9, 0x0

    .line 158
    .line 159
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    .line 160
    .line 161
    .line 162
    move-result-wide v7

    .line 163
    goto :goto_6

    .line 164
    :goto_7
    iget-object v2, v0, La/a1d0;->d:La/bby;

    .line 165
    .line 166
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 167
    .line 168
    .line 169
    iget-object v9, v0, La/a1d0;->c:La/sje;

    .line 170
    .line 171
    sget-object v12, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 172
    .line 173
    sget-object v14, La/z0d0;->a:La/z0d0;

    .line 174
    .line 175
    new-instance v15, La/coc0;

    .line 176
    .line 177
    invoke-direct {v15, v0, v5, v6}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 178
    .line 179
    .line 180
    const/16 v16, 0x24

    .line 181
    .line 182
    const/4 v13, 0x0

    .line 183
    invoke-static/range {v9 .. v16}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    iput-object v2, v0, La/a1d0;->d:La/bby;

    .line 188
    .line 189
    :cond_6
    instance-of v2, v4, La/n1d0;

    .line 190
    .line 191
    if-eqz v2, :cond_a

    .line 192
    .line 193
    sget v2, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;->h:I

    .line 194
    .line 195
    iget-object v0, v0, La/a1d0;->a:La/us00;

    .line 196
    .line 197
    move-object v2, v4

    .line 198
    check-cast v2, La/n1d0;

    .line 199
    .line 200
    iget-wide v6, v2, La/n1d0;->c:J

    .line 201
    .line 202
    const-string v2, "alarm"

    .line 203
    .line 204
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    instance-of v8, v2, Landroid/app/AlarmManager;

    .line 209
    .line 210
    if-eqz v8, :cond_7

    .line 211
    .line 212
    move-object v5, v2

    .line 213
    check-cast v5, Landroid/app/AlarmManager;

    .line 214
    .line 215
    :cond_7
    if-nez v5, :cond_8

    .line 216
    .line 217
    goto :goto_8

    .line 218
    :cond_8
    new-instance v2, Landroid/content/Intent;

    .line 219
    .line 220
    const-class v8, Lorg/xplatform/prophylaxis/impl/prophylaxis/presentation/ProphylaxisAlarmReceiver;

    .line 221
    .line 222
    invoke-direct {v2, v0, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 223
    .line 224
    .line 225
    const/high16 v8, 0x8000000

    .line 226
    .line 227
    invoke-static {v8}, La/rsr0;->e0(I)I

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    const/4 v9, 0x0

    .line 232
    invoke-static {v0, v9, v2, v8}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v5, v0}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 240
    .line 241
    .line 242
    const-wide/16 v10, 0x3e8

    .line 243
    .line 244
    mul-long/2addr v6, v10

    .line 245
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 246
    .line 247
    .line 248
    move-result-wide v10

    .line 249
    cmp-long v2, v10, v6

    .line 250
    .line 251
    if-lez v2, :cond_9

    .line 252
    .line 253
    sget-wide v6, La/b1d0;->b:J

    .line 254
    .line 255
    add-long/2addr v6, v10

    .line 256
    :cond_9
    invoke-virtual {v5, v9, v6, v7, v0}, Landroid/app/AlarmManager;->setAndAllowWhileIdle(IJLandroid/app/PendingIntent;)V

    .line 257
    .line 258
    .line 259
    goto :goto_8

    .line 260
    :catchall_3
    move-exception v0

    .line 261
    goto :goto_9

    .line 262
    :cond_a
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 263
    .line 264
    goto :goto_a

    .line 265
    :goto_9
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 266
    .line 267
    new-instance v2, La/g0g0;

    .line 268
    .line 269
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 270
    .line 271
    .line 272
    move-object v0, v2

    .line 273
    :goto_a
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    if-eqz v0, :cond_b

    .line 278
    .line 279
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 280
    .line 281
    .line 282
    :cond_b
    iget-object v0, v1, La/y1d0;->e:La/tgk;

    .line 283
    .line 284
    instance-of v1, v4, La/n1d0;

    .line 285
    .line 286
    iput-boolean v1, v0, La/tgk;->j:Z

    .line 287
    .line 288
    return-object v3
.end method
