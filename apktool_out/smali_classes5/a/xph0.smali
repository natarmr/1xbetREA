.class public final La/xph0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/xph0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/lme0",
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
.field public static final Q1:La/lme0;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:La/yzn0;

.field public M1:La/fiu0;

.field public N1:La/hfk0;

.field public final O1:La/a8z;

.field public final P1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/xph0;

    .line 4
    .line 5
    const-string v2, "selectedTabBundle"

    .line 6
    .line 7
    const-string v3, "getSelectedTabBundle()Lorg/xplatform/security/api/navigation/SecurityGiftsScreenParams;"

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
    const-string v5, "getBinding()Lorg/xplatform/security/impl/databinding/SecurityGiftsContainerFragemntBinding;"

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
    sput-object v1, La/xph0;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/lme0;

    .line 33
    .line 34
    const/16 v1, 0xf

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/lme0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/xph0;->Q1:La/lme0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0553

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
    iput-object v0, p0, La/xph0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/yzn0;

    .line 12
    .line 13
    const-string v1, "SELECTED_TAB_BUNDLE"

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/xph0;->L1:La/yzn0;

    .line 19
    .line 20
    const-class v0, La/goh0;

    .line 21
    .line 22
    sget-object v1, La/sre0;->a:La/tre0;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, La/tph0;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v1, p0, v2}, La/tph0;-><init>(La/xph0;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/xph0;->O1:La/a8z;

    .line 39
    .line 40
    sget-object v0, La/wph0;->a:La/wph0;

    .line 41
    .line 42
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/xph0;->P1:La/s0r;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/xph0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object v1, p1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/xph0;->P1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v2, v1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v1, La/mqh0;

    .line 16
    .line 17
    iget-object v1, v1, La/mqh0;->b:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 18
    .line 19
    new-instance v3, La/tph0;

    .line 20
    .line 21
    invoke-direct {v3, p0, v0}, La/tph0;-><init>(La/xph0;B)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v3}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    aget-object p1, p1, v0

    .line 28
    .line 29
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p1, La/mqh0;

    .line 37
    .line 38
    iget-object p1, p1, La/mqh0;->c:Landroidx/compose/ui/platform/ComposeView;

    .line 39
    .line 40
    new-instance v1, La/uph0;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    invoke-direct {v1, p0, v2}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    new-instance p0, La/ugd;

    .line 47
    .line 48
    const v2, 0x2092975

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {p1, v0, p0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final C0()V
    .locals 10

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
    const-class v1, La/doh0;

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
    instance-of v3, v0, La/doh0;

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
    check-cast v2, La/doh0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    sget-object v0, La/xph0;->R1:[La/iiy;

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    aget-object v0, v0, v1

    .line 63
    .line 64
    iget-object v1, p0, La/xph0;->L1:La/yzn0;

    .line 65
    .line 66
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v9, v0

    .line 71
    check-cast v9, La/nqh0;

    .line 72
    .line 73
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v5, v2, La/doh0;->a:La/iw20;

    .line 77
    .line 78
    iget-object v4, v2, La/doh0;->b:La/cad;

    .line 79
    .line 80
    iget-object v7, v2, La/doh0;->c:La/ctf0;

    .line 81
    .line 82
    iget-object v8, v2, La/doh0;->d:La/hfk0;

    .line 83
    .line 84
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    new-instance v3, La/uii;

    .line 88
    .line 89
    invoke-direct/range {v3 .. v9}, La/uii;-><init>(La/cad;La/iw20;La/i1w0;La/ctf0;La/hfk0;La/nqh0;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, La/fiu0;

    .line 93
    .line 94
    iget-object v1, v3, La/uii;->f:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v1, La/fri;

    .line 97
    .line 98
    const-class v2, La/goh0;

    .line 99
    .line 100
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, La/xph0;->M1:La/fiu0;

    .line 108
    .line 109
    iput-object v8, p0, La/xph0;->N1:La/hfk0;

    .line 110
    .line 111
    return-void

    .line 112
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 113
    .line 114
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final G0(La/mm40;La/oqh0;La/fet;I)V
    .locals 15

    .line 1
    move-object/from16 v5, p3

    .line 2
    .line 3
    move/from16 v8, p4

    .line 4
    .line 5
    const v0, -0x5beeb2e4

    .line 6
    .line 7
    .line 8
    invoke-virtual {v5, v0}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, v8, 0x6

    .line 12
    .line 13
    move-object/from16 v2, p1

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v5, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x2

    .line 26
    :goto_0
    or-int/2addr v0, v8

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v8

    .line 29
    :goto_1
    and-int/lit8 v3, v8, 0x30

    .line 30
    .line 31
    const/16 v9, 0x20

    .line 32
    .line 33
    if-nez v3, :cond_3

    .line 34
    .line 35
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v5, v3}, La/fet;->e(I)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    move v3, v9

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v0, v3

    .line 50
    :cond_3
    and-int/lit16 v3, v8, 0x180

    .line 51
    .line 52
    if-nez v3, :cond_5

    .line 53
    .line 54
    invoke-virtual {v5, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    const/16 v3, 0x100

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v3, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr v0, v3

    .line 66
    :cond_5
    and-int/lit16 v3, v0, 0x93

    .line 67
    .line 68
    const/16 v4, 0x92

    .line 69
    .line 70
    const/4 v10, 0x0

    .line 71
    const/4 v11, 0x1

    .line 72
    if-eq v3, v4, :cond_6

    .line 73
    .line 74
    move v3, v11

    .line 75
    goto :goto_4

    .line 76
    :cond_6
    move v3, v10

    .line 77
    :goto_4
    and-int/lit8 v4, v0, 0x1

    .line 78
    .line 79
    invoke-virtual {v5, v4, v3}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-eqz v3, :cond_d

    .line 84
    .line 85
    sget-object v3, La/dy2;->f:La/zfn;

    .line 86
    .line 87
    invoke-virtual {v5, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Landroid/view/View;

    .line 92
    .line 93
    invoke-virtual {v5, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    sget-object v12, La/ukd;->a:La/cl5;

    .line 102
    .line 103
    if-nez v4, :cond_7

    .line 104
    .line 105
    if-ne v6, v12, :cond_8

    .line 106
    .line 107
    :cond_7
    invoke-static {v3}, Landroidx/fragment/app/e;->K(Landroid/view/View;)Landroidx/fragment/app/e;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_8
    move-object v13, v6

    .line 115
    check-cast v13, Landroidx/fragment/app/e;

    .line 116
    .line 117
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    if-ne v3, v12, :cond_9

    .line 125
    .line 126
    sget-object v3, La/vph0;->a:La/vph0;

    .line 127
    .line 128
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_9
    check-cast v3, La/jhy;

    .line 132
    .line 133
    check-cast v3, La/xdr;

    .line 134
    .line 135
    shl-int/lit8 v4, v0, 0x3

    .line 136
    .line 137
    and-int/lit8 v4, v4, 0x70

    .line 138
    .line 139
    or-int/lit8 v6, v4, 0x6

    .line 140
    .line 141
    const/4 v7, 0x4

    .line 142
    const/4 v4, 0x0

    .line 143
    move-object v14, v3

    .line 144
    move-object v3, v2

    .line 145
    move-object v2, v14

    .line 146
    invoke-static/range {v2 .. v7}, La/y860;->f(La/xdr;La/mm40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 147
    .line 148
    .line 149
    move-object v6, v5

    .line 150
    invoke-virtual {v6, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    and-int/lit8 v0, v0, 0x70

    .line 155
    .line 156
    if-ne v0, v9, :cond_a

    .line 157
    .line 158
    move v10, v11

    .line 159
    :cond_a
    or-int v0, v2, v10

    .line 160
    .line 161
    invoke-virtual {v6, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    or-int/2addr v0, v2

    .line 166
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    if-nez v0, :cond_c

    .line 171
    .line 172
    if-ne v2, v12, :cond_b

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_b
    move-object v1, v13

    .line 176
    goto :goto_6

    .line 177
    :cond_c
    :goto_5
    new-instance v0, La/qkb0;

    .line 178
    .line 179
    const/4 v4, 0x0

    .line 180
    const/16 v5, 0xc

    .line 181
    .line 182
    move-object v3, p0

    .line 183
    move-object/from16 v2, p2

    .line 184
    .line 185
    move-object v1, v13

    .line 186
    invoke-direct/range {v0 .. v5}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v6, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    move-object v2, v0

    .line 193
    :goto_6
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 194
    .line 195
    move-object/from16 v3, p2

    .line 196
    .line 197
    invoke-static {v1, v3, v2, v6}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 198
    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_d
    move-object/from16 v3, p2

    .line 202
    .line 203
    move-object v6, v5

    .line 204
    invoke-virtual {v6}, La/fet;->X()V

    .line 205
    .line 206
    .line 207
    :goto_7
    invoke-virtual {v6}, La/fet;->u()La/yfe0;

    .line 208
    .line 209
    .line 210
    move-result-object v6

    .line 211
    if-eqz v6, :cond_e

    .line 212
    .line 213
    new-instance v0, La/wbg0;

    .line 214
    .line 215
    const/4 v5, 0x6

    .line 216
    move-object v1, p0

    .line 217
    move-object/from16 v2, p1

    .line 218
    .line 219
    move v4, v8

    .line 220
    invoke-direct/range {v0 .. v5}, La/wbg0;-><init>(Ljava/lang/Object;La/mm40;Ljava/lang/Object;IB)V

    .line 221
    .line 222
    .line 223
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 224
    .line 225
    :cond_e
    return-void
.end method

.method public final H0(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v5, p2

    .line 4
    .line 5
    move-object/from16 v0, p4

    .line 6
    .line 7
    move-object/from16 v12, p5

    .line 8
    .line 9
    const v2, 0x72490bbc

    .line 10
    .line 11
    .line 12
    invoke-virtual {v5, v2}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    or-int/lit8 v2, p1, 0x6

    .line 16
    .line 17
    invoke-virtual {v5, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    const/16 v3, 0x20

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v3, 0x10

    .line 27
    .line 28
    :goto_0
    or-int/2addr v2, v3

    .line 29
    invoke-virtual {v5, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_1

    .line 34
    .line 35
    const/16 v3, 0x100

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const/16 v3, 0x80

    .line 39
    .line 40
    :goto_1
    or-int/2addr v2, v3

    .line 41
    invoke-virtual {v5, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    const/16 v3, 0x800

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v3, 0x400

    .line 51
    .line 52
    :goto_2
    or-int v13, v2, v3

    .line 53
    .line 54
    and-int/lit16 v2, v13, 0x493

    .line 55
    .line 56
    const/16 v3, 0x492

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    if-eq v2, v3, :cond_3

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    goto :goto_3

    .line 63
    :cond_3
    move v2, v7

    .line 64
    :goto_3
    and-int/lit8 v3, v13, 0x1

    .line 65
    .line 66
    invoke-virtual {v5, v3, v2}, La/fet;->U(IZ)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_c

    .line 71
    .line 72
    sget-object v15, La/o7k0;->c:La/n0q;

    .line 73
    .line 74
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 75
    .line 76
    invoke-virtual {v5, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 81
    .line 82
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 83
    .line 84
    .line 85
    move-result-wide v8

    .line 86
    sget-object v3, La/jd8;->n:La/ljc;

    .line 87
    .line 88
    invoke-static {v15, v8, v9, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    const-string v9, "SECURITY_SETTINGS_SCREEN_LAZY_COLUMN"

    .line 93
    .line 94
    invoke-static {v8, v9}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    sget-object v9, La/uc9;->c:La/mw3;

    .line 99
    .line 100
    sget-object v10, La/gqw0;->m:La/xx7;

    .line 101
    .line 102
    invoke-static {v9, v10, v5, v7}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    iget-wide v10, v5, La/fet;->T:J

    .line 107
    .line 108
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 113
    .line 114
    .line 115
    move-result-object v11

    .line 116
    invoke-static {v5, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 121
    .line 122
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5}, La/fet;->i0()V

    .line 126
    .line 127
    .line 128
    iget-boolean v14, v5, La/fet;->S:Z

    .line 129
    .line 130
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 131
    .line 132
    if-eqz v14, :cond_4

    .line 133
    .line 134
    invoke-virtual {v5, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_4
    invoke-virtual {v5}, La/fet;->r0()V

    .line 139
    .line 140
    .line 141
    :goto_4
    sget-object v14, La/gqw0;->x:La/shd;

    .line 142
    .line 143
    invoke-static {v5, v9, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    sget-object v9, La/gqw0;->w:La/shd;

    .line 147
    .line 148
    invoke-static {v5, v11, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v10

    .line 155
    sget-object v11, La/gqw0;->y:La/shd;

    .line 156
    .line 157
    invoke-static {v5, v10, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 161
    .line 162
    .line 163
    sget-object v10, La/gqw0;->v:La/shd;

    .line 164
    .line 165
    invoke-static {v5, v8, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v5, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 173
    .line 174
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 175
    .line 176
    .line 177
    move-result-wide v4

    .line 178
    sget-object v2, La/jm40;->b:La/jm40;

    .line 179
    .line 180
    invoke-static {v2, v4, v5, v3}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    const/high16 v4, 0x3f800000    # 1.0f

    .line 185
    .line 186
    invoke-static {v3, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    sget-object v5, La/gqw0;->a:La/zx7;

    .line 191
    .line 192
    invoke-static {v5, v7}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    move-object/from16 v4, p2

    .line 197
    .line 198
    iget-wide v7, v4, La/fet;->T:J

    .line 199
    .line 200
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 205
    .line 206
    .line 207
    move-result-object v8

    .line 208
    invoke-static {v4, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v4}, La/fet;->i0()V

    .line 213
    .line 214
    .line 215
    iget-boolean v1, v4, La/fet;->S:Z

    .line 216
    .line 217
    if-eqz v1, :cond_5

    .line 218
    .line 219
    invoke-virtual {v4, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 220
    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_5
    invoke-virtual {v4}, La/fet;->r0()V

    .line 224
    .line 225
    .line 226
    :goto_5
    invoke-static {v4, v5, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v4, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 230
    .line 231
    .line 232
    invoke-static {v7, v4, v11, v4}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v4, v3, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 236
    .line 237
    .line 238
    sget-object v1, La/qmk;->a:La/zcl;

    .line 239
    .line 240
    invoke-static {v4}, La/qmk;->a(La/fet;)La/wfn;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    iget v1, v1, La/wfn;->d:F

    .line 245
    .line 246
    const/high16 v3, 0x41000000    # 8.0f

    .line 247
    .line 248
    invoke-static {v2, v1, v3}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    check-cast v3, La/zph0;

    .line 257
    .line 258
    iget-object v3, v3, La/zph0;->b:La/a4x;

    .line 259
    .line 260
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    check-cast v5, La/zph0;

    .line 265
    .line 266
    iget-object v5, v5, La/zph0;->a:La/dxh0;

    .line 267
    .line 268
    and-int/lit8 v6, v13, 0x70

    .line 269
    .line 270
    const/16 v8, 0x20

    .line 271
    .line 272
    if-ne v6, v8, :cond_6

    .line 273
    .line 274
    const/4 v6, 0x1

    .line 275
    goto :goto_6

    .line 276
    :cond_6
    const/4 v6, 0x0

    .line 277
    :goto_6
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v7

    .line 281
    sget-object v8, La/ukd;->a:La/cl5;

    .line 282
    .line 283
    if-nez v6, :cond_7

    .line 284
    .line 285
    if-ne v7, v8, :cond_8

    .line 286
    .line 287
    :cond_7
    new-instance v7, La/f7f0;

    .line 288
    .line 289
    const/4 v6, 0x7

    .line 290
    invoke-direct {v7, v0, v6}, La/f7f0;-><init>(La/l7m0;B)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v4, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    :cond_8
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 297
    .line 298
    and-int/lit16 v6, v13, 0x380

    .line 299
    .line 300
    const/16 v9, 0x100

    .line 301
    .line 302
    if-ne v6, v9, :cond_9

    .line 303
    .line 304
    const/16 v17, 0x1

    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_9
    const/16 v17, 0x0

    .line 308
    .line 309
    :goto_7
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    if-nez v17, :cond_a

    .line 314
    .line 315
    if-ne v6, v8, :cond_b

    .line 316
    .line 317
    :cond_a
    new-instance v6, La/abh0;

    .line 318
    .line 319
    const/4 v8, 0x4

    .line 320
    invoke-direct {v6, v12, v8}, La/abh0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    :cond_b
    move-object v8, v6

    .line 327
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 328
    .line 329
    const/16 v10, 0x180

    .line 330
    .line 331
    const/16 v11, 0x10

    .line 332
    .line 333
    sget-object v4, La/gxh0;->a:La/gxh0;

    .line 334
    .line 335
    const/4 v6, 0x0

    .line 336
    move-object/from16 v9, p2

    .line 337
    .line 338
    move-object v14, v2

    .line 339
    move-object v2, v1

    .line 340
    const/high16 v1, 0x3f800000    # 1.0f

    .line 341
    .line 342
    invoke-static/range {v2 .. v11}, La/ibc;->n(La/mm40;La/a4x;La/hxh0;La/dxh0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 343
    .line 344
    .line 345
    move-object v5, v9

    .line 346
    const/4 v2, 0x1

    .line 347
    invoke-virtual {v5, v2}, La/fet;->r(Z)V

    .line 348
    .line 349
    .line 350
    invoke-static {v14, v1}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 351
    .line 352
    .line 353
    move-result-object v3

    .line 354
    const/16 v6, 0x36

    .line 355
    .line 356
    const/4 v7, 0x4

    .line 357
    sget-object v2, La/zfi0;->a:La/zfi0;

    .line 358
    .line 359
    const/4 v4, 0x0

    .line 360
    invoke-static/range {v2 .. v7}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 361
    .line 362
    .line 363
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    check-cast v1, La/zph0;

    .line 368
    .line 369
    iget-object v1, v1, La/zph0;->c:La/oqh0;

    .line 370
    .line 371
    shr-int/lit8 v2, v13, 0x3

    .line 372
    .line 373
    and-int/lit16 v2, v2, 0x380

    .line 374
    .line 375
    or-int/lit8 v2, v2, 0x6

    .line 376
    .line 377
    move-object/from16 v3, p0

    .line 378
    .line 379
    invoke-virtual {v3, v15, v1, v5, v2}, La/xph0;->G0(La/mm40;La/oqh0;La/fet;I)V

    .line 380
    .line 381
    .line 382
    const/4 v2, 0x1

    .line 383
    invoke-virtual {v5, v2}, La/fet;->r(Z)V

    .line 384
    .line 385
    .line 386
    move-object v2, v14

    .line 387
    goto :goto_8

    .line 388
    :cond_c
    move-object v3, v1

    .line 389
    invoke-virtual {v5}, La/fet;->X()V

    .line 390
    .line 391
    .line 392
    move-object/from16 v2, p3

    .line 393
    .line 394
    :goto_8
    invoke-virtual {v5}, La/fet;->u()La/yfe0;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    if-eqz v7, :cond_d

    .line 399
    .line 400
    new-instance v0, La/dfc0;

    .line 401
    .line 402
    const/16 v6, 0xc

    .line 403
    .line 404
    move/from16 v5, p1

    .line 405
    .line 406
    move-object v1, v3

    .line 407
    move-object v4, v12

    .line 408
    move-object/from16 v3, p4

    .line 409
    .line 410
    invoke-direct/range {v0 .. v6}, La/dfc0;-><init>(Landroidx/fragment/app/Fragment;La/mm40;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;IB)V

    .line 411
    .line 412
    .line 413
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 414
    .line 415
    :cond_d
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0a060f

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v2, La/zb5;

    .line 22
    .line 23
    invoke-direct {v2, v1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-virtual {v2, v0, v0}, La/zb5;->g(ZZ)I

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-super {p0}, La/yx5;->Z()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xph0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
