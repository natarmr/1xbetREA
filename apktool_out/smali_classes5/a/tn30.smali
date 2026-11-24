.class public final La/tn30;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ukg0;

.field public final b:La/skg0;

.field public final c:La/v34;

.field public final d:La/o34;

.field public final e:La/u24;

.field public final f:La/oiv;

.field public final g:La/nb90;

.field public final h:La/sje;

.field public final i:La/k050;

.field public j:La/c4m0;

.field public k:La/c4m0;

.field public l:La/c4m0;

.field public m:La/q99;

.field public n:La/c4m0;

.field public o:La/tyc;

.field public p:La/ah80;

.field public final q:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(La/ukg0;La/skg0;La/v34;La/o34;La/u24;La/oiv;La/nb90;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/tn30;->a:La/ukg0;

    .line 26
    .line 27
    iput-object p2, p0, La/tn30;->b:La/skg0;

    .line 28
    .line 29
    iput-object p3, p0, La/tn30;->c:La/v34;

    .line 30
    .line 31
    iput-object p4, p0, La/tn30;->d:La/o34;

    .line 32
    .line 33
    iput-object p5, p0, La/tn30;->e:La/u24;

    .line 34
    .line 35
    iput-object p6, p0, La/tn30;->f:La/oiv;

    .line 36
    .line 37
    iput-object p7, p0, La/tn30;->g:La/nb90;

    .line 38
    .line 39
    sget-object p1, La/tvk;->a:La/rwj;

    .line 40
    .line 41
    sget-object p1, La/dvj;->c:La/dvj;

    .line 42
    .line 43
    invoke-static {}, La/qem0;->e()La/kin0;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {p1, p2}, Lkotlin/coroutines/e;->c(Lkotlin/coroutines/CoroutineContext$Element;Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, La/tn30;->h:La/sje;

    .line 59
    .line 60
    new-instance p1, La/k050;

    .line 61
    .line 62
    invoke-direct {p1}, La/k050;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object p1, p0, La/tn30;->i:La/k050;

    .line 66
    .line 67
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 68
    .line 69
    const/4 p2, -0x1

    .line 70
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, La/tn30;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final a(JLa/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p3, La/qn30;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/qn30;

    .line 7
    .line 8
    iget v1, v0, La/qn30;->m:I

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
    iput v1, v0, La/qn30;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/qn30;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/qn30;-><init>(La/tn30;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/qn30;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p3, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/qn30;->m:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    iget-wide p1, v0, La/qn30;->j:J

    .line 37
    .line 38
    iget p3, v0, La/qn30;->i:I

    .line 39
    .line 40
    int-to-long v0, p3

    .line 41
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 56
    .line 57
    .line 58
    move-result-wide v3

    .line 59
    const-wide/16 v5, 0x0

    .line 60
    .line 61
    cmp-long p0, p1, v5

    .line 62
    .line 63
    const-wide/32 v7, 0x1312d00

    .line 64
    .line 65
    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    sub-long v9, v3, p1

    .line 69
    .line 70
    cmp-long p0, v9, v7

    .line 71
    .line 72
    if-lez p0, :cond_4

    .line 73
    .line 74
    :cond_3
    add-long p1, v3, v7

    .line 75
    .line 76
    :cond_4
    sub-long v3, p1, v3

    .line 77
    .line 78
    const-wide/32 v9, 0xf4240

    .line 79
    .line 80
    .line 81
    div-long/2addr v3, v9

    .line 82
    cmp-long p0, v3, v5

    .line 83
    .line 84
    if-lez p0, :cond_6

    .line 85
    .line 86
    sget-object p0, La/wen;->b:La/uen;

    .line 87
    .line 88
    sget-object p0, La/bfn;->d:La/bfn;

    .line 89
    .line 90
    invoke-static {v3, v4, p0}, La/ibc;->w0(JLa/bfn;)J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    const p0, 0x1312d00

    .line 95
    .line 96
    .line 97
    iput p0, v0, La/qn30;->i:I

    .line 98
    .line 99
    iput-wide p1, v0, La/qn30;->j:J

    .line 100
    .line 101
    iput v2, v0, La/qn30;->m:I

    .line 102
    .line 103
    invoke-static {v3, v4, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    if-ne p0, p3, :cond_5

    .line 108
    .line 109
    return-object p3

    .line 110
    :cond_5
    move-wide v0, v7

    .line 111
    :goto_1
    move-wide v7, v0

    .line 112
    :cond_6
    add-long/2addr p1, v7

    .line 113
    new-instance p0, Ljava/lang/Long;

    .line 114
    .line 115
    invoke-direct {p0, p1, p2}, Ljava/lang/Long;-><init>(J)V

    .line 116
    .line 117
    .line 118
    return-object p0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, La/tn30;->j:La/c4m0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, La/tn30;->j:La/c4m0;

    .line 10
    .line 11
    iget-object v0, p0, La/tn30;->n:La/c4m0;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 16
    .line 17
    .line 18
    :cond_1
    iput-object v1, p0, La/tn30;->n:La/c4m0;

    .line 19
    .line 20
    iget-object v0, p0, La/tn30;->m:La/q99;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, v1}, La/q99;->d(Ljava/lang/Throwable;)Z

    .line 25
    .line 26
    .line 27
    :cond_2
    iput-object v1, p0, La/tn30;->m:La/q99;

    .line 28
    .line 29
    iget-object v0, p0, La/tn30;->k:La/c4m0;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    iput-object v1, p0, La/tn30;->k:La/c4m0;

    .line 37
    .line 38
    iget-object v0, p0, La/tn30;->l:La/c4m0;

    .line 39
    .line 40
    if-eqz v0, :cond_4

    .line 41
    .line 42
    invoke-virtual {v0, v1}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 43
    .line 44
    .line 45
    :cond_4
    iput-object v1, p0, La/tn30;->l:La/c4m0;

    .line 46
    .line 47
    return-void
.end method

.method public final c([B)[S
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    array-length v2, v1

    .line 6
    const/4 v3, 0x3

    .line 7
    const/16 v4, 0xf

    .line 8
    .line 9
    const/4 v5, 0x7

    .line 10
    const/4 v6, 0x4

    .line 11
    const/4 v7, 0x0

    .line 12
    const/16 v8, 0xa0

    .line 13
    .line 14
    const/16 v9, 0x21

    .line 15
    .line 16
    if-eq v2, v9, :cond_4

    .line 17
    .line 18
    if-eq v2, v8, :cond_0

    .line 19
    .line 20
    new-array v0, v8, [S

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    iget-object v0, v0, La/tn30;->g:La/nb90;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    array-length v0, v1

    .line 29
    if-eq v0, v8, :cond_1

    .line 30
    .line 31
    new-array v0, v7, [S

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_1
    new-array v0, v8, [S

    .line 35
    .line 36
    :goto_0
    if-ge v7, v8, :cond_3

    .line 37
    .line 38
    aget-byte v2, v1, v7

    .line 39
    .line 40
    and-int/lit16 v2, v2, 0xff

    .line 41
    .line 42
    not-int v2, v2

    .line 43
    and-int/lit16 v9, v2, 0xff

    .line 44
    .line 45
    and-int/lit16 v10, v2, 0x80

    .line 46
    .line 47
    shr-int/2addr v9, v6

    .line 48
    and-int/2addr v9, v5

    .line 49
    and-int/2addr v2, v4

    .line 50
    shl-int/2addr v2, v3

    .line 51
    add-int/lit16 v2, v2, 0x84

    .line 52
    .line 53
    shl-int/2addr v2, v9

    .line 54
    if-nez v10, :cond_2

    .line 55
    .line 56
    add-int/lit16 v2, v2, -0x84

    .line 57
    .line 58
    :goto_1
    int-to-short v2, v2

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    rsub-int v2, v2, 0x84

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :goto_2
    aput-short v2, v0, v7

    .line 64
    .line 65
    add-int/lit8 v7, v7, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    return-object v0

    .line 69
    :cond_4
    iget-object v0, v0, La/tn30;->f:La/oiv;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    array-length v2, v1

    .line 75
    if-eq v2, v9, :cond_5

    .line 76
    .line 77
    new-array v0, v7, [S

    .line 78
    .line 79
    return-object v0

    .line 80
    :cond_5
    aget-byte v2, v1, v7

    .line 81
    .line 82
    shr-int/lit8 v9, v2, 0x4

    .line 83
    .line 84
    and-int/2addr v9, v4

    .line 85
    const/16 v10, 0xd

    .line 86
    .line 87
    if-eq v9, v10, :cond_6

    .line 88
    .line 89
    new-array v0, v7, [S

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_6
    iget-object v0, v0, La/oiv;->b:La/miv;

    .line 93
    .line 94
    iget-object v9, v0, La/miv;->g:[S

    .line 95
    .line 96
    iget-object v11, v0, La/miv;->a:[S

    .line 97
    .line 98
    iget-object v12, v0, La/miv;->h:[S

    .line 99
    .line 100
    iget-object v13, v0, La/miv;->i:[S

    .line 101
    .line 102
    iget-object v14, v0, La/miv;->j:[S

    .line 103
    .line 104
    iget-object v15, v0, La/miv;->k:[S

    .line 105
    .line 106
    move/from16 v16, v3

    .line 107
    .line 108
    iget-object v3, v0, La/miv;->l:[S

    .line 109
    .line 110
    and-int/2addr v2, v4

    .line 111
    const/16 v17, 0x2

    .line 112
    .line 113
    shl-int/lit8 v2, v2, 0x2

    .line 114
    .line 115
    const/16 v18, 0x1

    .line 116
    .line 117
    aget-byte v19, v1, v18

    .line 118
    .line 119
    shr-int/lit8 v20, v19, 0x6

    .line 120
    .line 121
    and-int/lit8 v20, v20, 0x3

    .line 122
    .line 123
    or-int v2, v2, v20

    .line 124
    .line 125
    int-to-short v2, v2

    .line 126
    aput-short v2, v9, v7

    .line 127
    .line 128
    and-int/lit8 v2, v19, 0x3f

    .line 129
    .line 130
    int-to-short v2, v2

    .line 131
    aput-short v2, v9, v18

    .line 132
    .line 133
    aget-byte v2, v1, v17

    .line 134
    .line 135
    shr-int/lit8 v19, v2, 0x3

    .line 136
    .line 137
    move/from16 v20, v7

    .line 138
    .line 139
    and-int/lit8 v7, v19, 0x1f

    .line 140
    .line 141
    int-to-short v7, v7

    .line 142
    aput-short v7, v9, v17

    .line 143
    .line 144
    and-int/2addr v2, v5

    .line 145
    shl-int/lit8 v2, v2, 0x2

    .line 146
    .line 147
    aget-byte v7, v1, v16

    .line 148
    .line 149
    shr-int/lit8 v19, v7, 0x6

    .line 150
    .line 151
    and-int/lit8 v19, v19, 0x3

    .line 152
    .line 153
    or-int v2, v2, v19

    .line 154
    .line 155
    int-to-short v2, v2

    .line 156
    aput-short v2, v9, v16

    .line 157
    .line 158
    shr-int/lit8 v2, v7, 0x2

    .line 159
    .line 160
    and-int/2addr v2, v4

    .line 161
    int-to-short v2, v2

    .line 162
    aput-short v2, v9, v6

    .line 163
    .line 164
    and-int/lit8 v2, v7, 0x3

    .line 165
    .line 166
    shl-int/lit8 v2, v2, 0x2

    .line 167
    .line 168
    aget-byte v7, v1, v6

    .line 169
    .line 170
    shr-int/lit8 v19, v7, 0x6

    .line 171
    .line 172
    and-int/lit8 v19, v19, 0x3

    .line 173
    .line 174
    or-int v2, v2, v19

    .line 175
    .line 176
    int-to-short v2, v2

    .line 177
    const/16 v19, 0x5

    .line 178
    .line 179
    aput-short v2, v9, v19

    .line 180
    .line 181
    shr-int/lit8 v2, v7, 0x3

    .line 182
    .line 183
    and-int/2addr v2, v5

    .line 184
    int-to-short v2, v2

    .line 185
    const/16 v21, 0x6

    .line 186
    .line 187
    aput-short v2, v9, v21

    .line 188
    .line 189
    and-int/lit8 v2, v7, 0x7

    .line 190
    .line 191
    int-to-short v2, v2

    .line 192
    aput-short v2, v9, v5

    .line 193
    .line 194
    move/from16 v2, v20

    .line 195
    .line 196
    :goto_3
    if-ge v2, v6, :cond_7

    .line 197
    .line 198
    mul-int/lit8 v22, v2, 0xd

    .line 199
    .line 200
    aget-byte v23, v1, v19

    .line 201
    .line 202
    shr-int/lit8 v24, v23, 0x1

    .line 203
    .line 204
    const/16 p0, 0xc

    .line 205
    .line 206
    and-int/lit8 v7, v24, 0x7f

    .line 207
    .line 208
    int-to-short v7, v7

    .line 209
    aput-short v7, v12, v2

    .line 210
    .line 211
    and-int/lit8 v7, v23, 0x1

    .line 212
    .line 213
    shl-int/lit8 v7, v7, 0x1

    .line 214
    .line 215
    add-int/lit8 v23, v19, 0x1

    .line 216
    .line 217
    aget-byte v23, v1, v23

    .line 218
    .line 219
    shr-int/lit8 v24, v23, 0x7

    .line 220
    .line 221
    and-int/lit8 v24, v24, 0x1

    .line 222
    .line 223
    or-int v7, v7, v24

    .line 224
    .line 225
    int-to-short v7, v7

    .line 226
    aput-short v7, v13, v2

    .line 227
    .line 228
    shr-int/lit8 v7, v23, 0x5

    .line 229
    .line 230
    and-int/lit8 v7, v7, 0x3

    .line 231
    .line 232
    int-to-short v7, v7

    .line 233
    aput-short v7, v14, v2

    .line 234
    .line 235
    and-int/lit8 v7, v23, 0x1f

    .line 236
    .line 237
    shl-int/lit8 v7, v7, 0x1

    .line 238
    .line 239
    add-int/lit8 v23, v19, 0x2

    .line 240
    .line 241
    aget-byte v23, v1, v23

    .line 242
    .line 243
    shr-int/lit8 v24, v23, 0x7

    .line 244
    .line 245
    and-int/lit8 v24, v24, 0x1

    .line 246
    .line 247
    or-int v7, v7, v24

    .line 248
    .line 249
    int-to-short v7, v7

    .line 250
    aput-short v7, v15, v2

    .line 251
    .line 252
    shr-int/lit8 v7, v23, 0x4

    .line 253
    .line 254
    and-int/2addr v7, v5

    .line 255
    int-to-short v7, v7

    .line 256
    aput-short v7, v3, v22

    .line 257
    .line 258
    add-int/lit8 v7, v22, 0x1

    .line 259
    .line 260
    shr-int/lit8 v24, v23, 0x1

    .line 261
    .line 262
    and-int/lit8 v8, v24, 0x7

    .line 263
    .line 264
    int-to-short v8, v8

    .line 265
    aput-short v8, v3, v7

    .line 266
    .line 267
    add-int/lit8 v7, v22, 0x2

    .line 268
    .line 269
    and-int/lit8 v8, v23, 0x1

    .line 270
    .line 271
    shl-int/lit8 v8, v8, 0x2

    .line 272
    .line 273
    add-int/lit8 v23, v19, 0x3

    .line 274
    .line 275
    aget-byte v23, v1, v23

    .line 276
    .line 277
    shr-int/lit8 v24, v23, 0x6

    .line 278
    .line 279
    and-int/lit8 v24, v24, 0x3

    .line 280
    .line 281
    or-int v8, v8, v24

    .line 282
    .line 283
    int-to-short v8, v8

    .line 284
    aput-short v8, v3, v7

    .line 285
    .line 286
    add-int/lit8 v7, v22, 0x3

    .line 287
    .line 288
    shr-int/lit8 v8, v23, 0x3

    .line 289
    .line 290
    and-int/2addr v8, v5

    .line 291
    int-to-short v8, v8

    .line 292
    aput-short v8, v3, v7

    .line 293
    .line 294
    add-int/lit8 v7, v22, 0x4

    .line 295
    .line 296
    and-int/lit8 v8, v23, 0x7

    .line 297
    .line 298
    int-to-short v8, v8

    .line 299
    aput-short v8, v3, v7

    .line 300
    .line 301
    add-int/lit8 v7, v19, 0x4

    .line 302
    .line 303
    add-int/lit8 v8, v22, 0x5

    .line 304
    .line 305
    aget-byte v7, v1, v7

    .line 306
    .line 307
    shr-int/lit8 v23, v7, 0x5

    .line 308
    .line 309
    and-int/lit8 v10, v23, 0x7

    .line 310
    .line 311
    int-to-short v10, v10

    .line 312
    aput-short v10, v3, v8

    .line 313
    .line 314
    add-int/lit8 v8, v22, 0x6

    .line 315
    .line 316
    shr-int/lit8 v10, v7, 0x2

    .line 317
    .line 318
    and-int/2addr v10, v5

    .line 319
    int-to-short v10, v10

    .line 320
    aput-short v10, v3, v8

    .line 321
    .line 322
    add-int/lit8 v8, v22, 0x7

    .line 323
    .line 324
    and-int/lit8 v7, v7, 0x3

    .line 325
    .line 326
    shl-int/lit8 v7, v7, 0x1

    .line 327
    .line 328
    add-int/lit8 v10, v19, 0x5

    .line 329
    .line 330
    aget-byte v10, v1, v10

    .line 331
    .line 332
    shr-int/lit8 v23, v10, 0x7

    .line 333
    .line 334
    and-int/lit8 v23, v23, 0x1

    .line 335
    .line 336
    or-int v7, v7, v23

    .line 337
    .line 338
    int-to-short v7, v7

    .line 339
    aput-short v7, v3, v8

    .line 340
    .line 341
    add-int/lit8 v7, v22, 0x8

    .line 342
    .line 343
    shr-int/lit8 v8, v10, 0x4

    .line 344
    .line 345
    and-int/2addr v8, v5

    .line 346
    int-to-short v8, v8

    .line 347
    aput-short v8, v3, v7

    .line 348
    .line 349
    add-int/lit8 v7, v22, 0x9

    .line 350
    .line 351
    shr-int/lit8 v8, v10, 0x1

    .line 352
    .line 353
    and-int/2addr v8, v5

    .line 354
    int-to-short v8, v8

    .line 355
    aput-short v8, v3, v7

    .line 356
    .line 357
    add-int/lit8 v7, v22, 0xa

    .line 358
    .line 359
    and-int/lit8 v8, v10, 0x1

    .line 360
    .line 361
    shl-int/lit8 v8, v8, 0x2

    .line 362
    .line 363
    add-int/lit8 v10, v19, 0x6

    .line 364
    .line 365
    aget-byte v10, v1, v10

    .line 366
    .line 367
    shr-int/lit8 v23, v10, 0x6

    .line 368
    .line 369
    and-int/lit8 v23, v23, 0x3

    .line 370
    .line 371
    or-int v8, v8, v23

    .line 372
    .line 373
    int-to-short v8, v8

    .line 374
    aput-short v8, v3, v7

    .line 375
    .line 376
    add-int/lit8 v7, v22, 0xb

    .line 377
    .line 378
    shr-int/lit8 v8, v10, 0x3

    .line 379
    .line 380
    and-int/2addr v8, v5

    .line 381
    int-to-short v8, v8

    .line 382
    aput-short v8, v3, v7

    .line 383
    .line 384
    add-int/lit8 v22, v22, 0xc

    .line 385
    .line 386
    and-int/lit8 v7, v10, 0x7

    .line 387
    .line 388
    int-to-short v7, v7

    .line 389
    aput-short v7, v3, v22

    .line 390
    .line 391
    add-int/lit8 v19, v19, 0x7

    .line 392
    .line 393
    add-int/lit8 v2, v2, 0x1

    .line 394
    .line 395
    const/16 v8, 0xa0

    .line 396
    .line 397
    const/16 v10, 0xd

    .line 398
    .line 399
    goto/16 :goto_3

    .line 400
    .line 401
    :cond_7
    const/16 p0, 0xc

    .line 402
    .line 403
    iget-object v1, v0, La/miv;->m:[S

    .line 404
    .line 405
    iget-object v2, v0, La/miv;->n:[S

    .line 406
    .line 407
    move/from16 v7, v20

    .line 408
    .line 409
    :goto_4
    if-ge v7, v6, :cond_27

    .line 410
    .line 411
    aget-short v8, v15, v7

    .line 412
    .line 413
    aget-short v10, v14, v7

    .line 414
    .line 415
    mul-int/lit8 v17, v7, 0xd

    .line 416
    .line 417
    iget-object v6, v0, La/miv;->p:La/g2v;

    .line 418
    .line 419
    iget-object v6, v6, La/g2v;->a:Ljava/lang/Object;

    .line 420
    .line 421
    check-cast v6, [S

    .line 422
    .line 423
    if-le v8, v4, :cond_8

    .line 424
    .line 425
    shr-int/lit8 v22, v8, 0x3

    .line 426
    .line 427
    move/from16 v23, v4

    .line 428
    .line 429
    add-int/lit8 v4, v22, -0x1

    .line 430
    .line 431
    int-to-short v4, v4

    .line 432
    goto :goto_5

    .line 433
    :cond_8
    move/from16 v23, v4

    .line 434
    .line 435
    move/from16 v4, v20

    .line 436
    .line 437
    :goto_5
    shl-int/lit8 v22, v4, 0x3

    .line 438
    .line 439
    sub-int v8, v8, v22

    .line 440
    .line 441
    int-to-short v8, v8

    .line 442
    if-nez v8, :cond_9

    .line 443
    .line 444
    const/4 v4, -0x4

    .line 445
    move v8, v5

    .line 446
    goto :goto_7

    .line 447
    :cond_9
    :goto_6
    if-gt v8, v5, :cond_a

    .line 448
    .line 449
    shl-int/lit8 v8, v8, 0x1

    .line 450
    .line 451
    or-int/lit8 v8, v8, 0x1

    .line 452
    .line 453
    int-to-short v8, v8

    .line 454
    add-int/lit8 v4, v4, -0x1

    .line 455
    .line 456
    int-to-short v4, v4

    .line 457
    goto :goto_6

    .line 458
    :cond_a
    add-int/lit8 v8, v8, -0x8

    .line 459
    .line 460
    int-to-short v8, v8

    .line 461
    :goto_7
    sget-object v22, La/oiv;->f:[S

    .line 462
    .line 463
    aget-short v8, v22, v8

    .line 464
    .line 465
    rsub-int/lit8 v4, v4, 0x6

    .line 466
    .line 467
    move/from16 v22, v5

    .line 468
    .line 469
    const/16 v5, -0x8000

    .line 470
    .line 471
    if-ge v4, v5, :cond_b

    .line 472
    .line 473
    move v4, v5

    .line 474
    const/16 v5, 0x7fff

    .line 475
    .line 476
    goto :goto_8

    .line 477
    :cond_b
    const/16 v5, 0x7fff

    .line 478
    .line 479
    if-le v4, v5, :cond_c

    .line 480
    .line 481
    move v4, v5

    .line 482
    goto :goto_8

    .line 483
    :cond_c
    int-to-short v4, v4

    .line 484
    :goto_8
    add-int/lit8 v5, v4, -0x1

    .line 485
    .line 486
    move-object/from16 v25, v1

    .line 487
    .line 488
    const/16 v1, -0x8000

    .line 489
    .line 490
    if-ge v5, v1, :cond_d

    .line 491
    .line 492
    const/16 v5, -0x8000

    .line 493
    .line 494
    goto :goto_9

    .line 495
    :cond_d
    const/16 v1, 0x7fff

    .line 496
    .line 497
    if-le v5, v1, :cond_e

    .line 498
    .line 499
    const/16 v5, 0x7fff

    .line 500
    .line 501
    goto :goto_9

    .line 502
    :cond_e
    int-to-short v5, v5

    .line 503
    :goto_9
    const/16 v1, 0x10

    .line 504
    .line 505
    if-lt v5, v1, :cond_f

    .line 506
    .line 507
    :goto_a
    move/from16 v1, v20

    .line 508
    .line 509
    goto :goto_c

    .line 510
    :cond_f
    const/16 v1, -0x10

    .line 511
    .line 512
    if-gt v5, v1, :cond_10

    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_10
    if-gez v5, :cond_14

    .line 516
    .line 517
    neg-int v5, v5

    .line 518
    const/16 v1, 0x10

    .line 519
    .line 520
    if-lt v5, v1, :cond_11

    .line 521
    .line 522
    goto :goto_a

    .line 523
    :cond_11
    const/16 v1, -0x10

    .line 524
    .line 525
    if-gt v5, v1, :cond_12

    .line 526
    .line 527
    goto :goto_a

    .line 528
    :cond_12
    if-gez v5, :cond_13

    .line 529
    .line 530
    neg-int v1, v5

    .line 531
    shl-int v1, v18, v1

    .line 532
    .line 533
    goto :goto_b

    .line 534
    :cond_13
    shr-int v1, v18, v5

    .line 535
    .line 536
    goto :goto_b

    .line 537
    :cond_14
    shl-int v1, v18, v5

    .line 538
    .line 539
    :goto_b
    int-to-short v1, v1

    .line 540
    :goto_c
    move/from16 v5, v20

    .line 541
    .line 542
    :goto_d
    const/16 v26, -0x1

    .line 543
    .line 544
    move/from16 v27, v1

    .line 545
    .line 546
    const/16 v1, 0xd

    .line 547
    .line 548
    if-ge v5, v1, :cond_1e

    .line 549
    .line 550
    add-int/lit8 v24, v17, 0x1

    .line 551
    .line 552
    aget-short v17, v3, v17

    .line 553
    .line 554
    shl-int/lit8 v17, v17, 0x1

    .line 555
    .line 556
    add-int/lit8 v1, v17, -0x7

    .line 557
    .line 558
    int-to-short v1, v1

    .line 559
    shl-int/lit8 v1, v1, 0xc

    .line 560
    .line 561
    int-to-short v1, v1

    .line 562
    move-object/from16 v17, v2

    .line 563
    .line 564
    const/16 v2, -0x8000

    .line 565
    .line 566
    if-ne v8, v2, :cond_15

    .line 567
    .line 568
    if-ne v1, v2, :cond_15

    .line 569
    .line 570
    const/16 v1, 0x7fff

    .line 571
    .line 572
    :goto_e
    const/16 v2, 0x7fff

    .line 573
    .line 574
    goto :goto_f

    .line 575
    :cond_15
    mul-int/2addr v1, v8

    .line 576
    add-int/lit16 v1, v1, 0x4000

    .line 577
    .line 578
    shr-int/lit8 v1, v1, 0xf

    .line 579
    .line 580
    if-ge v1, v2, :cond_16

    .line 581
    .line 582
    move v1, v2

    .line 583
    goto :goto_e

    .line 584
    :cond_16
    const/16 v2, 0x7fff

    .line 585
    .line 586
    if-le v1, v2, :cond_17

    .line 587
    .line 588
    move v1, v2

    .line 589
    goto :goto_f

    .line 590
    :cond_17
    int-to-short v1, v1

    .line 591
    :goto_f
    add-int v1, v1, v27

    .line 592
    .line 593
    const/16 v2, -0x8000

    .line 594
    .line 595
    if-ge v1, v2, :cond_18

    .line 596
    .line 597
    :goto_10
    move v1, v2

    .line 598
    :goto_11
    const/16 v2, 0x10

    .line 599
    .line 600
    goto :goto_12

    .line 601
    :cond_18
    const/16 v2, 0x7fff

    .line 602
    .line 603
    if-le v1, v2, :cond_19

    .line 604
    .line 605
    goto :goto_10

    .line 606
    :cond_19
    int-to-short v1, v1

    .line 607
    goto :goto_11

    .line 608
    :goto_12
    if-lt v4, v2, :cond_1b

    .line 609
    .line 610
    if-gez v1, :cond_1a

    .line 611
    .line 612
    goto :goto_15

    .line 613
    :cond_1a
    :goto_13
    move/from16 v26, v20

    .line 614
    .line 615
    goto :goto_15

    .line 616
    :cond_1b
    const/16 v2, -0x10

    .line 617
    .line 618
    if-gt v4, v2, :cond_1c

    .line 619
    .line 620
    goto :goto_13

    .line 621
    :cond_1c
    if-gez v4, :cond_1d

    .line 622
    .line 623
    neg-int v2, v4

    .line 624
    shl-int/2addr v1, v2

    .line 625
    :goto_14
    int-to-short v1, v1

    .line 626
    move/from16 v26, v1

    .line 627
    .line 628
    goto :goto_15

    .line 629
    :cond_1d
    shr-int/2addr v1, v4

    .line 630
    goto :goto_14

    .line 631
    :goto_15
    aput-short v26, v6, v5

    .line 632
    .line 633
    add-int/lit8 v5, v5, 0x1

    .line 634
    .line 635
    move-object/from16 v2, v17

    .line 636
    .line 637
    move/from16 v17, v24

    .line 638
    .line 639
    move/from16 v1, v27

    .line 640
    .line 641
    goto :goto_d

    .line 642
    :cond_1e
    move-object/from16 v17, v2

    .line 643
    .line 644
    move/from16 v1, v20

    .line 645
    .line 646
    move v2, v1

    .line 647
    :goto_16
    if-ge v1, v10, :cond_1f

    .line 648
    .line 649
    add-int/lit8 v4, v2, 0x1

    .line 650
    .line 651
    aput-short v20, v25, v2

    .line 652
    .line 653
    add-int/lit8 v1, v1, 0x1

    .line 654
    .line 655
    move v2, v4

    .line 656
    goto :goto_16

    .line 657
    :cond_1f
    add-int/lit8 v1, v2, 0x1

    .line 658
    .line 659
    aget-short v4, v6, v20

    .line 660
    .line 661
    aput-short v4, v25, v2

    .line 662
    .line 663
    move/from16 v4, p0

    .line 664
    .line 665
    move/from16 v2, v18

    .line 666
    .line 667
    :goto_17
    add-int/lit8 v5, v1, 0x1

    .line 668
    .line 669
    aput-short v20, v25, v1

    .line 670
    .line 671
    add-int/lit8 v8, v1, 0x2

    .line 672
    .line 673
    aput-short v20, v25, v5

    .line 674
    .line 675
    add-int/lit8 v1, v1, 0x3

    .line 676
    .line 677
    add-int/lit8 v5, v2, 0x1

    .line 678
    .line 679
    aget-short v2, v6, v2

    .line 680
    .line 681
    aput-short v2, v25, v8

    .line 682
    .line 683
    add-int/lit8 v4, v4, -0x1

    .line 684
    .line 685
    if-gtz v4, :cond_26

    .line 686
    .line 687
    :goto_18
    add-int/lit8 v10, v10, 0x1

    .line 688
    .line 689
    const/4 v2, 0x4

    .line 690
    if-ge v10, v2, :cond_20

    .line 691
    .line 692
    add-int/lit8 v4, v1, 0x1

    .line 693
    .line 694
    aput-short v20, v25, v1

    .line 695
    .line 696
    move v1, v4

    .line 697
    goto :goto_18

    .line 698
    :cond_20
    aget-short v1, v12, v7

    .line 699
    .line 700
    aget-short v4, v13, v7

    .line 701
    .line 702
    const/16 v5, 0x78

    .line 703
    .line 704
    const/16 v6, 0x28

    .line 705
    .line 706
    if-lt v1, v6, :cond_21

    .line 707
    .line 708
    if-le v1, v5, :cond_22

    .line 709
    .line 710
    :cond_21
    iget-short v1, v0, La/miv;->d:S

    .line 711
    .line 712
    :cond_22
    iput-short v1, v0, La/miv;->d:S

    .line 713
    .line 714
    sget-object v8, La/oiv;->d:[S

    .line 715
    .line 716
    aget-short v4, v8, v4

    .line 717
    .line 718
    move/from16 v8, v20

    .line 719
    .line 720
    :goto_19
    if-ge v8, v6, :cond_23

    .line 721
    .line 722
    sub-int v10, v8, v1

    .line 723
    .line 724
    add-int/2addr v10, v5

    .line 725
    aget-short v10, v11, v10

    .line 726
    .line 727
    invoke-static {v4, v10}, La/obb;->i0(SS)S

    .line 728
    .line 729
    .line 730
    move-result v10

    .line 731
    add-int/lit8 v19, v8, 0x78

    .line 732
    .line 733
    aget-short v24, v25, v8

    .line 734
    .line 735
    add-int v24, v24, v10

    .line 736
    .line 737
    invoke-static/range {v24 .. v24}, La/obb;->k0(I)S

    .line 738
    .line 739
    .line 740
    move-result v10

    .line 741
    aput-short v10, v11, v19

    .line 742
    .line 743
    add-int/lit8 v8, v8, 0x1

    .line 744
    .line 745
    goto :goto_19

    .line 746
    :cond_23
    move/from16 v1, v20

    .line 747
    .line 748
    :goto_1a
    if-ge v1, v5, :cond_24

    .line 749
    .line 750
    add-int/lit8 v4, v1, 0x28

    .line 751
    .line 752
    aget-short v4, v11, v4

    .line 753
    .line 754
    aput-short v4, v11, v1

    .line 755
    .line 756
    add-int/lit8 v1, v1, 0x1

    .line 757
    .line 758
    goto :goto_1a

    .line 759
    :cond_24
    move/from16 v1, v20

    .line 760
    .line 761
    :goto_1b
    if-ge v1, v6, :cond_25

    .line 762
    .line 763
    mul-int/lit8 v4, v7, 0x28

    .line 764
    .line 765
    add-int/2addr v4, v1

    .line 766
    add-int/lit8 v5, v1, 0x78

    .line 767
    .line 768
    aget-short v5, v11, v5

    .line 769
    .line 770
    aput-short v5, v17, v4

    .line 771
    .line 772
    add-int/lit8 v1, v1, 0x1

    .line 773
    .line 774
    goto :goto_1b

    .line 775
    :cond_25
    add-int/lit8 v7, v7, 0x1

    .line 776
    .line 777
    move v6, v2

    .line 778
    move-object/from16 v2, v17

    .line 779
    .line 780
    move/from16 v5, v22

    .line 781
    .line 782
    move/from16 v4, v23

    .line 783
    .line 784
    move-object/from16 v1, v25

    .line 785
    .line 786
    goto/16 :goto_4

    .line 787
    .line 788
    :cond_26
    move v2, v5

    .line 789
    goto :goto_17

    .line 790
    :cond_27
    move-object/from16 v17, v2

    .line 791
    .line 792
    iget-object v2, v0, La/miv;->o:[S

    .line 793
    .line 794
    iget v1, v0, La/miv;->b:I

    .line 795
    .line 796
    xor-int/lit8 v3, v1, 0x1

    .line 797
    .line 798
    iput v3, v0, La/miv;->b:I

    .line 799
    .line 800
    iget-object v4, v0, La/miv;->c:[[S

    .line 801
    .line 802
    aget-object v7, v4, v1

    .line 803
    .line 804
    aget-object v8, v4, v3

    .line 805
    .line 806
    const/16 v1, 0xa0

    .line 807
    .line 808
    new-array v5, v1, [S

    .line 809
    .line 810
    invoke-static {v9, v7}, La/oiv;->e([S[S)V

    .line 811
    .line 812
    .line 813
    invoke-static {v8, v7, v2}, La/oiv;->b([S[S[S)V

    .line 814
    .line 815
    .line 816
    invoke-static {v2}, La/oiv;->a([S)V

    .line 817
    .line 818
    .line 819
    const/16 v3, 0xd

    .line 820
    .line 821
    const/4 v6, 0x0

    .line 822
    move-object v1, v0

    .line 823
    move-object/from16 v4, v17

    .line 824
    .line 825
    invoke-static/range {v1 .. v6}, La/oiv;->g(La/miv;[SI[S[SI)V

    .line 826
    .line 827
    .line 828
    invoke-static {v8, v7, v2}, La/oiv;->c([S[S[S)V

    .line 829
    .line 830
    .line 831
    invoke-static {v2}, La/oiv;->a([S)V

    .line 832
    .line 833
    .line 834
    const/16 v3, 0xe

    .line 835
    .line 836
    const/16 v6, 0xd

    .line 837
    .line 838
    invoke-static/range {v1 .. v6}, La/oiv;->g(La/miv;[SI[S[SI)V

    .line 839
    .line 840
    .line 841
    invoke-static {v8, v7, v2}, La/oiv;->d([S[S[S)V

    .line 842
    .line 843
    .line 844
    invoke-static {v2}, La/oiv;->a([S)V

    .line 845
    .line 846
    .line 847
    const/16 v3, 0xd

    .line 848
    .line 849
    const/16 v6, 0x1b

    .line 850
    .line 851
    invoke-static/range {v1 .. v6}, La/oiv;->g(La/miv;[SI[S[SI)V

    .line 852
    .line 853
    .line 854
    move/from16 v0, v20

    .line 855
    .line 856
    :goto_1c
    const/16 v3, 0x8

    .line 857
    .line 858
    if-ge v0, v3, :cond_28

    .line 859
    .line 860
    aget-short v3, v7, v0

    .line 861
    .line 862
    aput-short v3, v2, v0

    .line 863
    .line 864
    add-int/lit8 v0, v0, 0x1

    .line 865
    .line 866
    goto :goto_1c

    .line 867
    :cond_28
    invoke-static {v2}, La/oiv;->a([S)V

    .line 868
    .line 869
    .line 870
    const/16 v3, 0x78

    .line 871
    .line 872
    const/16 v6, 0x28

    .line 873
    .line 874
    invoke-static/range {v1 .. v6}, La/oiv;->g(La/miv;[SI[S[SI)V

    .line 875
    .line 876
    .line 877
    iget-short v0, v1, La/miv;->f:S

    .line 878
    .line 879
    move/from16 v7, v20

    .line 880
    .line 881
    const/16 v2, 0xa0

    .line 882
    .line 883
    :goto_1d
    if-ge v7, v2, :cond_29

    .line 884
    .line 885
    const/16 v3, 0x6e14

    .line 886
    .line 887
    invoke-static {v0, v3}, La/obb;->i0(SS)S

    .line 888
    .line 889
    .line 890
    move-result v0

    .line 891
    aget-short v3, v5, v20

    .line 892
    .line 893
    add-int/2addr v3, v0

    .line 894
    invoke-static {v3}, La/obb;->k0(I)S

    .line 895
    .line 896
    .line 897
    move-result v0

    .line 898
    add-int v3, v0, v0

    .line 899
    .line 900
    invoke-static {v3}, La/obb;->k0(I)S

    .line 901
    .line 902
    .line 903
    move-result v3

    .line 904
    const v4, 0xfff8

    .line 905
    .line 906
    .line 907
    and-int/2addr v3, v4

    .line 908
    int-to-short v3, v3

    .line 909
    aput-short v3, v5, v20

    .line 910
    .line 911
    add-int/lit8 v20, v20, 0x1

    .line 912
    .line 913
    add-int/lit8 v7, v7, 0x1

    .line 914
    .line 915
    goto :goto_1d

    .line 916
    :cond_29
    iput-short v0, v1, La/miv;->f:S

    .line 917
    .line 918
    return-object v5
.end method

.method public final d(ILa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/tn30;->h:La/sje;

    .line 2
    .line 3
    instance-of v1, p2, La/rn30;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, p2

    .line 8
    check-cast v1, La/rn30;

    .line 9
    .line 10
    iget v2, v1, La/rn30;->n:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/rn30;->n:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, La/rn30;

    .line 23
    .line 24
    invoke-direct {v1, p0, p2}, La/rn30;-><init>(La/tn30;La/zje;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p2, v1, La/rn30;->l:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v2, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v3, v1, La/rn30;->n:I

    .line 32
    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v10, 0x0

    .line 36
    if-eqz v3, :cond_3

    .line 37
    .line 38
    if-eq v3, v5, :cond_2

    .line 39
    .line 40
    if-ne v3, v4, :cond_1

    .line 41
    .line 42
    iget-object p1, v1, La/rn30;->j:La/i050;

    .line 43
    .line 44
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :catchall_0
    move-exception v0

    .line 50
    move-object p0, v0

    .line 51
    goto/16 :goto_5

    .line 52
    .line 53
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    return-object p0

    .line 60
    :cond_2
    iget p1, v1, La/rn30;->k:I

    .line 61
    .line 62
    iget-object p3, v1, La/rn30;->j:La/i050;

    .line 63
    .line 64
    iget-object v3, v1, La/rn30;->i:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    move-object p2, p3

    .line 70
    move-object p3, v3

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    if-gtz p1, :cond_4

    .line 76
    .line 77
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_4
    iput-object p3, v1, La/rn30;->i:Ljava/lang/String;

    .line 81
    .line 82
    iget-object p2, p0, La/tn30;->i:La/k050;

    .line 83
    .line 84
    iput-object p2, v1, La/rn30;->j:La/i050;

    .line 85
    .line 86
    iput p1, v1, La/rn30;->k:I

    .line 87
    .line 88
    iput v5, v1, La/rn30;->n:I

    .line 89
    .line 90
    invoke-virtual {p2, v1}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-ne v3, v2, :cond_5

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    :goto_1
    :try_start_1
    invoke-virtual {p0}, La/tn30;->b()V

    .line 98
    .line 99
    .line 100
    iget-object v3, p0, La/tn30;->f:La/oiv;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v5, La/niv;

    .line 106
    .line 107
    invoke-direct {v5}, La/niv;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-object v5, v3, La/oiv;->a:La/niv;

    .line 111
    .line 112
    new-instance v5, La/miv;

    .line 113
    .line 114
    invoke-direct {v5}, La/miv;-><init>()V

    .line 115
    .line 116
    .line 117
    iput-object v5, v3, La/oiv;->b:La/miv;

    .line 118
    .line 119
    iget-object v3, p0, La/tn30;->a:La/ukg0;

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    if-nez v5, :cond_6

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_6
    if-gtz p1, :cond_7

    .line 135
    .line 136
    goto :goto_2

    .line 137
    :cond_7
    iget-object v5, v3, La/ukg0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 138
    .line 139
    invoke-virtual {v5, v10}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    iget-object v3, v3, La/ukg0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 143
    .line 144
    new-instance v5, Ljava/net/InetSocketAddress;

    .line 145
    .line 146
    invoke-direct {v5, p3, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    :goto_2
    iget-object p3, p0, La/tn30;->d:La/o34;

    .line 153
    .line 154
    iput-object v10, v1, La/rn30;->i:Ljava/lang/String;

    .line 155
    .line 156
    iput-object p2, v1, La/rn30;->j:La/i050;

    .line 157
    .line 158
    iput p1, v1, La/rn30;->k:I

    .line 159
    .line 160
    iput v4, v1, La/rn30;->n:I

    .line 161
    .line 162
    invoke-virtual {p3, v1}, La/o34;->a(La/zje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 166
    if-ne p1, v2, :cond_8

    .line 167
    .line 168
    :goto_3
    return-object v2

    .line 169
    :cond_8
    move-object p1, p2

    .line 170
    :goto_4
    :try_start_2
    iget-object p2, p0, La/tn30;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 171
    .line 172
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    const/4 p3, -0x1

    .line 177
    if-eq p2, p3, :cond_9

    .line 178
    .line 179
    iget-object p3, p0, La/tn30;->b:La/skg0;

    .line 180
    .line 181
    int-to-byte p2, p2

    .line 182
    iget-object p3, p3, La/skg0;->d:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 183
    .line 184
    invoke-virtual {p3, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 185
    .line 186
    .line 187
    :cond_9
    const/16 p2, 0xa

    .line 188
    .line 189
    const/4 p3, 0x6

    .line 190
    invoke-static {p2, v10, v10, p3}, La/vtb;->d(ILa/i99;Lkotlin/jvm/functions/Function1;I)La/q99;

    .line 191
    .line 192
    .line 193
    move-result-object v9

    .line 194
    iput-object v9, p0, La/tn30;->m:La/q99;

    .line 195
    .line 196
    new-instance p2, La/mt00;

    .line 197
    .line 198
    const/16 p3, 0x14

    .line 199
    .line 200
    invoke-direct {p2, v9, p0, v10, p3}, La/mt00;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 201
    .line 202
    .line 203
    const/4 p3, 0x3

    .line 204
    invoke-static {v0, v10, v10, p2, p3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    iput-object p2, p0, La/tn30;->n:La/c4m0;

    .line 209
    .line 210
    iget-object p2, p0, La/tn30;->c:La/v34;

    .line 211
    .line 212
    invoke-virtual {p2}, La/v34;->a()La/q99;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    new-instance v6, La/o3s;

    .line 217
    .line 218
    const/16 v11, 0x13

    .line 219
    .line 220
    move-object v8, p0

    .line 221
    invoke-direct/range {v6 .. v11}, La/o3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 222
    .line 223
    .line 224
    move-object v7, v8

    .line 225
    invoke-static {v0, v10, v10, v6, p3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    iput-object p0, v7, La/tn30;->j:La/c4m0;

    .line 230
    .line 231
    new-instance v8, La/tyc;

    .line 232
    .line 233
    invoke-direct {v8, v4}, La/tyc;-><init>(B)V

    .line 234
    .line 235
    .line 236
    new-instance p0, La/ah80;

    .line 237
    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    .line 240
    .line 241
    iput-object v8, v7, La/tn30;->o:La/tyc;

    .line 242
    .line 243
    iput-object p0, v7, La/tn30;->p:La/ah80;

    .line 244
    .line 245
    new-instance v9, La/lie0;

    .line 246
    .line 247
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 248
    .line 249
    .line 250
    new-instance v6, La/o3s;

    .line 251
    .line 252
    const/16 v11, 0x14

    .line 253
    .line 254
    invoke-direct/range {v6 .. v11}, La/o3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 255
    .line 256
    .line 257
    invoke-static {v0, v10, v10, v6, p3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    iput-object p2, v7, La/tn30;->k:La/c4m0;

    .line 262
    .line 263
    new-instance p2, La/ze1;

    .line 264
    .line 265
    invoke-direct {p2, v8, p0, v7, v10}, La/ze1;-><init>(La/tyc;La/ah80;La/tn30;La/yje;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v0, v10, v10, p2, p3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    iput-object p0, v7, La/tn30;->l:La/c4m0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 273
    .line 274
    invoke-interface {p1, v10}, La/i050;->c(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object p0

    .line 280
    :catchall_1
    move-exception v0

    .line 281
    move-object p0, v0

    .line 282
    move-object p1, p2

    .line 283
    :goto_5
    invoke-interface {p1, v10}, La/i050;->c(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    throw p0
.end method

.method public final e(La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, La/sn30;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/sn30;

    .line 7
    .line 8
    iget v1, v0, La/sn30;->l:I

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
    iput v1, v0, La/sn30;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/sn30;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/sn30;-><init>(La/tn30;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/sn30;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/sn30;->l:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x1

    .line 35
    const/4 v7, 0x0

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v6, :cond_3

    .line 39
    .line 40
    if-eq v2, v4, :cond_2

    .line 41
    .line 42
    if-ne v2, v3, :cond_1

    .line 43
    .line 44
    iget-object v0, v0, La/sn30;->i:La/i050;

    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :catchall_0
    move-exception p0

    .line 52
    goto/16 :goto_7

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
    return-object v7

    .line 60
    :cond_2
    iget-object v2, v0, La/sn30;->i:La/i050;

    .line 61
    .line 62
    :try_start_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    .line 65
    move-object p1, v2

    .line 66
    goto :goto_3

    .line 67
    :catchall_1
    move-exception p0

    .line 68
    move-object v0, v2

    .line 69
    goto/16 :goto_7

    .line 70
    .line 71
    :cond_3
    iget-object v2, v0, La/sn30;->i:La/i050;

    .line 72
    .line 73
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object p1, v2

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, La/tn30;->i:La/k050;

    .line 82
    .line 83
    iput-object p1, v0, La/sn30;->i:La/i050;

    .line 84
    .line 85
    iput v6, v0, La/sn30;->l:I

    .line 86
    .line 87
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-ne v2, v1, :cond_5

    .line 92
    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_5
    :goto_1
    :try_start_2
    iget-object v2, p0, La/tn30;->j:La/c4m0;

    .line 96
    .line 97
    if-eqz v2, :cond_6

    .line 98
    .line 99
    invoke-virtual {v2, v7}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :catchall_2
    move-exception p0

    .line 104
    move-object v0, p1

    .line 105
    goto/16 :goto_7

    .line 106
    .line 107
    :cond_6
    :goto_2
    iput-object v7, p0, La/tn30;->j:La/c4m0;

    .line 108
    .line 109
    iget-object v2, p0, La/tn30;->n:La/c4m0;

    .line 110
    .line 111
    if-eqz v2, :cond_7

    .line 112
    .line 113
    invoke-virtual {v2, v7}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 114
    .line 115
    .line 116
    :cond_7
    iput-object v7, p0, La/tn30;->n:La/c4m0;

    .line 117
    .line 118
    iget-object v2, p0, La/tn30;->m:La/q99;

    .line 119
    .line 120
    if-eqz v2, :cond_8

    .line 121
    .line 122
    invoke-virtual {v2, v7}, La/q99;->d(Ljava/lang/Throwable;)Z

    .line 123
    .line 124
    .line 125
    :cond_8
    iput-object v7, p0, La/tn30;->m:La/q99;

    .line 126
    .line 127
    iget-object v2, p0, La/tn30;->k:La/c4m0;

    .line 128
    .line 129
    if-eqz v2, :cond_9

    .line 130
    .line 131
    invoke-virtual {v2, v7}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 132
    .line 133
    .line 134
    :cond_9
    iput-object v7, p0, La/tn30;->k:La/c4m0;

    .line 135
    .line 136
    iget-object v2, p0, La/tn30;->l:La/c4m0;

    .line 137
    .line 138
    if-eqz v2, :cond_a

    .line 139
    .line 140
    invoke-virtual {v2, v7}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 141
    .line 142
    .line 143
    :cond_a
    iput-object v7, p0, La/tn30;->l:La/c4m0;

    .line 144
    .line 145
    iget-object v2, p0, La/tn30;->c:La/v34;

    .line 146
    .line 147
    invoke-virtual {v2}, La/v34;->b()V

    .line 148
    .line 149
    .line 150
    iget-object v2, p0, La/tn30;->d:La/o34;

    .line 151
    .line 152
    iput-object p1, v0, La/sn30;->i:La/i050;

    .line 153
    .line 154
    iput v4, v0, La/sn30;->l:I

    .line 155
    .line 156
    invoke-virtual {v2, v0}, La/o34;->b(La/zje;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    if-ne v2, v1, :cond_b

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_b
    :goto_3
    iget-object v2, p0, La/tn30;->e:La/u24;

    .line 164
    .line 165
    iget-object v4, v2, La/u24;->a:Landroid/media/AudioManager;

    .line 166
    .line 167
    iget-object v6, v2, La/u24;->b:Landroid/media/AudioFocusRequest;

    .line 168
    .line 169
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 170
    .line 171
    const/16 v9, 0x1a

    .line 172
    .line 173
    if-lt v8, v9, :cond_c

    .line 174
    .line 175
    if-eqz v6, :cond_c

    .line 176
    .line 177
    invoke-static {v4, v6}, La/y6;->p(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)V

    .line 178
    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_c
    invoke-virtual {v4, v7}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    .line 182
    .line 183
    .line 184
    :goto_4
    iput-object v7, v2, La/u24;->b:Landroid/media/AudioFocusRequest;

    .line 185
    .line 186
    invoke-virtual {v4, v5}, Landroid/media/AudioManager;->setMode(I)V

    .line 187
    .line 188
    .line 189
    iget-object v2, p0, La/tn30;->b:La/skg0;

    .line 190
    .line 191
    iput v5, v2, La/skg0;->a:I

    .line 192
    .line 193
    iput v5, v2, La/skg0;->b:I

    .line 194
    .line 195
    iget-object v2, p0, La/tn30;->o:La/tyc;

    .line 196
    .line 197
    if-eqz v2, :cond_d

    .line 198
    .line 199
    iput-object p1, v0, La/sn30;->i:La/i050;

    .line 200
    .line 201
    iput v3, v0, La/sn30;->l:I

    .line 202
    .line 203
    invoke-virtual {v2, v0}, La/tyc;->e0(La/zje;)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 207
    if-ne v0, v1, :cond_d

    .line 208
    .line 209
    :goto_5
    return-object v1

    .line 210
    :cond_d
    move-object v0, p1

    .line 211
    :goto_6
    :try_start_3
    iput-object v7, p0, La/tn30;->o:La/tyc;

    .line 212
    .line 213
    iget-object p1, p0, La/tn30;->p:La/ah80;

    .line 214
    .line 215
    if-eqz p1, :cond_e

    .line 216
    .line 217
    iput-object v7, p1, La/ah80;->a:[B

    .line 218
    .line 219
    iput v5, p1, La/ah80;->b:I

    .line 220
    .line 221
    :cond_e
    iput-object v7, p0, La/tn30;->p:La/ah80;

    .line 222
    .line 223
    iget-object p1, p0, La/tn30;->q:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 224
    .line 225
    const/4 v1, -0x1

    .line 226
    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 227
    .line 228
    .line 229
    iget-object p0, p0, La/tn30;->a:La/ukg0;

    .line 230
    .line 231
    iget-object p1, p0, La/ukg0;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 232
    .line 233
    invoke-virtual {p1, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    iget-object p1, p0, La/ukg0;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 237
    .line 238
    invoke-virtual {p1, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    iget-object p0, p0, La/ukg0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 242
    .line 243
    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    check-cast p0, Ljava/net/DatagramSocket;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 248
    .line 249
    if-eqz p0, :cond_f

    .line 250
    .line 251
    :try_start_4
    invoke-virtual {p0}, Ljava/net/DatagramSocket;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 252
    .line 253
    .line 254
    :catch_0
    :cond_f
    invoke-interface {v0, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object p0

    .line 260
    :goto_7
    invoke-interface {v0, v7}, La/i050;->c(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    throw p0
.end method
