.class public final synthetic La/p6p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s6p;

.field public final synthetic c:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/s6p;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/p6p;->a:B

    iput-object p1, p0, La/p6p;->b:La/s6p;

    iput-object p2, p0, La/p6p;->c:La/l7m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p6p;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    iget-object v5, v0, La/p6p;->c:La/l7m0;

    .line 11
    .line 12
    iget-object v0, v0, La/p6p;->b:La/s6p;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/y5d;

    .line 21
    .line 22
    move-object/from16 v7, p2

    .line 23
    .line 24
    check-cast v7, La/fet;

    .line 25
    .line 26
    move-object/from16 v8, p3

    .line 27
    .line 28
    check-cast v8, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v8

    .line 34
    sget-object v9, La/s6p;->o2:La/pek;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    and-int/lit8 v1, v8, 0x11

    .line 40
    .line 41
    if-eq v1, v3, :cond_0

    .line 42
    .line 43
    move v1, v4

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    move v1, v6

    .line 46
    :goto_0
    and-int/lit8 v3, v8, 0x1

    .line 47
    .line 48
    invoke-virtual {v7, v3, v1}, La/fet;->U(IZ)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, La/f7p;

    .line 59
    .line 60
    iget-object v0, v0, La/s6p;->n2:La/kiu0;

    .line 61
    .line 62
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v10, v0

    .line 67
    check-cast v10, La/h7p;

    .line 68
    .line 69
    invoke-virtual {v7, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    if-nez v0, :cond_1

    .line 78
    .line 79
    if-ne v3, v2, :cond_2

    .line 80
    .line 81
    :cond_1
    new-instance v8, La/k4p;

    .line 82
    .line 83
    const/4 v14, 0x0

    .line 84
    const/4 v15, 0x7

    .line 85
    const/4 v9, 0x1

    .line 86
    const-class v11, La/h7p;

    .line 87
    .line 88
    const-string v12, "onAction"

    .line 89
    .line 90
    const-string v13, "onAction(Lorg/xplatform/favorites/impl/presentation/clear/presentation/models/FavoriteClearAction;)V"

    .line 91
    .line 92
    invoke-direct/range {v8 .. v15}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v7, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object v3, v8

    .line 99
    :cond_2
    check-cast v3, La/jhy;

    .line 100
    .line 101
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 102
    .line 103
    const/4 v0, 0x0

    .line 104
    invoke-static {v0, v1, v3, v7, v6}, La/rcb;->G(La/mm40;La/f7p;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    invoke-virtual {v7}, La/fet;->X()V

    .line 109
    .line 110
    .line 111
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object v0

    .line 114
    :pswitch_0
    move-object/from16 v1, p1

    .line 115
    .line 116
    check-cast v1, La/ir8;

    .line 117
    .line 118
    move-object/from16 v10, p2

    .line 119
    .line 120
    check-cast v10, La/fet;

    .line 121
    .line 122
    move-object/from16 v7, p3

    .line 123
    .line 124
    check-cast v7, Ljava/lang/Integer;

    .line 125
    .line 126
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    sget-object v8, La/s6p;->o2:La/pek;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    and-int/lit8 v1, v7, 0x11

    .line 136
    .line 137
    if-eq v1, v3, :cond_4

    .line 138
    .line 139
    move v1, v4

    .line 140
    goto :goto_2

    .line 141
    :cond_4
    move v1, v6

    .line 142
    :goto_2
    and-int/lit8 v3, v7, 0x1

    .line 143
    .line 144
    invoke-virtual {v10, v3, v1}, La/fet;->U(IZ)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_9

    .line 149
    .line 150
    const v1, 0x7f13046c

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v6, v10}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    check-cast v3, La/f7p;

    .line 162
    .line 163
    iget-boolean v3, v3, La/f7p;->b:Z

    .line 164
    .line 165
    invoke-virtual {v10, v3}, La/fet;->h(Z)Z

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    if-nez v3, :cond_5

    .line 174
    .line 175
    if-ne v4, v2, :cond_6

    .line 176
    .line 177
    :cond_5
    new-instance v11, La/wul;

    .line 178
    .line 179
    sget-object v12, La/lul;->e:La/lul;

    .line 180
    .line 181
    sget-object v13, La/oe9;->a:La/oe9;

    .line 182
    .line 183
    new-instance v14, La/ue9;

    .line 184
    .line 185
    invoke-direct {v14, v1}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, La/f7p;

    .line 193
    .line 194
    iget-boolean v15, v1, La/f7p;->b:Z

    .line 195
    .line 196
    const/16 v16, 0x0

    .line 197
    .line 198
    const/16 v17, 0x0

    .line 199
    .line 200
    invoke-direct/range {v11 .. v17}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v10, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    move-object v4, v11

    .line 207
    :cond_6
    move-object v8, v4

    .line 208
    check-cast v8, La/wul;

    .line 209
    .line 210
    sget-object v1, La/jm40;->b:La/jm40;

    .line 211
    .line 212
    const/high16 v3, 0x3f800000    # 1.0f

    .line 213
    .line 214
    invoke-static {v1, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    sget-object v3, La/qmk;->a:La/zcl;

    .line 219
    .line 220
    const/high16 v3, 0x41800000    # 16.0f

    .line 221
    .line 222
    const/high16 v4, 0x41000000    # 8.0f

    .line 223
    .line 224
    invoke-static {v1, v3, v4}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    invoke-virtual {v10, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v3

    .line 236
    if-nez v1, :cond_7

    .line 237
    .line 238
    if-ne v3, v2, :cond_8

    .line 239
    .line 240
    :cond_7
    new-instance v3, La/q6p;

    .line 241
    .line 242
    const/4 v1, 0x2

    .line 243
    invoke-direct {v3, v0, v1}, La/q6p;-><init>(La/s6p;B)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v10, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    :cond_8
    move-object v9, v3

    .line 250
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 251
    .line 252
    const/4 v11, 0x0

    .line 253
    const/4 v12, 0x0

    .line 254
    invoke-static/range {v7 .. v12}, La/qzb;->n(La/mm40;La/wul;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_9
    invoke-virtual {v10}, La/fet;->X()V

    .line 259
    .line 260
    .line 261
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 262
    .line 263
    return-object v0

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
