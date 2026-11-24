.class public final La/fwt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/aja;


# direct methods
.method public constructor <init>(La/aja;)V
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
    iput-object p1, p0, La/fwt;->a:La/aja;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(La/aja;La/wsz;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, La/fwt;->a:La/aja;

    return-void
.end method


# virtual methods
.method public a()La/ewt;
    .locals 3

    .line 1
    iget-object v0, p0, La/fwt;->a:La/aja;

    .line 2
    .line 3
    iget-object v0, v0, La/aja;->a:La/rfs;

    .line 4
    .line 5
    iget-object v0, v0, La/rfs;->a:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/i89;

    .line 8
    .line 9
    const/16 v2, 0x16

    .line 10
    .line 11
    invoke-direct {v1, v0, v2}, La/i89;-><init>(La/gmq;B)V

    .line 12
    .line 13
    .line 14
    new-instance v0, La/ewt;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v0, v1, p0, v2}, La/ewt;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public b(La/k3z;)Lkotlin/Unit;
    .locals 3

    .line 1
    iget-object p0, p0, La/fwt;->a:La/aja;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/aja;->a:La/rfs;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/rfs;->a:La/p7m0;

    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    check-cast v1, La/egs;

    .line 19
    .line 20
    instance-of v2, v1, La/bgs;

    .line 21
    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    new-instance v1, La/cgs;

    .line 25
    .line 26
    invoke-direct {v1, p1}, La/cgs;-><init>(La/k3z;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0
.end method
