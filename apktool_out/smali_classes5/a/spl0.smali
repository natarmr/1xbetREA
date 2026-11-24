.class public final La/spl0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/xpl0;


# direct methods
.method public synthetic constructor <init>(La/xpl0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/spl0;->i:B

    iput-object p1, p0, La/spl0;->k:La/xpl0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/spl0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/spl0;->k:La/xpl0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/spl0;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/spl0;-><init>(La/xpl0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/spl0;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {p1, p0, p2, v0}, La/spl0;-><init>(La/xpl0;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/spl0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/spl0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/spl0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/spl0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/spl0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/spl0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/spl0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/spl0;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    iget-object v5, v0, La/spl0;->k:La/xpl0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v6, v0, La/spl0;->j:Z

    .line 17
    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    if-ne v6, v4, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v2, v5, La/xpl0;->F:La/m1e;

    .line 34
    .line 35
    invoke-interface {v2}, La/m1e;->a()La/gmq;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, La/i6k0;

    .line 40
    .line 41
    const/16 v6, 0x17

    .line 42
    .line 43
    invoke-direct {v3, v5, v6}, La/i6k0;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    iput-boolean v4, v0, La/spl0;->j:Z

    .line 47
    .line 48
    invoke-interface {v2, v3, v0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    if-ne v0, v1, :cond_2

    .line 53
    .line 54
    move-object v2, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    :goto_0
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    :goto_1
    return-object v2

    .line 59
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 60
    .line 61
    iget-boolean v6, v0, La/spl0;->j:Z

    .line 62
    .line 63
    if-eqz v6, :cond_4

    .line 64
    .line 65
    if-ne v6, v4, :cond_3

    .line 66
    .line 67
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    move-object/from16 v0, p1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    goto/16 :goto_6

    .line 77
    .line 78
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v5, La/xpl0;->q:La/u8u;

    .line 82
    .line 83
    iput-boolean v4, v0, La/spl0;->j:Z

    .line 84
    .line 85
    invoke-virtual {v2, v0}, La/u8u;->v(La/zje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-ne v0, v1, :cond_5

    .line 90
    .line 91
    move-object v2, v1

    .line 92
    goto/16 :goto_6

    .line 93
    .line 94
    :cond_5
    :goto_2
    check-cast v0, Ljava/lang/Iterable;

    .line 95
    .line 96
    new-instance v1, Ljava/util/ArrayList;

    .line 97
    .line 98
    const/16 v2, 0xa

    .line 99
    .line 100
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    const-string v3, ""

    .line 116
    .line 117
    if-eqz v2, :cond_a

    .line 118
    .line 119
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, La/yeh0;

    .line 124
    .line 125
    iget-wide v6, v2, La/yeh0;->a:J

    .line 126
    .line 127
    iget-object v8, v2, La/yeh0;->b:Ljava/lang/String;

    .line 128
    .line 129
    iget-object v2, v2, La/yeh0;->c:Ljava/lang/String;

    .line 130
    .line 131
    new-instance v9, La/aw40;

    .line 132
    .line 133
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 134
    .line 135
    const/4 v11, 0x0

    .line 136
    invoke-static {v2, v10, v11}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    if-eqz v10, :cond_6

    .line 141
    .line 142
    move-object v3, v2

    .line 143
    goto :goto_5

    .line 144
    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 145
    .line 146
    .line 147
    move-result v10

    .line 148
    if-nez v10, :cond_7

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_7
    sget-object v10, La/u0d;->a:Ljava/util/List;

    .line 152
    .line 153
    invoke-static {v2}, La/u0d;->c(Ljava/lang/String;)Z

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    if-eqz v10, :cond_8

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_8
    const-string v3, "playerlogo/"

    .line 161
    .line 162
    invoke-static {v2, v3, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-eqz v3, :cond_9

    .line 167
    .line 168
    const-string v3, "%s/%s"

    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_9
    const-string v3, "%s/playerlogo/%s"

    .line 172
    .line 173
    :goto_4
    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 174
    .line 175
    sget-object v11, La/ujn;->h:Ljava/lang/String;

    .line 176
    .line 177
    filled-new-array {v11, v2}, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    const/4 v11, 0x2

    .line 182
    invoke-static {v2, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-static {v10, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    :goto_5
    invoke-direct {v9, v6, v7, v8, v3}, La/aw40;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    goto :goto_3

    .line 197
    :cond_a
    sget v0, La/xpl0;->P:I

    .line 198
    .line 199
    iget-object v0, v5, La/i3t0;->i:La/ocj;

    .line 200
    .line 201
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 202
    .line 203
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    move-object v6, v2

    .line 211
    check-cast v6, La/hpl0;

    .line 212
    .line 213
    new-instance v12, La/zmf0;

    .line 214
    .line 215
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    invoke-direct {v12, v4}, La/zmf0;-><init>(La/a4x;)V

    .line 220
    .line 221
    .line 222
    const/16 v22, 0x0

    .line 223
    .line 224
    const v23, 0x3ffdf

    .line 225
    .line 226
    .line 227
    const/4 v7, 0x0

    .line 228
    const/4 v8, 0x0

    .line 229
    const/4 v9, 0x0

    .line 230
    const/4 v10, 0x0

    .line 231
    const/4 v11, 0x0

    .line 232
    const/4 v13, 0x0

    .line 233
    const/4 v14, 0x0

    .line 234
    const/4 v15, 0x0

    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    const/16 v18, 0x0

    .line 240
    .line 241
    const/16 v19, 0x0

    .line 242
    .line 243
    const/16 v20, 0x0

    .line 244
    .line 245
    const/16 v21, 0x0

    .line 246
    .line 247
    invoke-static/range {v6 .. v23}, La/hpl0;->a(La/hpl0;ZZLjava/lang/String;Ljava/lang/String;ZLa/dnf0;La/dhh0;La/thh0;La/thh0;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;La/wcb;La/v5l0;ZI)La/hpl0;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    invoke-virtual {v0, v2, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_b

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_c

    .line 262
    .line 263
    invoke-virtual {v5}, La/i3t0;->D()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    check-cast v0, La/hpl0;

    .line 268
    .line 269
    iget-object v0, v0, La/hpl0;->d:Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {v0}, La/vtb;->c0(Ljava/lang/String;)Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_c

    .line 276
    .line 277
    invoke-virtual {v5, v3}, La/xpl0;->N(Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    :cond_c
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    :goto_6
    return-object v2

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
