.class public final La/is6;
.super La/iw5;
.source "SourceFile"

# interfaces
.implements La/i620;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "La/is6;",
        "La/iw5;",
        "La/i620;",
        "<init>",
        "()V",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic r2:I


# instance fields
.field public k2:La/fiu0;

.field public l2:La/ii;

.field public m2:La/lgn0;

.field public n2:La/ynb;

.field public o2:La/wdk0;

.field public p2:La/wjk;

.field public final q2:La/a8z;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/dt6;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/hs6;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, La/hs6;-><init>(La/is6;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/is6;->q2:La/a8z;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const v0, -0x4b1a0d50

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, La/is6;->P0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v10, La/ukd;->a:La/cl5;

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    if-ne v1, v10, :cond_1

    .line 28
    .line 29
    :cond_0
    new-instance v0, La/ur6;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/4 v7, 0x5

    .line 33
    const/4 v1, 0x1

    .line 34
    const-class v3, La/is6;

    .line 35
    .line 36
    const-string v4, "handleSideEffect"

    .line 37
    .line 38
    const-string v5, "handleSideEffect(Lorg/xplatform/bet_constructor/impl/makebet/presentation/actual/ui_state/MakeBetSideEffect;)V"

    .line 39
    .line 40
    invoke-direct/range {v0 .. v7}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    move-object v1, v0

    .line 47
    :cond_1
    check-cast v1, La/jhy;

    .line 48
    .line 49
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    sget-object v0, La/lkz;->a:La/lkz;

    .line 52
    .line 53
    invoke-static {v1, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v8, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    or-int/2addr v1, v3

    .line 66
    const/4 v3, 0x3

    .line 67
    invoke-virtual {v8, v3}, La/fet;->e(I)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    or-int/2addr v1, v3

    .line 72
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    or-int/2addr v1, v3

    .line 77
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const/4 v4, 0x0

    .line 82
    if-nez v1, :cond_2

    .line 83
    .line 84
    if-ne v3, v10, :cond_3

    .line 85
    .line 86
    :cond_2
    new-instance v3, La/ee0;

    .line 87
    .line 88
    invoke-direct {v3, v9, v2, v0, v4}, La/ee0;-><init>(La/k3t0;La/is6;La/pz40;La/yje;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 95
    .line 96
    invoke-static {v8, v2, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, La/is6;->P0()La/k3t0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    check-cast v0, La/i3t0;

    .line 104
    .line 105
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    if-ne v1, v10, :cond_4

    .line 114
    .line 115
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, La/d820;

    .line 120
    .line 121
    iget-object v1, v1, La/d820;->a:La/ug20;

    .line 122
    .line 123
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_4
    check-cast v1, La/ug20;

    .line 127
    .line 128
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    check-cast v3, La/d820;

    .line 133
    .line 134
    iget-object v3, v3, La/d820;->d:La/zbr;

    .line 135
    .line 136
    new-instance v9, La/bw5;

    .line 137
    .line 138
    const/4 v5, 0x1

    .line 139
    invoke-static {v5, v8}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_7

    .line 148
    .line 149
    if-eq v6, v5, :cond_6

    .line 150
    .line 151
    const/4 v7, 0x2

    .line 152
    if-ne v6, v7, :cond_5

    .line 153
    .line 154
    sget-object v6, La/iel;->a:La/iel;

    .line 155
    .line 156
    :goto_0
    move-object v14, v6

    .line 157
    goto :goto_1

    .line 158
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 159
    .line 160
    .line 161
    return-object v4

    .line 162
    :cond_6
    sget-object v6, La/jel;->a:La/jel;

    .line 163
    .line 164
    goto :goto_0

    .line 165
    :cond_7
    sget-object v6, La/kel;->a:La/kel;

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :goto_1
    sget-object v6, La/ug20;->a:La/ug20;

    .line 169
    .line 170
    const/4 v7, 0x0

    .line 171
    if-eq v1, v6, :cond_8

    .line 172
    .line 173
    move v13, v5

    .line 174
    goto :goto_2

    .line 175
    :cond_8
    move v13, v7

    .line 176
    :goto_2
    sget-object v5, La/ug20;->c:La/ug20;

    .line 177
    .line 178
    if-ne v1, v5, :cond_9

    .line 179
    .line 180
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 181
    .line 182
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 187
    .line 188
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 189
    .line 190
    .line 191
    move-result-wide v11

    .line 192
    :goto_3
    move-wide v15, v11

    .line 193
    goto :goto_4

    .line 194
    :cond_9
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 195
    .line 196
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 201
    .line 202
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 203
    .line 204
    .line 205
    move-result-wide v11

    .line 206
    goto :goto_3

    .line 207
    :goto_4
    const/4 v12, 0x0

    .line 208
    const/16 v17, 0x6

    .line 209
    .line 210
    const/4 v11, 0x1

    .line 211
    invoke-static/range {v10 .. v17}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    if-ne v1, v5, :cond_a

    .line 216
    .line 217
    if-eqz v3, :cond_a

    .line 218
    .line 219
    const v1, 0x53608f1b

    .line 220
    .line 221
    .line 222
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 223
    .line 224
    .line 225
    new-instance v1, La/ab4;

    .line 226
    .line 227
    const/4 v4, 0x5

    .line 228
    invoke-direct {v1, v3, v2, v4}, La/ab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 229
    .line 230
    .line 231
    const v3, -0x4c46993e

    .line 232
    .line 233
    .line 234
    invoke-static {v3, v1, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    invoke-virtual {v8, v7}, La/fet;->r(Z)V

    .line 239
    .line 240
    .line 241
    :goto_5
    move-object v12, v4

    .line 242
    goto :goto_6

    .line 243
    :cond_a
    const v1, 0x5363cded

    .line 244
    .line 245
    .line 246
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v8, v7}, La/fet;->r(Z)V

    .line 250
    .line 251
    .line 252
    goto :goto_5

    .line 253
    :goto_6
    new-instance v1, La/ab4;

    .line 254
    .line 255
    const/4 v3, 0x6

    .line 256
    invoke-direct {v1, v0, v2, v3}, La/ab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 257
    .line 258
    .line 259
    const v0, 0x1d595b61

    .line 260
    .line 261
    .line 262
    invoke-static {v0, v1, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 263
    .line 264
    .line 265
    move-result-object v13

    .line 266
    const/4 v14, 0x6

    .line 267
    const/4 v11, 0x0

    .line 268
    invoke-direct/range {v9 .. v14}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v8, v7}, La/fet;->r(Z)V

    .line 272
    .line 273
    .line 274
    return-object v9
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/is6;->q2:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Q0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/is6;->l2:La/ii;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 6
    .line 7
    const v2, 0x7f1307bb

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const v3, 0x7f13032f

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    sget-object v10, La/n12;->b:La/n12;

    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    const/16 v12, 0x5d0

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    move-object v3, p1

    .line 30
    move-object v7, p2

    .line 31
    move-object/from16 v4, p3

    .line 32
    .line 33
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const-string p0, "actionDialogManager"

    .line 48
    .line 49
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    throw p0
.end method

.method public final V(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/wjk;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, La/wjk;

    .line 9
    .line 10
    iput-object p1, p0, La/is6;->p2:La/wjk;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/js6;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/js6;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/js6;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v14, v3, La/js6;->a:La/ctf0;

    .line 65
    .line 66
    iget-object v5, v3, La/js6;->b:La/cad;

    .line 67
    .line 68
    iget-object v6, v3, La/js6;->c:La/drm0;

    .line 69
    .line 70
    iget-object v7, v3, La/js6;->d:La/iip;

    .line 71
    .line 72
    iget-object v1, v3, La/js6;->e:La/gii0;

    .line 73
    .line 74
    iget-object v2, v3, La/js6;->f:La/gs6;

    .line 75
    .line 76
    iget-object v4, v3, La/js6;->g:La/knf0;

    .line 77
    .line 78
    iget-object v8, v3, La/js6;->h:La/v88;

    .line 79
    .line 80
    iget-object v9, v3, La/js6;->j:La/ort;

    .line 81
    .line 82
    iget-object v10, v3, La/js6;->k:La/btt0;

    .line 83
    .line 84
    move-object/from16 v21, v10

    .line 85
    .line 86
    iget-object v10, v3, La/js6;->i:La/peg0;

    .line 87
    .line 88
    iget-object v15, v3, La/js6;->A:La/au0;

    .line 89
    .line 90
    move-object/from16 v20, v8

    .line 91
    .line 92
    iget-object v8, v3, La/js6;->l:La/wsf0;

    .line 93
    .line 94
    iget-object v11, v3, La/js6;->m:La/vby;

    .line 95
    .line 96
    iget-object v12, v3, La/js6;->n:La/lgn0;

    .line 97
    .line 98
    move-object/from16 v17, v1

    .line 99
    .line 100
    iget-object v1, v3, La/js6;->o:La/ii;

    .line 101
    .line 102
    move-object/from16 v24, v1

    .line 103
    .line 104
    iget-object v1, v3, La/js6;->p:La/rqt;

    .line 105
    .line 106
    move-object/from16 v25, v1

    .line 107
    .line 108
    iget-object v1, v3, La/js6;->q:La/duj;

    .line 109
    .line 110
    move-object/from16 v26, v1

    .line 111
    .line 112
    iget-object v1, v3, La/js6;->r:La/buo0;

    .line 113
    .line 114
    move-object/from16 v27, v1

    .line 115
    .line 116
    iget-object v1, v3, La/js6;->s:La/bn6;

    .line 117
    .line 118
    move-object/from16 v28, v1

    .line 119
    .line 120
    iget-object v1, v3, La/js6;->t:La/ih5;

    .line 121
    .line 122
    move-object/from16 v29, v1

    .line 123
    .line 124
    iget-object v1, v3, La/js6;->u:La/ih5;

    .line 125
    .line 126
    move-object/from16 v30, v1

    .line 127
    .line 128
    iget-object v1, v3, La/js6;->v:La/gg5;

    .line 129
    .line 130
    move-object/from16 v31, v1

    .line 131
    .line 132
    iget-object v1, v3, La/js6;->w:La/l7k;

    .line 133
    .line 134
    move-object/from16 v32, v1

    .line 135
    .line 136
    iget-object v1, v3, La/js6;->x:La/m1e;

    .line 137
    .line 138
    move-object/from16 v33, v1

    .line 139
    .line 140
    iget-object v1, v3, La/js6;->y:La/vwb0;

    .line 141
    .line 142
    move-object/from16 v16, v1

    .line 143
    .line 144
    iget-object v1, v3, La/js6;->z:La/pru;

    .line 145
    .line 146
    move-object/from16 v22, v9

    .line 147
    .line 148
    iget-object v9, v3, La/js6;->B:La/bzu;

    .line 149
    .line 150
    move-object/from16 v34, v1

    .line 151
    .line 152
    iget-object v1, v3, La/js6;->C:La/wdk0;

    .line 153
    .line 154
    move-object/from16 v23, v11

    .line 155
    .line 156
    iget-object v11, v3, La/js6;->D:La/fvt0;

    .line 157
    .line 158
    move-object/from16 v35, v1

    .line 159
    .line 160
    iget-object v1, v3, La/js6;->E:La/j1q0;

    .line 161
    .line 162
    move-object/from16 v18, v16

    .line 163
    .line 164
    move-object/from16 v16, v12

    .line 165
    .line 166
    iget-object v12, v3, La/js6;->F:La/o2j0;

    .line 167
    .line 168
    move-object/from16 v19, v1

    .line 169
    .line 170
    iget-object v1, v3, La/js6;->G:La/rou;

    .line 171
    .line 172
    move-object/from16 v36, v1

    .line 173
    .line 174
    iget-object v1, v3, La/js6;->H:La/pyu;

    .line 175
    .line 176
    move-object/from16 v37, v1

    .line 177
    .line 178
    iget-object v1, v3, La/js6;->I:La/q4u;

    .line 179
    .line 180
    move-object/from16 v38, v1

    .line 181
    .line 182
    iget-object v1, v3, La/js6;->J:La/zlt0;

    .line 183
    .line 184
    move-object/from16 v39, v1

    .line 185
    .line 186
    iget-object v1, v3, La/js6;->K:La/lbu;

    .line 187
    .line 188
    move-object/from16 v40, v1

    .line 189
    .line 190
    iget-object v1, v3, La/js6;->L:La/wyu;

    .line 191
    .line 192
    move-object/from16 v41, v1

    .line 193
    .line 194
    iget-object v1, v3, La/js6;->M:La/x0u;

    .line 195
    .line 196
    move-object/from16 v42, v1

    .line 197
    .line 198
    iget-object v1, v3, La/js6;->N:La/iqt;

    .line 199
    .line 200
    move-object/from16 v43, v1

    .line 201
    .line 202
    iget-object v1, v3, La/js6;->O:La/x1u;

    .line 203
    .line 204
    move-object/from16 v44, v1

    .line 205
    .line 206
    iget-object v1, v3, La/js6;->P:La/zri;

    .line 207
    .line 208
    move-object/from16 v45, v1

    .line 209
    .line 210
    iget-object v1, v3, La/js6;->Q:La/r9u;

    .line 211
    .line 212
    iget-object v3, v3, La/js6;->R:La/cmt;

    .line 213
    .line 214
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual/range {v41 .. v41}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-object/from16 v19, v4

    .line 260
    .line 261
    new-instance v4, La/w9i;

    .line 262
    .line 263
    move-object/from16 v46, v1

    .line 264
    .line 265
    move-object/from16 v18, v2

    .line 266
    .line 267
    move-object/from16 v47, v3

    .line 268
    .line 269
    invoke-direct/range {v4 .. v47}, La/w9i;-><init>(La/cad;La/drm0;La/iip;La/wsf0;La/bzu;La/peg0;La/fvt0;La/o2j0;La/i1w0;La/ctf0;La/au0;La/lgn0;La/gii0;La/gs6;La/knf0;La/v88;La/btt0;La/ort;La/vby;La/ii;La/rqt;La/duj;La/buo0;La/bn6;La/ih5;La/ih5;La/gg5;La/l7k;La/m1e;La/pru;La/wdk0;La/rou;La/pyu;La/q4u;La/zlt0;La/lbu;La/wyu;La/x0u;La/iqt;La/x1u;La/zri;La/r9u;La/cmt;)V

    .line 270
    .line 271
    .line 272
    move-object/from16 v1, v16

    .line 273
    .line 274
    move-object/from16 v2, v24

    .line 275
    .line 276
    move-object/from16 v3, v35

    .line 277
    .line 278
    new-instance v5, La/fiu0;

    .line 279
    .line 280
    iget-object v4, v4, La/w9i;->N:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast v4, La/n8i;

    .line 283
    .line 284
    const-class v6, La/dt6;

    .line 285
    .line 286
    invoke-static {v6, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    invoke-direct {v5, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 291
    .line 292
    .line 293
    iput-object v5, v0, La/is6;->k2:La/fiu0;

    .line 294
    .line 295
    iput-object v2, v0, La/is6;->l2:La/ii;

    .line 296
    .line 297
    iput-object v1, v0, La/is6;->m2:La/lgn0;

    .line 298
    .line 299
    iget-object v1, v10, La/peg0;->b:Ljava/lang/Object;

    .line 300
    .line 301
    check-cast v1, La/yzn0;

    .line 302
    .line 303
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    iput-object v1, v0, La/is6;->n2:La/ynb;

    .line 311
    .line 312
    iput-object v3, v0, La/is6;->o2:La/wdk0;

    .line 313
    .line 314
    invoke-super/range {p0 .. p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 315
    .line 316
    .line 317
    return-void

    .line 318
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 319
    .line 320
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    return-void
.end method

.method public final Y()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    iget-object p0, p0, La/is6;->p2:La/wjk;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, La/wjk;->l(La/wjk;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/is6;->p2:La/wjk;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->I(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 19
    .line 20
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/4 v0, 0x3

    .line 25
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
