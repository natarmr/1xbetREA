.class public final La/i5j;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/i5j;",
        "La/yx5;",
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
.field public static final synthetic O1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/fiu0;

.field public final M1:La/a8z;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/i5j;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/aggregator/daily_tasks/impl/databinding/DailyTaskRulesFragmentBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/i5j;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d00f6

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    const v1, 0x7f040b5d

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    const v3, 0x7f040ae3

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v3, v1, v2}, La/e9o0;-><init>(III)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/i5j;->K1:La/e9o0;

    .line 21
    .line 22
    const-class v0, La/p5j;

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
    new-instance v1, La/e8g;

    .line 31
    .line 32
    const/16 v2, 0x1a

    .line 33
    .line 34
    invoke-direct {v1, p0, v2}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/i5j;->M1:La/a8z;

    .line 42
    .line 43
    sget-object v0, La/h5j;->a:La/h5j;

    .line 44
    .line 45
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, La/i5j;->N1:La/s0r;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/i5j;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/i5j;->N1:La/s0r;

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
    check-cast p1, La/k2j;

    .line 16
    .line 17
    iget-object p1, p1, La/k2j;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/g5j;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/g5j;-><init>(La/i5j;)V

    .line 22
    .line 23
    .line 24
    new-instance p0, La/ugd;

    .line 25
    .line 26
    const v1, -0x3a17b06c

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {p0, v1, v2, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final C0()V
    .locals 4

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
    const-class v1, La/l2j;

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
    instance-of v3, v0, La/l2j;

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
    check-cast v2, La/l2j;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, v2, La/l2j;->a:La/cad;

    .line 56
    .line 57
    iget-object v1, v2, La/l2j;->b:La/ctf0;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v2, La/lhf0;

    .line 63
    .line 64
    invoke-direct {v2, v0, v1}, La/lhf0;-><init>(La/cad;La/ctf0;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, La/fiu0;

    .line 68
    .line 69
    iget-object v1, v2, La/lhf0;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/yei;

    .line 72
    .line 73
    const-class v2, La/p5j;

    .line 74
    .line 75
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, La/i5j;->L1:La/fiu0;

    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 86
    .line 87
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final G0(ILa/fet;)V
    .locals 20

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    const v0, -0x3803af2e

    .line 8
    .line 9
    .line 10
    invoke-virtual {v7, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v7, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x2

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    or-int/2addr v0, v6

    .line 24
    and-int/lit8 v3, v0, 0x3

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    const/4 v8, 0x0

    .line 28
    if-eq v3, v1, :cond_1

    .line 29
    .line 30
    move v3, v4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v3, v8

    .line 33
    :goto_1
    and-int/2addr v0, v4

    .line 34
    invoke-virtual {v7, v0, v3}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_8

    .line 39
    .line 40
    iget-object v9, v2, La/i5j;->M1:La/a8z;

    .line 41
    .line 42
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, La/k3t0;

    .line 47
    .line 48
    check-cast v0, La/i3t0;

    .line 49
    .line 50
    invoke-virtual {v0, v7}, La/i3t0;->y(La/fet;)La/pz40;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, La/k3t0;

    .line 59
    .line 60
    invoke-virtual {v7, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    sget-object v11, La/ukd;->a:La/cl5;

    .line 69
    .line 70
    if-nez v3, :cond_2

    .line 71
    .line 72
    if-ne v4, v11, :cond_3

    .line 73
    .line 74
    :cond_2
    new-instance v4, La/e3j;

    .line 75
    .line 76
    invoke-direct {v4, v2, v1}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v7, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 83
    .line 84
    sget-object v1, La/lkz;->a:La/lkz;

    .line 85
    .line 86
    invoke-static {v4, v7}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v7, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {v7, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    or-int/2addr v1, v4

    .line 99
    const/4 v4, 0x3

    .line 100
    invoke-virtual {v7, v4}, La/fet;->e(I)Z

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    or-int/2addr v1, v4

    .line 105
    invoke-virtual {v7, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    or-int/2addr v1, v4

    .line 110
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    const/4 v5, 0x0

    .line 115
    if-nez v1, :cond_4

    .line 116
    .line 117
    if-ne v4, v11, :cond_5

    .line 118
    .line 119
    :cond_4
    move-object v1, v0

    .line 120
    goto :goto_2

    .line 121
    :cond_5
    move-object v0, v4

    .line 122
    move-object v4, v5

    .line 123
    goto :goto_3

    .line 124
    :goto_2
    new-instance v0, La/ua7;

    .line 125
    .line 126
    move-object v4, v5

    .line 127
    const/16 v5, 0x17

    .line 128
    .line 129
    invoke-direct/range {v0 .. v5}, La/ua7;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :goto_3
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 136
    .line 137
    invoke-static {v7, v2, v0}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    move-object v14, v0

    .line 145
    check-cast v14, La/k3t0;

    .line 146
    .line 147
    invoke-virtual {v7, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    if-nez v0, :cond_6

    .line 156
    .line 157
    if-ne v1, v11, :cond_7

    .line 158
    .line 159
    :cond_6
    new-instance v12, La/y6h;

    .line 160
    .line 161
    const/16 v18, 0x0

    .line 162
    .line 163
    const/16 v19, 0xd

    .line 164
    .line 165
    const/4 v13, 0x1

    .line 166
    const-class v15, La/k3t0;

    .line 167
    .line 168
    const-string v16, "onAction"

    .line 169
    .line 170
    const-string v17, "onAction(Ljava/lang/Object;)V"

    .line 171
    .line 172
    invoke-direct/range {v12 .. v19}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    move-object v1, v12

    .line 179
    :cond_7
    check-cast v1, La/jhy;

    .line 180
    .line 181
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 182
    .line 183
    invoke-static {v8, v7, v4, v10, v1}, La/bsr0;->k(ILa/fet;La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_8
    invoke-virtual {v7}, La/fet;->X()V

    .line 188
    .line 189
    .line 190
    :goto_4
    invoke-virtual {v7}, La/fet;->u()La/yfe0;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    if-eqz v0, :cond_9

    .line 195
    .line 196
    new-instance v1, La/g5j;

    .line 197
    .line 198
    invoke-direct {v1, v2, v6}, La/g5j;-><init>(La/i5j;I)V

    .line 199
    .line 200
    .line 201
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 202
    .line 203
    :cond_9
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/i5j;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
