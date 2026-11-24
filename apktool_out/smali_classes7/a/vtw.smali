.class public final La/vtw;
.super La/wtw;
.source "SourceFile"


# instance fields
.field public final d:La/vo9;


# direct methods
.method public constructor <init>(La/pmf0;Lokhttp3/Call$Factory;La/vke;La/vo9;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, La/wtw;-><init>(La/pmf0;Lokhttp3/Call$Factory;La/vke;)V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, La/vtw;->d:La/vo9;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(La/jf60;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p0, p0, La/vtw;->d:La/vo9;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/vo9;->f(La/jf60;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/to9;

    .line 8
    .line 9
    array-length p1, p2

    .line 10
    const/4 v0, 0x1

    .line 11
    sub-int/2addr p1, v0

    .line 12
    aget-object p1, p2, p1

    .line 13
    .line 14
    check-cast p1, La/yje;

    .line 15
    .line 16
    :try_start_0
    new-instance p2, La/n5a;

    .line 17
    .line 18
    invoke-static {p1}, La/pnx;->b(La/yje;)La/yje;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {p2, v0, v1}, La/n5a;-><init>(ILa/yje;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, La/n5a;->r()V

    .line 26
    .line 27
    .line 28
    new-instance v0, La/iry;

    .line 29
    .line 30
    const/4 v1, 0x2

    .line 31
    invoke-direct {v0, p0, v1}, La/iry;-><init>(La/to9;B)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v0}, La/n5a;->t(Lkotlin/jvm/functions/Function1;)V

    .line 35
    .line 36
    .line 37
    new-instance v0, La/hru;

    .line 38
    .line 39
    invoke-direct {v0, p2}, La/hru;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {p0, v0}, La/to9;->y(La/pp9;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, La/n5a;->p()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    sget-object p1, La/wne;->a:La/wne;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    .line 51
    return-object p0

    .line 52
    :catch_0
    move-exception p0

    .line 53
    invoke-static {p0, p1}, La/k9x;->Q(Ljava/lang/Throwable;La/yje;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, La/wne;->a:La/wne;

    .line 57
    .line 58
    return-object p0
.end method
