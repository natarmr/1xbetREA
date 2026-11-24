.class public final La/t52;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/w52;->a:La/w52;

    .line 5
    .line 6
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/t52;->a:La/p7m0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    .line 1
    iget-object p0, p0, La/t52;->a:La/p7m0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/y52;

    .line 8
    .line 9
    sget-object v0, La/w52;->a:La/w52;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object p0, La/iun;->a:La/iun;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_0
    instance-of v0, p0, La/v52;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object p0, La/iun;->a:La/iun;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    instance-of v0, p0, La/x52;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    check-cast p0, La/x52;

    .line 32
    .line 33
    iget-object p0, p0, La/x52;->a:Ljava/util/List;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method
