.class public final synthetic La/byz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/eyz;


# direct methods
.method public synthetic constructor <init>(La/eyz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/byz;->a:B

    iput-object p1, p0, La/byz;->b:La/eyz;

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
    iget-byte v1, v0, La/byz;->a:B

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
    sget-object v3, La/eyz;->O1:La/evz;

    .line 17
    .line 18
    const-string v3, "SEND_RESULT_REQUEST_KEY"

    .line 19
    .line 20
    invoke-static {v2, v1, v3}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object v0, v0, La/byz;->b:La/eyz;

    .line 27
    .line 28
    invoke-virtual {v0}, La/eyz;->G0()La/k3t0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, La/hxz;->a:La/hxz;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_0
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
    move-object/from16 v2, p2

    .line 45
    .line 46
    check-cast v2, Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    sget-object v3, La/eyz;->O1:La/evz;

    .line 53
    .line 54
    and-int/lit8 v3, v2, 0x3

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    const/4 v5, 0x1

    .line 58
    const/4 v6, 0x0

    .line 59
    if-eq v3, v4, :cond_1

    .line 60
    .line 61
    move v3, v5

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    move v3, v6

    .line 64
    :goto_0
    and-int/2addr v2, v5

    .line 65
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_8

    .line 70
    .line 71
    iget-object v9, v0, La/byz;->b:La/eyz;

    .line 72
    .line 73
    invoke-virtual {v9}, La/eyz;->G0()La/k3t0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    check-cast v0, La/i3t0;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v9}, La/eyz;->G0()La/k3t0;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    sget-object v5, La/ukd;->a:La/cl5;

    .line 96
    .line 97
    if-nez v3, :cond_2

    .line 98
    .line 99
    if-ne v4, v5, :cond_3

    .line 100
    .line 101
    :cond_2
    new-instance v7, La/svz;

    .line 102
    .line 103
    const/4 v13, 0x0

    .line 104
    const/4 v14, 0x3

    .line 105
    const/4 v8, 0x1

    .line 106
    const-class v10, La/eyz;

    .line 107
    .line 108
    const-string v11, "handleSideEffect"

    .line 109
    .line 110
    const-string v12, "handleSideEffect(Lorg/xplatform/limits_kenya/impl/presentation/limits_main_screen/models/LimitsKenyaSideEffect;)V"

    .line 111
    .line 112
    invoke-direct/range {v7 .. v14}, La/svz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    move-object v4, v7

    .line 119
    :cond_3
    check-cast v4, La/jhy;

    .line 120
    .line 121
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 122
    .line 123
    sget-object v3, La/lkz;->a:La/lkz;

    .line 124
    .line 125
    invoke-static {v4, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    or-int/2addr v3, v4

    .line 138
    const/4 v4, 0x3

    .line 139
    invoke-virtual {v1, v4}, La/fet;->e(I)Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    or-int/2addr v3, v4

    .line 144
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    or-int/2addr v3, v4

    .line 149
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    if-nez v3, :cond_4

    .line 154
    .line 155
    if-ne v4, v5, :cond_5

    .line 156
    .line 157
    :cond_4
    new-instance v7, La/bio;

    .line 158
    .line 159
    const/4 v11, 0x0

    .line 160
    const/16 v12, 0x1c

    .line 161
    .line 162
    move-object v8, v2

    .line 163
    invoke-direct/range {v7 .. v12}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    move-object v4, v7

    .line 170
    :cond_5
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 171
    .line 172
    invoke-static {v1, v9, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v9}, La/eyz;->G0()La/k3t0;

    .line 176
    .line 177
    .line 178
    move-result-object v12

    .line 179
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    if-nez v2, :cond_6

    .line 188
    .line 189
    if-ne v3, v5, :cond_7

    .line 190
    .line 191
    :cond_6
    new-instance v10, La/svz;

    .line 192
    .line 193
    const/16 v16, 0x0

    .line 194
    .line 195
    const/16 v17, 0x4

    .line 196
    .line 197
    const/4 v11, 0x1

    .line 198
    const-class v13, La/k3t0;

    .line 199
    .line 200
    const-string v14, "onAction"

    .line 201
    .line 202
    const-string v15, "onAction(Ljava/lang/Object;)V"

    .line 203
    .line 204
    invoke-direct/range {v10 .. v17}, La/svz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    move-object v3, v10

    .line 211
    :cond_7
    check-cast v3, La/jhy;

    .line 212
    .line 213
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 214
    .line 215
    invoke-static {v0, v3, v1, v6}, La/x4d0;->H(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 216
    .line 217
    .line 218
    goto :goto_1

    .line 219
    :cond_8
    invoke-virtual {v1}, La/fet;->X()V

    .line 220
    .line 221
    .line 222
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
