.class public final La/ct00;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ct00;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/atz",
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
.field public static final n2:La/atz;

.field public static final synthetic o2:[La/iiy;

.field public static final p2:Ljava/lang/String;


# instance fields
.field public final k2:La/a8z;

.field public final l2:La/kiu0;

.field public final m2:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ct00;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/personal/api/presentation/model/location_params/LocationChoiceScreenParams;"

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
    sput-object v2, La/ct00;->o2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/atz;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ct00;->n2:La/atz;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/ct00;->p2:Ljava/lang/String;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zs00;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, La/zs00;-><init>(La/ct00;B)V

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
    iput-object v0, p0, La/ct00;->k2:La/a8z;

    .line 17
    .line 18
    new-instance v0, La/zs00;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    invoke-direct {v0, p0, v2}, La/zs00;-><init>(La/ct00;B)V

    .line 22
    .line 23
    .line 24
    new-instance v2, La/be00;

    .line 25
    .line 26
    const/4 v3, 0x5

    .line 27
    invoke-direct {v2, v0, v3}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    new-instance v0, La/be00;

    .line 31
    .line 32
    const/4 v3, 0x6

    .line 33
    invoke-direct {v0, p0, v3}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    new-instance v3, La/be00;

    .line 37
    .line 38
    const/4 v4, 0x7

    .line 39
    invoke-direct {v3, v0, v4}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-class v1, La/nt00;

    .line 47
    .line 48
    sget-object v3, La/sre0;->a:La/tre0;

    .line 49
    .line 50
    invoke-virtual {v3, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v3, La/qwv;

    .line 55
    .line 56
    const/16 v4, 0x1c

    .line 57
    .line 58
    invoke-direct {v3, v0, v4}, La/qwv;-><init>(La/a8z;B)V

    .line 59
    .line 60
    .line 61
    new-instance v4, La/qwv;

    .line 62
    .line 63
    const/16 v5, 0x1d

    .line 64
    .line 65
    invoke-direct {v4, v0, v5}, La/qwv;-><init>(La/a8z;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p0, v1, v3, v4, v2}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/ct00;->l2:La/kiu0;

    .line 73
    .line 74
    new-instance v0, La/yzn0;

    .line 75
    .line 76
    const-string v1, "PARAMS_KEY"

    .line 77
    .line 78
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/ct00;->m2:La/yzn0;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 14

    .line 1
    const v0, -0x7594255d

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, La/ct00;->Q0()La/nt00;

    .line 8
    .line 9
    .line 10
    move-result-object v6

    .line 11
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    sget-object v2, La/ukd;->a:La/cl5;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    if-ne v1, v2, :cond_1

    .line 24
    .line 25
    :cond_0
    new-instance v4, La/o0t;

    .line 26
    .line 27
    const/4 v10, 0x0

    .line 28
    const/16 v11, 0xd

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    const-class v7, La/nt00;

    .line 32
    .line 33
    const-string v8, "onStartActions"

    .line 34
    .line 35
    const-string v9, "onStartActions()V"

    .line 36
    .line 37
    invoke-direct/range {v4 .. v11}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object v1, v4

    .line 44
    :cond_1
    check-cast v1, La/jhy;

    .line 45
    .line 46
    move-object v0, v1

    .line 47
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 48
    .line 49
    invoke-virtual {p0}, La/ct00;->Q0()La/nt00;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    invoke-virtual {p1, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    if-ne v4, v2, :cond_3

    .line 64
    .line 65
    :cond_2
    new-instance v4, La/o0t;

    .line 66
    .line 67
    const/4 v10, 0x0

    .line 68
    const/16 v11, 0xe

    .line 69
    .line 70
    const/4 v5, 0x0

    .line 71
    const-class v7, La/nt00;

    .line 72
    .line 73
    const-string v8, "onStopActions"

    .line 74
    .line 75
    const-string v9, "onStopActions()V"

    .line 76
    .line 77
    invoke-direct/range {v4 .. v11}, La/o0t;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    check-cast v4, La/jhy;

    .line 84
    .line 85
    move-object v1, v4

    .line 86
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 87
    .line 88
    const/4 v4, 0x0

    .line 89
    const/4 v5, 0x4

    .line 90
    const/4 v2, 0x0

    .line 91
    move-object v3, p1

    .line 92
    invoke-static/range {v0 .. v5}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, La/ct00;->Q0()La/nt00;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iget-object v6, v0, La/nt00;->i:La/ol60;

    .line 100
    .line 101
    invoke-virtual {p0}, La/ct00;->Q0()La/nt00;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, La/nt00;->g:La/p7m0;

    .line 106
    .line 107
    new-instance v1, La/kt00;

    .line 108
    .line 109
    sget-object v2, La/lak0;->c:La/lak0;

    .line 110
    .line 111
    const/4 v7, 0x1

    .line 112
    invoke-direct {v1, v2, v7}, La/kt00;-><init>(La/a4x;Z)V

    .line 113
    .line 114
    .line 115
    const/16 v4, 0x30

    .line 116
    .line 117
    const/4 v5, 0x2

    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-static/range {v0 .. v5}, La/ydx;->E(La/gmq;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;La/fet;II)La/pz40;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    new-instance v8, La/bw5;

    .line 124
    .line 125
    invoke-static {v7, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    new-instance v1, La/ngz;

    .line 130
    .line 131
    const/4 v2, 0x5

    .line 132
    invoke-direct {v1, p0, v6, v2}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    const v2, 0x75b88214

    .line 136
    .line 137
    .line 138
    invoke-static {v2, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 139
    .line 140
    .line 141
    move-result-object v10

    .line 142
    new-instance v1, La/ngz;

    .line 143
    .line 144
    const/4 v2, 0x6

    .line 145
    invoke-direct {v1, v0, p0, v2}, La/ngz;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 146
    .line 147
    .line 148
    const p0, 0x42c94552

    .line 149
    .line 150
    .line 151
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    const/16 v13, 0xa

    .line 156
    .line 157
    const/4 v11, 0x0

    .line 158
    invoke-direct/range {v8 .. v13}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 159
    .line 160
    .line 161
    const/4 p0, 0x0

    .line 162
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 163
    .line 164
    .line 165
    return-object v8
.end method

.method public final N0()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/ct00;->Q0()La/nt00;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/nt00;->h:La/ol60;

    .line 6
    .line 7
    new-instance v4, La/kaw;

    .line 8
    .line 9
    const/16 v0, 0x1a

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    invoke-direct {v4, p0, v5, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 13
    .line 14
    .line 15
    sget-object v0, La/lkz;->a:La/lkz;

    .line 16
    .line 17
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v1, La/zd00;

    .line 30
    .line 31
    const/4 v6, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, La/zd00;-><init>(La/gmq;La/clz;La/kaw;La/yje;B)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x3

    .line 36
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final P0()La/ft00;
    .locals 2

    .line 1
    sget-object v0, La/ct00;->o2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/ct00;->m2:La/yzn0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/ft00;

    .line 13
    .line 14
    return-object p0
.end method

.method public final Q0()La/nt00;
    .locals 0

    .line 1
    iget-object p0, p0, La/ct00;->l2:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/nt00;

    .line 8
    .line 9
    return-object p0
.end method
