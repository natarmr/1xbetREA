.class public final synthetic La/vvy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/clp;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/clp;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vvy;->a:B

    iput-object p1, p0, La/vvy;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/vvy;->c:La/clp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/vvy;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/vvy;->c:La/clp;

    .line 4
    .line 5
    iget-object p0, p0, La/vvy;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v2, La/rmp;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-wide v5, v1, La/clp;->b:J

    .line 16
    .line 17
    iget-object v7, v1, La/clp;->e:La/aj00;

    .line 18
    .line 19
    iget-object v8, v1, La/clp;->a:Ljava/lang/String;

    .line 20
    .line 21
    const-wide/16 v3, -0x2

    .line 22
    .line 23
    invoke-direct/range {v2 .. v8}, La/rmp;-><init>(JJLa/aj00;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    new-instance v0, La/rmp;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-wide v3, v1, La/clp;->b:J

    .line 38
    .line 39
    iget-object v5, v1, La/clp;->e:La/aj00;

    .line 40
    .line 41
    iget-object v6, v1, La/clp;->a:Ljava/lang/String;

    .line 42
    .line 43
    const-wide/16 v1, -0x2

    .line 44
    .line 45
    invoke-direct/range {v0 .. v6}, La/rmp;-><init>(JJLa/aj00;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_1
    new-instance v0, La/rmp;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-wide v3, v1, La/clp;->b:J

    .line 60
    .line 61
    iget-object v5, v1, La/clp;->e:La/aj00;

    .line 62
    .line 63
    iget-object v6, v1, La/clp;->a:Ljava/lang/String;

    .line 64
    .line 65
    const-wide/16 v1, -0x2

    .line 66
    .line 67
    invoke-direct/range {v0 .. v6}, La/rmp;-><init>(JJLa/aj00;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    return-object p0

    .line 76
    :pswitch_2
    new-instance v0, La/rmp;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-wide v3, v1, La/clp;->b:J

    .line 82
    .line 83
    iget-object v5, v1, La/clp;->e:La/aj00;

    .line 84
    .line 85
    iget-object v6, v1, La/clp;->a:Ljava/lang/String;

    .line 86
    .line 87
    const-wide/16 v1, -0x2

    .line 88
    .line 89
    invoke-direct/range {v0 .. v6}, La/rmp;-><init>(JJLa/aj00;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_3
    new-instance v0, La/rmp;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-wide v3, v1, La/clp;->b:J

    .line 104
    .line 105
    iget-object v5, v1, La/clp;->e:La/aj00;

    .line 106
    .line 107
    iget-object v6, v1, La/clp;->a:Ljava/lang/String;

    .line 108
    .line 109
    const-wide/16 v1, -0x2

    .line 110
    .line 111
    invoke-direct/range {v0 .. v6}, La/rmp;-><init>(JJLa/aj00;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
