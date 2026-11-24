.class public final La/wb8;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/wb8;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/kj5",
        "La/dc8;",
        "state",
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
.field public static final n2:La/kj5;

.field public static final synthetic o2:[La/iiy;

.field public static final p2:Ljava/lang/String;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/a8z;

.field public final m2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/wb8;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v2, La/wb8;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/kj5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/wb8;->n2:La/kj5;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/wb8;->p2:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/ec8;

    .line 5
    .line 6
    sget-object v1, La/sre0;->a:La/tre0;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, La/vb8;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/wb8;->l2:La/a8z;

    .line 23
    .line 24
    new-instance v0, La/khf0;

    .line 25
    .line 26
    const-string v1, "BONUS_ACCOUNT_SCREEN_PARAMS"

    .line 27
    .line 28
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/wb8;->m2:La/khf0;

    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, 0xbe170b5

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/wb8;->l2:La/a8z;

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
    check-cast v1, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v3, v0

    .line 26
    check-cast v3, La/k3t0;

    .line 27
    .line 28
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v4, 0x3

    .line 37
    sget-object v5, La/ukd;->a:La/cl5;

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    if-ne v2, v5, :cond_1

    .line 42
    .line 43
    :cond_0
    new-instance v2, La/d38;

    .line 44
    .line 45
    invoke-direct {v2, p0, v4}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 52
    .line 53
    sget-object v0, La/or00;->a:La/zfn;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, La/clz;

    .line 60
    .line 61
    sget-object v6, La/lkz;->a:La/lkz;

    .line 62
    .line 63
    invoke-static {v2, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {p1, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    or-int/2addr v6, v7

    .line 76
    invoke-virtual {p1, v4}, La/fet;->e(I)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    or-int/2addr v4, v6

    .line 81
    invoke-virtual {p1, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    or-int/2addr v4, v6

    .line 86
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    if-nez v4, :cond_2

    .line 91
    .line 92
    if-ne v6, v5, :cond_3

    .line 93
    .line 94
    :cond_2
    move-object v5, v2

    .line 95
    goto :goto_0

    .line 96
    :cond_3
    move-object v4, v0

    .line 97
    goto :goto_1

    .line 98
    :goto_0
    new-instance v2, La/pc;

    .line 99
    .line 100
    const/4 v6, 0x0

    .line 101
    const/4 v7, 0x3

    .line 102
    move-object v4, v0

    .line 103
    invoke-direct/range {v2 .. v7}, La/pc;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v6, v2

    .line 110
    :goto_1
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 111
    .line 112
    invoke-static {p1, v4, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    new-instance v7, La/bw5;

    .line 116
    .line 117
    const/4 v0, 0x1

    .line 118
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 119
    .line 120
    .line 121
    move-result-object v8

    .line 122
    new-instance v0, La/v7i0;

    .line 123
    .line 124
    const/16 v2, 0xc

    .line 125
    .line 126
    invoke-direct {v0, v1, v2}, La/v7i0;-><init>(La/l7m0;B)V

    .line 127
    .line 128
    .line 129
    const v2, -0x26ba875a

    .line 130
    .line 131
    .line 132
    invoke-static {v2, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 133
    .line 134
    .line 135
    move-result-object v9

    .line 136
    new-instance v0, La/ab4;

    .line 137
    .line 138
    const/16 v2, 0x8

    .line 139
    .line 140
    invoke-direct {v0, p0, v1, v2}, La/ab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 141
    .line 142
    .line 143
    const p0, -0x5aba751c

    .line 144
    .line 145
    .line 146
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 147
    .line 148
    .line 149
    move-result-object v11

    .line 150
    const/16 v12, 0xa

    .line 151
    .line 152
    const/4 v10, 0x0

    .line 153
    invoke-direct/range {v7 .. v12}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 154
    .line 155
    .line 156
    const/4 p0, 0x0

    .line 157
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 158
    .line 159
    .line 160
    return-object v7
.end method

.method public final V(Landroid/content/Context;)V
    .locals 3

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
    const-class v0, La/yb8;

    .line 25
    .line 26
    if-eqz p1, :cond_3

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
    instance-of v2, p1, La/yb8;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    check-cast v1, La/yb8;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    sget-object p1, La/wb8;->o2:[La/iiy;

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    aget-object p1, p1, v0

    .line 62
    .line 63
    iget-object v0, p0, La/wb8;->m2:La/khf0;

    .line 64
    .line 65
    invoke-virtual {v0, p0, p1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    check-cast p1, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;

    .line 70
    .line 71
    iget-object v0, v1, La/yb8;->a:La/cad;

    .line 72
    .line 73
    iget-object v1, v1, La/yb8;->b:La/ctf0;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v2, La/mii0;

    .line 79
    .line 80
    invoke-direct {v2, v0, p1, v1}, La/mii0;-><init>(La/cad;Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;La/ctf0;)V

    .line 81
    .line 82
    .line 83
    new-instance p1, La/fiu0;

    .line 84
    .line 85
    iget-object v0, v2, La/mii0;->e:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, La/n8i;

    .line 88
    .line 89
    const-class v1, La/ec8;

    .line 90
    .line 91
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 96
    .line 97
    .line 98
    iput-object p1, p0, La/wb8;->k2:La/fiu0;

    .line 99
    .line 100
    return-void

    .line 101
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 102
    .line 103
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method
