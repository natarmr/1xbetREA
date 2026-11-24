.class public final La/sjf0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:I

.field public final synthetic l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/v9v0;La/tcj;Ljava/util/List;IILa/cgk0;La/cgk0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/sjf0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/sjf0;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/sjf0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/sjf0;->j:Ljava/lang/Object;

    .line 9
    .line 10
    iput p4, p0, La/sjf0;->k:I

    .line 11
    .line 12
    iput p5, p0, La/sjf0;->l:I

    .line 13
    .line 14
    iput-object p6, p0, La/sjf0;->o:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p7, p0, La/sjf0;->p:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Ljava/util/List;IILa/v9v0;La/tcj;La/cgk0;La/cgk0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/sjf0;->i:B

    .line 23
    iput-object p1, p0, La/sjf0;->j:Ljava/lang/Object;

    iput p2, p0, La/sjf0;->k:I

    iput p3, p0, La/sjf0;->l:I

    iput-object p4, p0, La/sjf0;->m:Ljava/lang/Object;

    iput-object p5, p0, La/sjf0;->n:Ljava/lang/Object;

    iput-object p6, p0, La/sjf0;->o:Ljava/lang/Object;

    iput-object p7, p0, La/sjf0;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/ranges/IntRange;IILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/sjf0;->i:B

    .line 24
    iput-object p1, p0, La/sjf0;->n:Ljava/lang/Object;

    iput p2, p0, La/sjf0;->k:I

    iput p3, p0, La/sjf0;->l:I

    iput-object p4, p0, La/sjf0;->j:Ljava/lang/Object;

    iput-object p5, p0, La/sjf0;->o:Ljava/lang/Object;

    iput-object p6, p0, La/sjf0;->p:Ljava/lang/Object;

    invoke-direct {p0, v0, p7}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sjf0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/sjf0;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, v0, La/sjf0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/sjf0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/sjf0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    new-instance v6, La/sjf0;

    .line 17
    .line 18
    move-object v7, v5

    .line 19
    check-cast v7, Lkotlin/ranges/IntRange;

    .line 20
    .line 21
    move-object v10, v4

    .line 22
    check-cast v10, Ljava/lang/String;

    .line 23
    .line 24
    move-object v11, v3

    .line 25
    check-cast v11, Ljava/lang/String;

    .line 26
    .line 27
    move-object v12, v2

    .line 28
    check-cast v12, Ljava/util/ArrayList;

    .line 29
    .line 30
    iget v8, v0, La/sjf0;->k:I

    .line 31
    .line 32
    iget v9, v0, La/sjf0;->l:I

    .line 33
    .line 34
    move-object/from16 v13, p2

    .line 35
    .line 36
    invoke-direct/range {v6 .. v13}, La/sjf0;-><init>(Lkotlin/ranges/IntRange;IILjava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/yje;)V

    .line 37
    .line 38
    .line 39
    move-object/from16 v0, p1

    .line 40
    .line 41
    iput-object v0, v6, La/sjf0;->m:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v6

    .line 44
    :pswitch_0
    new-instance v7, La/sjf0;

    .line 45
    .line 46
    move-object v8, v4

    .line 47
    check-cast v8, Ljava/util/List;

    .line 48
    .line 49
    iget-object v1, v0, La/sjf0;->m:Ljava/lang/Object;

    .line 50
    .line 51
    move-object v11, v1

    .line 52
    check-cast v11, La/v9v0;

    .line 53
    .line 54
    move-object v12, v5

    .line 55
    check-cast v12, La/tcj;

    .line 56
    .line 57
    move-object v13, v3

    .line 58
    check-cast v13, La/cgk0;

    .line 59
    .line 60
    move-object v14, v2

    .line 61
    check-cast v14, La/cgk0;

    .line 62
    .line 63
    iget v9, v0, La/sjf0;->k:I

    .line 64
    .line 65
    iget v10, v0, La/sjf0;->l:I

    .line 66
    .line 67
    move-object/from16 v15, p2

    .line 68
    .line 69
    invoke-direct/range {v7 .. v15}, La/sjf0;-><init>(Ljava/util/List;IILa/v9v0;La/tcj;La/cgk0;La/cgk0;La/yje;)V

    .line 70
    .line 71
    .line 72
    return-object v7

    .line 73
    :pswitch_1
    new-instance v7, La/sjf0;

    .line 74
    .line 75
    iget-object v1, v0, La/sjf0;->m:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v8, v1

    .line 78
    check-cast v8, La/v9v0;

    .line 79
    .line 80
    move-object v9, v5

    .line 81
    check-cast v9, La/tcj;

    .line 82
    .line 83
    move-object v10, v4

    .line 84
    check-cast v10, Ljava/util/List;

    .line 85
    .line 86
    move-object v13, v3

    .line 87
    check-cast v13, La/cgk0;

    .line 88
    .line 89
    move-object v14, v2

    .line 90
    check-cast v14, La/cgk0;

    .line 91
    .line 92
    iget v11, v0, La/sjf0;->k:I

    .line 93
    .line 94
    iget v12, v0, La/sjf0;->l:I

    .line 95
    .line 96
    move-object/from16 v15, p2

    .line 97
    .line 98
    invoke-direct/range {v7 .. v15}, La/sjf0;-><init>(La/v9v0;La/tcj;Ljava/util/List;IILa/cgk0;La/cgk0;La/yje;)V

    .line 99
    .line 100
    .line 101
    return-object v7

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/sjf0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/sjf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/sjf0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/sjf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/sjf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/sjf0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/sjf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/sjf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/sjf0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/sjf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sjf0;->i:B

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, v0, La/sjf0;->p:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, v0, La/sjf0;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, v0, La/sjf0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    iget v7, v0, La/sjf0;->l:I

    .line 13
    .line 14
    iget v8, v0, La/sjf0;->k:I

    .line 15
    .line 16
    iget-object v9, v0, La/sjf0;->n:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    iget-object v0, v0, La/sjf0;->m:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, La/vne;

    .line 24
    .line 25
    sget-object v1, La/wne;->a:La/wne;

    .line 26
    .line 27
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    check-cast v9, Lkotlin/ranges/IntRange;

    .line 31
    .line 32
    check-cast v6, Ljava/lang/String;

    .line 33
    .line 34
    check-cast v5, Ljava/lang/String;

    .line 35
    .line 36
    move-object v12, v4

    .line 37
    check-cast v12, Ljava/util/ArrayList;

    .line 38
    .line 39
    const-string v1, "SHA-512"

    .line 40
    .line 41
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget v4, v9, Lkotlin/ranges/a;->a:I

    .line 46
    .line 47
    new-array v8, v8, [I

    .line 48
    .line 49
    invoke-static {v8}, La/tx3;->C([I)Lkotlin/ranges/IntRange;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    invoke-static {v10}, La/l1e0;->k(Lkotlin/ranges/IntRange;)Lkotlin/ranges/a;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    iget v11, v10, Lkotlin/ranges/a;->c:I

    .line 58
    .line 59
    iget v13, v10, Lkotlin/ranges/a;->b:I

    .line 60
    .line 61
    iget v10, v10, Lkotlin/ranges/a;->a:I

    .line 62
    .line 63
    const/4 v14, 0x2

    .line 64
    invoke-static {v14, v5}, La/ttm0;->G(ILjava/lang/CharSequence;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    sget-object v14, La/z1w0;->b:Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    new-instance v15, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v16

    .line 83
    if-eqz v16, :cond_1

    .line 84
    .line 85
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v16

    .line 89
    const/16 v18, 0x1

    .line 90
    .line 91
    move-object/from16 v2, v16

    .line 92
    .line 93
    check-cast v2, Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v14, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    check-cast v2, La/p1t0;

    .line 100
    .line 101
    if-eqz v2, :cond_0

    .line 102
    .line 103
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    const/16 v18, 0x1

    .line 108
    .line 109
    new-array v2, v3, [La/p1t0;

    .line 110
    .line 111
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, [La/p1t0;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    array-length v5, v2

    .line 121
    new-array v14, v5, [B

    .line 122
    .line 123
    move v15, v3

    .line 124
    :goto_1
    if-ge v15, v5, :cond_2

    .line 125
    .line 126
    aget-object v3, v2, v15

    .line 127
    .line 128
    iget-byte v3, v3, La/p1t0;->a:B

    .line 129
    .line 130
    aput-byte v3, v14, v15

    .line 131
    .line 132
    add-int/lit8 v15, v15, 0x1

    .line 133
    .line 134
    const/4 v3, 0x0

    .line 135
    goto :goto_1

    .line 136
    :cond_2
    if-lez v11, :cond_3

    .line 137
    .line 138
    if-le v10, v13, :cond_4

    .line 139
    .line 140
    :cond_3
    if-gez v11, :cond_5

    .line 141
    .line 142
    if-gt v13, v10, :cond_5

    .line 143
    .line 144
    :cond_4
    move v2, v10

    .line 145
    :goto_2
    rem-int v3, v4, v7

    .line 146
    .line 147
    aput v3, v8, v2

    .line 148
    .line 149
    div-int/2addr v4, v7

    .line 150
    if-eq v2, v13, :cond_5

    .line 151
    .line 152
    add-int/2addr v2, v11

    .line 153
    goto :goto_2

    .line 154
    :cond_5
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->M(Ljava/lang/Iterable;)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    const/4 v3, 0x0

    .line 159
    :goto_3
    const-string v4, ""

    .line 160
    .line 161
    if-ge v3, v2, :cond_c

    .line 162
    .line 163
    invoke-static {v0}, La/d5c;->R(La/vne;)Z

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-nez v5, :cond_6

    .line 168
    .line 169
    goto/16 :goto_6

    .line 170
    .line 171
    :cond_6
    move v5, v10

    .line 172
    new-instance v10, La/prc0;

    .line 173
    .line 174
    const/16 v16, 0x0

    .line 175
    .line 176
    const/16 v17, 0x7

    .line 177
    .line 178
    move v9, v11

    .line 179
    const/4 v11, 0x1

    .line 180
    move v15, v13

    .line 181
    const-class v13, Ljava/util/List;

    .line 182
    .line 183
    move-object/from16 v19, v14

    .line 184
    .line 185
    const-string v14, "get"

    .line 186
    .line 187
    move/from16 v20, v15

    .line 188
    .line 189
    const-string v15, "get(I)Ljava/lang/Object;"

    .line 190
    .line 191
    move-object/from16 p0, v0

    .line 192
    .line 193
    move/from16 p1, v2

    .line 194
    .line 195
    move-object/from16 v2, v19

    .line 196
    .line 197
    move/from16 v0, v20

    .line 198
    .line 199
    invoke-direct/range {v10 .. v17}, La/prc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 200
    .line 201
    .line 202
    const/16 v11, 0x1e

    .line 203
    .line 204
    invoke-static {v8, v4, v10, v11}, La/tx3;->M([ILjava/lang/String;La/prc0;I)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    const-string v10, "$"

    .line 209
    .line 210
    invoke-static {v6, v10, v4}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v10

    .line 214
    sget-object v11, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 215
    .line 216
    invoke-virtual {v10, v11}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 217
    .line 218
    .line 219
    move-result-object v10

    .line 220
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v10}, Ljava/security/MessageDigest;->digest([B)[B

    .line 224
    .line 225
    .line 226
    move-result-object v10

    .line 227
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    array-length v11, v10

    .line 231
    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 232
    .line 233
    .line 234
    move-result-object v10

    .line 235
    invoke-static {v10, v2}, Ljava/util/Arrays;->equals([B[B)Z

    .line 236
    .line 237
    .line 238
    move-result v10

    .line 239
    if-eqz v10, :cond_7

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_7
    if-lez v9, :cond_8

    .line 243
    .line 244
    if-le v5, v0, :cond_9

    .line 245
    .line 246
    :cond_8
    if-gez v9, :cond_b

    .line 247
    .line 248
    if-gt v0, v5, :cond_b

    .line 249
    .line 250
    :cond_9
    move v10, v5

    .line 251
    :goto_4
    aget v4, v8, v10

    .line 252
    .line 253
    add-int/lit8 v4, v4, 0x1

    .line 254
    .line 255
    rem-int/2addr v4, v7

    .line 256
    aput v4, v8, v10

    .line 257
    .line 258
    if-eqz v4, :cond_a

    .line 259
    .line 260
    goto :goto_5

    .line 261
    :cond_a
    if-eq v10, v0, :cond_b

    .line 262
    .line 263
    add-int/2addr v10, v9

    .line 264
    goto :goto_4

    .line 265
    :cond_b
    :goto_5
    add-int/lit8 v3, v3, 0x1

    .line 266
    .line 267
    move v13, v0

    .line 268
    move-object v14, v2

    .line 269
    move v10, v5

    .line 270
    move v11, v9

    .line 271
    move-object/from16 v0, p0

    .line 272
    .line 273
    move/from16 v2, p1

    .line 274
    .line 275
    goto :goto_3

    .line 276
    :cond_c
    :goto_6
    return-object v4

    .line 277
    :pswitch_0
    const/16 v18, 0x1

    .line 278
    .line 279
    check-cast v4, La/cgk0;

    .line 280
    .line 281
    check-cast v5, La/cgk0;

    .line 282
    .line 283
    check-cast v9, La/tcj;

    .line 284
    .line 285
    iget-object v0, v0, La/sjf0;->m:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, La/v9v0;

    .line 288
    .line 289
    sget-object v1, La/wne;->a:La/wne;

    .line 290
    .line 291
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 292
    .line 293
    .line 294
    check-cast v6, Ljava/util/List;

    .line 295
    .line 296
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    check-cast v1, La/t9v0;

    .line 301
    .line 302
    iget-boolean v1, v1, La/t9v0;->e:Z

    .line 303
    .line 304
    if-nez v1, :cond_1b

    .line 305
    .line 306
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    check-cast v1, La/t9v0;

    .line 311
    .line 312
    iget-boolean v1, v1, La/t9v0;->e:Z

    .line 313
    .line 314
    if-eqz v1, :cond_d

    .line 315
    .line 316
    goto/16 :goto_c

    .line 317
    .line 318
    :cond_d
    iget-object v1, v0, La/v9v0;->a:Ljava/util/List;

    .line 319
    .line 320
    iget-object v2, v0, La/v9v0;->a:Ljava/util/List;

    .line 321
    .line 322
    invoke-virtual {v5}, La/cgk0;->l()I

    .line 323
    .line 324
    .line 325
    move-result v3

    .line 326
    invoke-static {v2}, La/q3d;->i(Ljava/util/List;)I

    .line 327
    .line 328
    .line 329
    move-result v10

    .line 330
    const/4 v11, 0x0

    .line 331
    invoke-static {v3, v11, v10}, La/l1e0;->d(III)I

    .line 332
    .line 333
    .line 334
    move-result v3

    .line 335
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    check-cast v1, La/u9v0;

    .line 340
    .line 341
    iget-object v1, v1, La/u9v0;->c:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v1, Ljava/lang/Number;

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    invoke-static {v9}, La/up90;->e(La/tcj;)Z

    .line 350
    .line 351
    .line 352
    move-result v3

    .line 353
    if-eqz v3, :cond_e

    .line 354
    .line 355
    invoke-static {v6, v8, v0, v9}, La/wdx;->A(Ljava/util/List;ILa/v9v0;La/tcj;)V

    .line 356
    .line 357
    .line 358
    invoke-static {v9, v6, v7, v1}, La/wdx;->z(La/tcj;Ljava/util/List;II)V

    .line 359
    .line 360
    .line 361
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    goto/16 :goto_d

    .line 364
    .line 365
    :cond_e
    invoke-virtual {v4}, La/cgk0;->l()I

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    add-int/lit8 v3, v3, 0x1

    .line 370
    .line 371
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 372
    .line 373
    .line 374
    move-result-object v10

    .line 375
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 376
    .line 377
    .line 378
    move-result-object v11

    .line 379
    new-instance v12, Lkotlin/Pair;

    .line 380
    .line 381
    invoke-direct {v12, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    iget-object v10, v9, La/tcj;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 385
    .line 386
    if-eqz v10, :cond_10

    .line 387
    .line 388
    iget v11, v10, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->b:I

    .line 389
    .line 390
    iget v10, v10, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 391
    .line 392
    if-lt v1, v10, :cond_f

    .line 393
    .line 394
    if-ne v1, v10, :cond_10

    .line 395
    .line 396
    if-ge v3, v11, :cond_10

    .line 397
    .line 398
    :cond_f
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v10

    .line 402
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 403
    .line 404
    .line 405
    move-result-object v11

    .line 406
    new-instance v12, Lkotlin/Pair;

    .line 407
    .line 408
    invoke-direct {v12, v10, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    :cond_10
    iget-object v10, v9, La/tcj;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 412
    .line 413
    if-eqz v10, :cond_12

    .line 414
    .line 415
    iget v11, v10, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->b:I

    .line 416
    .line 417
    iget v10, v10, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 418
    .line 419
    if-gt v1, v10, :cond_11

    .line 420
    .line 421
    if-ne v1, v10, :cond_12

    .line 422
    .line 423
    if-le v3, v11, :cond_12

    .line 424
    .line 425
    :cond_11
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    .line 427
    .line 428
    move-result-object v1

    .line 429
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 430
    .line 431
    .line 432
    move-result-object v3

    .line 433
    new-instance v12, Lkotlin/Pair;

    .line 434
    .line 435
    invoke-direct {v12, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    :cond_12
    iget-object v1, v12, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v1, Ljava/lang/Number;

    .line 441
    .line 442
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 443
    .line 444
    .line 445
    move-result v1

    .line 446
    iget-object v3, v12, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 447
    .line 448
    check-cast v3, Ljava/lang/Number;

    .line 449
    .line 450
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 451
    .line 452
    .line 453
    move-result v3

    .line 454
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v10

    .line 458
    check-cast v10, La/u9v0;

    .line 459
    .line 460
    if-eqz v10, :cond_13

    .line 461
    .line 462
    iget-object v10, v10, La/u9v0;->c:Ljava/lang/Object;

    .line 463
    .line 464
    check-cast v10, Ljava/lang/Integer;

    .line 465
    .line 466
    goto :goto_7

    .line 467
    :cond_13
    const/4 v10, 0x0

    .line 468
    :goto_7
    if-eqz v10, :cond_17

    .line 469
    .line 470
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 471
    .line 472
    .line 473
    move-result v10

    .line 474
    sub-int v10, v1, v10

    .line 475
    .line 476
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v11

    .line 480
    check-cast v11, La/t9v0;

    .line 481
    .line 482
    iget-object v11, v11, La/t9v0;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 483
    .line 484
    invoke-virtual {v11}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 485
    .line 486
    .line 487
    move-result v11

    .line 488
    add-int/lit8 v11, v11, -0x1

    .line 489
    .line 490
    const/4 v12, 0x0

    .line 491
    invoke-static {v10, v12, v11}, La/l1e0;->d(III)I

    .line 492
    .line 493
    .line 494
    move-result v10

    .line 495
    invoke-static {v10, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v11

    .line 499
    check-cast v11, La/u9v0;

    .line 500
    .line 501
    if-eqz v11, :cond_14

    .line 502
    .line 503
    iget-object v11, v11, La/u9v0;->c:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v11, Ljava/lang/Number;

    .line 506
    .line 507
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 508
    .line 509
    .line 510
    move-result v11

    .line 511
    if-ne v11, v1, :cond_14

    .line 512
    .line 513
    const/4 v11, 0x0

    .line 514
    goto :goto_a

    .line 515
    :cond_14
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 516
    .line 517
    .line 518
    move-result-object v2

    .line 519
    const/4 v10, 0x0

    .line 520
    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 521
    .line 522
    .line 523
    move-result v11

    .line 524
    if-eqz v11, :cond_16

    .line 525
    .line 526
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    move-result-object v11

    .line 530
    check-cast v11, La/u9v0;

    .line 531
    .line 532
    iget-object v11, v11, La/u9v0;->c:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v11, Ljava/lang/Number;

    .line 535
    .line 536
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result v11

    .line 540
    if-ne v11, v1, :cond_15

    .line 541
    .line 542
    goto :goto_9

    .line 543
    :cond_15
    add-int/lit8 v10, v10, 0x1

    .line 544
    .line 545
    goto :goto_8

    .line 546
    :cond_16
    const/4 v10, -0x1

    .line 547
    :goto_9
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    check-cast v2, La/t9v0;

    .line 552
    .line 553
    iget-object v2, v2, La/t9v0;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 554
    .line 555
    invoke-virtual {v2}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 556
    .line 557
    .line 558
    move-result v2

    .line 559
    add-int/lit8 v2, v2, -0x1

    .line 560
    .line 561
    const/4 v11, 0x0

    .line 562
    invoke-static {v10, v11, v2}, La/l1e0;->d(III)I

    .line 563
    .line 564
    .line 565
    move-result v16

    .line 566
    move/from16 v10, v16

    .line 567
    .line 568
    goto :goto_a

    .line 569
    :cond_17
    const/4 v11, 0x0

    .line 570
    move v10, v11

    .line 571
    :goto_a
    add-int/lit8 v2, v3, -0x1

    .line 572
    .line 573
    const/16 v12, 0xb

    .line 574
    .line 575
    invoke-static {v2, v11, v12}, La/l1e0;->d(III)I

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    invoke-static {v9, v6, v7, v1}, La/wdx;->z(La/tcj;Ljava/util/List;II)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v5}, La/cgk0;->l()I

    .line 583
    .line 584
    .line 585
    move-result v5

    .line 586
    if-eq v10, v5, :cond_18

    .line 587
    .line 588
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v5

    .line 592
    check-cast v5, La/t9v0;

    .line 593
    .line 594
    iget-object v5, v5, La/t9v0;->d:La/okt0;

    .line 595
    .line 596
    invoke-virtual {v5, v10}, La/okt0;->i(I)V

    .line 597
    .line 598
    .line 599
    move/from16 v16, v18

    .line 600
    .line 601
    goto :goto_b

    .line 602
    :cond_18
    const/16 v16, 0x0

    .line 603
    .line 604
    :goto_b
    invoke-static {v6, v8, v0, v9}, La/wdx;->A(Ljava/util/List;ILa/v9v0;La/tcj;)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v4}, La/cgk0;->l()I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-eq v2, v0, :cond_19

    .line 612
    .line 613
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    check-cast v0, La/t9v0;

    .line 618
    .line 619
    iget-object v0, v0, La/t9v0;->d:La/okt0;

    .line 620
    .line 621
    invoke-virtual {v0, v2}, La/okt0;->i(I)V

    .line 622
    .line 623
    .line 624
    move/from16 v16, v18

    .line 625
    .line 626
    :cond_19
    if-eqz v16, :cond_1a

    .line 627
    .line 628
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 629
    .line 630
    goto :goto_d

    .line 631
    :cond_1a
    iget-object v0, v9, La/tcj;->c:Lkotlin/jvm/functions/Function1;

    .line 632
    .line 633
    new-instance v2, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 634
    .line 635
    move/from16 v4, v18

    .line 636
    .line 637
    invoke-direct {v2, v1, v3, v4}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;-><init>(III)V

    .line 638
    .line 639
    .line 640
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 644
    .line 645
    goto :goto_d

    .line 646
    :cond_1b
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 647
    .line 648
    :goto_d
    return-object v0

    .line 649
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 650
    .line 651
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    check-cast v6, Ljava/util/List;

    .line 655
    .line 656
    iget-object v0, v0, La/sjf0;->m:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v0, La/v9v0;

    .line 659
    .line 660
    check-cast v9, La/tcj;

    .line 661
    .line 662
    invoke-static {v6, v8, v0, v9}, La/wdx;->A(Ljava/util/List;ILa/v9v0;La/tcj;)V

    .line 663
    .line 664
    .line 665
    iget-object v1, v0, La/v9v0;->a:Ljava/util/List;

    .line 666
    .line 667
    check-cast v5, La/cgk0;

    .line 668
    .line 669
    invoke-virtual {v5}, La/cgk0;->l()I

    .line 670
    .line 671
    .line 672
    move-result v2

    .line 673
    iget-object v0, v0, La/v9v0;->a:Ljava/util/List;

    .line 674
    .line 675
    invoke-static {v0}, La/q3d;->i(Ljava/util/List;)I

    .line 676
    .line 677
    .line 678
    move-result v0

    .line 679
    const/4 v11, 0x0

    .line 680
    invoke-static {v2, v11, v0}, La/l1e0;->d(III)I

    .line 681
    .line 682
    .line 683
    move-result v0

    .line 684
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    check-cast v0, La/u9v0;

    .line 689
    .line 690
    iget-object v0, v0, La/u9v0;->c:Ljava/lang/Object;

    .line 691
    .line 692
    check-cast v0, Ljava/lang/Number;

    .line 693
    .line 694
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 695
    .line 696
    .line 697
    move-result v0

    .line 698
    invoke-static {v9, v6, v7, v0}, La/wdx;->z(La/tcj;Ljava/util/List;II)V

    .line 699
    .line 700
    .line 701
    invoke-static {v9}, La/up90;->e(La/tcj;)Z

    .line 702
    .line 703
    .line 704
    move-result v0

    .line 705
    if-eqz v0, :cond_1c

    .line 706
    .line 707
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 708
    .line 709
    goto :goto_e

    .line 710
    :cond_1c
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    check-cast v0, La/t9v0;

    .line 715
    .line 716
    iget-object v0, v0, La/t9v0;->d:La/okt0;

    .line 717
    .line 718
    invoke-virtual {v5}, La/cgk0;->l()I

    .line 719
    .line 720
    .line 721
    move-result v1

    .line 722
    invoke-virtual {v0, v1}, La/okt0;->i(I)V

    .line 723
    .line 724
    .line 725
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    check-cast v0, La/t9v0;

    .line 730
    .line 731
    iget-object v0, v0, La/t9v0;->d:La/okt0;

    .line 732
    .line 733
    check-cast v4, La/cgk0;

    .line 734
    .line 735
    invoke-virtual {v4}, La/cgk0;->l()I

    .line 736
    .line 737
    .line 738
    move-result v1

    .line 739
    invoke-virtual {v0, v1}, La/okt0;->i(I)V

    .line 740
    .line 741
    .line 742
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 743
    .line 744
    :goto_e
    return-object v0

    .line 745
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
