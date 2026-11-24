.class public final La/pi9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/w6k;


# instance fields
.field public a:La/y99;

.field public b:La/psc;

.field public c:La/g7z;

.field public d:La/vb8;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/wtn;->a:La/wtn;

    .line 5
    .line 6
    iput-object v0, p0, La/pi9;->a:La/y99;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/jvm/functions/Function1;)La/psc;
    .locals 2

    .line 1
    new-instance v0, La/xz8;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, La/xz8;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final b(Lkotlin/jvm/functions/Function1;)La/psc;
    .locals 2

    .line 1
    new-instance v0, La/psc;

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/psc;-><init>(B)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, La/psc;->b:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, La/pi9;->b:La/psc;

    .line 11
    .line 12
    return-object v0
.end method

.method public final getDensity()F
    .locals 0

    .line 1
    iget-object p0, p0, La/pi9;->a:La/y99;

    .line 2
    .line 3
    invoke-interface {p0}, La/y99;->getDensity()La/w6k;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, La/w6k;->getDensity()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final v0()F
    .locals 0

    .line 1
    iget-object p0, p0, La/pi9;->a:La/y99;

    .line 2
    .line 3
    invoke-interface {p0}, La/y99;->getDensity()La/w6k;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, La/w6k;->v0()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
