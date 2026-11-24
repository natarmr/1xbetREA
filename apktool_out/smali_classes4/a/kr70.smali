.class public final La/kr70;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/kr70;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/jh70",
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
.field public static final S1:La/jh70;

.field public static final synthetic U1:[La/iiy;

.field public static final V1:Ljava/lang/String;


# instance fields
.field public final K1:La/f9o0;

.field public final L1:La/s0r;

.field public M1:La/ii;

.field public N1:La/wdk0;

.field public O1:La/fiu0;

.field public final P1:La/a8z;

.field public final Q1:La/a8z;

.field public R1:Landroid/os/PowerManager$WakeLock;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/kr70;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/feature/online_cal/impl/databinding/FragmentOnlineCallBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/kr70;->U1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/jh70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/kr70;->S1:La/jh70;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/kr70;->V1:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0274

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/kr70;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/jr70;->a:La/jr70;

    .line 18
    .line 19
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/kr70;->L1:La/s0r;

    .line 24
    .line 25
    const-class v0, La/bv70;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/ir70;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, La/ir70;-><init>(La/kr70;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, La/kr70;->P1:La/a8z;

    .line 44
    .line 45
    new-instance v0, La/ir70;

    .line 46
    .line 47
    const/4 v1, 0x1

    .line 48
    invoke-direct {v0, p0, v1}, La/ir70;-><init>(La/kr70;B)V

    .line 49
    .line 50
    .line 51
    sget-object v1, La/wez;->b:La/wez;

    .line 52
    .line 53
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/kr70;->Q1:La/a8z;

    .line 58
    .line 59
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/o7k0;->c:La/n0q;

    .line 2
    .line 3
    new-instance v0, La/ir70;

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    invoke-direct {v0, p0, v1}, La/ir70;-><init>(La/kr70;B)V

    .line 7
    .line 8
    .line 9
    const-string v1, "PERMISSION_DIALOG"

    .line 10
    .line 11
    invoke-static {p0, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, La/ir70;

    .line 15
    .line 16
    const/4 v1, 0x5

    .line 17
    invoke-direct {v0, p0, v1}, La/ir70;-><init>(La/kr70;B)V

    .line 18
    .line 19
    .line 20
    const-string v1, "APP_SETTINGS_DIALOG"

    .line 21
    .line 22
    invoke-static {p0, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, La/kr70;->U1:[La/iiy;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    aget-object v0, v0, v1

    .line 29
    .line 30
    iget-object v1, p0, La/kr70;->L1:La/s0r;

    .line 31
    .line 32
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast v0, La/l2r;

    .line 40
    .line 41
    iget-object v0, v0, La/l2r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 42
    .line 43
    new-instance v1, La/owp0;

    .line 44
    .line 45
    invoke-direct {v1, p0}, La/owp0;-><init>(La/clz;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, La/jt50;

    .line 49
    .line 50
    const/16 v3, 0x15

    .line 51
    .line 52
    invoke-direct {v2, p0, p1, v3}, La/jt50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance p0, La/ugd;

    .line 56
    .line 57
    const p1, -0x26721dd7

    .line 58
    .line 59
    .line 60
    const/4 v3, 0x1

    .line 61
    invoke-direct {p0, p1, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final C0()V
    .locals 21

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
    const-class v2, La/lr70;

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
    instance-of v4, v1, La/lr70;

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
    check-cast v3, La/lr70;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget-object v7, v3, La/lr70;->p:La/wyu;

    .line 65
    .line 66
    iget-object v1, v3, La/lr70;->o:La/ieu;

    .line 67
    .line 68
    iget-object v10, v3, La/lr70;->a:La/ii;

    .line 69
    .line 70
    iget-object v11, v3, La/lr70;->b:La/wdk0;

    .line 71
    .line 72
    iget-object v5, v3, La/lr70;->c:La/gr70;

    .line 73
    .line 74
    iget-object v6, v3, La/lr70;->d:La/cad;

    .line 75
    .line 76
    iget-object v8, v3, La/lr70;->e:La/uq70;

    .line 77
    .line 78
    iget-object v12, v3, La/lr70;->f:La/m1e;

    .line 79
    .line 80
    iget-object v13, v3, La/lr70;->g:La/gst0;

    .line 81
    .line 82
    iget-object v14, v3, La/lr70;->h:La/j1q0;

    .line 83
    .line 84
    iget-object v15, v3, La/lr70;->i:La/yfu;

    .line 85
    .line 86
    iget-object v2, v3, La/lr70;->j:La/btt0;

    .line 87
    .line 88
    iget-object v4, v3, La/lr70;->k:La/b3c0;

    .line 89
    .line 90
    move-object/from16 v17, v1

    .line 91
    .line 92
    iget-object v1, v3, La/lr70;->l:La/vwb0;

    .line 93
    .line 94
    move-object/from16 v16, v1

    .line 95
    .line 96
    iget-object v1, v3, La/lr70;->m:La/ony;

    .line 97
    .line 98
    move-object/from16 v18, v1

    .line 99
    .line 100
    iget-object v1, v3, La/lr70;->n:La/n6k0;

    .line 101
    .line 102
    move-object/from16 v19, v1

    .line 103
    .line 104
    iget-object v1, v3, La/lr70;->q:La/ol;

    .line 105
    .line 106
    move-object/from16 v20, v1

    .line 107
    .line 108
    iget-object v1, v3, La/lr70;->r:La/js70;

    .line 109
    .line 110
    iget-object v3, v3, La/lr70;->s:La/gii0;

    .line 111
    .line 112
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-object/from16 v16, v4

    .line 161
    .line 162
    new-instance v4, La/h6i;

    .line 163
    .line 164
    move-object/from16 v19, v1

    .line 165
    .line 166
    move-object/from16 v18, v20

    .line 167
    .line 168
    invoke-direct/range {v4 .. v19}, La/h6i;-><init>(La/gr70;La/cad;La/wyu;La/uq70;La/i1w0;La/ii;La/wdk0;La/m1e;La/gst0;La/j1q0;La/yfu;La/b3c0;La/ieu;La/ol;La/js70;)V

    .line 169
    .line 170
    .line 171
    iput-object v10, v0, La/kr70;->M1:La/ii;

    .line 172
    .line 173
    iput-object v11, v0, La/kr70;->N1:La/wdk0;

    .line 174
    .line 175
    new-instance v1, La/fiu0;

    .line 176
    .line 177
    iget-object v2, v4, La/h6i;->p:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v2, La/omi;

    .line 180
    .line 181
    const-class v3, La/bv70;

    .line 182
    .line 183
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 188
    .line 189
    .line 190
    iput-object v1, v0, La/kr70;->O1:La/fiu0;

    .line 191
    .line 192
    return-void

    .line 193
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 194
    .line 195
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kr70;->P1:La/a8z;

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

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, La/ds60;

    .line 5
    .line 6
    const/16 v0, 0xe

    .line 7
    .line 8
    invoke-direct {p1, p0, v0}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    const-string v0, "REQUEST_KEY"

    .line 12
    .line 13
    invoke-static {p0, v0, p1}, La/sj3;->A0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kr70;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
