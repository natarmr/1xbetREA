.class public final synthetic La/g4b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kz20;

.field public final synthetic c:La/ugd;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/kz20;La/ugd;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/g4b;->a:B

    iput-object p1, p0, La/g4b;->b:La/kz20;

    iput-object p2, p0, La/g4b;->c:La/ugd;

    iput-object p3, p0, La/g4b;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g4b;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, v0, La/g4b;->d:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object v7, v0, La/g4b;->c:La/ugd;

    .line 14
    .line 15
    iget-object v0, v0, La/g4b;->b:La/kz20;

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, La/fet;

    .line 24
    .line 25
    move-object/from16 v9, p2

    .line 26
    .line 27
    check-cast v9, Ljava/lang/Integer;

    .line 28
    .line 29
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 30
    .line 31
    .line 32
    move-result v9

    .line 33
    and-int/lit8 v10, v9, 0x3

    .line 34
    .line 35
    if-eq v10, v4, :cond_0

    .line 36
    .line 37
    move v4, v5

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v4, v8

    .line 40
    :goto_0
    and-int/2addr v5, v9

    .line 41
    invoke-virtual {v1, v5, v4}, La/fet;->U(IZ)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-eqz v4, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, La/kz20;->b:La/qym0;

    .line 48
    .line 49
    iget-object v0, v0, La/qym0;->a:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, La/rwm0;

    .line 66
    .line 67
    const v5, 0x2b5614b2

    .line 68
    .line 69
    .line 70
    iget-object v9, v4, La/rwm0;->c:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v1, v5, v9}, La/fet;->b0(ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    sget-object v5, La/qmk;->a:La/zcl;

    .line 76
    .line 77
    const/high16 v5, 0x42200000    # 40.0f

    .line 78
    .line 79
    invoke-static {v3, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    invoke-virtual {v1, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    or-int/2addr v5, v10

    .line 92
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    if-nez v5, :cond_1

    .line 97
    .line 98
    if-ne v10, v2, :cond_2

    .line 99
    .line 100
    :cond_1
    new-instance v10, La/bvm0;

    .line 101
    .line 102
    invoke-direct {v10, v6, v4, v8}, La/bvm0;-><init>(Lkotlin/jvm/functions/Function1;La/rwm0;B)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_2
    move-object v14, v10

    .line 109
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 110
    .line 111
    const/16 v15, 0x1c

    .line 112
    .line 113
    const/4 v10, 0x0

    .line 114
    const/4 v11, 0x0

    .line 115
    const/4 v12, 0x0

    .line 116
    const/4 v13, 0x0

    .line 117
    invoke-static/range {v9 .. v15}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-virtual {v7, v5, v4, v1, v9}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_3
    invoke-virtual {v1}, La/fet;->X()V

    .line 133
    .line 134
    .line 135
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    return-object v0

    .line 138
    :pswitch_0
    move-object/from16 v1, p1

    .line 139
    .line 140
    check-cast v1, La/fet;

    .line 141
    .line 142
    move-object/from16 v9, p2

    .line 143
    .line 144
    check-cast v9, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 147
    .line 148
    .line 149
    move-result v9

    .line 150
    and-int/lit8 v10, v9, 0x3

    .line 151
    .line 152
    if-eq v10, v4, :cond_5

    .line 153
    .line 154
    move v4, v5

    .line 155
    goto :goto_2

    .line 156
    :cond_5
    move v4, v8

    .line 157
    :goto_2
    and-int/2addr v9, v5

    .line 158
    invoke-virtual {v1, v9, v4}, La/fet;->U(IZ)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-eqz v4, :cond_9

    .line 163
    .line 164
    iget-object v4, v0, La/kz20;->a:Ljava/util/List;

    .line 165
    .line 166
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    if-eqz v9, :cond_a

    .line 175
    .line 176
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    check-cast v9, La/rs20;

    .line 181
    .line 182
    const v10, -0x3d0bd48b

    .line 183
    .line 184
    .line 185
    invoke-interface {v9}, La/rs20;->getName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v11

    .line 189
    invoke-virtual {v1, v10, v11}, La/fet;->b0(ILjava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    sget-object v10, La/qmk;->a:La/zcl;

    .line 193
    .line 194
    const/high16 v10, 0x42400000    # 48.0f

    .line 195
    .line 196
    invoke-static {v3, v10}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 197
    .line 198
    .line 199
    move-result-object v11

    .line 200
    iget-object v10, v0, La/kz20;->m:La/lm6;

    .line 201
    .line 202
    if-eqz v10, :cond_6

    .line 203
    .line 204
    iget-boolean v10, v10, La/lm6;->b:Z

    .line 205
    .line 206
    if-ne v10, v5, :cond_6

    .line 207
    .line 208
    move v10, v5

    .line 209
    goto :goto_4

    .line 210
    :cond_6
    move v10, v8

    .line 211
    :goto_4
    xor-int/lit8 v14, v10, 0x1

    .line 212
    .line 213
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v12

    .line 221
    or-int/2addr v10, v12

    .line 222
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v12

    .line 226
    if-nez v10, :cond_7

    .line 227
    .line 228
    if-ne v12, v2, :cond_8

    .line 229
    .line 230
    :cond_7
    new-instance v12, La/i4b;

    .line 231
    .line 232
    invoke-direct {v12, v6, v9, v8}, La/i4b;-><init>(Lkotlin/jvm/functions/Function1;La/rs20;B)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    :cond_8
    move-object/from16 v16, v12

    .line 239
    .line 240
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 241
    .line 242
    const/16 v17, 0x18

    .line 243
    .line 244
    const/4 v12, 0x0

    .line 245
    const/4 v13, 0x0

    .line 246
    const/4 v15, 0x0

    .line 247
    invoke-static/range {v11 .. v17}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    invoke-virtual {v7, v10, v9, v1, v11}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_9
    invoke-virtual {v1}, La/fet;->X()V

    .line 263
    .line 264
    .line 265
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object v0

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
