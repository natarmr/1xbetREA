.class public final La/qss0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/qss0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/j6m0",
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
.field public static final R1:La/j6m0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public final M1:Z

.field public final N1:La/cgx0;

.field public final O1:La/phf0;

.field public final P1:La/phf0;

.field public final Q1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/qss0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentTvBetJackpotBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "fromAggregator"

    .line 16
    .line 17
    const-string v5, "getFromAggregator()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bannerUrl"

    .line 25
    .line 26
    const-string v6, "getBannerUrl()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "bannerTranslateId"

    .line 34
    .line 35
    const-string v7, "getBannerTranslateId()Ljava/lang/String;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/qss0;->S1:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/j6m0;

    .line 57
    .line 58
    const/16 v1, 0x1d

    .line 59
    .line 60
    invoke-direct {v0, v1}, La/j6m0;-><init>(B)V

    .line 61
    .line 62
    .line 63
    sput-object v0, La/qss0;->R1:La/j6m0;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0300

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/pss0;->a:La/pss0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/qss0;->K1:La/s0r;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, La/qss0;->M1:Z

    .line 17
    .line 18
    new-instance v1, La/cgx0;

    .line 19
    .line 20
    const-string v2, "FROM_AGGREGATOR"

    .line 21
    .line 22
    invoke-direct {v1, v2, v0}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, La/qss0;->N1:La/cgx0;

    .line 26
    .line 27
    new-instance v0, La/phf0;

    .line 28
    .line 29
    const-string v1, "BANNER_URL"

    .line 30
    .line 31
    const-string v2, ""

    .line 32
    .line 33
    invoke-direct {v0, v1, v2}, La/phf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, La/qss0;->O1:La/phf0;

    .line 37
    .line 38
    new-instance v0, La/phf0;

    .line 39
    .line 40
    const-string v1, "BANNER_TRANSLATE_ID"

    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, La/phf0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/qss0;->P1:La/phf0;

    .line 46
    .line 47
    const-class v0, La/tts0;

    .line 48
    .line 49
    sget-object v1, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, La/qir0;

    .line 56
    .line 57
    const/16 v2, 0x16

    .line 58
    .line 59
    invoke-direct {v1, p0, v2}, La/qir0;-><init>(Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/qss0;->Q1:La/a8z;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/qss0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/qss0;->K1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/j6r;

    .line 16
    .line 17
    iget-object p1, p1, La/j6r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, La/owp0;-><init>(La/clz;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, La/iob0;

    .line 29
    .line 30
    const/16 v2, 0x10

    .line 31
    .line 32
    invoke-direct {v1, p0, v2}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    new-instance p0, La/ugd;

    .line 36
    .line 37
    const v2, -0x6d55956f

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x1

    .line 41
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x0

    .line 45
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final C0()V
    .locals 18

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
    const-class v2, La/oss0;

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
    instance-of v4, v1, La/oss0;

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
    check-cast v3, La/oss0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    const/4 v1, 0x1

    .line 62
    sget-object v2, La/qss0;->S1:[La/iiy;

    .line 63
    .line 64
    aget-object v1, v2, v1

    .line 65
    .line 66
    iget-object v4, v0, La/qss0;->N1:La/cgx0;

    .line 67
    .line 68
    invoke-virtual {v4, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const/4 v1, 0x2

    .line 73
    aget-object v1, v2, v1

    .line 74
    .line 75
    iget-object v4, v0, La/qss0;->O1:La/phf0;

    .line 76
    .line 77
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    const/4 v4, 0x3

    .line 82
    aget-object v2, v2, v4

    .line 83
    .line 84
    iget-object v4, v0, La/qss0;->P1:La/phf0;

    .line 85
    .line 86
    invoke-virtual {v4, v0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v5, v3, La/oss0;->a:La/cad;

    .line 100
    .line 101
    iget-object v6, v3, La/oss0;->j:La/wsf0;

    .line 102
    .line 103
    iget-object v1, v3, La/oss0;->b:La/btt0;

    .line 104
    .line 105
    iget-object v10, v3, La/oss0;->c:La/gii0;

    .line 106
    .line 107
    iget-object v2, v3, La/oss0;->d:La/j1q0;

    .line 108
    .line 109
    iget-object v11, v3, La/oss0;->e:La/m1e;

    .line 110
    .line 111
    iget-object v4, v3, La/oss0;->f:La/kt2;

    .line 112
    .line 113
    iget-object v12, v3, La/oss0;->g:La/b3c0;

    .line 114
    .line 115
    move-object v13, v12

    .line 116
    iget-object v12, v3, La/oss0;->h:La/knf0;

    .line 117
    .line 118
    iget-object v14, v3, La/oss0;->i:La/gst0;

    .line 119
    .line 120
    move-object v15, v13

    .line 121
    iget-object v13, v3, La/oss0;->k:La/ctf0;

    .line 122
    .line 123
    move-object/from16 v16, v14

    .line 124
    .line 125
    iget-object v14, v3, La/oss0;->l:La/bzt;

    .line 126
    .line 127
    move-object/from16 v17, v15

    .line 128
    .line 129
    iget-object v15, v3, La/oss0;->m:La/kuy;

    .line 130
    .line 131
    iget-object v3, v3, La/oss0;->n:La/gle0;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance v4, La/qv2;

    .line 164
    .line 165
    move-object/from16 v16, v3

    .line 166
    .line 167
    invoke-direct/range {v4 .. v16}, La/qv2;-><init>(La/cad;La/wsf0;La/i1w0;Ljava/lang/Boolean;Ljava/lang/String;La/gii0;La/m1e;La/knf0;La/ctf0;La/bzt;La/kuy;La/gle0;)V

    .line 168
    .line 169
    .line 170
    new-instance v1, La/fiu0;

    .line 171
    .line 172
    iget-object v2, v4, La/qv2;->n:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v2, La/yxi;

    .line 175
    .line 176
    const-class v3, La/tts0;

    .line 177
    .line 178
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 183
    .line 184
    .line 185
    iput-object v1, v0, La/qss0;->L1:La/fiu0;

    .line 186
    .line 187
    return-void

    .line 188
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 189
    .line 190
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/qss0;->M1:Z

    .line 2
    .line 3
    return p0
.end method
