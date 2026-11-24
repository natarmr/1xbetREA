.class public La/qdk;
.super La/rdk;
.source "SourceFile"

# interfaces
.implements La/hiy;


# instance fields
.field public final q:La/a8z;


# direct methods
.method public constructor <init>(La/ihy;La/d0d0;La/rgy;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1, p2, p3}, La/rdk;-><init>(La/ihy;La/d0d0;La/rgy;)V

    .line 11
    .line 12
    .line 13
    sget-object p1, La/wez;->a:La/wez;

    .line 14
    .line 15
    new-instance p2, La/odk;

    .line 16
    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-direct {p2, p0, p3}, La/odk;-><init>(La/qdk;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iput-object p2, p0, La/qdk;->q:La/a8z;

    .line 26
    .line 27
    new-instance p2, La/odk;

    .line 28
    .line 29
    const/4 p3, 0x1

    .line 30
    invoke-direct {p2, p0, p3}, La/odk;-><init>(La/qdk;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public constructor <init>(La/ihy;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    sget-object v0, La/op9;->NO_RECEIVER:Ljava/lang/Object;

    .line 38
    invoke-direct {p0, p1, p2, p3, v0}, La/rdk;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    sget-object p1, La/wez;->a:La/wez;

    new-instance p2, La/odk;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, La/odk;-><init>(La/qdk;B)V

    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    move-result-object p2

    iput-object p2, p0, La/qdk;->q:La/a8z;

    .line 40
    new-instance p2, La/odk;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, La/odk;-><init>(La/qdk;B)V

    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    return-void
.end method


# virtual methods
.method public final C()La/fdk;
    .locals 0

    .line 1
    iget-object p0, p0, La/qdk;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pdk;

    .line 8
    .line 9
    return-object p0
.end method

.method public D(La/ihy;La/rgy;)La/qdk;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/qdk;

    .line 8
    .line 9
    invoke-virtual {p0}, La/rdk;->B()La/d0d0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-direct {v0, p1, p0, p2}, La/qdk;-><init>(La/ihy;La/d0d0;La/rgy;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public bridge synthetic H(La/ihy;La/rgy;)La/dre0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/qdk;->D(La/ihy;La/rgy;)La/qdk;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final d()La/ciy;
    .locals 0

    .line 10
    iget-object p0, p0, La/qdk;->q:La/a8z;

    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/pdk;

    return-object p0
.end method

.method public final d()La/pdk;
    .locals 0

    .line 1
    iget-object p0, p0, La/qdk;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pdk;

    .line 8
    .line 9
    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/qdk;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/pdk;

    .line 8
    .line 9
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
