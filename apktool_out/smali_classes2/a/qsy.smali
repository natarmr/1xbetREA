.class public La/qsy;
.super La/osy;
.source "SourceFile"


# instance fields
.field public final m:La/a8z;


# direct methods
.method public constructor <init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/dqy;La/rgy;)V
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
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct/range {p0 .. p5}, La/osy;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/dqy;La/rgy;)V

    .line 14
    .line 15
    .line 16
    sget-object p1, La/wez;->a:La/wez;

    .line 17
    .line 18
    new-instance p2, La/aaw;

    .line 19
    .line 20
    const/16 p3, 0x17

    .line 21
    .line 22
    invoke-direct {p2, p0, p3}, La/aaw;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, La/qsy;->m:La/a8z;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public H(La/ihy;La/rgy;)La/dre0;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/qsy;

    .line 8
    .line 9
    sget-object v3, La/op9;->NO_RECEIVER:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v4, p0, La/osy;->f:La/dqy;

    .line 12
    .line 13
    iget-object v2, p0, La/osy;->d:Ljava/lang/String;

    .line 14
    .line 15
    move-object v1, p1

    .line 16
    move-object v5, p2

    .line 17
    invoke-direct/range {v0 .. v5}, La/qsy;-><init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/dqy;La/rgy;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final d()La/ciy;
    .locals 0

    .line 1
    iget-object p0, p0, La/qsy;->m:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/psy;

    .line 8
    .line 9
    return-object p0
.end method

.method public final u()La/fsy;
    .locals 0

    .line 1
    iget-object p0, p0, La/qsy;->m:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/psy;

    .line 8
    .line 9
    return-object p0
.end method
