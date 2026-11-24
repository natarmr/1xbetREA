.class public final La/xdz;
.super Landroidx/compose/foundation/lazy/layout/b;
.source "SourceFile"


# instance fields
.field public final a:La/zz2;

.field public final b:La/yox;


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
    iput-object v0, p0, La/xdz;->a:La/zz2;

    .line 12
    .line 13
    new-instance v1, La/yox;

    .line 14
    .line 15
    invoke-direct {v1, v0}, La/yox;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, La/xdz;->b:La/yox;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static d(La/xdz;La/ugd;)V
    .locals 7

    .line 1
    sget-object v0, La/qek0;->b:La/qek0;

    .line 2
    .line 3
    new-instance v4, La/djx;

    .line 4
    .line 5
    const/16 v1, 0x1c

    .line 6
    .line 7
    invoke-direct {v4, v1}, La/djx;-><init>(B)V

    .line 8
    .line 9
    .line 10
    new-instance v5, La/ebz;

    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    invoke-direct {v5, v0, v1}, La/ebz;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance v0, La/f4b;

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    invoke-direct {v0, p1, v1}, La/f4b;-><init>(La/ugd;B)V

    .line 20
    .line 21
    .line 22
    new-instance v6, La/ugd;

    .line 23
    .line 24
    const p1, 0x3f53b917

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v6, p1, v1, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    const/4 v3, 0x0

    .line 33
    move-object v1, p0

    .line 34
    invoke-virtual/range {v1 .. v6}, La/xdz;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ebz;La/ugd;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public final b()La/zz2;
    .locals 0

    .line 1
    iget-object p0, p0, La/xdz;->a:La/zz2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ebz;La/ugd;)V
    .locals 1

    .line 1
    new-instance v0, La/wdz;

    .line 2
    .line 3
    invoke-direct {v0, p2, p3, p4, p5}, La/wdz;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/xdz;->a:La/zz2;

    .line 7
    .line 8
    invoke-virtual {p0, p1, v0}, La/zz2;->a(ILa/waz;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
