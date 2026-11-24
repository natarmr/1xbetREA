.class public final La/gup0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/gup0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/m6m0",
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
.field public static final n2:La/m6m0;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/khf0;

.field public final l2:La/a8z;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/gup0;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;"

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
    sput-object v1, La/gup0;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/m6m0;

    .line 21
    .line 22
    const/16 v1, 0x10

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/m6m0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/gup0;->n2:La/m6m0;

    .line 28
    .line 29
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
    const-string v1, "BUNDLE_KEY_BOTTOM_SHEET_PARAMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/gup0;->k2:La/khf0;

    .line 12
    .line 13
    new-instance v0, La/eup0;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {v0, p0, v1}, La/eup0;-><init>(La/gup0;B)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wez;->b:La/wez;

    .line 20
    .line 21
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/gup0;->l2:La/a8z;

    .line 26
    .line 27
    const-class v0, La/xup0;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/eup0;

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    invoke-direct {v1, p0, v2}, La/eup0;-><init>(La/gup0;B)V

    .line 39
    .line 40
    .line 41
    const/16 v2, 0xe

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/gup0;->m2:La/a8z;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 14

    .line 1
    const v0, 0x7c3c7e73

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/gup0;->P0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/i3t0;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, La/gup0;->P0()La/k3t0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v7, La/ukd;->a:La/cl5;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    if-ne v3, v7, :cond_1

    .line 34
    .line 35
    :cond_0
    new-instance v3, La/nop0;

    .line 36
    .line 37
    const/4 v1, 0x5

    .line 38
    invoke-direct {v3, p0, v1}, La/nop0;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    sget-object v1, La/or00;->a:La/zfn;

    .line 47
    .line 48
    invoke-virtual {p1, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, La/clz;

    .line 53
    .line 54
    sget-object v4, La/lkz;->a:La/lkz;

    .line 55
    .line 56
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {p1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    or-int/2addr v3, v5

    .line 69
    const/4 v5, 0x3

    .line 70
    invoke-virtual {p1, v5}, La/fet;->e(I)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    or-int/2addr v3, v5

    .line 75
    invoke-virtual {p1, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    or-int/2addr v3, v5

    .line 80
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    if-nez v3, :cond_2

    .line 85
    .line 86
    if-ne v5, v7, :cond_3

    .line 87
    .line 88
    :cond_2
    move-object v3, v1

    .line 89
    goto :goto_0

    .line 90
    :cond_3
    move-object v3, v1

    .line 91
    goto :goto_1

    .line 92
    :goto_0
    new-instance v1, La/kc70;

    .line 93
    .line 94
    const/4 v5, 0x0

    .line 95
    const/16 v6, 0x15

    .line 96
    .line 97
    invoke-direct/range {v1 .. v6}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    move-object v5, v1

    .line 104
    :goto_1
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 105
    .line 106
    invoke-static {p1, v3, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    const/4 v3, 0x0

    .line 118
    if-nez v1, :cond_4

    .line 119
    .line 120
    if-ne v2, v7, :cond_5

    .line 121
    .line 122
    :cond_4
    new-instance v2, La/eup0;

    .line 123
    .line 124
    invoke-direct {v2, p0, v3}, La/eup0;-><init>(La/gup0;B)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    move-object v8, v2

    .line 131
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 132
    .line 133
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const/4 v4, 0x1

    .line 142
    if-nez v1, :cond_6

    .line 143
    .line 144
    if-ne v2, v7, :cond_7

    .line 145
    .line 146
    :cond_6
    new-instance v2, La/eup0;

    .line 147
    .line 148
    invoke-direct {v2, p0, v4}, La/eup0;-><init>(La/gup0;B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_7
    move-object v9, v2

    .line 155
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 156
    .line 157
    const/4 v12, 0x0

    .line 158
    const/4 v13, 0x4

    .line 159
    const/4 v10, 0x0

    .line 160
    move-object v11, p1

    .line 161
    invoke-static/range {v8 .. v13}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 162
    .line 163
    .line 164
    invoke-static {v4, v11}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    new-instance v5, La/bw5;

    .line 169
    .line 170
    new-instance p1, La/tft;

    .line 171
    .line 172
    const/16 v1, 0x18

    .line 173
    .line 174
    invoke-direct {p1, v0, v1}, La/tft;-><init>(La/l7m0;B)V

    .line 175
    .line 176
    .line 177
    const v1, -0x32d0cb9e    # -1.8371536E8f

    .line 178
    .line 179
    .line 180
    invoke-static {v1, p1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    new-instance p1, La/nhl0;

    .line 185
    .line 186
    const/16 v1, 0x13

    .line 187
    .line 188
    invoke-direct {p1, v0, p0, v1}, La/nhl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 189
    .line 190
    .line 191
    const p0, -0x1be549d6

    .line 192
    .line 193
    .line 194
    invoke-static {p0, p1, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    new-instance p0, La/tft;

    .line 199
    .line 200
    const/16 p1, 0x19

    .line 201
    .line 202
    invoke-direct {p0, v0, p1}, La/tft;-><init>(La/l7m0;B)V

    .line 203
    .line 204
    .line 205
    const p1, 0x57e4e264

    .line 206
    .line 207
    .line 208
    invoke-static {p1, p0, v11}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    const/4 v10, 0x2

    .line 213
    invoke-direct/range {v5 .. v10}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v11, v3}, La/fet;->r(Z)V

    .line 217
    .line 218
    .line 219
    return-object v5
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gup0;->m2:La/a8z;

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
