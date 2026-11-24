.class public final La/bp;
.super La/ahe0;
.source "SourceFile"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function0;

.field public final b:Lkotlin/jvm/functions/Function2;

.field public final c:Lkotlin/jvm/functions/Function2;

.field public final d:Lkotlin/jvm/functions/Function2;

.field public final e:La/xdr;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;La/p0z;I)V
    .locals 4

    .line 1
    new-instance v0, La/q8;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/q8;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/hhd;

    .line 9
    .line 10
    const/16 v2, 0x19

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/hhd;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/hhd;

    .line 16
    .line 17
    const/16 v3, 0x1a

    .line 18
    .line 19
    invoke-direct {v2, v3}, La/hhd;-><init>(B)V

    .line 20
    .line 21
    .line 22
    and-int/lit8 p3, p3, 0x10

    .line 23
    .line 24
    if-eqz p3, :cond_0

    .line 25
    .line 26
    new-instance p2, La/ahd;

    .line 27
    .line 28
    const/16 p3, 0x12

    .line 29
    .line 30
    invoke-direct {p2, p3}, La/ahd;-><init>(B)V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, La/bp;->a:Lkotlin/jvm/functions/Function0;

    .line 37
    .line 38
    iput-object v1, p0, La/bp;->b:Lkotlin/jvm/functions/Function2;

    .line 39
    .line 40
    iput-object p1, p0, La/bp;->c:Lkotlin/jvm/functions/Function2;

    .line 41
    .line 42
    iput-object v2, p0, La/bp;->d:Lkotlin/jvm/functions/Function2;

    .line 43
    .line 44
    iput-object p2, p0, La/bp;->e:La/xdr;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, La/bp;->a:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(II)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object p0, p0, La/bp;->b:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final d(II)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object p0, p0, La/bp;->c:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final e(II)V
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object p0, p0, La/bp;->e:La/xdr;

    .line 15
    .line 16
    invoke-interface {p0, p1, p2, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final f(II)V
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    iget-object p0, p0, La/bp;->d:Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    invoke-interface {p0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method
