.class public final synthetic La/kc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/kc0;->a:B

    iput-object p3, p0, La/kc0;->c:Ljava/lang/Object;

    iput-object p4, p0, La/kc0;->d:Ljava/lang/Object;

    iput-object p5, p0, La/kc0;->e:Ljava/lang/Object;

    iput-object p6, p0, La/kc0;->f:Ljava/lang/Object;

    iput p2, p0, La/kc0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/nc0;La/lr5;ILa/bvc;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/kc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kc0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/kc0;->d:Ljava/lang/Object;

    iput p3, p0, La/kc0;->b:I

    iput-object p4, p0, La/kc0;->e:Ljava/lang/Object;

    iput-object p5, p0, La/kc0;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/nqq;La/nqq;La/jge0;ILa/f8m;)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput-byte v0, p0, La/kc0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kc0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/kc0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/kc0;->e:Ljava/lang/Object;

    iput p4, p0, La/kc0;->b:I

    iput-object p5, p0, La/kc0;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kc0;->a:B

    .line 4
    .line 5
    iget v2, v0, La/kc0;->b:I

    .line 6
    .line 7
    iget-object v3, v0, La/kc0;->f:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v0, La/kc0;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/kc0;->d:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object v6, v0, La/kc0;->c:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast v6, La/nqq;

    .line 19
    .line 20
    check-cast v5, La/nqq;

    .line 21
    .line 22
    check-cast v4, La/jge0;

    .line 23
    .line 24
    check-cast v3, La/f8m;

    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    check-cast v0, La/vx7;

    .line 29
    .line 30
    invoke-static {v5}, La/vcc;->a0(La/yzj;)La/cg80;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, La/cg80;->getFocusOwner()La/wpq;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, La/ypq;

    .line 39
    .line 40
    invoke-virtual {v1}, La/ypq;->h()La/nqq;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eq v6, v1, :cond_0

    .line 45
    .line 46
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-static {v2, v3, v5, v4}, La/k7n0;->B(ILa/f8m;La/nqq;La/jge0;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    invoke-interface {v0}, La/vx7;->a()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const/4 v0, 0x0

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    :goto_0
    move-object v0, v2

    .line 69
    :goto_1
    return-object v0

    .line 70
    :pswitch_0
    check-cast v6, La/jie0;

    .line 71
    .line 72
    move-object v9, v5

    .line 73
    check-cast v9, La/qah0;

    .line 74
    .line 75
    check-cast v4, La/jie0;

    .line 76
    .line 77
    check-cast v3, La/pfk0;

    .line 78
    .line 79
    move-object/from16 v0, p1

    .line 80
    .line 81
    check-cast v0, La/i73;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, La/i73;->e:La/pz40;

    .line 87
    .line 88
    check-cast v1, La/hgk0;

    .line 89
    .line 90
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    check-cast v5, Ljava/lang/Number;

    .line 95
    .line 96
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    iget v7, v6, La/jie0;->a:F

    .line 101
    .line 102
    sub-float/2addr v5, v7

    .line 103
    invoke-interface {v9, v5}, La/qah0;->a(F)F

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    check-cast v1, Ljava/lang/Number;

    .line 112
    .line 113
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    iput v1, v6, La/jie0;->a:F

    .line 118
    .line 119
    invoke-virtual {v0}, La/i73;->b()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    check-cast v1, Ljava/lang/Number;

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    iput v1, v4, La/jie0;->a:F

    .line 130
    .line 131
    iget-object v1, v3, La/pfk0;->a:La/tcz;

    .line 132
    .line 133
    invoke-virtual {v1}, La/tcz;->d()La/ucz;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    if-nez v1, :cond_3

    .line 138
    .line 139
    invoke-virtual {v0}, La/i73;->a()V

    .line 140
    .line 141
    .line 142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_3
    new-instance v7, La/gvj0;

    .line 146
    .line 147
    const/4 v13, 0x0

    .line 148
    const/16 v14, 0xf

    .line 149
    .line 150
    const/4 v8, 0x1

    .line 151
    const-class v10, La/qah0;

    .line 152
    .line 153
    const-string v11, "scrollBy"

    .line 154
    .line 155
    const-string v12, "scrollBy(F)F"

    .line 156
    .line 157
    invoke-direct/range {v7 .. v14}, La/gvj0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v0, v1, v2, v7}, La/pfk0;->e(La/i73;La/ucz;ILkotlin/jvm/functions/Function1;)Z

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    if-eqz v1, :cond_4

    .line 165
    .line 166
    invoke-virtual {v0}, La/i73;->a()V

    .line 167
    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_4
    sub-float/2addr v5, v15

    .line 171
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    const/high16 v2, 0x3f000000    # 0.5f

    .line 176
    .line 177
    cmpl-float v1, v1, v2

    .line 178
    .line 179
    if-lez v1, :cond_5

    .line 180
    .line 181
    invoke-virtual {v0}, La/i73;->a()V

    .line 182
    .line 183
    .line 184
    :cond_5
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    :goto_3
    return-object v0

    .line 187
    :pswitch_1
    check-cast v6, La/pu90;

    .line 188
    .line 189
    check-cast v5, La/pu90;

    .line 190
    .line 191
    check-cast v4, La/pu90;

    .line 192
    .line 193
    check-cast v3, La/pu90;

    .line 194
    .line 195
    move-object/from16 v0, p1

    .line 196
    .line 197
    check-cast v0, La/ou90;

    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    const/4 v1, 0x0

    .line 203
    const/4 v7, 0x0

    .line 204
    if-eqz v6, :cond_6

    .line 205
    .line 206
    invoke-virtual {v0, v6, v7, v7, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 207
    .line 208
    .line 209
    :cond_6
    if-eqz v5, :cond_7

    .line 210
    .line 211
    invoke-virtual {v0, v5, v7, v7, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 212
    .line 213
    .line 214
    :cond_7
    if-eqz v4, :cond_8

    .line 215
    .line 216
    invoke-virtual {v0, v4, v7, v7, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 217
    .line 218
    .line 219
    :cond_8
    if-eqz v3, :cond_9

    .line 220
    .line 221
    iget v4, v3, La/pu90;->b:I

    .line 222
    .line 223
    sub-int/2addr v2, v4

    .line 224
    invoke-virtual {v0, v3, v7, v2, v1}, La/ou90;->m(La/pu90;IIF)V

    .line 225
    .line 226
    .line 227
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_2
    check-cast v6, La/nc0;

    .line 231
    .line 232
    check-cast v5, La/lr5;

    .line 233
    .line 234
    check-cast v4, La/bvc;

    .line 235
    .line 236
    move-object v7, v3

    .line 237
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 238
    .line 239
    move-object/from16 v8, p1

    .line 240
    .line 241
    check-cast v8, La/k0w0;

    .line 242
    .line 243
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    new-instance v1, La/lc0;

    .line 247
    .line 248
    const/4 v2, 0x0

    .line 249
    iget v3, v0, La/kc0;->b:I

    .line 250
    .line 251
    move-object/from16 v16, v6

    .line 252
    .line 253
    move-object v6, v4

    .line 254
    move-object/from16 v4, v16

    .line 255
    .line 256
    invoke-direct/range {v1 .. v7}, La/lc0;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    new-instance v0, La/a1w0;

    .line 260
    .line 261
    invoke-direct {v0, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v8, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 265
    .line 266
    .line 267
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 268
    .line 269
    return-object v0

    .line 270
    nop

    .line 271
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
