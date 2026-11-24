.class public final synthetic La/ozg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:J

.field public final synthetic c:B


# direct methods
.method public synthetic constructor <init>(La/uzg;JJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, La/ozg;->a:J

    iput-wide p4, p0, La/ozg;->b:J

    iput-byte p6, p0, La/ozg;->c:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, La/k0w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, La/ozg;->a:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1;

    .line 20
    .line 21
    iget-byte v2, p0, La/ozg;->c:B

    .line 22
    .line 23
    iget-wide v3, p0, La/ozg;->b:J

    .line 24
    .line 25
    invoke-direct {v1, v2, v3, v4, v0}, Lorg/xplatform/results/impl/di/navigation/ResultsScreenFactoryImpl$getChampsCyberScreen$1;-><init>(IJLjava/util/List;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0
.end method
