.class public final La/mvr0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/mvr0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/g9m0",
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
.field public static final W1:La/g9m0;

.field public static final synthetic X1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public N1:La/ii;

.field public O1:La/r9u;

.field public final P1:La/a8z;

.field public final Q1:La/n0o0;

.field public final R1:La/s0r;

.field public final S1:La/v62;

.field public final U1:La/phf0;

.field public final V1:La/zz2;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/mvr0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/toto_bet/impl/databinding/TotoTirageComposeFragmentBinding;"

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
    const-string v3, "totoType"

    .line 16
    .line 17
    const-string v5, "getTotoType()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "totoTypeId"

    .line 25
    .line 26
    const-string v6, "getTotoTypeId()I"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/mvr0;->X1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/g9m0;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/mvr0;->W1:La/g9m0;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0611

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
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v3, 0x7f040ae1

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/mvr0;->K1:La/e9o0;

    .line 23
    .line 24
    const-class v0, La/zvr0;

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
    new-instance v1, La/jvr0;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v1, p0, v2}, La/jvr0;-><init>(La/mvr0;B)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iput-object v0, p0, La/mvr0;->P1:La/a8z;

    .line 43
    .line 44
    new-instance v0, La/jvr0;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, v1}, La/jvr0;-><init>(La/mvr0;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/mvr0;->Q1:La/n0o0;

    .line 55
    .line 56
    sget-object v0, La/lvr0;->a:La/lvr0;

    .line 57
    .line 58
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/mvr0;->R1:La/s0r;

    .line 63
    .line 64
    new-instance v0, La/v62;

    .line 65
    .line 66
    const/16 v1, 0x1b

    .line 67
    .line 68
    invoke-direct {v0, p0, v1}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p0, La/mvr0;->S1:La/v62;

    .line 72
    .line 73
    new-instance v0, La/phf0;

    .line 74
    .line 75
    const-string v1, "TOTO_TYPE"

    .line 76
    .line 77
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, p0, La/mvr0;->U1:La/phf0;

    .line 81
    .line 82
    new-instance v0, La/zz2;

    .line 83
    .line 84
    const-string v1, "TOTO_TYPE_ID"

    .line 85
    .line 86
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, La/mvr0;->V1:La/zz2;

    .line 90
    .line 91
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/mvr0;->X1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v1, p0, La/mvr0;->R1:La/s0r;

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
    check-cast p1, La/nvr0;

    .line 16
    .line 17
    iget-object p1, p1, La/nvr0;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v1, La/kvr0;

    .line 20
    .line 21
    invoke-direct {v1, p0, v0}, La/kvr0;-><init>(La/mvr0;B)V

    .line 22
    .line 23
    .line 24
    new-instance v0, La/ugd;

    .line 25
    .line 26
    const v2, 0x2c0813e

    .line 27
    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    invoke-direct {v0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-static {p1, v1, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 35
    .line 36
    .line 37
    new-instance p1, La/kvr0;

    .line 38
    .line 39
    invoke-direct {p1, p0, v3}, La/kvr0;-><init>(La/mvr0;B)V

    .line 40
    .line 41
    .line 42
    const-string v0, "TotoBetTypeBottomSheetKey"

    .line 43
    .line 44
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 45
    .line 46
    .line 47
    new-instance p1, La/jvr0;

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    invoke-direct {p1, p0, v0}, La/jvr0;-><init>(La/mvr0;B)V

    .line 51
    .line 52
    .line 53
    const-string v0, "REQUEST_OPEN_SETTINGS_DIALOG_KEY"

    .line 54
    .line 55
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, La/jvr0;

    .line 59
    .line 60
    const/4 v1, 0x3

    .line 61
    invoke-direct {p1, p0, v1}, La/jvr0;-><init>(La/mvr0;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 65
    .line 66
    .line 67
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
    const-class v2, La/glr0;

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
    instance-of v4, v1, La/glr0;

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
    check-cast v3, La/glr0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    sget-object v2, La/mvr0;->X1:[La/iiy;

    .line 59
    .line 60
    aget-object v1, v2, v1

    .line 61
    .line 62
    iget-object v4, v0, La/mvr0;->U1:La/phf0;

    .line 63
    .line 64
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    const/4 v4, 0x2

    .line 69
    aget-object v2, v2, v4

    .line 70
    .line 71
    iget-object v4, v0, La/mvr0;->V1:La/zz2;

    .line 72
    .line 73
    invoke-virtual {v4, v0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-object v6, v3, La/glr0;->a:La/cad;

    .line 87
    .line 88
    iget-object v9, v3, La/glr0;->b:La/gii0;

    .line 89
    .line 90
    iget-object v11, v3, La/glr0;->c:La/m1e;

    .line 91
    .line 92
    iget-object v10, v3, La/glr0;->d:La/sa10;

    .line 93
    .line 94
    iget-object v7, v3, La/glr0;->h:La/wsf0;

    .line 95
    .line 96
    iget-object v14, v3, La/glr0;->f:La/gkr0;

    .line 97
    .line 98
    iget-object v1, v3, La/glr0;->j:La/sd80;

    .line 99
    .line 100
    iget-object v15, v3, La/glr0;->i:La/ctf0;

    .line 101
    .line 102
    iget-object v8, v3, La/glr0;->g:La/ii;

    .line 103
    .line 104
    iget-object v13, v3, La/glr0;->e:La/btt0;

    .line 105
    .line 106
    iget-object v2, v3, La/glr0;->k:La/knf0;

    .line 107
    .line 108
    iget-object v4, v3, La/glr0;->l:La/wdk0;

    .line 109
    .line 110
    iget-object v5, v3, La/glr0;->m:La/j1q0;

    .line 111
    .line 112
    move-object/from16 v16, v1

    .line 113
    .line 114
    iget-object v1, v3, La/glr0;->n:La/afm0;

    .line 115
    .line 116
    move-object/from16 v19, v1

    .line 117
    .line 118
    iget-object v1, v3, La/glr0;->o:La/duj;

    .line 119
    .line 120
    move-object/from16 v20, v1

    .line 121
    .line 122
    iget-object v1, v3, La/glr0;->p:La/wyu;

    .line 123
    .line 124
    iget-object v3, v3, La/glr0;->q:La/r9u;

    .line 125
    .line 126
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    new-instance v5, La/v7i;

    .line 163
    .line 164
    move-object/from16 v21, v1

    .line 165
    .line 166
    move-object/from16 v17, v2

    .line 167
    .line 168
    move-object/from16 v22, v3

    .line 169
    .line 170
    move-object/from16 v18, v4

    .line 171
    .line 172
    invoke-direct/range {v5 .. v22}, La/v7i;-><init>(La/cad;La/wsf0;La/ii;La/gii0;La/sa10;La/m1e;La/i1w0;La/btt0;La/gkr0;La/ctf0;La/sd80;La/knf0;La/wdk0;La/afm0;La/duj;La/wyu;La/r9u;)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v1, v18

    .line 176
    .line 177
    move-object/from16 v2, v22

    .line 178
    .line 179
    new-instance v3, La/fiu0;

    .line 180
    .line 181
    iget-object v4, v5, La/v7i;->o:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v4, La/yxi;

    .line 184
    .line 185
    const-class v5, La/zvr0;

    .line 186
    .line 187
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 188
    .line 189
    .line 190
    move-result-object v4

    .line 191
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 192
    .line 193
    .line 194
    iput-object v3, v0, La/mvr0;->L1:La/fiu0;

    .line 195
    .line 196
    iput-object v1, v0, La/mvr0;->M1:La/wdk0;

    .line 197
    .line 198
    iput-object v8, v0, La/mvr0;->N1:La/ii;

    .line 199
    .line 200
    iput-object v2, v0, La/mvr0;->O1:La/r9u;

    .line 201
    .line 202
    return-void

    .line 203
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 204
    .line 205
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mvr0;->P1:La/a8z;

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

.method public final d0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/mvr0;->S1:La/v62;

    .line 2
    .line 3
    invoke-virtual {v0}, La/eg60;->e()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 8
    .line 9
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, La/agd;->k()La/jg60;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, La/mvr0;->S1:La/v62;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/jg60;->b(La/eg60;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-super {p0}, La/yx5;->e0()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mvr0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
