.class public final La/qjq;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:S

.field public final synthetic j:La/vjq;

.field public final synthetic k:La/viq;


# direct methods
.method public constructor <init>(JLa/vjq;La/viq;La/yje;)V
    .locals 0

    .line 1
    long-to-int p1, p1

    .line 2
    iput-short p1, p0, La/qjq;->i:S

    .line 3
    .line 4
    iput-object p3, p0, La/qjq;->j:La/vjq;

    .line 5
    .line 6
    iput-object p4, p0, La/qjq;->k:La/viq;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/qjq;

    .line 2
    .line 3
    iget-short p1, p0, La/qjq;->i:S

    .line 4
    .line 5
    int-to-long v1, p1

    .line 6
    iget-object v3, p0, La/qjq;->j:La/vjq;

    .line 7
    .line 8
    iget-object v4, p0, La/qjq;->k:La/viq;

    .line 9
    .line 10
    move-object v5, p2

    .line 11
    invoke-direct/range {v0 .. v5}, La/qjq;-><init>(JLa/vjq;La/viq;La/yje;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/qjq;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qjq;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/qjq;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-short p1, p0, La/qjq;->i:S

    .line 11
    .line 12
    int-to-long v2, p1

    .line 13
    add-long/2addr v0, v2

    .line 14
    iget-object p1, p0, La/qjq;->j:La/vjq;

    .line 15
    .line 16
    iget-object p1, p1, La/vjq;->h:La/kzw;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p0, p0, La/qjq;->k:La/viq;

    .line 21
    .line 22
    invoke-interface {p1, v0, v1, p0}, La/kzw;->a(JLa/lzw;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const-string p0, "CXCP"

    .line 26
    .line 27
    invoke-static {p0}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    new-instance p1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    const-string v2, "applyScreenFlash: ScreenFlash.apply() invoked, expirationTimeMillis = "

    .line 36
    .line 37
    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0
.end method
