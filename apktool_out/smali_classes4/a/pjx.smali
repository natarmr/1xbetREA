.class public final La/pjx;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/n6q;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/pjx;",
        "La/nw5;",
        "La/n6q;",
        "<init>",
        "()V",
        "a/sqt",
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
.field public static final h2:La/sqt;

.field public static final synthetic i2:[La/iiy;


# instance fields
.field public final e2:La/phf0;

.field public final f2:La/es;

.field public final g2:La/nae0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/pjx;

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
    const-string v3, "instrumentList"

    .line 16
    .line 17
    const-string v5, "getInstrumentList()Ljava/util/List;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "binding"

    .line 25
    .line 26
    const-string v6, "getBinding()Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetInstrumentsDialogBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/pjx;->i2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/sqt;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/pjx;->h2:La/sqt;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/pjx;->e2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/es;

    .line 14
    .line 15
    const-string v1, "INSTRUMENT_LIST"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/pjx;->f2:La/es;

    .line 21
    .line 22
    sget-object v0, La/ojx;->a:La/ojx;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, La/pjx;->g2:La/nae0;

    .line 29
    .line 30
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

.method public final L0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/pjx;->i2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/pjx;->g2:La/nae0;

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
    check-cast p0, La/n6q;

    .line 16
    .line 17
    return-object p0
.end method

.method public final O0()V
    .locals 7

    .line 1
    new-instance v0, La/k4f;

    .line 2
    .line 3
    new-instance v1, La/adw;

    .line 4
    .line 5
    const/16 v2, 0x12

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, La/i26;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, La/i26;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, La/dp;

    .line 16
    .line 17
    new-instance v3, La/v1x;

    .line 18
    .line 19
    const/16 v4, 0x11

    .line 20
    .line 21
    invoke-direct {v3, v4}, La/v1x;-><init>(B)V

    .line 22
    .line 23
    .line 24
    new-instance v5, La/adw;

    .line 25
    .line 26
    invoke-direct {v5, v1, v4}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/pkv;

    .line 30
    .line 31
    const/4 v4, 0x3

    .line 32
    const/16 v6, 0x1d

    .line 33
    .line 34
    invoke-direct {v1, v4, v6}, La/pkv;-><init>(IB)V

    .line 35
    .line 36
    .line 37
    sget-object v4, La/btv;->B:La/btv;

    .line 38
    .line 39
    new-instance v6, La/gbn;

    .line 40
    .line 41
    invoke-direct {v6, v3, v1, v5, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v6}, La/dp;->b(La/gbn;)V

    .line 45
    .line 46
    .line 47
    sget-object v1, La/pjx;->i2:[La/iiy;

    .line 48
    .line 49
    const/4 v2, 0x1

    .line 50
    aget-object v3, v1, v2

    .line 51
    .line 52
    iget-object v4, p0, La/pjx;->f2:La/es;

    .line 53
    .line 54
    invoke-virtual {v4, p0, v3}, La/es;->j(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iput-object v3, v0, La/i26;->f:Ljava/lang/Object;

    .line 59
    .line 60
    const/4 v3, 0x2

    .line 61
    aget-object v4, v1, v3

    .line 62
    .line 63
    iget-object v5, p0, La/pjx;->g2:La/nae0;

    .line 64
    .line 65
    invoke-interface {v5, v4, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast v4, La/n6q;

    .line 73
    .line 74
    iget-object v4, v4, La/n6q;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 75
    .line 76
    invoke-virtual {v4, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 77
    .line 78
    .line 79
    new-instance v0, La/wn8;

    .line 80
    .line 81
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    const v6, 0x7f08048e

    .line 86
    .line 87
    .line 88
    invoke-static {v6, v4}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-direct {v0, v4, v2}, La/wn8;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 93
    .line 94
    .line 95
    aget-object v1, v1, v3

    .line 96
    .line 97
    invoke-interface {v5, v1, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    check-cast p0, La/n6q;

    .line 105
    .line 106
    iget-object p0, p0, La/n6q;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 109
    .line 110
    .line 111
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0b0f

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    const v0, 0x7f130273

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
