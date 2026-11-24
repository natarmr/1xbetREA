.class public final synthetic La/tzg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:La/uzg;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Z

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(La/uzg;JJZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tzg;->a:La/uzg;

    iput-wide p2, p0, La/tzg;->b:J

    iput-wide p4, p0, La/tzg;->c:J

    iput-boolean p6, p0, La/tzg;->d:Z

    iput p7, p0, La/tzg;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, La/k0w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/tzg;->a:La/uzg;

    .line 7
    .line 8
    iget-object v0, v0, La/uzg;->b:La/vqc;

    .line 9
    .line 10
    new-instance v1, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;

    .line 11
    .line 12
    iget v2, p0, La/tzg;->e:I

    .line 13
    .line 14
    iget-wide v3, p0, La/tzg;->b:J

    .line 15
    .line 16
    iget-wide v5, p0, La/tzg;->c:J

    .line 17
    .line 18
    iget-boolean v7, p0, La/tzg;->d:Z

    .line 19
    .line 20
    invoke-direct/range {v1 .. v7}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$SportGames;-><init>(IJJZ)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$esportsGamesScreen$1;

    .line 24
    .line 25
    invoke-direct {p0, v0, v1}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$esportsGamesScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method
