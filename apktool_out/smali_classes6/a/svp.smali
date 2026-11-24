.class public final La/svp;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/svp;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/ddk",
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
.field public static final S1:La/ddk;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:Z

.field public M1:La/fiu0;

.field public N1:La/ujd;

.field public O1:La/wdk0;

.field public final P1:La/a8z;

.field public final Q1:La/qdz;

.field public final R1:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/svp;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/ufc/api/fighter/FighterParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/svp;->U1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/ddk;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/svp;->S1:La/ddk;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

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
    const v3, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/svp;->K1:La/e9o0;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, La/svp;->L1:Z

    .line 26
    .line 27
    const-class v0, La/typ;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/rvp;

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    invoke-direct {v1, p0, v2}, La/rvp;-><init>(La/svp;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, La/svp;->P1:La/a8z;

    .line 46
    .line 47
    new-instance v0, La/qdz;

    .line 48
    .line 49
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, La/svp;->Q1:La/qdz;

    .line 53
    .line 54
    new-instance v0, La/khf0;

    .line 55
    .line 56
    const-string v1, "FIGHTER_PARAMS"

    .line 57
    .line 58
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, La/svp;->R1:La/khf0;

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final C0()V
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
    const-class v2, La/tvp;

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
    instance-of v4, v1, La/tvp;

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
    check-cast v3, La/tvp;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/svp;->U1:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/svp;->R1:La/khf0;

    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    move-object v11, v1

    .line 69
    check-cast v11, Lorg/xplatform/ufc/api/fighter/FighterParams;

    .line 70
    .line 71
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v5, v3, La/tvp;->a:La/cad;

    .line 79
    .line 80
    iget-object v6, v3, La/tvp;->b:La/iip;

    .line 81
    .line 82
    iget-object v7, v3, La/tvp;->c:La/lsn;

    .line 83
    .line 84
    iget-object v8, v3, La/tvp;->d:La/ugf0;

    .line 85
    .line 86
    iget-object v9, v3, La/tvp;->e:La/epi0;

    .line 87
    .line 88
    iget-object v10, v3, La/tvp;->f:La/itr;

    .line 89
    .line 90
    iget-object v13, v3, La/tvp;->g:La/g2v;

    .line 91
    .line 92
    iget-object v14, v3, La/tvp;->h:La/ctf0;

    .line 93
    .line 94
    iget-object v15, v3, La/tvp;->i:La/gii0;

    .line 95
    .line 96
    iget-object v1, v3, La/tvp;->j:La/knf0;

    .line 97
    .line 98
    iget-object v2, v3, La/tvp;->k:La/uzc;

    .line 99
    .line 100
    iget-object v4, v3, La/tvp;->l:La/b3c0;

    .line 101
    .line 102
    move-object/from16 v16, v1

    .line 103
    .line 104
    iget-object v1, v3, La/tvp;->m:La/gst0;

    .line 105
    .line 106
    move-object/from16 v19, v1

    .line 107
    .line 108
    iget-object v1, v3, La/tvp;->n:La/pru;

    .line 109
    .line 110
    move-object/from16 v20, v1

    .line 111
    .line 112
    iget-object v1, v3, La/tvp;->o:La/y78;

    .line 113
    .line 114
    move-object/from16 v21, v1

    .line 115
    .line 116
    iget-object v1, v3, La/tvp;->p:La/lbu;

    .line 117
    .line 118
    move-object/from16 v22, v1

    .line 119
    .line 120
    iget-object v1, v3, La/tvp;->q:La/wdk0;

    .line 121
    .line 122
    move-object/from16 v23, v1

    .line 123
    .line 124
    iget-object v1, v3, La/tvp;->r:La/m1e;

    .line 125
    .line 126
    move-object/from16 v24, v1

    .line 127
    .line 128
    iget-object v1, v3, La/tvp;->s:La/kys0;

    .line 129
    .line 130
    iget-object v3, v3, La/tvp;->t:La/viu;

    .line 131
    .line 132
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-object/from16 v18, v4

    .line 163
    .line 164
    new-instance v4, La/gud;

    .line 165
    .line 166
    move-object/from16 v25, v1

    .line 167
    .line 168
    move-object/from16 v17, v2

    .line 169
    .line 170
    move-object/from16 v26, v3

    .line 171
    .line 172
    invoke-direct/range {v4 .. v26}, La/gud;-><init>(La/cad;La/iip;La/lsn;La/ugf0;La/epi0;La/itr;Lorg/xplatform/ufc/api/fighter/FighterParams;La/i1w0;La/g2v;La/ctf0;La/gii0;La/knf0;La/uzc;La/b3c0;La/gst0;La/pru;La/y78;La/lbu;La/wdk0;La/m1e;La/kys0;La/viu;)V

    .line 173
    .line 174
    .line 175
    move-object/from16 v1, v23

    .line 176
    .line 177
    new-instance v2, La/fiu0;

    .line 178
    .line 179
    iget-object v3, v4, La/gud;->w:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v3, La/f7i;

    .line 182
    .line 183
    const-class v4, La/typ;

    .line 184
    .line 185
    invoke-static {v4, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-direct {v2, v3}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 190
    .line 191
    .line 192
    iput-object v2, v0, La/svp;->M1:La/fiu0;

    .line 193
    .line 194
    invoke-interface {v10}, La/itr;->d()La/ujd;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    invoke-static {v2}, La/x1x;->x(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iput-object v2, v0, La/svp;->N1:La/ujd;

    .line 202
    .line 203
    iput-object v1, v0, La/svp;->O1:La/wdk0;

    .line 204
    .line 205
    return-void

    .line 206
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 207
    .line 208
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/svp;->P1:La/a8z;

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

.method public final X(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroidx/compose/ui/platform/ComposeView;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    const/4 p3, 0x6

    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p1, p2, v0, p3}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 13
    .line 14
    .line 15
    iget-object p2, p0, La/svp;->O1:La/wdk0;

    .line 16
    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    iget-boolean p3, p0, La/svp;->L1:Z

    .line 20
    .line 21
    invoke-static {p2, p0, p3}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 22
    .line 23
    .line 24
    new-instance p2, La/owp0;

    .line 25
    .line 26
    invoke-direct {p2, p0}, La/owp0;-><init>(La/clz;)V

    .line 27
    .line 28
    .line 29
    new-instance p3, La/f5o;

    .line 30
    .line 31
    const/16 v1, 0x16

    .line 32
    .line 33
    invoke-direct {p3, p0, v1}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance p0, La/ugd;

    .line 37
    .line 38
    const v1, -0x2d4a38b2

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    invoke-direct {p0, v1, v2, p3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_0
    const-string p0, "snackbarManager"

    .line 50
    .line 51
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/svp;->N1:La/ujd;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, La/ls2;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/g7p;

    .line 14
    .line 15
    const/4 v3, 0x4

    .line 16
    invoke-direct {v2, p0, v3}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "composeGameCardFragmentDelegate"

    .line 24
    .line 25
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    throw p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/svp;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/svp;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
