.class public final La/lgx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/ugd;

.field public final synthetic b:La/zgx;

.field public final synthetic c:I

.field public final synthetic d:La/g9z;


# direct methods
.method public constructor <init>(La/ugd;La/zgx;ILa/g9z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/lgx;->a:La/ugd;

    .line 5
    .line 6
    iput-object p2, p0, La/lgx;->b:La/zgx;

    .line 7
    .line 8
    iput p3, p0, La/lgx;->c:I

    .line 9
    .line 10
    iput-object p4, p0, La/lgx;->d:La/g9z;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Number;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    and-int/lit8 p2, p1, 0x3

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eq p2, v0, :cond_0

    .line 16
    .line 17
    move p2, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, v1

    .line 20
    :goto_0
    and-int/2addr p1, v2

    .line 21
    invoke-virtual {v4, p1, p2}, La/fet;->U(IZ)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    iget-object p1, p0, La/lgx;->b:La/zgx;

    .line 28
    .line 29
    iget-object p1, p1, La/zgx;->a:La/ygx;

    .line 30
    .line 31
    iget p2, p0, La/lgx;->c:I

    .line 32
    .line 33
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 p2, 0x0

    .line 38
    const/4 v0, 0x7

    .line 39
    iget-object v3, p0, La/lgx;->d:La/g9z;

    .line 40
    .line 41
    sget-object v5, La/jm40;->b:La/jm40;

    .line 42
    .line 43
    invoke-static {v3, v5, p2, v0}, La/g9z;->b(La/g9z;La/mm40;La/nul0;I)La/mm40;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    iget-object v0, p0, La/lgx;->a:La/ugd;

    .line 52
    .line 53
    move-object v1, p1

    .line 54
    invoke-virtual/range {v0 .. v5}, La/ugd;->O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v4}, La/fet;->X()V

    .line 59
    .line 60
    .line 61
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0
.end method
