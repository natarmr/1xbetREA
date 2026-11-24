.class public final La/tj7;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/tj7;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/gl5",
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
.field public static final t2:La/gl5;

.field public static final synthetic u2:[La/iiy;


# instance fields
.field public k2:La/fiu0;

.field public final l2:La/a8z;

.field public final m2:La/phf0;

.field public final n2:La/phf0;

.field public final o2:La/phf0;

.field public final p2:La/chf0;

.field public final q2:La/chf0;

.field public final r2:La/chf0;

.field public final s2:La/cgx0;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/tj7;

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
    const-string v3, "betId"

    .line 16
    .line 17
    const-string v5, "getBetId()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "currency"

    .line 25
    .line 26
    const-string v6, "getCurrency()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "downGradeBet"

    .line 34
    .line 35
    const-string v7, "getDownGradeBet()D"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "saleSum"

    .line 43
    .line 44
    const-string v8, "getSaleSum()D"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/ez40;

    .line 50
    .line 51
    const-string v8, "autoSaleSum"

    .line 52
    .line 53
    const-string v9, "getAutoSaleSum()D"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    new-instance v8, La/ez40;

    .line 59
    .line 60
    const-string v9, "isAutoSale"

    .line 61
    .line 62
    const-string v10, "isAutoSale()Z"

    .line 63
    .line 64
    invoke-direct {v8, v1, v9, v10, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/tj7;->u2:[La/iiy;

    .line 91
    .line 92
    new-instance v1, La/gl5;

    .line 93
    .line 94
    invoke-direct {v1, v0}, La/gl5;-><init>(B)V

    .line 95
    .line 96
    .line 97
    sput-object v1, La/tj7;->t2:La/gl5;

    .line 98
    .line 99
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, La/zj7;

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
    new-instance v1, La/qj7;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-direct {v1, p0, v2}, La/qj7;-><init>(La/tj7;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/tj7;->l2:La/a8z;

    .line 23
    .line 24
    new-instance v0, La/phf0;

    .line 25
    .line 26
    const-string v1, "BET_SALE_CONFIRM_REQUEST"

    .line 27
    .line 28
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/tj7;->m2:La/phf0;

    .line 32
    .line 33
    new-instance v0, La/phf0;

    .line 34
    .line 35
    const-string v1, "BET_ID_KEY"

    .line 36
    .line 37
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/tj7;->n2:La/phf0;

    .line 41
    .line 42
    new-instance v0, La/phf0;

    .line 43
    .line 44
    const-string v1, "CURRENCY_KEY"

    .line 45
    .line 46
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, La/tj7;->o2:La/phf0;

    .line 50
    .line 51
    new-instance v0, La/chf0;

    .line 52
    .line 53
    const-string v1, "DOWNGRADE_BET_KEY"

    .line 54
    .line 55
    const/16 v2, 0xd

    .line 56
    .line 57
    invoke-direct {v0, v1, v2}, La/chf0;-><init>(Ljava/lang/Object;B)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, La/tj7;->p2:La/chf0;

    .line 61
    .line 62
    new-instance v0, La/chf0;

    .line 63
    .line 64
    const-string v1, "SALE_SUM_KEY"

    .line 65
    .line 66
    invoke-direct {v0, v1, v2}, La/chf0;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    iput-object v0, p0, La/tj7;->q2:La/chf0;

    .line 70
    .line 71
    new-instance v0, La/chf0;

    .line 72
    .line 73
    const-string v1, "AUTO_SALE_SUM_KEY"

    .line 74
    .line 75
    invoke-direct {v0, v1, v2}, La/chf0;-><init>(Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    iput-object v0, p0, La/tj7;->r2:La/chf0;

    .line 79
    .line 80
    new-instance v0, La/cgx0;

    .line 81
    .line 82
    const-string v1, "IS_AUTO_SALE_KEY"

    .line 83
    .line 84
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, La/tj7;->s2:La/cgx0;

    .line 88
    .line 89
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 14

    .line 1
    const v0, 0x39d742f0

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/tj7;->l2:La/a8z;

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/k3t0;

    .line 14
    .line 15
    check-cast v0, La/i3t0;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    move-object v2, v0

    .line 26
    check-cast v2, La/xj7;

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    const/4 v7, 0x0

    .line 30
    invoke-static {v7, v7, p1, v7, v0}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    new-instance v8, La/bw5;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    new-instance v1, La/rj7;

    .line 42
    .line 43
    invoke-direct {v1, p0, v0}, La/rj7;-><init>(La/tj7;B)V

    .line 44
    .line 45
    .line 46
    const v0, -0x71ec1961

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    new-instance v1, La/qb;

    .line 54
    .line 55
    const/16 v6, 0x15

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    move-object v4, p0

    .line 59
    invoke-direct/range {v1 .. v6}, La/qb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 60
    .line 61
    .line 62
    const p0, -0x2ced8edf

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 66
    .line 67
    .line 68
    move-result-object v12

    .line 69
    const/16 v13, 0xa

    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    invoke-direct/range {v8 .. v13}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 76
    .line 77
    .line 78
    return-object v8
.end method

.method public final V(Landroid/content/Context;)V
    .locals 14

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
    const-class v0, La/ak7;

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
    instance-of v2, p1, La/ak7;

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
    check-cast v1, La/ak7;

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    .line 58
    const/4 p1, 0x1

    .line 59
    sget-object v0, La/tj7;->u2:[La/iiy;

    .line 60
    .line 61
    aget-object p1, v0, p1

    .line 62
    .line 63
    iget-object v2, p0, La/tj7;->n2:La/phf0;

    .line 64
    .line 65
    invoke-virtual {v2, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    const/4 p1, 0x2

    .line 70
    aget-object p1, v0, p1

    .line 71
    .line 72
    iget-object v2, p0, La/tj7;->o2:La/phf0;

    .line 73
    .line 74
    invoke-virtual {v2, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    const/4 p1, 0x4

    .line 79
    aget-object p1, v0, p1

    .line 80
    .line 81
    iget-object v0, p0, La/tj7;->q2:La/chf0;

    .line 82
    .line 83
    invoke-virtual {v0, p0, p1}, La/chf0;->K(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Double;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object v4, v1, La/ak7;->b:La/cad;

    .line 94
    .line 95
    iget-object v10, v1, La/ak7;->a:La/ctf0;

    .line 96
    .line 97
    iget-object v5, v1, La/ak7;->d:La/ugf0;

    .line 98
    .line 99
    iget-object v8, v1, La/ak7;->e:La/edo;

    .line 100
    .line 101
    iget-object v11, v1, La/ak7;->f:La/b8u;

    .line 102
    .line 103
    iget-object v12, v1, La/ak7;->c:La/fme;

    .line 104
    .line 105
    iget-object v13, v1, La/ak7;->g:La/vjp;

    .line 106
    .line 107
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    new-instance v3, La/o3c;

    .line 117
    .line 118
    invoke-direct/range {v3 .. v13}, La/o3c;-><init>(La/cad;La/ugf0;Ljava/lang/Double;Ljava/lang/String;La/edo;Ljava/lang/String;La/ctf0;La/b8u;La/fme;La/vjp;)V

    .line 119
    .line 120
    .line 121
    new-instance p1, La/fiu0;

    .line 122
    .line 123
    iget-object v0, v3, La/o3c;->k:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v0, La/n8i;

    .line 126
    .line 127
    const-class v1, La/zj7;

    .line 128
    .line 129
    invoke-static {v1, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-direct {p1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, La/tj7;->k2:La/fiu0;

    .line 137
    .line 138
    return-void

    .line 139
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 140
    .line 141
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method
