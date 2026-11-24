.class public final La/s6p;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/s6p;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/pek",
        "La/f7p;",
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
.field public static final o2:La/pek;

.field public static final synthetic p2:[La/iiy;

.field public static final q2:Ljava/lang/String;


# instance fields
.field public final k2:La/phf0;

.field public final l2:La/yzn0;

.field public final m2:La/a8z;

.field public final n2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/s6p;

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
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "type"

    .line 16
    .line 17
    const-string v5, "getType()Lorg/xplatform/favorites/impl/presentation/clear/presentation/models/FavoritesClearType;"

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
    sput-object v3, La/s6p;->p2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/pek;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/s6p;->o2:La/pek;

    .line 38
    .line 39
    sget-object v0, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, La/s6p;->q2:Ljava/lang/String;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "BUNDLE_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/s6p;->k2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/yzn0;

    .line 14
    .line 15
    const-string v1, "BUNDLE_LIST_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/s6p;->l2:La/yzn0;

    .line 21
    .line 22
    new-instance v0, La/q6p;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, p0, v1}, La/q6p;-><init>(La/s6p;B)V

    .line 26
    .line 27
    .line 28
    sget-object v2, La/wez;->b:La/wez;

    .line 29
    .line 30
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/s6p;->m2:La/a8z;

    .line 35
    .line 36
    new-instance v0, La/q6p;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {v0, p0, v3}, La/q6p;-><init>(La/s6p;B)V

    .line 40
    .line 41
    .line 42
    new-instance v4, La/jfl;

    .line 43
    .line 44
    const/16 v5, 0xd

    .line 45
    .line 46
    invoke-direct {v4, p0, v5}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance v5, La/jfl;

    .line 50
    .line 51
    const/16 v6, 0xe

    .line 52
    .line 53
    invoke-direct {v5, v4, v6}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v5}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-class v4, La/h7p;

    .line 61
    .line 62
    sget-object v5, La/sre0;->a:La/tre0;

    .line 63
    .line 64
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    new-instance v5, La/r6p;

    .line 69
    .line 70
    invoke-direct {v5, v2, v1}, La/r6p;-><init>(La/a8z;B)V

    .line 71
    .line 72
    .line 73
    new-instance v1, La/r6p;

    .line 74
    .line 75
    invoke-direct {v1, v2, v3}, La/r6p;-><init>(La/a8z;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p0, v4, v5, v1, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, La/s6p;->n2:La/kiu0;

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, -0x389d9b7d

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/s6p;->n2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/h7p;

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
    new-instance v5, La/k4p;

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    const/4 v12, 0x6

    .line 36
    const/4 v6, 0x1

    .line 37
    const-class v8, La/s6p;

    .line 38
    .line 39
    const-string v9, "handleSideEffect"

    .line 40
    .line 41
    const-string v10, "handleSideEffect(Lorg/xplatform/favorites/impl/presentation/clear/presentation/models/FavoriteClearSideEffect;)V"

    .line 42
    .line 43
    move-object v7, p0

    .line 44
    invoke-direct/range {v5 .. v12}, La/k4p;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move-object v3, v5

    .line 51
    :goto_1
    check-cast v3, La/jhy;

    .line 52
    .line 53
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 54
    .line 55
    sget p0, La/h7p;->r:I

    .line 56
    .line 57
    sget-object p0, La/lkz;->a:La/lkz;

    .line 58
    .line 59
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-virtual {p1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    or-int/2addr v2, v3

    .line 72
    const/4 v3, 0x3

    .line 73
    invoke-virtual {p1, v3}, La/fet;->e(I)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    or-int/2addr v2, v3

    .line 78
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    or-int/2addr v2, v3

    .line 83
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-nez v2, :cond_2

    .line 88
    .line 89
    if-ne v3, v4, :cond_3

    .line 90
    .line 91
    :cond_2
    new-instance v3, La/g6g;

    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    invoke-direct {v3, v1, v7, p0, v2}, La/g6g;-><init>(La/k3t0;La/s6p;La/pz40;La/yje;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 101
    .line 102
    invoke-static {p1, v7, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    check-cast p0, La/h7p;

    .line 110
    .line 111
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const/4 v0, 0x1

    .line 116
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    new-instance v1, La/bw5;

    .line 121
    .line 122
    sget-object v3, La/x8f;->b:La/ugd;

    .line 123
    .line 124
    new-instance v4, La/p6p;

    .line 125
    .line 126
    const/4 v8, 0x0

    .line 127
    invoke-direct {v4, v7, p0, v8}, La/p6p;-><init>(La/s6p;La/pz40;B)V

    .line 128
    .line 129
    .line 130
    const v5, 0x2204f53a

    .line 131
    .line 132
    .line 133
    invoke-static {v5, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    new-instance v5, La/p6p;

    .line 138
    .line 139
    invoke-direct {v5, v7, p0, v0}, La/p6p;-><init>(La/s6p;La/pz40;B)V

    .line 140
    .line 141
    .line 142
    const p0, -0x799bb88c

    .line 143
    .line 144
    .line 145
    invoke-static {p0, v5, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    const/4 v6, 0x2

    .line 150
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1, v8}, La/fet;->r(Z)V

    .line 154
    .line 155
    .line 156
    return-object v1
.end method
