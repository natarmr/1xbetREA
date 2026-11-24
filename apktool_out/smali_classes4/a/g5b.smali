.class public final La/g5b;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/g5b;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gl5",
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
.field public static final c2:La/gl5;

.field public static final synthetic d2:[La/iiy;


# instance fields
.field public final K1:La/a8z;

.field public final L1:La/yzn0;

.field public final M1:La/khf0;

.field public final N1:La/n0o0;

.field public final O1:La/a8z;

.field public final P1:La/a8z;

.field public final Q1:La/a8z;

.field public final R1:La/s0r;

.field public final S1:La/a8z;

.field public final U1:La/a8z;

.field public final V1:La/a8z;

.field public final W1:La/a8z;

.field public final X1:La/a8z;

.field public final Y1:La/a8z;

.field public final Z1:La/a8z;

.field public final a2:La/a8z;

.field public final b2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/g5b;

    .line 4
    .line 5
    const-string v2, "startSection"

    .line 6
    .line 7
    const-string v3, "getStartSection()Lorg/xplatform/favorites/api/presentation/models/FavoriteSectionTag;"

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
    const-string v3, "currentTab"

    .line 16
    .line 17
    const-string v5, "getCurrentTab()Lorg/xplatform/favorites/impl/presentation/screen/category_image_header/models/CategoryImageHeaderTab;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "binding"

    .line 25
    .line 26
    const-string v6, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/g5b;->d2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/gl5;

    .line 45
    .line 46
    const/16 v1, 0x13

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/gl5;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/g5b;->c2:La/gl5;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e0b;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, v1}, La/e0b;-><init>(B)V

    .line 11
    .line 12
    .line 13
    sget-object v2, La/wez;->b:La/wez;

    .line 14
    .line 15
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/g5b;->K1:La/a8z;

    .line 20
    .line 21
    new-instance v0, La/yzn0;

    .line 22
    .line 23
    const-string v3, "FAVORITE_SECTION_KEY"

    .line 24
    .line 25
    invoke-direct {v0, v3}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/g5b;->L1:La/yzn0;

    .line 29
    .line 30
    new-instance v0, La/khf0;

    .line 31
    .line 32
    const-string v3, "BUNDLE_CURRENT_TAB"

    .line 33
    .line 34
    invoke-direct {v0, v3}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/g5b;->M1:La/khf0;

    .line 38
    .line 39
    new-instance v0, La/a5b;

    .line 40
    .line 41
    const/16 v3, 0x12

    .line 42
    .line 43
    invoke-direct {v0, p0, v3}, La/a5b;-><init>(La/g5b;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, La/g5b;->N1:La/n0o0;

    .line 51
    .line 52
    new-instance v0, La/a5b;

    .line 53
    .line 54
    const/16 v3, 0x13

    .line 55
    .line 56
    invoke-direct {v0, p0, v3}, La/a5b;-><init>(La/g5b;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/g5b;->O1:La/a8z;

    .line 64
    .line 65
    new-instance v0, La/a5b;

    .line 66
    .line 67
    const/16 v3, 0x14

    .line 68
    .line 69
    invoke-direct {v0, p0, v3}, La/a5b;-><init>(La/g5b;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/g5b;->P1:La/a8z;

    .line 77
    .line 78
    new-instance v0, La/a5b;

    .line 79
    .line 80
    const/16 v3, 0x15

    .line 81
    .line 82
    invoke-direct {v0, p0, v3}, La/a5b;-><init>(La/g5b;B)V

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, La/g5b;->Q1:La/a8z;

    .line 90
    .line 91
    sget-object v0, La/e5b;->a:La/e5b;

    .line 92
    .line 93
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    iput-object v0, p0, La/g5b;->R1:La/s0r;

    .line 98
    .line 99
    sget-object v0, La/sre0;->a:La/tre0;

    .line 100
    .line 101
    const-class v2, La/w5b;

    .line 102
    .line 103
    invoke-virtual {v0, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v3, La/a5b;

    .line 108
    .line 109
    const/4 v4, 0x0

    .line 110
    invoke-direct {v3, p0, v4}, La/a5b;-><init>(La/g5b;B)V

    .line 111
    .line 112
    .line 113
    const/4 v4, 0x0

    .line 114
    const/16 v5, 0xe

    .line 115
    .line 116
    invoke-static {p0, v2, v4, v3, v5}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iput-object v2, p0, La/g5b;->S1:La/a8z;

    .line 121
    .line 122
    const-class v2, La/bep;

    .line 123
    .line 124
    invoke-virtual {v0, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    new-instance v3, La/a5b;

    .line 129
    .line 130
    const/4 v6, 0x1

    .line 131
    invoke-direct {v3, p0, v6}, La/a5b;-><init>(La/g5b;B)V

    .line 132
    .line 133
    .line 134
    invoke-static {p0, v2, v4, v3, v5}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    iput-object v2, p0, La/g5b;->U1:La/a8z;

    .line 139
    .line 140
    const-class v2, La/gfp;

    .line 141
    .line 142
    invoke-virtual {v0, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    new-instance v3, La/a5b;

    .line 147
    .line 148
    const/4 v6, 0x2

    .line 149
    invoke-direct {v3, p0, v6}, La/a5b;-><init>(La/g5b;B)V

    .line 150
    .line 151
    .line 152
    invoke-static {p0, v2, v4, v3, v5}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iput-object v2, p0, La/g5b;->V1:La/a8z;

    .line 157
    .line 158
    const-class v2, La/yn2;

    .line 159
    .line 160
    invoke-virtual {v0, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    new-instance v3, La/a5b;

    .line 165
    .line 166
    invoke-direct {v3, p0, v1}, La/a5b;-><init>(La/g5b;B)V

    .line 167
    .line 168
    .line 169
    invoke-static {p0, v2, v4, v3, v5}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    iput-object v1, p0, La/g5b;->W1:La/a8z;

    .line 174
    .line 175
    const-class v1, La/bm2;

    .line 176
    .line 177
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    new-instance v2, La/a5b;

    .line 182
    .line 183
    const/4 v3, 0x4

    .line 184
    invoke-direct {v2, p0, v3}, La/a5b;-><init>(La/g5b;B)V

    .line 185
    .line 186
    .line 187
    invoke-static {p0, v1, v4, v2, v5}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    iput-object v1, p0, La/g5b;->X1:La/a8z;

    .line 192
    .line 193
    const-class v1, La/hh2;

    .line 194
    .line 195
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    new-instance v2, La/a5b;

    .line 200
    .line 201
    const/16 v3, 0xd

    .line 202
    .line 203
    invoke-direct {v2, p0, v3}, La/a5b;-><init>(La/g5b;B)V

    .line 204
    .line 205
    .line 206
    invoke-static {p0, v1, v4, v2, v5}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    iput-object v1, p0, La/g5b;->Y1:La/a8z;

    .line 211
    .line 212
    const-class v1, La/qi2;

    .line 213
    .line 214
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    new-instance v2, La/a5b;

    .line 219
    .line 220
    const/16 v3, 0xf

    .line 221
    .line 222
    invoke-direct {v2, p0, v3}, La/a5b;-><init>(La/g5b;B)V

    .line 223
    .line 224
    .line 225
    invoke-static {p0, v1, v4, v2, v5}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 226
    .line 227
    .line 228
    move-result-object v1

    .line 229
    iput-object v1, p0, La/g5b;->Z1:La/a8z;

    .line 230
    .line 231
    const-class v1, La/fk2;

    .line 232
    .line 233
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    new-instance v2, La/a5b;

    .line 238
    .line 239
    const/16 v3, 0x10

    .line 240
    .line 241
    invoke-direct {v2, p0, v3}, La/a5b;-><init>(La/g5b;B)V

    .line 242
    .line 243
    .line 244
    invoke-static {p0, v1, v4, v2, v5}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    iput-object v1, p0, La/g5b;->a2:La/a8z;

    .line 249
    .line 250
    const-class v1, La/ul2;

    .line 251
    .line 252
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    new-instance v1, La/a5b;

    .line 257
    .line 258
    const/16 v2, 0x11

    .line 259
    .line 260
    invoke-direct {v1, p0, v2}, La/a5b;-><init>(La/g5b;B)V

    .line 261
    .line 262
    .line 263
    invoke-static {p0, v0, v4, v1, v5}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    iput-object v0, p0, La/g5b;->b2:La/a8z;

    .line 268
    .line 269
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, La/g5b;->R0()La/aci;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/aci;->b:La/itr;

    .line 6
    .line 7
    invoke-interface {p1}, La/itr;->d()La/ujd;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, La/lr2;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v1, La/b5b;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    invoke-direct {v1, p0, v2}, La/b5b;-><init>(La/g5b;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0, v0, v1}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, La/g5b;->d2:[La/iiy;

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    aget-object p1, p1, v0

    .line 32
    .line 33
    iget-object v1, p0, La/g5b;->R1:La/s0r;

    .line 34
    .line 35
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast p1, La/aid;

    .line 43
    .line 44
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 45
    .line 46
    new-instance v1, La/bna;

    .line 47
    .line 48
    const/16 v3, 0x11

    .line 49
    .line 50
    invoke-direct {v1, p0, v3}, La/bna;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    new-instance v3, La/ugd;

    .line 54
    .line 55
    const v4, 0x41eee00b

    .line 56
    .line 57
    .line 58
    invoke-direct {v3, v4, v2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    invoke-static {p1, v1, v3}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, La/g5b;->P1:La/a8z;

    .line 66
    .line 67
    invoke-interface {p1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, La/aii;

    .line 72
    .line 73
    iget-object p1, p1, La/aii;->a:La/bw60;

    .line 74
    .line 75
    invoke-interface {p1}, La/bw60;->b()La/afm0;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    new-instance p1, La/b5b;

    .line 83
    .line 84
    invoke-direct {p1, p0, v0}, La/b5b;-><init>(La/g5b;B)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, p1}, La/afm0;->s(La/yx5;Lkotlin/jvm/functions/Function1;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-instance v0, La/c5b;

    .line 99
    .line 100
    invoke-direct {v0, p0, v2}, La/c5b;-><init>(La/g5b;B)V

    .line 101
    .line 102
    .line 103
    const-string v1, "REQUEST_KEY_CLOSE_GAME"

    .line 104
    .line 105
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, La/a5b;

    .line 109
    .line 110
    const/4 v0, 0x5

    .line 111
    invoke-direct {p1, p0, v0}, La/a5b;-><init>(La/g5b;B)V

    .line 112
    .line 113
    .line 114
    const-string v0, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY"

    .line 115
    .line 116
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 117
    .line 118
    .line 119
    new-instance p1, La/a5b;

    .line 120
    .line 121
    const/4 v0, 0x6

    .line 122
    invoke-direct {p1, p0, v0}, La/a5b;-><init>(La/g5b;B)V

    .line 123
    .line 124
    .line 125
    const-string v0, "REQUEST_CLEAR_GROUPS_DIALOG_KEY"

    .line 126
    .line 127
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 128
    .line 129
    .line 130
    new-instance p1, La/a5b;

    .line 131
    .line 132
    const/4 v0, 0x7

    .line 133
    invoke-direct {p1, p0, v0}, La/a5b;-><init>(La/g5b;B)V

    .line 134
    .line 135
    .line 136
    const-string v0, "REMOVE_ALL_COEF_TRACK_RESULT"

    .line 137
    .line 138
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 139
    .line 140
    .line 141
    new-instance p1, La/a5b;

    .line 142
    .line 143
    const/16 v0, 0x8

    .line 144
    .line 145
    invoke-direct {p1, p0, v0}, La/a5b;-><init>(La/g5b;B)V

    .line 146
    .line 147
    .line 148
    const-string v0, "REMOVE_ALL_TEAM_RESULT"

    .line 149
    .line 150
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 151
    .line 152
    .line 153
    new-instance p1, La/a5b;

    .line 154
    .line 155
    const/16 v0, 0x9

    .line 156
    .line 157
    invoke-direct {p1, p0, v0}, La/a5b;-><init>(La/g5b;B)V

    .line 158
    .line 159
    .line 160
    const-string v0, "REMOVE_ALL_TOURNAMENTS_RESULT"

    .line 161
    .line 162
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 163
    .line 164
    .line 165
    new-instance p1, La/a5b;

    .line 166
    .line 167
    const/16 v0, 0xa

    .line 168
    .line 169
    invoke-direct {p1, p0, v0}, La/a5b;-><init>(La/g5b;B)V

    .line 170
    .line 171
    .line 172
    const-string v0, "REMOVE_ALL_FAVORITES_AGGREGATOR_RESULT"

    .line 173
    .line 174
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 175
    .line 176
    .line 177
    new-instance p1, La/a5b;

    .line 178
    .line 179
    const/16 v0, 0xb

    .line 180
    .line 181
    invoke-direct {p1, p0, v0}, La/a5b;-><init>(La/g5b;B)V

    .line 182
    .line 183
    .line 184
    const-string v0, "REMOVE_ALL_FAVORITES_XGAMES_RESULT"

    .line 185
    .line 186
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 187
    .line 188
    .line 189
    new-instance p1, La/a5b;

    .line 190
    .line 191
    const/16 v0, 0xc

    .line 192
    .line 193
    invoke-direct {p1, p0, v0}, La/a5b;-><init>(La/g5b;B)V

    .line 194
    .line 195
    .line 196
    const-string v0, "REMOVE_ALL_VIEWED_RESULT"

    .line 197
    .line 198
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    new-instance v0, La/c5b;

    .line 206
    .line 207
    const/4 v1, 0x0

    .line 208
    invoke-direct {v0, p0, v1}, La/c5b;-><init>(La/g5b;B)V

    .line 209
    .line 210
    .line 211
    const-string v1, "REMOVE_ALL_SPORT_EVENTS_RESULT"

    .line 212
    .line 213
    invoke-virtual {p1, v1, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public final G0(La/bzl;La/fet;I)V
    .locals 23

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, 0x466be43f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v10, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v10

    .line 31
    :goto_1
    and-int/lit8 v1, v10, 0x30

    .line 32
    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    and-int/lit8 v1, v10, 0x40

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :goto_2
    if-eqz v1, :cond_3

    .line 51
    .line 52
    move v1, v3

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    const/16 v1, 0x10

    .line 55
    .line 56
    :goto_3
    or-int/2addr v0, v1

    .line 57
    :cond_4
    move v11, v0

    .line 58
    and-int/lit8 v0, v11, 0x13

    .line 59
    .line 60
    const/16 v1, 0x12

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    const/4 v4, 0x1

    .line 64
    if-eq v0, v1, :cond_5

    .line 65
    .line 66
    move v0, v4

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    move v0, v12

    .line 69
    :goto_4
    and-int/lit8 v1, v11, 0x1

    .line 70
    .line 71
    invoke-virtual {v9, v1, v0}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_f

    .line 76
    .line 77
    invoke-virtual {v2}, La/g5b;->O0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v14, La/ukd;->a:La/cl5;

    .line 86
    .line 87
    if-ne v0, v14, :cond_6

    .line 88
    .line 89
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 90
    .line 91
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_6
    move-object v15, v0

    .line 99
    check-cast v15, La/vne;

    .line 100
    .line 101
    and-int/lit8 v0, v11, 0x70

    .line 102
    .line 103
    if-eq v0, v3, :cond_8

    .line 104
    .line 105
    and-int/lit8 v0, v11, 0x40

    .line 106
    .line 107
    if-eqz v0, :cond_7

    .line 108
    .line 109
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    goto :goto_5

    .line 116
    :cond_7
    move v4, v12

    .line 117
    :cond_8
    :goto_5
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-nez v4, :cond_a

    .line 122
    .line 123
    if-ne v0, v14, :cond_9

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_9
    move-object v7, v2

    .line 127
    goto :goto_7

    .line 128
    :cond_a
    :goto_6
    new-instance v0, La/vra;

    .line 129
    .line 130
    const/4 v6, 0x0

    .line 131
    const/16 v7, 0xb

    .line 132
    .line 133
    const/4 v1, 0x1

    .line 134
    const-class v3, La/g5b;

    .line 135
    .line 136
    const-string v4, "handleAggregatorSideEffect"

    .line 137
    .line 138
    const-string v5, "handleAggregatorSideEffect(Lorg/xplatform/favorites/impl/presentation/aggregator/models/AggregatorSideEffect;)V"

    .line 139
    .line 140
    invoke-direct/range {v0 .. v7}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 141
    .line 142
    .line 143
    move-object v7, v2

    .line 144
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    :goto_7
    check-cast v0, La/jhy;

    .line 148
    .line 149
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 150
    .line 151
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    invoke-virtual {v9, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    or-int/2addr v2, v3

    .line 162
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    or-int/2addr v2, v3

    .line 167
    const/4 v3, 0x0

    .line 168
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    or-int/2addr v2, v3

    .line 173
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    if-nez v2, :cond_b

    .line 178
    .line 179
    if-ne v3, v14, :cond_c

    .line 180
    .line 181
    :cond_b
    new-instance v3, La/et;

    .line 182
    .line 183
    const/16 v2, 0x9

    .line 184
    .line 185
    invoke-direct {v3, v15, v13, v0, v2}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 192
    .line 193
    invoke-static {v1, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v7}, La/g5b;->O0()La/k3t0;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, La/i3t0;

    .line 201
    .line 202
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    move-object v3, v0

    .line 211
    check-cast v3, La/f2p;

    .line 212
    .line 213
    invoke-virtual {v7}, La/g5b;->Q0()La/k3t0;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    new-instance v1, La/o4b;

    .line 218
    .line 219
    new-instance v2, La/cx70;

    .line 220
    .line 221
    iget-object v4, v3, La/f2p;->b:La/zpv;

    .line 222
    .line 223
    invoke-direct {v2, v4}, La/cx70;-><init>(La/zpv;)V

    .line 224
    .line 225
    .line 226
    invoke-direct {v1, v2}, La/o4b;-><init>(La/jx70;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v7}, La/g5b;->S0()La/bdz;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v7}, La/g5b;->O0()La/k3t0;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v1

    .line 244
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    if-nez v1, :cond_d

    .line 249
    .line 250
    if-ne v4, v14, :cond_e

    .line 251
    .line 252
    :cond_d
    new-instance v15, La/vra;

    .line 253
    .line 254
    const/16 v21, 0x0

    .line 255
    .line 256
    const/16 v22, 0xc

    .line 257
    .line 258
    const/16 v16, 0x1

    .line 259
    .line 260
    const-class v18, La/k3t0;

    .line 261
    .line 262
    const-string v19, "onAction"

    .line 263
    .line 264
    const-string v20, "onAction(Ljava/lang/Object;)V"

    .line 265
    .line 266
    move-object/from16 v17, v0

    .line 267
    .line 268
    invoke-direct/range {v15 .. v22}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v9, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    move-object v4, v15

    .line 275
    :cond_e
    check-cast v4, La/jhy;

    .line 276
    .line 277
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 278
    .line 279
    shl-int/lit8 v0, v11, 0x3

    .line 280
    .line 281
    and-int/lit8 v6, v0, 0x70

    .line 282
    .line 283
    const/4 v0, 0x0

    .line 284
    move-object v1, v8

    .line 285
    move-object v5, v9

    .line 286
    invoke-static/range {v0 .. v6}, La/uc9;->y(La/mm40;La/bzl;La/bdz;La/f2p;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_f
    move-object v7, v2

    .line 291
    move-object v1, v8

    .line 292
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 293
    .line 294
    .line 295
    :goto_8
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    if-eqz v0, :cond_10

    .line 300
    .line 301
    new-instance v2, La/d5b;

    .line 302
    .line 303
    invoke-direct {v2, v7, v1, v10, v12}, La/d5b;-><init>(La/g5b;La/bzl;IB)V

    .line 304
    .line 305
    .line 306
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 307
    .line 308
    :cond_10
    return-void
.end method

.method public final H0(La/bzl;La/fet;I)V
    .locals 24

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, -0x98b6d02

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v10, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v10

    .line 31
    :goto_1
    and-int/lit8 v1, v10, 0x30

    .line 32
    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    and-int/lit8 v1, v10, 0x40

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :goto_2
    if-eqz v1, :cond_3

    .line 51
    .line 52
    move v1, v3

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    const/16 v1, 0x10

    .line 55
    .line 56
    :goto_3
    or-int/2addr v0, v1

    .line 57
    :cond_4
    move v11, v0

    .line 58
    and-int/lit8 v0, v11, 0x13

    .line 59
    .line 60
    const/16 v1, 0x12

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x1

    .line 64
    if-eq v0, v1, :cond_5

    .line 65
    .line 66
    move v0, v5

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    move v0, v4

    .line 69
    :goto_4
    and-int/lit8 v1, v11, 0x1

    .line 70
    .line 71
    invoke-virtual {v9, v1, v0}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_f

    .line 76
    .line 77
    invoke-virtual {v2}, La/g5b;->T0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v13, La/ukd;->a:La/cl5;

    .line 86
    .line 87
    if-ne v0, v13, :cond_6

    .line 88
    .line 89
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 90
    .line 91
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_6
    move-object v14, v0

    .line 99
    check-cast v14, La/vne;

    .line 100
    .line 101
    and-int/lit8 v0, v11, 0x70

    .line 102
    .line 103
    if-eq v0, v3, :cond_7

    .line 104
    .line 105
    and-int/lit8 v0, v11, 0x40

    .line 106
    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_8

    .line 114
    .line 115
    :cond_7
    move v4, v5

    .line 116
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-nez v4, :cond_a

    .line 121
    .line 122
    if-ne v0, v13, :cond_9

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_9
    move-object v15, v2

    .line 126
    goto :goto_6

    .line 127
    :cond_a
    :goto_5
    new-instance v0, La/vra;

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    const/16 v7, 0xd

    .line 131
    .line 132
    const/4 v1, 0x1

    .line 133
    const-class v3, La/g5b;

    .line 134
    .line 135
    const-string v4, "handleAltSportEventsSideEffect"

    .line 136
    .line 137
    const-string v5, "handleAltSportEventsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_events/models/AltSportEventsSideEffect;)V"

    .line 138
    .line 139
    invoke-direct/range {v0 .. v7}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 140
    .line 141
    .line 142
    move-object v15, v2

    .line 143
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :goto_6
    check-cast v0, La/jhy;

    .line 147
    .line 148
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 149
    .line 150
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {v9, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    or-int/2addr v2, v3

    .line 161
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    or-int/2addr v2, v3

    .line 166
    const/4 v3, 0x0

    .line 167
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    or-int/2addr v2, v3

    .line 172
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    if-nez v2, :cond_b

    .line 177
    .line 178
    if-ne v3, v13, :cond_c

    .line 179
    .line 180
    :cond_b
    new-instance v3, La/et;

    .line 181
    .line 182
    const/16 v2, 0xa

    .line 183
    .line 184
    invoke-direct {v3, v14, v12, v0, v2}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 191
    .line 192
    invoke-static {v1, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v15}, La/g5b;->T0()La/k3t0;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, La/i3t0;

    .line 200
    .line 201
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    move-object v3, v0

    .line 210
    check-cast v3, La/vg2;

    .line 211
    .line 212
    invoke-virtual {v15}, La/g5b;->Q0()La/k3t0;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    new-instance v1, La/o4b;

    .line 217
    .line 218
    new-instance v2, La/ex70;

    .line 219
    .line 220
    iget-object v4, v3, La/vg2;->e:La/zpv;

    .line 221
    .line 222
    invoke-direct {v2, v4}, La/ex70;-><init>(La/zpv;)V

    .line 223
    .line 224
    .line 225
    invoke-direct {v1, v2}, La/o4b;-><init>(La/jx70;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    sget-object v0, La/qmk;->a:La/zcl;

    .line 232
    .line 233
    invoke-virtual {v15}, La/g5b;->S0()La/bdz;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v15}, La/g5b;->T0()La/k3t0;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    if-nez v2, :cond_d

    .line 250
    .line 251
    if-ne v4, v13, :cond_e

    .line 252
    .line 253
    :cond_d
    new-instance v16, La/vra;

    .line 254
    .line 255
    const/16 v22, 0x0

    .line 256
    .line 257
    const/16 v23, 0xe

    .line 258
    .line 259
    const/16 v17, 0x1

    .line 260
    .line 261
    const-class v19, La/k3t0;

    .line 262
    .line 263
    const-string v20, "onAction"

    .line 264
    .line 265
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 266
    .line 267
    move-object/from16 v18, v0

    .line 268
    .line 269
    invoke-direct/range {v16 .. v23}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 270
    .line 271
    .line 272
    move-object/from16 v4, v16

    .line 273
    .line 274
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :cond_e
    check-cast v4, La/jhy;

    .line 278
    .line 279
    move-object v5, v4

    .line 280
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 281
    .line 282
    shl-int/lit8 v0, v11, 0x6

    .line 283
    .line 284
    and-int/lit16 v7, v0, 0x380

    .line 285
    .line 286
    const/4 v8, 0x1

    .line 287
    const/4 v0, 0x0

    .line 288
    const/4 v4, 0x0

    .line 289
    move-object/from16 v2, p1

    .line 290
    .line 291
    move-object v6, v9

    .line 292
    invoke-static/range {v0 .. v8}, La/f1t0;->c(La/mm40;La/bdz;La/bzl;La/vg2;FLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 293
    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_f
    move-object v15, v2

    .line 297
    move-object v2, v8

    .line 298
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 299
    .line 300
    .line 301
    :goto_7
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    if-eqz v0, :cond_10

    .line 306
    .line 307
    new-instance v1, La/d5b;

    .line 308
    .line 309
    const/4 v3, 0x5

    .line 310
    invoke-direct {v1, v15, v2, v10, v3}, La/d5b;-><init>(La/g5b;La/bzl;IB)V

    .line 311
    .line 312
    .line 313
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 314
    .line 315
    :cond_10
    return-void
.end method

.method public final I0(La/bzl;La/fet;I)V
    .locals 24

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, 0x23aca14d

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v10, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v10

    .line 31
    :goto_1
    and-int/lit8 v1, v10, 0x30

    .line 32
    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    and-int/lit8 v1, v10, 0x40

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :goto_2
    if-eqz v1, :cond_3

    .line 51
    .line 52
    move v1, v3

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    const/16 v1, 0x10

    .line 55
    .line 56
    :goto_3
    or-int/2addr v0, v1

    .line 57
    :cond_4
    move v11, v0

    .line 58
    and-int/lit8 v0, v11, 0x13

    .line 59
    .line 60
    const/16 v1, 0x12

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x1

    .line 64
    if-eq v0, v1, :cond_5

    .line 65
    .line 66
    move v0, v5

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    move v0, v4

    .line 69
    :goto_4
    and-int/lit8 v1, v11, 0x1

    .line 70
    .line 71
    invoke-virtual {v9, v1, v0}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v12, 0x6

    .line 76
    if-eqz v0, :cond_f

    .line 77
    .line 78
    invoke-virtual {v2}, La/g5b;->U0()La/k3t0;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v14, La/ukd;->a:La/cl5;

    .line 87
    .line 88
    if-ne v0, v14, :cond_6

    .line 89
    .line 90
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 91
    .line 92
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    move-object v15, v0

    .line 100
    check-cast v15, La/vne;

    .line 101
    .line 102
    and-int/lit8 v0, v11, 0x70

    .line 103
    .line 104
    if-eq v0, v3, :cond_7

    .line 105
    .line 106
    and-int/lit8 v0, v11, 0x40

    .line 107
    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    :cond_7
    move v4, v5

    .line 117
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-nez v4, :cond_9

    .line 122
    .line 123
    if-ne v0, v14, :cond_a

    .line 124
    .line 125
    :cond_9
    new-instance v0, La/vra;

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    const/16 v7, 0xf

    .line 129
    .line 130
    const/4 v1, 0x1

    .line 131
    const-class v3, La/g5b;

    .line 132
    .line 133
    const-string v4, "handleAltSportTeamsSideEffect"

    .line 134
    .line 135
    const-string v5, "handleAltSportTeamsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_teams/models/AltSportTeamsSideEffect;)V"

    .line 136
    .line 137
    invoke-direct/range {v0 .. v7}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_a
    check-cast v0, La/jhy;

    .line 144
    .line 145
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 146
    .line 147
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    invoke-virtual {v9, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    or-int/2addr v2, v3

    .line 158
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    or-int/2addr v2, v3

    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    or-int/2addr v2, v3

    .line 169
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-nez v2, :cond_b

    .line 174
    .line 175
    if-ne v3, v14, :cond_c

    .line 176
    .line 177
    :cond_b
    new-instance v3, La/et;

    .line 178
    .line 179
    const/16 v2, 0xb

    .line 180
    .line 181
    invoke-direct {v3, v15, v13, v0, v2}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 188
    .line 189
    invoke-static {v1, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {p0 .. p0}, La/g5b;->U0()La/k3t0;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, La/i3t0;

    .line 197
    .line 198
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object v3, v0

    .line 207
    check-cast v3, La/fi2;

    .line 208
    .line 209
    invoke-virtual/range {p0 .. p0}, La/g5b;->Q0()La/k3t0;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    new-instance v1, La/o4b;

    .line 214
    .line 215
    new-instance v2, La/fx70;

    .line 216
    .line 217
    iget-object v4, v3, La/fi2;->e:La/zpv;

    .line 218
    .line 219
    invoke-direct {v2, v4}, La/fx70;-><init>(La/zpv;)V

    .line 220
    .line 221
    .line 222
    invoke-direct {v1, v2}, La/o4b;-><init>(La/jx70;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    sget-object v0, La/qmk;->a:La/zcl;

    .line 229
    .line 230
    invoke-virtual/range {p0 .. p0}, La/g5b;->S0()La/bdz;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual/range {p0 .. p0}, La/g5b;->U0()La/k3t0;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    if-nez v2, :cond_d

    .line 247
    .line 248
    if-ne v4, v14, :cond_e

    .line 249
    .line 250
    :cond_d
    new-instance v15, La/vra;

    .line 251
    .line 252
    const/16 v21, 0x0

    .line 253
    .line 254
    const/16 v22, 0x10

    .line 255
    .line 256
    const/16 v16, 0x1

    .line 257
    .line 258
    const-class v18, La/k3t0;

    .line 259
    .line 260
    const-string v19, "onAction"

    .line 261
    .line 262
    const-string v20, "onAction(Ljava/lang/Object;)V"

    .line 263
    .line 264
    move-object/from16 v17, v0

    .line 265
    .line 266
    invoke-direct/range {v15 .. v22}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    move-object v4, v15

    .line 273
    :cond_e
    check-cast v4, La/jhy;

    .line 274
    .line 275
    move-object v5, v4

    .line 276
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 277
    .line 278
    shl-int/lit8 v0, v11, 0x6

    .line 279
    .line 280
    and-int/lit16 v7, v0, 0x380

    .line 281
    .line 282
    const/4 v0, 0x0

    .line 283
    const/4 v4, 0x0

    .line 284
    move-object v2, v8

    .line 285
    move-object v6, v9

    .line 286
    move-object/from16 v8, p0

    .line 287
    .line 288
    invoke-static/range {v0 .. v7}, La/phu0;->b(La/mm40;La/bdz;La/bzl;La/fi2;FLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_f
    move-object/from16 v23, v8

    .line 293
    .line 294
    move-object v8, v2

    .line 295
    move-object/from16 v2, v23

    .line 296
    .line 297
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 298
    .line 299
    .line 300
    :goto_5
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    if-eqz v0, :cond_10

    .line 305
    .line 306
    new-instance v1, La/d5b;

    .line 307
    .line 308
    invoke-direct {v1, v8, v2, v10, v12}, La/d5b;-><init>(La/g5b;La/bzl;IB)V

    .line 309
    .line 310
    .line 311
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 312
    .line 313
    :cond_10
    return-void
.end method

.method public final J0(La/bzl;La/fet;I)V
    .locals 24

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, 0x1a611c59

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v10, 0x6

    .line 16
    .line 17
    const/4 v11, 0x4

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    move v0, v11

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x2

    .line 29
    :goto_0
    or-int/2addr v0, v10

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v0, v10

    .line 32
    :goto_1
    and-int/lit8 v1, v10, 0x30

    .line 33
    .line 34
    const/16 v3, 0x20

    .line 35
    .line 36
    if-nez v1, :cond_4

    .line 37
    .line 38
    and-int/lit8 v1, v10, 0x40

    .line 39
    .line 40
    if-nez v1, :cond_2

    .line 41
    .line 42
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    :goto_2
    if-eqz v1, :cond_3

    .line 52
    .line 53
    move v1, v3

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    const/16 v1, 0x10

    .line 56
    .line 57
    :goto_3
    or-int/2addr v0, v1

    .line 58
    :cond_4
    move v12, v0

    .line 59
    and-int/lit8 v0, v12, 0x13

    .line 60
    .line 61
    const/16 v1, 0x12

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x1

    .line 65
    if-eq v0, v1, :cond_5

    .line 66
    .line 67
    move v0, v5

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move v0, v4

    .line 70
    :goto_4
    and-int/lit8 v1, v12, 0x1

    .line 71
    .line 72
    invoke-virtual {v9, v1, v0}, La/fet;->U(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_f

    .line 77
    .line 78
    invoke-virtual {v2}, La/g5b;->V0()La/k3t0;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v14, La/ukd;->a:La/cl5;

    .line 87
    .line 88
    if-ne v0, v14, :cond_6

    .line 89
    .line 90
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 91
    .line 92
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    move-object v15, v0

    .line 100
    check-cast v15, La/vne;

    .line 101
    .line 102
    and-int/lit8 v0, v12, 0x70

    .line 103
    .line 104
    if-eq v0, v3, :cond_7

    .line 105
    .line 106
    and-int/lit8 v0, v12, 0x40

    .line 107
    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    :cond_7
    move v4, v5

    .line 117
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-nez v4, :cond_9

    .line 122
    .line 123
    if-ne v0, v14, :cond_a

    .line 124
    .line 125
    :cond_9
    new-instance v0, La/vra;

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    const/16 v7, 0x11

    .line 129
    .line 130
    const/4 v1, 0x1

    .line 131
    const-class v3, La/g5b;

    .line 132
    .line 133
    const-string v4, "handleAltSportTournamentsSideEffect"

    .line 134
    .line 135
    const-string v5, "handleAltSportTournamentsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tournaments/models/AltSportTournamentsSideEffect;)V"

    .line 136
    .line 137
    invoke-direct/range {v0 .. v7}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_a
    check-cast v0, La/jhy;

    .line 144
    .line 145
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 146
    .line 147
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    invoke-virtual {v9, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    or-int/2addr v2, v3

    .line 158
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    or-int/2addr v2, v3

    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    or-int/2addr v2, v3

    .line 169
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-nez v2, :cond_b

    .line 174
    .line 175
    if-ne v3, v14, :cond_c

    .line 176
    .line 177
    :cond_b
    new-instance v3, La/et;

    .line 178
    .line 179
    const/16 v2, 0xc

    .line 180
    .line 181
    invoke-direct {v3, v15, v13, v0, v2}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 188
    .line 189
    invoke-static {v1, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {p0 .. p0}, La/g5b;->V0()La/k3t0;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, La/i3t0;

    .line 197
    .line 198
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object v3, v0

    .line 207
    check-cast v3, La/qj2;

    .line 208
    .line 209
    invoke-virtual/range {p0 .. p0}, La/g5b;->Q0()La/k3t0;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    new-instance v1, La/o4b;

    .line 214
    .line 215
    new-instance v2, La/gx70;

    .line 216
    .line 217
    iget-object v4, v3, La/qj2;->e:La/zpv;

    .line 218
    .line 219
    invoke-direct {v2, v4}, La/gx70;-><init>(La/zpv;)V

    .line 220
    .line 221
    .line 222
    invoke-direct {v1, v2}, La/o4b;-><init>(La/jx70;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    sget-object v0, La/qmk;->a:La/zcl;

    .line 229
    .line 230
    invoke-virtual/range {p0 .. p0}, La/g5b;->S0()La/bdz;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual/range {p0 .. p0}, La/g5b;->V0()La/k3t0;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    if-nez v2, :cond_d

    .line 247
    .line 248
    if-ne v4, v14, :cond_e

    .line 249
    .line 250
    :cond_d
    new-instance v15, La/vra;

    .line 251
    .line 252
    const/16 v21, 0x0

    .line 253
    .line 254
    const/16 v22, 0x12

    .line 255
    .line 256
    const/16 v16, 0x1

    .line 257
    .line 258
    const-class v18, La/k3t0;

    .line 259
    .line 260
    const-string v19, "onAction"

    .line 261
    .line 262
    const-string v20, "onAction(Ljava/lang/Object;)V"

    .line 263
    .line 264
    move-object/from16 v17, v0

    .line 265
    .line 266
    invoke-direct/range {v15 .. v22}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    move-object v4, v15

    .line 273
    :cond_e
    check-cast v4, La/jhy;

    .line 274
    .line 275
    move-object v5, v4

    .line 276
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 277
    .line 278
    shl-int/lit8 v0, v12, 0x6

    .line 279
    .line 280
    and-int/lit16 v7, v0, 0x380

    .line 281
    .line 282
    const/4 v0, 0x0

    .line 283
    const/4 v4, 0x0

    .line 284
    move-object v2, v8

    .line 285
    move-object v6, v9

    .line 286
    move-object/from16 v8, p0

    .line 287
    .line 288
    invoke-static/range {v0 .. v7}, La/i4w0;->b(La/mm40;La/bdz;La/bzl;La/qj2;FLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 289
    .line 290
    .line 291
    goto :goto_5

    .line 292
    :cond_f
    move-object/from16 v23, v8

    .line 293
    .line 294
    move-object v8, v2

    .line 295
    move-object/from16 v2, v23

    .line 296
    .line 297
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 298
    .line 299
    .line 300
    :goto_5
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    if-eqz v0, :cond_10

    .line 305
    .line 306
    new-instance v1, La/d5b;

    .line 307
    .line 308
    invoke-direct {v1, v8, v2, v10, v11}, La/d5b;-><init>(La/g5b;La/bzl;IB)V

    .line 309
    .line 310
    .line 311
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 312
    .line 313
    :cond_10
    return-void
.end method

.method public final K0(La/bzl;La/fet;I)V
    .locals 24

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, -0x68614427

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v10, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v10

    .line 31
    :goto_1
    and-int/lit8 v1, v10, 0x30

    .line 32
    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    and-int/lit8 v1, v10, 0x40

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :goto_2
    if-eqz v1, :cond_3

    .line 51
    .line 52
    move v1, v3

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    const/16 v1, 0x10

    .line 55
    .line 56
    :goto_3
    or-int/2addr v0, v1

    .line 57
    :cond_4
    move v11, v0

    .line 58
    and-int/lit8 v0, v11, 0x13

    .line 59
    .line 60
    const/16 v1, 0x12

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x1

    .line 64
    if-eq v0, v1, :cond_5

    .line 65
    .line 66
    move v0, v5

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    move v0, v4

    .line 69
    :goto_4
    and-int/lit8 v1, v11, 0x1

    .line 70
    .line 71
    invoke-virtual {v9, v1, v0}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_f

    .line 76
    .line 77
    invoke-virtual {v2}, La/g5b;->P0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object v12

    .line 81
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    sget-object v13, La/ukd;->a:La/cl5;

    .line 86
    .line 87
    if-ne v0, v13, :cond_6

    .line 88
    .line 89
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 90
    .line 91
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_6
    move-object v14, v0

    .line 99
    check-cast v14, La/vne;

    .line 100
    .line 101
    and-int/lit8 v0, v11, 0x70

    .line 102
    .line 103
    if-eq v0, v3, :cond_7

    .line 104
    .line 105
    and-int/lit8 v0, v11, 0x40

    .line 106
    .line 107
    if-eqz v0, :cond_8

    .line 108
    .line 109
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_8

    .line 114
    .line 115
    :cond_7
    move v4, v5

    .line 116
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-nez v4, :cond_a

    .line 121
    .line 122
    if-ne v0, v13, :cond_9

    .line 123
    .line 124
    goto :goto_5

    .line 125
    :cond_9
    move-object v15, v2

    .line 126
    goto :goto_6

    .line 127
    :cond_a
    :goto_5
    new-instance v0, La/vra;

    .line 128
    .line 129
    const/4 v6, 0x0

    .line 130
    const/16 v7, 0x13

    .line 131
    .line 132
    const/4 v1, 0x1

    .line 133
    const-class v3, La/g5b;

    .line 134
    .line 135
    const-string v4, "handleAltSportTrackedSideEffect"

    .line 136
    .line 137
    const-string v5, "handleAltSportTrackedSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tracked/models/AltSportTrackedSideEffect;)V"

    .line 138
    .line 139
    invoke-direct/range {v0 .. v7}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 140
    .line 141
    .line 142
    move-object v15, v2

    .line 143
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :goto_6
    check-cast v0, La/jhy;

    .line 147
    .line 148
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 149
    .line 150
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    invoke-virtual {v9, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    or-int/2addr v2, v3

    .line 161
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    or-int/2addr v2, v3

    .line 166
    const/4 v3, 0x0

    .line 167
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    or-int/2addr v2, v3

    .line 172
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    if-nez v2, :cond_b

    .line 177
    .line 178
    if-ne v3, v13, :cond_c

    .line 179
    .line 180
    :cond_b
    new-instance v3, La/et;

    .line 181
    .line 182
    const/16 v2, 0xd

    .line 183
    .line 184
    invoke-direct {v3, v14, v12, v0, v2}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 191
    .line 192
    invoke-static {v1, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v15}, La/g5b;->P0()La/k3t0;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    check-cast v0, La/i3t0;

    .line 200
    .line 201
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    move-object v3, v0

    .line 210
    check-cast v3, La/ol2;

    .line 211
    .line 212
    invoke-virtual {v15}, La/g5b;->Q0()La/k3t0;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    new-instance v1, La/o4b;

    .line 217
    .line 218
    new-instance v2, La/hx70;

    .line 219
    .line 220
    iget-object v4, v3, La/ol2;->f:La/zpv;

    .line 221
    .line 222
    invoke-direct {v2, v4}, La/hx70;-><init>(La/zpv;)V

    .line 223
    .line 224
    .line 225
    invoke-direct {v1, v2}, La/o4b;-><init>(La/jx70;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    sget-object v0, La/qmk;->a:La/zcl;

    .line 232
    .line 233
    invoke-virtual {v15}, La/g5b;->S0()La/bdz;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    invoke-virtual {v15}, La/g5b;->P0()La/k3t0;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    if-nez v2, :cond_d

    .line 250
    .line 251
    if-ne v4, v13, :cond_e

    .line 252
    .line 253
    :cond_d
    new-instance v16, La/vra;

    .line 254
    .line 255
    const/16 v22, 0x0

    .line 256
    .line 257
    const/16 v23, 0x14

    .line 258
    .line 259
    const/16 v17, 0x1

    .line 260
    .line 261
    const-class v19, La/k3t0;

    .line 262
    .line 263
    const-string v20, "onAction"

    .line 264
    .line 265
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 266
    .line 267
    move-object/from16 v18, v0

    .line 268
    .line 269
    invoke-direct/range {v16 .. v23}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 270
    .line 271
    .line 272
    move-object/from16 v4, v16

    .line 273
    .line 274
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :cond_e
    check-cast v4, La/jhy;

    .line 278
    .line 279
    move-object v5, v4

    .line 280
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 281
    .line 282
    shl-int/lit8 v0, v11, 0x6

    .line 283
    .line 284
    and-int/lit16 v7, v0, 0x380

    .line 285
    .line 286
    const/4 v8, 0x1

    .line 287
    const/4 v0, 0x0

    .line 288
    const/4 v4, 0x0

    .line 289
    move-object/from16 v2, p1

    .line 290
    .line 291
    move-object v6, v9

    .line 292
    invoke-static/range {v0 .. v8}, La/vbw0;->c(La/mm40;La/bdz;La/bzl;La/ol2;FLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 293
    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_f
    move-object v15, v2

    .line 297
    move-object v2, v8

    .line 298
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 299
    .line 300
    .line 301
    :goto_7
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    if-eqz v0, :cond_10

    .line 306
    .line 307
    new-instance v1, La/d5b;

    .line 308
    .line 309
    const/4 v3, 0x7

    .line 310
    invoke-direct {v1, v15, v2, v10, v3}, La/d5b;-><init>(La/g5b;La/bzl;IB)V

    .line 311
    .line 312
    .line 313
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 314
    .line 315
    :cond_10
    return-void
.end method

.method public final L0(La/bzl;La/fet;I)V
    .locals 25

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, 0x376bfd75

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v10, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v10

    .line 31
    :goto_1
    and-int/lit8 v1, v10, 0x30

    .line 32
    .line 33
    const/16 v11, 0x10

    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    and-int/lit8 v1, v10, 0x40

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :goto_2
    if-eqz v1, :cond_3

    .line 53
    .line 54
    move v1, v3

    .line 55
    goto :goto_3

    .line 56
    :cond_3
    move v1, v11

    .line 57
    :goto_3
    or-int/2addr v0, v1

    .line 58
    :cond_4
    and-int/lit8 v1, v0, 0x13

    .line 59
    .line 60
    const/16 v4, 0x12

    .line 61
    .line 62
    const/4 v5, 0x0

    .line 63
    if-eq v1, v4, :cond_5

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    move v1, v5

    .line 68
    :goto_4
    and-int/lit8 v4, v0, 0x1

    .line 69
    .line 70
    invoke-virtual {v9, v4, v1}, La/fet;->U(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_f

    .line 75
    .line 76
    iget-object v13, v2, La/g5b;->X1:La/a8z;

    .line 77
    .line 78
    invoke-interface {v13}, La/a8z;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    move-object v14, v1

    .line 83
    check-cast v14, La/k3t0;

    .line 84
    .line 85
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    sget-object v15, La/ukd;->a:La/cl5;

    .line 90
    .line 91
    if-ne v1, v15, :cond_6

    .line 92
    .line 93
    sget-object v1, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 94
    .line 95
    invoke-static {v1, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    check-cast v1, La/vne;

    .line 103
    .line 104
    and-int/lit8 v4, v0, 0x70

    .line 105
    .line 106
    if-eq v4, v3, :cond_7

    .line 107
    .line 108
    and-int/lit8 v0, v0, 0x40

    .line 109
    .line 110
    if-eqz v0, :cond_8

    .line 111
    .line 112
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    :cond_7
    const/4 v5, 0x1

    .line 119
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    if-nez v5, :cond_a

    .line 124
    .line 125
    if-ne v0, v15, :cond_9

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_9
    move-object v12, v1

    .line 129
    move-object v6, v2

    .line 130
    goto :goto_6

    .line 131
    :cond_a
    :goto_5
    new-instance v0, La/wzu0;

    .line 132
    .line 133
    const/4 v6, 0x0

    .line 134
    const/16 v7, 0x15

    .line 135
    .line 136
    move-object v3, v1

    .line 137
    const/4 v1, 0x1

    .line 138
    move-object v4, v3

    .line 139
    const-class v3, La/g5b;

    .line 140
    .line 141
    move-object v5, v4

    .line 142
    const-string v4, "handleAltSportsContainerSideEffect"

    .line 143
    .line 144
    move-object/from16 v16, v5

    .line 145
    .line 146
    const-string v5, "handleAltSportsContainerSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sports_container/models/AltSportsContainerSideEffect;)V"

    .line 147
    .line 148
    move-object/from16 v12, v16

    .line 149
    .line 150
    invoke-direct/range {v0 .. v7}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 151
    .line 152
    .line 153
    move-object v6, v2

    .line 154
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :goto_6
    check-cast v0, La/jhy;

    .line 158
    .line 159
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 160
    .line 161
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    invoke-virtual {v9, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v2

    .line 167
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    or-int/2addr v2, v3

    .line 172
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    or-int/2addr v2, v3

    .line 177
    const/4 v3, 0x0

    .line 178
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    or-int/2addr v2, v3

    .line 183
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    if-nez v2, :cond_b

    .line 188
    .line 189
    if-ne v3, v15, :cond_c

    .line 190
    .line 191
    :cond_b
    new-instance v3, La/et;

    .line 192
    .line 193
    const/16 v2, 0xe

    .line 194
    .line 195
    invoke-direct {v3, v12, v14, v0, v2}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 202
    .line 203
    invoke-static {v1, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v13}, La/a8z;->getValue()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    check-cast v0, La/k3t0;

    .line 211
    .line 212
    new-instance v1, La/xl2;

    .line 213
    .line 214
    sget-object v2, La/vcp;->b:La/vcp;

    .line 215
    .line 216
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    invoke-interface {v13}, La/a8z;->getValue()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, La/k3t0;

    .line 227
    .line 228
    check-cast v0, La/i3t0;

    .line 229
    .line 230
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    move-object v1, v0

    .line 239
    check-cast v1, La/am2;

    .line 240
    .line 241
    invoke-interface {v13}, La/a8z;->getValue()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    check-cast v0, La/k3t0;

    .line 246
    .line 247
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v2

    .line 251
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    if-nez v2, :cond_d

    .line 256
    .line 257
    if-ne v3, v15, :cond_e

    .line 258
    .line 259
    :cond_d
    new-instance v17, La/vra;

    .line 260
    .line 261
    const/16 v23, 0x0

    .line 262
    .line 263
    const/16 v24, 0x15

    .line 264
    .line 265
    const/16 v18, 0x1

    .line 266
    .line 267
    const-class v20, La/k3t0;

    .line 268
    .line 269
    const-string v21, "onAction"

    .line 270
    .line 271
    const-string v22, "onAction(Ljava/lang/Object;)V"

    .line 272
    .line 273
    move-object/from16 v19, v0

    .line 274
    .line 275
    invoke-direct/range {v17 .. v24}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v3, v17

    .line 279
    .line 280
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_e
    check-cast v3, La/jhy;

    .line 284
    .line 285
    move-object v2, v3

    .line 286
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 287
    .line 288
    new-instance v0, La/ec30;

    .line 289
    .line 290
    invoke-direct {v0, v6, v8, v11}, La/ec30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 291
    .line 292
    .line 293
    const v3, -0x2e3e2ebc

    .line 294
    .line 295
    .line 296
    invoke-static {v3, v0, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    const/16 v5, 0xc00

    .line 301
    .line 302
    const/4 v0, 0x0

    .line 303
    move-object v4, v9

    .line 304
    invoke-static/range {v0 .. v5}, La/hew0;->a(La/mm40;La/am2;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 305
    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_f
    move-object v6, v2

    .line 309
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 310
    .line 311
    .line 312
    :goto_7
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    if-eqz v0, :cond_10

    .line 317
    .line 318
    new-instance v1, La/d5b;

    .line 319
    .line 320
    const/4 v2, 0x1

    .line 321
    invoke-direct {v1, v6, v8, v10, v2}, La/d5b;-><init>(La/g5b;La/bzl;IB)V

    .line 322
    .line 323
    .line 324
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 325
    .line 326
    :cond_10
    return-void
.end method

.method public final M0(La/bzl;La/fet;I)V
    .locals 23

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, 0x48b2c8b2

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v10, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v10

    .line 31
    :goto_1
    and-int/lit8 v1, v10, 0x30

    .line 32
    .line 33
    const/16 v3, 0x20

    .line 34
    .line 35
    if-nez v1, :cond_4

    .line 36
    .line 37
    and-int/lit8 v1, v10, 0x40

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    :goto_2
    if-eqz v1, :cond_3

    .line 51
    .line 52
    move v1, v3

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    const/16 v1, 0x10

    .line 55
    .line 56
    :goto_3
    or-int/2addr v0, v1

    .line 57
    :cond_4
    move v11, v0

    .line 58
    and-int/lit8 v0, v11, 0x13

    .line 59
    .line 60
    const/16 v1, 0x12

    .line 61
    .line 62
    const/4 v4, 0x0

    .line 63
    const/4 v5, 0x1

    .line 64
    if-eq v0, v1, :cond_5

    .line 65
    .line 66
    move v0, v5

    .line 67
    goto :goto_4

    .line 68
    :cond_5
    move v0, v4

    .line 69
    :goto_4
    and-int/lit8 v1, v11, 0x1

    .line 70
    .line 71
    invoke-virtual {v9, v1, v0}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    const/4 v12, 0x3

    .line 76
    if-eqz v0, :cond_f

    .line 77
    .line 78
    invoke-virtual {v2}, La/g5b;->W0()La/k3t0;

    .line 79
    .line 80
    .line 81
    move-result-object v13

    .line 82
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v14, La/ukd;->a:La/cl5;

    .line 87
    .line 88
    if-ne v0, v14, :cond_6

    .line 89
    .line 90
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 91
    .line 92
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    move-object v15, v0

    .line 100
    check-cast v15, La/vne;

    .line 101
    .line 102
    and-int/lit8 v0, v11, 0x70

    .line 103
    .line 104
    if-eq v0, v3, :cond_7

    .line 105
    .line 106
    and-int/lit8 v0, v11, 0x40

    .line 107
    .line 108
    if-eqz v0, :cond_8

    .line 109
    .line 110
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_8

    .line 115
    .line 116
    :cond_7
    move v4, v5

    .line 117
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    if-nez v4, :cond_9

    .line 122
    .line 123
    if-ne v0, v14, :cond_a

    .line 124
    .line 125
    :cond_9
    new-instance v0, La/vra;

    .line 126
    .line 127
    const/4 v6, 0x0

    .line 128
    const/16 v7, 0x16

    .line 129
    .line 130
    const/4 v1, 0x1

    .line 131
    const-class v3, La/g5b;

    .line 132
    .line 133
    const-string v4, "handleViewedTabSideEffect"

    .line 134
    .line 135
    const-string v5, "handleViewedTabSideEffect(Lorg/xplatform/favorites/impl/presentation/viewed/compose/models/AltViewedSideEffect;)V"

    .line 136
    .line 137
    invoke-direct/range {v0 .. v7}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_a
    check-cast v0, La/jhy;

    .line 144
    .line 145
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 146
    .line 147
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    invoke-virtual {v9, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    or-int/2addr v2, v3

    .line 158
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    or-int/2addr v2, v3

    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    or-int/2addr v2, v3

    .line 169
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    if-nez v2, :cond_b

    .line 174
    .line 175
    if-ne v3, v14, :cond_c

    .line 176
    .line 177
    :cond_b
    new-instance v3, La/et;

    .line 178
    .line 179
    const/16 v2, 0xf

    .line 180
    .line 181
    invoke-direct {v3, v15, v13, v0, v2}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 188
    .line 189
    invoke-static {v1, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {p0 .. p0}, La/g5b;->W0()La/k3t0;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, La/i3t0;

    .line 197
    .line 198
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    move-object v3, v0

    .line 207
    check-cast v3, La/pn2;

    .line 208
    .line 209
    invoke-virtual/range {p0 .. p0}, La/g5b;->Q0()La/k3t0;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    new-instance v1, La/o4b;

    .line 214
    .line 215
    new-instance v2, La/ix70;

    .line 216
    .line 217
    iget-object v4, v3, La/pn2;->d:La/zpv;

    .line 218
    .line 219
    invoke-direct {v2, v4}, La/ix70;-><init>(La/zpv;)V

    .line 220
    .line 221
    .line 222
    invoke-direct {v1, v2}, La/o4b;-><init>(La/jx70;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    sget-object v0, La/qmk;->a:La/zcl;

    .line 229
    .line 230
    invoke-virtual/range {p0 .. p0}, La/g5b;->S0()La/bdz;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-virtual/range {p0 .. p0}, La/g5b;->W0()La/k3t0;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v1

    .line 242
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    if-nez v1, :cond_d

    .line 247
    .line 248
    if-ne v4, v14, :cond_e

    .line 249
    .line 250
    :cond_d
    new-instance v15, La/vra;

    .line 251
    .line 252
    const/16 v21, 0x0

    .line 253
    .line 254
    const/16 v22, 0x17

    .line 255
    .line 256
    const/16 v16, 0x1

    .line 257
    .line 258
    const-class v18, La/k3t0;

    .line 259
    .line 260
    const-string v19, "onAction"

    .line 261
    .line 262
    const-string v20, "onAction(Ljava/lang/Object;)V"

    .line 263
    .line 264
    move-object/from16 v17, v0

    .line 265
    .line 266
    invoke-direct/range {v15 .. v22}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v9, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    move-object v4, v15

    .line 273
    :cond_e
    check-cast v4, La/jhy;

    .line 274
    .line 275
    move-object v5, v4

    .line 276
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 277
    .line 278
    shl-int/lit8 v0, v11, 0x3

    .line 279
    .line 280
    and-int/lit8 v7, v0, 0x70

    .line 281
    .line 282
    const/4 v8, 0x1

    .line 283
    const/4 v0, 0x0

    .line 284
    const/high16 v4, 0x41400000    # 12.0f

    .line 285
    .line 286
    move-object/from16 v1, p1

    .line 287
    .line 288
    move-object v6, v9

    .line 289
    move-object/from16 v9, p0

    .line 290
    .line 291
    invoke-static/range {v0 .. v8}, La/nnw0;->o(La/mm40;La/bzl;La/bdz;La/pn2;FLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 292
    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_f
    move-object v9, v2

    .line 296
    move-object v1, v8

    .line 297
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 298
    .line 299
    .line 300
    :goto_5
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    if-eqz v0, :cond_10

    .line 305
    .line 306
    new-instance v2, La/d5b;

    .line 307
    .line 308
    invoke-direct {v2, v9, v1, v10, v12}, La/d5b;-><init>(La/g5b;La/bzl;IB)V

    .line 309
    .line 310
    .line 311
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 312
    .line 313
    :cond_10
    return-void
.end method

.method public final N0(La/bzl;La/fet;I)V
    .locals 25

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    move/from16 v10, p3

    .line 8
    .line 9
    const v0, 0x6d85e49f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v10, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v10

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v10

    .line 31
    :goto_1
    and-int/lit8 v1, v10, 0x30

    .line 32
    .line 33
    const/16 v12, 0x10

    .line 34
    .line 35
    const/16 v3, 0x20

    .line 36
    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    and-int/lit8 v1, v10, 0x40

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    :goto_2
    if-eqz v1, :cond_3

    .line 53
    .line 54
    move v1, v3

    .line 55
    goto :goto_3

    .line 56
    :cond_3
    move v1, v12

    .line 57
    :goto_3
    or-int/2addr v0, v1

    .line 58
    :cond_4
    move v13, v0

    .line 59
    and-int/lit8 v0, v13, 0x13

    .line 60
    .line 61
    const/16 v1, 0x12

    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x1

    .line 65
    if-eq v0, v1, :cond_5

    .line 66
    .line 67
    move v0, v5

    .line 68
    goto :goto_4

    .line 69
    :cond_5
    move v0, v4

    .line 70
    :goto_4
    and-int/lit8 v1, v13, 0x1

    .line 71
    .line 72
    invoke-virtual {v9, v1, v0}, La/fet;->U(IZ)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_f

    .line 77
    .line 78
    invoke-virtual {v2}, La/g5b;->X0()La/k3t0;

    .line 79
    .line 80
    .line 81
    move-result-object v14

    .line 82
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v15, La/ukd;->a:La/cl5;

    .line 87
    .line 88
    if-ne v0, v15, :cond_6

    .line 89
    .line 90
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 91
    .line 92
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_6
    check-cast v0, La/vne;

    .line 100
    .line 101
    and-int/lit8 v1, v13, 0x70

    .line 102
    .line 103
    if-eq v1, v3, :cond_7

    .line 104
    .line 105
    and-int/lit8 v1, v13, 0x40

    .line 106
    .line 107
    if-eqz v1, :cond_8

    .line 108
    .line 109
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_8

    .line 114
    .line 115
    :cond_7
    move v4, v5

    .line 116
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-nez v4, :cond_9

    .line 121
    .line 122
    if-ne v1, v15, :cond_a

    .line 123
    .line 124
    :cond_9
    move-object v1, v0

    .line 125
    goto :goto_5

    .line 126
    :cond_a
    move-object v11, v0

    .line 127
    move-object v7, v2

    .line 128
    goto :goto_6

    .line 129
    :goto_5
    new-instance v0, La/vra;

    .line 130
    .line 131
    const/4 v6, 0x0

    .line 132
    const/16 v7, 0x18

    .line 133
    .line 134
    move-object v3, v1

    .line 135
    const/4 v1, 0x1

    .line 136
    move-object v4, v3

    .line 137
    const-class v3, La/g5b;

    .line 138
    .line 139
    move-object v5, v4

    .line 140
    const-string v4, "handleXGamesSideEffect"

    .line 141
    .line 142
    move-object/from16 v16, v5

    .line 143
    .line 144
    const-string v5, "handleXGamesSideEffect(Lorg/xplatform/favorites/impl/presentation/games/nodels/GamesSideEffect;)V"

    .line 145
    .line 146
    move-object/from16 v11, v16

    .line 147
    .line 148
    invoke-direct/range {v0 .. v7}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 149
    .line 150
    .line 151
    move-object v7, v2

    .line 152
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    move-object v1, v0

    .line 156
    :goto_6
    check-cast v1, La/jhy;

    .line 157
    .line 158
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 159
    .line 160
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    invoke-virtual {v9, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    or-int/2addr v2, v3

    .line 171
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    or-int/2addr v2, v3

    .line 176
    const/4 v3, 0x0

    .line 177
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    or-int/2addr v2, v3

    .line 182
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    if-nez v2, :cond_b

    .line 187
    .line 188
    if-ne v3, v15, :cond_c

    .line 189
    .line 190
    :cond_b
    new-instance v3, La/et;

    .line 191
    .line 192
    invoke-direct {v3, v11, v14, v1, v12}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 199
    .line 200
    invoke-static {v0, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7}, La/g5b;->X0()La/k3t0;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, La/i3t0;

    .line 208
    .line 209
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    move-object v2, v0

    .line 218
    check-cast v2, La/j9p;

    .line 219
    .line 220
    invoke-virtual {v7}, La/g5b;->Q0()La/k3t0;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    new-instance v1, La/o4b;

    .line 225
    .line 226
    new-instance v3, La/dx70;

    .line 227
    .line 228
    iget-object v4, v2, La/j9p;->b:La/zpv;

    .line 229
    .line 230
    invoke-direct {v3, v4}, La/dx70;-><init>(La/zpv;)V

    .line 231
    .line 232
    .line 233
    invoke-direct {v1, v3}, La/o4b;-><init>(La/jx70;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v7}, La/g5b;->S0()La/bdz;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    invoke-virtual {v7}, La/g5b;->X0()La/k3t0;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v1

    .line 251
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    if-nez v1, :cond_d

    .line 256
    .line 257
    if-ne v4, v15, :cond_e

    .line 258
    .line 259
    :cond_d
    new-instance v17, La/vra;

    .line 260
    .line 261
    const/16 v23, 0x0

    .line 262
    .line 263
    const/16 v24, 0x19

    .line 264
    .line 265
    const/16 v18, 0x1

    .line 266
    .line 267
    const-class v20, La/k3t0;

    .line 268
    .line 269
    const-string v21, "onAction"

    .line 270
    .line 271
    const-string v22, "onAction(Ljava/lang/Object;)V"

    .line 272
    .line 273
    move-object/from16 v19, v0

    .line 274
    .line 275
    invoke-direct/range {v17 .. v24}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 276
    .line 277
    .line 278
    move-object/from16 v4, v17

    .line 279
    .line 280
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    :cond_e
    check-cast v4, La/jhy;

    .line 284
    .line 285
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 286
    .line 287
    shl-int/lit8 v0, v13, 0x3

    .line 288
    .line 289
    and-int/lit8 v6, v0, 0x70

    .line 290
    .line 291
    const/4 v0, 0x0

    .line 292
    move-object v1, v8

    .line 293
    move-object v5, v9

    .line 294
    invoke-static/range {v0 .. v6}, La/q8a;->q(La/mm40;La/bzl;La/j9p;La/bdz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 295
    .line 296
    .line 297
    goto :goto_7

    .line 298
    :cond_f
    move-object v7, v2

    .line 299
    move-object v1, v8

    .line 300
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 301
    .line 302
    .line 303
    :goto_7
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    if-eqz v0, :cond_10

    .line 308
    .line 309
    new-instance v2, La/d5b;

    .line 310
    .line 311
    const/4 v3, 0x2

    .line 312
    invoke-direct {v2, v7, v1, v10, v3}, La/d5b;-><init>(La/g5b;La/bzl;IB)V

    .line 313
    .line 314
    .line 315
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 316
    .line 317
    :cond_10
    return-void
.end method

.method public final O0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->U1:La/a8z;

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

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->b2:La/a8z;

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

.method public final Q0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->S1:La/a8z;

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

.method public final R0()La/aci;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->N1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/aci;

    .line 8
    .line 9
    return-object p0
.end method

.method public final S0()La/bdz;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->K1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bdz;

    .line 8
    .line 9
    return-object p0
.end method

.method public final T0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->Y1:La/a8z;

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

.method public final U0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->Z1:La/a8z;

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

.method public final V0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->a2:La/a8z;

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

.method public final W0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->W1:La/a8z;

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

.method public final X0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/g5b;->V1:La/a8z;

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

.method public final Y0(Ljava/lang/String;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/g5b;->R0()La/aci;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/aci;->d:La/ii;

    .line 6
    .line 7
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 8
    .line 9
    const v2, 0x7f13046c

    .line 10
    .line 11
    .line 12
    move v3, v2

    .line 13
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const v4, 0x7f1304d8

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-virtual {p0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const v5, 0x7f13032f

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    sget-object v10, La/n12;->a:La/n12;

    .line 39
    .line 40
    const/4 v11, 0x0

    .line 41
    const/16 v12, 0x5d0

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    move-object v7, v4

    .line 47
    move-object v4, v3

    .line 48
    move-object v3, v7

    .line 49
    move-object v7, p1

    .line 50
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1, p0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/g5b;->R0()La/aci;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/aci;->b:La/itr;

    .line 6
    .line 7
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, La/yx5;->Z()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/g5b;->R0()La/aci;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/aci;->f:La/wdk0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v0, p0, v1}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/g5b;->R0()La/aci;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/aci;->f:La/wdk0;

    .line 6
    .line 7
    invoke-static {v0, p0}, La/wdk0;->a(La/wdk0;Landroidx/fragment/app/Fragment;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 12
    .line 13
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
