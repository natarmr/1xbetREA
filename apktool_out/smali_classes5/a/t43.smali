.class public final La/t43;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t43;->a:B

    iput-object p1, p0, La/t43;->b:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/t43;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/t43;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, La/dpa0;

    .line 11
    .line 12
    check-cast p2, La/ne60;

    .line 13
    .line 14
    iget-wide v0, p2, La/ne60;->a:J

    .line 15
    .line 16
    invoke-virtual {p1}, La/dpa0;->a()V

    .line 17
    .line 18
    .line 19
    check-cast p0, La/lie0;

    .line 20
    .line 21
    iput-wide v0, p0, La/lie0;->a:J

    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/k810;

    .line 27
    .line 28
    check-cast p2, La/v9d;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p0, La/s9d;

    .line 37
    .line 38
    iget-object v0, p0, La/s9d;->e:La/v9d;

    .line 39
    .line 40
    iget-object p0, p0, La/s9d;->i:Ljava/util/List;

    .line 41
    .line 42
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_1

    .line 51
    .line 52
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, La/jr20;

    .line 57
    .line 58
    invoke-interface {v3, p2, p1}, La/jr20;->b(La/v9d;La/k810;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_2

    .line 63
    .line 64
    instance-of v3, v3, La/h98;

    .line 65
    .line 66
    if-eqz v3, :cond_0

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    move v1, v2

    .line 73
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    return-object p0

    .line 78
    :pswitch_1
    check-cast p1, La/azn;

    .line 79
    .line 80
    check-cast p2, La/azn;

    .line 81
    .line 82
    sget-object v0, La/azn;->c:La/azn;

    .line 83
    .line 84
    if-ne p1, v0, :cond_3

    .line 85
    .line 86
    if-ne p2, v0, :cond_3

    .line 87
    .line 88
    check-cast p0, La/alo;

    .line 89
    .line 90
    iget-object p0, p0, La/alo;->a:La/jms0;

    .line 91
    .line 92
    iget-boolean p0, p0, La/jms0;->e:Z

    .line 93
    .line 94
    if-nez p0, :cond_3

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    move v1, v2

    .line 98
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
