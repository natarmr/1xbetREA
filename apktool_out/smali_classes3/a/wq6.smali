.class public final synthetic La/wq6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yq6;


# direct methods
.method public synthetic constructor <init>(La/yq6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wq6;->a:B

    iput-object p1, p0, La/wq6;->b:La/yq6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wq6;->a:B

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
    sget-object v3, La/yq6;->R1:La/gl5;

    .line 17
    .line 18
    const-string v3, "REQUEST_TEAM_SELECTOR_KEY_NEW"

    .line 19
    .line 20
    invoke-static {v2, v1, v3}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const-string v1, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_4

    .line 36
    .line 37
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 38
    .line 39
    const/16 v4, 0x21

    .line 40
    .line 41
    if-lt v3, v4, :cond_1

    .line 42
    .line 43
    invoke-static {v2}, La/uq6;->j(Landroid/os/Bundle;)Ljava/io/Serializable;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    instance-of v2, v1, La/ojp0;

    .line 53
    .line 54
    if-nez v2, :cond_2

    .line 55
    .line 56
    const/4 v1, 0x0

    .line 57
    :cond_2
    check-cast v1, La/ojp0;

    .line 58
    .line 59
    :goto_0
    check-cast v1, La/ojp0;

    .line 60
    .line 61
    if-nez v1, :cond_3

    .line 62
    .line 63
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iget-object v0, v0, La/wq6;->b:La/yq6;

    .line 67
    .line 68
    invoke-virtual {v0}, La/yq6;->G0()La/k3t0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v2, La/rq6;

    .line 73
    .line 74
    invoke-direct {v2, v1}, La/rq6;-><init>(La/ojp0;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    :goto_1
    return-object v0

    .line 83
    :pswitch_0
    move-object/from16 v1, p1

    .line 84
    .line 85
    check-cast v1, La/fet;

    .line 86
    .line 87
    move-object/from16 v2, p2

    .line 88
    .line 89
    check-cast v2, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    sget-object v3, La/yq6;->R1:La/gl5;

    .line 96
    .line 97
    and-int/lit8 v3, v2, 0x3

    .line 98
    .line 99
    const/4 v4, 0x2

    .line 100
    const/4 v5, 0x1

    .line 101
    const/4 v6, 0x0

    .line 102
    if-eq v3, v4, :cond_5

    .line 103
    .line 104
    move v3, v5

    .line 105
    goto :goto_2

    .line 106
    :cond_5
    move v3, v6

    .line 107
    :goto_2
    and-int/2addr v2, v5

    .line 108
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_c

    .line 113
    .line 114
    iget-object v9, v0, La/wq6;->b:La/yq6;

    .line 115
    .line 116
    invoke-virtual {v9}, La/yq6;->G0()La/k3t0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, La/i3t0;

    .line 121
    .line 122
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v9}, La/yq6;->G0()La/k3t0;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    sget-object v4, La/ukd;->a:La/cl5;

    .line 139
    .line 140
    if-nez v2, :cond_6

    .line 141
    .line 142
    if-ne v3, v4, :cond_7

    .line 143
    .line 144
    :cond_6
    new-instance v3, La/os5;

    .line 145
    .line 146
    const/16 v2, 0xc

    .line 147
    .line 148
    invoke-direct {v3, v9, v2}, La/os5;-><init>(Ljava/lang/Object;B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_7
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 155
    .line 156
    sget-object v2, La/lkz;->a:La/lkz;

    .line 157
    .line 158
    invoke-static {v3, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 159
    .line 160
    .line 161
    move-result-object v10

    .line 162
    invoke-virtual {v1, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    or-int/2addr v2, v3

    .line 171
    const/4 v3, 0x3

    .line 172
    invoke-virtual {v1, v3}, La/fet;->e(I)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    or-int/2addr v2, v3

    .line 177
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    or-int/2addr v2, v3

    .line 182
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    const/4 v11, 0x0

    .line 187
    if-nez v2, :cond_8

    .line 188
    .line 189
    if-ne v3, v4, :cond_9

    .line 190
    .line 191
    :cond_8
    new-instance v7, La/l10;

    .line 192
    .line 193
    const/16 v12, 0x1c

    .line 194
    .line 195
    invoke-direct/range {v7 .. v12}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    move-object v3, v7

    .line 202
    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 203
    .line 204
    invoke-static {v1, v9, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v9}, La/yq6;->G0()La/k3t0;

    .line 208
    .line 209
    .line 210
    move-result-object v14

    .line 211
    invoke-virtual {v1, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v2

    .line 215
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    if-nez v2, :cond_a

    .line 220
    .line 221
    if-ne v3, v4, :cond_b

    .line 222
    .line 223
    :cond_a
    new-instance v12, La/yj5;

    .line 224
    .line 225
    const/16 v18, 0x0

    .line 226
    .line 227
    const/16 v19, 0x1b

    .line 228
    .line 229
    const/4 v13, 0x1

    .line 230
    const-class v15, La/k3t0;

    .line 231
    .line 232
    const-string v16, "onAction"

    .line 233
    .line 234
    const-string v17, "onAction(Ljava/lang/Object;)V"

    .line 235
    .line 236
    invoke-direct/range {v12 .. v19}, La/yj5;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    move-object v3, v12

    .line 243
    :cond_b
    check-cast v3, La/jhy;

    .line 244
    .line 245
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 246
    .line 247
    invoke-static {v6, v1, v11, v0, v3}, La/wha0;->f(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 248
    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_c
    invoke-virtual {v1}, La/fet;->X()V

    .line 252
    .line 253
    .line 254
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    return-object v0

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
