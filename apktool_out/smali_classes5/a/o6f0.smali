.class public final synthetic La/o6f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/d7f0;

.field public final synthetic c:D


# direct methods
.method public synthetic constructor <init>(ZLa/d7f0;D)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, La/o6f0;->a:Z

    iput-object p2, p0, La/o6f0;->b:La/d7f0;

    iput-wide p3, p0, La/o6f0;->c:D

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, La/k0w0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, La/o6f0;->a:Z

    .line 7
    .line 8
    iget-object v1, p0, La/o6f0;->b:La/d7f0;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, La/k0w0;->f()V

    .line 13
    .line 14
    .line 15
    iget-object p0, v1, La/d7f0;->D:La/drm0;

    .line 16
    .line 17
    invoke-static {p0}, La/drm0;->e(La/drm0;)Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, La/k0w0;->m(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)La/ikt0;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v1}, La/i3t0;->D()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, La/o7f0;

    .line 30
    .line 31
    iget-boolean v0, v0, La/o7f0;->i:Z

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    iget-wide v4, p0, La/o6f0;->c:D

    .line 38
    .line 39
    cmpg-double p0, v4, v2

    .line 40
    .line 41
    if-nez p0, :cond_1

    .line 42
    .line 43
    new-instance p0, La/i7f0;

    .line 44
    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, La/k0w0;->f()V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p1}, La/k0w0;->f()V

    .line 56
    .line 57
    .line 58
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0
.end method
