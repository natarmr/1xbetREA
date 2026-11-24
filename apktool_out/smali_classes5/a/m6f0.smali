.class public final La/m6f0;
.super La/of80;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/m6f0;",
        "La/of80;",
        "<init>",
        "()V",
        "a/gle0",
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
.field public static final f2:La/gle0;

.field public static final synthetic g2:[La/iiy;

.field public static final h2:Ljava/lang/String;


# instance fields
.field public Y1:La/fiu0;

.field public Z1:La/wdk0;

.field public a2:La/ii;

.field public b2:La/gl5;

.field public final c2:La/s0r;

.field public final d2:La/khf0;

.field public final e2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/m6f0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/registration/success/impl/databinding/BottomDialogRegistrarionSuccessBinding;"

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
    const-string v3, "registrationSuccessParams"

    .line 16
    .line 17
    const-string v5, "getRegistrationSuccessParams()Lorg/xplatform/registration/success/api/RegistrationSuccessParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/m6f0;->g2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gle0;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/m6f0;->f2:La/gle0;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/m6f0;->h2:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d006a

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/sik;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/l6f0;->a:La/l6f0;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/m6f0;->c2:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/khf0;

    .line 16
    .line 17
    const-string v1, "KEY_PARAMS_REGISTRATION_SUCCESS"

    .line 18
    .line 19
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/m6f0;->d2:La/khf0;

    .line 23
    .line 24
    new-instance v0, La/j6f0;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, La/j6f0;-><init>(La/m6f0;B)V

    .line 28
    .line 29
    .line 30
    new-instance v1, La/lce0;

    .line 31
    .line 32
    const/16 v2, 0xa

    .line 33
    .line 34
    invoke-direct {v1, p0, v2}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    sget-object v2, La/wez;->b:La/wez;

    .line 38
    .line 39
    new-instance v3, La/lce0;

    .line 40
    .line 41
    const/16 v4, 0xb

    .line 42
    .line 43
    invoke-direct {v3, v1, v4}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-class v2, La/d7f0;

    .line 51
    .line 52
    sget-object v3, La/sre0;->a:La/tre0;

    .line 53
    .line 54
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    new-instance v3, La/wbe0;

    .line 59
    .line 60
    const/16 v4, 0xc

    .line 61
    .line 62
    invoke-direct {v3, v1, v4}, La/wbe0;-><init>(La/a8z;B)V

    .line 63
    .line 64
    .line 65
    new-instance v4, La/wbe0;

    .line 66
    .line 67
    const/16 v5, 0xd

    .line 68
    .line 69
    invoke-direct {v4, v1, v5}, La/wbe0;-><init>(La/a8z;B)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iput-object v0, p0, La/m6f0;->e2:La/kiu0;

    .line 77
    .line 78
    return-void
.end method


# virtual methods
.method public final I0()V
    .locals 32

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
    const-class v2, La/n6f0;

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
    instance-of v4, v1, La/n6f0;

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
    check-cast v3, La/n6f0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    sget-object v1, La/m6f0;->g2:[La/iiy;

    .line 58
    .line 59
    const/4 v2, 0x1

    .line 60
    aget-object v1, v1, v2

    .line 61
    .line 62
    iget-object v2, v0, La/m6f0;->d2:La/khf0;

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
    check-cast v11, Lorg/xplatform/registration/success/api/RegistrationSuccessParams;

    .line 70
    .line 71
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 72
    .line 73
    .line 74
    move-result-object v24

    .line 75
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget-object v6, v3, La/n6f0;->q:La/epi0;

    .line 79
    .line 80
    iget-object v1, v3, La/n6f0;->p:La/ngb0;

    .line 81
    .line 82
    iget-object v13, v3, La/n6f0;->c:La/je;

    .line 83
    .line 84
    iget-object v12, v3, La/n6f0;->b:La/nr;

    .line 85
    .line 86
    iget-object v14, v3, La/n6f0;->d:La/ctf0;

    .line 87
    .line 88
    iget-object v15, v3, La/n6f0;->e:La/rrc;

    .line 89
    .line 90
    iget-object v2, v3, La/n6f0;->f:La/eru;

    .line 91
    .line 92
    iget-object v4, v3, La/n6f0;->a:La/daf;

    .line 93
    .line 94
    invoke-virtual {v4}, La/daf;->h()La/xte0;

    .line 95
    .line 96
    .line 97
    move-result-object v17

    .line 98
    iget-object v4, v3, La/n6f0;->g:La/wdk0;

    .line 99
    .line 100
    iget-object v5, v3, La/n6f0;->h:La/ii;

    .line 101
    .line 102
    iget-object v7, v3, La/n6f0;->m:La/f4u;

    .line 103
    .line 104
    iget-object v8, v3, La/n6f0;->i:La/kt2;

    .line 105
    .line 106
    iget-object v9, v3, La/n6f0;->j:La/sv3;

    .line 107
    .line 108
    iget-object v10, v3, La/n6f0;->k:La/lrc;

    .line 109
    .line 110
    move-object/from16 v16, v1

    .line 111
    .line 112
    iget-object v1, v3, La/n6f0;->l:La/bk3;

    .line 113
    .line 114
    move-object/from16 v21, v1

    .line 115
    .line 116
    iget-object v1, v3, La/n6f0;->n:La/pru;

    .line 117
    .line 118
    move-object/from16 v19, v5

    .line 119
    .line 120
    iget-object v5, v3, La/n6f0;->o:La/cad;

    .line 121
    .line 122
    move-object/from16 v22, v7

    .line 123
    .line 124
    iget-object v7, v3, La/n6f0;->r:La/ok50;

    .line 125
    .line 126
    move-object/from16 v23, v1

    .line 127
    .line 128
    iget-object v1, v3, La/n6f0;->s:La/yox;

    .line 129
    .line 130
    iget-object v1, v1, La/yox;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, La/uii;

    .line 133
    .line 134
    invoke-virtual {v1}, La/uii;->I()La/sd60;

    .line 135
    .line 136
    .line 137
    move-object v1, v8

    .line 138
    iget-object v8, v3, La/n6f0;->t:La/hn4;

    .line 139
    .line 140
    move-object/from16 v18, v9

    .line 141
    .line 142
    iget-object v9, v3, La/n6f0;->u:La/ilp0;

    .line 143
    .line 144
    move-object/from16 v20, v10

    .line 145
    .line 146
    iget-object v10, v3, La/n6f0;->v:La/wsf0;

    .line 147
    .line 148
    move-object/from16 v25, v1

    .line 149
    .line 150
    iget-object v1, v3, La/n6f0;->w:La/rou;

    .line 151
    .line 152
    move-object/from16 v26, v1

    .line 153
    .line 154
    iget-object v1, v3, La/n6f0;->x:La/cyh;

    .line 155
    .line 156
    move-object/from16 v27, v1

    .line 157
    .line 158
    iget-object v1, v3, La/n6f0;->y:La/z4w0;

    .line 159
    .line 160
    move-object/from16 v28, v1

    .line 161
    .line 162
    iget-object v1, v3, La/n6f0;->z:La/kwd;

    .line 163
    .line 164
    move-object/from16 v29, v1

    .line 165
    .line 166
    iget-object v1, v3, La/n6f0;->A:La/mi70;

    .line 167
    .line 168
    move-object/from16 v30, v1

    .line 169
    .line 170
    iget-object v1, v3, La/n6f0;->B:La/sqx;

    .line 171
    .line 172
    iget-object v3, v3, La/n6f0;->C:La/cmt;

    .line 173
    .line 174
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-object/from16 v18, v4

    .line 196
    .line 197
    new-instance v4, La/lri;

    .line 198
    .line 199
    move-object/from16 v16, v2

    .line 200
    .line 201
    move-object/from16 v31, v3

    .line 202
    .line 203
    move-object/from16 v25, v26

    .line 204
    .line 205
    move-object/from16 v26, v27

    .line 206
    .line 207
    move-object/from16 v27, v28

    .line 208
    .line 209
    move-object/from16 v28, v29

    .line 210
    .line 211
    move-object/from16 v29, v30

    .line 212
    .line 213
    move-object/from16 v30, v1

    .line 214
    .line 215
    invoke-direct/range {v4 .. v31}, La/lri;-><init>(La/cad;La/epi0;La/ok50;La/hn4;La/ilp0;La/wsf0;Lorg/xplatform/registration/success/api/RegistrationSuccessParams;La/nr;La/je;La/ctf0;La/rrc;La/eru;La/xte0;La/wdk0;La/ii;La/lrc;La/bk3;La/f4u;La/pru;La/i1w0;La/rou;La/cyh;La/z4w0;La/kwd;La/mi70;La/sqx;La/cmt;)V

    .line 216
    .line 217
    .line 218
    move-object/from16 v1, v18

    .line 219
    .line 220
    move-object/from16 v2, v19

    .line 221
    .line 222
    new-instance v3, La/fiu0;

    .line 223
    .line 224
    iget-object v4, v4, La/lri;->z:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v4, La/fri;

    .line 227
    .line 228
    const-class v5, La/d7f0;

    .line 229
    .line 230
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 235
    .line 236
    .line 237
    iput-object v3, v0, La/m6f0;->Y1:La/fiu0;

    .line 238
    .line 239
    iput-object v1, v0, La/m6f0;->Z1:La/wdk0;

    .line 240
    .line 241
    iput-object v2, v0, La/m6f0;->a2:La/ii;

    .line 242
    .line 243
    new-instance v1, La/gl5;

    .line 244
    .line 245
    const/16 v2, 0x11

    .line 246
    .line 247
    invoke-direct {v1, v2}, La/gl5;-><init>(B)V

    .line 248
    .line 249
    .line 250
    iput-object v1, v0, La/m6f0;->b2:La/gl5;

    .line 251
    .line 252
    return-void

    .line 253
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 254
    .line 255
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return-void
.end method

.method public final K0()La/vn8;
    .locals 2

    .line 1
    sget-object v0, La/m6f0;->g2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/m6f0;->c2:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/vn8;

    .line 16
    .line 17
    return-object p0
.end method

.method public final L0()La/d7f0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m6f0;->e2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/d7f0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/of80;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    const v0, 0x7f140026

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, La/sik;->F0(II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-static {p1, p2}, La/bcm0;->x(Landroid/view/Window;Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p1, p0, La/sik;->S1:Landroid/app/Dialog;

    .line 19
    .line 20
    instance-of v0, p1, La/hgd;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    check-cast p1, La/hgd;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object p1, v1

    .line 29
    :goto_0
    if-eqz p1, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, La/hgd;->k()La/jg60;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v2, La/bue0;

    .line 42
    .line 43
    const/16 v3, 0x9

    .line 44
    .line 45
    invoke-direct {v2, v3}, La/bue0;-><init>(B)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0, v2}, La/bdx;->O(La/jg60;La/i0h0;Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    new-instance p1, La/j6f0;

    .line 52
    .line 53
    invoke-direct {p1, p0, p2}, La/j6f0;-><init>(La/m6f0;B)V

    .line 54
    .line 55
    .line 56
    const-string v0, "KEY_REQUEST_LOCATION_ERROR"

    .line 57
    .line 58
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 59
    .line 60
    .line 61
    new-instance p1, La/k6f0;

    .line 62
    .line 63
    invoke-direct {p1, p0, p2}, La/k6f0;-><init>(La/m6f0;B)V

    .line 64
    .line 65
    .line 66
    const-string p2, "KEY_REQUEST_CONFIRMATION_NEW_PLACE"

    .line 67
    .line 68
    invoke-static {p0, p2, p1}, La/vdb;->j0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    .line 71
    iget-object p1, p0, La/m6f0;->b2:La/gl5;

    .line 72
    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    new-instance p1, La/j6f0;

    .line 76
    .line 77
    const/4 p2, 0x2

    .line 78
    invoke-direct {p1, p0, p2}, La/j6f0;-><init>(La/m6f0;B)V

    .line 79
    .line 80
    .line 81
    new-instance p2, La/k6f0;

    .line 82
    .line 83
    const/4 v0, 0x1

    .line 84
    invoke-direct {p2, p0, v0}, La/k6f0;-><init>(La/m6f0;B)V

    .line 85
    .line 86
    .line 87
    const-string v2, "KEY_REQUEST_CAPTCHA_CODE_DIALOG"

    .line 88
    .line 89
    invoke-static {p0, v2, p1, p2}, La/gl5;->k(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, La/m6f0;->K0()La/vn8;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object p1, p1, La/vn8;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 97
    .line 98
    sget-object p2, La/qek0;->h:La/qek0;

    .line 99
    .line 100
    new-instance v2, La/iob0;

    .line 101
    .line 102
    const/4 v3, 0x5

    .line 103
    invoke-direct {v2, p0, v3}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 104
    .line 105
    .line 106
    new-instance p0, La/ugd;

    .line 107
    .line 108
    const v3, -0x5ad7a21c

    .line 109
    .line 110
    .line 111
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-static {p1, p2, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_3
    const-string p0, "captchaDialogDelegate"

    .line 119
    .line 120
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw v1
.end method
