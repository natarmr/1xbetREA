.class public abstract La/dv2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/xd2;

.field public static final b:La/sjj;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/xd2;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/xd2;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/dv2;->a:La/xd2;

    .line 9
    .line 10
    new-instance v0, La/qek0;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v1, La/sjj;

    .line 16
    .line 17
    invoke-direct {v1, v0}, La/sjj;-><init>(La/glq;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, La/dv2;->b:La/sjj;

    .line 21
    .line 22
    return-void
.end method

.method public static a(La/mm40;La/rv2;ZLa/gy40;La/qkq;I)La/mm40;
    .locals 6

    .line 1
    sget-object v0, La/ma80;->a:La/ma80;

    .line 2
    .line 3
    and-int/lit8 p5, p5, 0x8

    .line 4
    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    :cond_0
    move-object v4, p3

    .line 9
    new-instance v0, La/ou2;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    move-object v1, p1

    .line 13
    move v2, p2

    .line 14
    move-object v5, p4

    .line 15
    invoke-direct/range {v0 .. v5}, La/ou2;-><init>(La/rv2;ZLjava/lang/Boolean;La/gy40;La/qkq;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p0, v0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static b(La/mm40;La/rv2;ZLa/afk0;I)La/mm40;
    .locals 6

    .line 1
    sget-object v0, La/ma80;->a:La/ma80;

    .line 2
    .line 3
    and-int/lit8 p4, p4, 0x8

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x1

    .line 8
    :cond_0
    move v2, p2

    .line 9
    new-instance v0, La/ou2;

    .line 10
    .line 11
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v1, p1

    .line 15
    move-object v5, p3

    .line 16
    invoke-direct/range {v0 .. v5}, La/ou2;-><init>(La/rv2;ZLjava/lang/Boolean;La/gy40;La/qkq;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {p0, v0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final c(La/rv2;Ljava/lang/Object;La/uts0;La/yje;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, La/uu2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p2, v1}, La/uu2;-><init>(La/rv2;La/j73;La/yje;)V

    .line 5
    .line 6
    .line 7
    sget-object p2, La/c050;->a:La/c050;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, v0, p3}, La/rv2;->a(Ljava/lang/Object;La/c050;La/ydr;La/yje;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, La/wne;->a:La/wne;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method

.method public static d(La/rv2;Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/nu2;->a:La/uts0;

    .line 5
    .line 6
    invoke-static {p0, p1, v0, p2}, La/dv2;->c(La/rv2;Ljava/lang/Object;La/uts0;La/yje;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, La/wu2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/wu2;

    .line 7
    .line 8
    iget v1, v0, La/wu2;->j:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/wu2;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/wu2;

    .line 21
    .line 22
    invoke-direct {v0, p2}, La/zje;-><init>(La/yje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/wu2;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/wu2;->j:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch La/mu2; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    new-instance p2, La/bv2;

    .line 51
    .line 52
    invoke-direct {p2, p0, p1, v3, v4}, La/bv2;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;La/yje;B)V

    .line 53
    .line 54
    .line 55
    iput v4, v0, La/wu2;->j:I

    .line 56
    .line 57
    invoke-static {v0, p2}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0
    :try_end_1
    .catch La/mu2; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    if-ne p0, v1, :cond_3

    .line 62
    .line 63
    return-object v1

    .line 64
    :catch_0
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0
.end method

.method public static final f(La/rv2;Ljava/lang/Object;La/bnn0;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, La/cv2;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v1, v3, v2}, La/cv2;-><init>(ILa/yje;B)V

    .line 7
    .line 8
    .line 9
    sget-object v1, La/c050;->a:La/c050;

    .line 10
    .line 11
    invoke-virtual {p0, p1, v1, v0, p2}, La/rv2;->a(Ljava/lang/Object;La/c050;La/ydr;La/yje;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object p1, La/wne;->a:La/wne;

    .line 16
    .line 17
    if-ne p0, p1, :cond_0

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0
.end method
