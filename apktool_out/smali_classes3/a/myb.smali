.class public final La/myb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ts4;


# direct methods
.method public synthetic constructor <init>(La/ts4;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/myb;->a:La/ts4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/xwd;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, La/myb;->a:La/ts4;

    .line 8
    .line 9
    iget-object v0, p0, La/ts4;->k:La/do20;

    .line 10
    .line 11
    invoke-virtual {v0, p1, p3}, La/do20;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object p3, p0, La/ts4;->m:La/zo4;

    .line 16
    .line 17
    invoke-virtual {p3}, La/zo4;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    move-object v0, p3

    .line 22
    check-cast v0, La/ws4;

    .line 23
    .line 24
    iget-object p0, p0, La/ts4;->h:La/btt0;

    .line 25
    .line 26
    invoke-virtual {p0}, La/btt0;->a()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    new-instance v3, La/wwd;

    .line 31
    .line 32
    invoke-direct {v3, p1}, La/wwd;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-string v4, "application/vnd.xenvelop+json"

    .line 36
    .line 37
    move-object v2, p2

    .line 38
    move-object v5, p4

    .line 39
    invoke-interface/range {v0 .. v5}, La/ws4;->f(Ljava/lang/String;Ljava/lang/String;La/wwd;Ljava/lang/String;La/yje;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    sget-object p1, La/wne;->a:La/wne;

    .line 44
    .line 45
    if-ne p0, p1, :cond_0

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    :goto_0
    if-ne p0, p1, :cond_1

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/myb;->a:La/ts4;

    .line 2
    .line 3
    iget-object p0, p0, La/ts4;->i:La/knf0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/knf0;->e()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const-string p0, "ru"

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "en"

    .line 15
    .line 16
    return-object p0
.end method
