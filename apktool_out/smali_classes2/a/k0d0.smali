.class public abstract La/k0d0;
.super La/m0d0;
.source "SourceFile"

# interfaces
.implements La/hiy;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, La/m0d0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final computeReflected()La/qgy;
    .locals 1

    .line 1
    sget-object v0, La/sre0;->a:La/tre0;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, La/tre0;->h(La/k0d0;)La/hiy;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final bridge synthetic d()La/ciy;
    .locals 0

    .line 12
    invoke-virtual {p0}, La/k0d0;->d()La/pdk;

    move-result-object p0

    return-object p0
.end method

.method public final d()La/pdk;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/m0d0;->Q()La/iiy;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/hiy;

    .line 6
    .line 7
    invoke-interface {p0}, La/hiy;->d()La/pdk;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p0, La/l0d0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/k0d0;->d()La/pdk;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
