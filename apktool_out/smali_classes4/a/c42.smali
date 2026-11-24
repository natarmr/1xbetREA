.class public final La/c42;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c42;->a:B

    iput-object p1, p0, La/c42;->b:Lkotlin/jvm/functions/Function0;

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
    iget-byte v1, v0, La/c42;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/c42;->b:Lkotlin/jvm/functions/Function0;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v7, p1

    .line 11
    .line 12
    check-cast v7, La/fet;

    .line 13
    .line 14
    move-object/from16 v1, p2

    .line 15
    .line 16
    check-cast v1, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    and-int/lit8 v2, v1, 0x3

    .line 23
    .line 24
    const/4 v3, 0x2

    .line 25
    const/4 v10, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    if-eq v2, v3, :cond_0

    .line 28
    .line 29
    move v2, v10

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v2, v4

    .line 32
    :goto_0
    and-int/2addr v1, v10

    .line 33
    invoke-virtual {v7, v1, v2}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_5

    .line 38
    .line 39
    sget-object v1, La/qmk;->a:La/zcl;

    .line 40
    .line 41
    const/high16 v1, 0x42600000    # 56.0f

    .line 42
    .line 43
    sget-object v2, La/jm40;->b:La/jm40;

    .line 44
    .line 45
    invoke-static {v2, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    sget-object v3, La/ukd;->a:La/cl5;

    .line 54
    .line 55
    if-ne v1, v3, :cond_1

    .line 56
    .line 57
    invoke-static {v7}, La/dw9;->j(La/fet;)La/gy40;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_1
    move-object v12, v1

    .line 62
    check-cast v12, La/gy40;

    .line 63
    .line 64
    invoke-virtual {v7, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    if-nez v1, :cond_2

    .line 73
    .line 74
    if-ne v5, v3, :cond_3

    .line 75
    .line 76
    :cond_2
    new-instance v5, La/lfk;

    .line 77
    .line 78
    invoke-direct {v5, v0, v10}, La/lfk;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v7, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    move-object/from16 v16, v5

    .line 85
    .line 86
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 87
    .line 88
    const/16 v17, 0x1c

    .line 89
    .line 90
    const/4 v13, 0x0

    .line 91
    const/4 v14, 0x0

    .line 92
    const/4 v15, 0x0

    .line 93
    invoke-static/range {v11 .. v17}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 98
    .line 99
    invoke-static {v1, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    iget-wide v5, v7, La/fet;->T:J

    .line 104
    .line 105
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    invoke-virtual {v7}, La/fet;->m()La/bh90;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-static {v7, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 118
    .line 119
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v7}, La/fet;->i0()V

    .line 123
    .line 124
    .line 125
    iget-boolean v6, v7, La/fet;->S:Z

    .line 126
    .line 127
    if-eqz v6, :cond_4

    .line 128
    .line 129
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 130
    .line 131
    invoke-virtual {v7, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_4
    invoke-virtual {v7}, La/fet;->r0()V

    .line 136
    .line 137
    .line 138
    :goto_1
    sget-object v6, La/gqw0;->x:La/shd;

    .line 139
    .line 140
    invoke-static {v7, v1, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 141
    .line 142
    .line 143
    sget-object v1, La/gqw0;->w:La/shd;

    .line 144
    .line 145
    invoke-static {v7, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 146
    .line 147
    .line 148
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    sget-object v3, La/gqw0;->y:La/shd;

    .line 153
    .line 154
    invoke-static {v7, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 155
    .line 156
    .line 157
    invoke-static {v7}, La/jpm0;->n(La/fet;)V

    .line 158
    .line 159
    .line 160
    sget-object v1, La/gqw0;->v:La/shd;

    .line 161
    .line 162
    invoke-static {v7, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 163
    .line 164
    .line 165
    const v0, 0x7f0807d9

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v4, v7}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    sget-object v1, La/m8m0;->a:La/zfn;

    .line 173
    .line 174
    invoke-virtual {v7, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 179
    .line 180
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 181
    .line 182
    .line 183
    move-result-wide v5

    .line 184
    const/high16 v1, 0x42100000    # 36.0f

    .line 185
    .line 186
    invoke-static {v2, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    const/high16 v2, 0x40c00000    # 6.0f

    .line 191
    .line 192
    invoke-static {v1, v2}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    const/16 v8, 0x38

    .line 197
    .line 198
    const/4 v9, 0x0

    .line 199
    const/4 v3, 0x0

    .line 200
    move-object v2, v0

    .line 201
    invoke-static/range {v2 .. v9}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v7, v10}, La/fet;->r(Z)V

    .line 205
    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_5
    invoke-virtual {v7}, La/fet;->X()V

    .line 209
    .line 210
    .line 211
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_0
    move-object/from16 v1, p1

    .line 215
    .line 216
    check-cast v1, Ljava/lang/Throwable;

    .line 217
    .line 218
    move-object/from16 v2, p2

    .line 219
    .line 220
    check-cast v2, Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 232
    .line 233
    return-object v0

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
