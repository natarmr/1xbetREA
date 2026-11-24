.class public final La/z620;
.super La/iw5;
.source "SourceFile"

# interfaces
.implements La/i620;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/z620;",
        "La/iw5;",
        "La/i620;",
        "<init>",
        "()V",
        "a/uuz",
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
.field public static final u2:La/uuz;

.field public static final synthetic v2:[La/iiy;


# instance fields
.field public k2:La/ghi;

.field public l2:La/ii;

.field public m2:La/ynb;

.field public n2:La/wdk0;

.field public o2:La/iw20;

.field public final p2:La/khf0;

.field public final q2:La/yzn0;

.field public final r2:La/yzn0;

.field public s2:La/wjk;

.field public final t2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/z620;

    .line 4
    .line 5
    const-string v2, "finBetInfoModel"

    .line 6
    .line 7
    const-string v3, "getFinBetInfoModel()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "styleType"

    .line 25
    .line 26
    const-string v6, "getStyleType()Lorg/xplatform/remoteconfig/domain/models/MakeBetScreenStyleType;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/z620;->v2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/uuz;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/z620;->u2:La/uuz;

    .line 50
    .line 51
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
    const-string v1, "EXTRA_BET_INFO"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/z620;->p2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/yzn0;

    .line 14
    .line 15
    const-string v1, "REQUEST_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/z620;->q2:La/yzn0;

    .line 21
    .line 22
    new-instance v0, La/yzn0;

    .line 23
    .line 24
    const-string v1, "STYLETYPE_KEY"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/z620;->r2:La/yzn0;

    .line 30
    .line 31
    const-class v0, La/ln20;

    .line 32
    .line 33
    sget-object v1, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, La/p620;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-direct {v1, p0, v2}, La/p620;-><init>(La/z620;B)V

    .line 43
    .line 44
    .line 45
    const/16 v2, 0xe

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iput-object v0, p0, La/z620;->t2:La/a8z;

    .line 53
    .line 54
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
    const v0, -0x4871690d

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, La/z620;->Q0()La/k3t0;

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
    new-instance v0, La/yw10;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    const/16 v7, 0x8

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    const-class v3, La/z620;

    .line 36
    .line 37
    const-string v4, "handleSideEffect"

    .line 38
    .line 39
    const-string v5, "handleSideEffect(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/models/MakeBetSideEffect;)V"

    .line 40
    .line 41
    invoke-direct/range {v0 .. v7}, La/yw10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    move-object v1, v0

    .line 48
    :cond_1
    check-cast v1, La/jhy;

    .line 49
    .line 50
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 51
    .line 52
    sget-object v0, La/lkz;->a:La/lkz;

    .line 53
    .line 54
    invoke-static {v1, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v8, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    or-int/2addr v1, v3

    .line 67
    const/4 v3, 0x3

    .line 68
    invoke-virtual {v8, v3}, La/fet;->e(I)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    or-int/2addr v1, v3

    .line 73
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    or-int/2addr v1, v3

    .line 78
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const/4 v4, 0x0

    .line 83
    if-nez v1, :cond_2

    .line 84
    .line 85
    if-ne v3, v10, :cond_3

    .line 86
    .line 87
    :cond_2
    new-instance v3, La/khx;

    .line 88
    .line 89
    invoke-direct {v3, v9, v2, v0, v4}, La/khx;-><init>(La/k3t0;La/z620;La/pz40;La/yje;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 96
    .line 97
    invoke-static {v8, v2, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, La/z620;->Q0()La/k3t0;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, La/i3t0;

    .line 105
    .line 106
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    check-cast v1, La/d820;

    .line 115
    .line 116
    iget-object v1, v1, La/d820;->a:La/ug20;

    .line 117
    .line 118
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    check-cast v3, La/d820;

    .line 123
    .line 124
    iget-object v3, v3, La/d820;->d:La/zbr;

    .line 125
    .line 126
    new-instance v9, La/bw5;

    .line 127
    .line 128
    const/4 v5, 0x1

    .line 129
    invoke-static {v5, v8}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    sget-object v5, La/ug20;->c:La/ug20;

    .line 134
    .line 135
    if-ne v1, v5, :cond_4

    .line 136
    .line 137
    sget-object v6, La/iel;->a:La/iel;

    .line 138
    .line 139
    :goto_0
    move-object v14, v6

    .line 140
    goto :goto_1

    .line 141
    :cond_4
    sget-object v6, La/jel;->a:La/jel;

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :goto_1
    if-ne v1, v5, :cond_5

    .line 145
    .line 146
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 147
    .line 148
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 153
    .line 154
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    :goto_2
    move-wide v15, v6

    .line 159
    goto :goto_3

    .line 160
    :cond_5
    sget-object v6, La/s6t0;->a:La/pz40;

    .line 161
    .line 162
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    iget-object v6, v6, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 167
    .line 168
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 169
    .line 170
    .line 171
    move-result-wide v6

    .line 172
    goto :goto_2

    .line 173
    :goto_3
    const/4 v13, 0x0

    .line 174
    const/16 v17, 0x6

    .line 175
    .line 176
    const/4 v11, 0x1

    .line 177
    const/4 v12, 0x0

    .line 178
    invoke-static/range {v10 .. v17}, La/cw5;->a(La/cw5;ZZZLa/lel;JI)La/cw5;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    const/4 v6, 0x0

    .line 183
    if-ne v1, v5, :cond_6

    .line 184
    .line 185
    if-eqz v3, :cond_6

    .line 186
    .line 187
    const v1, -0x459e8fe8

    .line 188
    .line 189
    .line 190
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 191
    .line 192
    .line 193
    new-instance v1, La/ngz;

    .line 194
    .line 195
    const/4 v4, 0x7

    .line 196
    invoke-direct {v1, v3, v2, v4}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 197
    .line 198
    .line 199
    const v3, 0x66c70085

    .line 200
    .line 201
    .line 202
    invoke-static {v3, v1, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    invoke-virtual {v8, v6}, La/fet;->r(Z)V

    .line 207
    .line 208
    .line 209
    :goto_4
    move-object v12, v4

    .line 210
    goto :goto_5

    .line 211
    :cond_6
    const v1, -0x459b5116

    .line 212
    .line 213
    .line 214
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v8, v6}, La/fet;->r(Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :goto_5
    new-instance v1, La/ngz;

    .line 222
    .line 223
    const/16 v3, 0x8

    .line 224
    .line 225
    invoke-direct {v1, v0, v2, v3}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 226
    .line 227
    .line 228
    const v0, 0x32269864

    .line 229
    .line 230
    .line 231
    invoke-static {v0, v1, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 232
    .line 233
    .line 234
    move-result-object v13

    .line 235
    const/4 v14, 0x6

    .line 236
    const/4 v11, 0x0

    .line 237
    invoke-direct/range {v9 .. v14}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8, v6}, La/fet;->r(Z)V

    .line 241
    .line 242
    .line 243
    return-object v9
.end method

.method public final P0(Landroidx/fragment/app/Fragment;)La/i6q;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    instance-of v0, p1, La/i6q;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p1, La/i6q;

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, La/z620;->P0(Landroidx/fragment/app/Fragment;)La/i6q;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_1
    const-string p0, "MakeBetLoaderFragment not found"

    .line 21
    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public final Q0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/z620;->t2:La/a8z;

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

.method public final R0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    iget-object v0, p0, La/z620;->l2:La/ii;

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
    iput-object p1, p0, La/z620;->s2:La/wjk;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, La/z620;->s2:La/wjk;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, La/wjk;->l(La/wjk;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/r6q;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/r6q;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/r6q;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/4 v1, 0x0

    .line 60
    sget-object v3, La/z620;->v2:[La/iiy;

    .line 61
    .line 62
    aget-object v1, v3, v1

    .line 63
    .line 64
    iget-object v4, p0, La/z620;->p2:La/khf0;

    .line 65
    .line 66
    invoke-virtual {v4, p0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 71
    .line 72
    const-class v4, La/z620;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const/4 v5, 0x2

    .line 79
    aget-object v3, v3, v5

    .line 80
    .line 81
    iget-object v5, p0, La/z620;->r2:La/yzn0;

    .line 82
    .line 83
    invoke-virtual {v5, p0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    check-cast v3, La/ua20;

    .line 88
    .line 89
    invoke-virtual {v2, v0, v1, v4, v3}, La/r6q;->a(La/i1w0;Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;Ljava/lang/String;La/ua20;)La/hhi;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iget-object v1, v0, La/hhi;->T:La/n5d0;

    .line 94
    .line 95
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, La/ghi;

    .line 100
    .line 101
    iput-object v1, p0, La/z620;->k2:La/ghi;

    .line 102
    .line 103
    iget-object v1, v0, La/hhi;->G:La/ii;

    .line 104
    .line 105
    iput-object v1, p0, La/z620;->l2:La/ii;

    .line 106
    .line 107
    iget-object v1, v0, La/hhi;->x:La/peg0;

    .line 108
    .line 109
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, La/yzn0;

    .line 112
    .line 113
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iput-object v1, p0, La/z620;->m2:La/ynb;

    .line 121
    .line 122
    iget-object v1, v0, La/hhi;->a:La/wdk0;

    .line 123
    .line 124
    iput-object v1, p0, La/z620;->n2:La/wdk0;

    .line 125
    .line 126
    iget-object v0, v0, La/hhi;->O:La/iw20;

    .line 127
    .line 128
    iput-object v0, p0, La/z620;->o2:La/iw20;

    .line 129
    .line 130
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 135
    .line 136
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-void
.end method

.method public final Z()V
    .locals 4

    .line 1
    invoke-super {p0}, La/iw5;->Z()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/z620;->s2:La/wjk;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-static {v0}, La/wjk;->l(La/wjk;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object v0, La/z620;->v2:[La/iiy;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    aget-object v0, v0, v1

    .line 15
    .line 16
    iget-object v1, p0, La/z620;->q2:La/yzn0;

    .line 17
    .line 18
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Ljava/lang/String;

    .line 23
    .line 24
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    new-instance v2, Lkotlin/Pair;

    .line 27
    .line 28
    const-string v3, "REQUEST_FINISH_MAKE_BET_DIALOG_KEY"

    .line 29
    .line 30
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/iw5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 10
    .line 11
    invoke-virtual {p0}, La/iw5;->L0()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x3

    .line 16
    invoke-virtual {p0, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
