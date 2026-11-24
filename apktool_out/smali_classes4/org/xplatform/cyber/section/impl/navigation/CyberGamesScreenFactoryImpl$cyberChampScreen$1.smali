.class public final Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$cyberChampScreen$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "org/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$cyberChampScreen$1",
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
.field public final synthetic a:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

.field public final synthetic b:La/vqc;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;La/vqc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$cyberChampScreen$1;->a:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$cyberChampScreen$1;->b:La/vqc;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$cyberChampScreen$1;->a:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 5
    .line 6
    iget v0, p1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->d:I

    .line 7
    .line 8
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 9
    .line 10
    iget-byte v1, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 11
    .line 12
    iget-object p0, p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$cyberChampScreen$1;->b:La/vqc;

    .line 13
    .line 14
    if-ne v0, v1, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, La/vqc;->b:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;

    .line 19
    .line 20
    iget-wide v1, p1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->a:J

    .line 21
    .line 22
    iget-object v5, p1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-wide v3, p1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->c:J

    .line 25
    .line 26
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampParams;-><init>(JJLjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object p0, La/g9t0;->U1:La/svs0;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance p0, La/g9t0;

    .line 35
    .line 36
    invoke-direct {p0}, La/g9t0;-><init>()V

    .line 37
    .line 38
    .line 39
    sget-object p1, La/g9t0;->V1:[La/iiy;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    aget-object p1, p1, v1

    .line 43
    .line 44
    iget-object v1, p0, La/g9t0;->S1:La/khf0;

    .line 45
    .line 46
    invoke-virtual {v1, p0, p1, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    iget-object p0, p0, La/vqc;->b:Ljava/lang/Object;

    .line 51
    .line 52
    sget-object p0, La/wcg;->U1:La/usd;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance p0, La/wcg;

    .line 58
    .line 59
    invoke-direct {p0}, La/wcg;-><init>()V

    .line 60
    .line 61
    .line 62
    sget-object v0, La/wcg;->V1:[La/iiy;

    .line 63
    .line 64
    const/4 v1, 0x1

    .line 65
    aget-object v0, v0, v1

    .line 66
    .line 67
    iget-object v1, p0, La/wcg;->S1:La/khf0;

    .line 68
    .line 69
    invoke-virtual {v1, p0, v0, p1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 70
    .line 71
    .line 72
    return-object p0
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
