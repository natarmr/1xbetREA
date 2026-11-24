.class public final La/dvq0;
.super La/htc;
.source "SourceFile"


# instance fields
.field public n1:Z

.field public o1:Lkotlin/jvm/functions/Function1;

.field public final p1:La/h3q0;


# direct methods
.method public constructor <init>(ZLa/gy40;ZLa/ucg0;Lkotlin/jvm/functions/Function1;)V
    .locals 8

    .line 1
    new-instance v7, La/fya;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-direct {v7, p5, p1, v0}, La/fya;-><init>(Lkotlin/jvm/functions/Function1;ZB)V

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p2

    .line 12
    move v4, p3

    .line 13
    move-object v6, p4

    .line 14
    invoke-direct/range {v0 .. v7}, La/s1;-><init>(La/gy40;La/d6x;ZZLjava/lang/String;La/ucg0;Lkotlin/jvm/functions/Function0;)V

    .line 15
    .line 16
    .line 17
    iput-boolean p1, v0, La/dvq0;->n1:Z

    .line 18
    .line 19
    iput-object p5, v0, La/dvq0;->o1:Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    new-instance p0, La/h3q0;

    .line 22
    .line 23
    const/16 p1, 0x15

    .line 24
    .line 25
    invoke-direct {p0, v0, p1}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    iput-object p0, v0, La/dvq0;->p1:La/h3q0;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final c1(La/abi0;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/dvq0;->n1:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, La/evq0;->a:La/evq0;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, La/evq0;->b:La/evq0;

    .line 9
    .line 10
    :goto_0
    invoke-static {p1, v0}, La/yai0;->i(La/abi0;La/evq0;)V

    .line 11
    .line 12
    .line 13
    sget-object v0, La/rv00;->j:La/jy2;

    .line 14
    .line 15
    sget-object v1, La/xai0;->s:La/zai0;

    .line 16
    .line 17
    sget-object v2, La/yai0;->a:[La/iiy;

    .line 18
    .line 19
    const/16 v3, 0x9

    .line 20
    .line 21
    aget-object v3, v2, v3

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, v1, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-boolean p0, p0, La/dvq0;->n1:Z

    .line 30
    .line 31
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 32
    .line 33
    const/16 v1, 0x1a

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    if-lt v0, v1, :cond_1

    .line 37
    .line 38
    new-instance v0, La/ez2;

    .line 39
    .line 40
    invoke-static {p0}, La/y24;->e(Z)Landroid/view/autofill/AutofillValue;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-direct {v0, p0}, La/ez2;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move-object v0, v3

    .line 49
    :goto_1
    if-eqz v0, :cond_2

    .line 50
    .line 51
    sget-object p0, La/xai0;->t:La/zai0;

    .line 52
    .line 53
    const/16 v1, 0xa

    .line 54
    .line 55
    aget-object v1, v2, v1

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p1, p0, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    new-instance p0, La/kac;

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    invoke-direct {p0, p1, v0}, La/kac;-><init>(La/abi0;B)V

    .line 67
    .line 68
    .line 69
    sget-object v0, La/mai0;->h:La/zai0;

    .line 70
    .line 71
    new-instance v1, La/m6;

    .line 72
    .line 73
    invoke-direct {v1, v3, p0}, La/m6;-><init>(Ljava/lang/String;La/wdr;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {p1, v0, v1}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
