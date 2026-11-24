.class public final La/qhz;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/qhz;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/gst",
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
.field public static final l2:La/gst;

.field public static final synthetic m2:[La/iiy;


# instance fields
.field public final k2:La/khf0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/qhz;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;"

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
    sput-object v1, La/qhz;->m2:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gst;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/qhz;->l2:La/gst;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/khf0;

    .line 5
    .line 6
    const-string v1, "params_key"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/qhz;->k2:La/khf0;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 10

    .line 1
    const v0, -0x299fbd99

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/qhz;->m2:[La/iiy;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aget-object v2, v0, v1

    .line 11
    .line 12
    iget-object v3, p0, La/qhz;->k2:La/khf0;

    .line 13
    .line 14
    invoke-virtual {v3, p0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;

    .line 19
    .line 20
    iget-object v2, v2, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;->a:Ljava/util/List;

    .line 21
    .line 22
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    aget-object v0, v0, v1

    .line 27
    .line 28
    invoke-virtual {v3, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;

    .line 33
    .line 34
    iget v7, v0, Lorg/xplatform/cyber/section/impl/leaderboard/presentation/dialogs/time_filter/LeaderboardTimeFilterModelParams;->b:I

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v7}, La/fet;->e(I)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    sget-object v3, La/ukd;->a:La/cl5;

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    if-ne v2, v3, :cond_1

    .line 52
    .line 53
    :cond_0
    new-instance v0, La/ohz;

    .line 54
    .line 55
    sget-object v2, La/lak0;->c:La/lak0;

    .line 56
    .line 57
    invoke-direct {v0, v2}, La/ohz;-><init>(Ljava/util/List;)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    move-object v6, v2

    .line 68
    check-cast v6, La/pz40;

    .line 69
    .line 70
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    invoke-virtual {p1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-virtual {p1, v7}, La/fet;->e(I)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    or-int/2addr v2, v4

    .line 81
    invoke-virtual {p1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    or-int/2addr v2, v4

    .line 86
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    if-nez v2, :cond_2

    .line 91
    .line 92
    if-ne v4, v3, :cond_3

    .line 93
    .line 94
    :cond_2
    new-instance v4, La/mc0;

    .line 95
    .line 96
    const/4 v9, 0x6

    .line 97
    const/4 v8, 0x0

    .line 98
    invoke-direct/range {v4 .. v9}, La/mc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILa/yje;B)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 105
    .line 106
    invoke-static {p1, v0, v4}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/ohz;

    .line 114
    .line 115
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-ne v2, v3, :cond_4

    .line 120
    .line 121
    new-instance v2, La/ebz;

    .line 122
    .line 123
    const/16 v3, 0xd

    .line 124
    .line 125
    invoke-direct {v2, p0, v3}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 132
    .line 133
    const/4 p0, 0x3

    .line 134
    invoke-static {v1, v1, p1, v1, p0}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    new-instance v3, La/bw5;

    .line 139
    .line 140
    const/4 v4, 0x1

    .line 141
    invoke-static {v4, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    sget-object v5, La/vbw0;->c:La/ugd;

    .line 146
    .line 147
    new-instance v6, La/eyn;

    .line 148
    .line 149
    const/16 v7, 0xf

    .line 150
    .line 151
    invoke-direct {v6, p0, v0, v2, v7}, La/eyn;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    const p0, 0x518a4196

    .line 155
    .line 156
    .line 157
    invoke-static {p0, v6, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    const/16 v8, 0xa

    .line 162
    .line 163
    const/4 v6, 0x0

    .line 164
    invoke-direct/range {v3 .. v8}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v1}, La/fet;->r(Z)V

    .line 168
    .line 169
    .line 170
    return-object v3
.end method
