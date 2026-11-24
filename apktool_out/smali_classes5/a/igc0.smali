.class public final La/igc0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\r\u00b2\u0006\u001e\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00058\nX\u008a\u0084\u0002\u00b2\u0006\u001e\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/igc0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/fl70",
        "La/k3t0;",
        "La/cpc0;",
        "La/xsc0;",
        "La/qsc0;",
        "viewModel",
        "La/wdc0;",
        "La/nec0;",
        "La/jec0;",
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
.field public static final V1:La/fl70;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:Z

.field public final M1:La/cgx0;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public final P1:La/a8z;

.field public final Q1:La/a8z;

.field public final R1:La/a8z;

.field public final S1:La/a8z;

.field public final U1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/igc0;

    .line 4
    .line 5
    const-string v2, "openUserPromoCodes"

    .line 6
    .line 7
    const-string v3, "getOpenUserPromoCodes()Z"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/promo/impl/databinding/FragmentPromoCodesComposeBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/igc0;->W1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/fl70;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/igc0;->V1:La/fl70;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d029d

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/igc0;->K1:La/hnm0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/igc0;->L1:Z

    .line 13
    .line 14
    new-instance v1, La/cgx0;

    .line 15
    .line 16
    const-string v2, "OPEN_USER_PROMO_CODES_BUNDLE"

    .line 17
    .line 18
    invoke-direct {v1, v2}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, La/igc0;->M1:La/cgx0;

    .line 22
    .line 23
    new-instance v1, La/bgc0;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v2}, La/bgc0;-><init>(La/igc0;B)V

    .line 27
    .line 28
    .line 29
    sget-object v2, La/wez;->b:La/wez;

    .line 30
    .line 31
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, p0, La/igc0;->P1:La/a8z;

    .line 36
    .line 37
    new-instance v1, La/bgc0;

    .line 38
    .line 39
    invoke-direct {v1, p0, v0}, La/bgc0;-><init>(La/igc0;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/igc0;->Q1:La/a8z;

    .line 47
    .line 48
    new-instance v0, La/bgc0;

    .line 49
    .line 50
    const/4 v1, 0x2

    .line 51
    invoke-direct {v0, p0, v1}, La/bgc0;-><init>(La/igc0;B)V

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/igc0;->R1:La/a8z;

    .line 59
    .line 60
    const-class v0, La/ihc0;

    .line 61
    .line 62
    sget-object v1, La/sre0;->a:La/tre0;

    .line 63
    .line 64
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    new-instance v1, La/bgc0;

    .line 69
    .line 70
    const/4 v2, 0x3

    .line 71
    invoke-direct {v1, p0, v2}, La/bgc0;-><init>(La/igc0;B)V

    .line 72
    .line 73
    .line 74
    const/16 v2, 0xe

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, La/igc0;->S1:La/a8z;

    .line 82
    .line 83
    sget-object v0, La/hgc0;->a:La/hgc0;

    .line 84
    .line 85
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, La/igc0;->U1:La/s0r;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/igc0;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/igc0;->U1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/d3r;

    .line 16
    .line 17
    iget-object p1, p1, La/d3r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/cgc0;

    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-direct {v1, p0, v2}, La/cgc0;-><init>(La/igc0;B)V

    .line 23
    .line 24
    .line 25
    new-instance p0, La/ugd;

    .line 26
    .line 27
    const v2, 0xdeb6992

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/igc0;->P1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/upi;

    .line 8
    .line 9
    iget-object v1, v0, La/upi;->a:La/ii;

    .line 10
    .line 11
    iput-object v1, p0, La/igc0;->N1:La/ii;

    .line 12
    .line 13
    iget-object v0, v0, La/upi;->b:La/wdk0;

    .line 14
    .line 15
    iput-object v0, p0, La/igc0;->O1:La/wdk0;

    .line 16
    .line 17
    return-void
.end method

.method public final G0(ILa/fet;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v5, p2

    .line 6
    .line 7
    const v2, -0xecab6d6

    .line 8
    .line 9
    .line 10
    invoke-virtual {v5, v2}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v3

    .line 23
    :goto_0
    or-int/2addr v2, v1

    .line 24
    and-int/lit8 v4, v2, 0x3

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    const/4 v9, 0x0

    .line 28
    if-eq v4, v3, :cond_1

    .line 29
    .line 30
    move v3, v8

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v3, v9

    .line 33
    :goto_1
    and-int/2addr v2, v8

    .line 34
    invoke-virtual {v5, v2, v3}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_10

    .line 39
    .line 40
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget-object v10, La/ukd;->a:La/cl5;

    .line 45
    .line 46
    if-ne v2, v10, :cond_2

    .line 47
    .line 48
    new-instance v2, La/q0h0;

    .line 49
    .line 50
    iget-object v3, v0, La/igc0;->R1:La/a8z;

    .line 51
    .line 52
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, La/spi;

    .line 57
    .line 58
    iget-object v3, v3, La/spi;->w:La/n5d0;

    .line 59
    .line 60
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, La/rpi;

    .line 65
    .line 66
    invoke-direct {v2, v3}, La/q0h0;-><init>(La/p0h0;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v5, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    check-cast v2, La/q0h0;

    .line 73
    .line 74
    const-class v3, La/sec0;

    .line 75
    .line 76
    sget-object v4, La/sre0;->a:La/tre0;

    .line 77
    .line 78
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v5, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    if-nez v4, :cond_3

    .line 91
    .line 92
    if-ne v6, v10, :cond_4

    .line 93
    .line 94
    :cond_3
    new-instance v6, La/lop;

    .line 95
    .line 96
    invoke-direct {v6, v2, v8}, La/lop;-><init>(La/q0h0;B)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 103
    .line 104
    const/16 v2, 0xe

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    invoke-static {v0, v3, v4, v6, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    invoke-interface {v11}, La/a8z;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, La/k3t0;

    .line 116
    .line 117
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    if-ne v3, v10, :cond_5

    .line 122
    .line 123
    sget-object v3, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 124
    .line 125
    invoke-static {v3, v5}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_5
    check-cast v3, La/vne;

    .line 133
    .line 134
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    invoke-virtual {v5, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    or-int/2addr v6, v7

    .line 143
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    if-nez v6, :cond_6

    .line 148
    .line 149
    if-ne v7, v10, :cond_7

    .line 150
    .line 151
    :cond_6
    new-instance v7, La/dgc0;

    .line 152
    .line 153
    invoke-direct {v7, v0, v11, v9}, La/dgc0;-><init>(La/igc0;La/a8z;B)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 160
    .line 161
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    invoke-virtual {v5, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v12

    .line 167
    invoke-virtual {v5, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v13

    .line 171
    or-int/2addr v12, v13

    .line 172
    invoke-virtual {v5, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    or-int/2addr v12, v13

    .line 177
    invoke-virtual {v5, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    or-int/2addr v4, v12

    .line 182
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v12

    .line 186
    if-nez v4, :cond_8

    .line 187
    .line 188
    if-ne v12, v10, :cond_9

    .line 189
    .line 190
    :cond_8
    new-instance v12, La/ggc0;

    .line 191
    .line 192
    invoke-direct {v12, v3, v2, v7, v9}, La/ggc0;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v5, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_9
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 199
    .line 200
    invoke-static {v6, v12, v5}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    if-nez v2, :cond_a

    .line 212
    .line 213
    if-ne v3, v10, :cond_b

    .line 214
    .line 215
    :cond_a
    new-instance v3, La/nop;

    .line 216
    .line 217
    const/4 v2, 0x5

    .line 218
    invoke-direct {v3, v11, v2}, La/nop;-><init>(La/a8z;B)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    :cond_b
    move-object v2, v3

    .line 225
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 226
    .line 227
    invoke-virtual {v5, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v3

    .line 231
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    if-nez v3, :cond_c

    .line 236
    .line 237
    if-ne v4, v10, :cond_d

    .line 238
    .line 239
    :cond_c
    new-instance v4, La/nop;

    .line 240
    .line 241
    const/4 v3, 0x6

    .line 242
    invoke-direct {v4, v11, v3}, La/nop;-><init>(La/a8z;B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_d
    move-object v3, v4

    .line 249
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 250
    .line 251
    const/4 v6, 0x0

    .line 252
    const/4 v7, 0x4

    .line 253
    const/4 v4, 0x0

    .line 254
    invoke-static/range {v2 .. v7}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v11}, La/a8z;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    check-cast v2, La/k3t0;

    .line 262
    .line 263
    check-cast v2, La/i3t0;

    .line 264
    .line 265
    invoke-virtual {v2, v5}, La/i3t0;->y(La/fet;)La/pz40;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-interface {v11}, La/a8z;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    move-object v13, v3

    .line 274
    check-cast v13, La/k3t0;

    .line 275
    .line 276
    invoke-virtual {v5, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    if-nez v3, :cond_e

    .line 285
    .line 286
    if-ne v4, v10, :cond_f

    .line 287
    .line 288
    :cond_e
    new-instance v11, La/l8c0;

    .line 289
    .line 290
    const/16 v17, 0x0

    .line 291
    .line 292
    const/16 v18, 0x10

    .line 293
    .line 294
    const/4 v12, 0x1

    .line 295
    const-class v14, La/k3t0;

    .line 296
    .line 297
    const-string v15, "onAction"

    .line 298
    .line 299
    const-string v16, "onAction(Ljava/lang/Object;)V"

    .line 300
    .line 301
    invoke-direct/range {v11 .. v18}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v5, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    move-object v4, v11

    .line 308
    :cond_f
    check-cast v4, La/jhy;

    .line 309
    .line 310
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 311
    .line 312
    invoke-static {v2, v4, v5, v9}, La/phu0;->w(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 313
    .line 314
    .line 315
    goto :goto_2

    .line 316
    :cond_10
    invoke-virtual {v5}, La/fet;->X()V

    .line 317
    .line 318
    .line 319
    :goto_2
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    if-eqz v2, :cond_11

    .line 324
    .line 325
    new-instance v3, La/cgc0;

    .line 326
    .line 327
    invoke-direct {v3, v0, v1, v8}, La/cgc0;-><init>(La/igc0;IB)V

    .line 328
    .line 329
    .line 330
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 331
    .line 332
    :cond_11
    return-void
.end method

.method public final H0(ILa/fet;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v5, p2

    .line 6
    .line 7
    const v2, -0x69a63cfb

    .line 8
    .line 9
    .line 10
    invoke-virtual {v5, v2}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, 0x4

    .line 18
    const/4 v4, 0x2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    move v2, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v4

    .line 24
    :goto_0
    or-int/2addr v2, v1

    .line 25
    and-int/lit8 v6, v2, 0x3

    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    const/4 v8, 0x0

    .line 29
    if-eq v6, v4, :cond_1

    .line 30
    .line 31
    move v4, v7

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v4, v8

    .line 34
    :goto_1
    and-int/2addr v2, v7

    .line 35
    invoke-virtual {v5, v2, v4}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_10

    .line 40
    .line 41
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    sget-object v9, La/ukd;->a:La/cl5;

    .line 46
    .line 47
    if-ne v2, v9, :cond_2

    .line 48
    .line 49
    new-instance v2, La/q0h0;

    .line 50
    .line 51
    iget-object v4, v0, La/igc0;->Q1:La/a8z;

    .line 52
    .line 53
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    check-cast v4, La/eqi;

    .line 58
    .line 59
    iget-object v4, v4, La/eqi;->w:La/n5d0;

    .line 60
    .line 61
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, La/dqi;

    .line 66
    .line 67
    invoke-direct {v2, v4}, La/q0h0;-><init>(La/p0h0;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v5, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    check-cast v2, La/q0h0;

    .line 74
    .line 75
    const-class v4, La/dtc0;

    .line 76
    .line 77
    sget-object v6, La/sre0;->a:La/tre0;

    .line 78
    .line 79
    invoke-virtual {v6, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v5, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v10

    .line 91
    if-nez v6, :cond_3

    .line 92
    .line 93
    if-ne v10, v9, :cond_4

    .line 94
    .line 95
    :cond_3
    new-instance v10, La/lop;

    .line 96
    .line 97
    invoke-direct {v10, v2, v7}, La/lop;-><init>(La/q0h0;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v5, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 104
    .line 105
    const/16 v2, 0xe

    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    invoke-static {v0, v4, v6, v10, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    check-cast v2, La/k3t0;

    .line 117
    .line 118
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v4

    .line 122
    if-ne v4, v9, :cond_5

    .line 123
    .line 124
    sget-object v4, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 125
    .line 126
    invoke-static {v4, v5}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    check-cast v4, La/vne;

    .line 134
    .line 135
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v11

    .line 139
    invoke-virtual {v5, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    or-int/2addr v11, v12

    .line 144
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v12

    .line 148
    if-nez v11, :cond_6

    .line 149
    .line 150
    if-ne v12, v9, :cond_7

    .line 151
    .line 152
    :cond_6
    new-instance v12, La/dgc0;

    .line 153
    .line 154
    invoke-direct {v12, v0, v10, v7}, La/dgc0;-><init>(La/igc0;La/a8z;B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    :cond_7
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 161
    .line 162
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    invoke-virtual {v5, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v13

    .line 168
    invoke-virtual {v5, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    or-int/2addr v13, v14

    .line 173
    invoke-virtual {v5, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    or-int/2addr v13, v14

    .line 178
    invoke-virtual {v5, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    or-int/2addr v6, v13

    .line 183
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v13

    .line 187
    if-nez v6, :cond_8

    .line 188
    .line 189
    if-ne v13, v9, :cond_9

    .line 190
    .line 191
    :cond_8
    new-instance v13, La/ggc0;

    .line 192
    .line 193
    invoke-direct {v13, v4, v2, v12, v7}, La/ggc0;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    :cond_9
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 200
    .line 201
    invoke-static {v11, v13, v5}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v4

    .line 212
    if-nez v2, :cond_a

    .line 213
    .line 214
    if-ne v4, v9, :cond_b

    .line 215
    .line 216
    :cond_a
    new-instance v4, La/nop;

    .line 217
    .line 218
    const/4 v2, 0x7

    .line 219
    invoke-direct {v4, v10, v2}, La/nop;-><init>(La/a8z;B)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 223
    .line 224
    .line 225
    :cond_b
    move-object v2, v4

    .line 226
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 227
    .line 228
    invoke-virtual {v5, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v4

    .line 232
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    if-nez v4, :cond_c

    .line 237
    .line 238
    if-ne v6, v9, :cond_d

    .line 239
    .line 240
    :cond_c
    new-instance v6, La/nop;

    .line 241
    .line 242
    invoke-direct {v6, v10, v3}, La/nop;-><init>(La/a8z;B)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    :cond_d
    move-object v3, v6

    .line 249
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 250
    .line 251
    const/4 v6, 0x0

    .line 252
    const/4 v7, 0x4

    .line 253
    const/4 v4, 0x0

    .line 254
    invoke-static/range {v2 .. v7}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 255
    .line 256
    .line 257
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    check-cast v2, La/k3t0;

    .line 262
    .line 263
    check-cast v2, La/i3t0;

    .line 264
    .line 265
    invoke-virtual {v2, v5}, La/i3t0;->y(La/fet;)La/pz40;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-interface {v10}, La/a8z;->getValue()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v3

    .line 273
    move-object v12, v3

    .line 274
    check-cast v12, La/k3t0;

    .line 275
    .line 276
    invoke-virtual {v5, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    if-nez v3, :cond_e

    .line 285
    .line 286
    if-ne v4, v9, :cond_f

    .line 287
    .line 288
    :cond_e
    new-instance v10, La/l8c0;

    .line 289
    .line 290
    const/16 v16, 0x0

    .line 291
    .line 292
    const/16 v17, 0x11

    .line 293
    .line 294
    const/4 v11, 0x1

    .line 295
    const-class v13, La/k3t0;

    .line 296
    .line 297
    const-string v14, "onAction"

    .line 298
    .line 299
    const-string v15, "onAction(Ljava/lang/Object;)V"

    .line 300
    .line 301
    invoke-direct/range {v10 .. v17}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v5, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    move-object v4, v10

    .line 308
    :cond_f
    check-cast v4, La/jhy;

    .line 309
    .line 310
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 311
    .line 312
    invoke-static {v2, v4, v5, v8}, La/hmw0;->P(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 313
    .line 314
    .line 315
    goto :goto_2

    .line 316
    :cond_10
    invoke-virtual {v5}, La/fet;->X()V

    .line 317
    .line 318
    .line 319
    :goto_2
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    if-eqz v2, :cond_11

    .line 324
    .line 325
    new-instance v3, La/cgc0;

    .line 326
    .line 327
    invoke-direct {v3, v0, v1, v8}, La/cgc0;-><init>(La/igc0;IB)V

    .line 328
    .line 329
    .line 330
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 331
    .line 332
    :cond_11
    return-void
.end method

.method public final I0()V
    .locals 9

    .line 1
    iget-object v0, p0, La/igc0;->O1:La/wdk0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, La/xdk0;

    .line 6
    .line 7
    sget-object v2, La/pek0;->a:La/pek0;

    .line 8
    .line 9
    const v3, 0x7f130e13

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const v4, 0x7f130e11

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    const/16 v8, 0x78

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    const/4 v6, 0x0

    .line 34
    invoke-direct/range {v1 .. v8}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 35
    .line 36
    .line 37
    const/16 v7, 0x3fc

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    const/4 v4, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    move-object v2, p0

    .line 43
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const-string p0, "snackbarManager"

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

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/igc0;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/igc0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
