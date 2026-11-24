.class public final La/cr4;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/cr4;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/pek0",
        "La/fr4;",
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
.field public static final n2:La/pek0;

.field public static final synthetic o2:[La/iiy;

.field public static final p2:Ljava/lang/String;


# instance fields
.field public final k2:La/phf0;

.field public final l2:La/a8z;

.field public final m2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/cr4;

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
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v2, v4

    .line 17
    .line 18
    sput-object v2, La/cr4;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/pek0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/cr4;->n2:La/pek0;

    .line 26
    .line 27
    sget-object v0, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, La/cr4;->p2:Ljava/lang/String;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "KEY_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/cr4;->k2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/br4;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, La/br4;-><init>(La/cr4;B)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wez;->b:La/wez;

    .line 20
    .line 21
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/cr4;->l2:La/a8z;

    .line 26
    .line 27
    new-instance v0, La/br4;

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    invoke-direct {v0, p0, v2}, La/br4;-><init>(La/cr4;B)V

    .line 31
    .line 32
    .line 33
    new-instance v2, La/pp4;

    .line 34
    .line 35
    const/4 v3, 0x6

    .line 36
    invoke-direct {v2, p0, v3}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v3, La/pp4;

    .line 40
    .line 41
    const/4 v4, 0x7

    .line 42
    invoke-direct {v3, v2, v4}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-class v2, La/gr4;

    .line 50
    .line 51
    sget-object v3, La/sre0;->a:La/tre0;

    .line 52
    .line 53
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v3, La/t51;

    .line 58
    .line 59
    const/16 v4, 0x1a

    .line 60
    .line 61
    invoke-direct {v3, v1, v4}, La/t51;-><init>(La/a8z;B)V

    .line 62
    .line 63
    .line 64
    new-instance v4, La/t51;

    .line 65
    .line 66
    const/16 v5, 0x1b

    .line 67
    .line 68
    invoke-direct {v4, v1, v5}, La/t51;-><init>(La/a8z;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/cr4;->m2:La/kiu0;

    .line 76
    .line 77
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, -0x1bb7854b

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/cr4;->m2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, La/gr4;

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
    new-instance v5, La/j94;

    .line 33
    .line 34
    const/4 v11, 0x0

    .line 35
    const/16 v12, 0xe

    .line 36
    .line 37
    const/4 v6, 0x1

    .line 38
    const-class v8, La/cr4;

    .line 39
    .line 40
    const-string v9, "handleSideEffect"

    .line 41
    .line 42
    const-string v10, "handleSideEffect(Lorg/xplatform/authenticator/impl/ui/dialogs/options/models/AuthenticatorOptionsSideEffect;)V"

    .line 43
    .line 44
    move-object v7, p0

    .line 45
    invoke-direct/range {v5 .. v12}, La/j94;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

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
    sget p0, La/gr4;->q:I

    .line 57
    .line 58
    sget-object p0, La/lkz;->a:La/lkz;

    .line 59
    .line 60
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    invoke-virtual {p1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    or-int/2addr v2, v3

    .line 73
    const/4 v3, 0x3

    .line 74
    invoke-virtual {p1, v3}, La/fet;->e(I)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    or-int/2addr v2, v5

    .line 79
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    or-int/2addr v2, v5

    .line 84
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    if-nez v2, :cond_2

    .line 89
    .line 90
    if-ne v5, v4, :cond_3

    .line 91
    .line 92
    :cond_2
    new-instance v5, La/ee0;

    .line 93
    .line 94
    const/4 v2, 0x0

    .line 95
    invoke-direct {v5, v1, v7, p0, v2}, La/ee0;-><init>(La/k3t0;La/cr4;La/pz40;La/yje;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 102
    .line 103
    invoke-static {p1, v7, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, La/gr4;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    new-instance v4, La/bw5;

    .line 117
    .line 118
    const/4 v0, 0x1

    .line 119
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    new-instance v0, La/ab4;

    .line 124
    .line 125
    invoke-direct {v0, v7, p0, v3}, La/ab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    const p0, 0x71cfb3a4

    .line 129
    .line 130
    .line 131
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    const/16 v9, 0xe

    .line 136
    .line 137
    const/4 v6, 0x0

    .line 138
    const/4 v7, 0x0

    .line 139
    invoke-direct/range {v4 .. v9}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 140
    .line 141
    .line 142
    const/4 p0, 0x0

    .line 143
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 144
    .line 145
    .line 146
    return-object v4
.end method
