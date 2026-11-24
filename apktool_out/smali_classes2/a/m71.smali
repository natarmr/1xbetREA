.class public final La/m71;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/d1j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/m71;",
        "La/yx5;",
        "La/d1j;",
        "<init>",
        "()V",
        "a/rek0",
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
.field public static final e2:La/rek0;

.field public static final synthetic f2:[La/iiy;


# instance fields
.field public final K1:La/wtq;

.field public final L1:La/e9o0;

.field public final M1:La/r34;

.field public final N1:La/cgx0;

.field public final O1:La/cgx0;

.field public final P1:La/cgx0;

.field public final Q1:La/yzn0;

.field public final R1:La/phf0;

.field public final S1:La/r34;

.field public final U1:La/cgx0;

.field public final V1:La/cgx0;

.field public final W1:La/phf0;

.field public final X1:La/n0o0;

.field public final Y1:La/s0r;

.field public Z1:La/fiu0;

.field public a2:La/ii;

.field public b2:La/wdk0;

.field public c2:La/ynb;

.field public final d2:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/m71;

    .line 4
    .line 5
    const-string v2, "gameId"

    .line 6
    .line 7
    const-string v3, "getGameId()J"

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
    const-string v3, "fromMainScreen"

    .line 16
    .line 17
    const-string v5, "getFromMainScreen()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "demoAvailable"

    .line 25
    .line 26
    const-string v6, "getDemoAvailable()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "isDemo"

    .line 34
    .line 35
    const-string v7, "isDemo()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "gameUrl"

    .line 43
    .line 44
    const-string v8, "getGameUrl()Ljava/lang/String;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "lobbyUrl"

    .line 52
    .line 53
    const-string v9, "getLobbyUrl()Ljava/lang/String;"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/ez40;

    .line 59
    .line 60
    const-string v9, "balanceId"

    .line 61
    .line 62
    const-string v10, "getBalanceId()J"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    new-instance v9, La/ez40;

    .line 68
    .line 69
    const-string v10, "bonusGame"

    .line 70
    .line 71
    const-string v11, "getBonusGame()Z"

    .line 72
    .line 73
    invoke-direct {v9, v1, v10, v11, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    new-instance v10, La/ez40;

    .line 77
    .line 78
    const-string v11, "unavailableLoyalty"

    .line 79
    .line 80
    const-string v12, "getUnavailableLoyalty()Z"

    .line 81
    .line 82
    invoke-direct {v10, v1, v11, v12, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 83
    .line 84
    .line 85
    new-instance v11, La/ez40;

    .line 86
    .line 87
    const-string v12, "gameMetricsUid"

    .line 88
    .line 89
    const-string v13, "getGameMetricsUid()Ljava/lang/String;"

    .line 90
    .line 91
    invoke-direct {v11, v1, v12, v13, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 92
    .line 93
    .line 94
    new-instance v12, La/j0d0;

    .line 95
    .line 96
    const-string v13, "viewBinding"

    .line 97
    .line 98
    const-string v14, "getViewBinding()Lorg/xplatform/aggregator/game/impl/databinding/AggregatorGameFragmentBinding;"

    .line 99
    .line 100
    invoke-direct {v12, v1, v13, v14, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 101
    .line 102
    .line 103
    const/16 v1, 0xb

    .line 104
    .line 105
    new-array v1, v1, [La/iiy;

    .line 106
    .line 107
    aput-object v0, v1, v4

    .line 108
    .line 109
    const/4 v0, 0x1

    .line 110
    aput-object v2, v1, v0

    .line 111
    .line 112
    const/4 v0, 0x2

    .line 113
    aput-object v3, v1, v0

    .line 114
    .line 115
    const/4 v0, 0x3

    .line 116
    aput-object v5, v1, v0

    .line 117
    .line 118
    const/4 v0, 0x4

    .line 119
    aput-object v6, v1, v0

    .line 120
    .line 121
    const/4 v0, 0x5

    .line 122
    aput-object v7, v1, v0

    .line 123
    .line 124
    const/4 v0, 0x6

    .line 125
    aput-object v8, v1, v0

    .line 126
    .line 127
    const/4 v0, 0x7

    .line 128
    aput-object v9, v1, v0

    .line 129
    .line 130
    const/16 v0, 0x8

    .line 131
    .line 132
    aput-object v10, v1, v0

    .line 133
    .line 134
    const/16 v0, 0x9

    .line 135
    .line 136
    aput-object v11, v1, v0

    .line 137
    .line 138
    const/16 v0, 0xa

    .line 139
    .line 140
    aput-object v12, v1, v0

    .line 141
    .line 142
    sput-object v1, La/m71;->f2:[La/iiy;

    .line 143
    .line 144
    new-instance v0, La/rek0;

    .line 145
    .line 146
    const/16 v1, 0x10

    .line 147
    .line 148
    invoke-direct {v0, v1}, La/rek0;-><init>(B)V

    .line 149
    .line 150
    .line 151
    sput-object v0, La/m71;->e2:La/rek0;

    .line 152
    .line 153
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0028

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/wtq;->c:La/wtq;

    .line 8
    .line 9
    iput-object v0, p0, La/m71;->K1:La/wtq;

    .line 10
    .line 11
    new-instance v0, La/e9o0;

    .line 12
    .line 13
    sget-object v1, La/bp3;->a:La/bp3;

    .line 14
    .line 15
    const/16 v1, 0x8

    .line 16
    .line 17
    const v2, 0x7f040b5d

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v2, v2, v1}, La/e9o0;-><init>(III)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/m71;->L1:La/e9o0;

    .line 24
    .line 25
    new-instance v0, La/r34;

    .line 26
    .line 27
    const-string v1, "GAME_ID"

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/m71;->M1:La/r34;

    .line 33
    .line 34
    new-instance v0, La/cgx0;

    .line 35
    .line 36
    const-string v1, "FROM_MAIN_SCREEN"

    .line 37
    .line 38
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/m71;->N1:La/cgx0;

    .line 42
    .line 43
    new-instance v0, La/cgx0;

    .line 44
    .line 45
    const-string v1, "DEMO_AVAILABLE"

    .line 46
    .line 47
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/m71;->O1:La/cgx0;

    .line 51
    .line 52
    new-instance v0, La/cgx0;

    .line 53
    .line 54
    const-string v1, "IS_DEMO"

    .line 55
    .line 56
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, La/m71;->P1:La/cgx0;

    .line 60
    .line 61
    new-instance v0, La/yzn0;

    .line 62
    .line 63
    const-string v1, "URL"

    .line 64
    .line 65
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    iput-object v0, p0, La/m71;->Q1:La/yzn0;

    .line 69
    .line 70
    new-instance v0, La/phf0;

    .line 71
    .line 72
    const-string v1, "LOBBY_URL"

    .line 73
    .line 74
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v0, p0, La/m71;->R1:La/phf0;

    .line 78
    .line 79
    new-instance v0, La/r34;

    .line 80
    .line 81
    const-string v1, "BALANCE_ID"

    .line 82
    .line 83
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iput-object v0, p0, La/m71;->S1:La/r34;

    .line 87
    .line 88
    new-instance v0, La/cgx0;

    .line 89
    .line 90
    const-string v1, "BONUS_GAME"

    .line 91
    .line 92
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, La/m71;->U1:La/cgx0;

    .line 96
    .line 97
    new-instance v0, La/cgx0;

    .line 98
    .line 99
    const-string v1, "UNAVAILABLE_LOYALTY"

    .line 100
    .line 101
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iput-object v0, p0, La/m71;->V1:La/cgx0;

    .line 105
    .line 106
    new-instance v0, La/phf0;

    .line 107
    .line 108
    const-string v1, "GAME_UID"

    .line 109
    .line 110
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, La/m71;->W1:La/phf0;

    .line 114
    .line 115
    new-instance v0, La/k71;

    .line 116
    .line 117
    const/16 v1, 0xb

    .line 118
    .line 119
    invoke-direct {v0, p0, v1}, La/k71;-><init>(La/m71;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, p0, La/m71;->X1:La/n0o0;

    .line 127
    .line 128
    sget-object v0, La/l71;->a:La/l71;

    .line 129
    .line 130
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, La/m71;->Y1:La/s0r;

    .line 135
    .line 136
    const-class v0, La/n91;

    .line 137
    .line 138
    sget-object v1, La/sre0;->a:La/tre0;

    .line 139
    .line 140
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v1, La/k71;

    .line 145
    .line 146
    const/16 v2, 0xc

    .line 147
    .line 148
    invoke-direct {v1, p0, v2}, La/k71;-><init>(La/m71;B)V

    .line 149
    .line 150
    .line 151
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iput-object v0, p0, La/m71;->d2:La/a8z;

    .line 156
    .line 157
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, -0x1

    .line 6
    invoke-virtual {p1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, La/agd;->k()La/jg60;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, La/m51;

    .line 22
    .line 23
    const/4 v2, 0x3

    .line 24
    invoke-direct {v1, p0, v2}, La/m51;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0, v1}, La/bdx;->O(La/jg60;La/i0h0;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, La/j71;

    .line 39
    .line 40
    const/4 v3, 0x2

    .line 41
    invoke-direct {v1, p0, v3}, La/j71;-><init>(La/m71;B)V

    .line 42
    .line 43
    .line 44
    const-string v4, "AUTH_DIALOG_CLOSED_RESULT_KEY"

    .line 45
    .line 46
    invoke-virtual {p1, v4, v0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v0, La/j71;

    .line 54
    .line 55
    const/4 v1, 0x4

    .line 56
    invoke-direct {v0, p0, v1}, La/j71;-><init>(La/m71;B)V

    .line 57
    .line 58
    .line 59
    const-string v4, "GAME_CURRENCY_CONVERSATION_REQUEST_KEY"

    .line 60
    .line 61
    invoke-virtual {p1, v4, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, La/k71;

    .line 65
    .line 66
    const/16 v0, 0xa

    .line 67
    .line 68
    invoke-direct {p1, p0, v0}, La/k71;-><init>(La/m71;B)V

    .line 69
    .line 70
    .line 71
    const-string v4, "REQUEST_GAME_URL_ERROR_DIALOG_KEY"

    .line 72
    .line 73
    invoke-static {p0, v4, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 74
    .line 75
    .line 76
    new-instance p1, La/k71;

    .line 77
    .line 78
    const/4 v4, 0x1

    .line 79
    invoke-direct {p1, p0, v4}, La/k71;-><init>(La/m71;B)V

    .line 80
    .line 81
    .line 82
    const-string v5, "REQUEST_NICKNAME_ERROR_DIALOG_KEY"

    .line 83
    .line 84
    invoke-static {p0, v5, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 85
    .line 86
    .line 87
    new-instance p1, La/k71;

    .line 88
    .line 89
    const/16 v5, 0x8

    .line 90
    .line 91
    invoke-direct {p1, p0, v5}, La/k71;-><init>(La/m71;B)V

    .line 92
    .line 93
    .line 94
    const-string v5, "REQUEST_CONVERT_BALANCE_DIALOG_KEY"

    .line 95
    .line 96
    invoke-static {p0, v5, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 97
    .line 98
    .line 99
    new-instance p1, La/k71;

    .line 100
    .line 101
    const/16 v6, 0x9

    .line 102
    .line 103
    invoke-direct {p1, p0, v6}, La/k71;-><init>(La/m71;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v5, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 107
    .line 108
    .line 109
    new-instance p1, La/k71;

    .line 110
    .line 111
    const/16 v5, 0xd

    .line 112
    .line 113
    invoke-direct {p1, p0, v5}, La/k71;-><init>(La/m71;B)V

    .line 114
    .line 115
    .line 116
    const-string v5, "REQUEST_BONUS_BALANCE_ERROR_DIALOG_KEY"

    .line 117
    .line 118
    invoke-static {p0, v5, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 119
    .line 120
    .line 121
    new-instance p1, La/k71;

    .line 122
    .line 123
    const/16 v6, 0xe

    .line 124
    .line 125
    invoke-direct {p1, p0, v6}, La/k71;-><init>(La/m71;B)V

    .line 126
    .line 127
    .line 128
    invoke-static {p0, v5, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 129
    .line 130
    .line 131
    new-instance p1, La/k71;

    .line 132
    .line 133
    invoke-direct {p1, p0, v1}, La/k71;-><init>(La/m71;B)V

    .line 134
    .line 135
    .line 136
    const-string v1, "REQUEST_SHOW_EMPTY_URL_ERROR_DIALOG_KEY"

    .line 137
    .line 138
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 139
    .line 140
    .line 141
    new-instance p1, La/k71;

    .line 142
    .line 143
    invoke-direct {p1, p0, v3}, La/k71;-><init>(La/m71;B)V

    .line 144
    .line 145
    .line 146
    const-string v1, "REQUEST_NETWORK_ERROR_DIALOG_KEY"

    .line 147
    .line 148
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 149
    .line 150
    .line 151
    new-instance p1, La/k71;

    .line 152
    .line 153
    invoke-direct {p1, p0, v2}, La/k71;-><init>(La/m71;B)V

    .line 154
    .line 155
    .line 156
    const-string v1, "ERROR_DIALOG_KEY"

    .line 157
    .line 158
    invoke-static {p0, v1, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 159
    .line 160
    .line 161
    sget-object p1, La/m71;->f2:[La/iiy;

    .line 162
    .line 163
    aget-object p1, p1, v0

    .line 164
    .line 165
    iget-object v0, p0, La/m71;->Y1:La/s0r;

    .line 166
    .line 167
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    check-cast p1, La/iu0;

    .line 175
    .line 176
    iget-object p1, p1, La/iu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 177
    .line 178
    new-instance v0, La/owp0;

    .line 179
    .line 180
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 181
    .line 182
    .line 183
    new-instance v1, La/o00;

    .line 184
    .line 185
    const/16 v2, 0xc

    .line 186
    .line 187
    invoke-direct {v1, p0, v2}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 188
    .line 189
    .line 190
    new-instance p0, La/ugd;

    .line 191
    .line 192
    const v2, 0x6c550ec6

    .line 193
    .line 194
    .line 195
    invoke-direct {p0, v2, v4, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const/4 v1, 0x0

    .line 199
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 200
    .line 201
    .line 202
    return-void
.end method

.method public final C0()V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/i71;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/i71;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/i71;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    new-instance v16, La/n71;

    .line 58
    .line 59
    const/4 v1, 0x0

    .line 60
    sget-object v2, La/m71;->f2:[La/iiy;

    .line 61
    .line 62
    aget-object v1, v2, v1

    .line 63
    .line 64
    iget-object v4, v0, La/m71;->M1:La/r34;

    .line 65
    .line 66
    invoke-virtual {v4, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    const/4 v1, 0x1

    .line 75
    aget-object v1, v2, v1

    .line 76
    .line 77
    iget-object v4, v0, La/m71;->N1:La/cgx0;

    .line 78
    .line 79
    invoke-virtual {v4, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    const/4 v1, 0x2

    .line 88
    aget-object v1, v2, v1

    .line 89
    .line 90
    iget-object v4, v0, La/m71;->O1:La/cgx0;

    .line 91
    .line 92
    invoke-virtual {v4, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    const/4 v1, 0x3

    .line 101
    aget-object v1, v2, v1

    .line 102
    .line 103
    iget-object v4, v0, La/m71;->P1:La/cgx0;

    .line 104
    .line 105
    invoke-virtual {v4, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    const/4 v1, 0x4

    .line 114
    aget-object v1, v2, v1

    .line 115
    .line 116
    iget-object v4, v0, La/m71;->Q1:La/yzn0;

    .line 117
    .line 118
    invoke-virtual {v4, v0, v1}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    move-object v10, v1

    .line 123
    check-cast v10, Ljava/lang/String;

    .line 124
    .line 125
    const/4 v1, 0x5

    .line 126
    aget-object v1, v2, v1

    .line 127
    .line 128
    iget-object v4, v0, La/m71;->R1:La/phf0;

    .line 129
    .line 130
    invoke-virtual {v4, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    const/4 v1, 0x6

    .line 135
    aget-object v1, v2, v1

    .line 136
    .line 137
    iget-object v4, v0, La/m71;->S1:La/r34;

    .line 138
    .line 139
    invoke-virtual {v4, v0, v1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    const/4 v1, 0x7

    .line 144
    aget-object v1, v2, v1

    .line 145
    .line 146
    iget-object v4, v0, La/m71;->U1:La/cgx0;

    .line 147
    .line 148
    invoke-virtual {v4, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    const/16 v1, 0x8

    .line 157
    .line 158
    aget-object v1, v2, v1

    .line 159
    .line 160
    iget-object v4, v0, La/m71;->V1:La/cgx0;

    .line 161
    .line 162
    invoke-virtual {v4, v0, v1}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    const/16 v1, 0x9

    .line 171
    .line 172
    aget-object v1, v2, v1

    .line 173
    .line 174
    iget-object v2, v0, La/m71;->W1:La/phf0;

    .line 175
    .line 176
    invoke-virtual {v2, v0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    move-object/from16 v4, v16

    .line 181
    .line 182
    invoke-direct/range {v4 .. v15}, La/n71;-><init>(JZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZLjava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 186
    .line 187
    .line 188
    move-result-object v17

    .line 189
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    iget-object v13, v3, La/i71;->a:La/us00;

    .line 193
    .line 194
    iget-object v8, v3, La/i71;->b:La/fvt0;

    .line 195
    .line 196
    iget-object v9, v3, La/i71;->c:La/iw20;

    .line 197
    .line 198
    iget-object v6, v3, La/i71;->d:La/d1p;

    .line 199
    .line 200
    iget-object v14, v3, La/i71;->e:La/ih5;

    .line 201
    .line 202
    iget-object v15, v3, La/i71;->f:La/zg;

    .line 203
    .line 204
    iget-object v1, v3, La/i71;->g:La/ii;

    .line 205
    .line 206
    iget-object v2, v3, La/i71;->h:La/wdk0;

    .line 207
    .line 208
    iget-object v4, v3, La/i71;->i:La/ctf0;

    .line 209
    .line 210
    iget-object v5, v3, La/i71;->j:La/duj;

    .line 211
    .line 212
    move-object/from16 v21, v5

    .line 213
    .line 214
    iget-object v5, v3, La/i71;->k:La/cad;

    .line 215
    .line 216
    iget-object v7, v3, La/i71;->l:La/oeg0;

    .line 217
    .line 218
    iget-object v10, v3, La/i71;->m:La/j1q0;

    .line 219
    .line 220
    move-object v11, v7

    .line 221
    iget-object v7, v3, La/i71;->n:La/wsf0;

    .line 222
    .line 223
    move-object/from16 v22, v10

    .line 224
    .line 225
    iget-object v10, v3, La/i71;->o:La/peg0;

    .line 226
    .line 227
    iget-object v12, v3, La/i71;->p:La/ntu;

    .line 228
    .line 229
    move-object/from16 v18, v1

    .line 230
    .line 231
    iget-object v1, v3, La/i71;->y:La/v88;

    .line 232
    .line 233
    move-object/from16 v24, v1

    .line 234
    .line 235
    iget-object v1, v3, La/i71;->q:La/yzn0;

    .line 236
    .line 237
    move-object/from16 v25, v1

    .line 238
    .line 239
    iget-object v1, v3, La/i71;->r:La/ubu;

    .line 240
    .line 241
    move-object/from16 v26, v1

    .line 242
    .line 243
    iget-object v1, v3, La/i71;->s:La/tqx;

    .line 244
    .line 245
    move-object/from16 v27, v1

    .line 246
    .line 247
    iget-object v1, v3, La/i71;->t:La/do20;

    .line 248
    .line 249
    move-object/from16 v28, v1

    .line 250
    .line 251
    iget-object v1, v3, La/i71;->u:La/lrc;

    .line 252
    .line 253
    move-object/from16 v29, v1

    .line 254
    .line 255
    iget-object v1, v3, La/i71;->v:La/iqt;

    .line 256
    .line 257
    move-object/from16 v30, v1

    .line 258
    .line 259
    iget-object v1, v3, La/i71;->w:La/pl1;

    .line 260
    .line 261
    move-object/from16 v31, v1

    .line 262
    .line 263
    iget-object v1, v3, La/i71;->x:La/a6u;

    .line 264
    .line 265
    move-object/from16 v32, v1

    .line 266
    .line 267
    iget-object v1, v3, La/i71;->z:La/gst0;

    .line 268
    .line 269
    move-object/from16 v19, v11

    .line 270
    .line 271
    iget-object v11, v3, La/i71;->A:La/nr00;

    .line 272
    .line 273
    move-object/from16 v23, v12

    .line 274
    .line 275
    iget-object v12, v3, La/i71;->B:La/wsf0;

    .line 276
    .line 277
    iget-object v3, v3, La/i71;->C:La/bzt;

    .line 278
    .line 279
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-object/from16 v20, v4

    .line 301
    .line 302
    new-instance v4, La/h7i;

    .line 303
    .line 304
    move-object/from16 v33, v1

    .line 305
    .line 306
    move-object/from16 v19, v2

    .line 307
    .line 308
    move-object/from16 v34, v3

    .line 309
    .line 310
    invoke-direct/range {v4 .. v34}, La/h7i;-><init>(La/cad;La/d1p;La/wsf0;La/fvt0;La/iw20;La/peg0;La/nr00;La/wsf0;La/us00;La/ih5;La/zg;La/n71;La/i1w0;La/ii;La/wdk0;La/ctf0;La/duj;La/j1q0;La/ntu;La/v88;La/yzn0;La/ubu;La/tqx;La/do20;La/lrc;La/iqt;La/pl1;La/a6u;La/gst0;La/bzt;)V

    .line 311
    .line 312
    .line 313
    move-object/from16 v1, v18

    .line 314
    .line 315
    new-instance v3, La/fiu0;

    .line 316
    .line 317
    iget-object v4, v4, La/h7i;->B:La/n5d0;

    .line 318
    .line 319
    check-cast v4, La/t5i;

    .line 320
    .line 321
    const-class v5, La/n91;

    .line 322
    .line 323
    invoke-static {v5, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    invoke-direct {v3, v4}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 328
    .line 329
    .line 330
    iput-object v3, v0, La/m71;->Z1:La/fiu0;

    .line 331
    .line 332
    iput-object v1, v0, La/m71;->a2:La/ii;

    .line 333
    .line 334
    iput-object v2, v0, La/m71;->b2:La/wdk0;

    .line 335
    .line 336
    iget-object v1, v10, La/peg0;->b:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v1, La/yzn0;

    .line 339
    .line 340
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    iput-object v1, v0, La/m71;->c2:La/ynb;

    .line 348
    .line 349
    return-void

    .line 350
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 351
    .line 352
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    return-void
.end method

.method public final G0(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_4

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/ani0;

    .line 16
    .line 17
    invoke-direct {v1, v0}, La/ani0;-><init>(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v2, 0x23

    .line 23
    .line 24
    if-lt v0, v2, :cond_0

    .line 25
    .line 26
    new-instance v0, La/bjv0;

    .line 27
    .line 28
    invoke-direct {v0, p0, v1}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v2, 0x1e

    .line 33
    .line 34
    if-lt v0, v2, :cond_1

    .line 35
    .line 36
    new-instance v0, La/ajv0;

    .line 37
    .line 38
    invoke-direct {v0, p0, v1}, La/ajv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/16 v2, 0x1a

    .line 43
    .line 44
    if-lt v0, v2, :cond_2

    .line 45
    .line 46
    new-instance v0, La/ziv0;

    .line 47
    .line 48
    invoke-direct {v0, p0, v1}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    new-instance v0, La/yiv0;

    .line 53
    .line 54
    invoke-direct {v0, p0, v1}, La/yiv0;-><init>(Landroid/view/Window;La/ani0;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    const/4 v1, 0x2

    .line 58
    invoke-virtual {v0, v1}, La/ycm0;->x(I)V

    .line 59
    .line 60
    .line 61
    const/16 v1, 0x200

    .line 62
    .line 63
    const/16 v2, 0x207

    .line 64
    .line 65
    if-eqz p1, :cond_3

    .line 66
    .line 67
    invoke-virtual {v0, v2}, La/ycm0;->s(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    invoke-virtual {v0, v2}, La/ycm0;->y(I)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v1}, Landroid/view/Window;->clearFlags(I)V

    .line 78
    .line 79
    .line 80
    :cond_4
    return-void
.end method

.method public final H0()La/ii;
    .locals 0

    .line 1
    iget-object p0, p0, La/m71;->a2:La/ii;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "actionDialogManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final I0()La/wdk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m71;->b2:La/wdk0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "snackBarManager"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final J0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m71;->d2:La/a8z;

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
    .locals 2

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p1, p1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 9
    .line 10
    invoke-virtual {p1}, La/pmi;->p()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 22
    .line 23
    invoke-virtual {p0}, La/pmi;->p()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance p1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    instance-of v1, v0, La/of80;

    .line 54
    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result p0

    .line 65
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->listIterator(I)Ljava/util/ListIterator;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :cond_2
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_3

    .line 74
    .line 75
    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    move-object v0, p1

    .line 80
    check-cast v0, La/of80;

    .line 81
    .line 82
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const/4 p1, 0x0

    .line 90
    :goto_1
    check-cast p1, La/of80;

    .line 91
    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    const/4 v0, 0x1

    .line 96
    invoke-virtual {p1, p0, p0, v0}, La/sik;->z0(ZZZ)V

    .line 97
    .line 98
    .line 99
    :cond_4
    return-void
.end method

.method public final Y()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "REQUEST_KEY_CLOSE_GAME"

    .line 10
    .line 11
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v1, "GAME_CLOSED_KEY"

    .line 19
    .line 20
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v0, v2, v1}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p0, v0}, La/m71;->G0(Z)V

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 33
    .line 34
    return-void
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "AUTH_DIALOG_CLOSED_RESULT_KEY"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, La/yx5;->Z()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final d0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/a71;->a:La/a71;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/c71;->a:La/c71;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final g0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v1, La/d71;

    .line 15
    .line 16
    invoke-direct {v1, v0}, La/d71;-><init>(Landroid/content/Context;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/m71;->J0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/e71;->a:La/e71;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final i()La/wtq;
    .locals 0

    .line 1
    iget-object p0, p0, La/m71;->K1:La/wtq;

    .line 2
    .line 3
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/m71;->L1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
