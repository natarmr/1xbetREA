.class public final La/uc10;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/uc10;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/wsz",
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
.field public static final R1:La/wsz;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public M1:La/wdk0;

.field public N1:La/vby;

.field public final O1:La/s0r;

.field public final P1:La/yzn0;

.field public final Q1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/uc10;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/lotto/impl/databinding/LottoFragmentBinding;"

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
    const-string v3, "navigationSource"

    .line 16
    .line 17
    const-string v5, "getNavigationSource()Lorg/xplatform/lotto/api/navigation/LottoNavigationSource;"

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
    sput-object v1, La/uc10;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/wsz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/uc10;->R1:La/wsz;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0490

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/tc10;->a:La/tc10;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/uc10;->O1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/yzn0;

    .line 16
    .line 17
    const-string v1, "NAVIGATION_SOURCE_KEY"

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/uc10;->P1:La/yzn0;

    .line 23
    .line 24
    const-class v0, La/be10;

    .line 25
    .line 26
    sget-object v1, La/sre0;->a:La/tre0;

    .line 27
    .line 28
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    new-instance v1, La/sc10;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, La/sc10;-><init>(La/uc10;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/uc10;->Q1:La/a8z;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/sc10;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/sc10;-><init>(La/uc10;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "ERROR_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/uc10;->S1:[La/iiy;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aget-object p1, p1, v1

    .line 16
    .line 17
    iget-object v1, p0, La/uc10;->O1:La/s0r;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, La/vc10;

    .line 27
    .line 28
    iget-object p1, p1, La/vc10;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 29
    .line 30
    new-instance v1, La/owp0;

    .line 31
    .line 32
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 33
    .line 34
    .line 35
    new-instance v2, La/g2z;

    .line 36
    .line 37
    const/16 v3, 0x15

    .line 38
    .line 39
    invoke-direct {v2, p0, v3}, La/g2z;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    new-instance p0, La/ugd;

    .line 43
    .line 44
    const v3, 0x141440a7

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v1, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final C0()V
    .locals 23

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
    const-class v2, La/wc10;

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
    instance-of v4, v1, La/wc10;

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
    check-cast v3, La/wc10;

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
    sget-object v1, La/uc10;->S1:[La/iiy;

    .line 62
    .line 63
    const/4 v2, 0x1

    .line 64
    aget-object v1, v1, v2

    .line 65
    .line 66
    iget-object v2, v0, La/uc10;->P1:La/yzn0;

    .line 67
    .line 68
    invoke-virtual {v2, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    move-object/from16 v22, v1

    .line 73
    .line 74
    check-cast v22, La/fd10;

    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v5, v3, La/wc10;->a:La/cad;

    .line 80
    .line 81
    iget-object v8, v3, La/wc10;->c:La/duj;

    .line 82
    .line 83
    iget-object v9, v3, La/wc10;->d:La/ntu;

    .line 84
    .line 85
    iget-object v6, v3, La/wc10;->b:La/wsf0;

    .line 86
    .line 87
    iget-object v10, v3, La/wc10;->e:La/btt0;

    .line 88
    .line 89
    iget-object v11, v3, La/wc10;->f:La/knf0;

    .line 90
    .line 91
    iget-object v12, v3, La/wc10;->g:La/gii0;

    .line 92
    .line 93
    iget-object v1, v3, La/wc10;->h:La/fsd;

    .line 94
    .line 95
    iget-object v13, v3, La/wc10;->i:La/a6u;

    .line 96
    .line 97
    iget-object v14, v3, La/wc10;->j:La/m1e;

    .line 98
    .line 99
    iget-object v15, v3, La/wc10;->k:La/ctf0;

    .line 100
    .line 101
    iget-object v2, v3, La/wc10;->l:La/b3c0;

    .line 102
    .line 103
    iget-object v4, v3, La/wc10;->m:La/ii;

    .line 104
    .line 105
    move-object/from16 v16, v1

    .line 106
    .line 107
    iget-object v1, v3, La/wc10;->n:La/wdk0;

    .line 108
    .line 109
    move-object/from16 v17, v1

    .line 110
    .line 111
    iget-object v1, v3, La/wc10;->o:La/v88;

    .line 112
    .line 113
    move-object/from16 v18, v1

    .line 114
    .line 115
    iget-object v1, v3, La/wc10;->p:La/j1q0;

    .line 116
    .line 117
    move-object/from16 v19, v1

    .line 118
    .line 119
    iget-object v1, v3, La/wc10;->q:La/ocl;

    .line 120
    .line 121
    iget-object v3, v3, La/wc10;->r:La/vby;

    .line 122
    .line 123
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    move-object/from16 v16, v4

    .line 157
    .line 158
    new-instance v4, La/cr;

    .line 159
    .line 160
    move-object/from16 v20, v1

    .line 161
    .line 162
    move-object/from16 v21, v3

    .line 163
    .line 164
    invoke-direct/range {v4 .. v22}, La/cr;-><init>(La/cad;La/wsf0;La/i1w0;La/duj;La/ntu;La/btt0;La/knf0;La/gii0;La/a6u;La/m1e;La/ctf0;La/ii;La/wdk0;La/v88;La/j1q0;La/ocl;La/vby;La/fd10;)V

    .line 165
    .line 166
    .line 167
    move-object/from16 v1, v16

    .line 168
    .line 169
    move-object/from16 v2, v17

    .line 170
    .line 171
    new-instance v5, La/fiu0;

    .line 172
    .line 173
    iget-object v4, v4, La/cr;->r:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v4, La/tii;

    .line 176
    .line 177
    const-class v6, La/be10;

    .line 178
    .line 179
    invoke-static {v6, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-direct {v5, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 184
    .line 185
    .line 186
    iput-object v5, v0, La/uc10;->K1:La/fiu0;

    .line 187
    .line 188
    iput-object v1, v0, La/uc10;->L1:La/ii;

    .line 189
    .line 190
    iput-object v2, v0, La/uc10;->M1:La/wdk0;

    .line 191
    .line 192
    iput-object v3, v0, La/uc10;->N1:La/vby;

    .line 193
    .line 194
    return-void

    .line 195
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 196
    .line 197
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/uc10;->G0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/svz;

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    const/16 v8, 0x1a

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    const-class v4, La/uc10;

    .line 12
    .line 13
    const-string v5, "handleSideEffect"

    .line 14
    .line 15
    const-string v6, "handleSideEffect(Lorg/xplatform/lotto/impl/presentation/models/LottoSideEffect;)V"

    .line 16
    .line 17
    move-object v3, p0

    .line 18
    invoke-direct/range {v1 .. v8}, La/svz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 19
    .line 20
    .line 21
    sget-object v2, La/lkz;->a:La/lkz;

    .line 22
    .line 23
    check-cast v0, La/i3t0;

    .line 24
    .line 25
    invoke-virtual {v0}, La/i3t0;->C()La/gmq;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sget-object v2, La/lkz;->a:La/lkz;

    .line 30
    .line 31
    new-instance v6, La/e000;

    .line 32
    .line 33
    const/4 v8, 0x6

    .line 34
    const/4 v2, 0x2

    .line 35
    const-class v4, La/knx;

    .line 36
    .line 37
    const-string v5, "suspendConversion0"

    .line 38
    .line 39
    move-object v3, v1

    .line 40
    move-object v1, v6

    .line 41
    const-string v6, "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 42
    .line 43
    invoke-direct/range {v1 .. v8}, La/e000;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-instance v3, La/zd00;

    .line 59
    .line 60
    move-object v4, v0

    .line 61
    check-cast v4, La/i89;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v7, 0x0

    .line 65
    move-object v6, v1

    .line 66
    invoke-direct/range {v3 .. v8}, La/zd00;-><init>(La/i89;La/clz;La/e000;La/yje;I)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/uc10;->Q1:La/a8z;

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

.method public final H0(La/sd10;)V
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v1, v0, La/rd10;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    check-cast v0, La/rd10;

    .line 11
    .line 12
    iget-object v6, v0, La/rd10;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v0, v2, La/uc10;->M1:La/wdk0;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v1, La/xdk0;

    .line 19
    .line 20
    sget-object v5, La/rek0;->b:La/rek0;

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    const/16 v11, 0x7c

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    move-object v4, v1

    .line 29
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 30
    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    const/16 v7, 0x3fc

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const-string v0, "snackbarManager"

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v3

    .line 48
    :cond_1
    instance-of v1, v0, La/qd10;

    .line 49
    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    check-cast v0, La/qd10;

    .line 53
    .line 54
    iget-object v5, v0, La/qd10;->a:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v6, v0, La/qd10;->b:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v0, v2, La/uc10;->L1:La/ii;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 63
    .line 64
    const v1, 0x7f130e5d

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object v13, La/n12;->a:La/n12;

    .line 75
    .line 76
    const/4 v14, 0x0

    .line 77
    const/16 v15, 0x5d8

    .line 78
    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v9, 0x0

    .line 81
    const-string v10, "ERROR_DIALOG_KEY"

    .line 82
    .line 83
    const/4 v11, 0x0

    .line 84
    const/4 v12, 0x0

    .line 85
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_2
    const-string v0, "actionDialogManager"

    .line 100
    .line 101
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw v3

    .line 105
    :cond_3
    :goto_0
    invoke-virtual {v2}, La/uc10;->G0()La/k3t0;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v1, La/dc10;->a:La/dc10;

    .line 110
    .line 111
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method
