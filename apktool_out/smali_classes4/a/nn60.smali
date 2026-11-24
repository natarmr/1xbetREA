.class public final La/nn60;
.super La/x2t0;
.source "SourceFile"


# instance fields
.field public final h:La/mne;

.field public final i:La/ls;

.field public final j:La/p4u;

.field public final k:La/duj;

.field public final l:La/oeg0;

.field public final m:La/hs60;

.field public final n:La/iqt;

.field public final o:La/dcu;

.field public final p:La/as;

.field public final q:La/as;

.field public final r:La/z4u;

.field public final s:La/gw60;

.field public final t:La/pru;

.field public final u:La/hnu;

.field public final v:La/ctf0;

.field public final w:La/uxs0;

.field public x:La/bmr;

.field public y:Z


# direct methods
.method public constructor <init>(La/mne;La/ls;La/p4u;La/duj;La/oeg0;La/hs60;La/iqt;La/dcu;La/as;La/as;La/z4u;La/gw60;La/pru;La/hnu;La/ctf0;La/uxs0;)V
    .locals 2

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p15 .. p15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/th50;

    .line 8
    .line 9
    const/16 v1, 0x1b

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/th50;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v0}, La/x2t0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, La/nn60;->h:La/mne;

    .line 18
    .line 19
    iput-object p2, p0, La/nn60;->i:La/ls;

    .line 20
    .line 21
    iput-object p3, p0, La/nn60;->j:La/p4u;

    .line 22
    .line 23
    iput-object p4, p0, La/nn60;->k:La/duj;

    .line 24
    .line 25
    iput-object p5, p0, La/nn60;->l:La/oeg0;

    .line 26
    .line 27
    iput-object p6, p0, La/nn60;->m:La/hs60;

    .line 28
    .line 29
    iput-object p7, p0, La/nn60;->n:La/iqt;

    .line 30
    .line 31
    iput-object p8, p0, La/nn60;->o:La/dcu;

    .line 32
    .line 33
    iput-object p9, p0, La/nn60;->p:La/as;

    .line 34
    .line 35
    iput-object p10, p0, La/nn60;->q:La/as;

    .line 36
    .line 37
    iput-object p11, p0, La/nn60;->r:La/z4u;

    .line 38
    .line 39
    iput-object p12, p0, La/nn60;->s:La/gw60;

    .line 40
    .line 41
    iput-object p13, p0, La/nn60;->t:La/pru;

    .line 42
    .line 43
    move-object/from16 p1, p14

    .line 44
    .line 45
    iput-object p1, p0, La/nn60;->u:La/hnu;

    .line 46
    .line 47
    move-object/from16 p1, p15

    .line 48
    .line 49
    iput-object p1, p0, La/nn60;->v:La/ctf0;

    .line 50
    .line 51
    move-object/from16 p1, p16

    .line 52
    .line 53
    iput-object p1, p0, La/nn60;->w:La/uxs0;

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, La/en60;

    .line 2
    .line 3
    sget-object v0, La/vm60;->a:La/vm60;

    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, La/x2t0;->e()V

    .line 12
    .line 13
    .line 14
    goto/16 :goto_1

    .line 15
    .line 16
    :cond_0
    instance-of v0, p1, La/wm60;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x0

    .line 20
    iget-object v3, p0, La/x2t0;->b:La/ocj;

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 28
    .line 29
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    move-object p2, p0

    .line 34
    check-cast p2, La/un60;

    .line 35
    .line 36
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-object v3, p1

    .line 40
    check-cast v3, La/wm60;

    .line 41
    .line 42
    iget-object v3, v3, La/wm60;->a:La/zn60;

    .line 43
    .line 44
    const/16 v4, 0xe

    .line 45
    .line 46
    invoke-static {p2, v3, v2, v1, v4}, La/un60;->a(La/un60;La/zn60;ZLjava/util/ArrayList;I)La/un60;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {v0, p0, p2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_2
    instance-of v0, p1, La/ym60;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    check-cast p1, La/ym60;

    .line 63
    .line 64
    iget-object p1, p1, La/ym60;->a:La/pbv;

    .line 65
    .line 66
    iget-wide v0, p1, La/pbv;->a:J

    .line 67
    .line 68
    iget-object p2, p0, La/nn60;->u:La/hnu;

    .line 69
    .line 70
    invoke-virtual {p2}, La/hnu;->b()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    invoke-virtual {p0}, La/x2t0;->d()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    check-cast v2, La/un60;

    .line 79
    .line 80
    iget-object v2, v2, La/un60;->c:Ljava/util/List;

    .line 81
    .line 82
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    sget-object v3, La/pn60;->a:La/pn60;

    .line 91
    .line 92
    invoke-virtual {p0, v3}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v3, La/bmr;

    .line 96
    .line 97
    iget-object v4, p1, La/pbv;->n:La/hds;

    .line 98
    .line 99
    iget-object v4, v4, La/hds;->a:Ljava/lang/String;

    .line 100
    .line 101
    iget-object p1, p1, La/pbv;->c:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-boolean v2, v3, La/bmr;->a:Z

    .line 113
    .line 114
    iput-wide v0, v3, La/bmr;->b:J

    .line 115
    .line 116
    iput-object v4, v3, La/bmr;->c:Ljava/lang/String;

    .line 117
    .line 118
    iput-object p1, v3, La/bmr;->d:Ljava/lang/String;

    .line 119
    .line 120
    iput p2, v3, La/bmr;->e:I

    .line 121
    .line 122
    iput-object v3, p0, La/nn60;->x:La/bmr;

    .line 123
    .line 124
    new-instance p1, La/rn60;

    .line 125
    .line 126
    iget-object p2, p0, La/nn60;->t:La/pru;

    .line 127
    .line 128
    invoke-virtual {p2}, La/pru;->a()La/sff0;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    iget-object p2, p2, La/sff0;->d:La/q1w0;

    .line 133
    .line 134
    iget-object p2, p2, La/q1w0;->a:La/dyv0;

    .line 135
    .line 136
    iget-boolean p2, p2, La/dyv0;->d:Z

    .line 137
    .line 138
    invoke-direct {p1, v2, p2}, La/rn60;-><init>(ZZ)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto/16 :goto_1

    .line 145
    .line 146
    :cond_3
    instance-of v0, p1, La/zm60;

    .line 147
    .line 148
    if-eqz v0, :cond_8

    .line 149
    .line 150
    check-cast p1, La/zm60;

    .line 151
    .line 152
    iget-wide v0, p1, La/zm60;->a:J

    .line 153
    .line 154
    iget-boolean v2, p1, La/zm60;->b:Z

    .line 155
    .line 156
    iget p1, p1, La/zm60;->c:I

    .line 157
    .line 158
    if-eqz v2, :cond_5

    .line 159
    .line 160
    invoke-virtual {p0, p1, v0, v1, p2}, La/nn60;->i(IJLa/zje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    sget-object p1, La/wne;->a:La/wne;

    .line 165
    .line 166
    if-ne p0, p1, :cond_4

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    goto :goto_0

    .line 172
    :cond_5
    invoke-virtual {p0, p1, v0, v1, p2}, La/nn60;->p(IJLa/zje;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    sget-object p1, La/wne;->a:La/wne;

    .line 177
    .line 178
    if-ne p0, p1, :cond_6

    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    :goto_0
    if-ne p0, p1, :cond_7

    .line 184
    .line 185
    return-object p0

    .line 186
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object p0

    .line 189
    :cond_8
    instance-of v0, p1, La/an60;

    .line 190
    .line 191
    if-eqz v0, :cond_a

    .line 192
    .line 193
    const/4 p1, -0x1

    .line 194
    invoke-virtual {p0, p1, p2}, La/nn60;->l(ILa/zje;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    sget-object p1, La/wne;->a:La/wne;

    .line 199
    .line 200
    if-ne p0, p1, :cond_9

    .line 201
    .line 202
    return-object p0

    .line 203
    :cond_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object p0

    .line 206
    :cond_a
    instance-of v0, p1, La/bn60;

    .line 207
    .line 208
    if-eqz v0, :cond_c

    .line 209
    .line 210
    check-cast p1, La/bn60;

    .line 211
    .line 212
    iget-object v0, p1, La/bn60;->a:La/pbv;

    .line 213
    .line 214
    iget-object v1, p1, La/bn60;->b:Ljava/lang/String;

    .line 215
    .line 216
    iget p1, p1, La/bn60;->c:I

    .line 217
    .line 218
    invoke-virtual {p0, v0, v1, p1, p2}, La/nn60;->m(La/pbv;Ljava/lang/String;ILa/zje;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    sget-object p1, La/wne;->a:La/wne;

    .line 223
    .line 224
    if-ne p0, p1, :cond_b

    .line 225
    .line 226
    return-object p0

    .line 227
    :cond_b
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    return-object p0

    .line 230
    :cond_c
    instance-of v0, p1, La/cn60;

    .line 231
    .line 232
    if-eqz v0, :cond_e

    .line 233
    .line 234
    check-cast p1, La/cn60;

    .line 235
    .line 236
    invoke-virtual {p0, p1, p2}, La/nn60;->j(La/cn60;La/zje;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    sget-object p1, La/wne;->a:La/wne;

    .line 241
    .line 242
    if-ne p0, p1, :cond_d

    .line 243
    .line 244
    return-object p0

    .line 245
    :cond_d
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object p0

    .line 248
    :cond_e
    instance-of p0, p1, La/xm60;

    .line 249
    .line 250
    if-eqz p0, :cond_10

    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    iget-object p0, v3, La/ocj;->a:La/p7m0;

    .line 256
    .line 257
    :cond_f
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object p2

    .line 261
    move-object v0, p2

    .line 262
    check-cast v0, La/un60;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    move-object v3, p1

    .line 268
    check-cast v3, La/xm60;

    .line 269
    .line 270
    iget-object v3, v3, La/xm60;->a:Ljava/util/ArrayList;

    .line 271
    .line 272
    const/4 v4, 0x7

    .line 273
    invoke-static {v0, v1, v2, v3, v4}, La/un60;->a(La/un60;La/zn60;ZLjava/util/ArrayList;I)La/un60;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {p0, p2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result p2

    .line 281
    if-eqz p2, :cond_f

    .line 282
    .line 283
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object p0

    .line 286
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 287
    .line 288
    .line 289
    return-object v1
.end method

.method public final i(IJLa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, La/fn60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/fn60;

    .line 7
    .line 8
    iget v1, v0, La/fn60;->k:I

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
    iput v1, v0, La/fn60;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/fn60;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/fn60;-><init>(La/nn60;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/fn60;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/fn60;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    const/4 v2, -0x1

    .line 58
    if-eq p1, v2, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move-object p4, v3

    .line 62
    :goto_1
    if-eqz p4, :cond_4

    .line 63
    .line 64
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    iget-object p1, p0, La/nn60;->x:La/bmr;

    .line 70
    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    iget p1, p1, La/bmr;->e:I

    .line 74
    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :cond_5
    if-eqz v3, :cond_6

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    :cond_6
    :goto_2
    iget-object p1, p0, La/nn60;->m:La/hs60;

    .line 86
    .line 87
    iget-object p1, p1, La/hs60;->a:La/kt2;

    .line 88
    .line 89
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    new-instance v3, Lkotlin/Pair;

    .line 94
    .line 95
    const-string v5, "game_id"

    .line 96
    .line 97
    invoke-direct {v3, v5, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance p4, Lkotlin/Pair;

    .line 101
    .line 102
    const-string v5, "action"

    .line 103
    .line 104
    const-string v6, "add_favor"

    .line 105
    .line 106
    invoke-direct {p4, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    new-instance v7, Lkotlin/Pair;

    .line 114
    .line 115
    const-string v8, "filter"

    .line 116
    .line 117
    invoke-direct {v7, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    filled-new-array {v3, p4, v7}, [Lkotlin/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    invoke-static {p4}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object p4

    .line 128
    const-string v3, "game_favor_games_add"

    .line 129
    .line 130
    invoke-interface {p1, v3, p4}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, La/nn60;->s:La/gw60;

    .line 134
    .line 135
    long-to-int p4, p2

    .line 136
    invoke-virtual {p1, p4, v2, v6}, La/gw60;->a(IILjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :try_start_1
    iget-object p1, p0, La/nn60;->p:La/as;

    .line 140
    .line 141
    iput v4, v0, La/fn60;->k:I

    .line 142
    .line 143
    invoke-virtual {p1, p2, p3, v0}, La/as;->a(JLa/zje;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 147
    if-ne p0, v1, :cond_9

    .line 148
    .line 149
    return-object v1

    .line 150
    :goto_3
    instance-of p2, p1, Ljava/net/SocketTimeoutException;

    .line 151
    .line 152
    if-eqz p2, :cond_7

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    instance-of p2, p1, Ljava/net/UnknownHostException;

    .line 156
    .line 157
    if-eqz p2, :cond_8

    .line 158
    .line 159
    :goto_4
    sget-object p1, La/on60;->a:La/on60;

    .line 160
    .line 161
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_8
    new-instance p2, La/pi40;

    .line 166
    .line 167
    const/16 p3, 0x1c

    .line 168
    .line 169
    invoke-direct {p2, p0, p3}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 170
    .line 171
    .line 172
    iget-object p0, p0, La/nn60;->k:La/duj;

    .line 173
    .line 174
    invoke-virtual {p0, p1, p2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    :cond_9
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0
.end method

.method public final j(La/cn60;La/zje;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p2, La/gn60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/gn60;

    .line 7
    .line 8
    iget v1, v0, La/gn60;->k:I

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
    iput v1, v0, La/gn60;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/gn60;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/gn60;-><init>(La/nn60;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/gn60;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/gn60;->k:I

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
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    move-object v7, p0

    .line 40
    goto :goto_3

    .line 41
    :catch_0
    move-exception v0

    .line 42
    move-object p1, v0

    .line 43
    move-object v7, p0

    .line 44
    goto :goto_2

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
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    iget-object p2, p1, La/cn60;->a:La/pbv;

    .line 56
    .line 57
    iget-boolean v2, p2, La/pbv;->p:Z

    .line 58
    .line 59
    if-eqz v2, :cond_3

    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_3
    sget-object v2, La/a570;->Companion:La/t470;

    .line 65
    .line 66
    iget-wide v4, p2, La/pbv;->a:J

    .line 67
    .line 68
    iget-boolean p2, p2, La/pbv;->k:Z

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {p2, v4, v5}, La/t470;->a(ZJ)La/a570;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    sget-object p2, La/pn60;->a:La/pn60;

    .line 78
    .line 79
    invoke-virtual {p0, p2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v8}, La/x1x;->D(La/a570;)J

    .line 83
    .line 84
    .line 85
    move-result-wide v9

    .line 86
    :try_start_1
    iget-object p2, p0, La/nn60;->h:La/mne;

    .line 87
    .line 88
    iget-object p2, p2, La/mne;->c:La/vs10;

    .line 89
    .line 90
    new-instance v6, La/fl3;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 91
    .line 92
    const/4 v12, 0x0

    .line 93
    move-object v7, p0

    .line 94
    move-object v11, p1

    .line 95
    :try_start_2
    invoke-direct/range {v6 .. v12}, La/fl3;-><init>(La/nn60;La/a570;JLa/cn60;La/yje;)V

    .line 96
    .line 97
    .line 98
    iput v3, v0, La/gn60;->k:I

    .line 99
    .line 100
    invoke-static {p2, v6, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 104
    if-ne p0, v1, :cond_4

    .line 105
    .line 106
    return-object v1

    .line 107
    :catch_1
    move-exception v0

    .line 108
    :goto_1
    move-object p1, v0

    .line 109
    goto :goto_2

    .line 110
    :catch_2
    move-exception v0

    .line 111
    move-object v7, p0

    .line 112
    goto :goto_1

    .line 113
    :goto_2
    new-instance p0, La/pi40;

    .line 114
    .line 115
    const/16 p2, 0x1d

    .line 116
    .line 117
    invoke-direct {p0, p1, p2}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 118
    .line 119
    .line 120
    iget-object p2, v7, La/nn60;->k:La/duj;

    .line 121
    .line 122
    invoke-virtual {p2, p1, p0}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    :cond_4
    :goto_3
    const/4 p0, 0x0

    .line 126
    iput-boolean p0, v7, La/nn60;->y:Z

    .line 127
    .line 128
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object p0
.end method

.method public final k(La/i1w0;La/a570;JLjava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p6, La/hn60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/hn60;

    .line 7
    .line 8
    iget v1, v0, La/hn60;->m:I

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
    iput v1, v0, La/hn60;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hn60;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/hn60;-><init>(La/nn60;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/hn60;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/hn60;->m:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x0

    .line 35
    if-eqz v2, :cond_4

    .line 36
    .line 37
    if-eq v2, v5, :cond_3

    .line 38
    .line 39
    if-eq v2, v4, :cond_2

    .line 40
    .line 41
    if-ne v2, v3, :cond_1

    .line 42
    .line 43
    :try_start_0
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    .line 46
    goto/16 :goto_6

    .line 47
    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v6

    .line 57
    :cond_2
    iget-wide p3, v0, La/hn60;->j:J

    .line 58
    .line 59
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_3
    iget-wide p3, v0, La/hn60;->j:J

    .line 65
    .line 66
    iget-object p1, v0, La/hn60;->i:La/i1w0;

    .line 67
    .line 68
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    if-eqz p2, :cond_9

    .line 76
    .line 77
    instance-of p6, p2, La/w470;

    .line 78
    .line 79
    if-eqz p6, :cond_6

    .line 80
    .line 81
    invoke-static {p2}, La/x1x;->D(La/a570;)J

    .line 82
    .line 83
    .line 84
    move-result-wide p5

    .line 85
    iput-object p1, v0, La/hn60;->i:La/i1w0;

    .line 86
    .line 87
    iput-wide p3, v0, La/hn60;->j:J

    .line 88
    .line 89
    iput v5, v0, La/hn60;->m:I

    .line 90
    .line 91
    iget-object p2, p0, La/nn60;->r:La/z4u;

    .line 92
    .line 93
    invoke-virtual {p2, p5, p6, v0}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p6

    .line 97
    if-ne p6, v1, :cond_5

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_5
    :goto_1
    check-cast p6, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {p6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result p2

    .line 106
    xor-int/2addr p2, v5

    .line 107
    const/4 p5, 0x6

    .line 108
    invoke-static {p5, p3, p4, v6}, La/jtv;->M0(IJLa/csr;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 109
    .line 110
    .line 111
    move-result-object p5

    .line 112
    if-eqz p5, :cond_7

    .line 113
    .line 114
    invoke-static {p1, p1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 115
    .line 116
    .line 117
    move-result-object p6

    .line 118
    invoke-virtual {p6, p5}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 119
    .line 120
    .line 121
    move-result-object p5

    .line 122
    iget-object p5, p5, La/ikt0;->a:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p5, La/c8d;

    .line 125
    .line 126
    sget-object v2, La/cfx0;->o:La/bjk;

    .line 127
    .line 128
    new-instance v4, La/v7d;

    .line 129
    .line 130
    invoke-direct {v4, p2, v2, v2}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 131
    .line 132
    .line 133
    iput-object v4, p5, La/c8d;->a:La/w7d;

    .line 134
    .line 135
    iget-object p2, p6, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 136
    .line 137
    const/4 p5, 0x0

    .line 138
    invoke-static {p1, p2, p5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    :goto_2
    move-object p5, p2

    .line 143
    check-cast p5, La/paw;

    .line 144
    .line 145
    invoke-virtual {p5}, La/paw;->hasNext()Z

    .line 146
    .line 147
    .line 148
    move-result p6

    .line 149
    if-eqz p6, :cond_7

    .line 150
    .line 151
    invoke-virtual {p5}, La/paw;->next()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p5

    .line 155
    check-cast p5, La/oe50;

    .line 156
    .line 157
    invoke-virtual {p1, p5}, La/i1w0;->a(La/oe50;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_6
    instance-of p1, p2, La/z470;

    .line 162
    .line 163
    if-eqz p1, :cond_9

    .line 164
    .line 165
    check-cast p2, La/z470;

    .line 166
    .line 167
    iput-object v6, v0, La/hn60;->i:La/i1w0;

    .line 168
    .line 169
    iput-wide p3, v0, La/hn60;->j:J

    .line 170
    .line 171
    iput v4, v0, La/hn60;->m:I

    .line 172
    .line 173
    invoke-virtual {p0, p2, p5, v0}, La/nn60;->n(La/z470;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    if-ne p1, v1, :cond_7

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_7
    :goto_3
    :try_start_1
    iget-object p1, p0, La/nn60;->i:La/ls;

    .line 181
    .line 182
    iput-object v6, v0, La/hn60;->i:La/i1w0;

    .line 183
    .line 184
    iput-wide p3, v0, La/hn60;->j:J

    .line 185
    .line 186
    iput v3, v0, La/hn60;->m:I

    .line 187
    .line 188
    invoke-virtual {p1, p3, p4, v0}, La/ls;->b(JLa/yje;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 192
    if-ne p0, v1, :cond_8

    .line 193
    .line 194
    :goto_4
    return-object v1

    .line 195
    :goto_5
    iget-object p0, p0, La/nn60;->k:La/duj;

    .line 196
    .line 197
    invoke-virtual {p0, p1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 198
    .line 199
    .line 200
    :cond_8
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object p0

    .line 203
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 204
    .line 205
    .line 206
    return-object v6
.end method

.method public final l(ILa/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, La/in60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/in60;

    .line 7
    .line 8
    iget v1, v0, La/in60;->k:I

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
    iput v1, v0, La/in60;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/in60;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/in60;-><init>(La/nn60;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/in60;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/in60;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p2, p0, La/nn60;->x:La/bmr;

    .line 51
    .line 52
    if-eqz p2, :cond_6

    .line 53
    .line 54
    iget-wide v5, p2, La/bmr;->b:J

    .line 55
    .line 56
    iget-boolean p2, p2, La/bmr;->a:Z

    .line 57
    .line 58
    iput v4, v0, La/in60;->k:I

    .line 59
    .line 60
    if-nez p2, :cond_4

    .line 61
    .line 62
    invoke-virtual {p0, p1, v5, v6, v0}, La/nn60;->i(IJLa/zje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-ne p1, v1, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_4
    invoke-virtual {p0, p1, v5, v6, v0}, La/nn60;->p(IJLa/zje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-ne p1, v1, :cond_5

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    :goto_1
    if-ne p1, v1, :cond_6

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_6
    :goto_2
    iput-object v3, p0, La/nn60;->x:La/bmr;

    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0
.end method

.method public final m(La/pbv;Ljava/lang/String;ILa/zje;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    instance-of v4, v3, La/jn60;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, La/jn60;

    .line 15
    .line 16
    iget v5, v4, La/jn60;->k:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, La/jn60;->k:I

    .line 26
    .line 27
    :goto_0
    move-object v7, v4

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v4, La/jn60;

    .line 30
    .line 31
    invoke-direct {v4, v1, v3}, La/jn60;-><init>(La/nn60;La/zje;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v3, v7, La/jn60;->i:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v8, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v4, v7, La/jn60;->k:I

    .line 40
    .line 41
    const/4 v10, 0x1

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    if-ne v4, v10, :cond_1

    .line 45
    .line 46
    :try_start_0
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto/16 :goto_7

    .line 50
    .line 51
    :catch_0
    move-exception v0

    .line 52
    goto/16 :goto_8

    .line 53
    .line 54
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    return-object v0

    .line 61
    :cond_2
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-boolean v3, v0, La/pbv;->p:Z

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :cond_3
    sget-object v3, La/a570;->Companion:La/t470;

    .line 72
    .line 73
    iget-wide v4, v0, La/pbv;->a:J

    .line 74
    .line 75
    iget-boolean v6, v0, La/pbv;->k:Z

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-static {v6, v4, v5}, La/t470;->a(ZJ)La/a570;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    instance-of v4, v3, La/z470;

    .line 85
    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    :goto_2
    move-object v15, v4

    .line 97
    goto :goto_3

    .line 98
    :cond_4
    const-string v4, ""

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :goto_3
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, La/x2t0;->d()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v4

    .line 108
    check-cast v4, La/un60;

    .line 109
    .line 110
    iget-object v14, v4, La/un60;->a:La/zn60;

    .line 111
    .line 112
    iget-object v0, v0, La/pbv;->n:La/hds;

    .line 113
    .line 114
    move-object/from16 v4, p2

    .line 115
    .line 116
    invoke-virtual {v0, v4}, La/hds;->a(Ljava/lang/String;)La/lz60;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-boolean v4, v1, La/nn60;->y:Z

    .line 121
    .line 122
    if-nez v4, :cond_f

    .line 123
    .line 124
    if-nez v14, :cond_5

    .line 125
    .line 126
    goto/16 :goto_a

    .line 127
    .line 128
    :cond_5
    iget-object v4, v14, La/zn60;->a:Ljava/lang/String;

    .line 129
    .line 130
    sget-object v5, La/pn60;->a:La/pn60;

    .line 131
    .line 132
    invoke-virtual {v1, v5}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-static {v3}, La/x1x;->D(La/a570;)J

    .line 136
    .line 137
    .line 138
    move-result-wide v12

    .line 139
    long-to-int v5, v12

    .line 140
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 141
    .line 142
    .line 143
    move-result v6

    .line 144
    const/4 v11, 0x2

    .line 145
    iget-object v9, v1, La/nn60;->s:La/gw60;

    .line 146
    .line 147
    if-eq v6, v11, :cond_a

    .line 148
    .line 149
    const/4 v10, 0x3

    .line 150
    if-eq v6, v10, :cond_8

    .line 151
    .line 152
    const/4 v10, 0x4

    .line 153
    if-eq v6, v10, :cond_7

    .line 154
    .line 155
    const/4 v10, 0x6

    .line 156
    if-eq v6, v10, :cond_6

    .line 157
    .line 158
    :goto_4
    move-object/from16 v16, v0

    .line 159
    .line 160
    goto/16 :goto_5

    .line 161
    .line 162
    :cond_6
    sget-object v6, La/y1p;->f:La/y1p;

    .line 163
    .line 164
    invoke-virtual {v9, v5, v6, v15, v0}, La/gw60;->d(ILa/y1p;Ljava/lang/String;La/lz60;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_7
    sget-object v6, La/y1p;->g:La/y1p;

    .line 169
    .line 170
    invoke-virtual {v9, v5, v6, v15, v0}, La/gw60;->d(ILa/y1p;Ljava/lang/String;La/lz60;)V

    .line 171
    .line 172
    .line 173
    goto :goto_4

    .line 174
    :cond_8
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    iget-object v6, v9, La/gw60;->a:La/s1p;

    .line 181
    .line 182
    new-instance v9, La/yni0;

    .line 183
    .line 184
    invoke-direct {v9}, La/yni0;-><init>()V

    .line 185
    .line 186
    .line 187
    new-instance v10, La/i1p;

    .line 188
    .line 189
    invoke-direct {v10, v5, v11}, La/i1p;-><init>(IB)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v9, v10}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    new-instance v5, La/j1p;

    .line 196
    .line 197
    const/4 v10, 0x0

    .line 198
    invoke-direct {v5, v4, v10}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v9, v5}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-lez v5, :cond_9

    .line 209
    .line 210
    new-instance v5, La/j1p;

    .line 211
    .line 212
    invoke-direct {v5, v15, v11}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v9, v5}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    :cond_9
    new-instance v5, La/i1p;

    .line 219
    .line 220
    sget-object v10, La/lz60;->Companion:La/iz60;

    .line 221
    .line 222
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-static {v0}, La/iz60;->b(La/lz60;)I

    .line 226
    .line 227
    .line 228
    move-result v10

    .line 229
    const/4 v11, 0x1

    .line 230
    invoke-direct {v5, v10, v11}, La/i1p;-><init>(IB)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v9, v5}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    invoke-static {v9}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    const-wide/16 v9, 0xbbb

    .line 241
    .line 242
    invoke-virtual {v6, v5, v9, v10}, La/s1p;->a(Ljava/util/Set;J)V

    .line 243
    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_a
    sget-object v6, La/y1p;->b:La/y1p;

    .line 247
    .line 248
    int-to-float v6, v2

    .line 249
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    iget-object v9, v9, La/gw60;->a:La/s1p;

    .line 256
    .line 257
    new-instance v10, La/yni0;

    .line 258
    .line 259
    invoke-direct {v10}, La/yni0;-><init>()V

    .line 260
    .line 261
    .line 262
    move-object/from16 v16, v0

    .line 263
    .line 264
    new-instance v0, La/i1p;

    .line 265
    .line 266
    invoke-direct {v0, v5, v11}, La/i1p;-><init>(IB)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v10, v0}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    new-instance v0, La/j1p;

    .line 273
    .line 274
    const-string v5, "games_all"

    .line 275
    .line 276
    const/4 v11, 0x0

    .line 277
    invoke-direct {v0, v5, v11}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v10, v0}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    new-instance v0, La/h1p;

    .line 284
    .line 285
    invoke-direct {v0, v6, v11}, La/h1p;-><init>(FB)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v10, v0}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    if-lez v0, :cond_b

    .line 296
    .line 297
    new-instance v0, La/j1p;

    .line 298
    .line 299
    const/4 v5, 0x2

    .line 300
    invoke-direct {v0, v15, v5}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v10, v0}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    :cond_b
    new-instance v0, La/i1p;

    .line 307
    .line 308
    sget-object v5, La/lz60;->Companion:La/iz60;

    .line 309
    .line 310
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-static/range {v16 .. v16}, La/iz60;->b(La/lz60;)I

    .line 314
    .line 315
    .line 316
    move-result v5

    .line 317
    const/4 v11, 0x1

    .line 318
    invoke-direct {v0, v5, v11}, La/i1p;-><init>(IB)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v10, v0}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    invoke-static {v10}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    const-wide/16 v5, 0xbbb

    .line 329
    .line 330
    invoke-virtual {v9, v0, v5, v6}, La/s1p;->a(Ljava/util/Set;J)V

    .line 331
    .line 332
    .line 333
    :goto_5
    const/4 v0, -0x1

    .line 334
    iget-object v11, v1, La/nn60;->m:La/hs60;

    .line 335
    .line 336
    if-eq v2, v0, :cond_d

    .line 337
    .line 338
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    iget-object v0, v11, La/hs60;->a:La/kt2;

    .line 345
    .line 346
    new-instance v5, La/jo20;

    .line 347
    .line 348
    invoke-direct {v5}, La/jo20;-><init>()V

    .line 349
    .line 350
    .line 351
    const-string v6, "game_id"

    .line 352
    .line 353
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v9

    .line 357
    invoke-virtual {v5, v6, v9}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    const-string v6, "screen"

    .line 361
    .line 362
    invoke-virtual {v5, v6, v4}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    const-string v4, "filter"

    .line 366
    .line 367
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    invoke-virtual {v5, v4, v2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 375
    .line 376
    .line 377
    move-result v2

    .line 378
    if-lez v2, :cond_c

    .line 379
    .line 380
    const-string v2, "session_id"

    .line 381
    .line 382
    invoke-virtual {v5, v2, v15}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    :cond_c
    sget-object v2, La/lz60;->Companion:La/iz60;

    .line 386
    .line 387
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    invoke-static/range {v16 .. v16}, La/iz60;->b(La/lz60;)I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object v2

    .line 398
    const-string v4, "point"

    .line 399
    .line 400
    invoke-virtual {v5, v4, v2}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v5}, La/jo20;->b()La/jo20;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    const-string v4, "games_call"

    .line 408
    .line 409
    invoke-interface {v0, v4, v2}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 410
    .line 411
    .line 412
    goto :goto_6

    .line 413
    :cond_d
    invoke-virtual/range {v11 .. v16}, La/hs60;->d(JLa/zn60;Ljava/lang/String;La/lz60;)V

    .line 414
    .line 415
    .line 416
    :goto_6
    :try_start_1
    iget-object v0, v1, La/nn60;->h:La/mne;

    .line 417
    .line 418
    iget-object v9, v0, La/mne;->c:La/vs10;

    .line 419
    .line 420
    new-instance v0, La/fl3;

    .line 421
    .line 422
    const/4 v6, 0x0

    .line 423
    move-object v2, v3

    .line 424
    move-wide v3, v12

    .line 425
    move-object v5, v15

    .line 426
    invoke-direct/range {v0 .. v6}, La/fl3;-><init>(La/nn60;La/a570;JLjava/lang/String;La/yje;)V

    .line 427
    .line 428
    .line 429
    const/4 v11, 0x1

    .line 430
    iput v11, v7, La/jn60;->k:I

    .line 431
    .line 432
    invoke-static {v9, v0, v7}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 436
    if-ne v0, v8, :cond_e

    .line 437
    .line 438
    return-object v8

    .line 439
    :cond_e
    :goto_7
    const/4 v11, 0x0

    .line 440
    goto :goto_9

    .line 441
    :goto_8
    iget-object v2, v1, La/nn60;->k:La/duj;

    .line 442
    .line 443
    invoke-virtual {v2, v0}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 444
    .line 445
    .line 446
    goto :goto_7

    .line 447
    :goto_9
    iput-boolean v11, v1, La/nn60;->y:Z

    .line 448
    .line 449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object v0

    .line 452
    :cond_f
    :goto_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 453
    .line 454
    return-object v0
.end method

.method public final n(La/z470;Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, La/kn60;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/kn60;

    .line 11
    .line 12
    iget v3, v2, La/kn60;->o:I

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
    iput v3, v2, La/kn60;->o:I

    .line 22
    .line 23
    :goto_0
    move-object v4, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, La/kn60;

    .line 26
    .line 27
    invoke-direct {v2, v1, v0}, La/kn60;-><init>(La/nn60;La/zje;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v0, v4, La/kn60;->m:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v7, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v4, La/kn60;->o:I

    .line 36
    .line 37
    const/16 v8, 0xd

    .line 38
    .line 39
    iget-object v9, v1, La/x2t0;->b:La/ocj;

    .line 40
    .line 41
    const/4 v3, 0x4

    .line 42
    const/4 v5, 0x3

    .line 43
    const/4 v6, 0x2

    .line 44
    const/4 v10, 0x1

    .line 45
    const/4 v11, 0x0

    .line 46
    if-eqz v2, :cond_5

    .line 47
    .line 48
    if-eq v2, v10, :cond_4

    .line 49
    .line 50
    if-eq v2, v6, :cond_1

    .line 51
    .line 52
    if-eq v2, v5, :cond_3

    .line 53
    .line 54
    if-ne v2, v3, :cond_2

    .line 55
    .line 56
    :cond_1
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto/16 :goto_8

    .line 60
    .line 61
    :catch_0
    move-exception v0

    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    return-object v11

    .line 70
    :cond_3
    iget-boolean v2, v4, La/kn60;->l:Z

    .line 71
    .line 72
    iget-wide v5, v4, La/kn60;->k:J

    .line 73
    .line 74
    iget-object v10, v4, La/kn60;->j:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v12, v4, La/kn60;->i:La/z470;

    .line 77
    .line 78
    :try_start_1
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 79
    .line 80
    .line 81
    move-wide/from16 v16, v5

    .line 82
    .line 83
    move v6, v2

    .line 84
    move-object v2, v12

    .line 85
    move-wide/from16 v12, v16

    .line 86
    .line 87
    move-object v5, v10

    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :cond_4
    iget-wide v12, v4, La/kn60;->k:J

    .line 91
    .line 92
    iget-object v2, v4, La/kn60;->j:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v10, v4, La/kn60;->i:La/z470;

    .line 95
    .line 96
    :try_start_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 97
    .line 98
    .line 99
    move v15, v5

    .line 100
    move-object v5, v2

    .line 101
    move-object v2, v10

    .line 102
    goto :goto_3

    .line 103
    :cond_5
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    iget-object v0, v9, La/ocj;->a:La/p7m0;

    .line 110
    .line 111
    :goto_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    move-object v12, v2

    .line 116
    check-cast v12, La/un60;

    .line 117
    .line 118
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v12, v11, v10, v11, v8}, La/un60;->a(La/un60;La/zn60;ZLjava/util/ArrayList;I)La/un60;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    invoke-virtual {v0, v2, v12}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_d

    .line 130
    .line 131
    :try_start_3
    invoke-static/range {p1 .. p1}, La/x1x;->D(La/a570;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v12

    .line 135
    iget-object v0, v1, La/nn60;->o:La/dcu;

    .line 136
    .line 137
    move-object/from16 v2, p1

    .line 138
    .line 139
    iput-object v2, v4, La/kn60;->i:La/z470;

    .line 140
    .line 141
    move-object/from16 v14, p2

    .line 142
    .line 143
    iput-object v14, v4, La/kn60;->j:Ljava/lang/String;

    .line 144
    .line 145
    iput-wide v12, v4, La/kn60;->k:J

    .line 146
    .line 147
    iput v10, v4, La/kn60;->o:I

    .line 148
    .line 149
    invoke-virtual {v0, v12, v13, v4}, La/dcu;->a(JLa/zje;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-ne v0, v7, :cond_6

    .line 154
    .line 155
    goto :goto_6

    .line 156
    :cond_6
    move v15, v5

    .line 157
    move-object v5, v14

    .line 158
    :goto_3
    check-cast v0, Ljava/lang/Boolean;

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    iget-object v10, v1, La/nn60;->n:La/iqt;

    .line 165
    .line 166
    iget-object v10, v10, La/iqt;->a:La/gst0;

    .line 167
    .line 168
    invoke-virtual {v10}, La/gst0;->a()Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    if-nez v10, :cond_7

    .line 173
    .line 174
    iput-object v11, v4, La/kn60;->i:La/z470;

    .line 175
    .line 176
    iput-object v11, v4, La/kn60;->j:Ljava/lang/String;

    .line 177
    .line 178
    iput-wide v12, v4, La/kn60;->k:J

    .line 179
    .line 180
    iput-boolean v0, v4, La/kn60;->l:Z

    .line 181
    .line 182
    iput v6, v4, La/kn60;->o:I

    .line 183
    .line 184
    move v6, v0

    .line 185
    move-wide v2, v12

    .line 186
    invoke-virtual/range {v1 .. v6}, La/nn60;->o(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    if-ne v0, v7, :cond_b

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_7
    move v6, v0

    .line 194
    iget-object v0, v1, La/nn60;->j:La/p4u;

    .line 195
    .line 196
    iput-object v2, v4, La/kn60;->i:La/z470;

    .line 197
    .line 198
    iput-object v5, v4, La/kn60;->j:Ljava/lang/String;

    .line 199
    .line 200
    iput-wide v12, v4, La/kn60;->k:J

    .line 201
    .line 202
    iput-boolean v6, v4, La/kn60;->l:Z

    .line 203
    .line 204
    iput v15, v4, La/kn60;->o:I

    .line 205
    .line 206
    invoke-virtual {v0, v4}, La/p4u;->e(La/zje;)Ljava/io/Serializable;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    if-ne v0, v7, :cond_8

    .line 211
    .line 212
    goto :goto_6

    .line 213
    :cond_8
    :goto_4
    check-cast v0, Ljava/util/List;

    .line 214
    .line 215
    iput-object v11, v4, La/kn60;->i:La/z470;

    .line 216
    .line 217
    iput-object v11, v4, La/kn60;->j:Ljava/lang/String;

    .line 218
    .line 219
    iput-wide v12, v4, La/kn60;->k:J

    .line 220
    .line 221
    iput-boolean v6, v4, La/kn60;->l:Z

    .line 222
    .line 223
    iput v3, v4, La/kn60;->o:I

    .line 224
    .line 225
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    if-nez v0, :cond_9

    .line 230
    .line 231
    sget-object v0, La/sn60;->a:La/sn60;

    .line 232
    .line 233
    invoke-virtual {v1, v0}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_9
    invoke-static {v2}, La/x1x;->D(La/a570;)J

    .line 240
    .line 241
    .line 242
    move-result-wide v2

    .line 243
    invoke-virtual/range {v1 .. v6}, La/nn60;->o(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    if-ne v0, v7, :cond_a

    .line 248
    .line 249
    goto :goto_5

    .line 250
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 251
    .line 252
    :goto_5
    if-ne v0, v7, :cond_b

    .line 253
    .line 254
    :goto_6
    return-object v7

    .line 255
    :goto_7
    iget-object v1, v1, La/nn60;->k:La/duj;

    .line 256
    .line 257
    invoke-virtual {v1, v0}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 258
    .line 259
    .line 260
    :cond_b
    :goto_8
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget-object v4, v9, La/ocj;->a:La/p7m0;

    .line 264
    .line 265
    :cond_c
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    move-object v1, v0

    .line 270
    check-cast v1, La/un60;

    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    const/4 v2, 0x0

    .line 276
    invoke-static {v1, v11, v2, v11, v8}, La/un60;->a(La/un60;La/zn60;ZLjava/util/ArrayList;I)La/un60;

    .line 277
    .line 278
    .line 279
    move-result-object v1

    .line 280
    invoke-virtual {v4, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 281
    .line 282
    .line 283
    move-result v0

    .line 284
    if-eqz v0, :cond_c

    .line 285
    .line 286
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 287
    .line 288
    return-object v0

    .line 289
    :cond_d
    move-object/from16 v2, p1

    .line 290
    .line 291
    move-object/from16 v14, p2

    .line 292
    .line 293
    goto/16 :goto_2
.end method

.method public final o(JLa/zje;Ljava/lang/String;Z)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v4, p3, La/ln60;

    .line 2
    .line 3
    if-eqz v4, :cond_0

    .line 4
    .line 5
    move-object v4, p3

    .line 6
    check-cast v4, La/ln60;

    .line 7
    .line 8
    iget v5, v4, La/ln60;->n:I

    .line 9
    .line 10
    const/high16 v6, -0x80000000

    .line 11
    .line 12
    and-int v7, v5, v6

    .line 13
    .line 14
    if-eqz v7, :cond_0

    .line 15
    .line 16
    sub-int/2addr v5, v6

    .line 17
    iput v5, v4, La/ln60;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v4, La/ln60;

    .line 21
    .line 22
    invoke-direct {v4, p0, p3}, La/ln60;-><init>(La/nn60;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object v0, v4, La/ln60;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v5, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v6, v4, La/ln60;->n:I

    .line 30
    .line 31
    const/4 v7, 0x1

    .line 32
    if-eqz v6, :cond_2

    .line 33
    .line 34
    if-ne v6, v7, :cond_1

    .line 35
    .line 36
    iget-boolean v2, v4, La/ln60;->j:Z

    .line 37
    .line 38
    iget-wide v5, v4, La/ln60;->i:J

    .line 39
    .line 40
    iget-object v3, v4, La/ln60;->k:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    move v4, v2

    .line 46
    move-wide v9, v5

    .line 47
    move-object v5, v3

    .line 48
    move-wide v2, v9

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    return-object v0

    .line 57
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object p4, v4, La/ln60;->k:Ljava/lang/String;

    .line 61
    .line 62
    iput-wide p1, v4, La/ln60;->i:J

    .line 63
    .line 64
    move/from16 v6, p5

    .line 65
    .line 66
    iput-boolean v6, v4, La/ln60;->j:Z

    .line 67
    .line 68
    iput v7, v4, La/ln60;->n:I

    .line 69
    .line 70
    iget-object v8, p0, La/nn60;->r:La/z4u;

    .line 71
    .line 72
    invoke-virtual {v8, p1, p2, v4}, La/z4u;->a(JLa/yje;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    if-ne v4, v5, :cond_3

    .line 77
    .line 78
    return-object v5

    .line 79
    :cond_3
    move-wide v2, p1

    .line 80
    move-object v5, p4

    .line 81
    move-object v0, v4

    .line 82
    move v4, v6

    .line 83
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    xor-int/lit8 v6, v0, 0x1

    .line 90
    .line 91
    iget-object v0, p0, La/nn60;->l:La/oeg0;

    .line 92
    .line 93
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    new-instance v0, La/k1b;

    .line 98
    .line 99
    const/4 v7, 0x2

    .line 100
    move-object v1, p0

    .line 101
    invoke-direct/range {v0 .. v7}, La/k1b;-><init>(Ljava/lang/Object;JZLjava/lang/String;ZB)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v8, v0}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 105
    .line 106
    .line 107
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 108
    .line 109
    return-object v0
.end method

.method public final p(IJLa/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, La/mn60;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, La/mn60;

    .line 7
    .line 8
    iget v1, v0, La/mn60;->k:I

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
    iput v1, v0, La/mn60;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/mn60;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, La/mn60;-><init>(La/nn60;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, La/mn60;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/mn60;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto/16 :goto_5

    .line 41
    .line 42
    :catch_0
    move-exception p1

    .line 43
    goto :goto_3

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p4

    .line 57
    const/4 v2, -0x1

    .line 58
    if-eq p1, v2, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    move-object p4, v3

    .line 62
    :goto_1
    if-eqz p4, :cond_4

    .line 63
    .line 64
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    goto :goto_2

    .line 69
    :cond_4
    iget-object p1, p0, La/nn60;->x:La/bmr;

    .line 70
    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    iget p1, p1, La/bmr;->e:I

    .line 74
    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :cond_5
    if-eqz v3, :cond_6

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    :cond_6
    :goto_2
    iget-object p1, p0, La/nn60;->m:La/hs60;

    .line 86
    .line 87
    iget-object p1, p1, La/hs60;->a:La/kt2;

    .line 88
    .line 89
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object p4

    .line 93
    new-instance v3, Lkotlin/Pair;

    .line 94
    .line 95
    const-string v5, "game_id"

    .line 96
    .line 97
    invoke-direct {v3, v5, p4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance p4, Lkotlin/Pair;

    .line 101
    .line 102
    const-string v5, "action"

    .line 103
    .line 104
    const-string v6, "remove"

    .line 105
    .line 106
    invoke-direct {p4, v5, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    new-instance v7, Lkotlin/Pair;

    .line 114
    .line 115
    const-string v8, "filter"

    .line 116
    .line 117
    invoke-direct {v7, v8, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    filled-new-array {v3, p4, v7}, [Lkotlin/Pair;

    .line 121
    .line 122
    .line 123
    move-result-object p4

    .line 124
    invoke-static {p4}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 125
    .line 126
    .line 127
    move-result-object p4

    .line 128
    const-string v3, "game_favor_games_add"

    .line 129
    .line 130
    invoke-interface {p1, v3, p4}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, p0, La/nn60;->s:La/gw60;

    .line 134
    .line 135
    long-to-int p4, p2

    .line 136
    invoke-virtual {p1, p4, v2, v6}, La/gw60;->a(IILjava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :try_start_1
    iget-object p1, p0, La/nn60;->q:La/as;

    .line 140
    .line 141
    iput v4, v0, La/mn60;->k:I

    .line 142
    .line 143
    invoke-virtual {p1, p2, p3, v0}, La/as;->a(JLa/zje;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 147
    if-ne p0, v1, :cond_9

    .line 148
    .line 149
    return-object v1

    .line 150
    :goto_3
    instance-of p2, p1, Ljava/net/SocketTimeoutException;

    .line 151
    .line 152
    if-eqz p2, :cond_7

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_7
    instance-of p2, p1, Ljava/net/UnknownHostException;

    .line 156
    .line 157
    if-eqz p2, :cond_8

    .line 158
    .line 159
    :goto_4
    sget-object p1, La/on60;->a:La/on60;

    .line 160
    .line 161
    invoke-virtual {p0, p1}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_8
    new-instance p2, La/pi40;

    .line 166
    .line 167
    const/16 p3, 0x1c

    .line 168
    .line 169
    invoke-direct {p2, p0, p3}, La/pi40;-><init>(Ljava/lang/Object;B)V

    .line 170
    .line 171
    .line 172
    iget-object p0, p0, La/nn60;->k:La/duj;

    .line 173
    .line 174
    invoke-virtual {p0, p1, p2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    :cond_9
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0
.end method
