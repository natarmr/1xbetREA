.class public final La/x1i0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/x1i0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/zie0",
        "La/k2i0;",
        "uiState",
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
.field public static final n2:La/zie0;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/khf0;

.field public final l2:La/n0o0;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/x1i0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/x1i0;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/zie0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/x1i0;->n2:La/zie0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "SELECT_DATE_TIME_SCREEN_PARAMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/x1i0;->k2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/w1i0;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, La/w1i0;-><init>(La/x1i0;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/x1i0;->l2:La/n0o0;

    .line 24
    .line 25
    const-class v0, La/f4i0;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/w1i0;

    .line 34
    .line 35
    const/4 v2, 0x1

    .line 36
    invoke-direct {v1, p0, v2}, La/w1i0;-><init>(La/x1i0;B)V

    .line 37
    .line 38
    .line 39
    const/16 v2, 0xe

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/x1i0;->m2:La/a8z;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 19

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const v0, 0x4879ea8e

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v9, 0x1

    .line 16
    iput-boolean v9, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 17
    .line 18
    invoke-virtual {v2}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v10, 0x3

    .line 23
    invoke-virtual {v0, v10}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, La/x1i0;->Q0()La/k3t0;

    .line 27
    .line 28
    .line 29
    move-result-object v11

    .line 30
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v12, La/ukd;->a:La/cl5;

    .line 39
    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    if-ne v1, v12, :cond_1

    .line 43
    .line 44
    :cond_0
    new-instance v0, La/nxh0;

    .line 45
    .line 46
    const/4 v6, 0x0

    .line 47
    const/16 v7, 0x12

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    const-class v3, La/x1i0;

    .line 51
    .line 52
    const-string v4, "handleSideEffect"

    .line 53
    .line 54
    const-string v5, "handleSideEffect(Lorg/xplatform/results/impl/presentation/dialogs/results/models/SelectDateSideEffect;)V"

    .line 55
    .line 56
    invoke-direct/range {v0 .. v7}, La/nxh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    move-object v1, v0

    .line 63
    :cond_1
    check-cast v1, La/jhy;

    .line 64
    .line 65
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 66
    .line 67
    sget-object v0, La/lkz;->a:La/lkz;

    .line 68
    .line 69
    invoke-static {v1, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v8, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    or-int/2addr v1, v3

    .line 82
    invoke-virtual {v8, v10}, La/fet;->e(I)Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    or-int/2addr v1, v3

    .line 87
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    or-int/2addr v1, v3

    .line 92
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    if-nez v1, :cond_2

    .line 97
    .line 98
    if-ne v3, v12, :cond_3

    .line 99
    .line 100
    :cond_2
    new-instance v3, La/qkb0;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    invoke-direct {v3, v11, v2, v0, v1}, La/qkb0;-><init>(La/k3t0;La/x1i0;La/pz40;La/yje;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 110
    .line 111
    invoke-static {v8, v2, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, La/x1i0;->Q0()La/k3t0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, La/i3t0;

    .line 119
    .line 120
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, La/k2i0;

    .line 129
    .line 130
    iget-object v1, v1, La/k2i0;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 131
    .line 132
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, La/k2i0;

    .line 137
    .line 138
    iget-object v3, v3, La/k2i0;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 139
    .line 140
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, La/k2i0;

    .line 145
    .line 146
    iget-object v4, v4, La/k2i0;->c:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 147
    .line 148
    invoke-static {v1, v3, v4, v8}, La/tlb;->b0(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;La/fet;)La/hdj;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    new-instance v1, La/wul;

    .line 153
    .line 154
    sget-object v11, La/nul;->e:La/nul;

    .line 155
    .line 156
    sget-object v14, La/oe9;->a:La/oe9;

    .line 157
    .line 158
    new-instance v13, La/ue9;

    .line 159
    .line 160
    const v3, 0x7f13030c

    .line 161
    .line 162
    .line 163
    const/4 v6, 0x0

    .line 164
    invoke-static {v3, v6, v8}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    invoke-direct {v13, v3}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    const/4 v15, 0x0

    .line 172
    const/16 v16, 0x0

    .line 173
    .line 174
    move-object v12, v14

    .line 175
    const/4 v14, 0x1

    .line 176
    move-object v10, v1

    .line 177
    invoke-direct/range {v10 .. v16}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 178
    .line 179
    .line 180
    new-instance v3, La/wul;

    .line 181
    .line 182
    sget-object v13, La/lul;->e:La/lul;

    .line 183
    .line 184
    new-instance v15, La/ue9;

    .line 185
    .line 186
    const v5, 0x7f13030b

    .line 187
    .line 188
    .line 189
    invoke-static {v5, v6, v8}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    invoke-direct {v15, v5}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, La/k2i0;

    .line 201
    .line 202
    iget-boolean v0, v0, La/k2i0;->e:Z

    .line 203
    .line 204
    const/16 v17, 0x0

    .line 205
    .line 206
    const/16 v18, 0x0

    .line 207
    .line 208
    move/from16 v16, v0

    .line 209
    .line 210
    move-object v14, v12

    .line 211
    move-object v12, v3

    .line 212
    invoke-direct/range {v12 .. v18}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 213
    .line 214
    .line 215
    invoke-static {v9, v8}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 216
    .line 217
    .line 218
    move-result-object v14

    .line 219
    new-instance v13, La/bw5;

    .line 220
    .line 221
    sget-object v15, La/b34;->o:La/ugd;

    .line 222
    .line 223
    new-instance v0, La/v1i0;

    .line 224
    .line 225
    const/4 v5, 0x0

    .line 226
    move-object v3, v2

    .line 227
    move-object v2, v12

    .line 228
    invoke-direct/range {v0 .. v5}, La/v1i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 229
    .line 230
    .line 231
    move-object v2, v3

    .line 232
    const v1, -0x401559c9

    .line 233
    .line 234
    .line 235
    invoke-static {v1, v0, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 236
    .line 237
    .line 238
    move-result-object v16

    .line 239
    new-instance v0, La/in80;

    .line 240
    .line 241
    const/16 v1, 0x16

    .line 242
    .line 243
    invoke-direct {v0, v4, v2, v1}, La/in80;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 244
    .line 245
    .line 246
    const v1, 0x14a8743d

    .line 247
    .line 248
    .line 249
    invoke-static {v1, v0, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 250
    .line 251
    .line 252
    move-result-object v17

    .line 253
    const/16 v18, 0x2

    .line 254
    .line 255
    invoke-direct/range {v13 .. v18}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v8, v6}, La/fet;->r(Z)V

    .line 259
    .line 260
    .line 261
    return-object v13
.end method

.method public final P0()Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/x1i0;->o2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/x1i0;->k2:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/results/impl/presentation/dialogs/results/params/SelectDateScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final Q0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/x1i0;->m2:La/a8z;

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
