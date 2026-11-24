.class public final La/o63;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ugd;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/pz40;La/g3e;Lkotlin/jvm/functions/Function0;La/xgm;La/xgm;La/ugd;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/o63;->a:B

    .line 3
    .line 4
    iput-object p1, p0, La/o63;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/o63;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/o63;->e:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/o63;->f:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/o63;->g:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p6, p0, La/o63;->b:La/ugd;

    .line 15
    .line 16
    const/4 p1, 0x2

    .line 17
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/uz40;La/mm40;La/pzn;La/alo;Ljava/lang/String;La/ugd;I)V
    .locals 0

    const/4 p7, 0x0

    iput-byte p7, p0, La/o63;->a:B

    .line 21
    iput-object p1, p0, La/o63;->c:Ljava/lang/Object;

    iput-object p2, p0, La/o63;->d:Ljava/lang/Object;

    iput-object p3, p0, La/o63;->e:Ljava/lang/Object;

    iput-object p4, p0, La/o63;->f:Ljava/lang/Object;

    iput-object p5, p0, La/o63;->g:Ljava/lang/Object;

    iput-object p6, p0, La/o63;->b:La/ugd;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/o63;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/o63;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/o63;->g:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/o63;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, La/o63;->f:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, La/fet;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    check-cast v4, La/xgm;

    .line 23
    .line 24
    check-cast v3, La/g3e;

    .line 25
    .line 26
    check-cast v2, La/xgm;

    .line 27
    .line 28
    and-int/lit8 p2, p2, 0x3

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    if-ne p2, v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, La/fet;->D()Z

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    if-nez p2, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p1}, La/fet;->X()V

    .line 41
    .line 42
    .line 43
    goto/16 :goto_3

    .line 44
    .line 45
    :cond_1
    :goto_0
    check-cast v1, La/pz40;

    .line 46
    .line 47
    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    invoke-interface {v1, p2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, La/g3e;->g()V

    .line 56
    .line 57
    .line 58
    const p2, -0x47d3d0a3

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1, p2}, La/fet;->e0(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, La/g3e;->f()La/clc;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iget-object p2, p2, La/clc;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p2, La/g3e;

    .line 71
    .line 72
    invoke-virtual {p2}, La/g3e;->e()La/u2e;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p2}, La/g3e;->e()La/u2e;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {p2}, La/g3e;->e()La/u2e;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    sget-object v3, La/bmd;->n:La/zfn;

    .line 85
    .line 86
    invoke-virtual {p1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    check-cast v3, La/k6z;

    .line 91
    .line 92
    sget-object v5, La/k6z;->a:La/k6z;

    .line 93
    .line 94
    const/4 v6, 0x1

    .line 95
    const/4 v7, 0x0

    .line 96
    if-ne v3, v5, :cond_2

    .line 97
    .line 98
    move v3, v6

    .line 99
    goto :goto_1

    .line 100
    :cond_2
    move v3, v7

    .line 101
    :goto_1
    if-eqz v3, :cond_3

    .line 102
    .line 103
    move-object v5, v4

    .line 104
    goto :goto_2

    .line 105
    :cond_3
    move-object v5, v2

    .line 106
    :goto_2
    sget-object v8, La/jgm;->a:La/jgm;

    .line 107
    .line 108
    invoke-virtual {p1, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v9

    .line 112
    invoke-virtual {p1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    or-int/2addr v9, v10

    .line 117
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    sget-object v11, La/ukd;->a:La/cl5;

    .line 122
    .line 123
    if-nez v9, :cond_4

    .line 124
    .line 125
    if-ne v10, v11, :cond_5

    .line 126
    .line 127
    :cond_4
    new-instance v10, La/d5n;

    .line 128
    .line 129
    invoke-direct {v10, v1, v2, v7}, La/d5n;-><init>(La/u2e;La/xgm;B)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 136
    .line 137
    sget-object v9, La/jm40;->b:La/jm40;

    .line 138
    .line 139
    invoke-static {v9, v0, v10}, La/g3e;->d(La/mm40;La/u2e;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    const/16 v12, 0x180

    .line 144
    .line 145
    invoke-static {v10, v5, v8, p1, v12}, La/ieb;->p(La/mm40;La/xgm;La/jgm;La/fet;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    invoke-virtual {p1, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v8

    .line 156
    or-int/2addr v5, v8

    .line 157
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    if-nez v5, :cond_6

    .line 162
    .line 163
    if-ne v8, v11, :cond_7

    .line 164
    .line 165
    :cond_6
    new-instance v8, La/e5n;

    .line 166
    .line 167
    invoke-direct {v8, v0, p2, v7}, La/e5n;-><init>(La/u2e;La/u2e;B)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    :cond_7
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 174
    .line 175
    invoke-static {v9, v1, v8}, La/g3e;->d(La/mm40;La/u2e;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    iget-object p0, p0, La/o63;->b:La/ugd;

    .line 184
    .line 185
    invoke-virtual {p0, v0, p1, v5}, La/ugd;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    if-eqz v3, :cond_8

    .line 189
    .line 190
    move-object v4, v2

    .line 191
    :cond_8
    sget-object p0, La/jgm;->b:La/jgm;

    .line 192
    .line 193
    invoke-virtual {p1, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    invoke-virtual {p1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    or-int/2addr v0, v3

    .line 202
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v3

    .line 206
    if-nez v0, :cond_9

    .line 207
    .line 208
    if-ne v3, v11, :cond_a

    .line 209
    .line 210
    :cond_9
    new-instance v3, La/d5n;

    .line 211
    .line 212
    invoke-direct {v3, v1, v2, v6}, La/d5n;-><init>(La/u2e;La/xgm;B)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 219
    .line 220
    invoke-static {v9, p2, v3}, La/g3e;->d(La/mm40;La/u2e;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 221
    .line 222
    .line 223
    move-result-object p2

    .line 224
    invoke-static {p2, v4, p0, p1, v12}, La/ieb;->p(La/mm40;La/xgm;La/jgm;La/fet;I)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 228
    .line 229
    .line 230
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_0
    move-object v6, p1

    .line 234
    check-cast v6, La/fet;

    .line 235
    .line 236
    check-cast p2, Ljava/lang/Number;

    .line 237
    .line 238
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 239
    .line 240
    .line 241
    move-object v0, v1

    .line 242
    check-cast v0, La/uz40;

    .line 243
    .line 244
    move-object v1, v3

    .line 245
    check-cast v1, La/mm40;

    .line 246
    .line 247
    iget-object p1, p0, La/o63;->e:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast p1, La/pzn;

    .line 250
    .line 251
    move-object v3, v4

    .line 252
    check-cast v3, La/alo;

    .line 253
    .line 254
    move-object v4, v2

    .line 255
    check-cast v4, Ljava/lang/String;

    .line 256
    .line 257
    const p2, 0x180007

    .line 258
    .line 259
    .line 260
    invoke-static {p2}, La/x8x;->L(I)I

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    iget-object v5, p0, La/o63;->b:La/ugd;

    .line 265
    .line 266
    move-object v2, p1

    .line 267
    invoke-static/range {v0 .. v7}, La/b34;->f(La/uz40;La/mm40;La/pzn;La/alo;Ljava/lang/String;La/ugd;La/fet;I)V

    .line 268
    .line 269
    .line 270
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 271
    .line 272
    return-object p0

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
