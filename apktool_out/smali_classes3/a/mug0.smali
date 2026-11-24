.class public final La/mug0;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/nug0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/mug0;",
        "La/nw5;",
        "La/nug0;",
        "<init>",
        "()V",
        "a/lme0",
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
.field public static final m2:La/lme0;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public final e2:La/cgx0;

.field public final f2:La/yzn0;

.field public final g2:La/khf0;

.field public final h2:La/chf0;

.field public final i2:La/phf0;

.field public final j2:La/nae0;

.field public k2:La/fiu0;

.field public final l2:La/kiu0;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/mug0;

    .line 4
    .line 5
    const-string v2, "bundleAutoSale"

    .line 6
    .line 7
    const-string v3, "getBundleAutoSale()Z"

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
    const-string v3, "bundleItem"

    .line 16
    .line 17
    const-string v5, "getBundleItem()Lorg/xplatform/bethistory/domain/model/HistoryItemModel;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bundleLastSaleData"

    .line 25
    .line 26
    const-string v6, "getBundleLastSaleData()Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "bundleSaleSum"

    .line 34
    .line 35
    const-string v7, "getBundleSaleSum()D"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "requestKey"

    .line 43
    .line 44
    const-string v8, "getRequestKey()Ljava/lang/String;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/j0d0;

    .line 50
    .line 51
    const-string v8, "binding"

    .line 52
    .line 53
    const-string v9, "getBinding()Lorg/xplatform/bethistory/impl/databinding/SaleDialogBinding;"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    new-array v1, v1, [La/iiy;

    .line 60
    .line 61
    aput-object v0, v1, v4

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    aput-object v2, v1, v0

    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    aput-object v3, v1, v0

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    aput-object v5, v1, v0

    .line 71
    .line 72
    const/4 v0, 0x4

    .line 73
    aput-object v6, v1, v0

    .line 74
    .line 75
    const/4 v0, 0x5

    .line 76
    aput-object v7, v1, v0

    .line 77
    .line 78
    sput-object v1, La/mug0;->n2:[La/iiy;

    .line 79
    .line 80
    new-instance v0, La/lme0;

    .line 81
    .line 82
    const/16 v1, 0xb

    .line 83
    .line 84
    invoke-direct {v0, v1}, La/lme0;-><init>(B)V

    .line 85
    .line 86
    .line 87
    sput-object v0, La/mug0;->m2:La/lme0;

    .line 88
    .line 89
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/cgx0;

    .line 5
    .line 6
    const-string v1, "BUNDLE_AUTO_SALE"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/mug0;->e2:La/cgx0;

    .line 12
    .line 13
    new-instance v0, La/yzn0;

    .line 14
    .line 15
    const-string v1, "BUNDLE_BET_HISTORY_ITEM"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/mug0;->f2:La/yzn0;

    .line 21
    .line 22
    new-instance v0, La/khf0;

    .line 23
    .line 24
    const-string v1, "BUNDLE_LAST_SALE"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/mug0;->g2:La/khf0;

    .line 30
    .line 31
    new-instance v0, La/chf0;

    .line 32
    .line 33
    const-string v1, "BUNDLE_SALE_SUM"

    .line 34
    .line 35
    const/16 v2, 0xd

    .line 36
    .line 37
    invoke-direct {v0, v1, v2}, La/chf0;-><init>(Ljava/lang/Object;B)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, La/mug0;->h2:La/chf0;

    .line 41
    .line 42
    new-instance v0, La/phf0;

    .line 43
    .line 44
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 45
    .line 46
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, La/mug0;->i2:La/phf0;

    .line 50
    .line 51
    sget-object v0, La/kug0;->a:La/kug0;

    .line 52
    .line 53
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/mug0;->j2:La/nae0;

    .line 58
    .line 59
    new-instance v0, La/a7g0;

    .line 60
    .line 61
    const/16 v1, 0x8

    .line 62
    .line 63
    invoke-direct {v0, p0, v1}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    new-instance v1, La/yxf0;

    .line 67
    .line 68
    const/16 v3, 0x9

    .line 69
    .line 70
    invoke-direct {v1, p0, v3}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 71
    .line 72
    .line 73
    sget-object v3, La/wez;->b:La/wez;

    .line 74
    .line 75
    new-instance v4, La/yxf0;

    .line 76
    .line 77
    const/16 v5, 0xa

    .line 78
    .line 79
    invoke-direct {v4, v1, v5}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    const-class v3, La/rug0;

    .line 87
    .line 88
    sget-object v4, La/sre0;->a:La/tre0;

    .line 89
    .line 90
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    new-instance v4, La/fxf0;

    .line 95
    .line 96
    const/16 v5, 0xc

    .line 97
    .line 98
    invoke-direct {v4, v1, v5}, La/fxf0;-><init>(La/a8z;B)V

    .line 99
    .line 100
    .line 101
    new-instance v5, La/fxf0;

    .line 102
    .line 103
    invoke-direct {v5, v1, v2}, La/fxf0;-><init>(La/a8z;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iput-object v0, p0, La/mug0;->l2:La/kiu0;

    .line 111
    .line 112
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final bridge synthetic L0()La/yfu0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/mug0;->T0()La/nug0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final P0()V
    .locals 10

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
    const-class v1, La/oug0;

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
    instance-of v3, v0, La/oug0;

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
    check-cast v2, La/oug0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x1

    .line 56
    sget-object v1, La/mug0;->n2:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v1, v0

    .line 59
    .line 60
    iget-object v3, p0, La/mug0;->f2:La/yzn0;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    move-object v5, v0

    .line 67
    check-cast v5, La/n3w;

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    aget-object v0, v1, v0

    .line 71
    .line 72
    iget-object v3, p0, La/mug0;->e2:La/cgx0;

    .line 73
    .line 74
    invoke-virtual {v3, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const/4 v0, 0x2

    .line 79
    aget-object v0, v1, v0

    .line 80
    .line 81
    iget-object v3, p0, La/mug0;->g2:La/khf0;

    .line 82
    .line 83
    invoke-virtual {v3, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    move-object v7, v0

    .line 88
    check-cast v7, Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;

    .line 89
    .line 90
    const/4 v0, 0x3

    .line 91
    aget-object v0, v1, v0

    .line 92
    .line 93
    iget-object v1, p0, La/mug0;->h2:La/chf0;

    .line 94
    .line 95
    invoke-virtual {v1, p0, v0}, La/chf0;->K(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Double;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    iget-object v4, v2, La/oug0;->a:La/ctf0;

    .line 100
    .line 101
    iget-object v9, v2, La/oug0;->b:La/m1e;

    .line 102
    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v3, La/xzp;

    .line 110
    .line 111
    invoke-direct/range {v3 .. v9}, La/xzp;-><init>(La/ctf0;La/n3w;Ljava/lang/Boolean;Lorg/xplatform/bethistory/sale/presentation/SaleDataModel;Ljava/lang/Double;La/m1e;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, La/fiu0;

    .line 115
    .line 116
    iget-object v1, v3, La/xzp;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v1, La/fri;

    .line 119
    .line 120
    const-class v2, La/rug0;

    .line 121
    .line 122
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 127
    .line 128
    .line 129
    iput-object v0, p0, La/mug0;->k2:La/fiu0;

    .line 130
    .line 131
    return-void

    .line 132
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 133
    .line 134
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0b09

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, La/mug0;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/mug0;->e2:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const v0, 0x7f1304d1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    const v0, 0x7f1304db

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method public final T0()La/nug0;
    .locals 2

    .line 1
    sget-object v0, La/mug0;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/mug0;->j2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/nug0;

    .line 16
    .line 17
    return-object p0
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/nw5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/mug0;->l2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, La/rug0;

    .line 14
    .line 15
    iget-object p2, p2, La/rug0;->c:La/p7m0;

    .line 16
    .line 17
    invoke-static {p2}, La/vtb;->N(La/qz40;)La/xae0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    new-instance v0, La/lug0;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, p0, v2, v1}, La/lug0;-><init>(La/mug0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    sget-object v1, La/lkz;->a:La/lkz;

    .line 29
    .line 30
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    new-instance v4, La/kmg0;

    .line 43
    .line 44
    invoke-direct {v4, p2, v1, v0, v2}, La/kmg0;-><init>(La/xae0;La/clz;La/lug0;La/yje;)V

    .line 45
    .line 46
    .line 47
    const/4 p2, 0x3

    .line 48
    invoke-static {v3, v2, v2, v4, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, La/rug0;

    .line 56
    .line 57
    iget-object p1, p1, La/rug0;->d:La/qoj0;

    .line 58
    .line 59
    invoke-static {p1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v0, La/lug0;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-direct {v0, p0, v2, v1}, La/lug0;-><init>(La/mug0;La/yje;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    new-instance v4, La/kmg0;

    .line 82
    .line 83
    invoke-direct {v4, p1, v1, v0, v2}, La/kmg0;-><init>(La/vae0;La/clz;La/lug0;La/yje;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v3, v2, v2, v4, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La/mug0;->T0()La/nug0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, La/nug0;->b:Lcom/google/android/material/button/MaterialButton;

    .line 94
    .line 95
    new-instance p2, La/jpe0;

    .line 96
    .line 97
    const/4 v0, 0x5

    .line 98
    invoke-direct {p2, p0, v0}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method
