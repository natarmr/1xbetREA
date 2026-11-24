.class public final La/n0i0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/n0i0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gne0",
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
.field public static final R1:La/gne0;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:Z

.field public L1:La/fiu0;

.field public M1:La/gl5;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public final P1:La/a8z;

.field public final Q1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/n0i0;

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
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/n0i0;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gne0;

    .line 21
    .line 22
    const/16 v1, 0x10

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/gne0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/n0i0;->R1:La/gne0;

    .line 28
    .line 29
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
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/n0i0;->K1:Z

    .line 9
    .line 10
    const-class v0, La/g1i0;

    .line 11
    .line 12
    sget-object v1, La/sre0;->a:La/tre0;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, La/a7g0;

    .line 19
    .line 20
    const/16 v2, 0x17

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/n0i0;->P1:La/a8z;

    .line 30
    .line 31
    sget-object v0, La/m0i0;->a:La/m0i0;

    .line 32
    .line 33
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/n0i0;->Q1:La/s0r;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/nxh0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/n0i0;->G0()La/k3t0;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v8, 0x4

    .line 11
    const/4 v2, 0x1

    .line 12
    const-class v4, La/k3t0;

    .line 13
    .line 14
    const-string v5, "onAction"

    .line 15
    .line 16
    const-string v6, "onAction(Ljava/lang/Object;)V"

    .line 17
    .line 18
    invoke-direct/range {v1 .. v8}, La/nxh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 19
    .line 20
    .line 21
    iget-object v2, v0, La/n0i0;->M1:La/gl5;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    new-instance v2, La/a7g0;

    .line 26
    .line 27
    const/16 v3, 0x19

    .line 28
    .line 29
    invoke-direct {v2, v1, v3}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    new-instance v3, La/gwg0;

    .line 33
    .line 34
    const/16 v5, 0x16

    .line 35
    .line 36
    invoke-direct {v3, v1, v5}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    const-string v1, "REQUEST_CAPTCHA_CODE_DIALOG_KEY"

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 42
    .line 43
    .line 44
    new-instance v9, La/nxh0;

    .line 45
    .line 46
    invoke-virtual {v0}, La/n0i0;->G0()La/k3t0;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    const/4 v15, 0x0

    .line 51
    const/16 v16, 0x5

    .line 52
    .line 53
    const/4 v10, 0x1

    .line 54
    const-string v13, "onAction"

    .line 55
    .line 56
    const-string v14, "onAction(Ljava/lang/Object;)V"

    .line 57
    .line 58
    move-object v12, v4

    .line 59
    invoke-direct/range {v9 .. v16}, La/nxh0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 60
    .line 61
    .line 62
    new-instance v1, La/a7g0;

    .line 63
    .line 64
    const/16 v2, 0x18

    .line 65
    .line 66
    invoke-direct {v1, v9, v2}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    const-string v2, "REQUEST_APPROVE_DIALOG"

    .line 70
    .line 71
    invoke-static {v0, v2, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 72
    .line 73
    .line 74
    sget-object v1, La/n0i0;->S1:[La/iiy;

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    aget-object v1, v1, v2

    .line 78
    .line 79
    iget-object v2, v0, La/n0i0;->Q1:La/s0r;

    .line 80
    .line 81
    invoke-virtual {v2, v1, v0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast v1, La/aid;

    .line 89
    .line 90
    iget-object v1, v1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 91
    .line 92
    new-instance v2, La/uph0;

    .line 93
    .line 94
    const/4 v3, 0x3

    .line 95
    invoke-direct {v2, v0, v3}, La/uph0;-><init>(Ljava/lang/Object;B)V

    .line 96
    .line 97
    .line 98
    new-instance v0, La/ugd;

    .line 99
    .line 100
    const v3, 0x2d9e3780

    .line 101
    .line 102
    .line 103
    const/4 v4, 0x1

    .line 104
    invoke-direct {v0, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_0
    const-string v0, "captchaDialogDelegate"

    .line 112
    .line 113
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const/4 v0, 0x0

    .line 117
    throw v0
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
    const-class v2, La/bza;

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
    instance-of v4, v1, La/bza;

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
    check-cast v3, La/bza;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v5, v3, La/bza;->a:La/cad;

    .line 58
    .line 59
    iget-object v9, v3, La/bza;->b:La/duj;

    .line 60
    .line 61
    iget-object v10, v3, La/bza;->c:La/ctf0;

    .line 62
    .line 63
    iget-object v11, v3, La/bza;->d:La/ort;

    .line 64
    .line 65
    iget-object v12, v3, La/bza;->e:La/cyh;

    .line 66
    .line 67
    iget-object v8, v3, La/bza;->j:La/ii;

    .line 68
    .line 69
    iget-object v13, v3, La/bza;->f:La/z4w0;

    .line 70
    .line 71
    iget-object v14, v3, La/bza;->g:La/rou;

    .line 72
    .line 73
    iget-object v15, v3, La/bza;->h:La/pru;

    .line 74
    .line 75
    iget-object v1, v3, La/bza;->i:La/b4j;

    .line 76
    .line 77
    iget-object v2, v3, La/bza;->k:La/oeg0;

    .line 78
    .line 79
    iget-object v4, v3, La/bza;->l:La/b3c0;

    .line 80
    .line 81
    iget-object v6, v3, La/bza;->m:La/m1e;

    .line 82
    .line 83
    iget-object v7, v3, La/bza;->n:La/x20;

    .line 84
    .line 85
    move-object/from16 v19, v6

    .line 86
    .line 87
    iget-object v6, v3, La/bza;->o:La/onv;

    .line 88
    .line 89
    move-object/from16 v20, v7

    .line 90
    .line 91
    iget-object v7, v3, La/bza;->p:La/gle0;

    .line 92
    .line 93
    move-object/from16 v16, v1

    .line 94
    .line 95
    iget-object v1, v3, La/bza;->q:La/bzt;

    .line 96
    .line 97
    iget-object v3, v3, La/bza;->r:La/wdk0;

    .line 98
    .line 99
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-object/from16 v18, v4

    .line 118
    .line 119
    new-instance v4, La/cr;

    .line 120
    .line 121
    move-object/from16 v21, v1

    .line 122
    .line 123
    move-object/from16 v17, v2

    .line 124
    .line 125
    move-object/from16 v22, v3

    .line 126
    .line 127
    invoke-direct/range {v4 .. v22}, La/cr;-><init>(La/cad;La/onv;La/gle0;La/ii;La/duj;La/ctf0;La/ort;La/cyh;La/z4w0;La/rou;La/pru;La/b4j;La/oeg0;La/b3c0;La/m1e;La/x20;La/bzt;La/wdk0;)V

    .line 128
    .line 129
    .line 130
    move-object/from16 v1, v22

    .line 131
    .line 132
    new-instance v2, La/fiu0;

    .line 133
    .line 134
    iget-object v3, v4, La/cr;->r:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v3, La/pai;

    .line 137
    .line 138
    const-class v4, La/g1i0;

    .line 139
    .line 140
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 145
    .line 146
    .line 147
    iput-object v2, v0, La/n0i0;->L1:La/fiu0;

    .line 148
    .line 149
    new-instance v2, La/gl5;

    .line 150
    .line 151
    const/16 v3, 0x11

    .line 152
    .line 153
    invoke-direct {v2, v3}, La/gl5;-><init>(B)V

    .line 154
    .line 155
    .line 156
    iput-object v2, v0, La/n0i0;->M1:La/gl5;

    .line 157
    .line 158
    iput-object v8, v0, La/n0i0;->N1:La/ii;

    .line 159
    .line 160
    iput-object v1, v0, La/n0i0;->O1:La/wdk0;

    .line 161
    .line 162
    return-void

    .line 163
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 164
    .line 165
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n0i0;->P1:La/a8z;

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

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/n0i0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/f0i0;->a:La/f0i0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/n0i0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/g0i0;->a:La/g0i0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/n0i0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
