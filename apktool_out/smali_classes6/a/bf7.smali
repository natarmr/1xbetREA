.class public final synthetic La/bf7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/if7;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/if7;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/bf7;->a:B

    iput-object p1, p0, La/bf7;->b:La/if7;

    iput-object p2, p0, La/bf7;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/if7;Lkotlin/jvm/functions/Function1;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/bf7;->a:B

    iput-object p1, p0, La/bf7;->b:La/if7;

    iput-object p2, p0, La/bf7;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bf7;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v7, v0, La/bf7;->c:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    iget-object v0, v0, La/bf7;->b:La/if7;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/fet;

    .line 22
    .line 23
    move-object/from16 v2, p2

    .line 24
    .line 25
    check-cast v2, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {v6}, La/x8x;->L(I)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-static {v0, v7, v1, v2}, La/nia0;->l(La/if7;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    move-object/from16 v1, p1

    .line 41
    .line 42
    check-cast v1, La/fet;

    .line 43
    .line 44
    move-object/from16 v8, p2

    .line 45
    .line 46
    check-cast v8, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v8

    .line 52
    and-int/lit8 v9, v8, 0x3

    .line 53
    .line 54
    if-eq v9, v5, :cond_0

    .line 55
    .line 56
    move v4, v6

    .line 57
    :cond_0
    and-int/lit8 v5, v8, 0x1

    .line 58
    .line 59
    invoke-virtual {v1, v5, v4}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    const/high16 v4, 0x3f800000    # 1.0f

    .line 66
    .line 67
    invoke-static {v3, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    sget-object v4, La/djv0;->w:Ljava/util/WeakHashMap;

    .line 72
    .line 73
    invoke-static {v1}, La/zcm0;->i(La/fet;)La/djv0;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    iget-object v4, v4, La/djv0;->c:La/q33;

    .line 78
    .line 79
    invoke-static {v1}, La/zcm0;->i(La/fet;)La/djv0;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    iget-object v5, v5, La/djv0;->e:La/q33;

    .line 84
    .line 85
    new-instance v6, La/ujo;

    .line 86
    .line 87
    invoke-direct {v6, v4, v5}, La/ujo;-><init>(La/vhv0;La/vhv0;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v3, v6}, La/j120;->k0(La/mm40;La/vhv0;)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    iget-object v0, v0, La/if7;->g:La/mtl;

    .line 95
    .line 96
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    if-nez v4, :cond_1

    .line 105
    .line 106
    if-ne v5, v2, :cond_2

    .line 107
    .line 108
    :cond_1
    new-instance v5, La/uo6;

    .line 109
    .line 110
    const/16 v2, 0xc

    .line 111
    .line 112
    invoke-direct {v5, v7, v2}, La/uo6;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_2
    move-object v6, v5

    .line 119
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 120
    .line 121
    const/4 v8, 0x0

    .line 122
    const/16 v9, 0x1c

    .line 123
    .line 124
    move-object v7, v1

    .line 125
    move-object v1, v3

    .line 126
    const/4 v3, 0x0

    .line 127
    const/4 v4, 0x0

    .line 128
    const/4 v5, 0x0

    .line 129
    move-object v2, v0

    .line 130
    invoke-static/range {v1 .. v9}, La/bkb;->f(La/mm40;La/mtl;La/ma80;ZLa/hh80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    :cond_3
    move-object v7, v1

    .line 135
    invoke-virtual {v7}, La/fet;->X()V

    .line 136
    .line 137
    .line 138
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_1
    move-object/from16 v13, p1

    .line 142
    .line 143
    check-cast v13, La/fet;

    .line 144
    .line 145
    move-object/from16 v1, p2

    .line 146
    .line 147
    check-cast v1, Ljava/lang/Integer;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    and-int/lit8 v8, v1, 0x3

    .line 154
    .line 155
    if-eq v8, v5, :cond_4

    .line 156
    .line 157
    move v4, v6

    .line 158
    :cond_4
    and-int/2addr v1, v6

    .line 159
    invoke-virtual {v13, v1, v4}, La/fet;->U(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result v1

    .line 163
    if-eqz v1, :cond_7

    .line 164
    .line 165
    invoke-static {v3}, La/o050;->W(La/mm40;)La/mm40;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    iget-object v0, v0, La/if7;->e:La/imm;

    .line 170
    .line 171
    invoke-virtual {v13, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    if-nez v3, :cond_5

    .line 180
    .line 181
    if-ne v4, v2, :cond_6

    .line 182
    .line 183
    :cond_5
    new-instance v4, La/to6;

    .line 184
    .line 185
    const/16 v2, 0xb

    .line 186
    .line 187
    invoke-direct {v4, v7, v2}, La/to6;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 194
    .line 195
    const/4 v15, 0x0

    .line 196
    const/16 v16, 0xff4

    .line 197
    .line 198
    const/4 v3, 0x0

    .line 199
    const/4 v5, 0x0

    .line 200
    const/4 v6, 0x0

    .line 201
    const/4 v7, 0x0

    .line 202
    const/4 v8, 0x0

    .line 203
    const/4 v9, 0x0

    .line 204
    const/4 v10, 0x0

    .line 205
    const/4 v11, 0x0

    .line 206
    const/4 v12, 0x0

    .line 207
    const/4 v14, 0x0

    .line 208
    move-object v2, v0

    .line 209
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 210
    .line 211
    .line 212
    goto :goto_1

    .line 213
    :cond_7
    invoke-virtual {v13}, La/fet;->X()V

    .line 214
    .line 215
    .line 216
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_2
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, La/fet;

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
    invoke-static {v6}, La/x8x;->L(I)I

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    invoke-static {v0, v7, v1, v2}, La/nia0;->l(La/if7;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 235
    .line 236
    .line 237
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0

    .line 240
    nop

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
