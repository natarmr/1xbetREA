.class public final La/uu0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/uu0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/gfk0",
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
.field public static final o2:La/gfk0;

.field public static final synthetic p2:[La/iiy;


# instance fields
.field public final k2:La/phf0;

.field public final l2:La/phf0;

.field public m2:La/fiu0;

.field public final n2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/uu0;

    .line 4
    .line 5
    const-string v2, "gameName"

    .line 6
    .line 7
    const-string v3, "getGameName()Ljava/lang/String;"

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
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

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
    sput-object v1, La/uu0;->p2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gfk0;

    .line 33
    .line 34
    const/16 v1, 0xe

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/gfk0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/uu0;->o2:La/gfk0;

    .line 40
    .line 41
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
    const-string v1, "GAME_NAME_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/uu0;->k2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "GAME_MODE_REQUEST_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/uu0;->l2:La/phf0;

    .line 21
    .line 22
    const-class v0, La/zu0;

    .line 23
    .line 24
    sget-object v1, La/sre0;->a:La/tre0;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, La/nc;

    .line 31
    .line 32
    const/16 v2, 0xe

    .line 33
    .line 34
    invoke-direct {v1, p0, v2}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/uu0;->n2:La/a8z;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, 0x39ff58bc

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/uu0;->n2:La/a8z;

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
    new-instance v5, La/t90;

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    const/16 v12, 0x11

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const-class v8, La/uu0;

    .line 39
    .line 40
    const-string v9, "handleSideEffects"

    .line 41
    .line 42
    const-string v10, "handleSideEffects(Lorg/xplatform/aggregator/game/impl/game/presentation/models/AggregatorGameModePickerSideEffect;)V"

    .line 43
    .line 44
    move-object v7, p0

    .line 45
    invoke-direct/range {v5 .. v12}, La/t90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

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
    new-instance v3, La/ee0;

    .line 91
    .line 92
    const/4 v2, 0x0

    .line 93
    invoke-direct {v3, v1, v7, p0, v2}, La/ee0;-><init>(La/k3t0;La/uu0;La/pz40;La/yje;)V

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
    new-instance v0, La/bw5;

    .line 117
    .line 118
    const/4 v1, 0x1

    .line 119
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    new-instance v2, La/v7i0;

    .line 124
    .line 125
    const/4 v3, 0x2

    .line 126
    invoke-direct {v2, p0, v3}, La/v7i0;-><init>(La/l7m0;B)V

    .line 127
    .line 128
    .line 129
    const v3, -0x750df155

    .line 130
    .line 131
    .line 132
    invoke-static {v3, v2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    new-instance v2, La/ri1;

    .line 137
    .line 138
    const/16 v4, 0x12

    .line 139
    .line 140
    invoke-direct {v2, p0, v7, v4}, La/ri1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 141
    .line 142
    .line 143
    const p0, 0x15a7bcad

    .line 144
    .line 145
    .line 146
    invoke-static {p0, v2, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    const/4 v2, 0x0

    .line 151
    const/4 v4, 0x0

    .line 152
    invoke-direct/range {v0 .. v5}, La/bw5;-><init>(La/cw5;La/xdr;La/xdr;La/xdr;La/ugd;)V

    .line 153
    .line 154
    .line 155
    const/4 p0, 0x0

    .line 156
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 157
    .line 158
    .line 159
    return-object v0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 6

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
    const-class v1, La/tu0;

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
    instance-of v3, v0, La/tu0;

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
    check-cast v2, La/tu0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/uu0;->p2:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/uu0;->k2:La/phf0;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v1, v2, La/tu0;->b:La/ctf0;

    .line 70
    .line 71
    iget-object v3, v2, La/tu0;->c:La/iqt;

    .line 72
    .line 73
    iget-object v4, v2, La/tu0;->a:La/cad;

    .line 74
    .line 75
    iget-object v2, v2, La/tu0;->d:La/kc60;

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v5, La/esg0;

    .line 81
    .line 82
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object v0, v5, La/esg0;->a:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object v1, v5, La/esg0;->b:Ljava/lang/Object;

    .line 88
    .line 89
    iput-object v3, v5, La/esg0;->c:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object v4, v5, La/esg0;->d:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object v2, v5, La/esg0;->e:Ljava/lang/Object;

    .line 94
    .line 95
    new-instance v0, La/t5i;

    .line 96
    .line 97
    const/16 v1, 0xf

    .line 98
    .line 99
    invoke-direct {v0, v5, v1}, La/t5i;-><init>(Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    iput-object v0, v5, La/esg0;->f:Ljava/lang/Object;

    .line 103
    .line 104
    new-instance v0, La/fiu0;

    .line 105
    .line 106
    iget-object v1, v5, La/esg0;->f:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v1, La/t5i;

    .line 109
    .line 110
    const-class v2, La/zu0;

    .line 111
    .line 112
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 117
    .line 118
    .line 119
    iput-object v0, p0, La/uu0;->m2:La/fiu0;

    .line 120
    .line 121
    invoke-super {p0, p1}, La/sik;->W(Landroid/os/Bundle;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 126
    .line 127
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/sik;->onDismiss(Landroid/content/DialogInterface;)V

    .line 5
    .line 6
    .line 7
    sget-object p1, La/uu0;->p2:[La/iiy;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    aget-object p1, p1, v0

    .line 11
    .line 12
    iget-object v0, p0, La/uu0;->l2:La/phf0;

    .line 13
    .line 14
    invoke-virtual {v0, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v0, Lkotlin/Pair;

    .line 19
    .line 20
    const-string v1, "RESULT_GAME_MODE_DISMISS_KEY"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0, p0, p1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
