.class public final La/z3d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:La/t33;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public constructor <init>(La/t33;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z3d;->a:La/t33;

    .line 5
    .line 6
    iput-wide p2, p0, La/z3d;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, La/z3d;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/lang/Float;

    .line 2
    .line 3
    iget-wide v0, p0, La/z3d;->c:J

    .line 4
    .line 5
    iget-wide v2, p0, La/z3d;->b:J

    .line 6
    .line 7
    iget-object p0, p0, La/z3d;->a:La/t33;

    .line 8
    .line 9
    if-nez p1, :cond_3

    .line 10
    .line 11
    invoke-virtual {p0}, La/t33;->d()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, La/y3d;

    .line 16
    .line 17
    iget-wide v4, p1, La/y3d;->a:J

    .line 18
    .line 19
    invoke-static {v4, v5, v2, v3}, La/sac;->N(JJ)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {v4, v5, v0, v1}, La/sac;->N(JJ)F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    cmpg-float p1, p1, v4

    .line 28
    .line 29
    if-gez p1, :cond_0

    .line 30
    .line 31
    move-wide v0, v2

    .line 32
    :cond_0
    iget-object p1, p0, La/t33;->e:La/pz40;

    .line 33
    .line 34
    check-cast p1, La/hgk0;

    .line 35
    .line 36
    invoke-virtual {p1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, La/y3d;

    .line 41
    .line 42
    iget-wide v2, p1, La/y3d;->a:J

    .line 43
    .line 44
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    new-instance p1, La/y3d;

    .line 51
    .line 52
    invoke-direct {p1, v0, v1}, La/y3d;-><init>(J)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p2, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object p1, La/wne;->a:La/wne;

    .line 60
    .line 61
    if-ne p0, p1, :cond_1

    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {p1, v2, v3, v0, v1}, La/fbc;->P(FJJ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    new-instance p1, La/y3d;

    .line 79
    .line 80
    invoke-direct {p1, v0, v1}, La/y3d;-><init>(J)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p2, p1}, La/t33;->f(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    sget-object p1, La/wne;->a:La/wne;

    .line 88
    .line 89
    if-ne p0, p1, :cond_4

    .line 90
    .line 91
    return-object p0

    .line 92
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0
.end method
