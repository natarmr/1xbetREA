.class public final synthetic La/ysz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ctz;


# direct methods
.method public synthetic constructor <init>(La/ctz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ysz;->a:B

    iput-object p1, p0, La/ysz;->b:La/ctz;

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
    iget-byte v1, v0, La/ysz;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, La/fet;

    .line 11
    .line 12
    move-object/from16 v2, p2

    .line 13
    .line 14
    check-cast v2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    sget-object v3, La/ctz;->O1:La/atz;

    .line 21
    .line 22
    and-int/lit8 v3, v2, 0x3

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    const/4 v5, 0x1

    .line 26
    const/4 v6, 0x0

    .line 27
    if-eq v3, v4, :cond_0

    .line 28
    .line 29
    move v3, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move v3, v6

    .line 32
    :goto_0
    and-int/2addr v2, v5

    .line 33
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_7

    .line 38
    .line 39
    iget-object v9, v0, La/ysz;->b:La/ctz;

    .line 40
    .line 41
    invoke-virtual {v9}, La/ctz;->G0()La/k3t0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/i3t0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v9}, La/ctz;->G0()La/k3t0;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    sget-object v5, La/ukd;->a:La/cl5;

    .line 64
    .line 65
    if-nez v3, :cond_1

    .line 66
    .line 67
    if-ne v4, v5, :cond_2

    .line 68
    .line 69
    :cond_1
    new-instance v7, La/g1y;

    .line 70
    .line 71
    const/4 v13, 0x0

    .line 72
    const/16 v14, 0x1b

    .line 73
    .line 74
    const/4 v8, 0x1

    .line 75
    const-class v10, La/ctz;

    .line 76
    .line 77
    const-string v11, "handleSideEffect"

    .line 78
    .line 79
    const-string v12, "handleSideEffect(Lorg/xplatform/limits_africa/impl/presentation/limits_main_screen/models/LimitsAfricaSideEffect;)V"

    .line 80
    .line 81
    invoke-direct/range {v7 .. v14}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    move-object v4, v7

    .line 88
    :cond_2
    check-cast v4, La/jhy;

    .line 89
    .line 90
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 91
    .line 92
    sget-object v3, La/lkz;->a:La/lkz;

    .line 93
    .line 94
    invoke-static {v4, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 95
    .line 96
    .line 97
    move-result-object v10

    .line 98
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    or-int/2addr v3, v4

    .line 107
    const/4 v4, 0x3

    .line 108
    invoke-virtual {v1, v4}, La/fet;->e(I)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    or-int/2addr v3, v4

    .line 113
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v4

    .line 117
    or-int/2addr v3, v4

    .line 118
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    if-ne v4, v5, :cond_4

    .line 125
    .line 126
    :cond_3
    new-instance v7, La/bio;

    .line 127
    .line 128
    const/4 v11, 0x0

    .line 129
    const/16 v12, 0x1b

    .line 130
    .line 131
    move-object v8, v2

    .line 132
    invoke-direct/range {v7 .. v12}, La/bio;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    move-object v4, v7

    .line 139
    :cond_4
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 140
    .line 141
    invoke-static {v1, v9, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9}, La/ctz;->G0()La/k3t0;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    invoke-virtual {v1, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v2

    .line 152
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    if-nez v2, :cond_5

    .line 157
    .line 158
    if-ne v3, v5, :cond_6

    .line 159
    .line 160
    :cond_5
    new-instance v10, La/g1y;

    .line 161
    .line 162
    const/16 v16, 0x0

    .line 163
    .line 164
    const/16 v17, 0x1c

    .line 165
    .line 166
    const/4 v11, 0x1

    .line 167
    const-class v13, La/k3t0;

    .line 168
    .line 169
    const-string v14, "onAction"

    .line 170
    .line 171
    const-string v15, "onAction(Ljava/lang/Object;)V"

    .line 172
    .line 173
    invoke-direct/range {v10 .. v17}, La/g1y;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    move-object v3, v10

    .line 180
    :cond_6
    check-cast v3, La/jhy;

    .line 181
    .line 182
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 183
    .line 184
    invoke-static {v0, v3, v1, v6}, La/oja0;->D(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 185
    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_7
    invoke-virtual {v1}, La/fet;->X()V

    .line 189
    .line 190
    .line 191
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object v0

    .line 194
    :pswitch_0
    move-object/from16 v1, p1

    .line 195
    .line 196
    check-cast v1, Ljava/lang/String;

    .line 197
    .line 198
    move-object/from16 v2, p2

    .line 199
    .line 200
    check-cast v2, Landroid/os/Bundle;

    .line 201
    .line 202
    sget-object v3, La/ctz;->O1:La/atz;

    .line 203
    .line 204
    const-string v3, "SEND_RESULT_REQUEST_KEY"

    .line 205
    .line 206
    invoke-static {v2, v1, v3}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_8

    .line 211
    .line 212
    iget-object v0, v0, La/ysz;->b:La/ctz;

    .line 213
    .line 214
    invoke-virtual {v0}, La/ctz;->G0()La/k3t0;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    sget-object v1, La/psz;->a:La/psz;

    .line 219
    .line 220
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object v0

    .line 226
    nop

    .line 227
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
