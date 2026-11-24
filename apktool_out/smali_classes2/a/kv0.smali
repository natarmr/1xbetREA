.class public final La/kv0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/kv0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/hfk0",
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
.field public static final n2:La/hfk0;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/phf0;

.field public l2:La/fiu0;

.field public final m2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/kv0;

    .line 4
    .line 5
    const-string v2, "requestKey"

    .line 6
    .line 7
    const-string v3, "getRequestKey()Ljava/lang/String;"

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
    sput-object v1, La/kv0;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/hfk0;

    .line 21
    .line 22
    const/16 v1, 0xe

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/hfk0;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/kv0;->n2:La/hfk0;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "GAME_NICKNAME_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/kv0;->k2:La/phf0;

    .line 12
    .line 13
    const-class v0, La/pv0;

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
    new-instance v1, La/iv0;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {v1, p0, v2}, La/iv0;-><init>(La/kv0;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, La/kv0;->m2:La/a8z;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 18

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v8, p1

    .line 4
    .line 5
    const v0, -0x748ae224

    .line 6
    .line 7
    .line 8
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, La/kv0;->P0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object v9

    .line 15
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v10, La/ukd;->a:La/cl5;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    if-ne v1, v10, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v6, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    new-instance v0, La/t90;

    .line 33
    .line 34
    const/4 v6, 0x0

    .line 35
    const/16 v7, 0x12

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    const-class v3, La/kv0;

    .line 39
    .line 40
    const-string v4, "handleSideEffects"

    .line 41
    .line 42
    const-string v5, "handleSideEffects(Lorg/xplatform/aggregator/game/impl/game/presentation/models/AggregatorGameNicknameSideEffect;)V"

    .line 43
    .line 44
    invoke-direct/range {v0 .. v7}, La/t90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    move-object v6, v2

    .line 48
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    move-object v1, v0

    .line 52
    :goto_1
    check-cast v1, La/jhy;

    .line 53
    .line 54
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 55
    .line 56
    sget-object v0, La/lkz;->a:La/lkz;

    .line 57
    .line 58
    invoke-static {v1, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {v8, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    or-int/2addr v1, v2

    .line 71
    const/4 v7, 0x3

    .line 72
    invoke-virtual {v8, v7}, La/fet;->e(I)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    or-int/2addr v1, v2

    .line 77
    invoke-virtual {v8, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    or-int/2addr v1, v2

    .line 82
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-nez v1, :cond_2

    .line 87
    .line 88
    if-ne v2, v10, :cond_3

    .line 89
    .line 90
    :cond_2
    new-instance v2, La/ee0;

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    invoke-direct {v2, v9, v6, v0, v1}, La/ee0;-><init>(La/k3t0;La/kv0;La/pz40;La/yje;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 100
    .line 101
    invoke-static {v8, v6, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v6}, La/kv0;->P0()La/k3t0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, La/i3t0;

    .line 109
    .line 110
    invoke-virtual {v0, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 111
    .line 112
    .line 113
    move-result-object v9

    .line 114
    invoke-virtual {v8, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    const/4 v11, 0x1

    .line 123
    if-nez v0, :cond_4

    .line 124
    .line 125
    if-ne v1, v10, :cond_5

    .line 126
    .line 127
    :cond_4
    new-instance v1, La/iv0;

    .line 128
    .line 129
    invoke-direct {v1, v6, v11}, La/iv0;-><init>(La/kv0;B)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_5
    move-object v0, v1

    .line 136
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    const/4 v5, 0x6

    .line 140
    const/4 v1, 0x0

    .line 141
    const/4 v2, 0x0

    .line 142
    move-object v3, v8

    .line 143
    invoke-static/range {v0 .. v5}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 144
    .line 145
    .line 146
    new-instance v12, La/bw5;

    .line 147
    .line 148
    invoke-static {v11, v3}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 149
    .line 150
    .line 151
    move-result-object v13

    .line 152
    new-instance v0, La/v7i0;

    .line 153
    .line 154
    invoke-direct {v0, v9, v7}, La/v7i0;-><init>(La/l7m0;B)V

    .line 155
    .line 156
    .line 157
    const v1, -0x17a9dcb5

    .line 158
    .line 159
    .line 160
    invoke-static {v1, v0, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 161
    .line 162
    .line 163
    move-result-object v14

    .line 164
    new-instance v0, La/ri1;

    .line 165
    .line 166
    const/16 v1, 0x13

    .line 167
    .line 168
    invoke-direct {v0, v9, v6, v1}, La/ri1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 169
    .line 170
    .line 171
    const v1, -0x7e78ddb3

    .line 172
    .line 173
    .line 174
    invoke-static {v1, v0, v3}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 175
    .line 176
    .line 177
    move-result-object v16

    .line 178
    const/16 v17, 0x8

    .line 179
    .line 180
    const/4 v15, 0x0

    .line 181
    invoke-direct/range {v12 .. v17}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 182
    .line 183
    .line 184
    const/4 v0, 0x0

    .line 185
    invoke-virtual {v3, v0}, La/fet;->r(Z)V

    .line 186
    .line 187
    .line 188
    return-object v12
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kv0;->m2:La/a8z;

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
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

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
    const-class v1, La/hv0;

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
    instance-of v3, v0, La/hv0;

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
    check-cast v2, La/hv0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, v2, La/hv0;->a:La/cad;

    .line 56
    .line 57
    iget-object v1, v2, La/hv0;->b:La/ctf0;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v2, La/nr;

    .line 63
    .line 64
    invoke-direct {v2, v0, v1}, La/nr;-><init>(La/cad;La/ctf0;)V

    .line 65
    .line 66
    .line 67
    new-instance v0, La/fiu0;

    .line 68
    .line 69
    iget-object v1, v2, La/nr;->d:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v1, La/t5i;

    .line 72
    .line 73
    const-class v2, La/pv0;

    .line 74
    .line 75
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 80
    .line 81
    .line 82
    iput-object v0, p0, La/kv0;->l2:La/fiu0;

    .line 83
    .line 84
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 89
    .line 90
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v0, "RESULT_GAME_NICKNAME_DISMISS_KEY"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    sget-object v0, La/kv0;->o2:[La/iiy;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    aget-object v0, v0, v1

    .line 22
    .line 23
    iget-object v1, p0, La/kv0;->k2:La/phf0;

    .line 24
    .line 25
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
