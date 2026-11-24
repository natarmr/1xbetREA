.class public final La/rah0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bch0;


# static fields
.field public static final k:La/v0h0;


# instance fields
.field public final a:La/cgk0;

.field public final b:La/cgk0;

.field public final c:La/cgk0;

.field public final d:La/pz40;

.field public final e:La/gy40;

.field public final f:La/cgk0;

.field public g:F

.field public final h:La/ywj;

.field public final i:La/zbk;

.field public final j:La/zbk;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/x0h0;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/x0h0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/w0h0;

    .line 9
    .line 10
    const/16 v2, 0x13

    .line 11
    .line 12
    invoke-direct {v1, v2}, La/w0h0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v2, La/v0h0;

    .line 16
    .line 17
    invoke-direct {v2, v1, v0}, La/v0h0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 18
    .line 19
    .line 20
    sput-object v2, La/rah0;->k:La/v0h0;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, La/rah0;->a:La/cgk0;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, La/rah0;->b:La/cgk0;

    .line 16
    .line 17
    invoke-static {p1}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/rah0;->c:La/cgk0;

    .line 22
    .line 23
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, La/rah0;->d:La/pz40;

    .line 30
    .line 31
    new-instance p1, La/gy40;

    .line 32
    .line 33
    invoke-direct {p1}, La/gy40;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, La/rah0;->e:La/gy40;

    .line 37
    .line 38
    const p1, 0x7fffffff

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Landroidx/compose/runtime/e;->b(I)La/cgk0;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iput-object p1, p0, La/rah0;->f:La/cgk0;

    .line 46
    .line 47
    new-instance p1, La/gwg0;

    .line 48
    .line 49
    const/4 v0, 0x6

    .line 50
    invoke-direct {p1, p0, v0}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    new-instance v0, La/ywj;

    .line 54
    .line 55
    invoke-direct {v0, p1}, La/ywj;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, La/rah0;->h:La/ywj;

    .line 59
    .line 60
    new-instance p1, La/pdb;

    .line 61
    .line 62
    const/4 v0, 0x3

    .line 63
    invoke-direct {p1, p0, v0}, La/pdb;-><init>(La/rah0;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    iput-object p1, p0, La/rah0;->i:La/zbk;

    .line 71
    .line 72
    new-instance p1, La/pdb;

    .line 73
    .line 74
    const/4 v0, 0x4

    .line 75
    invoke-direct {p1, p0, v0}, La/pdb;-><init>(La/rah0;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    iput-object p1, p0, La/rah0;->j:La/zbk;

    .line 83
    .line 84
    return-void
.end method

.method public static synthetic g(La/rah0;ILa/bnn0;)Ljava/lang/Object;
    .locals 3

    .line 1
    new-instance v0, La/nul0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x7

    .line 5
    invoke-direct {v0, v1, v2}, La/nul0;-><init>(Ljava/lang/Object;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1, v0, p2}, La/rah0;->f(ILa/cfq;La/bnn0;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/rah0;->h:La/ywj;

    .line 2
    .line 3
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/rah0;->h:La/ywj;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, La/ywj;->b(La/c050;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, La/wne;->a:La/wne;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 13
    .line 14
    return-object p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/rah0;->j:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/rah0;->i:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, La/rah0;->h:La/ywj;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/ywj;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(ILa/cfq;La/bnn0;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/rah0;->a:La/cgk0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/cgk0;->l()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int/2addr p1, v0

    .line 8
    int-to-float p1, p1

    .line 9
    invoke-static {p0, p1, p2, p3}, La/bww;->x(La/bch0;FLa/j73;La/yje;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object p1, La/wne;->a:La/wne;

    .line 14
    .line 15
    if-ne p0, p1, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0
.end method
