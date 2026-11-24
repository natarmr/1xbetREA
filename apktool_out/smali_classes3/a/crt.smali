.class public final La/crt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kki;


# direct methods
.method public synthetic constructor <init>(La/kki;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/crt;->a:La/kki;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/i89;
    .locals 2

    .line 1
    iget-object p0, p0, La/crt;->a:La/kki;

    .line 2
    .line 3
    iget-object p0, p0, La/kki;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/o0j;

    .line 6
    .line 7
    iget-object p0, p0, La/o0j;->c:La/p7m0;

    .line 8
    .line 9
    new-instance v0, La/i89;

    .line 10
    .line 11
    const/16 v1, 0x16

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, La/i89;-><init>(La/gmq;B)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public b(IJ)V
    .locals 2

    .line 1
    iget-object p0, p0, La/crt;->a:La/kki;

    .line 2
    .line 3
    iget-object p0, p0, La/kki;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/o0j;

    .line 6
    .line 7
    iget-object p0, p0, La/o0j;->b:La/p7m0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sget-object v1, La/tmt0;->a:La/tmt0;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    new-instance v0, La/umt0;

    .line 22
    .line 23
    invoke-direct {v0, p2, p3, p1}, La/umt0;-><init>(JI)V

    .line 24
    .line 25
    .line 26
    const/4 p1, 0x0

    .line 27
    invoke-virtual {p0, p1, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method
