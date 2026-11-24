.class public final synthetic La/i940;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m940;

.field public final synthetic c:La/o440;


# direct methods
.method public synthetic constructor <init>(La/m940;La/o440;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i940;->a:B

    iput-object p1, p0, La/i940;->b:La/m940;

    iput-object p2, p0, La/i940;->c:La/o440;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/i940;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/i940;->c:La/o440;

    .line 4
    .line 5
    iget-object p0, p0, La/i940;->b:La/m940;

    .line 6
    .line 7
    check-cast p1, La/k0w0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v2, p0, La/m940;->y:La/vjp;

    .line 16
    .line 17
    iget-boolean p0, v1, La/o440;->d:Z

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    sget-object p0, La/j700;->b:La/j700;

    .line 22
    .line 23
    :goto_0
    move-object v3, p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    sget-object p0, La/j700;->a:La/j700;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :goto_1
    new-instance v4, La/m8h0;

    .line 29
    .line 30
    sget-object p0, La/xun;->a:La/xun;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    const-string v5, ""

    .line 34
    .line 35
    invoke-direct {v4, v5, p0, v0}, La/m8h0;-><init>(Ljava/lang/String;Ljava/util/Set;Z)V

    .line 36
    .line 37
    .line 38
    iget-wide v5, v1, La/o440;->c:J

    .line 39
    .line 40
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    iget-wide v6, v1, La/o440;->b:J

    .line 49
    .line 50
    const-string v8, ""

    .line 51
    .line 52
    invoke-virtual/range {v2 .. v8}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, La/m940;->y:La/vjp;

    .line 66
    .line 67
    iget-boolean p0, v1, La/o440;->d:Z

    .line 68
    .line 69
    if-eqz p0, :cond_1

    .line 70
    .line 71
    sget-object p0, La/j700;->b:La/j700;

    .line 72
    .line 73
    :goto_2
    move-object v3, p0

    .line 74
    goto :goto_3

    .line 75
    :cond_1
    sget-object p0, La/j700;->a:La/j700;

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :goto_3
    new-instance v4, La/d8h0;

    .line 79
    .line 80
    const/4 p0, 0x3

    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-direct {v4, p0, v0}, La/d8h0;-><init>(ILjava/util/Set;)V

    .line 83
    .line 84
    .line 85
    iget-wide v0, v1, La/o440;->b:J

    .line 86
    .line 87
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const-string v8, ""

    .line 96
    .line 97
    const-wide/16 v6, -0x1

    .line 98
    .line 99
    invoke-virtual/range {v2 .. v8}, La/vjp;->b(La/j700;La/f9h0;Ljava/util/Set;JLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 104
    .line 105
    .line 106
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object p0

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
