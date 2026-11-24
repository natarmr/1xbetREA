.class public final La/c7q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bch0;


# instance fields
.field public final synthetic a:La/bch0;

.field public final b:La/zbk;

.field public final c:La/zbk;


# direct methods
.method public constructor <init>(La/bch0;La/d7q0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/c7q0;->a:La/bch0;

    .line 5
    .line 6
    new-instance p1, La/b7q0;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, p2, v0}, La/b7q0;-><init>(La/d7q0;B)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, La/c7q0;->b:La/zbk;

    .line 17
    .line 18
    new-instance p1, La/b7q0;

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-direct {p1, p2, v0}, La/b7q0;-><init>(La/d7q0;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/c7q0;->c:La/zbk;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/c7q0;->a:La/bch0;

    .line 2
    .line 3
    invoke-interface {p0}, La/bch0;->a()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/c7q0;->a:La/bch0;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, La/bch0;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/c7q0;->c:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/c7q0;->b:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, La/c7q0;->a:La/bch0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/bch0;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
