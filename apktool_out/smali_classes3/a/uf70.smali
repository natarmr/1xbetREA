.class public abstract La/uf70;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:La/xcc;

.field public final c:La/p7m0;


# direct methods
.method public constructor <init>(La/qa60;La/xcc;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, La/w46;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/uf70;->b:La/xcc;

    .line 11
    .line 12
    new-instance p2, La/tf70;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    const v1, 0x7f13022b

    .line 16
    .line 17
    .line 18
    invoke-direct {p2, v0, v1}, La/tf70;-><init>(ZI)V

    .line 19
    .line 20
    .line 21
    invoke-static {p2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iput-object p2, p0, La/uf70;->c:La/p7m0;

    .line 26
    .line 27
    invoke-virtual {p1}, La/qa60;->a()La/vae0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, La/vf20;

    .line 32
    .line 33
    const/4 v6, 0x4

    .line 34
    const/16 v7, 0x19

    .line 35
    .line 36
    const/4 v1, 0x2

    .line 37
    const-class v3, La/uf70;

    .line 38
    .line 39
    const-string v4, "observeCommand"

    .line 40
    .line 41
    const-string v5, "observeCommand(Lorg/xplatform/core/domain/GameCommand;)V"

    .line 42
    .line 43
    move-object v2, p0

    .line 44
    invoke-direct/range {v0 .. v7}, La/vf20;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 45
    .line 46
    .line 47
    new-instance p0, La/fnq;

    .line 48
    .line 49
    const/4 p2, 0x4

    .line 50
    invoke-direct {p0, p1, v0, p2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 51
    .line 52
    .line 53
    new-instance p1, La/ib60;

    .line 54
    .line 55
    const/4 p2, 0x0

    .line 56
    const/4 v0, 0x1

    .line 57
    invoke-direct {p1, v2, p2, v0}, La/ib60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 58
    .line 59
    .line 60
    new-instance p2, La/dnq;

    .line 61
    .line 62
    invoke-direct {p2, p0, p1, v0}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p2, p0}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 70
    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public w(La/zy5;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/hy5;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    iget-object v2, p0, La/uf70;->c:La/p7m0;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/tf70;

    .line 16
    .line 17
    check-cast p1, La/hy5;

    .line 18
    .line 19
    iget-boolean p1, p1, La/hy5;->a:Z

    .line 20
    .line 21
    invoke-static {v0, p1, v1}, La/tf70;->a(La/tf70;ZI)La/tf70;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, La/uf70;->y(La/tf70;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    instance-of v0, p1, La/zle;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    instance-of v0, p1, La/yle;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    instance-of v0, p1, La/tle;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    instance-of v0, p1, La/xle;

    .line 45
    .line 46
    if-eqz v0, :cond_4

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    instance-of p1, p1, La/ry5;

    .line 50
    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    :goto_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, La/tf70;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-static {p1, v0, v1}, La/tf70;->a(La/tf70;ZI)La/tf70;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0, p1}, La/uf70;->y(La/tf70;)V

    .line 65
    .line 66
    .line 67
    :cond_5
    return-void
.end method

.method public abstract x()V
.end method

.method public final y(La/tf70;)V
    .locals 4

    .line 1
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/ku60;

    .line 6
    .line 7
    const/16 v2, 0xe

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, p0, p1, v3, v2}, La/ku60;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 15
    .line 16
    .line 17
    return-void
.end method
