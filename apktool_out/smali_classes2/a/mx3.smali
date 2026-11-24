.class public La/mx3;
.super La/r2e;
.source "SourceFile"


# instance fields
.field public final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, La/r2e;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/mx3;->b:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(La/ym40;)La/wsy;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/mx3;->b:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/wsy;

    .line 11
    .line 12
    invoke-static {p0}, La/ary;->z(La/wsy;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-static {p0}, La/ary;->G(La/wsy;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    sget-object p1, La/i4m0;->W:La/swq;

    .line 25
    .line 26
    iget-object p1, p1, La/swq;->a:La/twq;

    .line 27
    .line 28
    invoke-static {p0, p1}, La/ary;->C(La/wsy;La/twq;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_0

    .line 33
    .line 34
    sget-object p1, La/i4m0;->X:La/swq;

    .line 35
    .line 36
    iget-object p1, p1, La/swq;->a:La/twq;

    .line 37
    .line 38
    invoke-static {p0, p1}, La/ary;->C(La/wsy;La/twq;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_0

    .line 43
    .line 44
    sget-object p1, La/i4m0;->Y:La/swq;

    .line 45
    .line 46
    iget-object p1, p1, La/swq;->a:La/twq;

    .line 47
    .line 48
    invoke-static {p0, p1}, La/ary;->C(La/wsy;La/twq;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_0

    .line 53
    .line 54
    sget-object p1, La/i4m0;->Z:La/swq;

    .line 55
    .line 56
    iget-object p1, p1, La/swq;->a:La/twq;

    .line 57
    .line 58
    invoke-static {p0, p1}, La/ary;->C(La/wsy;La/twq;)Z

    .line 59
    .line 60
    .line 61
    :cond_0
    return-object p0
.end method
