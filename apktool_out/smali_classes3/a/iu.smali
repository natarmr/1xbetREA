.class public final La/iu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/g45;


# direct methods
.method public synthetic constructor <init>(La/g45;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/iu;->a:La/g45;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IILa/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v3, La/mnf0;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v3

    .line 14
    check-cast v4, La/mnf0;

    .line 15
    .line 16
    iget v5, v4, La/mnf0;->o:I

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
    iput v5, v4, La/mnf0;->o:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, La/mnf0;

    .line 29
    .line 30
    invoke-direct {v4, v0, v3}, La/mnf0;-><init>(La/iu;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v3, v4, La/mnf0;->m:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v5, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v6, v4, La/mnf0;->o:I

    .line 38
    .line 39
    const/4 v7, 0x3

    .line 40
    const/4 v8, 0x2

    .line 41
    const/4 v9, 0x1

    .line 42
    iget-object v0, v0, La/iu;->a:La/g45;

    .line 43
    .line 44
    if-eqz v6, :cond_4

    .line 45
    .line 46
    if-eq v6, v9, :cond_3

    .line 47
    .line 48
    if-eq v6, v8, :cond_2

    .line 49
    .line 50
    if-ne v6, v7, :cond_1

    .line 51
    .line 52
    iget-object v0, v4, La/mnf0;->l:Ljava/util/List;

    .line 53
    .line 54
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    return-object v0

    .line 65
    :cond_2
    iget v1, v4, La/mnf0;->k:I

    .line 66
    .line 67
    iget v2, v4, La/mnf0;->j:I

    .line 68
    .line 69
    iget-byte v6, v4, La/mnf0;->i:B

    .line 70
    .line 71
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget v1, v4, La/mnf0;->k:I

    .line 76
    .line 77
    iget v2, v4, La/mnf0;->j:I

    .line 78
    .line 79
    iget-byte v6, v4, La/mnf0;->i:B

    .line 80
    .line 81
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    move v3, v1

    .line 85
    move v1, v6

    .line 86
    goto :goto_1

    .line 87
    :cond_4
    invoke-static {v3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    div-int/lit8 v3, v1, 0x2

    .line 91
    .line 92
    sub-int v3, v2, v3

    .line 93
    .line 94
    if-ge v3, v9, :cond_5

    .line 95
    .line 96
    move v3, v9

    .line 97
    :cond_5
    sget-object v6, La/iun;->a:La/iun;

    .line 98
    .line 99
    iput-byte v1, v4, La/mnf0;->i:B

    .line 100
    .line 101
    iput v2, v4, La/mnf0;->j:I

    .line 102
    .line 103
    iput v3, v4, La/mnf0;->k:I

    .line 104
    .line 105
    iput v9, v4, La/mnf0;->o:I

    .line 106
    .line 107
    invoke-virtual {v0, v6}, La/g45;->l0(Ljava/util/List;)Lkotlin/Unit;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    if-ne v6, v5, :cond_6

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    :goto_1
    iput-byte v1, v4, La/mnf0;->i:B

    .line 115
    .line 116
    iput v2, v4, La/mnf0;->j:I

    .line 117
    .line 118
    iput v3, v4, La/mnf0;->k:I

    .line 119
    .line 120
    iput v8, v4, La/mnf0;->o:I

    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    invoke-virtual {v0, v3, v6, v1, v4}, La/g45;->r(IIILa/zje;)Ljava/io/Serializable;

    .line 124
    .line 125
    .line 126
    move-result-object v6

    .line 127
    if-ne v6, v5, :cond_7

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    move-object/from16 v18, v6

    .line 131
    .line 132
    move v6, v1

    .line 133
    move v1, v3

    .line 134
    move-object/from16 v3, v18

    .line 135
    .line 136
    :goto_2
    check-cast v3, Ljava/util/List;

    .line 137
    .line 138
    iget-object v8, v0, La/g45;->c:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v8, La/i7e;

    .line 141
    .line 142
    iget-object v8, v8, La/i7e;->i:La/p7m0;

    .line 143
    .line 144
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v8

    .line 148
    move-object v9, v8

    .line 149
    check-cast v9, La/gxb;

    .line 150
    .line 151
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v8

    .line 155
    check-cast v8, La/a640;

    .line 156
    .line 157
    if-eqz v8, :cond_8

    .line 158
    .line 159
    invoke-virtual {v8}, La/a640;->b()I

    .line 160
    .line 161
    .line 162
    move-result v10

    .line 163
    iget-object v11, v9, La/gxb;->j:La/vxy;

    .line 164
    .line 165
    iget v11, v11, La/vxy;->a:I

    .line 166
    .line 167
    if-le v10, v11, :cond_8

    .line 168
    .line 169
    new-instance v10, La/vxy;

    .line 170
    .line 171
    invoke-virtual {v8}, La/a640;->b()I

    .line 172
    .line 173
    .line 174
    move-result v11

    .line 175
    invoke-virtual {v8}, La/a640;->e()La/xrt0;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    instance-of v8, v8, La/srt0;

    .line 180
    .line 181
    invoke-direct {v10, v11, v8}, La/vxy;-><init>(IZ)V

    .line 182
    .line 183
    .line 184
    const/16 v17, 0x1ff

    .line 185
    .line 186
    move-object/from16 v16, v10

    .line 187
    .line 188
    const/4 v10, 0x0

    .line 189
    const/4 v11, 0x0

    .line 190
    const/4 v12, 0x0

    .line 191
    const/4 v13, 0x0

    .line 192
    const/4 v14, 0x0

    .line 193
    const/4 v15, 0x0

    .line 194
    invoke-static/range {v9 .. v17}, La/gxb;->a(La/gxb;ZIILa/v9k0;ZLjava/util/List;La/vxy;I)La/gxb;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-virtual {v0, v8}, La/g45;->j0(La/gxb;)V

    .line 199
    .line 200
    .line 201
    :cond_8
    iput-object v3, v4, La/mnf0;->l:Ljava/util/List;

    .line 202
    .line 203
    iput-byte v6, v4, La/mnf0;->i:B

    .line 204
    .line 205
    iput v2, v4, La/mnf0;->j:I

    .line 206
    .line 207
    iput v1, v4, La/mnf0;->k:I

    .line 208
    .line 209
    iput v7, v4, La/mnf0;->o:I

    .line 210
    .line 211
    invoke-virtual {v0, v3}, La/g45;->l0(Ljava/util/List;)Lkotlin/Unit;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-ne v0, v5, :cond_9

    .line 216
    .line 217
    :goto_3
    return-object v5

    .line 218
    :cond_9
    return-object v3
.end method

.method public b(La/rcl;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/iu;->a:La/g45;

    .line 2
    .line 3
    iget-object v0, v0, La/g45;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/gcl;

    .line 6
    .line 7
    instance-of v1, p2, La/hu;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    move-object v1, p2

    .line 12
    check-cast v1, La/hu;

    .line 13
    .line 14
    iget v2, v1, La/hu;->l:I

    .line 15
    .line 16
    const/high16 v3, -0x80000000

    .line 17
    .line 18
    and-int v4, v2, v3

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    sub-int/2addr v2, v3

    .line 23
    iput v2, v1, La/hu;->l:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v1, La/hu;

    .line 27
    .line 28
    invoke-direct {v1, p0, p2}, La/hu;-><init>(La/iu;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p0, v1, La/hu;->j:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object p2, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v2, v1, La/hu;->l:I

    .line 36
    .line 37
    const/4 v3, 0x5

    .line 38
    const/4 v4, 0x4

    .line 39
    const/4 v5, 0x3

    .line 40
    const/4 v6, 0x2

    .line 41
    const/4 v7, 0x1

    .line 42
    const/4 v8, 0x0

    .line 43
    if-eqz v2, :cond_6

    .line 44
    .line 45
    if-eq v2, v7, :cond_5

    .line 46
    .line 47
    if-eq v2, v6, :cond_4

    .line 48
    .line 49
    if-eq v2, v5, :cond_3

    .line 50
    .line 51
    if-eq v2, v4, :cond_2

    .line 52
    .line 53
    if-ne v2, v3, :cond_1

    .line 54
    .line 55
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 61
    .line 62
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    return-object v8

    .line 66
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto/16 :goto_9

    .line 70
    .line 71
    :cond_3
    iget-object p1, v1, La/hu;->i:La/rcl;

    .line 72
    .line 73
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_5

    .line 77
    .line 78
    :cond_4
    iget-object p1, v1, La/hu;->i:La/rcl;

    .line 79
    .line 80
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    iget-object p1, v1, La/hu;->i:La/rcl;

    .line 85
    .line 86
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iget-object p0, v0, La/gcl;->e:La/p7m0;

    .line 94
    .line 95
    new-instance v2, La/j2l;

    .line 96
    .line 97
    const/4 v9, 0x7

    .line 98
    invoke-direct {v2, v9}, La/j2l;-><init>(B)V

    .line 99
    .line 100
    .line 101
    sget-object v9, La/i120;->f:La/eoh0;

    .line 102
    .line 103
    invoke-static {v6, v2}, La/zys0;->e(ILjava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v9, v2}, La/i120;->X(La/gmq;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/rwk;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    iput-object p1, v1, La/hu;->i:La/rcl;

    .line 111
    .line 112
    iput v7, v1, La/hu;->l:I

    .line 113
    .line 114
    invoke-static {p0, v1}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-ne p0, p2, :cond_7

    .line 119
    .line 120
    goto/16 :goto_8

    .line 121
    .line 122
    :cond_7
    :goto_1
    check-cast p0, Ljava/util/Map;

    .line 123
    .line 124
    new-instance v2, La/oos0;

    .line 125
    .line 126
    invoke-virtual {p1}, La/rcl;->d()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v7

    .line 130
    invoke-direct {v2, v7}, La/oos0;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, La/yos0;

    .line 138
    .line 139
    instance-of p0, p0, La/ros0;

    .line 140
    .line 141
    if-eqz p0, :cond_8

    .line 142
    .line 143
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 144
    .line 145
    return-object p0

    .line 146
    :cond_8
    iget-object p0, v0, La/gcl;->f:La/p7m0;

    .line 147
    .line 148
    iput-object p1, v1, La/hu;->i:La/rcl;

    .line 149
    .line 150
    iput v6, v1, La/hu;->l:I

    .line 151
    .line 152
    invoke-static {p0, v1}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-ne p0, p2, :cond_9

    .line 157
    .line 158
    goto/16 :goto_8

    .line 159
    .line 160
    :cond_9
    :goto_2
    check-cast p0, Ljava/util/Map;

    .line 161
    .line 162
    invoke-virtual {p1}, La/rcl;->d()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, Ljava/io/File;

    .line 171
    .line 172
    if-eqz p0, :cond_c

    .line 173
    .line 174
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    invoke-virtual {p1}, La/rcl;->b()J

    .line 179
    .line 180
    .line 181
    move-result-wide v9

    .line 182
    cmp-long v2, v6, v9

    .line 183
    .line 184
    if-eqz v2, :cond_a

    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_a
    new-instance v2, La/wos0;

    .line 188
    .line 189
    new-instance v4, La/oos0;

    .line 190
    .line 191
    invoke-virtual {p1}, La/rcl;->d()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-direct {v4, p1}, La/oos0;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v2, v4, p0}, La/wos0;-><init>(La/qos0;Ljava/io/File;)V

    .line 199
    .line 200
    .line 201
    iput-object v8, v1, La/hu;->i:La/rcl;

    .line 202
    .line 203
    iput v3, v1, La/hu;->l:I

    .line 204
    .line 205
    invoke-virtual {v0, v2}, La/gcl;->e(La/yos0;)V

    .line 206
    .line 207
    .line 208
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    if-ne p0, p2, :cond_b

    .line 211
    .line 212
    goto :goto_8

    .line 213
    :cond_b
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    :cond_c
    :goto_4
    new-instance p0, La/ros0;

    .line 217
    .line 218
    new-instance v2, La/oos0;

    .line 219
    .line 220
    invoke-virtual {p1}, La/rcl;->d()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-direct {v2, v3}, La/oos0;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-direct {p0, v2}, La/ros0;-><init>(La/oos0;)V

    .line 228
    .line 229
    .line 230
    iput-object p1, v1, La/hu;->i:La/rcl;

    .line 231
    .line 232
    iput v5, v1, La/hu;->l:I

    .line 233
    .line 234
    invoke-virtual {v0, p0}, La/gcl;->e(La/yos0;)V

    .line 235
    .line 236
    .line 237
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    if-ne p0, p2, :cond_d

    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_d
    :goto_5
    iput-object v8, v1, La/hu;->i:La/rcl;

    .line 243
    .line 244
    iput v4, v1, La/hu;->l:I

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    sget-object p0, La/tvk;->a:La/rwj;

    .line 250
    .line 251
    sget-object p0, La/ys10;->a:La/vs10;

    .line 252
    .line 253
    new-instance v2, La/sxk;

    .line 254
    .line 255
    invoke-direct {v2, p1, v0, v8, v4}, La/sxk;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 256
    .line 257
    .line 258
    invoke-static {p0, v2, v1}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    if-ne p0, p2, :cond_e

    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    :goto_6
    if-ne p0, p2, :cond_f

    .line 268
    .line 269
    goto :goto_7

    .line 270
    :cond_f
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    :goto_7
    if-ne p0, p2, :cond_10

    .line 273
    .line 274
    :goto_8
    return-object p2

    .line 275
    :cond_10
    :goto_9
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    return-object p0
.end method
