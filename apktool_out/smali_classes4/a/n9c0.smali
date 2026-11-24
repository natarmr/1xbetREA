.class public final La/n9c0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/e1j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/n9c0;",
        "La/yx5;",
        "La/e1j;",
        "<init>",
        "()V",
        "a/fl70",
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
.field public static final S1:La/fl70;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/wdk0;

.field public M1:La/q5j;

.field public final N1:La/zz2;

.field public final O1:La/zz2;

.field public final P1:La/s0r;

.field public Q1:La/npi;

.field public final R1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/n9c0;

    .line 4
    .line 5
    const-string v2, "bundleBonusesCount"

    .line 6
    .line 7
    const-string v3, "getBundleBonusesCount()I"

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
    const-string v3, "bundleFreeSpinsCount"

    .line 16
    .line 17
    const-string v5, "getBundleFreeSpinsCount()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "viewBinding"

    .line 25
    .line 26
    const-string v6, "getViewBinding()Lorg/xplatform/uikit/databinding/PromoCheckFragmentBinding;"

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
    sput-object v1, La/n9c0;->U1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/fl70;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/n9c0;->S1:La/fl70;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0538

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
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    const/16 v2, 0xc

    .line 13
    .line 14
    invoke-direct {v0, v1, v1, v2}, La/e9o0;-><init>(III)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/n9c0;->K1:La/e9o0;

    .line 18
    .line 19
    new-instance v0, La/zz2;

    .line 20
    .line 21
    const-string v1, "BONUSES_COUNT"

    .line 22
    .line 23
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/n9c0;->N1:La/zz2;

    .line 27
    .line 28
    new-instance v0, La/zz2;

    .line 29
    .line 30
    const-string v1, "FREE_SPINS_COUNT"

    .line 31
    .line 32
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, La/n9c0;->O1:La/zz2;

    .line 36
    .line 37
    sget-object v0, La/m9c0;->a:La/m9c0;

    .line 38
    .line 39
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/n9c0;->P1:La/s0r;

    .line 44
    .line 45
    const-class v0, Lorg/xplatform/feature/promo_aggregator/impl/presentation/compose/b;

    .line 46
    .line 47
    sget-object v1, La/sre0;->a:La/tre0;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    new-instance v1, La/ssa0;

    .line 54
    .line 55
    const/16 v2, 0x11

    .line 56
    .line 57
    invoke-direct {v1, p0, v2}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    const/16 v2, 0xe

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/n9c0;->R1:La/a8z;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/n9c0;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/n9c0;->P1:La/s0r;

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
    check-cast p1, La/y9c0;

    .line 16
    .line 17
    iget-object p1, p1, La/y9c0;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/iob0;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/ugd;

    .line 25
    .line 26
    const v2, -0x1c29e9b

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct {v0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, La/shd;

    .line 34
    .line 35
    const/16 v2, 0xf

    .line 36
    .line 37
    invoke-direct {v1, v2}, La/shd;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v1, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_4

    .line 48
    .line 49
    invoke-virtual {p1}, La/kxq;->r()La/v1r;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_4

    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object p1, p1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 64
    .line 65
    invoke-virtual {p1}, La/pmi;->p()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    const/4 v1, 0x0

    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    move-object v2, v0

    .line 92
    check-cast v2, Landroidx/fragment/app/Fragment;

    .line 93
    .line 94
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-eqz v2, :cond_0

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    move-object v0, v1

    .line 102
    :goto_0
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 103
    .line 104
    iget-object p0, p0, La/n9c0;->R1:La/a8z;

    .line 105
    .line 106
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, La/k3t0;

    .line 111
    .line 112
    new-instance p1, La/h9c0;

    .line 113
    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :cond_2
    if-nez v1, :cond_3

    .line 125
    .line 126
    const-string v1, ""

    .line 127
    .line 128
    :cond_3
    invoke-direct {p1, v1}, La/h9c0;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    :cond_4
    return-void
.end method

.method public final C0()V
    .locals 25

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
    const-class v2, La/l9c0;

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
    instance-of v4, v1, La/l9c0;

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
    check-cast v3, La/l9c0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v23

    .line 61
    new-instance v9, La/eld0;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    sget-object v2, La/n9c0;->U1:[La/iiy;

    .line 65
    .line 66
    aget-object v1, v2, v1

    .line 67
    .line 68
    iget-object v4, v0, La/n9c0;->N1:La/zz2;

    .line 69
    .line 70
    invoke-virtual {v4, v0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v4, 0x1

    .line 79
    aget-object v2, v2, v4

    .line 80
    .line 81
    iget-object v4, v0, La/n9c0;->O1:La/zz2;

    .line 82
    .line 83
    invoke-virtual {v4, v0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    const/4 v4, 0x5

    .line 92
    invoke-direct {v9, v1, v2, v4}, La/eld0;-><init>(IIB)V

    .line 93
    .line 94
    .line 95
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v10, v3, La/l9c0;->a:La/duj;

    .line 99
    .line 100
    iget-object v11, v3, La/l9c0;->b:La/m1e;

    .line 101
    .line 102
    iget-object v12, v3, La/l9c0;->c:La/b4j;

    .line 103
    .line 104
    iget-object v14, v3, La/l9c0;->d:La/ix0;

    .line 105
    .line 106
    iget-object v15, v3, La/l9c0;->e:La/knf0;

    .line 107
    .line 108
    iget-object v1, v3, La/l9c0;->f:La/btt0;

    .line 109
    .line 110
    iget-object v13, v3, La/l9c0;->g:La/peg0;

    .line 111
    .line 112
    iget-object v6, v3, La/l9c0;->i:La/wsf0;

    .line 113
    .line 114
    iget-object v2, v3, La/l9c0;->h:La/gii0;

    .line 115
    .line 116
    iget-object v5, v3, La/l9c0;->k:La/cad;

    .line 117
    .line 118
    iget-object v4, v3, La/l9c0;->l:La/wdk0;

    .line 119
    .line 120
    iget-object v7, v3, La/l9c0;->m:La/lrc;

    .line 121
    .line 122
    iget-object v8, v3, La/l9c0;->n:La/poq0;

    .line 123
    .line 124
    move-object/from16 v16, v1

    .line 125
    .line 126
    iget-object v1, v3, La/l9c0;->o:La/kc60;

    .line 127
    .line 128
    move-object/from16 v21, v1

    .line 129
    .line 130
    iget-object v1, v3, La/l9c0;->p:La/b4j;

    .line 131
    .line 132
    move-object/from16 v19, v1

    .line 133
    .line 134
    iget-object v1, v3, La/l9c0;->q:La/je;

    .line 135
    .line 136
    move-object/from16 v20, v1

    .line 137
    .line 138
    iget-object v1, v3, La/l9c0;->r:La/pru;

    .line 139
    .line 140
    iget-object v3, v3, La/l9c0;->j:La/ctf0;

    .line 141
    .line 142
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-object/from16 v18, v4

    .line 161
    .line 162
    new-instance v4, La/gbi;

    .line 163
    .line 164
    move-object/from16 v22, v1

    .line 165
    .line 166
    move-object/from16 v17, v2

    .line 167
    .line 168
    move-object/from16 v24, v3

    .line 169
    .line 170
    invoke-direct/range {v4 .. v24}, La/gbi;-><init>(La/cad;La/wsf0;La/lrc;La/poq0;La/eld0;La/duj;La/m1e;La/b4j;La/peg0;La/ix0;La/knf0;La/btt0;La/gii0;La/wdk0;La/b4j;La/je;La/kc60;La/pru;La/i1w0;La/ctf0;)V

    .line 171
    .line 172
    .line 173
    move-object/from16 v1, v18

    .line 174
    .line 175
    iput-object v1, v0, La/n9c0;->L1:La/wdk0;

    .line 176
    .line 177
    new-instance v1, La/q5j;

    .line 178
    .line 179
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    iput-object v1, v0, La/n9c0;->M1:La/q5j;

    .line 183
    .line 184
    iget-object v1, v4, La/gbi;->b:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v1, La/n5d0;

    .line 187
    .line 188
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    check-cast v1, La/npi;

    .line 193
    .line 194
    iput-object v1, v0, La/n9c0;->Q1:La/npi;

    .line 195
    .line 196
    return-void

    .line 197
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 198
    .line 199
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n9c0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
