.class public final La/oi9;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/fe60;
.implements La/y99;
.implements La/ehl;


# instance fields
.field public final o:La/pi9;

.field public p:Z

.field public q:La/b3h0;

.field public r:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(La/pi9;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/oi9;->o:La/pi9;

    .line 5
    .line 6
    iput-object p2, p0, La/oi9;->r:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput-object p0, p1, La/pi9;->a:La/y99;

    .line 9
    .line 10
    new-instance p2, La/vb8;

    .line 11
    .line 12
    const/16 v0, 0x17

    .line 13
    .line 14
    invoke-direct {p2, p0, v0}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p1, La/pi9;->d:La/vb8;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final H()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/oi9;->Z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final R()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/oi9;->Z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final S0()V
    .locals 0

    .line 1
    iget-object p0, p0, La/oi9;->q:La/b3h0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/b3h0;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final T0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/oi9;->Z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Z0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/oi9;->q:La/b3h0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/b3h0;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, La/oi9;->p:Z

    .line 10
    .line 11
    iget-object v0, p0, La/oi9;->o:La/pi9;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, v0, La/pi9;->b:La/psc;

    .line 15
    .line 16
    invoke-static {p0}, La/vfc;->J(La/ehl;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final b()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/oi9;->Z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d()J
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p0, v0}, La/vcc;->X(La/yzj;I)La/s460;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-wide v0, p0, La/pu90;->c:J

    .line 7
    .line 8
    invoke-static {v0, v1}, La/n2x;->Q(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final getDensity()La/w6k;
    .locals 0

    .line 1
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/e7z;->z:La/w6k;

    .line 6
    .line 7
    return-object p0
.end method

.method public final getLayoutDirection()La/k6z;
    .locals 0

    .line 1
    invoke-static {p0}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/e7z;->A:La/k6z;

    .line 6
    .line 7
    return-object p0
.end method

.method public final p0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, La/oi9;->Z0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final u0(La/g7z;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, La/oi9;->p:Z

    .line 2
    .line 3
    iget-object v1, p0, La/oi9;->o:La/pi9;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, v1, La/pi9;->b:La/psc;

    .line 9
    .line 10
    iput-object p1, v1, La/pi9;->c:La/g7z;

    .line 11
    .line 12
    new-instance v0, La/gj4;

    .line 13
    .line 14
    const/16 v2, 0x1b

    .line 15
    .line 16
    invoke-direct {v0, p0, v1, v2}, La/gj4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0}, La/c9x;->B(La/lm40;Lkotlin/jvm/functions/Function0;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v1, La/pi9;->b:La/psc;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iput-boolean v0, p0, La/oi9;->p:Z

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string p0, "DrawResult not defined, did you forget to call onDraw?"

    .line 31
    .line 32
    invoke-static {p0}, La/cs0;->g(Ljava/lang/String;)La/rsy;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    throw p0

    .line 37
    :cond_1
    :goto_0
    iget-object p0, v1, La/pi9;->b:La/psc;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/psc;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void
.end method
