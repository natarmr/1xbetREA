.class public final La/ox70;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ox70;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/mi70",
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
.field public static final n2:La/mi70;

.field public static final synthetic o2:[La/iiy;


# instance fields
.field public final k2:La/a8z;

.field public final l2:La/a8z;

.field public final m2:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ox70;

    .line 4
    .line 5
    const-string v2, "navigationSource"

    .line 6
    .line 7
    const-string v3, "getNavigationSource()Lorg/xplatform/mailing/api/navigation/models/TelegramBotNavigationSource;"

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
    sput-object v1, La/ox70;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/mi70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ox70;->n2:La/mi70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/nx70;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/nx70;-><init>(La/ox70;B)V

    .line 8
    .line 9
    .line 10
    sget-object v1, La/wez;->b:La/wez;

    .line 11
    .line 12
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, La/ox70;->k2:La/a8z;

    .line 17
    .line 18
    const-class v0, La/cy70;

    .line 19
    .line 20
    sget-object v1, La/sre0;->a:La/tre0;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, La/nx70;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, v2}, La/nx70;-><init>(La/ox70;B)V

    .line 30
    .line 31
    .line 32
    const/16 v2, 0xe

    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, La/ox70;->l2:La/a8z;

    .line 40
    .line 41
    new-instance v0, La/yzn0;

    .line 42
    .line 43
    const-string v1, "TELEGRAM_BOT_NAVIGATION_SOURCE_KEY"

    .line 44
    .line 45
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, La/ox70;->m2:La/yzn0;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, -0xc88502

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/ox70;->P0()La/k3t0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, La/i3t0;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0}, La/ox70;->P0()La/k3t0;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v4, La/ukd;->a:La/cl5;

    .line 30
    .line 31
    if-nez v1, :cond_0

    .line 32
    .line 33
    if-ne v3, v4, :cond_1

    .line 34
    .line 35
    :cond_0
    new-instance v3, La/cd60;

    .line 36
    .line 37
    const/16 v1, 0x16

    .line 38
    .line 39
    invoke-direct {v3, p0, v1}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    :cond_1
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 46
    .line 47
    sget-object v1, La/or00;->a:La/zfn;

    .line 48
    .line 49
    invoke-virtual {p1, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, La/clz;

    .line 54
    .line 55
    sget-object v5, La/lkz;->a:La/lkz;

    .line 56
    .line 57
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-virtual {p1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-virtual {p1, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    or-int/2addr v5, v6

    .line 70
    const/4 v6, 0x3

    .line 71
    invoke-virtual {p1, v6}, La/fet;->e(I)Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    or-int/2addr v5, v6

    .line 76
    invoke-virtual {p1, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    or-int/2addr v5, v6

    .line 81
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    if-nez v5, :cond_2

    .line 86
    .line 87
    if-ne v6, v4, :cond_3

    .line 88
    .line 89
    :cond_2
    move-object v4, v3

    .line 90
    move-object v3, v1

    .line 91
    goto :goto_0

    .line 92
    :cond_3
    move-object v3, v1

    .line 93
    goto :goto_1

    .line 94
    :goto_0
    new-instance v1, La/kc70;

    .line 95
    .line 96
    const/4 v5, 0x0

    .line 97
    const/4 v6, 0x1

    .line 98
    invoke-direct/range {v1 .. v6}, La/kc70;-><init>(La/k3t0;La/clz;La/pz40;La/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    move-object v6, v1

    .line 105
    :goto_1
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 106
    .line 107
    invoke-static {p1, v3, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 108
    .line 109
    .line 110
    const/4 v1, 0x1

    .line 111
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    new-instance v2, La/bw5;

    .line 116
    .line 117
    new-instance v1, La/tft;

    .line 118
    .line 119
    const/4 v4, 0x6

    .line 120
    invoke-direct {v1, v0, v4}, La/tft;-><init>(La/l7m0;B)V

    .line 121
    .line 122
    .line 123
    const v4, 0xa788baf

    .line 124
    .line 125
    .line 126
    invoke-static {v4, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    new-instance v1, La/ngz;

    .line 131
    .line 132
    const/16 v5, 0x1c

    .line 133
    .line 134
    invoke-direct {v1, v0, p0, v5}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    const p0, 0x63c50ce7

    .line 138
    .line 139
    .line 140
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    new-instance p0, La/tft;

    .line 145
    .line 146
    const/4 v1, 0x7

    .line 147
    invoke-direct {p0, v0, v1}, La/tft;-><init>(La/l7m0;B)V

    .line 148
    .line 149
    .line 150
    const v0, -0x6c755b93

    .line 151
    .line 152
    .line 153
    invoke-static {v0, p0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    const/4 v7, 0x2

    .line 158
    invoke-direct/range {v2 .. v7}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 159
    .line 160
    .line 161
    const/4 p0, 0x0

    .line 162
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 163
    .line 164
    .line 165
    return-object v2
.end method

.method public final P0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ox70;->l2:La/a8z;

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

.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ox70;->P0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object p1, La/px70;->a:La/px70;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
