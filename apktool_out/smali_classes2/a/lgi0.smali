.class public La/lgi0;
.super La/jgi0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static b(Ljava/util/Iterator;)La/v2e;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/sx3;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    invoke-direct {v0, p0, v1}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    new-instance p0, La/v2e;

    .line 11
    .line 12
    invoke-direct {p0, v0}, La/v2e;-><init>(Lkotlin/sequences/Sequence;)V

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public static final c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;
    .locals 3

    .line 1
    instance-of v0, p0, La/qls0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, La/qls0;

    .line 6
    .line 7
    new-instance v0, La/ckq;

    .line 8
    .line 9
    iget-object v1, p0, La/qls0;->a:Lkotlin/sequences/Sequence;

    .line 10
    .line 11
    iget-object p0, p0, La/qls0;->b:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    invoke-direct {v0, v1, p0, p1}, La/ckq;-><init>(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v0, La/ckq;

    .line 18
    .line 19
    new-instance v1, La/eoh0;

    .line 20
    .line 21
    const/16 v2, 0x18

    .line 22
    .line 23
    invoke-direct {v1, v2}, La/eoh0;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0, v1, p1}, La/ckq;-><init>(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public static d(Lkotlin/jvm/functions/Function0;)La/v2e;
    .locals 3

    .line 1
    new-instance v0, La/tjt;

    .line 2
    .line 3
    new-instance v1, La/r3w;

    .line 4
    .line 5
    const/16 v2, 0x19

    .line 6
    .line 7
    invoke-direct {v1, p0, v2}, La/r3w;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0, v1}, La/tjt;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, La/v2e;

    .line 14
    .line 15
    invoke-direct {p0, v0}, La/v2e;-><init>(Lkotlin/sequences/Sequence;)V

    .line 16
    .line 17
    .line 18
    return-object p0
.end method

.method public static e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/sequences/Sequence;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    sget-object p0, La/wun;->a:La/wun;

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_0
    new-instance v0, La/tjt;

    .line 10
    .line 11
    new-instance v1, La/xhd;

    .line 12
    .line 13
    const/4 v2, 0x3

    .line 14
    invoke-direct {v1, p1, v2}, La/xhd;-><init>(Ljava/lang/Object;B)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1, p0}, La/tjt;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
