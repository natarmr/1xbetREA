.class public final La/j4i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:La/d6x;

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:La/ucg0;

.field public final synthetic e:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(La/d6x;ZZLa/ucg0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/j4i0;->a:La/d6x;

    .line 5
    .line 6
    iput-boolean p2, p0, La/j4i0;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, La/j4i0;->c:Z

    .line 9
    .line 10
    iput-object p4, p0, La/j4i0;->d:La/ucg0;

    .line 11
    .line 12
    iput-object p5, p0, La/j4i0;->e:Lkotlin/jvm/functions/Function0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, La/mm40;

    .line 2
    .line 3
    check-cast p2, La/fet;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    const p1, -0x5af0b3b9

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2, p1}, La/fet;->e0(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, La/fet;->P()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p3, La/ukd;->a:La/cl5;

    .line 21
    .line 22
    if-ne p1, p3, :cond_0

    .line 23
    .line 24
    invoke-static {p2}, La/dw9;->j(La/fet;)La/gy40;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_0
    move-object v2, p1

    .line 29
    check-cast v2, La/gy40;

    .line 30
    .line 31
    sget-object p1, La/jm40;->b:La/jm40;

    .line 32
    .line 33
    iget-object p3, p0, La/j4i0;->a:La/d6x;

    .line 34
    .line 35
    invoke-static {p1, v2, p3}, La/a6x;->a(La/mm40;La/gy40;La/d6x;)La/mm40;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance v0, La/i4i0;

    .line 40
    .line 41
    iget-object v5, p0, La/j4i0;->d:La/ucg0;

    .line 42
    .line 43
    iget-object v6, p0, La/j4i0;->e:Lkotlin/jvm/functions/Function0;

    .line 44
    .line 45
    iget-boolean v1, p0, La/j4i0;->b:Z

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    iget-boolean v4, p0, La/j4i0;->c:Z

    .line 49
    .line 50
    invoke-direct/range {v0 .. v6}, La/i4i0;-><init>(ZLa/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const/4 p1, 0x0

    .line 58
    invoke-virtual {p2, p1}, La/fet;->r(Z)V

    .line 59
    .line 60
    .line 61
    return-object p0
.end method
