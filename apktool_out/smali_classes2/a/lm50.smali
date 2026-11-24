.class public final La/lm50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/km50;


# instance fields
.field public final c:La/bty;

.field public final d:La/sf80;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, La/bty;->g:La/bty;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, La/lm50;->c:La/bty;

    .line 7
    .line 8
    new-instance v0, La/sf80;

    .line 9
    .line 10
    sget-object v1, La/sf80;->d:La/fl70;

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/sf80;-><init>(La/xsy;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/lm50;->d:La/sf80;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(La/wsy;La/wsy;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x6

    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object p0, p0, La/lm50;->c:La/bty;

    .line 11
    .line 12
    invoke-static {v2, v0, p0, v1}, La/jcb;->Y(ZLa/gqw0;La/bty;I)La/gys0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p1}, La/wsy;->j0()La/tft0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p2}, La/wsy;->j0()La/tft0;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p0, p1, p2}, La/m2a;->l(La/gys0;La/aty;La/aty;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0
.end method

.method public final b(La/wsy;La/wsy;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    const/4 v1, 0x1

    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object p0, p0, La/lm50;->c:La/bty;

    .line 11
    .line 12
    invoke-static {v1, v2, p0, v0}, La/jcb;->Y(ZLa/gqw0;La/bty;I)La/gys0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    iget-object v0, p0, La/gys0;->c:La/yzs0;

    .line 17
    .line 18
    invoke-virtual {p1}, La/wsy;->j0()La/tft0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2}, La/wsy;->j0()La/tft0;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    return v1

    .line 29
    :cond_0
    invoke-interface {v0}, La/yzs0;->i0()Lkotlin/jvm/functions/Function2;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-interface {v1, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    move-object v2, v1

    .line 40
    check-cast v2, Ljava/lang/Boolean;

    .line 41
    .line 42
    :cond_1
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    :cond_2
    sget-object v1, La/m2a;->b:La/m2a;

    .line 50
    .line 51
    invoke-virtual {v1, p0, v0, p1, p2}, La/m2a;->j(La/gys0;La/yzs0;La/aty;La/aty;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    return p0
.end method
