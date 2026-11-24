.class public final La/mxb;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/yxb;


# direct methods
.method public synthetic constructor <init>(La/yxb;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/mxb;->i:B

    iput-object p1, p0, La/mxb;->k:La/yxb;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/mxb;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/mxb;->k:La/yxb;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/mxb;

    .line 9
    .line 10
    const/4 v0, 0x5

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/mxb;-><init>(La/yxb;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/mxb;

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/mxb;-><init>(La/yxb;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_1
    new-instance p1, La/mxb;

    .line 23
    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-direct {p1, p0, p2, v0}, La/mxb;-><init>(La/yxb;La/yje;B)V

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_2
    new-instance v0, La/mxb;

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    invoke-direct {v0, p0, p2, v1}, La/mxb;-><init>(La/yxb;La/yje;B)V

    .line 33
    .line 34
    .line 35
    check-cast p1, Ljava/lang/Boolean;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    iput-boolean p0, v0, La/mxb;->j:Z

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance p1, La/mxb;

    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    invoke-direct {p1, p0, p2, v0}, La/mxb;-><init>(La/yxb;La/yje;B)V

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_4
    new-instance p1, La/mxb;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    invoke-direct {p1, p0, p2, v0}, La/mxb;-><init>(La/yxb;La/yje;B)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/mxb;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/mxb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/mxb;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/mxb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/mxb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/mxb;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/mxb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/vne;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/mxb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/mxb;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/mxb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    check-cast p2, La/yje;

    .line 63
    .line 64
    invoke-virtual {p0, p1, p2}, La/mxb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, La/mxb;

    .line 69
    .line 70
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/mxb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_3
    check-cast p1, La/vne;

    .line 78
    .line 79
    check-cast p2, La/yje;

    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, La/mxb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    check-cast p0, La/mxb;

    .line 86
    .line 87
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/mxb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :pswitch_4
    check-cast p1, La/vne;

    .line 95
    .line 96
    check-cast p2, La/yje;

    .line 97
    .line 98
    invoke-virtual {p0, p1, p2}, La/mxb;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    check-cast p0, La/mxb;

    .line 103
    .line 104
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, La/mxb;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/mxb;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 5
    .line 6
    iget-object v3, p0, La/mxb;->k:La/yxb;

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v1, p0, La/mxb;->j:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    if-ne v1, v5, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v3, La/yxb;->b:La/frc;

    .line 33
    .line 34
    iput-boolean v5, p0, La/mxb;->j:Z

    .line 35
    .line 36
    invoke-virtual {p1, p0}, La/frc;->a(La/zje;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    if-ne p0, v0, :cond_2

    .line 41
    .line 42
    move-object v4, v0

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    :goto_0
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    :goto_1
    return-object v4

    .line 47
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 48
    .line 49
    iget-boolean v1, p0, La/mxb;->j:Z

    .line 50
    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    if-ne v1, v5, :cond_3

    .line 54
    .line 55
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iput-boolean v5, p0, La/mxb;->j:Z

    .line 67
    .line 68
    const-wide/16 v1, 0xbb8

    .line 69
    .line 70
    invoke-static {v1, v2, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v0, :cond_5

    .line 75
    .line 76
    move-object v4, v0

    .line 77
    goto :goto_3

    .line 78
    :cond_5
    :goto_2
    iget-object v0, v3, La/yxb;->o:La/p7m0;

    .line 79
    .line 80
    :cond_6
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    move-object p1, p0

    .line 85
    check-cast p1, Ljava/util/List;

    .line 86
    .line 87
    sget-object v1, La/ixb;->b:La/ixb;

    .line 88
    .line 89
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v0, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_6

    .line 102
    .line 103
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    :goto_3
    return-object v4

    .line 106
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 107
    .line 108
    iget-boolean v1, p0, La/mxb;->j:Z

    .line 109
    .line 110
    const/16 v6, 0x3c

    .line 111
    .line 112
    if-eqz v1, :cond_8

    .line 113
    .line 114
    if-ne v1, v5, :cond_7

    .line 115
    .line 116
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_6

    .line 124
    .line 125
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, v3, La/yxb;->e:La/qv;

    .line 129
    .line 130
    iput-boolean v5, p0, La/mxb;->j:Z

    .line 131
    .line 132
    invoke-virtual {p1, v6, p0}, La/qv;->a(ILa/zje;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    if-ne p1, v0, :cond_9

    .line 137
    .line 138
    move-object v4, v0

    .line 139
    goto :goto_6

    .line 140
    :cond_9
    :goto_4
    check-cast p1, Ljava/util/List;

    .line 141
    .line 142
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result p0

    .line 146
    if-ge p0, v6, :cond_a

    .line 147
    .line 148
    iput-boolean v5, v3, La/yxb;->B:Z

    .line 149
    .line 150
    :cond_a
    iput-boolean v5, v3, La/yxb;->C:Z

    .line 151
    .line 152
    iget-object p0, v3, La/yxb;->x:La/c4m0;

    .line 153
    .line 154
    if-eqz p0, :cond_b

    .line 155
    .line 156
    invoke-virtual {p0}, La/pby;->isActive()Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    if-ne p0, v5, :cond_b

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_b
    iget-object p0, v3, La/yxb;->d:La/jcl;

    .line 164
    .line 165
    iget-object p0, p0, La/jcl;->a:La/g45;

    .line 166
    .line 167
    iget-object v0, p0, La/g45;->c:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v0, La/i7e;

    .line 170
    .line 171
    iget-object v0, v0, La/i7e;->g:La/p7m0;

    .line 172
    .line 173
    new-instance v1, La/c00;

    .line 174
    .line 175
    const/16 v2, 0x19

    .line 176
    .line 177
    invoke-direct {v1, v0, p0, v2}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 178
    .line 179
    .line 180
    new-instance p0, La/eu4;

    .line 181
    .line 182
    const/16 v0, 0xe

    .line 183
    .line 184
    invoke-direct {p0, v1, v0}, La/eu4;-><init>(Ljava/lang/Object;B)V

    .line 185
    .line 186
    .line 187
    new-instance v0, La/i89;

    .line 188
    .line 189
    const/16 v1, 0x16

    .line 190
    .line 191
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {v0}, La/i120;->W(La/gmq;)La/gmq;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    new-instance v0, La/wib;

    .line 199
    .line 200
    const/4 v1, 0x4

    .line 201
    invoke-direct {v0, v3, v4, v1}, La/wib;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 202
    .line 203
    .line 204
    new-instance v2, La/fnq;

    .line 205
    .line 206
    invoke-direct {v2, p0, v0, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 207
    .line 208
    .line 209
    new-instance p0, La/lo3;

    .line 210
    .line 211
    const/4 v0, 0x3

    .line 212
    const/4 v1, 0x7

    .line 213
    invoke-direct {p0, v0, v4, v1}, La/lo3;-><init>(ILa/yje;B)V

    .line 214
    .line 215
    .line 216
    new-instance v0, La/dnq;

    .line 217
    .line 218
    invoke-direct {v0, v2, p0, v5}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 219
    .line 220
    .line 221
    iget-object p0, v3, La/yxb;->n:La/sje;

    .line 222
    .line 223
    invoke-static {v0, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    iput-object p0, v3, La/yxb;->x:La/c4m0;

    .line 228
    .line 229
    :goto_5
    iput-object v4, v3, La/yxb;->s:Lkotlin/jvm/functions/Function0;

    .line 230
    .line 231
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    if-eqz p0, :cond_c

    .line 236
    .line 237
    invoke-virtual {v3}, La/yxb;->a()V

    .line 238
    .line 239
    .line 240
    :cond_c
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    :goto_6
    return-object v4

    .line 243
    :pswitch_2
    iget-boolean p0, p0, La/mxb;->j:Z

    .line 244
    .line 245
    sget-object v0, La/wne;->a:La/wne;

    .line 246
    .line 247
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iput-boolean p0, v3, La/yxb;->u:Z

    .line 251
    .line 252
    iput-boolean v1, v3, La/yxb;->B:Z

    .line 253
    .line 254
    if-eqz p0, :cond_f

    .line 255
    .line 256
    iget-object p0, v3, La/yxb;->s:Lkotlin/jvm/functions/Function0;

    .line 257
    .line 258
    if-eqz p0, :cond_d

    .line 259
    .line 260
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    :cond_d
    iget-object p0, v3, La/yxb;->s:Lkotlin/jvm/functions/Function0;

    .line 264
    .line 265
    if-nez p0, :cond_f

    .line 266
    .line 267
    iget-object p0, v3, La/yxb;->z:La/bby;

    .line 268
    .line 269
    if-eqz p0, :cond_e

    .line 270
    .line 271
    invoke-interface {p0}, La/bby;->isActive()Z

    .line 272
    .line 273
    .line 274
    move-result p0

    .line 275
    if-ne p0, v5, :cond_e

    .line 276
    .line 277
    goto :goto_7

    .line 278
    :cond_e
    iget-object v6, v3, La/yxb;->n:La/sje;

    .line 279
    .line 280
    sget-object v7, La/xxb;->a:La/xxb;

    .line 281
    .line 282
    new-instance v10, La/mxb;

    .line 283
    .line 284
    const/4 p0, 0x5

    .line 285
    invoke-direct {v10, v3, v4, p0}, La/mxb;-><init>(La/yxb;La/yje;B)V

    .line 286
    .line 287
    .line 288
    const/16 v11, 0xe

    .line 289
    .line 290
    const/4 v8, 0x0

    .line 291
    const/4 v9, 0x0

    .line 292
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    iput-object p0, v3, La/yxb;->z:La/bby;

    .line 297
    .line 298
    :cond_f
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object p0

    .line 301
    :pswitch_3
    sget-object v0, La/wne;->a:La/wne;

    .line 302
    .line 303
    iget-boolean v1, p0, La/mxb;->j:Z

    .line 304
    .line 305
    if-eqz v1, :cond_11

    .line 306
    .line 307
    if-ne v1, v5, :cond_10

    .line 308
    .line 309
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto :goto_8

    .line 313
    :cond_10
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 314
    .line 315
    .line 316
    goto :goto_9

    .line 317
    :cond_11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    iget-object p1, v3, La/yxb;->f:La/vpc;

    .line 321
    .line 322
    iget-object p1, p1, La/vpc;->a:La/g45;

    .line 323
    .line 324
    iget-object v1, p1, La/g45;->b:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v1, La/vae;

    .line 327
    .line 328
    iget-object v1, v1, La/vae;->g:La/qoj0;

    .line 329
    .line 330
    new-instance v2, La/w7e;

    .line 331
    .line 332
    invoke-direct {v2, v1, p1, v5}, La/w7e;-><init>(La/qoj0;La/g45;B)V

    .line 333
    .line 334
    .line 335
    new-instance p1, La/f5b;

    .line 336
    .line 337
    const/16 v1, 0x18

    .line 338
    .line 339
    invoke-direct {p1, v3, v1}, La/f5b;-><init>(Ljava/lang/Object;B)V

    .line 340
    .line 341
    .line 342
    iput-boolean v5, p0, La/mxb;->j:Z

    .line 343
    .line 344
    invoke-virtual {v2, p1, p0}, La/w7e;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    if-ne p0, v0, :cond_12

    .line 349
    .line 350
    move-object v4, v0

    .line 351
    goto :goto_9

    .line 352
    :cond_12
    :goto_8
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 353
    .line 354
    :goto_9
    return-object v4

    .line 355
    :pswitch_4
    sget-object v0, La/wne;->a:La/wne;

    .line 356
    .line 357
    iget-boolean v6, p0, La/mxb;->j:Z

    .line 358
    .line 359
    if-eqz v6, :cond_14

    .line 360
    .line 361
    if-ne v6, v5, :cond_13

    .line 362
    .line 363
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    goto :goto_b

    .line 367
    :cond_13
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 372
    .line 373
    .line 374
    iget-object p1, v3, La/yxb;->k:La/frc;

    .line 375
    .line 376
    iput-boolean v5, p0, La/mxb;->j:Z

    .line 377
    .line 378
    iget-object p0, p1, La/frc;->a:La/g45;

    .line 379
    .line 380
    invoke-virtual {p0, v4}, La/g45;->l0(Ljava/util/List;)Lkotlin/Unit;

    .line 381
    .line 382
    .line 383
    move-result-object p0

    .line 384
    if-ne p0, v0, :cond_15

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 388
    .line 389
    :goto_a
    if-ne p0, v0, :cond_16

    .line 390
    .line 391
    move-object v4, v0

    .line 392
    goto :goto_c

    .line 393
    :cond_16
    :goto_b
    iget-object p0, v3, La/yxb;->r:La/jxb;

    .line 394
    .line 395
    iput v1, p0, La/jxb;->a:I

    .line 396
    .line 397
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    :goto_c
    return-object v4

    .line 400
    nop

    .line 401
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
