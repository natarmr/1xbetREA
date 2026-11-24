.class public final La/ka9;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ka9;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/cl5",
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
.field public static final Q1:La/cl5;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:Z

.field public L1:La/fiu0;

.field public final M1:La/khf0;

.field public final N1:La/phf0;

.field public final O1:La/phf0;

.field public final P1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ka9;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "storedInternalComponentKey"

    .line 16
    .line 17
    const-string v5, "getStoredInternalComponentKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "storedPlayersDuelComponentKey"

    .line 25
    .line 26
    const-string v6, "getStoredPlayersDuelComponentKey()Ljava/lang/String;"

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
    sput-object v1, La/ka9;->R1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/cl5;

    .line 45
    .line 46
    const/16 v1, 0xd

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/cl5;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/ka9;->Q1:La/cl5;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d020e

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/ka9;->K1:Z

    .line 9
    .line 10
    new-instance v1, La/khf0;

    .line 11
    .line 12
    const-string v2, "BUILD_DUEL_FRAGMENT_PARAMS_KEY"

    .line 13
    .line 14
    invoke-direct {v1, v2}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/ka9;->M1:La/khf0;

    .line 18
    .line 19
    new-instance v1, La/phf0;

    .line 20
    .line 21
    const-string v2, "BUILD_DUEL_INTERNAL_COMPONENT_KEY"

    .line 22
    .line 23
    invoke-direct {v1, v2}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, La/ka9;->N1:La/phf0;

    .line 27
    .line 28
    new-instance v1, La/phf0;

    .line 29
    .line 30
    const-string v2, "BUILD_DUEL_PLAYERS_DUEL_COMPONENT_KEY"

    .line 31
    .line 32
    invoke-direct {v1, v2}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, La/ka9;->O1:La/phf0;

    .line 36
    .line 37
    const-class v1, La/ab9;

    .line 38
    .line 39
    sget-object v2, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v2, La/ja9;

    .line 46
    .line 47
    invoke-direct {v2, p0, v0}, La/ja9;-><init>(La/ka9;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, v1, v2}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/ka9;->P1:La/a8z;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/ja9;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p0, v0}, La/ja9;-><init>(La/ka9;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Landroidx/compose/ui/platform/ComposeView;

    .line 15
    .line 16
    new-instance v0, La/owp0;

    .line 17
    .line 18
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/m87;

    .line 22
    .line 23
    const/16 v2, 0x18

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance p0, La/ugd;

    .line 29
    .line 30
    const v2, -0x6536c6e8

    .line 31
    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final C0()V
    .locals 9

    .line 1
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, La/ka9;->H0()La/ioi;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, La/ka9;->G0()La/hoi;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    :goto_0
    if-eqz v2, :cond_7

    .line 17
    .line 18
    invoke-virtual {v2}, Landroidx/fragment/app/e;->P()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    add-int/lit8 v3, v3, -0x1

    .line 23
    .line 24
    :goto_1
    const/4 v4, 0x0

    .line 25
    if-ltz v3, :cond_5

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iget-object v5, v5, La/zb5;->i:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v2, v5}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    instance-of v6, v5, La/ocl0;

    .line 38
    .line 39
    if-eqz v6, :cond_4

    .line 40
    .line 41
    check-cast v5, La/ocl0;

    .line 42
    .line 43
    new-instance v2, La/ja9;

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-direct {v2, p0, v3}, La/ja9;-><init>(La/ka9;B)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v5, v2}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    instance-of v6, v5, La/af3;

    .line 65
    .line 66
    if-eqz v6, :cond_0

    .line 67
    .line 68
    check-cast v5, La/af3;

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_0
    move-object v5, v4

    .line 72
    :goto_2
    const-class v6, La/ia9;

    .line 73
    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    invoke-interface {v5}, La/af3;->d()La/wcf0;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v5, v6}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    check-cast v5, La/o5d0;

    .line 85
    .line 86
    if-eqz v5, :cond_1

    .line 87
    .line 88
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    check-cast v5, La/ze3;

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_1
    move-object v5, v4

    .line 96
    :goto_3
    instance-of v7, v5, La/ia9;

    .line 97
    .line 98
    if-nez v7, :cond_2

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_2
    move-object v4, v5

    .line 102
    :goto_4
    check-cast v4, La/ia9;

    .line 103
    .line 104
    if-eqz v4, :cond_3

    .line 105
    .line 106
    sget-object v5, La/ka9;->R1:[La/iiy;

    .line 107
    .line 108
    aget-object v3, v5, v3

    .line 109
    .line 110
    iget-object v5, p0, La/ka9;->M1:La/khf0;

    .line 111
    .line 112
    invoke-virtual {v5, p0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    check-cast v3, Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;

    .line 117
    .line 118
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    iget-object v0, v0, La/cb50;->a:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v0, v4, La/ia9;->a:La/cad;

    .line 131
    .line 132
    iget-object v6, v4, La/ia9;->b:La/ocl;

    .line 133
    .line 134
    iget-object v7, v4, La/ia9;->c:La/wdk0;

    .line 135
    .line 136
    iget-object v8, v4, La/ia9;->d:La/ctf0;

    .line 137
    .line 138
    iget-object v4, v4, La/ia9;->e:La/rl70;

    .line 139
    .line 140
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    new-instance v7, La/g45;

    .line 147
    .line 148
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 149
    .line 150
    .line 151
    iput-object v0, v7, La/g45;->a:Ljava/lang/Object;

    .line 152
    .line 153
    iput-object v3, v7, La/g45;->b:Ljava/lang/Object;

    .line 154
    .line 155
    iput-object v8, v7, La/g45;->c:Ljava/lang/Object;

    .line 156
    .line 157
    iput-object v6, v7, La/g45;->d:Ljava/lang/Object;

    .line 158
    .line 159
    iput-object v5, v7, La/g45;->e:Ljava/lang/Object;

    .line 160
    .line 161
    iput-object v2, v7, La/g45;->f:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v1, v7, La/g45;->g:Ljava/lang/Object;

    .line 164
    .line 165
    iput-object v4, v7, La/g45;->h:Ljava/lang/Object;

    .line 166
    .line 167
    new-instance v0, La/pai;

    .line 168
    .line 169
    const/4 v1, 0x2

    .line 170
    invoke-direct {v0, v7, v1}, La/pai;-><init>(Ljava/lang/Object;B)V

    .line 171
    .line 172
    .line 173
    iput-object v0, v7, La/g45;->i:Ljava/lang/Object;

    .line 174
    .line 175
    new-instance v0, La/fiu0;

    .line 176
    .line 177
    iget-object v1, v7, La/g45;->i:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v1, La/pai;

    .line 180
    .line 181
    const-class v2, La/ab9;

    .line 182
    .line 183
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 188
    .line 189
    .line 190
    iput-object v0, p0, La/ka9;->L1:La/fiu0;

    .line 191
    .line 192
    return-void

    .line 193
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 194
    .line 195
    invoke-static {v6, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :cond_4
    add-int/lit8 v3, v3, -0x1

    .line 204
    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :cond_5
    iget-object v2, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 208
    .line 209
    if-eqz v2, :cond_6

    .line 210
    .line 211
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    goto/16 :goto_0

    .line 216
    .line 217
    :cond_6
    move-object v2, v4

    .line 218
    goto/16 :goto_0

    .line 219
    .line 220
    :cond_7
    const-string p0, "Can\'t find feature provider!"

    .line 221
    .line 222
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-void
.end method

.method public final G0()La/hoi;
    .locals 8

    .line 1
    sget-object v0, La/ka9;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, La/ka9;->O1:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    sget-object v2, La/lfa0;->a:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    aget-object v2, v0, v2

    .line 22
    .line 23
    iget-object v4, p0, La/ka9;->M1:La/khf0;

    .line 24
    .line 25
    invoke-virtual {v4, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;

    .line 30
    .line 31
    iget-wide v4, v2, Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;->a:J

    .line 32
    .line 33
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v2, v2, La/cb50;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v4, v5, v2}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    aget-object v4, v0, v1

    .line 44
    .line 45
    invoke-virtual {v3, p0, v4, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :goto_0
    const/4 v4, 0x0

    .line 53
    if-eqz v2, :cond_9

    .line 54
    .line 55
    invoke-virtual {v2}, Landroidx/fragment/app/e;->P()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    add-int/lit8 v5, v5, -0x1

    .line 60
    .line 61
    :goto_1
    if-ltz v5, :cond_7

    .line 62
    .line 63
    invoke-virtual {v2, v5}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    iget-object v6, v6, La/zb5;->i:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v2, v6}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    instance-of v7, v6, La/ocl0;

    .line 74
    .line 75
    if-eqz v7, :cond_6

    .line 76
    .line 77
    check-cast v6, La/ocl0;

    .line 78
    .line 79
    new-instance v2, La/ja9;

    .line 80
    .line 81
    const/4 v5, 0x3

    .line 82
    invoke-direct {v2, p0, v5}, La/ja9;-><init>(La/ka9;B)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v6, v2}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {p0}, La/ka9;->H0()La/ioi;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    sget-object v6, La/lfa0;->a:Ljava/util/LinkedHashMap;

    .line 94
    .line 95
    aget-object v0, v0, v1

    .line 96
    .line 97
    invoke-virtual {v3, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget-object v1, v5, La/ioi;->k:La/n5d0;

    .line 102
    .line 103
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, La/h7u;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    sget-object v2, La/lfa0;->a:Ljava/util/LinkedHashMap;

    .line 119
    .line 120
    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    check-cast v3, La/hoi;

    .line 125
    .line 126
    if-nez v3, :cond_5

    .line 127
    .line 128
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    instance-of v3, p0, La/af3;

    .line 140
    .line 141
    if-eqz v3, :cond_1

    .line 142
    .line 143
    check-cast p0, La/af3;

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_1
    move-object p0, v4

    .line 147
    :goto_2
    const-class v3, La/nfa0;

    .line 148
    .line 149
    if-eqz p0, :cond_4

    .line 150
    .line 151
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-virtual {p0, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, La/o5d0;

    .line 160
    .line 161
    if-eqz p0, :cond_2

    .line 162
    .line 163
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, La/ze3;

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_2
    move-object p0, v4

    .line 171
    :goto_3
    instance-of v5, p0, La/nfa0;

    .line 172
    .line 173
    if-nez v5, :cond_3

    .line 174
    .line 175
    move-object p0, v4

    .line 176
    :cond_3
    check-cast p0, La/nfa0;

    .line 177
    .line 178
    if-eqz p0, :cond_4

    .line 179
    .line 180
    iget-object v3, p0, La/nfa0;->a:La/gii0;

    .line 181
    .line 182
    iget-object v4, p0, La/nfa0;->b:La/btt0;

    .line 183
    .line 184
    iget-object v5, p0, La/nfa0;->c:La/knf0;

    .line 185
    .line 186
    iget-object v6, p0, La/nfa0;->d:La/gst0;

    .line 187
    .line 188
    iget-object p0, p0, La/nfa0;->e:La/us3;

    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    new-instance v4, La/hoi;

    .line 206
    .line 207
    invoke-direct {v4, v3, v5, p0, v1}, La/hoi;-><init>(La/gii0;La/knf0;La/us3;La/h7u;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v2, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    return-object v4

    .line 214
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 215
    .line 216
    invoke-static {v3, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    return-object v4

    .line 224
    :cond_5
    return-object v3

    .line 225
    :cond_6
    add-int/lit8 v5, v5, -0x1

    .line 226
    .line 227
    goto/16 :goto_1

    .line 228
    .line 229
    :cond_7
    iget-object v2, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 230
    .line 231
    if-eqz v2, :cond_8

    .line 232
    .line 233
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_8
    move-object v2, v4

    .line 240
    goto/16 :goto_0

    .line 241
    .line 242
    :cond_9
    const-string p0, "Can\'t find feature provider!"

    .line 243
    .line 244
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    return-object v4
.end method

.method public final H0()La/ioi;
    .locals 6

    .line 1
    sget-object v0, La/ka9;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, La/ka9;->N1:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    sget-object v2, La/ofa0;->a:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    aget-object v2, v0, v2

    .line 22
    .line 23
    iget-object v4, p0, La/ka9;->M1:La/khf0;

    .line 24
    .line 25
    invoke-virtual {v4, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;

    .line 30
    .line 31
    iget-wide v4, v2, Lorg/xplatform/playersduel/api/presentation/PlayerDuelParams;->a:J

    .line 32
    .line 33
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v2, v2, La/cb50;->a:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v4, v5, v2}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    aget-object v4, v0, v1

    .line 44
    .line 45
    invoke-virtual {v3, p0, v4, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    sget-object v2, La/ofa0;->a:Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    aget-object v0, v0, v1

    .line 51
    .line 52
    invoke-virtual {v3, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object v1, La/ofa0;->a:Ljava/util/LinkedHashMap;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    check-cast v2, La/ioi;

    .line 66
    .line 67
    if-nez v2, :cond_5

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    instance-of v2, p0, La/af3;

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    if-eqz v2, :cond_1

    .line 84
    .line 85
    check-cast p0, La/af3;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    move-object p0, v3

    .line 89
    :goto_0
    const-class v2, La/pfa0;

    .line 90
    .line 91
    if-eqz p0, :cond_4

    .line 92
    .line 93
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, La/o5d0;

    .line 102
    .line 103
    if-eqz p0, :cond_2

    .line 104
    .line 105
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, La/ze3;

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    move-object p0, v3

    .line 113
    :goto_1
    instance-of v4, p0, La/pfa0;

    .line 114
    .line 115
    if-nez v4, :cond_3

    .line 116
    .line 117
    move-object p0, v3

    .line 118
    :cond_3
    check-cast p0, La/pfa0;

    .line 119
    .line 120
    if-eqz p0, :cond_4

    .line 121
    .line 122
    iget-object v2, p0, La/pfa0;->a:La/mne;

    .line 123
    .line 124
    iget-object v3, p0, La/pfa0;->b:La/gii0;

    .line 125
    .line 126
    iget-object v4, p0, La/pfa0;->c:La/btt0;

    .line 127
    .line 128
    iget-object p0, p0, La/pfa0;->d:La/knf0;

    .line 129
    .line 130
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v4, La/ioi;

    .line 140
    .line 141
    invoke-direct {v4, v2, v3, p0}, La/ioi;-><init>(La/mne;La/gii0;La/knf0;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    return-object v4

    .line 148
    :cond_4
    const-string p0, "Cannot create dependency "

    .line 149
    .line 150
    invoke-static {v2, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    return-object v3

    .line 158
    :cond_5
    return-object v2
.end method

.method public final Y()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ne v0, v1, :cond_2

    .line 25
    .line 26
    :cond_0
    sget-object v0, La/ka9;->R1:[La/iiy;

    .line 27
    .line 28
    aget-object v2, v0, v1

    .line 29
    .line 30
    iget-object v3, p0, La/ka9;->N1:La/phf0;

    .line 31
    .line 32
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-lez v2, :cond_1

    .line 41
    .line 42
    sget-object v2, La/ofa0;->a:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    aget-object v2, v0, v1

    .line 45
    .line 46
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    sget-object v3, La/ofa0;->a:Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    :cond_1
    const/4 v2, 0x2

    .line 59
    aget-object v3, v0, v2

    .line 60
    .line 61
    iget-object v4, p0, La/ka9;->O1:La/phf0;

    .line 62
    .line 63
    invoke-virtual {v4, p0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-lez v3, :cond_2

    .line 72
    .line 73
    sget-object v3, La/lfa0;->a:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    aget-object v0, v0, v2

    .line 76
    .line 77
    invoke-virtual {v4, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget-object v2, La/lfa0;->a:Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    :cond_2
    iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 90
    .line 91
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->l1:Landroid/view/View;

    .line 2
    .line 3
    instance-of v1, v0, Landroidx/compose/ui/platform/ComposeView;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Landroidx/compose/ui/platform/ComposeView;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/x1;->e()V

    .line 14
    .line 15
    .line 16
    :cond_1
    invoke-super {p0}, La/yx5;->Z()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ka9;->K1:Z

    .line 2
    .line 3
    return p0
.end method
