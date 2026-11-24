.class public final La/n4f;
.super La/stl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/stl<",
        "La/o4f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/n4f;",
        "La/stl;",
        "La/o4f;",
        "<init>",
        "()V",
        "a/kwd",
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
.field public static final k2:La/kwd;

.field public static final synthetic l2:[La/iiy;

.field public static final m2:Ljava/lang/String;


# instance fields
.field public final g2:La/nae0;

.field public final h2:La/es;

.field public final i2:La/phf0;

.field public final j2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/n4f;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/coupon/impl/databinding/CouponTypeDialogBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "couponTypes"

    .line 16
    .line 17
    const-string v5, "getCouponTypes()Ljava/util/List;"

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
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "title"

    .line 34
    .line 35
    const-string v7, "getTitle()Ljava/lang/String;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    const/4 v6, 0x4

    .line 41
    new-array v6, v6, [La/iiy;

    .line 42
    .line 43
    aput-object v0, v6, v4

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v2, v6, v0

    .line 47
    .line 48
    const/4 v0, 0x2

    .line 49
    aput-object v3, v6, v0

    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    aput-object v5, v6, v0

    .line 53
    .line 54
    sput-object v6, La/n4f;->l2:[La/iiy;

    .line 55
    .line 56
    new-instance v0, La/kwd;

    .line 57
    .line 58
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    sput-object v0, La/n4f;->k2:La/kwd;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, La/n4f;->m2:Ljava/lang/String;

    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/stl;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/m4f;->a:La/m4f;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/n4f;->g2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/es;

    .line 13
    .line 14
    const-string v1, "PARAM_COUPON_TYPES"

    .line 15
    .line 16
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/n4f;->h2:La/es;

    .line 20
    .line 21
    new-instance v0, La/phf0;

    .line 22
    .line 23
    const-string v1, "PARAM_REQUEST_KEY"

    .line 24
    .line 25
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/n4f;->i2:La/phf0;

    .line 29
    .line 30
    new-instance v0, La/phf0;

    .line 31
    .line 32
    const-string v1, "PARAM_TITLE_KEY"

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/n4f;->j2:La/phf0;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final Q0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/n4f;->l2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/n4f;->g2:La/nae0;

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
    check-cast p0, La/o4f;

    .line 16
    .line 17
    return-object p0
.end method

.method public final S0()V
    .locals 10

    .line 1
    iget-object v0, p0, La/stl;->c2:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x3

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->N(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, La/kp8;

    .line 13
    .line 14
    sget-object v3, La/n4f;->l2:[La/iiy;

    .line 15
    .line 16
    aget-object v4, v3, v2

    .line 17
    .line 18
    iget-object v5, p0, La/n4f;->j2:La/phf0;

    .line 19
    .line 20
    invoke-virtual {v5, p0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/4 v5, 0x0

    .line 25
    invoke-direct {v0, v4, v5}, La/kp8;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, La/stl;->I0(La/kp8;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, La/n4f;->g2:La/nae0;

    .line 32
    .line 33
    aget-object v4, v3, v5

    .line 34
    .line 35
    invoke-interface {v0, v4, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v0, La/o4f;

    .line 43
    .line 44
    iget-object v0, v0, La/o4f;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 45
    .line 46
    new-instance v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-direct {v4, v5}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 56
    .line 57
    .line 58
    new-instance v4, La/k4f;

    .line 59
    .line 60
    new-instance v5, La/ejd;

    .line 61
    .line 62
    const/16 v6, 0x14

    .line 63
    .line 64
    invoke-direct {v5, p0, v6}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v4}, La/i26;-><init>()V

    .line 68
    .line 69
    .line 70
    iget-object v6, v4, La/i26;->e:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v6, La/dp;

    .line 73
    .line 74
    new-instance v7, La/bqd;

    .line 75
    .line 76
    const/16 v8, 0x15

    .line 77
    .line 78
    invoke-direct {v7, v8}, La/bqd;-><init>(B)V

    .line 79
    .line 80
    .line 81
    new-instance v8, La/ejd;

    .line 82
    .line 83
    const/16 v9, 0x13

    .line 84
    .line 85
    invoke-direct {v8, v5, v9}, La/ejd;-><init>(Ljava/lang/Object;B)V

    .line 86
    .line 87
    .line 88
    new-instance v5, La/pue;

    .line 89
    .line 90
    invoke-direct {v5, v2, v2}, La/pue;-><init>(IB)V

    .line 91
    .line 92
    .line 93
    sget-object v2, La/fpd;->n:La/fpd;

    .line 94
    .line 95
    new-instance v9, La/gbn;

    .line 96
    .line 97
    invoke-direct {v9, v7, v5, v8, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v6, v9}, La/dp;->b(La/gbn;)V

    .line 101
    .line 102
    .line 103
    iget-object v2, p0, La/n4f;->h2:La/es;

    .line 104
    .line 105
    aget-object v1, v3, v1

    .line 106
    .line 107
    invoke-virtual {v2, p0, v1}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    iput-object p0, v4, La/i26;->f:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 114
    .line 115
    .line 116
    return-void
.end method
