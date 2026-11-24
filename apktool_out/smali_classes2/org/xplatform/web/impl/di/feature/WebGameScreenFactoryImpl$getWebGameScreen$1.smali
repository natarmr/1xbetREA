.class public final Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;
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
        "org/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1",
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
.field public final synthetic a:J

.field public final synthetic b:La/csr;

.field public final synthetic c:Z


# direct methods
.method public constructor <init>(JLa/csr;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;->a:J

    .line 5
    .line 6
    iput-object p3, p0, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;->b:La/csr;

    .line 7
    .line 8
    iput-boolean p4, p0, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;->c:Z

    .line 9
    .line 10
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
    sget-object p1, La/ca70;->U1:La/htz;

    .line 5
    .line 6
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v6

    .line 14
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-wide v1, p0, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;->a:J

    .line 21
    .line 22
    iget-object v3, p0, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;->b:La/csr;

    .line 23
    .line 24
    const/4 v4, 0x1

    .line 25
    iget-boolean v5, p0, Lorg/xplatform/web/impl/di/feature/WebGameScreenFactoryImpl$getWebGameScreen$1;->c:Z

    .line 26
    .line 27
    invoke-static/range {v1 .. v6}, La/htz;->g(JLa/csr;ZZLjava/lang/String;)La/ca70;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
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
