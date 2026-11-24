.class public final La/m5q;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/m5q;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/nek",
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
.field public static final o2:La/nek;

.field public static final synthetic p2:[La/iiy;


# instance fields
.field public final k2:La/yzn0;

.field public final l2:La/yzn0;

.field public m2:La/fiu0;

.field public final n2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/m5q;

    .line 4
    .line 5
    const-string v2, "keysFilterType"

    .line 6
    .line 7
    const-string v3, "getKeysFilterType()Lorg/xplatform/feature/office/test_section/impl/presentation/remote_config_test/models/KeysFilterType;"

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
    const-string v3, "keysSortType"

    .line 16
    .line 17
    const-string v5, "getKeysSortType()Lorg/xplatform/feature/office/test_section/impl/presentation/remote_config_test/models/KeysSortType;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/m5q;->p2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/nek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/m5q;->o2:La/nek;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yzn0;

    .line 5
    .line 6
    const-string v1, "KEYS_FILTER_TYPE"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/m5q;->k2:La/yzn0;

    .line 12
    .line 13
    new-instance v0, La/yzn0;

    .line 14
    .line 15
    const-string v1, "KEYS_SORT_TYPE"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/m5q;->l2:La/yzn0;

    .line 21
    .line 22
    const-class v0, La/q5q;

    .line 23
    .line 24
    sget-object v1, La/sre0;->a:La/tre0;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, La/i5q;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, p0, v2}, La/i5q;-><init>(La/m5q;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, La/m5q;->n2:La/a8z;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, 0x47f50b89

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, La/m5q;->n2:La/a8z;

    .line 12
    .line 13
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, La/k3t0;

    .line 18
    .line 19
    check-cast v3, La/i3t0;

    .line 20
    .line 21
    invoke-virtual {v3, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, La/p5q;

    .line 30
    .line 31
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    move-object v5, v2

    .line 36
    check-cast v5, La/k3t0;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    sget-object v6, La/ukd;->a:La/cl5;

    .line 47
    .line 48
    const/4 v10, 0x0

    .line 49
    if-nez v2, :cond_0

    .line 50
    .line 51
    if-ne v4, v6, :cond_1

    .line 52
    .line 53
    :cond_0
    new-instance v4, La/j5q;

    .line 54
    .line 55
    invoke-direct {v4, v0, v10}, La/j5q;-><init>(La/m5q;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 62
    .line 63
    sget-object v2, La/or00;->a:La/zfn;

    .line 64
    .line 65
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, La/clz;

    .line 70
    .line 71
    sget-object v7, La/lkz;->a:La/lkz;

    .line 72
    .line 73
    invoke-static {v4, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    or-int/2addr v4, v8

    .line 86
    const/4 v8, 0x3

    .line 87
    invoke-virtual {v1, v8}, La/fet;->e(I)Z

    .line 88
    .line 89
    .line 90
    move-result v8

    .line 91
    or-int/2addr v4, v8

    .line 92
    invoke-virtual {v1, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    or-int/2addr v4, v8

    .line 97
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    if-nez v4, :cond_3

    .line 102
    .line 103
    if-ne v8, v6, :cond_2

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    move-object v6, v2

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    :goto_0
    new-instance v4, La/pc;

    .line 109
    .line 110
    const/4 v8, 0x0

    .line 111
    const/16 v9, 0x11

    .line 112
    .line 113
    move-object v6, v2

    .line 114
    invoke-direct/range {v4 .. v9}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    move-object v8, v4

    .line 121
    :goto_1
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 122
    .line 123
    invoke-static {v1, v6, v8}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 124
    .line 125
    .line 126
    iget-object v2, v3, La/p5q;->a:La/nmy;

    .line 127
    .line 128
    sget-object v4, La/m5q;->p2:[La/iiy;

    .line 129
    .line 130
    aget-object v5, v4, v10

    .line 131
    .line 132
    iget-object v6, v0, La/m5q;->k2:La/yzn0;

    .line 133
    .line 134
    invoke-virtual {v6, v0, v5, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, v3, La/p5q;->b:La/cny;

    .line 138
    .line 139
    iget-object v5, v0, La/m5q;->l2:La/yzn0;

    .line 140
    .line 141
    const/4 v6, 0x1

    .line 142
    aget-object v4, v4, v6

    .line 143
    .line 144
    invoke-virtual {v5, v0, v4, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 145
    .line 146
    .line 147
    new-instance v11, La/bw5;

    .line 148
    .line 149
    invoke-static {v6, v1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 150
    .line 151
    .line 152
    move-result-object v12

    .line 153
    new-instance v2, La/elm;

    .line 154
    .line 155
    const/4 v4, 0x7

    .line 156
    invoke-direct {v2, v3, v4}, La/elm;-><init>(Ljava/lang/Object;B)V

    .line 157
    .line 158
    .line 159
    const v4, 0x14889a3a

    .line 160
    .line 161
    .line 162
    invoke-static {v4, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 163
    .line 164
    .line 165
    move-result-object v14

    .line 166
    new-instance v2, La/k5q;

    .line 167
    .line 168
    invoke-direct {v2, v3, v0, v10}, La/k5q;-><init>(La/p5q;La/m5q;B)V

    .line 169
    .line 170
    .line 171
    const v4, -0x6c24548e

    .line 172
    .line 173
    .line 174
    invoke-static {v4, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 175
    .line 176
    .line 177
    move-result-object v15

    .line 178
    new-instance v2, La/k5q;

    .line 179
    .line 180
    invoke-direct {v2, v3, v0, v6}, La/k5q;-><init>(La/p5q;La/m5q;B)V

    .line 181
    .line 182
    .line 183
    const v0, 0x47d76f8

    .line 184
    .line 185
    .line 186
    invoke-static {v0, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 187
    .line 188
    .line 189
    move-result-object v16

    .line 190
    const/4 v13, 0x0

    .line 191
    invoke-direct/range {v11 .. v16}, La/bw5;-><init>(La/cw5;La/xdr;La/xdr;La/xdr;La/ugd;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 195
    .line 196
    .line 197
    return-object v11
.end method

.method public final P0()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, La/m5q;->p2:[La/iiy;

    .line 3
    .line 4
    aget-object v0, v1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/m5q;->k2:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v2, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, La/nmy;

    .line 13
    .line 14
    new-instance v2, Lkotlin/Pair;

    .line 15
    .line 16
    const-string v3, "KEYS_FILTER_TYPE"

    .line 17
    .line 18
    invoke-direct {v2, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    aget-object v0, v1, v0

    .line 23
    .line 24
    iget-object v1, p0, La/m5q;->l2:La/yzn0;

    .line 25
    .line 26
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, La/cny;

    .line 31
    .line 32
    new-instance v1, Lkotlin/Pair;

    .line 33
    .line 34
    const-string v3, "KEYS_SORT_TYPE"

    .line 35
    .line 36
    invoke-direct {v1, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    filled-new-array {v2, v1}, [Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "FILTERS_BS_DIALOG_REQUEST_KEY"

    .line 48
    .line 49
    invoke-static {v0, p0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, La/qcc;->Q(Landroidx/fragment/app/Fragment;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/h5q;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/h5q;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/h5q;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const/4 v0, 0x0

    .line 63
    sget-object v2, La/m5q;->p2:[La/iiy;

    .line 64
    .line 65
    aget-object v0, v2, v0

    .line 66
    .line 67
    iget-object v3, p0, La/m5q;->k2:La/yzn0;

    .line 68
    .line 69
    invoke-virtual {v3, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, La/nmy;

    .line 74
    .line 75
    const/4 v3, 0x1

    .line 76
    aget-object v2, v2, v3

    .line 77
    .line 78
    iget-object v3, p0, La/m5q;->l2:La/yzn0;

    .line 79
    .line 80
    invoke-virtual {v3, p0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, La/cny;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object p1, v1, La/h5q;->a:La/cad;

    .line 90
    .line 91
    iget-object v3, v1, La/h5q;->b:La/ctf0;

    .line 92
    .line 93
    iget-object v1, v1, La/h5q;->c:La/iw20;

    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v4, La/esg0;

    .line 99
    .line 100
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object p1, v4, La/esg0;->a:Ljava/lang/Object;

    .line 104
    .line 105
    iput-object v3, v4, La/esg0;->b:Ljava/lang/Object;

    .line 106
    .line 107
    iput-object v0, v4, La/esg0;->c:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object v2, v4, La/esg0;->d:Ljava/lang/Object;

    .line 110
    .line 111
    iput-object v1, v4, La/esg0;->e:Ljava/lang/Object;

    .line 112
    .line 113
    new-instance p1, La/ugi;

    .line 114
    .line 115
    const/4 v0, 0x7

    .line 116
    invoke-direct {p1, v4, v0}, La/ugi;-><init>(Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    iput-object p1, v4, La/esg0;->f:Ljava/lang/Object;

    .line 120
    .line 121
    new-instance p1, La/fiu0;

    .line 122
    .line 123
    iget-object v0, v4, La/esg0;->f:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, La/ugi;

    .line 126
    .line 127
    const-class v1, La/q5q;

    .line 128
    .line 129
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, La/m5q;->m2:La/fiu0;

    .line 137
    .line 138
    return-void

    .line 139
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 140
    .line 141
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method
