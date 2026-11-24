.class public final La/hu0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/hu0;",
        "La/yx5;",
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
.field public static final Y1:La/rek0;

.field public static final synthetic Z1:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public final L1:La/phf0;

.field public final M1:La/phf0;

.field public final N1:La/phf0;

.field public final O1:La/cgx0;

.field public final P1:La/r34;

.field public final Q1:La/r34;

.field public final R1:La/n0o0;

.field public final S1:La/s0r;

.field public U1:La/fiu0;

.field public V1:La/ii;

.field public W1:La/wdk0;

.field public final X1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/hu0;

    .line 4
    .line 5
    const-string v2, "url"

    .line 6
    .line 7
    const-string v3, "getUrl()Ljava/lang/String;"

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
    const-string v3, "title"

    .line 16
    .line 17
    const-string v5, "getTitle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "lobbyUrl"

    .line 25
    .line 26
    const-string v6, "getLobbyUrl()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "paymentEnabled"

    .line 34
    .line 35
    const-string v7, "getPaymentEnabled()Z"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "balanceId"

    .line 43
    .line 44
    const-string v8, "getBalanceId()J"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "productId"

    .line 52
    .line 53
    const-string v9, "getProductId()J"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/j0d0;

    .line 59
    .line 60
    const-string v9, "viewBinding"

    .line 61
    .line 62
    const-string v10, "getViewBinding()Lorg/xplatform/aggregator/game/impl/databinding/AggregatorGameFragmentBinding;"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    const/4 v1, 0x7

    .line 68
    new-array v1, v1, [La/iiy;

    .line 69
    .line 70
    aput-object v0, v1, v4

    .line 71
    .line 72
    const/4 v0, 0x1

    .line 73
    aput-object v2, v1, v0

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    aput-object v3, v1, v0

    .line 77
    .line 78
    const/4 v0, 0x3

    .line 79
    aput-object v5, v1, v0

    .line 80
    .line 81
    const/4 v0, 0x4

    .line 82
    aput-object v6, v1, v0

    .line 83
    .line 84
    const/4 v0, 0x5

    .line 85
    aput-object v7, v1, v0

    .line 86
    .line 87
    const/4 v0, 0x6

    .line 88
    aput-object v8, v1, v0

    .line 89
    .line 90
    sput-object v1, La/hu0;->Z1:[La/iiy;

    .line 91
    .line 92
    new-instance v0, La/rek0;

    .line 93
    .line 94
    const/16 v1, 0xe

    .line 95
    .line 96
    invoke-direct {v0, v1}, La/rek0;-><init>(B)V

    .line 97
    .line 98
    .line 99
    sput-object v0, La/hu0;->Y1:La/rek0;

    .line 100
    .line 101
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
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v2, v2, v1}, La/e9o0;-><init>(III)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/hu0;->K1:La/e9o0;

    .line 20
    .line 21
    new-instance v0, La/phf0;

    .line 22
    .line 23
    const-string v1, "URL"

    .line 24
    .line 25
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/hu0;->L1:La/phf0;

    .line 29
    .line 30
    new-instance v0, La/phf0;

    .line 31
    .line 32
    const-string v1, "TITLE"

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/hu0;->M1:La/phf0;

    .line 38
    .line 39
    new-instance v0, La/phf0;

    .line 40
    .line 41
    const-string v1, "LOBBY_URL"

    .line 42
    .line 43
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/hu0;->N1:La/phf0;

    .line 47
    .line 48
    new-instance v0, La/cgx0;

    .line 49
    .line 50
    const-string v1, "PAYMENT_ENABLED"

    .line 51
    .line 52
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, La/hu0;->O1:La/cgx0;

    .line 56
    .line 57
    new-instance v0, La/r34;

    .line 58
    .line 59
    const-string v1, "BALANCE_ID"

    .line 60
    .line 61
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, La/hu0;->P1:La/r34;

    .line 65
    .line 66
    new-instance v0, La/r34;

    .line 67
    .line 68
    const-string v1, "PRODUCT_ID"

    .line 69
    .line 70
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iput-object v0, p0, La/hu0;->Q1:La/r34;

    .line 74
    .line 75
    new-instance v0, La/eu0;

    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-direct {v0, p0, v1}, La/eu0;-><init>(La/hu0;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/hu0;->R1:La/n0o0;

    .line 86
    .line 87
    sget-object v0, La/gu0;->a:La/gu0;

    .line 88
    .line 89
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, La/hu0;->S1:La/s0r;

    .line 94
    .line 95
    const-class v0, La/tw0;

    .line 96
    .line 97
    sget-object v1, La/sre0;->a:La/tre0;

    .line 98
    .line 99
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, La/eu0;

    .line 104
    .line 105
    const/4 v2, 0x1

    .line 106
    invoke-direct {v1, p0, v2}, La/eu0;-><init>(La/hu0;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, La/hu0;->X1:La/a8z;

    .line 114
    .line 115
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

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
    new-instance v1, La/t1;

    .line 22
    .line 23
    const/16 v2, 0x18

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0, v1}, La/bdx;->O(La/jg60;La/i0h0;Lkotlin/jvm/functions/Function1;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, La/eu0;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-direct {p1, p0, v0}, La/eu0;-><init>(La/hu0;B)V

    .line 35
    .line 36
    .line 37
    const-string v0, "ERROR_DIALOG_KEY"

    .line 38
    .line 39
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 40
    .line 41
    .line 42
    sget-object p1, La/hu0;->Z1:[La/iiy;

    .line 43
    .line 44
    const/4 v0, 0x6

    .line 45
    aget-object p1, p1, v0

    .line 46
    .line 47
    iget-object v0, p0, La/hu0;->S1:La/s0r;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    check-cast p1, La/iu0;

    .line 57
    .line 58
    iget-object p1, p1, La/iu0;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 59
    .line 60
    new-instance v0, La/owp0;

    .line 61
    .line 62
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 63
    .line 64
    .line 65
    new-instance v1, La/o00;

    .line 66
    .line 67
    const/16 v2, 0xa

    .line 68
    .line 69
    invoke-direct {v1, p0, v2}, La/o00;-><init>(Ljava/lang/Object;B)V

    .line 70
    .line 71
    .line 72
    new-instance p0, La/ugd;

    .line 73
    .line 74
    const v2, -0x3edde3ec

    .line 75
    .line 76
    .line 77
    const/4 v3, 0x1

    .line 78
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const/4 v1, 0x0

    .line 82
    invoke-static {p1, v0, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public final C0()V
    .locals 12

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
    const-class v1, La/wt0;

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
    instance-of v3, v0, La/wt0;

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
    check-cast v2, La/wt0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    new-instance v3, La/bv0;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    sget-object v1, La/hu0;->Z1:[La/iiy;

    .line 59
    .line 60
    aget-object v0, v1, v0

    .line 61
    .line 62
    iget-object v4, p0, La/hu0;->M1:La/phf0;

    .line 63
    .line 64
    invoke-virtual {v4, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    const/4 v0, 0x0

    .line 69
    aget-object v0, v1, v0

    .line 70
    .line 71
    iget-object v5, p0, La/hu0;->L1:La/phf0;

    .line 72
    .line 73
    invoke-virtual {v5, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const/4 v0, 0x2

    .line 78
    aget-object v0, v1, v0

    .line 79
    .line 80
    iget-object v6, p0, La/hu0;->N1:La/phf0;

    .line 81
    .line 82
    invoke-virtual {v6, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    const/4 v0, 0x3

    .line 87
    aget-object v0, v1, v0

    .line 88
    .line 89
    iget-object v7, p0, La/hu0;->O1:La/cgx0;

    .line 90
    .line 91
    invoke-virtual {v7, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    const/4 v0, 0x4

    .line 100
    aget-object v0, v1, v0

    .line 101
    .line 102
    iget-object v8, p0, La/hu0;->P1:La/r34;

    .line 103
    .line 104
    invoke-virtual {v8, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v8

    .line 112
    const/4 v0, 0x5

    .line 113
    aget-object v0, v1, v0

    .line 114
    .line 115
    iget-object v1, p0, La/hu0;->Q1:La/r34;

    .line 116
    .line 117
    invoke-virtual {v1, p0, v0}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 122
    .line 123
    .line 124
    move-result-wide v10

    .line 125
    invoke-direct/range {v3 .. v11}, La/bv0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJ)V

    .line 126
    .line 127
    .line 128
    iget-object v0, v2, La/wt0;->a:La/us00;

    .line 129
    .line 130
    iget-object v1, v2, La/wt0;->b:La/ii;

    .line 131
    .line 132
    iget-object v4, v2, La/wt0;->c:La/wdk0;

    .line 133
    .line 134
    iget-object v5, v2, La/wt0;->d:La/ctf0;

    .line 135
    .line 136
    iget-object v6, v2, La/wt0;->e:La/duj;

    .line 137
    .line 138
    iget-object v7, v2, La/wt0;->f:La/cad;

    .line 139
    .line 140
    iget-object v8, v2, La/wt0;->g:La/oeg0;

    .line 141
    .line 142
    iget-object v9, v2, La/wt0;->h:La/j1q0;

    .line 143
    .line 144
    iget-object v10, v2, La/wt0;->i:La/wsf0;

    .line 145
    .line 146
    iget-object v11, v2, La/wt0;->j:La/bzt;

    .line 147
    .line 148
    iget-object v2, v2, La/wt0;->k:La/r9u;

    .line 149
    .line 150
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    new-instance v2, La/ru;

    .line 169
    .line 170
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    iput-object v0, v2, La/ru;->a:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object v3, v2, La/ru;->c:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v5, v2, La/ru;->e:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v6, v2, La/ru;->b:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v7, v2, La/ru;->d:Ljava/lang/Object;

    .line 182
    .line 183
    iput-object v8, v2, La/ru;->f:Ljava/lang/Object;

    .line 184
    .line 185
    iput-object v9, v2, La/ru;->g:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object v10, v2, La/ru;->h:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v11, v2, La/ru;->i:Ljava/lang/Object;

    .line 190
    .line 191
    new-instance v0, La/t5i;

    .line 192
    .line 193
    const/16 v3, 0xe

    .line 194
    .line 195
    invoke-direct {v0, v2, v3}, La/t5i;-><init>(Ljava/lang/Object;B)V

    .line 196
    .line 197
    .line 198
    iput-object v0, v2, La/ru;->j:Ljava/lang/Object;

    .line 199
    .line 200
    new-instance v0, La/fiu0;

    .line 201
    .line 202
    iget-object v2, v2, La/ru;->j:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v2, La/t5i;

    .line 205
    .line 206
    const-class v3, La/tw0;

    .line 207
    .line 208
    invoke-static {v3, v2}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    invoke-direct {v0, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 213
    .line 214
    .line 215
    iput-object v0, p0, La/hu0;->U1:La/fiu0;

    .line 216
    .line 217
    iput-object v1, p0, La/hu0;->V1:La/ii;

    .line 218
    .line 219
    iput-object v4, p0, La/hu0;->W1:La/wdk0;

    .line 220
    .line 221
    return-void

    .line 222
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 223
    .line 224
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hu0;->X1:La/a8z;

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
    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 29
    .line 30
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
    invoke-virtual {p0}, La/hu0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/qs0;->a:La/qs0;

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
    invoke-virtual {p0}, La/hu0;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/rs0;->a:La/rs0;

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
    invoke-virtual {p0}, La/hu0;->G0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    new-instance v1, La/ss0;

    .line 15
    .line 16
    invoke-direct {v1, v0}, La/ss0;-><init>(Landroid/content/Context;)V

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
    invoke-virtual {p0}, La/hu0;->G0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/ts0;->a:La/ts0;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hu0;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
