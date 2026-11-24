.class public final La/psc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pp9;
.implements Lcom/google/android/gms/tasks/SuccessContinuation;
.implements La/oef;
.implements La/zf60;
.implements La/giu0;
.implements La/p0h0;
.implements La/lcs0;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 1

    .line 1
    iput-byte p1, p0, La/psc;->a:B

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, La/p8i;

    .line 10
    .line 11
    const/4 v0, 0x3

    .line 12
    invoke-direct {p1, v0}, La/p8i;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    sget-object p1, La/mhk;->a:La/kpd0;

    .line 30
    .line 31
    const-class p1, Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;

    .line 32
    .line 33
    invoke-static {}, La/mhk;->a()La/kpd0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, p1}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Landroidx/camera/camera2/compat/quirk/SmallDisplaySizeQuirk;

    .line 42
    .line 43
    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    .line 44
    .line 45
    return-void

    .line 46
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    new-instance p1, La/yox;

    .line 50
    .line 51
    sget-object v0, La/wjt;->o:La/wjt;

    .line 52
    .line 53
    invoke-direct {p1, v0}, La/yox;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    .line 57
    .line 58
    return-void

    .line 59
    :sswitch_data_0
    .sparse-switch
        0x13 -> :sswitch_2
        0x1a -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(La/azj0;)V
    .locals 1

    const/16 v0, 0x1b

    iput-byte v0, p0, La/psc;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/d8f;Ljava/lang/String;)V
    .locals 0

    const/4 p2, 0x5

    iput-byte p2, p0, La/psc;->a:B

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    iput-byte p2, p0, La/psc;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    new-instance p2, La/sza;

    const/16 v0, 0xf

    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    iput-object p2, p0, La/psc;->b:Ljava/lang/Object;

    return-void

    .line 67
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    new-instance p2, La/sza;

    const/16 v0, 0x12

    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    iput-object p2, p0, La/psc;->b:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/neu0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/psc;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/odj;)V
    .locals 1

    const/16 v0, 0x12

    iput-byte v0, p0, La/psc;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/ryc;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/psc;->a:B

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    sget-object v0, La/cmx;->a:Ljava/nio/charset/Charset;

    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    .line 77
    iput-object p0, p1, La/ryc;->a:La/psc;

    return-void
.end method

.method public constructor <init>(La/tgk;)V
    .locals 1

    const/16 v0, 0x19

    iput-byte v0, p0, La/psc;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1

    const/16 v0, 0x16

    iput-byte v0, p0, La/psc;->a:B

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 74
    iput-byte p2, p0, La/psc;->a:B

    iput-object p1, p0, La/psc;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/vzg0;)La/diu0;
    .locals 14

    .line 1
    new-instance v0, La/uw50;

    .line 2
    .line 3
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/omi;

    .line 6
    .line 7
    iget-object p0, p0, La/omi;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/pmi;

    .line 10
    .line 11
    iget-object v1, p0, La/pmi;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/g8i;

    .line 14
    .line 15
    invoke-virtual {v1}, La/g8i;->r4()La/jtj;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v1, p0, La/pmi;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, La/g8i;

    .line 22
    .line 23
    invoke-virtual {v1}, La/g8i;->v1()La/mne;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, La/b8u;

    .line 28
    .line 29
    invoke-virtual {v1}, La/g8i;->v2()La/uyn;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-direct {v4, v5}, La/b8u;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    new-instance v5, La/x4u;

    .line 37
    .line 38
    invoke-virtual {v1}, La/g8i;->v2()La/uyn;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    invoke-direct {v5, v6}, La/x4u;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, La/qxg0;

    .line 46
    .line 47
    invoke-virtual {v1}, La/g8i;->v2()La/uyn;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-direct {v6, v7}, La/qxg0;-><init>(La/uyn;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, La/g8i;->z4()La/lbu;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    new-instance v8, La/hnu;

    .line 59
    .line 60
    invoke-virtual {v1}, La/g8i;->v2()La/uyn;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-direct {v8, v9}, La/hnu;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, La/pmi;->c:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v9, p0

    .line 70
    check-cast v9, La/i1w0;

    .line 71
    .line 72
    invoke-virtual {v1}, La/g8i;->d2()La/duj;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    iget-object p0, v1, La/g8i;->I2:La/n5d0;

    .line 77
    .line 78
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    move-object v11, p0

    .line 83
    check-cast v11, La/ctf0;

    .line 84
    .line 85
    invoke-static {v11}, La/x1x;->x(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, La/g8i;->H7()La/gw60;

    .line 89
    .line 90
    .line 91
    move-result-object v12

    .line 92
    invoke-virtual {v1}, La/g8i;->F7()La/hs60;

    .line 93
    .line 94
    .line 95
    move-result-object v13

    .line 96
    move-object v1, p1

    .line 97
    invoke-direct/range {v0 .. v13}, La/uw50;-><init>(La/vzg0;La/jtj;La/mne;La/b8u;La/x4u;La/qxg0;La/lbu;La/hnu;La/i1w0;La/duj;La/ctf0;La/gw60;La/hs60;)V

    .line 98
    .line 99
    .line 100
    return-object v0
.end method

.method public b()La/rrc;
    .locals 0

    .line 1
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ds3;

    .line 4
    .line 5
    invoke-virtual {p0}, La/ds3;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/oef;

    .line 10
    .line 11
    invoke-interface {p0}, La/oef;->b()La/rrc;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public c(Ljava/lang/Object;)La/diu0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/psc;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    move-object/from16 v3, p1

    .line 9
    .line 10
    check-cast v3, La/i1w0;

    .line 11
    .line 12
    new-instance v2, La/wm70;

    .line 13
    .line 14
    iget-object v0, v0, La/psc;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/c7i;

    .line 17
    .line 18
    iget-object v1, v0, La/c7i;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, La/qsi;

    .line 21
    .line 22
    iget-object v4, v1, La/qsi;->a:La/g8i;

    .line 23
    .line 24
    invoke-virtual {v4}, La/g8i;->u0()La/v88;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-object v5, v1, La/qsi;->a:La/g8i;

    .line 29
    .line 30
    invoke-virtual {v5}, La/g8i;->f0()La/wsf0;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    iget-object v6, v1, La/qsi;->a:La/g8i;

    .line 35
    .line 36
    invoke-virtual {v6}, La/g8i;->v1()La/mne;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    iget-object v7, v1, La/qsi;->m:La/n5d0;

    .line 41
    .line 42
    invoke-interface {v7}, La/o5d0;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    check-cast v7, La/fpi0;

    .line 47
    .line 48
    iget-object v8, v1, La/qsi;->x:La/n5d0;

    .line 49
    .line 50
    invoke-interface {v8}, La/o5d0;->get()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    check-cast v8, La/fq;

    .line 55
    .line 56
    iget-object v0, v0, La/c7i;->d:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, La/r8i;

    .line 59
    .line 60
    iget-object v9, v0, La/r8i;->g:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v9, La/n5d0;

    .line 63
    .line 64
    invoke-interface {v9}, La/o5d0;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    check-cast v9, La/dqx;

    .line 69
    .line 70
    iget-object v10, v1, La/qsi;->u:La/n5d0;

    .line 71
    .line 72
    invoke-interface {v10}, La/o5d0;->get()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    check-cast v10, La/itt;

    .line 77
    .line 78
    iget-object v11, v1, La/qsi;->k0:La/n5d0;

    .line 79
    .line 80
    invoke-interface {v11}, La/o5d0;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    check-cast v11, La/qni0;

    .line 85
    .line 86
    iget-object v12, v0, La/r8i;->l:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v12, La/n5d0;

    .line 89
    .line 90
    invoke-interface {v12}, La/o5d0;->get()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    check-cast v12, La/l1u;

    .line 95
    .line 96
    iget-object v13, v1, La/qsi;->l0:La/n5d0;

    .line 97
    .line 98
    invoke-interface {v13}, La/o5d0;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v13

    .line 102
    check-cast v13, La/lg60;

    .line 103
    .line 104
    iget-object v14, v1, La/qsi;->F:La/n5d0;

    .line 105
    .line 106
    invoke-interface {v14}, La/o5d0;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v14

    .line 110
    check-cast v14, La/qa60;

    .line 111
    .line 112
    iget-object v0, v0, La/r8i;->m:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, La/n5d0;

    .line 115
    .line 116
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    move-object v15, v0

    .line 121
    check-cast v15, La/ppb;

    .line 122
    .line 123
    iget-object v0, v1, La/qsi;->m0:La/n5d0;

    .line 124
    .line 125
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    move-object/from16 v16, v0

    .line 130
    .line 131
    check-cast v16, La/i5m0;

    .line 132
    .line 133
    iget-object v0, v1, La/qsi;->f:La/n5d0;

    .line 134
    .line 135
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    move-object/from16 v17, v0

    .line 140
    .line 141
    check-cast v17, La/lzt;

    .line 142
    .line 143
    iget-object v0, v1, La/qsi;->U:La/n5d0;

    .line 144
    .line 145
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    move-object/from16 v18, v0

    .line 150
    .line 151
    check-cast v18, La/xcc;

    .line 152
    .line 153
    iget-object v0, v1, La/qsi;->k:La/n5d0;

    .line 154
    .line 155
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    move-object/from16 v19, v0

    .line 160
    .line 161
    check-cast v19, La/ztt;

    .line 162
    .line 163
    iget-object v0, v1, La/qsi;->e:La/n5d0;

    .line 164
    .line 165
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    move-object/from16 v20, v0

    .line 170
    .line 171
    check-cast v20, La/d3c;

    .line 172
    .line 173
    iget-object v0, v1, La/qsi;->h:La/n5d0;

    .line 174
    .line 175
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    move-object/from16 v21, v0

    .line 180
    .line 181
    check-cast v21, La/xyb;

    .line 182
    .line 183
    iget-object v0, v1, La/qsi;->p:La/n5d0;

    .line 184
    .line 185
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    move-object/from16 v22, v0

    .line 190
    .line 191
    check-cast v22, La/oqt;

    .line 192
    .line 193
    iget-object v0, v1, La/qsi;->T:La/n5d0;

    .line 194
    .line 195
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    move-object/from16 v23, v0

    .line 200
    .line 201
    check-cast v23, La/y5s;

    .line 202
    .line 203
    iget-object v0, v1, La/qsi;->X:La/n5d0;

    .line 204
    .line 205
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    move-object/from16 v24, v0

    .line 210
    .line 211
    check-cast v24, La/t0u;

    .line 212
    .line 213
    invoke-direct/range {v2 .. v24}, La/wm70;-><init>(La/i1w0;La/v88;La/wsf0;La/mne;La/fpi0;La/fq;La/dqx;La/itt;La/qni0;La/l1u;La/lg60;La/qa60;La/ppb;La/i5m0;La/lzt;La/xcc;La/ztt;La/d3c;La/xyb;La/oqt;La/y5s;La/t0u;)V

    .line 214
    .line 215
    .line 216
    return-object v2

    .line 217
    :pswitch_1
    move-object/from16 v9, p1

    .line 218
    .line 219
    check-cast v9, La/i1w0;

    .line 220
    .line 221
    new-instance v3, La/gh70;

    .line 222
    .line 223
    iget-object v0, v0, La/psc;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, La/c7i;

    .line 226
    .line 227
    iget-object v0, v0, La/c7i;->c:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v0, La/cii;

    .line 230
    .line 231
    iget-object v1, v0, La/cii;->F:La/n5d0;

    .line 232
    .line 233
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    move-object v8, v1

    .line 238
    check-cast v8, La/qa60;

    .line 239
    .line 240
    iget-object v1, v0, La/cii;->U:La/n5d0;

    .line 241
    .line 242
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    move-object v5, v1

    .line 247
    check-cast v5, La/xcc;

    .line 248
    .line 249
    iget-object v1, v0, La/cii;->x:La/n5d0;

    .line 250
    .line 251
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v1

    .line 255
    move-object v4, v1

    .line 256
    check-cast v4, La/fq;

    .line 257
    .line 258
    iget-object v1, v0, La/cii;->a:La/g8i;

    .line 259
    .line 260
    invoke-virtual {v1}, La/g8i;->v1()La/mne;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    iget-object v0, v0, La/cii;->f:La/n5d0;

    .line 265
    .line 266
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    move-object v7, v0

    .line 271
    check-cast v7, La/lzt;

    .line 272
    .line 273
    invoke-direct/range {v3 .. v9}, La/gh70;-><init>(La/fq;La/xcc;La/mne;La/lzt;La/qa60;La/i1w0;)V

    .line 274
    .line 275
    .line 276
    return-object v3

    .line 277
    :pswitch_2
    move-object/from16 v10, p1

    .line 278
    .line 279
    check-cast v10, La/i1w0;

    .line 280
    .line 281
    new-instance v4, La/gh70;

    .line 282
    .line 283
    iget-object v0, v0, La/psc;->b:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v0, La/c7i;

    .line 286
    .line 287
    iget-object v0, v0, La/c7i;->c:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, La/q8i;

    .line 290
    .line 291
    iget-object v1, v0, La/q8i;->F:La/n5d0;

    .line 292
    .line 293
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    move-object v9, v1

    .line 298
    check-cast v9, La/qa60;

    .line 299
    .line 300
    iget-object v1, v0, La/q8i;->U:La/n5d0;

    .line 301
    .line 302
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    move-object v6, v1

    .line 307
    check-cast v6, La/xcc;

    .line 308
    .line 309
    iget-object v1, v0, La/q8i;->x:La/n5d0;

    .line 310
    .line 311
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    move-object v5, v1

    .line 316
    check-cast v5, La/fq;

    .line 317
    .line 318
    iget-object v1, v0, La/q8i;->a:La/g8i;

    .line 319
    .line 320
    invoke-virtual {v1}, La/g8i;->v1()La/mne;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    iget-object v0, v0, La/q8i;->f:La/n5d0;

    .line 325
    .line 326
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    move-object v8, v0

    .line 331
    check-cast v8, La/lzt;

    .line 332
    .line 333
    invoke-direct/range {v4 .. v10}, La/gh70;-><init>(La/fq;La/xcc;La/mne;La/lzt;La/qa60;La/i1w0;)V

    .line 334
    .line 335
    .line 336
    return-object v4

    .line 337
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public d(Landroidx/media3/common/b;)Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p1, Landroidx/media3/common/b;->d:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Landroidx/media3/common/b;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const-string v3, ""

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    const-string v2, "und"

    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-static {v0}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    sget-object v2, La/vtt0;->a:Ljava/lang/String;

    .line 27
    .line 28
    sget-object v2, Ljava/util/Locale$Category;->DISPLAY:Ljava/util/Locale$Category;

    .line 29
    .line 30
    invoke-static {v2}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v0, v2}, Ljava/util/Locale;->getDisplayName(Ljava/util/Locale;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    :cond_1
    :goto_0
    move-object v0, v3

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    const/4 v4, 0x1

    .line 47
    const/4 v5, 0x0

    .line 48
    :try_start_0
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->offsetByCodePoints(II)I

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    new-instance v6, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    :catch_0
    :goto_1
    invoke-virtual {p0, p1}, La/psc;->e(Landroidx/media3/common/b;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-virtual {p0, p1}, La/psc;->o([Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    if-eqz p1, :cond_4

    .line 96
    .line 97
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-eqz p0, :cond_3

    .line 102
    .line 103
    move-object v1, v3

    .line 104
    :cond_3
    move-object p0, v1

    .line 105
    :cond_4
    return-object p0
.end method

.method public e(Landroidx/media3/common/b;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/Resources;

    .line 4
    .line 5
    iget v1, p1, Landroidx/media3/common/b;->f:I

    .line 6
    .line 7
    iget p1, p1, Landroidx/media3/common/b;->f:I

    .line 8
    .line 9
    and-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const v1, 0x7f130823

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v1, ""

    .line 22
    .line 23
    :goto_0
    and-int/lit8 v2, p1, 0x4

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    const v2, 0x7f130826

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {p0, v1}, La/psc;->o([Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_1
    and-int/lit8 v2, p1, 0x8

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    const v2, 0x7f130825

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p0, v1}, La/psc;->o([Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :cond_2
    and-int/lit16 p1, p1, 0x440

    .line 62
    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    const p1, 0x7f130824

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    filled-new-array {v1, p1}, [Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p0, p1}, La/psc;->o([Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :cond_3
    return-object v1
.end method

.method public f([BIIII)I
    .locals 7

    .line 1
    add-int v0, p3, p4

    .line 2
    .line 3
    if-nez p5, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v1, 0x2

    .line 8
    :goto_0
    div-int v2, v0, v1

    .line 9
    .line 10
    new-array v2, v2, [I

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    move v4, v3

    .line 14
    :goto_1
    if-ge v4, v0, :cond_3

    .line 15
    .line 16
    if-eqz p5, :cond_1

    .line 17
    .line 18
    rem-int/lit8 v5, v4, 0x2

    .line 19
    .line 20
    add-int/lit8 v6, p5, -0x1

    .line 21
    .line 22
    if-ne v5, v6, :cond_2

    .line 23
    .line 24
    :cond_1
    div-int v5, v4, v1

    .line 25
    .line 26
    add-int v6, v4, p2

    .line 27
    .line 28
    aget-byte v6, p1, v6

    .line 29
    .line 30
    and-int/lit16 v6, v6, 0xff

    .line 31
    .line 32
    aput v6, v2, v5

    .line 33
    .line 34
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_3
    :try_start_0
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, La/yox;

    .line 40
    .line 41
    div-int/2addr p4, v1

    .line 42
    invoke-virtual {p0, v2, p4}, La/yox;->f([II)I

    .line 43
    .line 44
    .line 45
    move-result p0
    :try_end_0
    .catch La/eie0; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :goto_2
    if-ge v3, p3, :cond_6

    .line 47
    .line 48
    if-eqz p5, :cond_4

    .line 49
    .line 50
    rem-int/lit8 p4, v3, 0x2

    .line 51
    .line 52
    add-int/lit8 v0, p5, -0x1

    .line 53
    .line 54
    if-ne p4, v0, :cond_5

    .line 55
    .line 56
    :cond_4
    add-int p4, v3, p2

    .line 57
    .line 58
    div-int v0, v3, v1

    .line 59
    .line 60
    aget v0, v2, v0

    .line 61
    .line 62
    int-to-byte v0, v0

    .line 63
    aput-byte v0, p1, p4

    .line 64
    .line 65
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_6
    return p0

    .line 69
    :catch_0
    invoke-static {}, La/q9c;->a()La/q9c;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    throw p0
.end method

.method public g(La/to9;La/jtf0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/pdd;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h()La/mne;
    .locals 0

    .line 1
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n5d0;

    .line 4
    .line 5
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/mne;

    .line 10
    .line 11
    return-object p0
.end method

.method public i(Landroidx/media3/common/b;)Ljava/lang/String;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, La/psc;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroid/content/res/Resources;

    .line 8
    .line 9
    iget-object v3, v1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 10
    .line 11
    iget v4, v1, Landroidx/media3/common/b;->k:I

    .line 12
    .line 13
    iget v5, v1, Landroidx/media3/common/b;->J:I

    .line 14
    .line 15
    iget v6, v1, Landroidx/media3/common/b;->x:I

    .line 16
    .line 17
    iget v7, v1, Landroidx/media3/common/b;->w:I

    .line 18
    .line 19
    iget-object v8, v1, Landroidx/media3/common/b;->l:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v3}, La/mg40;->h(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/4 v9, 0x1

    .line 26
    const/4 v10, 0x2

    .line 27
    const/4 v11, -0x1

    .line 28
    if-eq v3, v11, :cond_0

    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_0
    const/4 v3, 0x0

    .line 33
    const/4 v12, 0x0

    .line 34
    if-nez v8, :cond_2

    .line 35
    .line 36
    :cond_1
    move-object/from16 v16, v12

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {v8}, La/vtt0;->W(Ljava/lang/String;)[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v13

    .line 43
    array-length v14, v13

    .line 44
    move v15, v3

    .line 45
    :goto_0
    if-ge v15, v14, :cond_1

    .line 46
    .line 47
    aget-object v16, v13, v15

    .line 48
    .line 49
    invoke-static/range {v16 .. v16}, La/mg40;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v16

    .line 53
    if-eqz v16, :cond_3

    .line 54
    .line 55
    invoke-static/range {v16 .. v16}, La/mg40;->m(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v17

    .line 59
    if-eqz v17, :cond_3

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :goto_1
    if-eqz v16, :cond_5

    .line 66
    .line 67
    :cond_4
    :goto_2
    move v3, v10

    .line 68
    goto :goto_6

    .line 69
    :cond_5
    if-nez v8, :cond_6

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_6
    invoke-static {v8}, La/vtt0;->W(Ljava/lang/String;)[Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    array-length v13, v8

    .line 77
    :goto_3
    if-ge v3, v13, :cond_8

    .line 78
    .line 79
    aget-object v14, v8, v3

    .line 80
    .line 81
    invoke-static {v14}, La/mg40;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v14

    .line 85
    if-eqz v14, :cond_7

    .line 86
    .line 87
    invoke-static {v14}, La/mg40;->i(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v15

    .line 91
    if-eqz v15, :cond_7

    .line 92
    .line 93
    move-object v12, v14

    .line 94
    goto :goto_4

    .line 95
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_8
    :goto_4
    if-eqz v12, :cond_a

    .line 99
    .line 100
    :cond_9
    :goto_5
    move v3, v9

    .line 101
    goto :goto_6

    .line 102
    :cond_a
    if-ne v7, v11, :cond_4

    .line 103
    .line 104
    if-eq v6, v11, :cond_b

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_b
    if-ne v5, v11, :cond_9

    .line 108
    .line 109
    iget v3, v1, Landroidx/media3/common/b;->L:I

    .line 110
    .line 111
    if-eq v3, v11, :cond_c

    .line 112
    .line 113
    goto :goto_5

    .line 114
    :cond_c
    move v3, v11

    .line 115
    :goto_6
    const v8, 0x49742400    # 1000000.0f

    .line 116
    .line 117
    .line 118
    const v12, 0x7f130820

    .line 119
    .line 120
    .line 121
    const-string v13, ""

    .line 122
    .line 123
    if-ne v3, v10, :cond_10

    .line 124
    .line 125
    invoke-virtual/range {p0 .. p1}, La/psc;->e(Landroidx/media3/common/b;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-eq v7, v11, :cond_e

    .line 130
    .line 131
    if-ne v6, v11, :cond_d

    .line 132
    .line 133
    goto :goto_7

    .line 134
    :cond_d
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v6

    .line 142
    filled-new-array {v5, v6}, [Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    const v6, 0x7f130822

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v6, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v5

    .line 153
    goto :goto_8

    .line 154
    :cond_e
    :goto_7
    move-object v5, v13

    .line 155
    :goto_8
    if-ne v4, v11, :cond_f

    .line 156
    .line 157
    goto :goto_9

    .line 158
    :cond_f
    int-to-float v4, v4

    .line 159
    div-float/2addr v4, v8

    .line 160
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 161
    .line 162
    .line 163
    move-result-object v4

    .line 164
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    invoke-virtual {v2, v12, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    :goto_9
    filled-new-array {v3, v5, v13}, [Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v0, v3}, La/psc;->o([Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    goto :goto_d

    .line 181
    :cond_10
    if-ne v3, v9, :cond_18

    .line 182
    .line 183
    invoke-virtual/range {p0 .. p1}, La/psc;->d(Landroidx/media3/common/b;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    if-eq v5, v11, :cond_16

    .line 188
    .line 189
    if-ge v5, v9, :cond_11

    .line 190
    .line 191
    goto :goto_a

    .line 192
    :cond_11
    if-eq v5, v9, :cond_15

    .line 193
    .line 194
    if-eq v5, v10, :cond_14

    .line 195
    .line 196
    const/4 v6, 0x6

    .line 197
    if-eq v5, v6, :cond_13

    .line 198
    .line 199
    const/4 v6, 0x7

    .line 200
    if-eq v5, v6, :cond_13

    .line 201
    .line 202
    const/16 v6, 0x8

    .line 203
    .line 204
    if-eq v5, v6, :cond_12

    .line 205
    .line 206
    const v5, 0x7f13082b

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v5

    .line 213
    goto :goto_b

    .line 214
    :cond_12
    const v5, 0x7f13082d

    .line 215
    .line 216
    .line 217
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    goto :goto_b

    .line 222
    :cond_13
    const v5, 0x7f13082c

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    goto :goto_b

    .line 230
    :cond_14
    const v5, 0x7f13082a

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    goto :goto_b

    .line 238
    :cond_15
    const v5, 0x7f130821

    .line 239
    .line 240
    .line 241
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    goto :goto_b

    .line 246
    :cond_16
    :goto_a
    move-object v5, v13

    .line 247
    :goto_b
    if-ne v4, v11, :cond_17

    .line 248
    .line 249
    goto :goto_c

    .line 250
    :cond_17
    int-to-float v4, v4

    .line 251
    div-float/2addr v4, v8

    .line 252
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    invoke-virtual {v2, v12, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v13

    .line 264
    :goto_c
    filled-new-array {v3, v5, v13}, [Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v0, v3}, La/psc;->o([Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    goto :goto_d

    .line 273
    :cond_18
    invoke-virtual/range {p0 .. p1}, La/psc;->d(Landroidx/media3/common/b;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    :goto_d
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-nez v3, :cond_19

    .line 282
    .line 283
    return-object v0

    .line 284
    :cond_19
    iget-object v0, v1, Landroidx/media3/common/b;->d:Ljava/lang/String;

    .line 285
    .line 286
    if-eqz v0, :cond_1b

    .line 287
    .line 288
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 293
    .line 294
    .line 295
    move-result v1

    .line 296
    if-eqz v1, :cond_1a

    .line 297
    .line 298
    goto :goto_e

    .line 299
    :cond_1a
    const v1, 0x7f13082f

    .line 300
    .line 301
    .line 302
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v2, v1, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    return-object v0

    .line 311
    :cond_1b
    :goto_e
    const v0, 0x7f13082e

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    return-object v0
.end method

.method public j()La/l9u0;
    .locals 1

    .line 1
    new-instance v0, La/l9u0;

    .line 2
    .line 3
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/epi0;

    .line 6
    .line 7
    iget-object p0, p0, La/epi0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/xzp;

    .line 10
    .line 11
    invoke-virtual {p0}, La/xzp;->C()La/r9u;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, p0}, La/l9u0;-><init>(La/r9u;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public k(La/uaq0;)Ljava/util/List;
    .locals 3

    .line 1
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nag;

    .line 4
    .line 5
    sget-object v0, La/nag;->d:La/jdh;

    .line 6
    .line 7
    iget-object p0, p0, La/nag;->c:La/knf0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/knf0;->c()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v1, "ru"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p0, v1, v2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {v0, p0, p1}, La/vfc;->O(La/vdh;ZLa/uaq0;)La/idh;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method

.method public l(Landroid/view/View;La/xiv0;)La/xiv0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, La/upg;

    .line 7
    .line 8
    sget-object p1, La/upg;->X1:La/kwd;

    .line 9
    .line 10
    invoke-virtual {p0}, La/upg;->G0()La/rth;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, La/rth;->e:Lorg/xplatform/uikit/components/toolbar/statical/DsNavigationBarStatic;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iget-object v0, p2, La/xiv0;->a:La/uiv0;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, La/uiv0;->i(I)La/pfx;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget p1, p1, La/pfx;->b:I

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    const/16 v1, 0xd

    .line 27
    .line 28
    invoke-static {p1, v0, v1, p0}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 29
    .line 30
    .line 31
    return-object p2
.end method

.method public m(La/to9;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/pdd;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public n()V
    .locals 2

    .line 1
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/neu0;

    .line 4
    .line 5
    iget-object p0, p0, La/neu0;->a:La/meu0;

    .line 6
    .line 7
    iget-object v0, p0, La/meu0;->b:La/bby;

    .line 8
    .line 9
    invoke-static {v0}, La/v3c;->N(La/bby;)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/meu0;->c:La/p7m0;

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {p0, v1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public varargs o([Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    const-string v1, ""

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v0, :cond_2

    .line 6
    .line 7
    aget-object v3, p1, v2

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    if-nez v4, :cond_1

    .line 14
    .line 15
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    move-object v1, v3

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    iget-object v4, p0, La/psc;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v4, Landroid/content/res/Resources;

    .line 26
    .line 27
    const v5, 0x7f13081f

    .line 28
    .line 29
    .line 30
    filled-new-array {v1, v3}, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v4, v5, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    return-object v1
.end method

.method public p(ILa/og9;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ryc;

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    invoke-virtual {p0, p1, v0}, La/ryc;->p(II)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, La/og9;->size()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, La/ryc;->q(I)V

    .line 14
    .line 15
    .line 16
    check-cast p2, La/kg9;

    .line 17
    .line 18
    iget-object p1, p2, La/kg9;->d:[B

    .line 19
    .line 20
    invoke-virtual {p2}, La/kg9;->i()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p2}, La/kg9;->size()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-virtual {p0, p1, v0, p2}, La/ryc;->l([BII)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public q(ILjava/lang/Object;La/o2h0;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ryc;

    .line 4
    .line 5
    check-cast p2, La/x3;

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    invoke-virtual {p0, p1, v0}, La/ryc;->p(II)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/ryc;->a:La/psc;

    .line 12
    .line 13
    invoke-interface {p3, p2, v0}, La/o2h0;->e(Ljava/lang/Object;La/psc;)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x4

    .line 17
    invoke-virtual {p0, p1, p2}, La/ryc;->p(II)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public r(ILjava/lang/Object;La/o2h0;)V
    .locals 1

    .line 1
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/ryc;

    .line 4
    .line 5
    check-cast p2, La/x3;

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    invoke-virtual {p0, p1, v0}, La/ryc;->p(II)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2, p3}, La/x3;->b(La/o2h0;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p0, p1}, La/ryc;->q(I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/ryc;->a:La/psc;

    .line 19
    .line 20
    invoke-interface {p3, p2, p0}, La/o2h0;->e(Ljava/lang/Object;La/psc;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public then(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;
    .locals 2

    .line 1
    check-cast p1, La/lwi0;

    .line 2
    .line 3
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/d8f;

    .line 6
    .line 7
    iget-object p0, p0, La/d8f;->e:La/f8f;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const-string p0, "Received null app settings, cannot send reports at crash time."

    .line 13
    .line 14
    const-string p1, "FirebaseCrashlytics"

    .line 15
    .line 16
    invoke-static {p1, p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lcom/google/android/gms/tasks/Tasks;->forResult(Ljava/lang/Object;)Lcom/google/android/gms/tasks/Task;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p1, La/f8f;->r:La/z7f;

    .line 25
    .line 26
    invoke-virtual {p0}, La/f8f;->g()Lcom/google/android/gms/tasks/Task;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iget-object v1, p0, La/f8f;->m:La/ywq0;

    .line 31
    .line 32
    iget-object p0, p0, La/f8f;->e:La/cu;

    .line 33
    .line 34
    iget-object p0, p0, La/cu;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, La/aaf;

    .line 37
    .line 38
    invoke-virtual {v1, v0, p0}, La/ywq0;->D(Ljava/lang/String;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    filled-new-array {p1, p0}, [Lcom/google/android/gms/tasks/Task;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lcom/google/android/gms/tasks/Tasks;->whenAll([Lcom/google/android/gms/tasks/Task;)Lcom/google/android/gms/tasks/Task;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method
