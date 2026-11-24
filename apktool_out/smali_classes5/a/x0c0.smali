.class public final synthetic La/x0c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a1c0;


# direct methods
.method public synthetic constructor <init>(La/a1c0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x0c0;->a:B

    iput-object p1, p0, La/x0c0;->b:La/a1c0;

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
    iget-byte v1, v0, La/x0c0;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/String;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Landroid/os/Bundle;

    .line 15
    .line 16
    sget-object v3, La/a1c0;->O1:La/rl70;

    .line 17
    .line 18
    const-string v3, "KEY_PICKER_MODEL_REQUEST"

    .line 19
    .line 20
    invoke-static {v2, v1, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v0, v0, La/x0c0;->b:La/a1c0;

    .line 25
    .line 26
    invoke-virtual {v0}, La/a1c0;->H0()La/k3t0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v2, La/s0c0;

    .line 31
    .line 32
    invoke-direct {v2, v1}, La/s0c0;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, La/fet;

    .line 44
    .line 45
    move-object/from16 v2, p2

    .line 46
    .line 47
    check-cast v2, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    sget-object v3, La/a1c0;->O1:La/rl70;

    .line 54
    .line 55
    and-int/lit8 v3, v2, 0x3

    .line 56
    .line 57
    const/4 v4, 0x2

    .line 58
    const/4 v5, 0x1

    .line 59
    const/4 v6, 0x0

    .line 60
    if-eq v3, v4, :cond_0

    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move v3, v6

    .line 65
    :goto_0
    and-int/2addr v2, v5

    .line 66
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_7

    .line 71
    .line 72
    iget-object v9, v0, La/x0c0;->b:La/a1c0;

    .line 73
    .line 74
    invoke-virtual {v9}, La/a1c0;->H0()La/k3t0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    sget-object v4, La/ukd;->a:La/cl5;

    .line 87
    .line 88
    if-nez v2, :cond_1

    .line 89
    .line 90
    if-ne v3, v4, :cond_2

    .line 91
    .line 92
    :cond_1
    new-instance v7, La/e9b0;

    .line 93
    .line 94
    const/4 v13, 0x0

    .line 95
    const/16 v14, 0x15

    .line 96
    .line 97
    const/4 v8, 0x1

    .line 98
    const-class v10, La/a1c0;

    .line 99
    .line 100
    const-string v11, "handleSideEffect"

    .line 101
    .line 102
    const-string v12, "handleSideEffect(Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjSideEffect;)V"

    .line 103
    .line 104
    invoke-direct/range {v7 .. v14}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v3, v7

    .line 111
    :cond_2
    check-cast v3, La/jhy;

    .line 112
    .line 113
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 114
    .line 115
    sget-object v2, La/or00;->a:La/zfn;

    .line 116
    .line 117
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    move-object v12, v2

    .line 122
    check-cast v12, La/clz;

    .line 123
    .line 124
    sget-object v2, La/lkz;->a:La/lkz;

    .line 125
    .line 126
    invoke-static {v3, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    or-int/2addr v2, v3

    .line 139
    const/4 v3, 0x3

    .line 140
    invoke-virtual {v1, v3}, La/fet;->e(I)Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    or-int/2addr v2, v3

    .line 145
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    or-int/2addr v2, v3

    .line 150
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    if-nez v2, :cond_3

    .line 155
    .line 156
    if-ne v3, v4, :cond_4

    .line 157
    .line 158
    :cond_3
    new-instance v10, La/kc70;

    .line 159
    .line 160
    const/4 v14, 0x0

    .line 161
    const/4 v15, 0x6

    .line 162
    move-object v11, v0

    .line 163
    invoke-direct/range {v10 .. v15}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    move-object v3, v10

    .line 170
    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 171
    .line 172
    invoke-static {v1, v12, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v9}, La/a1c0;->H0()La/k3t0;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    check-cast v0, La/i3t0;

    .line 180
    .line 181
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v9}, La/a1c0;->H0()La/k3t0;

    .line 186
    .line 187
    .line 188
    move-result-object v12

    .line 189
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    if-nez v2, :cond_5

    .line 198
    .line 199
    if-ne v3, v4, :cond_6

    .line 200
    .line 201
    :cond_5
    new-instance v10, La/e9b0;

    .line 202
    .line 203
    const/16 v16, 0x0

    .line 204
    .line 205
    const/16 v17, 0x16

    .line 206
    .line 207
    const/4 v11, 0x1

    .line 208
    const-class v13, La/k3t0;

    .line 209
    .line 210
    const-string v14, "onAction"

    .line 211
    .line 212
    const-string v15, "onAction(Ljava/lang/Object;)V"

    .line 213
    .line 214
    invoke-direct/range {v10 .. v17}, La/e9b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    move-object v3, v10

    .line 221
    :cond_6
    check-cast v3, La/jhy;

    .line 222
    .line 223
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 224
    .line 225
    invoke-static {v0, v3, v1, v6}, La/e1c0;->e(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 226
    .line 227
    .line 228
    goto :goto_1

    .line 229
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 230
    .line 231
    .line 232
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object v0

    .line 235
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
