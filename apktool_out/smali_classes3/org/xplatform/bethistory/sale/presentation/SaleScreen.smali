.class public final Lorg/xplatform/bethistory/sale/presentation/SaleScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0001\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/bethistory/sale/presentation/SaleScreen;",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
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


# instance fields
.field public final a:La/n3w;

.field public final b:Z

.field public final c:J

.field public final d:Z


# direct methods
.method public constructor <init>(La/n3w;ZJZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;->a:La/n3w;

    .line 8
    .line 9
    iput-boolean p2, p0, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;->b:Z

    .line 10
    .line 11
    iput-wide p3, p0, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;->c:J

    .line 12
    .line 13
    iput-boolean p5, p0, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;->d:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/zug0;->V1:La/gne0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;->a:La/n3w;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/zug0;

    .line 15
    .line 16
    invoke-direct {v0}, La/zug0;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/zug0;->W1:[La/iiy;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    aget-object v2, v1, v2

    .line 23
    .line 24
    iget-object v3, v0, La/zug0;->L1:La/yzn0;

    .line 25
    .line 26
    invoke-virtual {v3, v0, v2, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    aget-object p1, v1, p1

    .line 31
    .line 32
    iget-object v2, v0, La/zug0;->M1:La/cgx0;

    .line 33
    .line 34
    iget-boolean v3, p0, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;->b:Z

    .line 35
    .line 36
    invoke-virtual {v2, v0, p1, v3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x2

    .line 40
    aget-object p1, v1, p1

    .line 41
    .line 42
    iget-object v2, v0, La/zug0;->N1:La/r34;

    .line 43
    .line 44
    iget-wide v3, p0, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;->c:J

    .line 45
    .line 46
    invoke-virtual {v2, v0, p1, v3, v4}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x3

    .line 50
    aget-object p1, v1, p1

    .line 51
    .line 52
    iget-object v1, v0, La/zug0;->O1:La/cgx0;

    .line 53
    .line 54
    iget-boolean p0, p0, Lorg/xplatform/bethistory/sale/presentation/SaleScreen;->d:Z

    .line 55
    .line 56
    invoke-virtual {v1, v0, p1, p0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/ufx;->C(La/m7h0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
