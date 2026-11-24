.class public final La/iw20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zf60;
.implements La/vh30;
.implements La/imk;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/b6s;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, La/iw20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/d49;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, La/iw20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/drb0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, La/iw20;->a:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance p2, La/tpv;

    .line 11
    .line 12
    const/16 v0, 0x16

    .line 13
    .line 14
    invoke-direct {p2, p1, v0}, La/tpv;-><init>(La/gii0;B)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/iw20;->a:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    new-instance p2, La/rta0;

    .line 24
    .line 25
    const/16 v0, 0x11

    .line 26
    .line 27
    invoke-direct {p2, p1, v0}, La/rta0;-><init>(La/gii0;B)V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, La/iw20;->a:Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/vwb0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, La/iw20;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 39
    iput-object p1, p0, La/iw20;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f(La/iw20;La/nqh0;)Lorg/xplatform/security/impl/navigation/SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/xplatform/security/impl/navigation/SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1, p1}, Lorg/xplatform/security/impl/navigation/SecuritySettingsScreenFactoryImpl$getSecuritySettingsScreen$1;-><init>(La/iw20;La/fsh0;La/nqh0;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method


# virtual methods
.method public a(F)Z
    .locals 3

    .line 1
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Landroidx/recyclerview/widget/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->r()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    float-to-int p1, p1

    .line 15
    move v0, p1

    .line 16
    move p1, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Landroidx/recyclerview/widget/b;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->q()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    float-to-int p1, p1

    .line 27
    move v0, v1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move p1, v1

    .line 30
    move v0, p1

    .line 31
    :goto_0
    if-nez p1, :cond_2

    .line 32
    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    return v1

    .line 36
    :cond_2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->G0()V

    .line 37
    .line 38
    .line 39
    const v2, 0x7fffffff

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, p1, v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->R(IIII)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0
.end method

.method public b()F
    .locals 1

    .line 1
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Landroidx/recyclerview/widget/b;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->r()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->C1:F

    .line 14
    .line 15
    :goto_0
    neg-float p0, p0

    .line 16
    return p0

    .line 17
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->n:Landroidx/recyclerview/widget/b;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->q()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget p0, p0, Landroidx/recyclerview/widget/RecyclerView;->B1:F

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public c()V
    .locals 0

    .line 1
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->G0()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    instance-of v2, v0, La/pda0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, La/pda0;

    .line 11
    .line 12
    iget v3, v2, La/pda0;->s:I

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
    iput v3, v2, La/pda0;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/pda0;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, La/pda0;-><init>(La/iw20;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, La/pda0;->q:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/pda0;->s:I

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v9, 0x1

    .line 38
    if-eqz v4, :cond_4

    .line 39
    .line 40
    if-eq v4, v9, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    iget v4, v2, La/pda0;->p:I

    .line 47
    .line 48
    iget v10, v2, La/pda0;->o:I

    .line 49
    .line 50
    iget v11, v2, La/pda0;->n:I

    .line 51
    .line 52
    iget-wide v12, v2, La/pda0;->k:J

    .line 53
    .line 54
    iget-wide v14, v2, La/pda0;->j:J

    .line 55
    .line 56
    const/16 p3, 0x0

    .line 57
    .line 58
    iget-wide v7, v2, La/pda0;->i:J

    .line 59
    .line 60
    iget-object v5, v2, La/pda0;->m:Ljava/lang/Throwable;

    .line 61
    .line 62
    iget-object v6, v2, La/pda0;->l:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object v0, v6

    .line 68
    move-object v6, v2

    .line 69
    move-object v2, v0

    .line 70
    move v0, v4

    .line 71
    const/4 v1, 0x3

    .line 72
    move-wide/from16 v16, v12

    .line 73
    .line 74
    move-object v12, v5

    .line 75
    move-wide v4, v7

    .line 76
    move v7, v10

    .line 77
    move v8, v11

    .line 78
    move-wide/from16 v10, v16

    .line 79
    .line 80
    move-wide v13, v14

    .line 81
    const/4 v15, 0x2

    .line 82
    goto/16 :goto_8

    .line 83
    .line 84
    :cond_1
    const/16 p3, 0x0

    .line 85
    .line 86
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 87
    .line 88
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-object p3

    .line 92
    :cond_2
    const/16 p3, 0x0

    .line 93
    .line 94
    iget v4, v2, La/pda0;->p:I

    .line 95
    .line 96
    iget v5, v2, La/pda0;->o:I

    .line 97
    .line 98
    iget v6, v2, La/pda0;->n:I

    .line 99
    .line 100
    iget-wide v7, v2, La/pda0;->k:J

    .line 101
    .line 102
    iget-wide v10, v2, La/pda0;->j:J

    .line 103
    .line 104
    iget-wide v12, v2, La/pda0;->i:J

    .line 105
    .line 106
    iget-object v14, v2, La/pda0;->m:Ljava/lang/Throwable;

    .line 107
    .line 108
    iget-object v15, v2, La/pda0;->l:Ljava/lang/String;

    .line 109
    .line 110
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move v0, v4

    .line 114
    move/from16 v16, v6

    .line 115
    .line 116
    move-object v6, v2

    .line 117
    move-object v2, v15

    .line 118
    const/4 v15, 0x2

    .line 119
    move-wide/from16 v17, v7

    .line 120
    .line 121
    move v7, v5

    .line 122
    move/from16 v8, v16

    .line 123
    .line 124
    move-wide v4, v12

    .line 125
    move-object v12, v14

    .line 126
    move-wide v13, v10

    .line 127
    move-wide/from16 v10, v17

    .line 128
    .line 129
    goto/16 :goto_5

    .line 130
    .line 131
    :cond_3
    const/16 p3, 0x0

    .line 132
    .line 133
    iget v4, v2, La/pda0;->o:I

    .line 134
    .line 135
    iget v5, v2, La/pda0;->n:I

    .line 136
    .line 137
    iget-wide v6, v2, La/pda0;->k:J

    .line 138
    .line 139
    iget-wide v10, v2, La/pda0;->j:J

    .line 140
    .line 141
    iget-wide v12, v2, La/pda0;->i:J

    .line 142
    .line 143
    iget-object v8, v2, La/pda0;->m:Ljava/lang/Throwable;

    .line 144
    .line 145
    iget-object v14, v2, La/pda0;->l:Ljava/lang/String;

    .line 146
    .line 147
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    .line 150
    goto/16 :goto_2

    .line 151
    .line 152
    :catchall_0
    move-exception v0

    .line 153
    move-wide/from16 v16, v6

    .line 154
    .line 155
    move-object v6, v2

    .line 156
    move v7, v4

    .line 157
    move-object v2, v14

    .line 158
    move-object/from16 v18, v8

    .line 159
    .line 160
    move v8, v5

    .line 161
    move-wide v4, v12

    .line 162
    move-object/from16 v12, v18

    .line 163
    .line 164
    move-wide v13, v10

    .line 165
    move-wide/from16 v10, v16

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_4
    const/16 p3, 0x0

    .line 169
    .line 170
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    sget-wide v4, La/cag0;->a:J

    .line 174
    .line 175
    const-wide/16 v6, 0x3

    .line 176
    .line 177
    move-object/from16 v12, p3

    .line 178
    .line 179
    move-wide v10, v4

    .line 180
    move-wide v13, v6

    .line 181
    move v0, v9

    .line 182
    const/4 v7, 0x0

    .line 183
    const/4 v8, 0x0

    .line 184
    move-wide/from16 v4, p1

    .line 185
    .line 186
    move-object v6, v2

    .line 187
    move-object/from16 v2, p4

    .line 188
    .line 189
    :goto_1
    if-eqz v0, :cond_f

    .line 190
    .line 191
    :try_start_1
    iget-object v15, v1, La/iw20;->a:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v15, La/nr00;

    .line 194
    .line 195
    iput-object v2, v6, La/pda0;->l:Ljava/lang/String;

    .line 196
    .line 197
    iput-object v12, v6, La/pda0;->m:Ljava/lang/Throwable;

    .line 198
    .line 199
    iput-wide v4, v6, La/pda0;->i:J

    .line 200
    .line 201
    iput-wide v13, v6, La/pda0;->j:J

    .line 202
    .line 203
    iput-wide v10, v6, La/pda0;->k:J

    .line 204
    .line 205
    iput v8, v6, La/pda0;->n:I

    .line 206
    .line 207
    iput v7, v6, La/pda0;->o:I

    .line 208
    .line 209
    iput v0, v6, La/pda0;->p:I

    .line 210
    .line 211
    iput v9, v6, La/pda0;->s:I

    .line 212
    .line 213
    invoke-virtual {v15, v4, v5, v6, v2}, La/nr00;->h(JLa/zje;Ljava/lang/String;)Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 217
    if-ne v0, v3, :cond_5

    .line 218
    .line 219
    goto/16 :goto_7

    .line 220
    .line 221
    :cond_5
    move-wide/from16 v16, v13

    .line 222
    .line 223
    move-object v14, v2

    .line 224
    move-object v2, v6

    .line 225
    move-wide/from16 v18, v4

    .line 226
    .line 227
    move v4, v7

    .line 228
    move v5, v8

    .line 229
    move-wide v6, v10

    .line 230
    move-object v8, v12

    .line 231
    move-wide/from16 v10, v16

    .line 232
    .line 233
    move-wide/from16 v12, v18

    .line 234
    .line 235
    :goto_2
    :try_start_2
    check-cast v0, La/sda0;

    .line 236
    .line 237
    invoke-static {v0}, La/ucx;->m0(La/sda0;)La/jda0;

    .line 238
    .line 239
    .line 240
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 241
    return-object v0

    .line 242
    :catchall_1
    move-exception v0

    .line 243
    :goto_3
    invoke-static {v0}, La/agc;->M(Ljava/lang/Throwable;)Z

    .line 244
    .line 245
    .line 246
    move-result v15

    .line 247
    if-eqz v15, :cond_a

    .line 248
    .line 249
    if-nez v8, :cond_6

    .line 250
    .line 251
    new-instance v12, La/el50;

    .line 252
    .line 253
    invoke-direct {v12, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 254
    .line 255
    .line 256
    const/4 v0, 0x0

    .line 257
    goto :goto_1

    .line 258
    :cond_6
    move-wide/from16 p1, v10

    .line 259
    .line 260
    int-to-long v9, v7

    .line 261
    cmp-long v9, v9, v13

    .line 262
    .line 263
    if-gez v9, :cond_7

    .line 264
    .line 265
    const/4 v9, 0x1

    .line 266
    goto :goto_4

    .line 267
    :cond_7
    const/4 v9, 0x0

    .line 268
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 269
    .line 270
    if-eqz v9, :cond_8

    .line 271
    .line 272
    iput-object v2, v6, La/pda0;->l:Ljava/lang/String;

    .line 273
    .line 274
    iput-object v12, v6, La/pda0;->m:Ljava/lang/Throwable;

    .line 275
    .line 276
    iput-wide v4, v6, La/pda0;->i:J

    .line 277
    .line 278
    iput-wide v13, v6, La/pda0;->j:J

    .line 279
    .line 280
    move-wide/from16 v10, p1

    .line 281
    .line 282
    iput-wide v10, v6, La/pda0;->k:J

    .line 283
    .line 284
    iput v8, v6, La/pda0;->n:I

    .line 285
    .line 286
    iput v7, v6, La/pda0;->o:I

    .line 287
    .line 288
    iput v9, v6, La/pda0;->p:I

    .line 289
    .line 290
    const/4 v15, 0x2

    .line 291
    iput v15, v6, La/pda0;->s:I

    .line 292
    .line 293
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    if-ne v0, v3, :cond_9

    .line 298
    .line 299
    goto :goto_7

    .line 300
    :goto_5
    const/4 v9, 0x1

    .line 301
    goto :goto_1

    .line 302
    :cond_8
    move-wide/from16 v10, p1

    .line 303
    .line 304
    const/4 v15, 0x2

    .line 305
    new-instance v12, La/el50;

    .line 306
    .line 307
    invoke-direct {v12, v0}, La/el50;-><init>(Ljava/lang/Throwable;)V

    .line 308
    .line 309
    .line 310
    :cond_9
    move v0, v9

    .line 311
    goto :goto_5

    .line 312
    :cond_a
    const/4 v15, 0x2

    .line 313
    invoke-static {v0}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 314
    .line 315
    .line 316
    move-result v9

    .line 317
    if-eqz v9, :cond_e

    .line 318
    .line 319
    move-object/from16 p2, v0

    .line 320
    .line 321
    int-to-long v0, v7

    .line 322
    cmp-long v0, v0, v13

    .line 323
    .line 324
    if-gez v0, :cond_b

    .line 325
    .line 326
    const/4 v0, 0x1

    .line 327
    goto :goto_6

    .line 328
    :cond_b
    const/4 v0, 0x0

    .line 329
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 330
    .line 331
    if-eqz v0, :cond_d

    .line 332
    .line 333
    iput-object v2, v6, La/pda0;->l:Ljava/lang/String;

    .line 334
    .line 335
    iput-object v12, v6, La/pda0;->m:Ljava/lang/Throwable;

    .line 336
    .line 337
    iput-wide v4, v6, La/pda0;->i:J

    .line 338
    .line 339
    iput-wide v13, v6, La/pda0;->j:J

    .line 340
    .line 341
    iput-wide v10, v6, La/pda0;->k:J

    .line 342
    .line 343
    iput v8, v6, La/pda0;->n:I

    .line 344
    .line 345
    iput v7, v6, La/pda0;->o:I

    .line 346
    .line 347
    iput v0, v6, La/pda0;->p:I

    .line 348
    .line 349
    const/4 v1, 0x3

    .line 350
    iput v1, v6, La/pda0;->s:I

    .line 351
    .line 352
    invoke-static {v10, v11, v6}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v9

    .line 356
    if-ne v9, v3, :cond_c

    .line 357
    .line 358
    :goto_7
    return-object v3

    .line 359
    :cond_c
    :goto_8
    move-object/from16 v1, p0

    .line 360
    .line 361
    goto :goto_5

    .line 362
    :cond_d
    const/4 v1, 0x3

    .line 363
    new-instance v12, La/dag0;

    .line 364
    .line 365
    move-object/from16 v9, p2

    .line 366
    .line 367
    invoke-direct {v12, v9}, La/dag0;-><init>(Ljava/lang/Throwable;)V

    .line 368
    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_e
    move-object v9, v0

    .line 372
    const/4 v1, 0x3

    .line 373
    invoke-static {v9}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 374
    .line 375
    .line 376
    const/4 v0, 0x0

    .line 377
    move-object/from16 v1, p0

    .line 378
    .line 379
    move-object v12, v9

    .line 380
    goto :goto_5

    .line 381
    :cond_f
    if-nez v12, :cond_10

    .line 382
    .line 383
    const-string v0, "Unexpected error"

    .line 384
    .line 385
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 386
    .line 387
    .line 388
    return-object p3

    .line 389
    :cond_10
    throw v12
.end method

.method public e(La/p3d;)La/s9h0;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, La/p3d;->a:F

    .line 5
    .line 6
    iget p1, p1, La/p3d;->b:F

    .line 7
    .line 8
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/mcz;

    .line 11
    .line 12
    iget-object v1, p0, La/mcz;->q:La/ma80;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    if-ne v1, v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, La/mcz;->h()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    const/16 p0, 0x20

    .line 28
    .line 29
    shr-long/2addr v1, p0

    .line 30
    :goto_0
    long-to-int p0, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0

    .line 37
    :cond_1
    invoke-virtual {p0}, La/mcz;->h()J

    .line 38
    .line 39
    .line 40
    move-result-wide v1

    .line 41
    const-wide v3, 0xffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    and-long/2addr v1, v3

    .line 47
    goto :goto_0

    .line 48
    :goto_1
    int-to-float p0, p0

    .line 49
    sub-float/2addr p0, p1

    .line 50
    new-instance p1, La/s9h0;

    .line 51
    .line 52
    invoke-direct {p1, v0, p0}, La/s9h0;-><init>(FF)V

    .line 53
    .line 54
    .line 55
    return-object p1
.end method

.method public g()Ljava/util/ArrayList;
    .locals 5

    .line 1
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/mcz;

    .line 4
    .line 5
    iget-object v0, p0, La/mcz;->l:Ljava/util/List;

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, La/ncz;

    .line 33
    .line 34
    iget-object v3, p0, La/mcz;->q:La/ma80;

    .line 35
    .line 36
    new-instance v4, La/gkf0;

    .line 37
    .line 38
    invoke-direct {v4, v2, v3}, La/gkf0;-><init>(La/ncz;La/ma80;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v1
.end method

.method public h()V
    .locals 9

    .line 1
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ros;

    .line 4
    .line 5
    iget-object v0, p0, La/ros;->b:La/zks;

    .line 6
    .line 7
    iget-object v0, v0, La/zks;->a:La/p7m0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/gps;

    .line 14
    .line 15
    instance-of v1, v0, La/fps;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, La/fps;

    .line 20
    .line 21
    iget-object v1, v0, La/fps;->d:La/sos;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v2, La/sos;->c:La/sos;

    .line 27
    .line 28
    if-ne v1, v2, :cond_0

    .line 29
    .line 30
    new-instance v3, La/zos;

    .line 31
    .line 32
    iget-wide v4, v0, La/fps;->a:J

    .line 33
    .line 34
    iget-object v6, v0, La/fps;->b:La/sip;

    .line 35
    .line 36
    iget-wide v7, v0, La/fps;->c:J

    .line 37
    .line 38
    invoke-direct/range {v3 .. v8}, La/zos;-><init>(JLa/sip;J)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v3}, La/ros;->b(La/gps;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method public i(La/la30;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/oa30;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/oa30;->a:La/ja30;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/ja30;->a:La/p7m0;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v1, v0

    .line 20
    check-cast v1, La/la30;

    .line 21
    .line 22
    invoke-virtual {p0, v0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return-void
.end method

.method public j(Landroidx/fragment/app/e;La/ngc0;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/lef0;

    .line 7
    .line 8
    iget-object p0, p0, La/lef0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, La/onv;

    .line 11
    .line 12
    iget-object p0, p0, La/onv;->a:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/lgc0;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, La/lgc0;->a:La/ngc0;

    .line 20
    .line 21
    const-string p0, "PromoCodesBottomSheetFragment"

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    if-eqz p2, :cond_0

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    sget-object p2, La/yfc0;->l2:La/xi70;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance p2, La/yfc0;

    .line 36
    .line 37
    invoke-direct {p2}, La/yfc0;-><init>()V

    .line 38
    .line 39
    .line 40
    sget-object v0, La/yfc0;->m2:[La/iiy;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    aget-object v0, v0, v1

    .line 44
    .line 45
    iget-object v1, p2, La/yfc0;->k2:La/phf0;

    .line 46
    .line 47
    const-string v2, "REQUEST_SELECT_PROMO_CODE"

    .line 48
    .line 49
    invoke-virtual {v1, p2, v0, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p1, p0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/iw20;->a:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lorg/xplatform/ui_core/viewcomponents/views/search/SearchMaterialViewNew;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    const/4 v0, 0x1

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    const/16 p1, 0x8

    .line 18
    .line 19
    iget-object p2, p2, La/xiv0;->a:La/uiv0;

    .line 20
    .line 21
    invoke-virtual {p2, p1}, La/uiv0;->u(I)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/appcompat/widget/d;->clearFocus()V

    .line 28
    .line 29
    .line 30
    :cond_0
    sget-object p0, La/xiv0;->b:La/xiv0;

    .line 31
    .line 32
    return-object p0
.end method
