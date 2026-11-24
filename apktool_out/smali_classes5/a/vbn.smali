.class public final La/vbn;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vbn;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/nek",
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
.field public static final n2:La/nek;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/yzn0;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/vbn;

    .line 4
    .line 5
    const-string v2, "duelTeamType"

    .line 6
    .line 7
    const-string v3, "getDuelTeamType()Lorg/xplatform/playersduel/impl/domain/models/DuelTeamType;"

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
    sput-object v1, La/vbn;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/nek;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/vbn;->n2:La/nek;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yzn0;

    .line 5
    .line 6
    const-string v1, "DUEL_BUILDER_DIALOG_TEAM_NUMBER_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/vbn;->l2:La/yzn0;

    .line 12
    .line 13
    const-class v0, La/ccn;

    .line 14
    .line 15
    sget-object v1, La/sre0;->a:La/tre0;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, La/sbn;

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    invoke-direct {v1, p0, v2}, La/sbn;-><init>(La/vbn;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/vbn;->m2:La/a8z;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, 0x151839ba

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/vbn;->m2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/k3t0;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    sget-object v4, La/ukd;->a:La/cl5;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    if-ne v3, v4, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v7, p0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    new-instance v5, La/k0l;

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    const/16 v12, 0x18

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const-class v8, La/vbn;

    .line 39
    .line 40
    const-string v9, "handleSideEffect"

    .line 41
    .line 42
    const-string v10, "handleSideEffect(Lorg/xplatform/playersduel/impl/presentation/dialogs/duel_builder/DuelBuilderSideEffect;)V"

    .line 43
    .line 44
    move-object v7, p0

    .line 45
    invoke-direct/range {v5 .. v12}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v5

    .line 52
    :goto_1
    check-cast v3, La/jhy;

    .line 53
    .line 54
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 55
    .line 56
    sget-object p0, La/lkz;->a:La/lkz;

    .line 57
    .line 58
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {p1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    or-int/2addr v2, v3

    .line 71
    const/4 v3, 0x3

    .line 72
    invoke-virtual {p1, v3}, La/fet;->e(I)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    or-int/2addr v2, v3

    .line 77
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    or-int/2addr v2, v3

    .line 82
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    if-nez v2, :cond_2

    .line 87
    .line 88
    if-ne v3, v4, :cond_3

    .line 89
    .line 90
    :cond_2
    new-instance v3, La/g6g;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-direct {v3, v1, v7, p0, v2}, La/g6g;-><init>(La/k3t0;La/vbn;La/pz40;La/yje;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 100
    .line 101
    invoke-static {p1, v7, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/k3t0;

    .line 109
    .line 110
    check-cast p0, La/i3t0;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    const/4 v0, 0x1

    .line 117
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    new-instance v1, La/bw5;

    .line 122
    .line 123
    new-instance v3, La/v7i0;

    .line 124
    .line 125
    const/16 v4, 0x1a

    .line 126
    .line 127
    invoke-direct {v3, p0, v4}, La/v7i0;-><init>(La/l7m0;B)V

    .line 128
    .line 129
    .line 130
    const v4, -0x406c2d57

    .line 131
    .line 132
    .line 133
    invoke-static {v4, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    new-instance v4, La/rbn;

    .line 138
    .line 139
    const/4 v8, 0x0

    .line 140
    invoke-direct {v4, p0, v7, v8}, La/rbn;-><init>(La/pz40;La/vbn;B)V

    .line 141
    .line 142
    .line 143
    const v5, 0x22087c71

    .line 144
    .line 145
    .line 146
    invoke-static {v5, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    new-instance v5, La/rbn;

    .line 151
    .line 152
    invoke-direct {v5, p0, v7, v0}, La/rbn;-><init>(La/pz40;La/vbn;B)V

    .line 153
    .line 154
    .line 155
    const p0, -0x67ffe555

    .line 156
    .line 157
    .line 158
    invoke-static {p0, v5, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    const/4 v6, 0x2

    .line 163
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v8}, La/fet;->r(Z)V

    .line 167
    .line 168
    .line 169
    return-object v1
.end method

.method public final V(Landroid/content/Context;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/xdn;

    .line 25
    .line 26
    if-eqz p1, :cond_b

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/xdn;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    move-object p1, v1

    .line 53
    :cond_2
    check-cast p1, La/xdn;

    .line 54
    .line 55
    if-eqz p1, :cond_b

    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    :goto_2
    const-string v2, "Can\'t find feature provider!"

    .line 62
    .line 63
    if-eqz v0, :cond_a

    .line 64
    .line 65
    invoke-virtual {v0}, Landroidx/fragment/app/e;->P()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    add-int/lit8 v3, v3, -0x1

    .line 70
    .line 71
    :goto_3
    if-ltz v3, :cond_8

    .line 72
    .line 73
    invoke-virtual {v0, v3}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    iget-object v4, v4, La/zb5;->i:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {v0, v4}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    instance-of v5, v4, La/ka9;

    .line 84
    .line 85
    if-eqz v5, :cond_7

    .line 86
    .line 87
    check-cast v4, La/ka9;

    .line 88
    .line 89
    invoke-virtual {v4}, La/ka9;->H0()La/ioi;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :goto_4
    if-eqz v3, :cond_6

    .line 98
    .line 99
    invoke-virtual {v3}, Landroidx/fragment/app/e;->P()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    add-int/lit8 v4, v4, -0x1

    .line 104
    .line 105
    :goto_5
    if-ltz v4, :cond_4

    .line 106
    .line 107
    invoke-virtual {v3, v4}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iget-object v5, v5, La/zb5;->i:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v3, v5}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    instance-of v6, v5, La/ocl0;

    .line 118
    .line 119
    if-eqz v6, :cond_3

    .line 120
    .line 121
    check-cast v5, La/ocl0;

    .line 122
    .line 123
    new-instance v1, La/sbn;

    .line 124
    .line 125
    const/4 v2, 0x0

    .line 126
    invoke-direct {v1, p0, v2}, La/sbn;-><init>(La/vbn;B)V

    .line 127
    .line 128
    .line 129
    invoke-interface {v5, v1}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    sget-object v3, La/vbn;->o2:[La/iiy;

    .line 134
    .line 135
    aget-object v2, v3, v2

    .line 136
    .line 137
    iget-object v3, p0, La/vbn;->l2:La/yzn0;

    .line 138
    .line 139
    invoke-virtual {v3, p0, v2}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, La/wdn;

    .line 144
    .line 145
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-object v3, p1, La/xdn;->a:La/cad;

    .line 149
    .line 150
    iget-object p1, p1, La/xdn;->b:La/ctf0;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    new-instance v4, La/esg0;

    .line 156
    .line 157
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 158
    .line 159
    .line 160
    iput-object v3, v4, La/esg0;->a:Ljava/lang/Object;

    .line 161
    .line 162
    iput-object p1, v4, La/esg0;->b:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object v2, v4, La/esg0;->c:Ljava/lang/Object;

    .line 165
    .line 166
    iput-object v0, v4, La/esg0;->d:Ljava/lang/Object;

    .line 167
    .line 168
    iput-object v1, v4, La/esg0;->e:Ljava/lang/Object;

    .line 169
    .line 170
    new-instance p1, La/yei;

    .line 171
    .line 172
    const/16 v0, 0x10

    .line 173
    .line 174
    invoke-direct {p1, v4, v0}, La/yei;-><init>(Ljava/lang/Object;B)V

    .line 175
    .line 176
    .line 177
    iput-object p1, v4, La/esg0;->f:Ljava/lang/Object;

    .line 178
    .line 179
    new-instance p1, La/fiu0;

    .line 180
    .line 181
    iget-object v0, v4, La/esg0;->f:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v0, La/yei;

    .line 184
    .line 185
    const-class v1, La/ccn;

    .line 186
    .line 187
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 192
    .line 193
    .line 194
    iput-object p1, p0, La/vbn;->k2:La/fiu0;

    .line 195
    .line 196
    return-void

    .line 197
    :cond_3
    add-int/lit8 v4, v4, -0x1

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_4
    iget-object v3, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 201
    .line 202
    if-eqz v3, :cond_5

    .line 203
    .line 204
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    goto :goto_4

    .line 209
    :cond_5
    move-object v3, v1

    .line 210
    goto :goto_4

    .line 211
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_7
    add-int/lit8 v3, v3, -0x1

    .line 216
    .line 217
    goto/16 :goto_3

    .line 218
    .line 219
    :cond_8
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 220
    .line 221
    if-eqz v0, :cond_9

    .line 222
    .line 223
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    goto/16 :goto_2

    .line 228
    .line 229
    :cond_9
    move-object v0, v1

    .line 230
    goto/16 :goto_2

    .line 231
    .line 232
    :cond_a
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_b
    const-string p0, "Cannot create dependency "

    .line 237
    .line 238
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-void
.end method
