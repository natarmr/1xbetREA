.class public final La/k9y;
.super La/t9y;
.source "SourceFile"

# interfaces
.implements La/rhy;


# instance fields
.field public final j:La/a8z;


# direct methods
.method public constructor <init>(La/ihy;Ljava/lang/reflect/Field;Ljava/lang/Object;La/rgy;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2, p3, p4}, La/t9y;-><init>(La/ihy;Ljava/lang/reflect/Field;Ljava/lang/Object;La/rgy;)V

    .line 8
    .line 9
    .line 10
    sget-object p1, La/wez;->a:La/wez;

    .line 11
    .line 12
    new-instance p2, La/aaw;

    .line 13
    .line 14
    const/16 p3, 0xa

    .line 15
    .line 16
    invoke-direct {p2, p0, p3}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, La/k9y;->j:La/a8z;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final H(La/ihy;La/rgy;)La/dre0;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/k9y;

    .line 8
    .line 9
    invoke-virtual {p0}, La/t9y;->u()Ljava/lang/reflect/Field;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object p0, p0, La/e9y;->e:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0, p1, v1, p0, p2}, La/k9y;-><init>(La/ihy;Ljava/lang/reflect/Field;Ljava/lang/Object;La/rgy;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final e()La/phy;
    .locals 0

    .line 1
    iget-object p0, p0, La/k9y;->j:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j9y;

    .line 8
    .line 9
    return-object p0
.end method

.method public final e()La/qhy;
    .locals 0

    .line 10
    iget-object p0, p0, La/k9y;->j:La/a8z;

    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La/j9y;

    return-object p0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/k9y;->j:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j9y;

    .line 8
    .line 9
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method
