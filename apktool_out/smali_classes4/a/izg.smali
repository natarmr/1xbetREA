.class public final synthetic La/izg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/uzg;

.field public final synthetic b:B

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(La/uzg;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/izg;->a:La/uzg;

    iput-byte p2, p0, La/izg;->b:B

    iput-boolean p3, p0, La/izg;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, La/k0w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/izg;->a:La/uzg;

    .line 7
    .line 8
    iget-object v0, v0, La/uzg;->b:La/vqc;

    .line 9
    .line 10
    new-instance v1, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$BestGames;

    .line 11
    .line 12
    iget-byte v2, p0, La/izg;->b:B

    .line 13
    .line 14
    iget-boolean p0, p0, La/izg;->c:Z

    .line 15
    .line 16
    invoke-direct {v1, v2, p0}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$BestGames;-><init>(IZ)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$esportsGamesScreen$1;

    .line 20
    .line 21
    invoke-direct {p0, v0, v1}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$esportsGamesScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0
.end method
