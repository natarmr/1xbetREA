.class public final La/a6u0;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/b6u0;


# direct methods
.method public synthetic constructor <init>(La/b6u0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/a6u0;->a:B

    iput-object p1, p0, La/a6u0;->b:La/b6u0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/a6u0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/a6u0;->b:La/b6u0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/azn;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    if-eq p1, v0, :cond_1

    .line 18
    .line 19
    const/4 v0, 0x2

    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, La/b6u0;->q:La/alo;

    .line 23
    .line 24
    iget-object p1, p1, La/alo;->a:La/jms0;

    .line 25
    .line 26
    iget-object p0, p0, La/b6u0;->r:La/toj0;

    .line 27
    .line 28
    iget-wide p0, p0, La/toj0;->e:J

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    iget-object p1, p0, La/b6u0;->p:La/pzn;

    .line 37
    .line 38
    iget-object p1, p1, La/pzn;->a:La/jms0;

    .line 39
    .line 40
    iget-object p0, p0, La/b6u0;->q:La/alo;

    .line 41
    .line 42
    iget-object p0, p0, La/alo;->a:La/jms0;

    .line 43
    .line 44
    sget-wide p0, La/y3d;->f:J

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p0, p0, La/b6u0;->p:La/pzn;

    .line 48
    .line 49
    iget-object p0, p0, La/pzn;->a:La/jms0;

    .line 50
    .line 51
    sget-wide p0, La/y3d;->f:J

    .line 52
    .line 53
    :goto_0
    new-instance v0, La/y3d;

    .line 54
    .line 55
    invoke-direct {v0, p0, p1}, La/y3d;-><init>(J)V

    .line 56
    .line 57
    .line 58
    move-object p0, v0

    .line 59
    :goto_1
    return-object p0

    .line 60
    :pswitch_0
    check-cast p1, La/ams0;

    .line 61
    .line 62
    sget-object v0, La/azn;->a:La/azn;

    .line 63
    .line 64
    sget-object v1, La/azn;->b:La/azn;

    .line 65
    .line 66
    invoke-interface {p1, v0, v1}, La/ams0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    iget-object p0, p0, La/b6u0;->p:La/pzn;

    .line 73
    .line 74
    iget-object p0, p0, La/pzn;->a:La/jms0;

    .line 75
    .line 76
    sget-object p0, La/kzn;->c:La/nul0;

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_3
    sget-object v0, La/azn;->c:La/azn;

    .line 80
    .line 81
    invoke-interface {p1, v1, v0}, La/ams0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_4

    .line 86
    .line 87
    iget-object p0, p0, La/b6u0;->q:La/alo;

    .line 88
    .line 89
    iget-object p0, p0, La/alo;->a:La/jms0;

    .line 90
    .line 91
    sget-object p0, La/kzn;->c:La/nul0;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    sget-object p0, La/kzn;->c:La/nul0;

    .line 95
    .line 96
    :goto_2
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
