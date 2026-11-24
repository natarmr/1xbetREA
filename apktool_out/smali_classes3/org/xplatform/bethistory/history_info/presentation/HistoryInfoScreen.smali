.class public final Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;
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
        "Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;",
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

.field public final e:La/sys0;


# direct methods
.method public constructor <init>(La/n3w;ZJZLa/sys0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->a:La/n3w;

    .line 11
    .line 12
    iput-boolean p2, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->b:Z

    .line 13
    .line 14
    iput-wide p3, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->c:J

    .line 15
    .line 16
    iput-boolean p5, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->d:Z

    .line 17
    .line 18
    iput-object p6, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->e:La/sys0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/izv;->d2:La/rqt;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->a:La/n3w;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->e:La/sys0;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, La/izv;

    .line 20
    .line 21
    invoke-direct {v1}, La/izv;-><init>()V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/izv;->e2:[La/iiy;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    aget-object v4, v2, v3

    .line 28
    .line 29
    iget-object v5, v1, La/izv;->L1:La/yzn0;

    .line 30
    .line 31
    invoke-virtual {v5, v1, v4, p1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 32
    .line 33
    .line 34
    const/4 p1, 0x1

    .line 35
    aget-object p1, v2, p1

    .line 36
    .line 37
    iget-object v4, v1, La/izv;->M1:La/cgx0;

    .line 38
    .line 39
    iget-boolean v5, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->b:Z

    .line 40
    .line 41
    invoke-virtual {v4, v1, p1, v5}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x3

    .line 45
    aget-object p1, v2, p1

    .line 46
    .line 47
    iget-object v4, v1, La/izv;->O1:La/cgx0;

    .line 48
    .line 49
    iget-boolean v5, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->d:Z

    .line 50
    .line 51
    invoke-virtual {v4, v1, p1, v5}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 52
    .line 53
    .line 54
    const/4 p1, 0x2

    .line 55
    aget-object p1, v2, p1

    .line 56
    .line 57
    iget-object v4, v1, La/izv;->N1:La/r34;

    .line 58
    .line 59
    iget-wide v5, p0, Lorg/xplatform/bethistory/history_info/presentation/HistoryInfoScreen;->c:J

    .line 60
    .line 61
    invoke-virtual {v4, v1, p1, v5, v6}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x4

    .line 65
    aget-object p0, v2, p0

    .line 66
    .line 67
    iget-object p1, v1, La/izv;->P1:La/cgx0;

    .line 68
    .line 69
    invoke-virtual {p1, v1, p0, v3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x6

    .line 73
    aget-object p0, v2, p0

    .line 74
    .line 75
    iget-object p1, v1, La/izv;->R1:La/yzn0;

    .line 76
    .line 77
    invoke-virtual {p1, v1, p0, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 78
    .line 79
    .line 80
    return-object v1
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
