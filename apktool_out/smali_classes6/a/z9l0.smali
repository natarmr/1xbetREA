.class public final synthetic La/z9l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m3n;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/m3n;Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/z9l0;->a:B

    iput-object p1, p0, La/z9l0;->b:La/m3n;

    iput-object p2, p0, La/z9l0;->c:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/z9l0;->a:B

    .line 2
    .line 3
    sget-object v1, La/jm40;->b:La/jm40;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v5, p0, La/z9l0;->b:La/m3n;

    .line 9
    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object v11, p1

    .line 16
    check-cast v11, La/fet;

    .line 17
    .line 18
    move-object/from16 v0, p2

    .line 19
    .line 20
    check-cast v0, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    and-int/lit8 v8, v0, 0x3

    .line 27
    .line 28
    if-eq v8, v6, :cond_0

    .line 29
    .line 30
    move v6, v7

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move v6, v4

    .line 33
    :goto_0
    and-int/2addr v0, v7

    .line 34
    invoke-virtual {v11, v0, v6}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-static {v1, v2, v4, v3}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 41
    .line 42
    .line 43
    move-result-object v8

    .line 44
    iget-object v9, v5, La/m3n;->e:La/jal0;

    .line 45
    .line 46
    const/4 v12, 0x6

    .line 47
    const/4 v13, 0x0

    .line 48
    iget-object v10, p0, La/z9l0;->c:Lkotlin/jvm/functions/Function2;

    .line 49
    .line 50
    invoke-static/range {v8 .. v13}, La/n2x;->n(La/mm40;La/pal0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-virtual {v11}, La/fet;->X()V

    .line 55
    .line 56
    .line 57
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_0
    move-object v0, p1

    .line 61
    check-cast v0, La/fet;

    .line 62
    .line 63
    move-object/from16 v8, p2

    .line 64
    .line 65
    check-cast v8, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    and-int/lit8 v9, v8, 0x3

    .line 72
    .line 73
    if-eq v9, v6, :cond_2

    .line 74
    .line 75
    move v6, v7

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    move v6, v4

    .line 78
    :goto_2
    and-int/2addr v7, v8

    .line 79
    invoke-virtual {v0, v7, v6}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v6

    .line 83
    if-eqz v6, :cond_3

    .line 84
    .line 85
    invoke-static {v1, v2, v4, v3}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v3, v0

    .line 90
    move-object v0, v1

    .line 91
    iget-object v1, v5, La/m3n;->d:La/jal0;

    .line 92
    .line 93
    const/4 v4, 0x6

    .line 94
    const/4 v5, 0x0

    .line 95
    iget-object v2, p0, La/z9l0;->c:Lkotlin/jvm/functions/Function2;

    .line 96
    .line 97
    invoke-static/range {v0 .. v5}, La/n2x;->n(La/mm40;La/pal0;Lkotlin/jvm/functions/Function2;La/fet;II)V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_3
    move-object v3, v0

    .line 102
    invoke-virtual {v3}, La/fet;->X()V

    .line 103
    .line 104
    .line 105
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_1
    iget-object v0, v5, La/m3n;->f:La/aal0;

    .line 109
    .line 110
    move-object v1, p1

    .line 111
    check-cast v1, La/fet;

    .line 112
    .line 113
    move-object/from16 v2, p2

    .line 114
    .line 115
    check-cast v2, Ljava/lang/Integer;

    .line 116
    .line 117
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    and-int/lit8 v3, v2, 0x3

    .line 122
    .line 123
    if-eq v3, v6, :cond_4

    .line 124
    .line 125
    move v3, v7

    .line 126
    goto :goto_4

    .line 127
    :cond_4
    move v3, v4

    .line 128
    :goto_4
    and-int/2addr v2, v7

    .line 129
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eqz v2, :cond_9

    .line 134
    .line 135
    iget-object v2, v0, La/aal0;->a:La/fex;

    .line 136
    .line 137
    sget-object v3, La/fex;->a:La/fex;

    .line 138
    .line 139
    if-ne v2, v3, :cond_5

    .line 140
    .line 141
    move v2, v7

    .line 142
    goto :goto_5

    .line 143
    :cond_5
    move v2, v4

    .line 144
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v2, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    iget-object v0, v0, La/aal0;->a:La/fex;

    .line 153
    .line 154
    sget-object v3, La/fex;->b:La/fex;

    .line 155
    .line 156
    if-ne v0, v3, :cond_6

    .line 157
    .line 158
    move v4, v7

    .line 159
    :cond_6
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    sget-object v4, La/ukd;->a:La/cl5;

    .line 172
    .line 173
    if-ne v3, v4, :cond_7

    .line 174
    .line 175
    new-instance v3, La/m9l0;

    .line 176
    .line 177
    invoke-direct {v3, v2, v7}, La/m9l0;-><init>(La/pz40;B)V

    .line 178
    .line 179
    .line 180
    invoke-static {v3}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_7
    check-cast v3, La/l7m0;

    .line 188
    .line 189
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    if-ne v2, v4, :cond_8

    .line 194
    .line 195
    new-instance v2, La/m9l0;

    .line 196
    .line 197
    invoke-direct {v2, v0, v6}, La/m9l0;-><init>(La/pz40;B)V

    .line 198
    .line 199
    .line 200
    invoke-static {v2}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    :cond_8
    check-cast v2, La/l7m0;

    .line 208
    .line 209
    sget-object v0, La/eal0;->c:La/zfn;

    .line 210
    .line 211
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    invoke-virtual {v0, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    new-instance v4, La/z9l0;

    .line 220
    .line 221
    iget-object p0, p0, La/z9l0;->c:Lkotlin/jvm/functions/Function2;

    .line 222
    .line 223
    invoke-direct {v4, v5, p0, v7}, La/z9l0;-><init>(La/m3n;Lkotlin/jvm/functions/Function2;B)V

    .line 224
    .line 225
    .line 226
    const v7, 0x209b8d1b

    .line 227
    .line 228
    .line 229
    invoke-static {v7, v4, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 230
    .line 231
    .line 232
    move-result-object v4

    .line 233
    const/16 v7, 0x38

    .line 234
    .line 235
    invoke-static {v3, v4, v1, v7}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {v0, v2}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    new-instance v2, La/z9l0;

    .line 247
    .line 248
    invoke-direct {v2, v5, p0, v6}, La/z9l0;-><init>(La/m3n;Lkotlin/jvm/functions/Function2;B)V

    .line 249
    .line 250
    .line 251
    const p0, -0x4e8b86bc

    .line 252
    .line 253
    .line 254
    invoke-static {p0, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-static {v0, p0, v1, v7}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 259
    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_9
    invoke-virtual {v1}, La/fet;->X()V

    .line 263
    .line 264
    .line 265
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object p0

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
