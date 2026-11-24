.class public final La/ezn;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pzn;

.field public final synthetic c:La/alo;


# direct methods
.method public synthetic constructor <init>(La/pzn;La/alo;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ezn;->a:B

    iput-object p1, p0, La/ezn;->b:La/pzn;

    iput-object p2, p0, La/ezn;->c:La/alo;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/ezn;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/ezn;->c:La/alo;

    .line 4
    .line 5
    iget-object p0, p0, La/ezn;->b:La/pzn;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/ams0;

    .line 11
    .line 12
    sget-object v0, La/azn;->a:La/azn;

    .line 13
    .line 14
    sget-object v2, La/azn;->b:La/azn;

    .line 15
    .line 16
    invoke-interface {p1, v0, v2}, La/ams0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, La/pzn;->a:La/jms0;

    .line 23
    .line 24
    iget-object p0, p0, La/jms0;->d:La/k1h0;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    iget-object p0, p0, La/k1h0;->c:La/cfq;

    .line 29
    .line 30
    if-nez p0, :cond_4

    .line 31
    .line 32
    :cond_0
    sget-object p0, La/kzn;->b:La/nul0;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    sget-object p0, La/azn;->c:La/azn;

    .line 36
    .line 37
    invoke-interface {p1, v2, p0}, La/ams0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_3

    .line 42
    .line 43
    iget-object p0, v1, La/alo;->a:La/jms0;

    .line 44
    .line 45
    iget-object p0, p0, La/jms0;->d:La/k1h0;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    iget-object p0, p0, La/k1h0;->c:La/cfq;

    .line 50
    .line 51
    if-nez p0, :cond_4

    .line 52
    .line 53
    :cond_2
    sget-object p0, La/kzn;->b:La/nul0;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    sget-object p0, La/kzn;->b:La/nul0;

    .line 57
    .line 58
    :cond_4
    :goto_0
    return-object p0

    .line 59
    :pswitch_0
    check-cast p1, La/ams0;

    .line 60
    .line 61
    sget-object v0, La/azn;->a:La/azn;

    .line 62
    .line 63
    sget-object v2, La/azn;->b:La/azn;

    .line 64
    .line 65
    invoke-interface {p1, v0, v2}, La/ams0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    iget-object p0, p0, La/pzn;->a:La/jms0;

    .line 72
    .line 73
    iget-object p0, p0, La/jms0;->a:La/fwo;

    .line 74
    .line 75
    if-eqz p0, :cond_5

    .line 76
    .line 77
    iget-object p0, p0, La/fwo;->b:La/cfq;

    .line 78
    .line 79
    if-nez p0, :cond_9

    .line 80
    .line 81
    :cond_5
    sget-object p0, La/kzn;->b:La/nul0;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_6
    sget-object p0, La/azn;->c:La/azn;

    .line 85
    .line 86
    invoke-interface {p1, v2, p0}, La/ams0;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_8

    .line 91
    .line 92
    iget-object p0, v1, La/alo;->a:La/jms0;

    .line 93
    .line 94
    iget-object p0, p0, La/jms0;->a:La/fwo;

    .line 95
    .line 96
    if-eqz p0, :cond_7

    .line 97
    .line 98
    iget-object p0, p0, La/fwo;->b:La/cfq;

    .line 99
    .line 100
    if-nez p0, :cond_9

    .line 101
    .line 102
    :cond_7
    sget-object p0, La/kzn;->b:La/nul0;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_8
    sget-object p0, La/kzn;->b:La/nul0;

    .line 106
    .line 107
    :cond_9
    :goto_1
    return-object p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
