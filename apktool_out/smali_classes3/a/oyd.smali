.class public final La/oyd;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/pyd;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/oyd;",
        "La/nw5;",
        "La/pyd;",
        "<init>",
        "()V",
        "a/std",
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
.field public static final k2:La/std;

.field public static final synthetic l2:[La/iiy;


# instance fields
.field public final e2:La/yzn0;

.field public final f2:La/chf0;

.field public final g2:La/phf0;

.field public h2:La/fiu0;

.field public final i2:La/kiu0;

.field public final j2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/oyd;

    .line 4
    .line 5
    const-string v2, "bundleItem"

    .line 6
    .line 7
    const-string v3, "getBundleItem()Lorg/xplatform/bethistory/domain/model/HistoryItemModel;"

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
    const-string v3, "bundleSaleSum"

    .line 16
    .line 17
    const-string v5, "getBundleSaleSum()D"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "requestKey"

    .line 25
    .line 26
    const-string v6, "getRequestKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/j0d0;

    .line 32
    .line 33
    const-string v6, "binding"

    .line 34
    .line 35
    const-string v7, "getBinding()Lorg/xplatform/bethistory/impl/databinding/ConfirmSaleDialogBinding;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v1, 0x4

    .line 41
    new-array v1, v1, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v1, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v1, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v1, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v1, v0

    .line 53
    .line 54
    sput-object v1, La/oyd;->l2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/std;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/oyd;->k2:La/std;

    .line 62
    .line 63
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/yzn0;

    .line 5
    .line 6
    const-string v1, "BUNDLE_HISTORY_ITEM"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/oyd;->e2:La/yzn0;

    .line 12
    .line 13
    new-instance v0, La/chf0;

    .line 14
    .line 15
    const-string v1, "BUNDLE_SALE_SUM"

    .line 16
    .line 17
    const/16 v2, 0xd

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, La/chf0;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/oyd;->f2:La/chf0;

    .line 23
    .line 24
    new-instance v0, La/phf0;

    .line 25
    .line 26
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 27
    .line 28
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, La/oyd;->g2:La/phf0;

    .line 32
    .line 33
    new-instance v0, La/jwd;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, p0, v1}, La/jwd;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v1, La/svc;

    .line 40
    .line 41
    const/16 v2, 0xa

    .line 42
    .line 43
    invoke-direct {v1, p0, v2}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    sget-object v2, La/wez;->b:La/wez;

    .line 47
    .line 48
    new-instance v3, La/svc;

    .line 49
    .line 50
    const/16 v4, 0xb

    .line 51
    .line 52
    invoke-direct {v3, v1, v4}, La/svc;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-class v2, La/syd;

    .line 60
    .line 61
    sget-object v3, La/sre0;->a:La/tre0;

    .line 62
    .line 63
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    new-instance v3, La/wpb;

    .line 68
    .line 69
    const/16 v4, 0x12

    .line 70
    .line 71
    invoke-direct {v3, v1, v4}, La/wpb;-><init>(La/a8z;B)V

    .line 72
    .line 73
    .line 74
    new-instance v4, La/wpb;

    .line 75
    .line 76
    const/16 v5, 0x13

    .line 77
    .line 78
    invoke-direct {v4, v1, v5}, La/wpb;-><init>(La/a8z;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iput-object v0, p0, La/oyd;->i2:La/kiu0;

    .line 86
    .line 87
    sget-object v0, La/myd;->a:La/myd;

    .line 88
    .line 89
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    iput-object v0, p0, La/oyd;->j2:La/nae0;

    .line 94
    .line 95
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
    invoke-virtual {p0}, La/oyd;->T0()La/pyd;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final P0()V
    .locals 4

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
    const-class v1, La/lyd;

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
    instance-of v3, v0, La/lyd;

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
    check-cast v2, La/lyd;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    sget-object v1, La/oyd;->l2:[La/iiy;

    .line 57
    .line 58
    aget-object v0, v1, v0

    .line 59
    .line 60
    iget-object v3, p0, La/oyd;->e2:La/yzn0;

    .line 61
    .line 62
    invoke-virtual {v3, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/n3w;

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    aget-object v1, v1, v3

    .line 70
    .line 71
    iget-object v3, p0, La/oyd;->f2:La/chf0;

    .line 72
    .line 73
    invoke-virtual {v3, p0, v1}, La/chf0;->K(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Double;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v2, v2, La/lyd;->a:La/ctf0;

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    new-instance v3, La/mii0;

    .line 83
    .line 84
    invoke-direct {v3, v2, v0, v1}, La/mii0;-><init>(La/ctf0;La/n3w;Ljava/lang/Double;)V

    .line 85
    .line 86
    .line 87
    new-instance v0, La/fiu0;

    .line 88
    .line 89
    iget-object v1, v3, La/mii0;->e:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v1, La/uci;

    .line 92
    .line 93
    const-class v2, La/syd;

    .line 94
    .line 95
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 100
    .line 101
    .line 102
    iput-object v0, p0, La/oyd;->h2:La/fiu0;

    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 106
    .line 107
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
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
    .locals 1

    .line 1
    const v0, 0x7f1304db

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final T0()La/pyd;
    .locals 2

    .line 1
    sget-object v0, La/oyd;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/oyd;->j2:La/nae0;

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
    check-cast p0, La/pyd;

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
    iget-object p1, p0, La/oyd;->i2:La/kiu0;

    .line 8
    .line 9
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, La/syd;

    .line 14
    .line 15
    iget-object p2, p2, La/syd;->c:La/p7m0;

    .line 16
    .line 17
    invoke-static {p2}, La/vtb;->N(La/qz40;)La/xae0;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    new-instance v0, La/nyd;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v0, p0, v2, v1}, La/nyd;-><init>(La/oyd;La/yje;B)V

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
    new-instance v4, La/cxd;

    .line 43
    .line 44
    invoke-direct {v4, p2, v1, v0, v2}, La/cxd;-><init>(La/xae0;La/clz;La/nyd;La/yje;)V

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
    check-cast p1, La/syd;

    .line 56
    .line 57
    iget-object p1, p1, La/syd;->d:La/qoj0;

    .line 58
    .line 59
    invoke-static {p1}, La/vtb;->M(La/mz40;)La/vae0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v0, La/nyd;

    .line 64
    .line 65
    const/4 v1, 0x1

    .line 66
    invoke-direct {v0, p0, v2, v1}, La/nyd;-><init>(La/oyd;La/yje;B)V

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
    new-instance v4, La/cxd;

    .line 82
    .line 83
    invoke-direct {v4, p1, v1, v0, v2}, La/cxd;-><init>(La/vae0;La/clz;La/nyd;La/yje;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v3, v2, v2, v4, p2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, La/oyd;->T0()La/pyd;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    iget-object p1, p1, La/pyd;->b:Lcom/google/android/material/button/MaterialButton;

    .line 94
    .line 95
    new-instance p2, La/q10;

    .line 96
    .line 97
    const/16 v0, 0xb

    .line 98
    .line 99
    invoke-direct {p2, p0, v0}, La/q10;-><init>(Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method
