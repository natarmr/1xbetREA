.class public final La/d2f;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/d2f;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/std",
        "La/p2f;",
        "uiState",
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
.field public static final O1:La/std;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/a8z;

.field public final M1:La/s0r;

.field public final N1:La/zz2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/d2f;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    const-string v3, "tabNumber"

    .line 16
    .line 17
    const-string v5, "getTabNumber()I"

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
    sput-object v1, La/d2f;->P1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/std;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/d2f;->O1:La/std;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/a3f;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/jwd;

    .line 16
    .line 17
    const/16 v2, 0xe

    .line 18
    .line 19
    invoke-direct {v1, p0, v2}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, La/d2f;->L1:La/a8z;

    .line 27
    .line 28
    sget-object v0, La/c2f;->a:La/c2f;

    .line 29
    .line 30
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/d2f;->M1:La/s0r;

    .line 35
    .line 36
    new-instance v0, La/zz2;

    .line 37
    .line 38
    const-string v1, "COUPON_TAB_NUMBER"

    .line 39
    .line 40
    const/4 v2, -0x1

    .line 41
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, La/d2f;->N1:La/zz2;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object p1, La/d2f;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    aget-object v1, p1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/d2f;->N1:La/zz2;

    .line 7
    .line 8
    invoke-virtual {v2, p0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-ltz v1, :cond_0

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    if-ge v1, v3, :cond_0

    .line 20
    .line 21
    iget-object v1, p0, La/d2f;->L1:La/a8z;

    .line 22
    .line 23
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/k3t0;

    .line 28
    .line 29
    new-instance v3, La/x1f;

    .line 30
    .line 31
    aget-object v4, p1, v0

    .line 32
    .line 33
    invoke-virtual {v2, p0, v4}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-direct {v3, v2}, La/x1f;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    new-instance v1, La/b2f;

    .line 48
    .line 49
    invoke-direct {v1, p0, v0}, La/b2f;-><init>(La/d2f;B)V

    .line 50
    .line 51
    .line 52
    const-string v2, "BARCODE_SCANNER_REQUEST_KEY"

    .line 53
    .line 54
    invoke-static {p0, v2, v1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, La/d2f;->M1:La/s0r;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    aget-object p1, p1, v2

    .line 61
    .line 62
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    check-cast p1, La/aid;

    .line 70
    .line 71
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 72
    .line 73
    new-instance v1, La/b2f;

    .line 74
    .line 75
    invoke-direct {v1, p0, v2}, La/b2f;-><init>(La/d2f;B)V

    .line 76
    .line 77
    .line 78
    new-instance p0, La/ugd;

    .line 79
    .line 80
    const v2, 0x4bab925a    # 2.2488244E7f

    .line 81
    .line 82
    .line 83
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method

.method public final C0()V
    .locals 24

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

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
    const-class v1, La/e2f;

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
    instance-of v3, v0, La/e2f;

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
    check-cast v2, La/e2f;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static/range {p0 .. p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v17

    .line 59
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v6, v2, La/e2f;->c:La/iw20;

    .line 63
    .line 64
    iget-object v13, v2, La/e2f;->a:La/zfo;

    .line 65
    .line 66
    iget-object v14, v2, La/e2f;->b:La/edo;

    .line 67
    .line 68
    iget-object v5, v2, La/e2f;->d:La/fvt0;

    .line 69
    .line 70
    iget-object v15, v2, La/e2f;->e:La/tnm0;

    .line 71
    .line 72
    iget-object v0, v2, La/e2f;->f:La/m0w;

    .line 73
    .line 74
    iget-object v8, v2, La/e2f;->g:La/wsf0;

    .line 75
    .line 76
    iget-object v10, v2, La/e2f;->p:La/r9u;

    .line 77
    .line 78
    iget-object v11, v2, La/e2f;->o:La/fme;

    .line 79
    .line 80
    iget-object v12, v2, La/e2f;->n:La/kuy;

    .line 81
    .line 82
    iget-object v4, v2, La/e2f;->h:La/cad;

    .line 83
    .line 84
    iget-object v1, v2, La/e2f;->i:La/knf0;

    .line 85
    .line 86
    iget-object v3, v2, La/e2f;->j:La/btt0;

    .line 87
    .line 88
    iget-object v7, v2, La/e2f;->k:La/gii0;

    .line 89
    .line 90
    iget-object v9, v2, La/e2f;->l:La/duj;

    .line 91
    .line 92
    move-object/from16 v20, v7

    .line 93
    .line 94
    iget-object v7, v2, La/e2f;->m:La/kj5;

    .line 95
    .line 96
    move-object/from16 v21, v9

    .line 97
    .line 98
    iget-object v9, v2, La/e2f;->q:La/iip;

    .line 99
    .line 100
    move-object/from16 v16, v0

    .line 101
    .line 102
    iget-object v0, v2, La/e2f;->r:La/j1q0;

    .line 103
    .line 104
    iget-object v2, v2, La/e2f;->s:La/ctf0;

    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-object/from16 v19, v3

    .line 146
    .line 147
    new-instance v3, La/f6i;

    .line 148
    .line 149
    move-object/from16 v22, v0

    .line 150
    .line 151
    move-object/from16 v18, v1

    .line 152
    .line 153
    move-object/from16 v23, v2

    .line 154
    .line 155
    invoke-direct/range {v3 .. v23}, La/f6i;-><init>(La/cad;La/fvt0;La/iw20;La/kj5;La/wsf0;La/iip;La/r9u;La/fme;La/kuy;La/zfo;La/edo;La/tnm0;La/m0w;La/i1w0;La/knf0;La/btt0;La/gii0;La/duj;La/j1q0;La/ctf0;)V

    .line 156
    .line 157
    .line 158
    new-instance v0, La/fiu0;

    .line 159
    .line 160
    iget-object v1, v3, La/f6i;->d:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, La/uci;

    .line 163
    .line 164
    const-class v2, La/a3f;

    .line 165
    .line 166
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 171
    .line 172
    .line 173
    move-object/from16 v1, p0

    .line 174
    .line 175
    iput-object v0, v1, La/d2f;->K1:La/fiu0;

    .line 176
    .line 177
    return-void

    .line 178
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 179
    .line 180
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    const-string v0, "BARCODE_SCANNER_REQUEST_KEY"

    .line 2
    .line 3
    invoke-static {p0, v0}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, La/yx5;->Z()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
