.class public final La/i8z;
.super Landroidx/compose/foundation/lazy/layout/b;
.source "SourceFile"


# static fields
.field public static final d:La/hvy;


# instance fields
.field public final a:La/y8z;

.field public final b:La/zz2;

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/hvy;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/hvy;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/i8z;->d:La/hvy;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/y8z;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La/y8z;-><init>(La/i8z;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/i8z;->a:La/y8z;

    .line 10
    .line 11
    new-instance v0, La/zz2;

    .line 12
    .line 13
    const/16 v1, 0xe

    .line 14
    .line 15
    invoke-direct {v0, v1}, La/zz2;-><init>(B)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/i8z;->b:La/zz2;

    .line 19
    .line 20
    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public static d(La/i8z;Lkotlin/jvm/functions/Function1;La/ugd;)V
    .locals 5

    .line 1
    iget-object v0, p0, La/i8z;->b:La/zz2;

    .line 2
    .line 3
    new-instance v1, La/x6s;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    invoke-direct {v1, p1, v2}, La/x6s;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 7
    .line 8
    .line 9
    new-instance p1, La/djx;

    .line 10
    .line 11
    const/16 v2, 0x1c

    .line 12
    .line 13
    invoke-direct {p1, v2}, La/djx;-><init>(B)V

    .line 14
    .line 15
    .line 16
    new-instance v2, La/f4b;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v2, p2, v3}, La/f4b;-><init>(La/ugd;B)V

    .line 20
    .line 21
    .line 22
    new-instance p2, La/ugd;

    .line 23
    .line 24
    const v4, -0x116221cb

    .line 25
    .line 26
    .line 27
    invoke-direct {p2, v4, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    new-instance v2, La/h8z;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct {v2, v4, v1, p1, p2}, La/h8z;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v3, v2}, La/zz2;->a(ILa/waz;)V

    .line 37
    .line 38
    .line 39
    iput-boolean v3, p0, La/i8z;->c:Z

    .line 40
    .line 41
    return-void
.end method

.method public static synthetic f(La/i8z;ILa/oea;La/oea;La/ugd;I)V
    .locals 6

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
    move-object v2, p2

    .line 7
    and-int/lit8 p2, p5, 0x8

    .line 8
    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    sget-object p3, La/j9x;->t:La/j9x;

    .line 12
    .line 13
    :cond_1
    move-object v4, p3

    .line 14
    const/4 v3, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move v1, p1

    .line 17
    move-object v5, p4

    .line 18
    invoke-virtual/range {v0 .. v5}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final b()La/zz2;
    .locals 0

    .line 1
    iget-object p0, p0, La/i8z;->b:La/zz2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V
    .locals 2

    .line 1
    new-instance v0, La/h8z;

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    sget-object v1, La/i8z;->d:La/hvy;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move-object v1, p3

    .line 9
    :goto_0
    invoke-direct {v0, p2, v1, p4, p5}, La/h8z;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, La/i8z;->b:La/zz2;

    .line 13
    .line 14
    invoke-virtual {p2, p1, v0}, La/zz2;->a(ILa/waz;)V

    .line 15
    .line 16
    .line 17
    if-eqz p3, :cond_1

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, La/i8z;->c:Z

    .line 21
    .line 22
    :cond_1
    return-void
.end method
