.class public final La/pi;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/gik;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/pi;",
        "La/nw5;",
        "La/gik;",
        "<init>",
        "()V",
        "a/rek0",
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
.field public static final l2:La/rek0;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public e2:La/uuz;

.field public f2:La/wdk0;

.field public final g2:La/nae0;

.field public h2:La/fiu0;

.field public final i2:La/kiu0;

.field public final j2:La/khf0;

.field public final k2:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/pi;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/sportgame/action_menu/impl/databinding/DialogActionMenuBinding;"

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
    const-string v3, "params"

    .line 16
    .line 17
    const-string v5, "getParams()Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;"

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
    sput-object v1, La/pi;->m2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/rek0;

    .line 33
    .line 34
    const/16 v1, 0xa

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/rek0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/pi;->l2:La/rek0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/oi;->a:La/oi;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/pi;->g2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/ni;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {v0, p0, v1}, La/ni;-><init>(La/pi;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/o5;

    .line 19
    .line 20
    const/16 v2, 0x13

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/o5;

    .line 28
    .line 29
    const/16 v4, 0x14

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/wj;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/k8;

    .line 47
    .line 48
    const/16 v4, 0xc

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/k8;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/k8;

    .line 54
    .line 55
    const/16 v5, 0xd

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/k8;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/pi;->i2:La/kiu0;

    .line 65
    .line 66
    new-instance v0, La/khf0;

    .line 67
    .line 68
    const-string v1, "params_key"

    .line 69
    .line 70
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, La/pi;->j2:La/khf0;

    .line 74
    .line 75
    new-instance v0, La/ni;

    .line 76
    .line 77
    const/4 v1, 0x2

    .line 78
    invoke-direct {v0, p0, v1}, La/ni;-><init>(La/pi;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/pi;->k2:La/n0o0;

    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final L0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/pi;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/pi;->g2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/gik;

    .line 16
    .line 17
    return-object p0
.end method

.method public final O0()V
    .locals 5

    .line 1
    sget-object v0, La/pi;->m2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, La/pi;->g2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v3, v2, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v2, La/gik;

    .line 16
    .line 17
    iget-object v2, v2, La/gik;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    iget-object v4, p0, La/pi;->k2:La/n0o0;

    .line 20
    .line 21
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, La/uh;

    .line 26
    .line 27
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const v4, 0x7f08048c

    .line 35
    .line 36
    .line 37
    invoke-static {v4, v2}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    new-instance v4, La/twk;

    .line 44
    .line 45
    invoke-direct {v4, v2}, La/twk;-><init>(Landroid/graphics/drawable/Drawable;)V

    .line 46
    .line 47
    .line 48
    aget-object v0, v0, v1

    .line 49
    .line 50
    invoke-interface {v3, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast p0, La/gik;

    .line 58
    .line 59
    iget-object p0, p0, La/gik;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 62
    .line 63
    .line 64
    :cond_0
    return-void
.end method

.method public final P0()V
    .locals 27

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
    const-class v2, La/qi;

    .line 24
    .line 25
    if-eqz v1, :cond_5

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
    instance-of v4, v1, La/qi;

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
    check-cast v3, La/qi;

    .line 54
    .line 55
    if-eqz v3, :cond_5

    .line 56
    .line 57
    sget-object v1, La/pi;->m2:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/pi;->j2:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v14, v1

    .line 69
    check-cast v14, Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;

    .line 70
    .line 71
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 72
    .line 73
    .line 74
    move-result-object v13

    .line 75
    move-object v1, v0

    .line 76
    :goto_3
    if-eqz v1, :cond_4

    .line 77
    .line 78
    instance-of v2, v1, La/ocl0;

    .line 79
    .line 80
    if-eqz v2, :cond_3

    .line 81
    .line 82
    check-cast v1, La/ocl0;

    .line 83
    .line 84
    new-instance v2, La/ni;

    .line 85
    .line 86
    const/4 v4, 0x0

    .line 87
    invoke-direct {v2, v0, v4}, La/ni;-><init>(La/pi;B)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v5, v3, La/qi;->a:La/cad;

    .line 94
    .line 95
    invoke-interface {v1, v2}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    iget-object v7, v3, La/qi;->d:La/roi0;

    .line 100
    .line 101
    iget-object v15, v3, La/qi;->c:La/atz;

    .line 102
    .line 103
    iget-object v1, v3, La/qi;->b:La/duj;

    .line 104
    .line 105
    iget-object v2, v3, La/qi;->e:La/bn6;

    .line 106
    .line 107
    iget-object v4, v3, La/qi;->h:La/lbu;

    .line 108
    .line 109
    iget-object v8, v3, La/qi;->f:La/a1d;

    .line 110
    .line 111
    iget-object v9, v3, La/qi;->g:La/iip;

    .line 112
    .line 113
    iget-object v12, v3, La/qi;->i:La/gl5;

    .line 114
    .line 115
    iget-object v10, v3, La/qi;->j:La/wdk0;

    .line 116
    .line 117
    iget-object v11, v3, La/qi;->k:La/uuz;

    .line 118
    .line 119
    move-object/from16 v19, v10

    .line 120
    .line 121
    iget-object v10, v3, La/qi;->l:La/jw20;

    .line 122
    .line 123
    move-object/from16 v16, v1

    .line 124
    .line 125
    iget-object v1, v3, La/qi;->m:La/je;

    .line 126
    .line 127
    move-object/from16 v21, v1

    .line 128
    .line 129
    iget-object v1, v3, La/qi;->n:La/ctf0;

    .line 130
    .line 131
    move-object/from16 v22, v1

    .line 132
    .line 133
    iget-object v1, v3, La/qi;->o:La/j1q0;

    .line 134
    .line 135
    move-object/from16 v17, v1

    .line 136
    .line 137
    iget-object v1, v3, La/qi;->p:La/cl5;

    .line 138
    .line 139
    move-object/from16 v23, v1

    .line 140
    .line 141
    iget-object v1, v3, La/qi;->q:La/evz;

    .line 142
    .line 143
    move-object/from16 v24, v1

    .line 144
    .line 145
    iget-object v1, v3, La/qi;->r:La/gua;

    .line 146
    .line 147
    move-object/from16 v20, v11

    .line 148
    .line 149
    iget-object v11, v3, La/qi;->s:La/wsf0;

    .line 150
    .line 151
    iget-object v3, v3, La/qi;->t:La/pru;

    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    move-object/from16 v18, v4

    .line 172
    .line 173
    new-instance v4, La/v5i;

    .line 174
    .line 175
    move-object/from16 v25, v1

    .line 176
    .line 177
    move-object/from16 v17, v2

    .line 178
    .line 179
    move-object/from16 v26, v3

    .line 180
    .line 181
    invoke-direct/range {v4 .. v26}, La/v5i;-><init>(La/cad;La/pcl0;La/roi0;La/a1d;La/iip;La/jw20;La/wsf0;La/gl5;La/i1w0;Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;La/atz;La/duj;La/bn6;La/lbu;La/wdk0;La/uuz;La/je;La/ctf0;La/cl5;La/evz;La/gua;La/pru;)V

    .line 182
    .line 183
    .line 184
    move-object/from16 v1, v19

    .line 185
    .line 186
    move-object/from16 v2, v20

    .line 187
    .line 188
    iput-object v2, v0, La/pi;->e2:La/uuz;

    .line 189
    .line 190
    iput-object v1, v0, La/pi;->f2:La/wdk0;

    .line 191
    .line 192
    new-instance v1, La/fiu0;

    .line 193
    .line 194
    iget-object v2, v4, La/v5i;->v:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v2, La/t5i;

    .line 197
    .line 198
    const-class v3, La/wj;

    .line 199
    .line 200
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 205
    .line 206
    .line 207
    iput-object v1, v0, La/pi;->h2:La/fiu0;

    .line 208
    .line 209
    return-void

    .line 210
    :cond_3
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 211
    .line 212
    goto/16 :goto_3

    .line 213
    .line 214
    :cond_4
    const-string v0, "Can\'t find feature provider!"

    .line 215
    .line 216
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-void

    .line 220
    :cond_5
    const-string v0, "Cannot create dependency "

    .line 221
    .line 222
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0640

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7f131288

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/pi;->i2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, La/wj;

    .line 14
    .line 15
    iget-object v0, p2, La/wj;->w:La/p7m0;

    .line 16
    .line 17
    new-instance v1, La/lj;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v1, v0, p2, v2}, La/lj;-><init>(La/gmq;La/wj;B)V

    .line 21
    .line 22
    .line 23
    new-instance p2, La/qa;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    const/4 v2, 0x3

    .line 27
    invoke-direct {p2, p0, v0, v2}, La/qa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 28
    .line 29
    .line 30
    sget-object v3, La/lkz;->a:La/lkz;

    .line 31
    .line 32
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    new-instance v5, La/m1;

    .line 45
    .line 46
    invoke-direct {v5, v1, v3, p2, v0}, La/m1;-><init>(La/lj;La/clz;La/qa;La/yje;)V

    .line 47
    .line 48
    .line 49
    invoke-static {v4, v0, v0, v5, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    check-cast p1, La/wj;

    .line 57
    .line 58
    iget-object p1, p1, La/wj;->x:La/qoj0;

    .line 59
    .line 60
    new-instance v3, La/i8;

    .line 61
    .line 62
    const/4 v9, 0x4

    .line 63
    const/4 v10, 0x4

    .line 64
    const/4 v4, 0x2

    .line 65
    const-class v6, La/pi;

    .line 66
    .line 67
    const-string v7, "handleEvents"

    .line 68
    .line 69
    const-string v8, "handleEvents(Lorg/xplatform/sportgame/action_menu/impl/presentation/ActionMenuViewModel$Event;)V"

    .line 70
    .line 71
    move-object v5, p0

    .line 72
    invoke-direct/range {v3 .. v10}, La/i8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 73
    .line 74
    .line 75
    invoke-static {v5}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-static {p2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    new-instance v1, La/m1;

    .line 88
    .line 89
    invoke-direct {v1, p1, p0, v3, v0}, La/m1;-><init>(La/gmq;La/clz;La/i8;La/yje;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p2, v0, v0, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 93
    .line 94
    .line 95
    return-void
.end method
