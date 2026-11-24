.class public final La/hcz;
.super Landroidx/compose/foundation/lazy/layout/b;
.source "SourceFile"


# instance fields
.field public final a:La/zz2;

.field public b:Landroidx/collection/MutableIntList;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/zz2;

    .line 5
    .line 6
    const/16 v1, 0xe

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/zz2;-><init>(B)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/hcz;->a:La/zz2;

    .line 12
    .line 13
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static synthetic e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V
    .locals 2

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p1, v1

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p2, v1

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, La/hcz;->d(Ljava/lang/Object;Ljava/lang/Object;La/xdr;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static synthetic g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V
    .locals 1

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 7
    .line 8
    if-eqz p5, :cond_1

    .line 9
    .line 10
    sget-object p3, La/j9x;->A:La/j9x;

    .line 11
    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static h(La/hcz;La/ugd;I)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    and-int/2addr p2, v0

    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p2, "TABLE_STICKY_HEADER_KEY"

    .line 9
    .line 10
    :goto_0
    iget-object v2, p0, La/hcz;->a:La/zz2;

    .line 11
    .line 12
    iget-object v3, p0, La/hcz;->b:Landroidx/collection/MutableIntList;

    .line 13
    .line 14
    if-nez v3, :cond_1

    .line 15
    .line 16
    new-instance v3, Landroidx/collection/MutableIntList;

    .line 17
    .line 18
    invoke-direct {v3}, Landroidx/collection/MutableIntList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v3, p0, La/hcz;->b:Landroidx/collection/MutableIntList;

    .line 22
    .line 23
    :cond_1
    iget v4, v2, La/zz2;->a:I

    .line 24
    .line 25
    invoke-virtual {v3, v4}, Landroidx/collection/MutableIntList;->a(I)V

    .line 26
    .line 27
    .line 28
    iget v2, v2, La/zz2;->a:I

    .line 29
    .line 30
    new-instance v3, La/z30;

    .line 31
    .line 32
    const/4 v4, 0x4

    .line 33
    invoke-direct {v3, p1, v2, v4}, La/z30;-><init>(Ljava/lang/Object;IB)V

    .line 34
    .line 35
    .line 36
    new-instance p1, La/ugd;

    .line 37
    .line 38
    const v2, -0x5eb1942e

    .line 39
    .line 40
    .line 41
    invoke-direct {p1, v2, v0, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p2, v1, p1}, La/hcz;->d(Ljava/lang/Object;Ljava/lang/Object;La/xdr;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final b()La/zz2;
    .locals 0

    .line 1
    iget-object p0, p0, La/hcz;->a:La/zz2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Ljava/lang/Object;Ljava/lang/Object;La/xdr;)V
    .locals 4

    .line 1
    new-instance v0, La/gcz;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    new-instance v2, La/ebz;

    .line 7
    .line 8
    invoke-direct {v2, p1, v1}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v2, 0x0

    .line 13
    :goto_0
    new-instance p1, La/ebz;

    .line 14
    .line 15
    invoke-direct {p1, p2, v1}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance p2, La/csw;

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    invoke-direct {p2, p3, v3}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    new-instance p3, La/ugd;

    .line 25
    .line 26
    const v3, -0x331bf287

    .line 27
    .line 28
    .line 29
    invoke-direct {p3, v3, v1, p2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v2, p1, p3}, La/gcz;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, La/hcz;->a:La/zz2;

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0}, La/zz2;->a(ILa/waz;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V
    .locals 1

    .line 1
    new-instance v0, La/gcz;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3, p4}, La/gcz;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/hcz;->a:La/zz2;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, La/zz2;->a(ILa/waz;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
