.class public final La/lge0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/jge0;

.field public final b:La/t33;

.field public final c:La/t33;

.field public final d:La/t33;

.field public final e:F


# direct methods
.method public constructor <init>(La/jge0;La/jge0;FF)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/lge0;->a:La/jge0;

    .line 11
    .line 12
    new-instance p2, La/t33;

    .line 13
    .line 14
    invoke-virtual {p1}, La/jge0;->g()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    new-instance v2, La/ne60;

    .line 19
    .line 20
    invoke-direct {v2, v0, v1}, La/ne60;-><init>(J)V

    .line 21
    .line 22
    .line 23
    sget-object v0, La/hp4;->o:La/lxs0;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    const/16 v3, 0xc

    .line 27
    .line 28
    invoke-direct {p2, v2, v0, v1, v3}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    iput-object p2, p0, La/lge0;->b:La/t33;

    .line 32
    .line 33
    new-instance p2, La/t33;

    .line 34
    .line 35
    invoke-virtual {p1}, La/jge0;->f()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    new-instance p1, La/h7k0;

    .line 40
    .line 41
    invoke-direct {p1, v4, v5}, La/h7k0;-><init>(J)V

    .line 42
    .line 43
    .line 44
    sget-object v0, La/hp4;->n:La/lxs0;

    .line 45
    .line 46
    invoke-direct {p2, p1, v0, v1, v3}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    iput-object p2, p0, La/lge0;->c:La/t33;

    .line 50
    .line 51
    new-instance p1, La/t33;

    .line 52
    .line 53
    new-instance p2, La/ycl;

    .line 54
    .line 55
    invoke-direct {p2, p3}, La/ycl;-><init>(F)V

    .line 56
    .line 57
    .line 58
    sget-object p3, La/hp4;->l:La/lxs0;

    .line 59
    .line 60
    invoke-direct {p1, p2, p3, v1, v3}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, La/lge0;->d:La/t33;

    .line 64
    .line 65
    iput p4, p0, La/lge0;->e:F

    .line 66
    .line 67
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/kge0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/kge0;

    .line 7
    .line 8
    iget v1, v0, La/kge0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/kge0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/kge0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/kge0;-><init>(La/lge0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/kge0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/kge0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, La/s9c0;

    .line 51
    .line 52
    const/16 v2, 0x1a

    .line 53
    .line 54
    invoke-direct {p1, p0, v3, v2}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 55
    .line 56
    .line 57
    iput v4, v0, La/kge0;->k:I

    .line 58
    .line 59
    invoke-static {v0, p1}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    if-ne p0, v1, :cond_3

    .line 64
    .line 65
    return-object v1

    .line 66
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0
.end method
