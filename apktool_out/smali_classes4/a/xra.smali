.class public final La/xra;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/xra;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cl5",
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
.field public static final X1:La/cl5;

.field public static final synthetic Y1:[La/iiy;


# instance fields
.field public final K1:La/a8z;

.field public final L1:La/yzn0;

.field public final M1:La/n0o0;

.field public final N1:La/a8z;

.field public final O1:La/s0r;

.field public final P1:La/a8z;

.field public final Q1:La/a8z;

.field public final R1:La/a8z;

.field public final S1:La/a8z;

.field public final U1:La/a8z;

.field public final V1:La/a8z;

.field public final W1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/xra;

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
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/xra;->Y1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/cl5;

    .line 33
    .line 34
    const/16 v1, 0x12

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/cl5;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/xra;->X1:La/cl5;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/mn9;

    .line 8
    .line 9
    const/16 v1, 0x19

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/mn9;-><init>(B)V

    .line 12
    .line 13
    .line 14
    sget-object v1, La/wez;->b:La/wez;

    .line 15
    .line 16
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, La/xra;->K1:La/a8z;

    .line 21
    .line 22
    new-instance v0, La/yzn0;

    .line 23
    .line 24
    const-string v2, "FAVORITE_SECTION_KEY"

    .line 25
    .line 26
    invoke-direct {v0, v2}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/xra;->L1:La/yzn0;

    .line 30
    .line 31
    new-instance v0, La/sra;

    .line 32
    .line 33
    const/16 v2, 0x8

    .line 34
    .line 35
    invoke-direct {v0, p0, v2}, La/sra;-><init>(La/xra;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/xra;->M1:La/n0o0;

    .line 43
    .line 44
    new-instance v0, La/sra;

    .line 45
    .line 46
    const/16 v2, 0x9

    .line 47
    .line 48
    invoke-direct {v0, p0, v2}, La/sra;-><init>(La/xra;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/xra;->N1:La/a8z;

    .line 56
    .line 57
    sget-object v0, La/wra;->a:La/wra;

    .line 58
    .line 59
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/xra;->O1:La/s0r;

    .line 64
    .line 65
    sget-object v0, La/sre0;->a:La/tre0;

    .line 66
    .line 67
    const-class v1, La/wsa;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    new-instance v2, La/sra;

    .line 74
    .line 75
    const/16 v3, 0xa

    .line 76
    .line 77
    invoke-direct {v2, p0, v3}, La/sra;-><init>(La/xra;B)V

    .line 78
    .line 79
    .line 80
    const/4 v3, 0x0

    .line 81
    const/16 v4, 0xe

    .line 82
    .line 83
    invoke-static {p0, v1, v3, v2, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, p0, La/xra;->P1:La/a8z;

    .line 88
    .line 89
    const-class v1, La/bm2;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v2, La/sra;

    .line 96
    .line 97
    const/16 v5, 0xb

    .line 98
    .line 99
    invoke-direct {v2, p0, v5}, La/sra;-><init>(La/xra;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v1, v3, v2, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iput-object v1, p0, La/xra;->Q1:La/a8z;

    .line 107
    .line 108
    const-class v1, La/hh2;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    new-instance v2, La/sra;

    .line 115
    .line 116
    const/16 v5, 0xc

    .line 117
    .line 118
    invoke-direct {v2, p0, v5}, La/sra;-><init>(La/xra;B)V

    .line 119
    .line 120
    .line 121
    invoke-static {p0, v1, v3, v2, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iput-object v1, p0, La/xra;->R1:La/a8z;

    .line 126
    .line 127
    const-class v1, La/qi2;

    .line 128
    .line 129
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    new-instance v2, La/sra;

    .line 134
    .line 135
    const/16 v5, 0xd

    .line 136
    .line 137
    invoke-direct {v2, p0, v5}, La/sra;-><init>(La/xra;B)V

    .line 138
    .line 139
    .line 140
    invoke-static {p0, v1, v3, v2, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iput-object v1, p0, La/xra;->S1:La/a8z;

    .line 145
    .line 146
    const-class v1, La/fk2;

    .line 147
    .line 148
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    new-instance v2, La/sra;

    .line 153
    .line 154
    invoke-direct {v2, p0, v4}, La/sra;-><init>(La/xra;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {p0, v1, v3, v2, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    iput-object v1, p0, La/xra;->U1:La/a8z;

    .line 162
    .line 163
    const-class v1, La/yn2;

    .line 164
    .line 165
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-instance v2, La/sra;

    .line 170
    .line 171
    const/16 v5, 0xf

    .line 172
    .line 173
    invoke-direct {v2, p0, v5}, La/sra;-><init>(La/xra;B)V

    .line 174
    .line 175
    .line 176
    invoke-static {p0, v1, v3, v2, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    iput-object v1, p0, La/xra;->V1:La/a8z;

    .line 181
    .line 182
    const-class v1, La/ul2;

    .line 183
    .line 184
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    new-instance v1, La/sra;

    .line 189
    .line 190
    const/4 v2, 0x0

    .line 191
    invoke-direct {v1, p0, v2}, La/sra;-><init>(La/xra;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {p0, v0, v3, v1, v4}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iput-object v0, p0, La/xra;->W1:La/a8z;

    .line 199
    .line 200
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/xra;->N0()La/pbi;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/pbi;->b:La/itr;

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
    new-instance v1, La/tra;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-direct {v1, p0, v2}, La/tra;-><init>(La/xra;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p0, v0, v1}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    sget-object p1, La/xra;->Y1:[La/iiy;

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    aget-object p1, p1, v0

    .line 32
    .line 33
    iget-object v1, p0, La/xra;->O1:La/s0r;

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
    invoke-direct {v1, p0, v0}, La/bna;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    new-instance v2, La/ugd;

    .line 52
    .line 53
    const v3, -0x634d1772

    .line 54
    .line 55
    .line 56
    invoke-direct {v2, v3, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    invoke-static {p1, v1, v2}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 61
    .line 62
    .line 63
    new-instance p1, La/sra;

    .line 64
    .line 65
    const/4 v1, 0x3

    .line 66
    invoke-direct {p1, p0, v1}, La/sra;-><init>(La/xra;B)V

    .line 67
    .line 68
    .line 69
    const-string v1, "REMOVE_ALL_VIEWED_RESULT"

    .line 70
    .line 71
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 72
    .line 73
    .line 74
    new-instance p1, La/sra;

    .line 75
    .line 76
    const/4 v1, 0x4

    .line 77
    invoke-direct {p1, p0, v1}, La/sra;-><init>(La/xra;B)V

    .line 78
    .line 79
    .line 80
    const-string v1, "REMOVE_ALL_COEF_TRACK_RESULT"

    .line 81
    .line 82
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 83
    .line 84
    .line 85
    new-instance p1, La/sra;

    .line 86
    .line 87
    const/4 v1, 0x5

    .line 88
    invoke-direct {p1, p0, v1}, La/sra;-><init>(La/xra;B)V

    .line 89
    .line 90
    .line 91
    const-string v1, "REMOVE_ALL_TEAM_RESULT"

    .line 92
    .line 93
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 94
    .line 95
    .line 96
    new-instance p1, La/sra;

    .line 97
    .line 98
    const/4 v1, 0x6

    .line 99
    invoke-direct {p1, p0, v1}, La/sra;-><init>(La/xra;B)V

    .line 100
    .line 101
    .line 102
    const-string v1, "REMOVE_ALL_TOURNAMENTS_RESULT"

    .line 103
    .line 104
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    new-instance v1, La/gne;

    .line 112
    .line 113
    const/16 v2, 0x17

    .line 114
    .line 115
    invoke-direct {v1, p0, v2}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 116
    .line 117
    .line 118
    const-string v2, "REMOVE_ALL_SPORT_EVENTS_RESULT"

    .line 119
    .line 120
    invoke-virtual {p1, v2, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 121
    .line 122
    .line 123
    new-instance p1, La/sra;

    .line 124
    .line 125
    invoke-direct {p1, p0, v0}, La/sra;-><init>(La/xra;B)V

    .line 126
    .line 127
    .line 128
    const-string v1, "REQUEST_REMOVE_ONE_EVENT_DIALOG_KEY"

    .line 129
    .line 130
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 131
    .line 132
    .line 133
    new-instance p1, La/sra;

    .line 134
    .line 135
    const/4 v1, 0x2

    .line 136
    invoke-direct {p1, p0, v1}, La/sra;-><init>(La/xra;B)V

    .line 137
    .line 138
    .line 139
    const-string v1, "REQUEST_CLEAR_GROUPS_DIALOG_KEY"

    .line 140
    .line 141
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    new-instance v4, La/tra;

    .line 149
    .line 150
    invoke-direct {v4, p0, v0}, La/tra;-><init>(La/xra;B)V

    .line 151
    .line 152
    .line 153
    new-instance v5, La/sra;

    .line 154
    .line 155
    const/4 p1, 0x7

    .line 156
    invoke-direct {v5, p0, p1}, La/sra;-><init>(La/xra;B)V

    .line 157
    .line 158
    .line 159
    const/4 v6, 0x0

    .line 160
    const/16 v7, 0x12

    .line 161
    .line 162
    move-object v3, p0

    .line 163
    invoke-static/range {v2 .. v7}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final G0(La/bzl;La/fet;I)V
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
    const v0, -0x38db54d3

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
    const/4 v11, 0x2

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
    const/4 v0, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, v11

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
    and-int/lit8 v1, v0, 0x13

    .line 59
    .line 60
    const/16 v4, 0x12

    .line 61
    .line 62
    const/4 v5, 0x1

    .line 63
    if-eq v1, v4, :cond_5

    .line 64
    .line 65
    move v1, v5

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    const/4 v1, 0x0

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
    iget-object v13, v2, La/xra;->Q1:La/a8z;

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
    if-eq v4, v3, :cond_8

    .line 107
    .line 108
    and-int/lit8 v0, v0, 0x40

    .line 109
    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_7
    const/4 v5, 0x0

    .line 120
    :cond_8
    :goto_5
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-nez v5, :cond_a

    .line 125
    .line 126
    if-ne v0, v15, :cond_9

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_9
    move-object v12, v1

    .line 130
    move-object v6, v2

    .line 131
    goto :goto_7

    .line 132
    :cond_a
    :goto_6
    new-instance v0, La/wzu0;

    .line 133
    .line 134
    const/4 v6, 0x0

    .line 135
    const/16 v7, 0x14

    .line 136
    .line 137
    move-object v3, v1

    .line 138
    const/4 v1, 0x1

    .line 139
    move-object v4, v3

    .line 140
    const-class v3, La/xra;

    .line 141
    .line 142
    move-object v5, v4

    .line 143
    const-string v4, "handleAltSportsContainerSideEffect"

    .line 144
    .line 145
    move-object/from16 v16, v5

    .line 146
    .line 147
    const-string v5, "handleAltSportsContainerSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sports_container/models/AltSportsContainerSideEffect;)V"

    .line 148
    .line 149
    move-object/from16 v12, v16

    .line 150
    .line 151
    invoke-direct/range {v0 .. v7}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 152
    .line 153
    .line 154
    move-object v6, v2

    .line 155
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    :goto_7
    check-cast v0, La/jhy;

    .line 159
    .line 160
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 161
    .line 162
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    invoke-virtual {v9, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    or-int/2addr v2, v3

    .line 173
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    or-int/2addr v2, v3

    .line 178
    const/4 v3, 0x0

    .line 179
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    or-int/2addr v2, v3

    .line 184
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    if-nez v2, :cond_b

    .line 189
    .line 190
    if-ne v3, v15, :cond_c

    .line 191
    .line 192
    :cond_b
    new-instance v3, La/et;

    .line 193
    .line 194
    invoke-direct {v3, v12, v14, v0, v11}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    :cond_c
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 201
    .line 202
    invoke-static {v1, v3, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v13}, La/a8z;->getValue()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    check-cast v0, La/k3t0;

    .line 210
    .line 211
    check-cast v0, La/i3t0;

    .line 212
    .line 213
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    move-object v1, v0

    .line 222
    check-cast v1, La/am2;

    .line 223
    .line 224
    invoke-interface {v13}, La/a8z;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, La/k3t0;

    .line 229
    .line 230
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    if-nez v2, :cond_d

    .line 239
    .line 240
    if-ne v3, v15, :cond_e

    .line 241
    .line 242
    :cond_d
    new-instance v17, La/li8;

    .line 243
    .line 244
    const/16 v23, 0x0

    .line 245
    .line 246
    const/16 v24, 0x18

    .line 247
    .line 248
    const/16 v18, 0x1

    .line 249
    .line 250
    const-class v20, La/k3t0;

    .line 251
    .line 252
    const-string v21, "onAction"

    .line 253
    .line 254
    const-string v22, "onAction(Ljava/lang/Object;)V"

    .line 255
    .line 256
    move-object/from16 v19, v0

    .line 257
    .line 258
    invoke-direct/range {v17 .. v24}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 259
    .line 260
    .line 261
    move-object/from16 v3, v17

    .line 262
    .line 263
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    :cond_e
    check-cast v3, La/jhy;

    .line 267
    .line 268
    move-object v2, v3

    .line 269
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 270
    .line 271
    new-instance v0, La/ec30;

    .line 272
    .line 273
    const/16 v3, 0xf

    .line 274
    .line 275
    invoke-direct {v0, v6, v8, v3}, La/ec30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 276
    .line 277
    .line 278
    const v3, -0xf07ef02

    .line 279
    .line 280
    .line 281
    invoke-static {v3, v0, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    const/16 v5, 0xc00

    .line 286
    .line 287
    const/4 v0, 0x0

    .line 288
    move-object v4, v9

    .line 289
    invoke-static/range {v0 .. v5}, La/hew0;->a(La/mm40;La/am2;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 290
    .line 291
    .line 292
    goto :goto_8

    .line 293
    :cond_f
    move-object v6, v2

    .line 294
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 295
    .line 296
    .line 297
    :goto_8
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    if-eqz v0, :cond_10

    .line 302
    .line 303
    new-instance v1, La/ura;

    .line 304
    .line 305
    const/4 v2, 0x0

    .line 306
    invoke-direct {v1, v6, v8, v10, v2}, La/ura;-><init>(La/xra;La/bzl;IB)V

    .line 307
    .line 308
    .line 309
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 310
    .line 311
    :cond_10
    return-void
.end method

.method public final H0(La/bzl;La/fet;I)V
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
    const v0, 0x51389b81

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
    if-eq v0, v1, :cond_5

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    move v0, v4

    .line 68
    :goto_4
    and-int/lit8 v1, v11, 0x1

    .line 69
    .line 70
    invoke-virtual {v9, v1, v0}, La/fet;->U(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_f

    .line 75
    .line 76
    invoke-virtual {v2}, La/xra;->P0()La/k3t0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, La/i3t0;

    .line 81
    .line 82
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    move-object v13, v0

    .line 91
    check-cast v13, La/vg2;

    .line 92
    .line 93
    invoke-virtual {v2}, La/xra;->P0()La/k3t0;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sget-object v15, La/ukd;->a:La/cl5;

    .line 102
    .line 103
    if-ne v0, v15, :cond_6

    .line 104
    .line 105
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 106
    .line 107
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_6
    check-cast v0, La/vne;

    .line 115
    .line 116
    and-int/lit8 v1, v11, 0x70

    .line 117
    .line 118
    if-eq v1, v3, :cond_7

    .line 119
    .line 120
    and-int/lit8 v1, v11, 0x40

    .line 121
    .line 122
    if-eqz v1, :cond_8

    .line 123
    .line 124
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    if-eqz v1, :cond_8

    .line 129
    .line 130
    :cond_7
    const/4 v4, 0x1

    .line 131
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-nez v4, :cond_9

    .line 136
    .line 137
    if-ne v1, v15, :cond_a

    .line 138
    .line 139
    :cond_9
    move-object v1, v0

    .line 140
    goto :goto_5

    .line 141
    :cond_a
    move-object v12, v0

    .line 142
    move-object v0, v1

    .line 143
    move-object v1, v2

    .line 144
    goto :goto_6

    .line 145
    :goto_5
    new-instance v0, La/li8;

    .line 146
    .line 147
    const/4 v6, 0x0

    .line 148
    const/16 v7, 0x19

    .line 149
    .line 150
    move-object v3, v1

    .line 151
    const/4 v1, 0x1

    .line 152
    move-object v4, v3

    .line 153
    const-class v3, La/xra;

    .line 154
    .line 155
    move-object v5, v4

    .line 156
    const-string v4, "handleAltSportEventsSideEffect"

    .line 157
    .line 158
    move-object/from16 v16, v5

    .line 159
    .line 160
    const-string v5, "handleAltSportEventsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_events/models/AltSportEventsSideEffect;)V"

    .line 161
    .line 162
    move-object/from16 v12, v16

    .line 163
    .line 164
    invoke-direct/range {v0 .. v7}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 165
    .line 166
    .line 167
    move-object v1, v2

    .line 168
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :goto_6
    check-cast v0, La/jhy;

    .line 172
    .line 173
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 174
    .line 175
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    invoke-virtual {v9, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    or-int/2addr v3, v4

    .line 186
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    or-int/2addr v3, v4

    .line 191
    const/4 v4, 0x0

    .line 192
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    or-int/2addr v3, v4

    .line 197
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    if-nez v3, :cond_b

    .line 202
    .line 203
    if-ne v4, v15, :cond_c

    .line 204
    .line 205
    :cond_b
    new-instance v4, La/et;

    .line 206
    .line 207
    const/4 v3, 0x3

    .line 208
    invoke-direct {v4, v12, v14, v0, v3}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 215
    .line 216
    invoke-static {v2, v4, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, La/xra;->O0()La/k3t0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v2, La/fra;

    .line 224
    .line 225
    new-instance v3, La/ysa;

    .line 226
    .line 227
    iget-object v4, v13, La/vg2;->e:La/zpv;

    .line 228
    .line 229
    invoke-direct {v3, v4}, La/ysa;-><init>(La/zpv;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v2, v3}, La/fra;-><init>(La/dta;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    sget-object v0, La/qmk;->a:La/zcl;

    .line 239
    .line 240
    iget-object v0, v1, La/xra;->K1:La/a8z;

    .line 241
    .line 242
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, La/bdz;

    .line 247
    .line 248
    invoke-virtual {v1}, La/xra;->P0()La/k3t0;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    if-nez v3, :cond_d

    .line 261
    .line 262
    if-ne v4, v15, :cond_e

    .line 263
    .line 264
    :cond_d
    new-instance v17, La/li8;

    .line 265
    .line 266
    const/16 v23, 0x0

    .line 267
    .line 268
    const/16 v24, 0x1a

    .line 269
    .line 270
    const/16 v18, 0x1

    .line 271
    .line 272
    const-class v20, La/k3t0;

    .line 273
    .line 274
    const-string v21, "onAction"

    .line 275
    .line 276
    const-string v22, "onAction(Ljava/lang/Object;)V"

    .line 277
    .line 278
    move-object/from16 v19, v2

    .line 279
    .line 280
    invoke-direct/range {v17 .. v24}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 281
    .line 282
    .line 283
    move-object/from16 v4, v17

    .line 284
    .line 285
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_e
    check-cast v4, La/jhy;

    .line 289
    .line 290
    move-object v5, v4

    .line 291
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 292
    .line 293
    shl-int/lit8 v2, v11, 0x6

    .line 294
    .line 295
    and-int/lit16 v7, v2, 0x380

    .line 296
    .line 297
    const/4 v8, 0x1

    .line 298
    move-object v1, v0

    .line 299
    const/4 v0, 0x0

    .line 300
    const/4 v4, 0x0

    .line 301
    move-object/from16 v2, p1

    .line 302
    .line 303
    move-object v6, v9

    .line 304
    move-object v3, v13

    .line 305
    move-object/from16 v9, p0

    .line 306
    .line 307
    invoke-static/range {v0 .. v8}, La/f1t0;->c(La/mm40;La/bdz;La/bzl;La/vg2;FLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_f
    move-object v9, v2

    .line 312
    move-object v2, v8

    .line 313
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 314
    .line 315
    .line 316
    :goto_7
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-eqz v0, :cond_10

    .line 321
    .line 322
    new-instance v1, La/ura;

    .line 323
    .line 324
    const/4 v3, 0x1

    .line 325
    invoke-direct {v1, v9, v2, v10, v3}, La/ura;-><init>(La/xra;La/bzl;IB)V

    .line 326
    .line 327
    .line 328
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 329
    .line 330
    :cond_10
    return-void
.end method

.method public final I0(La/bzl;La/fet;I)V
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
    const v0, 0x7e70a9d0

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
    move v12, v0

    .line 58
    and-int/lit8 v0, v12, 0x13

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
    and-int/lit8 v1, v12, 0x1

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
    invoke-virtual {v2}, La/xra;->Q0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, La/i3t0;

    .line 82
    .line 83
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v13, v0

    .line 92
    check-cast v13, La/fi2;

    .line 93
    .line 94
    invoke-virtual {v2}, La/xra;->Q0()La/k3t0;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v15, La/ukd;->a:La/cl5;

    .line 103
    .line 104
    if-ne v0, v15, :cond_6

    .line 105
    .line 106
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 107
    .line 108
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    check-cast v0, La/vne;

    .line 116
    .line 117
    and-int/lit8 v1, v12, 0x70

    .line 118
    .line 119
    if-eq v1, v3, :cond_7

    .line 120
    .line 121
    and-int/lit8 v1, v12, 0x40

    .line 122
    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    :cond_7
    move v4, v5

    .line 132
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-nez v4, :cond_9

    .line 137
    .line 138
    if-ne v1, v15, :cond_a

    .line 139
    .line 140
    :cond_9
    move-object v1, v0

    .line 141
    goto :goto_5

    .line 142
    :cond_a
    move-object v11, v0

    .line 143
    move-object v0, v1

    .line 144
    move-object v1, v2

    .line 145
    goto :goto_6

    .line 146
    :goto_5
    new-instance v0, La/li8;

    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    const/16 v7, 0x1b

    .line 150
    .line 151
    move-object v3, v1

    .line 152
    const/4 v1, 0x1

    .line 153
    move-object v4, v3

    .line 154
    const-class v3, La/xra;

    .line 155
    .line 156
    move-object v5, v4

    .line 157
    const-string v4, "handleAltSportTeamsSideEffect"

    .line 158
    .line 159
    move-object/from16 v16, v5

    .line 160
    .line 161
    const-string v5, "handleAltSportTeamsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_teams/models/AltSportTeamsSideEffect;)V"

    .line 162
    .line 163
    move-object/from16 v11, v16

    .line 164
    .line 165
    invoke-direct/range {v0 .. v7}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 166
    .line 167
    .line 168
    move-object v1, v2

    .line 169
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :goto_6
    check-cast v0, La/jhy;

    .line 173
    .line 174
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 175
    .line 176
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    invoke-virtual {v9, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    or-int/2addr v3, v4

    .line 187
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    or-int/2addr v3, v4

    .line 192
    const/4 v4, 0x0

    .line 193
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    move-result v4

    .line 197
    or-int/2addr v3, v4

    .line 198
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    if-nez v3, :cond_b

    .line 203
    .line 204
    if-ne v4, v15, :cond_c

    .line 205
    .line 206
    :cond_b
    new-instance v4, La/et;

    .line 207
    .line 208
    const/4 v3, 0x4

    .line 209
    invoke-direct {v4, v11, v14, v0, v3}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 216
    .line 217
    invoke-static {v2, v4, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1}, La/xra;->O0()La/k3t0;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    new-instance v2, La/fra;

    .line 225
    .line 226
    new-instance v3, La/zsa;

    .line 227
    .line 228
    iget-object v4, v13, La/fi2;->e:La/zpv;

    .line 229
    .line 230
    invoke-direct {v3, v4}, La/zsa;-><init>(La/zpv;)V

    .line 231
    .line 232
    .line 233
    invoke-direct {v2, v3}, La/fra;-><init>(La/dta;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    sget-object v0, La/qmk;->a:La/zcl;

    .line 240
    .line 241
    iget-object v0, v1, La/xra;->K1:La/a8z;

    .line 242
    .line 243
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, La/bdz;

    .line 248
    .line 249
    invoke-virtual {v1}, La/xra;->Q0()La/k3t0;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    if-nez v3, :cond_d

    .line 262
    .line 263
    if-ne v4, v15, :cond_e

    .line 264
    .line 265
    :cond_d
    new-instance v16, La/li8;

    .line 266
    .line 267
    const/16 v22, 0x0

    .line 268
    .line 269
    const/16 v23, 0x1c

    .line 270
    .line 271
    const/16 v17, 0x1

    .line 272
    .line 273
    const-class v19, La/k3t0;

    .line 274
    .line 275
    const-string v20, "onAction"

    .line 276
    .line 277
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 278
    .line 279
    move-object/from16 v18, v2

    .line 280
    .line 281
    invoke-direct/range {v16 .. v23}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 282
    .line 283
    .line 284
    move-object/from16 v4, v16

    .line 285
    .line 286
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    :cond_e
    check-cast v4, La/jhy;

    .line 290
    .line 291
    move-object v5, v4

    .line 292
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 293
    .line 294
    shl-int/lit8 v2, v12, 0x6

    .line 295
    .line 296
    and-int/lit16 v7, v2, 0x380

    .line 297
    .line 298
    move-object v1, v0

    .line 299
    const/4 v0, 0x0

    .line 300
    const/4 v4, 0x0

    .line 301
    move-object v2, v8

    .line 302
    move-object v6, v9

    .line 303
    move-object v3, v13

    .line 304
    move-object/from16 v8, p0

    .line 305
    .line 306
    invoke-static/range {v0 .. v7}, La/phu0;->b(La/mm40;La/bdz;La/bzl;La/fi2;FLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 307
    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_f
    move-object/from16 v24, v8

    .line 311
    .line 312
    move-object v8, v2

    .line 313
    move-object/from16 v2, v24

    .line 314
    .line 315
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 316
    .line 317
    .line 318
    :goto_7
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    if-eqz v0, :cond_10

    .line 323
    .line 324
    new-instance v1, La/ura;

    .line 325
    .line 326
    const/4 v3, 0x5

    .line 327
    invoke-direct {v1, v8, v2, v10, v3}, La/ura;-><init>(La/xra;La/bzl;IB)V

    .line 328
    .line 329
    .line 330
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 331
    .line 332
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
    const v0, 0x752524dc

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
    invoke-virtual {v2}, La/xra;->R0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, La/i3t0;

    .line 82
    .line 83
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v12, v0

    .line 92
    check-cast v12, La/qj2;

    .line 93
    .line 94
    invoke-virtual {v2}, La/xra;->R0()La/k3t0;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v14, La/ukd;->a:La/cl5;

    .line 103
    .line 104
    if-ne v0, v14, :cond_6

    .line 105
    .line 106
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 107
    .line 108
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    move-object v15, v0

    .line 116
    check-cast v15, La/vne;

    .line 117
    .line 118
    and-int/lit8 v0, v11, 0x70

    .line 119
    .line 120
    if-eq v0, v3, :cond_7

    .line 121
    .line 122
    and-int/lit8 v0, v11, 0x40

    .line 123
    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_8

    .line 131
    .line 132
    :cond_7
    move v4, v5

    .line 133
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    if-nez v4, :cond_a

    .line 138
    .line 139
    if-ne v0, v14, :cond_9

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_9
    move-object v1, v2

    .line 143
    goto :goto_6

    .line 144
    :cond_a
    :goto_5
    new-instance v0, La/li8;

    .line 145
    .line 146
    const/4 v6, 0x0

    .line 147
    const/16 v7, 0x1d

    .line 148
    .line 149
    const/4 v1, 0x1

    .line 150
    const-class v3, La/xra;

    .line 151
    .line 152
    const-string v4, "handleAltSportTournamentsSideEffect"

    .line 153
    .line 154
    const-string v5, "handleAltSportTournamentsSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tournaments/models/AltSportTournamentsSideEffect;)V"

    .line 155
    .line 156
    invoke-direct/range {v0 .. v7}, La/li8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 157
    .line 158
    .line 159
    move-object v1, v2

    .line 160
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :goto_6
    check-cast v0, La/jhy;

    .line 164
    .line 165
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 166
    .line 167
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    invoke-virtual {v9, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    invoke-virtual {v9, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    or-int/2addr v3, v4

    .line 178
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    or-int/2addr v3, v4

    .line 183
    const/4 v4, 0x0

    .line 184
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v4

    .line 188
    or-int/2addr v3, v4

    .line 189
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v4

    .line 193
    if-nez v3, :cond_b

    .line 194
    .line 195
    if-ne v4, v14, :cond_c

    .line 196
    .line 197
    :cond_b
    new-instance v4, La/et;

    .line 198
    .line 199
    const/4 v3, 0x5

    .line 200
    invoke-direct {v4, v15, v13, v0, v3}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 207
    .line 208
    invoke-static {v2, v4, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, La/xra;->O0()La/k3t0;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    new-instance v2, La/fra;

    .line 216
    .line 217
    new-instance v3, La/ata;

    .line 218
    .line 219
    iget-object v4, v12, La/qj2;->e:La/zpv;

    .line 220
    .line 221
    invoke-direct {v3, v4}, La/ata;-><init>(La/zpv;)V

    .line 222
    .line 223
    .line 224
    invoke-direct {v2, v3}, La/fra;-><init>(La/dta;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    sget-object v0, La/qmk;->a:La/zcl;

    .line 231
    .line 232
    iget-object v0, v1, La/xra;->K1:La/a8z;

    .line 233
    .line 234
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, La/bdz;

    .line 239
    .line 240
    invoke-virtual {v1}, La/xra;->R0()La/k3t0;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v4

    .line 252
    if-nez v3, :cond_d

    .line 253
    .line 254
    if-ne v4, v14, :cond_e

    .line 255
    .line 256
    :cond_d
    new-instance v15, La/vra;

    .line 257
    .line 258
    const/16 v21, 0x0

    .line 259
    .line 260
    const/16 v22, 0x0

    .line 261
    .line 262
    const/16 v16, 0x1

    .line 263
    .line 264
    const-class v18, La/k3t0;

    .line 265
    .line 266
    const-string v19, "onAction"

    .line 267
    .line 268
    const-string v20, "onAction(Ljava/lang/Object;)V"

    .line 269
    .line 270
    move-object/from16 v17, v2

    .line 271
    .line 272
    invoke-direct/range {v15 .. v22}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v9, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    move-object v4, v15

    .line 279
    :cond_e
    check-cast v4, La/jhy;

    .line 280
    .line 281
    move-object v5, v4

    .line 282
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 283
    .line 284
    shl-int/lit8 v2, v11, 0x6

    .line 285
    .line 286
    and-int/lit16 v7, v2, 0x380

    .line 287
    .line 288
    move-object v1, v0

    .line 289
    const/4 v0, 0x0

    .line 290
    const/4 v4, 0x0

    .line 291
    move-object v2, v8

    .line 292
    move-object v6, v9

    .line 293
    move-object v3, v12

    .line 294
    move-object/from16 v8, p0

    .line 295
    .line 296
    invoke-static/range {v0 .. v7}, La/i4w0;->b(La/mm40;La/bdz;La/bzl;La/qj2;FLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 297
    .line 298
    .line 299
    goto :goto_7

    .line 300
    :cond_f
    move-object/from16 v23, v8

    .line 301
    .line 302
    move-object v8, v2

    .line 303
    move-object/from16 v2, v23

    .line 304
    .line 305
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 306
    .line 307
    .line 308
    :goto_7
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    if-eqz v0, :cond_10

    .line 313
    .line 314
    new-instance v1, La/ura;

    .line 315
    .line 316
    const/4 v3, 0x3

    .line 317
    invoke-direct {v1, v8, v2, v10, v3}, La/ura;-><init>(La/xra;La/bzl;IB)V

    .line 318
    .line 319
    .line 320
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 321
    .line 322
    :cond_10
    return-void
.end method

.method public final K0(La/bzl;La/fet;I)V
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
    const v0, -0xd9d3ba4

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
    move v12, v0

    .line 58
    and-int/lit8 v0, v12, 0x13

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
    and-int/lit8 v1, v12, 0x1

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
    invoke-virtual {v2}, La/xra;->M0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, La/i3t0;

    .line 82
    .line 83
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v13, v0

    .line 92
    check-cast v13, La/ol2;

    .line 93
    .line 94
    invoke-virtual {v2}, La/xra;->M0()La/k3t0;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v15, La/ukd;->a:La/cl5;

    .line 103
    .line 104
    if-ne v0, v15, :cond_6

    .line 105
    .line 106
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 107
    .line 108
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    check-cast v0, La/vne;

    .line 116
    .line 117
    and-int/lit8 v1, v12, 0x70

    .line 118
    .line 119
    if-eq v1, v3, :cond_7

    .line 120
    .line 121
    and-int/lit8 v1, v12, 0x40

    .line 122
    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    :cond_7
    move v4, v5

    .line 132
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-nez v4, :cond_9

    .line 137
    .line 138
    if-ne v1, v15, :cond_a

    .line 139
    .line 140
    :cond_9
    move-object v1, v0

    .line 141
    goto :goto_5

    .line 142
    :cond_a
    move-object v11, v0

    .line 143
    move-object v0, v1

    .line 144
    move-object v1, v2

    .line 145
    goto :goto_6

    .line 146
    :goto_5
    new-instance v0, La/vra;

    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x1

    .line 150
    move-object v3, v1

    .line 151
    const/4 v1, 0x1

    .line 152
    move-object v4, v3

    .line 153
    const-class v3, La/xra;

    .line 154
    .line 155
    move-object v5, v4

    .line 156
    const-string v4, "handleAltSportTrackedSideEffect"

    .line 157
    .line 158
    move-object/from16 v16, v5

    .line 159
    .line 160
    const-string v5, "handleAltSportTrackedSideEffect(Lorg/xplatform/favorites/impl/presentation/alt_sport_tracked/models/AltSportTrackedSideEffect;)V"

    .line 161
    .line 162
    move-object/from16 v11, v16

    .line 163
    .line 164
    invoke-direct/range {v0 .. v7}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 165
    .line 166
    .line 167
    move-object v1, v2

    .line 168
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :goto_6
    check-cast v0, La/jhy;

    .line 172
    .line 173
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 174
    .line 175
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    invoke-virtual {v9, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    or-int/2addr v3, v4

    .line 186
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    or-int/2addr v3, v4

    .line 191
    const/4 v4, 0x0

    .line 192
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    or-int/2addr v3, v4

    .line 197
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    const/4 v5, 0x6

    .line 202
    if-nez v3, :cond_b

    .line 203
    .line 204
    if-ne v4, v15, :cond_c

    .line 205
    .line 206
    :cond_b
    new-instance v4, La/et;

    .line 207
    .line 208
    invoke-direct {v4, v11, v14, v0, v5}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 215
    .line 216
    invoke-static {v2, v4, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, La/xra;->O0()La/k3t0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v2, La/fra;

    .line 224
    .line 225
    new-instance v3, La/bta;

    .line 226
    .line 227
    iget-object v4, v13, La/ol2;->f:La/zpv;

    .line 228
    .line 229
    invoke-direct {v3, v4}, La/bta;-><init>(La/zpv;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v2, v3}, La/fra;-><init>(La/dta;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    sget-object v0, La/qmk;->a:La/zcl;

    .line 239
    .line 240
    iget-object v0, v1, La/xra;->K1:La/a8z;

    .line 241
    .line 242
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, La/bdz;

    .line 247
    .line 248
    invoke-virtual {v1}, La/xra;->M0()La/k3t0;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    if-nez v3, :cond_d

    .line 261
    .line 262
    if-ne v4, v15, :cond_e

    .line 263
    .line 264
    :cond_d
    new-instance v17, La/vra;

    .line 265
    .line 266
    const/16 v23, 0x0

    .line 267
    .line 268
    const/16 v24, 0x2

    .line 269
    .line 270
    const/16 v18, 0x1

    .line 271
    .line 272
    const-class v20, La/k3t0;

    .line 273
    .line 274
    const-string v21, "onAction"

    .line 275
    .line 276
    const-string v22, "onAction(Ljava/lang/Object;)V"

    .line 277
    .line 278
    move-object/from16 v19, v2

    .line 279
    .line 280
    invoke-direct/range {v17 .. v24}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 281
    .line 282
    .line 283
    move-object/from16 v4, v17

    .line 284
    .line 285
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_e
    check-cast v4, La/jhy;

    .line 289
    .line 290
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 291
    .line 292
    shl-int/lit8 v2, v12, 0x6

    .line 293
    .line 294
    and-int/lit16 v7, v2, 0x380

    .line 295
    .line 296
    const/4 v8, 0x1

    .line 297
    move-object v1, v0

    .line 298
    const/4 v0, 0x0

    .line 299
    move-object v5, v4

    .line 300
    const/4 v4, 0x0

    .line 301
    move-object/from16 v2, p1

    .line 302
    .line 303
    move-object v6, v9

    .line 304
    move-object v3, v13

    .line 305
    move-object/from16 v9, p0

    .line 306
    .line 307
    invoke-static/range {v0 .. v8}, La/vbw0;->c(La/mm40;La/bdz;La/bzl;La/ol2;FLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_f
    move-object v9, v2

    .line 312
    move-object v2, v8

    .line 313
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 314
    .line 315
    .line 316
    :goto_7
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-eqz v0, :cond_10

    .line 321
    .line 322
    new-instance v1, La/ura;

    .line 323
    .line 324
    const/4 v3, 0x2

    .line 325
    invoke-direct {v1, v9, v2, v10, v3}, La/ura;-><init>(La/xra;La/bzl;IB)V

    .line 326
    .line 327
    .line 328
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 329
    .line 330
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
    const v0, -0x5c892ecb

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
    move v12, v0

    .line 58
    and-int/lit8 v0, v12, 0x13

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
    and-int/lit8 v1, v12, 0x1

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
    invoke-virtual {v2}, La/xra;->S0()La/k3t0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, La/i3t0;

    .line 82
    .line 83
    invoke-virtual {v0, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v13, v0

    .line 92
    check-cast v13, La/pn2;

    .line 93
    .line 94
    invoke-virtual {v2}, La/xra;->S0()La/k3t0;

    .line 95
    .line 96
    .line 97
    move-result-object v14

    .line 98
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    sget-object v15, La/ukd;->a:La/cl5;

    .line 103
    .line 104
    if-ne v0, v15, :cond_6

    .line 105
    .line 106
    sget-object v0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 107
    .line 108
    invoke-static {v0, v9}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    check-cast v0, La/vne;

    .line 116
    .line 117
    and-int/lit8 v1, v12, 0x70

    .line 118
    .line 119
    if-eq v1, v3, :cond_7

    .line 120
    .line 121
    and-int/lit8 v1, v12, 0x40

    .line 122
    .line 123
    if-eqz v1, :cond_8

    .line 124
    .line 125
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    :cond_7
    move v4, v5

    .line 132
    :cond_8
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-nez v4, :cond_9

    .line 137
    .line 138
    if-ne v1, v15, :cond_a

    .line 139
    .line 140
    :cond_9
    move-object v1, v0

    .line 141
    goto :goto_5

    .line 142
    :cond_a
    move-object v11, v0

    .line 143
    move-object v0, v1

    .line 144
    move-object v1, v2

    .line 145
    goto :goto_6

    .line 146
    :goto_5
    new-instance v0, La/vra;

    .line 147
    .line 148
    const/4 v6, 0x0

    .line 149
    const/4 v7, 0x3

    .line 150
    move-object v3, v1

    .line 151
    const/4 v1, 0x1

    .line 152
    move-object v4, v3

    .line 153
    const-class v3, La/xra;

    .line 154
    .line 155
    move-object v5, v4

    .line 156
    const-string v4, "handleViewedTabSideEffect"

    .line 157
    .line 158
    move-object/from16 v16, v5

    .line 159
    .line 160
    const-string v5, "handleViewedTabSideEffect(Lorg/xplatform/favorites/impl/presentation/viewed/compose/models/AltViewedSideEffect;)V"

    .line 161
    .line 162
    move-object/from16 v11, v16

    .line 163
    .line 164
    invoke-direct/range {v0 .. v7}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 165
    .line 166
    .line 167
    move-object v1, v2

    .line 168
    invoke-virtual {v9, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :goto_6
    check-cast v0, La/jhy;

    .line 172
    .line 173
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 174
    .line 175
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    invoke-virtual {v9, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v4

    .line 185
    or-int/2addr v3, v4

    .line 186
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v4

    .line 190
    or-int/2addr v3, v4

    .line 191
    const/4 v4, 0x0

    .line 192
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    or-int/2addr v3, v4

    .line 197
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    if-nez v3, :cond_b

    .line 202
    .line 203
    if-ne v4, v15, :cond_c

    .line 204
    .line 205
    :cond_b
    new-instance v4, La/et;

    .line 206
    .line 207
    const/4 v3, 0x7

    .line 208
    invoke-direct {v4, v11, v14, v0, v3}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    :cond_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 215
    .line 216
    invoke-static {v2, v4, v9}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v1}, La/xra;->O0()La/k3t0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    new-instance v2, La/fra;

    .line 224
    .line 225
    new-instance v3, La/cta;

    .line 226
    .line 227
    iget-object v4, v13, La/pn2;->d:La/zpv;

    .line 228
    .line 229
    invoke-direct {v3, v4}, La/cta;-><init>(La/zpv;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v2, v3}, La/fra;-><init>(La/dta;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    sget-object v0, La/qmk;->a:La/zcl;

    .line 239
    .line 240
    iget-object v0, v1, La/xra;->K1:La/a8z;

    .line 241
    .line 242
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    move-object v2, v0

    .line 247
    check-cast v2, La/bdz;

    .line 248
    .line 249
    invoke-virtual {v1}, La/xra;->S0()La/k3t0;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    if-nez v3, :cond_d

    .line 262
    .line 263
    if-ne v4, v15, :cond_e

    .line 264
    .line 265
    :cond_d
    new-instance v17, La/vra;

    .line 266
    .line 267
    const/16 v23, 0x0

    .line 268
    .line 269
    const/16 v24, 0x4

    .line 270
    .line 271
    const/16 v18, 0x1

    .line 272
    .line 273
    const-class v20, La/k3t0;

    .line 274
    .line 275
    const-string v21, "onAction"

    .line 276
    .line 277
    const-string v22, "onAction(Ljava/lang/Object;)V"

    .line 278
    .line 279
    move-object/from16 v19, v0

    .line 280
    .line 281
    invoke-direct/range {v17 .. v24}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 282
    .line 283
    .line 284
    move-object/from16 v4, v17

    .line 285
    .line 286
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    :cond_e
    check-cast v4, La/jhy;

    .line 290
    .line 291
    move-object v5, v4

    .line 292
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 293
    .line 294
    shl-int/lit8 v0, v12, 0x3

    .line 295
    .line 296
    and-int/lit8 v7, v0, 0x70

    .line 297
    .line 298
    const/4 v8, 0x1

    .line 299
    const/4 v0, 0x0

    .line 300
    const/4 v4, 0x0

    .line 301
    move-object v6, v9

    .line 302
    move-object v3, v13

    .line 303
    move-object v9, v1

    .line 304
    move-object/from16 v1, p1

    .line 305
    .line 306
    invoke-static/range {v0 .. v8}, La/nnw0;->o(La/mm40;La/bzl;La/bdz;La/pn2;FLkotlin/jvm/functions/Function1;La/fet;II)V

    .line 307
    .line 308
    .line 309
    goto :goto_7

    .line 310
    :cond_f
    move-object v9, v2

    .line 311
    move-object v1, v8

    .line 312
    invoke-virtual/range {p2 .. p2}, La/fet;->X()V

    .line 313
    .line 314
    .line 315
    :goto_7
    invoke-virtual/range {p2 .. p2}, La/fet;->u()La/yfe0;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    if-eqz v0, :cond_10

    .line 320
    .line 321
    new-instance v2, La/ura;

    .line 322
    .line 323
    const/4 v3, 0x4

    .line 324
    invoke-direct {v2, v9, v1, v10, v3}, La/ura;-><init>(La/xra;La/bzl;IB)V

    .line 325
    .line 326
    .line 327
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 328
    .line 329
    :cond_10
    return-void
.end method

.method public final M0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xra;->W1:La/a8z;

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

.method public final N0()La/pbi;
    .locals 0

    .line 1
    iget-object p0, p0, La/xra;->M1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pbi;

    .line 8
    .line 9
    return-object p0
.end method

.method public final O0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xra;->P1:La/a8z;

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
    iget-object p0, p0, La/xra;->R1:La/a8z;

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
    iget-object p0, p0, La/xra;->S1:La/a8z;

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

.method public final R0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xra;->U1:La/a8z;

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

.method public final S0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xra;->V1:La/a8z;

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

.method public final T0(Ljava/lang/String;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/xra;->N0()La/pbi;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pbi;->d:La/ii;

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
    invoke-virtual {p0}, La/xra;->N0()La/pbi;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pbi;->b:La/itr;

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
    invoke-virtual {p0}, La/xra;->N0()La/pbi;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/pbi;->f:La/wdk0;

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
    invoke-virtual {p0}, La/xra;->N0()La/pbi;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/pbi;->f:La/wdk0;

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
