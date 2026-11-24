.class public final La/oco;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p5d0;


# direct methods
.method public constructor <init>(La/p5d0;)V
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
    iput-object p1, p0, La/oco;->a:La/p5d0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(La/qji0;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/oco;->a:La/p5d0;

    .line 2
    .line 3
    invoke-interface {v0}, La/p5d0;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/mos0;

    .line 8
    .line 9
    new-instance v1, La/gwn;

    .line 10
    .line 11
    const-string v2, "json"

    .line 12
    .line 13
    invoke-direct {v1, v2}, La/gwn;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, La/udk;

    .line 17
    .line 18
    const/4 v3, 0x7

    .line 19
    invoke-direct {v2, p0, v3}, La/udk;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    check-cast v0, La/nos0;

    .line 23
    .line 24
    const-string p0, "FIREBASE_APPQUALITY_SESSION"

    .line 25
    .line 26
    invoke-virtual {v0, p0, v1, v2}, La/nos0;->a(Ljava/lang/String;La/gwn;La/ols0;)La/vkr0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    new-instance v0, La/p35;

    .line 31
    .line 32
    sget-object v1, La/mwb0;->a:La/mwb0;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-direct {v0, p1, v1, v2}, La/p35;-><init>(Ljava/lang/Object;La/mwb0;La/t45;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, La/v4i0;

    .line 39
    .line 40
    const/16 v1, 0x15

    .line 41
    .line 42
    invoke-direct {p1, v1}, La/v4i0;-><init>(B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0, p1}, La/vkr0;->z(La/p35;La/fps0;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
