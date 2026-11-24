.class public final synthetic La/cls;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pls;


# direct methods
.method public synthetic constructor <init>(La/pls;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/cls;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cls;->b:La/pls;

    return-void
.end method

.method public synthetic constructor <init>(La/pls;I)V
    .locals 0

    .line 2
    const/4 p2, 0x0

    iput-byte p2, p0, La/cls;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/cls;->b:La/pls;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/cls;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/cls;->b:La/pls;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object v11, p1

    .line 10
    check-cast v11, La/fet;

    .line 11
    .line 12
    move-object/from16 v0, p2

    .line 13
    .line 14
    check-cast v0, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    and-int/lit8 v2, v0, 0x3

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x2

    .line 24
    if-eq v2, v4, :cond_0

    .line 25
    .line 26
    move v2, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v2, v3

    .line 29
    :goto_0
    and-int/2addr v0, v1

    .line 30
    invoke-virtual {v11, v0, v2}, La/fet;->U(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_4

    .line 35
    .line 36
    const/high16 v0, 0x3f800000    # 1.0f

    .line 37
    .line 38
    sget-object v2, La/jm40;->b:La/jm40;

    .line 39
    .line 40
    invoke-static {v2, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sget-object v5, La/qmk;->a:La/zcl;

    .line 45
    .line 46
    const/high16 v5, 0x43500000    # 208.0f

    .line 47
    .line 48
    invoke-static {v0, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 53
    .line 54
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 55
    .line 56
    .line 57
    move-result-wide v5

    .line 58
    sget-object v7, La/qmk;->i:La/zcl;

    .line 59
    .line 60
    sget-object v8, La/vgg0;->a:La/ugg0;

    .line 61
    .line 62
    new-instance v8, La/ugg0;

    .line 63
    .line 64
    invoke-direct {v8, v7, v7, v7, v7}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v5, v6, v8}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const/4 v5, 0x0

    .line 72
    const/high16 v6, 0x41000000    # 8.0f

    .line 73
    .line 74
    invoke-static {v0, v5, v6, v1}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    const-string v7, "GAME_LOG"

    .line 79
    .line 80
    invoke-static {v0, v7}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    sget-object v7, La/uc9;->c:La/mw3;

    .line 85
    .line 86
    sget-object v8, La/gqw0;->m:La/xx7;

    .line 87
    .line 88
    invoke-static {v7, v8, v11, v3}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    iget-wide v8, v11, La/fet;->T:J

    .line 93
    .line 94
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 99
    .line 100
    .line 101
    move-result-object v9

    .line 102
    invoke-static {v11, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 107
    .line 108
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v11}, La/fet;->i0()V

    .line 112
    .line 113
    .line 114
    iget-boolean v10, v11, La/fet;->S:Z

    .line 115
    .line 116
    if-eqz v10, :cond_1

    .line 117
    .line 118
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 119
    .line 120
    invoke-virtual {v11, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 121
    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    invoke-virtual {v11}, La/fet;->r0()V

    .line 125
    .line 126
    .line 127
    :goto_1
    sget-object v10, La/gqw0;->x:La/shd;

    .line 128
    .line 129
    invoke-static {v11, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 130
    .line 131
    .line 132
    sget-object v7, La/gqw0;->w:La/shd;

    .line 133
    .line 134
    invoke-static {v11, v9, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    sget-object v8, La/gqw0;->y:La/shd;

    .line 142
    .line 143
    invoke-static {v11, v7, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 147
    .line 148
    .line 149
    sget-object v7, La/gqw0;->v:La/shd;

    .line 150
    .line 151
    invoke-static {v11, v0, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 152
    .line 153
    .line 154
    invoke-static {p0, v11, v3}, La/agc;->x(La/pls;La/fet;I)V

    .line 155
    .line 156
    .line 157
    new-instance v0, La/hls;

    .line 158
    .line 159
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 160
    .line 161
    .line 162
    const/4 v3, 0x0

    .line 163
    invoke-static {v2, v0, v3}, La/cjx;->V(La/mm40;La/vj50;La/yj50;)La/mm40;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-static {v6, v5, v4}, La/s5x0;->t(FFI)La/lh80;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    invoke-virtual {v11, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    if-nez v0, :cond_2

    .line 180
    .line 181
    sget-object v0, La/ukd;->a:La/cl5;

    .line 182
    .line 183
    if-ne v3, v0, :cond_3

    .line 184
    .line 185
    :cond_2
    new-instance v3, La/g7p;

    .line 186
    .line 187
    const/16 v0, 0x17

    .line 188
    .line 189
    invoke-direct {v3, p0, v0}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v11, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    :cond_3
    move-object v10, v3

    .line 196
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 197
    .line 198
    const/4 v12, 0x0

    .line 199
    const/16 v13, 0x1fa

    .line 200
    .line 201
    const/4 v3, 0x0

    .line 202
    const/4 v5, 0x0

    .line 203
    const/4 v6, 0x0

    .line 204
    const/4 v7, 0x0

    .line 205
    const/4 v8, 0x0

    .line 206
    const/4 v9, 0x0

    .line 207
    invoke-static/range {v2 .. v13}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v11, v1}, La/fet;->r(Z)V

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_4
    invoke-virtual {v11}, La/fet;->X()V

    .line 215
    .line 216
    .line 217
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 218
    .line 219
    return-object p0

    .line 220
    :pswitch_0
    move-object v0, p1

    .line 221
    check-cast v0, La/fet;

    .line 222
    .line 223
    move-object/from16 v2, p2

    .line 224
    .line 225
    check-cast v2, Ljava/lang/Integer;

    .line 226
    .line 227
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-static {v1}, La/x8x;->L(I)I

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-static {p0, v0, v1}, La/agc;->x(La/pls;La/fet;I)V

    .line 235
    .line 236
    .line 237
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object p0

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
