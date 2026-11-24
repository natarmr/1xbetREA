.class public final La/sxz;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/sxz;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/xuz",
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
.field public static final o2:La/xuz;

.field public static final synthetic p2:[La/iiy;

.field public static final q2:Ljava/lang/String;


# instance fields
.field public final k2:La/a8z;

.field public final l2:La/a8z;

.field public final m2:La/yzn0;

.field public final n2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/sxz;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/limits_kenya/impl/presentation/limits_main_screen/models/LimitsKenyaBottomSheetScreenParams;"

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
    sput-object v3, La/sxz;->p2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/xuz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/sxz;->o2:La/xuz;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/sxz;->q2:Ljava/lang/String;

    .line 44
    .line 45
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/rxz;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/rxz;-><init>(La/sxz;B)V

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
    iput-object v0, p0, La/sxz;->k2:La/a8z;

    .line 17
    .line 18
    const-class v0, La/yxz;

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
    new-instance v1, La/rxz;

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    invoke-direct {v1, p0, v2}, La/rxz;-><init>(La/sxz;B)V

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
    iput-object v0, p0, La/sxz;->l2:La/a8z;

    .line 40
    .line 41
    new-instance v0, La/yzn0;

    .line 42
    .line 43
    sget-object v1, La/sxz;->q2:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/sxz;->m2:La/yzn0;

    .line 52
    .line 53
    new-instance v0, La/phf0;

    .line 54
    .line 55
    const-string v1, "REQUEST_KEY"

    .line 56
    .line 57
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, La/sxz;->n2:La/phf0;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 13

    .line 1
    const v0, -0x3ffdaf4

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/sxz;->l2:La/a8z;

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
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, La/xxz;

    .line 26
    .line 27
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, La/k3t0;

    .line 32
    .line 33
    invoke-virtual {p1, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    sget-object v4, La/ukd;->a:La/cl5;

    .line 42
    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    if-ne v3, v4, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object v7, p0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    new-instance v5, La/svz;

    .line 51
    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v12, 0x2

    .line 54
    const/4 v6, 0x1

    .line 55
    const-class v8, La/sxz;

    .line 56
    .line 57
    const-string v9, "handleSideEffect"

    .line 58
    .line 59
    const-string v10, "handleSideEffect(Lorg/xplatform/limits_kenya/impl/presentation/limits_main_screen/models/bottom_sheet/LimitsKenyaBottomSheetSideEffect;)V"

    .line 60
    .line 61
    move-object v7, p0

    .line 62
    invoke-direct/range {v5 .. v12}, La/svz;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v3, v5

    .line 69
    :goto_1
    check-cast v3, La/jhy;

    .line 70
    .line 71
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 72
    .line 73
    sget-object p0, La/lkz;->a:La/lkz;

    .line 74
    .line 75
    invoke-static {v3, p1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    invoke-virtual {p1, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    or-int/2addr v2, v3

    .line 88
    const/4 v3, 0x3

    .line 89
    invoke-virtual {p1, v3}, La/fet;->e(I)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    or-int/2addr v2, v5

    .line 94
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    or-int/2addr v2, v5

    .line 99
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    if-nez v2, :cond_2

    .line 104
    .line 105
    if-ne v5, v4, :cond_3

    .line 106
    .line 107
    :cond_2
    new-instance v5, La/khx;

    .line 108
    .line 109
    const/4 v2, 0x0

    .line 110
    invoke-direct {v5, v0, v7, p0, v2}, La/khx;-><init>(La/k3t0;La/sxz;La/pz40;La/yje;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 117
    .line 118
    invoke-static {p1, v7, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 119
    .line 120
    .line 121
    new-instance v6, La/bw5;

    .line 122
    .line 123
    const/4 p0, 0x1

    .line 124
    invoke-static {p0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    new-instance v0, La/p0z;

    .line 129
    .line 130
    const/4 v2, 0x2

    .line 131
    invoke-direct {v0, v1, v2}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    const v2, 0x48538d7b

    .line 135
    .line 136
    .line 137
    invoke-static {v2, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    new-instance v0, La/ngz;

    .line 142
    .line 143
    invoke-direct {v0, v1, v7, v3}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    const v1, 0x7698267d

    .line 147
    .line 148
    .line 149
    invoke-static {v1, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 150
    .line 151
    .line 152
    move-result-object v10

    .line 153
    const/16 v11, 0xa

    .line 154
    .line 155
    const/4 v9, 0x0

    .line 156
    move-object v7, p0

    .line 157
    invoke-direct/range {v6 .. v11}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 158
    .line 159
    .line 160
    const/4 p0, 0x0

    .line 161
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 162
    .line 163
    .line 164
    return-object v6
.end method

.method public final V(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/sik;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/sxz;->k2:La/a8z;

    .line 5
    .line 6
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/rji;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-void
.end method
