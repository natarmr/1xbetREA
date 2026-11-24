.class public final La/e2d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/oyq0;

.field public final b:La/sjj;

.field public final c:La/nul0;

.field public final d:La/pz40;

.field public final e:La/pz40;

.field public final f:La/a8z;

.field public final g:La/a8z;

.field public final h:La/zbk;


# direct methods
.method public constructor <init>(La/oyq0;La/sjj;La/nul0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/e2d;->a:La/oyq0;

    .line 8
    .line 9
    iput-object p2, p0, La/e2d;->b:La/sjj;

    .line 10
    .line 11
    iput-object p3, p0, La/e2d;->c:La/nul0;

    .line 12
    .line 13
    new-instance p1, La/j6g0;

    .line 14
    .line 15
    const/16 p2, 0x11

    .line 16
    .line 17
    invoke-direct {p1, p2}, La/j6g0;-><init>(B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/e2d;->d:La/pz40;

    .line 25
    .line 26
    new-instance p1, La/d2d;

    .line 27
    .line 28
    const-string p2, ""

    .line 29
    .line 30
    const/4 p3, 0x0

    .line 31
    invoke-direct {p1, p2, p3}, La/d2d;-><init>(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iput-object p1, p0, La/e2d;->e:La/pz40;

    .line 39
    .line 40
    new-instance p1, La/c2d;

    .line 41
    .line 42
    invoke-direct {p1, p0, p3}, La/c2d;-><init>(La/e2d;B)V

    .line 43
    .line 44
    .line 45
    sget-object p2, La/wez;->b:La/wez;

    .line 46
    .line 47
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, p0, La/e2d;->f:La/a8z;

    .line 52
    .line 53
    new-instance p1, La/c2d;

    .line 54
    .line 55
    const/4 p3, 0x1

    .line 56
    invoke-direct {p1, p0, p3}, La/c2d;-><init>(La/e2d;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p2, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, La/e2d;->g:La/a8z;

    .line 64
    .line 65
    new-instance p1, La/c2d;

    .line 66
    .line 67
    const/4 p2, 0x2

    .line 68
    invoke-direct {p1, p0, p2}, La/c2d;-><init>(La/e2d;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    iput-object p1, p0, La/e2d;->h:La/zbk;

    .line 76
    .line 77
    return-void
.end method

.method public static b(La/e2d;Lkotlin/jvm/functions/Function0;)La/azl;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/d2d;

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v1, v2}, La/d2d;-><init>(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, La/e2d;->a(La/d2d;Lkotlin/jvm/functions/Function0;)La/azl;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method


# virtual methods
.method public final a(La/d2d;Lkotlin/jvm/functions/Function0;)La/azl;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, La/azl;

    .line 8
    .line 9
    iget-object v1, p0, La/e2d;->b:La/sjj;

    .line 10
    .line 11
    iget-object v2, p0, La/e2d;->c:La/nul0;

    .line 12
    .line 13
    iget-object v3, p0, La/e2d;->a:La/oyq0;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3, p2}, La/azl;-><init>(La/sjj;La/nul0;La/oyq0;Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/e2d;->d:La/pz40;

    .line 19
    .line 20
    check-cast v1, La/hgk0;

    .line 21
    .line 22
    invoke-virtual {v1, p2}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, La/e2d;->e:La/pz40;

    .line 26
    .line 27
    check-cast p0, La/hgk0;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method
